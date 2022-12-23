package com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g */
public final class C3258g {

    /* renamed from: b */
    public static final int f11739b = C3406u.m8589a("ID3");

    /* renamed from: a */
    public final C3259a f11740a;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g$a */
    public interface C3259a {
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g$b */
    public static final class C3260b {

        /* renamed from: a */
        public final int f11741a;

        /* renamed from: b */
        public final boolean f11742b;

        /* renamed from: c */
        public final int f11743c;

        public C3260b(int i, boolean z, int i2) {
            this.f11741a = i;
            this.f11742b = z;
            this.f11743c = i2;
        }
    }

    public C3258g() {
        this((C3259a) null);
    }

    /* renamed from: a */
    public static int m8232a(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: b */
    public static C3252d m8242b(C3393k kVar, int i, int i2, boolean z, int i3, C3259a aVar) throws UnsupportedEncodingException {
        C3393k kVar2 = kVar;
        int i4 = kVar2.f12122b;
        int b = m8241b(kVar2.f12121a, i4);
        String str = new String(kVar2.f12121a, i4, b - i4, "ISO-8859-1");
        kVar.mo14549e(b + 1);
        int l = kVar.mo14557l();
        boolean z2 = (l & 2) != 0;
        boolean z3 = (l & 1) != 0;
        int l2 = kVar.mo14557l();
        String[] strArr = new String[l2];
        for (int i5 = 0; i5 < l2; i5++) {
            int i6 = kVar2.f12122b;
            int b2 = m8241b(kVar2.f12121a, i6);
            strArr[i5] = new String(kVar2.f12121a, i6, b2 - i6, "ISO-8859-1");
            kVar.mo14549e(b2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (kVar2.f12122b < i7) {
            C3261h a = m8238a(i2, kVar, z, i3, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        C3261h[] hVarArr = new C3261h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return new C3252d(str, z2, z3, strArr, hVarArr);
    }

    /* renamed from: b */
    public static String m8245b(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    /* renamed from: c */
    public static C3266k m8247c(C3393k kVar, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        System.arraycopy(kVar.f12121a, kVar.f12122b, bArr, 0, i);
        kVar.f12122b += i;
        return new C3266k(str, (String) null, new String(bArr, 0, m8241b(bArr, 0), "ISO-8859-1"));
    }

    /* renamed from: d */
    public static C3264j m8248d(C3393k kVar, int i) throws UnsupportedEncodingException {
        String str;
        if (i < 1) {
            return null;
        }
        int l = kVar.mo14557l();
        String b = m8245b(l);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        System.arraycopy(kVar.f12121a, kVar.f12122b, bArr, 0, i2);
        kVar.f12122b += i2;
        int a = m8233a(bArr, 0, l);
        String str2 = new String(bArr, 0, a, b);
        int a2 = m8232a(l) + a;
        if (a2 < i2) {
            str = new String(bArr, a2, m8233a(bArr, a2, l) - a2, b);
        } else {
            str = "";
        }
        return new C3264j("TXXX", str2, str);
    }

    /* renamed from: e */
    public static C3266k m8249e(C3393k kVar, int i) throws UnsupportedEncodingException {
        String str;
        if (i < 1) {
            return null;
        }
        int l = kVar.mo14557l();
        String b = m8245b(l);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        System.arraycopy(kVar.f12121a, kVar.f12122b, bArr, 0, i2);
        kVar.f12122b += i2;
        int a = m8233a(bArr, 0, l);
        String str2 = new String(bArr, 0, a, b);
        int a2 = m8232a(l) + a;
        if (a2 < i2) {
            str = new String(bArr, a2, m8241b(bArr, a2) - a2, "ISO-8859-1");
        } else {
            str = "";
        }
        return new C3266k("WXXX", str2, str);
    }

    /* renamed from: f */
    public static int m8250f(C3393k kVar, int i) {
        byte[] bArr = kVar.f12121a;
        int i2 = kVar.f12122b;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= i) {
                return i;
            }
            if ((bArr[i2] & 255) == 255 && bArr[i3] == 0) {
                System.arraycopy(bArr, i2 + 2, bArr, i3, (i - i2) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003b, code lost:
        if (((r7 & 64) != 0) != false) goto L_0x0017;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0084 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0085  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.fyber.inneractive.sdk.player.exoplayer2.metadata.C3243a mo14388a(byte[] r12, int r13) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = new com.fyber.inneractive.sdk.player.exoplayer2.util.k
            r1.<init>(r12, r13)
            int r12 = r1.mo14537a()
            r13 = 2
            r2 = 10
            r3 = 4
            r4 = 0
            r5 = 0
            r6 = 1
            if (r12 >= r2) goto L_0x001a
        L_0x0017:
            r9 = r4
            goto L_0x0082
        L_0x001a:
            int r12 = r1.mo14559n()
            int r7 = f11739b
            if (r12 == r7) goto L_0x0023
            goto L_0x0017
        L_0x0023:
            int r12 = r1.mo14557l()
            r1.mo14551f(r6)
            int r7 = r1.mo14557l()
            int r8 = r1.mo14556k()
            if (r12 != r13) goto L_0x003e
            r9 = r7 & 64
            if (r9 == 0) goto L_0x003a
            r9 = 1
            goto L_0x003b
        L_0x003a:
            r9 = 0
        L_0x003b:
            if (r9 == 0) goto L_0x0074
            goto L_0x0017
        L_0x003e:
            r9 = 3
            if (r12 != r9) goto L_0x0054
            r9 = r7 & 64
            if (r9 == 0) goto L_0x0047
            r9 = 1
            goto L_0x0048
        L_0x0047:
            r9 = 0
        L_0x0048:
            if (r9 == 0) goto L_0x0074
            int r9 = r1.mo14544c()
            r1.mo14551f(r9)
            int r9 = r9 + r3
            int r8 = r8 - r9
            goto L_0x0074
        L_0x0054:
            if (r12 != r3) goto L_0x0017
            r9 = r7 & 64
            if (r9 == 0) goto L_0x005c
            r9 = 1
            goto L_0x005d
        L_0x005c:
            r9 = 0
        L_0x005d:
            if (r9 == 0) goto L_0x0069
            int r9 = r1.mo14556k()
            int r10 = r9 + -4
            r1.mo14551f(r10)
            int r8 = r8 - r9
        L_0x0069:
            r9 = r7 & 16
            if (r9 == 0) goto L_0x006f
            r9 = 1
            goto L_0x0070
        L_0x006f:
            r9 = 0
        L_0x0070:
            if (r9 == 0) goto L_0x0074
            int r8 = r8 + -10
        L_0x0074:
            if (r12 >= r3) goto L_0x007c
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x007c
            r7 = 1
            goto L_0x007d
        L_0x007c:
            r7 = 0
        L_0x007d:
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g$b r9 = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g$b
            r9.<init>(r12, r7, r8)
        L_0x0082:
            if (r9 != 0) goto L_0x0085
            return r4
        L_0x0085:
            int r12 = r1.f12122b
            int r7 = r9.f11741a
            if (r7 != r13) goto L_0x008c
            r2 = 6
        L_0x008c:
            int r13 = r9.f11743c
            boolean r7 = r9.f11742b
            if (r7 == 0) goto L_0x0096
            int r13 = m8250f(r1, r13)
        L_0x0096:
            int r12 = r12 + r13
            r1.mo14547d(r12)
            int r12 = r9.f11741a
            boolean r12 = m8240a(r1, r12, r2, r5)
            if (r12 != 0) goto L_0x00af
            int r12 = r9.f11741a
            if (r12 != r3) goto L_0x00ae
            boolean r12 = m8240a(r1, r3, r2, r6)
            if (r12 == 0) goto L_0x00ae
            r5 = 1
            goto L_0x00af
        L_0x00ae:
            return r4
        L_0x00af:
            int r12 = r1.mo14537a()
            if (r12 < r2) goto L_0x00c3
            int r12 = r9.f11741a
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g$a r13 = r11.f11740a
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h r12 = m8238a((int) r12, (com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k) r1, (boolean) r5, (int) r2, (com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C3258g.C3259a) r13)
            if (r12 == 0) goto L_0x00af
            r0.add(r12)
            goto L_0x00af
        L_0x00c3:
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.a r12 = new com.fyber.inneractive.sdk.player.exoplayer2.metadata.a
            r12.<init>((java.util.List<? extends com.fyber.inneractive.sdk.player.exoplayer2.metadata.C3243a.C3245b>) r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C3258g.mo14388a(byte[], int):com.fyber.inneractive.sdk.player.exoplayer2.metadata.a");
    }

    public C3258g(C3259a aVar) {
        this.f11740a = aVar;
    }

    /* renamed from: c */
    public static C3262i m8246c(C3393k kVar, int i) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        System.arraycopy(kVar.f12121a, kVar.f12122b, bArr, 0, i);
        kVar.f12122b += i;
        int b = m8241b(bArr, 0);
        String str = new String(bArr, 0, b, "ISO-8859-1");
        int i2 = b + 1;
        return new C3262i(str, i2 < i ? Arrays.copyOfRange(bArr, i2, i) : new byte[0]);
    }

    /* renamed from: b */
    public static C3264j m8244b(C3393k kVar, int i, String str) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int l = kVar.mo14557l();
        String b = m8245b(l);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        System.arraycopy(kVar.f12121a, kVar.f12122b, bArr, 0, i2);
        kVar.f12122b += i2;
        return new C3264j(str, (String) null, new String(bArr, 0, m8233a(bArr, 0, l), b));
    }

    /* renamed from: b */
    public static C3256f m8243b(C3393k kVar, int i) throws UnsupportedEncodingException {
        int l = kVar.mo14557l();
        String b = m8245b(l);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        System.arraycopy(kVar.f12121a, kVar.f12122b, bArr, 0, i2);
        kVar.f12122b += i2;
        int b2 = m8241b(bArr, 0);
        String str = new String(bArr, 0, b2, "ISO-8859-1");
        int i3 = b2 + 1;
        int a = m8233a(bArr, i3, l);
        String str2 = new String(bArr, i3, a - i3, b);
        int a2 = m8232a(l) + a;
        int a3 = m8233a(bArr, a2, l);
        return new C3256f(str, str2, new String(bArr, a2, a3 - a2, b), Arrays.copyOfRange(bArr, m8232a(l) + a3, i2));
    }

    /* renamed from: a */
    public static C3250c m8236a(C3393k kVar, int i, int i2, boolean z, int i3, C3259a aVar) throws UnsupportedEncodingException {
        C3393k kVar2 = kVar;
        int i4 = kVar2.f12122b;
        int b = m8241b(kVar2.f12121a, i4);
        String str = new String(kVar2.f12121a, i4, b - i4, "ISO-8859-1");
        kVar.mo14549e(b + 1);
        int c = kVar.mo14544c();
        int c2 = kVar.mo14544c();
        long m = kVar.mo14558m();
        long j = m == 4294967295L ? -1 : m;
        long m2 = kVar.mo14558m();
        long j2 = m2 == 4294967295L ? -1 : m2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (kVar2.f12122b < i5) {
            C3261h a = m8238a(i2, kVar, z, i3, aVar);
            if (a != null) {
                arrayList.add(a);
            }
        }
        C3261h[] hVarArr = new C3261h[arrayList.size()];
        arrayList.toArray(hVarArr);
        return new C3250c(str, c, c2, j, j2, hVarArr);
    }

    /* renamed from: b */
    public static int m8241b(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0074, code lost:
        if ((r10 & 1) != 0) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0082, code lost:
        if ((r10 & androidx.recyclerview.widget.RecyclerView.C1119a0.FLAG_IGNORE) != 0) goto L_0x0087;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m8240a(com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f12122b
        L_0x0006:
            int r3 = r18.mo14537a()     // Catch:{ all -> 0x00ab }
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00a7
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0020
            int r7 = r18.mo14544c()     // Catch:{ all -> 0x00ab }
            long r8 = r18.mo14558m()     // Catch:{ all -> 0x00ab }
            int r10 = r18.mo14562q()     // Catch:{ all -> 0x00ab }
            goto L_0x002a
        L_0x0020:
            int r7 = r18.mo14559n()     // Catch:{ all -> 0x00ab }
            int r8 = r18.mo14559n()     // Catch:{ all -> 0x00ab }
            long r8 = (long) r8
            r10 = 0
        L_0x002a:
            r11 = 0
            if (r7 != 0) goto L_0x0038
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x0038
            if (r10 != 0) goto L_0x0038
            r1.mo14549e(r2)
            return r4
        L_0x0038:
            r7 = 4
            if (r0 != r7) goto L_0x0069
            if (r21 != 0) goto L_0x0069
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x0049
            r1.mo14549e(r2)
            return r6
        L_0x0049:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x0069:
            if (r0 != r7) goto L_0x0077
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0071
            r3 = 1
            goto L_0x0072
        L_0x0071:
            r3 = 0
        L_0x0072:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x0086
            goto L_0x0087
        L_0x0077:
            if (r0 != r3) goto L_0x0085
            r3 = r10 & 32
            if (r3 == 0) goto L_0x007f
            r3 = 1
            goto L_0x0080
        L_0x007f:
            r3 = 0
        L_0x0080:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0086
            goto L_0x0087
        L_0x0085:
            r3 = 0
        L_0x0086:
            r4 = 0
        L_0x0087:
            if (r4 == 0) goto L_0x008b
            int r3 = r3 + 4
        L_0x008b:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0094
            r1.mo14549e(r2)
            return r6
        L_0x0094:
            int r3 = r18.mo14537a()     // Catch:{ all -> 0x00ab }
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a1
            r1.mo14549e(r2)
            return r6
        L_0x00a1:
            int r3 = (int) r8
            r1.mo14551f(r3)     // Catch:{ all -> 0x00ab }
            goto L_0x0006
        L_0x00a7:
            r1.mo14549e(r2)
            return r4
        L_0x00ab:
            r0 = move-exception
            r1.mo14549e(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C3258g.m8240a(com.fyber.inneractive.sdk.player.exoplayer2.util.k, int, int, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0180, code lost:
        if (r11 == 67) goto L_0x0182;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C3261h m8238a(int r20, com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k r21, boolean r22, int r23, com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C3258g.C3259a r24) {
        /*
            r0 = r20
            r7 = r21
            int r8 = r21.mo14557l()
            int r9 = r21.mo14557l()
            int r10 = r21.mo14557l()
            r1 = 3
            if (r0 < r1) goto L_0x0019
            int r3 = r21.mo14557l()
            r11 = r3
            goto L_0x001a
        L_0x0019:
            r11 = 0
        L_0x001a:
            r3 = 4
            if (r0 != r3) goto L_0x003b
            int r4 = r21.mo14560o()
            if (r22 != 0) goto L_0x0046
            r5 = r4 & 255(0xff, float:3.57E-43)
            int r6 = r4 >> 8
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 7
            r5 = r5 | r6
            int r6 = r4 >> 16
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 14
            r5 = r5 | r6
            int r4 = r4 >> 24
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 21
            r4 = r4 | r5
            goto L_0x0046
        L_0x003b:
            if (r0 != r1) goto L_0x0042
            int r4 = r21.mo14560o()
            goto L_0x0046
        L_0x0042:
            int r4 = r21.mo14559n()
        L_0x0046:
            if (r0 < r1) goto L_0x004d
            int r5 = r21.mo14562q()
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            r12 = 0
            if (r8 != 0) goto L_0x0061
            if (r9 != 0) goto L_0x0061
            if (r10 != 0) goto L_0x0061
            if (r11 != 0) goto L_0x0061
            if (r4 != 0) goto L_0x0061
            if (r5 != 0) goto L_0x0061
            int r0 = r7.f12123c
            r7.mo14549e(r0)
            return r12
        L_0x0061:
            int r6 = r7.f12122b
            int r13 = r6 + r4
            int r6 = r7.f12123c
            if (r13 <= r6) goto L_0x006d
            r7.mo14549e(r6)
            return r12
        L_0x006d:
            r6 = 77
            r14 = 79
            r15 = 2
            r2 = 67
            r3 = 1
            if (r24 == 0) goto L_0x008c
            if (r8 != r2) goto L_0x0084
            if (r9 != r14) goto L_0x0084
            if (r10 != r6) goto L_0x0084
            if (r11 == r6) goto L_0x0081
            if (r0 != r15) goto L_0x0084
        L_0x0081:
            r17 = 1
            goto L_0x0086
        L_0x0084:
            r17 = 0
        L_0x0086:
            if (r17 != 0) goto L_0x008c
            r7.mo14549e(r13)
            return r12
        L_0x008c:
            if (r0 != r1) goto L_0x00af
            r1 = r5 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0094
            r1 = 1
            goto L_0x0095
        L_0x0094:
            r1 = 0
        L_0x0095:
            r17 = r5 & 64
            if (r17 == 0) goto L_0x009c
            r17 = 1
            goto L_0x009e
        L_0x009c:
            r17 = 0
        L_0x009e:
            r5 = r5 & 32
            if (r5 == 0) goto L_0x00a4
            r5 = 1
            goto L_0x00a5
        L_0x00a4:
            r5 = 0
        L_0x00a5:
            r16 = r1
            r18 = r17
            r19 = 0
            r17 = r16
            r1 = r5
            goto L_0x00e6
        L_0x00af:
            r1 = 4
            if (r0 != r1) goto L_0x00dd
            r1 = r5 & 64
            if (r1 == 0) goto L_0x00b8
            r1 = 1
            goto L_0x00b9
        L_0x00b8:
            r1 = 0
        L_0x00b9:
            r17 = r5 & 8
            if (r17 == 0) goto L_0x00c0
            r17 = 1
            goto L_0x00c2
        L_0x00c0:
            r17 = 0
        L_0x00c2:
            r18 = r5 & 4
            if (r18 == 0) goto L_0x00c9
            r18 = 1
            goto L_0x00cb
        L_0x00c9:
            r18 = 0
        L_0x00cb:
            r19 = r5 & 2
            if (r19 == 0) goto L_0x00d2
            r19 = 1
            goto L_0x00d4
        L_0x00d2:
            r19 = 0
        L_0x00d4:
            r5 = r5 & r3
            if (r5 == 0) goto L_0x00da
            r16 = 1
            goto L_0x00e6
        L_0x00da:
            r16 = 0
            goto L_0x00e6
        L_0x00dd:
            r1 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
        L_0x00e6:
            if (r17 != 0) goto L_0x01e2
            if (r18 == 0) goto L_0x00ec
            goto L_0x01e2
        L_0x00ec:
            if (r1 == 0) goto L_0x00f3
            int r4 = r4 + -1
            r7.mo14551f(r3)
        L_0x00f3:
            if (r16 == 0) goto L_0x00fb
            int r4 = r4 + -4
            r1 = 4
            r7.mo14551f(r1)
        L_0x00fb:
            if (r19 == 0) goto L_0x0102
            int r1 = m8250f(r7, r4)
            r4 = r1
        L_0x0102:
            r1 = 84
            r3 = 88
            if (r8 != r1) goto L_0x0116
            if (r9 != r3) goto L_0x0116
            if (r10 != r3) goto L_0x0116
            if (r0 == r15) goto L_0x0110
            if (r11 != r3) goto L_0x0116
        L_0x0110:
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r1 = m8248d(r7, r4)     // Catch:{ UnsupportedEncodingException -> 0x01dd, all -> 0x0122 }
            goto L_0x01d0
        L_0x0116:
            if (r8 != r1) goto L_0x0125
            java.lang.String r1 = m8239a((int) r0, (int) r8, (int) r9, (int) r10, (int) r11)     // Catch:{ UnsupportedEncodingException -> 0x01dd, all -> 0x0122 }
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.j r1 = m8244b(r7, r4, r1)     // Catch:{ UnsupportedEncodingException -> 0x01dd, all -> 0x0122 }
            goto L_0x01d0
        L_0x0122:
            r0 = move-exception
            goto L_0x01d9
        L_0x0125:
            r5 = 87
            if (r8 != r5) goto L_0x0137
            if (r9 != r3) goto L_0x0137
            if (r10 != r3) goto L_0x0137
            if (r0 == r15) goto L_0x0131
            if (r11 != r3) goto L_0x0137
        L_0x0131:
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.k r1 = m8249e(r7, r4)     // Catch:{ UnsupportedEncodingException -> 0x01dd, all -> 0x0122 }
            goto L_0x01d0
        L_0x0137:
            if (r8 != r5) goto L_0x0143
            java.lang.String r1 = m8239a((int) r0, (int) r8, (int) r9, (int) r10, (int) r11)     // Catch:{ UnsupportedEncodingException -> 0x01dd, all -> 0x0122 }
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.k r1 = m8247c(r7, r4, r1)     // Catch:{ UnsupportedEncodingException -> 0x01dd, all -> 0x0122 }
            goto L_0x01d0
        L_0x0143:
            r3 = 73
            r5 = 80
            if (r8 != r5) goto L_0x0159
            r12 = 82
            if (r9 != r12) goto L_0x0159
            if (r10 != r3) goto L_0x0159
            r12 = 86
            if (r11 != r12) goto L_0x0159
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.i r1 = m8246c(r7, r4)     // Catch:{ UnsupportedEncodingException -> 0x01dd, all -> 0x0122 }
            goto L_0x01d0
        L_0x0159:
            r12 = 71
            if (r8 != r12) goto L_0x016f
            r12 = 69
            if (r9 != r12) goto L_0x016f
            if (r10 != r14) goto L_0x016f
            r12 = 66
            if (r11 == r12) goto L_0x0169
            if (r0 != r15) goto L_0x016f
        L_0x0169:
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.f r1 = m8243b((com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k) r7, (int) r4)     // Catch:{ UnsupportedEncodingException -> 0x01dd, all -> 0x0122 }
            goto L_0x01d0
        L_0x016f:
            r12 = 65
            if (r0 != r15) goto L_0x017a
            if (r8 != r5) goto L_0x0187
            if (r9 != r3) goto L_0x0187
            if (r10 != r2) goto L_0x0187
            goto L_0x0182
        L_0x017a:
            if (r8 != r12) goto L_0x0187
            if (r9 != r5) goto L_0x0187
            if (r10 != r3) goto L_0x0187
            if (r11 != r2) goto L_0x0187
        L_0x0182:
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.a r1 = m8234a((com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k) r7, (int) r4, (int) r0)     // Catch:{ UnsupportedEncodingException -> 0x01dd, all -> 0x0122 }
            goto L_0x01d0
        L_0x0187:
            if (r8 != r2) goto L_0x0196
            if (r9 != r14) goto L_0x0196
            if (r10 != r6) goto L_0x0196
            if (r11 == r6) goto L_0x0191
            if (r0 != r15) goto L_0x0196
        L_0x0191:
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.e r1 = m8237a((com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k) r7, (int) r4)     // Catch:{ UnsupportedEncodingException -> 0x01dd, all -> 0x0122 }
            goto L_0x01d0
        L_0x0196:
            if (r8 != r2) goto L_0x01b0
            r3 = 72
            if (r9 != r3) goto L_0x01b0
            if (r10 != r12) goto L_0x01b0
            if (r11 != r5) goto L_0x01b0
            r1 = r21
            r2 = r4
            r3 = r20
            r4 = r22
            r5 = r23
            r6 = r24
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.c r1 = m8236a(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x01dd, all -> 0x0122 }
            goto L_0x01d0
        L_0x01b0:
            if (r8 != r2) goto L_0x01c8
            if (r9 != r1) goto L_0x01c8
            if (r10 != r14) goto L_0x01c8
            if (r11 != r2) goto L_0x01c8
            r1 = r21
            r2 = r4
            r3 = r20
            r4 = r22
            r5 = r23
            r6 = r24
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.d r1 = m8242b(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x01dd, all -> 0x0122 }
            goto L_0x01d0
        L_0x01c8:
            java.lang.String r1 = m8239a((int) r0, (int) r8, (int) r9, (int) r10, (int) r11)     // Catch:{ UnsupportedEncodingException -> 0x01dd, all -> 0x0122 }
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.b r1 = m8235a((com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k) r7, (int) r4, (java.lang.String) r1)     // Catch:{ UnsupportedEncodingException -> 0x01dd, all -> 0x0122 }
        L_0x01d0:
            if (r1 != 0) goto L_0x01d5
            m8239a((int) r0, (int) r8, (int) r9, (int) r10, (int) r11)     // Catch:{ UnsupportedEncodingException -> 0x01dd, all -> 0x0122 }
        L_0x01d5:
            r7.mo14549e(r13)
            return r1
        L_0x01d9:
            r7.mo14549e(r13)
            throw r0
        L_0x01dd:
            r7.mo14549e(r13)
            r0 = 0
            return r0
        L_0x01e2:
            r0 = r12
            r7.mo14549e(r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C3258g.m8238a(int, com.fyber.inneractive.sdk.player.exoplayer2.util.k, boolean, int, com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.g$a):com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.h");
    }

    /* renamed from: a */
    public static C3246a m8234a(C3393k kVar, int i, int i2) throws UnsupportedEncodingException {
        int i3;
        String str;
        int l = kVar.mo14557l();
        String b = m8245b(l);
        int i4 = i - 1;
        byte[] bArr = new byte[i4];
        System.arraycopy(kVar.f12121a, kVar.f12122b, bArr, 0, i4);
        kVar.f12122b += i4;
        if (i2 == 2) {
            StringBuilder k = C13555b.m33972k("image/");
            k.append(new String(bArr, 0, 3, "ISO-8859-1").toLowerCase(Locale.US));
            str = k.toString();
            if (str.equals("image/jpg")) {
                str = "image/jpeg";
            }
            i3 = 2;
        } else {
            i3 = m8241b(bArr, 0);
            String lowerCase = new String(bArr, 0, i3, "ISO-8859-1").toLowerCase(Locale.US);
            str = lowerCase.indexOf(47) == -1 ? C25541a.m63881k("image/", lowerCase) : lowerCase;
        }
        int i5 = i3 + 2;
        int a = m8233a(bArr, i5, l);
        return new C3246a(str, new String(bArr, i5, a - i5, b), bArr[i3 + 1] & 255, Arrays.copyOfRange(bArr, m8232a(l) + a, i4));
    }

    /* renamed from: a */
    public static C3254e m8237a(C3393k kVar, int i) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int l = kVar.mo14557l();
        String b = m8245b(l);
        byte[] bArr = new byte[3];
        System.arraycopy(kVar.f12121a, kVar.f12122b, bArr, 0, 3);
        kVar.f12122b += 3;
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        System.arraycopy(kVar.f12121a, kVar.f12122b, bArr2, 0, i2);
        kVar.f12122b += i2;
        int a = m8233a(bArr2, 0, l);
        String str2 = new String(bArr2, 0, a, b);
        int a2 = m8232a(l) + a;
        return new C3254e(str, str2, a2 < i2 ? new String(bArr2, a2, m8233a(bArr2, a2, l) - a2, b) : "");
    }

    /* renamed from: a */
    public static C3248b m8235a(C3393k kVar, int i, String str) {
        byte[] bArr = new byte[i];
        System.arraycopy(kVar.f12121a, kVar.f12122b, bArr, 0, i);
        kVar.f12122b += i;
        return new C3248b(str, bArr);
    }

    /* renamed from: a */
    public static String m8239a(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    /* renamed from: a */
    public static int m8233a(byte[] bArr, int i, int i2) {
        int b = m8241b(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return b;
        }
        while (b < bArr.length - 1) {
            if (b % 2 == 0 && bArr[b + 1] == 0) {
                return b;
            }
            b = m8241b(bArr, b + 1);
        }
        return bArr.length;
    }
}
