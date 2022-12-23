package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.C1171e;

/* renamed from: androidx.recyclerview.widget.c0 */
public final class C1168c0 implements C1171e.C1173b {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f4442a;

    public C1168c0(RecyclerView recyclerView) {
        this.f4442a = recyclerView;
    }

    /* renamed from: a */
    public final int mo5019a() {
        return this.f4442a.getChildCount();
    }

    /* renamed from: b */
    public final void mo5020b(int i) {
        View childAt = this.f4442a.getChildAt(i);
        if (childAt != null) {
            this.f4442a.mo4630o(childAt);
            childAt.clearAnimation();
        }
        this.f4442a.removeViewAt(i);
    }
}
