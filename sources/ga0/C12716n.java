package ga0;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p824tp.C19740r;

/* renamed from: ga0.n */
public final /* synthetic */ class C12716n implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C12717o f31397b;

    /* renamed from: c */
    public final /* synthetic */ boolean f31398c;

    /* renamed from: d */
    public final /* synthetic */ BottomSheetBehavior f31399d;

    public /* synthetic */ C12716n(C12717o oVar, boolean z, BottomSheetBehavior bottomSheetBehavior) {
        this.f31397b = oVar;
        this.f31398c = z;
        this.f31399d = bottomSheetBehavior;
    }

    public final void onClick(View view) {
        int i;
        C12717o oVar = this.f31397b;
        boolean z = this.f31398c;
        BottomSheetBehavior bottomSheetBehavior = this.f31399d;
        if (z) {
            i = 5;
        } else {
            i = 4;
        }
        if (oVar.f31408o.getScrollY() > 0) {
            oVar.f31408o.setTag(C19740r.view_tag_param1, Integer.valueOf(i));
            oVar.f31408o.setTag(C19740r.view_tag_param2, 0);
            NestedScrollView nestedScrollView = oVar.f31408o;
            nestedScrollView.mo3508v(0 - nestedScrollView.getScrollX(), 0 - nestedScrollView.getScrollY(), false);
            return;
        }
        bottomSheetBehavior.setState(i);
    }
}
