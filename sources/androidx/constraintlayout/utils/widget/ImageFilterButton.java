package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
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
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p002a1.C0042d;
import p127j.C5344a;

public class ImageFilterButton extends AppCompatImageButton {

    /* renamed from: e */
    public ImageFilterView.C0729c f2869e = new ImageFilterView.C0729c();

    /* renamed from: f */
    public float f2870f = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: g */
    public float f2871g = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: h */
    public float f2872h = Float.NaN;

    /* renamed from: i */
    public Path f2873i;

    /* renamed from: j */
    public ViewOutlineProvider f2874j;

    /* renamed from: k */
    public RectF f2875k;

    /* renamed from: l */
    public Drawable[] f2876l = new Drawable[2];

    /* renamed from: m */
    public LayerDrawable f2877m;

    /* renamed from: n */
    public boolean f2878n = true;

    /* renamed from: o */
    public Drawable f2879o = null;

    /* renamed from: p */
    public Drawable f2880p = null;

    /* renamed from: q */
    public float f2881q = Float.NaN;

    /* renamed from: r */
    public float f2882r = Float.NaN;

    /* renamed from: s */
    public float f2883s = Float.NaN;

    /* renamed from: t */
    public float f2884t = Float.NaN;

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$a */
    public class C0725a extends ViewOutlineProvider {
        public C0725a() {
        }

        public final void getOutline(View view, Outline outline) {
            int width = ImageFilterButton.this.getWidth();
            int height = ImageFilterButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * ImageFilterButton.this.f2871g) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$b */
    public class C0726b extends ViewOutlineProvider {
        public C0726b() {
        }

        public final void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.f2872h);
        }
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo3029a(attributeSet);
    }

    private void setOverlay(boolean z) {
        this.f2878n = z;
    }

    /* renamed from: a */
    public final void mo3029a(AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0042d.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f2879o = obtainStyledAttributes.getDrawable(C0042d.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0042d.ImageFilterView_crossfade) {
                    this.f2870f = obtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED);
                } else if (index == C0042d.ImageFilterView_warmth) {
                    setWarmth(obtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == C0042d.ImageFilterView_saturation) {
                    setSaturation(obtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == C0042d.ImageFilterView_contrast) {
                    setContrast(obtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == C0042d.ImageFilterView_round) {
                    setRound(obtainStyledAttributes.getDimension(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == C0042d.ImageFilterView_roundPercent) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == C0042d.ImageFilterView_overlay) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f2878n));
                } else if (index == C0042d.ImageFilterView_imagePanX) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.f2881q));
                } else if (index == C0042d.ImageFilterView_imagePanY) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.f2882r));
                } else if (index == C0042d.ImageFilterView_imageRotate) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.f2884t));
                } else if (index == C0042d.ImageFilterView_imageZoom) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.f2883s));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f2880p = drawable;
            if (this.f2879o == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f2880p = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f2876l;
                    Drawable mutate = drawable2.mutate();
                    this.f2880p = mutate;
                    drawableArr[0] = mutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f2876l;
            Drawable mutate2 = getDrawable().mutate();
            this.f2880p = mutate2;
            drawableArr2[0] = mutate2;
            this.f2876l[1] = this.f2879o.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f2876l);
            this.f2877m = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f2870f * 255.0f));
            if (!this.f2878n) {
                this.f2877m.getDrawable(0).setAlpha((int) ((1.0f - this.f2870f) * 255.0f));
            }
            super.setImageDrawable(this.f2877m);
        }
    }

    /* renamed from: b */
    public final void mo3030b() {
        float f;
        float f2;
        float f3;
        float f4;
        if (!Float.isNaN(this.f2881q) || !Float.isNaN(this.f2882r) || !Float.isNaN(this.f2883s) || !Float.isNaN(this.f2884t)) {
            boolean isNaN = Float.isNaN(this.f2881q);
            float f5 = BitmapDescriptorFactory.HUE_RED;
            if (isNaN) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = this.f2881q;
            }
            if (Float.isNaN(this.f2882r)) {
                f2 = BitmapDescriptorFactory.HUE_RED;
            } else {
                f2 = this.f2882r;
            }
            if (Float.isNaN(this.f2883s)) {
                f3 = 1.0f;
            } else {
                f3 = this.f2883s;
            }
            if (!Float.isNaN(this.f2884t)) {
                f5 = this.f2884t;
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

    /* renamed from: c */
    public final void mo3031c() {
        if (!Float.isNaN(this.f2881q) || !Float.isNaN(this.f2882r) || !Float.isNaN(this.f2883s) || !Float.isNaN(this.f2884t)) {
            mo3030b();
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getContrast() {
        return this.f2869e.f2910f;
    }

    public float getCrossfade() {
        return this.f2870f;
    }

    public float getImagePanX() {
        return this.f2881q;
    }

    public float getImagePanY() {
        return this.f2882r;
    }

    public float getImageRotate() {
        return this.f2884t;
    }

    public float getImageZoom() {
        return this.f2883s;
    }

    public float getRound() {
        return this.f2872h;
    }

    public float getRoundPercent() {
        return this.f2871g;
    }

    public float getSaturation() {
        return this.f2869e.f2909e;
    }

    public float getWarmth() {
        return this.f2869e.f2911g;
    }

    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        mo3030b();
    }

    public void setAltImageResource(int i) {
        Drawable mutate = C5344a.m13397a(getContext(), i).mutate();
        this.f2879o = mutate;
        Drawable[] drawableArr = this.f2876l;
        drawableArr[0] = this.f2880p;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f2876l);
        this.f2877m = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f2870f);
    }

    public void setBrightness(float f) {
        ImageFilterView.C0729c cVar = this.f2869e;
        cVar.f2908d = f;
        cVar.mo3088a(this);
    }

    public void setContrast(float f) {
        ImageFilterView.C0729c cVar = this.f2869e;
        cVar.f2910f = f;
        cVar.mo3088a(this);
    }

    public void setCrossfade(float f) {
        this.f2870f = f;
        if (this.f2876l != null) {
            if (!this.f2878n) {
                this.f2877m.getDrawable(0).setAlpha((int) ((1.0f - this.f2870f) * 255.0f));
            }
            this.f2877m.getDrawable(1).setAlpha((int) (this.f2870f * 255.0f));
            super.setImageDrawable(this.f2877m);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        if (this.f2879o == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable mutate = drawable.mutate();
        this.f2880p = mutate;
        Drawable[] drawableArr = this.f2876l;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f2879o;
        LayerDrawable layerDrawable = new LayerDrawable(this.f2876l);
        this.f2877m = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f2870f);
    }

    public void setImagePanX(float f) {
        this.f2881q = f;
        mo3031c();
    }

    public void setImagePanY(float f) {
        this.f2882r = f;
        mo3031c();
    }

    public void setImageResource(int i) {
        if (this.f2879o != null) {
            Drawable mutate = C5344a.m13397a(getContext(), i).mutate();
            this.f2880p = mutate;
            Drawable[] drawableArr = this.f2876l;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f2879o;
            LayerDrawable layerDrawable = new LayerDrawable(this.f2876l);
            this.f2877m = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f2870f);
            return;
        }
        super.setImageResource(i);
    }

    public void setImageRotate(float f) {
        this.f2884t = f;
        mo3031c();
    }

    public void setImageZoom(float f) {
        this.f2883s = f;
        mo3031c();
    }

    public void setRound(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            this.f2872h = f;
            float f2 = this.f2871g;
            this.f2871g = -1.0f;
            setRoundPercent(f2);
            return;
        }
        if (this.f2872h != f) {
            z = true;
        } else {
            z = false;
        }
        this.f2872h = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (this.f2873i == null) {
                this.f2873i = new Path();
            }
            if (this.f2875k == null) {
                this.f2875k = new RectF();
            }
            if (this.f2874j == null) {
                C0726b bVar = new C0726b();
                this.f2874j = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f2875k.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) getWidth(), (float) getHeight());
            this.f2873i.reset();
            Path path = this.f2873i;
            RectF rectF = this.f2875k;
            float f3 = this.f2872h;
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
        if (this.f2871g != f) {
            z = true;
        } else {
            z = false;
        }
        this.f2871g = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (this.f2873i == null) {
                this.f2873i = new Path();
            }
            if (this.f2875k == null) {
                this.f2875k = new RectF();
            }
            if (this.f2874j == null) {
                C0725a aVar = new C0725a();
                this.f2874j = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f2871g) / 2.0f;
            this.f2875k.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) width, (float) height);
            this.f2873i.reset();
            this.f2873i.addRoundRect(this.f2875k, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        ImageFilterView.C0729c cVar = this.f2869e;
        cVar.f2909e = f;
        cVar.mo3088a(this);
    }

    public void setWarmth(float f) {
        ImageFilterView.C0729c cVar = this.f2869e;
        cVar.f2911g = f;
        cVar.mo3088a(this);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo3029a(attributeSet);
    }
}
