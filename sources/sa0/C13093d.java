package sa0;

import android.opengl.Matrix;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.nutiteq.components.MapPos;
import na0.C12923b;
import oa0.C12958a;
import p845um.C19958a;
import ua0.C13142a;
import ya0.C13285i;

/* renamed from: sa0.d */
public final class C13093d {

    /* renamed from: c */
    public static MapPos[] f32393c = {new MapPos(-1.0d, -1.0d), new MapPos(-1.0d, 1.0d), new MapPos(1.0d, 1.0d), new MapPos(1.0d, -1.0d)};

    /* renamed from: a */
    public final C12923b f32394a;

    /* renamed from: b */
    public final C13285i<C13094a> f32395b = new C13285i<>(1.0d);

    /* renamed from: sa0.d$a */
    public static class C13094a {

        /* renamed from: a */
        public C12958a f32396a;

        /* renamed from: b */
        public C13142a f32397b;

        /* renamed from: c */
        public MapPos[] f32398c;

        public C13094a(C12958a aVar) {
            this.f32396a = aVar;
            this.f32397b = (C13142a) aVar.mo39840c().f32128b;
        }
    }

    /* renamed from: sa0.d$b */
    public static class C13095b {

        /* renamed from: a */
        public final MapPos f32399a;

        /* renamed from: b */
        public final float f32400b;

        public C13095b(MapPos mapPos, float f) {
            this.f32399a = mapPos;
            this.f32400b = f;
        }
    }

    public C13093d(C12923b bVar) {
        this.f32394a = bVar;
    }

    /* renamed from: a */
    public final MapPos[] mo39958a(C13095b bVar, C13094a aVar) {
        float f;
        C13095b bVar2 = bVar;
        C13094a aVar2 = aVar;
        C13142a aVar3 = aVar2.f32397b;
        C12958a.C12959a g = aVar2.f32396a.mo39840c();
        double[] dArr = new double[16];
        int i = aVar3.f32645e;
        if (i == 0) {
            double[] dArr2 = new double[16];
            C19958a.m47443s(dArr2, 0.0d, 1.0d, (double) (-(bVar2.f32400b + this.f32394a.f31994g)));
            double[] dArr3 = new double[16];
            C19958a.m47443s(dArr3, 1.0d, 0.0d, (double) (-this.f32394a.f31995h));
            C19958a.m47429b(dArr, dArr2, dArr3);
        } else if (i == 1) {
            C19958a.m47443s(dArr, 0.0d, 1.0d, (double) (-(bVar2.f32400b + this.f32394a.f31994g)));
        } else if (i == 2) {
            C19958a.m47443s(dArr, 0.0d, 1.0d, (double) (-bVar2.f32400b));
        }
        MapPos mapPos = bVar2.f32399a;
        double[] dArr4 = new double[16];
        C19958a.m47444t(mapPos.f24175b, mapPos.f24176c, (double) BitmapDescriptorFactory.HUE_RED, dArr4);
        double[] dArr5 = new double[16];
        C19958a.m47444t((double) ((((g.mo39845b() * aVar3.f32642b) * 0.5f) + BitmapDescriptorFactory.HUE_RED) / this.f32394a.f31997j), (double) ((((g.mo39844a() * aVar3.f32643c) * 0.5f) + BitmapDescriptorFactory.HUE_RED) / this.f32394a.f31997j), 0.0d, dArr5);
        float a = g.mo39844a();
        C12923b bVar3 = this.f32394a;
        double[] dArr6 = new double[16];
        C19958a.m47429b(dArr6, bVar3.f31991d, dArr4, dArr, dArr5, new double[]{(double) (g.mo39845b() / this.f32394a.f31997j), 0.0d, 0.0d, 0.0d, 0.0d, (double) (a / bVar3.f31997j), 0.0d, 0.0d, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, 0.0d, 0.0d, 1.0d});
        float[] fArr = new float[16];
        C19958a.m47432f(dArr6, fArr);
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, this.f32394a.f31992e, 0, fArr, 0);
        MapPos[] mapPosArr = new MapPos[4];
        for (int i2 = 0; i2 < 4; i2++) {
            float[] fArr3 = new float[4];
            float f2 = -0.5f;
            if (i2 == 1 || i2 == 2) {
                f = 0.5f;
            } else {
                f = -0.5f;
            }
            fArr3[0] = f;
            if (i2 >= 2) {
                f2 = 0.5f;
            }
            fArr3[1] = f2;
            fArr3[2] = 0.0f;
            fArr3[3] = 1.0f;
            float[] fArr4 = new float[4];
            Matrix.multiplyMV(fArr4, 0, fArr2, 0, fArr3, 0);
            if (fArr4[3] < 0.25f) {
                fArr4[3] = 0.25f;
            }
            float f3 = fArr4[0];
            float f4 = fArr4[3];
            mapPosArr[i2] = new MapPos((double) (f3 / f4), (double) (fArr4[1] / f4));
        }
        return mapPosArr;
    }
}
