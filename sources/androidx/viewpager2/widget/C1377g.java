package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.viewpager2.widget.g */
public final class C1377g implements RecyclerView.C1139n {
    /* renamed from: a */
    public final void mo4908a(View view) {
    }

    /* renamed from: c */
    public final void mo4909c(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (layoutParams.width != -1 || layoutParams.height != -1) {
            throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
        }
    }
}
