package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C3305s;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d */
public abstract class C3318d extends C3324g {

    /* renamed from: a */
    public final SparseArray<Map<C3305s, C3320b>> f11907a = new SparseArray<>();

    /* renamed from: b */
    public final SparseBooleanArray f11908b = new SparseBooleanArray();

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d$a */
    public static final class C3319a {
        public C3319a(int[] iArr, C3305s[] sVarArr, int[] iArr2, int[][][] iArr3, C3305s sVar) {
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d$b */
    public static final class C3320b {
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:0x0278 A[LOOP:8: B:64:0x015b->B:109:0x0278, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0389  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x038b  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x0273 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x015f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3325h mo14454a(com.fyber.inneractive.sdk.player.exoplayer2.C3026a[] r48, com.fyber.inneractive.sdk.player.exoplayer2.source.C3305s r49) throws com.fyber.inneractive.sdk.player.exoplayer2.C3054d {
        /*
            r47 = this;
            r1 = r47
            r0 = r48
            r2 = r49
            int r3 = r0.length
            r4 = 1
            int r3 = r3 + r4
            int[] r3 = new int[r3]
            int r5 = r0.length
            int r5 = r5 + r4
            com.fyber.inneractive.sdk.player.exoplayer2.source.r[][] r6 = new com.fyber.inneractive.sdk.player.exoplayer2.source.C3304r[r5][]
            int r7 = r0.length
            int r7 = r7 + r4
            int[][][] r12 = new int[r7][][]
            r8 = 0
        L_0x0014:
            if (r8 >= r5) goto L_0x0023
            int r9 = r2.f11875a
            com.fyber.inneractive.sdk.player.exoplayer2.source.r[] r10 = new com.fyber.inneractive.sdk.player.exoplayer2.source.C3304r[r9]
            r6[r8] = r10
            int[][] r9 = new int[r9][]
            r12[r8] = r9
            int r8 = r8 + 1
            goto L_0x0014
        L_0x0023:
            int r5 = r0.length
            int[] r11 = new int[r5]
            r8 = 0
        L_0x0027:
            r9 = 4
            if (r8 >= r5) goto L_0x0034
            r10 = r0[r8]
            r10.getClass()
            r11[r8] = r9
            int r8 = r8 + 1
            goto L_0x0027
        L_0x0034:
            r5 = 0
        L_0x0035:
            int r8 = r2.f11875a
            if (r5 >= r8) goto L_0x00bc
            com.fyber.inneractive.sdk.player.exoplayer2.source.r[] r8 = r2.f11876b
            r8 = r8[r5]
            int r13 = r0.length
            r14 = 0
            r15 = 0
        L_0x0040:
            int r9 = r0.length
            if (r14 >= r9) goto L_0x0077
            r9 = r0[r14]
            r7 = 0
        L_0x0046:
            int r4 = r8.f11871a
            if (r7 >= r4) goto L_0x0073
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r4 = r8.f11872b
            r4 = r4[r7]
            r10 = r9
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b r10 = (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3233b) r10
            r10.getClass()
            r18 = r9
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c r9 = r10.f11685i     // Catch:{ b -> 0x006b }
            int r4 = r10.mo13996a((com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3235c) r9, (com.fyber.inneractive.sdk.player.exoplayer2.C3226i) r4)     // Catch:{ b -> 0x006b }
            r9 = 3
            r4 = r4 & r9
            if (r4 <= r15) goto L_0x0066
            if (r4 != r9) goto L_0x0064
            r13 = r14
            goto L_0x0077
        L_0x0064:
            r15 = r4
            r13 = r14
        L_0x0066:
            int r7 = r7 + 1
            r9 = r18
            goto L_0x0046
        L_0x006b:
            r0 = move-exception
            int r2 = r10.f10345c
            com.fyber.inneractive.sdk.player.exoplayer2.d r0 = com.fyber.inneractive.sdk.player.exoplayer2.C3054d.m7662a(r0, r2)
            throw r0
        L_0x0073:
            int r14 = r14 + 1
            r4 = 1
            goto L_0x0040
        L_0x0077:
            int r4 = r0.length
            if (r13 != r4) goto L_0x007f
            int r4 = r8.f11871a
            int[] r4 = new int[r4]
            goto L_0x00a8
        L_0x007f:
            r4 = r0[r13]
            int r7 = r8.f11871a
            int[] r7 = new int[r7]
            r9 = 0
        L_0x0086:
            int r10 = r8.f11871a
            if (r9 >= r10) goto L_0x00a7
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r10 = r8.f11872b
            r10 = r10[r9]
            r14 = r4
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.b r14 = (com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3233b) r14
            r14.getClass()
            com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.c r15 = r14.f11685i     // Catch:{ b -> 0x009f }
            int r10 = r14.mo13996a((com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C3235c) r15, (com.fyber.inneractive.sdk.player.exoplayer2.C3226i) r10)     // Catch:{ b -> 0x009f }
            r7[r9] = r10
            int r9 = r9 + 1
            goto L_0x0086
        L_0x009f:
            r0 = move-exception
            int r2 = r14.f10345c
            com.fyber.inneractive.sdk.player.exoplayer2.d r0 = com.fyber.inneractive.sdk.player.exoplayer2.C3054d.m7662a(r0, r2)
            throw r0
        L_0x00a7:
            r4 = r7
        L_0x00a8:
            r7 = r3[r13]
            r9 = r6[r13]
            r9[r7] = r8
            r8 = r12[r13]
            r8[r7] = r4
            r4 = 1
            int r7 = r7 + r4
            r3[r13] = r7
            int r5 = r5 + 1
            r4 = 1
            r9 = 4
            goto L_0x0035
        L_0x00bc:
            int r4 = r0.length
            com.fyber.inneractive.sdk.player.exoplayer2.source.s[] r10 = new com.fyber.inneractive.sdk.player.exoplayer2.source.C3305s[r4]
            int r4 = r0.length
            int[] r9 = new int[r4]
            r4 = 0
        L_0x00c3:
            int r5 = r0.length
            if (r4 >= r5) goto L_0x00ea
            r5 = r3[r4]
            com.fyber.inneractive.sdk.player.exoplayer2.source.s r7 = new com.fyber.inneractive.sdk.player.exoplayer2.source.s
            r8 = r6[r4]
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r5)
            com.fyber.inneractive.sdk.player.exoplayer2.source.r[] r8 = (com.fyber.inneractive.sdk.player.exoplayer2.source.C3304r[]) r8
            r7.<init>(r8)
            r10[r4] = r7
            r7 = r12[r4]
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r7, r5)
            int[][] r5 = (int[][]) r5
            r12[r4] = r5
            r5 = r0[r4]
            int r5 = r5.f10343a
            r9[r4] = r5
            int r4 = r4 + 1
            goto L_0x00c3
        L_0x00ea:
            int r4 = r0.length
            r3 = r3[r4]
            com.fyber.inneractive.sdk.player.exoplayer2.source.s r13 = new com.fyber.inneractive.sdk.player.exoplayer2.source.s
            int r4 = r0.length
            r4 = r6[r4]
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r4, r3)
            com.fyber.inneractive.sdk.player.exoplayer2.source.r[] r3 = (com.fyber.inneractive.sdk.player.exoplayer2.source.C3304r[]) r3
            r13.<init>(r3)
            r3 = r1
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b r3 = (com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3314b) r3
            int r4 = r0.length
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e[] r5 = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3321e[r4]
            java.util.concurrent.atomic.AtomicReference<com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b$b> r6 = r3.f11889d
            java.lang.Object r6 = r6.get()
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b$b r6 = (com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3314b.C3316b) r6
            r7 = 0
            r8 = 0
            r14 = 0
        L_0x010c:
            if (r7 >= r4) goto L_0x03de
            r15 = r0[r7]
            int r2 = r15.f10343a
            r19 = r13
            r13 = 2
            if (r13 != r2) goto L_0x03ae
            if (r8 != 0) goto L_0x038d
            r2 = r10[r7]
            r8 = r12[r7]
            int r13 = r6.f11897e
            r27 = r11
            int r11 = r6.f11898f
            r28 = r9
            int r9 = r6.f11899g
            boolean r1 = r6.f11896d
            r29 = r12
            boolean r12 = r6.f11895c
            int r0 = r6.f11902j
            r30 = r4
            int r4 = r6.f11903k
            r31 = r14
            boolean r14 = r6.f11904l
            r32 = r10
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e$a r10 = r3.f11888c
            r33 = r3
            boolean r3 = r6.f11900h
            r34 = r5
            boolean r5 = r6.f11901i
            if (r10 == 0) goto L_0x0295
            if (r1 == 0) goto L_0x014a
            r1 = 12
            goto L_0x014c
        L_0x014a:
            r1 = 8
        L_0x014c:
            if (r12 == 0) goto L_0x0157
            r15.getClass()
            r12 = r1 & 4
            if (r12 == 0) goto L_0x0157
            r12 = 1
            goto L_0x0158
        L_0x0157:
            r12 = 0
        L_0x0158:
            r35 = r6
            r15 = 0
        L_0x015b:
            int r6 = r2.f11875a
            if (r15 >= r6) goto L_0x028c
            com.fyber.inneractive.sdk.player.exoplayer2.source.r[] r6 = r2.f11876b
            r6 = r6[r15]
            r36 = r8[r15]
            r37 = r7
            int r7 = r6.f11871a
            r38 = r3
            r3 = 2
            if (r7 >= r3) goto L_0x017e
            int[] r7 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3314b.f11887e
            r43 = r0
            r45 = r4
            r39 = r5
        L_0x0176:
            r42 = r8
            r40 = r12
            r46 = r14
            goto L_0x0270
        L_0x017e:
            java.util.List r7 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3314b.m8369a(r6, r0, r4, r14)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r39 = r5
            int r5 = r7.size()
            if (r5 >= r3) goto L_0x0193
            int[] r7 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3314b.f11887e
            r43 = r0
            r45 = r4
            goto L_0x0176
        L_0x0193:
            if (r12 != 0) goto L_0x0211
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r42 = r8
            r40 = r12
            r5 = 0
            r12 = 0
            r41 = 0
        L_0x01a2:
            int r8 = r7.size()
            if (r5 >= r8) goto L_0x020a
            java.lang.Object r8 = r7.get(r5)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r43 = r0
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r0 = r6.f11872b
            r0 = r0[r8]
            java.lang.String r0 = r0.f11633f
            boolean r8 = r3.add(r0)
            r44 = r3
            r45 = r4
            if (r8 == 0) goto L_0x01fd
            r3 = 0
            r8 = 0
        L_0x01c6:
            int r4 = r7.size()
            if (r8 >= r4) goto L_0x01f5
            java.lang.Object r4 = r7.get(r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r46 = r14
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r14 = r6.f11872b
            r20 = r14[r4]
            r22 = r36[r4]
            r21 = r0
            r23 = r1
            r24 = r13
            r25 = r11
            r26 = r9
            boolean r4 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3314b.m8373a(r20, r21, r22, r23, r24, r25, r26)
            if (r4 == 0) goto L_0x01f0
            int r3 = r3 + 1
        L_0x01f0:
            int r8 = r8 + 1
            r14 = r46
            goto L_0x01c6
        L_0x01f5:
            r46 = r14
            if (r3 <= r12) goto L_0x01ff
            r41 = r0
            r12 = r3
            goto L_0x01ff
        L_0x01fd:
            r46 = r14
        L_0x01ff:
            int r5 = r5 + 1
            r0 = r43
            r3 = r44
            r4 = r45
            r14 = r46
            goto L_0x01a2
        L_0x020a:
            r43 = r0
            r45 = r4
            r46 = r14
            goto L_0x021d
        L_0x0211:
            r43 = r0
            r45 = r4
            r42 = r8
            r40 = r12
            r46 = r14
            r41 = 0
        L_0x021d:
            int r0 = r7.size()
            r3 = 1
            int r0 = r0 - r3
        L_0x0223:
            if (r0 < 0) goto L_0x024b
            java.lang.Object r3 = r7.get(r0)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r4 = r6.f11872b
            r20 = r4[r3]
            r22 = r36[r3]
            r21 = r41
            r23 = r1
            r24 = r13
            r25 = r11
            r26 = r9
            boolean r3 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3314b.m8373a(r20, r21, r22, r23, r24, r25, r26)
            if (r3 != 0) goto L_0x0248
            r7.remove(r0)
        L_0x0248:
            int r0 = r0 + -1
            goto L_0x0223
        L_0x024b:
            int r0 = r7.size()
            r3 = 2
            if (r0 >= r3) goto L_0x0255
            int[] r7 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3314b.f11887e
            goto L_0x0270
        L_0x0255:
            int r0 = com.fyber.inneractive.sdk.player.exoplayer2.util.C3406u.f12148a
            int r0 = r7.size()
            int[] r3 = new int[r0]
            r4 = 0
        L_0x025e:
            if (r4 >= r0) goto L_0x026f
            java.lang.Object r5 = r7.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3[r4] = r5
            int r4 = r4 + 1
            goto L_0x025e
        L_0x026f:
            r7 = r3
        L_0x0270:
            int r0 = r7.length
            if (r0 <= 0) goto L_0x0278
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e r0 = r10.mo14456a(r6, r7)
            goto L_0x02a6
        L_0x0278:
            int r15 = r15 + 1
            r7 = r37
            r3 = r38
            r5 = r39
            r12 = r40
            r8 = r42
            r0 = r43
            r4 = r45
            r14 = r46
            goto L_0x015b
        L_0x028c:
            r43 = r0
            r38 = r3
            r45 = r4
            r39 = r5
            goto L_0x029f
        L_0x0295:
            r43 = r0
            r38 = r3
            r45 = r4
            r39 = r5
            r35 = r6
        L_0x029f:
            r37 = r7
            r42 = r8
            r46 = r14
            r0 = 0
        L_0x02a6:
            if (r0 != 0) goto L_0x0384
            r0 = 0
            r1 = 0
            r3 = 0
            r4 = -1
            r5 = -1
            r6 = 0
        L_0x02ae:
            int r7 = r2.f11875a
            if (r0 >= r7) goto L_0x0379
            com.fyber.inneractive.sdk.player.exoplayer2.source.r[] r7 = r2.f11876b
            r7 = r7[r0]
            r8 = r43
            r10 = r45
            r12 = r46
            java.util.List r14 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3314b.m8369a(r7, r8, r10, r12)
            r15 = r42[r0]
            r20 = r1
            r21 = r2
            r1 = 0
        L_0x02c7:
            int r2 = r7.f11871a
            if (r1 >= r2) goto L_0x0367
            r2 = r15[r1]
            r43 = r8
            r8 = r39
            boolean r2 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3314b.m8370a((int) r2, (boolean) r8)
            if (r2 == 0) goto L_0x0353
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r2 = r7.f11872b
            r2 = r2[r1]
            r22 = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            r23 = r7
            r7 = r14
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto L_0x0301
            int r6 = r2.f11637j
            r7 = -1
            if (r6 == r7) goto L_0x02f3
            if (r6 > r13) goto L_0x0301
        L_0x02f3:
            int r6 = r2.f11638k
            if (r6 == r7) goto L_0x02f9
            if (r6 > r11) goto L_0x0301
        L_0x02f9:
            int r6 = r2.f11629b
            if (r6 == r7) goto L_0x02ff
            if (r6 > r9) goto L_0x0301
        L_0x02ff:
            r6 = 1
            goto L_0x0302
        L_0x0301:
            r6 = 0
        L_0x0302:
            if (r6 != 0) goto L_0x0307
            if (r38 != 0) goto L_0x0307
            goto L_0x0357
        L_0x0307:
            r39 = r8
            if (r6 == 0) goto L_0x030d
            r7 = 2
            goto L_0x030e
        L_0x030d:
            r7 = 1
        L_0x030e:
            r8 = r15[r1]
            r24 = r9
            r9 = 0
            boolean r8 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3314b.m8370a((int) r8, (boolean) r9)
            if (r8 == 0) goto L_0x031b
            int r7 = r7 + 1000
        L_0x031b:
            if (r7 <= r3) goto L_0x031f
            r9 = 1
            goto L_0x0320
        L_0x031f:
            r9 = 0
        L_0x0320:
            if (r7 != r3) goto L_0x0343
            int r9 = r2.mo14324b()
            if (r9 == r4) goto L_0x0331
            int r9 = r2.mo14324b()
            int r9 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3314b.m8368a((int) r9, (int) r4)
            goto L_0x0337
        L_0x0331:
            int r9 = r2.f11629b
            int r9 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3314b.m8368a((int) r9, (int) r5)
        L_0x0337:
            if (r8 == 0) goto L_0x033e
            if (r6 == 0) goto L_0x033e
            if (r9 <= 0) goto L_0x0342
            goto L_0x0340
        L_0x033e:
            if (r9 >= 0) goto L_0x0342
        L_0x0340:
            r9 = 1
            goto L_0x0343
        L_0x0342:
            r9 = 0
        L_0x0343:
            if (r9 == 0) goto L_0x035b
            int r3 = r2.f11629b
            int r2 = r2.mo14324b()
            r20 = r1
            r4 = r2
            r5 = r3
            r3 = r7
            r6 = r23
            goto L_0x035d
        L_0x0353:
            r22 = r6
            r23 = r7
        L_0x0357:
            r39 = r8
            r24 = r9
        L_0x035b:
            r6 = r22
        L_0x035d:
            int r1 = r1 + 1
            r7 = r23
            r9 = r24
            r8 = r43
            goto L_0x02c7
        L_0x0367:
            r22 = r6
            r43 = r8
            r24 = r9
            int r0 = r0 + 1
            r45 = r10
            r46 = r12
            r1 = r20
            r2 = r21
            goto L_0x02ae
        L_0x0379:
            if (r6 != 0) goto L_0x037d
            r15 = 0
            goto L_0x0385
        L_0x037d:
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.c r0 = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.c
            r2 = 0
            r3 = 0
            r0.<init>(r6, r1, r3, r2)
        L_0x0384:
            r15 = r0
        L_0x0385:
            r34[r37] = r15
            if (r15 == 0) goto L_0x038b
            r8 = 1
            goto L_0x03a1
        L_0x038b:
            r8 = 0
            goto L_0x03a1
        L_0x038d:
            r33 = r3
            r30 = r4
            r34 = r5
            r35 = r6
            r37 = r7
            r28 = r9
            r32 = r10
            r27 = r11
            r29 = r12
            r31 = r14
        L_0x03a1:
            r0 = r32[r37]
            int r0 = r0.f11875a
            if (r0 <= 0) goto L_0x03a9
            r0 = 1
            goto L_0x03aa
        L_0x03a9:
            r0 = 0
        L_0x03aa:
            r0 = r31 | r0
            r14 = r0
            goto L_0x03c2
        L_0x03ae:
            r33 = r3
            r30 = r4
            r34 = r5
            r35 = r6
            r37 = r7
            r28 = r9
            r32 = r10
            r27 = r11
            r29 = r12
            r31 = r14
        L_0x03c2:
            int r7 = r37 + 1
            r1 = r47
            r0 = r48
            r2 = r49
            r13 = r19
            r11 = r27
            r9 = r28
            r12 = r29
            r4 = r30
            r10 = r32
            r3 = r33
            r5 = r34
            r6 = r35
            goto L_0x010c
        L_0x03de:
            r33 = r3
            r34 = r5
            r35 = r6
            r28 = r9
            r32 = r10
            r27 = r11
            r29 = r12
            r19 = r13
            r31 = r14
            r1 = r4
            r0 = 0
            r4 = 0
            r9 = 0
        L_0x03f4:
            if (r9 >= r1) goto L_0x064e
            r2 = r48
            r3 = r2[r9]
            int r5 = r3.f10343a
            r6 = 1
            if (r5 == r6) goto L_0x0525
            r6 = 2
            if (r5 == r6) goto L_0x051f
            r7 = 3
            if (r5 == r7) goto L_0x0479
            r3.getClass()
            r3 = r32[r9]
            r5 = r29[r9]
            r8 = r35
            boolean r10 = r8.f11901i
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x0414:
            int r15 = r3.f11875a
            if (r11 >= r15) goto L_0x0468
            com.fyber.inneractive.sdk.player.exoplayer2.source.r[] r15 = r3.f11876b
            r15 = r15[r11]
            r17 = r5[r11]
            r6 = 0
        L_0x041f:
            int r7 = r15.f11871a
            if (r6 >= r7) goto L_0x045f
            r7 = r17[r6]
            boolean r7 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3314b.m8370a((int) r7, (boolean) r10)
            if (r7 == 0) goto L_0x0454
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r7 = r15.f11872b
            r7 = r7[r6]
            int r7 = r7.f11651x
            r16 = 1
            r7 = r7 & 1
            if (r7 == 0) goto L_0x0439
            r7 = 1
            goto L_0x043a
        L_0x0439:
            r7 = 0
        L_0x043a:
            r30 = r1
            if (r7 == 0) goto L_0x0440
            r7 = 2
            goto L_0x0441
        L_0x0440:
            r7 = 1
        L_0x0441:
            r1 = r17[r6]
            r21 = r3
            r3 = 0
            boolean r1 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3314b.m8370a((int) r1, (boolean) r3)
            if (r1 == 0) goto L_0x044e
            int r7 = r7 + 1000
        L_0x044e:
            if (r7 <= r13) goto L_0x0458
            r12 = r6
            r13 = r7
            r14 = r15
            goto L_0x0458
        L_0x0454:
            r30 = r1
            r21 = r3
        L_0x0458:
            int r6 = r6 + 1
            r3 = r21
            r1 = r30
            goto L_0x041f
        L_0x045f:
            r30 = r1
            r21 = r3
            int r11 = r11 + 1
            r6 = 2
            r7 = 3
            goto L_0x0414
        L_0x0468:
            r30 = r1
            if (r14 != 0) goto L_0x046e
            r1 = 0
            goto L_0x0475
        L_0x046e:
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.c r1 = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.c
            r3 = 0
            r5 = 0
            r1.<init>(r14, r12, r5, r3)
        L_0x0475:
            r34[r9] = r1
            goto L_0x0641
        L_0x0479:
            r30 = r1
            r8 = r35
            if (r0 != 0) goto L_0x0641
            r0 = r32[r9]
            r1 = r29[r9]
            java.lang.String r3 = r8.f11894b
            java.lang.String r5 = r8.f11893a
            boolean r6 = r8.f11901i
            r7 = 0
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x048d:
            int r13 = r0.f11875a
            if (r7 >= r13) goto L_0x0504
            com.fyber.inneractive.sdk.player.exoplayer2.source.r[] r13 = r0.f11876b
            r13 = r13[r7]
            r14 = r1[r7]
            r17 = r0
            r15 = 0
        L_0x049a:
            int r0 = r13.f11871a
            if (r15 >= r0) goto L_0x04fb
            r0 = r14[r15]
            boolean r0 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3314b.m8370a((int) r0, (boolean) r6)
            if (r0 == 0) goto L_0x04f0
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r0 = r13.f11872b
            r0 = r0[r15]
            r21 = r1
            int r1 = r0.f11651x
            r22 = r1 & 1
            if (r22 == 0) goto L_0x04b5
            r22 = 1
            goto L_0x04b7
        L_0x04b5:
            r22 = 0
        L_0x04b7:
            r1 = r1 & 2
            if (r1 == 0) goto L_0x04bd
            r1 = 1
            goto L_0x04be
        L_0x04bd:
            r1 = 0
        L_0x04be:
            boolean r23 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3314b.m8372a((com.fyber.inneractive.sdk.player.exoplayer2.C3226i) r0, (java.lang.String) r3)
            if (r23 == 0) goto L_0x04ce
            if (r22 == 0) goto L_0x04c8
            r0 = 6
            goto L_0x04dd
        L_0x04c8:
            if (r1 != 0) goto L_0x04cc
            r0 = 5
            goto L_0x04dd
        L_0x04cc:
            r0 = 4
            goto L_0x04dd
        L_0x04ce:
            if (r22 == 0) goto L_0x04d2
            r0 = 3
            goto L_0x04dd
        L_0x04d2:
            if (r1 == 0) goto L_0x04f2
            boolean r0 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3314b.m8372a((com.fyber.inneractive.sdk.player.exoplayer2.C3226i) r0, (java.lang.String) r5)
            if (r0 == 0) goto L_0x04dc
            r0 = 2
            goto L_0x04dd
        L_0x04dc:
            r0 = 1
        L_0x04dd:
            r1 = r14[r15]
            r22 = r3
            r3 = 0
            boolean r1 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3314b.m8370a((int) r1, (boolean) r3)
            if (r1 == 0) goto L_0x04ea
            int r0 = r0 + 1000
        L_0x04ea:
            if (r0 <= r11) goto L_0x04f4
            r11 = r0
            r12 = r13
            r10 = r15
            goto L_0x04f4
        L_0x04f0:
            r21 = r1
        L_0x04f2:
            r22 = r3
        L_0x04f4:
            int r15 = r15 + 1
            r1 = r21
            r3 = r22
            goto L_0x049a
        L_0x04fb:
            r21 = r1
            r22 = r3
            int r7 = r7 + 1
            r0 = r17
            goto L_0x048d
        L_0x0504:
            if (r12 != 0) goto L_0x0508
            r0 = 0
            goto L_0x050f
        L_0x0508:
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.c r0 = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.c
            r1 = 0
            r3 = 0
            r0.<init>(r12, r10, r3, r1)
        L_0x050f:
            r34[r9] = r0
            r35 = r8
            if (r0 == 0) goto L_0x051a
            r0 = 1
            r21 = 1
            goto L_0x0646
        L_0x051a:
            r0 = 1
            r21 = 0
            goto L_0x0646
        L_0x051f:
            r30 = r1
            r21 = r0
            goto L_0x0645
        L_0x0525:
            r30 = r1
            r8 = r35
            if (r4 != 0) goto L_0x0641
            r1 = r32[r9]
            r3 = r29[r9]
            java.lang.String r4 = r8.f11893a
            boolean r5 = r8.f11901i
            boolean r6 = r8.f11895c
            if (r31 == 0) goto L_0x053b
            r7 = r33
            r10 = 0
            goto L_0x053f
        L_0x053b:
            r7 = r33
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e$a r10 = r7.f11888c
        L_0x053f:
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
        L_0x0543:
            int r15 = r1.f11875a
            if (r13 >= r15) goto L_0x05af
            com.fyber.inneractive.sdk.player.exoplayer2.source.r[] r15 = r1.f11876b
            r15 = r15[r13]
            r17 = r3[r13]
            r21 = r0
            r33 = r7
            r0 = r14
            r14 = r12
            r12 = r11
            r11 = 0
        L_0x0555:
            int r7 = r15.f11871a
            if (r11 >= r7) goto L_0x05a1
            r7 = r17[r11]
            boolean r7 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3314b.m8370a((int) r7, (boolean) r5)
            if (r7 == 0) goto L_0x0596
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r7 = r15.f11872b
            r7 = r7[r11]
            r22 = r5
            r5 = r17[r11]
            r35 = r8
            int r8 = r7.f11651x
            r16 = 1
            r8 = r8 & 1
            if (r8 == 0) goto L_0x0575
            r8 = 1
            goto L_0x0576
        L_0x0575:
            r8 = 0
        L_0x0576:
            boolean r7 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3314b.m8372a((com.fyber.inneractive.sdk.player.exoplayer2.C3226i) r7, (java.lang.String) r4)
            if (r7 == 0) goto L_0x0582
            if (r8 == 0) goto L_0x0580
            r7 = 4
            goto L_0x0587
        L_0x0580:
            r7 = 3
            goto L_0x0587
        L_0x0582:
            if (r8 == 0) goto L_0x0586
            r7 = 2
            goto L_0x0587
        L_0x0586:
            r7 = 1
        L_0x0587:
            r8 = 0
            boolean r5 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3314b.m8370a((int) r5, (boolean) r8)
            if (r5 == 0) goto L_0x0590
            int r7 = r7 + 1000
        L_0x0590:
            if (r7 <= r0) goto L_0x059a
            r0 = r7
            r14 = r11
            r12 = r13
            goto L_0x059a
        L_0x0596:
            r22 = r5
            r35 = r8
        L_0x059a:
            int r11 = r11 + 1
            r5 = r22
            r8 = r35
            goto L_0x0555
        L_0x05a1:
            r22 = r5
            r35 = r8
            int r13 = r13 + 1
            r11 = r12
            r12 = r14
            r7 = r33
            r14 = r0
            r0 = r21
            goto L_0x0543
        L_0x05af:
            r21 = r0
            r33 = r7
            r35 = r8
            r0 = -1
            if (r11 != r0) goto L_0x05bc
            r0 = 1
            r1 = 0
            goto L_0x0639
        L_0x05bc:
            com.fyber.inneractive.sdk.player.exoplayer2.source.r[] r1 = r1.f11876b
            r1 = r1[r11]
            if (r10 == 0) goto L_0x0632
            r3 = r3[r11]
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r5 = 0
            r7 = 0
            r8 = 0
        L_0x05cc:
            int r11 = r1.f11871a
            if (r5 >= r11) goto L_0x0609
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r11 = r1.f11872b
            r11 = r11[r5]
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b$a r13 = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b$a
            int r14 = r11.f11645r
            int r15 = r11.f11646s
            if (r6 == 0) goto L_0x05de
            r11 = 0
            goto L_0x05e0
        L_0x05de:
            java.lang.String r11 = r11.f11633f
        L_0x05e0:
            r13.<init>(r14, r15, r11)
            boolean r11 = r4.add(r13)
            if (r11 == 0) goto L_0x0605
            r11 = 0
            r14 = 0
        L_0x05eb:
            int r15 = r1.f11871a
            if (r11 >= r15) goto L_0x0601
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r15 = r1.f11872b
            r15 = r15[r11]
            r0 = r3[r11]
            boolean r0 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3314b.m8371a(r15, r0, r13)
            if (r0 == 0) goto L_0x05fd
            int r14 = r14 + 1
        L_0x05fd:
            int r11 = r11 + 1
            r0 = -1
            goto L_0x05eb
        L_0x0601:
            if (r14 <= r7) goto L_0x0605
            r8 = r13
            r7 = r14
        L_0x0605:
            int r5 = r5 + 1
            r0 = -1
            goto L_0x05cc
        L_0x0609:
            r0 = 1
            if (r7 <= r0) goto L_0x0628
            int[] r4 = new int[r7]
            r5 = 0
            r6 = 0
        L_0x0610:
            int r7 = r1.f11871a
            if (r5 >= r7) goto L_0x062a
            com.fyber.inneractive.sdk.player.exoplayer2.i[] r7 = r1.f11872b
            r7 = r7[r5]
            r11 = r3[r5]
            boolean r7 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3314b.m8371a(r7, r11, r8)
            if (r7 == 0) goto L_0x0625
            int r7 = r6 + 1
            r4[r6] = r5
            r6 = r7
        L_0x0625:
            int r5 = r5 + 1
            goto L_0x0610
        L_0x0628:
            int[] r4 = com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3314b.f11887e
        L_0x062a:
            int r3 = r4.length
            if (r3 <= 0) goto L_0x0633
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.e r1 = r10.mo14456a(r1, r4)
            goto L_0x0639
        L_0x0632:
            r0 = 1
        L_0x0633:
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.c r3 = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.c
            r3.<init>(r1, r12)
            r1 = r3
        L_0x0639:
            r34[r9] = r1
            if (r1 == 0) goto L_0x063f
            r4 = 1
            goto L_0x0646
        L_0x063f:
            r4 = 0
            goto L_0x0646
        L_0x0641:
            r21 = r0
            r35 = r8
        L_0x0645:
            r0 = 1
        L_0x0646:
            int r9 = r9 + 1
            r0 = r21
            r1 = r30
            goto L_0x03f4
        L_0x064e:
            r2 = r48
            r0 = 1
            r9 = 0
        L_0x0652:
            int r1 = r2.length
            if (r9 >= r1) goto L_0x069c
            r1 = r47
            android.util.SparseBooleanArray r3 = r1.f11908b
            boolean r3 = r3.get(r9)
            if (r3 == 0) goto L_0x0665
            r3 = 0
            r34[r9] = r3
            r4 = r3
        L_0x0663:
            r3 = 0
            goto L_0x0699
        L_0x0665:
            r3 = r32[r9]
            android.util.SparseArray<java.util.Map<com.fyber.inneractive.sdk.player.exoplayer2.source.s, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d$b>> r4 = r1.f11907a
            java.lang.Object r4 = r4.get(r9)
            java.util.Map r4 = (java.util.Map) r4
            if (r4 == 0) goto L_0x0679
            boolean r4 = r4.containsKey(r3)
            if (r4 == 0) goto L_0x0679
            r4 = 1
            goto L_0x067a
        L_0x0679:
            r4 = 0
        L_0x067a:
            if (r4 == 0) goto L_0x0697
            android.util.SparseArray<java.util.Map<com.fyber.inneractive.sdk.player.exoplayer2.source.s, com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d$b>> r4 = r1.f11907a
            java.lang.Object r4 = r4.get(r9)
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r4 = r4.get(r3)
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d$b r4 = (com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3318d.C3320b) r4
            if (r4 != 0) goto L_0x0690
            r4 = 0
            r34[r9] = r4
            goto L_0x0663
        L_0x0690:
            r4 = 0
            com.fyber.inneractive.sdk.player.exoplayer2.source.r[] r0 = r3.f11876b
            r3 = 0
            r0 = r0[r3]
            throw r4
        L_0x0697:
            r3 = 0
            r4 = 0
        L_0x0699:
            int r9 = r9 + 1
            goto L_0x0652
        L_0x069c:
            r1 = r47
            r3 = 0
            r4 = 0
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d$a r0 = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.d$a
            r8 = r0
            r9 = r28
            r10 = r32
            r11 = r27
            r12 = r29
            r13 = r19
            r8.<init>(r9, r10, r11, r12, r13)
            int r5 = r2.length
            com.fyber.inneractive.sdk.player.exoplayer2.o[] r5 = new com.fyber.inneractive.sdk.player.exoplayer2.C3269o[r5]
            r7 = 0
        L_0x06b4:
            int r3 = r2.length
            if (r7 >= r3) goto L_0x06c4
            r3 = r34[r7]
            if (r3 == 0) goto L_0x06be
            com.fyber.inneractive.sdk.player.exoplayer2.o r3 = com.fyber.inneractive.sdk.player.exoplayer2.C3269o.f11751b
            goto L_0x06bf
        L_0x06be:
            r3 = r4
        L_0x06bf:
            r5[r7] = r3
            int r7 = r7 + 1
            goto L_0x06b4
        L_0x06c4:
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h r2 = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h
            com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f r3 = new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.f
            r4 = r34
            r3.<init>(r4)
            r4 = r49
            r2.<init>(r4, r3, r0, r5)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C3318d.mo14454a(com.fyber.inneractive.sdk.player.exoplayer2.a[], com.fyber.inneractive.sdk.player.exoplayer2.source.s):com.fyber.inneractive.sdk.player.exoplayer2.trackselection.h");
    }

    /* renamed from: a */
    public final void mo14455a(Object obj) {
        C3319a aVar = (C3319a) obj;
    }
}
