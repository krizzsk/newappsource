package p330z2;

import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;

@SuppressLint({"ViewConstructor"})
/* renamed from: z2.e */
public final class C7427e extends FrameLayout {

    /* renamed from: d */
    public static final /* synthetic */ int f22820d = 0;

    /* renamed from: b */
    public ViewGroup f22821b;

    /* renamed from: c */
    public boolean f22822c = true;

    public C7427e(ViewGroup viewGroup) {
        super(viewGroup.getContext());
        setClipChildren(false);
        this.f22821b = viewGroup;
        viewGroup.setTag(C7434j.ghost_view_holder, this);
        this.f22821b.getOverlay().add(this);
    }

    /* renamed from: a */
    public static void m17073a(View view, ArrayList<View> arrayList) {
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            m17073a((View) parent, arrayList);
        }
        arrayList.add(view);
    }

    public final void onViewAdded(View view) {
        if (this.f22822c) {
            super.onViewAdded(view);
            return;
        }
        throw new IllegalStateException("This GhostViewHolder is detached!");
    }

    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if ((getChildCount() == 1 && getChildAt(0) == view) || getChildCount() == 0) {
            this.f22821b.setTag(C7434j.ghost_view_holder, (Object) null);
            this.f22821b.getOverlay().remove(this);
            this.f22822c = false;
        }
    }
}
