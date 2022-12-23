package p456dz;

import android.animation.TimeAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.barcode.scan.BarcodeOverlayView;

/* renamed from: dz.a */
public final /* synthetic */ class C16758a implements TimeAnimator.TimeListener {

    /* renamed from: a */
    public final /* synthetic */ BarcodeOverlayView f43629a;

    public /* synthetic */ C16758a(BarcodeOverlayView barcodeOverlayView) {
        this.f43629a = barcodeOverlayView;
    }

    public final void onTimeUpdate(TimeAnimator timeAnimator, long j, long j2) {
        BarcodeOverlayView barcodeOverlayView = this.f43629a;
        float f = (((float) j2) / 1000.0f) * 50.0f;
        float f2 = barcodeOverlayView.f40807i;
        if (!barcodeOverlayView.f40809k) {
            f = -f;
        }
        float f3 = f2 + f;
        barcodeOverlayView.f40807i = f3;
        if (f3 >= 100.0f) {
            barcodeOverlayView.f40807i = 100.0f;
            barcodeOverlayView.f40809k = false;
        }
        if (barcodeOverlayView.f40807i <= BitmapDescriptorFactory.HUE_RED) {
            barcodeOverlayView.f40807i = BitmapDescriptorFactory.HUE_RED;
            barcodeOverlayView.f40809k = true;
        }
        barcodeOverlayView.invalidate();
        barcodeOverlayView.invalidate();
    }
}
