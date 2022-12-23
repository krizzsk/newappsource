package com.github.clans.fab;

import android.animation.AnimatorSet;
import android.view.View;

/* renamed from: com.github.clans.fab.d */
public final class C3807d implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ FloatingActionMenu f13240b;

    public C3807d(FloatingActionMenu floatingActionMenu) {
        this.f13240b = floatingActionMenu;
    }

    public final void onClick(View view) {
        boolean z;
        FloatingActionMenu floatingActionMenu = this.f13240b;
        boolean z2 = floatingActionMenu.f13161M;
        boolean z3 = floatingActionMenu.f13179k;
        if (z3) {
            floatingActionMenu.mo15614a(z2);
        } else if (!z3) {
            int i = 0;
            if (floatingActionMenu.f13191q0 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                floatingActionMenu.f13187o0.start();
            }
            if (floatingActionMenu.f13168T) {
                AnimatorSet animatorSet = floatingActionMenu.f13172d;
                if (animatorSet != null) {
                    animatorSet.start();
                } else {
                    floatingActionMenu.f13171c.cancel();
                    floatingActionMenu.f13170b.start();
                }
            }
            floatingActionMenu.f13180l = true;
            int i2 = 0;
            for (int childCount = floatingActionMenu.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = floatingActionMenu.getChildAt(childCount);
                if ((childAt instanceof FloatingActionButton) && childAt.getVisibility() != 8) {
                    i++;
                    floatingActionMenu.f13182m.postDelayed(new C3808e(floatingActionMenu, (FloatingActionButton) childAt, z2), (long) i2);
                    i2 += floatingActionMenu.f13158J;
                }
            }
            floatingActionMenu.f13182m.postDelayed(new C3809f(floatingActionMenu), (long) ((i + 1) * floatingActionMenu.f13158J));
        }
    }
}
