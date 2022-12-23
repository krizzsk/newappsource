package com.theartofdev.edmodo.cropper;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.util.Arrays;

public class CropOverlayView extends View {

    /* renamed from: A */
    public CropImageView.CropShape f24411A;

    /* renamed from: B */
    public final Rect f24412B = new Rect();

    /* renamed from: C */
    public boolean f24413C;

    /* renamed from: b */
    public ScaleGestureDetector f24414b;

    /* renamed from: c */
    public boolean f24415c;

    /* renamed from: d */
    public final C8056d f24416d = new C8056d();

    /* renamed from: e */
    public C8046a f24417e;

    /* renamed from: f */
    public final RectF f24418f = new RectF();

    /* renamed from: g */
    public Paint f24419g;

    /* renamed from: h */
    public Paint f24420h;

    /* renamed from: i */
    public Paint f24421i;

    /* renamed from: j */
    public Paint f24422j;

    /* renamed from: k */
    public Path f24423k = new Path();

    /* renamed from: l */
    public final float[] f24424l = new float[8];

    /* renamed from: m */
    public final RectF f24425m = new RectF();

    /* renamed from: n */
    public int f24426n;

    /* renamed from: o */
    public int f24427o;

    /* renamed from: p */
    public float f24428p;

    /* renamed from: q */
    public float f24429q;

    /* renamed from: r */
    public float f24430r;

    /* renamed from: s */
    public float f24431s;

    /* renamed from: t */
    public float f24432t;

    /* renamed from: u */
    public CropWindowMoveHandler f24433u;

    /* renamed from: v */
    public boolean f24434v;

    /* renamed from: w */
    public int f24435w;

    /* renamed from: x */
    public int f24436x;

    /* renamed from: y */
    public float f24437y = (((float) this.f24435w) / ((float) this.f24436x));

    /* renamed from: z */
    public CropImageView.Guidelines f24438z;

    /* renamed from: com.theartofdev.edmodo.cropper.CropOverlayView$a */
    public interface C8046a {
    }

    /* renamed from: com.theartofdev.edmodo.cropper.CropOverlayView$b */
    public class C8047b extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public C8047b() {
        }

        @TargetApi(11)
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            RectF a = CropOverlayView.this.f24416d.mo25200a();
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            float currentSpanY = scaleGestureDetector.getCurrentSpanY() / 2.0f;
            float currentSpanX = scaleGestureDetector.getCurrentSpanX() / 2.0f;
            float f = focusY - currentSpanY;
            float f2 = focusX - currentSpanX;
            float f3 = focusX + currentSpanX;
            float f4 = focusY + currentSpanY;
            if (f2 >= f3 || f > f4 || f2 < BitmapDescriptorFactory.HUE_RED) {
                return true;
            }
            C8056d dVar = CropOverlayView.this.f24416d;
            if (f3 > Math.min(dVar.f24495e, dVar.f24499i / dVar.f24501k) || f < BitmapDescriptorFactory.HUE_RED) {
                return true;
            }
            C8056d dVar2 = CropOverlayView.this.f24416d;
            if (f4 > Math.min(dVar2.f24496f, dVar2.f24500j / dVar2.f24502l)) {
                return true;
            }
            a.set(f2, f, f3, f4);
            CropOverlayView.this.f24416d.f24491a.set(a);
            CropOverlayView.this.invalidate();
            return true;
        }
    }

    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: e */
    public static Paint m18357e(float f, int i) {
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            return null;
        }
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStrokeWidth(f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        return paint;
    }

    /* renamed from: a */
    public final boolean mo25166a(RectF rectF) {
        boolean z;
        float f;
        float f2;
        float f3;
        RectF rectF2 = rectF;
        float o = C8053c.m18385o(this.f24424l);
        float q = C8053c.m18387q(this.f24424l);
        float p = C8053c.m18386p(this.f24424l);
        float m = C8053c.m18383m(this.f24424l);
        float[] fArr = this.f24424l;
        float f4 = fArr[0];
        float f5 = fArr[6];
        if (f4 == f5 || fArr[1] == fArr[7]) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            this.f24425m.set(o, q, p, m);
            return false;
        }
        float f6 = fArr[1];
        float f7 = fArr[4];
        float f8 = fArr[5];
        float f9 = fArr[7];
        if (f9 < f6) {
            float f11 = fArr[3];
            if (f6 < f11) {
                float f12 = fArr[2];
                f2 = f5;
                f6 = f8;
                f5 = f12;
                f4 = f7;
                float f13 = f11;
                f = f9;
                f9 = f13;
            } else {
                f9 = f6;
                f5 = f4;
                f6 = f11;
                f4 = fArr[2];
                f2 = f7;
                f = f8;
            }
        } else {
            f = fArr[3];
            if (f6 > f) {
                f2 = fArr[2];
            } else {
                f = f6;
                f2 = f4;
                f4 = f5;
                f6 = f9;
                f5 = f7;
                f9 = f8;
            }
        }
        float f14 = (f6 - f) / (f4 - f2);
        float f15 = -1.0f / f14;
        float f16 = f - (f14 * f2);
        float f17 = f - (f2 * f15);
        float f18 = f9 - (f14 * f5);
        float f19 = f9 - (f5 * f15);
        float centerY = rectF.centerY() - rectF2.top;
        float centerX = rectF.centerX();
        float f21 = rectF2.left;
        float f22 = centerY / (centerX - f21);
        float f23 = -f22;
        float f24 = rectF2.top;
        float f25 = f24 - (f21 * f22);
        float f26 = rectF2.right;
        float f27 = f24 - (f23 * f26);
        float f28 = f14 - f22;
        float f29 = (f25 - f16) / f28;
        if (f29 < f26) {
            f3 = f29;
        } else {
            f3 = o;
        }
        float max = Math.max(o, f3);
        float f31 = (f25 - f17) / (f15 - f22);
        if (f31 >= rectF2.right) {
            f31 = max;
        }
        float max2 = Math.max(max, f31);
        float f32 = f15 - f23;
        float f33 = (f27 - f19) / f32;
        float f34 = m;
        if (f33 >= rectF2.right) {
            f33 = max2;
        }
        float max3 = Math.max(max2, f33);
        float f35 = (f27 - f17) / f32;
        if (f35 <= rectF2.left) {
            f35 = p;
        }
        float min = Math.min(p, f35);
        float f36 = (f27 - f18) / (f14 - f23);
        if (f36 <= rectF2.left) {
            f36 = min;
        }
        float min2 = Math.min(min, f36);
        float f37 = (f25 - f18) / f28;
        if (f37 <= rectF2.left) {
            f37 = min2;
        }
        float min3 = Math.min(min2, f37);
        float max4 = Math.max(q, Math.max((f14 * max3) + f16, (f15 * min3) + f17));
        float min4 = Math.min(f34, Math.min((f15 * max3) + f19, (f14 * min3) + f18));
        RectF rectF3 = this.f24425m;
        rectF3.left = max3;
        rectF3.top = max4;
        rectF3.right = min3;
        rectF3.bottom = min4;
        return true;
    }

    /* renamed from: b */
    public final void mo25167b(boolean z) {
        try {
            C8046a aVar = this.f24417e;
            if (aVar != null) {
                CropImageView.C8039a aVar2 = (CropImageView.C8039a) aVar;
                CropImageView cropImageView = CropImageView.this;
                int i = CropImageView.f24365K;
                cropImageView.mo25113c(z, true);
                CropImageView.this.getClass();
                CropImageView.this.getClass();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    public final void mo25168c(Canvas canvas) {
        float f;
        if (this.f24421i != null) {
            Paint paint = this.f24419g;
            if (paint != null) {
                f = paint.getStrokeWidth();
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            RectF a = this.f24416d.mo25200a();
            a.inset(f, f);
            float width = a.width() / 3.0f;
            float height = a.height() / 3.0f;
            if (this.f24411A == CropImageView.CropShape.OVAL) {
                float width2 = (a.width() / 2.0f) - f;
                float height2 = (a.height() / 2.0f) - f;
                float f2 = a.left + width;
                float f3 = a.right - width;
                float sin = (float) (Math.sin(Math.acos((double) ((width2 - width) / width2))) * ((double) height2));
                canvas.drawLine(f2, (a.top + height2) - sin, f2, (a.bottom - height2) + sin, this.f24421i);
                canvas.drawLine(f3, (a.top + height2) - sin, f3, (a.bottom - height2) + sin, this.f24421i);
                float f4 = a.top + height;
                float f5 = a.bottom - height;
                float cos = (float) (Math.cos(Math.asin((double) ((height2 - height) / height2))) * ((double) width2));
                canvas.drawLine((a.left + width2) - cos, f4, (a.right - width2) + cos, f4, this.f24421i);
                canvas.drawLine((a.left + width2) - cos, f5, (a.right - width2) + cos, f5, this.f24421i);
                return;
            }
            float f6 = a.left + width;
            float f7 = a.right - width;
            Canvas canvas2 = canvas;
            canvas2.drawLine(f6, a.top, f6, a.bottom, this.f24421i);
            canvas.drawLine(f7, a.top, f7, a.bottom, this.f24421i);
            float f8 = a.top + height;
            float f9 = a.bottom - height;
            canvas2.drawLine(a.left, f8, a.right, f8, this.f24421i);
            canvas.drawLine(a.left, f9, a.right, f9, this.f24421i);
        }
    }

    /* renamed from: d */
    public final void mo25169d(RectF rectF) {
        float width = rectF.width();
        C8056d dVar = this.f24416d;
        if (width < Math.max(dVar.f24493c, dVar.f24497g / dVar.f24501k)) {
            C8056d dVar2 = this.f24416d;
            float max = (Math.max(dVar2.f24493c, dVar2.f24497g / dVar2.f24501k) - rectF.width()) / 2.0f;
            rectF.left -= max;
            rectF.right += max;
        }
        float height = rectF.height();
        C8056d dVar3 = this.f24416d;
        if (height < Math.max(dVar3.f24494d, dVar3.f24498h / dVar3.f24502l)) {
            C8056d dVar4 = this.f24416d;
            float max2 = (Math.max(dVar4.f24494d, dVar4.f24498h / dVar4.f24502l) - rectF.height()) / 2.0f;
            rectF.top -= max2;
            rectF.bottom += max2;
        }
        float width2 = rectF.width();
        C8056d dVar5 = this.f24416d;
        if (width2 > Math.min(dVar5.f24495e, dVar5.f24499i / dVar5.f24501k)) {
            float width3 = rectF.width();
            C8056d dVar6 = this.f24416d;
            float min = (width3 - Math.min(dVar6.f24495e, dVar6.f24499i / dVar6.f24501k)) / 2.0f;
            rectF.left += min;
            rectF.right -= min;
        }
        float height2 = rectF.height();
        C8056d dVar7 = this.f24416d;
        if (height2 > Math.min(dVar7.f24496f, dVar7.f24500j / dVar7.f24502l)) {
            float height3 = rectF.height();
            C8056d dVar8 = this.f24416d;
            float min2 = (height3 - Math.min(dVar8.f24496f, dVar8.f24500j / dVar8.f24502l)) / 2.0f;
            rectF.top += min2;
            rectF.bottom -= min2;
        }
        mo25166a(rectF);
        if (this.f24425m.width() > BitmapDescriptorFactory.HUE_RED && this.f24425m.height() > BitmapDescriptorFactory.HUE_RED) {
            float max3 = Math.max(this.f24425m.left, BitmapDescriptorFactory.HUE_RED);
            float max4 = Math.max(this.f24425m.top, BitmapDescriptorFactory.HUE_RED);
            float min3 = Math.min(this.f24425m.right, (float) getWidth());
            float min4 = Math.min(this.f24425m.bottom, (float) getHeight());
            if (rectF.left < max3) {
                rectF.left = max3;
            }
            if (rectF.top < max4) {
                rectF.top = max4;
            }
            if (rectF.right > min3) {
                rectF.right = min3;
            }
            if (rectF.bottom > min4) {
                rectF.bottom = min4;
            }
        }
        if (this.f24434v && ((double) Math.abs(rectF.width() - (rectF.height() * this.f24437y))) > 0.1d) {
            if (rectF.width() > rectF.height() * this.f24437y) {
                float abs = Math.abs((rectF.height() * this.f24437y) - rectF.width()) / 2.0f;
                rectF.left += abs;
                rectF.right -= abs;
                return;
            }
            float abs2 = Math.abs((rectF.width() / this.f24437y) - rectF.height()) / 2.0f;
            rectF.top += abs2;
            rectF.bottom -= abs2;
        }
    }

    /* renamed from: f */
    public final void mo25170f() {
        float max = Math.max(C8053c.m18385o(this.f24424l), BitmapDescriptorFactory.HUE_RED);
        float max2 = Math.max(C8053c.m18387q(this.f24424l), BitmapDescriptorFactory.HUE_RED);
        float min = Math.min(C8053c.m18386p(this.f24424l), (float) getWidth());
        float min2 = Math.min(C8053c.m18383m(this.f24424l), (float) getHeight());
        if (min > max && min2 > max2) {
            RectF rectF = new RectF();
            this.f24413C = true;
            float f = this.f24430r;
            float f2 = min - max;
            float f3 = f * f2;
            float f4 = min2 - max2;
            float f5 = f * f4;
            if (this.f24412B.width() > 0 && this.f24412B.height() > 0) {
                Rect rect = this.f24412B;
                C8056d dVar = this.f24416d;
                float f6 = (((float) rect.left) / dVar.f24501k) + max;
                rectF.left = f6;
                rectF.top = (((float) rect.top) / dVar.f24502l) + max2;
                rectF.right = (((float) rect.width()) / this.f24416d.f24501k) + f6;
                rectF.bottom = (((float) this.f24412B.height()) / this.f24416d.f24502l) + rectF.top;
                rectF.left = Math.max(max, rectF.left);
                rectF.top = Math.max(max2, rectF.top);
                rectF.right = Math.min(min, rectF.right);
                rectF.bottom = Math.min(min2, rectF.bottom);
            } else if (!this.f24434v || min <= max || min2 <= max2) {
                rectF.left = max + f3;
                rectF.top = max2 + f5;
                rectF.right = min - f3;
                rectF.bottom = min2 - f5;
            } else if (f2 / f4 > this.f24437y) {
                rectF.top = max2 + f5;
                rectF.bottom = min2 - f5;
                float width = ((float) getWidth()) / 2.0f;
                this.f24437y = ((float) this.f24435w) / ((float) this.f24436x);
                C8056d dVar2 = this.f24416d;
                float max3 = Math.max(Math.max(dVar2.f24493c, dVar2.f24497g / dVar2.f24501k), rectF.height() * this.f24437y) / 2.0f;
                rectF.left = width - max3;
                rectF.right = width + max3;
            } else {
                rectF.left = max + f3;
                rectF.right = min - f3;
                float height = ((float) getHeight()) / 2.0f;
                C8056d dVar3 = this.f24416d;
                float max4 = Math.max(Math.max(dVar3.f24494d, dVar3.f24498h / dVar3.f24502l), rectF.width() / this.f24437y) / 2.0f;
                rectF.top = height - max4;
                rectF.bottom = height + max4;
            }
            mo25169d(rectF);
            this.f24416d.f24491a.set(rectF);
        }
    }

    /* renamed from: g */
    public final void mo25171g(int i, int i2, float[] fArr) {
        if (fArr == null || !Arrays.equals(this.f24424l, fArr)) {
            if (fArr == null) {
                Arrays.fill(this.f24424l, BitmapDescriptorFactory.HUE_RED);
            } else {
                System.arraycopy(fArr, 0, this.f24424l, 0, fArr.length);
            }
            this.f24426n = i;
            this.f24427o = i2;
            RectF a = this.f24416d.mo25200a();
            if (a.width() == BitmapDescriptorFactory.HUE_RED || a.height() == BitmapDescriptorFactory.HUE_RED) {
                mo25170f();
            }
        }
    }

    public int getAspectRatioX() {
        return this.f24435w;
    }

    public int getAspectRatioY() {
        return this.f24436x;
    }

    public CropImageView.CropShape getCropShape() {
        return this.f24411A;
    }

    public RectF getCropWindowRect() {
        return this.f24416d.mo25200a();
    }

    public CropImageView.Guidelines getGuidelines() {
        return this.f24438z;
    }

    public Rect getInitialCropWindowRect() {
        return this.f24412B;
    }

    /* renamed from: h */
    public final boolean mo25178h(boolean z) {
        if (this.f24415c == z) {
            return false;
        }
        this.f24415c = z;
        if (!z || this.f24414b != null) {
            return true;
        }
        this.f24414b = new ScaleGestureDetector(getContext(), new C8047b());
        return true;
    }

    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        boolean z;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        RectF a = this.f24416d.mo25200a();
        float max = Math.max(C8053c.m18385o(this.f24424l), BitmapDescriptorFactory.HUE_RED);
        float max2 = Math.max(C8053c.m18387q(this.f24424l), BitmapDescriptorFactory.HUE_RED);
        float min = Math.min(C8053c.m18386p(this.f24424l), (float) getWidth());
        float min2 = Math.min(C8053c.m18383m(this.f24424l), (float) getHeight());
        CropImageView.CropShape cropShape = this.f24411A;
        CropImageView.CropShape cropShape2 = CropImageView.CropShape.RECTANGLE;
        boolean z2 = false;
        if (cropShape == cropShape2) {
            float[] fArr = this.f24424l;
            if (fArr[0] == fArr[6] || fArr[1] == fArr[7]) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                int i = Build.VERSION.SDK_INT;
                this.f24423k.reset();
                Path path = this.f24423k;
                float[] fArr2 = this.f24424l;
                path.moveTo(fArr2[0], fArr2[1]);
                Path path2 = this.f24423k;
                float[] fArr3 = this.f24424l;
                path2.lineTo(fArr3[2], fArr3[3]);
                Path path3 = this.f24423k;
                float[] fArr4 = this.f24424l;
                path3.lineTo(fArr4[4], fArr4[5]);
                Path path4 = this.f24423k;
                float[] fArr5 = this.f24424l;
                path4.lineTo(fArr5[6], fArr5[7]);
                this.f24423k.close();
                canvas.save();
                if (i >= 26) {
                    canvas2.clipOutPath(this.f24423k);
                } else {
                    canvas2.clipPath(this.f24423k, Region.Op.INTERSECT);
                }
                canvas2.clipRect(a, Region.Op.XOR);
                canvas.drawRect(max, max2, min, min2, this.f24422j);
                canvas.restore();
            } else {
                Canvas canvas3 = canvas;
                float f3 = max;
                float f4 = min;
                canvas3.drawRect(f3, max2, f4, a.top, this.f24422j);
                canvas3.drawRect(f3, a.bottom, f4, min2, this.f24422j);
                canvas3.drawRect(f3, a.top, a.left, a.bottom, this.f24422j);
                canvas3.drawRect(a.right, a.top, min, a.bottom, this.f24422j);
            }
        } else {
            this.f24423k.reset();
            int i2 = Build.VERSION.SDK_INT;
            this.f24418f.set(a.left, a.top, a.right, a.bottom);
            this.f24423k.addOval(this.f24418f, Path.Direction.CW);
            canvas.save();
            if (i2 >= 26) {
                canvas2.clipOutPath(this.f24423k);
            } else {
                canvas2.clipPath(this.f24423k, Region.Op.XOR);
            }
            canvas.drawRect(max, max2, min, min2, this.f24422j);
            canvas.restore();
        }
        C8056d dVar = this.f24416d;
        if (dVar.f24491a.width() >= 100.0f && dVar.f24491a.height() >= 100.0f) {
            z2 = true;
        }
        if (z2) {
            CropImageView.Guidelines guidelines = this.f24438z;
            if (guidelines == CropImageView.Guidelines.ON) {
                mo25168c(canvas);
            } else if (guidelines == CropImageView.Guidelines.ON_TOUCH && this.f24433u != null) {
                mo25168c(canvas);
            }
        }
        Paint paint = this.f24419g;
        if (paint != null) {
            float strokeWidth = paint.getStrokeWidth();
            RectF a2 = this.f24416d.mo25200a();
            float f5 = strokeWidth / 2.0f;
            a2.inset(f5, f5);
            if (this.f24411A == cropShape2) {
                canvas2.drawRect(a2, this.f24419g);
            } else {
                canvas2.drawOval(a2, this.f24419g);
            }
        }
        if (this.f24420h != null) {
            Paint paint2 = this.f24419g;
            if (paint2 != null) {
                f = paint2.getStrokeWidth();
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            float strokeWidth2 = this.f24420h.getStrokeWidth();
            float f6 = strokeWidth2 / 2.0f;
            if (this.f24411A == cropShape2) {
                f2 = this.f24428p;
            } else {
                f2 = BitmapDescriptorFactory.HUE_RED;
            }
            float f7 = f2 + f6;
            RectF a3 = this.f24416d.mo25200a();
            a3.inset(f7, f7);
            float f8 = (strokeWidth2 - f) / 2.0f;
            float f9 = f6 + f8;
            float f11 = a3.left - f8;
            float f12 = a3.top;
            canvas.drawLine(f11, f12 - f9, f11, f12 + this.f24429q, this.f24420h);
            float f13 = a3.left;
            float f14 = a3.top - f8;
            canvas.drawLine(f13 - f9, f14, f13 + this.f24429q, f14, this.f24420h);
            float f15 = a3.right + f8;
            float f16 = a3.top;
            canvas.drawLine(f15, f16 - f9, f15, f16 + this.f24429q, this.f24420h);
            float f17 = a3.right;
            float f18 = a3.top - f8;
            canvas.drawLine(f17 + f9, f18, f17 - this.f24429q, f18, this.f24420h);
            float f19 = a3.left - f8;
            float f21 = a3.bottom;
            canvas.drawLine(f19, f21 + f9, f19, f21 - this.f24429q, this.f24420h);
            float f22 = a3.left;
            float f23 = a3.bottom + f8;
            canvas.drawLine(f22 - f9, f23, f22 + this.f24429q, f23, this.f24420h);
            float f24 = a3.right + f8;
            float f25 = a3.bottom;
            canvas.drawLine(f24, f25 + f9, f24, f25 - this.f24429q, this.f24420h);
            float f26 = a3.right;
            float f27 = a3.bottom + f8;
            canvas.drawLine(f26 + f9, f27, f26 - this.f24429q, f27, this.f24420h);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        if (r11 <= r14.right) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
        if (r11 <= r14.bottom) goto L_0x00b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        /*
            r21 = this;
            r0 = r21
            boolean r1 = r21.isEnabled()
            r2 = 0
            if (r1 == 0) goto L_0x04f4
            boolean r1 = r0.f24415c
            if (r1 == 0) goto L_0x0015
            android.view.ScaleGestureDetector r1 = r0.f24414b
            r3 = r22
            r1.onTouchEvent(r3)
            goto L_0x0017
        L_0x0015:
            r3 = r22
        L_0x0017:
            int r1 = r22.getAction()
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x032a
            if (r1 == r5) goto L_0x0316
            r6 = 2
            if (r1 == r6) goto L_0x0028
            r3 = 3
            if (r1 == r3) goto L_0x0316
            return r2
        L_0x0028:
            float r1 = r22.getX()
            float r2 = r22.getY()
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler r3 = r0.f24433u
            if (r3 == 0) goto L_0x030e
            float r3 = r0.f24432t
            com.theartofdev.edmodo.cropper.d r4 = r0.f24416d
            android.graphics.RectF r4 = r4.mo25200a()
            boolean r6 = r0.mo25166a(r4)
            r7 = 0
            if (r6 == 0) goto L_0x0044
            r3 = 0
        L_0x0044:
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler r15 = r0.f24433u
            android.graphics.RectF r14 = r0.f24425m
            int r13 = r0.f24426n
            int r10 = r0.f24427o
            boolean r6 = r0.f24434v
            float r12 = r0.f24437y
            android.graphics.PointF r8 = r15.f24445f
            float r9 = r8.x
            float r1 = r1 + r9
            float r8 = r8.y
            float r8 = r8 + r2
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r2 = r15.f24444e
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r9 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.CENTER
            if (r2 != r9) goto L_0x00f4
            float r2 = r4.centerX()
            float r1 = r1 - r2
            float r2 = r4.centerY()
            float r8 = r8 - r2
            float r2 = r4.left
            float r2 = r2 + r1
            r6 = 1073741824(0x40000000, float:2.0)
            r9 = 1065772646(0x3f866666, float:1.05)
            int r11 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r11 < 0) goto L_0x0088
            float r11 = r4.right
            float r11 = r11 + r1
            float r12 = (float) r13
            int r12 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
            if (r12 > 0) goto L_0x0088
            float r12 = r14.left
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 < 0) goto L_0x0088
            float r2 = r14.right
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0092
        L_0x0088:
            float r1 = r1 / r9
            android.graphics.PointF r2 = r15.f24445f
            float r11 = r2.x
            float r12 = r1 / r6
            float r11 = r11 - r12
            r2.x = r11
        L_0x0092:
            float r2 = r4.top
            float r2 = r2 + r8
            int r11 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r11 < 0) goto L_0x00ad
            float r11 = r4.bottom
            float r11 = r11 + r8
            float r10 = (float) r10
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 > 0) goto L_0x00ad
            float r10 = r14.top
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 < 0) goto L_0x00ad
            float r2 = r14.bottom
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x00b7
        L_0x00ad:
            float r8 = r8 / r9
            android.graphics.PointF r2 = r15.f24445f
            float r9 = r2.y
            float r6 = r8 / r6
            float r9 = r9 - r6
            r2.y = r9
        L_0x00b7:
            r4.offset(r1, r8)
            float r1 = r4.left
            float r2 = r14.left
            float r6 = r2 + r3
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x00c8
            float r2 = r2 - r1
            r4.offset(r2, r7)
        L_0x00c8:
            float r1 = r4.top
            float r2 = r14.top
            float r6 = r2 + r3
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x00d6
            float r2 = r2 - r1
            r4.offset(r7, r2)
        L_0x00d6:
            float r1 = r4.right
            float r2 = r14.right
            float r6 = r2 - r3
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x00e4
            float r2 = r2 - r1
            r4.offset(r2, r7)
        L_0x00e4:
            float r1 = r4.bottom
            float r2 = r14.bottom
            float r3 = r2 - r3
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x0301
            float r2 = r2 - r1
            r4.offset(r7, r2)
            goto L_0x0301
        L_0x00f4:
            if (r6 == 0) goto L_0x024a
            int[] r6 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.C8048a.f24446a
            int r2 = r2.ordinal()
            r2 = r6[r2]
            switch(r2) {
                case 1: goto L_0x0210;
                case 2: goto L_0x01ce;
                case 3: goto L_0x0192;
                case 4: goto L_0x014e;
                case 5: goto L_0x013d;
                case 6: goto L_0x012c;
                case 7: goto L_0x0114;
                case 8: goto L_0x0103;
                default: goto L_0x0101;
            }
        L_0x0101:
            goto L_0x0301
        L_0x0103:
            r13 = 1
            r1 = 1
            r6 = r15
            r7 = r4
            r9 = r14
            r11 = r3
            r2 = r12
            r3 = r14
            r14 = r1
            r6.mo25192a(r7, r8, r9, r10, r11, r12, r13, r14)
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler.m18365c(r4, r3, r2)
            goto L_0x0301
        L_0x0114:
            r2 = r12
            r16 = 1
            r17 = 1
            r6 = r15
            r7 = r4
            r8 = r1
            r9 = r14
            r10 = r13
            r11 = r3
            r13 = r16
            r1 = r14
            r14 = r17
            r6.mo25194d(r7, r8, r9, r10, r11, r12, r13, r14)
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler.m18366f(r4, r1, r2)
            goto L_0x0301
        L_0x012c:
            r2 = r12
            r1 = r14
            r12 = 1
            r13 = 1
            r6 = r15
            r7 = r4
            r9 = r1
            r10 = r3
            r11 = r2
            r6.mo25195e(r7, r8, r9, r10, r11, r12, r13)
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler.m18365c(r4, r1, r2)
            goto L_0x0301
        L_0x013d:
            r2 = r12
            r12 = 1
            r13 = 1
            r6 = r15
            r7 = r4
            r8 = r1
            r9 = r14
            r10 = r3
            r11 = r2
            r6.mo25193b(r7, r8, r9, r10, r11, r12, r13)
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler.m18366f(r4, r14, r2)
            goto L_0x0301
        L_0x014e:
            r2 = r12
            float r6 = r4.left
            float r7 = r4.top
            float r6 = r1 - r6
            float r7 = r8 - r7
            float r6 = r6 / r7
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0174
            r13 = 0
            r1 = 1
            r6 = r15
            r7 = r4
            r9 = r14
            r11 = r3
            r12 = r2
            r14 = r1
            r6.mo25192a(r7, r8, r9, r10, r11, r12, r13, r14)
            float r1 = r4.left
            float r3 = r4.height()
            float r3 = r3 * r2
            float r3 = r3 + r1
            r4.right = r3
            goto L_0x0301
        L_0x0174:
            r16 = 0
            r17 = 1
            r6 = r15
            r7 = r4
            r8 = r1
            r9 = r14
            r10 = r13
            r11 = r3
            r12 = r2
            r13 = r16
            r14 = r17
            r6.mo25194d(r7, r8, r9, r10, r11, r12, r13, r14)
            float r1 = r4.top
            float r3 = r4.width()
            float r3 = r3 / r2
            float r3 = r3 + r1
            r4.bottom = r3
            goto L_0x0301
        L_0x0192:
            r2 = r12
            float r6 = r4.top
            float r7 = r4.right
            float r7 = r7 - r1
            float r6 = r8 - r6
            float r7 = r7 / r6
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x01b7
            r13 = 1
            r1 = 0
            r6 = r15
            r7 = r4
            r9 = r14
            r11 = r3
            r12 = r2
            r14 = r1
            r6.mo25192a(r7, r8, r9, r10, r11, r12, r13, r14)
            float r1 = r4.right
            float r3 = r4.height()
            float r3 = r3 * r2
            float r1 = r1 - r3
            r4.left = r1
            goto L_0x0301
        L_0x01b7:
            r12 = 0
            r13 = 1
            r6 = r15
            r7 = r4
            r8 = r1
            r9 = r14
            r10 = r3
            r11 = r2
            r6.mo25193b(r7, r8, r9, r10, r11, r12, r13)
            float r1 = r4.top
            float r3 = r4.width()
            float r3 = r3 / r2
            float r3 = r3 + r1
            r4.bottom = r3
            goto L_0x0301
        L_0x01ce:
            r2 = r12
            float r6 = r4.left
            float r7 = r4.bottom
            float r6 = r1 - r6
            float r7 = r7 - r8
            float r6 = r6 / r7
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x01f2
            r12 = 0
            r13 = 1
            r6 = r15
            r7 = r4
            r9 = r14
            r10 = r3
            r11 = r2
            r6.mo25195e(r7, r8, r9, r10, r11, r12, r13)
            float r1 = r4.left
            float r3 = r4.height()
            float r3 = r3 * r2
            float r3 = r3 + r1
            r4.right = r3
            goto L_0x0301
        L_0x01f2:
            r16 = 1
            r17 = 0
            r6 = r15
            r7 = r4
            r8 = r1
            r9 = r14
            r10 = r13
            r11 = r3
            r12 = r2
            r13 = r16
            r14 = r17
            r6.mo25194d(r7, r8, r9, r10, r11, r12, r13, r14)
            float r1 = r4.bottom
            float r3 = r4.width()
            float r3 = r3 / r2
            float r1 = r1 - r3
            r4.top = r1
            goto L_0x0301
        L_0x0210:
            r2 = r12
            float r6 = r4.right
            float r7 = r4.bottom
            float r6 = r6 - r1
            float r7 = r7 - r8
            float r6 = r6 / r7
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0233
            r12 = 1
            r13 = 0
            r6 = r15
            r7 = r4
            r9 = r14
            r10 = r3
            r11 = r2
            r6.mo25195e(r7, r8, r9, r10, r11, r12, r13)
            float r1 = r4.right
            float r3 = r4.height()
            float r3 = r3 * r2
            float r1 = r1 - r3
            r4.left = r1
            goto L_0x0301
        L_0x0233:
            r12 = 1
            r13 = 0
            r6 = r15
            r7 = r4
            r8 = r1
            r9 = r14
            r10 = r3
            r11 = r2
            r6.mo25193b(r7, r8, r9, r10, r11, r12, r13)
            float r1 = r4.bottom
            float r3 = r4.width()
            float r3 = r3 / r2
            float r1 = r1 - r3
            r4.top = r1
            goto L_0x0301
        L_0x024a:
            int[] r6 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.C8048a.f24446a
            int r2 = r2.ordinal()
            r2 = r6[r2]
            switch(r2) {
                case 1: goto L_0x02e8;
                case 2: goto L_0x02cd;
                case 3: goto L_0x02b6;
                case 4: goto L_0x028f;
                case 5: goto L_0x0282;
                case 6: goto L_0x0276;
                case 7: goto L_0x0264;
                case 8: goto L_0x0257;
                default: goto L_0x0255;
            }
        L_0x0255:
            goto L_0x0301
        L_0x0257:
            r12 = 0
            r13 = 0
            r1 = 0
            r6 = r15
            r7 = r4
            r9 = r14
            r11 = r3
            r14 = r1
            r6.mo25192a(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0301
        L_0x0264:
            r12 = 0
            r2 = 0
            r16 = 0
            r6 = r15
            r7 = r4
            r8 = r1
            r9 = r14
            r10 = r13
            r11 = r3
            r13 = r2
            r14 = r16
            r6.mo25194d(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0301
        L_0x0276:
            r11 = 0
            r12 = 0
            r13 = 0
            r6 = r15
            r7 = r4
            r9 = r14
            r10 = r3
            r6.mo25195e(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0301
        L_0x0282:
            r11 = 0
            r12 = 0
            r13 = 0
            r6 = r15
            r7 = r4
            r8 = r1
            r9 = r14
            r10 = r3
            r6.mo25193b(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0301
        L_0x028f:
            r2 = 0
            r16 = 0
            r17 = 0
            r12 = 0
            r18 = 0
            r19 = 0
            r6 = r15
            r7 = r4
            r9 = r14
            r11 = r3
            r20 = r13
            r13 = r18
            r18 = r14
            r14 = r19
            r6.mo25192a(r7, r8, r9, r10, r11, r12, r13, r14)
            r8 = r1
            r9 = r18
            r10 = r20
            r12 = r2
            r13 = r16
            r14 = r17
            r6.mo25194d(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0301
        L_0x02b6:
            r18 = r14
            r12 = 0
            r2 = 0
            r14 = 0
            r13 = 0
            r6 = r15
            r7 = r4
            r9 = r18
            r11 = r3
            r6.mo25192a(r7, r8, r9, r10, r11, r12, r13, r14)
            r11 = 0
            r12 = 0
            r8 = r1
            r10 = r3
            r13 = r2
            r6.mo25193b(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0301
        L_0x02cd:
            r20 = r13
            r18 = r14
            r11 = 0
            r12 = 0
            r2 = 0
            r13 = 0
            r6 = r15
            r7 = r4
            r9 = r18
            r10 = r3
            r6.mo25195e(r7, r8, r9, r10, r11, r12, r13)
            r12 = 0
            r14 = 0
            r8 = r1
            r10 = r20
            r11 = r3
            r13 = r2
            r6.mo25194d(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0301
        L_0x02e8:
            r18 = r14
            r2 = 0
            r14 = 0
            r16 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r6 = r15
            r7 = r4
            r9 = r18
            r10 = r3
            r6.mo25195e(r7, r8, r9, r10, r11, r12, r13)
            r8 = r1
            r11 = r2
            r12 = r14
            r13 = r16
            r6.mo25193b(r7, r8, r9, r10, r11, r12, r13)
        L_0x0301:
            com.theartofdev.edmodo.cropper.d r1 = r0.f24416d
            android.graphics.RectF r1 = r1.f24491a
            r1.set(r4)
            r0.mo25167b(r5)
            r21.invalidate()
        L_0x030e:
            android.view.ViewParent r1 = r21.getParent()
            r1.requestDisallowInterceptTouchEvent(r5)
            return r5
        L_0x0316:
            android.view.ViewParent r1 = r21.getParent()
            r1.requestDisallowInterceptTouchEvent(r2)
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler r1 = r0.f24433u
            if (r1 == 0) goto L_0x0329
            r0.f24433u = r4
            r0.mo25167b(r2)
            r21.invalidate()
        L_0x0329:
            return r5
        L_0x032a:
            float r1 = r22.getX()
            float r3 = r22.getY()
            com.theartofdev.edmodo.cropper.d r6 = r0.f24416d
            float r7 = r0.f24431s
            com.theartofdev.edmodo.cropper.CropImageView$CropShape r8 = r0.f24411A
            r6.getClass()
            com.theartofdev.edmodo.cropper.CropImageView$CropShape r9 = com.theartofdev.edmodo.cropper.CropImageView.CropShape.OVAL
            if (r8 != r9) goto L_0x03a5
            android.graphics.RectF r2 = r6.f24491a
            float r2 = r2.width()
            r7 = 1086324736(0x40c00000, float:6.0)
            float r2 = r2 / r7
            android.graphics.RectF r8 = r6.f24491a
            float r9 = r8.left
            float r10 = r9 + r2
            r11 = 1084227584(0x40a00000, float:5.0)
            float r2 = r2 * r11
            float r2 = r2 + r9
            float r8 = r8.height()
            float r8 = r8 / r7
            android.graphics.RectF r7 = r6.f24491a
            float r7 = r7.top
            float r9 = r7 + r8
            float r8 = r8 * r11
            float r8 = r8 + r7
            int r7 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x0379
            int r2 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x036d
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r2 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.TOP_LEFT
            goto L_0x04e5
        L_0x036d:
            int r2 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x0375
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r2 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.LEFT
            goto L_0x04e5
        L_0x0375:
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r2 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.BOTTOM_LEFT
            goto L_0x04e5
        L_0x0379:
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0391
            int r2 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x0385
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r2 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.TOP
            goto L_0x04e5
        L_0x0385:
            int r2 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x038d
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r2 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.CENTER
            goto L_0x04e5
        L_0x038d:
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r2 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.BOTTOM
            goto L_0x04e5
        L_0x0391:
            int r2 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x0399
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r2 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.TOP_RIGHT
            goto L_0x04e5
        L_0x0399:
            int r2 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x03a1
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r2 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.RIGHT
            goto L_0x04e5
        L_0x03a1:
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r2 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.BOTTOM_RIGHT
            goto L_0x04e5
        L_0x03a5:
            android.graphics.RectF r8 = r6.f24491a
            float r9 = r8.left
            float r8 = r8.top
            boolean r8 = com.theartofdev.edmodo.cropper.C8056d.m18389b(r1, r3, r9, r8, r7)
            if (r8 == 0) goto L_0x03b5
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r2 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.TOP_LEFT
            goto L_0x04e5
        L_0x03b5:
            android.graphics.RectF r8 = r6.f24491a
            float r9 = r8.right
            float r8 = r8.top
            boolean r8 = com.theartofdev.edmodo.cropper.C8056d.m18389b(r1, r3, r9, r8, r7)
            if (r8 == 0) goto L_0x03c5
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r2 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.TOP_RIGHT
            goto L_0x04e5
        L_0x03c5:
            android.graphics.RectF r8 = r6.f24491a
            float r9 = r8.left
            float r8 = r8.bottom
            boolean r8 = com.theartofdev.edmodo.cropper.C8056d.m18389b(r1, r3, r9, r8, r7)
            if (r8 == 0) goto L_0x03d5
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r2 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.BOTTOM_LEFT
            goto L_0x04e5
        L_0x03d5:
            android.graphics.RectF r8 = r6.f24491a
            float r9 = r8.right
            float r8 = r8.bottom
            boolean r8 = com.theartofdev.edmodo.cropper.C8056d.m18389b(r1, r3, r9, r8, r7)
            if (r8 == 0) goto L_0x03e5
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r2 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.BOTTOM_RIGHT
            goto L_0x04e5
        L_0x03e5:
            android.graphics.RectF r8 = r6.f24491a
            float r9 = r8.left
            float r10 = r8.top
            float r11 = r8.right
            float r12 = r8.bottom
            int r9 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x0401
            int r9 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x0401
            int r9 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x0401
            int r9 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r9 >= 0) goto L_0x0401
            r9 = 1
            goto L_0x0402
        L_0x0401:
            r9 = 0
        L_0x0402:
            r10 = 1120403456(0x42c80000, float:100.0)
            if (r9 == 0) goto L_0x0422
            float r8 = r8.width()
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 < 0) goto L_0x041a
            android.graphics.RectF r8 = r6.f24491a
            float r8 = r8.height()
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 < 0) goto L_0x041a
            r8 = 1
            goto L_0x041b
        L_0x041a:
            r8 = 0
        L_0x041b:
            r8 = r8 ^ r5
            if (r8 == 0) goto L_0x0422
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r2 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.CENTER
            goto L_0x04e5
        L_0x0422:
            android.graphics.RectF r8 = r6.f24491a
            float r9 = r8.left
            float r11 = r8.right
            float r8 = r8.top
            int r9 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x043e
            int r9 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x043e
            float r8 = r3 - r8
            float r8 = java.lang.Math.abs(r8)
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 > 0) goto L_0x043e
            r8 = 1
            goto L_0x043f
        L_0x043e:
            r8 = 0
        L_0x043f:
            if (r8 == 0) goto L_0x0445
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r2 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.TOP
            goto L_0x04e5
        L_0x0445:
            android.graphics.RectF r8 = r6.f24491a
            float r9 = r8.left
            float r11 = r8.right
            float r8 = r8.bottom
            int r9 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r9 <= 0) goto L_0x0461
            int r9 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x0461
            float r8 = r3 - r8
            float r8 = java.lang.Math.abs(r8)
            int r8 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r8 > 0) goto L_0x0461
            r8 = 1
            goto L_0x0462
        L_0x0461:
            r8 = 0
        L_0x0462:
            if (r8 == 0) goto L_0x0468
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r2 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.BOTTOM
            goto L_0x04e5
        L_0x0468:
            android.graphics.RectF r8 = r6.f24491a
            float r9 = r8.left
            float r11 = r8.top
            float r8 = r8.bottom
            float r9 = r1 - r9
            float r9 = java.lang.Math.abs(r9)
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x0484
            int r9 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x0484
            int r8 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r8 >= 0) goto L_0x0484
            r8 = 1
            goto L_0x0485
        L_0x0484:
            r8 = 0
        L_0x0485:
            if (r8 == 0) goto L_0x048a
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r2 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.LEFT
            goto L_0x04e5
        L_0x048a:
            android.graphics.RectF r8 = r6.f24491a
            float r9 = r8.right
            float r11 = r8.top
            float r8 = r8.bottom
            float r9 = r1 - r9
            float r9 = java.lang.Math.abs(r9)
            int r7 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x04a6
            int r7 = (r3 > r11 ? 1 : (r3 == r11 ? 0 : -1))
            if (r7 <= 0) goto L_0x04a6
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x04a6
            r7 = 1
            goto L_0x04a7
        L_0x04a6:
            r7 = 0
        L_0x04a7:
            if (r7 == 0) goto L_0x04ac
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r2 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.RIGHT
            goto L_0x04e5
        L_0x04ac:
            android.graphics.RectF r7 = r6.f24491a
            float r8 = r7.left
            float r9 = r7.top
            float r11 = r7.right
            float r12 = r7.bottom
            int r8 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x04c8
            int r8 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r8 >= 0) goto L_0x04c8
            int r8 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x04c8
            int r8 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r8 >= 0) goto L_0x04c8
            r8 = 1
            goto L_0x04c9
        L_0x04c8:
            r8 = 0
        L_0x04c9:
            if (r8 == 0) goto L_0x04e4
            float r7 = r7.width()
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 < 0) goto L_0x04de
            android.graphics.RectF r7 = r6.f24491a
            float r7 = r7.height()
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 < 0) goto L_0x04de
            r2 = 1
        L_0x04de:
            r2 = r2 ^ r5
            if (r2 != 0) goto L_0x04e4
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r2 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.CENTER
            goto L_0x04e5
        L_0x04e4:
            r2 = r4
        L_0x04e5:
            if (r2 == 0) goto L_0x04ec
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler r4 = new com.theartofdev.edmodo.cropper.CropWindowMoveHandler
            r4.<init>(r2, r6, r1, r3)
        L_0x04ec:
            r0.f24433u = r4
            if (r4 == 0) goto L_0x04f3
            r21.invalidate()
        L_0x04f3:
            return r5
        L_0x04f4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.CropOverlayView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAspectRatioX(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        } else if (this.f24435w != i) {
            this.f24435w = i;
            this.f24437y = ((float) i) / ((float) this.f24436x);
            if (this.f24413C) {
                mo25170f();
                invalidate();
            }
        }
    }

    public void setAspectRatioY(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        } else if (this.f24436x != i) {
            this.f24436x = i;
            this.f24437y = ((float) this.f24435w) / ((float) i);
            if (this.f24413C) {
                mo25170f();
                invalidate();
            }
        }
    }

    public void setCropShape(CropImageView.CropShape cropShape) {
        if (this.f24411A != cropShape) {
            this.f24411A = cropShape;
            invalidate();
        }
    }

    public void setCropWindowChangeListener(C8046a aVar) {
        this.f24417e = aVar;
    }

    public void setCropWindowRect(RectF rectF) {
        this.f24416d.f24491a.set(rectF);
    }

    public void setFixedAspectRatio(boolean z) {
        if (this.f24434v != z) {
            this.f24434v = z;
            if (this.f24413C) {
                mo25170f();
                invalidate();
            }
        }
    }

    public void setGuidelines(CropImageView.Guidelines guidelines) {
        if (this.f24438z != guidelines) {
            this.f24438z = guidelines;
            if (this.f24413C) {
                invalidate();
            }
        }
    }

    public void setInitialAttributeValues(CropImageOptions cropImageOptions) {
        C8056d dVar = this.f24416d;
        dVar.getClass();
        dVar.f24493c = (float) cropImageOptions.f24363y;
        dVar.f24494d = (float) cropImageOptions.f24364z;
        dVar.f24497g = (float) cropImageOptions.f24317A;
        dVar.f24498h = (float) cropImageOptions.f24318B;
        dVar.f24499i = (float) cropImageOptions.f24319C;
        dVar.f24500j = (float) cropImageOptions.f24320D;
        setCropShape(cropImageOptions.f24340b);
        setSnapRadius(cropImageOptions.f24341c);
        setGuidelines(cropImageOptions.f24343e);
        setFixedAspectRatio(cropImageOptions.f24351m);
        setAspectRatioX(cropImageOptions.f24352n);
        setAspectRatioY(cropImageOptions.f24353o);
        mo25178h(cropImageOptions.f24348j);
        this.f24431s = cropImageOptions.f24342d;
        this.f24430r = cropImageOptions.f24350l;
        this.f24419g = m18357e(cropImageOptions.f24354p, cropImageOptions.f24355q);
        this.f24428p = cropImageOptions.f24357s;
        this.f24429q = cropImageOptions.f24358t;
        this.f24420h = m18357e(cropImageOptions.f24356r, cropImageOptions.f24359u);
        this.f24421i = m18357e(cropImageOptions.f24360v, cropImageOptions.f24361w);
        int i = cropImageOptions.f24362x;
        Paint paint = new Paint();
        paint.setColor(i);
        this.f24422j = paint;
    }

    public void setInitialCropWindowRect(Rect rect) {
        Rect rect2 = this.f24412B;
        if (rect == null) {
            rect = C8053c.f24480a;
        }
        rect2.set(rect);
        if (this.f24413C) {
            mo25170f();
            invalidate();
            mo25167b(false);
        }
    }

    public void setSnapRadius(float f) {
        this.f24432t = f;
    }
}
