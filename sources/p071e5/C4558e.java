package p071e5;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C1876l;
import com.airbnb.lottie.C1903q;
import com.airbnb.lottie.model.layer.C1894a;
import com.airbnb.lottie.model.layer.Layer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p120i5.C5282c;
import p309x4.C7155a;
import p332z4.C7456a;
import p332z4.C7478q;

/* renamed from: e5.e */
public final class C4558e extends C1894a {

    /* renamed from: A */
    public final RectF f15702A = new RectF();

    /* renamed from: B */
    public final C7155a f15703B;

    /* renamed from: C */
    public final float[] f15704C;

    /* renamed from: D */
    public final Path f15705D;

    /* renamed from: E */
    public final Layer f15706E;

    /* renamed from: F */
    public C7478q f15707F;

    public C4558e(C1876l lVar, Layer layer) {
        super(lVar, layer);
        C7155a aVar = new C7155a();
        this.f15703B = aVar;
        this.f15704C = new float[8];
        this.f15705D = new Path();
        this.f15706E = layer;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(layer.f6596l);
    }

    /* renamed from: d */
    public final void mo6805d(RectF rectF, Matrix matrix, boolean z) {
        super.mo6805d(rectF, matrix, z);
        RectF rectF2 = this.f15702A;
        Layer layer = this.f15706E;
        rectF2.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) layer.f6594j, (float) layer.f6595k);
        this.f6620l.mapRect(this.f15702A);
        rectF.set(this.f15702A);
    }

    /* renamed from: g */
    public final void mo5840g(C5282c cVar, Object obj) {
        super.mo5840g(cVar, obj);
        if (obj != C1903q.f6673K) {
            return;
        }
        if (cVar == null) {
            this.f15707F = null;
        } else {
            this.f15707F = new C7478q(cVar, null);
        }
    }

    /* renamed from: j */
    public final void mo6811j(Canvas canvas, Matrix matrix, int i) {
        int i2;
        int alpha = Color.alpha(this.f15706E.f6596l);
        if (alpha != 0) {
            C7456a<Integer, Integer> aVar = this.f6629u.f22928j;
            if (aVar == null) {
                i2 = 100;
            } else {
                i2 = aVar.mo23717f().intValue();
            }
            int i3 = (int) ((((((float) alpha) / 255.0f) * ((float) i2)) / 100.0f) * (((float) i) / 255.0f) * 255.0f);
            this.f15703B.setAlpha(i3);
            C7478q qVar = this.f15707F;
            if (qVar != null) {
                this.f15703B.setColorFilter((ColorFilter) qVar.mo23717f());
            }
            if (i3 > 0) {
                float[] fArr = this.f15704C;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                Layer layer = this.f15706E;
                float f = (float) layer.f6594j;
                fArr[2] = f;
                fArr[3] = 0.0f;
                fArr[4] = f;
                float f2 = (float) layer.f6595k;
                fArr[5] = f2;
                fArr[6] = 0.0f;
                fArr[7] = f2;
                matrix.mapPoints(fArr);
                this.f15705D.reset();
                Path path = this.f15705D;
                float[] fArr2 = this.f15704C;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.f15705D;
                float[] fArr3 = this.f15704C;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.f15705D;
                float[] fArr4 = this.f15704C;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.f15705D;
                float[] fArr5 = this.f15704C;
                path4.lineTo(fArr5[6], fArr5[7]);
                Path path5 = this.f15705D;
                float[] fArr6 = this.f15704C;
                path5.lineTo(fArr6[0], fArr6[1]);
                this.f15705D.close();
                canvas.drawPath(this.f15705D, this.f15703B);
            }
        }
    }
}
