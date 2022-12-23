package com.moovit.view.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewWithEmptyView extends RecyclerView {

    /* renamed from: X0 */
    public static final /* synthetic */ int f24153X0 = 0;

    /* renamed from: V0 */
    public View f24154V0;

    /* renamed from: W0 */
    public final C7973a f24155W0 = new C7973a();

    /* renamed from: com.moovit.view.recyclerview.RecyclerViewWithEmptyView$a */
    public class C7973a extends RecyclerView.C1125g {
        public C7973a() {
        }

        /* renamed from: a */
        public final void mo4765a() {
            RecyclerViewWithEmptyView recyclerViewWithEmptyView = RecyclerViewWithEmptyView.this;
            int i = RecyclerViewWithEmptyView.f24153X0;
            recyclerViewWithEmptyView.mo24878m0();
        }

        /* renamed from: d */
        public final void mo4768d(int i, int i2) {
            RecyclerViewWithEmptyView recyclerViewWithEmptyView = RecyclerViewWithEmptyView.this;
            int i3 = RecyclerViewWithEmptyView.f24153X0;
            recyclerViewWithEmptyView.mo24878m0();
        }

        /* renamed from: f */
        public final void mo4770f(int i, int i2) {
            RecyclerViewWithEmptyView recyclerViewWithEmptyView = RecyclerViewWithEmptyView.this;
            int i3 = RecyclerViewWithEmptyView.f24153X0;
            recyclerViewWithEmptyView.mo24878m0();
        }
    }

    public RecyclerViewWithEmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: m0 */
    public final void mo24878m0() {
        boolean z;
        int i;
        if (this.f24154V0 != null && getAdapter() != null) {
            int i2 = 0;
            if (getAdapter().getItemCount() == 0) {
                z = true;
            } else {
                z = false;
            }
            View view = this.f24154V0;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            if (z) {
                i2 = 8;
            }
            setVisibility(i2);
        }
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = getAdapter();
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.f24155W0);
        }
        super.setAdapter(adapter);
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.f24155W0);
        }
        mo24878m0();
    }

    public void setEmptyView(View view) {
        this.f24154V0 = view;
        mo24878m0();
    }

    public RecyclerViewWithEmptyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
