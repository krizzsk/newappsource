package p071e5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.C1876l;
import com.airbnb.lottie.model.layer.C1894a;
import com.airbnb.lottie.model.layer.Layer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: e5.c */
public final class C4556c extends C1894a {
    public C4556c(C1876l lVar, Layer layer) {
        super(lVar, layer);
    }

    /* renamed from: d */
    public final void mo6805d(RectF rectF, Matrix matrix, boolean z) {
        super.mo6805d(rectF, matrix, z);
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: j */
    public final void mo6811j(Canvas canvas, Matrix matrix, int i) {
    }
}
