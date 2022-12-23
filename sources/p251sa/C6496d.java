package p251sa;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import java.io.EOFException;
import java.io.IOException;
import p041ca.C1832r;
import p099ga.C4883f;
import p125ia.C5329o;
import p173ma.C5732e;
import p173ma.C5734g;
import p173ma.C5735h;
import p173ma.C5736i;
import p173ma.C5737j;
import p173ma.C5746p;
import p173ma.C5747q;
import p173ma.C5754v;
import p277ub.C6803r;

/* renamed from: sa.d */
public final class C6496d implements C5735h {

    /* renamed from: u */
    public static final C1832r f20257u = new C1832r(2);

    /* renamed from: a */
    public final int f20258a;

    /* renamed from: b */
    public final long f20259b;

    /* renamed from: c */
    public final C6803r f20260c;

    /* renamed from: d */
    public final C5329o.C5330a f20261d;

    /* renamed from: e */
    public final C5746p f20262e;

    /* renamed from: f */
    public final C5747q f20263f;

    /* renamed from: g */
    public final C5734g f20264g;

    /* renamed from: h */
    public C5737j f20265h;

    /* renamed from: i */
    public C5754v f20266i;

    /* renamed from: j */
    public C5754v f20267j;

    /* renamed from: k */
    public int f20268k;

    /* renamed from: l */
    public Metadata f20269l;

    /* renamed from: m */
    public long f20270m;

    /* renamed from: n */
    public long f20271n;

    /* renamed from: o */
    public long f20272o;

    /* renamed from: p */
    public int f20273p;

    /* renamed from: q */
    public C6497e f20274q;

    /* renamed from: r */
    public boolean f20275r;

    /* renamed from: s */
    public boolean f20276s;

    /* renamed from: t */
    public long f20277t;

    public C6496d() {
        this(0);
    }

    /* renamed from: d */
    public static long m15396d(Metadata metadata) {
        if (metadata == null) {
            return -9223372036854775807L;
        }
        for (Metadata.Entry entry : metadata.f13864b) {
            if (entry instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) entry;
                if (textInformationFrame.f13927b.equals("TLEN")) {
                    return C4883f.m12376a(Long.parseLong(textInformationFrame.f13939d));
                }
            }
        }
        return -9223372036854775807L;
    }

    /* renamed from: a */
    public final void mo21592a(long j, long j2) {
        this.f20268k = 0;
        this.f20270m = -9223372036854775807L;
        this.f20271n = 0;
        this.f20273p = 0;
        this.f20277t = j2;
        C6497e eVar = this.f20274q;
        if ((eVar instanceof C6494b) && !((C6494b) eVar).mo22598a(j2)) {
            this.f20276s = true;
            this.f20267j = this.f20264g;
        }
    }

    /* renamed from: b */
    public final boolean mo21593b(C5736i iVar) throws IOException {
        return mo22601f((C5732e) iVar, true);
    }

    /* renamed from: c */
    public final C6493a mo22599c(C5732e eVar) throws IOException {
        eVar.mo21583j(0, 4, this.f20260c.f21038a, false);
        this.f20260c.mo23007z(0);
        this.f20261d.mo21110a(this.f20260c.mo22984c());
        return new C6493a(eVar.f18590c, eVar.f18591d, this.f20261d);
    }

    /* renamed from: e */
    public final boolean mo22600e(C5732e eVar) throws IOException {
        C6497e eVar2 = this.f20274q;
        if (eVar2 != null) {
            long d = eVar2.mo22596d();
            if (d != -1 && eVar.mo21577f() > d - 4) {
                return true;
            }
        }
        try {
            return !eVar.mo21583j(0, 4, this.f20260c.f21038a, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0072, code lost:
        if (r11 != false) goto L_0x0074;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo22601f(p173ma.C5732e r18, boolean r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r19 == 0) goto L_0x000a
            r2 = 32768(0x8000, float:4.5918E-41)
            goto L_0x000c
        L_0x000a:
            r2 = 131072(0x20000, float:1.83671E-40)
        L_0x000c:
            r3 = 0
            r1.f18593f = r3
            long r4 = r1.f18591d
            r6 = 0
            r8 = 4
            r9 = 1
            int r10 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r10 != 0) goto L_0x0041
            int r4 = r0.f20258a
            r4 = r4 & r8
            if (r4 != 0) goto L_0x0020
            r4 = 1
            goto L_0x0021
        L_0x0020:
            r4 = 0
        L_0x0021:
            if (r4 == 0) goto L_0x0025
            r4 = 0
            goto L_0x0027
        L_0x0025:
            ca.r r4 = f20257u
        L_0x0027:
            ma.q r5 = r0.f20263f
            com.google.android.exoplayer2.metadata.Metadata r4 = r5.mo21601a(r1, r4)
            r0.f20269l = r4
            if (r4 == 0) goto L_0x0036
            ma.p r5 = r0.f20262e
            r5.mo21600b(r4)
        L_0x0036:
            long r4 = r18.mo21577f()
            int r5 = (int) r4
            if (r19 != 0) goto L_0x0042
            r1.mo21582i(r5)
            goto L_0x0042
        L_0x0041:
            r5 = 0
        L_0x0042:
            r4 = 0
            r6 = 0
            r7 = 0
        L_0x0045:
            boolean r10 = r17.mo22600e(r18)
            if (r10 == 0) goto L_0x0054
            if (r6 <= 0) goto L_0x004e
            goto L_0x00a8
        L_0x004e:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L_0x0054:
            ub.r r10 = r0.f20260c
            r10.mo23007z(r3)
            ub.r r10 = r0.f20260c
            int r10 = r10.mo22984c()
            if (r4 == 0) goto L_0x0074
            long r11 = (long) r4
            r13 = -128000(0xfffffffffffe0c00, float:NaN)
            r13 = r13 & r10
            long r13 = (long) r13
            r15 = -128000(0xfffffffffffe0c00, double:NaN)
            long r11 = r11 & r15
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 != 0) goto L_0x0071
            r11 = 1
            goto L_0x0072
        L_0x0071:
            r11 = 0
        L_0x0072:
            if (r11 == 0) goto L_0x007b
        L_0x0074:
            int r11 = p125ia.C5329o.m13362a(r10)
            r12 = -1
            if (r11 != r12) goto L_0x009b
        L_0x007b:
            int r4 = r7 + 1
            if (r7 != r2) goto L_0x008a
            if (r19 == 0) goto L_0x0082
            return r3
        L_0x0082:
            com.google.android.exoplayer2.ParserException r1 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "Searched too many bytes."
            r1.<init>((java.lang.String) r2)
            throw r1
        L_0x008a:
            if (r19 == 0) goto L_0x0094
            r1.f18593f = r3
            int r6 = r5 + r4
            r1.mo21584k(r6, r3)
            goto L_0x0097
        L_0x0094:
            r1.mo21582i(r9)
        L_0x0097:
            r7 = r4
            r4 = 0
            r6 = 0
            goto L_0x0045
        L_0x009b:
            int r6 = r6 + 1
            if (r6 != r9) goto L_0x00a6
            ia.o$a r4 = r0.f20261d
            r4.mo21110a(r10)
            r4 = r10
            goto L_0x00b4
        L_0x00a6:
            if (r6 != r8) goto L_0x00b4
        L_0x00a8:
            if (r19 == 0) goto L_0x00af
            int r5 = r5 + r7
            r1.mo21582i(r5)
            goto L_0x00b1
        L_0x00af:
            r1.f18593f = r3
        L_0x00b1:
            r0.f20268k = r4
            return r9
        L_0x00b4:
            int r11 = r11 + -4
            r1.mo21584k(r11, r3)
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: p251sa.C6496d.mo22601f(ma.e, boolean):boolean");
    }

    /* renamed from: g */
    public final void mo21594g(C5737j jVar) {
        this.f20265h = jVar;
        C5754v p = jVar.mo20709p(0, 1);
        this.f20266i = p;
        this.f20267j = p;
        this.f20265h.mo20708n();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: sa.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: sa.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: sa.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: sa.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: sa.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: sa.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v38, resolved type: sa.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v42, resolved type: sa.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v35, resolved type: sa.f} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v52, resolved type: sa.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: sa.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v54, resolved type: sa.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v55, resolved type: sa.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v24, resolved type: sa.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v56, resolved type: sa.e$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v57, resolved type: sa.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v58, resolved type: sa.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v59, resolved type: sa.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v60, resolved type: sa.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v61, resolved type: sa.f} */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0294, code lost:
        if (r0 == null) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0297, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02a5, code lost:
        if ((r1.f20258a & 1) != 0) goto L_0x02a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        if (r10 != 1231971951) goto L_0x006c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x030f  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x040a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0085 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01e5  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01fa  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo21595h(p173ma.C5736i r34, p173ma.C5749s r35) throws java.io.IOException {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            ma.v r2 = r0.f20266i
            p583jk.C17875h.m44306q(r2)
            int r2 = p277ub.C6774a0.f20959a
            int r2 = r0.f20268k
            r3 = 1000000(0xf4240, double:4.940656E-318)
            r6 = 0
            if (r2 != 0) goto L_0x001e
            r2 = r1
            ma.e r2 = (p173ma.C5732e) r2     // Catch:{ EOFException -> 0x001a }
            r0.mo22601f(r2, r6)     // Catch:{ EOFException -> 0x001a }
            goto L_0x001e
        L_0x001a:
            r1 = r0
            goto L_0x03d3
        L_0x001e:
            sa.e r2 = r0.f20274q
            r9 = 1
            if (r2 != 0) goto L_0x02ef
            ub.r r2 = new ub.r
            ia.o$a r10 = r0.f20261d
            int r10 = r10.f17561c
            r2.<init>((int) r10)
            byte[] r10 = r2.f21038a
            ia.o$a r11 = r0.f20261d
            int r11 = r11.f17561c
            r12 = r1
            ma.e r12 = (p173ma.C5732e) r12
            r12.mo21583j(r6, r11, r10, r6)
            ia.o$a r10 = r0.f20261d
            int r11 = r10.f17559a
            r11 = r11 & r9
            r13 = 21
            r14 = 36
            if (r11 == 0) goto L_0x004a
            int r10 = r10.f17563e
            if (r10 == r9) goto L_0x0051
            r13 = 36
            goto L_0x0051
        L_0x004a:
            int r10 = r10.f17563e
            if (r10 == r9) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r13 = 13
        L_0x0051:
            int r10 = r2.f21040c
            int r11 = r13 + 4
            r15 = 1483304551(0x58696e67, float:1.02664153E15)
            r7 = 1447187017(0x56425249, float:5.3414667E13)
            r8 = 1231971951(0x496e666f, float:976486.94)
            if (r10 < r11) goto L_0x006c
            r2.mo23007z(r13)
            int r10 = r2.mo22984c()
            if (r10 == r15) goto L_0x0080
            if (r10 != r8) goto L_0x006c
            goto L_0x0080
        L_0x006c:
            int r10 = r2.f21040c
            r11 = 40
            if (r10 < r11) goto L_0x007f
            r2.mo23007z(r14)
            int r10 = r2.mo22984c()
            if (r10 != r7) goto L_0x007f
            r10 = 1447187017(0x56425249, float:5.3414667E13)
            goto L_0x0080
        L_0x007f:
            r10 = 0
        L_0x0080:
            r14 = 2
            r16 = 0
            if (r10 == r15) goto L_0x0134
            if (r10 != r8) goto L_0x0089
            goto L_0x0134
        L_0x0089:
            if (r10 != r7) goto L_0x012b
            long r7 = r12.f18591d
            ia.o$a r10 = r0.f20261d
            r13 = 10
            r2.mo22981A(r13)
            int r13 = r2.mo22984c()
            if (r13 > 0) goto L_0x009d
            r23 = r12
            goto L_0x00eb
        L_0x009d:
            int r15 = r10.f17562d
            long r5 = (long) r13
            r13 = 32000(0x7d00, float:4.4842E-41)
            if (r15 < r13) goto L_0x00a7
            r13 = 1152(0x480, float:1.614E-42)
            goto L_0x00a9
        L_0x00a7:
            r13 = 576(0x240, float:8.07E-43)
        L_0x00a9:
            r23 = r12
            long r11 = (long) r13
            long r19 = r11 * r3
            long r11 = (long) r15
            r17 = r5
            r21 = r11
            long r27 = p277ub.C6774a0.m15939A(r17, r19, r21)
            int r5 = r2.mo23002u()
            int r6 = r2.mo23002u()
            int r11 = r2.mo23002u()
            r2.mo22981A(r14)
            int r10 = r10.f17561c
            long r12 = (long) r10
            long r12 = r12 + r7
            long[] r10 = new long[r5]
            long[] r15 = new long[r5]
            r3 = r7
            r7 = 0
        L_0x00d0:
            if (r7 >= r5) goto L_0x0110
            r8 = r15
            long r14 = (long) r7
            long r14 = r14 * r27
            long r0 = (long) r5
            long r14 = r14 / r0
            r10[r7] = r14
            long r0 = java.lang.Math.max(r3, r12)
            r8[r7] = r0
            if (r11 == r9) goto L_0x00ff
            r0 = 2
            if (r11 == r0) goto L_0x00fa
            r0 = 3
            if (r11 == r0) goto L_0x00f5
            r0 = 4
            if (r11 == r0) goto L_0x00f0
        L_0x00eb:
            r1 = r33
            r0 = r16
            goto L_0x0120
        L_0x00f0:
            int r0 = r2.mo23000s()
            goto L_0x0103
        L_0x00f5:
            int r0 = r2.mo22999r()
            goto L_0x0103
        L_0x00fa:
            int r0 = r2.mo23002u()
            goto L_0x0103
        L_0x00ff:
            int r0 = r2.mo22997p()
        L_0x0103:
            int r0 = r0 * r6
            long r0 = (long) r0
            long r3 = r3 + r0
            int r7 = r7 + 1
            r14 = 2
            r0 = r33
            r1 = r34
            r15 = r8
            goto L_0x00d0
        L_0x0110:
            r8 = r15
            sa.f r0 = new sa.f
            r24 = r0
            r25 = r10
            r26 = r8
            r29 = r3
            r24.<init>(r25, r26, r27, r29)
            r1 = r33
        L_0x0120:
            ia.o$a r2 = r1.f20261d
            int r2 = r2.f17561c
            r3 = r23
            r3.mo21582i(r2)
            goto L_0x01f4
        L_0x012b:
            r1 = r0
            r3 = r12
            r0 = 0
            r3.f18593f = r0
            r0 = r16
            goto L_0x01f4
        L_0x0134:
            r1 = r0
            r3 = r12
            long r4 = r3.f18591d
            ia.o$a r0 = r1.f20261d
            int r6 = r0.f17565g
            int r7 = r0.f17562d
            int r11 = r2.mo22984c()
            r12 = r11 & 1
            if (r12 != r9) goto L_0x019a
            int r12 = r2.mo23000s()
            if (r12 != 0) goto L_0x014d
            goto L_0x019a
        L_0x014d:
            long r14 = (long) r12
            long r8 = (long) r6
            r17 = 1000000(0xf4240, double:4.940656E-318)
            long r26 = r8 * r17
            long r6 = (long) r7
            r24 = r14
            r28 = r6
            long r28 = p277ub.C6774a0.m15939A(r24, r26, r28)
            r6 = 6
            r7 = r11 & 6
            if (r7 == r6) goto L_0x0175
            sa.g r2 = new sa.g
            int r0 = r0.f17561c
            r30 = -1
            r32 = 0
            r24 = r2
            r25 = r4
            r27 = r0
            r24.<init>(r25, r27, r28, r30, r32)
        L_0x0173:
            r0 = r2
            goto L_0x019c
        L_0x0175:
            long r30 = r2.mo22998q()
            r6 = 100
            long[] r7 = new long[r6]
            r8 = 0
        L_0x017e:
            if (r8 >= r6) goto L_0x018a
            int r9 = r2.mo22997p()
            long r14 = (long) r9
            r7[r8] = r14
            int r8 = r8 + 1
            goto L_0x017e
        L_0x018a:
            sa.g r2 = new sa.g
            int r0 = r0.f17561c
            r24 = r2
            r25 = r4
            r27 = r0
            r32 = r7
            r24.<init>(r25, r27, r28, r30, r32)
            goto L_0x0173
        L_0x019a:
            r0 = r16
        L_0x019c:
            if (r0 == 0) goto L_0x01dc
            ma.p r2 = r1.f20262e
            int r4 = r2.f18617a
            r5 = -1
            if (r4 == r5) goto L_0x01ab
            int r2 = r2.f18618b
            if (r2 == r5) goto L_0x01ab
            r2 = 1
            goto L_0x01ac
        L_0x01ab:
            r2 = 0
        L_0x01ac:
            if (r2 != 0) goto L_0x01dc
            r2 = 0
            r3.f18593f = r2
            int r13 = r13 + 141
            r3.mo21584k(r13, r2)
            ub.r r4 = r1.f20260c
            byte[] r4 = r4.f21038a
            r5 = 3
            r3.mo21583j(r2, r5, r4, r2)
            ub.r r4 = r1.f20260c
            r4.mo23007z(r2)
            ma.p r2 = r1.f20262e
            ub.r r4 = r1.f20260c
            int r4 = r4.mo22999r()
            int r5 = r4 >> 12
            r4 = r4 & 4095(0xfff, float:5.738E-42)
            if (r5 > 0) goto L_0x01d8
            if (r4 <= 0) goto L_0x01d4
            goto L_0x01d8
        L_0x01d4:
            r2.getClass()
            goto L_0x01dc
        L_0x01d8:
            r2.f18617a = r5
            r2.f18618b = r4
        L_0x01dc:
            ia.o$a r2 = r1.f20261d
            int r2 = r2.f17561c
            r3.mo21582i(r2)
            if (r0 == 0) goto L_0x01f4
            boolean r2 = r0.mo21570e()
            if (r2 != 0) goto L_0x01f4
            r2 = 1231971951(0x496e666f, float:976486.94)
            if (r10 != r2) goto L_0x01f4
            sa.a r0 = r1.mo22599c(r3)
        L_0x01f4:
            com.google.android.exoplayer2.metadata.Metadata r2 = r1.f20269l
            long r4 = r3.f18591d
            if (r2 == 0) goto L_0x0251
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r6 = r2.f13864b
            int r6 = r6.length
            r7 = 0
        L_0x01fe:
            if (r7 >= r6) goto L_0x0251
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r8 = r2.f13864b
            r8 = r8[r7]
            boolean r9 = r8 instanceof com.google.android.exoplayer2.metadata.id3.MlltFrame
            if (r9 == 0) goto L_0x024c
            com.google.android.exoplayer2.metadata.id3.MlltFrame r8 = (com.google.android.exoplayer2.metadata.id3.MlltFrame) r8
            long r6 = m15396d(r2)
            int[] r2 = r8.f13934f
            int r2 = r2.length
            int r9 = r2 + 1
            long[] r10 = new long[r9]
            long[] r9 = new long[r9]
            r11 = 0
            r10[r11] = r4
            r13 = 0
            r9[r11] = r13
            r11 = 1
            r13 = 0
        L_0x0221:
            if (r11 > r2) goto L_0x0244
            int r15 = r8.f13932d
            int[] r12 = r8.f13934f
            int r21 = r11 + -1
            r12 = r12[r21]
            int r15 = r15 + r12
            r12 = r2
            r23 = r3
            long r2 = (long) r15
            long r4 = r4 + r2
            int r2 = r8.f13933e
            int[] r3 = r8.f13935g
            r3 = r3[r21]
            int r2 = r2 + r3
            long r2 = (long) r2
            long r13 = r13 + r2
            r10[r11] = r4
            r9[r11] = r13
            int r11 = r11 + 1
            r2 = r12
            r3 = r23
            goto L_0x0221
        L_0x0244:
            r23 = r3
            sa.c r2 = new sa.c
            r2.<init>(r10, r9, r6)
            goto L_0x0255
        L_0x024c:
            r23 = r3
            int r7 = r7 + 1
            goto L_0x01fe
        L_0x0251:
            r23 = r3
            r2 = r16
        L_0x0255:
            boolean r3 = r1.f20275r
            if (r3 == 0) goto L_0x0261
            sa.e$a r0 = new sa.e$a
            r0.<init>()
            r3 = r23
            goto L_0x02ab
        L_0x0261:
            int r3 = r1.f20258a
            r4 = 2
            r3 = r3 & r4
            if (r3 == 0) goto L_0x028e
            r3 = -1
            if (r2 == 0) goto L_0x026e
            long r5 = r2.f20256c
            goto L_0x0281
        L_0x026e:
            if (r0 == 0) goto L_0x027b
            long r2 = r0.mo21571i()
            long r4 = r0.mo22596d()
            r8 = r2
            r12 = r4
            goto L_0x0283
        L_0x027b:
            com.google.android.exoplayer2.metadata.Metadata r0 = r1.f20269l
            long r5 = m15396d(r0)
        L_0x0281:
            r12 = r3
            r8 = r5
        L_0x0283:
            sa.b r0 = new sa.b
            r3 = r23
            long r10 = r3.f18591d
            r7 = r0
            r7.<init>(r8, r10, r12)
            goto L_0x0299
        L_0x028e:
            r3 = r23
            if (r2 == 0) goto L_0x0294
            r0 = r2
            goto L_0x0299
        L_0x0294:
            if (r0 == 0) goto L_0x0297
            goto L_0x0299
        L_0x0297:
            r0 = r16
        L_0x0299:
            if (r0 == 0) goto L_0x02a7
            boolean r2 = r0.mo21570e()
            if (r2 != 0) goto L_0x02ab
            int r2 = r1.f20258a
            r4 = 1
            r2 = r2 & r4
            if (r2 == 0) goto L_0x02ab
        L_0x02a7:
            sa.a r0 = r1.mo22599c(r3)
        L_0x02ab:
            r1.f20274q = r0
            ma.j r2 = r1.f20265h
            r2.mo20707k(r0)
            ma.v r0 = r1.f20267j
            com.google.android.exoplayer2.Format$b r2 = new com.google.android.exoplayer2.Format$b
            r2.<init>()
            ia.o$a r4 = r1.f20261d
            java.lang.String r5 = r4.f17560b
            r2.f13446k = r5
            r5 = 4096(0x1000, float:5.74E-42)
            r2.f13447l = r5
            int r5 = r4.f17563e
            r2.f13459x = r5
            int r4 = r4.f17562d
            r2.f13460y = r4
            ma.p r4 = r1.f20262e
            int r5 = r4.f18617a
            r2.f13432A = r5
            int r4 = r4.f18618b
            r2.f13433B = r4
            int r4 = r1.f20258a
            r5 = 4
            r4 = r4 & r5
            if (r4 == 0) goto L_0x02de
            r4 = r16
            goto L_0x02e0
        L_0x02de:
            com.google.android.exoplayer2.metadata.Metadata r4 = r1.f20269l
        L_0x02e0:
            r2.f13444i = r4
            com.google.android.exoplayer2.Format r4 = new com.google.android.exoplayer2.Format
            r4.<init>((com.google.android.exoplayer2.Format.C3872b) r2)
            r0.mo20632c(r4)
            long r2 = r3.f18591d
            r1.f20272o = r2
            goto L_0x0309
        L_0x02ef:
            r1 = r0
            long r2 = r1.f20272o
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0309
            r0 = r34
            r4 = r0
            ma.e r4 = (p173ma.C5732e) r4
            long r5 = r4.f18591d
            int r7 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r7 >= 0) goto L_0x030b
            long r2 = r2 - r5
            int r3 = (int) r2
            r4.mo21582i(r3)
            goto L_0x030b
        L_0x0309:
            r0 = r34
        L_0x030b:
            int r2 = r1.f20273p
            if (r2 != 0) goto L_0x03c7
            r2 = r0
            ma.e r2 = (p173ma.C5732e) r2
            r3 = 0
            r2.f18593f = r3
            boolean r4 = r1.mo22600e(r2)
            if (r4 == 0) goto L_0x031d
            goto L_0x03d3
        L_0x031d:
            ub.r r4 = r1.f20260c
            r4.mo23007z(r3)
            ub.r r3 = r1.f20260c
            int r3 = r3.mo22984c()
            int r4 = r1.f20268k
            long r4 = (long) r4
            r6 = -128000(0xfffffffffffe0c00, float:NaN)
            r6 = r6 & r3
            long r6 = (long) r6
            r8 = -128000(0xfffffffffffe0c00, double:NaN)
            long r4 = r4 & r8
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 != 0) goto L_0x033a
            r4 = 1
            goto L_0x033b
        L_0x033a:
            r4 = 0
        L_0x033b:
            if (r4 == 0) goto L_0x03bf
            int r4 = p125ia.C5329o.m13362a(r3)
            r5 = -1
            if (r4 != r5) goto L_0x0346
            goto L_0x03bf
        L_0x0346:
            ia.o$a r4 = r1.f20261d
            r4.mo21110a(r3)
            long r3 = r1.f20270m
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0376
            sa.e r3 = r1.f20274q
            long r7 = r2.f18591d
            long r3 = r3.mo22597f(r7)
            r1.f20270m = r3
            long r3 = r1.f20259b
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0376
            sa.e r3 = r1.f20274q
            r4 = 0
            long r3 = r3.mo22597f(r4)
            long r5 = r1.f20270m
            long r7 = r1.f20259b
            long r7 = r7 - r3
            long r7 = r7 + r5
            r1.f20270m = r7
        L_0x0376:
            ia.o$a r3 = r1.f20261d
            int r4 = r3.f17561c
            r1.f20273p = r4
            sa.e r5 = r1.f20274q
            boolean r6 = r5 instanceof p251sa.C6494b
            if (r6 == 0) goto L_0x03c7
            sa.b r5 = (p251sa.C6494b) r5
            long r6 = r1.f20271n
            int r8 = r3.f17565g
            long r8 = (long) r8
            long r6 = r6 + r8
            long r8 = r1.f20270m
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 * r10
            int r3 = r3.f17562d
            long r10 = (long) r3
            long r6 = r6 / r10
            long r6 = r6 + r8
            long r2 = r2.f18591d
            long r8 = (long) r4
            long r2 = r2 + r8
            boolean r4 = r5.mo22598a(r6)
            if (r4 == 0) goto L_0x03a1
            goto L_0x03ab
        L_0x03a1:
            ub.l r4 = r5.f20251b
            r4.mo22963a(r6)
            ub.l r4 = r5.f20252c
            r4.mo22963a(r2)
        L_0x03ab:
            boolean r2 = r1.f20276s
            if (r2 == 0) goto L_0x03c7
            long r2 = r1.f20277t
            boolean r2 = r5.mo22598a(r2)
            if (r2 == 0) goto L_0x03c7
            r3 = 0
            r1.f20276s = r3
            ma.v r2 = r1.f20266i
            r1.f20267j = r2
            goto L_0x03c7
        L_0x03bf:
            r3 = 0
            r4 = 1
            r2.mo21582i(r4)
            r1.f20268k = r3
            goto L_0x03dd
        L_0x03c7:
            r4 = 1
            ma.v r2 = r1.f20267j
            int r3 = r1.f20273p
            int r0 = r2.mo20630a(r0, r3, r4)
            r2 = -1
            if (r0 != r2) goto L_0x03d6
        L_0x03d3:
            r0 = -1
            r6 = -1
            goto L_0x0408
        L_0x03d6:
            int r2 = r1.f20273p
            int r2 = r2 - r0
            r1.f20273p = r2
            if (r2 <= 0) goto L_0x03df
        L_0x03dd:
            r0 = 0
            goto L_0x0406
        L_0x03df:
            ma.v r3 = r1.f20267j
            long r4 = r1.f20271n
            long r6 = r1.f20270m
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r8
            ia.o$a r0 = r1.f20261d
            int r2 = r0.f17562d
            long r8 = (long) r2
            long r4 = r4 / r8
            long r4 = r4 + r6
            r6 = 1
            int r7 = r0.f17561c
            r8 = 0
            r9 = 0
            r3.mo20633d(r4, r6, r7, r8, r9)
            long r2 = r1.f20271n
            ia.o$a r0 = r1.f20261d
            int r0 = r0.f17565g
            long r4 = (long) r0
            long r2 = r2 + r4
            r1.f20271n = r2
            r0 = 0
            r1.f20273p = r0
        L_0x0406:
            r0 = -1
            r6 = 0
        L_0x0408:
            if (r6 != r0) goto L_0x0434
            sa.e r0 = r1.f20274q
            boolean r2 = r0 instanceof p251sa.C6494b
            if (r2 == 0) goto L_0x0434
            long r2 = r1.f20271n
            long r4 = r1.f20270m
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r7
            ia.o$a r7 = r1.f20261d
            int r7 = r7.f17562d
            long r7 = (long) r7
            long r2 = r2 / r7
            long r2 = r2 + r4
            long r4 = r0.mo21571i()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0434
            sa.e r0 = r1.f20274q
            r4 = r0
            sa.b r4 = (p251sa.C6494b) r4
            r4.f20253d = r2
            ma.j r2 = r1.f20265h
            r2.mo20707k(r0)
        L_0x0434:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p251sa.C6496d.mo21595h(ma.i, ma.s):int");
    }

    public final void release() {
    }

    public C6496d(int i) {
        this.f20258a = 0;
        this.f20259b = -9223372036854775807L;
        this.f20260c = new C6803r(10);
        this.f20261d = new C5329o.C5330a();
        this.f20262e = new C5746p();
        this.f20270m = -9223372036854775807L;
        this.f20263f = new C5747q();
        C5734g gVar = new C5734g();
        this.f20264g = gVar;
        this.f20267j = gVar;
    }
}
