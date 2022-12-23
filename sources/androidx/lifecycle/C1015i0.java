package androidx.lifecycle;

import p227r.C6227a;

/* renamed from: androidx.lifecycle.i0 */
public final class C1015i0 implements C1044w<Object> {

    /* renamed from: a */
    public final /* synthetic */ C1040t f3945a;

    /* renamed from: b */
    public final /* synthetic */ C6227a f3946b;

    public C1015i0(C1040t tVar, C6227a aVar) {
        this.f3945a = tVar;
        this.f3946b = aVar;
    }

    public final void onChanged(Object obj) {
        this.f3945a.setValue(this.f3946b.apply(obj));
    }
}
