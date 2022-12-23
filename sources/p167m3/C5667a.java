package p167m3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.appsflyer.ServerParameters;
import p081f3.C4656h;
import p218q3.C6165a;

/* renamed from: m3.a */
public final class C5667a extends C5669c<Boolean> {
    static {
        C4656h.m11961e("BatteryChrgTracker");
    }

    public C5667a(Context context, C6165a aVar) {
        super(context, aVar);
    }

    /* renamed from: a */
    public final Object mo21514a() {
        int intExtra;
        Intent registerReceiver = this.f18440b.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            C4656h.m11960c().mo20177b(new Throwable[0]);
            return null;
        }
        if (Build.VERSION.SDK_INT < 23 ? registerReceiver.getIntExtra("plugged", 0) != 0 : (intExtra = registerReceiver.getIntExtra(ServerParameters.STATUS, -1)) == 2 || intExtra == 5) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: e */
    public final IntentFilter mo21515e() {
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004c, code lost:
        if (r6.equals("android.intent.action.ACTION_POWER_DISCONNECTED") == false) goto L_0x004e;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21516f(android.content.Intent r6) {
        /*
            r5 = this;
            java.lang.String r6 = r6.getAction()
            if (r6 != 0) goto L_0x0007
            return
        L_0x0007:
            f3.h r0 = p081f3.C4656h.m11960c()
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r6
            java.lang.String r4 = "Received %s"
            java.lang.String.format(r4, r2)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r3]
            r0.mo20176a(r2)
            int r0 = r6.hashCode()
            r2 = 3
            r4 = 2
            switch(r0) {
                case -1886648615: goto L_0x0046;
                case -54942926: goto L_0x003b;
                case 948344062: goto L_0x0030;
                case 1019184907: goto L_0x0025;
                default: goto L_0x0024;
            }
        L_0x0024:
            goto L_0x004e
        L_0x0025:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x002e
            goto L_0x004e
        L_0x002e:
            r3 = 3
            goto L_0x004f
        L_0x0030:
            java.lang.String r0 = "android.os.action.CHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0039
            goto L_0x004e
        L_0x0039:
            r3 = 2
            goto L_0x004f
        L_0x003b:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0044
            goto L_0x004e
        L_0x0044:
            r3 = 1
            goto L_0x004f
        L_0x0046:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x004f
        L_0x004e:
            r3 = -1
        L_0x004f:
            if (r3 == 0) goto L_0x006a
            if (r3 == r1) goto L_0x0064
            if (r3 == r4) goto L_0x005e
            if (r3 == r2) goto L_0x0058
            goto L_0x006f
        L_0x0058:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.mo21520b(r6)
            goto L_0x006f
        L_0x005e:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.mo21520b(r6)
            goto L_0x006f
        L_0x0064:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.mo21520b(r6)
            goto L_0x006f
        L_0x006a:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.mo21520b(r6)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p167m3.C5667a.mo21516f(android.content.Intent):void");
    }
}
