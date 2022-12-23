package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p002a1.C0042d;
import p127j.C5344a;

public class ImageFilterView extends AppCompatImageView {

    /* renamed from: b */
    public C0729c f2887b = new C0729c();

    /* renamed from: c */
    public boolean f2888c = true;

    /* renamed from: d */
    public Drawable f2889d = null;

    /* renamed from: e */
    public Drawable f2890e = null;

    /* renamed from: f */
    public float f2891f = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: g */
    public float f2892g = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: h */
    public float f2893h = Float.NaN;

    /* renamed from: i */
    public Path f2894i;

    /* renamed from: j */
    public ViewOutlineProvider f2895j;

    /* renamed from: k */
    public RectF f2896k;

    /* renamed from: l */
    public Drawable[] f2897l = new Drawable[2];

    /* renamed from: m */
    public LayerDrawable f2898m;

    /* renamed from: n */
    public float f2899n = Float.NaN;

    /* renamed from: o */
    public float f2900o = Float.NaN;

    /* renamed from: p */
    public float f2901p = Float.NaN;

    /* renamed from: q */
    public float f2902q = Float.NaN;

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$a */
    public class C0727a extends ViewOutlineProvider {
        public C0727a() {
        }

        public final void getOutline(View view, Outline outline) {
            int width = ImageFilterView.this.getWidth();
            int height = ImageFilterView.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * ImageFilterView.this.f2892g) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$b */
    public class C0728b extends ViewOutlineProvider {
        public C0728b() {
        }

        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.f2893h);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$c */
    public static class C0729c {

        /* renamed from: a */
        public float[] f2905a = new float[20];

        /* renamed from: b */
        public ColorMatrix f2906b = new ColorMatrix();

        /* renamed from: c */
        public ColorMatrix f2907c = new ColorMatrix();

        /* renamed from: d */
        public float f2908d = 1.0f;

        /* renamed from: e */
        public float f2909e = 1.0f;

        /* renamed from: f */
        public float f2910f = 1.0f;

        /* renamed from: g */
        public float f2911g = 1.0f;

        /* renamed from: a */
        public final void mo3088a(ImageView imageView) {
            float f;
            boolean z;
            float f2;
            float f3;
            float f4;
            this.f2906b.reset();
            float f5 = this.f2909e;
            boolean z2 = true;
            if (f5 != 1.0f) {
                float f6 = 1.0f - f5;
                float f7 = 0.2999f * f6;
                float f8 = 0.587f * f6;
                float f9 = f6 * 0.114f;
                float[] fArr = this.f2905a;
                fArr[0] = f7 + f5;
                fArr[1] = f8;
                fArr[2] = f9;
                fArr[3] = 0.0f;
                fArr[4] = 0.0f;
                fArr[5] = f7;
                fArr[6] = f8 + f5;
                fArr[7] = f9;
                fArr[8] = 0.0f;
                fArr[9] = 0.0f;
                fArr[10] = f7;
                fArr[11] = f8;
                fArr[12] = f9 + f5;
                fArr[13] = 0.0f;
                fArr[14] = 0.0f;
                fArr[15] = 0.0f;
                fArr[16] = 0.0f;
                fArr[17] = 0.0f;
                f = 1.0f;
                fArr[18] = 1.0f;
                fArr[19] = 0.0f;
                this.f2906b.set(fArr);
                z = true;
            } else {
                f = 1.0f;
                z = false;
            }
            float f11 = this.f2910f;
            if (f11 != f) {
                this.f2907c.setScale(f11, f11, f11, f);
                this.f2906b.postConcat(this.f2907c);
                z = true;
            }
            float f12 = this.f2911g;
            if (f12 != f) {
                if (f12 <= BitmapDescriptorFactory.HUE_RED) {
                    f12 = 0.01f;
                }
                float f13 = (5000.0f / f12) / 100.0f;
                if (f13 > 66.0f) {
                    double d = (double) (f13 - 60.0f);
                    f2 = ((float) Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                    f3 = ((float) Math.pow(d, 0.07551484555006027d)) * 288.12216f;
                } else {
                    f3 = (((float) Math.log((double) f13)) * 99.4708f) - 161.11957f;
                    f2 = 255.0f;
                }
                if (f13 >= 66.0f) {
                    f4 = 255.0f;
                } else if (f13 > 19.0f) {
                    f4 = (((float) Math.log((double) (f13 - 10.0f))) * 138.51773f) - 305.0448f;
                } else {
                    f4 = BitmapDescriptorFactory.HUE_RED;
                }
                float min = Math.min(255.0f, Math.max(f2, BitmapDescriptorFactory.HUE_RED));
                float min2 = Math.min(255.0f, Math.max(f3, BitmapDescriptorFactory.HUE_RED));
                float min3 = Math.min(255.0f, Math.max(f4, BitmapDescriptorFactory.HUE_RED));
                float min4 = Math.min(255.0f, Math.max(255.0f, BitmapDescriptorFactory.HUE_RED));
                float min5 = Math.min(255.0f, Math.max((((float) Math.log((double) 50.0f)) * 99.4708f) - 161.11957f, BitmapDescriptorFactory.HUE_RED));
                float min6 = min3 / Math.min(255.0f, Math.max((((float) Math.log((double) 40.0f)) * 138.51773f) - 305.0448f, BitmapDescriptorFactory.HUE_RED));
                float[] fArr2 = this.f2905a;
                fArr2[0] = min / min4;
                fArr2[1] = 0.0f;
                fArr2[2] = 0.0f;
                fArr2[3] = 0.0f;
                fArr2[4] = 0.0f;
                fArr2[5] = 0.0f;
                fArr2[6] = min2 / min5;
                fArr2[7] = 0.0f;
                fArr2[8] = 0.0f;
                fArr2[9] = 0.0f;
                fArr2[10] = 0.0f;
                fArr2[11] = 0.0f;
                fArr2[12] = min6;
                fArr2[13] = 0.0f;
                fArr2[14] = 0.0f;
                fArr2[15] = 0.0f;
                fArr2[16] = 0.0f;
                fArr2[17] = 0.0f;
                fArr2[18] = 1.0f;
                fArr2[19] = 0.0f;
                this.f2907c.set(fArr2);
                this.f2906b.postConcat(this.f2907c);
                z = true;
            }
            float f14 = this.f2908d;
            if (f14 != 1.0f) {
                float[] fArr3 = this.f2905a;
                fArr3[0] = f14;
                fArr3[1] = 0.0f;
                fArr3[2] = 0.0f;
                fArr3[3] = 0.0f;
                fArr3[4] = 0.0f;
                fArr3[5] = 0.0f;
                fArr3[6] = f14;
                fArr3[7] = 0.0f;
                fArr3[8] = 0.0f;
                fArr3[9] = 0.0f;
                fArr3[10] = 0.0f;
                fArr3[11] = 0.0f;
                fArr3[12] = f14;
                fArr3[13] = 0.0f;
                fArr3[14] = 0.0f;
                fArr3[15] = 0.0f;
                fArr3[16] = 0.0f;
                fArr3[17] = 0.0f;
                fArr3[18] = 1.0f;
                fArr3[19] = 0.0f;
                this.f2907c.set(fArr3);
                this.f2906b.postConcat(this.f2907c);
            } else {
                z2 = z;
            }
            if (z2) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.f2906b));
                return;
            }
            ImageView imageView2 = imageView;
            imageView.clearColorFilter();
        }
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo3058c(attributeSet);
    }

    private void setOverlay(boolean z) {
        this.f2888c = z;
    }

    /* renamed from: c */
    public final void mo3058c(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0042d.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f2889d = obtainStyledAttributes.getDrawable(C0042d.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0042d.ImageFilterView_crossfade) {
                    this.f2891f = obtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED);
                } else if (index == C0042d.ImageFilterView_warmth) {
                    setWarmth(obtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == C0042d.ImageFilterView_saturation) {
                    setSaturation(obtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == C0042d.ImageFilterView_contrast) {
                    setContrast(obtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == C0042d.ImageFilterView_brightness) {
                    setBrightness(obtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == C0042d.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == C0042d.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == C0042d.ImageFilterView_overlay) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f2888c));
                } else if (index == C0042d.ImageFilterView_imagePanX) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.f2899n));
                } else if (index == C0042d.ImageFilterView_imagePanY) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.f2900o));
                } else if (index == C0042d.ImageFilterView_imageRotate) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.f2902q));
                } else if (index == C0042d.ImageFilterView_imageZoom) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.f2901p));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f2890e = drawable;
            if (this.f2889d == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f2890e = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f2897l;
                    Drawable mutate = drawable2.mutate();
                    this.f2890e = mutate;
                    drawableArr[0] = mutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f2897l;
            Drawable mutate2 = getDrawable().mutate();
            this.f2890e = mutate2;
            drawableArr2[0] = mutate2;
            this.f2897l[1] = this.f2889d.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f2897l);
            this.f2898m = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f2891f * 255.0f));
            if (!this.f2888c) {
                this.f2898m.getDrawable(0).setAlpha((int) ((1.0f - this.f2891f) * 255.0f));
            }
            super.setImageDrawable(this.f2898m);
        }
    }

    /* renamed from: d */
    public final void mo3059d() {
        float f;
        float f2;
        float f3;
        float f4;
        if (!Float.isNaN(this.f2899n) || !Float.isNaN(this.f2900o) || !Float.isNaN(this.f2901p) || !Float.isNaN(this.f2902q)) {
            boolean isNaN = Float.isNaN(this.f2899n);
            float f5 = BitmapDescriptorFactory.HUE_RED;
            if (isNaN) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = this.f2899n;
            }
            if (Float.isNaN(this.f2900o)) {
                f2 = BitmapDescriptorFactory.HUE_RED;
            } else {
                f2 = this.f2900o;
            }
            if (Float.isNaN(this.f2901p)) {
                f3 = 1.0f;
            } else {
                f3 = this.f2901p;
            }
            if (!Float.isNaN(this.f2902q)) {
                f5 = this.f2902q;
            }
            Matrix matrix = new Matrix();
            matrix.reset();
            float intrinsicWidth = (float) getDrawable().getIntrinsicWidth();
            float intrinsicHeight = (float) getDrawable().getIntrinsicHeight();
            float width = (float) getWidth();
            float height = (float) getHeight();
            if (intrinsicWidth * height < intrinsicHeight * width) {
                f4 = width / intrinsicWidth;
            } else {
                f4 = height / intrinsicHeight;
            }
            float f6 = f3 * f4;
            matrix.postScale(f6, f6);
            float f7 = intrinsicWidth * f6;
            float f8 = f6 * intrinsicHeight;
            matrix.postTranslate(((((width - f7) * f) + width) - f7) * 0.5f, ((((height - f8) * f2) + height) - f8) * 0.5f);
            matrix.postRotate(f5, width / 2.0f, height / 2.0f);
            setImageMatrix(matrix);
            setScaleType(ImageView.ScaleType.MATRIX);
        }
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
    }

    /* renamed from: e */
    public final void mo3061e() {
        if (!Float.isNaN(this.f2899n) || !Float.isNaN(this.f2900o) || !Float.isNaN(this.f2901p) || !Float.isNaN(this.f2902q)) {
            mo3059d();
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    public float getBrightness() {
        return this.f2887b.f2908d;
    }

    public float getContrast() {
        return this.f2887b.f2910f;
    }

    public float getCrossfade() {
        return this.f2891f;
    }

    public float getImagePanX() {
        return this.f2899n;
    }

    public float getImagePanY() {
        return this.f2900o;
    }

    public float getImageRotate() {
        return this.f2902q;
    }

    public float getImageZoom() {
        return this.f2901p;
    }

    public float getRound() {
        return this.f2893h;
    }

    public float getRoundPercent() {
        return this.f2892g;
    }

    public float getSaturation() {
        return this.f2887b.f2909e;
    }

    public float getWarmth() {
        return this.f2887b.f2911g;
    }

    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        mo3059d();
    }

    public void setAltImageResource(int i) {
        Drawable mutate = C5344a.m13397a(getContext(), i).mutate();
        this.f2889d = mutate;
        Drawable[] drawableArr = this.f2897l;
        drawableArr[0] = this.f2890e;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f2897l);
        this.f2898m = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f2891f);
    }

    public void setBrightness(float f) {
        C0729c cVar = this.f2887b;
        cVar.f2908d = f;
        cVar.mo3088a(this);
    }

    public void setContrast(float f) {
        C0729c cVar = this.f2887b;
        cVar.f2910f = f;
        cVar.mo3088a(this);
    }

    public void setCrossfade(float f) {
        this.f2891f = f;
        if (this.f2897l != null) {
            if (!this.f2888c) {
                this.f2898m.getDrawable(0).setAlpha((int) ((1.0f - this.f2891f) * 255.0f));
            }
            this.f2898m.getDrawable(1).setAlpha((int) (this.f2891f * 255.0f));
            super.setImageDrawable(this.f2898m);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        if (this.f2889d == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable mutate = drawable.mutate();
        this.f2890e = mutate;
        Drawable[] drawableArr = this.f2897l;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f2889d;
        LayerDrawable layerDrawable = new LayerDrawable(this.f2897l);
        this.f2898m = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f2891f);
    }

    public void setImagePanX(float f) {
        this.f2899n = f;
        mo3061e();
    }

    public void setImagePanY(float f) {
        this.f2900o = f;
        mo3061e();
    }

    public void setImageResource(int i) {
        if (this.f2889d != null) {
            Drawable mutate = C5344a.m13397a(getContext(), i).mutate();
            this.f2890e = mutate;
            Drawable[] drawableArr = this.f2897l;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f2889d;
            LayerDrawable layerDrawable = new LayerDrawable(this.f2897l);
            this.f2898m = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f2891f);
            return;
        }
        super.setImageResource(i);
    }

    public void setImageRotate(float f) {
        this.f2902q = f;
        mo3061e();
    }

    public void setImageZoom(float f) {
        this.f2901p = f;
        mo3061e();
    }

    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.f2893h = f;
            float f2 = this.f2892g;
            this.f2892g = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.f2893h != f) {
            z = true;
        } else {
            z = false;
        }
        this.f2893h = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (this.f2894i == null) {
                this.f2894i = new Path();
            }
            if (this.f2896k == null) {
                this.f2896k = new RectF();
            }
            if (this.f2895j == null) {
                C0728b bVar = new C0728b();
                this.f2895j = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f2896k.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight());
            this.f2894i.reset();
            Path path = this.f2894i;
            RectF rectF = this.f2896k;
            float f3 = this.f2893h;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z;
        if (this.f2892g != f) {
            z = true;
        } else {
            z = false;
        }
        this.f2892g = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (this.f2894i == null) {
                this.f2894i = new Path();
            }
            if (this.f2896k == null) {
                this.f2896k = new RectF();
            }
            if (this.f2895j == null) {
                C0727a aVar = new C0727a();
                this.f2895j = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f2892g) / 2.0f;
            this.f2896k.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) width, (float) height);
            this.f2894i.reset();
            this.f2894i.addRoundRect(this.f2896k, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        C0729c cVar = this.f2887b;
        cVar.f2909e = f;
        cVar.mo3088a(this);
    }

    public void setWarmth(float f) {
        C0729c cVar = this.f2887b;
        cVar.f2911g = f;
        cVar.mo3088a(this);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo3058c(attributeSet);
    }
}
