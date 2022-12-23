package tf0;

import bf0.C21050d;
import kotlin.reflect.jvm.internal.C23854b;
import kotlin.reflect.jvm.internal.C23856c;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.KMutableProperty0Impl;
import kotlin.reflect.jvm.internal.KMutableProperty1Impl;
import kotlin.reflect.jvm.internal.KProperty0Impl;
import kotlin.reflect.jvm.internal.KProperty1Impl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.C23899b;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import mf0.C24362h;
import zf0.C25429a0;
import zf0.C25431b0;
import zf0.C25432c;
import zf0.C25433c0;
import zf0.C25446h0;
import zf0.C25447i;
import zf0.C25448i0;
import zf0.C25452k0;
import zf0.C25485t;
import zf0.C25486u;
import zf0.C25489x;
import zf0.C25491z;

/* renamed from: tf0.a */
public class C24961a implements C25447i<KCallableImpl<?>, C21050d> {

    /* renamed from: a */
    public final KDeclarationContainerImpl f63095a;

    public C24961a(KDeclarationContainerImpl kDeclarationContainerImpl) {
        C24362h.m61211f(kDeclarationContainerImpl, "container");
        this.f63095a = kDeclarationContainerImpl;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ KCallableImpl<?> mo60150a(C25446h0 h0Var, C21050d dVar) {
        return null;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ KCallableImpl<?> mo60151b(C25486u uVar, C21050d dVar) {
        return null;
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ KCallableImpl<?> mo60152c(C25448i0 i0Var, C21050d dVar) {
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [kotlin.reflect.jvm.internal.KCallableImpl<?>, java.lang.Object] */
    /* renamed from: d */
    public final KCallableImpl<?> mo60153d(C25429a0 a0Var, C21050d dVar) {
        return mo60160k(a0Var, dVar);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [kotlin.reflect.jvm.internal.KCallableImpl<?>, java.lang.Object] */
    /* renamed from: e */
    public final KCallableImpl<?> mo60154e(C25431b0 b0Var, C21050d dVar) {
        return mo60160k(b0Var, dVar);
    }

    /* renamed from: f */
    public final /* bridge */ /* synthetic */ KCallableImpl<?> mo60155f(C25432c cVar, C21050d dVar) {
        return null;
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ KCallableImpl<?> mo60156g(C25452k0 k0Var, C21050d dVar) {
        return null;
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ KCallableImpl<?> mo60157h(C25485t tVar, C21050d dVar) {
        return null;
    }

    /* renamed from: i */
    public final /* bridge */ /* synthetic */ KCallableImpl<?> mo60158i(C25489x xVar, C21050d dVar) {
        return null;
    }

    /* renamed from: j */
    public final Object mo60159j(C25491z zVar, Object obj) {
        int i;
        C24362h.m61211f(zVar, "descriptor");
        C24362h.m61211f((C21050d) obj, "data");
        int i2 = 0;
        if (zVar.mo53422O() == null) {
            i = 0;
        } else {
            i = 1;
        }
        if (zVar.mo53423R() != null) {
            i2 = 1;
        }
        int i3 = i + i2;
        if (zVar.mo53526Q()) {
            if (i3 == 0) {
                return new KMutableProperty0Impl(this.f63095a, zVar);
            }
            if (i3 == 1) {
                return new KMutableProperty1Impl(this.f63095a, zVar);
            }
            if (i3 == 2) {
                return new C23854b(this.f63095a, zVar);
            }
        } else if (i3 == 0) {
            return new KProperty0Impl(this.f63095a, zVar);
        } else {
            if (i3 == 1) {
                return new KProperty1Impl(this.f63095a, zVar);
            }
            if (i3 == 2) {
                return new C23856c(this.f63095a, zVar);
            }
        }
        throw new KotlinReflectionInternalError(C24362h.m61216k(zVar, "Unsupported property: "));
    }

    /* renamed from: k */
    public final Object mo60160k(C23900c cVar, Object obj) {
        C24362h.m61211f(cVar, "descriptor");
        C24362h.m61211f((C21050d) obj, "data");
        return new KFunctionImpl(this.f63095a, cVar);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [kotlin.reflect.jvm.internal.KCallableImpl<?>, java.lang.Object] */
    /* renamed from: l */
    public KCallableImpl<?> mo60161l(C23899b bVar, C21050d dVar) {
        return mo60160k(bVar, dVar);
    }

    /* renamed from: m */
    public final /* bridge */ /* synthetic */ KCallableImpl<?> mo60162m(C25433c0 c0Var, C21050d dVar) {
        return null;
    }
}
