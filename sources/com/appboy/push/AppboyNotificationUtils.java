package com.appboy.push;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import com.appboy.Appboy;
import com.appboy.AppboyAdmReceiver;
import com.appboy.AppboyInternal;
import com.appboy.BrazePushReceiver;
import com.appboy.Constants;
import com.appboy.IAppboyNotificationFactory;
import com.appboy.enums.Channel;
import com.appboy.models.push.BrazeNotificationPayload;
import com.appboy.p044ui.AppboyNavigator;
import com.appboy.p044ui.actions.ActionFactory;
import com.appboy.p044ui.support.UriUtils;
import com.appboy.push.support.HtmlUtils;
import com.appboy.support.AppboyLogger;
import com.appboy.support.IntentUtils;
import com.appboy.support.JsonUtils;
import com.appboy.support.PermissionUtils;
import com.appboy.support.StringUtils;
import com.braze.Braze;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.BrazeViewBounds;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import p067e1.C4522y;

public class AppboyNotificationUtils {
    private static final String TAG = AppboyLogger.getBrazeLogTag(AppboyNotificationUtils.class);

    public static void cancelNotification(Context context, int i) {
        try {
            String str = TAG;
            AppboyLogger.m5448d(str, "Cancelling notification action with id: " + i);
            Intent intent = new Intent(Constants.APPBOY_CANCEL_NOTIFICATION_ACTION).setClass(context, getNotificationReceiverClass());
            intent.putExtra(Constants.APPBOY_PUSH_NOTIFICATION_ID, i);
            IntentUtils.addComponentAndSendBroadcast(context, intent);
        } catch (Exception e) {
            AppboyLogger.m5452e(TAG, "Exception occurred attempting to cancel notification.", e);
        }
    }

    public static IAppboyNotificationFactory getActiveNotificationFactory() {
        IAppboyNotificationFactory customAppboyNotificationFactory = Appboy.getCustomAppboyNotificationFactory();
        if (customAppboyNotificationFactory == null) {
            return AppboyNotificationFactory.getInstance();
        }
        return customAppboyNotificationFactory;
    }

    @TargetApi(26)
    private static int getNotificationChannelImportance(NotificationChannel notificationChannel) {
        return notificationChannel.getImportance();
    }

    public static int getNotificationId(BrazeNotificationPayload brazeNotificationPayload) {
        if (brazeNotificationPayload == null) {
            AppboyLogger.m5448d(TAG, "Message without extras bundle received. Using default notification id");
            return -1;
        } else if (brazeNotificationPayload.getCustomNotificationId() != null) {
            int intValue = brazeNotificationPayload.getCustomNotificationId().intValue();
            String str = TAG;
            AppboyLogger.m5448d(str, "Using notification id provided in the message's extras bundle: " + intValue);
            return intValue;
        } else {
            String str2 = "";
            if (brazeNotificationPayload.getTitleText() != null) {
                StringBuilder k = C13555b.m33972k(str2);
                k.append(brazeNotificationPayload.getTitleText());
                str2 = k.toString();
            }
            if (brazeNotificationPayload.getContentText() != null) {
                StringBuilder k2 = C13555b.m33972k(str2);
                k2.append(brazeNotificationPayload.getContentText());
                str2 = k2.toString();
            }
            int hashCode = str2.hashCode();
            String str3 = TAG;
            AppboyLogger.m5448d(str3, "Message without notification id provided in the extras bundle received. Using a hash of the message: " + hashCode);
            return hashCode;
        }
    }

    public static int getNotificationPriority(Bundle bundle) {
        if (bundle == null || !bundle.containsKey(Constants.APPBOY_PUSH_PRIORITY_KEY)) {
            return 0;
        }
        try {
            int parseInt = Integer.parseInt(bundle.getString(Constants.APPBOY_PUSH_PRIORITY_KEY));
            if (parseInt >= -2 && parseInt <= 2) {
                return parseInt;
            }
            String str = TAG;
            AppboyLogger.m5459w(str, "Received invalid notification priority " + parseInt);
            return 0;
        } catch (NumberFormatException e) {
            AppboyLogger.m5452e(TAG, "Unable to parse custom priority. Returning default priority of 0", e);
            return 0;
        }
    }

    public static Class<?> getNotificationReceiverClass() {
        if (Constants.IS_AMAZON.booleanValue()) {
            return AppboyAdmReceiver.class;
        }
        return BrazePushReceiver.class;
    }

    public static String getOrCreateNotificationChannelId(BrazeNotificationPayload brazeNotificationPayload) {
        String notificationChannelId = brazeNotificationPayload.getNotificationChannelId();
        if (Build.VERSION.SDK_INT < 26) {
            return notificationChannelId != null ? notificationChannelId : Constants.APPBOY_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID;
        }
        Context context = brazeNotificationPayload.getContext();
        if (context == null) {
            AppboyLogger.m5448d(TAG, "BrazeNotificationPayload is missing a context");
            return null;
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationChannelId != null) {
            if (notificationManager.getNotificationChannel(notificationChannelId) != null) {
                String str = TAG;
                AppboyLogger.m5448d(str, "Found notification channel in extras with id: " + notificationChannelId);
                return notificationChannelId;
            }
            String str2 = TAG;
            AppboyLogger.m5448d(str2, "Notification channel from extras is invalid. No channel found with id: " + notificationChannelId);
        }
        BrazeConfigurationProvider configurationProvider = brazeNotificationPayload.getConfigurationProvider();
        if (notificationManager.getNotificationChannel(Constants.APPBOY_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID) == null) {
            AppboyLogger.m5448d(TAG, "Appboy default notification channel does not exist on device; creating");
            NotificationChannel notificationChannel = new NotificationChannel(Constants.APPBOY_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID, configurationProvider.getDefaultNotificationChannelName(), 3);
            notificationChannel.setDescription(configurationProvider.getDefaultNotificationChannelDescription());
            notificationManager.createNotificationChannel(notificationChannel);
        }
        return Constants.APPBOY_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID;
    }

    private static PendingIntent getPushActionPendingIntent(Context context, String str, Bundle bundle) {
        Intent intent = new Intent(str).setClass(context, NotificationTrampolineActivity.class);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        return PendingIntent.getActivity(context, IntentUtils.getRequestCode(), intent, 1073741824 | IntentUtils.getDefaultPendingIntentFlags());
    }

    @TargetApi(26)
    public static NotificationChannel getValidNotificationChannel(NotificationManager notificationManager, Bundle bundle) {
        if (bundle == null) {
            AppboyLogger.m5448d(TAG, "Notification extras bundle was null. Could not find a valid notification channel");
            return null;
        }
        String string = bundle.getString(Constants.APPBOY_PUSH_NOTIFICATION_CHANNEL_ID_KEY, (String) null);
        if (!StringUtils.isNullOrBlank(string)) {
            NotificationChannel c = notificationManager.getNotificationChannel(string);
            if (c != null) {
                String str = TAG;
                AppboyLogger.m5448d(str, "Found notification channel in extras with id: " + string);
                return c;
            }
            String str2 = TAG;
            AppboyLogger.m5448d(str2, "Notification channel from extras is invalid, no channel found with id: " + string);
        }
        NotificationChannel b = notificationManager.getNotificationChannel(Constants.APPBOY_PUSH_DEFAULT_NOTIFICATION_CHANNEL_ID);
        if (b != null) {
            return b;
        }
        AppboyLogger.m5448d(TAG, "Appboy default notification channel does not exist on device.");
        return null;
    }

    public static void handleCancelNotificationAction(Context context, Intent intent) {
        try {
            if (intent.hasExtra(Constants.APPBOY_PUSH_NOTIFICATION_ID)) {
                int intExtra = intent.getIntExtra(Constants.APPBOY_PUSH_NOTIFICATION_ID, -1);
                String str = TAG;
                AppboyLogger.m5448d(str, "Cancelling notification action with id: " + intExtra);
                ((NotificationManager) context.getSystemService("notification")).cancel(Constants.APPBOY_PUSH_NOTIFICATION_TAG, intExtra);
            }
        } catch (Exception e) {
            AppboyLogger.m5452e(TAG, "Exception occurred handling cancel notification intent.", e);
        }
    }

    public static void handleContentCardsSerializedCardIfPresent(BrazeNotificationPayload brazeNotificationPayload) {
        String contentCardSyncData = brazeNotificationPayload.getContentCardSyncData();
        String contentCardSyncUserId = brazeNotificationPayload.getContentCardSyncUserId();
        if (contentCardSyncData != null && brazeNotificationPayload.getContext() != null) {
            String str = TAG;
            AppboyLogger.m5448d(str, "Push contains associated Content Cards card. User id: " + contentCardSyncUserId + " Card data: " + contentCardSyncData);
            AppboyInternal.addSerializedContentCardToStorage(brazeNotificationPayload.getContext(), contentCardSyncData, contentCardSyncUserId);
        }
    }

    public static void handleNotificationDeleted(Context context, Intent intent) {
        try {
            AppboyLogger.m5448d(TAG, "Sending notification deleted broadcast");
            sendPushActionIntent(context, ".intent.APPBOY_PUSH_DELETED", intent.getExtras());
        } catch (Exception e) {
            AppboyLogger.m5452e(TAG, "Exception occurred attempting to handle notification delete intent.", e);
        }
    }

    public static void handleNotificationOpened(Context context, Intent intent) {
        try {
            Braze.getInstance(context).logPushNotificationOpened(intent);
            sendNotificationOpenedBroadcast(context, intent);
            if (new BrazeConfigurationProvider(context).getHandlePushDeepLinksAutomatically()) {
                routeUserWithNotificationOpenedIntent(context, intent);
            }
        } catch (Exception e) {
            AppboyLogger.m5452e(TAG, "Exception occurred attempting to handle notification opened intent.", e);
        }
    }

    public static void handlePushStoryPageClicked(Context context, Intent intent) {
        try {
            Braze.getInstance(context).logPushStoryPageClicked(intent.getStringExtra(Constants.APPBOY_CAMPAIGN_ID), intent.getStringExtra(Constants.APPBOY_STORY_PAGE_ID));
            if (!StringUtils.isNullOrBlank(intent.getStringExtra(Constants.APPBOY_ACTION_URI_KEY))) {
                intent.putExtra("uri", intent.getStringExtra(Constants.APPBOY_ACTION_URI_KEY));
                String stringExtra = intent.getStringExtra(Constants.APPBOY_ACTION_USE_WEBVIEW_KEY);
                if (!StringUtils.isNullOrBlank(stringExtra)) {
                    intent.putExtra(Constants.APPBOY_PUSH_OPEN_URI_IN_WEBVIEW_KEY, stringExtra);
                }
            } else {
                intent.removeExtra("uri");
            }
            sendNotificationOpenedBroadcast(context, intent);
            if (new BrazeConfigurationProvider(context).getHandlePushDeepLinksAutomatically()) {
                routeUserWithNotificationOpenedIntent(context, intent);
            }
        } catch (Exception e) {
            AppboyLogger.m5452e(TAG, "Caught exception while handling story click.", e);
        }
    }

    public static boolean isAppboyPushMessage(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null || !InneractiveMediationDefs.SHOW_HOUSE_AD_YES.equals(extras.getString(Constants.APPBOY_PUSH_APPBOY_KEY))) {
            return false;
        }
        return true;
    }

    public static boolean isInAppMessageTestPush(Intent intent) {
        return intent.hasExtra(Constants.APPBOY_PUSH_FETCH_TEST_TRIGGERS_KEY) && intent.getStringExtra(Constants.APPBOY_PUSH_FETCH_TEST_TRIGGERS_KEY).equals(InneractiveMediationDefs.SHOW_HOUSE_AD_YES);
    }

    public static boolean isNotificationMessage(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey(Constants.APPBOY_PUSH_TITLE_KEY) || !extras.containsKey(Constants.APPBOY_PUSH_CONTENT_KEY)) {
            return false;
        }
        return true;
    }

    public static boolean isUninstallTrackingPush(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        try {
            if (bundle.containsKey(Constants.APPBOY_PUSH_UNINSTALL_TRACKING_KEY)) {
                return true;
            }
            Bundle bundle2 = bundle.getBundle(Constants.APPBOY_PUSH_EXTRAS_KEY);
            if (bundle2 != null) {
                return bundle2.containsKey(Constants.APPBOY_PUSH_UNINSTALL_TRACKING_KEY);
            }
            return false;
        } catch (Exception e) {
            AppboyLogger.m5452e(TAG, "Failed to determine if push is uninstall tracking. Returning false.", e);
            return false;
        }
    }

    @TargetApi(21)
    public static boolean isValidNotificationVisibility(int i) {
        return i == -1 || i == 0 || i == 1;
    }

    public static void prefetchBitmapsIfNewlyReceivedStoryPush(Context context, Bundle bundle, Bundle bundle2) {
        if (bundle.containsKey(Constants.APPBOY_PUSH_STORY_KEY) && bundle.getBoolean(Constants.APPBOY_PUSH_STORY_IS_NEWLY_RECEIVED, false)) {
            String actionFieldAtIndex = BrazeNotificationPayload.getActionFieldAtIndex(0, bundle, Constants.APPBOY_PUSH_STORY_IMAGE_KEY_TEMPLATE);
            int i = 0;
            while (!StringUtils.isNullOrBlank(actionFieldAtIndex)) {
                String str = TAG;
                AppboyLogger.m5457v(str, "Pre-fetching bitmap at URL: " + actionFieldAtIndex);
                Braze.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, bundle2, actionFieldAtIndex, BrazeViewBounds.NOTIFICATION_ONE_IMAGE_STORY);
                i++;
                actionFieldAtIndex = BrazeNotificationPayload.getActionFieldAtIndex(i, bundle, Constants.APPBOY_PUSH_STORY_IMAGE_KEY_TEMPLATE);
            }
            bundle.putBoolean(Constants.APPBOY_PUSH_STORY_IS_NEWLY_RECEIVED, false);
        }
    }

    public static boolean requestGeofenceRefreshIfAppropriate(Context context, Bundle bundle) {
        if (!bundle.containsKey(Constants.APPBOY_PUSH_SYNC_GEOFENCES_KEY)) {
            AppboyLogger.m5448d(TAG, "Geofence sync key not included in push payload. Not syncing geofences.");
            return false;
        } else if (Boolean.parseBoolean(bundle.getString(Constants.APPBOY_PUSH_SYNC_GEOFENCES_KEY))) {
            AppboyInternal.requestGeofenceRefresh(context, true);
            return true;
        } else {
            AppboyLogger.m5448d(TAG, "Geofence sync key was false. Not syncing geofences.");
            return false;
        }
    }

    public static void routeUserWithNotificationOpenedIntent(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra(Constants.APPBOY_PUSH_EXTRAS_KEY);
        if (bundleExtra == null) {
            bundleExtra = new Bundle();
        }
        bundleExtra.putString(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY, intent.getStringExtra(Constants.APPBOY_PUSH_CAMPAIGN_ID_KEY));
        bundleExtra.putString("source", Constants.APPBOY);
        String stringExtra = intent.getStringExtra("uri");
        if (!StringUtils.isNullOrBlank(stringExtra)) {
            String str = TAG;
            AppboyLogger.m5448d(str, "Found a deep link " + stringExtra);
            boolean equalsIgnoreCase = InneractiveMediationDefs.SHOW_HOUSE_AD_YES.equalsIgnoreCase(intent.getStringExtra(Constants.APPBOY_PUSH_OPEN_URI_IN_WEBVIEW_KEY));
            AppboyLogger.m5448d(str, "Use webview set to: " + equalsIgnoreCase);
            bundleExtra.putString("uri", stringExtra);
            bundleExtra.putBoolean(Constants.APPBOY_PUSH_OPEN_URI_IN_WEBVIEW_KEY, equalsIgnoreCase);
            AppboyNavigator.getAppboyNavigator().gotoUri(context, ActionFactory.createUriActionFromUrlString(stringExtra, bundleExtra, equalsIgnoreCase, Channel.PUSH));
            return;
        }
        Intent mainActivityIntent = UriUtils.getMainActivityIntent(context, bundleExtra);
        String str2 = TAG;
        AppboyLogger.m5448d(str2, "Push notification had no deep link. Opening main activity: " + mainActivityIntent);
        context.startActivity(mainActivityIntent);
    }

    public static void sendNotificationOpenedBroadcast(Context context, Intent intent) {
        AppboyLogger.m5448d(TAG, "Sending notification opened broadcast");
        sendPushActionIntent(context, ".intent.APPBOY_NOTIFICATION_OPENED", intent.getExtras());
    }

    private static void sendPushActionIntent(Context context, String str, Bundle bundle) {
        Intent intent = new Intent(context.getPackageName() + str);
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        IntentUtils.addComponentAndSendBroadcast(context, intent);
    }

    public static void sendPushMessageReceivedBroadcast(Context context, Bundle bundle) {
        AppboyLogger.m5448d(TAG, "Sending push message received broadcast");
        sendPushActionIntent(context, ".intent.APPBOY_PUSH_RECEIVED", bundle);
    }

    public static void setAccentColorIfPresentAndSupported(C4522y yVar, BrazeNotificationPayload brazeNotificationPayload) {
        if (brazeNotificationPayload.getAccentColor() != null) {
            AppboyLogger.m5448d(TAG, "Using accent color for notification from extras bundle");
            yVar.f15636q = brazeNotificationPayload.getAccentColor().intValue();
            return;
        }
        BrazeConfigurationProvider configurationProvider = brazeNotificationPayload.getConfigurationProvider();
        if (configurationProvider != null) {
            AppboyLogger.m5448d(TAG, "Using default accent color for notification");
            yVar.f15636q = configurationProvider.getDefaultNotificationAccentColor();
            return;
        }
        AppboyLogger.m5448d(TAG, "Cannot set default accent color for notification with null config provider");
    }

    public static void setCategoryIfPresentAndSupported(C4522y yVar, BrazeNotificationPayload brazeNotificationPayload) {
        if (brazeNotificationPayload.getNotificationCategory() != null) {
            AppboyLogger.m5448d(TAG, "Setting category for notification");
            yVar.f15634o = brazeNotificationPayload.getNotificationCategory();
            return;
        }
        AppboyLogger.m5448d(TAG, "Category not present in notification extras. Not setting category for notification.");
    }

    public static void setContentIfPresent(C4522y yVar, BrazeNotificationPayload brazeNotificationPayload) {
        AppboyLogger.m5448d(TAG, "Setting content for notification");
        yVar.mo20031c(HtmlUtils.getHtmlSpannedTextIfEnabled(brazeNotificationPayload.getConfigurationProvider(), brazeNotificationPayload.getContentText()));
    }

    public static void setContentIntentIfPresent(Context context, C4522y yVar, Bundle bundle) {
        try {
            yVar.f15626g = getPushActionPendingIntent(context, Constants.APPBOY_PUSH_CLICKED_ACTION, bundle);
        } catch (Exception e) {
            AppboyLogger.m5452e(TAG, "Error setting content intent.", e);
        }
    }

    public static void setDeleteIntent(Context context, C4522y yVar, Bundle bundle) {
        try {
            Intent intent = new Intent(Constants.APPBOY_PUSH_DELETED_ACTION).setClass(context, getNotificationReceiverClass());
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            yVar.f15644y.deleteIntent = PendingIntent.getBroadcast(context, IntentUtils.getRequestCode(), intent, 1073741824 | IntentUtils.getDefaultPendingIntentFlags());
        } catch (Exception e) {
            AppboyLogger.m5452e(TAG, "Error setting delete intent.", e);
        }
    }

    public static boolean setLargeIconIfPresentAndSupported(C4522y yVar, BrazeNotificationPayload brazeNotificationPayload) {
        if (brazeNotificationPayload.isPushStory()) {
            AppboyLogger.m5448d(TAG, "Large icon not supported in story push.");
            return false;
        }
        try {
            Context context = brazeNotificationPayload.getContext();
            if (context == null) {
                AppboyLogger.m5448d(TAG, "Cannot set large icon with null context");
                return false;
            }
            String str = TAG;
            AppboyLogger.m5448d(str, "Setting large icon for notification");
            String largeIcon = brazeNotificationPayload.getLargeIcon();
            if (largeIcon != null) {
                yVar.mo20035g(Braze.getInstance(context).getImageLoader().getPushBitmapFromUrl(context, (Bundle) null, largeIcon, BrazeViewBounds.NOTIFICATION_LARGE_ICON));
                return true;
            }
            AppboyLogger.m5448d(str, "Large icon bitmap url not present in extras. Attempting to use resource id instead.");
            int largeNotificationIconResourceId = brazeNotificationPayload.getConfigurationProvider().getLargeNotificationIconResourceId();
            if (largeNotificationIconResourceId != 0) {
                yVar.mo20035g(BitmapFactory.decodeResource(context.getResources(), largeNotificationIconResourceId));
                return true;
            }
            AppboyLogger.m5448d(str, "Large icon resource id not present for notification");
            AppboyLogger.m5448d(TAG, "Large icon not set for notification");
            return false;
        } catch (Exception e) {
            AppboyLogger.m5452e(TAG, "Error setting large notification icon", e);
        }
    }

    public static void setNotificationBadgeNumberIfPresent(C4522y yVar, BrazeNotificationPayload brazeNotificationPayload) {
        if (Build.VERSION.SDK_INT < 26) {
            AppboyLogger.m5448d(TAG, "Notification badge number not supported on this android version. Not setting badge number for notification.");
        } else if (brazeNotificationPayload.getNotificationBadgeNumber() != null) {
            yVar.f15628i = brazeNotificationPayload.getNotificationBadgeNumber().intValue();
        }
    }

    public static void setNotificationDurationAlarm(Context context, Class<?> cls, int i, int i2) {
        Intent intent = new Intent(context, cls);
        intent.setAction(Constants.APPBOY_CANCEL_NOTIFICATION_ACTION);
        intent.putExtra(Constants.APPBOY_PUSH_NOTIFICATION_ID, i);
        PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, IntentUtils.getDefaultPendingIntentFlags() | 134217728);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (i2 >= 1000) {
            String str = TAG;
            AppboyLogger.m5448d(str, "Setting Notification duration alarm for " + i2 + " ms");
            alarmManager.set(3, SystemClock.elapsedRealtime() + ((long) i2), broadcast);
        }
    }

    public static void setPriorityIfPresentAndSupported(C4522y yVar, Bundle bundle) {
        if (bundle != null) {
            AppboyLogger.m5448d(TAG, "Setting priority for notification");
            yVar.f15629j = getNotificationPriority(bundle);
        }
    }

    public static void setPublicVersionIfPresentAndSupported(C4522y yVar, BrazeNotificationPayload brazeNotificationPayload) {
        String orCreateNotificationChannelId;
        Bundle parseJsonObjectIntoBundle;
        if (brazeNotificationPayload.getContext() != null && brazeNotificationPayload.getPublicNotificationExtras() != null && (orCreateNotificationChannelId = getOrCreateNotificationChannelId(brazeNotificationPayload)) != null && (parseJsonObjectIntoBundle = JsonUtils.parseJsonObjectIntoBundle(brazeNotificationPayload.getPublicNotificationExtras())) != null) {
            BrazeNotificationPayload brazeNotificationPayload2 = new BrazeNotificationPayload(brazeNotificationPayload.getContext(), brazeNotificationPayload.getConfigurationProvider(), parseJsonObjectIntoBundle);
            if (brazeNotificationPayload2.getConfigurationProvider() != null) {
                C4522y yVar2 = new C4522y(brazeNotificationPayload.getContext(), orCreateNotificationChannelId);
                AppboyLogger.m5448d(TAG, "Setting public version of notification");
                setContentIfPresent(yVar2, brazeNotificationPayload2);
                setTitleIfPresent(yVar2, brazeNotificationPayload2);
                setSummaryTextIfPresentAndSupported(yVar2, brazeNotificationPayload2);
                setSmallIcon(brazeNotificationPayload2.getConfigurationProvider(), yVar2);
                setAccentColorIfPresentAndSupported(yVar2, brazeNotificationPayload2);
                yVar.f15638s = yVar2.mo20030a();
            }
        }
    }

    public static void setSetShowWhen(C4522y yVar, BrazeNotificationPayload brazeNotificationPayload) {
        if (brazeNotificationPayload.isPushStory()) {
            AppboyLogger.m5448d(TAG, "Set show when not supported in story push.");
            yVar.f15630k = false;
        }
    }

    public static int setSmallIcon(BrazeConfigurationProvider brazeConfigurationProvider, C4522y yVar) {
        int smallNotificationIconResourceId = brazeConfigurationProvider.getSmallNotificationIconResourceId();
        if (smallNotificationIconResourceId == 0) {
            AppboyLogger.m5448d(TAG, "Small notification icon resource was not found. Will use the app icon when displaying notifications.");
            smallNotificationIconResourceId = brazeConfigurationProvider.getApplicationIconResourceId();
        } else {
            AppboyLogger.m5448d(TAG, "Setting small icon for notification via resource id");
        }
        yVar.f15644y.icon = smallNotificationIconResourceId;
        return smallNotificationIconResourceId;
    }

    public static void setSoundIfPresentAndSupported(C4522y yVar, BrazeNotificationPayload brazeNotificationPayload) {
        String notificationSound = brazeNotificationPayload.getNotificationSound();
        if (notificationSound == null) {
            AppboyLogger.m5448d(TAG, "Sound key not present in notification extras. Not setting sound for notification.");
        } else if (notificationSound.equals("d")) {
            AppboyLogger.m5448d(TAG, "Setting default sound for notification.");
            yVar.mo20033e(1);
        } else {
            AppboyLogger.m5448d(TAG, "Setting sound for notification via uri.");
            yVar.mo20036h(Uri.parse(notificationSound));
        }
    }

    public static void setSummaryTextIfPresentAndSupported(C4522y yVar, BrazeNotificationPayload brazeNotificationPayload) {
        String summaryText = brazeNotificationPayload.getSummaryText();
        if (summaryText != null) {
            AppboyLogger.m5448d(TAG, "Setting summary text for notification");
            yVar.getClass();
            yVar.f15632m = C4522y.m11766b(summaryText);
            return;
        }
        AppboyLogger.m5448d(TAG, "Summary text not present. Not setting summary text for notification.");
    }

    public static void setTickerIfPresent(C4522y yVar, BrazeNotificationPayload brazeNotificationPayload) {
        AppboyLogger.m5448d(TAG, "Setting ticker for notification");
        yVar.mo20038j(brazeNotificationPayload.getTitleText());
    }

    public static void setTitleIfPresent(C4522y yVar, BrazeNotificationPayload brazeNotificationPayload) {
        AppboyLogger.m5448d(TAG, "Setting title for notification");
        yVar.mo20032d(HtmlUtils.getHtmlSpannedTextIfEnabled(brazeNotificationPayload.getConfigurationProvider(), brazeNotificationPayload.getTitleText()));
    }

    public static void setVisibilityIfPresentAndSupported(C4522y yVar, BrazeNotificationPayload brazeNotificationPayload) {
        if (brazeNotificationPayload.getNotificationVisibility() != null) {
            int intValue = brazeNotificationPayload.getNotificationVisibility().intValue();
            if (isValidNotificationVisibility(intValue)) {
                AppboyLogger.m5448d(TAG, "Setting visibility for notification");
                yVar.f15637r = intValue;
                return;
            }
            String str = TAG;
            AppboyLogger.m5459w(str, "Received invalid notification visibility " + intValue);
        }
    }

    public static boolean wakeScreenIfAppropriate(Context context, BrazeConfigurationProvider brazeConfigurationProvider, Bundle bundle) {
        if (!PermissionUtils.hasPermission(context, "android.permission.WAKE_LOCK") || !brazeConfigurationProvider.getIsPushWakeScreenForNotificationEnabled()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel validNotificationChannel = getValidNotificationChannel((NotificationManager) context.getSystemService("notification"), bundle);
            if (validNotificationChannel == null) {
                AppboyLogger.m5448d(TAG, "Not waking screen on Android O+ device, could not find notification channel.");
                return false;
            }
            int notificationChannelImportance = getNotificationChannelImportance(validNotificationChannel);
            if (notificationChannelImportance == 1) {
                String str = TAG;
                AppboyLogger.m5448d(str, "Not acquiring wake-lock for Android O+ notification with importance: " + notificationChannelImportance);
                return false;
            }
        } else if (getNotificationPriority(bundle) == -2) {
            return false;
        }
        String str2 = TAG;
        AppboyLogger.m5448d(str2, "Waking screen for notification");
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(268435482, str2);
        newWakeLock.acquire();
        newWakeLock.release();
        return true;
    }
}
