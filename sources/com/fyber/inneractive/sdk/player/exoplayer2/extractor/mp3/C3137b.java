package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.C3230l;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3080f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3120j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3122k;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3124m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3161n;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.C3243a;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C3258g;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import p988j$.util.Spliterator;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b */
public final class C3137b implements C3080f {

    /* renamed from: m */
    public static final int f10939m = C3406u.m8589a("Xing");

    /* renamed from: n */
    public static final int f10940n = C3406u.m8589a("Info");

    /* renamed from: o */
    public static final int f10941o = C3406u.m8589a("VBRI");

    /* renamed from: a */
    public final long f10942a;

    /* renamed from: b */
    public final C3393k f10943b = new C3393k(10);

    /* renamed from: c */
    public final C3122k f10944c = new C3122k();

    /* renamed from: d */
    public final C3120j f10945d = new C3120j();

    /* renamed from: e */
    public C3088h f10946e;

    /* renamed from: f */
    public C3161n f10947f;

    /* renamed from: g */
    public int f10948g;

    /* renamed from: h */
    public C3243a f10949h;

    /* renamed from: i */
    public C3138a f10950i;

    /* renamed from: j */
    public long f10951j = -9223372036854775807L;

    /* renamed from: k */
    public long f10952k;

    /* renamed from: l */
    public int f10953l;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b$a */
    public interface C3138a extends C3124m {
        /* renamed from: b */
        long mo14206b(long j);
    }

    public C3137b(int i, long j) {
        this.f10942a = j;
    }

    /* renamed from: a */
    public static boolean m7885a(int i, long j) {
        return ((long) (i & -128000)) == (j & -128000);
    }

    /* renamed from: a */
    public boolean mo14115a(C3087g gVar) throws IOException, InterruptedException {
        return mo14207a(gVar, true);
    }

    /* renamed from: b */
    public final C3138a mo14208b(C3087g gVar) throws IOException, InterruptedException {
        C3072b bVar = (C3072b) gVar;
        bVar.mo14085a(this.f10943b.f12121a, 0, 4, false);
        this.f10943b.mo14549e(0);
        C3122k.m7847a(this.f10943b.mo14544c(), this.f10944c);
        return new C3136a(bVar.f10548c, this.f10944c.f10820f, bVar.f10547b);
    }

    /* renamed from: b */
    public void mo14116b() {
    }

    /* renamed from: a */
    public void mo14114a(C3088h hVar) {
        this.f10946e = hVar;
        this.f10947f = hVar.mo14122a(0, 1);
        this.f10946e.mo14124c();
    }

    /* renamed from: a */
    public void mo14113a(long j, long j2) {
        this.f10948g = 0;
        this.f10951j = -9223372036854775807L;
        this.f10952k = 0;
        this.f10953l = 0;
    }

    /* JADX WARNING: type inference failed for: r16v2, types: [com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b$a] */
    /* JADX WARNING: type inference failed for: r1v28, types: [com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.c] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (r12 != f10940n) goto L_0x005b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0200  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo14112a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g r36, com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3123l r37) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            int r2 = r0.f10948g
            r3 = -1
            r4 = 0
            if (r2 != 0) goto L_0x000f
            r0.mo14207a((com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g) r1, (boolean) r4)     // Catch:{ EOFException -> 0x000e }
            goto L_0x000f
        L_0x000e:
            return r3
        L_0x000f:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b$a r2 = r0.f10950i
            r7 = 1000000(0xf4240, double:4.940656E-318)
            r10 = 1
            if (r2 != 0) goto L_0x0243
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = new com.fyber.inneractive.sdk.player.exoplayer2.util.k
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r11 = r0.f10944c
            int r11 = r11.f10817c
            r2.<init>((int) r11)
            byte[] r11 = r2.f12121a
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r12 = r0.f10944c
            int r12 = r12.f10817c
            r13 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r13 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b) r13
            r13.mo14085a(r11, r4, r12, r4)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r11 = r0.f10944c
            int r12 = r11.f10815a
            r12 = r12 & r10
            r14 = 36
            if (r12 == 0) goto L_0x003c
            int r11 = r11.f10819e
            if (r11 == r10) goto L_0x0040
            r11 = 36
            goto L_0x0045
        L_0x003c:
            int r11 = r11.f10819e
            if (r11 == r10) goto L_0x0043
        L_0x0040:
            r11 = 21
            goto L_0x0045
        L_0x0043:
            r11 = 13
        L_0x0045:
            int r12 = r2.f12123c
            int r15 = r11 + 4
            if (r12 < r15) goto L_0x005b
            r2.mo14549e(r11)
            int r12 = r2.mo14544c()
            int r15 = f10939m
            if (r12 == r15) goto L_0x006f
            int r15 = f10940n
            if (r12 != r15) goto L_0x005b
            goto L_0x006f
        L_0x005b:
            int r12 = r2.f12123c
            r15 = 40
            if (r12 < r15) goto L_0x006e
            r2.mo14549e(r14)
            int r12 = r2.mo14544c()
            int r14 = f10941o
            if (r12 != r14) goto L_0x006e
            r12 = r14
            goto L_0x006f
        L_0x006e:
            r12 = 0
        L_0x006f:
            int r14 = f10939m
            r16 = 0
            if (r12 == r14) goto L_0x0136
            int r14 = f10940n
            if (r12 != r14) goto L_0x007b
            goto L_0x0136
        L_0x007b:
            int r11 = f10941o
            if (r12 != r11) goto L_0x012e
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r11 = r0.f10944c
            long r9 = r13.f10548c
            long r14 = r13.f10547b
            r12 = 10
            r2.mo14551f(r12)
            int r12 = r2.mo14544c()
            if (r12 > 0) goto L_0x0094
            r24 = r13
            goto L_0x0124
        L_0x0094:
            int r3 = r11.f10818d
            long r4 = (long) r12
            r6 = 32000(0x7d00, float:4.4842E-41)
            if (r3 < r6) goto L_0x009e
            r6 = 1152(0x480, float:1.614E-42)
            goto L_0x00a0
        L_0x009e:
            r6 = 576(0x240, float:8.07E-43)
        L_0x00a0:
            r24 = r13
            long r12 = (long) r6
            long r20 = r12 * r7
            long r12 = (long) r3
            r18 = r4
            r22 = r12
            long r3 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8591a((long) r18, (long) r20, (long) r22)
            int r5 = r2.mo14562q()
            int r6 = r2.mo14562q()
            int r12 = r2.mo14562q()
            r13 = 2
            r2.mo14551f(r13)
            int r11 = r11.f10817c
            long r7 = (long) r11
            long r9 = r9 + r7
            int r7 = r5 + 1
            long[] r8 = new long[r7]
            long[] r11 = new long[r7]
            r20 = 0
            r22 = 0
            r8[r22] = r20
            r11[r22] = r9
            r13 = 1
        L_0x00d1:
            if (r13 >= r7) goto L_0x011d
            r21 = r7
            r7 = 1
            if (r12 == r7) goto L_0x00f1
            r7 = 2
            if (r12 == r7) goto L_0x00ec
            r7 = 3
            if (r12 == r7) goto L_0x00e7
            r7 = 4
            if (r12 == r7) goto L_0x00e2
            goto L_0x0124
        L_0x00e2:
            int r7 = r2.mo14560o()
            goto L_0x00f5
        L_0x00e7:
            int r7 = r2.mo14559n()
            goto L_0x00f5
        L_0x00ec:
            int r7 = r2.mo14562q()
            goto L_0x00f5
        L_0x00f1:
            int r7 = r2.mo14557l()
        L_0x00f5:
            int r7 = r7 * r6
            r22 = r6
            long r6 = (long) r7
            long r9 = r9 + r6
            long r6 = (long) r13
            long r6 = r6 * r3
            r23 = r2
            long r1 = (long) r5
            long r6 = r6 / r1
            r8[r13] = r6
            r1 = -1
            int r6 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x010c
            r1 = r9
            goto L_0x0110
        L_0x010c:
            long r1 = java.lang.Math.min(r14, r9)
        L_0x0110:
            r11[r13] = r1
            int r13 = r13 + 1
            r1 = r36
            r7 = r21
            r6 = r22
            r2 = r23
            goto L_0x00d1
        L_0x011d:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.c r1 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.c
            r1.<init>(r8, r11, r3)
            r16 = r1
        L_0x0124:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r1 = r0.f10944c
            int r1 = r1.f10817c
            r2 = r24
            r2.mo14088c(r1)
            goto L_0x0132
        L_0x012e:
            r2 = r13
            r1 = 0
            r2.f10550e = r1
        L_0x0132:
            r1 = r16
            goto L_0x01f8
        L_0x0136:
            r23 = r2
            r2 = r13
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r1 = r0.f10944c
            long r3 = r2.f10548c
            long r5 = r2.f10547b
            int r7 = r1.f10821g
            int r8 = r1.f10818d
            int r9 = r1.f10817c
            long r9 = (long) r9
            long r25 = r3 + r9
            int r3 = r23.mo14544c()
            r4 = r3 & 1
            r9 = 1
            if (r4 != r9) goto L_0x01a9
            int r4 = r23.mo14560o()
            if (r4 != 0) goto L_0x0158
            goto L_0x01a9
        L_0x0158:
            long r9 = (long) r4
            long r14 = (long) r7
            r18 = 1000000(0xf4240, double:4.940656E-318)
            long r29 = r14 * r18
            long r7 = (long) r8
            r27 = r9
            r31 = r7
            long r27 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.m8591a((long) r27, (long) r29, (long) r31)
            r4 = 6
            r3 = r3 & r4
            if (r3 == r4) goto L_0x017c
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.d r16 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.d
            r31 = 0
            r32 = 0
            r34 = 0
            r24 = r16
            r29 = r5
            r24.<init>(r25, r27, r29, r31, r32, r34)
            goto L_0x01a9
        L_0x017c:
            int r3 = r23.mo14560o()
            long r3 = (long) r3
            r7 = r23
            r8 = 1
            r7.mo14551f(r8)
            r8 = 99
            long[] r9 = new long[r8]
            r10 = 0
        L_0x018c:
            if (r10 >= r8) goto L_0x0198
            int r13 = r7.mo14557l()
            long r14 = (long) r13
            r9[r10] = r14
            int r10 = r10 + 1
            goto L_0x018c
        L_0x0198:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.d r16 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.d
            int r1 = r1.f10817c
            r24 = r16
            r29 = r5
            r31 = r9
            r32 = r3
            r34 = r1
            r24.<init>(r25, r27, r29, r31, r32, r34)
        L_0x01a9:
            if (r16 == 0) goto L_0x01df
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.j r1 = r0.f10945d
            boolean r1 = r1.mo14185a()
            if (r1 != 0) goto L_0x01df
            r1 = 0
            r2.f10550e = r1
            int r11 = r11 + 141
            r2.mo14084a(r11, r1)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f10943b
            byte[] r3 = r3.f12121a
            r4 = 3
            r2.mo14085a(r3, r1, r4, r1)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f10943b
            r3.mo14549e(r1)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.j r1 = r0.f10945d
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f10943b
            int r3 = r3.mo14559n()
            r1.getClass()
            int r4 = r3 >> 12
            r3 = r3 & 4095(0xfff, float:5.738E-42)
            if (r4 > 0) goto L_0x01db
            if (r3 <= 0) goto L_0x01df
        L_0x01db:
            r1.f10806a = r4
            r1.f10807b = r3
        L_0x01df:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r1 = r0.f10944c
            int r1 = r1.f10817c
            r2.mo14088c(r1)
            if (r16 == 0) goto L_0x0132
            boolean r1 = r16.mo14079a()
            if (r1 != 0) goto L_0x0132
            int r1 = f10940n
            if (r12 != r1) goto L_0x0132
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b$a r16 = r35.mo14208b(r36)
            goto L_0x0132
        L_0x01f8:
            r0.f10950i = r1
            if (r1 == 0) goto L_0x0200
            r1.mo14079a()
            goto L_0x0206
        L_0x0200:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b$a r1 = r35.mo14208b(r36)
            r0.f10950i = r1
        L_0x0206:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r1 = r0.f10946e
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b$a r2 = r0.f10950i
            r1.mo14123a(r2)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r1 = r0.f10947f
            r2 = 0
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r3 = r0.f10944c
            java.lang.String r4 = r3.f10816b
            r5 = 0
            r6 = -1
            r7 = 4096(0x1000, float:5.74E-42)
            int r8 = r3.f10819e
            int r9 = r3.f10818d
            r10 = -1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.j r3 = r0.f10945d
            int r11 = r3.f10806a
            int r12 = r3.f10807b
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            com.fyber.inneractive.sdk.player.exoplayer2.metadata.a r3 = r0.f10949h
            r17 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r15 = r16
            r16 = r17
            com.fyber.inneractive.sdk.player.exoplayer2.i r2 = com.fyber.inneractive.sdk.player.exoplayer2.C3226i.m8177a((java.lang.String) r2, (java.lang.String) r3, (java.lang.String) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (int) r10, (int) r11, (java.util.List<byte[]>) r12, (com.fyber.inneractive.sdk.player.exoplayer2.drm.C3059a) r13, (int) r14, (java.lang.String) r15, (com.fyber.inneractive.sdk.player.exoplayer2.metadata.C3243a) r16)
            r1.mo14098a(r2)
        L_0x0243:
            int r1 = r0.f10953l
            if (r1 != 0) goto L_0x02b8
            r1 = r36
            r2 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b) r2
            r3 = 0
            r2.f10550e = r3
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r4 = r0.f10943b
            byte[] r4 = r4.f12121a
            r5 = 4
            r6 = 1
            boolean r4 = r2.mo14085a(r4, r3, r5, r6)
            if (r4 != 0) goto L_0x025d
            r2 = -1
            goto L_0x02c6
        L_0x025d:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r4 = r0.f10943b
            r4.mo14549e(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r3 = r0.f10943b
            int r3 = r3.mo14544c()
            int r4 = r0.f10948g
            long r4 = (long) r4
            boolean r4 = m7885a((int) r3, (long) r4)
            if (r4 == 0) goto L_0x02b0
            int r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3122k.m7846a(r3)
            r5 = -1
            if (r4 != r5) goto L_0x0279
            goto L_0x02b0
        L_0x0279:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r4 = r0.f10944c
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3122k.m7847a(r3, r4)
            long r3 = r0.f10951j
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x02a9
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b$a r3 = r0.f10950i
            long r7 = r2.f10548c
            long r2 = r3.mo14206b(r7)
            r0.f10951j = r2
            long r2 = r0.f10942a
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x02a9
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b$a r2 = r0.f10950i
            r3 = 0
            long r2 = r2.mo14206b(r3)
            long r4 = r0.f10951j
            long r6 = r0.f10942a
            long r6 = r6 - r2
            long r6 = r6 + r4
            r0.f10951j = r6
        L_0x02a9:
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r2 = r0.f10944c
            int r2 = r2.f10817c
            r0.f10953l = r2
            goto L_0x02ba
        L_0x02b0:
            r3 = 1
            r2.mo14088c(r3)
            r1 = 0
            r0.f10948g = r1
            goto L_0x02f8
        L_0x02b8:
            r1 = r36
        L_0x02ba:
            r3 = 1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r2 = r0.f10947f
            int r4 = r0.f10953l
            int r1 = r2.mo14092a(r1, r4, r3)
            r2 = -1
            if (r1 != r2) goto L_0x02c8
        L_0x02c6:
            r3 = -1
            goto L_0x02f9
        L_0x02c8:
            int r2 = r0.f10953l
            int r2 = r2 - r1
            r0.f10953l = r2
            if (r2 <= 0) goto L_0x02d0
            goto L_0x02f8
        L_0x02d0:
            long r1 = r0.f10951j
            long r3 = r0.f10952k
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r5
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r5 = r0.f10944c
            int r6 = r5.f10818d
            long r6 = (long) r6
            long r3 = r3 / r6
            long r7 = r3 + r1
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.n r6 = r0.f10947f
            int r10 = r5.f10817c
            r9 = 1
            r11 = 0
            r12 = 0
            r6.mo14096a(r7, r9, r10, r11, r12)
            long r1 = r0.f10952k
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.k r3 = r0.f10944c
            int r3 = r3.f10821g
            long r3 = (long) r3
            long r1 = r1 + r3
            r0.f10952k = r1
            r1 = 0
            r0.f10953l = r1
        L_0x02f8:
            r3 = 0
        L_0x02f9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.C3137b.mo14112a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):int");
    }

    /* renamed from: a */
    public final boolean mo14207a(C3087g gVar, boolean z) throws IOException, InterruptedException {
        int i;
        int i2;
        int a;
        int i3 = z ? Spliterator.SUBSIZED : SQLiteDatabase.OPEN_SHAREDCACHE;
        C3072b bVar = (C3072b) gVar;
        bVar.f10550e = 0;
        int i4 = 0;
        if (bVar.f10548c == 0) {
            while (true) {
                bVar.mo14085a(this.f10943b.f12121a, 0, 10, false);
                this.f10943b.mo14549e(0);
                if (this.f10943b.mo14559n() != C3258g.f11739b) {
                    break;
                }
                this.f10943b.mo14551f(3);
                int k = this.f10943b.mo14556k();
                int i5 = k + 10;
                if (this.f10949h == null) {
                    byte[] bArr = new byte[i5];
                    System.arraycopy(this.f10943b.f12121a, 0, bArr, 0, 10);
                    bVar.mo14085a(bArr, 10, k, false);
                    C3243a a2 = new C3258g((C3258g.C3259a) null).mo14388a(bArr, i5);
                    this.f10949h = a2;
                    if (a2 != null) {
                        this.f10945d.mo14186a(a2);
                    }
                } else {
                    bVar.mo14084a(k, false);
                }
                i4 += i5;
            }
            bVar.f10550e = 0;
            bVar.mo14084a(i4, false);
            i = (int) (bVar.f10548c + ((long) bVar.f10550e));
            if (!z) {
                bVar.mo14088c(i);
            }
            i4 = 0;
        } else {
            i = 0;
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (!bVar.mo14085a(this.f10943b.f12121a, 0, 4, i2 > 0)) {
                break;
            }
            this.f10943b.mo14549e(0);
            int c = this.f10943b.mo14544c();
            if ((i6 == 0 || m7885a(c, (long) i6)) && (a = C3122k.m7846a(c)) != -1) {
                i2++;
                if (i2 != 1) {
                    if (i2 == 4) {
                        break;
                    }
                } else {
                    C3122k.m7847a(c, this.f10944c);
                    i6 = c;
                }
                bVar.mo14084a(a - 4, false);
            } else {
                int i8 = i7 + 1;
                if (i7 != i3) {
                    if (z) {
                        bVar.f10550e = 0;
                        bVar.mo14084a(i + i8, false);
                    } else {
                        bVar.mo14088c(1);
                    }
                    i7 = i8;
                    i2 = 0;
                    i6 = 0;
                } else if (z) {
                    return false;
                } else {
                    throw new C3230l("Searched too many bytes.");
                }
            }
        }
        if (z) {
            bVar.mo14088c(i + i7);
        } else {
            bVar.f10550e = 0;
        }
        this.f10948g = i6;
        return true;
    }
}
