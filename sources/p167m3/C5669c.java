package p167m3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p081f3.C4656h;
import p218q3.C6165a;

/* renamed from: m3.c */
public abstract class C5669c<T> extends C5671d<T> {

    /* renamed from: g */
    public final C5670a f18436g = new C5670a();

    /* renamed from: m3.c$a */
    public class C5670a extends BroadcastReceiver {
        public C5670a() {
        }

        public final void onReceive(Context context, Intent intent) {
            if (intent != null) {
                C5669c.this.mo21516f(intent);
            }
        }
    }

    static {
        C4656h.m11961e("BrdcstRcvrCnstrntTrckr");
    }

    public C5669c(Context context, C6165a aVar) {
        super(context, aVar);
    }

    /* renamed from: c */
    public final void mo21517c() {
        C4656h c = C4656h.m11960c();
        String.format("%s: registering receiver", new Object[]{getClass().getSimpleName()});
        c.mo20176a(new Throwable[0]);
        this.f18440b.registerReceiver(this.f18436g, mo21515e());
    }

    /* renamed from: d */
    public final void mo21518d() {
        C4656h c = C4656h.m11960c();
        String.format("%s: unregistering receiver", new Object[]{getClass().getSimpleName()});
        c.mo20176a(new Throwable[0]);
        this.f18440b.unregisterReceiver(this.f18436g);
    }

    /* renamed from: e */
    public abstract IntentFilter mo21515e();

    /* renamed from: f */
    public abstract void mo21516f(Intent intent);
}
