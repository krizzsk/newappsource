package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.source.TrackGroupArray;
import p252sb.C6506f;

/* renamed from: com.google.android.exoplayer2.trackselection.c */
public abstract class C4000c extends C6506f {

    /* renamed from: c */
    public C4001a f14145c;

    /* renamed from: com.google.android.exoplayer2.trackselection.c$a */
    public static final class C4001a {

        /* renamed from: a */
        public final int f14146a;

        /* renamed from: b */
        public final int[] f14147b;

        /* renamed from: c */
        public final TrackGroupArray[] f14148c;

        /* renamed from: d */
        public final int[][][] f14149d;

        public C4001a(int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3) {
            this.f14147b = iArr;
            this.f14148c = trackGroupArrayArr;
            this.f14149d = iArr3;
            this.f14146a = iArr.length;
        }
    }

    /* renamed from: a */
    public final void mo16341a(Object obj) {
        this.f14145c = (C4001a) obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0573, code lost:
        if (com.google.common.collect.C14420p.f36310a.mo43228c(r14.f14082c, r7.f14082c).mo43228c(r14.f14081b, r7.f14081b).mo43230e() > 0) goto L_0x0575;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x0882, code lost:
        if (r4 == 2) goto L_0x0888;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x08cc, code lost:
        r2 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x028a A[LOOP:8: B:65:0x015c->B:108:0x028a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x04b2  */
    /* JADX WARNING: Removed duplicated region for block: B:403:0x0864  */
    /* JADX WARNING: Removed duplicated region for block: B:404:0x0867  */
    /* JADX WARNING: Removed duplicated region for block: B:471:0x0283 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p252sb.C6508g mo16342b(p099ga.C4952y0[] r49, com.google.android.exoplayer2.source.TrackGroupArray r50) throws com.google.android.exoplayer2.ExoPlaybackException {
        /*
            r48 = this;
            r0 = r49
            r1 = r50
            int r2 = r0.length
            r3 = 1
            int r2 = r2 + r3
            int[] r2 = new int[r2]
            int r4 = r0.length
            int r4 = r4 + r3
            com.google.android.exoplayer2.source.TrackGroup[][] r5 = new com.google.android.exoplayer2.source.TrackGroup[r4][]
            int r6 = r0.length
            int r6 = r6 + r3
            int[][][] r6 = new int[r6][][]
            r7 = 0
            r8 = 0
        L_0x0013:
            if (r8 >= r4) goto L_0x0022
            int r9 = r1.f14012b
            com.google.android.exoplayer2.source.TrackGroup[] r10 = new com.google.android.exoplayer2.source.TrackGroup[r9]
            r5[r8] = r10
            int[][] r9 = new int[r9][]
            r6[r8] = r9
            int r8 = r8 + 1
            goto L_0x0013
        L_0x0022:
            int r4 = r0.length
            int[] r8 = new int[r4]
            r9 = 0
        L_0x0026:
            if (r9 >= r4) goto L_0x0033
            r10 = r0[r9]
            int r10 = r10.mo15824p()
            r8[r9] = r10
            int r9 = r9 + 1
            goto L_0x0026
        L_0x0033:
            r4 = 0
        L_0x0034:
            int r9 = r1.f14012b
            if (r4 >= r9) goto L_0x00c6
            com.google.android.exoplayer2.source.TrackGroup[] r9 = r1.f14013c
            r9 = r9[r4]
            com.google.android.exoplayer2.Format[] r11 = r9.f14009c
            r11 = r11[r7]
            java.lang.String r11 = r11.f13418m
            int r11 = p277ub.C6792n.m15994g(r11)
            r12 = 5
            if (r11 != r12) goto L_0x004b
            r11 = 1
            goto L_0x004c
        L_0x004b:
            r11 = 0
        L_0x004c:
            int r12 = r0.length
            r13 = 0
            r14 = 0
            r15 = 1
        L_0x0050:
            int r7 = r0.length
            if (r13 >= r7) goto L_0x008f
            r7 = r0[r13]
            r3 = 0
            r16 = 0
        L_0x0058:
            int r10 = r9.f14008b
            if (r3 >= r10) goto L_0x0073
            com.google.android.exoplayer2.Format[] r10 = r9.f14009c
            r10 = r10[r3]
            int r10 = r7.mo16040c(r10)
            r17 = 7
            r10 = r10 & 7
            r1 = r16
            int r16 = java.lang.Math.max(r1, r10)
            int r3 = r3 + 1
            r1 = r50
            goto L_0x0058
        L_0x0073:
            r1 = r16
            r3 = r2[r13]
            if (r3 != 0) goto L_0x007b
            r3 = 1
            goto L_0x007c
        L_0x007b:
            r3 = 0
        L_0x007c:
            if (r1 > r14) goto L_0x0086
            if (r1 != r14) goto L_0x0089
            if (r11 == 0) goto L_0x0089
            if (r15 != 0) goto L_0x0089
            if (r3 == 0) goto L_0x0089
        L_0x0086:
            r14 = r1
            r15 = r3
            r12 = r13
        L_0x0089:
            int r13 = r13 + 1
            r1 = r50
            r3 = 1
            goto L_0x0050
        L_0x008f:
            int r1 = r0.length
            if (r12 != r1) goto L_0x0097
            int r1 = r9.f14008b
            int[] r1 = new int[r1]
            goto L_0x00b0
        L_0x0097:
            r1 = r0[r12]
            int r3 = r9.f14008b
            int[] r3 = new int[r3]
            r7 = 0
        L_0x009e:
            int r10 = r9.f14008b
            if (r7 >= r10) goto L_0x00af
            com.google.android.exoplayer2.Format[] r10 = r9.f14009c
            r10 = r10[r7]
            int r10 = r1.mo16040c(r10)
            r3[r7] = r10
            int r7 = r7 + 1
            goto L_0x009e
        L_0x00af:
            r1 = r3
        L_0x00b0:
            r3 = r2[r12]
            r7 = r5[r12]
            r7[r3] = r9
            r7 = r6[r12]
            r7[r3] = r1
            r1 = 1
            int r3 = r3 + r1
            r2[r12] = r3
            int r4 = r4 + 1
            r1 = r50
            r3 = 1
            r7 = 0
            goto L_0x0034
        L_0x00c6:
            int r1 = r0.length
            com.google.android.exoplayer2.source.TrackGroupArray[] r1 = new com.google.android.exoplayer2.source.TrackGroupArray[r1]
            int r3 = r0.length
            java.lang.String[] r3 = new java.lang.String[r3]
            int r4 = r0.length
            int[] r4 = new int[r4]
            r7 = 0
        L_0x00d0:
            int r9 = r0.length
            if (r7 >= r9) goto L_0x0101
            r9 = r2[r7]
            com.google.android.exoplayer2.source.TrackGroupArray r10 = new com.google.android.exoplayer2.source.TrackGroupArray
            r11 = r5[r7]
            java.lang.Object[] r11 = p277ub.C6774a0.m15965y(r9, r11)
            com.google.android.exoplayer2.source.TrackGroup[] r11 = (com.google.android.exoplayer2.source.TrackGroup[]) r11
            r10.<init>((com.google.android.exoplayer2.source.TrackGroup[]) r11)
            r1[r7] = r10
            r10 = r6[r7]
            java.lang.Object[] r9 = p277ub.C6774a0.m15965y(r9, r10)
            int[][] r9 = (int[][]) r9
            r6[r7] = r9
            r9 = r0[r7]
            java.lang.String r9 = r9.getName()
            r3[r7] = r9
            r9 = r0[r7]
            com.google.android.exoplayer2.a r9 = (com.google.android.exoplayer2.C3873a) r9
            int r9 = r9.f13462b
            r4[r7] = r9
            int r7 = r7 + 1
            goto L_0x00d0
        L_0x0101:
            int r3 = r0.length
            r2 = r2[r3]
            com.google.android.exoplayer2.source.TrackGroupArray r3 = new com.google.android.exoplayer2.source.TrackGroupArray
            int r0 = r0.length
            r0 = r5[r0]
            java.lang.Object[] r0 = p277ub.C6774a0.m15965y(r2, r0)
            com.google.android.exoplayer2.source.TrackGroup[] r0 = (com.google.android.exoplayer2.source.TrackGroup[]) r0
            r3.<init>((com.google.android.exoplayer2.source.TrackGroup[]) r0)
            com.google.android.exoplayer2.trackselection.c$a r0 = new com.google.android.exoplayer2.trackselection.c$a
            r0.<init>(r4, r1, r8, r6)
            r1 = r48
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector r1 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector) r1
            java.util.concurrent.atomic.AtomicReference<com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters> r2 = r1.f14033e
            java.lang.Object r2 = r2.get()
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$Parameters r2 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.Parameters) r2
            int r3 = r0.f14146a
            com.google.android.exoplayer2.trackselection.b$a[] r4 = new com.google.android.exoplayer2.trackselection.C3997b.C3998a[r3]
            r10 = r0
            r11 = r2
            r5 = 0
            r7 = 0
            r9 = 0
        L_0x012c:
            r12 = 2
            if (r5 >= r3) goto L_0x0380
            int[] r15 = r10.f14147b
            r15 = r15[r5]
            if (r12 != r15) goto L_0x0361
            if (r9 != 0) goto L_0x0342
            com.google.android.exoplayer2.source.TrackGroupArray[] r9 = r10.f14148c
            r9 = r9[r5]
            r10 = r6[r5]
            r15 = r8[r5]
            boolean r14 = r11.f14039E
            if (r14 != 0) goto L_0x02a7
            boolean r14 = r11.f14038D
            if (r14 != 0) goto L_0x02a7
            boolean r14 = r11.f14055r
            if (r14 == 0) goto L_0x014e
            r14 = 24
            goto L_0x0150
        L_0x014e:
            r14 = 16
        L_0x0150:
            boolean r13 = r11.f14054q
            if (r13 == 0) goto L_0x015a
            r13 = r15 & r14
            if (r13 == 0) goto L_0x015a
            r13 = 1
            goto L_0x015b
        L_0x015a:
            r13 = 0
        L_0x015b:
            r15 = 0
        L_0x015c:
            int r12 = r9.f14012b
            if (r15 >= r12) goto L_0x02a7
            com.google.android.exoplayer2.source.TrackGroup[] r12 = r9.f14013c
            r12 = r12[r15]
            r30 = r10[r15]
            r31 = r1
            int r1 = r11.f14045h
            r32 = r8
            int r8 = r11.f14046i
            r33 = r6
            int r6 = r11.f14047j
            r34 = r3
            int r3 = r11.f14048k
            r35 = r7
            int r7 = r11.f14049l
            r36 = r0
            int r0 = r11.f14050m
            r37 = r4
            int r4 = r11.f14051n
            r38 = r5
            int r5 = r11.f14052o
            r39 = r10
            int r10 = r11.f14056s
            r40 = r2
            int r2 = r11.f14057t
            boolean r11 = r11.f14058u
            r41 = r9
            int r9 = r12.f14008b
            r42 = r15
            r15 = 2
            if (r9 >= r15) goto L_0x019c
            int[] r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.f14029f
            goto L_0x01a8
        L_0x019c:
            java.util.ArrayList r2 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.m10669e(r12, r10, r2, r11)
            int r9 = r2.size()
            if (r9 >= r15) goto L_0x01ac
            int[] r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.f14029f
        L_0x01a8:
            r44 = r13
            goto L_0x0280
        L_0x01ac:
            if (r13 != 0) goto L_0x0230
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            r11 = 0
            r15 = 0
            r43 = 0
        L_0x01b7:
            int r10 = r2.size()
            if (r11 >= r10) goto L_0x022b
            java.lang.Object r10 = r2.get(r11)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            r44 = r13
            com.google.android.exoplayer2.Format[] r13 = r12.f14009c
            r10 = r13[r10]
            java.lang.String r10 = r10.f13418m
            boolean r13 = r9.add(r10)
            if (r13 == 0) goto L_0x021c
            r45 = r9
            r46 = r11
            r9 = 0
            r13 = 0
        L_0x01db:
            int r11 = r2.size()
            if (r13 >= r11) goto L_0x0214
            java.lang.Object r11 = r2.get(r13)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r47 = r2
            com.google.android.exoplayer2.Format[] r2 = r12.f14009c
            r18 = r2[r11]
            r20 = r30[r11]
            r19 = r10
            r21 = r14
            r22 = r1
            r23 = r8
            r24 = r6
            r25 = r3
            r26 = r7
            r27 = r0
            r28 = r4
            r29 = r5
            boolean r2 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.m10671g(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            if (r2 == 0) goto L_0x020f
            int r9 = r9 + 1
        L_0x020f:
            int r13 = r13 + 1
            r2 = r47
            goto L_0x01db
        L_0x0214:
            r47 = r2
            if (r9 <= r15) goto L_0x0222
            r15 = r9
            r43 = r10
            goto L_0x0222
        L_0x021c:
            r47 = r2
            r45 = r9
            r46 = r11
        L_0x0222:
            int r11 = r46 + 1
            r13 = r44
            r9 = r45
            r2 = r47
            goto L_0x01b7
        L_0x022b:
            r47 = r2
            r44 = r13
            goto L_0x0236
        L_0x0230:
            r47 = r2
            r44 = r13
            r43 = 0
        L_0x0236:
            int r2 = r47.size()
        L_0x023a:
            r9 = -1
            int r2 = r2 + r9
            if (r2 < 0) goto L_0x0270
            r9 = r47
            java.lang.Object r10 = r9.get(r2)
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            com.google.android.exoplayer2.Format[] r11 = r12.f14009c
            r18 = r11[r10]
            r20 = r30[r10]
            r19 = r43
            r21 = r14
            r22 = r1
            r23 = r8
            r24 = r6
            r25 = r3
            r26 = r7
            r27 = r0
            r28 = r4
            r29 = r5
            boolean r10 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.m10671g(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            if (r10 != 0) goto L_0x026d
            r9.remove(r2)
        L_0x026d:
            r47 = r9
            goto L_0x023a
        L_0x0270:
            r9 = r47
            int r0 = r9.size()
            r1 = 2
            if (r0 >= r1) goto L_0x027c
            int[] r0 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.f14029f
            goto L_0x0280
        L_0x027c:
            int[] r0 = com.google.common.primitives.Ints.m35901w(r9)
        L_0x0280:
            int r1 = r0.length
            if (r1 <= 0) goto L_0x028a
            com.google.android.exoplayer2.trackselection.b$a r1 = new com.google.android.exoplayer2.trackselection.b$a
            r2 = 0
            r1.<init>(r12, r0, r2)
            goto L_0x02be
        L_0x028a:
            int r15 = r42 + 1
            r1 = r31
            r8 = r32
            r6 = r33
            r3 = r34
            r7 = r35
            r0 = r36
            r4 = r37
            r5 = r38
            r10 = r39
            r2 = r40
            r11 = r2
            r9 = r41
            r13 = r44
            goto L_0x015c
        L_0x02a7:
            r36 = r0
            r31 = r1
            r40 = r2
            r34 = r3
            r37 = r4
            r38 = r5
            r33 = r6
            r35 = r7
            r32 = r8
            r41 = r9
            r39 = r10
            r1 = 0
        L_0x02be:
            if (r1 != 0) goto L_0x0334
            r3 = r41
            r0 = 0
            r1 = 0
            r2 = 0
            r13 = -1
        L_0x02c6:
            int r4 = r3.f14012b
            if (r2 >= r4) goto L_0x0321
            com.google.android.exoplayer2.source.TrackGroup[] r4 = r3.f14013c
            r4 = r4[r2]
            r5 = r40
            int r6 = r5.f14056s
            int r7 = r5.f14057t
            boolean r8 = r5.f14058u
            java.util.ArrayList r6 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.m10669e(r4, r6, r7, r8)
            r7 = r39[r2]
            r8 = 0
        L_0x02dd:
            int r9 = r4.f14008b
            if (r8 >= r9) goto L_0x031c
            com.google.android.exoplayer2.Format[] r9 = r4.f14009c
            r9 = r9[r8]
            int r10 = r9.f13411f
            r10 = r10 & 16384(0x4000, float:2.2959E-41)
            if (r10 == 0) goto L_0x02ec
            goto L_0x0319
        L_0x02ec:
            r10 = r7[r8]
            boolean r11 = r5.f14040F
            boolean r10 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.m10670f(r10, r11)
            if (r10 == 0) goto L_0x0319
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$e r10 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$e
            r11 = r7[r8]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            boolean r12 = r6.contains(r12)
            r10.<init>(r9, r5, r11, r12)
            boolean r9 = r10.f14121b
            if (r9 != 0) goto L_0x030e
            boolean r9 = r5.f14053p
            if (r9 != 0) goto L_0x030e
            goto L_0x0319
        L_0x030e:
            if (r1 == 0) goto L_0x0316
            int r9 = r10.compareTo(r1)
            if (r9 <= 0) goto L_0x0319
        L_0x0316:
            r0 = r4
            r13 = r8
            r1 = r10
        L_0x0319:
            int r8 = r8 + 1
            goto L_0x02dd
        L_0x031c:
            int r2 = r2 + 1
            r40 = r5
            goto L_0x02c6
        L_0x0321:
            r5 = r40
            if (r0 != 0) goto L_0x0327
            r14 = 0
            goto L_0x0332
        L_0x0327:
            com.google.android.exoplayer2.trackselection.b$a r14 = new com.google.android.exoplayer2.trackselection.b$a
            r1 = 1
            int[] r2 = new int[r1]
            r1 = 0
            r2[r1] = r13
            r14.<init>(r0, r2, r1)
        L_0x0332:
            r1 = r14
            goto L_0x0336
        L_0x0334:
            r5 = r40
        L_0x0336:
            r37[r38] = r1
            if (r1 == 0) goto L_0x033c
            r0 = 1
            goto L_0x033d
        L_0x033c:
            r0 = 0
        L_0x033d:
            r9 = r0
            r11 = r5
            r0 = r36
            goto L_0x0351
        L_0x0342:
            r31 = r1
            r34 = r3
            r37 = r4
            r38 = r5
            r33 = r6
            r35 = r7
            r32 = r8
            r5 = r2
        L_0x0351:
            com.google.android.exoplayer2.source.TrackGroupArray[] r1 = r0.f14148c
            r1 = r1[r38]
            int r1 = r1.f14012b
            if (r1 <= 0) goto L_0x035b
            r1 = 1
            goto L_0x035c
        L_0x035b:
            r1 = 0
        L_0x035c:
            r1 = r35 | r1
            r10 = r0
            r7 = r1
            goto L_0x0370
        L_0x0361:
            r31 = r1
            r34 = r3
            r37 = r4
            r38 = r5
            r33 = r6
            r35 = r7
            r32 = r8
            r5 = r2
        L_0x0370:
            int r1 = r38 + 1
            r2 = r5
            r8 = r32
            r6 = r33
            r3 = r34
            r4 = r37
            r5 = r1
            r1 = r31
            goto L_0x012c
        L_0x0380:
            r31 = r1
            r5 = r2
            r37 = r4
            r33 = r6
            r35 = r7
            r32 = r8
            r6 = r3
            r1 = 0
            r2 = 0
            r3 = -1
            r4 = 0
        L_0x0390:
            if (r4 >= r6) goto L_0x050a
            int[] r7 = r10.f14147b
            r7 = r7[r4]
            r8 = 1
            if (r8 != r7) goto L_0x04f2
            boolean r7 = r11.f14042H
            if (r7 != 0) goto L_0x03a2
            if (r35 != 0) goto L_0x03a0
            goto L_0x03a2
        L_0x03a0:
            r7 = 0
            goto L_0x03a3
        L_0x03a2:
            r7 = 1
        L_0x03a3:
            com.google.android.exoplayer2.source.TrackGroupArray[] r8 = r10.f14148c
            r8 = r8[r4]
            r9 = r33[r4]
            r10 = r32[r4]
            r10 = 0
            r12 = -1
            r13 = -1
            r14 = 0
        L_0x03af:
            int r15 = r8.f14012b
            if (r14 >= r15) goto L_0x0404
            com.google.android.exoplayer2.source.TrackGroup[] r15 = r8.f14013c
            r15 = r15[r14]
            r18 = r9[r14]
            r19 = r12
            r20 = r13
            r12 = 0
        L_0x03be:
            int r13 = r15.f14008b
            if (r12 >= r13) goto L_0x03fb
            r13 = r18[r12]
            r21 = r1
            boolean r1 = r11.f14040F
            boolean r1 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.m10670f(r13, r1)
            if (r1 == 0) goto L_0x03f2
            com.google.android.exoplayer2.Format[] r1 = r15.f14009c
            r1 = r1[r12]
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$a r13 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$a
            r22 = r15
            r15 = r18[r12]
            r13.<init>(r1, r11, r15)
            boolean r1 = r13.f14067b
            if (r1 != 0) goto L_0x03e4
            boolean r1 = r11.f14062y
            if (r1 != 0) goto L_0x03e4
            goto L_0x03f4
        L_0x03e4:
            if (r10 == 0) goto L_0x03ec
            int r1 = r13.compareTo(r10)
            if (r1 <= 0) goto L_0x03f4
        L_0x03ec:
            r20 = r12
            r10 = r13
            r19 = r14
            goto L_0x03f4
        L_0x03f2:
            r22 = r15
        L_0x03f4:
            int r12 = r12 + 1
            r1 = r21
            r15 = r22
            goto L_0x03be
        L_0x03fb:
            r21 = r1
            int r14 = r14 + 1
            r12 = r19
            r13 = r20
            goto L_0x03af
        L_0x0404:
            r21 = r1
            r1 = -1
            if (r12 != r1) goto L_0x0414
            r36 = r0
            r18 = r4
            r40 = r5
            r34 = r6
            r0 = 0
            goto L_0x04c3
        L_0x0414:
            com.google.android.exoplayer2.source.TrackGroup[] r1 = r8.f14013c
            r1 = r1[r12]
            boolean r8 = r11.f14039E
            if (r8 != 0) goto L_0x04a6
            boolean r8 = r11.f14038D
            if (r8 != 0) goto L_0x04a6
            if (r7 == 0) goto L_0x04a6
            r7 = r9[r12]
            int r8 = r11.f14061x
            boolean r9 = r11.f14063z
            boolean r12 = r11.f14035A
            boolean r11 = r11.f14036B
            com.google.android.exoplayer2.Format[] r14 = r1.f14009c
            r14 = r14[r13]
            int r15 = r1.f14008b
            int[] r15 = new int[r15]
            r36 = r0
            r40 = r5
            r34 = r6
            r0 = 0
            r5 = 0
        L_0x043c:
            int r6 = r1.f14008b
            if (r5 >= r6) goto L_0x0493
            if (r5 == r13) goto L_0x0483
            com.google.android.exoplayer2.Format[] r6 = r1.f14009c
            r6 = r6[r5]
            r18 = r4
            r4 = r7[r5]
            r19 = r7
            r7 = 0
            boolean r4 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.m10670f(r4, r7)
            if (r4 == 0) goto L_0x047f
            int r4 = r6.f13414i
            r7 = -1
            if (r4 == r7) goto L_0x047f
            if (r4 > r8) goto L_0x047f
            if (r11 != 0) goto L_0x0464
            int r4 = r6.f13431z
            if (r4 == r7) goto L_0x047f
            int r7 = r14.f13431z
            if (r4 != r7) goto L_0x047f
        L_0x0464:
            if (r9 != 0) goto L_0x0472
            java.lang.String r4 = r6.f13418m
            if (r4 == 0) goto L_0x047f
            java.lang.String r7 = r14.f13418m
            boolean r4 = android.text.TextUtils.equals(r4, r7)
            if (r4 == 0) goto L_0x047f
        L_0x0472:
            if (r12 != 0) goto L_0x047d
            int r4 = r6.f13400A
            r6 = -1
            if (r4 == r6) goto L_0x047f
            int r6 = r14.f13400A
            if (r4 != r6) goto L_0x047f
        L_0x047d:
            r4 = 1
            goto L_0x0480
        L_0x047f:
            r4 = 0
        L_0x0480:
            if (r4 == 0) goto L_0x048c
            goto L_0x0487
        L_0x0483:
            r18 = r4
            r19 = r7
        L_0x0487:
            int r4 = r0 + 1
            r15[r0] = r5
            r0 = r4
        L_0x048c:
            int r5 = r5 + 1
            r4 = r18
            r7 = r19
            goto L_0x043c
        L_0x0493:
            r18 = r4
            int[] r0 = java.util.Arrays.copyOf(r15, r0)
            int r4 = r0.length
            r5 = 1
            if (r4 <= r5) goto L_0x04a4
            com.google.android.exoplayer2.trackselection.b$a r4 = new com.google.android.exoplayer2.trackselection.b$a
            r5 = 0
            r4.<init>(r1, r0, r5)
            goto L_0x04b0
        L_0x04a4:
            r5 = 0
            goto L_0x04af
        L_0x04a6:
            r36 = r0
            r18 = r4
            r40 = r5
            r34 = r6
            goto L_0x04a4
        L_0x04af:
            r4 = 0
        L_0x04b0:
            if (r4 != 0) goto L_0x04bc
            com.google.android.exoplayer2.trackselection.b$a r4 = new com.google.android.exoplayer2.trackselection.b$a
            r0 = 1
            int[] r6 = new int[r0]
            r6[r5] = r13
            r4.<init>(r1, r6, r5)
        L_0x04bc:
            r10.getClass()
            android.util.Pair r0 = android.util.Pair.create(r4, r10)
        L_0x04c3:
            if (r0 == 0) goto L_0x04fc
            if (r2 == 0) goto L_0x04d1
            java.lang.Object r1 = r0.second
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$a r1 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.C3987a) r1
            int r1 = r1.compareTo(r2)
            if (r1 <= 0) goto L_0x04fc
        L_0x04d1:
            r1 = -1
            if (r3 == r1) goto L_0x04d7
            r1 = 0
            r37[r3] = r1
        L_0x04d7:
            java.lang.Object r1 = r0.first
            com.google.android.exoplayer2.trackselection.b$a r1 = (com.google.android.exoplayer2.trackselection.C3997b.C3998a) r1
            r37[r18] = r1
            com.google.android.exoplayer2.source.TrackGroup r2 = r1.f14142a
            int[] r1 = r1.f14143b
            r3 = 0
            r1 = r1[r3]
            com.google.android.exoplayer2.Format[] r2 = r2.f14009c
            r1 = r2[r1]
            java.lang.String r1 = r1.f13409d
            java.lang.Object r0 = r0.second
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$a r0 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.C3987a) r0
            r2 = r0
            r3 = r18
            goto L_0x04fe
        L_0x04f2:
            r36 = r0
            r21 = r1
            r18 = r4
            r40 = r5
            r34 = r6
        L_0x04fc:
            r1 = r21
        L_0x04fe:
            int r4 = r18 + 1
            r6 = r34
            r0 = r36
            r10 = r0
            r5 = r40
            r11 = r5
            goto L_0x0390
        L_0x050a:
            r36 = r0
            r21 = r1
            r40 = r5
            r2 = r6
            r0 = 0
            r1 = 0
            r9 = -1
        L_0x0514:
            if (r1 >= r2) goto L_0x0653
            r3 = r36
            int[] r4 = r3.f14147b
            r4 = r4[r1]
            r5 = 1
            if (r4 == r5) goto L_0x0645
            r5 = 2
            if (r4 == r5) goto L_0x0645
            r5 = 3
            if (r4 == r5) goto L_0x05aa
            com.google.android.exoplayer2.source.TrackGroupArray[] r4 = r3.f14148c
            r4 = r4[r1]
            r5 = r33[r1]
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 0
        L_0x052f:
            int r11 = r4.f14012b
            if (r8 >= r11) goto L_0x0593
            com.google.android.exoplayer2.source.TrackGroup[] r11 = r4.f14013c
            r11 = r11[r8]
            r12 = r5[r8]
            r13 = 0
        L_0x053a:
            int r14 = r11.f14008b
            if (r13 >= r14) goto L_0x0588
            r14 = r12[r13]
            r18 = r4
            r15 = r40
            boolean r4 = r15.f14040F
            boolean r4 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.m10670f(r14, r4)
            if (r4 == 0) goto L_0x0579
            com.google.android.exoplayer2.Format[] r4 = r11.f14009c
            r4 = r4[r13]
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$b r14 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$b
            r19 = r5
            r5 = r12[r13]
            r14.<init>(r4, r5)
            if (r7 == 0) goto L_0x0575
            com.google.common.collect.p$a r4 = com.google.common.collect.C14420p.f36310a
            boolean r5 = r14.f14082c
            r20 = r6
            boolean r6 = r7.f14082c
            com.google.common.collect.p r4 = r4.mo43228c(r5, r6)
            boolean r5 = r14.f14081b
            boolean r6 = r7.f14081b
            com.google.common.collect.p r4 = r4.mo43228c(r5, r6)
            int r4 = r4.mo43230e()
            if (r4 <= 0) goto L_0x057d
        L_0x0575:
            r6 = r11
            r10 = r13
            r7 = r14
            goto L_0x057f
        L_0x0579:
            r19 = r5
            r20 = r6
        L_0x057d:
            r6 = r20
        L_0x057f:
            int r13 = r13 + 1
            r40 = r15
            r4 = r18
            r5 = r19
            goto L_0x053a
        L_0x0588:
            r18 = r4
            r19 = r5
            r20 = r6
            r15 = r40
            int r8 = r8 + 1
            goto L_0x052f
        L_0x0593:
            r15 = r40
            if (r6 != 0) goto L_0x0599
            r4 = 0
            goto L_0x05a4
        L_0x0599:
            com.google.android.exoplayer2.trackselection.b$a r4 = new com.google.android.exoplayer2.trackselection.b$a
            r5 = 1
            int[] r7 = new int[r5]
            r5 = 0
            r7[r5] = r10
            r4.<init>(r6, r7, r5)
        L_0x05a4:
            r37[r1] = r4
            r11 = r21
            goto L_0x0649
        L_0x05aa:
            r15 = r40
            com.google.android.exoplayer2.source.TrackGroupArray[] r4 = r3.f14148c
            r4 = r4[r1]
            r5 = r33[r1]
            r6 = 0
            r7 = 0
            r8 = -1
            r10 = 0
        L_0x05b6:
            int r11 = r4.f14012b
            if (r10 >= r11) goto L_0x060d
            com.google.android.exoplayer2.source.TrackGroup[] r11 = r4.f14013c
            r11 = r11[r10]
            r12 = r5[r10]
            r13 = 0
        L_0x05c1:
            int r14 = r11.f14008b
            if (r13 >= r14) goto L_0x0604
            r14 = r12[r13]
            r18 = r4
            boolean r4 = r15.f14040F
            boolean r4 = com.google.android.exoplayer2.trackselection.DefaultTrackSelector.m10670f(r14, r4)
            if (r4 == 0) goto L_0x05f3
            com.google.android.exoplayer2.Format[] r4 = r11.f14009c
            r4 = r4[r13]
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$d r14 = new com.google.android.exoplayer2.trackselection.DefaultTrackSelector$d
            r19 = r5
            r5 = r12[r13]
            r20 = r11
            r11 = r21
            r14.<init>(r4, r15, r5, r11)
            boolean r4 = r14.f14112b
            if (r4 == 0) goto L_0x05f9
            if (r7 == 0) goto L_0x05ee
            int r4 = r14.compareTo(r7)
            if (r4 <= 0) goto L_0x05f9
        L_0x05ee:
            r8 = r13
            r7 = r14
            r6 = r20
            goto L_0x05f9
        L_0x05f3:
            r19 = r5
            r20 = r11
            r11 = r21
        L_0x05f9:
            int r13 = r13 + 1
            r21 = r11
            r4 = r18
            r5 = r19
            r11 = r20
            goto L_0x05c1
        L_0x0604:
            r18 = r4
            r19 = r5
            r11 = r21
            int r10 = r10 + 1
            goto L_0x05b6
        L_0x060d:
            r11 = r21
            if (r6 != 0) goto L_0x0613
            r4 = 0
            goto L_0x0625
        L_0x0613:
            com.google.android.exoplayer2.trackselection.b$a r4 = new com.google.android.exoplayer2.trackselection.b$a
            r5 = 1
            int[] r10 = new int[r5]
            r5 = 0
            r10[r5] = r8
            r4.<init>(r6, r10, r5)
            r7.getClass()
            android.util.Pair r4 = android.util.Pair.create(r4, r7)
        L_0x0625:
            if (r4 == 0) goto L_0x0649
            if (r0 == 0) goto L_0x0633
            java.lang.Object r5 = r4.second
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$d r5 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.C3990d) r5
            int r5 = r5.compareTo(r0)
            if (r5 <= 0) goto L_0x0649
        L_0x0633:
            r0 = -1
            if (r9 == r0) goto L_0x0639
            r0 = 0
            r37[r9] = r0
        L_0x0639:
            java.lang.Object r0 = r4.first
            com.google.android.exoplayer2.trackselection.b$a r0 = (com.google.android.exoplayer2.trackselection.C3997b.C3998a) r0
            r37[r1] = r0
            java.lang.Object r0 = r4.second
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$d r0 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.C3990d) r0
            r9 = r1
            goto L_0x0649
        L_0x0645:
            r11 = r21
            r15 = r40
        L_0x0649:
            int r1 = r1 + 1
            r36 = r3
            r21 = r11
            r40 = r15
            goto L_0x0514
        L_0x0653:
            r3 = r36
            r15 = r40
            r0 = 0
        L_0x0658:
            if (r0 >= r2) goto L_0x069b
            android.util.SparseBooleanArray r1 = r15.f14044J
            boolean r1 = r1.get(r0)
            if (r1 == 0) goto L_0x0666
            r1 = 0
            r37[r0] = r1
            goto L_0x0698
        L_0x0666:
            com.google.android.exoplayer2.source.TrackGroupArray[] r1 = r3.f14148c
            r1 = r1[r0]
            boolean r4 = r15.mo16304b(r0, r1)
            if (r4 == 0) goto L_0x0698
            android.util.SparseArray<java.util.Map<com.google.android.exoplayer2.source.TrackGroupArray, com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride>> r4 = r15.f14043I
            java.lang.Object r4 = r4.get(r0)
            java.util.Map r4 = (java.util.Map) r4
            if (r4 == 0) goto L_0x0681
            java.lang.Object r4 = r4.get(r1)
            com.google.android.exoplayer2.trackselection.DefaultTrackSelector$SelectionOverride r4 = (com.google.android.exoplayer2.trackselection.DefaultTrackSelector.SelectionOverride) r4
            goto L_0x0682
        L_0x0681:
            r4 = 0
        L_0x0682:
            if (r4 != 0) goto L_0x0686
            r1 = 0
            goto L_0x0696
        L_0x0686:
            com.google.android.exoplayer2.trackselection.b$a r5 = new com.google.android.exoplayer2.trackselection.b$a
            int r6 = r4.f14064b
            com.google.android.exoplayer2.source.TrackGroup[] r1 = r1.f14013c
            r1 = r1[r6]
            int[] r6 = r4.f14065c
            int r4 = r4.f14066d
            r5.<init>(r1, r6, r4)
            r1 = r5
        L_0x0696:
            r37[r0] = r1
        L_0x0698:
            int r0 = r0 + 1
            goto L_0x0658
        L_0x069b:
            r0 = r31
            com.google.android.exoplayer2.trackselection.b$b r1 = r0.f14032d
            tb.c r0 = r0.f20298b
            r0.getClass()
            com.google.android.exoplayer2.trackselection.a$b r1 = (com.google.android.exoplayer2.trackselection.C3994a.C3996b) r1
            r1.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r4 = 0
        L_0x06af:
            r5 = 0
            if (r4 >= r2) goto L_0x06d8
            r7 = r37[r4]
            if (r7 == 0) goto L_0x06d1
            int[] r7 = r7.f14143b
            int r7 = r7.length
            r8 = 1
            if (r7 <= r8) goto L_0x06d1
            int r7 = com.google.common.collect.ImmutableList.f36196c
            com.google.common.collect.ImmutableList$a r7 = new com.google.common.collect.ImmutableList$a
            r7.<init>()
            com.google.android.exoplayer2.trackselection.a$a r8 = new com.google.android.exoplayer2.trackselection.a$a
            r8.<init>(r5, r5)
            r7.mo43128b(r8)
            r1.add(r7)
            r10 = 0
            goto L_0x06d5
        L_0x06d1:
            r10 = 0
            r1.add(r10)
        L_0x06d5:
            int r4 = r4 + 1
            goto L_0x06af
        L_0x06d8:
            r10 = 0
            long[][] r4 = new long[r2][]
            r7 = 0
        L_0x06dc:
            if (r7 >= r2) goto L_0x070f
            r8 = r37[r7]
            if (r8 != 0) goto L_0x06e8
            r9 = 0
            long[] r8 = new long[r9]
            r4[r7] = r8
            goto L_0x070c
        L_0x06e8:
            int[] r9 = r8.f14143b
            int r9 = r9.length
            long[] r9 = new long[r9]
            r4[r7] = r9
            r9 = 0
        L_0x06f0:
            int[] r11 = r8.f14143b
            int r12 = r11.length
            if (r9 >= r12) goto L_0x0707
            r12 = r4[r7]
            com.google.android.exoplayer2.source.TrackGroup r13 = r8.f14142a
            r11 = r11[r9]
            com.google.android.exoplayer2.Format[] r13 = r13.f14009c
            r11 = r13[r11]
            int r11 = r11.f13414i
            long r13 = (long) r11
            r12[r9] = r13
            int r9 = r9 + 1
            goto L_0x06f0
        L_0x0707:
            r8 = r4[r7]
            java.util.Arrays.sort(r8)
        L_0x070c:
            int r7 = r7 + 1
            goto L_0x06dc
        L_0x070f:
            int[] r7 = new int[r2]
            long[] r8 = new long[r2]
            r9 = 0
        L_0x0714:
            if (r9 >= r2) goto L_0x0725
            r11 = r4[r9]
            int r12 = r11.length
            if (r12 != 0) goto L_0x071d
            r13 = r5
            goto L_0x0720
        L_0x071d:
            r12 = 0
            r13 = r11[r12]
        L_0x0720:
            r8[r9] = r13
            int r9 = r9 + 1
            goto L_0x0714
        L_0x0725:
            com.google.android.exoplayer2.trackselection.C3994a.m10684m(r1, r8)
            com.google.common.collect.k0 r5 = com.google.common.collect.MultimapBuilder.m35795a()
            java.lang.String r6 = "expectedValuesPerKey"
            r9 = 2
            p584jl.C17885a.m44456q(r9, r6)
            com.google.common.collect.l0 r6 = new com.google.common.collect.l0
            r6.<init>(r5)
            com.google.common.collect.c0 r5 = r6.mo43224b()
            r6 = 0
        L_0x073c:
            if (r6 >= r2) goto L_0x07a1
            r9 = r4[r6]
            int r11 = r9.length
            r12 = 1
            if (r11 > r12) goto L_0x0745
            goto L_0x079d
        L_0x0745:
            int r9 = r9.length
            double[] r11 = new double[r9]
            r12 = 0
        L_0x0749:
            r13 = r4[r6]
            int r14 = r13.length
            r18 = 0
            if (r12 >= r14) goto L_0x0766
            r14 = r11
            r10 = r13[r12]
            r20 = -1
            int r13 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r13 != 0) goto L_0x075a
            goto L_0x075f
        L_0x075a:
            double r10 = (double) r10
            double r18 = java.lang.Math.log(r10)
        L_0x075f:
            r14[r12] = r18
            int r12 = r12 + 1
            r11 = r14
            r10 = 0
            goto L_0x0749
        L_0x0766:
            r14 = r11
            int r9 = r9 + -1
            r10 = r14[r9]
            r12 = 0
            r20 = r14[r12]
            double r10 = r10 - r20
            r12 = 0
        L_0x0771:
            if (r12 >= r9) goto L_0x079d
            r20 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r22 = r14[r12]
            int r12 = r12 + 1
            r24 = r14[r12]
            double r22 = r22 + r24
            double r22 = r22 * r20
            int r13 = (r10 > r18 ? 1 : (r10 == r18 ? 0 : -1))
            if (r13 != 0) goto L_0x0786
            r20 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            goto L_0x078d
        L_0x0786:
            r13 = 0
            r20 = r14[r13]
            double r22 = r22 - r20
            double r20 = r22 / r10
        L_0x078d:
            java.lang.Double r13 = java.lang.Double.valueOf(r20)
            r20 = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            r5.mo42963a(r13, r9)
            r9 = r20
            goto L_0x0771
        L_0x079d:
            int r6 = r6 + 1
            r10 = 0
            goto L_0x073c
        L_0x07a1:
            java.util.Collection r5 = r5.values()
            com.google.common.collect.ImmutableList r5 = com.google.common.collect.ImmutableList.m35691z(r5)
            r6 = 0
        L_0x07aa:
            int r9 = r5.size()
            if (r6 >= r9) goto L_0x07cc
            java.lang.Object r9 = r5.get(r6)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r10 = r7[r9]
            r11 = 1
            int r10 = r10 + r11
            r7[r9] = r10
            r11 = r4[r9]
            r10 = r11[r10]
            r8[r9] = r10
            com.google.android.exoplayer2.trackselection.C3994a.m10684m(r1, r8)
            int r6 = r6 + 1
            goto L_0x07aa
        L_0x07cc:
            r4 = 0
        L_0x07cd:
            if (r4 >= r2) goto L_0x07e0
            java.lang.Object r5 = r1.get(r4)
            if (r5 == 0) goto L_0x07dd
            r5 = r8[r4]
            r9 = 2
            long r5 = r5 * r9
            r8[r4] = r5
        L_0x07dd:
            int r4 = r4 + 1
            goto L_0x07cd
        L_0x07e0:
            com.google.android.exoplayer2.trackselection.C3994a.m10684m(r1, r8)
            com.google.common.collect.ImmutableList$a r4 = new com.google.common.collect.ImmutableList$a
            r4.<init>()
            r5 = 0
        L_0x07e9:
            int r6 = r1.size()
            if (r5 >= r6) goto L_0x0806
            java.lang.Object r6 = r1.get(r5)
            com.google.common.collect.ImmutableList$a r6 = (com.google.common.collect.ImmutableList.C14367a) r6
            if (r6 != 0) goto L_0x07fc
            com.google.common.collect.ImmutableList r6 = com.google.common.collect.ImmutableList.m35687D()
            goto L_0x0800
        L_0x07fc:
            com.google.common.collect.ImmutableList r6 = r6.mo43129c()
        L_0x0800:
            r4.mo43128b(r6)
            int r5 = r5 + 1
            goto L_0x07e9
        L_0x0806:
            com.google.common.collect.ImmutableList r1 = r4.mo43129c()
            com.google.android.exoplayer2.trackselection.b[] r10 = new com.google.android.exoplayer2.trackselection.C3997b[r2]
            r11 = 0
        L_0x080d:
            if (r11 >= r2) goto L_0x0845
            r4 = r37[r11]
            if (r4 == 0) goto L_0x0841
            int[] r6 = r4.f14143b
            int r5 = r6.length
            if (r5 != 0) goto L_0x0819
            goto L_0x0841
        L_0x0819:
            int r5 = r6.length
            r7 = 1
            if (r5 != r7) goto L_0x082a
            sb.c r5 = new sb.c
            com.google.android.exoplayer2.source.TrackGroup r7 = r4.f14142a
            r12 = 0
            r6 = r6[r12]
            int r4 = r4.f14144c
            r5.<init>(r7, r6, r4)
            goto L_0x083e
        L_0x082a:
            r12 = 0
            com.google.android.exoplayer2.source.TrackGroup r5 = r4.f14142a
            int r7 = r4.f14144c
            java.lang.Object r4 = r1.get(r11)
            r9 = r4
            com.google.common.collect.ImmutableList r9 = (com.google.common.collect.ImmutableList) r9
            com.google.android.exoplayer2.trackselection.a r13 = new com.google.android.exoplayer2.trackselection.a
            r4 = r13
            r8 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            r5 = r13
        L_0x083e:
            r10[r11] = r5
            goto L_0x0842
        L_0x0841:
            r12 = 0
        L_0x0842:
            int r11 = r11 + 1
            goto L_0x080d
        L_0x0845:
            r12 = 0
            ga.z0[] r0 = new p099ga.C4954z0[r2]
            r1 = 0
        L_0x0849:
            if (r1 >= r2) goto L_0x086d
            android.util.SparseBooleanArray r4 = r15.f14044J
            boolean r4 = r4.get(r1)
            if (r4 != 0) goto L_0x0860
            int[] r4 = r3.f14147b
            r4 = r4[r1]
            r5 = 7
            if (r4 == r5) goto L_0x085e
            r4 = r10[r1]
            if (r4 == 0) goto L_0x0861
        L_0x085e:
            r4 = 1
            goto L_0x0862
        L_0x0860:
            r5 = 7
        L_0x0861:
            r4 = 0
        L_0x0862:
            if (r4 == 0) goto L_0x0867
            ga.z0 r4 = p099ga.C4954z0.f16737b
            goto L_0x0868
        L_0x0867:
            r4 = 0
        L_0x0868:
            r0[r1] = r4
            int r1 = r1 + 1
            goto L_0x0849
        L_0x086d:
            boolean r1 = r15.f14041G
            if (r1 == 0) goto L_0x08e8
            r1 = -1
            r2 = 0
            r9 = -1
        L_0x0874:
            int r4 = r3.f14146a
            if (r2 >= r4) goto L_0x08d2
            int[] r4 = r3.f14147b
            r4 = r4[r2]
            r5 = r10[r2]
            r6 = 1
            if (r4 == r6) goto L_0x0887
            r6 = 2
            if (r4 != r6) goto L_0x0885
            goto L_0x0888
        L_0x0885:
            r4 = -1
            goto L_0x08cf
        L_0x0887:
            r6 = 2
        L_0x0888:
            if (r5 == 0) goto L_0x0885
            r7 = r33[r2]
            com.google.android.exoplayer2.source.TrackGroupArray[] r8 = r3.f14148c
            r8 = r8[r2]
            com.google.android.exoplayer2.source.TrackGroup r11 = r5.mo22605d()
            r13 = 0
        L_0x0895:
            int r14 = r8.f14012b
            if (r13 >= r14) goto L_0x08a3
            com.google.android.exoplayer2.source.TrackGroup[] r14 = r8.f14013c
            r14 = r14[r13]
            if (r14 != r11) goto L_0x08a0
            goto L_0x08a4
        L_0x08a0:
            int r13 = r13 + 1
            goto L_0x0895
        L_0x08a3:
            r13 = -1
        L_0x08a4:
            r8 = 0
        L_0x08a5:
            int r11 = r5.length()
            if (r8 >= r11) goto L_0x08bd
            r11 = r7[r13]
            int r14 = r5.mo22604c(r8)
            r11 = r11[r14]
            r14 = 32
            r11 = r11 & r14
            if (r11 == r14) goto L_0x08ba
            r5 = 0
            goto L_0x08be
        L_0x08ba:
            int r8 = r8 + 1
            goto L_0x08a5
        L_0x08bd:
            r5 = 1
        L_0x08be:
            if (r5 == 0) goto L_0x0885
            r5 = 1
            if (r4 != r5) goto L_0x08c9
            r4 = -1
            if (r1 == r4) goto L_0x08c7
            goto L_0x08cc
        L_0x08c7:
            r1 = r2
            goto L_0x08cf
        L_0x08c9:
            r4 = -1
            if (r9 == r4) goto L_0x08ce
        L_0x08cc:
            r2 = 0
            goto L_0x08d4
        L_0x08ce:
            r9 = r2
        L_0x08cf:
            int r2 = r2 + 1
            goto L_0x0874
        L_0x08d2:
            r4 = -1
            r2 = 1
        L_0x08d4:
            if (r1 == r4) goto L_0x08da
            if (r9 == r4) goto L_0x08da
            r7 = 1
            goto L_0x08db
        L_0x08da:
            r7 = 0
        L_0x08db:
            r2 = r2 & r7
            if (r2 == 0) goto L_0x08e8
            ga.z0 r2 = new ga.z0
            r4 = 1
            r2.<init>(r4)
            r0[r1] = r2
            r0[r9] = r2
        L_0x08e8:
            android.util.Pair r0 = android.util.Pair.create(r0, r10)
            sb.g r1 = new sb.g
            java.lang.Object r2 = r0.first
            ga.z0[] r2 = (p099ga.C4954z0[]) r2
            java.lang.Object r0 = r0.second
            com.google.android.exoplayer2.trackselection.b[] r0 = (com.google.android.exoplayer2.trackselection.C3997b[]) r0
            r1.<init>(r2, r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.trackselection.C4000c.mo16342b(ga.y0[], com.google.android.exoplayer2.source.TrackGroupArray):sb.g");
    }
}
