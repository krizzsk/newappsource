package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a */
    public C13894i f34220a;

    /* renamed from: b */
    public int f34221b = 0;

    public ViewOffsetBehavior() {
    }

    /* renamed from: a */
    public final int mo40972a() {
        C13894i iVar = this.f34220a;
        if (iVar != null) {
            return iVar.f34238d;
        }
        return 0;
    }

    /* renamed from: b */
    public void mo40961b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.mo3309w(i, v);
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo40961b(coordinatorLayout, v, i);
        if (this.f34220a == null) {
            this.f34220a = new C13894i(v);
        }
        C13894i iVar = this.f34220a;
        iVar.f34236b = iVar.f34235a.getTop();
        iVar.f34237c = iVar.f34235a.getLeft();
        this.f34220a.mo40976a();
        int i2 = this.f34221b;
        if (i2 == 0) {
            return true;
        }
        this.f34220a.mo40977b(i2);
        this.f34221b = 0;
        return true;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
