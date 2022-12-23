package rh0;

import lf0.C24236l;
import rh0.C24814b;

/* renamed from: rh0.a */
public final class C24813a extends C24814b.C24815a<Object, Boolean> {

    /* renamed from: a */
    public final /* synthetic */ C24236l f62756a;

    /* renamed from: b */
    public final /* synthetic */ boolean[] f62757b;

    public C24813a(C24236l lVar, boolean[] zArr) {
        this.f62756a = lVar;
        this.f62757b = zArr;
    }

    /* renamed from: a */
    public final Object mo53186a() {
        return Boolean.valueOf(this.f62757b[0]);
    }

    /* renamed from: c */
    public final boolean mo53188c(Object obj) {
        if (((Boolean) this.f62756a.invoke(obj)).booleanValue()) {
            this.f62757b[0] = true;
        }
        return !this.f62757b[0];
    }
}
