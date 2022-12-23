package p118i3;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C1402a;
import com.moovit.database.sqlite.SQLiteDatabase;
import p081f3.C4656h;
import p092g3.C4763k;
import p192o3.C5937d;
import p192o3.C5939f;
import p192o3.C5941g;
import p192o3.C5943i;
import p205p3.C6041f;

/* renamed from: i3.a */
public final class C5263a {

    /* renamed from: a */
    public static final /* synthetic */ int f17393a = 0;

    static {
        C4656h.m11961e("Alarms");
    }

    /* renamed from: a */
    public static void m13283a(Context context, int i, String str) {
        int i2;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent a = C1402a.m3753a(context, str);
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = 603979776;
        } else {
            i2 = SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
        }
        PendingIntent service = PendingIntent.getService(context, i, a, i2);
        if (service != null && alarmManager != null) {
            C4656h c = C4656h.m11960c();
            String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[]{str, Integer.valueOf(i)});
            c.mo20176a(new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    /* renamed from: b */
    public static void m13284b(Context context, C4763k kVar, String str, long j) {
        int i;
        WorkDatabase workDatabase = kVar.f16072c;
        C5943i iVar = (C5943i) workDatabase.mo5698n();
        C5941g a = iVar.mo21929a(str);
        if (a != null) {
            m13283a(context, a.f19067b, str);
            m13285c(context, str, a.f19067b, j);
            return;
        }
        synchronized (C6041f.class) {
            workDatabase.mo5187c();
            try {
                Long a2 = ((C5939f) workDatabase.mo5697m()).mo21925a("next_alarm_manager_id");
                int i2 = 0;
                if (a2 != null) {
                    i = a2.intValue();
                } else {
                    i = 0;
                }
                if (i != Integer.MAX_VALUE) {
                    i2 = i + 1;
                }
                ((C5939f) workDatabase.mo5697m()).mo21926b(new C5937d("next_alarm_manager_id", (long) i2));
                workDatabase.mo5194j();
            } finally {
                workDatabase.mo5191g();
            }
        }
        iVar.mo21930b(new C5941g(str, i));
        m13285c(context, str, i, j);
    }

    /* renamed from: c */
    public static void m13285c(Context context, String str, int i, long j) {
        int i2;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (Build.VERSION.SDK_INT >= 23) {
            i2 = 201326592;
        } else {
            i2 = 134217728;
        }
        PendingIntent service = PendingIntent.getService(context, i, C1402a.m3753a(context, str), i2);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
