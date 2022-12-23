package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p623lc.C18179a;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {

    /* renamed from: a */
    public int f35712a = 0;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    public class C14216a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: b */
        public final /* synthetic */ View f35713b;

        /* renamed from: c */
        public final /* synthetic */ int f35714c;

        /* renamed from: d */
        public final /* synthetic */ C18179a f35715d;

        public C14216a(View view, int i, C18179a aVar) {
            this.f35713b = view;
            this.f35714c = i;
            this.f35715d = aVar;
        }

        public final boolean onPreDraw() {
            this.f35713b.getViewTreeObserver().removeOnPreDrawListener(this);
            ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
            if (expandableBehavior.f35712a == this.f35714c) {
                C18179a aVar = this.f35715d;
                expandableBehavior.mo42673a((View) aVar, this.f35713b, aVar.mo41645a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    /* renamed from: a */
    public abstract void mo42673a(View view, View view2, boolean z, boolean z2);

    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    public final boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        boolean z;
        int i;
        C18179a aVar = (C18179a) view2;
        int i2 = 2;
        if (!aVar.mo41645a() ? this.f35712a != 1 : !((i = this.f35712a) == 0 || i == 2)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        if (aVar.mo41645a()) {
            i2 = 1;
        }
        this.f35712a = i2;
        mo42673a((View) aVar, view, aVar.mo41645a(), true);
        return true;
    }

    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        C18179a aVar;
        boolean z;
        int i2;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (!C6333d0.C6340g.m15076c(view)) {
            ArrayList q = coordinatorLayout.mo3296q(view);
            int size = q.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = (View) q.get(i3);
                if (layoutDependsOn(coordinatorLayout, view, view2)) {
                    aVar = (C18179a) view2;
                    break;
                }
                i3++;
            }
            if (aVar != null) {
                int i4 = 2;
                if (!aVar.mo41645a() ? this.f35712a != 1 : !((i2 = this.f35712a) == 0 || i2 == 2)) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    if (aVar.mo41645a()) {
                        i4 = 1;
                    }
                    this.f35712a = i4;
                    view.getViewTreeObserver().addOnPreDrawListener(new C14216a(view, i4, aVar));
                }
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
