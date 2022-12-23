package p321y4;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.C1876l;
import com.airbnb.lottie.C1903q;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.C1894a;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import p024b5.C1482d;
import p037c5.C1781b;
import p037c5.C1783d;
import p107h5.C5058f;
import p107h5.C5059g;
import p120i5.C5282c;
import p309x4.C7155a;
import p332z4.C7456a;
import p332z4.C7463c;
import p332z4.C7465d;
import p332z4.C7467f;
import p332z4.C7478q;
import p584jl.C17885a;

/* renamed from: y4.a */
public abstract class C7312a implements C7456a.C7457a, C7322j, C7316d {

    /* renamed from: a */
    public final PathMeasure f22415a = new PathMeasure();

    /* renamed from: b */
    public final Path f22416b = new Path();

    /* renamed from: c */
    public final Path f22417c = new Path();

    /* renamed from: d */
    public final RectF f22418d = new RectF();

    /* renamed from: e */
    public final C1876l f22419e;

    /* renamed from: f */
    public final C1894a f22420f;

    /* renamed from: g */
    public final ArrayList f22421g = new ArrayList();

    /* renamed from: h */
    public final float[] f22422h;

    /* renamed from: i */
    public final C7155a f22423i;

    /* renamed from: j */
    public final C7465d f22424j;

    /* renamed from: k */
    public final C7467f f22425k;

    /* renamed from: l */
    public final ArrayList f22426l;

    /* renamed from: m */
    public final C7465d f22427m;

    /* renamed from: n */
    public C7478q f22428n;

    /* renamed from: o */
    public C7456a<Float, Float> f22429o;

    /* renamed from: p */
    public float f22430p;

    /* renamed from: q */
    public C7463c f22431q;

    /* renamed from: y4.a$a */
    public static final class C7313a {

        /* renamed from: a */
        public final ArrayList f22432a = new ArrayList();

        /* renamed from: b */
        public final C7332r f22433b;

        public C7313a(C7332r rVar) {
            this.f22433b = rVar;
        }
    }

    public C7312a(C1876l lVar, C1894a aVar, Paint.Cap cap, Paint.Join join, float f, C1783d dVar, C1781b bVar, List<C1781b> list, C1781b bVar2) {
        C7155a aVar2 = new C7155a(1);
        this.f22423i = aVar2;
        this.f22430p = BitmapDescriptorFactory.HUE_RED;
        this.f22419e = lVar;
        this.f22420f = aVar;
        aVar2.setStyle(Paint.Style.STROKE);
        aVar2.setStrokeCap(cap);
        aVar2.setStrokeJoin(join);
        aVar2.setStrokeMiter(f);
        this.f22425k = (C7467f) dVar.mo6602i();
        this.f22424j = (C7465d) bVar.mo6602i();
        if (bVar2 == null) {
            this.f22427m = null;
        } else {
            this.f22427m = (C7465d) bVar2.mo6602i();
        }
        this.f22426l = new ArrayList(list.size());
        this.f22422h = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f22426l.add(list.get(i).mo6602i());
        }
        aVar.mo6806e(this.f22425k);
        aVar.mo6806e(this.f22424j);
        for (int i2 = 0; i2 < this.f22426l.size(); i2++) {
            aVar.mo6806e((C7456a) this.f22426l.get(i2));
        }
        C7465d dVar2 = this.f22427m;
        if (dVar2 != null) {
            aVar.mo6806e(dVar2);
        }
        this.f22425k.mo23712a(this);
        this.f22424j.mo23712a(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((C7456a) this.f22426l.get(i3)).mo23712a(this);
        }
        C7465d dVar3 = this.f22427m;
        if (dVar3 != null) {
            dVar3.mo23712a(this);
        }
        if (aVar.mo6812k() != null) {
            C7456a<Float, Float> i4 = ((C1781b) aVar.mo6812k().f761c).mo6602i();
            this.f22429o = i4;
            i4.mo23712a(this);
            aVar.mo6806e(this.f22429o);
        }
        if (aVar.mo6813l() != null) {
            this.f22431q = new C7463c(this, aVar, aVar.mo6813l());
        }
    }

    /* renamed from: a */
    public final void mo6803a() {
        this.f22419e.invalidateSelf();
    }

    /* renamed from: b */
    public final void mo6804b(List<C7314b> list, List<C7314b> list2) {
        ArrayList arrayList = (ArrayList) list;
        C7313a aVar = null;
        C7332r rVar = null;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C7314b bVar = (C7314b) arrayList.get(size);
            if (bVar instanceof C7332r) {
                C7332r rVar2 = (C7332r) bVar;
                if (rVar2.f22552c == ShapeTrimPath.Type.INDIVIDUALLY) {
                    rVar = rVar2;
                }
            }
        }
        if (rVar != null) {
            rVar.mo23558c(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            C7314b bVar2 = list2.get(size2);
            if (bVar2 instanceof C7332r) {
                C7332r rVar3 = (C7332r) bVar2;
                if (rVar3.f22552c == ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (aVar != null) {
                        this.f22421g.add(aVar);
                    }
                    C7313a aVar2 = new C7313a(rVar3);
                    rVar3.mo23558c(this);
                    aVar = aVar2;
                }
            }
            if (bVar2 instanceof C7325l) {
                if (aVar == null) {
                    aVar = new C7313a(rVar);
                }
                aVar.f22432a.add((C7325l) bVar2);
            }
        }
        if (aVar != null) {
            this.f22421g.add(aVar);
        }
    }

    /* renamed from: c */
    public final void mo5839c(C1482d dVar, int i, ArrayList arrayList, C1482d dVar2) {
        C5058f.m12907d(dVar, i, arrayList, dVar2, this);
    }

    /* renamed from: d */
    public final void mo6805d(RectF rectF, Matrix matrix, boolean z) {
        this.f22416b.reset();
        for (int i = 0; i < this.f22421g.size(); i++) {
            C7313a aVar = (C7313a) this.f22421g.get(i);
            for (int i2 = 0; i2 < aVar.f22432a.size(); i2++) {
                this.f22416b.addPath(((C7325l) aVar.f22432a.get(i2)).mo23551q(), matrix);
            }
        }
        this.f22416b.computeBounds(this.f22418d, false);
        float l = this.f22424j.mo23733l();
        RectF rectF2 = this.f22418d;
        float f = l / 2.0f;
        rectF2.set(rectF2.left - f, rectF2.top - f, rectF2.right + f, rectF2.bottom + f);
        rectF.set(this.f22418d);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        C17885a.m44412M();
    }

    /* renamed from: f */
    public void mo6807f(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        float f;
        float f2;
        float f3;
        BlurMaskFilter blurMaskFilter;
        float f4;
        Canvas canvas2 = canvas;
        Matrix matrix2 = matrix;
        float[] fArr = (float[]) C5059g.f17060d.get();
        boolean z2 = false;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix2.mapPoints(fArr);
        if (fArr[0] == fArr[2] || fArr[1] == fArr[3]) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C17885a.m44412M();
            return;
        }
        C7467f fVar = this.f22425k;
        float l = (((float) i) / 255.0f) * ((float) fVar.mo23735l(fVar.mo23713b(), fVar.mo23715d()));
        float f5 = 100.0f;
        C7155a aVar = this.f22423i;
        PointF pointF = C5058f.f17056a;
        aVar.setAlpha(Math.max(0, Math.min(ValidationUtils.APPBOY_STRING_MAX_LENGTH, (int) ((l / 100.0f) * 255.0f))));
        this.f22423i.setStrokeWidth(C5059g.m12911d(matrix) * this.f22424j.mo23733l());
        if (this.f22423i.getStrokeWidth() <= BitmapDescriptorFactory.HUE_RED) {
            C17885a.m44412M();
            return;
        }
        float f6 = 1.0f;
        if (this.f22426l.isEmpty()) {
            C17885a.m44412M();
        } else {
            float d = C5059g.m12911d(matrix);
            for (int i2 = 0; i2 < this.f22426l.size(); i2++) {
                this.f22422h[i2] = ((Float) ((C7456a) this.f22426l.get(i2)).mo23717f()).floatValue();
                if (i2 % 2 == 0) {
                    float[] fArr2 = this.f22422h;
                    if (fArr2[i2] < 1.0f) {
                        fArr2[i2] = 1.0f;
                    }
                } else {
                    float[] fArr3 = this.f22422h;
                    if (fArr3[i2] < 0.1f) {
                        fArr3[i2] = 0.1f;
                    }
                }
                float[] fArr4 = this.f22422h;
                fArr4[i2] = fArr4[i2] * d;
            }
            C7465d dVar = this.f22427m;
            if (dVar == null) {
                f4 = BitmapDescriptorFactory.HUE_RED;
            } else {
                f4 = ((Float) dVar.mo23717f()).floatValue() * d;
            }
            this.f22423i.setPathEffect(new DashPathEffect(this.f22422h, f4));
            C17885a.m44412M();
        }
        C7478q qVar = this.f22428n;
        if (qVar != null) {
            this.f22423i.setColorFilter((ColorFilter) qVar.mo23717f());
        }
        C7456a<Float, Float> aVar2 = this.f22429o;
        if (aVar2 != null) {
            float floatValue = aVar2.mo23717f().floatValue();
            if (floatValue == BitmapDescriptorFactory.HUE_RED) {
                this.f22423i.setMaskFilter((MaskFilter) null);
            } else if (floatValue != this.f22430p) {
                C1894a aVar3 = this.f22420f;
                if (aVar3.f6633y == floatValue) {
                    blurMaskFilter = aVar3.f6634z;
                } else {
                    BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    aVar3.f6634z = blurMaskFilter2;
                    aVar3.f6633y = floatValue;
                    blurMaskFilter = blurMaskFilter2;
                }
                this.f22423i.setMaskFilter(blurMaskFilter);
            }
            this.f22430p = floatValue;
        }
        C7463c cVar = this.f22431q;
        if (cVar != null) {
            cVar.mo23731b(this.f22423i);
        }
        int i3 = 0;
        while (i3 < this.f22421g.size()) {
            C7313a aVar4 = (C7313a) this.f22421g.get(i3);
            if (aVar4.f22433b != null) {
                this.f22416b.reset();
                int size = aVar4.f22432a.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.f22416b.addPath(((C7325l) aVar4.f22432a.get(size)).mo23551q(), matrix2);
                }
                this.f22415a.setPath(this.f22416b, z2);
                float length = this.f22415a.getLength();
                while (this.f22415a.nextContour()) {
                    length += this.f22415a.getLength();
                }
                float floatValue2 = (((Float) aVar4.f22433b.f22555f.mo23717f()).floatValue() * length) / 360.0f;
                float floatValue3 = ((((Float) aVar4.f22433b.f22553d.mo23717f()).floatValue() / f5) * length) + floatValue2;
                float floatValue4 = ((((Float) aVar4.f22433b.f22554e.mo23717f()).floatValue() / f5) * length) + floatValue2;
                int size2 = aVar4.f22432a.size() - 1;
                float f7 = BitmapDescriptorFactory.HUE_RED;
                while (size2 >= 0) {
                    this.f22417c.set(((C7325l) aVar4.f22432a.get(size2)).mo23551q());
                    this.f22417c.transform(matrix2);
                    this.f22415a.setPath(this.f22417c, z2);
                    float length2 = this.f22415a.getLength();
                    if (floatValue4 > length) {
                        float f8 = floatValue4 - length;
                        if (f8 < f7 + length2 && f7 < f8) {
                            if (floatValue3 > length) {
                                f3 = (floatValue3 - length) / length2;
                            } else {
                                f3 = BitmapDescriptorFactory.HUE_RED;
                            }
                            C5059g.m12908a(this.f22417c, f3, Math.min(f8 / length2, f6), BitmapDescriptorFactory.HUE_RED);
                            canvas2.drawPath(this.f22417c, this.f22423i);
                            f7 += length2;
                            size2--;
                            z2 = false;
                            f6 = 1.0f;
                        }
                    }
                    float f9 = f7 + length2;
                    if (f9 >= floatValue3 && f7 <= floatValue4) {
                        if (f9 > floatValue4 || floatValue3 >= f7) {
                            if (floatValue3 < f7) {
                                f = BitmapDescriptorFactory.HUE_RED;
                            } else {
                                f = (floatValue3 - f7) / length2;
                            }
                            if (floatValue4 > f9) {
                                f2 = 1.0f;
                            } else {
                                f2 = (floatValue4 - f7) / length2;
                            }
                            C5059g.m12908a(this.f22417c, f, f2, BitmapDescriptorFactory.HUE_RED);
                            canvas2.drawPath(this.f22417c, this.f22423i);
                        } else {
                            canvas2.drawPath(this.f22417c, this.f22423i);
                        }
                    }
                    f7 += length2;
                    size2--;
                    z2 = false;
                    f6 = 1.0f;
                }
                C17885a.m44412M();
            } else {
                this.f22416b.reset();
                for (int size3 = aVar4.f22432a.size() - 1; size3 >= 0; size3--) {
                    this.f22416b.addPath(((C7325l) aVar4.f22432a.get(size3)).mo23551q(), matrix2);
                }
                C17885a.m44412M();
                canvas2.drawPath(this.f22416b, this.f22423i);
                C17885a.m44412M();
            }
            i3++;
            z2 = false;
            f6 = 1.0f;
            f5 = 100.0f;
        }
        C17885a.m44412M();
    }

    /* renamed from: g */
    public void mo5840g(C5282c cVar, Object obj) {
        C7463c cVar2;
        C7463c cVar3;
        C7463c cVar4;
        C7463c cVar5;
        C7463c cVar6;
        if (obj == C1903q.f6680d) {
            this.f22425k.mo23722k(cVar);
        } else if (obj == C1903q.f6695s) {
            this.f22424j.mo23722k(cVar);
        } else if (obj == C1903q.f6673K) {
            C7478q qVar = this.f22428n;
            if (qVar != null) {
                this.f22420f.mo6816o(qVar);
            }
            if (cVar == null) {
                this.f22428n = null;
                return;
            }
            C7478q qVar2 = new C7478q(cVar, null);
            this.f22428n = qVar2;
            qVar2.mo23712a(this);
            this.f22420f.mo6806e(this.f22428n);
        } else if (obj == C1903q.f6686j) {
            C7456a<Float, Float> aVar = this.f22429o;
            if (aVar != null) {
                aVar.mo23722k(cVar);
                return;
            }
            C7478q qVar3 = new C7478q(cVar, null);
            this.f22429o = qVar3;
            qVar3.mo23712a(this);
            this.f22420f.mo6806e(this.f22429o);
        } else if (obj == C1903q.f6681e && (cVar6 = this.f22431q) != null) {
            cVar6.f22892b.mo23722k(cVar);
        } else if (obj == C1903q.f6669G && (cVar5 = this.f22431q) != null) {
            cVar5.mo23732c(cVar);
        } else if (obj == C1903q.f6670H && (cVar4 = this.f22431q) != null) {
            cVar4.f22894d.mo23722k(cVar);
        } else if (obj == C1903q.f6671I && (cVar3 = this.f22431q) != null) {
            cVar3.f22895e.mo23722k(cVar);
        } else if (obj == C1903q.f6672J && (cVar2 = this.f22431q) != null) {
            cVar2.f22896f.mo23722k(cVar);
        }
    }
}
