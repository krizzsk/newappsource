package fg0;

import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import mf0.C24362h;
import og0.C24598m;
import ug0.C25065b;
import ug0.C25069e;

/* renamed from: fg0.n */
public final class C23369n extends C23359e implements C24598m {

    /* renamed from: b */
    public final Enum<?> f59150b;

    public C23369n(C25069e eVar, Enum<?> enumR) {
        super(eVar);
        this.f59150b = enumR;
    }

    /* renamed from: c */
    public final C25065b mo58500c() {
        Class<?> cls = this.f59150b.getClass();
        if (!cls.isEnum()) {
            cls = cls.getEnclosingClass();
        }
        C24362h.m61210e(cls, "enumClass");
        return ReflectClassUtilKt.m58949a(cls);
    }

    /* renamed from: d */
    public final C25069e mo58501d() {
        return C25069e.m62820i(this.f59150b.name());
    }
}
