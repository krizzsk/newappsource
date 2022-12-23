package f30;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import com.appsflyer.ServerParameters;
import p358af.C13437d;
import p977zz.C20943i;

/* renamed from: f30.a */
public final class C4674a {

    /* renamed from: a */
    public final boolean f15912a;

    /* renamed from: b */
    public final int f15913b;

    /* renamed from: c */
    public final float f15914c;

    /* renamed from: d */
    public final int f15915d;

    /* renamed from: e */
    public final int f15916e;

    /* renamed from: f */
    public final int f15917f;

    /* renamed from: g */
    public final int f15918g;

    /* renamed from: h */
    public final int f15919h;

    /* renamed from: i */
    public final int f15920i;

    public C4674a(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra(ServerParameters.STATUS, -1);
            this.f15912a = (intExtra == 2 || intExtra == 5) ? true : z;
            this.f15913b = registerReceiver.getIntExtra("plugged", -1);
            this.f15914c = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
            this.f15915d = registerReceiver.getIntExtra("voltage", -1);
        } else {
            this.f15912a = false;
            this.f15913b = -1;
            this.f15914c = -1.0f;
            this.f15915d = -1;
        }
        if (C20943i.m49051d(21)) {
            BatteryManager batteryManager = (BatteryManager) context.getSystemService("batterymanager");
            this.f15916e = batteryManager.getIntProperty(4);
            this.f15917f = batteryManager.getIntProperty(1);
            this.f15918g = batteryManager.getIntProperty(3);
            this.f15919h = batteryManager.getIntProperty(2);
            this.f15920i = batteryManager.getIntProperty(5);
            return;
        }
        this.f15916e = -1;
        this.f15917f = -1;
        this.f15918g = -1;
        this.f15919h = -1;
        this.f15920i = -1;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("BatteryMetrics: [");
        k.append(this.f15912a);
        k.append(", ");
        k.append(this.f15913b);
        k.append(", ");
        k.append(this.f15914c);
        k.append(", ");
        k.append(this.f15915d);
        k.append(", ");
        k.append(this.f15916e);
        k.append(", ");
        k.append(this.f15917f);
        k.append(", ");
        k.append(this.f15918g);
        k.append(", ");
        k.append(this.f15919h);
        k.append(", ");
        return C13437d.m33707l(k, this.f15920i, "]");
    }
}
