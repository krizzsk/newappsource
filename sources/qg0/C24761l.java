package qg0;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageFragment;
import mf0.C24362h;
import p845um.C19958a;
import zf0.C25435d0;

/* renamed from: qg0.l */
public final class C24761l implements C25435d0 {

    /* renamed from: b */
    public final LazyJavaPackageFragment f62661b;

    public C24761l(LazyJavaPackageFragment lazyJavaPackageFragment) {
        C24362h.m61211f(lazyJavaPackageFragment, "packageFragment");
        this.f62661b = lazyJavaPackageFragment;
    }

    /* renamed from: b */
    public final void mo58414b() {
    }

    public final String toString() {
        return this.f62661b + ": " + ((Map) C19958a.m47435j(this.f62661b.f60667j, LazyJavaPackageFragment.f60664n[0])).keySet();
    }
}
