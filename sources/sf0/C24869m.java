package sf0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.KTypeImpl;
import mf0.C24362h;

/* renamed from: sf0.m */
public final class C24869m {

    /* renamed from: c */
    public static final C24869m f62860c = new C24869m((KVariance) null, (KTypeImpl) null);

    /* renamed from: a */
    public final KVariance f62861a;

    /* renamed from: b */
    public final C24867k f62862b;

    /* renamed from: sf0.m$a */
    public /* synthetic */ class C24870a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f62863a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                kotlin.reflect.KVariance[] r0 = kotlin.reflect.KVariance.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.INVARIANT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.IN     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.OUT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f62863a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sf0.C24869m.C24870a.<clinit>():void");
        }
    }

    public C24869m(KVariance kVariance, KTypeImpl kTypeImpl) {
        boolean z;
        boolean z2;
        String str;
        this.f62861a = kVariance;
        this.f62862b = kTypeImpl;
        boolean z3 = false;
        if (kVariance == null) {
            z = true;
        } else {
            z = false;
        }
        if (kTypeImpl == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z == z2 ? true : z3)) {
            if (kVariance == null) {
                str = "Star projection must have no type specified.";
            } else {
                str = "The projection variance " + kVariance + " requires type to be specified.";
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24869m)) {
            return false;
        }
        C24869m mVar = (C24869m) obj;
        return this.f62861a == mVar.f62861a && C24362h.m61206a(this.f62862b, mVar.f62862b);
    }

    public final int hashCode() {
        KVariance kVariance = this.f62861a;
        int i = 0;
        int hashCode = (kVariance == null ? 0 : kVariance.hashCode()) * 31;
        C24867k kVar = this.f62862b;
        if (kVar != null) {
            i = kVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        int i;
        KVariance kVariance = this.f62861a;
        if (kVariance == null) {
            i = -1;
        } else {
            i = C24870a.f62863a[kVariance.ordinal()];
        }
        if (i == -1) {
            return "*";
        }
        if (i == 1) {
            return String.valueOf(this.f62862b);
        }
        if (i == 2) {
            StringBuilder k = C13555b.m33972k("in ");
            k.append(this.f62862b);
            return k.toString();
        } else if (i == 3) {
            StringBuilder k2 = C13555b.m33972k("out ");
            k2.append(this.f62862b);
            return k2.toString();
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
