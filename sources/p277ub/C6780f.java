package p277ub;

import android.util.SparseBooleanArray;
import p583jk.C17875h;

/* renamed from: ub.f */
public final class C6780f {

    /* renamed from: a */
    public final SparseBooleanArray f20978a;

    /* renamed from: ub.f$a */
    public static final class C6781a {

        /* renamed from: a */
        public final SparseBooleanArray f20979a = new SparseBooleanArray();

        /* renamed from: b */
        public boolean f20980b;

        /* renamed from: a */
        public final void mo22953a(int i) {
            C17875h.m44304o(!this.f20980b);
            this.f20979a.append(i, true);
        }

        /* renamed from: b */
        public final C6780f mo22954b() {
            C17875h.m44304o(!this.f20980b);
            this.f20980b = true;
            return new C6780f(this.f20979a);
        }
    }

    public C6780f(SparseBooleanArray sparseBooleanArray) {
        this.f20978a = sparseBooleanArray;
    }

    /* renamed from: a */
    public final int mo22949a(int i) {
        C17875h.m44303n(i, mo22950b());
        return this.f20978a.keyAt(i);
    }

    /* renamed from: b */
    public final int mo22950b() {
        return this.f20978a.size();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6780f)) {
            return false;
        }
        return this.f20978a.equals(((C6780f) obj).f20978a);
    }

    public final int hashCode() {
        return this.f20978a.hashCode();
    }
}
