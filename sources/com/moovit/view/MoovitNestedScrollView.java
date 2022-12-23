package com.moovit.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;
import p435de.C16596f;

public class MoovitNestedScrollView extends NestedScrollView {
    public MoovitNestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: y */
    public static void m18036y(int i, View view) {
        if (i <= 20) {
            C16596f a = C16596f.m42113a();
            StringBuilder r = C25541a.m63887r("NSV: i:", i, " c:");
            r.append(view.getClass().getName());
            a.mo49363b(r.toString());
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                m18036y(i + 1, (View) parent);
            }
        }
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        View findFocus = findFocus();
        if (findFocus != null) {
            m18036y(0, findFocus);
        } else {
            C16596f.m42113a().mo49363b("NestedScrollView:onSizeChanged - currentFocus class: null");
        }
        super.onSizeChanged(i, i2, i3, i4);
    }

    public MoovitNestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
