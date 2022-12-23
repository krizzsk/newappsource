package androidx.camera.core.impl;

import java.util.Set;
import p032c0.C1754d;

public interface Config {

    public enum OptionPriority {
        ALWAYS_OVERRIDE,
        REQUIRED,
        OPTIONAL
    }

    /* renamed from: androidx.camera.core.impl.Config$a */
    public static abstract class C0564a<T> {
        /* renamed from: a */
        public static C0572a m1591a(Class cls, String str) {
            return new C0572a(str, cls, (Object) null);
        }

        /* renamed from: b */
        public abstract String mo2447b();

        /* renamed from: c */
        public abstract Object mo2448c();

        /* renamed from: d */
        public abstract Class<T> mo2449d();
    }

    /* renamed from: a */
    <ValueT> ValueT mo2422a(C0564a<ValueT> aVar);

    /* renamed from: b */
    <ValueT> ValueT mo2423b(C0564a<ValueT> aVar, ValueT valuet);

    /* renamed from: c */
    OptionPriority mo2424c(C0564a<?> aVar);

    /* renamed from: e */
    boolean mo2425e(C0564a<?> aVar);

    /* renamed from: f */
    <ValueT> ValueT mo2426f(C0564a<ValueT> aVar, OptionPriority optionPriority);

    /* renamed from: h */
    Set<OptionPriority> mo2429h(C0564a<?> aVar);

    /* renamed from: l */
    void mo2430l(C1754d dVar);

    Set<C0564a<?>> listOptions();
}
