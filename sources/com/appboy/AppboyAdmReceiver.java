package com.appboy;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appboy.models.push.BrazeNotificationPayload;
import com.appboy.push.AppboyNotificationActionUtils;
import com.appboy.push.AppboyNotificationUtils;
import com.appboy.support.AppboyLogger;
import com.braze.Braze;
import com.braze.configuration.BrazeConfigurationProvider;

public final class AppboyAdmReceiver extends BroadcastReceiver {
    /* access modifiers changed from: private */
    public static final String TAG = AppboyLogger.getBrazeLogTag(AppboyAdmReceiver.class);

    public static class PushHandlerRunnable implements Runnable {
        private final String mAction;
        private final Context mApplicationContext;
        private final Intent mIntent;

        public PushHandlerRunnable(Context context, Intent intent) {
            this.mApplicationContext = context;
            this.mIntent = intent;
            this.mAction = intent.getAction();
        }

        private void performWork() {
            String access$000 = AppboyAdmReceiver.TAG;
            StringBuilder k = C13555b.m33972k("Received broadcast message. Message: ");
            k.append(this.mIntent.toString());
            AppboyLogger.m5453i(access$000, k.toString());
            String action = this.mIntent.getAction();
            if ("com.amazon.device.messaging.intent.REGISTRATION".equals(action)) {
                AppboyAdmReceiver.handleRegistrationEventIfEnabled(new BrazeConfigurationProvider(this.mApplicationContext), this.mApplicationContext, this.mIntent);
            } else if ("com.amazon.device.messaging.intent.RECEIVE".equals(action)) {
                AppboyAdmReceiver.handleAppboyAdmMessage(this.mApplicationContext, this.mIntent);
            } else if (Constants.APPBOY_CANCEL_NOTIFICATION_ACTION.equals(action)) {
                AppboyNotificationUtils.handleCancelNotificationAction(this.mApplicationContext, this.mIntent);
            } else if (Constants.APPBOY_ACTION_CLICKED_ACTION.equals(action)) {
                AppboyNotificationActionUtils.handleNotificationActionClicked(this.mApplicationContext, this.mIntent);
            } else if (Constants.APPBOY_PUSH_CLICKED_ACTION.equals(action)) {
                AppboyNotificationUtils.handleNotificationOpened(this.mApplicationContext, this.mIntent);
            } else if (Constants.APPBOY_PUSH_DELETED_ACTION.equals(action)) {
                AppboyNotificationUtils.handleNotificationDeleted(this.mApplicationContext, this.mIntent);
            } else {
                AppboyLogger.m5459w(AppboyAdmReceiver.TAG, "The ADM receiver received a message not sent from Appboy. Ignoring the message.");
            }
        }

        public void run() {
            try {
                performWork();
            } catch (Exception e) {
                String access$000 = AppboyAdmReceiver.TAG;
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

    public static boolean handleAppboyAdmMessage(Context context, Intent intent) {
        if (!AppboyNotificationUtils.isAppboyPushMessage(intent)) {
            return false;
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if ("deleted_messages".equals(intent.getStringExtra("message_type"))) {
            int intExtra = intent.getIntExtra("total_deleted", -1);
            if (intExtra == -1) {
                String str = TAG;
                StringBuilder k = C13555b.m33972k("Unable to parse ADM message. Intent: ");
                k.append(intent.toString());
                AppboyLogger.m5459w(str, k.toString());
            } else {
                String str2 = TAG;
                AppboyLogger.m5453i(str2, "ADM deleted " + intExtra + " messages. Fetch them from Appboy.");
            }
            return false;
        }
        Bundle extras = intent.getExtras();
        String str3 = TAG;
        AppboyLogger.m5448d(str3, "Push message payload received: " + extras);
        if (AppboyNotificationUtils.isUninstallTrackingPush(extras)) {
            AppboyLogger.m5453i(str3, "Push message is uninstall tracking push. Doing nothing. Not forwarding this notification to broadcast receivers.");
            return false;
        }
        if (!extras.containsKey(Constants.APPBOY_PUSH_RECEIVED_TIMESTAMP_MILLIS)) {
            extras.putLong(Constants.APPBOY_PUSH_RECEIVED_TIMESTAMP_MILLIS, System.currentTimeMillis());
        }
        extras.putBundle(Constants.APPBOY_PUSH_EXTRAS_KEY, BrazeNotificationPayload.getAttachedAppboyExtras(extras));
        BrazeConfigurationProvider brazeConfigurationProvider = new BrazeConfigurationProvider(context);
        BrazeNotificationPayload brazeNotificationPayload = new BrazeNotificationPayload(context, brazeConfigurationProvider, extras);
        if (AppboyNotificationUtils.isNotificationMessage(intent)) {
            int notificationId = AppboyNotificationUtils.getNotificationId(brazeNotificationPayload);
            extras.putInt(Constants.APPBOY_PUSH_NOTIFICATION_ID, notificationId);
            Notification createNotification = createNotification(brazeNotificationPayload);
            if (createNotification == null) {
                AppboyLogger.m5448d(str3, "Notification created by notification factory was null. Not displaying notification.");
                return false;
            }
            notificationManager.notify(Constants.APPBOY_PUSH_NOTIFICATION_TAG, notificationId, createNotification);
            AppboyNotificationUtils.sendPushMessageReceivedBroadcast(context, extras);
            AppboyNotificationUtils.wakeScreenIfAppropriate(context, brazeConfigurationProvider, extras);
            if (brazeNotificationPayload.getPushDuration() == null) {
                return true;
            }
            AppboyNotificationUtils.setNotificationDurationAlarm(context, AppboyAdmReceiver.class, notificationId, brazeNotificationPayload.getPushDuration().intValue());
            return true;
        }
        AppboyNotificationUtils.sendPushMessageReceivedBroadcast(context, extras);
        AppboyNotificationUtils.requestGeofenceRefreshIfAppropriate(context, extras);
        return false;
    }

    public static void handleReceivedIntent(Context context, Intent intent) {
        if (intent == null) {
            AppboyLogger.m5459w(TAG, "Received null intent. Doing nothing.");
        } else {
            new Thread(new PushHandlerRunnable(context.getApplicationContext(), intent)).start();
        }
    }

    public static boolean handleRegistrationEventIfEnabled(BrazeConfigurationProvider brazeConfigurationProvider, Context context, Intent intent) {
        String str = TAG;
        StringBuilder k = C13555b.m33972k("Received ADM registration. Message: ");
        k.append(intent.toString());
        AppboyLogger.m5453i(str, k.toString());
        if (brazeConfigurationProvider.isAdmMessagingRegistrationEnabled()) {
            AppboyLogger.m5448d(str, "ADM enabled in braze.xml. Continuing to process ADM registration intent.");
            handleRegistrationIntent(context, intent);
            return true;
        }
        AppboyLogger.m5459w(str, "ADM not enabled in braze.xml. Ignoring ADM registration intent. Note: you must set com_appboy_push_adm_messaging_registration_enabled to true in your braze.xml to enable ADM.");
        return false;
    }

    public static boolean handleRegistrationIntent(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("error");
        String stringExtra2 = intent.getStringExtra("error_description");
        String stringExtra3 = intent.getStringExtra("registration_id");
        String stringExtra4 = intent.getStringExtra("unregistered");
        if (stringExtra != null) {
            String str = TAG;
            AppboyLogger.m5459w(str, "Error during ADM registration: " + stringExtra + " description: " + stringExtra2);
            return true;
        } else if (stringExtra3 != null) {
            String str2 = TAG;
            AppboyLogger.m5453i(str2, "Registering for ADM messages with registrationId: " + stringExtra3);
            Braze.getInstance(context).registerAppboyPushMessages(stringExtra3);
            return true;
        } else if (stringExtra4 != null) {
            String str3 = TAG;
            AppboyLogger.m5459w(str3, "The device was un-registered from ADM: " + stringExtra4);
            return true;
        } else {
            AppboyLogger.m5459w(TAG, "The ADM registration intent is missing error information, registration id, and unregistration confirmation. Ignoring.");
            return false;
        }
    }

    public void onReceive(Context context, Intent intent) {
        handleReceivedIntent(context, intent);
    }
}
