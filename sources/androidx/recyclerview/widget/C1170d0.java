package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.C1160a;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.d0 */
public final class C1170d0 implements C1160a.C1161a {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f4448a;

    public C1170d0(RecyclerView recyclerView) {
        this.f4448a = recyclerView;
    }

    /* renamed from: a */
    public final void mo5022a(C1160a.C1162b bVar) {
        int i = bVar.f4429a;
        if (i == 1) {
            RecyclerView recyclerView = this.f4448a;
            recyclerView.f4271n.onItemsAdded(recyclerView, bVar.f4430b, bVar.f4432d);
        } else if (i == 2) {
            RecyclerView recyclerView2 = this.f4448a;
            recyclerView2.f4271n.onItemsRemoved(recyclerView2, bVar.f4430b, bVar.f4432d);
        } else if (i == 4) {
            RecyclerView recyclerView3 = this.f4448a;
            recyclerView3.f4271n.onItemsUpdated(recyclerView3, bVar.f4430b, bVar.f4432d, bVar.f4431c);
        } else if (i == 8) {
            RecyclerView recyclerView4 = this.f4448a;
            recyclerView4.f4271n.onItemsMoved(recyclerView4, bVar.f4430b, bVar.f4432d, 1);
        }
    }

    /* renamed from: b */
    public final RecyclerView.C1119a0 mo5023b(int i) {
        RecyclerView recyclerView = this.f4448a;
        int h = recyclerView.f4261f.mo5034h();
        int i2 = 0;
        RecyclerView.C1119a0 a0Var = null;
        while (true) {
            if (i2 >= h) {
                break;
            }
            RecyclerView.C1119a0 K = RecyclerView.m3001K(recyclerView.f4261f.mo5033g(i2));
            if (K != null && !K.isRemoved() && K.mPosition == i) {
                if (!recyclerView.f4261f.mo5037k(K.itemView)) {
                    a0Var = K;
                    break;
                }
                a0Var = K;
            }
            i2++;
        }
        if (a0Var != null && !this.f4448a.f4261f.mo5037k(a0Var.itemView)) {
            return a0Var;
        }
        return null;
    }

    /* renamed from: c */
    public final void mo5024c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.f4448a;
        int h = recyclerView.f4261f.mo5034h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < h; i6++) {
            View g = recyclerView.f4261f.mo5033g(i6);
            RecyclerView.C1119a0 K = RecyclerView.m3001K(g);
            if (K != null && !K.shouldIgnore() && (i4 = K.mPosition) >= i && i4 < i5) {
                K.addFlags(2);
                K.addChangePayload(obj);
                ((RecyclerView.LayoutParams) g.getLayoutParams()).f4299d = true;
            }
        }
        RecyclerView.C1145s sVar = recyclerView.f4258c;
        int size = sVar.f4329c.size();
        while (true) {
            size--;
            if (size >= 0) {
                RecyclerView.C1119a0 a0Var = sVar.f4329c.get(size);
                if (a0Var != null && (i3 = a0Var.mPosition) >= i && i3 < i5) {
                    a0Var.addFlags(2);
                    sVar.mo4921f(size);
                }
            } else {
                this.f4448a.f4296z0 = true;
                return;
            }
        }
    }

    /* renamed from: d */
    public final void mo5025d(int i, int i2) {
        RecyclerView recyclerView = this.f4448a;
        int h = recyclerView.f4261f.mo5034h();
        for (int i3 = 0; i3 < h; i3++) {
            RecyclerView.C1119a0 K = RecyclerView.m3001K(recyclerView.f4261f.mo5033g(i3));
            if (K != null && !K.shouldIgnore() && K.mPosition >= i) {
                K.offsetPosition(i2, false);
                recyclerView.f4288v0.f4354f = true;
            }
        }
        RecyclerView.C1145s sVar = recyclerView.f4258c;
        int size = sVar.f4329c.size();
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView.C1119a0 a0Var = sVar.f4329c.get(i4);
            if (a0Var != null && a0Var.mPosition >= i) {
                a0Var.offsetPosition(i2, false);
            }
        }
        recyclerView.requestLayout();
        this.f4448a.f4294y0 = true;
    }

    /* renamed from: e */
    public final void mo5026e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.f4448a;
        int h = recyclerView.f4261f.mo5034h();
        int i11 = -1;
        if (i < i2) {
            i5 = i;
            i4 = i2;
            i3 = -1;
        } else {
            i4 = i;
            i5 = i2;
            i3 = 1;
        }
        for (int i12 = 0; i12 < h; i12++) {
            RecyclerView.C1119a0 K = RecyclerView.m3001K(recyclerView.f4261f.mo5033g(i12));
            if (K != null && (i9 = K.mPosition) >= i5 && i9 <= i4) {
                if (i9 == i) {
                    K.offsetPosition(i2 - i, false);
                } else {
                    K.offsetPosition(i3, false);
                }
                recyclerView.f4288v0.f4354f = true;
            }
        }
        RecyclerView.C1145s sVar = recyclerView.f4258c;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i11 = 1;
        }
        int size = sVar.f4329c.size();
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView.C1119a0 a0Var = sVar.f4329c.get(i13);
            if (a0Var != null && (i8 = a0Var.mPosition) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    a0Var.offsetPosition(i2 - i, false);
                } else {
                    a0Var.offsetPosition(i11, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.f4448a.f4294y0 = true;
    }
}
