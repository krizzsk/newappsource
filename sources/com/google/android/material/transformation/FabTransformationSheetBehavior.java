package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.transformation.FabTransformationBehavior;
import java.util.HashMap;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p355ac.C13400a;
import p380bc.C13583g;
import p583jk.C17875h;

@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: i */
    public HashMap f35733i;

    public FabTransformationSheetBehavior() {
    }

    /* renamed from: a */
    public final void mo42673a(View view, View view2, boolean z, boolean z2) {
        boolean z3;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z) {
                this.f35733i = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (!(childAt.getLayoutParams() instanceof CoordinatorLayout.C0752e) || !(((CoordinatorLayout.C0752e) childAt.getLayoutParams()).f3269a instanceof FabTransformationScrimBehavior)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (childAt != view2 && !z3) {
                    if (!z) {
                        HashMap hashMap = this.f35733i;
                        if (hashMap != null && hashMap.containsKey(childAt)) {
                            int intValue = ((Integer) this.f35733i.get(childAt)).intValue();
                            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                            C6333d0.C6337d.m15059s(childAt, intValue);
                        }
                    } else {
                        this.f35733i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap<View, C6382p0> weakHashMap2 = C6333d0.f19990a;
                        C6333d0.C6337d.m15059s(childAt, 4);
                    }
                }
            }
            if (!z) {
                this.f35733i = null;
            }
        }
        super.mo42673a(view, view2, z, z2);
    }

    /* renamed from: h */
    public final FabTransformationBehavior.C14218b mo42679h(Context context, boolean z) {
        int i;
        if (z) {
            i = C13400a.mtrl_fab_transformation_sheet_expand_spec;
        } else {
            i = C13400a.mtrl_fab_transformation_sheet_collapse_spec;
        }
        FabTransformationBehavior.C14218b bVar = new FabTransformationBehavior.C14218b();
        bVar.f35727a = C13583g.m33997b(i, context);
        bVar.f35728b = new C17875h();
        return bVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
