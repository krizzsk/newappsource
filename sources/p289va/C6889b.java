package p289va;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Format;
import p173ma.C5737j;
import p173ma.C5754v;
import p277ub.C6802q;
import p277ub.C6803r;
import p289va.C6896d0;

/* renamed from: va.b */
public final class C6889b implements C6907j {

    /* renamed from: a */
    public final C6802q f21255a;

    /* renamed from: b */
    public final C6803r f21256b;

    /* renamed from: c */
    public final String f21257c;

    /* renamed from: d */
    public String f21258d;

    /* renamed from: e */
    public C5754v f21259e;

    /* renamed from: f */
    public int f21260f = 0;

    /* renamed from: g */
    public int f21261g;

    /* renamed from: h */
    public boolean f21262h;

    /* renamed from: i */
    public long f21263i;

    /* renamed from: j */
    public Format f21264j;

    /* renamed from: k */
    public int f21265k;

    /* renamed from: l */
    public long f21266l;

    public C6889b(String str) {
        C6802q qVar = new C6802q(new byte[RecyclerView.C1119a0.FLAG_IGNORE], RecyclerView.C1119a0.FLAG_IGNORE);
        this.f21255a = qVar;
        this.f21256b = new C6803r(qVar.f21034a);
        this.f21257c = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0218  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23139b(p277ub.C6803r r23) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            ma.v r2 = r0.f21259e
            p583jk.C17875h.m44306q(r2)
        L_0x0009:
            int r2 = r1.f21040c
            int r3 = r1.f21039b
            int r2 = r2 - r3
            if (r2 <= 0) goto L_0x037d
            int r3 = r0.f21260f
            r4 = 11
            r5 = 0
            r6 = 1
            r7 = 2
            if (r3 == 0) goto L_0x033d
            if (r3 == r6) goto L_0x0049
            if (r3 == r7) goto L_0x001e
            goto L_0x0009
        L_0x001e:
            int r3 = r0.f21265k
            int r4 = r0.f21261g
            int r3 = r3 - r4
            int r2 = java.lang.Math.min(r2, r3)
            ma.v r3 = r0.f21259e
            r3.mo20631b(r2, r1)
            int r3 = r0.f21261g
            int r3 = r3 + r2
            r0.f21261g = r3
            int r10 = r0.f21265k
            if (r3 != r10) goto L_0x0009
            ma.v r6 = r0.f21259e
            long r7 = r0.f21266l
            r9 = 1
            r11 = 0
            r12 = 0
            r6.mo20633d(r7, r9, r10, r11, r12)
            long r2 = r0.f21266l
            long r6 = r0.f21263i
            long r2 = r2 + r6
            r0.f21266l = r2
            r0.f21260f = r5
            goto L_0x0009
        L_0x0049:
            ub.r r3 = r0.f21256b
            byte[] r3 = r3.f21038a
            int r8 = r0.f21261g
            r9 = 128(0x80, float:1.794E-43)
            int r8 = 128 - r8
            int r2 = java.lang.Math.min(r2, r8)
            int r8 = r0.f21261g
            r1.mo22983b(r8, r2, r3)
            int r3 = r0.f21261g
            int r3 = r3 + r2
            r0.f21261g = r3
            if (r3 != r9) goto L_0x0065
            r2 = 1
            goto L_0x0066
        L_0x0065:
            r2 = 0
        L_0x0066:
            if (r2 == 0) goto L_0x0009
            ub.q r2 = r0.f21255a
            r2.mo22977j(r5)
            ub.q r2 = r0.f21255a
            int r3 = r2.f21035b
            r8 = 8
            int r3 = r3 * 8
            int r10 = r2.f21036c
            int r3 = r3 + r10
            r10 = 40
            r2.mo22979l(r10)
            r10 = 5
            int r11 = r2.mo22973f(r10)
            r12 = 10
            if (r11 <= r12) goto L_0x0088
            r11 = 1
            goto L_0x0089
        L_0x0088:
            r11 = 0
        L_0x0089:
            r2.mo22977j(r3)
            r3 = -1
            r13 = 3
            if (r11 == 0) goto L_0x0295
            r11 = 16
            r2.mo22979l(r11)
            int r15 = r2.mo22973f(r7)
            if (r15 == 0) goto L_0x00a4
            if (r15 == r6) goto L_0x00a2
            if (r15 == r7) goto L_0x00a0
            goto L_0x00a5
        L_0x00a0:
            r3 = 2
            goto L_0x00a5
        L_0x00a2:
            r3 = 1
            goto L_0x00a5
        L_0x00a4:
            r3 = 0
        L_0x00a5:
            r2.mo22979l(r13)
            int r4 = r2.mo22973f(r4)
            int r4 = r4 + r6
            int r4 = r4 * 2
            int r15 = r2.mo22973f(r7)
            if (r15 != r13) goto L_0x00c0
            int[] r16 = p125ia.C5313b.f17503c
            int r17 = r2.mo22973f(r7)
            r16 = r16[r17]
            r5 = 6
            r9 = 3
            goto L_0x00d2
        L_0x00c0:
            int r16 = r2.mo22973f(r7)
            int[] r17 = p125ia.C5313b.f17501a
            r17 = r17[r16]
            int[] r18 = p125ia.C5313b.f17502b
            r18 = r18[r15]
            r9 = r16
            r5 = r17
            r16 = r18
        L_0x00d2:
            int r14 = r5 * 256
            int r7 = r2.mo22973f(r13)
            boolean r20 = r2.mo22972e()
            int[] r21 = p125ia.C5313b.f17504d
            r21 = r21[r7]
            int r21 = r21 + r20
            r2.mo22979l(r12)
            boolean r12 = r2.mo22972e()
            if (r12 == 0) goto L_0x00ee
            r2.mo22979l(r8)
        L_0x00ee:
            if (r7 != 0) goto L_0x00fc
            r2.mo22979l(r10)
            boolean r12 = r2.mo22972e()
            if (r12 == 0) goto L_0x00fc
            r2.mo22979l(r8)
        L_0x00fc:
            if (r3 != r6) goto L_0x0107
            boolean r12 = r2.mo22972e()
            if (r12 == 0) goto L_0x0107
            r2.mo22979l(r11)
        L_0x0107:
            boolean r11 = r2.mo22972e()
            r12 = 4
            if (r11 == 0) goto L_0x022d
            r11 = 2
            if (r7 <= r11) goto L_0x0114
            r2.mo22979l(r11)
        L_0x0114:
            r19 = r7 & 1
            if (r19 == 0) goto L_0x011f
            if (r7 <= r11) goto L_0x011f
            r11 = 6
            r2.mo22979l(r11)
            goto L_0x0120
        L_0x011f:
            r11 = 6
        L_0x0120:
            r18 = r7 & 4
            if (r18 == 0) goto L_0x0127
            r2.mo22979l(r11)
        L_0x0127:
            if (r20 == 0) goto L_0x0132
            boolean r11 = r2.mo22972e()
            if (r11 == 0) goto L_0x0132
            r2.mo22979l(r10)
        L_0x0132:
            if (r3 != 0) goto L_0x022d
            boolean r11 = r2.mo22972e()
            if (r11 == 0) goto L_0x013f
            r11 = 6
            r2.mo22979l(r11)
            goto L_0x0140
        L_0x013f:
            r11 = 6
        L_0x0140:
            if (r7 != 0) goto L_0x014b
            boolean r18 = r2.mo22972e()
            if (r18 == 0) goto L_0x014b
            r2.mo22979l(r11)
        L_0x014b:
            boolean r18 = r2.mo22972e()
            if (r18 == 0) goto L_0x0154
            r2.mo22979l(r11)
        L_0x0154:
            r11 = 2
            int r8 = r2.mo22973f(r11)
            if (r8 != r6) goto L_0x0161
            r2.mo22979l(r10)
        L_0x015e:
            r6 = 2
            goto L_0x01fa
        L_0x0161:
            if (r8 != r11) goto L_0x0169
            r8 = 12
            r2.mo22979l(r8)
            goto L_0x015e
        L_0x0169:
            if (r8 != r13) goto L_0x015e
            int r8 = r2.mo22973f(r10)
            boolean r11 = r2.mo22972e()
            if (r11 == 0) goto L_0x01cf
            r2.mo22979l(r10)
            boolean r11 = r2.mo22972e()
            if (r11 == 0) goto L_0x0181
            r2.mo22979l(r12)
        L_0x0181:
            boolean r11 = r2.mo22972e()
            if (r11 == 0) goto L_0x018a
            r2.mo22979l(r12)
        L_0x018a:
            boolean r11 = r2.mo22972e()
            if (r11 == 0) goto L_0x0193
            r2.mo22979l(r12)
        L_0x0193:
            boolean r11 = r2.mo22972e()
            if (r11 == 0) goto L_0x019c
            r2.mo22979l(r12)
        L_0x019c:
            boolean r11 = r2.mo22972e()
            if (r11 == 0) goto L_0x01a5
            r2.mo22979l(r12)
        L_0x01a5:
            boolean r11 = r2.mo22972e()
            if (r11 == 0) goto L_0x01ae
            r2.mo22979l(r12)
        L_0x01ae:
            boolean r11 = r2.mo22972e()
            if (r11 == 0) goto L_0x01b7
            r2.mo22979l(r12)
        L_0x01b7:
            boolean r11 = r2.mo22972e()
            if (r11 == 0) goto L_0x01cf
            boolean r11 = r2.mo22972e()
            if (r11 == 0) goto L_0x01c6
            r2.mo22979l(r12)
        L_0x01c6:
            boolean r11 = r2.mo22972e()
            if (r11 == 0) goto L_0x01cf
            r2.mo22979l(r12)
        L_0x01cf:
            boolean r11 = r2.mo22972e()
            if (r11 == 0) goto L_0x01ee
            r2.mo22979l(r10)
            boolean r11 = r2.mo22972e()
            if (r11 == 0) goto L_0x01ee
            r11 = 7
            r2.mo22979l(r11)
            boolean r11 = r2.mo22972e()
            if (r11 == 0) goto L_0x01ee
            r11 = 8
            r2.mo22979l(r11)
            goto L_0x01f0
        L_0x01ee:
            r11 = 8
        L_0x01f0:
            r6 = 2
            int r8 = r8 + r6
            int r8 = r8 * 8
            r2.mo22979l(r8)
            r2.mo22970c()
        L_0x01fa:
            if (r7 >= r6) goto L_0x0212
            boolean r6 = r2.mo22972e()
            r8 = 14
            if (r6 == 0) goto L_0x0207
            r2.mo22979l(r8)
        L_0x0207:
            if (r7 != 0) goto L_0x0212
            boolean r6 = r2.mo22972e()
            if (r6 == 0) goto L_0x0212
            r2.mo22979l(r8)
        L_0x0212:
            boolean r6 = r2.mo22972e()
            if (r6 == 0) goto L_0x022d
            if (r9 != 0) goto L_0x021e
            r2.mo22979l(r10)
            goto L_0x022d
        L_0x021e:
            r6 = 0
        L_0x021f:
            if (r6 >= r5) goto L_0x022d
            boolean r8 = r2.mo22972e()
            if (r8 == 0) goto L_0x022a
            r2.mo22979l(r10)
        L_0x022a:
            int r6 = r6 + 1
            goto L_0x021f
        L_0x022d:
            boolean r5 = r2.mo22972e()
            if (r5 == 0) goto L_0x0260
            r2.mo22979l(r10)
            r5 = 2
            if (r7 != r5) goto L_0x023c
            r2.mo22979l(r12)
        L_0x023c:
            r6 = 6
            if (r7 < r6) goto L_0x0242
            r2.mo22979l(r5)
        L_0x0242:
            boolean r5 = r2.mo22972e()
            if (r5 == 0) goto L_0x024e
            r5 = 8
            r2.mo22979l(r5)
            goto L_0x0250
        L_0x024e:
            r5 = 8
        L_0x0250:
            if (r7 != 0) goto L_0x025b
            boolean r6 = r2.mo22972e()
            if (r6 == 0) goto L_0x025b
            r2.mo22979l(r5)
        L_0x025b:
            if (r15 >= r13) goto L_0x0260
            r2.mo22978k()
        L_0x0260:
            if (r3 != 0) goto L_0x0267
            if (r9 == r13) goto L_0x0267
            r2.mo22978k()
        L_0x0267:
            r5 = 2
            if (r3 != r5) goto L_0x0277
            if (r9 == r13) goto L_0x0272
            boolean r3 = r2.mo22972e()
            if (r3 == 0) goto L_0x0277
        L_0x0272:
            r3 = 6
            r2.mo22979l(r3)
            goto L_0x0278
        L_0x0277:
            r3 = 6
        L_0x0278:
            boolean r5 = r2.mo22972e()
            if (r5 == 0) goto L_0x0290
            int r3 = r2.mo22973f(r3)
            r5 = 1
            if (r3 != r5) goto L_0x0290
            r3 = 8
            int r2 = r2.mo22973f(r3)
            if (r2 != r5) goto L_0x0290
            java.lang.String r2 = "audio/eac3-joc"
            goto L_0x0292
        L_0x0290:
            java.lang.String r2 = "audio/eac3"
        L_0x0292:
            r3 = r16
            goto L_0x02e4
        L_0x0295:
            r4 = 32
            r2.mo22979l(r4)
            r4 = 2
            int r5 = r2.mo22973f(r4)
            if (r5 != r13) goto L_0x02a3
            r4 = 0
            goto L_0x02a5
        L_0x02a3:
            java.lang.String r4 = "audio/ac3"
        L_0x02a5:
            r6 = 6
            int r6 = r2.mo22973f(r6)
            int r6 = p125ia.C5313b.m13353a(r5, r6)
            r7 = 8
            r2.mo22979l(r7)
            int r7 = r2.mo22973f(r13)
            r8 = r7 & 1
            if (r8 == 0) goto L_0x02c3
            r8 = 1
            if (r7 == r8) goto L_0x02c3
            r8 = 2
            r2.mo22979l(r8)
            goto L_0x02c4
        L_0x02c3:
            r8 = 2
        L_0x02c4:
            r9 = r7 & 4
            if (r9 == 0) goto L_0x02cb
            r2.mo22979l(r8)
        L_0x02cb:
            if (r7 != r8) goto L_0x02d0
            r2.mo22979l(r8)
        L_0x02d0:
            int[] r8 = p125ia.C5313b.f17502b
            if (r5 >= r13) goto L_0x02d6
            r3 = r8[r5]
        L_0x02d6:
            boolean r2 = r2.mo22972e()
            int[] r5 = p125ia.C5313b.f17504d
            r5 = r5[r7]
            int r21 = r5 + r2
            r14 = 1536(0x600, float:2.152E-42)
            r2 = r4
            r4 = r6
        L_0x02e4:
            r5 = r21
            com.google.android.exoplayer2.Format r6 = r0.f21264j
            if (r6 == 0) goto L_0x02fa
            int r7 = r6.f13431z
            if (r5 != r7) goto L_0x02fa
            int r7 = r6.f13400A
            if (r3 != r7) goto L_0x02fa
            java.lang.String r6 = r6.f13418m
            boolean r6 = p277ub.C6774a0.m15941a(r2, r6)
            if (r6 != 0) goto L_0x0319
        L_0x02fa:
            com.google.android.exoplayer2.Format$b r6 = new com.google.android.exoplayer2.Format$b
            r6.<init>()
            java.lang.String r7 = r0.f21258d
            r6.f13436a = r7
            r6.f13446k = r2
            r6.f13459x = r5
            r6.f13460y = r3
            java.lang.String r2 = r0.f21257c
            r6.f13438c = r2
            com.google.android.exoplayer2.Format r2 = new com.google.android.exoplayer2.Format
            r2.<init>((com.google.android.exoplayer2.Format.C3872b) r6)
            r0.f21264j = r2
            ma.v r3 = r0.f21259e
            r3.mo20632c(r2)
        L_0x0319:
            r0.f21265k = r4
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = (long) r14
            long r4 = r4 * r2
            com.google.android.exoplayer2.Format r2 = r0.f21264j
            int r2 = r2.f13400A
            long r2 = (long) r2
            long r4 = r4 / r2
            r0.f21263i = r4
            ub.r r2 = r0.f21256b
            r3 = 0
            r2.mo23007z(r3)
            ma.v r2 = r0.f21259e
            ub.r r3 = r0.f21256b
            r4 = 128(0x80, float:1.794E-43)
            r2.mo20631b(r4, r3)
            r2 = 2
            r0.f21260f = r2
            goto L_0x0009
        L_0x033d:
            int r2 = r1.f21040c
            int r3 = r1.f21039b
            int r2 = r2 - r3
            r3 = 119(0x77, float:1.67E-43)
            if (r2 <= 0) goto L_0x0369
            boolean r2 = r0.f21262h
            if (r2 != 0) goto L_0x0356
            int r2 = r23.mo22997p()
            if (r2 != r4) goto L_0x0352
            r2 = 1
            goto L_0x0353
        L_0x0352:
            r2 = 0
        L_0x0353:
            r0.f21262h = r2
            goto L_0x033d
        L_0x0356:
            int r2 = r23.mo22997p()
            if (r2 != r3) goto L_0x0361
            r5 = 0
            r0.f21262h = r5
            r5 = 1
            goto L_0x036a
        L_0x0361:
            if (r2 != r4) goto L_0x0365
            r5 = 1
            goto L_0x0366
        L_0x0365:
            r5 = 0
        L_0x0366:
            r0.f21262h = r5
            goto L_0x033d
        L_0x0369:
            r5 = 0
        L_0x036a:
            if (r5 == 0) goto L_0x0009
            r2 = 1
            r0.f21260f = r2
            ub.r r5 = r0.f21256b
            byte[] r5 = r5.f21038a
            r6 = 0
            r5[r6] = r4
            r5[r2] = r3
            r2 = 2
            r0.f21261g = r2
            goto L_0x0009
        L_0x037d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p289va.C6889b.mo23139b(ub.r):void");
    }

    /* renamed from: c */
    public final void mo23140c() {
        this.f21260f = 0;
        this.f21261g = 0;
        this.f21262h = false;
    }

    /* renamed from: d */
    public final void mo23141d() {
    }

    /* renamed from: e */
    public final void mo23142e(int i, long j) {
        this.f21266l = j;
    }

    /* renamed from: f */
    public final void mo23143f(C5737j jVar, C6896d0.C6900d dVar) {
        dVar.mo23151a();
        dVar.mo23152b();
        this.f21258d = dVar.f21327e;
        dVar.mo23152b();
        this.f21259e = jVar.mo20709p(dVar.f21326d, 1);
    }
}
