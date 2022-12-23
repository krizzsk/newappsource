package androidx.viewpager2.adapter;

import android.view.View;
import android.widget.FrameLayout;

/* renamed from: androidx.viewpager2.adapter.a */
public final class C1348a implements View.OnLayoutChangeListener {

    /* renamed from: b */
    public final /* synthetic */ FrameLayout f5055b;

    /* renamed from: c */
    public final /* synthetic */ C1353f f5056c;

    /* renamed from: d */
    public final /* synthetic */ FragmentStateAdapter f5057d;

    public C1348a(FragmentStateAdapter fragmentStateAdapter, FrameLayout frameLayout, C1353f fVar) {
        this.f5057d = fragmentStateAdapter;
        this.f5055b = frameLayout;
        this.f5056c = fVar;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f5055b.getParent() != null) {
            this.f5055b.removeOnLayoutChangeListener(this);
            this.f5057d.mo5598o(this.f5056c);
        }
    }
}
