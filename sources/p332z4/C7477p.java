package p332z4;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.C1903q;
import com.airbnb.lottie.model.layer.C1894a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;
import p037c5.C1781b;
import p037c5.C1783d;
import p037c5.C1784e;
import p037c5.C1786g;
import p037c5.C1791l;
import p037c5.C1792m;
import p120i5.C5280a;
import p120i5.C5282c;
import p120i5.C5283d;
import p332z4.C7456a;

/* renamed from: z4.p */
public final class C7477p {

    /* renamed from: a */
    public final Matrix f22919a = new Matrix();

    /* renamed from: b */
    public final Matrix f22920b;

    /* renamed from: c */
    public final Matrix f22921c;

    /* renamed from: d */
    public final Matrix f22922d;

    /* renamed from: e */
    public final float[] f22923e;

    /* renamed from: f */
    public C7456a<PointF, PointF> f22924f;

    /* renamed from: g */
    public C7456a<?, PointF> f22925g;

    /* renamed from: h */
    public C7456a<C5283d, C5283d> f22926h;

    /* renamed from: i */
    public C7456a<Float, Float> f22927i;

    /* renamed from: j */
    public C7456a<Integer, Integer> f22928j;

    /* renamed from: k */
    public C7465d f22929k;

    /* renamed from: l */
    public C7465d f22930l;

    /* renamed from: m */
    public C7456a<?, Float> f22931m;

    /* renamed from: n */
    public C7456a<?, Float> f22932n;

    public C7477p(C1791l lVar) {
        C7456a<PointF, PointF> aVar;
        C7456a<PointF, PointF> aVar2;
        C7456a<C5283d, C5283d> aVar3;
        C7456a<Float, Float> aVar4;
        C7465d dVar;
        C7465d dVar2;
        C1784e eVar = lVar.f6262a;
        if (eVar == null) {
            aVar = null;
        } else {
            aVar = eVar.mo6602i();
        }
        this.f22924f = aVar;
        C1792m<PointF, PointF> mVar = lVar.f6263b;
        if (mVar == null) {
            aVar2 = null;
        } else {
            aVar2 = mVar.mo6602i();
        }
        this.f22925g = aVar2;
        C1786g gVar = lVar.f6264c;
        if (gVar == null) {
            aVar3 = null;
        } else {
            aVar3 = gVar.mo6602i();
        }
        this.f22926h = aVar3;
        C1781b bVar = lVar.f6265d;
        if (bVar == null) {
            aVar4 = null;
        } else {
            aVar4 = bVar.mo6602i();
        }
        this.f22927i = aVar4;
        C1781b bVar2 = lVar.f6267f;
        if (bVar2 == null) {
            dVar = null;
        } else {
            dVar = (C7465d) bVar2.mo6602i();
        }
        this.f22929k = dVar;
        if (dVar != null) {
            this.f22920b = new Matrix();
            this.f22921c = new Matrix();
            this.f22922d = new Matrix();
            this.f22923e = new float[9];
        } else {
            this.f22920b = null;
            this.f22921c = null;
            this.f22922d = null;
            this.f22923e = null;
        }
        C1781b bVar3 = lVar.f6268g;
        if (bVar3 == null) {
            dVar2 = null;
        } else {
            dVar2 = (C7465d) bVar3.mo6602i();
        }
        this.f22930l = dVar2;
        C1783d dVar3 = lVar.f6266e;
        if (dVar3 != null) {
            this.f22928j = dVar3.mo6602i();
        }
        C1781b bVar4 = lVar.f6269h;
        if (bVar4 != null) {
            this.f22931m = bVar4.mo6602i();
        } else {
            this.f22931m = null;
        }
        C1781b bVar5 = lVar.f6270i;
        if (bVar5 != null) {
            this.f22932n = bVar5.mo6602i();
        } else {
            this.f22932n = null;
        }
    }

    /* renamed from: a */
    public final void mo23739a(C1894a aVar) {
        aVar.mo6806e(this.f22928j);
        aVar.mo6806e(this.f22931m);
        aVar.mo6806e(this.f22932n);
        aVar.mo6806e(this.f22924f);
        aVar.mo6806e(this.f22925g);
        aVar.mo6806e(this.f22926h);
        aVar.mo6806e(this.f22927i);
        aVar.mo6806e(this.f22929k);
        aVar.mo6806e(this.f22930l);
    }

    /* renamed from: b */
    public final void mo23740b(C7456a.C7457a aVar) {
        C7456a<Integer, Integer> aVar2 = this.f22928j;
        if (aVar2 != null) {
            aVar2.mo23712a(aVar);
        }
        C7456a<?, Float> aVar3 = this.f22931m;
        if (aVar3 != null) {
            aVar3.mo23712a(aVar);
        }
        C7456a<?, Float> aVar4 = this.f22932n;
        if (aVar4 != null) {
            aVar4.mo23712a(aVar);
        }
        C7456a<PointF, PointF> aVar5 = this.f22924f;
        if (aVar5 != null) {
            aVar5.mo23712a(aVar);
        }
        C7456a<?, PointF> aVar6 = this.f22925g;
        if (aVar6 != null) {
            aVar6.mo23712a(aVar);
        }
        C7456a<C5283d, C5283d> aVar7 = this.f22926h;
        if (aVar7 != null) {
            aVar7.mo23712a(aVar);
        }
        C7456a<Float, Float> aVar8 = this.f22927i;
        if (aVar8 != null) {
            aVar8.mo23712a(aVar);
        }
        C7465d dVar = this.f22929k;
        if (dVar != null) {
            dVar.mo23712a(aVar);
        }
        C7465d dVar2 = this.f22930l;
        if (dVar2 != null) {
            dVar2.mo23712a(aVar);
        }
    }

    /* renamed from: c */
    public final boolean mo23741c(C5282c cVar, Object obj) {
        if (obj == C1903q.f6682f) {
            C7456a<PointF, PointF> aVar = this.f22924f;
            if (aVar == null) {
                this.f22924f = new C7478q(cVar, new PointF());
                return true;
            }
            aVar.mo23722k(cVar);
            return true;
        } else if (obj == C1903q.f6683g) {
            C7456a<?, PointF> aVar2 = this.f22925g;
            if (aVar2 == null) {
                this.f22925g = new C7478q(cVar, new PointF());
                return true;
            }
            aVar2.mo23722k(cVar);
            return true;
        } else {
            if (obj == C1903q.f6684h) {
                C7456a<?, PointF> aVar3 = this.f22925g;
                if (aVar3 instanceof C7475n) {
                    C7475n nVar = (C7475n) aVar3;
                    C5282c cVar2 = nVar.f22917m;
                    if (cVar2 != null) {
                        cVar2.f17451c = null;
                    }
                    nVar.f22917m = cVar;
                    if (cVar == null) {
                        return true;
                    }
                    cVar.f17451c = nVar;
                    return true;
                }
            }
            if (obj == C1903q.f6685i) {
                C7456a<?, PointF> aVar4 = this.f22925g;
                if (aVar4 instanceof C7475n) {
                    C7475n nVar2 = (C7475n) aVar4;
                    C5282c cVar3 = nVar2.f22918n;
                    if (cVar3 != null) {
                        cVar3.f17451c = null;
                    }
                    nVar2.f22918n = cVar;
                    if (cVar == null) {
                        return true;
                    }
                    cVar.f17451c = nVar2;
                    return true;
                }
            }
            if (obj == C1903q.f6691o) {
                C7456a<C5283d, C5283d> aVar5 = this.f22926h;
                if (aVar5 == null) {
                    this.f22926h = new C7478q(cVar, new C5283d());
                    return true;
                }
                aVar5.mo23722k(cVar);
                return true;
            } else if (obj == C1903q.f6692p) {
                C7456a<Float, Float> aVar6 = this.f22927i;
                if (aVar6 == null) {
                    this.f22927i = new C7478q(cVar, Float.valueOf(BitmapDescriptorFactory.HUE_RED));
                    return true;
                }
                aVar6.mo23722k(cVar);
                return true;
            } else if (obj == C1903q.f6679c) {
                C7456a<Integer, Integer> aVar7 = this.f22928j;
                if (aVar7 == null) {
                    this.f22928j = new C7478q(cVar, 100);
                    return true;
                }
                aVar7.mo23722k(cVar);
                return true;
            } else if (obj == C1903q.f6665C) {
                C7456a<?, Float> aVar8 = this.f22931m;
                if (aVar8 == null) {
                    this.f22931m = new C7478q(cVar, Float.valueOf(100.0f));
                    return true;
                }
                aVar8.mo23722k(cVar);
                return true;
            } else if (obj == C1903q.f6666D) {
                C7456a<?, Float> aVar9 = this.f22932n;
                if (aVar9 == null) {
                    this.f22932n = new C7478q(cVar, Float.valueOf(100.0f));
                    return true;
                }
                aVar9.mo23722k(cVar);
                return true;
            } else if (obj == C1903q.f6693q) {
                if (this.f22929k == null) {
                    this.f22929k = new C7465d(Collections.singletonList(new C5280a(Float.valueOf(BitmapDescriptorFactory.HUE_RED))));
                }
                this.f22929k.mo23722k(cVar);
                return true;
            } else if (obj != C1903q.f6694r) {
                return false;
            } else {
                if (this.f22930l == null) {
                    this.f22930l = new C7465d(Collections.singletonList(new C5280a(Float.valueOf(BitmapDescriptorFactory.HUE_RED))));
                }
                this.f22930l.mo23722k(cVar);
                return true;
            }
        }
    }

    /* renamed from: d */
    public final Matrix mo23742d() {
        float f;
        float f2;
        float f3;
        this.f22919a.reset();
        C7456a<?, PointF> aVar = this.f22925g;
        if (aVar != null) {
            PointF f4 = aVar.mo23717f();
            float f5 = f4.x;
            if (!(f5 == BitmapDescriptorFactory.HUE_RED && f4.y == BitmapDescriptorFactory.HUE_RED)) {
                this.f22919a.preTranslate(f5, f4.y);
            }
        }
        C7456a<Float, Float> aVar2 = this.f22927i;
        if (aVar2 != null) {
            if (aVar2 instanceof C7478q) {
                f3 = aVar2.mo23717f().floatValue();
            } else {
                f3 = ((C7465d) aVar2).mo23733l();
            }
            if (f3 != BitmapDescriptorFactory.HUE_RED) {
                this.f22919a.preRotate(f3);
            }
        }
        C7465d dVar = this.f22929k;
        if (dVar != null) {
            C7465d dVar2 = this.f22930l;
            if (dVar2 == null) {
                f = BitmapDescriptorFactory.HUE_RED;
            } else {
                f = (float) Math.cos(Math.toRadians((double) ((-dVar2.mo23733l()) + 90.0f)));
            }
            C7465d dVar3 = this.f22930l;
            if (dVar3 == null) {
                f2 = 1.0f;
            } else {
                f2 = (float) Math.sin(Math.toRadians((double) ((-dVar3.mo23733l()) + 90.0f)));
            }
            float tan = (float) Math.tan(Math.toRadians((double) dVar.mo23733l()));
            for (int i = 0; i < 9; i++) {
                this.f22923e[i] = 0.0f;
            }
            float[] fArr = this.f22923e;
            fArr[0] = f;
            fArr[1] = f2;
            float f6 = -f2;
            fArr[3] = f6;
            fArr[4] = f;
            fArr[8] = 1.0f;
            this.f22920b.setValues(fArr);
            for (int i2 = 0; i2 < 9; i2++) {
                this.f22923e[i2] = 0.0f;
            }
            float[] fArr2 = this.f22923e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f22921c.setValues(fArr2);
            for (int i3 = 0; i3 < 9; i3++) {
                this.f22923e[i3] = 0.0f;
            }
            float[] fArr3 = this.f22923e;
            fArr3[0] = f;
            fArr3[1] = f6;
            fArr3[3] = f2;
            fArr3[4] = f;
            fArr3[8] = 1.0f;
            this.f22922d.setValues(fArr3);
            this.f22921c.preConcat(this.f22920b);
            this.f22922d.preConcat(this.f22921c);
            this.f22919a.preConcat(this.f22922d);
        }
        C7456a<C5283d, C5283d> aVar3 = this.f22926h;
        if (aVar3 != null) {
            C5283d f7 = aVar3.mo23717f();
            float f8 = f7.f17452a;
            if (!(f8 == 1.0f && f7.f17453b == 1.0f)) {
                this.f22919a.preScale(f8, f7.f17453b);
            }
        }
        C7456a<PointF, PointF> aVar4 = this.f22924f;
        if (aVar4 != null) {
            PointF f9 = aVar4.mo23717f();
            float f11 = f9.x;
            if (!(f11 == BitmapDescriptorFactory.HUE_RED && f9.y == BitmapDescriptorFactory.HUE_RED)) {
                this.f22919a.preTranslate(-f11, -f9.y);
            }
        }
        return this.f22919a;
    }

    /* renamed from: e */
    public final Matrix mo23743e(float f) {
        PointF pointF;
        C5283d dVar;
        float f2;
        C7456a<?, PointF> aVar = this.f22925g;
        PointF pointF2 = null;
        if (aVar == null) {
            pointF = null;
        } else {
            pointF = aVar.mo23717f();
        }
        C7456a<C5283d, C5283d> aVar2 = this.f22926h;
        if (aVar2 == null) {
            dVar = null;
        } else {
            dVar = aVar2.mo23717f();
        }
        this.f22919a.reset();
        if (pointF != null) {
            this.f22919a.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (dVar != null) {
            double d = (double) f;
            this.f22919a.preScale((float) Math.pow((double) dVar.f17452a, d), (float) Math.pow((double) dVar.f17453b, d));
        }
        C7456a<Float, Float> aVar3 = this.f22927i;
        if (aVar3 != null) {
            float floatValue = aVar3.mo23717f().floatValue();
            C7456a<PointF, PointF> aVar4 = this.f22924f;
            if (aVar4 != null) {
                pointF2 = aVar4.mo23717f();
            }
            Matrix matrix = this.f22919a;
            float f3 = floatValue * f;
            float f4 = BitmapDescriptorFactory.HUE_RED;
            if (pointF2 == null) {
                f2 = BitmapDescriptorFactory.HUE_RED;
            } else {
                f2 = pointF2.x;
            }
            if (pointF2 != null) {
                f4 = pointF2.y;
            }
            matrix.preRotate(f3, f2, f4);
        }
        return this.f22919a;
    }
}
