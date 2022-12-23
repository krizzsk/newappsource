package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.b */
public final class C1164b implements C1241u {

    /* renamed from: a */
    public final RecyclerView.Adapter f4434a;

    public C1164b(RecyclerView.Adapter adapter) {
        this.f4434a = adapter;
    }

    /* renamed from: a */
    public final void mo5011a(int i, int i2) {
        this.f4434a.notifyItemRangeInserted(i, i2);
    }

    /* renamed from: b */
    public final void mo5012b(int i, int i2) {
        this.f4434a.notifyItemRangeRemoved(i, i2);
    }

    /* renamed from: c */
    public final void mo5013c(int i, int i2, Object obj) {
        this.f4434a.notifyItemRangeChanged(i, i2, obj);
    }

    /* renamed from: d */
    public final void mo5014d(int i, int i2) {
        this.f4434a.notifyItemMoved(i, i2);
    }
}
