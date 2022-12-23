package p125ia;

import com.appboy.support.ValidationUtils;
import com.facebook.ads.AdError;
import p277ub.C6803r;

/* renamed from: ia.c */
public final class C5314c {

    /* renamed from: a */
    public static final int[] f17507a = {AdError.CACHE_ERROR_CODE, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    /* renamed from: ia.c$a */
    public static final class C5315a {

        /* renamed from: a */
        public final int f17508a;

        /* renamed from: b */
        public final int f17509b;

        /* renamed from: c */
        public final int f17510c;

        public C5315a(int i, int i2, int i3) {
            this.f17508a = i;
            this.f17509b = i2;
            this.f17510c = i3;
        }
    }

    /* renamed from: a */
    public static void m13354a(int i, C6803r rVar) {
        rVar.mo23004w(7);
        byte[] bArr = rVar.f21038a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        bArr[5] = (byte) ((i >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        bArr[6] = (byte) (i & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0087, code lost:
        if (r9 != 11) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008c, code lost:
        if (r9 != 11) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0091, code lost:
        if (r9 != 8) goto L_0x0095;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p125ia.C5314c.C5315a m13355b(p277ub.C6802q r9) {
        /*
            r0 = 16
            int r1 = r9.mo22973f(r0)
            int r0 = r9.mo22973f(r0)
            r2 = 4
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r0 != r3) goto L_0x0018
            r0 = 24
            int r0 = r9.mo22973f(r0)
            r3 = 7
            goto L_0x0019
        L_0x0018:
            r3 = 4
        L_0x0019:
            int r0 = r0 + r3
            r3 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r3) goto L_0x0021
            int r0 = r0 + 2
        L_0x0021:
            r1 = 2
            int r3 = r9.mo22973f(r1)
            r4 = 3
            if (r3 != r4) goto L_0x0032
        L_0x0029:
            r9.mo22973f(r1)
            boolean r3 = r9.mo22972e()
            if (r3 != 0) goto L_0x0029
        L_0x0032:
            r3 = 10
            int r3 = r9.mo22973f(r3)
            boolean r5 = r9.mo22972e()
            if (r5 == 0) goto L_0x0047
            int r5 = r9.mo22973f(r4)
            if (r5 <= 0) goto L_0x0047
            r9.mo22979l(r1)
        L_0x0047:
            boolean r5 = r9.mo22972e()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L_0x0057
            r5 = 48000(0xbb80, float:6.7262E-41)
            goto L_0x005a
        L_0x0057:
            r5 = 44100(0xac44, float:6.1797E-41)
        L_0x005a:
            int r9 = r9.mo22973f(r2)
            if (r5 != r6) goto L_0x0069
            r6 = 13
            if (r9 != r6) goto L_0x0069
            int[] r1 = f17507a
            r9 = r1[r9]
            goto L_0x0098
        L_0x0069:
            if (r5 != r7) goto L_0x0097
            int[] r6 = f17507a
            r7 = 14
            if (r9 >= r7) goto L_0x0097
            r6 = r6[r9]
            int r3 = r3 % 5
            r7 = 8
            r8 = 1
            if (r3 == r8) goto L_0x008f
            r8 = 11
            if (r3 == r1) goto L_0x008a
            if (r3 == r4) goto L_0x008f
            if (r3 == r2) goto L_0x0083
            goto L_0x0095
        L_0x0083:
            if (r9 == r4) goto L_0x0093
            if (r9 == r7) goto L_0x0093
            if (r9 != r8) goto L_0x0095
            goto L_0x0093
        L_0x008a:
            if (r9 == r7) goto L_0x0093
            if (r9 != r8) goto L_0x0095
            goto L_0x0093
        L_0x008f:
            if (r9 == r4) goto L_0x0093
            if (r9 != r7) goto L_0x0095
        L_0x0093:
            int r6 = r6 + 1
        L_0x0095:
            r9 = r6
            goto L_0x0098
        L_0x0097:
            r9 = 0
        L_0x0098:
            ia.c$a r1 = new ia.c$a
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p125ia.C5314c.m13355b(ub.q):ia.c$a");
    }
}
