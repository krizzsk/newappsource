package s30;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: s30.a */
public final /* synthetic */ class C6451a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final /* synthetic */ C6452b f20154b;

    /* renamed from: c */
    public final /* synthetic */ View f20155c;

    /* renamed from: d */
    public final /* synthetic */ View f20156d;

    /* renamed from: e */
    public final /* synthetic */ BottomSheetBehavior f20157e;

    public /* synthetic */ C6451a(C6452b bVar, View view, View view2, BottomSheetBehavior bottomSheetBehavior) {
        this.f20154b = bVar;
        this.f20155c = view;
        this.f20156d = view2;
        this.f20157e = bottomSheetBehavior;
    }

    public final void onGlobalLayout() {
        C6452b bVar = this.f20154b;
        View view = this.f20155c;
        View view2 = this.f20156d;
        BottomSheetBehavior bottomSheetBehavior = this.f20157e;
        View findViewById = view.findViewById(bVar.f20162x);
        bottomSheetBehavior.setPeekHeight(findViewById.getBottom() + view2.getTop());
    }
}
