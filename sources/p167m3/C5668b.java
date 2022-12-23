package p167m3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.appsflyer.ServerParameters;
import p081f3.C4656h;
import p218q3.C6165a;

/* renamed from: m3.b */
public final class C5668b extends C5669c<Boolean> {
    static {
        C4656h.m11961e("BatteryNotLowTracker");
    }

    public C5668b(Context context, C6165a aVar) {
        super(context, aVar);
    }

    /* renamed from: a */
    public final Object mo21514a() {
        Intent registerReceiver = this.f18440b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            C4656h.m11960c().mo20177b(new Throwable[0]);
            return null;
        }
        int intExtra = registerReceiver.getIntExtra(ServerParameters.STATUS, -1);
        float intExtra2 = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
        if (intExtra == 1 || intExtra2 > 0.15f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: e */
    public final IntentFilter mo21515e() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    /* renamed from: f */
    public final void mo21516f(Intent intent) {
        if (intent.getAction() != null) {
            C4656h c = C4656h.m11960c();
            String.format("Received %s", new Object[]{intent.getAction()});
            c.mo20176a(new Throwable[0]);
            String action = intent.getAction();
            action.getClass();
            if (action.equals("android.intent.action.BATTERY_OKAY")) {
                mo21520b(Boolean.TRUE);
            } else if (action.equals("android.intent.action.BATTERY_LOW")) {
                mo21520b(Boolean.FALSE);
            }
        }
    }
}
