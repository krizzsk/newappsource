package com.usebutton.sdk.internal.receivers;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.usebutton.sdk.internal.ButtonPrivate;
import com.usebutton.sdk.internal.events.EventTracker;
import com.usebutton.sdk.internal.events.Events;
import com.usebutton.sdk.internal.models.Configuration;
import com.usebutton.sdk.internal.notifications.NotificationDispatcher;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.internal.util.JsonBuilder;
import com.usebutton.sdk.internal.util.TestUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class InstallNotificationReceiver extends BroadcastReceiver {
    public static final String ACTION_CANCEL = "com.usebutton.sdk.internal.receivers.InstallNotificationReceiver.CANCEL";
    public static final String ACTION_CONTENT = "com.usebutton.sdk.internal.receivers.InstallNotificationReceiver.CONTENT";
    private static final String EXTRA_TARGET = "target";
    private static final String TAG = "InstallNotification";

    public static Intent cancelIntent(Context context, Intent intent) {
        return intentFor(context, ACTION_CANCEL, intent);
    }

    private static JSONObject eventPropertiesForIntent(Intent intent) {
        return JsonBuilder.toJson(Events.PROPERTY_ACTION, intent.getData().toString(), Events.PROPERTY_SOURCE_TOKEN, intent.getStringExtra(Events.PROPERTY_SOURCE_TOKEN), "target", intent.getStringExtra("target"));
    }

    private Configuration.Parameters getConfigurationParameters() {
        return ButtonPrivate.getButton().getParameters();
    }

    private EventTracker getEventTracker() {
        return ButtonPrivate.getButton().getEventTracker();
    }

    private void handleCancel(Intent intent) {
        getEventTracker().trackEventWithProperties(Events.APP_INSTALL_NOTIFICATION_DISMISSED, eventPropertiesForIntent(intent));
    }

    private void handleOpen(Context context, Intent intent) {
        JSONObject jSONObject;
        EventTracker eventTracker = getEventTracker();
        NotificationDispatcher notificationDispatcher = ButtonPrivate.getButton().getNotificationDispatcher();
        ComponentName resolveActivity = intent.resolveActivity(context.getPackageManager());
        if (TestUtils.isNotTesting()) {
            if (resolveActivity == null) {
                ButtonLog.warnFormat(TAG, "Nothing to open target app, uninstalled? intent: %s", intent);
                return;
            }
            ButtonPrivate.safelyOpenIntent(context, intent);
            if (getConfigurationParameters().isAppToAppNotificationEnabled()) {
                notificationDispatcher.displayAppToAppNotification(intent);
                eventTracker.trackEventWithProperties(Events.NOTIFIED_TRACKING_ACTIVE, Events.PROPERTY_SOURCE_TOKEN, intent.getStringExtra(Events.PROPERTY_SOURCE_TOKEN));
            }
        }
        JSONObject eventPropertiesForIntent = eventPropertiesForIntent(intent);
        eventTracker.trackEventWithProperties(Events.APP_INSTALL_NOTIFICATION_ACTION, eventPropertiesForIntent);
        try {
            jSONObject = new JSONObject(eventPropertiesForIntent.toString());
            try {
                jSONObject.put(Events.PROPERTY_NOTIFICATIONS_ENABLED, notificationDispatcher.areNotificationsEnabled());
            } catch (JSONException unused) {
                eventPropertiesForIntent = jSONObject;
            }
        } catch (JSONException unused2) {
            jSONObject = eventPropertiesForIntent;
            eventTracker.trackEventWithProperties(Events.APP_DEEPLINK, jSONObject);
        }
        eventTracker.trackEventWithProperties(Events.APP_DEEPLINK, jSONObject);
    }

    private static Intent intentFor(Context context, String str, Intent intent) {
        Intent intent2 = new Intent(context, InstallNotificationReceiver.class);
        intent2.setAction(str);
        intent2.putExtra("target", intent);
        return intent2;
    }

    public static Intent openIntent(Context context, Intent intent) {
        return intentFor(context, ACTION_CONTENT, intent);
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Intent intent2 = (Intent) intent.getParcelableExtra("target");
        if (intent2 == null || intent2.getData() == null) {
            ButtonLog.warnFormat(TAG, "Invalid intent, no target intent with data with %s", intent2);
        } else if (ACTION_CONTENT.equals(action)) {
            handleOpen(context, intent2);
        } else if (ACTION_CANCEL.equals(action)) {
            handleCancel(intent2);
        } else {
            ButtonLog.warnFormat(TAG, "Got unknown action %s", action);
        }
    }
}
