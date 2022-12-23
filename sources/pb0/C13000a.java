package pb0;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import com.theartofdev.edmodo.cropper.CropOverlayView;

/* renamed from: pb0.a */
public final class C13000a extends Animation implements Animation.AnimationListener {

    /* renamed from: b */
    public final ImageView f32180b;

    /* renamed from: c */
    public final CropOverlayView f32181c;

    /* renamed from: d */
    public final float[] f32182d = new float[8];

    /* renamed from: e */
    public final float[] f32183e = new float[8];

    /* renamed from: f */
    public final RectF f32184f = new RectF();

    /* renamed from: g */
    public final RectF f32185g = new RectF();

    /* renamed from: h */
    public final float[] f32186h = new float[9];

    /* renamed from: i */
    public final float[] f32187i = new float[9];

    /* renamed from: j */
    public final RectF f32188j = new RectF();

    /* renamed from: k */
    public final float[] f32189k = new float[8];

    /* renamed from: l */
    public final float[] f32190l = new float[9];

    public C13000a(ImageView imageView, CropOverlayView cropOverlayView) {
        this.f32180b = imageView;
        this.f32181c = cropOverlayView;
        setDuration(300);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    public final void applyTransformation(float f, Transformation transformation) {
        float[] fArr;
        RectF rectF = this.f32188j;
        RectF rectF2 = this.f32184f;
        float f2 = rectF2.left;
        RectF rectF3 = this.f32185g;
        rectF.left = C16759e.m42347c(rectF3.left, f2, f, f2);
        float f3 = rectF2.top;
        rectF.top = C16759e.m42347c(rectF3.top, f3, f, f3);
        float f4 = rectF2.right;
        rectF.right = C16759e.m42347c(rectF3.right, f4, f, f4);
        float f5 = rectF2.bottom;
        rectF.bottom = C16759e.m42347c(rectF3.bottom, f5, f, f5);
        this.f32181c.setCropWindowRect(rectF);
        int i = 0;
        int i2 = 0;
        while (true) {
            fArr = this.f32189k;
            if (i2 >= fArr.length) {
                break;
            }
            float f6 = this.f32182d[i2];
            fArr[i2] = C16759e.m42347c(this.f32183e[i2], f6, f, f6);
            i2++;
        }
        this.f32181c.mo25171g(this.f32180b.getWidth(), this.f32180b.getHeight(), fArr);
        while (true) {
            float[] fArr2 = this.f32190l;
            if (i < fArr2.length) {
                float f7 = this.f32186h[i];
                fArr2[i] = C16759e.m42347c(this.f32187i[i], f7, f, f7);
                i++;
            } else {
                Matrix imageMatrix = this.f32180b.getImageMatrix();
                imageMatrix.setValues(this.f32190l);
                this.f32180b.setImageMatrix(imageMatrix);
                this.f32180b.invalidate();
                this.f32181c.invalidate();
                return;
            }
        }
    }

    public final void onAnimationEnd(Animation animation) {
        this.f32180b.clearAnimation();
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
