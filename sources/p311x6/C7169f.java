package p311x6;

import p221q6.C6199p;
import p584jl.C17885a;

/* renamed from: x6.f */
public final class C7169f implements C7170g<Object> {

    /* renamed from: a */
    public volatile Object f22253a;

    /* renamed from: b */
    public final /* synthetic */ C7170g f22254b;

    public C7169f(C6199p.C6200a aVar) {
        this.f22254b = aVar;
    }

    public final Object get() {
        if (this.f22253a == null) {
            synchronized (this) {
                if (this.f22253a == null) {
                    Object obj = this.f22254b.get();
                    C17885a.m44458r(obj);
                    this.f22253a = obj;
                }
            }
        }
        return this.f22253a;
    }
}
