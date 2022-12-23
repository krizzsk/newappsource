package p321y4;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.C1876l;
import com.airbnb.lottie.C1903q;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.C1894a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import p024b5.C1482d;
import p059d5.C4373e;
import p092g3.C4752a;
import p107h5.C5058f;
import p120i5.C5282c;
import p332z4.C7456a;
import p332z4.C7465d;

/* renamed from: y4.n */
public final class C7328n implements C7456a.C7457a, C7322j, C7325l {

    /* renamed from: a */
    public final Path f22519a = new Path();

    /* renamed from: b */
    public final RectF f22520b = new RectF();

    /* renamed from: c */
    public final String f22521c;

    /* renamed from: d */
    public final boolean f22522d;

    /* renamed from: e */
    public final C1876l f22523e;

    /* renamed from: f */
    public final C7456a<?, PointF> f22524f;

    /* renamed from: g */
    public final C7456a<?, PointF> f22525g;

    /* renamed from: h */
    public final C7465d f22526h;

    /* renamed from: i */
    public final C4752a f22527i = new C4752a(1, 0);

    /* renamed from: j */
    public boolean f22528j;

    public C7328n(C1876l lVar, C1894a aVar, C4373e eVar) {
        this.f22521c = eVar.f15382a;
        this.f22522d = eVar.f15386e;
        this.f22523e = lVar;
        C7456a<PointF, PointF> i = eVar.f15383b.mo6602i();
        this.f22524f = i;
        C7456a<PointF, PointF> i2 = eVar.f15384c.mo6602i();
        this.f22525g = i2;
        C7456a<Float, Float> i3 = eVar.f15385d.mo6602i();
        this.f22526h = (C7465d) i3;
        aVar.mo6806e(i);
        aVar.mo6806e(i2);
        aVar.mo6806e(i3);
        i.mo23712a(this);
        i2.mo23712a(this);
        i3.mo23712a(this);
    }

    /* renamed from: a */
    public final void mo6803a() {
        this.f22528j = false;
        this.f22523e.invalidateSelf();
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
                        ((List) this.f22527i.f16037a).add(rVar);
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
        if (obj == C1903q.f6688l) {
            this.f22525g.mo23722k(cVar);
        } else if (obj == C1903q.f6690n) {
            this.f22524f.mo23722k(cVar);
        } else if (obj == C1903q.f6689m) {
            this.f22526h.mo23722k(cVar);
        }
    }

    public final String getName() {
        return this.f22521c;
    }

    /* renamed from: q */
    public final Path mo23551q() {
        float f;
        if (this.f22528j) {
            return this.f22519a;
        }
        this.f22519a.reset();
        if (this.f22522d) {
            this.f22528j = true;
            return this.f22519a;
        }
        PointF f2 = this.f22525g.mo23717f();
        float f3 = f2.x / 2.0f;
        float f4 = f2.y / 2.0f;
        C7465d dVar = this.f22526h;
        if (dVar == null) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = dVar.mo23733l();
        }
        float min = Math.min(f3, f4);
        if (f > min) {
            f = min;
        }
        PointF f5 = this.f22524f.mo23717f();
        this.f22519a.moveTo(f5.x + f3, (f5.y - f4) + f);
        this.f22519a.lineTo(f5.x + f3, (f5.y + f4) - f);
        int i = (f > BitmapDescriptorFactory.HUE_RED ? 1 : (f == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        if (i > 0) {
            RectF rectF = this.f22520b;
            float f6 = f5.x + f3;
            float f7 = f * 2.0f;
            float f8 = f5.y + f4;
            rectF.set(f6 - f7, f8 - f7, f6, f8);
            this.f22519a.arcTo(this.f22520b, BitmapDescriptorFactory.HUE_RED, 90.0f, false);
        }
        this.f22519a.lineTo((f5.x - f3) + f, f5.y + f4);
        if (i > 0) {
            RectF rectF2 = this.f22520b;
            float f9 = f5.x - f3;
            float f11 = f5.y + f4;
            float f12 = f * 2.0f;
            rectF2.set(f9, f11 - f12, f12 + f9, f11);
            this.f22519a.arcTo(this.f22520b, 90.0f, 90.0f, false);
        }
        this.f22519a.lineTo(f5.x - f3, (f5.y - f4) + f);
        if (i > 0) {
            RectF rectF3 = this.f22520b;
            float f13 = f5.x - f3;
            float f14 = f5.y - f4;
            float f15 = f * 2.0f;
            rectF3.set(f13, f14, f13 + f15, f15 + f14);
            this.f22519a.arcTo(this.f22520b, 180.0f, 90.0f, false);
        }
        this.f22519a.lineTo((f5.x + f3) - f, f5.y - f4);
        if (i > 0) {
            RectF rectF4 = this.f22520b;
            float f16 = f5.x + f3;
            float f17 = f * 2.0f;
            float f18 = f5.y - f4;
            rectF4.set(f16 - f17, f18, f16, f17 + f18);
            this.f22519a.arcTo(this.f22520b, 270.0f, 90.0f, false);
        }
        this.f22519a.close();
        this.f22527i.mo20258e(this.f22519a);
        this.f22528j = true;
        return this.f22519a;
    }
}
