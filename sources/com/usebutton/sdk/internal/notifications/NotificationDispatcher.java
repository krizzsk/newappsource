package com.usebutton.sdk.internal.notifications;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.NotificationManagerCompat;
import com.usebutton.sdk.C12238R;
import com.usebutton.sdk.internal.ButtonRepository;
import com.usebutton.sdk.internal.events.EventTracker;
import com.usebutton.sdk.internal.events.Events;
import com.usebutton.sdk.internal.functional.Getter;
import com.usebutton.sdk.internal.models.Configuration;
import com.usebutton.sdk.internal.models.MetaInfo;
import com.usebutton.sdk.internal.models.PostInstallNotificationConfig;
import com.usebutton.sdk.internal.notifications.BaseNotificationProvider;
import com.usebutton.sdk.internal.util.JsonBuilder;
import org.json.JSONObject;

public class NotificationDispatcher {
    private final AppToAppNotificationProvider appToAppNotificationProvider;
    private final Getter<Configuration> configurationGetter;
    private final Context context;
    private final EventTracker eventTracker;
    private final LegacyPostInstallNotificationProvider legacyPostInstallNotificationProvider;
    private final NotificationManager notificationManager;
    private final NotificationManagerCompat notificationManagerCompat;
    private final PostInstallNotificationProvider postInstallNotificationProvider;

    public NotificationDispatcher(Context context2, NotificationManagerCompat notificationManagerCompat2, NotificationManager notificationManager2, EventTracker eventTracker2, Getter<Configuration> getter, ButtonRepository buttonRepository) {
        this(context2, notificationManagerCompat2, notificationManager2, eventTracker2, getter, new AppToAppNotificationProvider(context2, new Handler(Looper.getMainLooper())), new PostInstallNotificationProvider(context2, buttonRepository), new LegacyPostInstallNotificationProvider(context2));
    }

    /* access modifiers changed from: private */
    public void displayNotification(BaseNotificationProvider.NotificationType notificationType, Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.notificationManager.createNotificationChannel(new NotificationChannel(this.context.getString(C12238R.string.btn_notification_channel_id), this.context.getString(C12238R.string.btn_notification_channel_title), 4));
        }
        if (areNotificationsEnabled()) {
            this.notificationManagerCompat.notify(notificationType.getNotificationId(), notification);
        }
    }

    /* access modifiers changed from: private */
    public void displayNotificationAndTrackEvent(BaseNotificationProvider.NotificationType notificationType, Notification notification, JSONObject jSONObject) {
        this.eventTracker.trackEventWithProperties(Events.APP_INSTALL_NOTIFICATION_DISPLAYED, jSONObject);
        displayNotification(notificationType, notification);
    }

    public boolean areNotificationsEnabled() {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 26 || (notificationChannel = this.notificationManager.getNotificationChannel(this.context.getString(C12238R.string.btn_notification_channel_id))) == null || notificationChannel.getImportance() != 0) {
            return this.notificationManagerCompat.areNotificationsEnabled();
        }
        return false;
    }

    public void displayAppToAppNotification(Intent intent) {
        this.appToAppNotificationProvider.displayNotification(intent, this.configurationGetter.get(), (BaseNotificationProvider.NotificationProviderListener) new BaseNotificationProvider.NotificationProviderListener() {
            public void onNotificationReady(BaseNotificationProvider.NotificationType notificationType, Notification notification) {
                NotificationDispatcher.this.displayNotification(notificationType, notification);
            }
        });
    }

    public void displayPostInstallNotification(Intent intent, Configuration configuration, PostInstallNotificationConfig postInstallNotificationConfig, MetaInfo metaInfo) {
        final JSONObject json = JsonBuilder.toJson(Events.PROPERTY_ACTION, intent.getDataString(), Events.PROPERTY_SOURCE_TOKEN, metaInfo.getSourceToken(), "target", metaInfo.getTarget(), "app_id", metaInfo.getStoreId());
        C123462 r0 = new BaseNotificationProvider.NotificationProviderListener() {
            public void onNotificationReady(BaseNotificationProvider.NotificationType notificationType, Notification notification) {
                NotificationDispatcher.this.displayNotificationAndTrackEvent(notificationType, notification, json);
            }
        };
        if (postInstallNotificationConfig == null) {
            this.legacyPostInstallNotificationProvider.displayNotification(intent, configuration, (BaseNotificationProvider.NotificationProviderListener) r0);
        } else {
            this.postInstallNotificationProvider.displayNotification(intent, postInstallNotificationConfig, (BaseNotificationProvider.NotificationProviderListener) r0);
        }
    }

    public NotificationDispatcher(Context context2, NotificationManagerCompat notificationManagerCompat2, NotificationManager notificationManager2, EventTracker eventTracker2, Getter<Configuration> getter, AppToAppNotificationProvider appToAppNotificationProvider2, PostInstallNotificationProvider postInstallNotificationProvider2, LegacyPostInstallNotificationProvider legacyPostInstallNotificationProvider2) {
        this.context = context2;
        this.notificationManagerCompat = notificationManagerCompat2;
        this.notificationManager = notificationManager2;
        this.eventTracker = eventTracker2;
        this.configurationGetter = getter;
        this.appToAppNotificationProvider = appToAppNotificationProvider2;
        this.postInstallNotificationProvider = postInstallNotificationProvider2;
        this.legacyPostInstallNotificationProvider = legacyPostInstallNotificationProvider2;
    }
}
