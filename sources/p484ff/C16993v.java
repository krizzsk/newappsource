package p484ff;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: ff.v */
public final /* synthetic */ class C16993v implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Context f44108b;

    /* renamed from: c */
    public final /* synthetic */ boolean f44109c;

    /* renamed from: d */
    public final /* synthetic */ TaskCompletionSource f44110d;

    public /* synthetic */ C16993v(Context context, boolean z, TaskCompletionSource taskCompletionSource) {
        this.f44108b = context;
        this.f44109c = z;
        this.f44110d = taskCompletionSource;
    }

    public final void run() {
        boolean z;
        Context context = this.f44108b;
        boolean z2 = this.f44109c;
        TaskCompletionSource taskCompletionSource = this.f44110d;
        try {
            if (Binder.getCallingUid() == context.getApplicationInfo().uid) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                context.getPackageName();
            } else {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    applicationContext = context;
                }
                SharedPreferences.Editor edit = applicationContext.getSharedPreferences("com.google.firebase.messaging", 0).edit();
                edit.putBoolean("proxy_notification_initialized", true);
                edit.apply();
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (z2) {
                    notificationManager.setNotificationDelegate("com.google.android.gms");
                } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                    notificationManager.setNotificationDelegate((String) null);
                }
            }
        } finally {
            taskCompletionSource.trySetResult(null);
        }
    }
}
