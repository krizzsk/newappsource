package z10;

import c00.C13721e;
import ce0.C21100e;
import p060d6.C4393i;
import p060d6.C4397l;

/* renamed from: z10.f */
public final class C20802f<T, Z> implements C4397l<Z>, C4393i {

    /* renamed from: b */
    public final C4397l<T> f52498b;

    /* renamed from: c */
    public final Class<Z> f52499c;

    /* renamed from: d */
    public final C13721e<T, Z, RuntimeException> f52500d;

    public C20802f(C4397l<T> lVar, Class<Z> cls, C13721e<T, Z, RuntimeException> eVar) {
        this.f52498b = lVar;
        this.f52499c = cls;
        C21100e.m49373x(eVar, "converter");
        this.f52500d = eVar;
    }

    /* renamed from: a */
    public final void mo10979a() {
        this.f52498b.mo10979a();
    }

    /* renamed from: b */
    public final Class<Z> mo10980b() {
        return this.f52499c;
    }

    /* renamed from: e */
    public final int mo10983e() {
        return this.f52498b.mo10983e();
    }

    public final Z get() {
        return this.f52500d.convert(this.f52498b.get());
    }

    public final void initialize() {
        C4397l<T> lVar = this.f52498b;
        if (lVar instanceof C4393i) {
            ((C4393i) lVar).initialize();
        }
    }
}
