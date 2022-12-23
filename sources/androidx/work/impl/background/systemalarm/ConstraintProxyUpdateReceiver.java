package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import p081f3.C4656h;
import p092g3.C4763k;
import p205p3.C6042g;
import p218q3.C6166b;

public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a */
    public static final /* synthetic */ int f5175a = 0;

    /* renamed from: androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$a */
    public class C1401a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ Intent f5176b;

        /* renamed from: c */
        public final /* synthetic */ Context f5177c;

        /* renamed from: d */
        public final /* synthetic */ BroadcastReceiver.PendingResult f5178d;

        public C1401a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f5176b = intent;
            this.f5177c = context;
            this.f5178d = pendingResult;
        }

        public final void run() {
            try {
                boolean booleanExtra = this.f5176b.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f5176b.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f5176b.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f5176b.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                C4656h c = C4656h.m11960c();
                int i = ConstraintProxyUpdateReceiver.f5175a;
                String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", new Object[]{Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)});
                c.mo20176a(new Throwable[0]);
                C6042g.m14529a(this.f5177c, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                C6042g.m14529a(this.f5177c, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                C6042g.m14529a(this.f5177c, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                C6042g.m14529a(this.f5177c, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f5178d.finish();
            }
        }
    }

    static {
        C4656h.m11961e("ConstrntProxyUpdtRecvr");
    }

    public final void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            C4656h c = C4656h.m11960c();
            String.format("Ignoring unknown action %s", new Object[]{str});
            c.mo20176a(new Throwable[0]);
            return;
        }
        BroadcastReceiver.PendingResult goAsync = goAsync();
        ((C6166b) C4763k.m12079g(context).f16073d).mo22153a(new C1401a(intent, context, goAsync));
    }
}
