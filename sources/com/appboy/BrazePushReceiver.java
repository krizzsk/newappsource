package com.appboy;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NotificationManagerCompat;
import com.appboy.models.push.BrazeNotificationPayload;
import com.appboy.p044ui.inappmessage.AppboyInAppMessageManager;
import com.appboy.push.AppboyNotificationActionUtils;
import com.appboy.push.AppboyNotificationUtils;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import com.braze.configuration.BrazeConfigurationProvider;

public class BrazePushReceiver extends BroadcastReceiver {
    /* access modifiers changed from: private */
    public static final String TAG = AppboyLogger.getBrazeLogTag(BrazePushReceiver.class);

    public static class PushHandlerRunnable implements Runnable {
        private final String mAction;
        private final Context mContext;
        private final Intent mIntent;

        public PushHandlerRunnable(Context context, Intent intent) {
            this.mContext = context;
            this.mIntent = intent;
            this.mAction = intent.getAction();
        }

        private void performWork() {
            String access$000 = BrazePushReceiver.TAG;
            StringBuilder k = C13555b.m33972k("Received broadcast message. Message: ");
            k.append(this.mIntent.toString());
            AppboyLogger.m5453i(access$000, k.toString());
            String action = this.mIntent.getAction();
            if (StringUtils.isNullOrEmpty(action)) {
                String access$0002 = BrazePushReceiver.TAG;
                StringBuilder k2 = C13555b.m33972k("Push action is null. Not handling intent: ");
                k2.append(this.mIntent);
                AppboyLogger.m5459w(access$0002, k2.toString());
                return;
            }
            action.getClass();
            action.hashCode();
            char c = 65535;
            switch (action.hashCode()) {
                case -1584985748:
                    if (action.equals("firebase_messaging_service_routing_action")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1189411212:
                    if (action.equals(Constants.APPBOY_PUSH_CLICKED_ACTION)) {
                        c = 1;
                        break;
                    }
                    break;
                case -499472794:
                    if (action.equals(Constants.APPBOY_PUSH_DELETED_ACTION)) {
                        c = 2;
                        break;
                    }
                    break;
                case -478038018:
                    if (action.equals(Constants.APPBOY_STORY_TRAVERSE_CLICKED_ACTION)) {
                        c = 3;
                        break;
                    }
                    break;
                case 431884654:
                    if (action.equals(Constants.APPBOY_CANCEL_NOTIFICATION_ACTION)) {
                        c = 4;
                        break;
                    }
                    break;
                case 465410320:
                    if (action.equals(Constants.APPBOY_ACTION_CLICKED_ACTION)) {
                        c = 5;
                        break;
                    }
                    break;
                case 1740454061:
                    if (action.equals("hms_push_service_routing_action")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1908841035:
                    if (action.equals(Constants.APPBOY_STORY_CLICKED_ACTION)) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                case 3:
                case 6:
                    BrazePushReceiver.handlePushNotificationPayload(this.mContext, this.mIntent);
                    return;
                case 1:
                    AppboyNotificationUtils.handleNotificationOpened(this.mContext, this.mIntent);
                    return;
                case 2:
                    AppboyNotificationUtils.handleNotificationDeleted(this.mContext, this.mIntent);
                    return;
                case 4:
                    AppboyNotificationUtils.handleCancelNotificationAction(this.mContext, this.mIntent);
                    return;
                case 5:
                    AppboyNotificationActionUtils.handleNotificationActionClicked(this.mContext, this.mIntent);
                    return;
                case 7:
                    AppboyNotificationUtils.handlePushStoryPageClicked(this.mContext, this.mIntent);
                    return;
                default:
                    AppboyLogger.m5459w(BrazePushReceiver.TAG, "Received a message not sent from Braze. Ignoring the message.");
                    return;
            }
        }

        public void run() {
            try {
                performWork();
            } catch (Exception e) {
                String access$000 = BrazePushReceiver.TAG;
                StringBuilder k = C13555b.m33972k("Caught exception while performing the push notification handling work. Action: ");
                k.append(this.mAction);
                k.append(" Intent: ");
                k.append(this.mIntent);
                AppboyLogger.m5452e(access$000, k.toString(), e);
            }
        }
    }

    private static Notification createNotification(BrazeNotificationPayload brazeNotificationPayload) {
        String str = TAG;
        AppboyLogger.m5457v(str, "Creating notification with payload:\n" + brazeNotificationPayload);
        IAppboyNotificationFactory activeNotificationFactory = AppboyNotificationUtils.getActiveNotificationFactory();
        Notification createNotification = activeNotificationFactory.createNotification(brazeNotificationPayload);
        if (createNotification != null) {
            return createNotification;
        }
        AppboyLogger.m5448d(str, "Calling older notification factory method after null notification returned on newer method");
        return activeNotificationFactory.createNotification(brazeNotificationPayload.getAppboyConfigurationProvider(), brazeNotificationPayload.getContext(), brazeNotificationPayload.getNotificationExtras(), brazeNotificationPayload.getAppboyExtras());
    }

    public static boolean handlePushNotificationPayload(Context context, Intent intent) {
        if (!AppboyNotificationUtils.isAppboyPushMessage(intent)) {
            return false;
        }
        if ("deleted_messages".equals(intent.getStringExtra("message_type"))) {
            int intExtra = intent.getIntExtra("total_deleted", -1);
            if (intExtra == -1) {
                String str = TAG;
                StringBuilder k = C13555b.m33972k("Unable to parse FCM message. Intent: ");
                k.append(intent.toString());
                AppboyLogger.m5459w(str, k.toString());
            } else {
                String str2 = TAG;
                AppboyLogger.m5453i(str2, "FCM deleted " + intExtra + " messages. Fetch them from Appboy.");
            }
            return false;
        }
        Bundle extras = intent.getExtras();
        String str3 = TAG;
        AppboyLogger.m5453i(str3, "Push message payload received: " + extras);
        Bundle attachedAppboyExtras = BrazeNotificationPayload.getAttachedAppboyExtras(extras);
        extras.putBundle(Constants.APPBOY_PUSH_EXTRAS_KEY, attachedAppboyExtras);
        if (!extras.containsKey(Constants.APPBOY_PUSH_RECEIVED_TIMESTAMP_MILLIS)) {
            extras.putLong(Constants.APPBOY_PUSH_RECEIVED_TIMESTAMP_MILLIS, System.currentTimeMillis());
        }
        if (AppboyNotificationUtils.isUninstallTrackingPush(extras)) {
            AppboyLogger.m5453i(str3, "Push message is uninstall tracking push. Doing nothing. Not forwarding this notification to broadcast receivers.");
            return false;
        }
        BrazeConfigurationProvider brazeConfigurationProvider = new BrazeConfigurationProvider(context);
        if (!brazeConfigurationProvider.getIsInAppMessageTestPushEagerDisplayEnabled() || !AppboyNotificationUtils.isInAppMessageTestPush(intent) || AppboyInAppMessageManager.getInstance().getActivity() == null) {
            BrazeNotificationPayload brazeNotificationPayload = new BrazeNotificationPayload(context, brazeConfigurationProvider, extras, attachedAppboyExtras);
            AppboyNotificationUtils.handleContentCardsSerializedCardIfPresent(brazeNotificationPayload);
            if (AppboyNotificationUtils.isNotificationMessage(intent)) {
                AppboyLogger.m5448d(str3, "Received notification push");
                int notificationId = AppboyNotificationUtils.getNotificationId(brazeNotificationPayload);
                extras.putInt(Constants.APPBOY_PUSH_NOTIFICATION_ID, notificationId);
                if (brazeNotificationPayload.isPushStory() && !extras.containsKey(Constants.APPBOY_PUSH_STORY_IS_NEWLY_RECEIVED)) {
                    AppboyLogger.m5448d(str3, "Received the initial push story notification.");
                    extras.putBoolean(Constants.APPBOY_PUSH_STORY_IS_NEWLY_RECEIVED, true);
                }
                Notification createNotification = createNotification(brazeNotificationPayload);
                if (createNotification == null) {
                    AppboyLogger.m5448d(str3, "Notification created by notification factory was null. Not displaying notification.");
                    return false;
                }
                NotificationManagerCompat.from(context).notify(Constants.APPBOY_PUSH_NOTIFICATION_TAG, notificationId, createNotification);
                AppboyNotificationUtils.sendPushMessageReceivedBroadcast(context, extras);
                AppboyNotificationUtils.wakeScreenIfAppropriate(context, brazeConfigurationProvider, extras);
                if (brazeNotificationPayload.getPushDuration() != null) {
                    AppboyNotificationUtils.setNotificationDurationAlarm(context, BrazePushReceiver.class, notificationId, brazeNotificationPayload.getPushDuration().intValue());
                }
                return true;
            }
            AppboyLogger.m5448d(str3, "Received silent push");
            AppboyNotificationUtils.sendPushMessageReceivedBroadcast(context, extras);
            AppboyNotificationUtils.requestGeofenceRefreshIfAppropriate(context, extras);
            return false;
        }
        AppboyLogger.m5448d(str3, "Bypassing push display due to test in-app message presence and eager test in-app message display configuration setting.");
        AppboyInternal.handleInAppMessageTestPush(context, intent);
        return false;
    }

    public static void handleReceivedIntent(Context context, Intent intent) {
        handleReceivedIntent(context, intent, true);
    }

    public void onReceive(Context context, Intent intent) {
        handleReceivedIntent(context, intent);
    }

    public static void handleReceivedIntent(Context context, Intent intent, boolean z) {
        if (intent == null) {
            AppboyLogger.m5459w(TAG, "Received null intent. Doing nothing.");
        } else if (z) {
            new Thread(new PushHandlerRunnable(context.getApplicationContext(), intent)).start();
        } else {
            new PushHandlerRunnable(context, intent).run();
        }
    }
}
