package p811tc;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.BitSet;
import p221q6.C6181b;
import p811tc.C19648g;
import p811tc.C19659n;

/* renamed from: tc.l */
public final class C19656l {

    /* renamed from: a */
    public final C19659n[] f49911a = new C19659n[4];

    /* renamed from: b */
    public final Matrix[] f49912b = new Matrix[4];

    /* renamed from: c */
    public final Matrix[] f49913c = new Matrix[4];

    /* renamed from: d */
    public final PointF f49914d = new PointF();

    /* renamed from: e */
    public final Path f49915e = new Path();

    /* renamed from: f */
    public final Path f49916f = new Path();

    /* renamed from: g */
    public final C19659n f49917g = new C19659n();

    /* renamed from: h */
    public final float[] f49918h = new float[2];

    /* renamed from: i */
    public final float[] f49919i = new float[2];

    /* renamed from: j */
    public final Path f49920j = new Path();

    /* renamed from: k */
    public final Path f49921k = new Path();

    /* renamed from: l */
    public boolean f49922l = true;

    /* renamed from: tc.l$a */
    public static class C19657a {

        /* renamed from: a */
        public static final C19656l f49923a = new C19656l();
    }

    public C19656l() {
        for (int i = 0; i < 4; i++) {
            this.f49911a[i] = new C19659n();
            this.f49912b[i] = new Matrix();
            this.f49913c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    public final void mo52028a(C19654k kVar, float f, RectF rectF, C19648g.C19649a aVar, Path path) {
        int i;
        float f2;
        C19646e eVar;
        C19644c cVar;
        C6181b bVar;
        C19654k kVar2 = kVar;
        float f3 = f;
        RectF rectF2 = rectF;
        C19648g.C19649a aVar2 = aVar;
        Path path2 = path;
        path.rewind();
        this.f49915e.rewind();
        this.f49916f.rewind();
        this.f49916f.addRect(rectF2, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                break;
            }
            if (i2 == 1) {
                cVar = kVar2.f49893g;
            } else if (i2 == 2) {
                cVar = kVar2.f49894h;
            } else if (i2 != 3) {
                cVar = kVar2.f49892f;
            } else {
                cVar = kVar2.f49891e;
            }
            if (i2 == 1) {
                bVar = kVar2.f49889c;
            } else if (i2 == 2) {
                bVar = kVar2.f49890d;
            } else if (i2 != 3) {
                bVar = kVar2.f49888b;
            } else {
                bVar = kVar2.f49887a;
            }
            C19659n nVar = this.f49911a[i2];
            bVar.getClass();
            bVar.mo22174i(f3, cVar.mo51983a(rectF2), nVar);
            int i3 = i2 + 1;
            float f4 = (float) (i3 * 90);
            this.f49912b[i2].reset();
            PointF pointF = this.f49914d;
            if (i2 == 1) {
                pointF.set(rectF2.right, rectF2.bottom);
            } else if (i2 == 2) {
                pointF.set(rectF2.left, rectF2.bottom);
            } else if (i2 != 3) {
                pointF.set(rectF2.right, rectF2.top);
            } else {
                pointF.set(rectF2.left, rectF2.top);
            }
            Matrix matrix = this.f49912b[i2];
            PointF pointF2 = this.f49914d;
            matrix.setTranslate(pointF2.x, pointF2.y);
            this.f49912b[i2].preRotate(f4);
            float[] fArr = this.f49918h;
            C19659n nVar2 = this.f49911a[i2];
            fArr[0] = nVar2.f49928c;
            fArr[1] = nVar2.f49929d;
            this.f49912b[i2].mapPoints(fArr);
            this.f49913c[i2].reset();
            Matrix matrix2 = this.f49913c[i2];
            float[] fArr2 = this.f49918h;
            matrix2.setTranslate(fArr2[0], fArr2[1]);
            this.f49913c[i2].preRotate(f4);
            i2 = i3;
        }
        int i4 = 0;
        for (i = 4; i4 < i; i = 4) {
            float[] fArr3 = this.f49918h;
            C19659n nVar3 = this.f49911a[i4];
            fArr3[0] = nVar3.f49926a;
            fArr3[1] = nVar3.f49927b;
            this.f49912b[i4].mapPoints(fArr3);
            if (i4 == 0) {
                float[] fArr4 = this.f49918h;
                path2.moveTo(fArr4[0], fArr4[1]);
            } else {
                float[] fArr5 = this.f49918h;
                path2.lineTo(fArr5[0], fArr5[1]);
            }
            this.f49911a[i4].mo52033c(this.f49912b[i4], path2);
            if (aVar2 != null) {
                C19659n nVar4 = this.f49911a[i4];
                Matrix matrix3 = this.f49912b[i4];
                BitSet bitSet = C19648g.this.f49840e;
                nVar4.getClass();
                bitSet.set(i4, false);
                C19659n.C19665f[] fVarArr = C19648g.this.f49838c;
                nVar4.mo52032b(nVar4.f49931f);
                fVarArr[i4] = new C19658m(new ArrayList(nVar4.f49933h), new Matrix(matrix3));
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            float[] fArr6 = this.f49918h;
            C19659n nVar5 = this.f49911a[i4];
            fArr6[0] = nVar5.f49928c;
            fArr6[1] = nVar5.f49929d;
            this.f49912b[i4].mapPoints(fArr6);
            float[] fArr7 = this.f49919i;
            C19659n nVar6 = this.f49911a[i6];
            fArr7[0] = nVar6.f49926a;
            fArr7[1] = nVar6.f49927b;
            this.f49912b[i6].mapPoints(fArr7);
            float[] fArr8 = this.f49918h;
            float f5 = fArr8[0];
            float[] fArr9 = this.f49919i;
            int i7 = i5;
            float max = Math.max(((float) Math.hypot((double) (f5 - fArr9[0]), (double) (fArr8[1] - fArr9[1]))) - 0.001f, BitmapDescriptorFactory.HUE_RED);
            float[] fArr10 = this.f49918h;
            C19659n nVar7 = this.f49911a[i4];
            fArr10[0] = nVar7.f49928c;
            fArr10[1] = nVar7.f49929d;
            this.f49912b[i4].mapPoints(fArr10);
            if (i4 == 1 || i4 == 3) {
                f2 = Math.abs(rectF.centerX() - this.f49918h[0]);
            } else {
                f2 = Math.abs(rectF.centerY() - this.f49918h[1]);
            }
            this.f49917g.mo52035e(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 270.0f, BitmapDescriptorFactory.HUE_RED);
            if (i4 == 1) {
                eVar = kVar2.f49897k;
            } else if (i4 == 2) {
                eVar = kVar2.f49898l;
            } else if (i4 != 3) {
                eVar = kVar2.f49896j;
            } else {
                eVar = kVar2.f49895i;
            }
            eVar.mo41045g(max, f2, f3, this.f49917g);
            this.f49920j.reset();
            this.f49917g.mo52033c(this.f49913c[i4], this.f49920j);
            if (!this.f49922l || (!eVar.mo51988f() && !mo52029b(this.f49920j, i4) && !mo52029b(this.f49920j, i6))) {
                this.f49917g.mo52033c(this.f49913c[i4], path2);
            } else {
                Path path3 = this.f49920j;
                path3.op(path3, this.f49916f, Path.Op.DIFFERENCE);
                float[] fArr11 = this.f49918h;
                C19659n nVar8 = this.f49917g;
                fArr11[0] = nVar8.f49926a;
                fArr11[1] = nVar8.f49927b;
                this.f49913c[i4].mapPoints(fArr11);
                Path path4 = this.f49915e;
                float[] fArr12 = this.f49918h;
                path4.moveTo(fArr12[0], fArr12[1]);
                this.f49917g.mo52033c(this.f49913c[i4], this.f49915e);
            }
            if (aVar2 != null) {
                C19659n nVar9 = this.f49917g;
                Matrix matrix4 = this.f49913c[i4];
                nVar9.getClass();
                C19648g.this.f49840e.set(i4 + 4, false);
                C19659n.C19665f[] fVarArr2 = C19648g.this.f49839d;
                nVar9.mo52032b(nVar9.f49931f);
                fVarArr2[i4] = new C19658m(new ArrayList(nVar9.f49933h), new Matrix(matrix4));
            }
            i4 = i7;
        }
        path.close();
        this.f49915e.close();
        if (!this.f49915e.isEmpty()) {
            path2.op(this.f49915e, Path.Op.UNION);
        }
    }

    /* renamed from: b */
    public final boolean mo52029b(Path path, int i) {
        this.f49921k.reset();
        this.f49911a[i].mo52033c(this.f49912b[i], this.f49921k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f49921k.computeBounds(rectF, true);
        path.op(this.f49921k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            return false;
        }
        return true;
    }
}
