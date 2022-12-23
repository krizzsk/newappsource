package p328z0;

import androidx.constraintlayout.widget.C0738a;
import androidx.constraintlayout.widget.ConstraintAttribute;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.LinkedHashMap;
import p279v0.C6821c;

/* renamed from: z0.p */
public final class C7396p implements Comparable<C7396p> {

    /* renamed from: s */
    public static String[] f22751s = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: b */
    public C6821c f22752b;

    /* renamed from: c */
    public int f22753c = 0;

    /* renamed from: d */
    public float f22754d;

    /* renamed from: e */
    public float f22755e;

    /* renamed from: f */
    public float f22756f;

    /* renamed from: g */
    public float f22757g;

    /* renamed from: h */
    public float f22758h;

    /* renamed from: i */
    public float f22759i;

    /* renamed from: j */
    public float f22760j = Float.NaN;

    /* renamed from: k */
    public int f22761k = -1;

    /* renamed from: l */
    public int f22762l = -1;

    /* renamed from: m */
    public float f22763m = Float.NaN;

    /* renamed from: n */
    public C7394n f22764n = null;

    /* renamed from: o */
    public LinkedHashMap<String, ConstraintAttribute> f22765o = new LinkedHashMap<>();

    /* renamed from: p */
    public int f22766p = 0;

    /* renamed from: q */
    public double[] f22767q = new double[18];

    /* renamed from: r */
    public double[] f22768r = new double[18];

    public C7396p() {
    }

    /* renamed from: b */
    public static boolean m17042b(float f, float f2) {
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            if (Float.isNaN(f) != Float.isNaN(f2)) {
                return true;
            }
            return false;
        } else if (Math.abs(f - f2) > 1.0E-6f) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: e */
    public static void m17043e(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        int[] iArr2 = iArr;
        float f3 = BitmapDescriptorFactory.HUE_RED;
        float f4 = BitmapDescriptorFactory.HUE_RED;
        float f5 = BitmapDescriptorFactory.HUE_RED;
        float f6 = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < iArr2.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr2[i];
            if (i2 == 1) {
                f4 = f7;
            } else if (i2 == 2) {
                f6 = f7;
            } else if (i2 == 3) {
                f3 = f7;
            } else if (i2 == 4) {
                f5 = f7;
            }
        }
        float f8 = f4 - ((BitmapDescriptorFactory.HUE_RED * f3) / 2.0f);
        float f9 = f6 - ((BitmapDescriptorFactory.HUE_RED * f5) / 2.0f);
        fArr[0] = (((f3 * 1.0f) + f8) * f) + ((1.0f - f) * f8) + BitmapDescriptorFactory.HUE_RED;
        fArr[1] = (((f5 * 1.0f) + f9) * f2) + ((1.0f - f2) * f9) + BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: a */
    public final void mo23627a(C0738a.C0739a aVar) {
        this.f22752b = C6821c.m16106c(aVar.f3120d.f3210d);
        C0738a.C0742c cVar = aVar.f3120d;
        this.f22761k = cVar.f3211e;
        this.f22762l = cVar.f3208b;
        this.f22760j = cVar.f3214h;
        this.f22753c = cVar.f3212f;
        float f = aVar.f3119c.f3224e;
        this.f22763m = aVar.f3121e.f3140C;
        for (String next : aVar.f3123g.keySet()) {
            ConstraintAttribute constraintAttribute = aVar.f3123g.get(next);
            if (constraintAttribute != null) {
                int i = ConstraintAttribute.C0734a.f2996a[constraintAttribute.f2990c.ordinal()];
                boolean z = true;
                if (i == 1 || i == 2 || i == 3) {
                    z = false;
                }
                if (z) {
                    this.f22765o.put(next, constraintAttribute);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo23628c(double d, int[] iArr, double[] dArr, float[] fArr, int i) {
        int[] iArr2 = iArr;
        float f = this.f22756f;
        float f2 = this.f22757g;
        float f3 = this.f22758h;
        float f4 = this.f22759i;
        for (int i2 = 0; i2 < iArr2.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr2[i2];
            if (i3 == 1) {
                f = f5;
            } else if (i3 == 2) {
                f2 = f5;
            } else if (i3 == 3) {
                f3 = f5;
            } else if (i3 == 4) {
                f4 = f5;
            }
        }
        C7394n nVar = this.f22764n;
        if (nVar != null) {
            float[] fArr2 = new float[2];
            nVar.mo23621c(d, fArr2, new float[2]);
            float f6 = fArr2[0];
            float f7 = fArr2[1];
            double d2 = (double) f6;
            double d3 = (double) f;
            double d4 = (double) f2;
            f = (float) (((Math.sin(d4) * d3) + d2) - ((double) (f3 / 2.0f)));
            f2 = (float) ((((double) f7) - (Math.cos(d4) * d3)) - ((double) (f4 / 2.0f)));
        }
        fArr[i] = (f3 / 2.0f) + f + BitmapDescriptorFactory.HUE_RED;
        fArr[i + 1] = (f4 / 2.0f) + f2 + BitmapDescriptorFactory.HUE_RED;
    }

    public final int compareTo(Object obj) {
        return Float.compare(this.f22755e, ((C7396p) obj).f22755e);
    }

    /* renamed from: d */
    public final void mo23630d(float f, float f2, float f3, float f4) {
        this.f22756f = f;
        this.f22757g = f2;
        this.f22758h = f3;
        this.f22759i = f4;
    }

    /* renamed from: f */
    public final void mo23631f(C7394n nVar, C7396p pVar) {
        double d = (double) ((((this.f22758h / 2.0f) + this.f22756f) - pVar.f22756f) - (pVar.f22758h / 2.0f));
        double d2 = (double) ((((this.f22759i / 2.0f) + this.f22757g) - pVar.f22757g) - (pVar.f22759i / 2.0f));
        this.f22764n = nVar;
        this.f22756f = (float) Math.hypot(d2, d);
        if (Float.isNaN(this.f22763m)) {
            this.f22757g = (float) (Math.atan2(d2, d) + 1.5707963267948966d);
        } else {
            this.f22757g = (float) Math.toRadians((double) this.f22763m);
        }
    }

    public C7396p(int i, int i2, C7385h hVar, C7396p pVar, C7396p pVar2) {
        float f;
        int i3;
        float f2;
        float f3;
        C7385h hVar2 = hVar;
        C7396p pVar3 = pVar;
        C7396p pVar4 = pVar2;
        if (pVar3.f22762l != -1) {
            float f4 = ((float) hVar2.f22607a) / 100.0f;
            this.f22754d = f4;
            this.f22753c = hVar2.f22651h;
            this.f22766p = hVar2.f22658o;
            float f5 = Float.isNaN(hVar2.f22652i) ? f4 : hVar2.f22652i;
            float f6 = Float.isNaN(hVar2.f22653j) ? f4 : hVar2.f22653j;
            float f7 = pVar4.f22758h;
            float f8 = pVar3.f22758h;
            float f9 = pVar4.f22759i;
            float f11 = pVar3.f22759i;
            this.f22755e = this.f22754d;
            this.f22758h = (float) ((int) (((f7 - f8) * f5) + f8));
            this.f22759i = (float) ((int) (((f9 - f11) * f6) + f11));
            int i4 = hVar2.f22658o;
            if (i4 == 1) {
                float f12 = Float.isNaN(hVar2.f22654k) ? f4 : hVar2.f22654k;
                float f13 = pVar4.f22756f;
                float f14 = pVar3.f22756f;
                this.f22756f = C16759e.m42347c(f13, f14, f12, f14);
                f4 = !Float.isNaN(hVar2.f22655l) ? hVar2.f22655l : f4;
                float f15 = pVar4.f22757g;
                float f16 = pVar3.f22757g;
                this.f22757g = C16759e.m42347c(f15, f16, f4, f16);
            } else if (i4 != 2) {
                float f17 = Float.isNaN(hVar2.f22654k) ? f4 : hVar2.f22654k;
                float f18 = pVar4.f22756f;
                float f19 = pVar3.f22756f;
                this.f22756f = C16759e.m42347c(f18, f19, f17, f19);
                f4 = !Float.isNaN(hVar2.f22655l) ? hVar2.f22655l : f4;
                float f21 = pVar4.f22757g;
                float f22 = pVar3.f22757g;
                this.f22757g = C16759e.m42347c(f21, f22, f4, f22);
            } else {
                if (Float.isNaN(hVar2.f22654k)) {
                    float f23 = pVar4.f22756f;
                    float f24 = pVar3.f22756f;
                    f2 = C16759e.m42347c(f23, f24, f4, f24);
                } else {
                    f2 = hVar2.f22654k * Math.min(f6, f5);
                }
                this.f22756f = f2;
                if (Float.isNaN(hVar2.f22655l)) {
                    float f25 = pVar4.f22757g;
                    float f26 = pVar3.f22757g;
                    f3 = C16759e.m42347c(f25, f26, f4, f26);
                } else {
                    f3 = hVar2.f22655l;
                }
                this.f22757g = f3;
            }
            this.f22762l = pVar3.f22762l;
            this.f22752b = C6821c.m16106c(hVar2.f22649f);
            this.f22761k = hVar2.f22650g;
            return;
        }
        int i5 = hVar2.f22658o;
        if (i5 == 1) {
            C7396p pVar5 = pVar3;
            float f27 = ((float) hVar2.f22607a) / 100.0f;
            this.f22754d = f27;
            this.f22753c = hVar2.f22651h;
            float f28 = Float.isNaN(hVar2.f22652i) ? f27 : hVar2.f22652i;
            float f29 = Float.isNaN(hVar2.f22653j) ? f27 : hVar2.f22653j;
            float f31 = pVar4.f22758h - pVar5.f22758h;
            float f32 = pVar4.f22759i - pVar5.f22759i;
            this.f22755e = this.f22754d;
            f27 = !Float.isNaN(hVar2.f22654k) ? hVar2.f22654k : f27;
            float f33 = pVar5.f22756f;
            float f34 = pVar5.f22758h;
            float f35 = pVar5.f22757g;
            float f36 = pVar5.f22759i;
            float f37 = ((pVar4.f22758h / 2.0f) + pVar4.f22756f) - ((f34 / 2.0f) + f33);
            float f38 = ((pVar4.f22759i / 2.0f) + pVar4.f22757g) - ((f36 / 2.0f) + f35);
            float f39 = f37 * f27;
            float f41 = f31 * f28;
            float f42 = f41 / 2.0f;
            this.f22756f = (float) ((int) ((f33 + f39) - f42));
            float f43 = f27 * f38;
            float f44 = f32 * f29;
            float f45 = f44 / 2.0f;
            this.f22757g = (float) ((int) ((f35 + f43) - f45));
            this.f22758h = (float) ((int) (f34 + f41));
            this.f22759i = (float) ((int) (f36 + f44));
            C7385h hVar3 = hVar;
            float f46 = Float.isNaN(hVar3.f22655l) ? BitmapDescriptorFactory.HUE_RED : hVar3.f22655l;
            float f47 = (-f38) * f46;
            float f48 = f37 * f46;
            this.f22766p = 1;
            C7396p pVar6 = pVar;
            this.f22756f = ((float) ((int) ((pVar6.f22756f + f39) - f42))) + f47;
            this.f22757g = ((float) ((int) ((pVar6.f22757g + f43) - f45))) + f48;
            this.f22762l = this.f22762l;
            this.f22752b = C6821c.m16106c(hVar3.f22649f);
            this.f22761k = hVar3.f22650g;
        } else if (i5 != 2) {
            float f49 = ((float) hVar2.f22607a) / 100.0f;
            this.f22754d = f49;
            this.f22753c = hVar2.f22651h;
            float f51 = Float.isNaN(hVar2.f22652i) ? f49 : hVar2.f22652i;
            float f52 = Float.isNaN(hVar2.f22653j) ? f49 : hVar2.f22653j;
            float f53 = pVar4.f22758h;
            float f54 = pVar3.f22758h;
            float f55 = f53 - f54;
            float f56 = pVar4.f22759i;
            float f57 = pVar3.f22759i;
            float f58 = f56 - f57;
            this.f22755e = this.f22754d;
            float f59 = pVar3.f22756f;
            float f61 = pVar3.f22757g;
            float f62 = ((f53 / 2.0f) + pVar4.f22756f) - ((f54 / 2.0f) + f59);
            float f63 = ((f56 / 2.0f) + pVar4.f22757g) - ((f57 / 2.0f) + f61);
            float f64 = f55 * f51;
            float f65 = f64 / 2.0f;
            this.f22756f = (float) ((int) (((f62 * f49) + f59) - f65));
            float f66 = (f63 * f49) + f61;
            float f67 = f58 * f52;
            float f68 = f67 / 2.0f;
            this.f22757g = (float) ((int) (f66 - f68));
            this.f22758h = (float) ((int) (f54 + f64));
            this.f22759i = (float) ((int) (f57 + f67));
            C7385h hVar4 = hVar;
            float f69 = Float.isNaN(hVar4.f22654k) ? f49 : hVar4.f22654k;
            float f71 = Float.isNaN(hVar4.f22657n) ? BitmapDescriptorFactory.HUE_RED : hVar4.f22657n;
            f49 = !Float.isNaN(hVar4.f22655l) ? hVar4.f22655l : f49;
            if (Float.isNaN(hVar4.f22656m)) {
                i3 = 0;
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = hVar4.f22656m;
                i3 = 0;
            }
            this.f22766p = i3;
            C7396p pVar7 = pVar;
            this.f22756f = (float) ((int) (((f * f63) + ((f69 * f62) + pVar7.f22756f)) - f65));
            this.f22757g = (float) ((int) (((f63 * f49) + ((f62 * f71) + pVar7.f22757g)) - f68));
            this.f22752b = C6821c.m16106c(hVar4.f22649f);
            this.f22761k = hVar4.f22650g;
        } else {
            C7396p pVar8 = pVar3;
            C7385h hVar5 = hVar2;
            float f72 = ((float) hVar5.f22607a) / 100.0f;
            this.f22754d = f72;
            this.f22753c = hVar5.f22651h;
            float f73 = Float.isNaN(hVar5.f22652i) ? f72 : hVar5.f22652i;
            float f74 = Float.isNaN(hVar5.f22653j) ? f72 : hVar5.f22653j;
            float f75 = pVar4.f22758h;
            float f76 = pVar8.f22758h;
            float f77 = f75 - f76;
            float f78 = pVar4.f22759i;
            float f79 = pVar8.f22759i;
            float f81 = f78 - f79;
            this.f22755e = this.f22754d;
            float f82 = pVar8.f22756f;
            float f83 = pVar8.f22757g;
            float f84 = (f75 / 2.0f) + pVar4.f22756f;
            float f85 = (f78 / 2.0f) + pVar4.f22757g;
            float f86 = f77 * f73;
            this.f22756f = (float) ((int) ((((f84 - ((f76 / 2.0f) + f82)) * f72) + f82) - (f86 / 2.0f)));
            float f87 = f81 * f74;
            this.f22757g = (float) ((int) ((((f85 - ((f79 / 2.0f) + f83)) * f72) + f83) - (f87 / 2.0f)));
            this.f22758h = (float) ((int) (f76 + f86));
            this.f22759i = (float) ((int) (f79 + f87));
            this.f22766p = 2;
            C7385h hVar6 = hVar;
            if (!Float.isNaN(hVar6.f22654k)) {
                this.f22756f = (float) ((int) (hVar6.f22654k * ((float) ((int) (((float) i) - this.f22758h)))));
            }
            if (!Float.isNaN(hVar6.f22655l)) {
                this.f22757g = (float) ((int) (hVar6.f22655l * ((float) ((int) (((float) i2) - this.f22759i)))));
            }
            this.f22762l = this.f22762l;
            this.f22752b = C6821c.m16106c(hVar6.f22649f);
            this.f22761k = hVar6.f22650g;
        }
    }
}
