package p808sx;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import com.moovit.barcode.scan.BarcodeOverlayView;
import com.moovit.barcode.scan.engines.ZxingBarcodeScannerFragment;
import mf0.C24362h;
import p432cz.C16527b;
import p584jl.C17885a;

/* renamed from: sx.g */
public final /* synthetic */ class C19571g implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final /* synthetic */ int f49746b;

    /* renamed from: c */
    public final /* synthetic */ View f49747c;

    /* renamed from: d */
    public final /* synthetic */ FrameLayout f49748d;

    public /* synthetic */ C19571g(FrameLayout frameLayout, View view, int i) {
        this.f49746b = i;
        this.f49748d = frameLayout;
        this.f49747c = view;
    }

    public final void onGlobalLayout() {
        switch (this.f49746b) {
            case 0:
                NestedScrollView nestedScrollView = (NestedScrollView) this.f49748d;
                View view = this.f49747c;
                int i = C19572h.f49749k;
                boolean z = true;
                int i2 = 0;
                if (!nestedScrollView.canScrollVertically(1) && !nestedScrollView.canScrollVertically(-1)) {
                    z = false;
                }
                if (!z) {
                    i2 = 8;
                }
                view.setVisibility(i2);
                return;
            default:
                BarcodeOverlayView barcodeOverlayView = (BarcodeOverlayView) this.f49748d;
                View view2 = this.f49747c;
                int i3 = ZxingBarcodeScannerFragment.f40818p;
                C24362h.m61211f(view2, "$view");
                barcodeOverlayView.getClass();
                RectF rectF = new RectF();
                rectF.set(barcodeOverlayView.f40800b);
                ((Guideline) view2.findViewById(C16527b.guideline)).setGuidelineBegin(C17885a.m44459r0(rectF.top));
                return;
        }
    }
}
