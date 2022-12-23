package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.SolverVariable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p305x0.C7136g;
import p305x0.C7139j;

public final class ConstraintAnchor {

    /* renamed from: a */
    public HashSet<ConstraintAnchor> f2374a = null;

    /* renamed from: b */
    public int f2375b;

    /* renamed from: c */
    public boolean f2376c;

    /* renamed from: d */
    public final ConstraintWidget f2377d;

    /* renamed from: e */
    public final Type f2378e;

    /* renamed from: f */
    public ConstraintAnchor f2379f;

    /* renamed from: g */
    public int f2380g = 0;

    /* renamed from: h */
    public int f2381h = Integer.MIN_VALUE;

    /* renamed from: i */
    public SolverVariable f2382i;

    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    /* renamed from: androidx.constraintlayout.core.widgets.ConstraintAnchor$a */
    public static /* synthetic */ class C0685a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2383a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type[] r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2383a = r0
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2383a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2383a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2383a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f2383a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f2383a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BASELINE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f2383a     // Catch:{ NoSuchFieldError -> 0x0054 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f2383a     // Catch:{ NoSuchFieldError -> 0x0060 }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f2383a     // Catch:{ NoSuchFieldError -> 0x006c }
                androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.ConstraintAnchor.C0685a.<clinit>():void");
        }
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.f2377d = constraintWidget;
        this.f2378e = type;
    }

    /* renamed from: a */
    public final void mo2760a(ConstraintAnchor constraintAnchor, int i) {
        mo2761b(constraintAnchor, i, Integer.MIN_VALUE, false);
    }

    /* renamed from: b */
    public final boolean mo2761b(ConstraintAnchor constraintAnchor, int i, int i2, boolean z) {
        if (constraintAnchor == null) {
            mo2769j();
            return true;
        } else if (!z && !mo2768i(constraintAnchor)) {
            return false;
        } else {
            this.f2379f = constraintAnchor;
            if (constraintAnchor.f2374a == null) {
                constraintAnchor.f2374a = new HashSet<>();
            }
            HashSet<ConstraintAnchor> hashSet = this.f2379f.f2374a;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.f2380g = i;
            this.f2381h = i2;
            return true;
        }
    }

    /* renamed from: c */
    public final void mo2762c(int i, C7139j jVar, ArrayList arrayList) {
        HashSet<ConstraintAnchor> hashSet = this.f2374a;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                C7136g.m16691a(it.next().f2377d, i, arrayList, jVar);
            }
        }
    }

    /* renamed from: d */
    public final int mo2763d() {
        if (!this.f2376c) {
            return 0;
        }
        return this.f2375b;
    }

    /* renamed from: e */
    public final int mo2764e() {
        ConstraintAnchor constraintAnchor;
        if (this.f2377d.f2429j0 == 8) {
            return 0;
        }
        int i = this.f2381h;
        if (i == Integer.MIN_VALUE || (constraintAnchor = this.f2379f) == null || constraintAnchor.f2377d.f2429j0 != 8) {
            return this.f2380g;
        }
        return i;
    }

    /* renamed from: f */
    public final ConstraintAnchor mo2765f() {
        switch (C0685a.f2383a[this.f2378e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f2377d.f2396M;
            case 3:
                return this.f2377d.f2394K;
            case 4:
                return this.f2377d.f2397N;
            case 5:
                return this.f2377d.f2395L;
            default:
                throw new AssertionError(this.f2378e.name());
        }
    }

    /* renamed from: g */
    public final boolean mo2766g() {
        HashSet<ConstraintAnchor> hashSet = this.f2374a;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().mo2765f().mo2767h()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo2767h() {
        return this.f2379f != null;
    }

    /* renamed from: i */
    public final boolean mo2768i(ConstraintAnchor constraintAnchor) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (constraintAnchor == null) {
            return false;
        }
        Type type = constraintAnchor.f2378e;
        Type type2 = this.f2378e;
        if (type != type2) {
            switch (C0685a.f2383a[type2.ordinal()]) {
                case 1:
                    if (type == Type.BASELINE || type == Type.CENTER_X || type == Type.CENTER_Y) {
                        return false;
                    }
                    return true;
                case 2:
                case 3:
                    if (type == Type.LEFT || type == Type.RIGHT) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!(constraintAnchor.f2377d instanceof C0700f)) {
                        return z;
                    }
                    if (z || type == Type.CENTER_X) {
                        z3 = true;
                    }
                    return z3;
                case 4:
                case 5:
                    if (type == Type.TOP || type == Type.BOTTOM) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!(constraintAnchor.f2377d instanceof C0700f)) {
                        return z2;
                    }
                    if (z2 || type == Type.CENTER_Y) {
                        z3 = true;
                    }
                    return z3;
                case 6:
                    if (type == Type.LEFT || type == Type.RIGHT) {
                        return false;
                    }
                    return true;
                case 7:
                case 8:
                case 9:
                    return false;
                default:
                    throw new AssertionError(this.f2378e.name());
            }
        } else if (type2 != Type.BASELINE || (constraintAnchor.f2377d.f2389F && this.f2377d.f2389F)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: j */
    public final void mo2769j() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.f2379f;
        if (!(constraintAnchor == null || (hashSet = constraintAnchor.f2374a) == null)) {
            hashSet.remove(this);
            if (this.f2379f.f2374a.size() == 0) {
                this.f2379f.f2374a = null;
            }
        }
        this.f2374a = null;
        this.f2379f = null;
        this.f2380g = 0;
        this.f2381h = Integer.MIN_VALUE;
        this.f2376c = false;
        this.f2375b = 0;
    }

    /* renamed from: k */
    public final void mo2770k() {
        SolverVariable solverVariable = this.f2382i;
        if (solverVariable == null) {
            this.f2382i = new SolverVariable(SolverVariable.Type.UNRESTRICTED);
        } else {
            solverVariable.mo2710f();
        }
    }

    /* renamed from: l */
    public final void mo2771l(int i) {
        this.f2375b = i;
        this.f2376c = true;
    }

    public final String toString() {
        return this.f2377d.f2433l0 + ":" + this.f2378e.toString();
    }
}
