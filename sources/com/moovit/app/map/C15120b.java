package com.moovit.app.map;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: com.moovit.app.map.b */
public final /* synthetic */ class C15120b implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final /* synthetic */ View f38902b;

    /* renamed from: c */
    public final /* synthetic */ View f38903c;

    /* renamed from: d */
    public final /* synthetic */ ViewGroup f38904d;

    /* renamed from: e */
    public final /* synthetic */ BottomSheetBehavior f38905e;

    public /* synthetic */ C15120b(View view, View view2, ViewGroup viewGroup, BottomSheetBehavior bottomSheetBehavior) {
        this.f38902b = view;
        this.f38903c = view2;
        this.f38904d = viewGroup;
        this.f38905e = bottomSheetBehavior;
    }

    public final void onGlobalLayout() {
        int i;
        View view = this.f38902b;
        View view2 = this.f38903c;
        ViewGroup viewGroup = this.f38904d;
        BottomSheetBehavior bottomSheetBehavior = this.f38905e;
        int i2 = DocklessVehicleBottomSheetDialog.f38877w;
        int top = view.getTop();
        if (view2.getVisibility() == 0) {
            i = view2.getTop() + top;
        } else {
            i = viewGroup.getTop() + top;
            if (viewGroup.getChildCount() > 0) {
                i += viewGroup.getChildAt(0).getPaddingTop();
            }
        }
        bottomSheetBehavior.setPeekHeight(i);
    }
}
