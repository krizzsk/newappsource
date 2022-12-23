package p186na;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import p173ma.C5731d;
import p173ma.C5732e;
import p173ma.C5735h;
import p173ma.C5736i;
import p173ma.C5737j;
import p173ma.C5749s;
import p173ma.C5750t;
import p173ma.C5754v;
import p277ub.C6774a0;
import p583jk.C17875h;

/* renamed from: na.a */
public final class C5884a implements C5735h {

    /* renamed from: m */
    public static final int[] f18894m = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: n */
    public static final int[] f18895n;

    /* renamed from: o */
    public static final byte[] f18896o = C6774a0.m15961u("#!AMR\n");

    /* renamed from: p */
    public static final byte[] f18897p = C6774a0.m15961u("#!AMR-WB\n");

    /* renamed from: q */
    public static final int f18898q;

    /* renamed from: a */
    public final byte[] f18899a = new byte[1];

    /* renamed from: b */
    public boolean f18900b;

    /* renamed from: c */
    public long f18901c;

    /* renamed from: d */
    public int f18902d;

    /* renamed from: e */
    public int f18903e;

    /* renamed from: f */
    public boolean f18904f;

    /* renamed from: g */
    public int f18905g = -1;

    /* renamed from: h */
    public long f18906h;

    /* renamed from: i */
    public C5737j f18907i;

    /* renamed from: j */
    public C5754v f18908j;

    /* renamed from: k */
    public C5750t.C5752b f18909k;

    /* renamed from: l */
    public boolean f18910l;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f18895n = iArr;
        f18898q = iArr[8];
    }

    /* renamed from: a */
    public final void mo21592a(long j, long j2) {
        this.f18901c = 0;
        this.f18902d = 0;
        this.f18903e = 0;
        if (j != 0) {
            C5750t.C5752b bVar = this.f18909k;
            if (bVar instanceof C5731d) {
                C5731d dVar = (C5731d) bVar;
                this.f18906h = ((Math.max(0, j - dVar.f18583b) * 8) * 1000000) / ((long) dVar.f18586e);
                return;
            }
        }
        this.f18906h = 0;
    }

    /* renamed from: b */
    public final boolean mo21593b(C5736i iVar) throws IOException {
        return mo21758d((C5732e) iVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
        if (r1 != false) goto L_0x003a;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo21757c(p173ma.C5732e r5) throws java.io.IOException {
        /*
            r4 = this;
            r0 = 0
            r5.f18593f = r0
            byte[] r1 = r4.f18899a
            r2 = 1
            r5.mo21583j(r0, r2, r1, r0)
            byte[] r5 = r4.f18899a
            byte r5 = r5[r0]
            r1 = r5 & 131(0x83, float:1.84E-43)
            if (r1 > 0) goto L_0x0079
            int r5 = r5 >> 3
            r1 = 15
            r5 = r5 & r1
            if (r5 < 0) goto L_0x003b
            if (r5 > r1) goto L_0x003b
            boolean r1 = r4.f18900b
            if (r1 == 0) goto L_0x0028
            r2 = 10
            if (r5 < r2) goto L_0x0026
            r2 = 13
            if (r5 <= r2) goto L_0x0028
        L_0x0026:
            r2 = 1
            goto L_0x0029
        L_0x0028:
            r2 = 0
        L_0x0029:
            if (r2 != 0) goto L_0x003a
            if (r1 != 0) goto L_0x0037
            r1 = 12
            if (r5 < r1) goto L_0x0035
            r1 = 14
            if (r5 <= r1) goto L_0x0037
        L_0x0035:
            r1 = 1
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            if (r1 == 0) goto L_0x003b
        L_0x003a:
            r0 = 1
        L_0x003b:
            if (r0 != 0) goto L_0x006b
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            boolean r1 = r4.f18900b
            if (r1 == 0) goto L_0x0046
            java.lang.String r1 = "WB"
            goto L_0x0048
        L_0x0046:
            java.lang.String r1 = "NB"
        L_0x0048:
            int r2 = r1.length()
            int r2 = r2 + 35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            java.lang.String r2 = "Illegal AMR "
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = " frame type "
            r3.append(r1)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r0.<init>((java.lang.String) r5)
            throw r0
        L_0x006b:
            boolean r0 = r4.f18900b
            if (r0 == 0) goto L_0x0074
            int[] r0 = f18895n
            r5 = r0[r5]
            goto L_0x0078
        L_0x0074:
            int[] r0 = f18894m
            r5 = r0[r5]
        L_0x0078:
            return r5
        L_0x0079:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            r1 = 42
            java.lang.String r2 = "Invalid padding bits for frame header "
            java.lang.String r5 = p379.C13715c.m34241g(r1, r2, r5)
            r0.<init>((java.lang.String) r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p186na.C5884a.mo21757c(ma.e):int");
    }

    /* renamed from: d */
    public final boolean mo21758d(C5732e eVar) throws IOException {
        byte[] bArr = f18896o;
        eVar.f18593f = 0;
        byte[] bArr2 = new byte[bArr.length];
        eVar.mo21583j(0, bArr.length, bArr2, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f18900b = false;
            eVar.mo21582i(bArr.length);
            return true;
        }
        byte[] bArr3 = f18897p;
        eVar.f18593f = 0;
        byte[] bArr4 = new byte[bArr3.length];
        eVar.mo21583j(0, bArr3.length, bArr4, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f18900b = true;
        eVar.mo21582i(bArr3.length);
        return true;
    }

    /* renamed from: g */
    public final void mo21594g(C5737j jVar) {
        this.f18907i = jVar;
        this.f18908j = jVar.mo20709p(0, 1);
        jVar.mo20708n();
    }

    /* renamed from: h */
    public final int mo21595h(C5736i iVar, C5749s sVar) throws IOException {
        String str;
        int i;
        C17875h.m44306q(this.f18908j);
        int i2 = C6774a0.f20959a;
        C5732e eVar = (C5732e) iVar;
        if (eVar.f18591d != 0 || mo21758d(eVar)) {
            if (!this.f18910l) {
                this.f18910l = true;
                boolean z = this.f18900b;
                if (z) {
                    str = "audio/amr-wb";
                } else {
                    str = "audio/3gpp";
                }
                if (z) {
                    i = 16000;
                } else {
                    i = ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED;
                }
                C5754v vVar = this.f18908j;
                Format.C3872b bVar = new Format.C3872b();
                bVar.f13446k = str;
                bVar.f13447l = f18898q;
                bVar.f13459x = 1;
                bVar.f13460y = i;
                vVar.mo20632c(new Format(bVar));
            }
            int i3 = -1;
            if (this.f18903e == 0) {
                try {
                    int c = mo21757c((C5732e) iVar);
                    this.f18902d = c;
                    this.f18903e = c;
                    if (this.f18905g == -1) {
                        this.f18905g = c;
                    }
                } catch (EOFException unused) {
                }
            }
            int a = this.f18908j.mo20630a(iVar, this.f18903e, true);
            if (a != -1) {
                int i4 = this.f18903e - a;
                this.f18903e = i4;
                if (i4 <= 0) {
                    this.f18908j.mo20633d(this.f18901c + this.f18906h, 1, this.f18902d, 0, (C5754v.C5755a) null);
                    this.f18901c += 20000;
                }
                i3 = 0;
            }
            if (!this.f18904f) {
                C5750t.C5752b bVar2 = new C5750t.C5752b(-9223372036854775807L);
                this.f18909k = bVar2;
                this.f18907i.mo20707k(bVar2);
                this.f18904f = true;
            }
            return i3;
        }
        throw new ParserException("Could not find AMR header.");
    }

    public final void release() {
    }
}
