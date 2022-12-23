package p067e1;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* renamed from: e1.g */
public final class C4486g {
    /* renamed from: a */
    public static void m11708a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        alarmManager.setAndAllowWhileIdle(i, j, pendingIntent);
    }

    /* renamed from: b */
    public static void m11709b(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
        alarmManager.setExactAndAllowWhileIdle(i, j, pendingIntent);
    }
}
