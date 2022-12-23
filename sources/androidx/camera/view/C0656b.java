package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import androidx.camera.view.PreviewView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import mf0.C24361g;
import p054d0.C4289j0;
import p176n0.C5798p;

/* renamed from: androidx.camera.view.b */
public final class C0656b {

    /* renamed from: g */
    public static final PreviewView.ScaleType f2257g = PreviewView.ScaleType.FILL_CENTER;

    /* renamed from: a */
    public Size f2258a;

    /* renamed from: b */
    public Rect f2259b;

    /* renamed from: c */
    public int f2260c;

    /* renamed from: d */
    public int f2261d;

    /* renamed from: e */
    public boolean f2262e;

    /* renamed from: f */
    public PreviewView.ScaleType f2263f = f2257g;

    /* renamed from: androidx.camera.view.b$a */
    public static /* synthetic */ class C0657a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2264a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.camera.view.PreviewView$ScaleType[] r0 = androidx.camera.view.PreviewView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f2264a = r0
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f2264a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FILL_CENTER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f2264a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f2264a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FILL_END     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f2264a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f2264a     // Catch:{ NoSuchFieldError -> 0x0049 }
                androidx.camera.view.PreviewView$ScaleType r1 = androidx.camera.view.PreviewView.ScaleType.FILL_START     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.view.C0656b.C0657a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public final void mo2636a(Size size, int i) {
        if (mo2641f()) {
            Matrix matrix = new Matrix();
            mo2638c(size, i).invert(matrix);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f2258a.getWidth(), (float) this.f2258a.getHeight()), new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
            matrix.postConcat(matrix2);
        }
    }

    /* renamed from: b */
    public final Size mo2637b() {
        if (C5798p.m14226a(this.f2260c)) {
            return new Size(this.f2259b.height(), this.f2259b.width());
        }
        return new Size(this.f2259b.width(), this.f2259b.height());
    }

    /* renamed from: c */
    public final Matrix mo2638c(Size size, int i) {
        boolean z;
        RectF rectF;
        Matrix.ScaleToFit scaleToFit;
        C24361g.m61193w((String) null, mo2641f());
        Size b = mo2637b();
        float width = ((float) size.getWidth()) / ((float) size.getHeight());
        float width2 = (((float) b.getWidth()) + 1.0f) / (((float) b.getHeight()) - 1.0f);
        float width3 = (((float) b.getWidth()) - 1.0f) / (((float) b.getHeight()) + 1.0f);
        boolean z2 = false;
        if (width < width3 || width2 < width) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) size.getWidth(), (float) size.getHeight());
        } else {
            RectF rectF2 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) size.getWidth(), (float) size.getHeight());
            Size b2 = mo2637b();
            RectF rectF3 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) b2.getWidth(), (float) b2.getHeight());
            Matrix matrix = new Matrix();
            PreviewView.ScaleType scaleType = this.f2263f;
            switch (C0657a.f2264a[scaleType.ordinal()]) {
                case 1:
                case 2:
                    scaleToFit = Matrix.ScaleToFit.CENTER;
                    break;
                case 3:
                case 4:
                    scaleToFit = Matrix.ScaleToFit.END;
                    break;
                case 5:
                case 6:
                    scaleToFit = Matrix.ScaleToFit.START;
                    break;
                default:
                    scaleType.toString();
                    C4289j0.m11435b("PreviewTransform");
                    scaleToFit = Matrix.ScaleToFit.FILL;
                    break;
            }
            if (scaleType == PreviewView.ScaleType.FIT_CENTER || scaleType == PreviewView.ScaleType.FIT_START || scaleType == PreviewView.ScaleType.FIT_END) {
                z2 = true;
            }
            if (z2) {
                matrix.setRectToRect(rectF3, rectF2, scaleToFit);
            } else {
                matrix.setRectToRect(rectF2, rectF3, scaleToFit);
                matrix.invert(matrix);
            }
            matrix.mapRect(rectF3);
            if (i == 1) {
                float width4 = ((float) size.getWidth()) / 2.0f;
                float f = width4 + width4;
                rectF = new RectF(f - rectF3.right, rectF3.top, f - rectF3.left, rectF3.bottom);
            } else {
                rectF = rectF3;
            }
        }
        RectF rectF4 = new RectF(this.f2259b);
        int i2 = this.f2260c;
        Matrix matrix2 = new Matrix();
        RectF rectF5 = C5798p.f18752a;
        matrix2.setRectToRect(rectF4, rectF5, Matrix.ScaleToFit.FILL);
        matrix2.postRotate((float) i2);
        Matrix matrix3 = new Matrix();
        matrix3.setRectToRect(rectF5, rectF, Matrix.ScaleToFit.FILL);
        matrix2.postConcat(matrix3);
        if (this.f2262e) {
            if (C5798p.m14226a(this.f2260c)) {
                matrix2.preScale(1.0f, -1.0f, (float) this.f2259b.centerX(), (float) this.f2259b.centerY());
            } else {
                matrix2.preScale(-1.0f, 1.0f, (float) this.f2259b.centerX(), (float) this.f2259b.centerY());
            }
        }
        return matrix2;
    }

    /* renamed from: d */
    public final Matrix mo2639d() {
        int i;
        C24361g.m61193w((String) null, mo2641f());
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f2258a.getWidth(), (float) this.f2258a.getHeight());
        int i2 = this.f2261d;
        RectF rectF2 = C5798p.f18752a;
        if (i2 == 0) {
            i = 0;
        } else if (i2 == 1) {
            i = 90;
        } else if (i2 == 2) {
            i = 180;
        } else if (i2 == 3) {
            i = 270;
        } else {
            throw new IllegalStateException(C16759e.m42349e("Unexpected rotation value ", i2));
        }
        Matrix matrix = new Matrix();
        RectF rectF3 = C5798p.f18752a;
        matrix.setRectToRect(rectF, rectF3, Matrix.ScaleToFit.FILL);
        matrix.postRotate((float) (-i));
        Matrix matrix2 = new Matrix();
        matrix2.setRectToRect(rectF3, rectF, Matrix.ScaleToFit.FILL);
        matrix.postConcat(matrix2);
        return matrix;
    }

    /* renamed from: e */
    public final RectF mo2640e(Size size, int i) {
        C24361g.m61193w((String) null, mo2641f());
        Matrix c = mo2638c(size, i);
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) this.f2258a.getWidth(), (float) this.f2258a.getHeight());
        c.mapRect(rectF);
        return rectF;
    }

    /* renamed from: f */
    public final boolean mo2641f() {
        return (this.f2259b == null || this.f2258a == null || this.f2261d == -1) ? false : true;
    }
}
