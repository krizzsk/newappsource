package aa0;

import android.os.Handler;
import android.os.Looper;
import ce0.C21100e;
import p054d0.C4268a1;

/* renamed from: aa0.l */
public abstract class C7540l {

    /* renamed from: a */
    public final C4268a1 f23017a;

    /* renamed from: b */
    public final Handler f23018b;

    /* renamed from: c */
    public final long f23019c;

    public C7540l() {
        this(new Handler(Looper.getMainLooper()), 20000);
    }

    /* renamed from: a */
    public abstract void mo19433a();

    /* renamed from: b */
    public void mo21414b() {
    }

    /* renamed from: c */
    public final void mo23802c() {
        this.f23018b.removeCallbacks(this.f23017a);
        this.f23018b.postDelayed(this.f23017a, this.f23019c);
    }

    /* renamed from: d */
    public final void mo23803d() {
        this.f23018b.removeCallbacks(this.f23017a);
        mo21414b();
    }

    /* renamed from: e */
    public final void mo23804e() {
        this.f23018b.removeCallbacks(this.f23017a);
        this.f23018b.post(this.f23017a);
    }

    public C7540l(long j) {
        this(new Handler(Looper.getMainLooper()), j);
    }

    public C7540l(Handler handler, long j) {
        this.f23017a = new C4268a1(this, 17);
        this.f23018b = handler;
        C21100e.m49367u(j, "refreshInterval");
        this.f23019c = j;
    }
}
