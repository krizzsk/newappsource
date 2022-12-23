package p011aa;

import java.util.concurrent.Executor;
import p028ba.C1519m;
import p041ca.C1815d;
import p063da.C4407a;
import p288v9.C6877d;
import p313x9.C7180b;
import ye0.C25292a;

/* renamed from: aa.c */
public final class C0139c implements C7180b<C0138b> {

    /* renamed from: a */
    public final C25292a<Executor> f403a;

    /* renamed from: b */
    public final C25292a<C6877d> f404b;

    /* renamed from: c */
    public final C25292a<C1519m> f405c;

    /* renamed from: d */
    public final C25292a<C1815d> f406d;

    /* renamed from: e */
    public final C25292a<C4407a> f407e;

    public C0139c(C25292a aVar, C25292a aVar2, C0143g gVar, C25292a aVar3, C25292a aVar4) {
        this.f403a = aVar;
        this.f404b = aVar2;
        this.f405c = gVar;
        this.f406d = aVar3;
        this.f407e = aVar4;
    }

    public final Object get() {
        return new C0138b(this.f403a.get(), this.f404b.get(), this.f405c.get(), this.f406d.get(), this.f407e.get());
    }
}
