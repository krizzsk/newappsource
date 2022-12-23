package p239rb;

import java.util.regex.Pattern;
import p277ub.C6803r;

/* renamed from: rb.a */
public final class C6285a {

    /* renamed from: c */
    public static final Pattern f19875c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: a */
    public final C6803r f19876a = new C6803r();

    /* renamed from: b */
    public final StringBuilder f19877b = new StringBuilder();

    /* renamed from: a */
    public static String m14883a(C6803r rVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = rVar.f21039b;
        int i2 = rVar.f21040c;
        while (i < i2 && !z) {
            char c = (char) rVar.f21038a[i];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c);
            }
        }
        rVar.mo22981A(i - rVar.f21039b);
        return sb.toString();
    }

    /* renamed from: b */
    public static String m14884b(C6803r rVar, StringBuilder sb) {
        m14885c(rVar);
        if (rVar.f21040c - rVar.f21039b == 0) {
            return null;
        }
        String a = m14883a(rVar, sb);
        if (!"".equals(a)) {
            return a;
        }
        StringBuilder sb2 = new StringBuilder(1);
        sb2.append((char) rVar.mo22997p());
        return sb2.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067 A[LOOP:1: B:2:0x0002->B:35:0x0067, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0001 A[EDGE_INSN: B:40:0x0001->B:36:0x0001 ?: BREAK  , SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m14885c(p277ub.C6803r r8) {
        /*
            r0 = 1
        L_0x0001:
            r1 = 1
        L_0x0002:
            int r2 = r8.f21040c
            int r3 = r8.f21039b
            int r2 = r2 - r3
            if (r2 <= 0) goto L_0x0069
            if (r1 == 0) goto L_0x0069
            byte[] r1 = r8.f21038a
            byte r1 = r1[r3]
            char r1 = (char) r1
            r2 = 9
            r3 = 0
            if (r1 == r2) goto L_0x0027
            r2 = 10
            if (r1 == r2) goto L_0x0027
            r2 = 12
            if (r1 == r2) goto L_0x0027
            r2 = 13
            if (r1 == r2) goto L_0x0027
            r2 = 32
            if (r1 == r2) goto L_0x0027
            r1 = 0
            goto L_0x002b
        L_0x0027:
            r8.mo22981A(r0)
            r1 = 1
        L_0x002b:
            if (r1 != 0) goto L_0x0001
            int r1 = r8.f21039b
            int r2 = r8.f21040c
            byte[] r4 = r8.f21038a
            int r5 = r1 + 2
            if (r5 > r2) goto L_0x0063
            int r5 = r1 + 1
            byte r1 = r4[r1]
            r6 = 47
            if (r1 != r6) goto L_0x0063
            int r1 = r5 + 1
            byte r5 = r4[r5]
            r7 = 42
            if (r5 != r7) goto L_0x0063
        L_0x0047:
            int r5 = r1 + 1
            if (r5 >= r2) goto L_0x005b
            byte r1 = r4[r1]
            char r1 = (char) r1
            if (r1 != r7) goto L_0x0059
            byte r1 = r4[r5]
            char r1 = (char) r1
            if (r1 != r6) goto L_0x0059
            int r2 = r5 + 1
            r1 = r2
            goto L_0x0047
        L_0x0059:
            r1 = r5
            goto L_0x0047
        L_0x005b:
            int r1 = r8.f21039b
            int r2 = r2 - r1
            r8.mo22981A(r2)
            r1 = 1
            goto L_0x0064
        L_0x0063:
            r1 = 0
        L_0x0064:
            if (r1 == 0) goto L_0x0067
            goto L_0x0001
        L_0x0067:
            r1 = 0
            goto L_0x0002
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p239rb.C6285a.m14885c(ub.r):void");
    }
}
