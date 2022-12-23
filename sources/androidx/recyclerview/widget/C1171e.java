package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import p358af.C13437d;

/* renamed from: androidx.recyclerview.widget.e */
public final class C1171e {

    /* renamed from: a */
    public final C1173b f4449a;

    /* renamed from: b */
    public final C1172a f4450b = new C1172a();

    /* renamed from: c */
    public final ArrayList f4451c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.e$a */
    public static class C1172a {

        /* renamed from: a */
        public long f4452a = 0;

        /* renamed from: b */
        public C1172a f4453b;

        /* renamed from: a */
        public final void mo5041a(int i) {
            if (i >= 64) {
                C1172a aVar = this.f4453b;
                if (aVar != null) {
                    aVar.mo5041a(i - 64);
                    return;
                }
                return;
            }
            this.f4452a &= ~(1 << i);
        }

        /* renamed from: b */
        public final int mo5042b(int i) {
            C1172a aVar = this.f4453b;
            if (aVar == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f4452a);
                }
                return Long.bitCount(this.f4452a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f4452a & ((1 << i) - 1));
            } else {
                return Long.bitCount(this.f4452a) + aVar.mo5042b(i - 64);
            }
        }

        /* renamed from: c */
        public final void mo5043c() {
            if (this.f4453b == null) {
                this.f4453b = new C1172a();
            }
        }

        /* renamed from: d */
        public final boolean mo5044d(int i) {
            if (i >= 64) {
                mo5043c();
                return this.f4453b.mo5044d(i - 64);
            } else if ((this.f4452a & (1 << i)) != 0) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: e */
        public final void mo5045e(int i, boolean z) {
            boolean z2;
            if (i >= 64) {
                mo5043c();
                this.f4453b.mo5045e(i - 64, z);
                return;
            }
            long j = this.f4452a;
            if ((Long.MIN_VALUE & j) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            long j2 = (1 << i) - 1;
            this.f4452a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                mo5048h(i);
            } else {
                mo5041a(i);
            }
            if (z2 || this.f4453b != null) {
                mo5043c();
                this.f4453b.mo5045e(0, z2);
            }
        }

        /* renamed from: f */
        public final boolean mo5046f(int i) {
            boolean z;
            if (i >= 64) {
                mo5043c();
                return this.f4453b.mo5046f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f4452a;
            if ((j2 & j) != 0) {
                z = true;
            } else {
                z = false;
            }
            long j3 = j2 & (~j);
            this.f4452a = j3;
            long j4 = j - 1;
            this.f4452a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            C1172a aVar = this.f4453b;
            if (aVar != null) {
                if (aVar.mo5044d(0)) {
                    mo5048h(63);
                }
                this.f4453b.mo5046f(0);
            }
            return z;
        }

        /* renamed from: g */
        public final void mo5047g() {
            this.f4452a = 0;
            C1172a aVar = this.f4453b;
            if (aVar != null) {
                aVar.mo5047g();
            }
        }

        /* renamed from: h */
        public final void mo5048h(int i) {
            if (i >= 64) {
                mo5043c();
                this.f4453b.mo5048h(i - 64);
                return;
            }
            this.f4452a |= 1 << i;
        }

        public final String toString() {
            if (this.f4453b == null) {
                return Long.toBinaryString(this.f4452a);
            }
            return this.f4453b.toString() + "xx" + Long.toBinaryString(this.f4452a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.e$b */
    public interface C1173b {
    }

    public C1171e(C1168c0 c0Var) {
        this.f4449a = c0Var;
    }

    /* renamed from: a */
    public final void mo5027a(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = ((C1168c0) this.f4449a).mo5019a();
        } else {
            i2 = mo5032f(i);
        }
        this.f4450b.mo5045e(i2, z);
        if (z) {
            mo5035i(view);
        }
        C1168c0 c0Var = (C1168c0) this.f4449a;
        c0Var.f4442a.addView(view, i2);
        RecyclerView recyclerView = c0Var.f4442a;
        recyclerView.getClass();
        RecyclerView.C1119a0 K = RecyclerView.m3001K(view);
        RecyclerView.Adapter adapter = recyclerView.f4269m;
        if (!(adapter == null || K == null)) {
            adapter.onViewAttachedToWindow(K);
        }
        ArrayList arrayList = recyclerView.f4227D;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((RecyclerView.C1139n) recyclerView.f4227D.get(size)).mo4909c(view);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo5028b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = ((C1168c0) this.f4449a).mo5019a();
        } else {
            i2 = mo5032f(i);
        }
        this.f4450b.mo5045e(i2, z);
        if (z) {
            mo5035i(view);
        }
        C1168c0 c0Var = (C1168c0) this.f4449a;
        c0Var.getClass();
        RecyclerView.C1119a0 K = RecyclerView.m3001K(view);
        if (K != null) {
            if (K.isTmpDetached() || K.shouldIgnore()) {
                K.clearTmpDetachFlag();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(K);
                throw new IllegalArgumentException(C13437d.m33704i(c0Var.f4442a, sb));
            }
        }
        c0Var.f4442a.attachViewToParent(view, i2, layoutParams);
    }

    /* renamed from: c */
    public final void mo5029c(int i) {
        RecyclerView.C1119a0 K;
        int f = mo5032f(i);
        this.f4450b.mo5046f(f);
        C1168c0 c0Var = (C1168c0) this.f4449a;
        View childAt = c0Var.f4442a.getChildAt(f);
        if (!(childAt == null || (K = RecyclerView.m3001K(childAt)) == null)) {
            if (!K.isTmpDetached() || K.shouldIgnore()) {
                K.addFlags(256);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("called detach on an already detached child ");
                sb.append(K);
                throw new IllegalArgumentException(C13437d.m33704i(c0Var.f4442a, sb));
            }
        }
        c0Var.f4442a.detachViewFromParent(f);
    }

    /* renamed from: d */
    public final View mo5030d(int i) {
        return ((C1168c0) this.f4449a).f4442a.getChildAt(mo5032f(i));
    }

    /* renamed from: e */
    public final int mo5031e() {
        return ((C1168c0) this.f4449a).mo5019a() - this.f4451c.size();
    }

    /* renamed from: f */
    public final int mo5032f(int i) {
        if (i < 0) {
            return -1;
        }
        int a = ((C1168c0) this.f4449a).mo5019a();
        int i2 = i;
        while (i2 < a) {
            int b = i - (i2 - this.f4450b.mo5042b(i2));
            if (b == 0) {
                while (this.f4450b.mo5044d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    /* renamed from: g */
    public final View mo5033g(int i) {
        return ((C1168c0) this.f4449a).f4442a.getChildAt(i);
    }

    /* renamed from: h */
    public final int mo5034h() {
        return ((C1168c0) this.f4449a).mo5019a();
    }

    /* renamed from: i */
    public final void mo5035i(View view) {
        this.f4451c.add(view);
        C1168c0 c0Var = (C1168c0) this.f4449a;
        c0Var.getClass();
        RecyclerView.C1119a0 K = RecyclerView.m3001K(view);
        if (K != null) {
            K.onEnteredHiddenState(c0Var.f4442a);
        }
    }

    /* renamed from: j */
    public final int mo5036j(View view) {
        int indexOfChild = ((C1168c0) this.f4449a).f4442a.indexOfChild(view);
        if (indexOfChild != -1 && !this.f4450b.mo5044d(indexOfChild)) {
            return indexOfChild - this.f4450b.mo5042b(indexOfChild);
        }
        return -1;
    }

    /* renamed from: k */
    public final boolean mo5037k(View view) {
        return this.f4451c.contains(view);
    }

    /* renamed from: l */
    public final void mo5038l(int i) {
        int f = mo5032f(i);
        View childAt = ((C1168c0) this.f4449a).f4442a.getChildAt(f);
        if (childAt != null) {
            if (this.f4450b.mo5046f(f)) {
                mo5039m(childAt);
            }
            ((C1168c0) this.f4449a).mo5020b(f);
        }
    }

    /* renamed from: m */
    public final void mo5039m(View view) {
        if (this.f4451c.remove(view)) {
            C1168c0 c0Var = (C1168c0) this.f4449a;
            c0Var.getClass();
            RecyclerView.C1119a0 K = RecyclerView.m3001K(view);
            if (K != null) {
                K.onLeftHiddenState(c0Var.f4442a);
            }
        }
    }

    public final String toString() {
        return this.f4450b.toString() + ", hidden list:" + this.f4451c.size();
    }
}
