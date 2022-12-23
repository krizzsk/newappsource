package p060d6;

import p322y6.C7333a;
import p322y6.C7341d;

/* renamed from: d6.k */
public final class C4395k<Z> implements C4397l<Z>, C7333a.C7337d {

    /* renamed from: f */
    public static final C7333a.C7336c f15437f = C7333a.m16961a(20, new C4396a());

    /* renamed from: b */
    public final C7341d.C7342a f15438b = new C7341d.C7342a();

    /* renamed from: c */
    public C4397l<Z> f15439c;

    /* renamed from: d */
    public boolean f15440d;

    /* renamed from: e */
    public boolean f15441e;

    /* renamed from: d6.k$a */
    public class C4396a implements C7333a.C7335b<C4395k<?>> {
        public final Object create() {
            return new C4395k();
        }
    }

    /* renamed from: a */
    public final synchronized void mo10979a() {
        this.f15438b.mo23560a();
        this.f15441e = true;
        if (!this.f15440d) {
            this.f15439c.mo10979a();
            this.f15439c = null;
            f15437f.mo22236a(this);
        }
    }

    /* renamed from: b */
    public final Class<Z> mo10980b() {
        return this.f15439c.mo10980b();
    }

    /* renamed from: c */
    public final synchronized void mo19910c() {
        this.f15438b.mo23560a();
        if (this.f15440d) {
            this.f15440d = false;
            if (this.f15441e) {
                mo10979a();
            }
        } else {
            throw new IllegalStateException("Already unlocked");
        }
    }

    /* renamed from: e */
    public final int mo10983e() {
        return this.f15439c.mo10983e();
    }

    /* renamed from: f */
    public final C7341d.C7342a mo10927f() {
        return this.f15438b;
    }

    public final Z get() {
        return this.f15439c.get();
    }
}
