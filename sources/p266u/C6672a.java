package p266u;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import androidx.browser.trusted.TrustedWebActivityService;

/* renamed from: u.a */
public final class C6672a {
    /* renamed from: a */
    public static Notification m15752a(TrustedWebActivityService trustedWebActivityService, NotificationManager notificationManager, Notification notification, String str, String str2) {
        notificationManager.createNotificationChannel(new NotificationChannel(str, str2, 3));
        if (notificationManager.getNotificationChannel(str).getImportance() == 0) {
            return null;
        }
        Notification.Builder recoverBuilder = Notification.Builder.recoverBuilder(trustedWebActivityService, notification);
        recoverBuilder.setChannelId(str);
        return recoverBuilder.build();
    }

    /* renamed from: b */
    public static boolean m15753b(NotificationManager notificationManager, String str) {
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str);
        if (notificationChannel == null || notificationChannel.getImportance() != 0) {
            return true;
        }
        return false;
    }
}
