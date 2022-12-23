package kotlin;

import bf0.C21049c;
import lf0.C24225a;
import mf0.C24362h;

/* renamed from: kotlin.a */
public class C23812a {

    /* renamed from: kotlin.a$a */
    public /* synthetic */ class C23813a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f60172a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                kotlin.LazyThreadSafetyMode[] r0 = kotlin.LazyThreadSafetyMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.SYNCHRONIZED     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.PUBLICATION     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kotlin.LazyThreadSafetyMode r1 = kotlin.LazyThreadSafetyMode.NONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f60172a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C23812a.C23813a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static final <T> C21049c<T> m58431a(LazyThreadSafetyMode lazyThreadSafetyMode, C24225a<? extends T> aVar) {
        C24362h.m61211f(lazyThreadSafetyMode, "mode");
        C24362h.m61211f(aVar, "initializer");
        int i = C23813a.f60172a[lazyThreadSafetyMode.ordinal()];
        if (i == 1) {
            return new SynchronizedLazyImpl(aVar);
        }
        if (i == 2) {
            return new SafePublicationLazyImpl(aVar);
        }
        if (i == 3) {
            return new UnsafeLazyImpl(aVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public static final <T> C21049c<T> m58432b(C24225a<? extends T> aVar) {
        C24362h.m61211f(aVar, "initializer");
        return new SynchronizedLazyImpl(aVar);
    }
}
