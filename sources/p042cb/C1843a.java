package p042cb;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.ApicFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterFrame;
import com.google.android.exoplayer2.metadata.id3.ChapterTocFrame;
import com.google.android.exoplayer2.metadata.id3.CommentFrame;
import com.google.android.exoplayer2.metadata.id3.GeobFrame;
import com.google.android.exoplayer2.metadata.id3.Id3Frame;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import com.google.android.exoplayer2.metadata.id3.PrivFrame;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.metadata.id3.UrlLinkFrame;
import com.google.android.play.core.appupdate.C14226d;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import p011aa.C0141e;
import p115i0.C5227c;
import p277ub.C6774a0;
import p277ub.C6802q;
import p277ub.C6803r;
import p326ya.C7357c;

/* renamed from: cb.a */
public final class C1843a extends C0141e {

    /* renamed from: c */
    public static final C5227c f6364c = new C5227c(9);

    /* renamed from: b */
    public final C1844a f6365b;

    /* renamed from: cb.a$a */
    public interface C1844a {
        /* renamed from: c */
        boolean mo6656c(int i, int i2, int i3, int i4, int i5);
    }

    /* renamed from: cb.a$b */
    public static final class C1845b {

        /* renamed from: a */
        public final int f6366a;

        /* renamed from: b */
        public final boolean f6367b;

        /* renamed from: c */
        public final int f6368c;

        public C1845b(int i, boolean z, int i2) {
            this.f6366a = i;
            this.f6367b = z;
            this.f6368c = i2;
        }
    }

    public C1843a(C1844a aVar) {
        this.f6365b = aVar;
    }

    /* renamed from: A */
    public static TextInformationFrame m5180A(int i, C6803r rVar) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int p = rVar.mo22997p();
        String E = m5184E(p);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        rVar.mo22983b(0, i2, bArr);
        int G = m5186G(0, p, bArr);
        String str = new String(bArr, 0, G, E);
        int D = m5183D(p) + G;
        return new TextInformationFrame("TXXX", str, m5198y(D, m5186G(D, p, bArr), bArr, E));
    }

    /* renamed from: B */
    public static UrlLinkFrame m5181B(int i, C6803r rVar, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        rVar.mo22983b(0, i, bArr);
        return new UrlLinkFrame(str, (String) null, new String(bArr, 0, m5187I(0, bArr), "ISO-8859-1"));
    }

    /* renamed from: C */
    public static UrlLinkFrame m5182C(int i, C6803r rVar) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int p = rVar.mo22997p();
        String E = m5184E(p);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        rVar.mo22983b(0, i2, bArr);
        int G = m5186G(0, p, bArr);
        String str = new String(bArr, 0, G, E);
        int D = m5183D(p) + G;
        return new UrlLinkFrame("WXXX", str, m5198y(D, m5187I(D, bArr), bArr, "ISO-8859-1"));
    }

    /* renamed from: D */
    public static int m5183D(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    /* renamed from: E */
    public static String m5184E(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    /* renamed from: F */
    public static String m5185F(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    /* renamed from: G */
    public static int m5186G(int i, int i2, byte[] bArr) {
        int I = m5187I(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return I;
        }
        while (I < bArr.length - 1) {
            if (I % 2 == 0 && bArr[I + 1] == 0) {
                return I;
            }
            I = m5187I(I + 1, bArr);
        }
        return bArr.length;
    }

    /* renamed from: I */
    public static int m5187I(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    /* renamed from: J */
    public static int m5188J(int i, C6803r rVar) {
        byte[] bArr = rVar.f21038a;
        int i2 = rVar.f21039b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0075, code lost:
        if ((r10 & 1) != 0) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0083, code lost:
        if ((r10 & androidx.recyclerview.widget.RecyclerView.C1119a0.FLAG_IGNORE) != 0) goto L_0x0088;
     */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m5189K(p277ub.C6803r r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.f21039b
        L_0x0006:
            int r3 = r1.f21040c     // Catch:{ all -> 0x00ad }
            int r4 = r1.f21039b     // Catch:{ all -> 0x00ad }
            int r3 = r3 - r4
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00a9
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0021
            int r7 = r18.mo22984c()     // Catch:{ all -> 0x00ad }
            long r8 = r18.mo22998q()     // Catch:{ all -> 0x00ad }
            int r10 = r18.mo23002u()     // Catch:{ all -> 0x00ad }
            goto L_0x002b
        L_0x0021:
            int r7 = r18.mo22999r()     // Catch:{ all -> 0x00ad }
            int r8 = r18.mo22999r()     // Catch:{ all -> 0x00ad }
            long r8 = (long) r8
            r10 = 0
        L_0x002b:
            r11 = 0
            if (r7 != 0) goto L_0x0039
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x0039
            if (r10 != 0) goto L_0x0039
            r1.mo23007z(r2)
            return r4
        L_0x0039:
            r7 = 4
            if (r0 != r7) goto L_0x006a
            if (r21 != 0) goto L_0x006a
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x004a
            r1.mo23007z(r2)
            return r6
        L_0x004a:
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
        L_0x006a:
            if (r0 != r7) goto L_0x0078
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0072
            r3 = 1
            goto L_0x0073
        L_0x0072:
            r3 = 0
        L_0x0073:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x0087
            goto L_0x0088
        L_0x0078:
            if (r0 != r3) goto L_0x0086
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0080
            r3 = 1
            goto L_0x0081
        L_0x0080:
            r3 = 0
        L_0x0081:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0087
            goto L_0x0088
        L_0x0086:
            r3 = 0
        L_0x0087:
            r4 = 0
        L_0x0088:
            if (r4 == 0) goto L_0x008c
            int r3 = r3 + 4
        L_0x008c:
            long r3 = (long) r3
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x0095
            r1.mo23007z(r2)
            return r6
        L_0x0095:
            int r3 = r1.f21040c     // Catch:{ all -> 0x00ad }
            int r4 = r1.f21039b     // Catch:{ all -> 0x00ad }
            int r3 = r3 - r4
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a3
            r1.mo23007z(r2)
            return r6
        L_0x00a3:
            int r3 = (int) r8
            r1.mo22981A(r3)     // Catch:{ all -> 0x00ad }
            goto L_0x0006
        L_0x00a9:
            r1.mo23007z(r2)
            return r4
        L_0x00ad:
            r0 = move-exception
            r1.mo23007z(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p042cb.C1843a.m5189K(ub.r, int, int, boolean):boolean");
    }

    /* renamed from: q */
    public static ApicFrame m5190q(C6803r rVar, int i, int i2) throws UnsupportedEncodingException {
        int i3;
        String str;
        byte[] bArr;
        String str2;
        int p = rVar.mo22997p();
        String E = m5184E(p);
        int i4 = i - 1;
        byte[] bArr2 = new byte[i4];
        rVar.mo22983b(0, i4, bArr2);
        if (i2 == 2) {
            String valueOf = String.valueOf(C14226d.m35341H0(new String(bArr2, 0, 3, "ISO-8859-1")));
            if (valueOf.length() != 0) {
                str2 = "image/".concat(valueOf);
            } else {
                str2 = new String("image/");
            }
            if ("image/jpg".equals(str2)) {
                str2 = "image/jpeg";
            }
            str = str2;
            i3 = 2;
        } else {
            i3 = m5187I(0, bArr2);
            String H0 = C14226d.m35341H0(new String(bArr2, 0, i3, "ISO-8859-1"));
            if (H0.indexOf(47) != -1) {
                str = H0;
            } else if (H0.length() != 0) {
                str = "image/".concat(H0);
            } else {
                str = new String("image/");
            }
        }
        byte b = bArr2[i3 + 1] & 255;
        int i5 = i3 + 2;
        int G = m5186G(i5, p, bArr2);
        String str3 = new String(bArr2, i5, G - i5, E);
        int D = m5183D(p) + G;
        if (i4 <= D) {
            bArr = C6774a0.f20964f;
        } else {
            bArr = Arrays.copyOfRange(bArr2, D, i4);
        }
        return new ApicFrame(str, str3, b, bArr);
    }

    /* renamed from: r */
    public static ChapterFrame m5191r(C6803r rVar, int i, int i2, boolean z, int i3, C1844a aVar) throws UnsupportedEncodingException {
        long j;
        long j2;
        C6803r rVar2 = rVar;
        int i4 = rVar2.f21039b;
        int I = m5187I(i4, rVar2.f21038a);
        String str = new String(rVar2.f21038a, i4, I - i4, "ISO-8859-1");
        rVar.mo23007z(I + 1);
        int c = rVar.mo22984c();
        int c2 = rVar.mo22984c();
        long q = rVar.mo22998q();
        if (q == 4294967295L) {
            j = -1;
        } else {
            j = q;
        }
        long q2 = rVar.mo22998q();
        if (q2 == 4294967295L) {
            j2 = -1;
        } else {
            j2 = q2;
        }
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (rVar2.f21039b < i5) {
            Id3Frame u = m5194u(i2, rVar, z, i3, aVar);
            if (u != null) {
                arrayList.add(u);
            }
        }
        return new ChapterFrame(str, c, c2, j, j2, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    /* renamed from: s */
    public static ChapterTocFrame m5192s(C6803r rVar, int i, int i2, boolean z, int i3, C1844a aVar) throws UnsupportedEncodingException {
        boolean z2;
        boolean z3;
        C6803r rVar2 = rVar;
        int i4 = rVar2.f21039b;
        int I = m5187I(i4, rVar2.f21038a);
        String str = new String(rVar2.f21038a, i4, I - i4, "ISO-8859-1");
        rVar2.mo23007z(I + 1);
        int p = rVar.mo22997p();
        if ((p & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((p & 1) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        int p2 = rVar.mo22997p();
        String[] strArr = new String[p2];
        for (int i5 = 0; i5 < p2; i5++) {
            int i6 = rVar2.f21039b;
            int I2 = m5187I(i6, rVar2.f21038a);
            strArr[i5] = new String(rVar2.f21038a, i6, I2 - i6, "ISO-8859-1");
            rVar2.mo23007z(I2 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (rVar2.f21039b < i7) {
            Id3Frame u = m5194u(i2, rVar2, z, i3, aVar);
            if (u != null) {
                arrayList.add(u);
            }
        }
        return new ChapterTocFrame(str, z2, z3, strArr, (Id3Frame[]) arrayList.toArray(new Id3Frame[0]));
    }

    /* renamed from: t */
    public static CommentFrame m5193t(int i, C6803r rVar) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int p = rVar.mo22997p();
        String E = m5184E(p);
        byte[] bArr = new byte[3];
        rVar.mo22983b(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        rVar.mo22983b(0, i2, bArr2);
        int G = m5186G(0, p, bArr2);
        String str2 = new String(bArr2, 0, G, E);
        int D = m5183D(p) + G;
        return new CommentFrame(str, str2, m5198y(D, m5186G(D, p, bArr2), bArr2, E));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0177, code lost:
        if (r13 == 67) goto L_0x0179;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.exoplayer2.metadata.id3.Id3Frame m5194u(int r17, p277ub.C6803r r18, boolean r19, int r20, p042cb.C1843a.C1844a r21) {
        /*
            r0 = r17
            r7 = r18
            int r8 = r18.mo22997p()
            int r9 = r18.mo22997p()
            int r10 = r18.mo22997p()
            r12 = 3
            if (r0 < r12) goto L_0x0019
            int r1 = r18.mo22997p()
            r13 = r1
            goto L_0x001a
        L_0x0019:
            r13 = 0
        L_0x001a:
            r14 = 4
            if (r0 != r14) goto L_0x003c
            int r1 = r18.mo23000s()
            if (r19 != 0) goto L_0x003a
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r1 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 7
            r2 = r2 | r3
            int r3 = r1 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 14
            r2 = r2 | r3
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 21
            r1 = r1 | r2
        L_0x003a:
            r15 = r1
            goto L_0x0048
        L_0x003c:
            if (r0 != r12) goto L_0x0043
            int r1 = r18.mo23000s()
            goto L_0x003a
        L_0x0043:
            int r1 = r18.mo22999r()
            goto L_0x003a
        L_0x0048:
            if (r0 < r12) goto L_0x0050
            int r1 = r18.mo23002u()
            r6 = r1
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            r16 = 0
            if (r8 != 0) goto L_0x0065
            if (r9 != 0) goto L_0x0065
            if (r10 != 0) goto L_0x0065
            if (r13 != 0) goto L_0x0065
            if (r15 != 0) goto L_0x0065
            if (r6 != 0) goto L_0x0065
            int r0 = r7.f21040c
            r7.mo23007z(r0)
            return r16
        L_0x0065:
            int r1 = r7.f21039b
            int r5 = r1 + r15
            int r1 = r7.f21040c
            if (r5 <= r1) goto L_0x0071
            r7.mo23007z(r1)
            return r16
        L_0x0071:
            if (r21 == 0) goto L_0x0087
            r1 = r21
            r2 = r17
            r3 = r8
            r4 = r9
            r11 = r5
            r5 = r10
            r14 = r6
            r6 = r13
            boolean r1 = r1.mo6656c(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x0089
            r7.mo23007z(r11)
            return r16
        L_0x0087:
            r11 = r5
            r14 = r6
        L_0x0089:
            r1 = 1
            if (r0 != r12) goto L_0x00a6
            r2 = r14 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x0092
            r2 = 1
            goto L_0x0093
        L_0x0092:
            r2 = 0
        L_0x0093:
            r3 = r14 & 64
            if (r3 == 0) goto L_0x0099
            r3 = 1
            goto L_0x009a
        L_0x0099:
            r3 = 0
        L_0x009a:
            r4 = r14 & 32
            if (r4 == 0) goto L_0x00a0
            r4 = 1
            goto L_0x00a1
        L_0x00a0:
            r4 = 0
        L_0x00a1:
            r5 = r4
            r6 = 0
            r4 = r3
            r3 = r2
            goto L_0x00d6
        L_0x00a6:
            r2 = 4
            if (r0 != r2) goto L_0x00ce
            r2 = r14 & 64
            if (r2 == 0) goto L_0x00af
            r4 = 1
            goto L_0x00b0
        L_0x00af:
            r4 = 0
        L_0x00b0:
            r2 = r14 & 8
            if (r2 == 0) goto L_0x00b6
            r2 = 1
            goto L_0x00b7
        L_0x00b6:
            r2 = 0
        L_0x00b7:
            r3 = r14 & 4
            if (r3 == 0) goto L_0x00bd
            r3 = 1
            goto L_0x00be
        L_0x00bd:
            r3 = 0
        L_0x00be:
            r5 = r14 & 2
            if (r5 == 0) goto L_0x00c4
            r5 = 1
            goto L_0x00c5
        L_0x00c4:
            r5 = 0
        L_0x00c5:
            r6 = r14 & 1
            if (r6 == 0) goto L_0x00d2
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = 1
            goto L_0x00d6
        L_0x00ce:
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x00d2:
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = 0
        L_0x00d6:
            if (r2 != 0) goto L_0x0200
            if (r4 == 0) goto L_0x00dc
            goto L_0x0200
        L_0x00dc:
            if (r5 == 0) goto L_0x00e3
            int r15 = r15 + -1
            r7.mo22981A(r1)
        L_0x00e3:
            if (r3 == 0) goto L_0x00eb
            int r15 = r15 + -4
            r1 = 4
            r7.mo22981A(r1)
        L_0x00eb:
            if (r6 == 0) goto L_0x00f3
            int r1 = m5188J(r15, r7)
            r2 = r1
            goto L_0x00f4
        L_0x00f3:
            r2 = r15
        L_0x00f4:
            r1 = 84
            r3 = 88
            r4 = 2
            if (r8 != r1) goto L_0x0109
            if (r9 != r3) goto L_0x0109
            if (r10 != r3) goto L_0x0109
            if (r0 == r4) goto L_0x0103
            if (r13 != r3) goto L_0x0109
        L_0x0103:
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r1 = m5180A(r2, r7)     // Catch:{ UnsupportedEncodingException -> 0x01fc, all -> 0x0115 }
            goto L_0x01df
        L_0x0109:
            if (r8 != r1) goto L_0x0118
            java.lang.String r1 = m5185F(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x01fc, all -> 0x0115 }
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r1 = m5199z(r2, r7, r1)     // Catch:{ UnsupportedEncodingException -> 0x01fc, all -> 0x0115 }
            goto L_0x01df
        L_0x0115:
            r0 = move-exception
            goto L_0x01f8
        L_0x0118:
            r5 = 87
            if (r8 != r5) goto L_0x012a
            if (r9 != r3) goto L_0x012a
            if (r10 != r3) goto L_0x012a
            if (r0 == r4) goto L_0x0124
            if (r13 != r3) goto L_0x012a
        L_0x0124:
            com.google.android.exoplayer2.metadata.id3.UrlLinkFrame r1 = m5182C(r2, r7)     // Catch:{ UnsupportedEncodingException -> 0x01fc, all -> 0x0115 }
            goto L_0x01df
        L_0x012a:
            if (r8 != r5) goto L_0x0136
            java.lang.String r1 = m5185F(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x01fc, all -> 0x0115 }
            com.google.android.exoplayer2.metadata.id3.UrlLinkFrame r1 = m5181B(r2, r7, r1)     // Catch:{ UnsupportedEncodingException -> 0x01fc, all -> 0x0115 }
            goto L_0x01df
        L_0x0136:
            r3 = 73
            r5 = 80
            if (r8 != r5) goto L_0x014c
            r6 = 82
            if (r9 != r6) goto L_0x014c
            if (r10 != r3) goto L_0x014c
            r6 = 86
            if (r13 != r6) goto L_0x014c
            com.google.android.exoplayer2.metadata.id3.PrivFrame r1 = m5197x(r2, r7)     // Catch:{ UnsupportedEncodingException -> 0x01fc, all -> 0x0115 }
            goto L_0x01df
        L_0x014c:
            r6 = 71
            r12 = 79
            if (r8 != r6) goto L_0x0164
            r6 = 69
            if (r9 != r6) goto L_0x0164
            if (r10 != r12) goto L_0x0164
            r6 = 66
            if (r13 == r6) goto L_0x015e
            if (r0 != r4) goto L_0x0164
        L_0x015e:
            com.google.android.exoplayer2.metadata.id3.GeobFrame r1 = m5195v(r2, r7)     // Catch:{ UnsupportedEncodingException -> 0x01fc, all -> 0x0115 }
            goto L_0x01df
        L_0x0164:
            r6 = 65
            r14 = 67
            if (r0 != r4) goto L_0x0171
            if (r8 != r5) goto L_0x017f
            if (r9 != r3) goto L_0x017f
            if (r10 != r14) goto L_0x017f
            goto L_0x0179
        L_0x0171:
            if (r8 != r6) goto L_0x017f
            if (r9 != r5) goto L_0x017f
            if (r10 != r3) goto L_0x017f
            if (r13 != r14) goto L_0x017f
        L_0x0179:
            com.google.android.exoplayer2.metadata.id3.ApicFrame r1 = m5190q(r7, r2, r0)     // Catch:{ UnsupportedEncodingException -> 0x01fc, all -> 0x0115 }
            goto L_0x01df
        L_0x017f:
            r3 = 77
            if (r8 != r14) goto L_0x0190
            if (r9 != r12) goto L_0x0190
            if (r10 != r3) goto L_0x0190
            if (r13 == r3) goto L_0x018b
            if (r0 != r4) goto L_0x0190
        L_0x018b:
            com.google.android.exoplayer2.metadata.id3.CommentFrame r1 = m5193t(r2, r7)     // Catch:{ UnsupportedEncodingException -> 0x01fc, all -> 0x0115 }
            goto L_0x01df
        L_0x0190:
            if (r8 != r14) goto L_0x01a9
            r4 = 72
            if (r9 != r4) goto L_0x01a9
            if (r10 != r6) goto L_0x01a9
            if (r13 != r5) goto L_0x01a9
            r1 = r18
            r3 = r17
            r4 = r19
            r5 = r20
            r6 = r21
            com.google.android.exoplayer2.metadata.id3.ChapterFrame r1 = m5191r(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x01fc, all -> 0x0115 }
            goto L_0x01df
        L_0x01a9:
            if (r8 != r14) goto L_0x01c0
            if (r9 != r1) goto L_0x01c0
            if (r10 != r12) goto L_0x01c0
            if (r13 != r14) goto L_0x01c0
            r1 = r18
            r3 = r17
            r4 = r19
            r5 = r20
            r6 = r21
            com.google.android.exoplayer2.metadata.id3.ChapterTocFrame r1 = m5192s(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x01fc, all -> 0x0115 }
            goto L_0x01df
        L_0x01c0:
            if (r8 != r3) goto L_0x01cf
            r3 = 76
            if (r9 != r3) goto L_0x01cf
            if (r10 != r3) goto L_0x01cf
            if (r13 != r1) goto L_0x01cf
            com.google.android.exoplayer2.metadata.id3.MlltFrame r1 = m5196w(r2, r7)     // Catch:{ UnsupportedEncodingException -> 0x01fc, all -> 0x0115 }
            goto L_0x01df
        L_0x01cf:
            java.lang.String r1 = m5185F(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x01fc, all -> 0x0115 }
            byte[] r3 = new byte[r2]     // Catch:{ UnsupportedEncodingException -> 0x01fc, all -> 0x0115 }
            r4 = 0
            r7.mo22983b(r4, r2, r3)     // Catch:{ UnsupportedEncodingException -> 0x01fc, all -> 0x0115 }
            com.google.android.exoplayer2.metadata.id3.BinaryFrame r2 = new com.google.android.exoplayer2.metadata.id3.BinaryFrame     // Catch:{ UnsupportedEncodingException -> 0x01fc, all -> 0x0115 }
            r2.<init>(r1, r3)     // Catch:{ UnsupportedEncodingException -> 0x01fc, all -> 0x0115 }
            r1 = r2
        L_0x01df:
            if (r1 != 0) goto L_0x01f4
            java.lang.String r0 = m5185F(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x01fc, all -> 0x0115 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ UnsupportedEncodingException -> 0x01fc, all -> 0x0115 }
            int r0 = r0.length()     // Catch:{ UnsupportedEncodingException -> 0x01fc, all -> 0x0115 }
            int r0 = r0 + 50
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x01fc, all -> 0x0115 }
            r2.<init>(r0)     // Catch:{ UnsupportedEncodingException -> 0x01fc, all -> 0x0115 }
        L_0x01f4:
            r7.mo23007z(r11)
            return r1
        L_0x01f8:
            r7.mo23007z(r11)
            throw r0
        L_0x01fc:
            r7.mo23007z(r11)
            return r16
        L_0x0200:
            r7.mo23007z(r11)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: p042cb.C1843a.m5194u(int, ub.r, boolean, int, cb.a$a):com.google.android.exoplayer2.metadata.id3.Id3Frame");
    }

    /* renamed from: v */
    public static GeobFrame m5195v(int i, C6803r rVar) throws UnsupportedEncodingException {
        byte[] bArr;
        int p = rVar.mo22997p();
        String E = m5184E(p);
        int i2 = i - 1;
        byte[] bArr2 = new byte[i2];
        rVar.mo22983b(0, i2, bArr2);
        int I = m5187I(0, bArr2);
        String str = new String(bArr2, 0, I, "ISO-8859-1");
        int i3 = I + 1;
        int G = m5186G(i3, p, bArr2);
        String y = m5198y(i3, G, bArr2, E);
        int D = m5183D(p) + G;
        int G2 = m5186G(D, p, bArr2);
        String y2 = m5198y(D, G2, bArr2, E);
        int D2 = m5183D(p) + G2;
        if (i2 <= D2) {
            bArr = C6774a0.f20964f;
        } else {
            bArr = Arrays.copyOfRange(bArr2, D2, i2);
        }
        return new GeobFrame(str, y, y2, bArr);
    }

    /* renamed from: w */
    public static MlltFrame m5196w(int i, C6803r rVar) {
        int u = rVar.mo23002u();
        int r = rVar.mo22999r();
        int r2 = rVar.mo22999r();
        int p = rVar.mo22997p();
        int p2 = rVar.mo22997p();
        C6802q qVar = new C6802q();
        qVar.mo22976i(rVar.f21040c, rVar.f21038a);
        qVar.mo22977j(rVar.f21039b * 8);
        int i2 = ((i - 10) * 8) / (p + p2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int f = qVar.mo22973f(p);
            int f2 = qVar.mo22973f(p2);
            iArr[i3] = f;
            iArr2[i3] = f2;
        }
        return new MlltFrame(u, r, r2, iArr, iArr2);
    }

    /* renamed from: x */
    public static PrivFrame m5197x(int i, C6803r rVar) throws UnsupportedEncodingException {
        byte[] bArr;
        byte[] bArr2 = new byte[i];
        rVar.mo22983b(0, i, bArr2);
        int I = m5187I(0, bArr2);
        String str = new String(bArr2, 0, I, "ISO-8859-1");
        int i2 = I + 1;
        if (i <= i2) {
            bArr = C6774a0.f20964f;
        } else {
            bArr = Arrays.copyOfRange(bArr2, i2, i);
        }
        return new PrivFrame(str, bArr);
    }

    /* renamed from: y */
    public static String m5198y(int i, int i2, byte[] bArr, String str) throws UnsupportedEncodingException {
        if (i2 <= i || i2 > bArr.length) {
            return "";
        }
        return new String(bArr, i, i2 - i, str);
    }

    /* renamed from: z */
    public static TextInformationFrame m5199z(int i, C6803r rVar, String str) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int p = rVar.mo22997p();
        String E = m5184E(p);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        rVar.mo22983b(0, i2, bArr);
        return new TextInformationFrame(str, (String) null, new String(bArr, 0, m5186G(0, p, bArr), E));
    }

    /* renamed from: m */
    public final Metadata mo321m(C7357c cVar, ByteBuffer byteBuffer) {
        return mo6662p(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        if (r9 != false) goto L_0x00a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a6  */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.exoplayer2.metadata.Metadata mo6662p(int r12, byte[] r13) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            ub.r r1 = new ub.r
            r1.<init>(r13, r12)
            int r12 = r1.f21040c
            int r13 = r1.f21039b
            int r12 = r12 - r13
            r13 = 0
            r2 = 1
            r3 = 2
            r4 = 10
            r5 = 4
            r6 = 0
            if (r12 >= r4) goto L_0x001a
            goto L_0x00a2
        L_0x001a:
            int r12 = r1.mo22999r()
            r7 = 4801587(0x494433, float:6.728456E-39)
            if (r12 == r7) goto L_0x0042
            java.lang.Object[] r7 = new java.lang.Object[r2]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r7[r13] = r12
            java.lang.String r12 = "%06X"
            java.lang.String r12 = java.lang.String.format(r12, r7)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            int r7 = r12.length()
            if (r7 == 0) goto L_0x00a2
            java.lang.String r7 = "Unexpected first three bytes of ID3 tag header: 0x"
            r7.concat(r12)
            goto L_0x00a2
        L_0x0042:
            int r12 = r1.mo22997p()
            r1.mo22981A(r2)
            int r7 = r1.mo22997p()
            int r8 = r1.mo22996o()
            if (r12 != r3) goto L_0x005d
            r9 = r7 & 64
            if (r9 == 0) goto L_0x0059
            r9 = 1
            goto L_0x005a
        L_0x0059:
            r9 = 0
        L_0x005a:
            if (r9 == 0) goto L_0x0093
            goto L_0x00a2
        L_0x005d:
            r9 = 3
            if (r12 != r9) goto L_0x0073
            r9 = r7 & 64
            if (r9 == 0) goto L_0x0066
            r9 = 1
            goto L_0x0067
        L_0x0066:
            r9 = 0
        L_0x0067:
            if (r9 == 0) goto L_0x0093
            int r9 = r1.mo22984c()
            r1.mo22981A(r9)
            int r9 = r9 + r5
            int r8 = r8 - r9
            goto L_0x0093
        L_0x0073:
            if (r12 != r5) goto L_0x00a2
            r9 = r7 & 64
            if (r9 == 0) goto L_0x007b
            r9 = 1
            goto L_0x007c
        L_0x007b:
            r9 = 0
        L_0x007c:
            if (r9 == 0) goto L_0x0088
            int r9 = r1.mo22996o()
            int r10 = r9 + -4
            r1.mo22981A(r10)
            int r8 = r8 - r9
        L_0x0088:
            r9 = r7 & 16
            if (r9 == 0) goto L_0x008e
            r9 = 1
            goto L_0x008f
        L_0x008e:
            r9 = 0
        L_0x008f:
            if (r9 == 0) goto L_0x0093
            int r8 = r8 + -10
        L_0x0093:
            if (r12 >= r5) goto L_0x009b
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x009b
            r7 = 1
            goto L_0x009c
        L_0x009b:
            r7 = 0
        L_0x009c:
            cb.a$b r9 = new cb.a$b
            r9.<init>(r12, r7, r8)
            goto L_0x00a3
        L_0x00a2:
            r9 = r6
        L_0x00a3:
            if (r9 != 0) goto L_0x00a6
            return r6
        L_0x00a6:
            int r12 = r1.f21039b
            int r7 = r9.f6366a
            if (r7 != r3) goto L_0x00ad
            r4 = 6
        L_0x00ad:
            int r3 = r9.f6368c
            boolean r7 = r9.f6367b
            if (r7 == 0) goto L_0x00b7
            int r3 = m5188J(r3, r1)
        L_0x00b7:
            int r12 = r12 + r3
            r1.mo23006y(r12)
            int r12 = r9.f6366a
            boolean r12 = m5189K(r1, r12, r4, r13)
            if (r12 != 0) goto L_0x00d0
            int r12 = r9.f6366a
            if (r12 != r5) goto L_0x00cf
            boolean r12 = m5189K(r1, r5, r4, r2)
            if (r12 == 0) goto L_0x00cf
            r13 = 1
            goto L_0x00d0
        L_0x00cf:
            return r6
        L_0x00d0:
            int r12 = r1.f21040c
            int r2 = r1.f21039b
            int r12 = r12 - r2
            if (r12 < r4) goto L_0x00e5
            int r12 = r9.f6366a
            cb.a$a r2 = r11.f6365b
            com.google.android.exoplayer2.metadata.id3.Id3Frame r12 = m5194u(r12, r1, r13, r4, r2)
            if (r12 == 0) goto L_0x00d0
            r0.add(r12)
            goto L_0x00d0
        L_0x00e5:
            com.google.android.exoplayer2.metadata.Metadata r12 = new com.google.android.exoplayer2.metadata.Metadata
            r12.<init>((java.util.ArrayList) r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p042cb.C1843a.mo6662p(int, byte[]):com.google.android.exoplayer2.metadata.Metadata");
    }
}
