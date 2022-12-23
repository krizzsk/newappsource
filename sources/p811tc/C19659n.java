package p811tc;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import p787sc.C19444a;

/* renamed from: tc.n */
public final class C19659n {
    @Deprecated

    /* renamed from: a */
    public float f49926a;
    @Deprecated

    /* renamed from: b */
    public float f49927b;
    @Deprecated

    /* renamed from: c */
    public float f49928c;
    @Deprecated

    /* renamed from: d */
    public float f49929d;
    @Deprecated

    /* renamed from: e */
    public float f49930e;
    @Deprecated

    /* renamed from: f */
    public float f49931f;

    /* renamed from: g */
    public final ArrayList f49932g = new ArrayList();

    /* renamed from: h */
    public final ArrayList f49933h = new ArrayList();

    /* renamed from: tc.n$a */
    public static class C19660a extends C19665f {

        /* renamed from: b */
        public final C19662c f49934b;

        public C19660a(C19662c cVar) {
            this.f49934b = cVar;
        }

        /* renamed from: a */
        public final void mo52030a(Matrix matrix, C19444a aVar, int i, Canvas canvas) {
            boolean z;
            C19444a aVar2 = aVar;
            int i2 = i;
            Canvas canvas2 = canvas;
            C19662c cVar = this.f49934b;
            float f = cVar.f49943f;
            float f2 = cVar.f49944g;
            C19662c cVar2 = this.f49934b;
            RectF rectF = new RectF(cVar2.f49939b, cVar2.f49940c, cVar2.f49941d, cVar2.f49942e);
            if (f2 < BitmapDescriptorFactory.HUE_RED) {
                z = true;
            } else {
                z = false;
            }
            Path path = aVar2.f49464g;
            if (z) {
                int[] iArr = C19444a.f49456k;
                iArr[0] = 0;
                iArr[1] = aVar2.f49463f;
                iArr[2] = aVar2.f49462e;
                iArr[3] = aVar2.f49461d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f, f2);
                path.close();
                float f3 = (float) (-i2);
                rectF.inset(f3, f3);
                int[] iArr2 = C19444a.f49456k;
                iArr2[0] = 0;
                iArr2[1] = aVar2.f49461d;
                iArr2[2] = aVar2.f49462e;
                iArr2[3] = aVar2.f49463f;
            }
            float width = rectF.width() / 2.0f;
            if (width > BitmapDescriptorFactory.HUE_RED) {
                float f4 = 1.0f - (((float) i2) / width);
                float[] fArr = C19444a.f49457l;
                fArr[1] = f4;
                fArr[2] = ((1.0f - f4) / 2.0f) + f4;
                aVar2.f49459b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, C19444a.f49456k, fArr, Shader.TileMode.CLAMP));
                canvas.save();
                canvas2.concat(matrix);
                canvas2.scale(1.0f, rectF.height() / rectF.width());
                if (!z) {
                    canvas2.clipPath(path, Region.Op.DIFFERENCE);
                    canvas2.drawPath(path, aVar2.f49465h);
                }
                canvas.drawArc(rectF, f, f2, true, aVar2.f49459b);
                canvas.restore();
            }
        }
    }

    /* renamed from: tc.n$b */
    public static class C19661b extends C19665f {

        /* renamed from: b */
        public final C19663d f49935b;

        /* renamed from: c */
        public final float f49936c;

        /* renamed from: d */
        public final float f49937d;

        public C19661b(C19663d dVar, float f, float f2) {
            this.f49935b = dVar;
            this.f49936c = f;
            this.f49937d = f2;
        }

        /* renamed from: a */
        public final void mo52030a(Matrix matrix, C19444a aVar, int i, Canvas canvas) {
            C19663d dVar = this.f49935b;
            RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) Math.hypot((double) (dVar.f49946c - this.f49937d), (double) (dVar.f49945b - this.f49936c)), BitmapDescriptorFactory.HUE_RED);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f49936c, this.f49937d);
            matrix2.preRotate(mo52036b());
            aVar.getClass();
            rectF.bottom += (float) i;
            rectF.offset(BitmapDescriptorFactory.HUE_RED, (float) (-i));
            int[] iArr = C19444a.f49454i;
            iArr[0] = aVar.f49463f;
            iArr[1] = aVar.f49462e;
            iArr[2] = aVar.f49461d;
            Paint paint = aVar.f49460c;
            float f = rectF.left;
            paint.setShader(new LinearGradient(f, rectF.top, f, rectF.bottom, iArr, C19444a.f49455j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, aVar.f49460c);
            canvas.restore();
        }

        /* renamed from: b */
        public final float mo52036b() {
            C19663d dVar = this.f49935b;
            return (float) Math.toDegrees(Math.atan((double) ((dVar.f49946c - this.f49937d) / (dVar.f49945b - this.f49936c))));
        }
    }

    /* renamed from: tc.n$c */
    public static class C19662c extends C19664e {

        /* renamed from: h */
        public static final RectF f49938h = new RectF();
        @Deprecated

        /* renamed from: b */
        public float f49939b;
        @Deprecated

        /* renamed from: c */
        public float f49940c;
        @Deprecated

        /* renamed from: d */
        public float f49941d;
        @Deprecated

        /* renamed from: e */
        public float f49942e;
        @Deprecated

        /* renamed from: f */
        public float f49943f;
        @Deprecated

        /* renamed from: g */
        public float f49944g;

        public C19662c(float f, float f2, float f3, float f4) {
            this.f49939b = f;
            this.f49940c = f2;
            this.f49941d = f3;
            this.f49942e = f4;
        }

        /* renamed from: a */
        public final void mo52037a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f49947a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f49938h;
            rectF.set(this.f49939b, this.f49940c, this.f49941d, this.f49942e);
            path.arcTo(rectF, this.f49943f, this.f49944g, false);
            path.transform(matrix);
        }
    }

    /* renamed from: tc.n$d */
    public static class C19663d extends C19664e {

        /* renamed from: b */
        public float f49945b;

        /* renamed from: c */
        public float f49946c;

        /* renamed from: a */
        public final void mo52037a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f49947a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f49945b, this.f49946c);
            path.transform(matrix);
        }
    }

    /* renamed from: tc.n$e */
    public static abstract class C19664e {

        /* renamed from: a */
        public final Matrix f49947a = new Matrix();

        /* renamed from: a */
        public abstract void mo52037a(Matrix matrix, Path path);
    }

    /* renamed from: tc.n$f */
    public static abstract class C19665f {

        /* renamed from: a */
        public static final Matrix f49948a = new Matrix();

        /* renamed from: a */
        public abstract void mo52030a(Matrix matrix, C19444a aVar, int i, Canvas canvas);
    }

    public C19659n() {
        mo52035e(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 270.0f, BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: a */
    public final void mo52031a(float f, float f2, float f3, float f4, float f5, float f6) {
        boolean z;
        float f7;
        C19662c cVar = new C19662c(f, f2, f3, f4);
        cVar.f49943f = f5;
        cVar.f49944g = f6;
        this.f49932g.add(cVar);
        C19660a aVar = new C19660a(cVar);
        float f8 = f5 + f6;
        if (f6 < BitmapDescriptorFactory.HUE_RED) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f5 = (f5 + 180.0f) % 360.0f;
        }
        if (z) {
            f7 = (180.0f + f8) % 360.0f;
        } else {
            f7 = f8;
        }
        mo52032b(f5);
        this.f49933h.add(aVar);
        this.f49930e = f7;
        double d = (double) f8;
        this.f49928c = (((f3 - f) / 2.0f) * ((float) Math.cos(Math.toRadians(d)))) + ((f + f3) * 0.5f);
        this.f49929d = (((f4 - f2) / 2.0f) * ((float) Math.sin(Math.toRadians(d)))) + ((f2 + f4) * 0.5f);
    }

    /* renamed from: b */
    public final void mo52032b(float f) {
        float f2 = this.f49930e;
        if (f2 != f) {
            float f3 = ((f - f2) + 360.0f) % 360.0f;
            if (f3 <= 180.0f) {
                float f4 = this.f49928c;
                float f5 = this.f49929d;
                C19662c cVar = new C19662c(f4, f5, f4, f5);
                cVar.f49943f = this.f49930e;
                cVar.f49944g = f3;
                this.f49933h.add(new C19660a(cVar));
                this.f49930e = f;
            }
        }
    }

    /* renamed from: c */
    public final void mo52033c(Matrix matrix, Path path) {
        int size = this.f49932g.size();
        for (int i = 0; i < size; i++) {
            ((C19664e) this.f49932g.get(i)).mo52037a(matrix, path);
        }
    }

    /* renamed from: d */
    public final void mo52034d(float f, float f2) {
        C19663d dVar = new C19663d();
        dVar.f49945b = f;
        dVar.f49946c = f2;
        this.f49932g.add(dVar);
        C19661b bVar = new C19661b(dVar, this.f49928c, this.f49929d);
        mo52032b(bVar.mo52036b() + 270.0f);
        this.f49933h.add(bVar);
        this.f49930e = bVar.mo52036b() + 270.0f;
        this.f49928c = f;
        this.f49929d = f2;
    }

    /* renamed from: e */
    public final void mo52035e(float f, float f2, float f3, float f4) {
        this.f49926a = f;
        this.f49927b = f2;
        this.f49928c = f;
        this.f49929d = f2;
        this.f49930e = f3;
        this.f49931f = (f3 + f4) % 360.0f;
        this.f49932g.clear();
        this.f49933h.clear();
    }
}
