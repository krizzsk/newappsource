package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import p081f3.C4656h;
import p092g3.C4763k;

public class RescheduleReceiver extends BroadcastReceiver {
    static {
        C4656h.m11961e("RescheduleReceiver");
    }

    public final void onReceive(Context context, Intent intent) {
        C4656h c = C4656h.m11960c();
        String.format("Received intent %s", new Object[]{intent});
        c.mo20176a(new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                C4763k g = C4763k.m12079g(context);
                BroadcastReceiver.PendingResult goAsync = goAsync();
                g.getClass();
                synchronized (C4763k.f16069l) {
                    g.f16078i = goAsync;
                    if (g.f16077h) {
                        goAsync.finish();
                        g.f16078i = null;
                    }
                }
            } catch (IllegalStateException e) {
                C4656h.m11960c().mo20177b(e);
            }
        } else {
            int i = C1402a.f5181e;
            Intent intent2 = new Intent(context, SystemAlarmService.class);
            intent2.setAction("ACTION_RESCHEDULE");
            context.startService(intent2);
        }
    }
}
