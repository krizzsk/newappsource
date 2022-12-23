package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p081f3.C4656h;

public abstract class ConstraintProxy extends BroadcastReceiver {

    /* renamed from: a */
    public static final /* synthetic */ int f5174a = 0;

    public static class BatteryChargingProxy extends ConstraintProxy {
    }

    public static class BatteryNotLowProxy extends ConstraintProxy {
    }

    public static class NetworkStateProxy extends ConstraintProxy {
    }

    public static class StorageNotLowProxy extends ConstraintProxy {
    }

    static {
        C4656h.m11961e("ConstraintProxy");
    }

    public final void onReceive(Context context, Intent intent) {
        C4656h c = C4656h.m11960c();
        String.format("onReceive : %s", new Object[]{intent});
        c.mo20176a(new Throwable[0]);
        int i = C1402a.f5181e;
        Intent intent2 = new Intent(context, SystemAlarmService.class);
        intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
        context.startService(intent2);
    }
}
