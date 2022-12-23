package p480ez;

import android.graphics.RectF;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.constraintlayout.widget.Guideline;
import com.moovit.barcode.scan.BarcodeOverlayView;
import com.moovit.barcode.scan.engines.MLKitBarcodeScannerFragment;
import mf0.C24362h;
import p432cz.C16527b;
import p584jl.C17885a;

/* renamed from: ez.a */
public final /* synthetic */ class C16909a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final /* synthetic */ BarcodeOverlayView f43923b;

    /* renamed from: c */
    public final /* synthetic */ View f43924c;

    public /* synthetic */ C16909a(BarcodeOverlayView barcodeOverlayView, View view) {
        this.f43923b = barcodeOverlayView;
        this.f43924c = view;
    }

    public final void onGlobalLayout() {
        BarcodeOverlayView barcodeOverlayView = this.f43923b;
        View view = this.f43924c;
        int i = MLKitBarcodeScannerFragment.f40812q;
        C24362h.m61211f(view, "$view");
        barcodeOverlayView.getClass();
        RectF rectF = new RectF();
        rectF.set(barcodeOverlayView.f40800b);
        ((Guideline) view.findViewById(C16527b.guideline)).setGuidelineBegin(C17885a.m44459r0(rectF.top));
    }
}
