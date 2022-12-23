package p173ma;

import p173ma.C5754v;
import p277ub.C6803r;

/* renamed from: ma.b */
public final class C5729b {
    /* renamed from: a */
    public static void m14088a(long j, C6803r rVar, C5754v[] vVarArr) {
        int i;
        int i2;
        boolean z;
        while (true) {
            boolean z2 = true;
            if (rVar.f21040c - rVar.f21039b > 1) {
                int i3 = 0;
                while (true) {
                    if (rVar.f21040c - rVar.f21039b != 0) {
                        int p = rVar.mo22997p();
                        i3 += p;
                        if (p != 255) {
                            i = i3;
                            break;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                int i4 = 0;
                while (true) {
                    if (rVar.f21040c - rVar.f21039b != 0) {
                        int p2 = rVar.mo22997p();
                        i4 += p2;
                        if (p2 != 255) {
                            break;
                        }
                    } else {
                        i4 = -1;
                        break;
                    }
                }
                int i5 = rVar.f21039b;
                int i6 = i5 + i4;
                if (i4 == -1 || i4 > rVar.f21040c - i5) {
                    i6 = rVar.f21040c;
                } else if (i == 4 && i4 >= 8) {
                    int p3 = rVar.mo22997p();
                    int u = rVar.mo23002u();
                    if (u == 49) {
                        i2 = rVar.mo22984c();
                    } else {
                        i2 = 0;
                    }
                    int p4 = rVar.mo22997p();
                    if (u == 47) {
                        rVar.mo22981A(1);
                    }
                    if (p3 == 181 && ((u == 49 || u == 47) && p4 == 3)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (u == 49) {
                        if (i2 != 1195456820) {
                            z2 = false;
                        }
                        z &= z2;
                    }
                    if (z) {
                        m14089b(j, rVar, vVarArr);
                    }
                }
                rVar.mo23007z(i6);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static void m14089b(long j, C6803r rVar, C5754v[] vVarArr) {
        boolean z;
        int p = rVar.mo22997p();
        if ((p & 64) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            rVar.mo22981A(1);
            int i = (p & 31) * 3;
            int i2 = rVar.f21039b;
            for (C5754v vVar : vVarArr) {
                rVar.mo23007z(i2);
                vVar.mo20631b(i, rVar);
                vVar.mo20633d(j, 1, i, 0, (C5754v.C5755a) null);
            }
        }
    }
}
