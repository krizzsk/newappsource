package p264ta;

import com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import p173ma.C5735h;
import p173ma.C5736i;
import p173ma.C5737j;
import p173ma.C5750t;
import p173ma.C5753u;
import p173ma.C5754v;
import p264ta.C6619a;
import p277ub.C6774a0;
import p277ub.C6795o;
import p277ub.C6803r;

/* renamed from: ta.h */
public final class C6634h implements C5735h, C5750t {

    /* renamed from: a */
    public final int f20564a;

    /* renamed from: b */
    public final C6803r f20565b;

    /* renamed from: c */
    public final C6803r f20566c;

    /* renamed from: d */
    public final C6803r f20567d;

    /* renamed from: e */
    public final C6803r f20568e;

    /* renamed from: f */
    public final ArrayDeque<C6619a.C6620a> f20569f;

    /* renamed from: g */
    public final C6638j f20570g;

    /* renamed from: h */
    public final ArrayList f20571h;

    /* renamed from: i */
    public int f20572i;

    /* renamed from: j */
    public int f20573j;

    /* renamed from: k */
    public long f20574k;

    /* renamed from: l */
    public int f20575l;

    /* renamed from: m */
    public C6803r f20576m;

    /* renamed from: n */
    public int f20577n;

    /* renamed from: o */
    public int f20578o;

    /* renamed from: p */
    public int f20579p;

    /* renamed from: q */
    public int f20580q;

    /* renamed from: r */
    public C5737j f20581r;

    /* renamed from: s */
    public C6635a[] f20582s;

    /* renamed from: t */
    public long[][] f20583t;

    /* renamed from: u */
    public int f20584u;

    /* renamed from: v */
    public long f20585v;

    /* renamed from: w */
    public int f20586w;

    /* renamed from: x */
    public MotionPhotoMetadata f20587x;

    /* renamed from: ta.h$a */
    public static final class C6635a {

        /* renamed from: a */
        public final C6641l f20588a;

        /* renamed from: b */
        public final C6644o f20589b;

        /* renamed from: c */
        public final C5754v f20590c;

        /* renamed from: d */
        public int f20591d;

        public C6635a(C6641l lVar, C6644o oVar, C5754v vVar) {
            this.f20588a = lVar;
            this.f20589b = oVar;
            this.f20590c = vVar;
        }
    }

    public C6634h() {
        this(0);
    }

    /* renamed from: a */
    public final void mo21592a(long j, long j2) {
        this.f20569f.clear();
        this.f20575l = 0;
        this.f20577n = -1;
        this.f20578o = 0;
        this.f20579p = 0;
        this.f20580q = 0;
        if (j != 0) {
            C6635a[] aVarArr = this.f20582s;
            if (aVarArr != null) {
                for (C6635a aVar : aVarArr) {
                    C6644o oVar = aVar.f20589b;
                    int e = C6774a0.m15945e(oVar.f20642f, j2, false);
                    while (true) {
                        if (e < 0) {
                            e = -1;
                            break;
                        } else if ((oVar.f20643g[e] & 1) != 0) {
                            break;
                        } else {
                            e--;
                        }
                    }
                    if (e == -1) {
                        e = oVar.mo22815a(j2);
                    }
                    aVar.f20591d = e;
                }
            }
        } else if (this.f20572i != 3) {
            this.f20572i = 0;
            this.f20575l = 0;
        } else {
            C6638j jVar = this.f20570g;
            jVar.f20597a.clear();
            jVar.f20598b = 0;
            this.f20571h.clear();
        }
    }

    /* renamed from: b */
    public final boolean mo21593b(C5736i iVar) throws IOException {
        boolean z;
        if ((this.f20564a & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        return C6640k.m15701a(iVar, false, z);
    }

    /* renamed from: c */
    public final C5750t.C5751a mo21569c(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        int a;
        long j9 = j;
        C6635a[] aVarArr = this.f20582s;
        aVarArr.getClass();
        if (aVarArr.length == 0) {
            C5753u uVar = C5753u.f18629c;
            return new C5750t.C5751a(uVar, uVar);
        }
        long j10 = -1;
        int i = this.f20584u;
        boolean z = false;
        int i2 = -1;
        if (i != -1) {
            C6644o oVar = this.f20582s[i].f20589b;
            int e = C6774a0.m15945e(oVar.f20642f, j9, false);
            while (true) {
                if (e < 0) {
                    e = -1;
                    break;
                } else if ((oVar.f20643g[e] & 1) != 0) {
                    break;
                } else {
                    e--;
                }
            }
            if (e == -1) {
                e = oVar.mo22815a(j9);
            }
            if (e == -1) {
                C5753u uVar2 = C5753u.f18629c;
                return new C5750t.C5751a(uVar2, uVar2);
            }
            long j11 = oVar.f20642f[e];
            j2 = oVar.f20639c[e];
            if (j11 >= j9 || e >= oVar.f20638b - 1 || (a = oVar.mo22815a(j9)) == -1 || a == e) {
                j8 = -9223372036854775807L;
            } else {
                long j12 = oVar.f20642f[a];
                long j13 = oVar.f20639c[a];
                j8 = j12;
                j10 = j13;
            }
            j3 = j10;
            j4 = j8;
            j9 = j11;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -1;
            j4 = -9223372036854775807L;
        }
        int i3 = 0;
        while (true) {
            C6635a[] aVarArr2 = this.f20582s;
            if (i3 >= aVarArr2.length) {
                break;
            }
            if (i3 != this.f20584u) {
                C6644o oVar2 = aVarArr2[i3].f20589b;
                int e2 = C6774a0.m15945e(oVar2.f20642f, j9, z);
                while (true) {
                    if (e2 < 0) {
                        e2 = -1;
                        break;
                    } else if ((oVar2.f20643g[e2] & 1) != 0) {
                        break;
                    } else {
                        e2--;
                    }
                }
                if (e2 == i2) {
                    e2 = oVar2.mo22815a(j9);
                }
                if (e2 == i2) {
                    j7 = j3;
                } else {
                    j7 = j3;
                    j2 = Math.min(oVar2.f20639c[e2], j2);
                }
                if (j4 != -9223372036854775807L) {
                    int e3 = C6774a0.m15945e(oVar2.f20642f, j4, false);
                    while (true) {
                        if (e3 < 0) {
                            e3 = -1;
                            break;
                        } else if ((oVar2.f20643g[e3] & 1) != 0) {
                            break;
                        } else {
                            e3--;
                        }
                    }
                    if (e3 == -1) {
                        e3 = oVar2.mo22815a(j4);
                    }
                    if (e3 == -1) {
                        j6 = j7;
                    } else {
                        j6 = Math.min(oVar2.f20639c[e3], j7);
                    }
                    i3++;
                    z = false;
                    i2 = -1;
                } else {
                    j5 = j7;
                }
            } else {
                j5 = j3;
            }
            j6 = j5;
            i3++;
            z = false;
            i2 = -1;
        }
        long j14 = j3;
        C5753u uVar3 = new C5753u(j9, j2);
        if (j4 == -9223372036854775807L) {
            return new C5750t.C5751a(uVar3, uVar3);
        }
        return new C5750t.C5751a(uVar3, new C5753u(j4, j14));
    }

    /* renamed from: e */
    public final boolean mo21570e() {
        return true;
    }

    /* renamed from: g */
    public final void mo21594g(C5737j jVar) {
        this.f20581r = jVar;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:211:0x0456  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0458  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x045b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x066b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:334:0x0006 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0006 A[SYNTHETIC] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo21595h(p173ma.C5736i r39, p173ma.C5749s r40) throws java.io.IOException {
        /*
            r38 = this;
            r1 = r38
            r0 = r39
            r2 = r40
        L_0x0006:
            int r3 = r1.f20572i
            r4 = 1718909296(0x66747970, float:2.8862439E23)
            r5 = -1
            r7 = 4
            r11 = 2
            r13 = 1
            r14 = 0
            if (r3 == 0) goto L_0x045d
            r15 = 262144(0x40000, double:1.295163E-318)
            if (r3 == r13) goto L_0x03c8
            r17 = 8
            if (r3 == r11) goto L_0x024b
            r4 = 3
            if (r3 != r4) goto L_0x0245
            ta.j r3 = r1.f20570g
            java.util.ArrayList r15 = r1.f20571h
            int r8 = r3.f20598b
            if (r8 == 0) goto L_0x021f
            if (r8 == r13) goto L_0x01ee
            r12 = 2817(0xb01, float:3.947E-42)
            r9 = 2192(0x890, float:3.072E-42)
            r10 = 2816(0xb00, float:3.946E-42)
            if (r8 == r11) goto L_0x0178
            if (r8 != r4) goto L_0x0172
            long r16 = r39.getPosition()
            long r22 = r39.getLength()
            long r24 = r39.getPosition()
            long r22 = r22 - r24
            int r8 = r3.f20599c
            long r5 = (long) r8
            long r5 = r22 - r5
            int r6 = (int) r5
            ub.r r5 = new ub.r
            r5.<init>((int) r6)
            byte[] r8 = r5.f21038a
            r0.readFully(r8, r14, r6)
            r0 = 0
        L_0x0052:
            java.util.ArrayList r6 = r3.f20597a
            int r6 = r6.size()
            if (r0 >= r6) goto L_0x016c
            java.util.ArrayList r6 = r3.f20597a
            java.lang.Object r6 = r6.get(r0)
            ta.j$a r6 = (p264ta.C6638j.C6639a) r6
            r22 = r15
            long r14 = r6.f20600a
            long r14 = r14 - r16
            int r15 = (int) r14
            r5.mo23007z(r15)
            r5.mo22981A(r7)
            int r14 = r5.mo22986e()
            java.lang.String r15 = r5.mo22994m(r14)
            int r19 = r15.hashCode()
            switch(r19) {
                case -1711564334: goto L_0x00ab;
                case -1332107749: goto L_0x00a0;
                case -1251387154: goto L_0x0095;
                case -830665521: goto L_0x008a;
                case 1760745220: goto L_0x007f;
                default: goto L_0x007e;
            }
        L_0x007e:
            goto L_0x00b6
        L_0x007f:
            java.lang.String r8 = "Super_SlowMotion_BGM"
            boolean r8 = r15.equals(r8)
            if (r8 != 0) goto L_0x0088
            goto L_0x00b6
        L_0x0088:
            r8 = 4
            goto L_0x00b7
        L_0x008a:
            java.lang.String r8 = "Super_SlowMotion_Deflickering_On"
            boolean r8 = r15.equals(r8)
            if (r8 != 0) goto L_0x0093
            goto L_0x00b6
        L_0x0093:
            r8 = 3
            goto L_0x00b7
        L_0x0095:
            java.lang.String r8 = "Super_SlowMotion_Data"
            boolean r8 = r15.equals(r8)
            if (r8 != 0) goto L_0x009e
            goto L_0x00b6
        L_0x009e:
            r8 = 2
            goto L_0x00b7
        L_0x00a0:
            java.lang.String r8 = "Super_SlowMotion_Edit_Data"
            boolean r8 = r15.equals(r8)
            if (r8 != 0) goto L_0x00a9
            goto L_0x00b6
        L_0x00a9:
            r8 = 1
            goto L_0x00b7
        L_0x00ab:
            java.lang.String r8 = "SlowMotion_Data"
            boolean r8 = r15.equals(r8)
            if (r8 != 0) goto L_0x00b4
            goto L_0x00b6
        L_0x00b4:
            r8 = 0
            goto L_0x00b7
        L_0x00b6:
            r8 = -1
        L_0x00b7:
            if (r8 == 0) goto L_0x00d5
            if (r8 == r13) goto L_0x00d2
            if (r8 == r11) goto L_0x00cf
            if (r8 == r4) goto L_0x00cc
            if (r8 != r7) goto L_0x00c4
            r8 = 2817(0xb01, float:3.947E-42)
            goto L_0x00d7
        L_0x00c4:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "Invalid SEF name"
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x00cc:
            r8 = 2820(0xb04, float:3.952E-42)
            goto L_0x00d7
        L_0x00cf:
            r8 = 2816(0xb00, float:3.946E-42)
            goto L_0x00d7
        L_0x00d2:
            r8 = 2819(0xb03, float:3.95E-42)
            goto L_0x00d7
        L_0x00d5:
            r8 = 2192(0x890, float:3.072E-42)
        L_0x00d7:
            int r6 = r6.f20601b
            int r14 = r14 + 8
            int r6 = r6 - r14
            if (r8 == r9) goto L_0x00f4
            if (r8 == r10) goto L_0x00f1
            if (r8 == r12) goto L_0x00f1
            r6 = 2819(0xb03, float:3.95E-42)
            if (r8 == r6) goto L_0x00f1
            r6 = 2820(0xb04, float:3.952E-42)
            if (r8 != r6) goto L_0x00eb
            goto L_0x00f1
        L_0x00eb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x00f1:
            r7 = r22
            goto L_0x0165
        L_0x00f4:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.lang.String r6 = r5.mo22994m(r6)
            ld.h r8 = p264ta.C6638j.f20596e
            java.util.List r6 = r8.mo50608a(r6)
            r15 = 0
        L_0x0104:
            int r8 = r6.size()
            if (r15 >= r8) goto L_0x015b
            ld.h r8 = p264ta.C6638j.f20595d
            java.lang.Object r19 = r6.get(r15)
            r7 = r19
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            java.util.List r7 = r8.mo50608a(r7)
            int r8 = r7.size()
            if (r8 != r4) goto L_0x0155
            r8 = 0
            java.lang.Object r19 = r7.get(r8)     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.String r19 = (java.lang.String) r19     // Catch:{ NumberFormatException -> 0x014e }
            long r27 = java.lang.Long.parseLong(r19)     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Object r19 = r7.get(r13)     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.String r19 = (java.lang.String) r19     // Catch:{ NumberFormatException -> 0x014e }
            long r29 = java.lang.Long.parseLong(r19)     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.Object r7 = r7.get(r11)     // Catch:{ NumberFormatException -> 0x014e }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x014e }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x014e }
            int r7 = r7 - r13
            int r26 = r13 << r7
            com.google.android.exoplayer2.metadata.mp4.SlowMotionData$Segment r7 = new com.google.android.exoplayer2.metadata.mp4.SlowMotionData$Segment     // Catch:{ NumberFormatException -> 0x014e }
            r25 = r7
            r25.<init>(r26, r27, r29)     // Catch:{ NumberFormatException -> 0x014e }
            r14.add(r7)     // Catch:{ NumberFormatException -> 0x014e }
            int r15 = r15 + 1
            r7 = 4
            goto L_0x0104
        L_0x014e:
            r0 = move-exception
            com.google.android.exoplayer2.ParserException r2 = new com.google.android.exoplayer2.ParserException
            r2.<init>((java.lang.NumberFormatException) r0)
            throw r2
        L_0x0155:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            r0.<init>()
            throw r0
        L_0x015b:
            com.google.android.exoplayer2.metadata.mp4.SlowMotionData r6 = new com.google.android.exoplayer2.metadata.mp4.SlowMotionData
            r6.<init>(r14)
            r7 = r22
            r7.add(r6)
        L_0x0165:
            int r0 = r0 + 1
            r15 = r7
            r7 = 4
            r14 = 0
            goto L_0x0052
        L_0x016c:
            r14 = 0
            r2.f18624a = r14
            goto L_0x0236
        L_0x0172:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0178:
            long r5 = r39.getLength()
            int r7 = r3.f20599c
            int r7 = r7 + -12
            r14 = 8
            int r7 = r7 - r14
            ub.r r14 = new ub.r
            r14.<init>((int) r7)
            byte[] r15 = r14.f21038a
            r8 = 0
            r0.readFully(r15, r8, r7)
            r0 = 0
        L_0x018f:
            int r15 = r7 / 12
            if (r0 >= r15) goto L_0x01d1
            r14.mo22981A(r11)
            short r15 = r14.mo22987f()
            if (r15 == r9) goto L_0x01ae
            if (r15 == r10) goto L_0x01ae
            if (r15 == r12) goto L_0x01ae
            r8 = 2819(0xb03, float:3.95E-42)
            if (r15 == r8) goto L_0x01ae
            r8 = 2820(0xb04, float:3.952E-42)
            if (r15 == r8) goto L_0x01b0
            r15 = 8
            r14.mo22981A(r15)
            goto L_0x01c9
        L_0x01ae:
            r8 = 2820(0xb04, float:3.952E-42)
        L_0x01b0:
            int r15 = r3.f20599c
            long r8 = (long) r15
            long r8 = r5 - r8
            int r15 = r14.mo22986e()
            long r12 = (long) r15
            long r8 = r8 - r12
            int r12 = r14.mo22986e()
            java.util.ArrayList r13 = r3.f20597a
            ta.j$a r15 = new ta.j$a
            r15.<init>(r8, r12)
            r13.add(r15)
        L_0x01c9:
            int r0 = r0 + 1
            r9 = 2192(0x890, float:3.072E-42)
            r12 = 2817(0xb01, float:3.947E-42)
            r13 = 1
            goto L_0x018f
        L_0x01d1:
            java.util.ArrayList r0 = r3.f20597a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01de
            r5 = 0
            r2.f18624a = r5
            goto L_0x0236
        L_0x01de:
            r3.f20598b = r4
            java.util.ArrayList r0 = r3.f20597a
            r4 = 0
            java.lang.Object r0 = r0.get(r4)
            ta.j$a r0 = (p264ta.C6638j.C6639a) r0
            long r5 = r0.f20600a
            r2.f18624a = r5
            goto L_0x0236
        L_0x01ee:
            r4 = 0
            ub.r r5 = new ub.r
            r6 = 8
            r5.<init>((int) r6)
            byte[] r7 = r5.f21038a
            r0.readFully(r7, r4, r6)
            int r4 = r5.mo22986e()
            int r4 = r4 + r6
            r3.f20599c = r4
            int r4 = r5.mo22984c()
            r5 = 1397048916(0x53454654, float:8.4728847E11)
            if (r4 == r5) goto L_0x0210
            r4 = 0
            r2.f18624a = r4
            goto L_0x0236
        L_0x0210:
            long r4 = r39.getPosition()
            int r0 = r3.f20599c
            int r0 = r0 + -12
            long r6 = (long) r0
            long r4 = r4 - r6
            r2.f18624a = r4
            r3.f20598b = r11
            goto L_0x0236
        L_0x021f:
            long r9 = r39.getLength()
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x022f
            int r0 = (r9 > r17 ? 1 : (r9 == r17 ? 0 : -1))
            if (r0 >= 0) goto L_0x022c
            goto L_0x022f
        L_0x022c:
            long r4 = r9 - r17
            goto L_0x0231
        L_0x022f:
            r4 = 0
        L_0x0231:
            r2.f18624a = r4
            r0 = 1
            r3.f20598b = r0
        L_0x0236:
            long r2 = r2.f18624a
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0243
            r0 = 0
            r1.f20572i = r0
            r1.f20575l = r0
        L_0x0243:
            r0 = 1
            return r0
        L_0x0245:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x024b:
            long r3 = r39.getPosition()
            int r5 = r1.f20577n
            r6 = -1
            if (r5 != r6) goto L_0x02c4
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r24 = r5
            r26 = r24
            r28 = r26
            r7 = 0
            r9 = -1
            r10 = -1
            r12 = 1
            r13 = 1
        L_0x0264:
            ta.h$a[] r14 = r1.f20582s
            int r19 = p277ub.C6774a0.f20959a
            int r8 = r14.length
            if (r7 >= r8) goto L_0x02ac
            r8 = r14[r7]
            int r14 = r8.f20591d
            ta.o r8 = r8.f20589b
            int r11 = r8.f20638b
            if (r14 != r11) goto L_0x0276
            goto L_0x02a8
        L_0x0276:
            long[] r8 = r8.f20639c
            r31 = r8[r14]
            long[][] r8 = r1.f20583t
            r8 = r8[r7]
            r33 = r8[r14]
            long r31 = r31 - r3
            r20 = 0
            int r8 = (r31 > r20 ? 1 : (r31 == r20 ? 0 : -1))
            if (r8 < 0) goto L_0x028f
            int r8 = (r31 > r15 ? 1 : (r31 == r15 ? 0 : -1))
            if (r8 < 0) goto L_0x028d
            goto L_0x028f
        L_0x028d:
            r8 = 0
            goto L_0x0290
        L_0x028f:
            r8 = 1
        L_0x0290:
            if (r8 != 0) goto L_0x0294
            if (r13 != 0) goto L_0x029a
        L_0x0294:
            if (r8 != r13) goto L_0x02a0
            int r11 = (r31 > r28 ? 1 : (r31 == r28 ? 0 : -1))
            if (r11 >= 0) goto L_0x02a0
        L_0x029a:
            r10 = r7
            r13 = r8
            r28 = r31
            r26 = r33
        L_0x02a0:
            int r11 = (r33 > r24 ? 1 : (r33 == r24 ? 0 : -1))
            if (r11 >= 0) goto L_0x02a8
            r9 = r7
            r12 = r8
            r24 = r33
        L_0x02a8:
            int r7 = r7 + 1
            r11 = 2
            goto L_0x0264
        L_0x02ac:
            int r7 = (r24 > r5 ? 1 : (r24 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x02bb
            if (r12 == 0) goto L_0x02bb
            r5 = 10485760(0xa00000, double:5.180654E-317)
            long r24 = r24 + r5
            int r5 = (r26 > r24 ? 1 : (r26 == r24 ? 0 : -1))
            if (r5 >= 0) goto L_0x02bc
        L_0x02bb:
            r9 = r10
        L_0x02bc:
            r1.f20577n = r9
            r5 = -1
            if (r9 != r5) goto L_0x02c4
            r8 = -1
            goto L_0x03c7
        L_0x02c4:
            ta.h$a[] r5 = r1.f20582s
            int r6 = p277ub.C6774a0.f20959a
            int r6 = r1.f20577n
            r5 = r5[r6]
            ma.v r6 = r5.f20590c
            int r7 = r5.f20591d
            ta.o r8 = r5.f20589b
            long[] r9 = r8.f20639c
            r10 = r9[r7]
            int[] r8 = r8.f20640d
            r8 = r8[r7]
            long r3 = r10 - r3
            int r9 = r1.f20578o
            long r12 = (long) r9
            long r3 = r3 + r12
            r12 = 0
            int r9 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r9 < 0) goto L_0x03c4
            int r9 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r9 < 0) goto L_0x02ec
            goto L_0x03c4
        L_0x02ec:
            ta.l r2 = r5.f20588a
            int r2 = r2.f20609g
            r9 = 1
            if (r2 != r9) goto L_0x02f7
            long r3 = r3 + r17
            int r8 = r8 + -8
        L_0x02f7:
            r2 = r8
            int r4 = (int) r3
            r0.mo21582i(r4)
            ta.l r3 = r5.f20588a
            int r4 = r3.f20612j
            if (r4 == 0) goto L_0x0360
            ub.r r3 = r1.f20566c
            byte[] r3 = r3.f21038a
            r8 = 0
            r3[r8] = r8
            r9 = 1
            r3[r9] = r8
            r9 = 2
            r3[r9] = r8
            int r9 = 4 - r4
        L_0x0311:
            int r10 = r1.f20579p
            if (r10 >= r2) goto L_0x039d
            int r10 = r1.f20580q
            if (r10 != 0) goto L_0x034b
            r0.readFully(r3, r9, r4)
            int r10 = r1.f20578o
            int r10 = r10 + r4
            r1.f20578o = r10
            ub.r r10 = r1.f20566c
            r8 = 0
            r10.mo23007z(r8)
            ub.r r10 = r1.f20566c
            int r10 = r10.mo22984c()
            if (r10 < 0) goto L_0x0343
            r1.f20580q = r10
            ub.r r10 = r1.f20565b
            r10.mo23007z(r8)
            ub.r r10 = r1.f20565b
            r11 = 4
            r6.mo20631b(r11, r10)
            int r10 = r1.f20579p
            int r10 = r10 + r11
            r1.f20579p = r10
            int r2 = r2 + r9
            goto L_0x0311
        L_0x0343:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "Invalid NAL length"
            r0.<init>((java.lang.String) r2)
            throw r0
        L_0x034b:
            r8 = 0
            int r10 = r6.mo20630a(r0, r10, r8)
            int r11 = r1.f20578o
            int r11 = r11 + r10
            r1.f20578o = r11
            int r11 = r1.f20579p
            int r11 = r11 + r10
            r1.f20579p = r11
            int r11 = r1.f20580q
            int r11 = r11 - r10
            r1.f20580q = r11
            goto L_0x0311
        L_0x0360:
            com.google.android.exoplayer2.Format r3 = r3.f20608f
            java.lang.String r3 = r3.f13418m
            java.lang.String r4 = "audio/ac4"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x0382
            int r3 = r1.f20579p
            if (r3 != 0) goto L_0x0380
            ub.r r3 = r1.f20567d
            p125ia.C5314c.m13354a(r2, r3)
            ub.r r3 = r1.f20567d
            r4 = 7
            r6.mo20631b(r4, r3)
            int r3 = r1.f20579p
            int r3 = r3 + r4
            r1.f20579p = r3
        L_0x0380:
            int r2 = r2 + 7
        L_0x0382:
            int r3 = r1.f20579p
            if (r3 >= r2) goto L_0x039d
            int r3 = r2 - r3
            r4 = 0
            int r3 = r6.mo20630a(r0, r3, r4)
            int r4 = r1.f20578o
            int r4 = r4 + r3
            r1.f20578o = r4
            int r4 = r1.f20579p
            int r4 = r4 + r3
            r1.f20579p = r4
            int r4 = r1.f20580q
            int r4 = r4 - r3
            r1.f20580q = r4
            goto L_0x0382
        L_0x039d:
            r35 = r2
            ta.o r0 = r5.f20589b
            long[] r2 = r0.f20642f
            r32 = r2[r7]
            int[] r0 = r0.f20643g
            r34 = r0[r7]
            r36 = 0
            r37 = 0
            r31 = r6
            r31.mo20633d(r32, r34, r35, r36, r37)
            int r0 = r5.f20591d
            r2 = 1
            int r0 = r0 + r2
            r5.f20591d = r0
            r0 = -1
            r1.f20577n = r0
            r0 = 0
            r1.f20578o = r0
            r1.f20579p = r0
            r1.f20580q = r0
            r8 = 0
            goto L_0x03c7
        L_0x03c4:
            r2.f18624a = r10
            r8 = 1
        L_0x03c7:
            return r8
        L_0x03c8:
            long r5 = r1.f20574k
            int r3 = r1.f20575l
            long r9 = (long) r3
            long r5 = r5 - r9
            long r9 = r39.getPosition()
            long r9 = r9 + r5
            ub.r r3 = r1.f20576m
            if (r3 == 0) goto L_0x043a
            byte[] r7 = r3.f21038a
            int r11 = r1.f20575l
            int r6 = (int) r5
            r0.readFully(r7, r11, r6)
            int r5 = r1.f20573j
            if (r5 != r4) goto L_0x041d
            r4 = 8
            r3.mo23007z(r4)
            int r4 = r3.mo22984c()
            r5 = 1903435808(0x71742020, float:1.2088509E30)
            r6 = 1751476579(0x68656963, float:4.333464E24)
            if (r4 == r6) goto L_0x03fa
            if (r4 == r5) goto L_0x03f8
            r4 = 0
            goto L_0x03fb
        L_0x03f8:
            r4 = 1
            goto L_0x03fb
        L_0x03fa:
            r4 = 2
        L_0x03fb:
            if (r4 == 0) goto L_0x03fe
            goto L_0x041a
        L_0x03fe:
            r4 = 4
            r3.mo22981A(r4)
        L_0x0402:
            int r4 = r3.f21040c
            int r7 = r3.f21039b
            int r4 = r4 - r7
            if (r4 <= 0) goto L_0x0419
            int r4 = r3.mo22984c()
            if (r4 == r6) goto L_0x0415
            if (r4 == r5) goto L_0x0413
            r4 = 0
            goto L_0x0416
        L_0x0413:
            r4 = 1
            goto L_0x0416
        L_0x0415:
            r4 = 2
        L_0x0416:
            if (r4 == 0) goto L_0x0402
            goto L_0x041a
        L_0x0419:
            r4 = 0
        L_0x041a:
            r1.f20586w = r4
            goto L_0x0442
        L_0x041d:
            java.util.ArrayDeque<ta.a$a> r4 = r1.f20569f
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L_0x0442
            java.util.ArrayDeque<ta.a$a> r4 = r1.f20569f
            java.lang.Object r4 = r4.peek()
            ta.a$a r4 = (p264ta.C6619a.C6620a) r4
            ta.a$b r5 = new ta.a$b
            int r6 = r1.f20573j
            r5.<init>(r6, r3)
            java.util.ArrayList r3 = r4.f20490c
            r3.add(r5)
            goto L_0x0442
        L_0x043a:
            int r3 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r3 >= 0) goto L_0x0444
            int r3 = (int) r5
            r0.mo21582i(r3)
        L_0x0442:
            r3 = 0
            goto L_0x044c
        L_0x0444:
            long r3 = r39.getPosition()
            long r3 = r3 + r5
            r2.f18624a = r3
            r3 = 1
        L_0x044c:
            r1.mo22814j(r9)
            if (r3 == 0) goto L_0x0458
            int r3 = r1.f20572i
            r4 = 2
            if (r3 == r4) goto L_0x0458
            r14 = 1
            goto L_0x0459
        L_0x0458:
            r14 = 0
        L_0x0459:
            if (r14 == 0) goto L_0x0006
            r3 = 1
            return r3
        L_0x045d:
            r3 = 1
            int r7 = r1.f20575l
            r9 = 0
            if (r7 != 0) goto L_0x04cf
            ub.r r7 = r1.f20568e
            byte[] r7 = r7.f21038a
            r8 = 8
            r10 = 0
            boolean r7 = r0.mo21581h(r10, r8, r7, r3)
            if (r7 != 0) goto L_0x04b5
            int r3 = r1.f20586w
            r4 = 2
            if (r3 != r4) goto L_0x04b2
            int r3 = r1.f20564a
            r3 = r3 & r4
            if (r3 == 0) goto L_0x04b2
            ma.j r3 = r1.f20581r
            r3.getClass()
            r4 = 4
            ma.v r4 = r3.mo20709p(r10, r4)
            com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata r5 = r1.f20587x
            if (r5 != 0) goto L_0x0489
            goto L_0x0493
        L_0x0489:
            com.google.android.exoplayer2.metadata.Metadata r9 = new com.google.android.exoplayer2.metadata.Metadata
            r6 = 1
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r6 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r6]
            r6[r10] = r5
            r9.<init>((com.google.android.exoplayer2.metadata.Metadata.Entry[]) r6)
        L_0x0493:
            com.google.android.exoplayer2.Format$b r5 = new com.google.android.exoplayer2.Format$b
            r5.<init>()
            r5.f13444i = r9
            com.google.android.exoplayer2.Format r6 = new com.google.android.exoplayer2.Format
            r6.<init>((com.google.android.exoplayer2.Format.C3872b) r5)
            r4.mo20632c(r6)
            r3.mo20708n()
            ma.t$b r4 = new ma.t$b
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r4.<init>(r5)
            r3.mo20707k(r4)
        L_0x04b2:
            r13 = 0
            goto L_0x0669
        L_0x04b5:
            r3 = 8
            r1.f20575l = r3
            ub.r r3 = r1.f20568e
            r7 = 0
            r3.mo23007z(r7)
            ub.r r3 = r1.f20568e
            long r10 = r3.mo22998q()
            r1.f20574k = r10
            ub.r r3 = r1.f20568e
            int r3 = r3.mo22984c()
            r1.f20573j = r3
        L_0x04cf:
            long r10 = r1.f20574k
            r12 = 1
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x04ee
            ub.r r3 = r1.f20568e
            byte[] r3 = r3.f21038a
            r5 = 8
            r0.readFully(r3, r5, r5)
            int r3 = r1.f20575l
            int r3 = r3 + r5
            r1.f20575l = r3
            ub.r r3 = r1.f20568e
            long r5 = r3.mo23001t()
            r1.f20574k = r5
            goto L_0x0517
        L_0x04ee:
            r12 = 0
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 != 0) goto L_0x0517
            long r10 = r39.getLength()
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0508
            java.util.ArrayDeque<ta.a$a> r3 = r1.f20569f
            java.lang.Object r3 = r3.peek()
            ta.a$a r3 = (p264ta.C6619a.C6620a) r3
            if (r3 == 0) goto L_0x0508
            long r10 = r3.f20489b
        L_0x0508:
            int r3 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0517
            long r5 = r39.getPosition()
            long r10 = r10 - r5
            int r3 = r1.f20575l
            long r5 = (long) r3
            long r10 = r10 + r5
            r1.f20574k = r10
        L_0x0517:
            long r5 = r1.f20574k
            int r3 = r1.f20575l
            long r10 = (long) r3
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 < 0) goto L_0x066d
            int r5 = r1.f20573j
            r6 = 1836019574(0x6d6f6f76, float:4.631354E27)
            r7 = 1835365473(0x6d657461, float:4.4382975E27)
            if (r5 == r6) goto L_0x0548
            r6 = 1953653099(0x7472616b, float:7.681346E31)
            if (r5 == r6) goto L_0x0548
            r6 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r5 == r6) goto L_0x0548
            r6 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r5 == r6) goto L_0x0548
            r6 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r5 == r6) goto L_0x0548
            r6 = 1701082227(0x65647473, float:6.742798E22)
            if (r5 == r6) goto L_0x0548
            if (r5 != r7) goto L_0x0546
            goto L_0x0548
        L_0x0546:
            r6 = 0
            goto L_0x0549
        L_0x0548:
            r6 = 1
        L_0x0549:
            r10 = 1751411826(0x68646c72, float:4.3148E24)
            if (r6 == 0) goto L_0x05b0
            long r3 = r39.getPosition()
            long r5 = r1.f20574k
            long r3 = r3 + r5
            int r9 = r1.f20575l
            long r11 = (long) r9
            long r3 = r3 - r11
            int r9 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r9 == 0) goto L_0x058f
            int r5 = r1.f20573j
            if (r5 != r7) goto L_0x058f
            ub.r r5 = r1.f20567d
            r6 = 8
            r5.mo23004w(r6)
            ub.r r5 = r1.f20567d
            byte[] r5 = r5.f21038a
            r7 = 0
            r0.mo21575a(r7, r6, r5)
            ub.r r5 = r1.f20567d
            byte[] r6 = p264ta.C6622b.f20493a
            int r6 = r5.f21039b
            r7 = 4
            r5.mo22981A(r7)
            int r7 = r5.mo22984c()
            if (r7 == r10) goto L_0x0582
            int r6 = r6 + 4
        L_0x0582:
            r5.mo23007z(r6)
            ub.r r5 = r1.f20567d
            int r5 = r5.f21039b
            r0.mo21582i(r5)
            r39.mo21576c()
        L_0x058f:
            java.util.ArrayDeque<ta.a$a> r5 = r1.f20569f
            ta.a$a r6 = new ta.a$a
            int r7 = r1.f20573j
            r6.<init>(r7, r3)
            r5.push(r6)
            long r5 = r1.f20574k
            int r7 = r1.f20575l
            long r9 = (long) r7
            int r7 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x05a8
            r1.mo22814j(r3)
            goto L_0x05ad
        L_0x05a8:
            r3 = 0
            r1.f20572i = r3
            r1.f20575l = r3
        L_0x05ad:
            r3 = 1
            goto L_0x0668
        L_0x05b0:
            r6 = 1835296868(0x6d646864, float:4.418049E27)
            if (r5 == r6) goto L_0x0607
            r6 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r5 == r6) goto L_0x0607
            if (r5 == r10) goto L_0x0607
            r6 = 1937011556(0x73747364, float:1.9367383E31)
            if (r5 == r6) goto L_0x0607
            r6 = 1937011827(0x73747473, float:1.9367711E31)
            if (r5 == r6) goto L_0x0607
            r6 = 1937011571(0x73747373, float:1.9367401E31)
            if (r5 == r6) goto L_0x0607
            r6 = 1668576371(0x63747473, float:4.5093966E21)
            if (r5 == r6) goto L_0x0607
            r6 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r5 == r6) goto L_0x0607
            r6 = 1937011555(0x73747363, float:1.9367382E31)
            if (r5 == r6) goto L_0x0607
            r6 = 1937011578(0x7374737a, float:1.936741E31)
            if (r5 == r6) goto L_0x0607
            r6 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r5 == r6) goto L_0x0607
            r6 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r5 == r6) goto L_0x0607
            r6 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r5 == r6) goto L_0x0607
            r6 = 1953196132(0x746b6864, float:7.46037E31)
            if (r5 == r6) goto L_0x0607
            if (r5 == r4) goto L_0x0607
            r4 = 1969517665(0x75647461, float:2.8960062E32)
            if (r5 == r4) goto L_0x0607
            r4 = 1801812339(0x6b657973, float:2.7741754E26)
            if (r5 == r4) goto L_0x0607
            r4 = 1768715124(0x696c7374, float:1.7865732E25)
            if (r5 != r4) goto L_0x0605
            goto L_0x0607
        L_0x0605:
            r4 = 0
            goto L_0x0608
        L_0x0607:
            r4 = 1
        L_0x0608:
            if (r4 == 0) goto L_0x063d
            r4 = 8
            if (r3 != r4) goto L_0x0610
            r3 = 1
            goto L_0x0611
        L_0x0610:
            r3 = 0
        L_0x0611:
            p583jk.C17875h.m44304o(r3)
            long r3 = r1.f20574k
            r5 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x061f
            r3 = 1
            goto L_0x0620
        L_0x061f:
            r3 = 0
        L_0x0620:
            p583jk.C17875h.m44304o(r3)
            ub.r r3 = new ub.r
            long r4 = r1.f20574k
            int r5 = (int) r4
            r3.<init>((int) r5)
            ub.r r4 = r1.f20568e
            byte[] r4 = r4.f21038a
            byte[] r5 = r3.f21038a
            r6 = 8
            r7 = 0
            java.lang.System.arraycopy(r4, r7, r5, r7, r6)
            r1.f20576m = r3
            r3 = 1
            r1.f20572i = r3
            goto L_0x0668
        L_0x063d:
            long r3 = r39.getPosition()
            int r5 = r1.f20575l
            long r5 = (long) r5
            long r26 = r3 - r5
            int r3 = r1.f20573j
            r4 = 1836086884(0x6d707664, float:4.6512205E27)
            if (r3 != r4) goto L_0x0663
            com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata r3 = new com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata
            r24 = 0
            r28 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r30 = r26 + r5
            long r7 = r1.f20574k
            long r32 = r7 - r5
            r23 = r3
            r23.<init>(r24, r26, r28, r30, r32)
            r1.f20587x = r3
        L_0x0663:
            r1.f20576m = r9
            r3 = 1
            r1.f20572i = r3
        L_0x0668:
            r13 = 1
        L_0x0669:
            if (r13 != 0) goto L_0x0006
            r3 = -1
            return r3
        L_0x066d:
            com.google.android.exoplayer2.ParserException r0 = new com.google.android.exoplayer2.ParserException
            java.lang.String r2 = "Atom size less than header length (unsupported)."
            r0.<init>((java.lang.String) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p264ta.C6634h.mo21595h(ma.i, ma.s):int");
    }

    /* renamed from: i */
    public final long mo21571i() {
        return this.f20585v;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v19, resolved type: com.google.android.exoplayer2.metadata.Metadata} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0324 A[Catch:{ all -> 0x00da }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0504  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x0506  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x065e A[LOOP:12: B:323:0x065b->B:325:0x065e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x067a  */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x0341 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x063d A[EDGE_INSN: B:379:0x063d->B:322:0x063d ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00ee A[Catch:{ all -> 0x00da }] */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22814j(long r30) throws com.google.android.exoplayer2.ParserException {
        /*
            r29 = this;
            r1 = r29
            r0 = r1
        L_0x0003:
            java.util.ArrayDeque<ta.a$a> r2 = r0.f20569f
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x06e1
            java.util.ArrayDeque<ta.a$a> r2 = r0.f20569f
            java.lang.Object r2 = r2.peek()
            ta.a$a r2 = (p264ta.C6619a.C6620a) r2
            long r5 = r2.f20489b
            int r2 = (r5 > r30 ? 1 : (r5 == r30 ? 0 : -1))
            if (r2 != 0) goto L_0x06e1
            java.util.ArrayDeque<ta.a$a> r2 = r0.f20569f
            java.lang.Object r2 = r2.pop()
            r5 = r2
            ta.a$a r5 = (p264ta.C6619a.C6620a) r5
            int r2 = r5.f20488a
            r6 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r2 != r6) goto L_0x06ca
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r6 = r0.f20586w
            r13 = 1
            if (r6 != r13) goto L_0x0035
            r11 = 1
            goto L_0x0036
        L_0x0035:
            r11 = 0
        L_0x0036:
            ma.p r14 = new ma.p
            r14.<init>()
            r6 = 1969517665(0x75647461, float:2.8960062E32)
            ta.a$b r6 = r5.mo22801c(r6)
            r8 = 1768715124(0x696c7374, float:1.7865732E25)
            r9 = 1751411826(0x68646c72, float:4.3148E24)
            r10 = 1835365473(0x6d657461, float:4.4382975E27)
            r3 = 4
            r12 = 8
            if (r6 == 0) goto L_0x040c
            byte[] r19 = p264ta.C6622b.f20493a
            ub.r r6 = r6.f20492b
            r6.mo23007z(r12)
            r20 = 0
            r21 = 0
        L_0x005b:
            int r4 = r6.f21040c
            int r13 = r6.f21039b
            int r4 = r4 - r13
            if (r4 < r12) goto L_0x03f2
            int r4 = r6.mo22984c()
            int r7 = r6.mo22984c()
            if (r7 != r10) goto L_0x0379
            r6.mo23007z(r13)
            int r7 = r13 + r4
            r6.mo22981A(r12)
            int r10 = r6.f21039b
            r6.mo22981A(r3)
            int r15 = r6.mo22984c()
            if (r15 == r9) goto L_0x0081
            int r10 = r10 + 4
        L_0x0081:
            r6.mo23007z(r10)
        L_0x0084:
            int r10 = r6.f21039b
            if (r10 >= r7) goto L_0x0374
            int r15 = r6.mo22984c()
            int r9 = r6.mo22984c()
            if (r9 != r8) goto L_0x0363
            r6.mo23007z(r10)
            int r10 = r10 + r15
            r6.mo22981A(r12)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x009e:
            int r9 = r6.f21039b
            if (r9 >= r10) goto L_0x0351
            int r15 = r6.mo22984c()
            int r15 = r15 + r9
            int r9 = r6.mo22984c()
            int r8 = r9 >> 24
            r8 = r8 & 255(0xff, float:3.57E-43)
            r12 = 169(0xa9, float:2.37E-43)
            java.lang.String r3 = "TCON"
            r20 = 16777215(0xffffff, float:2.3509886E-38)
            if (r8 == r12) goto L_0x0266
            r12 = 253(0xfd, float:3.55E-43)
            if (r8 != r12) goto L_0x00be
            goto L_0x0266
        L_0x00be:
            r8 = 1735291493(0x676e7265, float:1.1260334E24)
            if (r9 != r8) goto L_0x00fa
            r8 = 4
            r6.mo22981A(r8)     // Catch:{ all -> 0x00da }
            int r8 = r6.mo22984c()     // Catch:{ all -> 0x00da }
            r9 = 1684108385(0x64617461, float:1.6635614E22)
            if (r8 != r9) goto L_0x00dd
            r8 = 8
            r6.mo22981A(r8)     // Catch:{ all -> 0x00da }
            int r8 = r6.mo22997p()     // Catch:{ all -> 0x00da }
            goto L_0x00de
        L_0x00da:
            r0 = move-exception
            goto L_0x034d
        L_0x00dd:
            r8 = -1
        L_0x00de:
            if (r8 <= 0) goto L_0x00eb
            java.lang.String[] r9 = p264ta.C6632f.f20563a     // Catch:{ all -> 0x00da }
            r12 = 192(0xc0, float:2.69E-43)
            if (r8 > r12) goto L_0x00eb
            int r8 = r8 + -1
            r8 = r9[r8]     // Catch:{ all -> 0x00da }
            goto L_0x00ec
        L_0x00eb:
            r8 = 0
        L_0x00ec:
            if (r8 == 0) goto L_0x00f5
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r9 = new com.google.android.exoplayer2.metadata.id3.TextInformationFrame     // Catch:{ all -> 0x00da }
            r12 = 0
            r9.<init>(r3, r12, r8)     // Catch:{ all -> 0x00da }
            goto L_0x0105
        L_0x00f5:
            r26 = r2
            r2 = 0
            goto L_0x0173
        L_0x00fa:
            r3 = 1684632427(0x6469736b, float:1.7225632E22)
            if (r9 != r3) goto L_0x010a
            java.lang.String r3 = "TPOS"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r9 = p264ta.C6632f.m15688a(r9, r6, r3)     // Catch:{ all -> 0x00da }
        L_0x0105:
            r26 = r2
            r2 = 0
            goto L_0x01f5
        L_0x010a:
            r3 = 1953655662(0x74726b6e, float:7.6825853E31)
            if (r9 != r3) goto L_0x0116
            java.lang.String r3 = "TRCK"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r9 = p264ta.C6632f.m15688a(r9, r6, r3)     // Catch:{ all -> 0x00da }
            goto L_0x0105
        L_0x0116:
            r3 = 1953329263(0x746d706f, float:7.5247484E31)
            if (r9 != r3) goto L_0x0124
            java.lang.String r3 = "TBPM"
            r8 = 1
            r12 = 0
            com.google.android.exoplayer2.metadata.id3.Id3Frame r9 = p264ta.C6632f.m15690c(r9, r3, r6, r8, r12)     // Catch:{ all -> 0x00da }
            goto L_0x0105
        L_0x0124:
            r3 = 1668311404(0x6370696c, float:4.434815E21)
            if (r9 != r3) goto L_0x0131
            java.lang.String r3 = "TCMP"
            r8 = 1
            com.google.android.exoplayer2.metadata.id3.Id3Frame r9 = p264ta.C6632f.m15690c(r9, r3, r6, r8, r8)     // Catch:{ all -> 0x00da }
            goto L_0x0105
        L_0x0131:
            r3 = 1668249202(0x636f7672, float:4.4173067E21)
            if (r9 != r3) goto L_0x0177
            int r3 = r6.mo22984c()     // Catch:{ all -> 0x00da }
            int r8 = r6.mo22984c()     // Catch:{ all -> 0x00da }
            r9 = 1684108385(0x64617461, float:1.6635614E22)
            if (r8 != r9) goto L_0x00f5
            int r8 = r6.mo22984c()     // Catch:{ all -> 0x00da }
            r8 = r8 & r20
            r9 = 13
            if (r8 != r9) goto L_0x0150
            java.lang.String r12 = "image/jpeg"
            goto L_0x0158
        L_0x0150:
            r9 = 14
            if (r8 != r9) goto L_0x0157
            java.lang.String r12 = "image/png"
            goto L_0x0158
        L_0x0157:
            r12 = 0
        L_0x0158:
            if (r12 != 0) goto L_0x015b
            goto L_0x00f5
        L_0x015b:
            r8 = 4
            r6.mo22981A(r8)     // Catch:{ all -> 0x00da }
            int r3 = r3 + -16
            byte[] r8 = new byte[r3]     // Catch:{ all -> 0x00da }
            r9 = 0
            r6.mo22983b(r9, r3, r8)     // Catch:{ all -> 0x00da }
            com.google.android.exoplayer2.metadata.id3.ApicFrame r3 = new com.google.android.exoplayer2.metadata.id3.ApicFrame     // Catch:{ all -> 0x00da }
            r9 = 3
            r26 = r2
            r2 = 0
            r3.<init>(r12, r2, r9, r8)     // Catch:{ all -> 0x00da }
            r12 = r3
            goto L_0x01f6
        L_0x0173:
            r28 = r10
            goto L_0x02a6
        L_0x0177:
            r26 = r2
            r2 = 0
            r3 = 1631670868(0x61415254, float:2.2288462E20)
            if (r9 != r3) goto L_0x0187
            java.lang.String r3 = "TPE2"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r9 = p264ta.C6632f.m15689b(r9, r6, r3)     // Catch:{ all -> 0x00da }
            goto L_0x01f5
        L_0x0187:
            r3 = 1936682605(0x736f6e6d, float:1.8969706E31)
            if (r9 != r3) goto L_0x0193
            java.lang.String r3 = "TSOT"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r9 = p264ta.C6632f.m15689b(r9, r6, r3)     // Catch:{ all -> 0x00da }
            goto L_0x01f5
        L_0x0193:
            r3 = 1936679276(0x736f616c, float:1.8965681E31)
            if (r9 != r3) goto L_0x019f
            java.lang.String r3 = "TSO2"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r9 = p264ta.C6632f.m15689b(r9, r6, r3)     // Catch:{ all -> 0x00da }
            goto L_0x01f5
        L_0x019f:
            r3 = 1936679282(0x736f6172, float:1.8965689E31)
            if (r9 != r3) goto L_0x01ab
            java.lang.String r3 = "TSOA"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r9 = p264ta.C6632f.m15689b(r9, r6, r3)     // Catch:{ all -> 0x00da }
            goto L_0x01f5
        L_0x01ab:
            r3 = 1936679265(0x736f6161, float:1.8965668E31)
            if (r9 != r3) goto L_0x01b7
            java.lang.String r3 = "TSOP"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r9 = p264ta.C6632f.m15689b(r9, r6, r3)     // Catch:{ all -> 0x00da }
            goto L_0x01f5
        L_0x01b7:
            r3 = 1936679791(0x736f636f, float:1.8966304E31)
            if (r9 != r3) goto L_0x01c3
            java.lang.String r3 = "TSOC"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r9 = p264ta.C6632f.m15689b(r9, r6, r3)     // Catch:{ all -> 0x00da }
            goto L_0x01f5
        L_0x01c3:
            r3 = 1920233063(0x72746e67, float:4.84146E30)
            if (r9 != r3) goto L_0x01d0
            java.lang.String r3 = "ITUNESADVISORY"
            r8 = 0
            com.google.android.exoplayer2.metadata.id3.Id3Frame r9 = p264ta.C6632f.m15690c(r9, r3, r6, r8, r8)     // Catch:{ all -> 0x00da }
            goto L_0x01f5
        L_0x01d0:
            r3 = 1885823344(0x70676170, float:2.8643533E29)
            if (r9 != r3) goto L_0x01de
            java.lang.String r3 = "ITUNESGAPLESS"
            r8 = 1
            r12 = 0
            com.google.android.exoplayer2.metadata.id3.Id3Frame r9 = p264ta.C6632f.m15690c(r9, r3, r6, r12, r8)     // Catch:{ all -> 0x00da }
            goto L_0x01f5
        L_0x01de:
            r3 = 1936683886(0x736f736e, float:1.8971255E31)
            if (r9 != r3) goto L_0x01ea
            java.lang.String r3 = "TVSHOWSORT"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r9 = p264ta.C6632f.m15689b(r9, r6, r3)     // Catch:{ all -> 0x00da }
            goto L_0x01f5
        L_0x01ea:
            r3 = 1953919848(0x74767368, float:7.810338E31)
            if (r9 != r3) goto L_0x01fa
            java.lang.String r3 = "TVSHOW"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r9 = p264ta.C6632f.m15689b(r9, r6, r3)     // Catch:{ all -> 0x00da }
        L_0x01f5:
            r12 = r9
        L_0x01f6:
            r28 = r10
            goto L_0x0339
        L_0x01fa:
            r3 = 757935405(0x2d2d2d2d, float:9.8439425E-12)
            if (r9 != r3) goto L_0x0262
            r3 = r2
            r12 = r3
            r8 = -1
            r9 = -1
        L_0x0203:
            int r2 = r6.f21039b     // Catch:{ all -> 0x00da }
            if (r2 >= r15) goto L_0x0242
            int r20 = r6.mo22984c()     // Catch:{ all -> 0x00da }
            r27 = r2
            int r2 = r6.mo22984c()     // Catch:{ all -> 0x00da }
            r28 = r10
            r10 = 4
            r6.mo22981A(r10)     // Catch:{ all -> 0x00da }
            r10 = 1835360622(0x6d65616e, float:4.4368658E27)
            if (r2 != r10) goto L_0x0224
            int r2 = r20 + -12
            java.lang.String r2 = r6.mo22993l(r2)     // Catch:{ all -> 0x00da }
            r12 = r2
            goto L_0x023f
        L_0x0224:
            r10 = 1851878757(0x6e616d65, float:1.7441594E28)
            if (r2 != r10) goto L_0x0231
            int r2 = r20 + -12
            java.lang.String r2 = r6.mo22993l(r2)     // Catch:{ all -> 0x00da }
            r3 = r2
            goto L_0x023f
        L_0x0231:
            r10 = 1684108385(0x64617461, float:1.6635614E22)
            if (r2 != r10) goto L_0x023a
            r9 = r20
            r8 = r27
        L_0x023a:
            int r2 = r20 + -12
            r6.mo22981A(r2)     // Catch:{ all -> 0x00da }
        L_0x023f:
            r10 = r28
            goto L_0x0203
        L_0x0242:
            r28 = r10
            if (r12 == 0) goto L_0x02a6
            if (r3 == 0) goto L_0x02a6
            r2 = -1
            if (r8 != r2) goto L_0x024c
            goto L_0x02a6
        L_0x024c:
            r6.mo23007z(r8)     // Catch:{ all -> 0x00da }
            r2 = 16
            r6.mo22981A(r2)     // Catch:{ all -> 0x00da }
            int r9 = r9 + -16
            java.lang.String r2 = r6.mo22993l(r9)     // Catch:{ all -> 0x00da }
            com.google.android.exoplayer2.metadata.id3.InternalFrame r8 = new com.google.android.exoplayer2.metadata.id3.InternalFrame     // Catch:{ all -> 0x00da }
            r8.<init>(r12, r3, r2)     // Catch:{ all -> 0x00da }
            r12 = r8
            goto L_0x0339
        L_0x0262:
            r28 = r10
            goto L_0x0314
        L_0x0266:
            r26 = r2
            r28 = r10
            r2 = r9 & r20
            r8 = 6516084(0x636d74, float:9.130979E-39)
            if (r2 != r8) goto L_0x02a9
            int r2 = r6.mo22984c()     // Catch:{ all -> 0x00da }
            int r3 = r6.mo22984c()     // Catch:{ all -> 0x00da }
            r8 = 1684108385(0x64617461, float:1.6635614E22)
            if (r3 != r8) goto L_0x0293
            r3 = 8
            r6.mo22981A(r3)     // Catch:{ all -> 0x00da }
            int r2 = r2 + -16
            java.lang.String r2 = r6.mo22993l(r2)     // Catch:{ all -> 0x00da }
            com.google.android.exoplayer2.metadata.id3.CommentFrame r12 = new com.google.android.exoplayer2.metadata.id3.CommentFrame     // Catch:{ all -> 0x00da }
            java.lang.String r3 = "und"
            r12.<init>(r3, r2, r2)     // Catch:{ all -> 0x00da }
            goto L_0x0339
        L_0x0293:
            java.lang.String r2 = p264ta.C6619a.m15659a(r9)     // Catch:{ all -> 0x00da }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00da }
            int r3 = r2.length()     // Catch:{ all -> 0x00da }
            if (r3 == 0) goto L_0x02a6
            java.lang.String r3 = "Failed to parse comment attribute: "
            r3.concat(r2)     // Catch:{ all -> 0x00da }
        L_0x02a6:
            r12 = 0
            goto L_0x0339
        L_0x02a9:
            r8 = 7233901(0x6e616d, float:1.0136854E-38)
            if (r2 == r8) goto L_0x0333
            r8 = 7631467(0x74726b, float:1.0693963E-38)
            if (r2 != r8) goto L_0x02b5
            goto L_0x0333
        L_0x02b5:
            r8 = 6516589(0x636f6d, float:9.131686E-39)
            if (r2 == r8) goto L_0x032c
            r8 = 7828084(0x777274, float:1.0969482E-38)
            if (r2 != r8) goto L_0x02c1
            goto L_0x032c
        L_0x02c1:
            r8 = 6578553(0x646179, float:9.218516E-39)
            if (r2 != r8) goto L_0x02ce
            java.lang.String r2 = "TDRC"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r12 = p264ta.C6632f.m15689b(r9, r6, r2)     // Catch:{ all -> 0x00da }
            goto L_0x0339
        L_0x02ce:
            r8 = 4280916(0x415254, float:5.998841E-39)
            if (r2 != r8) goto L_0x02da
            java.lang.String r2 = "TPE1"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r12 = p264ta.C6632f.m15689b(r9, r6, r2)     // Catch:{ all -> 0x00da }
            goto L_0x0339
        L_0x02da:
            r8 = 7630703(0x746f6f, float:1.0692892E-38)
            if (r2 != r8) goto L_0x02e6
            java.lang.String r2 = "TSSE"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r12 = p264ta.C6632f.m15689b(r9, r6, r2)     // Catch:{ all -> 0x00da }
            goto L_0x0339
        L_0x02e6:
            r8 = 6384738(0x616c62, float:8.946924E-39)
            if (r2 != r8) goto L_0x02f2
            java.lang.String r2 = "TALB"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r12 = p264ta.C6632f.m15689b(r9, r6, r2)     // Catch:{ all -> 0x00da }
            goto L_0x0339
        L_0x02f2:
            r8 = 7108978(0x6c7972, float:9.9618E-39)
            if (r2 != r8) goto L_0x02fe
            java.lang.String r2 = "USLT"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r12 = p264ta.C6632f.m15689b(r9, r6, r2)     // Catch:{ all -> 0x00da }
            goto L_0x0339
        L_0x02fe:
            r8 = 6776174(0x67656e, float:9.495442E-39)
            if (r2 != r8) goto L_0x0308
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r12 = p264ta.C6632f.m15689b(r9, r6, r3)     // Catch:{ all -> 0x00da }
            goto L_0x0339
        L_0x0308:
            r3 = 6779504(0x677270, float:9.500109E-39)
            if (r2 != r3) goto L_0x0314
            java.lang.String r2 = "TIT1"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r12 = p264ta.C6632f.m15689b(r9, r6, r2)     // Catch:{ all -> 0x00da }
            goto L_0x0339
        L_0x0314:
            java.lang.String r2 = "Skipped unknown metadata entry: "
            java.lang.String r3 = p264ta.C6619a.m15659a(r9)     // Catch:{ all -> 0x00da }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x00da }
            int r8 = r3.length()     // Catch:{ all -> 0x00da }
            if (r8 == 0) goto L_0x0327
            r2.concat(r3)     // Catch:{ all -> 0x00da }
        L_0x0327:
            r6.mo23007z(r15)
            r12 = 0
            goto L_0x033c
        L_0x032c:
            java.lang.String r2 = "TCOM"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r12 = p264ta.C6632f.m15689b(r9, r6, r2)     // Catch:{ all -> 0x00da }
            goto L_0x0339
        L_0x0333:
            java.lang.String r2 = "TIT2"
            com.google.android.exoplayer2.metadata.id3.TextInformationFrame r12 = p264ta.C6632f.m15689b(r9, r6, r2)     // Catch:{ all -> 0x00da }
        L_0x0339:
            r6.mo23007z(r15)
        L_0x033c:
            if (r12 == 0) goto L_0x0341
            r7.add(r12)
        L_0x0341:
            r2 = r26
            r10 = r28
            r3 = 4
            r8 = 1768715124(0x696c7374, float:1.7865732E25)
            r12 = 8
            goto L_0x009e
        L_0x034d:
            r6.mo23007z(r15)
            throw r0
        L_0x0351:
            r26 = r2
            boolean r2 = r7.isEmpty()
            if (r2 == 0) goto L_0x035a
            goto L_0x0376
        L_0x035a:
            com.google.android.exoplayer2.metadata.Metadata r2 = new com.google.android.exoplayer2.metadata.Metadata
            r2.<init>((java.util.ArrayList) r7)
            r20 = r2
            goto L_0x03dd
        L_0x0363:
            r26 = r2
            int r10 = r10 + r15
            r6.mo23007z(r10)
            r3 = 4
            r8 = 1768715124(0x696c7374, float:1.7865732E25)
            r9 = 1751411826(0x68646c72, float:4.3148E24)
            r12 = 8
            goto L_0x0084
        L_0x0374:
            r26 = r2
        L_0x0376:
            r20 = 0
            goto L_0x03dd
        L_0x0379:
            r26 = r2
            r2 = 1936553057(0x736d7461, float:1.8813092E31)
            if (r7 != r2) goto L_0x03dd
            r6.mo23007z(r13)
            int r2 = r13 + r4
            r3 = 12
            r6.mo22981A(r3)
        L_0x038a:
            int r3 = r6.f21039b
            if (r3 >= r2) goto L_0x03db
            int r7 = r6.mo22984c()
            int r8 = r6.mo22984c()
            r9 = 1935766900(0x73617574, float:1.7862687E31)
            if (r8 != r9) goto L_0x03d2
            r8 = 14
            if (r7 >= r8) goto L_0x03a0
            goto L_0x03db
        L_0x03a0:
            r2 = 5
            r6.mo22981A(r2)
            int r2 = r6.mo22997p()
            r3 = 12
            if (r2 == r3) goto L_0x03b1
            r9 = 13
            if (r2 == r9) goto L_0x03b1
            goto L_0x03db
        L_0x03b1:
            if (r2 != r3) goto L_0x03b6
            r2 = 1131413504(0x43700000, float:240.0)
            goto L_0x03b8
        L_0x03b6:
            r2 = 1123024896(0x42f00000, float:120.0)
        L_0x03b8:
            r3 = 1
            r6.mo22981A(r3)
            int r7 = r6.mo22997p()
            com.google.android.exoplayer2.metadata.Metadata r8 = new com.google.android.exoplayer2.metadata.Metadata
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r9 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r3]
            com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry r3 = new com.google.android.exoplayer2.metadata.mp4.SmtaMetadataEntry
            r3.<init>(r2, r7)
            r2 = 0
            r9[r2] = r3
            r8.<init>((com.google.android.exoplayer2.metadata.Metadata.Entry[]) r9)
            r21 = r8
            goto L_0x03dd
        L_0x03d2:
            r8 = 14
            r9 = 13
            int r3 = r3 + r7
            r6.mo23007z(r3)
            goto L_0x038a
        L_0x03db:
            r21 = 0
        L_0x03dd:
            int r13 = r13 + r4
            r6.mo23007z(r13)
            r2 = r26
            r3 = 4
            r8 = 1768715124(0x696c7374, float:1.7865732E25)
            r9 = 1751411826(0x68646c72, float:4.3148E24)
            r10 = 1835365473(0x6d657461, float:4.4382975E27)
            r12 = 8
            r13 = 1
            goto L_0x005b
        L_0x03f2:
            r26 = r2
            r7 = r20
            r2 = r21
            android.util.Pair r2 = android.util.Pair.create(r7, r2)
            java.lang.Object r3 = r2.first
            r12 = r3
            com.google.android.exoplayer2.metadata.Metadata r12 = (com.google.android.exoplayer2.metadata.Metadata) r12
            java.lang.Object r2 = r2.second
            com.google.android.exoplayer2.metadata.Metadata r2 = (com.google.android.exoplayer2.metadata.Metadata) r2
            if (r12 == 0) goto L_0x040a
            r14.mo21600b(r12)
        L_0x040a:
            r3 = r12
            goto L_0x0410
        L_0x040c:
            r26 = r2
            r2 = 0
            r3 = 0
        L_0x0410:
            r4 = 1835365473(0x6d657461, float:4.4382975E27)
            ta.a$a r4 = r5.mo22800b(r4)
            if (r4 == 0) goto L_0x04fb
            byte[] r6 = p264ta.C6622b.f20493a
            r6 = 1751411826(0x68646c72, float:4.3148E24)
            ta.a$b r6 = r4.mo22801c(r6)
            r7 = 1801812339(0x6b657973, float:2.7741754E26)
            ta.a$b r7 = r4.mo22801c(r7)
            r8 = 1768715124(0x696c7374, float:1.7865732E25)
            ta.a$b r4 = r4.mo22801c(r8)
            if (r6 == 0) goto L_0x04fb
            if (r7 == 0) goto L_0x04fb
            if (r4 == 0) goto L_0x04fb
            ub.r r6 = r6.f20492b
            r8 = 16
            r6.mo23007z(r8)
            int r6 = r6.mo22984c()
            r8 = 1835299937(0x6d647461, float:4.4189547E27)
            if (r6 == r8) goto L_0x0448
            goto L_0x04fb
        L_0x0448:
            ub.r r6 = r7.f20492b
            r7 = 12
            r6.mo23007z(r7)
            int r7 = r6.mo22984c()
            java.lang.String[] r8 = new java.lang.String[r7]
            r9 = 0
        L_0x0456:
            if (r9 >= r7) goto L_0x046c
            int r10 = r6.mo22984c()
            r12 = 4
            r6.mo22981A(r12)
            r13 = 8
            int r10 = r10 - r13
            java.lang.String r10 = r6.mo22994m(r10)
            r8[r9] = r10
            int r9 = r9 + 1
            goto L_0x0456
        L_0x046c:
            r13 = 8
            ub.r r4 = r4.f20492b
            r4.mo23007z(r13)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0478:
            int r9 = r4.f21040c
            int r10 = r4.f21039b
            int r9 = r9 - r10
            if (r9 <= r13) goto L_0x04eb
            int r9 = r4.mo22984c()
            int r12 = r4.mo22984c()
            r15 = -1
            int r12 = r12 + r15
            if (r12 < 0) goto L_0x04d8
            if (r12 >= r7) goto L_0x04d8
            r12 = r8[r12]
            int r13 = r10 + r9
        L_0x0491:
            int r15 = r4.f21039b
            if (r15 >= r13) goto L_0x04cb
            int r16 = r4.mo22984c()
            r17 = r7
            int r7 = r4.mo22984c()
            r20 = r8
            r8 = 1684108385(0x64617461, float:1.6635614E22)
            if (r7 != r8) goto L_0x04bf
            int r7 = r4.mo22984c()
            int r13 = r4.mo22984c()
            int r15 = r16 + -16
            byte[] r8 = new byte[r15]
            r21 = r3
            r3 = 0
            r4.mo22983b(r3, r15, r8)
            com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry r3 = new com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry
            r3.<init>(r12, r8, r13, r7)
            r12 = r3
            goto L_0x04d2
        L_0x04bf:
            r21 = r3
            int r15 = r15 + r16
            r4.mo23007z(r15)
            r7 = r17
            r8 = r20
            goto L_0x0491
        L_0x04cb:
            r21 = r3
            r17 = r7
            r20 = r8
            r12 = 0
        L_0x04d2:
            if (r12 == 0) goto L_0x04de
            r6.add(r12)
            goto L_0x04de
        L_0x04d8:
            r21 = r3
            r17 = r7
            r20 = r8
        L_0x04de:
            int r10 = r10 + r9
            r4.mo23007z(r10)
            r7 = r17
            r8 = r20
            r3 = r21
            r13 = 8
            goto L_0x0478
        L_0x04eb:
            r21 = r3
            boolean r3 = r6.isEmpty()
            if (r3 == 0) goto L_0x04f4
            goto L_0x04fd
        L_0x04f4:
            com.google.android.exoplayer2.metadata.Metadata r12 = new com.google.android.exoplayer2.metadata.Metadata
            r12.<init>((java.util.ArrayList) r6)
            r3 = r12
            goto L_0x04fe
        L_0x04fb:
            r21 = r3
        L_0x04fd:
            r3 = 0
        L_0x04fe:
            int r4 = r0.f20564a
            r6 = 1
            r4 = r4 & r6
            if (r4 == 0) goto L_0x0506
            r10 = 1
            goto L_0x0507
        L_0x0506:
            r10 = 0
        L_0x0507:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r9 = 0
            ta.g r12 = new ta.g
            r12.<init>()
            r6 = r14
            r4 = -1
            r13 = 0
            java.util.ArrayList r5 = p264ta.C6622b.m15666e(r5, r6, r7, r9, r10, r11, r12)
            ma.j r6 = r0.f20581r
            r6.getClass()
            int r7 = r5.size()
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = r14
            r10 = -1
            r11 = 0
            r13 = r8
        L_0x052b:
            r16 = 0
            if (r11 >= r7) goto L_0x063d
            java.lang.Object r15 = r5.get(r11)
            ta.o r15 = (p264ta.C6644o) r15
            int r4 = r15.f20638b
            if (r4 != 0) goto L_0x0542
            r20 = r5
            r23 = r7
            r5 = r26
            r4 = -1
            goto L_0x062e
        L_0x0542:
            ta.l r0 = r15.f20637a
            r20 = r5
            long r4 = r0.f20607e
            int r22 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r22 == 0) goto L_0x054d
            goto L_0x054f
        L_0x054d:
            long r4 = r15.f20644h
        L_0x054f:
            long r13 = java.lang.Math.max(r13, r4)
            ta.h$a r8 = new ta.h$a
            int r9 = r0.f20604b
            ma.v r9 = r6.mo20709p(r11, r9)
            r8.<init>(r0, r15, r9)
            int r9 = r15.f20641e
            int r9 = r9 + 30
            r23 = r7
            com.google.android.exoplayer2.Format r7 = r0.f20608f
            r7.getClass()
            r24 = r13
            com.google.android.exoplayer2.Format$b r13 = new com.google.android.exoplayer2.Format$b
            r13.<init>(r7)
            r13.f13447l = r9
            int r7 = r0.f20604b
            r9 = 2
            if (r7 != r9) goto L_0x0589
            int r9 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x0589
            int r9 = r15.f20638b
            r14 = 1
            if (r9 <= r14) goto L_0x0589
            float r9 = (float) r9
            float r4 = (float) r4
            r5 = 1232348160(0x49742400, float:1000000.0)
            float r4 = r4 / r5
            float r9 = r9 / r4
            r13.f13453r = r9
        L_0x0589:
            r4 = 1
            if (r7 != r4) goto L_0x05a0
            int r4 = r12.f18617a
            r5 = -1
            if (r4 == r5) goto L_0x0597
            int r9 = r12.f18618b
            if (r9 == r5) goto L_0x0597
            r5 = 1
            goto L_0x0598
        L_0x0597:
            r5 = 0
        L_0x0598:
            if (r5 == 0) goto L_0x05a0
            r13.f13432A = r4
            int r4 = r12.f18618b
            r13.f13433B = r4
        L_0x05a0:
            r4 = 2
            com.google.android.exoplayer2.metadata.Metadata[] r5 = new com.google.android.exoplayer2.metadata.Metadata[r4]
            r4 = 0
            r5[r4] = r2
            java.util.ArrayList r9 = r1.f20571h
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x05b0
            r9 = 0
            goto L_0x05b7
        L_0x05b0:
            com.google.android.exoplayer2.metadata.Metadata r9 = new com.google.android.exoplayer2.metadata.Metadata
            java.util.ArrayList r14 = r1.f20571h
            r9.<init>((java.util.ArrayList) r14)
        L_0x05b7:
            r14 = 1
            r5[r14] = r9
            com.google.android.exoplayer2.metadata.Metadata r9 = new com.google.android.exoplayer2.metadata.Metadata
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r15 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r4]
            r9.<init>((com.google.android.exoplayer2.metadata.Metadata.Entry[]) r15)
            if (r7 != r14) goto L_0x05c8
            if (r21 == 0) goto L_0x05f4
            r9 = r21
            goto L_0x05f4
        L_0x05c8:
            r4 = 2
            if (r7 != r4) goto L_0x05f4
            if (r3 == 0) goto L_0x05f4
            r4 = 0
        L_0x05ce:
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r7 = r3.f13864b
            int r14 = r7.length
            if (r4 >= r14) goto L_0x05f4
            r7 = r7[r4]
            boolean r14 = r7 instanceof com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry
            if (r14 == 0) goto L_0x05f1
            com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry r7 = (com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry) r7
            java.lang.String r14 = r7.f13942b
            java.lang.String r15 = "com.android.capture.fps"
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L_0x05f1
            com.google.android.exoplayer2.metadata.Metadata r9 = new com.google.android.exoplayer2.metadata.Metadata
            r4 = 1
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r14 = new com.google.android.exoplayer2.metadata.Metadata.Entry[r4]
            r4 = 0
            r14[r4] = r7
            r9.<init>((com.google.android.exoplayer2.metadata.Metadata.Entry[]) r14)
            goto L_0x05f4
        L_0x05f1:
            int r4 = r4 + 1
            goto L_0x05ce
        L_0x05f4:
            r4 = 0
        L_0x05f5:
            r7 = 2
            if (r4 >= r7) goto L_0x0607
            r7 = r5[r4]
            if (r7 != 0) goto L_0x05fd
            goto L_0x0604
        L_0x05fd:
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r7 = r7.f13864b
            com.google.android.exoplayer2.metadata.Metadata r7 = r9.mo16084b(r7)
            r9 = r7
        L_0x0604:
            int r4 = r4 + 1
            goto L_0x05f5
        L_0x0607:
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r4 = r9.f13864b
            int r4 = r4.length
            if (r4 <= 0) goto L_0x060e
            r13.f13444i = r9
        L_0x060e:
            ma.v r4 = r8.f20590c
            com.google.android.exoplayer2.Format r5 = new com.google.android.exoplayer2.Format
            r5.<init>((com.google.android.exoplayer2.Format.C3872b) r13)
            r4.mo20632c(r5)
            int r0 = r0.f20604b
            r4 = 2
            if (r0 != r4) goto L_0x0625
            r4 = -1
            if (r10 != r4) goto L_0x0626
            int r10 = r26.size()
            goto L_0x0626
        L_0x0625:
            r4 = -1
        L_0x0626:
            r5 = r26
            r5.add(r8)
            r0 = r1
            r13 = r24
        L_0x062e:
            int r11 = r11 + 1
            r26 = r5
            r5 = r20
            r7 = r23
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x052b
        L_0x063d:
            r5 = r26
            r0.f20584u = r10
            r0.f20585v = r13
            r2 = 0
            ta.h$a[] r3 = new p264ta.C6634h.C6635a[r2]
            java.lang.Object[] r2 = r5.toArray(r3)
            ta.h$a[] r2 = (p264ta.C6634h.C6635a[]) r2
            r0.f20582s = r2
            int r3 = r2.length
            long[][] r3 = new long[r3][]
            int r5 = r2.length
            int[] r5 = new int[r5]
            int r7 = r2.length
            long[] r7 = new long[r7]
            int r8 = r2.length
            boolean[] r8 = new boolean[r8]
            r12 = 0
        L_0x065b:
            int r9 = r2.length
            if (r12 >= r9) goto L_0x0676
            r9 = r2[r12]
            ta.o r9 = r9.f20589b
            int r9 = r9.f20638b
            long[] r9 = new long[r9]
            r3[r12] = r9
            r9 = r2[r12]
            ta.o r9 = r9.f20589b
            long[] r9 = r9.f20642f
            r10 = 0
            r13 = r9[r10]
            r7[r12] = r13
            int r12 = r12 + 1
            goto L_0x065b
        L_0x0676:
            r12 = 0
        L_0x0677:
            int r9 = r2.length
            if (r12 >= r9) goto L_0x06b8
            r9 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = r9
            r9 = -1
            r13 = 0
        L_0x0682:
            int r14 = r2.length
            if (r13 >= r14) goto L_0x0694
            boolean r14 = r8[r13]
            if (r14 != 0) goto L_0x0691
            r14 = r7[r13]
            int r18 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r18 > 0) goto L_0x0691
            r9 = r13
            r10 = r14
        L_0x0691:
            int r13 = r13 + 1
            goto L_0x0682
        L_0x0694:
            r10 = r5[r9]
            r11 = r3[r9]
            r11[r10] = r16
            r13 = r2[r9]
            ta.o r13 = r13.f20589b
            int[] r14 = r13.f20640d
            r14 = r14[r10]
            long r14 = (long) r14
            long r16 = r16 + r14
            r14 = 1
            int r10 = r10 + r14
            r5[r9] = r10
            int r11 = r11.length
            if (r10 >= r11) goto L_0x06b3
            long[] r11 = r13.f20642f
            r10 = r11[r10]
            r7[r9] = r10
            goto L_0x0677
        L_0x06b3:
            r8[r9] = r14
            int r12 = r12 + 1
            goto L_0x0677
        L_0x06b8:
            r0.f20583t = r3
            r6.mo20708n()
            r6.mo20707k(r0)
            java.util.ArrayDeque<ta.a$a> r2 = r0.f20569f
            r2.clear()
            r2 = 2
            r0.f20572i = r2
            goto L_0x0003
        L_0x06ca:
            java.util.ArrayDeque<ta.a$a> r2 = r0.f20569f
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x0003
            java.util.ArrayDeque<ta.a$a> r2 = r0.f20569f
            java.lang.Object r2 = r2.peek()
            ta.a$a r2 = (p264ta.C6619a.C6620a) r2
            java.util.ArrayList r2 = r2.f20491d
            r2.add(r5)
            goto L_0x0003
        L_0x06e1:
            int r0 = r0.f20572i
            r2 = 2
            if (r0 == r2) goto L_0x06eb
            r0 = 0
            r1.f20572i = r0
            r1.f20575l = r0
        L_0x06eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p264ta.C6634h.mo22814j(long):void");
    }

    public final void release() {
    }

    public C6634h(int i) {
        this.f20564a = 0;
        this.f20572i = 0;
        this.f20570g = new C6638j();
        this.f20571h = new ArrayList();
        this.f20568e = new C6803r(16);
        this.f20569f = new ArrayDeque<>();
        this.f20565b = new C6803r(C6795o.f21007a);
        this.f20566c = new C6803r(4);
        this.f20567d = new C6803r();
        this.f20577n = -1;
    }
}
