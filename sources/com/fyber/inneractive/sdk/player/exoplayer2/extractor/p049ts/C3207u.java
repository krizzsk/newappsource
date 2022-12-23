package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3080f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3088h;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3124m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3210v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3392j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3403r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u */
public final class C3207u implements C3080f {

    /* renamed from: l */
    public static final long f11496l = ((long) C3406u.m8589a("AC-3"));

    /* renamed from: m */
    public static final long f11497m = ((long) C3406u.m8589a("EAC3"));

    /* renamed from: n */
    public static final long f11498n = ((long) C3406u.m8589a("HEVC"));

    /* renamed from: a */
    public final int f11499a;

    /* renamed from: b */
    public final List<C3403r> f11500b;

    /* renamed from: c */
    public final C3393k f11501c;

    /* renamed from: d */
    public final SparseIntArray f11502d;

    /* renamed from: e */
    public final C3210v.C3213c f11503e;

    /* renamed from: f */
    public final SparseArray<C3210v> f11504f;

    /* renamed from: g */
    public final SparseBooleanArray f11505g;

    /* renamed from: h */
    public C3088h f11506h;

    /* renamed from: i */
    public int f11507i;

    /* renamed from: j */
    public boolean f11508j;

    /* renamed from: k */
    public C3210v f11509k;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u$a */
    public class C3208a implements C3203q {

        /* renamed from: a */
        public final C3392j f11510a = new C3392j(new byte[4]);

        public C3208a() {
        }

        /* renamed from: a */
        public void mo14267a(C3393k kVar) {
            if (kVar.mo14557l() == 0) {
                kVar.mo14551f(7);
                int a = kVar.mo14537a() / 4;
                for (int i = 0; i < a; i++) {
                    kVar.mo14539a(this.f11510a, 4);
                    int a2 = this.f11510a.mo14532a(16);
                    this.f11510a.mo14536c(3);
                    if (a2 == 0) {
                        this.f11510a.mo14536c(13);
                    } else {
                        int a3 = this.f11510a.mo14532a(13);
                        C3207u uVar = C3207u.this;
                        uVar.f11504f.put(a3, new C3204r(new C3209b(a3)));
                        C3207u.this.f11507i++;
                    }
                }
                C3207u uVar2 = C3207u.this;
                if (uVar2.f11499a != 2) {
                    uVar2.f11504f.remove(0);
                }
            }
        }

        /* renamed from: a */
        public void mo14268a(C3403r rVar, C3088h hVar, C3210v.C3214d dVar) {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u$b */
    public class C3209b implements C3203q {

        /* renamed from: a */
        public final C3392j f11512a = new C3392j(new byte[5]);

        /* renamed from: b */
        public final SparseArray<C3210v> f11513b = new SparseArray<>();

        /* renamed from: c */
        public final SparseIntArray f11514c = new SparseIntArray();

        /* renamed from: d */
        public final int f11515d;

        public C3209b(int i) {
            this.f11515d = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:69:0x01fb  */
        /* JADX WARNING: Removed duplicated region for block: B:71:0x0208  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo14267a(com.fyber.inneractive.sdk.player.exoplayer2.util.C3393k r25) {
            /*
                r24 = this;
                r0 = r24
                r1 = r25
                int r2 = r25.mo14557l()
                r3 = 2
                if (r2 == r3) goto L_0x000c
                return
            L_0x000c:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3207u.this
                int r4 = r2.f11499a
                r5 = 0
                r6 = 1
                if (r4 == r6) goto L_0x0032
                if (r4 == r3) goto L_0x0032
                int r4 = r2.f11507i
                if (r4 != r6) goto L_0x001b
                goto L_0x0032
            L_0x001b:
                com.fyber.inneractive.sdk.player.exoplayer2.util.r r4 = new com.fyber.inneractive.sdk.player.exoplayer2.util.r
                java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.util.r> r2 = r2.f11500b
                java.lang.Object r2 = r2.get(r5)
                com.fyber.inneractive.sdk.player.exoplayer2.util.r r2 = (com.fyber.inneractive.sdk.player.exoplayer2.util.C3403r) r2
                long r7 = r2.f12145a
                r4.<init>(r7)
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r2 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3207u.this
                java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.util.r> r2 = r2.f11500b
                r2.add(r4)
                goto L_0x003b
            L_0x0032:
                java.util.List<com.fyber.inneractive.sdk.player.exoplayer2.util.r> r2 = r2.f11500b
                java.lang.Object r2 = r2.get(r5)
                r4 = r2
                com.fyber.inneractive.sdk.player.exoplayer2.util.r r4 = (com.fyber.inneractive.sdk.player.exoplayer2.util.C3403r) r4
            L_0x003b:
                r1.mo14551f(r3)
                int r2 = r25.mo14562q()
                r7 = 5
                r1.mo14551f(r7)
                com.fyber.inneractive.sdk.player.exoplayer2.util.j r8 = r0.f11512a
                r1.mo14539a((com.fyber.inneractive.sdk.player.exoplayer2.util.C3392j) r8, (int) r3)
                com.fyber.inneractive.sdk.player.exoplayer2.util.j r8 = r0.f11512a
                r9 = 4
                r8.mo14536c(r9)
                com.fyber.inneractive.sdk.player.exoplayer2.util.j r8 = r0.f11512a
                r10 = 12
                int r8 = r8.mo14532a(r10)
                r1.mo14551f(r8)
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r8 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3207u.this
                int r11 = r8.f11499a
                r12 = 8192(0x2000, float:1.14794E-41)
                r13 = 0
                r14 = 21
                if (r11 != r3) goto L_0x008a
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v r8 = r8.f11509k
                if (r8 != 0) goto L_0x008a
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$b r8 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$b
                byte[] r11 = new byte[r5]
                r8.<init>(r14, r13, r13, r11)
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r11 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3207u.this
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$c r15 = r11.f11503e
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v r8 = r15.mo14251a(r14, r8)
                r11.f11509k = r8
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r8 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3207u.this
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v r11 = r8.f11509k
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r8 = r8.f11506h
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$d r15 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$d
                r15.<init>(r2, r14, r12)
                r11.mo14265a(r4, r8, r15)
            L_0x008a:
                android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v> r8 = r0.f11513b
                r8.clear()
                android.util.SparseIntArray r8 = r0.f11514c
                r8.clear()
                int r8 = r25.mo14537a()
            L_0x0098:
                if (r8 <= 0) goto L_0x0227
                com.fyber.inneractive.sdk.player.exoplayer2.util.j r11 = r0.f11512a
                r1.mo14539a((com.fyber.inneractive.sdk.player.exoplayer2.util.C3392j) r11, (int) r7)
                com.fyber.inneractive.sdk.player.exoplayer2.util.j r11 = r0.f11512a
                r15 = 8
                int r11 = r11.mo14532a(r15)
                com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r0.f11512a
                r13 = 3
                r15.mo14536c(r13)
                com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r0.f11512a
                r6 = 13
                int r6 = r15.mo14532a(r6)
                com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r0.f11512a
                r15.mo14536c(r9)
                com.fyber.inneractive.sdk.player.exoplayer2.util.j r15 = r0.f11512a
                int r15 = r15.mo14532a(r10)
                int r10 = r1.f12122b
                int r12 = r10 + r15
                r16 = -1
                r3 = 0
                r14 = -1
                r17 = 0
            L_0x00ca:
                int r5 = r1.f12122b
                if (r5 >= r12) goto L_0x01aa
                int r5 = r25.mo14557l()
                int r18 = r25.mo14557l()
                int r9 = r1.f12122b
                int r9 = r9 + r18
                r13 = 89
                if (r5 != r7) goto L_0x0103
                long r20 = r25.mo14558m()
                long r22 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3207u.f11496l
                int r5 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
                if (r5 != 0) goto L_0x00e9
                goto L_0x0107
            L_0x00e9:
                long r22 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3207u.f11497m
                int r5 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
                if (r5 != 0) goto L_0x00f0
                goto L_0x0118
            L_0x00f0:
                long r22 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3207u.f11498n
                int r5 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
                if (r5 != 0) goto L_0x0142
                r5 = 36
                r22 = r2
                r19 = r4
                r23 = r6
                r13 = 4
                r14 = 36
                goto L_0x0197
            L_0x0103:
                r7 = 106(0x6a, float:1.49E-43)
                if (r5 != r7) goto L_0x0114
            L_0x0107:
                r5 = 129(0x81, float:1.81E-43)
                r22 = r2
                r19 = r4
                r23 = r6
                r13 = 4
                r14 = 129(0x81, float:1.81E-43)
                goto L_0x0197
            L_0x0114:
                r7 = 122(0x7a, float:1.71E-43)
                if (r5 != r7) goto L_0x0125
            L_0x0118:
                r5 = 135(0x87, float:1.89E-43)
                r22 = r2
                r19 = r4
                r23 = r6
                r13 = 4
                r14 = 135(0x87, float:1.89E-43)
                goto L_0x0197
            L_0x0125:
                r7 = 123(0x7b, float:1.72E-43)
                if (r5 != r7) goto L_0x0135
                r5 = 138(0x8a, float:1.93E-43)
                r22 = r2
                r19 = r4
                r23 = r6
                r13 = 4
                r14 = 138(0x8a, float:1.93E-43)
                goto L_0x0197
            L_0x0135:
                r7 = 10
                if (r5 != r7) goto L_0x014a
                r7 = 3
                java.lang.String r3 = r1.mo14543b(r7)
                java.lang.String r3 = r3.trim()
            L_0x0142:
                r22 = r2
                r19 = r4
                r23 = r6
                r13 = 4
                goto L_0x0197
            L_0x014a:
                r7 = 3
                if (r5 != r13) goto L_0x0142
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>()
            L_0x0152:
                int r14 = r1.f12122b
                if (r14 >= r9) goto L_0x018c
                java.lang.String r14 = r1.mo14543b(r7)
                java.lang.String r14 = r14.trim()
                int r7 = r25.mo14557l()
                r19 = r4
                r13 = 4
                byte[] r4 = new byte[r13]
                r22 = r2
                byte[] r2 = r1.f12121a
                r23 = r6
                int r6 = r1.f12122b
                r0 = 0
                java.lang.System.arraycopy(r2, r6, r4, r0, r13)
                int r0 = r1.f12122b
                int r0 = r0 + r13
                r1.f12122b = r0
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$a r0 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$a
                r0.<init>(r14, r7, r4)
                r5.add(r0)
                r0 = r24
                r4 = r19
                r2 = r22
                r6 = r23
                r7 = 3
                r13 = 89
                goto L_0x0152
            L_0x018c:
                r22 = r2
                r19 = r4
                r23 = r6
                r13 = 4
                r17 = r5
                r14 = 89
            L_0x0197:
                int r0 = r1.f12122b
                int r9 = r9 - r0
                r1.mo14551f(r9)
                r0 = r24
                r4 = r19
                r2 = r22
                r6 = r23
                r7 = 5
                r9 = 4
                r13 = 3
                goto L_0x00ca
            L_0x01aa:
                r22 = r2
                r19 = r4
                r23 = r6
                r13 = 4
                r1.mo14549e(r12)
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$b r0 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$b
                byte[] r2 = r1.f12121a
                byte[] r2 = java.util.Arrays.copyOfRange(r2, r10, r12)
                r4 = r17
                r0.<init>(r14, r3, r4, r2)
                r2 = 6
                if (r11 != r2) goto L_0x01c5
                r11 = r14
            L_0x01c5:
                int r15 = r15 + 5
                int r8 = r8 - r15
                r2 = r24
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3207u.this
                int r4 = r3.f11499a
                r5 = 2
                if (r4 != r5) goto L_0x01d3
                r4 = r11
                goto L_0x01d5
            L_0x01d3:
                r4 = r23
            L_0x01d5:
                android.util.SparseBooleanArray r3 = r3.f11505g
                boolean r3 = r3.get(r4)
                if (r3 == 0) goto L_0x01e0
                r6 = 21
                goto L_0x0214
            L_0x01e0:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3207u.this
                int r6 = r3.f11499a
                if (r6 != r5) goto L_0x01ed
                r6 = 21
                if (r11 != r6) goto L_0x01ef
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v r0 = r3.f11509k
                goto L_0x01f5
            L_0x01ed:
                r6 = 21
            L_0x01ef:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$c r3 = r3.f11503e
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v r0 = r3.mo14251a(r11, r0)
            L_0x01f5:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3207u.this
                int r3 = r3.f11499a
                if (r3 != r5) goto L_0x0208
                android.util.SparseIntArray r3 = r2.f11514c
                r5 = 8192(0x2000, float:1.14794E-41)
                int r3 = r3.get(r4, r5)
                r5 = r23
                if (r5 >= r3) goto L_0x0214
                goto L_0x020a
            L_0x0208:
                r5 = r23
            L_0x020a:
                android.util.SparseIntArray r3 = r2.f11514c
                r3.put(r4, r5)
                android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v> r3 = r2.f11513b
                r3.put(r4, r0)
            L_0x0214:
                r0 = r2
                r4 = r19
                r2 = r22
                r3 = 2
                r5 = 0
                r6 = 1
                r7 = 5
                r9 = 4
                r10 = 12
                r12 = 8192(0x2000, float:1.14794E-41)
                r13 = 0
                r14 = 21
                goto L_0x0098
            L_0x0227:
                r22 = r2
                r19 = r4
                r2 = r0
                android.util.SparseIntArray r0 = r2.f11514c
                int r0 = r0.size()
                r1 = 0
            L_0x0233:
                if (r1 >= r0) goto L_0x0285
                android.util.SparseIntArray r3 = r2.f11514c
                int r3 = r3.keyAt(r1)
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r4 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3207u.this
                android.util.SparseBooleanArray r4 = r4.f11505g
                r5 = 1
                r4.put(r3, r5)
                android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v> r4 = r2.f11513b
                java.lang.Object r4 = r4.valueAt(r1)
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v r4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3210v) r4
                if (r4 == 0) goto L_0x0278
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r5 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3207u.this
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v r6 = r5.f11509k
                if (r4 == r6) goto L_0x0264
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r5 = r5.f11506h
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$d r6 = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$d
                r7 = r22
                r8 = 8192(0x2000, float:1.14794E-41)
                r6.<init>(r7, r3, r8)
                r3 = r19
                r4.mo14265a(r3, r5, r6)
                goto L_0x026a
            L_0x0264:
                r3 = r19
                r7 = r22
                r8 = 8192(0x2000, float:1.14794E-41)
            L_0x026a:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r5 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3207u.this
                android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v> r5 = r5.f11504f
                android.util.SparseIntArray r6 = r2.f11514c
                int r6 = r6.valueAt(r1)
                r5.put(r6, r4)
                goto L_0x027e
            L_0x0278:
                r3 = r19
                r7 = r22
                r8 = 8192(0x2000, float:1.14794E-41)
            L_0x027e:
                int r1 = r1 + 1
                r19 = r3
                r22 = r7
                goto L_0x0233
            L_0x0285:
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3207u.this
                int r1 = r0.f11499a
                r3 = 2
                if (r1 != r3) goto L_0x029f
                boolean r1 = r0.f11508j
                if (r1 != 0) goto L_0x02c2
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r0 = r0.f11506h
                r0.mo14124c()
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3207u.this
                r1 = 0
                r0.f11507i = r1
                r3 = 1
                boolean unused = r0.f11508j = r3
                goto L_0x02c2
            L_0x029f:
                r1 = 0
                r3 = 1
                android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v> r0 = r0.f11504f
                int r4 = r2.f11515d
                r0.remove(r4)
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3207u.this
                int r4 = r0.f11499a
                if (r4 != r3) goto L_0x02b0
                r5 = 0
                goto L_0x02b4
            L_0x02b0:
                int r1 = r0.f11507i
                int r5 = r1 + -1
            L_0x02b4:
                r0.f11507i = r5
                if (r5 != 0) goto L_0x02c2
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.h r0 = r0.f11506h
                r0.mo14124c()
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.u r0 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3207u.this
                boolean unused = r0.f11508j = r3
            L_0x02c2:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3207u.C3209b.mo14267a(com.fyber.inneractive.sdk.player.exoplayer2.util.k):void");
        }

        /* renamed from: a */
        public void mo14268a(C3403r rVar, C3088h hVar, C3210v.C3214d dVar) {
        }
    }

    public C3207u(int i, C3403r rVar, C3210v.C3213c cVar) {
        this.f11503e = (C3210v.C3213c) C3380a.m8503a(cVar);
        this.f11499a = i;
        if (i == 1 || i == 2) {
            this.f11500b = Collections.singletonList(rVar);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f11500b = arrayList;
            arrayList.add(rVar);
        }
        this.f11501c = new C3393k(940);
        this.f11505g = new SparseBooleanArray();
        this.f11504f = new SparseArray<>();
        this.f11502d = new SparseIntArray();
        mo14270a();
    }

    /* renamed from: b */
    public void mo14116b() {
    }

    /* renamed from: a */
    public boolean mo14115a(C3087g gVar) throws IOException, InterruptedException {
        byte[] bArr = this.f11501c.f12121a;
        C3072b bVar = (C3072b) gVar;
        bVar.mo14085a(bArr, 0, 940, false);
        int i = 0;
        while (i < 188) {
            int i2 = 0;
            while (i2 != 5) {
                if (bArr[(i2 * 188) + i] != 71) {
                    i++;
                } else {
                    i2++;
                }
            }
            bVar.mo14088c(i);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo14114a(C3088h hVar) {
        this.f11506h = hVar;
        hVar.mo14123a(new C3124m.C3125a(-9223372036854775807L));
    }

    /* renamed from: a */
    public void mo14113a(long j, long j2) {
        int size = this.f11500b.size();
        for (int i = 0; i < size; i++) {
            this.f11500b.get(i).f12147c = -9223372036854775807L;
        }
        this.f11501c.mo14563r();
        this.f11502d.clear();
        mo14270a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a8, code lost:
        if (r0 != ((r7 + 1) & 15)) goto L_0x00ac;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo14112a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3087g r10, com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3123l r11) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r9 = this;
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r11 = r9.f11501c
            byte[] r0 = r11.f12121a
            int r1 = r11.f12122b
            int r1 = 940 - r1
            r2 = 188(0xbc, float:2.63E-43)
            r3 = 0
            if (r1 >= r2) goto L_0x001f
            int r11 = r11.mo14537a()
            if (r11 <= 0) goto L_0x001a
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r9.f11501c
            int r1 = r1.f12122b
            java.lang.System.arraycopy(r0, r1, r0, r3, r11)
        L_0x001a:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r1 = r9.f11501c
            r1.mo14540a((byte[]) r0, (int) r11)
        L_0x001f:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r11 = r9.f11501c
            int r11 = r11.mo14537a()
            if (r11 >= r2) goto L_0x003f
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r11 = r9.f11501c
            int r11 = r11.f12123c
            int r1 = 940 - r11
            r4 = r10
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.b r4 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.C3072b) r4
            int r1 = r4.mo14081a(r0, r11, r1)
            r4 = -1
            if (r1 != r4) goto L_0x0038
            return r4
        L_0x0038:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r4 = r9.f11501c
            int r11 = r11 + r1
            r4.mo14547d(r11)
            goto L_0x001f
        L_0x003f:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r10 = r9.f11501c
            int r11 = r10.f12123c
            int r10 = r10.f12122b
        L_0x0045:
            if (r10 >= r11) goto L_0x0050
            byte r1 = r0[r10]
            r4 = 71
            if (r1 == r4) goto L_0x0050
            int r10 = r10 + 1
            goto L_0x0045
        L_0x0050:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r9.f11501c
            r0.mo14549e(r10)
            int r10 = r10 + r2
            if (r10 <= r11) goto L_0x0059
            return r3
        L_0x0059:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r9.f11501c
            int r0 = r0.mo14544c()
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x006a
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r11 = r9.f11501c
            r11.mo14549e(r10)
            return r3
        L_0x006a:
            r1 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 & r0
            r2 = 1
            if (r1 == 0) goto L_0x0072
            r1 = 1
            goto L_0x0073
        L_0x0072:
            r1 = 0
        L_0x0073:
            r4 = 2096896(0x1fff00, float:2.938377E-39)
            r4 = r4 & r0
            int r4 = r4 >> 8
            r5 = r0 & 32
            if (r5 == 0) goto L_0x007f
            r5 = 1
            goto L_0x0080
        L_0x007f:
            r5 = 0
        L_0x0080:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0086
            r6 = 1
            goto L_0x0087
        L_0x0086:
            r6 = 0
        L_0x0087:
            int r7 = r9.f11499a
            r8 = 2
            if (r7 == r8) goto L_0x00ab
            r0 = r0 & 15
            android.util.SparseIntArray r7 = r9.f11502d
            int r8 = r0 + -1
            int r7 = r7.get(r4, r8)
            android.util.SparseIntArray r8 = r9.f11502d
            r8.put(r4, r0)
            if (r7 != r0) goto L_0x00a5
            if (r6 == 0) goto L_0x00ab
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r11 = r9.f11501c
            r11.mo14549e(r10)
            return r3
        L_0x00a5:
            int r7 = r7 + r2
            r7 = r7 & 15
            if (r0 == r7) goto L_0x00ab
            goto L_0x00ac
        L_0x00ab:
            r2 = 0
        L_0x00ac:
            if (r5 == 0) goto L_0x00b9
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r9.f11501c
            int r0 = r0.mo14557l()
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r5 = r9.f11501c
            r5.mo14551f(r0)
        L_0x00b9:
            if (r6 == 0) goto L_0x00d9
            android.util.SparseArray<com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v> r0 = r9.f11504f
            java.lang.Object r0 = r0.get(r4)
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v r0 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3210v) r0
            if (r0 == 0) goto L_0x00d9
            if (r2 == 0) goto L_0x00ca
            r0.mo14262a()
        L_0x00ca:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = r9.f11501c
            r2.mo14547d(r10)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r2 = r9.f11501c
            r0.mo14264a(r2, r1)
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r0 = r9.f11501c
            r0.mo14547d(r11)
        L_0x00d9:
            com.fyber.inneractive.sdk.player.exoplayer2.util.k r11 = r9.f11501c
            r11.mo14549e(r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.p049ts.C3207u.mo14112a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.g, com.fyber.inneractive.sdk.player.exoplayer2.extractor.l):int");
    }

    /* renamed from: a */
    public final void mo14270a() {
        this.f11505g.clear();
        this.f11504f.clear();
        SparseArray<C3210v> a = this.f11503e.mo14249a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            this.f11504f.put(a.keyAt(i), a.valueAt(i));
        }
        this.f11504f.put(0, new C3204r(new C3208a()));
        this.f11509k = null;
    }
}
