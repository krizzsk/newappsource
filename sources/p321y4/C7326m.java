package p321y4;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C1876l;
import com.airbnb.lottie.C1903q;
import com.airbnb.lottie.model.content.PolystarShape;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.C1894a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import p024b5.C1482d;
import p092g3.C4752a;
import p107h5.C5058f;
import p120i5.C5282c;
import p332z4.C7456a;
import p332z4.C7465d;

/* renamed from: y4.m */
public final class C7326m implements C7325l, C7456a.C7457a, C7322j {

    /* renamed from: a */
    public final Path f22504a = new Path();

    /* renamed from: b */
    public final String f22505b;

    /* renamed from: c */
    public final C1876l f22506c;

    /* renamed from: d */
    public final PolystarShape.Type f22507d;

    /* renamed from: e */
    public final boolean f22508e;

    /* renamed from: f */
    public final C7465d f22509f;

    /* renamed from: g */
    public final C7456a<?, PointF> f22510g;

    /* renamed from: h */
    public final C7465d f22511h;

    /* renamed from: i */
    public final C7465d f22512i;

    /* renamed from: j */
    public final C7465d f22513j;

    /* renamed from: k */
    public final C7465d f22514k;

    /* renamed from: l */
    public final C7465d f22515l;

    /* renamed from: m */
    public final C4752a f22516m = new C4752a(1, 0);

    /* renamed from: n */
    public boolean f22517n;

    /* renamed from: y4.m$a */
    public static /* synthetic */ class C7327a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22518a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.airbnb.lottie.model.content.PolystarShape$Type[] r0 = com.airbnb.lottie.model.content.PolystarShape.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22518a = r0
                com.airbnb.lottie.model.content.PolystarShape$Type r1 = com.airbnb.lottie.model.content.PolystarShape.Type.STAR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22518a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.content.PolystarShape$Type r1 = com.airbnb.lottie.model.content.PolystarShape.Type.POLYGON     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p321y4.C7326m.C7327a.<clinit>():void");
        }
    }

    public C7326m(C1876l lVar, C1894a aVar, PolystarShape polystarShape) {
        this.f22506c = lVar;
        this.f22505b = polystarShape.f6545a;
        PolystarShape.Type type = polystarShape.f6546b;
        this.f22507d = type;
        this.f22508e = polystarShape.f6554j;
        C7456a<Float, Float> i = polystarShape.f6547c.mo6602i();
        this.f22509f = (C7465d) i;
        C7456a<PointF, PointF> i2 = polystarShape.f6548d.mo6602i();
        this.f22510g = i2;
        C7456a<Float, Float> i3 = polystarShape.f6549e.mo6602i();
        this.f22511h = (C7465d) i3;
        C7456a<Float, Float> i4 = polystarShape.f6551g.mo6602i();
        this.f22513j = (C7465d) i4;
        C7456a<Float, Float> i5 = polystarShape.f6553i.mo6602i();
        this.f22515l = (C7465d) i5;
        PolystarShape.Type type2 = PolystarShape.Type.STAR;
        if (type == type2) {
            this.f22512i = (C7465d) polystarShape.f6550f.mo6602i();
            this.f22514k = (C7465d) polystarShape.f6552h.mo6602i();
        } else {
            this.f22512i = null;
            this.f22514k = null;
        }
        aVar.mo6806e(i);
        aVar.mo6806e(i2);
        aVar.mo6806e(i3);
        aVar.mo6806e(i4);
        aVar.mo6806e(i5);
        if (type == type2) {
            aVar.mo6806e(this.f22512i);
            aVar.mo6806e(this.f22514k);
        }
        i.mo23712a(this);
        i2.mo23712a(this);
        i3.mo23712a(this);
        i4.mo23712a(this);
        i5.mo23712a(this);
        if (type == type2) {
            this.f22512i.mo23712a(this);
            this.f22514k.mo23712a(this);
        }
    }

    /* renamed from: a */
    public final void mo6803a() {
        this.f22517n = false;
        this.f22506c.invalidateSelf();
    }

    /* renamed from: b */
    public final void mo6804b(List<C7314b> list, List<C7314b> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i < arrayList.size()) {
                C7314b bVar = (C7314b) arrayList.get(i);
                if (bVar instanceof C7332r) {
                    C7332r rVar = (C7332r) bVar;
                    if (rVar.f22552c == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                        ((List) this.f22516m.f16037a).add(rVar);
                        rVar.mo23558c(this);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo5839c(C1482d dVar, int i, ArrayList arrayList, C1482d dVar2) {
        C5058f.m12907d(dVar, i, arrayList, dVar2, this);
    }

    /* renamed from: g */
    public final void mo5840g(C5282c cVar, Object obj) {
        C7465d dVar;
        C7465d dVar2;
        if (obj == C1903q.f6699w) {
            this.f22509f.mo23722k(cVar);
        } else if (obj == C1903q.f6700x) {
            this.f22511h.mo23722k(cVar);
        } else if (obj == C1903q.f6690n) {
            this.f22510g.mo23722k(cVar);
        } else if (obj == C1903q.f6701y && (dVar2 = this.f22512i) != null) {
            dVar2.mo23722k(cVar);
        } else if (obj == C1903q.f6702z) {
            this.f22513j.mo23722k(cVar);
        } else if (obj == C1903q.f6663A && (dVar = this.f22514k) != null) {
            dVar.mo23722k(cVar);
        } else if (obj == C1903q.f6664B) {
            this.f22515l.mo23722k(cVar);
        }
    }

    public final String getName() {
        return this.f22505b;
    }

    /* renamed from: q */
    public final Path mo23551q() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        double d;
        float f7;
        float f8;
        float f9;
        float f11;
        float f12;
        float f13;
        double d2;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        double d3;
        double d4;
        double d5;
        if (this.f22517n) {
            return this.f22504a;
        }
        this.f22504a.reset();
        if (this.f22508e) {
            this.f22517n = true;
            return this.f22504a;
        }
        int i = C7327a.f22518a[this.f22507d.ordinal()];
        double d6 = 0.0d;
        if (i == 1) {
            float floatValue = ((Float) this.f22509f.mo23717f()).floatValue();
            C7465d dVar = this.f22511h;
            if (dVar != null) {
                d6 = (double) ((Float) dVar.mo23717f()).floatValue();
            }
            double radians = Math.toRadians(d6 - 90.0d);
            double d7 = (double) floatValue;
            float f21 = (float) (6.283185307179586d / d7);
            float f22 = f21 / 2.0f;
            float f23 = floatValue - ((float) ((int) floatValue));
            int i2 = (f23 > BitmapDescriptorFactory.HUE_RED ? 1 : (f23 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            if (i2 != 0) {
                radians += (double) ((1.0f - f23) * f22);
            }
            float floatValue2 = ((Float) this.f22513j.mo23717f()).floatValue();
            float floatValue3 = ((Float) this.f22512i.mo23717f()).floatValue();
            C7465d dVar2 = this.f22514k;
            if (dVar2 != null) {
                f = ((Float) dVar2.mo23717f()).floatValue() / 100.0f;
            } else {
                f = BitmapDescriptorFactory.HUE_RED;
            }
            C7465d dVar3 = this.f22515l;
            if (dVar3 != null) {
                f2 = ((Float) dVar3.mo23717f()).floatValue() / 100.0f;
            } else {
                f2 = BitmapDescriptorFactory.HUE_RED;
            }
            if (i2 != 0) {
                f7 = C16759e.m42347c(floatValue2, floatValue3, f23, floatValue3);
                double d8 = (double) f7;
                f4 = floatValue3;
                f3 = f;
                f6 = (float) (Math.cos(radians) * d8);
                f5 = (float) (d8 * Math.sin(radians));
                this.f22504a.moveTo(f6, f5);
                d = radians + ((double) ((f21 * f23) / 2.0f));
            } else {
                f4 = floatValue3;
                f3 = f;
                double d9 = (double) floatValue2;
                float cos = (float) (Math.cos(radians) * d9);
                f5 = (float) (Math.sin(radians) * d9);
                this.f22504a.moveTo(cos, f5);
                d = radians + ((double) f22);
                f6 = cos;
                f7 = BitmapDescriptorFactory.HUE_RED;
            }
            double ceil = Math.ceil(d7) * 2.0d;
            float f24 = f22;
            int i3 = i2;
            int i4 = 0;
            boolean z = false;
            while (true) {
                double d11 = (double) i4;
                if (d11 >= ceil) {
                    break;
                }
                if (z) {
                    f8 = floatValue2;
                } else {
                    f8 = f4;
                }
                int i5 = (f7 > BitmapDescriptorFactory.HUE_RED ? 1 : (f7 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                if (i5 == 0 || d11 != ceil - 2.0d) {
                    f9 = f21;
                    f11 = f24;
                } else {
                    f9 = f21;
                    f11 = (f21 * f23) / 2.0f;
                }
                if (i5 == 0 || d11 != ceil - 1.0d) {
                    f12 = f7;
                    f7 = f8;
                    f13 = f11;
                } else {
                    f13 = f11;
                    f12 = f7;
                }
                double d12 = (double) f7;
                double d13 = d11;
                float cos2 = (float) (Math.cos(d) * d12);
                float sin = (float) (d12 * Math.sin(d));
                if (f3 == BitmapDescriptorFactory.HUE_RED && f2 == BitmapDescriptorFactory.HUE_RED) {
                    this.f22504a.lineTo(cos2, sin);
                    f14 = sin;
                    d2 = d;
                    f15 = f2;
                } else {
                    d2 = d;
                    float f25 = f5;
                    float f26 = f2;
                    double atan2 = (double) ((float) (Math.atan2((double) f5, (double) f6) - 1.5707963267948966d));
                    float cos3 = (float) Math.cos(atan2);
                    float sin2 = (float) Math.sin(atan2);
                    float f27 = f25;
                    f14 = sin;
                    f15 = f26;
                    double atan22 = (double) ((float) (Math.atan2((double) sin, (double) cos2) - 1.5707963267948966d));
                    float cos4 = (float) Math.cos(atan22);
                    float sin3 = (float) Math.sin(atan22);
                    if (z) {
                        f16 = f3;
                    } else {
                        f16 = f15;
                    }
                    if (z) {
                        f17 = f15;
                    } else {
                        f17 = f3;
                    }
                    if (z) {
                        f18 = f4;
                    } else {
                        f18 = floatValue2;
                    }
                    if (z) {
                        f19 = floatValue2;
                    } else {
                        f19 = f4;
                    }
                    float f28 = f18 * f16 * 0.47829f;
                    float f29 = cos3 * f28;
                    float f31 = f28 * sin2;
                    float f32 = f19 * f17 * 0.47829f;
                    float f33 = cos4 * f32;
                    float f34 = f32 * sin3;
                    if (i3 != 0) {
                        if (i4 == 0) {
                            f29 *= f23;
                            f31 *= f23;
                        } else if (d13 == ceil - 1.0d) {
                            f33 *= f23;
                            f34 *= f23;
                        }
                    }
                    this.f22504a.cubicTo(f6 - f29, f27 - f31, cos2 + f33, f14 + f34, cos2, f14);
                }
                d = d2 + ((double) f13);
                z = !z;
                i4++;
                f6 = cos2;
                f7 = f12;
                f21 = f9;
                f5 = f14;
                f2 = f15;
            }
            PointF f35 = this.f22510g.mo23717f();
            this.f22504a.offset(f35.x, f35.y);
            this.f22504a.close();
        } else if (i == 2) {
            int floor = (int) Math.floor((double) ((Float) this.f22509f.mo23717f()).floatValue());
            C7465d dVar4 = this.f22511h;
            if (dVar4 != null) {
                d6 = (double) ((Float) dVar4.mo23717f()).floatValue();
            }
            double radians2 = Math.toRadians(d6 - 90.0d);
            double d14 = (double) floor;
            float floatValue4 = ((Float) this.f22515l.mo23717f()).floatValue() / 100.0f;
            float floatValue5 = ((Float) this.f22513j.mo23717f()).floatValue();
            double d15 = (double) floatValue5;
            float cos5 = (float) (Math.cos(radians2) * d15);
            float sin4 = (float) (Math.sin(radians2) * d15);
            this.f22504a.moveTo(cos5, sin4);
            double d16 = (double) ((float) (6.283185307179586d / d14));
            double d17 = radians2 + d16;
            double ceil2 = Math.ceil(d14);
            int i6 = 0;
            while (((double) i6) < ceil2) {
                float cos6 = (float) (Math.cos(d17) * d15);
                double d18 = ceil2;
                float sin5 = (float) (Math.sin(d17) * d15);
                if (floatValue4 != BitmapDescriptorFactory.HUE_RED) {
                    d5 = d15;
                    d4 = d17;
                    double atan23 = (double) ((float) (Math.atan2((double) sin4, (double) cos5) - 1.5707963267948966d));
                    float cos7 = (float) Math.cos(atan23);
                    d3 = d16;
                    double atan24 = (double) ((float) (Math.atan2((double) sin5, (double) cos6) - 1.5707963267948966d));
                    float f36 = floatValue5 * floatValue4 * 0.25f;
                    this.f22504a.cubicTo(cos5 - (cos7 * f36), sin4 - (((float) Math.sin(atan23)) * f36), cos6 + (((float) Math.cos(atan24)) * f36), sin5 + (f36 * ((float) Math.sin(atan24))), cos6, sin5);
                } else {
                    d4 = d17;
                    d5 = d15;
                    d3 = d16;
                    this.f22504a.lineTo(cos6, sin5);
                }
                d17 = d4 + d3;
                i6++;
                sin4 = sin5;
                cos5 = cos6;
                ceil2 = d18;
                d15 = d5;
                d16 = d3;
            }
            PointF f37 = this.f22510g.mo23717f();
            this.f22504a.offset(f37.x, f37.y);
            this.f22504a.close();
        }
        this.f22504a.close();
        this.f22516m.mo20258e(this.f22504a);
        this.f22517n = true;
        return this.f22504a;
    }
}
