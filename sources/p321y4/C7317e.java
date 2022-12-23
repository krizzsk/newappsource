package p321y4;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C1876l;
import com.airbnb.lottie.C1903q;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.C1894a;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import p024b5.C1482d;
import p059d5.C4369a;
import p092g3.C4752a;
import p107h5.C5058f;
import p120i5.C5282c;
import p332z4.C7456a;
import p332z4.C7472k;

/* renamed from: y4.e */
public final class C7317e implements C7325l, C7456a.C7457a, C7322j {

    /* renamed from: a */
    public final Path f22445a = new Path();

    /* renamed from: b */
    public final String f22446b;

    /* renamed from: c */
    public final C1876l f22447c;

    /* renamed from: d */
    public final C7472k f22448d;

    /* renamed from: e */
    public final C7456a<?, PointF> f22449e;

    /* renamed from: f */
    public final C4369a f22450f;

    /* renamed from: g */
    public final C4752a f22451g = new C4752a(1, 0);

    /* renamed from: h */
    public boolean f22452h;

    public C7317e(C1876l lVar, C1894a aVar, C4369a aVar2) {
        this.f22446b = aVar2.f15367a;
        this.f22447c = lVar;
        C7456a<PointF, PointF> i = aVar2.f15369c.mo6602i();
        this.f22448d = (C7472k) i;
        C7456a<PointF, PointF> i2 = aVar2.f15368b.mo6602i();
        this.f22449e = i2;
        this.f22450f = aVar2;
        aVar.mo6806e(i);
        aVar.mo6806e(i2);
        i.mo23712a(this);
        i2.mo23712a(this);
    }

    /* renamed from: a */
    public final void mo6803a() {
        this.f22452h = false;
        this.f22447c.invalidateSelf();
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
                        ((List) this.f22451g.f16037a).add(rVar);
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
        if (obj == C1903q.f6687k) {
            this.f22448d.mo23722k(cVar);
        } else if (obj == C1903q.f6690n) {
            this.f22449e.mo23722k(cVar);
        }
    }

    public final String getName() {
        return this.f22446b;
    }

    /* renamed from: q */
    public final Path mo23551q() {
        if (this.f22452h) {
            return this.f22445a;
        }
        this.f22445a.reset();
        if (this.f22450f.f15371e) {
            this.f22452h = true;
            return this.f22445a;
        }
        PointF pointF = (PointF) this.f22448d.mo23717f();
        float f = pointF.x / 2.0f;
        float f2 = pointF.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.f22445a.reset();
        if (this.f22450f.f15370d) {
            float f5 = -f2;
            this.f22445a.moveTo(BitmapDescriptorFactory.HUE_RED, f5);
            Path path = this.f22445a;
            float f6 = BitmapDescriptorFactory.HUE_RED - f3;
            float f7 = -f;
            float f8 = BitmapDescriptorFactory.HUE_RED - f4;
            path.cubicTo(f6, f5, f7, f8, f7, BitmapDescriptorFactory.HUE_RED);
            Path path2 = this.f22445a;
            float f9 = f4 + BitmapDescriptorFactory.HUE_RED;
            float f11 = f5;
            path2.cubicTo(f7, f9, f6, f2, BitmapDescriptorFactory.HUE_RED, f2);
            Path path3 = this.f22445a;
            float f12 = f3 + BitmapDescriptorFactory.HUE_RED;
            path3.cubicTo(f12, f2, f, f9, f, BitmapDescriptorFactory.HUE_RED);
            this.f22445a.cubicTo(f, f8, f12, f11, BitmapDescriptorFactory.HUE_RED, f11);
        } else {
            float f13 = -f2;
            this.f22445a.moveTo(BitmapDescriptorFactory.HUE_RED, f13);
            Path path4 = this.f22445a;
            float f14 = f3 + BitmapDescriptorFactory.HUE_RED;
            float f15 = BitmapDescriptorFactory.HUE_RED - f4;
            path4.cubicTo(f14, f13, f, f15, f, BitmapDescriptorFactory.HUE_RED);
            Path path5 = this.f22445a;
            float f16 = f4 + BitmapDescriptorFactory.HUE_RED;
            path5.cubicTo(f, f16, f14, f2, BitmapDescriptorFactory.HUE_RED, f2);
            Path path6 = this.f22445a;
            float f17 = BitmapDescriptorFactory.HUE_RED - f3;
            float f18 = -f;
            path6.cubicTo(f17, f2, f18, f16, f18, BitmapDescriptorFactory.HUE_RED);
            float f19 = f13;
            this.f22445a.cubicTo(f18, f15, f17, f19, BitmapDescriptorFactory.HUE_RED, f19);
        }
        PointF f21 = this.f22449e.mo23717f();
        this.f22445a.offset(f21.x, f21.y);
        this.f22445a.close();
        this.f22451g.mo20258e(this.f22445a);
        this.f22452h = true;
        return this.f22445a;
    }
}
