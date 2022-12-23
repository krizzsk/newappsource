package p321y4;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.C1876l;
import com.airbnb.lottie.C1903q;
import com.airbnb.lottie.model.layer.C1894a;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import p024b5.C1482d;
import p037c5.C1781b;
import p059d5.C4376h;
import p107h5.C5058f;
import p120i5.C5282c;
import p309x4.C7155a;
import p332z4.C7456a;
import p332z4.C7462b;
import p332z4.C7463c;
import p332z4.C7467f;
import p332z4.C7478q;
import p584jl.C17885a;

/* renamed from: y4.f */
public final class C7318f implements C7316d, C7456a.C7457a, C7322j {

    /* renamed from: a */
    public final Path f22453a;

    /* renamed from: b */
    public final C7155a f22454b = new C7155a(1);

    /* renamed from: c */
    public final C1894a f22455c;

    /* renamed from: d */
    public final String f22456d;

    /* renamed from: e */
    public final boolean f22457e;

    /* renamed from: f */
    public final ArrayList f22458f = new ArrayList();

    /* renamed from: g */
    public final C7462b f22459g;

    /* renamed from: h */
    public final C7467f f22460h;

    /* renamed from: i */
    public C7478q f22461i;

    /* renamed from: j */
    public final C1876l f22462j;

    /* renamed from: k */
    public C7456a<Float, Float> f22463k;

    /* renamed from: l */
    public float f22464l;

    /* renamed from: m */
    public C7463c f22465m;

    public C7318f(C1876l lVar, C1894a aVar, C4376h hVar) {
        Path path = new Path();
        this.f22453a = path;
        this.f22455c = aVar;
        this.f22456d = hVar.f15397c;
        this.f22457e = hVar.f15400f;
        this.f22462j = lVar;
        if (aVar.mo6812k() != null) {
            C7456a<Float, Float> i = ((C1781b) aVar.mo6812k().f761c).mo6602i();
            this.f22463k = i;
            i.mo23712a(this);
            aVar.mo6806e(this.f22463k);
        }
        if (aVar.mo6813l() != null) {
            this.f22465m = new C7463c(this, aVar, aVar.mo6813l());
        }
        if (hVar.f15398d == null || hVar.f15399e == null) {
            this.f22459g = null;
            this.f22460h = null;
            return;
        }
        path.setFillType(hVar.f15396b);
        C7456a<Integer, Integer> i2 = hVar.f15398d.mo6602i();
        this.f22459g = (C7462b) i2;
        i2.mo23712a(this);
        aVar.mo6806e(i2);
        C7456a<Integer, Integer> i3 = hVar.f15399e.mo6602i();
        this.f22460h = (C7467f) i3;
        i3.mo23712a(this);
        aVar.mo6806e(i3);
    }

    /* renamed from: a */
    public final void mo6803a() {
        this.f22462j.invalidateSelf();
    }

    /* renamed from: b */
    public final void mo6804b(List<C7314b> list, List<C7314b> list2) {
        for (int i = 0; i < list2.size(); i++) {
            C7314b bVar = list2.get(i);
            if (bVar instanceof C7325l) {
                this.f22458f.add((C7325l) bVar);
            }
        }
    }

    /* renamed from: c */
    public final void mo5839c(C1482d dVar, int i, ArrayList arrayList, C1482d dVar2) {
        C5058f.m12907d(dVar, i, arrayList, dVar2, this);
    }

    /* renamed from: d */
    public final void mo6805d(RectF rectF, Matrix matrix, boolean z) {
        this.f22453a.reset();
        for (int i = 0; i < this.f22458f.size(); i++) {
            this.f22453a.addPath(((C7325l) this.f22458f.get(i)).mo23551q(), matrix);
        }
        this.f22453a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    /* renamed from: f */
    public final void mo6807f(Canvas canvas, Matrix matrix, int i) {
        BlurMaskFilter blurMaskFilter;
        if (!this.f22457e) {
            C7155a aVar = this.f22454b;
            C7462b bVar = this.f22459g;
            aVar.setColor(bVar.mo23730l(bVar.mo23713b(), bVar.mo23715d()));
            C7155a aVar2 = this.f22454b;
            PointF pointF = C5058f.f17056a;
            aVar2.setAlpha(Math.max(0, Math.min(ValidationUtils.APPBOY_STRING_MAX_LENGTH, (int) ((((((float) i) / 255.0f) * ((float) ((Integer) this.f22460h.mo23717f()).intValue())) / 100.0f) * 255.0f))));
            C7478q qVar = this.f22461i;
            if (qVar != null) {
                this.f22454b.setColorFilter((ColorFilter) qVar.mo23717f());
            }
            C7456a<Float, Float> aVar3 = this.f22463k;
            if (aVar3 != null) {
                float floatValue = aVar3.mo23717f().floatValue();
                if (floatValue == BitmapDescriptorFactory.HUE_RED) {
                    this.f22454b.setMaskFilter((MaskFilter) null);
                } else if (floatValue != this.f22464l) {
                    C1894a aVar4 = this.f22455c;
                    if (aVar4.f6633y == floatValue) {
                        blurMaskFilter = aVar4.f6634z;
                    } else {
                        BlurMaskFilter blurMaskFilter2 = new BlurMaskFilter(floatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                        aVar4.f6634z = blurMaskFilter2;
                        aVar4.f6633y = floatValue;
                        blurMaskFilter = blurMaskFilter2;
                    }
                    this.f22454b.setMaskFilter(blurMaskFilter);
                }
                this.f22464l = floatValue;
            }
            C7463c cVar = this.f22465m;
            if (cVar != null) {
                cVar.mo23731b(this.f22454b);
            }
            this.f22453a.reset();
            for (int i2 = 0; i2 < this.f22458f.size(); i2++) {
                this.f22453a.addPath(((C7325l) this.f22458f.get(i2)).mo23551q(), matrix);
            }
            canvas.drawPath(this.f22453a, this.f22454b);
            C17885a.m44412M();
        }
    }

    /* renamed from: g */
    public final void mo5840g(C5282c cVar, Object obj) {
        C7463c cVar2;
        C7463c cVar3;
        C7463c cVar4;
        C7463c cVar5;
        C7463c cVar6;
        if (obj == C1903q.f6677a) {
            this.f22459g.mo23722k(cVar);
        } else if (obj == C1903q.f6680d) {
            this.f22460h.mo23722k(cVar);
        } else if (obj == C1903q.f6673K) {
            C7478q qVar = this.f22461i;
            if (qVar != null) {
                this.f22455c.mo6816o(qVar);
            }
            if (cVar == null) {
                this.f22461i = null;
                return;
            }
            C7478q qVar2 = new C7478q(cVar, null);
            this.f22461i = qVar2;
            qVar2.mo23712a(this);
            this.f22455c.mo6806e(this.f22461i);
        } else if (obj == C1903q.f6686j) {
            C7456a<Float, Float> aVar = this.f22463k;
            if (aVar != null) {
                aVar.mo23722k(cVar);
                return;
            }
            C7478q qVar3 = new C7478q(cVar, null);
            this.f22463k = qVar3;
            qVar3.mo23712a(this);
            this.f22455c.mo6806e(this.f22463k);
        } else if (obj == C1903q.f6681e && (cVar6 = this.f22465m) != null) {
            cVar6.f22892b.mo23722k(cVar);
        } else if (obj == C1903q.f6669G && (cVar5 = this.f22465m) != null) {
            cVar5.mo23732c(cVar);
        } else if (obj == C1903q.f6670H && (cVar4 = this.f22465m) != null) {
            cVar4.f22894d.mo23722k(cVar);
        } else if (obj == C1903q.f6671I && (cVar3 = this.f22465m) != null) {
            cVar3.f22895e.mo23722k(cVar);
        } else if (obj == C1903q.f6672J && (cVar2 = this.f22465m) != null) {
            cVar2.f22896f.mo23722k(cVar);
        }
    }

    public final String getName() {
        return this.f22456d;
    }
}
