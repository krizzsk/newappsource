package mobi.lab.veriff.util;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import com.veriff.sdk.internal.C21616ex;
import com.veriff.sdk.internal.C21895jw;
import com.veriff.sdk.internal.C22661wm;
import com.veriff.sdk.internal.C22696xo;
import com.veriff.sdk.views.upload.UploadActivity;
import java.util.concurrent.atomic.AtomicInteger;
import mobi.lab.veriff.C24418a;
import mobi.lab.veriff.R$string;
import mobi.lab.veriff.data.C24426d;
import p067e1.C4522y;

/* renamed from: mobi.lab.veriff.util.k */
public class C24466k {

    /* renamed from: a */
    private static final AtomicInteger f61927a = new AtomicInteger(1);

    /* renamed from: a */
    public static Notification m61552a(Context context, C24426d dVar, C21895jw jwVar, C22661wm wmVar, String str, C21616ex exVar, C22696xo xoVar) {
        PendingIntent activity = PendingIntent.getActivity(context, m61551a(), UploadActivity.f58388l.mo57968a(context, dVar, jwVar, wmVar, str), 134217728);
        C4522y yVar = new C4522y(context, m61553a(context));
        yVar.mo20031c(exVar.mo54698ap());
        yVar.f15626g = activity;
        yVar.f15636q = xoVar.mo57094i();
        yVar.f15629j = 1;
        if (!jwVar.mo55640c().mo55457i() || xoVar.mo57104s() != C24418a.f61784c) {
            yVar.f15644y.icon = xoVar.mo57104s();
        }
        if (Build.VERSION.SDK_INT < 24) {
            yVar.mo20032d(context.getString(R$string.vrff_app_name));
        }
        return yVar.mo20030a();
    }

    /* renamed from: a */
    private static String m61553a(Context context) {
        String string = context.getString(R$string.vrff_notification_channel_id_background_services);
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = new NotificationChannel(string, string, 0);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
        return string;
    }

    /* renamed from: a */
    private static int m61551a() {
        return f61927a.incrementAndGet();
    }
}
