package com.appboy;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appboy.support.AppboyLogger;
import com.appboy.support.StringUtils;
import com.braze.Braze;
import com.braze.configuration.BrazeConfigurationProvider;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Map;

public class AppboyFirebaseMessagingService extends FirebaseMessagingService {
    private static final String TAG = AppboyLogger.getBrazeLogTag(AppboyFirebaseMessagingService.class);

    public static boolean handleBrazeRemoteMessage(Context context, RemoteMessage remoteMessage) {
        if (remoteMessage == null) {
            AppboyLogger.m5459w(TAG, "Remote message from FCM was null. Remote message did not originate from Braze.");
            return false;
        } else if (!isBrazePushNotification(remoteMessage)) {
            String str = TAG;
            AppboyLogger.m5453i(str, "Remote message did not originate from Braze. Not consuming remote message: " + remoteMessage);
            return false;
        } else {
            Map<String, String> data = remoteMessage.getData();
            String str2 = TAG;
            AppboyLogger.m5453i(str2, "Got remote message from FCM: " + data);
            Intent intent = new Intent("firebase_messaging_service_routing_action");
            Bundle bundle = new Bundle();
            for (Map.Entry next : data.entrySet()) {
                String str3 = (String) next.getKey();
                String str4 = (String) next.getValue();
                String str5 = TAG;
                AppboyLogger.m5457v(str5, "Adding bundle item from FCM remote data with key: " + str3 + " and value: " + str4);
                bundle.putString(str3, str4);
            }
            intent.putExtras(bundle);
            BrazePushReceiver.handleReceivedIntent(context, intent);
            return true;
        }
    }

    public static boolean isBrazePushNotification(RemoteMessage remoteMessage) {
        Map<String, String> data = remoteMessage.getData();
        if (data != null) {
            return InneractiveMediationDefs.SHOW_HOUSE_AD_YES.equals(data.get(Constants.APPBOY_PUSH_APPBOY_KEY));
        }
        String str = TAG;
        AppboyLogger.m5459w(str, "Remote message data from FCM was null. Returning false for Braze push check. Remote message: " + remoteMessage);
        return false;
    }

    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        handleBrazeRemoteMessage(this, remoteMessage);
    }

    public void onNewToken(String str) {
        super.onNewToken(str);
        if (StringUtils.isNullOrEmpty(Appboy.getConfiguredApiKey(this))) {
            String str2 = TAG;
            AppboyLogger.m5457v(str2, "No configured API key, not registering token in onNewToken. Token: " + str);
        } else if (!new BrazeConfigurationProvider(this).getIsFirebaseMessagingServiceOnNewTokenRegistrationEnabled()) {
            String str3 = TAG;
            AppboyLogger.m5457v(str3, "Automatic FirebaseMessagingService.OnNewToken() registration disabled, not registering token: " + str);
        } else {
            String str4 = TAG;
            AppboyLogger.m5457v(str4, "Registering Firebase push token in onNewToken. Token: " + str);
            Braze.getInstance(this).registerAppboyPushMessages(str);
        }
    }
}
