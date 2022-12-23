package w70;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import n70.C18535a;
import n70.C18536b;
import p977zz.C20927a0;

/* renamed from: w70.b */
public final class C13212b implements C13216f {
    /* renamed from: a */
    public final void mo40086a(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        C18536b.m45451a().getClass();
        for (C18535a aVar : C18536b.m45452b(context)) {
            Intent i = aVar.mo49254i();
            i.putExtra("stop_reason", 1);
            PendingIntent broadcast = PendingIntent.getBroadcast(aVar.f47186a, 0, i, C20927a0.m49010e(268435456));
            if (broadcast != null) {
                alarmManager.cancel(broadcast);
            }
        }
    }
}
