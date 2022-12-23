package p988j$.time.format;

import p988j$.time.C25782a;
import p988j$.time.LocalDateTime;
import p988j$.time.ZoneOffset;
import p988j$.time.temporal.C25830a;
import p988j$.time.temporal.C25841l;

/* renamed from: j$.time.format.i */
final class C25804i implements C25802g {
    C25804i() {
    }

    /* renamed from: a */
    public final boolean mo83675a(C25814s sVar, StringBuilder sb) {
        StringBuilder sb2 = sb;
        Long e = sVar.mo83712e(C25830a.INSTANT_SECONDS);
        C25841l d = sVar.mo83711d();
        C25830a aVar = C25830a.NANO_OF_SECOND;
        Long valueOf = d.mo83603f(aVar) ? Long.valueOf(sVar.mo83711d().mo83604g(aVar)) : null;
        int i = 0;
        if (e == null) {
            return false;
        }
        long longValue = e.longValue();
        int f = aVar.mo83775f(valueOf != null ? valueOf.longValue() : 0);
        if (longValue >= -62167219200L) {
            long j = (longValue - 315569520000L) + 62167219200L;
            long h = C25782a.m64413h(j, 315569520000L) + 1;
            LocalDateTime q = LocalDateTime.m64362q(C25782a.m64411f(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (h > 0) {
                sb2.append('+');
                sb2.append(h);
            }
            sb2.append(q);
            if (q.mo83627l() == 0) {
                sb2.append(":00");
            }
        } else {
            long j2 = longValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            LocalDateTime q2 = LocalDateTime.m64362q(j4 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb2.append(q2);
            if (q2.mo83627l() == 0) {
                sb2.append(":00");
            }
            if (j3 < 0) {
                if (q2.mo83628m() == -10000) {
                    sb2.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb2.insert(length, j3);
                } else {
                    sb2.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (f > 0) {
            sb2.append('.');
            int i2 = 100000000;
            while (true) {
                if (f <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = f / i2;
                sb2.append((char) (i3 + 48));
                f -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb2.append('Z');
        return true;
    }

    public final String toString() {
        return "Instant()";
    }
}
