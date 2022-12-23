package dj0;

import bj0.C21085b;
import cj0.C21219a;
import dj0.C23278d;
import org.poly2tri.triangulation.TriangulationUtil;
import org.poly2tri.triangulation.delaunay.sweep.PointOnEdgeException;

/* renamed from: dj0.b */
public final class C23276b {
    /* renamed from: a */
    public static void m57337a(C23278d dVar, C21085b bVar, C21085b bVar2, C21219a aVar, C21085b bVar3) {
        C21219a aVar2;
        int i = dVar.f52905e;
        if (i <= 60) {
            boolean z = true;
            dVar.f52905e = i + 1;
            int d = aVar.mo53570d(bVar, bVar2);
            if (d != -1) {
                aVar.f53163b[d] = true;
                C21219a aVar3 = aVar.f53162a[d];
                if (aVar3 != null) {
                    aVar3.mo53573g(bVar, bVar2);
                }
            } else {
                z = false;
            }
            if (!z) {
                C21085b m = aVar.mo53579m(bVar3);
                TriangulationUtil.Orientation b = TriangulationUtil.m61949b(bVar2, m, bVar);
                TriangulationUtil.Orientation orientation = TriangulationUtil.Orientation.Collinear;
                if (b != orientation) {
                    C21085b n = aVar.mo53580n(bVar3);
                    TriangulationUtil.Orientation b2 = TriangulationUtil.m61949b(bVar2, n, bVar);
                    if (b2 != orientation) {
                        if (b == b2) {
                            if (b == TriangulationUtil.Orientation.CW) {
                                aVar2 = aVar.mo53577k(bVar3);
                            } else {
                                aVar2 = aVar.mo53578l(bVar3);
                            }
                            m57337a(dVar, bVar, bVar2, aVar2, bVar3);
                        } else {
                            m57347k(dVar, bVar, bVar2, aVar, bVar3);
                        }
                        dVar.f52905e--;
                    } else if (aVar.mo53569c(bVar2, n)) {
                        aVar.mo53573g(bVar2, n);
                        dVar.f59040j.f59047a.f59035b = n;
                        m57337a(dVar, bVar, n, aVar.mo53576j(bVar3), n);
                        dVar.f52905e--;
                    } else {
                        throw new PointOnEdgeException("EdgeEvent - Point on constrained edge not supported yet");
                    }
                } else if (aVar.mo53569c(bVar2, m)) {
                    aVar.mo53573g(bVar2, m);
                    dVar.f59040j.f59047a.f59035b = m;
                    m57337a(dVar, bVar, m, aVar.mo53576j(bVar3), m);
                    dVar.f52905e--;
                } else {
                    throw new PointOnEdgeException("EdgeEvent - Point on constrained edge not supported yet");
                }
            }
        } else {
            throw new RuntimeException("Recursion is too deep!");
        }
    }

    /* renamed from: b */
    public static void m57338b(C23278d dVar, C23275a aVar) {
        C21219a aVar2 = new C21219a(aVar.f59030b.f59032d, aVar.f59032d, aVar.f59029a.f59032d);
        aVar2.mo53575i(aVar.f59030b.f59033e);
        aVar2.mo53575i(aVar.f59033e);
        dVar.f52901a.add(aVar2);
        C23275a aVar3 = aVar.f59030b;
        aVar3.f59029a = aVar.f59029a;
        aVar.f59029a.f59030b = aVar3;
        dVar.f59036f.getClass();
        if (!m57350n(dVar, aVar2)) {
            dVar.mo58410a(aVar2);
        }
    }

    /* renamed from: c */
    public static void m57339c(C23278d dVar, C23275a aVar) {
        double d;
        double d2;
        boolean z;
        C23275a aVar2;
        C23278d.C23279a aVar3 = dVar.f59039i;
        if (aVar3.f59046e) {
            d2 = aVar3.f59042a.f59032d.mo53240b();
            d = aVar.f59032d.mo53240b();
        } else {
            d2 = aVar3.f59044c.f59032d.mo53240b();
            d = aVar.f59032d.mo53240b();
        }
        if (dVar.f59039i.f59045d > d2 - d) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m57338b(dVar, aVar);
            C23275a aVar4 = aVar.f59030b;
            C23278d.C23279a aVar5 = dVar.f59039i;
            C23275a aVar6 = aVar5.f59042a;
            if (aVar4 != aVar6 || aVar.f59029a != aVar5.f59044c) {
                if (aVar4 == aVar6) {
                    C21085b bVar = aVar.f59032d;
                    C23275a aVar7 = aVar.f59029a;
                    if (TriangulationUtil.m61949b(bVar, aVar7.f59032d, aVar7.f59029a.f59032d) != TriangulationUtil.Orientation.CW) {
                        aVar2 = aVar.f59029a;
                    } else {
                        return;
                    }
                } else if (aVar.f59029a == aVar5.f59044c) {
                    if (TriangulationUtil.m61949b(aVar.f59032d, aVar4.f59032d, aVar4.f59030b.f59032d) != TriangulationUtil.Orientation.CCW) {
                        aVar2 = aVar.f59030b;
                    } else {
                        return;
                    }
                } else if (aVar4.f59032d.mo53240b() < aVar.f59029a.f59032d.mo53240b()) {
                    aVar2 = aVar.f59030b;
                } else {
                    aVar2 = aVar.f59029a;
                }
                m57339c(dVar, aVar2);
            }
        }
    }

    /* renamed from: d */
    public static void m57340d(C23278d dVar, C23277c cVar, C23275a aVar) {
        if (dVar.f59040j.f59048b) {
            while (aVar.f59029a.f59032d.mo53239a() < cVar.f59034a.mo53239a()) {
                if (TriangulationUtil.m61949b(cVar.f59035b, aVar.f59029a.f59032d, cVar.f59034a) == TriangulationUtil.Orientation.CCW) {
                    m57344h(dVar, cVar, aVar);
                } else {
                    aVar = aVar.f59029a;
                }
            }
            return;
        }
        while (aVar.f59030b.f59032d.mo53239a() > cVar.f59034a.mo53239a()) {
            if (TriangulationUtil.m61949b(cVar.f59035b, aVar.f59030b.f59032d, cVar.f59034a) == TriangulationUtil.Orientation.CW) {
                m57341e(dVar, cVar, aVar);
            } else {
                aVar = aVar.f59030b;
            }
        }
    }

    /* renamed from: e */
    public static void m57341e(C23278d dVar, C23277c cVar, C23275a aVar) {
        if (aVar.f59032d.mo53239a() > cVar.f59034a.mo53239a()) {
            C21085b bVar = aVar.f59032d;
            C23275a aVar2 = aVar.f59030b;
            if (TriangulationUtil.m61949b(bVar, aVar2.f59032d, aVar2.f59030b.f59032d) == TriangulationUtil.Orientation.CW) {
                m57342f(dVar, cVar, aVar);
                return;
            }
            m57343g(dVar, cVar, aVar);
            int i = dVar.f52905e;
            if (i <= 60) {
                dVar.f52905e = i + 1;
                m57341e(dVar, cVar, aVar);
                dVar.f52905e--;
                return;
            }
            throw new RuntimeException("Recursion is too deep!");
        }
    }

    /* renamed from: f */
    public static void m57342f(C23278d dVar, C23277c cVar, C23275a aVar) {
        TriangulationUtil.Orientation orientation;
        m57338b(dVar, aVar.f59030b);
        C21085b bVar = aVar.f59030b.f59032d;
        C21085b bVar2 = cVar.f59034a;
        if (bVar != bVar2 && TriangulationUtil.m61949b(cVar.f59035b, bVar, bVar2) == (orientation = TriangulationUtil.Orientation.CW)) {
            C21085b bVar3 = aVar.f59032d;
            C23275a aVar2 = aVar.f59030b;
            if (TriangulationUtil.m61949b(bVar3, aVar2.f59032d, aVar2.f59030b.f59032d) == orientation) {
                m57342f(dVar, cVar, aVar);
            }
        }
    }

    /* renamed from: g */
    public static void m57343g(C23278d dVar, C23277c cVar, C23275a aVar) {
        C23275a aVar2 = aVar.f59030b;
        C21085b bVar = aVar2.f59032d;
        C23275a aVar3 = aVar2.f59030b;
        TriangulationUtil.Orientation b = TriangulationUtil.m61949b(bVar, aVar3.f59032d, aVar3.f59030b.f59032d);
        TriangulationUtil.Orientation orientation = TriangulationUtil.Orientation.CW;
        if (b == orientation) {
            m57342f(dVar, cVar, aVar.f59030b);
        } else if (TriangulationUtil.m61949b(cVar.f59035b, aVar.f59030b.f59030b.f59032d, cVar.f59034a) == orientation) {
            m57343g(dVar, cVar, aVar.f59030b);
        }
    }

    /* renamed from: h */
    public static void m57344h(C23278d dVar, C23277c cVar, C23275a aVar) {
        if (aVar.f59032d.mo53239a() < cVar.f59034a.mo53239a()) {
            C21085b bVar = aVar.f59032d;
            C23275a aVar2 = aVar.f59029a;
            if (TriangulationUtil.m61949b(bVar, aVar2.f59032d, aVar2.f59029a.f59032d) == TriangulationUtil.Orientation.CCW) {
                m57345i(dVar, cVar, aVar);
                return;
            }
            m57346j(dVar, cVar, aVar);
            int i = dVar.f52905e;
            if (i <= 60) {
                dVar.f52905e = i + 1;
                m57344h(dVar, cVar, aVar);
                dVar.f52905e--;
                return;
            }
            throw new RuntimeException("Recursion is too deep!");
        }
    }

    /* renamed from: i */
    public static void m57345i(C23278d dVar, C23277c cVar, C23275a aVar) {
        TriangulationUtil.Orientation orientation;
        m57338b(dVar, aVar.f59029a);
        C21085b bVar = aVar.f59029a.f59032d;
        C21085b bVar2 = cVar.f59034a;
        if (bVar != bVar2 && TriangulationUtil.m61949b(cVar.f59035b, bVar, bVar2) == (orientation = TriangulationUtil.Orientation.CCW)) {
            C21085b bVar3 = aVar.f59032d;
            C23275a aVar2 = aVar.f59029a;
            if (TriangulationUtil.m61949b(bVar3, aVar2.f59032d, aVar2.f59029a.f59032d) == orientation) {
                m57345i(dVar, cVar, aVar);
            }
        }
    }

    /* renamed from: j */
    public static void m57346j(C23278d dVar, C23277c cVar, C23275a aVar) {
        C23275a aVar2 = aVar.f59029a;
        C21085b bVar = aVar2.f59032d;
        C23275a aVar3 = aVar2.f59029a;
        TriangulationUtil.Orientation b = TriangulationUtil.m61949b(bVar, aVar3.f59032d, aVar3.f59029a.f59032d);
        TriangulationUtil.Orientation orientation = TriangulationUtil.Orientation.CCW;
        if (b == orientation) {
            m57345i(dVar, cVar, aVar.f59029a);
        } else if (TriangulationUtil.m61949b(cVar.f59035b, aVar.f59029a.f59029a.f59032d, cVar.f59034a) == orientation) {
            m57346j(dVar, cVar, aVar.f59029a);
        }
    }

    /* renamed from: k */
    public static void m57347k(C23278d dVar, C21085b bVar, C21085b bVar2, C21219a aVar, C21085b bVar3) {
        int i = dVar.f52905e;
        if (i <= 60) {
            dVar.f52905e = i + 1;
            C21219a j = aVar.mo53576j(bVar3);
            if (j != null) {
                C21085b n = j.mo53580n(aVar.mo53580n(bVar3));
                if (TriangulationUtil.m61948a(bVar3, aVar.mo53579m(bVar3), aVar.mo53580n(bVar3), n)) {
                    m57352p(aVar, bVar3, j, n);
                    dVar.mo58410a(aVar);
                    dVar.mo58410a(j);
                    if (bVar3 == bVar2 && n == bVar) {
                        C23277c cVar = dVar.f59040j.f59047a;
                        if (bVar2 == cVar.f59035b && bVar == cVar.f59034a) {
                            aVar.mo53573g(bVar, bVar2);
                            j.mo53573g(bVar, bVar2);
                            m57350n(dVar, aVar);
                            m57350n(dVar, j);
                            return;
                        }
                        return;
                    }
                    if (TriangulationUtil.m61949b(bVar2, n, bVar) == TriangulationUtil.Orientation.CCW) {
                        j.f53164c[j.mo53570d(bVar3, n)] = true;
                        m57350n(dVar, j);
                        boolean[] zArr = j.f53164c;
                        zArr[0] = false;
                        zArr[1] = false;
                        zArr[2] = false;
                    } else {
                        aVar.f53164c[aVar.mo53570d(bVar3, n)] = true;
                        m57350n(dVar, aVar);
                        boolean[] zArr2 = aVar.f53164c;
                        zArr2[0] = false;
                        zArr2[1] = false;
                        zArr2[2] = false;
                        aVar = j;
                    }
                    m57347k(dVar, bVar, bVar2, aVar, bVar3);
                    return;
                }
                m57348l(dVar, bVar, bVar2, aVar, j, m57351o(bVar, bVar2, j, n));
                m57337a(dVar, bVar, bVar2, aVar, bVar3);
                return;
            }
            throw new RuntimeException("[BUG:FIXME] FLIP failed due to missing triangle");
        }
        throw new RuntimeException("Recursion is too deep!");
    }

    /* renamed from: l */
    public static void m57348l(C23278d dVar, C21085b bVar, C21085b bVar2, C21219a aVar, C21219a aVar2, C21085b bVar3) {
        int i = dVar.f52905e;
        if (i <= 60) {
            dVar.f52905e = i + 1;
            C21219a j = aVar2.mo53576j(bVar3);
            if (j != null) {
                C21085b n = j.mo53580n(aVar2.mo53580n(bVar3));
                if (TriangulationUtil.m61948a(bVar2, aVar.mo53579m(bVar2), aVar.mo53580n(bVar2), n)) {
                    m57347k(dVar, bVar2, n, j, n);
                    return;
                }
                m57348l(dVar, bVar, bVar2, aVar, j, m57351o(bVar, bVar2, j, n));
                return;
            }
            throw new RuntimeException("[BUG:FIXME] FLIP failed due to missing triangle");
        }
        throw new RuntimeException("Recursion is too deep!");
    }

    /* renamed from: m */
    public static double m57349m(C23275a aVar) {
        double a = aVar.f59032d.mo53239a();
        double b = aVar.f59032d.mo53240b();
        double a2 = aVar.f59029a.f59032d.mo53239a() - a;
        double b2 = aVar.f59029a.f59032d.mo53240b() - b;
        double a3 = aVar.f59030b.f59032d.mo53239a() - a;
        double b3 = aVar.f59030b.f59032d.mo53240b() - b;
        return Math.atan2((a2 * b3) - (b2 * a3), (b2 * b3) + (a2 * a3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ba A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ef A[SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m57350n(dj0.C23278d r33, cj0.C21219a r34) {
        /*
            r0 = r33
            r1 = r34
            r2 = 0
            r3 = 0
        L_0x0006:
            r4 = 3
            if (r3 >= r4) goto L_0x00f3
            boolean[] r4 = r1.f53164c
            boolean r4 = r4[r3]
            if (r4 == 0) goto L_0x0011
            goto L_0x00ef
        L_0x0011:
            cj0.a[] r4 = r1.f53162a
            r4 = r4[r3]
            if (r4 == 0) goto L_0x00ef
            bj0.b[] r5 = r1.f53166e
            r5 = r5[r3]
            bj0.b r6 = r1.mo53580n(r5)
            bj0.b r6 = r4.mo53580n(r6)
            bj0.b[] r7 = r4.f53166e
            r8 = r7[r2]
            r9 = 1
            if (r6 != r8) goto L_0x002c
            r8 = 0
            goto L_0x0037
        L_0x002c:
            r8 = r7[r9]
            if (r6 != r8) goto L_0x0032
            r8 = 1
            goto L_0x0037
        L_0x0032:
            r8 = 2
            r7 = r7[r8]
            if (r6 != r7) goto L_0x00e7
        L_0x0037:
            boolean[] r7 = r4.f53163b
            boolean r7 = r7[r8]
            if (r7 != 0) goto L_0x00e2
            boolean[] r10 = r4.f53164c
            boolean r10 = r10[r8]
            if (r10 == 0) goto L_0x0045
            goto L_0x00e2
        L_0x0045:
            bj0.b r7 = r1.mo53579m(r5)
            bj0.b r10 = r1.mo53580n(r5)
            double r11 = r6.mo53239a()
            double r13 = r6.mo53240b()
            double r15 = r5.mo53239a()
            double r15 = r15 - r11
            double r17 = r5.mo53240b()
            double r17 = r17 - r13
            double r19 = r7.mo53239a()
            double r19 = r19 - r11
            double r21 = r7.mo53240b()
            double r21 = r21 - r13
            double r23 = r15 * r21
            double r25 = r19 * r17
            double r23 = r23 - r25
            r25 = 0
            int r7 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r7 > 0) goto L_0x0079
            goto L_0x00b7
        L_0x0079:
            double r27 = r10.mo53239a()
            double r27 = r27 - r11
            double r10 = r10.mo53240b()
            double r10 = r10 - r13
            double r12 = r27 * r17
            double r29 = r15 * r10
            double r12 = r12 - r29
            int r7 = (r12 > r25 ? 1 : (r12 == r25 ? 0 : -1))
            if (r7 > 0) goto L_0x008f
            goto L_0x00b7
        L_0x008f:
            double r29 = r19 * r10
            double r31 = r27 * r21
            double r15 = r15 * r15
            double r17 = r17 * r17
            double r17 = r17 + r15
            double r19 = r19 * r19
            double r21 = r21 * r21
            double r21 = r21 + r19
            double r27 = r27 * r27
            double r10 = r10 * r10
            double r10 = r10 + r27
            double r29 = r29 - r31
            double r29 = r29 * r17
            double r21 = r21 * r12
            double r21 = r21 + r29
            double r10 = r10 * r23
            double r10 = r10 + r21
            int r7 = (r10 > r25 ? 1 : (r10 == r25 ? 0 : -1))
            if (r7 <= 0) goto L_0x00b7
            r7 = 1
            goto L_0x00b8
        L_0x00b7:
            r7 = 0
        L_0x00b8:
            if (r7 == 0) goto L_0x00ef
            boolean[] r7 = r1.f53164c
            r7[r3] = r9
            boolean[] r7 = r4.f53164c
            r7[r8] = r9
            m57352p(r1, r5, r4, r6)
            boolean r5 = m57350n(r33, r34)
            r5 = r5 ^ r9
            if (r5 == 0) goto L_0x00cf
            r33.mo58410a(r34)
        L_0x00cf:
            boolean r5 = m57350n(r0, r4)
            r5 = r5 ^ r9
            if (r5 == 0) goto L_0x00d9
            r0.mo58410a(r4)
        L_0x00d9:
            boolean[] r0 = r1.f53164c
            r0[r3] = r2
            boolean[] r0 = r4.f53164c
            r0[r8] = r2
            return r9
        L_0x00e2:
            boolean[] r4 = r1.f53163b
            r4[r3] = r7
            goto L_0x00ef
        L_0x00e7:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Calling index with a point that doesn't exist in triangle"
            r0.<init>(r1)
            throw r0
        L_0x00ef:
            int r3 = r3 + 1
            goto L_0x0006
        L_0x00f3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: dj0.C23276b.m57350n(dj0.d, cj0.a):boolean");
    }

    /* renamed from: o */
    public static C21085b m57351o(C21085b bVar, C21085b bVar2, C21219a aVar, C21085b bVar3) {
        TriangulationUtil.Orientation b = TriangulationUtil.m61949b(bVar2, bVar3, bVar);
        if (b == TriangulationUtil.Orientation.CW) {
            return aVar.mo53579m(bVar3);
        }
        if (b == TriangulationUtil.Orientation.CCW) {
            return aVar.mo53580n(bVar3);
        }
        throw new PointOnEdgeException("Point on constrained edge not supported yet");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f8  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01c1  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m57352p(cj0.C21219a r24, bj0.C21085b r25, cj0.C21219a r26, bj0.C21085b r27) {
        /*
            r0 = r24
            r1 = r25
            r2 = r26
            r3 = r27
            cj0.a r4 = r24.mo53577k(r25)
            cj0.a r5 = r24.mo53578l(r25)
            cj0.a r6 = r26.mo53577k(r27)
            cj0.a r7 = r26.mo53578l(r27)
            bj0.b[] r8 = r0.f53166e
            r9 = 0
            r10 = r8[r9]
            r11 = 2
            r12 = 1
            if (r1 != r10) goto L_0x0026
            boolean[] r8 = r0.f53163b
            boolean r8 = r8[r11]
            goto L_0x0033
        L_0x0026:
            r8 = r8[r12]
            if (r1 != r8) goto L_0x002f
            boolean[] r8 = r0.f53163b
            boolean r8 = r8[r9]
            goto L_0x0033
        L_0x002f:
            boolean[] r8 = r0.f53163b
            boolean r8 = r8[r12]
        L_0x0033:
            boolean r10 = r24.mo53571e(r25)
            bj0.b[] r13 = r2.f53166e
            r14 = r13[r9]
            if (r3 != r14) goto L_0x0042
            boolean[] r13 = r2.f53163b
            boolean r13 = r13[r11]
            goto L_0x004f
        L_0x0042:
            r13 = r13[r12]
            if (r3 != r13) goto L_0x004b
            boolean[] r13 = r2.f53163b
            boolean r13 = r13[r9]
            goto L_0x004f
        L_0x004b:
            boolean[] r13 = r2.f53163b
            boolean r13 = r13[r12]
        L_0x004f:
            boolean r14 = r26.mo53571e(r27)
            bj0.b[] r15 = r0.f53166e
            r12 = r15[r9]
            if (r1 != r12) goto L_0x0060
            boolean[] r9 = r0.f53164c
            boolean r9 = r9[r11]
            r11 = r9
            r9 = 1
            goto L_0x0070
        L_0x0060:
            r9 = 1
            r11 = r15[r9]
            if (r1 != r11) goto L_0x006c
            boolean[] r11 = r0.f53164c
            r16 = 0
            boolean r11 = r11[r16]
            goto L_0x0070
        L_0x006c:
            boolean[] r11 = r0.f53164c
            boolean r11 = r11[r9]
        L_0x0070:
            if (r1 != r12) goto L_0x0079
            boolean[] r12 = r0.f53164c
            boolean r12 = r12[r9]
            r9 = r12
        L_0x0077:
            r12 = 0
            goto L_0x0088
        L_0x0079:
            r12 = r15[r9]
            if (r1 != r12) goto L_0x0083
            boolean[] r9 = r0.f53164c
            r12 = 2
            boolean r9 = r9[r12]
            goto L_0x0077
        L_0x0083:
            boolean[] r9 = r0.f53164c
            r12 = 0
            boolean r9 = r9[r12]
        L_0x0088:
            bj0.b[] r15 = r2.f53166e
            r19 = r7
            r7 = r15[r12]
            if (r3 != r7) goto L_0x009b
            boolean[] r12 = r2.f53164c
            r18 = 2
            boolean r12 = r12[r18]
            r20 = r6
            r6 = r12
            r12 = 1
            goto L_0x00ad
        L_0x009b:
            r20 = r6
            r12 = 1
            r6 = r15[r12]
            if (r3 != r6) goto L_0x00a9
            boolean[] r6 = r2.f53164c
            r16 = 0
            boolean r6 = r6[r16]
            goto L_0x00ad
        L_0x00a9:
            boolean[] r6 = r2.f53164c
            boolean r6 = r6[r12]
        L_0x00ad:
            if (r3 != r7) goto L_0x00b5
            boolean[] r7 = r2.f53164c
            boolean r7 = r7[r12]
        L_0x00b3:
            r12 = 0
            goto L_0x00c4
        L_0x00b5:
            r7 = r15[r12]
            if (r3 != r7) goto L_0x00bf
            boolean[] r7 = r2.f53164c
            r12 = 2
            boolean r7 = r7[r12]
            goto L_0x00b3
        L_0x00bf:
            boolean[] r7 = r2.f53164c
            r12 = 0
            boolean r7 = r7[r12]
        L_0x00c4:
            r0.mo53572f(r1, r3)
            r2.mo53572f(r3, r1)
            bj0.b[] r15 = r2.f53166e
            r21 = r5
            r5 = r15[r12]
            if (r1 != r5) goto L_0x00de
            boolean[] r12 = r2.f53164c
            r18 = 2
            r12[r18] = r11
            r22 = r4
            r12 = 1
            r17 = 0
            goto L_0x00f2
        L_0x00de:
            r22 = r4
            r12 = 1
            r4 = r15[r12]
            if (r1 != r4) goto L_0x00ec
            boolean[] r4 = r2.f53164c
            r17 = 0
            r4[r17] = r11
            goto L_0x00f2
        L_0x00ec:
            r17 = 0
            boolean[] r4 = r2.f53164c
            r4[r12] = r11
        L_0x00f2:
            bj0.b[] r4 = r0.f53166e
            r11 = r4[r17]
            if (r1 != r11) goto L_0x0100
            r23 = r14
            boolean[] r14 = r0.f53164c
            r14[r12] = r9
            r14 = 2
            goto L_0x0111
        L_0x0100:
            r23 = r14
            r14 = r4[r12]
            if (r1 != r14) goto L_0x010c
            boolean[] r12 = r0.f53164c
            r14 = 2
            r12[r14] = r9
            goto L_0x0111
        L_0x010c:
            r14 = 2
            boolean[] r12 = r0.f53164c
            r12[r17] = r9
        L_0x0111:
            if (r3 != r11) goto L_0x0119
            boolean[] r9 = r0.f53164c
            r9[r14] = r6
            r9 = 1
            goto L_0x0128
        L_0x0119:
            r9 = 1
            r12 = r4[r9]
            if (r3 != r12) goto L_0x0124
            boolean[] r12 = r0.f53164c
            r14 = 0
            r12[r14] = r6
            goto L_0x0128
        L_0x0124:
            boolean[] r12 = r0.f53164c
            r12[r9] = r6
        L_0x0128:
            if (r3 != r5) goto L_0x0130
            boolean[] r6 = r2.f53164c
            r6[r9] = r7
            r9 = 2
            goto L_0x0140
        L_0x0130:
            r6 = r15[r9]
            if (r3 != r6) goto L_0x013a
            boolean[] r6 = r2.f53164c
            r9 = 2
            r6[r9] = r7
            goto L_0x0140
        L_0x013a:
            r9 = 2
            boolean[] r6 = r2.f53164c
            r12 = 0
            r6[r12] = r7
        L_0x0140:
            if (r1 != r5) goto L_0x0148
            boolean[] r6 = r2.f53163b
            r6[r9] = r8
            r6 = 1
            goto L_0x0157
        L_0x0148:
            r6 = 1
            r7 = r15[r6]
            if (r1 != r7) goto L_0x0153
            boolean[] r7 = r2.f53163b
            r9 = 0
            r7[r9] = r8
            goto L_0x0157
        L_0x0153:
            boolean[] r7 = r2.f53163b
            r7[r6] = r8
        L_0x0157:
            if (r1 != r11) goto L_0x015f
            boolean[] r1 = r0.f53163b
            r1[r6] = r10
            r6 = 2
            goto L_0x016f
        L_0x015f:
            r7 = r4[r6]
            if (r1 != r7) goto L_0x0169
            boolean[] r1 = r0.f53163b
            r6 = 2
            r1[r6] = r10
            goto L_0x016f
        L_0x0169:
            r6 = 2
            boolean[] r1 = r0.f53163b
            r7 = 0
            r1[r7] = r10
        L_0x016f:
            if (r3 != r11) goto L_0x0177
            boolean[] r1 = r0.f53163b
            r1[r6] = r13
            r1 = 1
            goto L_0x0186
        L_0x0177:
            r1 = 1
            r4 = r4[r1]
            if (r3 != r4) goto L_0x0182
            boolean[] r4 = r0.f53163b
            r6 = 0
            r4[r6] = r13
            goto L_0x0186
        L_0x0182:
            boolean[] r4 = r0.f53163b
            r4[r1] = r13
        L_0x0186:
            if (r3 != r5) goto L_0x018f
            boolean[] r3 = r2.f53163b
            r3[r1] = r23
            r3 = 2
        L_0x018d:
            r4 = 0
            goto L_0x019f
        L_0x018f:
            r4 = r15[r1]
            if (r3 != r4) goto L_0x0199
            boolean[] r1 = r2.f53163b
            r3 = 2
            r1[r3] = r23
            goto L_0x018d
        L_0x0199:
            r3 = 2
            boolean[] r1 = r2.f53163b
            r4 = 0
            r1[r4] = r23
        L_0x019f:
            cj0.a[] r1 = r0.f53162a
            r5 = 0
            r1[r3] = r5
            r6 = 1
            r1[r6] = r5
            r1[r4] = r5
            cj0.a[] r1 = r2.f53162a
            r1[r3] = r5
            r1[r6] = r5
            r1[r4] = r5
            if (r22 == 0) goto L_0x01b8
            r1 = r22
            r2.mo53575i(r1)
        L_0x01b8:
            if (r21 == 0) goto L_0x01bf
            r1 = r21
            r0.mo53575i(r1)
        L_0x01bf:
            if (r20 == 0) goto L_0x01c6
            r1 = r20
            r0.mo53575i(r1)
        L_0x01c6:
            if (r19 == 0) goto L_0x01cd
            r1 = r19
            r2.mo53575i(r1)
        L_0x01cd:
            r0.mo53575i(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dj0.C23276b.m57352p(cj0.a, bj0.b, cj0.a, bj0.b):void");
    }
}
