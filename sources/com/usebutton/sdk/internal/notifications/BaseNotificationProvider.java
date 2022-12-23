package com.usebutton.sdk.internal.notifications;

import android.app.Notification;
import android.content.Intent;
import com.usebutton.sdk.C12238R;

abstract class BaseNotificationProvider<T> {
    public static final int NOTIFICATION_CHANNEL_ID = C12238R.string.btn_notification_channel_id;
    public static final int NOTIFICATION_CHANNEL_NAME = C12238R.string.btn_notification_channel_title;

    public interface NotificationProviderListener {
        void onNotificationReady(NotificationType notificationType, Notification notification);
    }

    public enum NotificationType {
        APP_TO_APP_NOTIFICATION(1986),
        POST_INSTALL_NOTIFICATION(2637);
        
        private final int notificationId;

        private NotificationType(int i) {
            this.notificationId = i;
        }

        public int getNotificationId() {
            return this.notificationId;
        }
    }

    public abstract void displayNotification(Intent intent, T t, NotificationProviderListener notificationProviderListener);
}
