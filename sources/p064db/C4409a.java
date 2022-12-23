package p064db;

import p011aa.C0141e;
import p277ub.C6802q;
import p277ub.C6803r;
import p277ub.C6812y;

/* renamed from: db.a */
public final class C4409a extends C0141e {

    /* renamed from: b */
    public final C6803r f15471b = new C6803r();

    /* renamed from: c */
    public final C6802q f15472c = new C6802q();

    /* renamed from: d */
    public C6812y f15473d;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: com.google.android.exoplayer2.metadata.Metadata$Entry[]} */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v19 */
    /* JADX WARNING: type inference failed for: r5v22 */
    /* JADX WARNING: type inference failed for: r7v17, types: [com.google.android.exoplayer2.metadata.scte35.PrivateCommand] */
    /* JADX WARNING: type inference failed for: r5v23 */
    /* JADX WARNING: type inference failed for: r21v10, types: [com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.exoplayer2.metadata.Metadata mo321m(p326ya.C7357c r55, java.nio.ByteBuffer r56) {
        /*
            r54 = this;
            r0 = r54
            r1 = r55
            ub.y r2 = r0.f15473d
            if (r2 == 0) goto L_0x0012
            long r3 = r1.f22586j
            long r5 = r2.mo23034c()
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 == 0) goto L_0x0021
        L_0x0012:
            ub.y r2 = new ub.y
            long r3 = r1.f13649f
            r2.<init>(r3)
            r0.f15473d = r2
            long r5 = r1.f22586j
            long r3 = r3 - r5
            r2.mo23032a(r3)
        L_0x0021:
            byte[] r1 = r56.array()
            int r2 = r56.limit()
            ub.r r3 = r0.f15471b
            r3.mo23005x(r2, r1)
            ub.q r3 = r0.f15472c
            r3.mo22976i(r2, r1)
            ub.q r1 = r0.f15472c
            r2 = 39
            r1.mo22979l(r2)
            ub.q r1 = r0.f15472c
            r2 = 1
            int r1 = r1.mo22973f(r2)
            long r3 = (long) r1
            r1 = 32
            long r3 = r3 << r1
            ub.q r5 = r0.f15472c
            int r5 = r5.mo22973f(r1)
            long r5 = (long) r5
            long r11 = r3 | r5
            ub.q r3 = r0.f15472c
            r4 = 20
            r3.mo22979l(r4)
            ub.q r3 = r0.f15472c
            r4 = 12
            int r3 = r3.mo22973f(r4)
            ub.q r4 = r0.f15472c
            r5 = 8
            int r4 = r4.mo22973f(r5)
            r5 = 0
            ub.r r6 = r0.f15471b
            r7 = 14
            r6.mo22981A(r7)
            if (r4 == 0) goto L_0x02a5
            r7 = 255(0xff, float:3.57E-43)
            if (r4 == r7) goto L_0x0290
            r3 = 4
            r7 = 128(0x80, double:6.32E-322)
            r17 = 0
            r19 = 1
            if (r4 == r3) goto L_0x0189
            r3 = 5
            if (r4 == r3) goto L_0x0098
            r1 = 6
            if (r4 == r1) goto L_0x0084
            goto L_0x02aa
        L_0x0084:
            ub.r r1 = r0.f15471b
            ub.y r3 = r0.f15473d
            long r4 = com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand.m10660b(r11, r1)
            long r7 = r3.mo23033b(r4)
            com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand r1 = new com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand
            r1.<init>(r4, r7)
            r5 = r1
            goto L_0x02aa
        L_0x0098:
            ub.r r3 = r0.f15471b
            ub.y r4 = r0.f15473d
            long r22 = r3.mo22998q()
            int r5 = r3.mo22997p()
            r5 = r5 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x00ab
            r24 = 1
            goto L_0x00ad
        L_0x00ab:
            r24 = 0
        L_0x00ad:
            java.util.List r5 = java.util.Collections.emptyList()
            if (r24 != 0) goto L_0x0160
            int r9 = r3.mo22997p()
            r10 = r9 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x00bd
            r10 = 1
            goto L_0x00be
        L_0x00bd:
            r10 = 0
        L_0x00be:
            r21 = r9 & 64
            if (r21 == 0) goto L_0x00c5
            r21 = 1
            goto L_0x00c7
        L_0x00c5:
            r21 = 0
        L_0x00c7:
            r25 = r9 & 32
            if (r25 == 0) goto L_0x00ce
            r25 = 1
            goto L_0x00d0
        L_0x00ce:
            r25 = 0
        L_0x00d0:
            r9 = r9 & 16
            if (r9 == 0) goto L_0x00d6
            r9 = 1
            goto L_0x00d7
        L_0x00d6:
            r9 = 0
        L_0x00d7:
            if (r21 == 0) goto L_0x00e0
            if (r9 != 0) goto L_0x00e0
            long r26 = com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand.m10660b(r11, r3)
            goto L_0x00e5
        L_0x00e0:
            r26 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00e5:
            if (r21 != 0) goto L_0x0119
            int r5 = r3.mo22997p()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r5)
            r6 = 0
        L_0x00f1:
            if (r6 >= r5) goto L_0x0118
            int r29 = r3.mo22997p()
            if (r9 != 0) goto L_0x0100
            long r30 = com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand.m10660b(r11, r3)
            r13 = r30
            goto L_0x0105
        L_0x0100:
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0105:
            com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$b r15 = new com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand$b
            long r32 = r4.mo23033b(r13)
            r28 = r15
            r30 = r13
            r28.<init>(r29, r30, r32)
            r2.add(r15)
            int r6 = r6 + 1
            goto L_0x00f1
        L_0x0118:
            r5 = r2
        L_0x0119:
            if (r25 == 0) goto L_0x0139
            int r2 = r3.mo22997p()
            long r11 = (long) r2
            long r6 = r11 & r7
            int r2 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r2 == 0) goto L_0x0128
            r2 = 1
            goto L_0x0129
        L_0x0128:
            r2 = 0
        L_0x0129:
            long r6 = r11 & r19
            long r6 = r6 << r1
            long r11 = r3.mo22998q()
            long r6 = r6 | r11
            r11 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r11
            r11 = 90
            long r6 = r6 / r11
            goto L_0x013f
        L_0x0139:
            r2 = 0
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x013f:
            int r1 = r3.mo23002u()
            int r8 = r3.mo22997p()
            int r3 = r3.mo22997p()
            r36 = r1
            r33 = r2
            r38 = r3
            r32 = r5
            r34 = r6
            r37 = r8
            r25 = r10
            r1 = r26
            r27 = r9
            r26 = r21
            goto L_0x017a
        L_0x0160:
            r32 = r5
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r25 = 0
            r26 = 0
            r27 = 0
            r33 = 0
            r34 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r36 = 0
            r37 = 0
            r38 = 0
        L_0x017a:
            com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand r5 = new com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand
            r21 = r5
            long r30 = r4.mo23033b(r1)
            r28 = r1
            r21.<init>(r22, r24, r25, r26, r27, r28, r30, r32, r33, r34, r36, r37, r38)
            goto L_0x02aa
        L_0x0189:
            ub.r r2 = r0.f15471b
            int r3 = r2.mo22997p()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            r5 = 0
        L_0x0195:
            if (r5 >= r3) goto L_0x028a
            long r40 = r2.mo22998q()
            int r6 = r2.mo22997p()
            r6 = r6 & 128(0x80, float:1.794E-43)
            if (r6 == 0) goto L_0x01a6
            r42 = 1
            goto L_0x01a8
        L_0x01a6:
            r42 = 0
        L_0x01a8:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r42 != 0) goto L_0x0256
            int r9 = r2.mo22997p()
            r10 = r9 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x01b9
            r10 = 1
            goto L_0x01ba
        L_0x01b9:
            r10 = 0
        L_0x01ba:
            r11 = r9 & 64
            if (r11 == 0) goto L_0x01c0
            r11 = 1
            goto L_0x01c1
        L_0x01c0:
            r11 = 0
        L_0x01c1:
            r9 = r9 & 32
            if (r9 == 0) goto L_0x01c7
            r9 = 1
            goto L_0x01c8
        L_0x01c7:
            r9 = 0
        L_0x01c8:
            if (r11 == 0) goto L_0x01cf
            long r12 = r2.mo22998q()
            goto L_0x01d4
        L_0x01cf:
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x01d4:
            if (r11 != 0) goto L_0x0201
            int r6 = r2.mo22997p()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>(r6)
            r15 = 0
        L_0x01e0:
            if (r15 >= r6) goto L_0x01fd
            int r1 = r2.mo22997p()
            long r7 = r2.mo22998q()
            r23 = r3
            com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$b r3 = new com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$b
            r3.<init>(r1, r7)
            r14.add(r3)
            int r15 = r15 + 1
            r3 = r23
            r1 = 32
            r7 = 128(0x80, double:6.32E-322)
            goto L_0x01e0
        L_0x01fd:
            r23 = r3
            r6 = r14
            goto L_0x0203
        L_0x0201:
            r23 = r3
        L_0x0203:
            if (r9 == 0) goto L_0x0229
            int r1 = r2.mo22997p()
            long r7 = (long) r1
            r14 = 128(0x80, double:6.32E-322)
            long r21 = r7 & r14
            int r1 = (r21 > r17 ? 1 : (r21 == r17 ? 0 : -1))
            if (r1 == 0) goto L_0x0214
            r1 = 1
            goto L_0x0215
        L_0x0214:
            r1 = 0
        L_0x0215:
            long r7 = r7 & r19
            r3 = 32
            long r7 = r7 << r3
            long r21 = r2.mo22998q()
            long r7 = r7 | r21
            r21 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r21
            r24 = 90
            long r7 = r7 / r24
            goto L_0x0237
        L_0x0229:
            r3 = 32
            r14 = 128(0x80, double:6.32E-322)
            r21 = 1000(0x3e8, double:4.94E-321)
            r24 = 90
            r1 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0237:
            int r9 = r2.mo23002u()
            int r16 = r2.mo22997p()
            int r26 = r2.mo22997p()
            r48 = r1
            r45 = r6
            r49 = r7
            r51 = r9
            r43 = r10
            r44 = r11
            r46 = r12
            r52 = r16
            r53 = r26
            goto L_0x0277
        L_0x0256:
            r23 = r3
            r14 = r7
            r3 = 32
            r21 = 1000(0x3e8, double:4.94E-321)
            r24 = 90
            r45 = r6
            r43 = 0
            r44 = 0
            r46 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r48 = 0
            r49 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r51 = 0
            r52 = 0
            r53 = 0
        L_0x0277:
            com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$c r1 = new com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand$c
            r39 = r1
            r39.<init>(r40, r42, r43, r44, r45, r46, r48, r49, r51, r52, r53)
            r4.add(r1)
            int r5 = r5 + 1
            r7 = r14
            r3 = r23
            r1 = 32
            goto L_0x0195
        L_0x028a:
            com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand r5 = new com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand
            r5.<init>((java.util.ArrayList) r4)
            goto L_0x02aa
        L_0x0290:
            ub.r r1 = r0.f15471b
            long r8 = r1.mo22998q()
            int r3 = r3 + -4
            byte[] r10 = new byte[r3]
            r2 = 0
            r1.mo22983b(r2, r3, r10)
            com.google.android.exoplayer2.metadata.scte35.PrivateCommand r5 = new com.google.android.exoplayer2.metadata.scte35.PrivateCommand
            r7 = r5
            r7.<init>(r8, r10, r11)
            goto L_0x02aa
        L_0x02a5:
            com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand r5 = new com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand
            r5.<init>()
        L_0x02aa:
            if (r5 != 0) goto L_0x02b5
            com.google.android.exoplayer2.metadata.Metadata r1 = new com.google.android.exoplayer2.metadata.Metadata
            r2 = 0
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r2 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r2]
            r1.<init>((com.google.android.exoplayer2.metadata.Metadata.Entry[]) r2)
            goto L_0x02c0
        L_0x02b5:
            r2 = 0
            com.google.android.exoplayer2.metadata.Metadata r1 = new com.google.android.exoplayer2.metadata.Metadata
            r3 = 1
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r3 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r3]
            r3[r2] = r5
            r1.<init>((com.google.android.exoplayer2.metadata.Metadata.Entry[]) r3)
        L_0x02c0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p064db.C4409a.mo321m(ya.c, java.nio.ByteBuffer):com.google.android.exoplayer2.metadata.Metadata");
    }
}
