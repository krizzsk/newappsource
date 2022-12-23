package i00;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import ce0.C21100e;

/* renamed from: i00.g */
public final class C17528g implements LayoutTransition.TransitionListener {

    /* renamed from: a */
    public final ViewGroup f45113a;

    public C17528g(ViewGroup viewGroup) {
        C21100e.m49373x(viewGroup, "viewGroup");
        this.f45113a = viewGroup;
    }

    public final void endTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
    }

    public final void startTransition(LayoutTransition layoutTransition, ViewGroup viewGroup, View view, int i) {
        if (i == 3 || i == 2) {
            int childCount = this.f45113a.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f45113a.getChildAt(i2);
                if (!(childAt == view || childAt.getVisibility() == 8 || !(childAt instanceof C17527f))) {
                    ((C17527f) childAt).mo49978a();
                }
            }
        }
    }
}
