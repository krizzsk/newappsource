package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C1190i0;
import androidx.recyclerview.widget.C1206l0;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.v */
public final class C1242v {

    /* renamed from: a */
    public final C1217m0 f4691a;

    /* renamed from: b */
    public final C1190i0.C1197d f4692b;

    /* renamed from: c */
    public final RecyclerView.Adapter<RecyclerView.C1119a0> f4693c;

    /* renamed from: d */
    public final C1244b f4694d;

    /* renamed from: e */
    public int f4695e;

    /* renamed from: f */
    public C1243a f4696f = new C1243a();

    /* renamed from: androidx.recyclerview.widget.v$a */
    public class C1243a extends RecyclerView.C1125g {
        public C1243a() {
        }

        /* renamed from: a */
        public final void mo4765a() {
            C1242v vVar = C1242v.this;
            vVar.f4695e = vVar.f4693c.getItemCount();
            C1176f fVar = (C1176f) C1242v.this.f4694d;
            fVar.f4458a.notifyDataSetChanged();
            fVar.mo5054a();
        }

        /* renamed from: b */
        public final void mo4766b(int i, int i2) {
            C1242v vVar = C1242v.this;
            C1176f fVar = (C1176f) vVar.f4694d;
            fVar.f4458a.notifyItemRangeChanged(i + fVar.mo5055b(vVar), i2, (Object) null);
        }

        /* renamed from: c */
        public final void mo4767c(int i, int i2, Object obj) {
            C1242v vVar = C1242v.this;
            C1176f fVar = (C1176f) vVar.f4694d;
            fVar.f4458a.notifyItemRangeChanged(i + fVar.mo5055b(vVar), i2, obj);
        }

        /* renamed from: d */
        public final void mo4768d(int i, int i2) {
            C1242v vVar = C1242v.this;
            vVar.f4695e += i2;
            C1176f fVar = (C1176f) vVar.f4694d;
            fVar.f4458a.notifyItemRangeInserted(i + fVar.mo5055b(vVar), i2);
            C1242v vVar2 = C1242v.this;
            if (vVar2.f4695e > 0 && vVar2.f4693c.getStateRestorationPolicy() == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                ((C1176f) C1242v.this.f4694d).mo5054a();
            }
        }

        /* renamed from: e */
        public final void mo4769e(int i, int i2) {
            C1242v vVar = C1242v.this;
            C1176f fVar = (C1176f) vVar.f4694d;
            int b = fVar.mo5055b(vVar);
            fVar.f4458a.notifyItemMoved(i + b, i2 + b);
        }

        /* renamed from: f */
        public final void mo4770f(int i, int i2) {
            C1242v vVar = C1242v.this;
            vVar.f4695e -= i2;
            C1176f fVar = (C1176f) vVar.f4694d;
            fVar.f4458a.notifyItemRangeRemoved(i + fVar.mo5055b(vVar), i2);
            C1242v vVar2 = C1242v.this;
            if (vVar2.f4695e < 1 && vVar2.f4693c.getStateRestorationPolicy() == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                ((C1176f) C1242v.this.f4694d).mo5054a();
            }
        }

        /* renamed from: g */
        public final void mo4771g() {
            ((C1176f) C1242v.this.f4694d).mo5054a();
        }
    }

    /* renamed from: androidx.recyclerview.widget.v$b */
    public interface C1244b {
    }

    public C1242v(RecyclerView.Adapter adapter, C1176f fVar, C1206l0 l0Var, C1190i0.C1197d dVar) {
        this.f4693c = adapter;
        this.f4694d = fVar;
        l0Var.getClass();
        this.f4691a = new C1206l0.C1207a(this);
        this.f4692b = dVar;
        this.f4695e = adapter.getItemCount();
        adapter.registerAdapterDataObserver(this.f4696f);
    }
}
