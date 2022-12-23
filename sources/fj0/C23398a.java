package fj0;

/* renamed from: fj0.a */
public final class C23398a {

    /* renamed from: fj0.a$a */
    public static class C23399a {

        /* renamed from: a */
        public boolean f59172a;

        /* renamed from: b */
        public boolean f59173b;

        /* renamed from: c */
        public boolean f59174c;

        /* renamed from: d */
        public C23400b f59175d;

        /* renamed from: e */
        public double f59176e;

        /* renamed from: f */
        public C23399a f59177f;

        /* renamed from: g */
        public C23399a f59178g;
    }

    /* renamed from: a */
    public static boolean m57519a(C23400b bVar, C23400b bVar2, C23400b bVar3) {
        double d = bVar3.f59180b;
        double d2 = bVar.f59180b;
        double d3 = bVar2.f59179a;
        double d4 = bVar.f59179a;
        return ((d3 - d4) * (d - d2)) - ((bVar2.f59180b - d2) * (bVar3.f59179a - d4)) > 0.0d;
    }

    /* renamed from: b */
    public static void m57520b(C23399a aVar, C23399a[] aVarArr) {
        double d;
        double d2;
        double d3;
        boolean z;
        C23399a aVar2 = aVar;
        C23399a[] aVarArr2 = aVarArr;
        C23399a aVar3 = aVar2.f59177f;
        C23399a aVar4 = aVar2.f59178g;
        aVar2.f59173b = m57519a(aVar3.f59175d, aVar2.f59175d, aVar4.f59175d);
        C23400b bVar = aVar3.f59175d;
        double d4 = bVar.f59179a;
        C23400b bVar2 = aVar2.f59175d;
        double d5 = bVar2.f59179a;
        double d6 = d4 - d5;
        double d7 = bVar.f59180b;
        double d8 = bVar2.f59180b;
        double d9 = d7 - d8;
        C23400b bVar3 = aVar4.f59175d;
        double d11 = bVar3.f59179a - d5;
        double d12 = bVar3.f59180b - d8;
        double hypot = Math.hypot(d6, d9);
        double hypot2 = Math.hypot(d11, d12);
        double d13 = 0.0d;
        if (hypot > 0.0d) {
            d2 = d6 / hypot;
            d = d9 / hypot;
        } else {
            d2 = 0.0d;
            d = 0.0d;
        }
        if (hypot2 > 0.0d) {
            d13 = d11 / hypot2;
            d3 = d12 / hypot2;
        } else {
            d3 = 0.0d;
        }
        aVar2.f59176e = (d * d3) + (d2 * d13);
        if (aVar2.f59173b) {
            aVar2.f59174c = true;
            for (C23399a aVar5 : aVarArr2) {
                C23400b bVar4 = aVar5.f59175d;
                double d14 = bVar4.f59179a;
                C23400b bVar5 = aVar2.f59175d;
                if (d14 != bVar5.f59179a || bVar4.f59180b != bVar5.f59180b) {
                    C23400b bVar6 = aVar3.f59175d;
                    if (d14 != bVar6.f59179a || bVar4.f59180b != bVar6.f59180b) {
                        C23400b bVar7 = aVar4.f59175d;
                        if (d14 != bVar7.f59179a || bVar4.f59180b != bVar7.f59180b) {
                            if (!m57519a(bVar6, bVar4, bVar5) && !m57519a(bVar5, bVar4, bVar7) && !m57519a(bVar7, bVar4, bVar6)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                aVar2.f59174c = false;
                                return;
                            }
                        }
                    }
                }
            }
            return;
        }
        aVar2.f59174c = false;
    }
}
