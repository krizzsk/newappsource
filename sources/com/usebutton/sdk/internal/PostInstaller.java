package com.usebutton.sdk.internal;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.usebutton.sdk.internal.events.EventTracker;
import com.usebutton.sdk.internal.events.Events;
import com.usebutton.sdk.internal.models.Configuration;
import com.usebutton.sdk.internal.models.MetaInfo;
import com.usebutton.sdk.internal.models.PostInstallNotificationConfig;
import com.usebutton.sdk.internal.notifications.NotificationDispatcher;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.internal.util.JsonBuilder;
import com.usebutton.sdk.internal.util.TimeProvider;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

class PostInstaller {
    private static final String TAG = "AppInstaller";
    private static final TimeProvider TIME_DEFAULT = new TimeProvider() {
        public long getTimeInMs() {
            return SystemClock.elapsedRealtime();
        }
    };
    private final Configuration configuration;
    private final Context context;
    private final EventTracker eventTracker;
    private final long installStartTime;
    private final MetaInfo metaInfo;
    private final NotificationDispatcher notificationDispatcher;
    private final PostInstallNotificationConfig postInstallConfig;
    private final Intent targetIntent;
    private final TimeProvider timeProvider;
    private boolean wasPostInstallerInvoked;

    public PostInstaller(Context context2, MetaInfo metaInfo2, PostInstallNotificationConfig postInstallNotificationConfig, Intent intent, EventTracker eventTracker2) {
        this(context2, ButtonPrivate.getButton().getConfiguration(), TIME_DEFAULT, metaInfo2, postInstallNotificationConfig, intent, eventTracker2, ButtonPrivate.getButton().getNotificationDispatcher());
    }

    private JSONObject eventProperties() {
        return JsonBuilder.toJson(Events.PROPERTY_ACTION, this.targetIntent.getDataString(), Events.PROPERTY_SOURCE_TOKEN, this.metaInfo.getSourceToken(), "target", this.metaInfo.getTarget(), "app_id", this.metaInfo.getStoreId());
    }

    private boolean shouldOpen() {
        int i;
        boolean z;
        long timeInMs = this.timeProvider.getTimeInMs() - this.installStartTime;
        PostInstallNotificationConfig postInstallNotificationConfig = this.postInstallConfig;
        if (postInstallNotificationConfig != null) {
            i = postInstallNotificationConfig.getTimeoutWindowInSeconds();
        } else {
            i = this.configuration.getParameters().getAttendedInstallAutoOpenSeconds();
        }
        if (timeInMs < TimeUnit.SECONDS.toMillis((long) i)) {
            z = true;
        } else {
            z = false;
        }
        ButtonLog.verboseFormat(TAG, "Time since install started %.1fs, threshold %d, open: %b", Double.valueOf(((double) timeInMs) / 1000.0d), Integer.valueOf(i), Boolean.valueOf(z));
        return z;
    }

    private void showPostInstallNotification() {
        if (this.configuration.getParameters().isInstallNotificationDisabled()) {
            ButtonLog.verbose(TAG, "Install notifications disabled, do nothing.");
            return;
        }
        this.targetIntent.putExtra("target", this.metaInfo.getTarget());
        this.targetIntent.putExtra(Events.PROPERTY_SOURCE_TOKEN, this.metaInfo.getSourceToken());
        this.notificationDispatcher.displayPostInstallNotification(this.targetIntent, this.configuration, this.postInstallConfig, this.metaInfo);
    }

    public void onInstalled() {
        if (!this.wasPostInstallerInvoked) {
            this.wasPostInstallerInvoked = true;
            this.eventTracker.trackEventWithProperties(Events.APP_INSTALL_SUCCESS, eventProperties());
            ButtonLog.visibleFormat("Store Install completed (Action ID: %s)", this.metaInfo.getId());
            if (shouldOpen()) {
                ButtonLog.verbose(TAG, "Fast install, let's open commerce app.");
                ButtonPrivate.safelyOpenIntent(this.context, this.targetIntent);
                JSONObject eventProperties = eventProperties();
                if (this.configuration.getParameters().isAppToAppNotificationEnabled()) {
                    try {
                        eventProperties.put(Events.PROPERTY_NOTIFICATIONS_ENABLED, this.notificationDispatcher.areNotificationsEnabled());
                    } catch (JSONException e) {
                        ButtonLog.warn(TAG, "Could not append event: notifications_enabled", e);
                    }
                    this.notificationDispatcher.displayAppToAppNotification(this.targetIntent);
                    this.eventTracker.trackEventWithProperties(Events.NOTIFIED_TRACKING_ACTIVE, Events.PROPERTY_SOURCE_TOKEN, this.metaInfo.getSourceToken());
                }
                this.eventTracker.trackEventWithProperties(Events.APP_DEEPLINK, eventProperties);
                return;
            }
            ButtonLog.verbose(TAG, "Install took too long, post notification.");
            showPostInstallNotification();
        }
    }

    public PostInstaller(Context context2, Configuration configuration2, TimeProvider timeProvider2, MetaInfo metaInfo2, PostInstallNotificationConfig postInstallNotificationConfig, Intent intent, EventTracker eventTracker2, NotificationDispatcher notificationDispatcher2) {
        this.wasPostInstallerInvoked = false;
        this.context = context2.getApplicationContext();
        this.targetIntent = intent;
        this.configuration = configuration2;
        this.metaInfo = metaInfo2;
        this.postInstallConfig = postInstallNotificationConfig;
        this.timeProvider = timeProvider2;
        this.eventTracker = eventTracker2;
        this.installStartTime = timeProvider2.getTimeInMs();
        this.notificationDispatcher = notificationDispatcher2;
    }
}
