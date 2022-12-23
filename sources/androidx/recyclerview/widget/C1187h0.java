package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* renamed from: androidx.recyclerview.widget.h0 */
public abstract class C1187h0 extends RecyclerView.C1140o {

    /* renamed from: a */
    public RecyclerView f4503a;

    /* renamed from: b */
    public final C1188a f4504b = new C1188a();

    /* renamed from: androidx.recyclerview.widget.h0$a */
    public class C1188a extends RecyclerView.C1142q {

        /* renamed from: a */
        public boolean f4505a = false;

        public C1188a() {
        }

        /* renamed from: a */
        public final void mo4913a(int i, RecyclerView recyclerView) {
            if (i == 0 && this.f4505a) {
                this.f4505a = false;
                C1187h0.this.mo5073d();
            }
        }

        /* renamed from: b */
        public final void mo4914b(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.f4505a = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo5072a(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f4503a;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                C1188a aVar = this.f4504b;
                ArrayList arrayList = recyclerView2.f4292x0;
                if (arrayList != null) {
                    arrayList.remove(aVar);
                }
                this.f4503a.setOnFlingListener((RecyclerView.C1140o) null);
            }
            this.f4503a = recyclerView;
            if (recyclerView == null) {
                return;
            }
            if (recyclerView.getOnFlingListener() == null) {
                this.f4503a.mo4615h(this.f4504b);
                this.f4503a.setOnFlingListener(this);
                new Scroller(this.f4503a.getContext(), new DecelerateInterpolator());
                mo5073d();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    /* renamed from: b */
    public abstract int[] mo5015b(RecyclerView.C1134m mVar, View view);

    /* renamed from: c */
    public abstract View mo5016c(RecyclerView.C1134m mVar);

    /* renamed from: d */
    public final void mo5073d() {
        RecyclerView.C1134m layoutManager;
        View c;
        RecyclerView recyclerView = this.f4503a;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null && (c = mo5016c(layoutManager)) != null) {
            int[] b = mo5015b(layoutManager, c);
            int i = b[0];
            if (i != 0 || b[1] != 0) {
                this.f4503a.mo4594g0(i, b[1], false);
            }
        }
    }
}
