package p321y4;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C1876l;
import com.airbnb.lottie.model.layer.C1894a;
import com.appboy.support.ValidationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import p024b5.C1482d;
import p024b5.C1483e;
import p037c5.C1791l;
import p107h5.C5059g;
import p120i5.C5282c;
import p309x4.C7155a;
import p332z4.C7456a;
import p332z4.C7477p;

/* renamed from: y4.c */
public final class C7315c implements C7316d, C7325l, C7456a.C7457a, C1483e {

    /* renamed from: a */
    public final C7155a f22434a;

    /* renamed from: b */
    public final RectF f22435b;

    /* renamed from: c */
    public final Matrix f22436c;

    /* renamed from: d */
    public final Path f22437d;

    /* renamed from: e */
    public final RectF f22438e;

    /* renamed from: f */
    public final String f22439f;

    /* renamed from: g */
    public final boolean f22440g;

    /* renamed from: h */
    public final List<C7314b> f22441h;

    /* renamed from: i */
    public final C1876l f22442i;

    /* renamed from: j */
    public ArrayList f22443j;

    /* renamed from: k */
    public C7477p f22444k;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7315c(com.airbnb.lottie.C1876l r8, com.airbnb.lottie.model.layer.C1894a r9, p059d5.C4377i r10) {
        /*
            r7 = this;
            java.lang.String r3 = r10.f15401a
            boolean r4 = r10.f15403c
            java.util.List<d5.b> r0 = r10.f15402b
            java.util.ArrayList r5 = new java.util.ArrayList
            int r1 = r0.size()
            r5.<init>(r1)
            r1 = 0
            r2 = 0
        L_0x0011:
            int r6 = r0.size()
            if (r2 >= r6) goto L_0x0029
            java.lang.Object r6 = r0.get(r2)
            d5.b r6 = (p059d5.C4370b) r6
            y4.b r6 = r6.mo6606a(r8, r9)
            if (r6 == 0) goto L_0x0026
            r5.add(r6)
        L_0x0026:
            int r2 = r2 + 1
            goto L_0x0011
        L_0x0029:
            java.util.List<d5.b> r10 = r10.f15402b
        L_0x002b:
            int r0 = r10.size()
            if (r1 >= r0) goto L_0x0042
            java.lang.Object r0 = r10.get(r1)
            d5.b r0 = (p059d5.C4370b) r0
            boolean r2 = r0 instanceof p037c5.C1791l
            if (r2 == 0) goto L_0x003f
            c5.l r0 = (p037c5.C1791l) r0
            r6 = r0
            goto L_0x0044
        L_0x003f:
            int r1 = r1 + 1
            goto L_0x002b
        L_0x0042:
            r10 = 0
            r6 = r10
        L_0x0044:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p321y4.C7315c.<init>(com.airbnb.lottie.l, com.airbnb.lottie.model.layer.a, d5.i):void");
    }

    /* renamed from: a */
    public final void mo6803a() {
        this.f22442i.invalidateSelf();
    }

    /* renamed from: b */
    public final void mo6804b(List<C7314b> list, List<C7314b> list2) {
        ArrayList arrayList = new ArrayList(this.f22441h.size() + list.size());
        arrayList.addAll(list);
        for (int size = this.f22441h.size() - 1; size >= 0; size--) {
            C7314b bVar = this.f22441h.get(size);
            bVar.mo6804b(arrayList, this.f22441h.subList(0, size));
            arrayList.add(bVar);
        }
    }

    /* renamed from: c */
    public final void mo5839c(C1482d dVar, int i, ArrayList arrayList, C1482d dVar2) {
        if (dVar.mo5836c(i, this.f22439f) || "__container".equals(this.f22439f)) {
            if (!"__container".equals(this.f22439f)) {
                String str = this.f22439f;
                dVar2.getClass();
                C1482d dVar3 = new C1482d(dVar2);
                dVar3.f5382a.add(str);
                if (dVar.mo5834a(i, this.f22439f)) {
                    C1482d dVar4 = new C1482d(dVar3);
                    dVar4.f5383b = this;
                    arrayList.add(dVar4);
                }
                dVar2 = dVar3;
            }
            if (dVar.mo5837d(i, this.f22439f)) {
                int b = dVar.mo5835b(i, this.f22439f) + i;
                for (int i2 = 0; i2 < this.f22441h.size(); i2++) {
                    C7314b bVar = this.f22441h.get(i2);
                    if (bVar instanceof C1483e) {
                        ((C1483e) bVar).mo5839c(dVar, b, arrayList, dVar2);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final void mo6805d(RectF rectF, Matrix matrix, boolean z) {
        this.f22436c.set(matrix);
        C7477p pVar = this.f22444k;
        if (pVar != null) {
            this.f22436c.preConcat(pVar.mo23742d());
        }
        this.f22438e.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        int size = this.f22441h.size();
        while (true) {
            size--;
            if (size >= 0) {
                C7314b bVar = this.f22441h.get(size);
                if (bVar instanceof C7316d) {
                    ((C7316d) bVar).mo6805d(this.f22438e, this.f22436c, z);
                    rectF.union(this.f22438e);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: e */
    public final List<C7325l> mo23550e() {
        if (this.f22443j == null) {
            this.f22443j = new ArrayList();
            for (int i = 0; i < this.f22441h.size(); i++) {
                C7314b bVar = this.f22441h.get(i);
                if (bVar instanceof C7325l) {
                    this.f22443j.add((C7325l) bVar);
                }
            }
        }
        return this.f22443j;
    }

    /* renamed from: f */
    public final void mo6807f(Canvas canvas, Matrix matrix, int i) {
        boolean z;
        int i2;
        if (!this.f22440g) {
            this.f22436c.set(matrix);
            C7477p pVar = this.f22444k;
            if (pVar != null) {
                this.f22436c.preConcat(pVar.mo23742d());
                C7456a<Integer, Integer> aVar = this.f22444k.f22928j;
                if (aVar == null) {
                    i2 = 100;
                } else {
                    i2 = aVar.mo23717f().intValue();
                }
                i = (int) ((((((float) i2) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
            }
            boolean z2 = false;
            if (this.f22442i.f6497r) {
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    if (i3 < this.f22441h.size()) {
                        if ((this.f22441h.get(i3) instanceof C7316d) && (i4 = i4 + 1) >= 2) {
                            z = true;
                            break;
                        }
                        i3++;
                    } else {
                        z = false;
                        break;
                    }
                }
                if (z && i != 255) {
                    z2 = true;
                }
            }
            if (z2) {
                this.f22435b.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
                mo6805d(this.f22435b, this.f22436c, true);
                this.f22434a.setAlpha(i);
                C5059g.m12912e(canvas, this.f22435b, this.f22434a, 31);
            }
            if (z2) {
                i = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
            }
            for (int size = this.f22441h.size() - 1; size >= 0; size--) {
                C7314b bVar = this.f22441h.get(size);
                if (bVar instanceof C7316d) {
                    ((C7316d) bVar).mo6807f(canvas, this.f22436c, i);
                }
            }
            if (z2) {
                canvas.restore();
            }
        }
    }

    /* renamed from: g */
    public final void mo5840g(C5282c cVar, Object obj) {
        C7477p pVar = this.f22444k;
        if (pVar != null) {
            pVar.mo23741c(cVar, obj);
        }
    }

    public final String getName() {
        return this.f22439f;
    }

    /* renamed from: q */
    public final Path mo23551q() {
        this.f22436c.reset();
        C7477p pVar = this.f22444k;
        if (pVar != null) {
            this.f22436c.set(pVar.mo23742d());
        }
        this.f22437d.reset();
        if (this.f22440g) {
            return this.f22437d;
        }
        for (int size = this.f22441h.size() - 1; size >= 0; size--) {
            C7314b bVar = this.f22441h.get(size);
            if (bVar instanceof C7325l) {
                this.f22437d.addPath(((C7325l) bVar).mo23551q(), this.f22436c);
            }
        }
        return this.f22437d;
    }

    public C7315c(C1876l lVar, C1894a aVar, String str, boolean z, ArrayList arrayList, C1791l lVar2) {
        this.f22434a = new C7155a();
        this.f22435b = new RectF();
        this.f22436c = new Matrix();
        this.f22437d = new Path();
        this.f22438e = new RectF();
        this.f22439f = str;
        this.f22442i = lVar;
        this.f22440g = z;
        this.f22441h = arrayList;
        if (lVar2 != null) {
            C7477p pVar = new C7477p(lVar2);
            this.f22444k = pVar;
            pVar.mo23739a(aVar);
            this.f22444k.mo23740b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C7314b bVar = (C7314b) arrayList.get(size);
            if (bVar instanceof C7321i) {
                arrayList2.add((C7321i) bVar);
            }
        }
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 >= 0) {
                ((C7321i) arrayList2.get(size2)).mo23556e(arrayList.listIterator(arrayList.size()));
            } else {
                return;
            }
        }
    }
}
