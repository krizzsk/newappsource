package p741pz;

import aa0.C7537i;
import ce0.C21100e;
import p669mz.C18487d;

/* renamed from: pz.d */
public class C19045d<T> extends C19042a<Object> {

    /* renamed from: a */
    public final C19043b<Object> f48436a;

    /* renamed from: b */
    public final int f48437b;

    /* renamed from: c */
    public C18487d<T> f48438c = null;

    public C19045d(C7537i iVar, int i) {
        this.f48436a = iVar;
        C21100e.m49365t(i, "maxItemCount");
        this.f48437b = i;
    }

    /* renamed from: c */
    public final boolean mo51500c() {
        return this.f48436a.mo51500c();
    }

    /* renamed from: d */
    public final boolean mo51501d() {
        boolean d = this.f48436a.mo51501d();
        C19043b bVar = this.f48436a;
        bVar.mo51499b();
        this.f48438c = new C18487d<>(bVar.f48432b, this.f48437b);
        return d;
    }

    /* renamed from: e */
    public final boolean mo51502e() {
        return this.f48436a.mo51502e();
    }
}
