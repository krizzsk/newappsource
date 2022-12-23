package zi0;

import aj0.C21004a;
import bj0.C21085b;
import cj0.C21219a;
import dj0.C23275a;
import dj0.C23276b;
import dj0.C23277c;
import dj0.C23278d;
import ej0.C23316a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import org.poly2tri.triangulation.TriangulationAlgorithm;
import org.poly2tri.triangulation.TriangulationMode;
import org.poly2tri.triangulation.TriangulationUtil;
import org.poly2tri.triangulation.delaunay.sweep.PointOnEdgeException;
import p604kh.C18045d;

/* renamed from: zi0.a */
public final class C25534a {

    /* renamed from: a */
    public static final TriangulationAlgorithm f63790a = TriangulationAlgorithm.DTSweep;

    /* renamed from: zi0.a$a */
    public static /* synthetic */ class C25535a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f63791a;

        static {
            int[] iArr = new int[TriangulationAlgorithm.values().length];
            f63791a = iArr;
            try {
                iArr[TriangulationAlgorithm.DTSweep.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m63866a(C21004a aVar) {
        C23275a aVar2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        C21004a aVar3 = aVar;
        int i = C25535a.f63791a[f63790a.ordinal()];
        C23278d dVar = new C23278d();
        dVar.f52904d = aVar3;
        dVar.f52903c = TriangulationMode.POLYGON;
        ArrayList arrayList = aVar3.f52755c;
        if (arrayList == null) {
            aVar3.f52755c = new ArrayList(aVar3.f52753a.size());
        } else {
            arrayList.clear();
        }
        int i2 = 0;
        while (i2 < aVar3.f52753a.size() - 1) {
            i2++;
            new C23277c(aVar3.f52753a.get(i2), aVar3.f52753a.get(i2));
        }
        ArrayList<C21085b> arrayList2 = aVar3.f52753a;
        new C23277c(aVar3.f52753a.get(0), arrayList2.get(arrayList2.size() - 1));
        dVar.f52902b.addAll(aVar3.f52753a);
        ArrayList<C21004a> arrayList3 = aVar3.f52754b;
        if (arrayList3 != null) {
            Iterator<C21004a> it = arrayList3.iterator();
            while (it.hasNext()) {
                C21004a next = it.next();
                int i3 = 0;
                while (i3 < next.f52753a.size() - 1) {
                    i3++;
                    new C23277c(next.f52753a.get(i3), next.f52753a.get(i3));
                }
                ArrayList<C21085b> arrayList4 = next.f52753a;
                new C23277c(next.f52753a.get(0), arrayList4.get(arrayList4.size() - 1));
                dVar.f52902b.addAll(next.f52753a);
            }
        }
        double a = dVar.f52902b.get(0).mo53239a();
        double b = dVar.f52902b.get(0).mo53240b();
        Iterator<C21085b> it2 = dVar.f52902b.iterator();
        double d = b;
        double d2 = d;
        double d3 = a;
        while (it2.hasNext()) {
            C21085b next2 = it2.next();
            if (next2.mo53239a() > a) {
                a = next2.mo53239a();
            }
            if (next2.mo53239a() < d3) {
                d3 = next2.mo53239a();
            }
            if (next2.mo53240b() > d) {
                d = next2.mo53240b();
            }
            if (next2.mo53240b() < d2) {
                d2 = next2.mo53240b();
            }
        }
        double d4 = (a - d3) * 0.30000001192092896d;
        double d5 = d2 - ((d - d2) * 0.30000001192092896d);
        C23316a aVar4 = new C23316a(a + d4, d5);
        C23316a aVar5 = new C23316a(d3 - d4, d5);
        dVar.f59037g = aVar4;
        dVar.f59038h = aVar5;
        Collections.sort(dVar.f52902b, dVar.f59041k);
        int i4 = C25535a.f63791a[TriangulationAlgorithm.DTSweep.ordinal()];
        C21219a aVar6 = new C21219a(dVar.f52902b.get(0), dVar.f59038h, dVar.f59037g);
        dVar.f52901a.add(aVar6);
        C23275a aVar7 = new C23275a(aVar6.f53166e[1]);
        aVar7.f59033e = aVar6;
        C23275a aVar8 = new C23275a(aVar6.f53166e[0]);
        aVar8.f59033e = aVar6;
        C18045d dVar2 = new C18045d(aVar7, new C23275a(aVar6.f53166e[2]));
        dVar.f59036f = dVar2;
        C23275a aVar9 = (C23275a) dVar2.f46168b;
        aVar9.f59029a = aVar8;
        C23275a aVar10 = (C23275a) dVar2.f46169c;
        aVar8.f59029a = aVar10;
        aVar8.f59030b = aVar9;
        aVar10.f59030b = aVar8;
        ArrayList<C21085b> arrayList5 = dVar.f52902b;
        int i5 = 1;
        while (true) {
            C23275a aVar11 = null;
            if (i5 >= arrayList5.size()) {
                break;
            }
            C21085b bVar = arrayList5.get(i5);
            C18045d dVar3 = dVar.f59036f;
            dVar3.getClass();
            double a2 = bVar.mo53239a();
            C23275a aVar12 = (C23275a) dVar3.f46170d;
            if (a2 >= aVar12.f59031c) {
                while (true) {
                    aVar12 = aVar12.f59029a;
                    if (aVar12 != null) {
                        if (a2 < aVar12.f59031c) {
                            aVar11 = aVar12.f59030b;
                            dVar3.f46170d = aVar11;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            } else {
                while (true) {
                    aVar12 = aVar12.f59030b;
                    if (aVar12 != null) {
                        if (a2 >= aVar12.f59031c) {
                            dVar3.f46170d = aVar12;
                            aVar11 = aVar12;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            C21219a aVar13 = new C21219a(bVar, aVar11.f59032d, aVar11.f59029a.f59032d);
            aVar13.mo53575i(aVar11.f59033e);
            dVar.f52901a.add(aVar13);
            C23275a aVar14 = new C23275a(bVar);
            aVar14.f59029a = aVar11.f59029a;
            aVar14.f59030b = aVar11;
            aVar11.f59029a.f59030b = aVar14;
            aVar11.f59029a = aVar14;
            dVar.f59036f.getClass();
            if (!C23276b.m57350n(dVar, aVar13)) {
                dVar.mo58410a(aVar13);
            }
            if (bVar.mo53239a() <= aVar11.f59032d.mo53239a() + 1.0E-12d) {
                C23276b.m57338b(dVar, aVar11);
            }
            dVar.f59036f.getClass();
            for (C23275a aVar15 = aVar14.f59029a; aVar15.f59029a != null; aVar15 = aVar15.f59029a) {
                double m = C23276b.m57349m(aVar15);
                if (m > 1.5707963267948966d || m < -1.5707963267948966d) {
                    break;
                }
                C23276b.m57338b(dVar, aVar15);
            }
            for (C23275a aVar16 = aVar14.f59030b; aVar16.f59030b != null; aVar16 = aVar16.f59030b) {
                double m2 = C23276b.m57349m(aVar16);
                if (m2 > 1.5707963267948966d || m2 < -1.5707963267948966d) {
                    break;
                }
                C23276b.m57338b(dVar, aVar16);
            }
            C23275a aVar17 = aVar14.f59029a;
            if (aVar17 != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (aVar17.f59029a != null) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    if (Math.atan2(aVar14.f59032d.mo53240b() - aVar14.f59029a.f59029a.f59032d.mo53240b(), aVar14.f59032d.mo53239a() - aVar14.f59029a.f59029a.f59032d.mo53239a()) < 2.356194490192345d) {
                        C21085b bVar2 = aVar14.f59032d;
                        C23275a aVar18 = aVar14.f59029a;
                        if (TriangulationUtil.m61949b(bVar2, aVar18.f59032d, aVar18.f59029a.f59032d) == TriangulationUtil.Orientation.CCW) {
                            dVar.f59039i.f59042a = aVar14;
                        } else {
                            dVar.f59039i.f59042a = aVar14.f59029a;
                        }
                        C23278d.C23279a aVar19 = dVar.f59039i;
                        aVar19.f59043b = aVar19.f59042a;
                        while (true) {
                            C23275a aVar20 = dVar.f59039i.f59043b;
                            if (aVar20.f59029a != null) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            if (!z6 || aVar20.f59032d.mo53240b() < dVar.f59039i.f59043b.f59029a.f59032d.mo53240b()) {
                                C23278d.C23279a aVar21 = dVar.f59039i;
                                C23275a aVar22 = aVar21.f59043b;
                            } else {
                                C23278d.C23279a aVar23 = dVar.f59039i;
                                aVar23.f59043b = aVar23.f59043b.f59029a;
                            }
                        }
                        C23278d.C23279a aVar212 = dVar.f59039i;
                        C23275a aVar222 = aVar212.f59043b;
                        if (aVar222 != aVar212.f59042a) {
                            aVar212.f59044c = aVar222;
                            while (true) {
                                C23275a aVar24 = dVar.f59039i.f59044c;
                                if (aVar24.f59029a != null) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                if (!z7 || aVar24.f59032d.mo53240b() >= dVar.f59039i.f59044c.f59029a.f59032d.mo53240b()) {
                                    C23278d.C23279a aVar25 = dVar.f59039i;
                                    C23275a aVar26 = aVar25.f59044c;
                                } else {
                                    C23278d.C23279a aVar27 = dVar.f59039i;
                                    aVar27.f59044c = aVar27.f59044c.f59029a;
                                }
                            }
                            C23278d.C23279a aVar252 = dVar.f59039i;
                            C23275a aVar262 = aVar252.f59044c;
                            if (aVar262 != aVar252.f59043b) {
                                aVar252.f59045d = aVar262.f59032d.mo53239a() - dVar.f59039i.f59042a.f59032d.mo53239a();
                                C23278d.C23279a aVar28 = dVar.f59039i;
                                if (aVar28.f59042a.f59032d.mo53240b() > dVar.f59039i.f59044c.f59032d.mo53240b()) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                aVar28.f59046e = z8;
                                C23276b.m57339c(dVar, dVar.f59039i.f59043b);
                            }
                        }
                    }
                }
            }
            ArrayList<C23277c> arrayList6 = bVar.f52906a;
            if (arrayList6 != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                Iterator<C23277c> it3 = arrayList6.iterator();
                while (it3.hasNext()) {
                    C23277c next3 = it3.next();
                    try {
                        C23278d.C23280b bVar3 = dVar.f59040j;
                        bVar3.f59047a = next3;
                        if (next3.f59034a.mo53239a() > next3.f59035b.mo53239a()) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        bVar3.f59048b = z3;
                        C21219a aVar29 = aVar14.f59033e;
                        C21085b bVar4 = next3.f59034a;
                        C21085b bVar5 = next3.f59035b;
                        int d6 = aVar29.mo53570d(bVar4, bVar5);
                        if (d6 != -1) {
                            aVar29.f53163b[d6] = true;
                            C21219a aVar30 = aVar29.f53162a[d6];
                            if (aVar30 != null) {
                                aVar30.mo53573g(bVar4, bVar5);
                            }
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (!z4) {
                            C23276b.m57340d(dVar, next3, aVar14);
                            C21085b bVar6 = next3.f59034a;
                            C21085b bVar7 = next3.f59035b;
                            C23276b.m57337a(dVar, bVar6, bVar7, aVar14.f59033e, bVar7);
                        }
                    } catch (PointOnEdgeException unused) {
                    }
                }
            }
            synchronized (dVar) {
            }
            i5++;
        }
        if (dVar.f52903c == TriangulationMode.POLYGON) {
            C23275a aVar31 = ((C23275a) dVar.f59036f.f46168b).f59029a;
            C21219a aVar32 = aVar31.f59033e;
            C21085b bVar8 = aVar31.f59032d;
            while (!aVar32.mo53571e(bVar8)) {
                aVar32 = aVar32.mo53577k(bVar8);
            }
            dVar.mo58411b(aVar32);
            return;
        }
        C23275a aVar33 = ((C23275a) dVar.f59036f.f46168b).f59029a;
        C23275a aVar34 = aVar33.f59029a;
        C23275a aVar35 = aVar33;
        while (true) {
            aVar2 = (C23275a) dVar.f59036f.f46169c;
            if (aVar34 == aVar2) {
                break;
            }
            TriangulationUtil.Orientation b2 = TriangulationUtil.m61949b(aVar35.f59032d, aVar34.f59032d, aVar34.f59029a.f59032d);
            TriangulationUtil.Orientation orientation = TriangulationUtil.Orientation.CCW;
            if (b2 == orientation) {
                C23276b.m57338b(dVar, aVar34);
                aVar34 = aVar34.f59029a;
            } else if (aVar35 == aVar33 || TriangulationUtil.m61949b(aVar35.f59030b.f59032d, aVar35.f59032d, aVar34.f59032d) != orientation) {
                aVar35 = aVar34;
                aVar34 = aVar34.f59029a;
            } else {
                C23276b.m57338b(dVar, aVar35);
                aVar35 = aVar35.f59030b;
            }
        }
        C23275a aVar36 = aVar2.f59030b;
        if (aVar36.f59033e.mo53568b(aVar36.f59029a.f59032d) && aVar36.f59033e.mo53568b(aVar36.f59030b.f59032d)) {
            C21219a j = aVar36.f59033e.mo53576j(aVar36.f59032d);
            C21219a aVar37 = aVar36.f59033e;
            C21085b bVar9 = aVar36.f59032d;
            j.getClass();
            C23276b.m57352p(aVar37, bVar9, j, j.mo53580n(aVar37.mo53580n(bVar9)));
            dVar.mo58410a(aVar36.f59033e);
            dVar.mo58410a(j);
        }
        C23275a aVar38 = ((C23275a) dVar.f59036f.f46168b).f59029a;
        if (aVar38.f59033e.mo53568b(aVar38.f59030b.f59032d) && aVar38.f59033e.mo53568b(aVar38.f59029a.f59032d)) {
            C21219a j2 = aVar38.f59033e.mo53576j(aVar38.f59032d);
            C21219a aVar39 = aVar38.f59033e;
            C21085b bVar10 = aVar38.f59032d;
            j2.getClass();
            C23276b.m57352p(aVar39, bVar10, j2, j2.mo53580n(aVar39.mo53580n(bVar10)));
            dVar.mo58410a(aVar38.f59033e);
            dVar.mo58410a(j2);
        }
        C18045d dVar4 = dVar.f59036f;
        C21085b bVar11 = ((C23275a) dVar4.f46168b).f59032d;
        C23275a aVar40 = ((C23275a) dVar4.f46169c).f59030b;
        C21219a aVar41 = aVar40.f59033e;
        C21085b bVar12 = aVar40.f59032d;
        aVar40.f59033e = null;
        while (true) {
            dVar.f52901a.remove(aVar41);
            bVar12 = aVar41.mo53579m(bVar12);
            if (bVar12 == bVar11) {
                break;
            }
            C21219a k = aVar41.mo53577k(bVar12);
            aVar41.mo53567a();
            aVar41 = k;
        }
        C23275a aVar42 = (C23275a) dVar.f59036f.f46168b;
        C21085b bVar13 = aVar42.f59029a.f59032d;
        C21085b n = aVar41.mo53580n(aVar42.f59032d);
        C21219a l = aVar41.mo53578l(((C23275a) dVar.f59036f.f46168b).f59032d);
        aVar41.mo53567a();
        while (n != bVar13) {
            dVar.f52901a.remove(l);
            n = l.mo53579m(n);
            C21219a k2 = l.mo53577k(n);
            l.mo53567a();
            l = k2;
        }
        C18045d dVar5 = dVar.f59036f;
        C23275a aVar43 = ((C23275a) dVar5.f46168b).f59029a;
        dVar5.f46168b = aVar43;
        aVar43.f59030b = null;
        C23275a aVar44 = ((C23275a) dVar5.f46169c).f59030b;
        dVar5.f46169c = aVar44;
        aVar44.f59029a = null;
        C21004a aVar45 = dVar.f52904d;
        aVar45.f52755c.addAll(dVar.f52901a);
        dVar.f52901a.clear();
    }
}
