package com.airbnb.lottie.model.layer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.airbnb.lottie.C1867f;
import com.airbnb.lottie.C1876l;
import com.airbnb.lottie.C1903q;
import com.airbnb.lottie.model.layer.C1894a;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p024b5.C1482d;
import p037c5.C1781b;
import p071e5.C4555b;
import p071e5.C4556c;
import p071e5.C4557d;
import p071e5.C4558e;
import p071e5.C4559f;
import p107h5.C5055c;
import p107h5.C5059g;
import p120i5.C5282c;
import p241s0.C6305e;
import p332z4.C7456a;
import p332z4.C7478q;
import p584jl.C17885a;

/* renamed from: com.airbnb.lottie.model.layer.b */
public final class C1896b extends C1894a {

    /* renamed from: A */
    public C7456a<Float, Float> f6637A;

    /* renamed from: B */
    public final ArrayList f6638B = new ArrayList();

    /* renamed from: C */
    public final RectF f6639C = new RectF();

    /* renamed from: D */
    public final RectF f6640D = new RectF();

    /* renamed from: E */
    public final Paint f6641E = new Paint();

    /* renamed from: com.airbnb.lottie.model.layer.b$a */
    public static /* synthetic */ class C1897a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f6642a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.airbnb.lottie.model.layer.Layer$MatteType[] r0 = com.airbnb.lottie.model.layer.Layer.MatteType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6642a = r0
                com.airbnb.lottie.model.layer.Layer$MatteType r1 = com.airbnb.lottie.model.layer.Layer.MatteType.ADD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f6642a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.model.layer.Layer$MatteType r1 = com.airbnb.lottie.model.layer.Layer.MatteType.INVERT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.model.layer.C1896b.C1897a.<clinit>():void");
        }
    }

    public C1896b(C1876l lVar, Layer layer, List<Layer> list, C1867f fVar) {
        super(lVar, layer);
        C1894a aVar;
        C1894a aVar2;
        C1781b bVar = layer.f6603s;
        if (bVar != null) {
            C7456a<Float, Float> i = bVar.mo6602i();
            this.f6637A = i;
            mo6806e(i);
            this.f6637A.mo23712a(this);
        } else {
            this.f6637A = null;
        }
        C6305e eVar = new C6305e(fVar.f6457i.size());
        int size = list.size() - 1;
        C1894a aVar3 = null;
        while (true) {
            if (size >= 0) {
                Layer layer2 = list.get(size);
                switch (C1894a.C1895a.f6635a[layer2.f6589e.ordinal()]) {
                    case 1:
                        aVar2 = new C4557d(lVar, layer2, this);
                        break;
                    case 2:
                        aVar2 = new C1896b(lVar, layer2, fVar.f6451c.get(layer2.f6591g), fVar);
                        break;
                    case 3:
                        aVar2 = new C4558e(lVar, layer2);
                        break;
                    case 4:
                        aVar2 = new C4555b(lVar, layer2);
                        break;
                    case 5:
                        aVar2 = new C4556c(lVar, layer2);
                        break;
                    case 6:
                        aVar2 = new C4559f(lVar, layer2);
                        break;
                    default:
                        StringBuilder k = C13555b.m33972k("Unknown layer type ");
                        k.append(layer2.f6589e);
                        C5055c.m12896b(k.toString());
                        aVar2 = null;
                        break;
                }
                if (aVar2 != null) {
                    eVar.mo22331k(aVar2.f6622n.f6588d, aVar2);
                    if (aVar3 != null) {
                        aVar3.f6625q = aVar2;
                        aVar3 = null;
                    } else {
                        this.f6638B.add(0, aVar2);
                        int i2 = C1897a.f6642a[layer2.f6605u.ordinal()];
                        if (i2 == 1 || i2 == 2) {
                            aVar3 = aVar2;
                        }
                    }
                }
                size--;
            } else {
                for (int i3 = 0; i3 < eVar.mo22333m(); i3++) {
                    C1894a aVar4 = (C1894a) eVar.mo22329i(eVar.mo22330j(i3), (Long) null);
                    if (!(aVar4 == null || (aVar = (C1894a) eVar.mo22329i(aVar4.f6622n.f6590f, (Long) null)) == null)) {
                        aVar4.f6626r = aVar;
                    }
                }
                return;
            }
        }
    }

    /* renamed from: d */
    public final void mo6805d(RectF rectF, Matrix matrix, boolean z) {
        super.mo6805d(rectF, matrix, z);
        for (int size = this.f6638B.size() - 1; size >= 0; size--) {
            this.f6639C.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            ((C1894a) this.f6638B.get(size)).mo6805d(this.f6639C, this.f6620l, true);
            rectF.union(this.f6639C);
        }
    }

    /* renamed from: g */
    public final void mo5840g(C5282c cVar, Object obj) {
        super.mo5840g(cVar, obj);
        if (obj != C1903q.f6667E) {
            return;
        }
        if (cVar == null) {
            C7456a<Float, Float> aVar = this.f6637A;
            if (aVar != null) {
                aVar.mo23722k((C5282c) null);
                return;
            }
            return;
        }
        C7478q qVar = new C7478q(cVar, null);
        this.f6637A = qVar;
        qVar.mo23712a(this);
        mo6806e(this.f6637A);
    }

    /* renamed from: j */
    public final void mo6811j(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        boolean z2;
        RectF rectF = this.f6640D;
        Layer layer = this.f6622n;
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) layer.f6599o, (float) layer.f6600p);
        matrix.mapRect(this.f6640D);
        if (!this.f6621m.f6497r || this.f6638B.size() <= 1 || i == 255) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f6641E.setAlpha(i);
            C5059g.m12912e(canvas, this.f6640D, this.f6641E, 31);
        } else {
            canvas.save();
        }
        if (z) {
            i = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
        }
        for (int size = this.f6638B.size() - 1; size >= 0; size--) {
            if (!this.f6640D.isEmpty()) {
                z2 = canvas.clipRect(this.f6640D);
            } else {
                z2 = true;
            }
            if (z2) {
                ((C1894a) this.f6638B.get(size)).mo6807f(canvas, matrix, i);
            }
        }
        canvas.restore();
        C17885a.m44412M();
    }

    /* renamed from: p */
    public final void mo6817p(C1482d dVar, int i, ArrayList arrayList, C1482d dVar2) {
        for (int i2 = 0; i2 < this.f6638B.size(); i2++) {
            ((C1894a) this.f6638B.get(i2)).mo5839c(dVar, i, arrayList, dVar2);
        }
    }

    /* renamed from: r */
    public final void mo6818r(boolean z) {
        super.mo6818r(z);
        Iterator it = this.f6638B.iterator();
        while (it.hasNext()) {
            ((C1894a) it.next()).mo6818r(z);
        }
    }

    /* renamed from: s */
    public final void mo6819s(float f) {
        super.mo6819s(f);
        C7456a<Float, Float> aVar = this.f6637A;
        if (aVar != null) {
            C1867f fVar = this.f6621m.f6482c;
            f = ((aVar.mo23717f().floatValue() * this.f6622n.f6586b.f6461m) - this.f6622n.f6586b.f6459k) / ((fVar.f6460l - fVar.f6459k) + 0.01f);
        }
        if (this.f6637A == null) {
            Layer layer = this.f6622n;
            float f2 = layer.f6598n;
            C1867f fVar2 = layer.f6586b;
            f -= f2 / (fVar2.f6460l - fVar2.f6459k);
        }
        Layer layer2 = this.f6622n;
        if (layer2.f6597m != BitmapDescriptorFactory.HUE_RED && !"__container".equals(layer2.f6587c)) {
            f /= this.f6622n.f6597m;
        }
        int size = this.f6638B.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C1894a) this.f6638B.get(size)).mo6819s(f);
            } else {
                return;
            }
        }
    }
}
