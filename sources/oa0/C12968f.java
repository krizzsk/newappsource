package oa0;

import com.nutiteq.components.Envelope;
import com.nutiteq.components.MapPos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import oa0.C12961c;
import oa0.C12974i;
import ua0.C13155h;
import v20.C20082a;

/* renamed from: oa0.f */
public final class C12968f extends C12960b {

    /* renamed from: g */
    public ArrayList f32111g;

    /* renamed from: h */
    public LinkedList f32112h;

    /* renamed from: oa0.f$a */
    public static class C12969a extends C12974i.C12975a {

        /* renamed from: d */
        public final double f32113d;

        /* renamed from: e */
        public final double f32114e;

        /* renamed from: f */
        public final float[] f32115f;

        /* renamed from: g */
        public final ArrayList<C12961c.C12962a> f32116g;

        public C12969a(MapPos mapPos, float[] fArr, ArrayList<C12961c.C12962a> arrayList, Envelope envelope) {
            super(envelope);
            this.f32113d = mapPos.f24175b;
            this.f32114e = mapPos.f24176c;
            this.f32115f = fArr;
            this.f32116g = arrayList;
        }
    }

    public C12968f() {
        throw null;
    }

    public C12968f(ArrayList arrayList, ArrayList arrayList2, C13155h hVar, C20082a.C20088f fVar) {
        super(hVar, fVar);
        if (arrayList.size() >= 3) {
            this.f32111g = new ArrayList(arrayList);
            if (arrayList2 != null) {
                LinkedList linkedList = new LinkedList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    linkedList.add(new ArrayList((List) it.next()));
                }
                this.f32112h = linkedList;
                return;
            }
            return;
        }
        throw new RuntimeException("Polygon requires at least 3 vertices!");
    }

    /* renamed from: a */
    public final MapPos mo39839a(MapPos mapPos) {
        C12969a aVar = (C12969a) this.f32125e;
        if (aVar == null) {
            return null;
        }
        if (mapPos != null) {
            return mapPos;
        }
        return new MapPos(aVar.f32113d, aVar.f32114e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0323, code lost:
        if ((java.lang.Math.hypot(r8, r10 - r2) * r14) > (java.lang.Math.hypot(r14, r12 - r2) * r8)) goto L_0x0325;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0393, code lost:
        if (r6.f59180b == r9.f59180b) goto L_0x03b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03a8, code lost:
        if (r1.f59180b == r10.f59180b) goto L_0x03b9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x040b A[LOOP:18: B:130:0x0352->B:161:0x040b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0486  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0591 A[LOOP:19: B:177:0x048e->B:229:0x0591, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x05a2  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x05fe  */
    /* JADX WARNING: Removed duplicated region for block: B:330:0x0409 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x058f A[EDGE_INSN: B:332:0x058f->B:228:0x058f ?: BREAK  , SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo39846b() {
        /*
            r54 = this;
            r0 = r54
            za0.f<?> r1 = r0.f32123c
            qa0.b r1 = r1.f32170a
            java.util.ArrayList r2 = r0.f32111g
            java.util.Iterator r2 = r2.iterator()
            r5 = 0
            r7 = 0
        L_0x0010:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x0023
            java.lang.Object r9 = r2.next()
            com.nutiteq.components.MapPos r9 = (com.nutiteq.components.MapPos) r9
            double r10 = r9.f24175b
            double r5 = r5 + r10
            double r9 = r9.f24176c
            double r7 = r7 + r9
            goto L_0x0010
        L_0x0023:
            java.util.ArrayList r2 = r0.f32111g
            int r2 = r2.size()
            double r9 = (double) r2
            double r5 = r5 / r9
            java.util.ArrayList r2 = r0.f32111g
            int r2 = r2.size()
            double r9 = (double) r2
            double r7 = r7 / r9
            com.nutiteq.components.MapPos r2 = r1.mo39930c(r5, r7)
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.ArrayList r6 = r0.f32111g
            int r6 = r6.size()
            r5.<init>(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.ArrayList r7 = r0.f32111g
            int r7 = r7.size()
            r6.<init>(r7)
            na0.g r7 = new na0.g
            r7.<init>()
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x0055:
            java.util.ArrayList r13 = r0.f32111g
            int r13 = r13.size()
            if (r10 > r13) goto L_0x0095
            java.util.ArrayList r13 = r0.f32111g
            int r13 = r13.size()
            if (r10 >= r13) goto L_0x0085
            java.util.ArrayList r13 = r0.f32111g
            java.lang.Object r13 = r13.get(r10)
            com.nutiteq.components.MapPos r13 = (com.nutiteq.components.MapPos) r13
            double r14 = r13.f24175b
            double r8 = r13.f24176c
            com.nutiteq.components.MapPos r8 = r1.mo39930c(r14, r8)
            double r13 = r8.f24175b
            double r3 = r8.f24176c
            r7.mo39794a(r13, r3)
            if (r11 != 0) goto L_0x007f
            r11 = r8
        L_0x007f:
            r6.add(r8)
            r3 = r11
            r11 = r8
            goto L_0x0086
        L_0x0085:
            r3 = r11
        L_0x0086:
            if (r12 == 0) goto L_0x0090
            oa0.c$a r4 = new oa0.c$a
            r4.<init>(r12, r11)
            r5.add(r4)
        L_0x0090:
            int r10 = r10 + 1
            r12 = r11
            r11 = r3
            goto L_0x0055
        L_0x0095:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.LinkedList r4 = r0.f32112h
            if (r4 == 0) goto L_0x00fe
            java.util.Iterator r4 = r4.iterator()
        L_0x00a2:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x00fe
            java.lang.Object r8 = r4.next()
            java.util.List r8 = (java.util.List) r8
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x00b6:
            int r13 = r8.size()
            if (r10 > r13) goto L_0x00f8
            int r13 = r8.size()
            if (r10 >= r13) goto L_0x00e0
            java.lang.Object r13 = r8.get(r10)
            com.nutiteq.components.MapPos r13 = (com.nutiteq.components.MapPos) r13
            double r14 = r13.f24175b
            r18 = r7
            r19 = r8
            double r7 = r13.f24176c
            com.nutiteq.components.MapPos r7 = r1.mo39930c(r14, r7)
            if (r11 != 0) goto L_0x00d7
            r11 = r7
        L_0x00d7:
            r9.add(r7)
            r53 = r11
            r11 = r7
            r7 = r53
            goto L_0x00e5
        L_0x00e0:
            r18 = r7
            r19 = r8
            r7 = r11
        L_0x00e5:
            if (r12 == 0) goto L_0x00ef
            oa0.c$a r8 = new oa0.c$a
            r8.<init>(r12, r11)
            r5.add(r8)
        L_0x00ef:
            int r10 = r10 + 1
            r12 = r11
            r8 = r19
            r11 = r7
            r7 = r18
            goto L_0x00b6
        L_0x00f8:
            r18 = r7
            r3.add(r9)
            goto L_0x00a2
        L_0x00fe:
            r18 = r7
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r4 = r3.size()
            if (r4 <= 0) goto L_0x0128
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x0114:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0129
            java.lang.Object r7 = r3.next()
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.util.LinkedList r7 = p583jk.C17884p.m44350U(r7)
            r4.addAll(r7)
            goto L_0x0114
        L_0x0128:
            r4 = 0
        L_0x0129:
            java.util.LinkedList r3 = p583jk.C17884p.m44350U(r6)
            java.util.Iterator r3 = r3.iterator()
        L_0x0131:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0774
            java.lang.Object r6 = r3.next()
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            fj0.c r10 = new fj0.c
            int r11 = r6.size()
            r10.<init>((int) r11)
            r11 = 0
        L_0x014c:
            int r12 = r6.size()
            if (r11 >= r12) goto L_0x0182
            java.lang.Object r12 = r6.get(r11)
            com.nutiteq.components.MapPos r12 = (com.nutiteq.components.MapPos) r12
            fj0.b[] r13 = r10.f59182a
            fj0.b r14 = new fj0.b
            double r7 = r12.f24175b
            r26 = r2
            r27 = r3
            double r2 = r12.f24176c
            r28 = r5
            r29 = r6
            double r5 = r12.f24177d
            r19 = r14
            r20 = r7
            r22 = r2
            r24 = r5
            r19.<init>(r20, r22, r24)
            r13[r11] = r14
            int r11 = r11 + 1
            r2 = r26
            r3 = r27
            r5 = r28
            r6 = r29
            goto L_0x014c
        L_0x0182:
            r26 = r2
            r27 = r3
            r28 = r5
            r29 = r6
            r2 = 1
            r10.mo58551a(r2)
            r9.add(r10)
            if (r4 == 0) goto L_0x01ed
            java.util.Iterator r3 = r4.iterator()
        L_0x0197:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x01ed
            java.lang.Object r5 = r3.next()
            java.util.List r5 = (java.util.List) r5
            int r6 = r5.size()
            r7 = 3
            if (r6 >= r7) goto L_0x01ab
            goto L_0x0197
        L_0x01ab:
            fj0.c r6 = new fj0.c
            int r7 = r5.size()
            r6.<init>((int) r7)
            r6.f59183b = r2
            r7 = 0
        L_0x01b7:
            int r8 = r5.size()
            if (r7 >= r8) goto L_0x01e2
            java.lang.Object r8 = r5.get(r7)
            com.nutiteq.components.MapPos r8 = (com.nutiteq.components.MapPos) r8
            fj0.b[] r10 = r6.f59182a
            fj0.b r11 = new fj0.b
            double r12 = r8.f24175b
            r30 = r3
            double r2 = r8.f24176c
            double r14 = r8.f24177d
            r19 = r11
            r20 = r12
            r22 = r2
            r24 = r14
            r19.<init>(r20, r22, r24)
            r10[r7] = r11
            int r7 = r7 + 1
            r3 = r30
            r2 = 1
            goto L_0x01b7
        L_0x01e2:
            r30 = r3
            r2 = -1
            r6.mo58551a(r2)
            r9.add(r6)
            r2 = 1
            goto L_0x0197
        L_0x01ed:
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r5 = r9.iterator()
        L_0x01fb:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x020d
            java.lang.Object r6 = r5.next()
            fj0.c r6 = (fj0.C23401c) r6
            boolean r6 = r6.f59183b
            if (r6 == 0) goto L_0x01fb
            r5 = 1
            goto L_0x020e
        L_0x020d:
            r5 = 0
        L_0x020e:
            if (r5 != 0) goto L_0x0224
            java.util.Iterator r5 = r9.iterator()
        L_0x0214:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0273
            java.lang.Object r6 = r5.next()
            fj0.c r6 = (fj0.C23401c) r6
            r3.add(r6)
            goto L_0x0214
        L_0x0224:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r9)
        L_0x0229:
            java.util.Iterator r6 = r5.iterator()
            r7 = 0
            r8 = 0
        L_0x022f:
            boolean r9 = r6.hasNext()
            if (r9 == 0) goto L_0x025d
            java.lang.Object r9 = r6.next()
            fj0.c r9 = (fj0.C23401c) r9
            boolean r10 = r9.f59183b
            if (r10 != 0) goto L_0x0240
            goto L_0x022f
        L_0x0240:
            if (r7 != 0) goto L_0x0244
            r7 = r9
            r8 = 0
        L_0x0244:
            r10 = 0
        L_0x0245:
            fj0.b[] r11 = r9.f59182a
            int r12 = r11.length
            if (r10 >= r12) goto L_0x022f
            r11 = r11[r10]
            double r11 = r11.f59179a
            fj0.b[] r13 = r7.f59182a
            r13 = r13[r8]
            double r13 = r13.f59179a
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 <= 0) goto L_0x025a
            r7 = r9
            r8 = r10
        L_0x025a:
            int r10 = r10 + 1
            goto L_0x0245
        L_0x025d:
            if (r7 != 0) goto L_0x0280
            java.util.Iterator r5 = r5.iterator()
        L_0x0263:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0273
            java.lang.Object r6 = r5.next()
            fj0.c r6 = (fj0.C23401c) r6
            r3.add(r6)
            goto L_0x0263
        L_0x0273:
            r21 = r1
            r24 = r2
            r25 = r3
            r35 = r4
            r0 = 1
            r2 = 0
            goto L_0x0484
        L_0x0280:
            fj0.b[] r6 = r7.f59182a
            r6 = r6[r8]
            java.util.Iterator r9 = r5.iterator()
            r10 = 0
            r11 = 0
        L_0x028a:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x0471
            java.lang.Object r12 = r9.next()
            fj0.c r12 = (fj0.C23401c) r12
            boolean r13 = r12.f59183b
            if (r13 == 0) goto L_0x029b
            goto L_0x028a
        L_0x029b:
            r13 = 0
        L_0x029c:
            fj0.b[] r15 = r12.f59182a
            int r14 = r15.length
            if (r13 >= r14) goto L_0x0465
            r14 = r15[r13]
            r19 = r8
            r20 = r9
            double r8 = r14.f59179a
            r21 = r1
            double r0 = r6.f59179a
            int r22 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r22 > 0) goto L_0x02b2
            goto L_0x02e7
        L_0x02b2:
            int r0 = r15.length
            int r0 = r0 + r13
            r1 = 1
            int r0 = r0 - r1
            r1 = r14
            int r8 = r15.length
            int r0 = r0 % r8
            r0 = r15[r0]
            int r8 = r13 + 1
            int r9 = r15.length
            int r8 = r8 % r9
            r8 = r15[r8]
            boolean r9 = fj0.C23398a.m57519a(r0, r1, r8)
            if (r9 == 0) goto L_0x02d5
            boolean r0 = fj0.C23398a.m57519a(r0, r1, r6)
            if (r0 != 0) goto L_0x02ce
            goto L_0x02e4
        L_0x02ce:
            boolean r0 = fj0.C23398a.m57519a(r1, r8, r6)
            if (r0 != 0) goto L_0x02e2
            goto L_0x02e4
        L_0x02d5:
            boolean r0 = fj0.C23398a.m57519a(r0, r1, r6)
            if (r0 == 0) goto L_0x02dc
            goto L_0x02e2
        L_0x02dc:
            boolean r0 = fj0.C23398a.m57519a(r1, r8, r6)
            if (r0 == 0) goto L_0x02e4
        L_0x02e2:
            r0 = 1
            goto L_0x02e5
        L_0x02e4:
            r0 = 0
        L_0x02e5:
            if (r0 != 0) goto L_0x02f4
        L_0x02e7:
            r24 = r2
            r25 = r3
            r22 = r10
            r23 = r11
            r30 = r12
            r31 = r13
            goto L_0x0325
        L_0x02f4:
            if (r10 == 0) goto L_0x032f
            fj0.b[] r0 = r10.f59182a
            r0 = r0[r11]
            double r8 = r1.f59179a
            double r14 = r6.f59179a
            double r8 = r8 - r14
            r22 = r10
            r23 = r11
            double r10 = r1.f59180b
            r24 = r2
            r25 = r3
            double r2 = r6.f59180b
            double r10 = r10 - r2
            r30 = r12
            r31 = r13
            double r12 = r0.f59180b
            double r14 = r12 - r14
            double r12 = r12 - r2
            double r2 = java.lang.Math.hypot(r8, r10)
            double r2 = r2 * r14
            double r10 = java.lang.Math.hypot(r14, r12)
            double r10 = r10 * r8
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x033b
        L_0x0325:
            r35 = r4
            r36 = r5
            r33 = r7
            r2 = 0
            goto L_0x0449
        L_0x032f:
            r24 = r2
            r25 = r3
            r22 = r10
            r23 = r11
            r30 = r12
            r31 = r13
        L_0x033b:
            java.util.Iterator r0 = r5.iterator()
            r2 = 1
        L_0x0340:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0439
            java.lang.Object r3 = r0.next()
            fj0.c r3 = (fj0.C23401c) r3
            boolean r8 = r3.f59183b
            if (r8 == 0) goto L_0x0351
            goto L_0x0340
        L_0x0351:
            r8 = 0
        L_0x0352:
            fj0.b[] r9 = r3.f59182a
            int r10 = r9.length
            if (r8 >= r10) goto L_0x041c
            r10 = r9[r8]
            int r8 = r8 + 1
            int r11 = r9.length
            int r11 = r8 % r11
            r9 = r9[r11]
            double r11 = r6.f59179a
            double r13 = r10.f59179a
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x037c
            r15 = r2
            r32 = r3
            double r2 = r6.f59180b
            r33 = r7
            r34 = r8
            double r7 = r10.f59180b
            int r35 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r35 != 0) goto L_0x0383
            r35 = r4
            r36 = r5
            goto L_0x03b9
        L_0x037c:
            r15 = r2
            r32 = r3
            r33 = r7
            r34 = r8
        L_0x0383:
            double r2 = r9.f59179a
            int r7 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x0396
            double r7 = r6.f59180b
            r35 = r4
            r36 = r5
            double r4 = r9.f59180b
            int r37 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r37 != 0) goto L_0x039a
            goto L_0x03b9
        L_0x0396:
            r35 = r4
            r36 = r5
        L_0x039a:
            double r4 = r1.f59179a
            int r7 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r7 != 0) goto L_0x03ab
            double r7 = r1.f59180b
            r37 = r13
            double r13 = r10.f59180b
            int r39 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r39 != 0) goto L_0x03ad
            goto L_0x03b9
        L_0x03ab:
            r37 = r13
        L_0x03ad:
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x03c0
            double r7 = r1.f59180b
            double r13 = r9.f59180b
            int r39 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r39 != 0) goto L_0x03c0
        L_0x03b9:
            r44 = r0
            r43 = r1
            r2 = 0
            goto L_0x0404
        L_0x03c0:
            double r7 = r1.f59180b
            double r13 = r6.f59180b
            double r39 = r7 - r13
            double r41 = r11 - r4
            r44 = r0
            r43 = r1
            double r0 = r9.f59180b
            double r9 = r10.f59180b
            double r45 = r0 - r9
            double r47 = r37 - r2
            double r49 = r37 - r11
            double r51 = r9 - r13
            double r49 = r49 * r39
            double r51 = r51 * r41
            double r51 = r51 + r49
            double r2 = r2 - r11
            double r0 = r0 - r13
            double r2 = r2 * r39
            double r0 = r0 * r41
            double r0 = r0 + r2
            double r11 = r11 - r37
            double r13 = r13 - r9
            double r11 = r11 * r45
            double r13 = r13 * r47
            double r13 = r13 + r11
            double r4 = r4 - r37
            double r7 = r7 - r9
            double r4 = r4 * r45
            double r7 = r7 * r47
            double r7 = r7 + r4
            double r7 = r7 * r13
            r2 = 0
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x03fe
            goto L_0x0404
        L_0x03fe:
            double r51 = r51 * r0
            int r0 = (r51 > r2 ? 1 : (r51 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0406
        L_0x0404:
            r0 = 0
            goto L_0x0407
        L_0x0406:
            r0 = 1
        L_0x0407:
            if (r0 == 0) goto L_0x040b
            r15 = 0
            goto L_0x0429
        L_0x040b:
            r2 = r15
            r3 = r32
            r7 = r33
            r8 = r34
            r4 = r35
            r5 = r36
            r1 = r43
            r0 = r44
            goto L_0x0352
        L_0x041c:
            r44 = r0
            r43 = r1
            r15 = r2
            r35 = r4
            r36 = r5
            r33 = r7
            r2 = 0
        L_0x0429:
            if (r15 != 0) goto L_0x042c
            goto L_0x0442
        L_0x042c:
            r2 = r15
            r7 = r33
            r4 = r35
            r5 = r36
            r1 = r43
            r0 = r44
            goto L_0x0340
        L_0x0439:
            r15 = r2
            r35 = r4
            r36 = r5
            r33 = r7
            r2 = 0
        L_0x0442:
            if (r15 == 0) goto L_0x0449
            r10 = r30
            r11 = r31
            goto L_0x044d
        L_0x0449:
            r10 = r22
            r11 = r23
        L_0x044d:
            int r13 = r31 + 1
            r0 = r54
            r8 = r19
            r9 = r20
            r1 = r21
            r2 = r24
            r3 = r25
            r12 = r30
            r7 = r33
            r4 = r35
            r5 = r36
            goto L_0x029c
        L_0x0465:
            r24 = r2
            r25 = r3
            r22 = r10
            r23 = r11
            r0 = r54
            goto L_0x028a
        L_0x0471:
            r21 = r1
            r24 = r2
            r25 = r3
            r35 = r4
            r36 = r5
            r33 = r7
            r19 = r8
            r2 = 0
            if (r10 != 0) goto L_0x070e
            r0 = 0
        L_0x0484:
            if (r0 != 0) goto L_0x048a
            r5 = r24
            goto L_0x058f
        L_0x048a:
            java.util.Iterator r0 = r25.iterator()
        L_0x048e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0595
            java.lang.Object r1 = r0.next()
            fj0.c r1 = (fj0.C23401c) r1
            fj0.b[] r4 = r1.f59182a
            int r5 = r4.length
            r6 = 3
            if (r5 >= r6) goto L_0x04a4
            r5 = r24
            goto L_0x051f
        L_0x04a4:
            int r5 = r4.length
            if (r5 != r6) goto L_0x04ae
            r5 = r24
            r5.add(r1)
            goto L_0x058c
        L_0x04ae:
            r5 = r24
            int r4 = r4.length
            fj0.a$a[] r6 = new fj0.C23398a.C23399a[r4]
            r7 = 0
        L_0x04b4:
            if (r7 >= r4) goto L_0x04c0
            fj0.a$a r8 = new fj0.a$a
            r8.<init>()
            r6[r7] = r8
            int r7 = r7 + 1
            goto L_0x04b4
        L_0x04c0:
            r7 = 0
        L_0x04c1:
            if (r7 >= r4) goto L_0x04ee
            r8 = r6[r7]
            r9 = 1
            r8.f59172a = r9
            fj0.b[] r9 = r1.f59182a
            r9 = r9[r7]
            r8.f59175d = r9
            int r9 = r4 + -1
            if (r7 != r9) goto L_0x04d8
            r10 = 0
            r11 = r6[r10]
            r8.f59178g = r11
            goto L_0x04de
        L_0x04d8:
            int r10 = r7 + 1
            r10 = r6[r10]
            r8.f59178g = r10
        L_0x04de:
            if (r7 != 0) goto L_0x04e5
            r9 = r6[r9]
            r8.f59177f = r9
            goto L_0x04eb
        L_0x04e5:
            int r9 = r7 + -1
            r9 = r6[r9]
            r8.f59177f = r9
        L_0x04eb:
            int r7 = r7 + 1
            goto L_0x04c1
        L_0x04ee:
            r1 = 0
        L_0x04ef:
            if (r1 >= r4) goto L_0x04f9
            r7 = r6[r1]
            fj0.C23398a.m57520b(r7, r6)
            int r1 = r1 + 1
            goto L_0x04ef
        L_0x04f9:
            r1 = 0
        L_0x04fa:
            int r7 = r4 + -3
            if (r1 >= r7) goto L_0x055d
            r7 = 0
            r8 = 0
        L_0x0500:
            if (r7 >= r4) goto L_0x051d
            r9 = r6[r7]
            boolean r10 = r9.f59172a
            if (r10 != 0) goto L_0x0509
            goto L_0x051a
        L_0x0509:
            boolean r10 = r9.f59174c
            if (r10 != 0) goto L_0x050e
            goto L_0x051a
        L_0x050e:
            if (r8 != 0) goto L_0x0511
            goto L_0x0519
        L_0x0511:
            double r10 = r9.f59176e
            double r12 = r8.f59176e
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 <= 0) goto L_0x051a
        L_0x0519:
            r8 = r9
        L_0x051a:
            int r7 = r7 + 1
            goto L_0x0500
        L_0x051d:
            if (r8 != 0) goto L_0x0521
        L_0x051f:
            r1 = 0
            goto L_0x058d
        L_0x0521:
            fj0.c r7 = new fj0.c
            r9 = 3
            fj0.b[] r10 = new fj0.C23400b[r9]
            fj0.a$a r9 = r8.f59177f
            fj0.b r9 = r9.f59175d
            r11 = 0
            r10[r11] = r9
            fj0.b r9 = r8.f59175d
            r12 = 1
            r10[r12] = r9
            fj0.a$a r9 = r8.f59178g
            fj0.b r9 = r9.f59175d
            r12 = 2
            r10[r12] = r9
            r7.<init>((fj0.C23400b[]) r10)
            r5.add(r7)
            r8.f59172a = r11
            fj0.a$a r7 = r8.f59177f
            fj0.a$a r9 = r8.f59178g
            r7.f59178g = r9
            fj0.a$a r9 = r8.f59178g
            r9.f59177f = r7
            int r7 = r4 + -4
            if (r1 != r7) goto L_0x0550
            goto L_0x055d
        L_0x0550:
            fj0.a$a r7 = r8.f59177f
            fj0.C23398a.m57520b(r7, r6)
            fj0.a$a r7 = r8.f59178g
            fj0.C23398a.m57520b(r7, r6)
            int r1 = r1 + 1
            goto L_0x04fa
        L_0x055d:
            r1 = 0
        L_0x055e:
            if (r1 >= r4) goto L_0x058c
            r7 = r6[r1]
            boolean r8 = r7.f59172a
            if (r8 == 0) goto L_0x0589
            fj0.c r4 = new fj0.c
            r8 = 3
            fj0.b[] r9 = new fj0.C23400b[r8]
            fj0.a$a r7 = r7.f59177f
            fj0.b r7 = r7.f59175d
            r8 = 0
            r9[r8] = r7
            r7 = r6[r1]
            fj0.b r7 = r7.f59175d
            r8 = 1
            r9[r8] = r7
            r1 = r6[r1]
            fj0.a$a r1 = r1.f59178g
            fj0.b r1 = r1.f59175d
            r6 = 2
            r9[r6] = r1
            r4.<init>((fj0.C23400b[]) r9)
            r5.add(r4)
            goto L_0x058c
        L_0x0589:
            int r1 = r1 + 1
            goto L_0x055e
        L_0x058c:
            r1 = 1
        L_0x058d:
            if (r1 != 0) goto L_0x0591
        L_0x058f:
            r0 = 0
            goto L_0x0598
        L_0x0591:
            r24 = r5
            goto L_0x048e
        L_0x0595:
            r5 = r24
            r0 = 1
        L_0x0598:
            java.util.Iterator r1 = r5.iterator()
        L_0x059c:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x05f7
            java.lang.Object r4 = r1.next()
            fj0.c r4 = (fj0.C23401c) r4
            fj0.b[] r4 = r4.f59182a
            int r5 = r4.length
            r6 = 3
            if (r5 == r6) goto L_0x05af
            goto L_0x059c
        L_0x05af:
            com.nutiteq.components.MapPos r5 = new com.nutiteq.components.MapPos
            r6 = 0
            r7 = r4[r6]
            double r8 = r7.f59179a
            double r10 = r7.f59180b
            double r12 = r7.f59181c
            r7 = r5
            r7.<init>(r8, r10, r12)
            r6 = r21
            r6.add(r5)
            com.nutiteq.components.MapPos r5 = new com.nutiteq.components.MapPos
            r7 = 1
            r8 = r4[r7]
            double r9 = r8.f59179a
            double r11 = r8.f59180b
            double r7 = r8.f59181c
            r16 = r7
            r7 = r5
            r8 = r9
            r10 = r11
            r12 = r16
            r7.<init>(r8, r10, r12)
            r6.add(r5)
            com.nutiteq.components.MapPos r5 = new com.nutiteq.components.MapPos
            r7 = 2
            r4 = r4[r7]
            double r7 = r4.f59179a
            double r9 = r4.f59180b
            double r11 = r4.f59181c
            r19 = r5
            r20 = r7
            r22 = r9
            r24 = r11
            r19.<init>(r20, r22, r24)
            r6.add(r5)
            r21 = r6
            goto L_0x059c
        L_0x05f7:
            r6 = r21
            if (r0 == 0) goto L_0x05fe
        L_0x05fb:
            r3 = 0
            goto L_0x0701
        L_0x05fe:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r10 = 0
        L_0x0604:
            int r1 = r29.size()
            if (r10 >= r1) goto L_0x062d
            r1 = r29
            java.lang.Object r4 = r1.get(r10)
            com.nutiteq.components.MapPos r4 = (com.nutiteq.components.MapPos) r4
            aj0.b r5 = new aj0.b
            double r7 = r4.f24175b
            double r11 = r4.f24176c
            double r2 = r4.f24177d
            r19 = r5
            r20 = r7
            r22 = r11
            r24 = r2
            r19.<init>(r20, r22, r24)
            r0.add(r5)
            int r10 = r10 + 1
            r2 = 0
            goto L_0x0604
        L_0x062d:
            aj0.a r1 = new aj0.a
            r1.<init>(r0)
            if (r35 == 0) goto L_0x0691
            java.util.Iterator r0 = r35.iterator()
        L_0x0638:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0691
            java.lang.Object r2 = r0.next()
            java.util.List r2 = (java.util.List) r2
            int r3 = r2.size()
            r4 = 3
            if (r3 >= r4) goto L_0x064c
            goto L_0x0638
        L_0x064c:
            java.util.ArrayList r3 = new java.util.ArrayList
            int r4 = r2.size()
            r3.<init>(r4)
            r10 = 0
        L_0x0656:
            int r4 = r2.size()
            if (r10 >= r4) goto L_0x067b
            java.lang.Object r4 = r2.get(r10)
            com.nutiteq.components.MapPos r4 = (com.nutiteq.components.MapPos) r4
            aj0.b r5 = new aj0.b
            double r7 = r4.f24175b
            double r11 = r4.f24176c
            double r14 = r4.f24177d
            r19 = r5
            r20 = r7
            r22 = r11
            r24 = r14
            r19.<init>(r20, r22, r24)
            r3.add(r5)
            int r10 = r10 + 1
            goto L_0x0656
        L_0x067b:
            aj0.a r2 = new aj0.a
            r2.<init>(r3)
            java.util.ArrayList<aj0.a> r3 = r1.f52754b
            if (r3 != 0) goto L_0x068b
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r1.f52754b = r3
        L_0x068b:
            java.util.ArrayList<aj0.a> r3 = r1.f52754b
            r3.add(r2)
            goto L_0x0638
        L_0x0691:
            zi0.C25534a.m63866a(r1)     // Catch:{ RuntimeException -> 0x06ff }
            java.util.ArrayList r0 = r1.f52755c     // Catch:{ RuntimeException -> 0x06ff }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ RuntimeException -> 0x06ff }
        L_0x069a:
            boolean r1 = r0.hasNext()     // Catch:{ RuntimeException -> 0x06ff }
            if (r1 == 0) goto L_0x05fb
            java.lang.Object r1 = r0.next()     // Catch:{ RuntimeException -> 0x06ff }
            cj0.a r1 = (cj0.C21219a) r1     // Catch:{ RuntimeException -> 0x06ff }
            bj0.b[] r1 = r1.f53166e     // Catch:{ RuntimeException -> 0x06ff }
            com.nutiteq.components.MapPos r2 = new com.nutiteq.components.MapPos     // Catch:{ RuntimeException -> 0x06ff }
            r3 = 0
            r4 = r1[r3]     // Catch:{ RuntimeException -> 0x0700 }
            double r20 = r4.mo53239a()     // Catch:{ RuntimeException -> 0x0700 }
            r4 = r1[r3]     // Catch:{ RuntimeException -> 0x0700 }
            double r22 = r4.mo53240b()     // Catch:{ RuntimeException -> 0x0700 }
            r4 = r1[r3]     // Catch:{ RuntimeException -> 0x0700 }
            double r24 = r4.mo53241c()     // Catch:{ RuntimeException -> 0x0700 }
            r19 = r2
            r19.<init>(r20, r22, r24)     // Catch:{ RuntimeException -> 0x0700 }
            r6.add(r2)     // Catch:{ RuntimeException -> 0x0700 }
            com.nutiteq.components.MapPos r2 = new com.nutiteq.components.MapPos     // Catch:{ RuntimeException -> 0x0700 }
            r4 = 1
            r5 = r1[r4]     // Catch:{ RuntimeException -> 0x0700 }
            double r37 = r5.mo53239a()     // Catch:{ RuntimeException -> 0x0700 }
            r5 = r1[r4]     // Catch:{ RuntimeException -> 0x0700 }
            double r39 = r5.mo53240b()     // Catch:{ RuntimeException -> 0x0700 }
            r5 = r1[r4]     // Catch:{ RuntimeException -> 0x0700 }
            double r41 = r5.mo53241c()     // Catch:{ RuntimeException -> 0x0700 }
            r36 = r2
            r36.<init>(r37, r39, r41)     // Catch:{ RuntimeException -> 0x0700 }
            r6.add(r2)     // Catch:{ RuntimeException -> 0x0700 }
            com.nutiteq.components.MapPos r2 = new com.nutiteq.components.MapPos     // Catch:{ RuntimeException -> 0x0700 }
            r4 = 2
            r5 = r1[r4]     // Catch:{ RuntimeException -> 0x0700 }
            double r8 = r5.mo53239a()     // Catch:{ RuntimeException -> 0x0700 }
            r5 = r1[r4]     // Catch:{ RuntimeException -> 0x0700 }
            double r10 = r5.mo53240b()     // Catch:{ RuntimeException -> 0x0700 }
            r1 = r1[r4]     // Catch:{ RuntimeException -> 0x0700 }
            double r12 = r1.mo53241c()     // Catch:{ RuntimeException -> 0x0700 }
            r7 = r2
            r7.<init>(r8, r10, r12)     // Catch:{ RuntimeException -> 0x0700 }
            r6.add(r2)     // Catch:{ RuntimeException -> 0x0700 }
            goto L_0x069a
        L_0x06ff:
            r3 = 0
        L_0x0700:
        L_0x0701:
            r0 = r54
            r1 = r6
            r2 = r26
            r3 = r27
            r5 = r28
            r4 = r35
            goto L_0x0131
        L_0x070e:
            r6 = r21
            r5 = r24
            r1 = r29
            r3 = 0
            fj0.c r0 = new fj0.c
            r7 = r33
            fj0.b[] r2 = r7.f59182a
            int r2 = r2.length
            fj0.b[] r4 = r10.f59182a
            int r4 = r4.length
            int r2 = r2 + r4
            r4 = 2
            int r2 = r2 + r4
            r0.<init>((int) r2)
            r2 = 0
            r4 = 0
        L_0x0727:
            if (r2 > r11) goto L_0x0736
            fj0.b[] r8 = r0.f59182a
            fj0.b[] r9 = r10.f59182a
            r9 = r9[r2]
            r8[r4] = r9
            int r4 = r4 + 1
            int r2 = r2 + 1
            goto L_0x0727
        L_0x0736:
            r2 = 0
        L_0x0737:
            fj0.b[] r8 = r7.f59182a
            int r9 = r8.length
            if (r2 > r9) goto L_0x074b
            fj0.b[] r9 = r0.f59182a
            int r12 = r2 + r19
            int r13 = r8.length
            int r12 = r12 % r13
            r8 = r8[r12]
            r9[r4] = r8
            int r4 = r4 + 1
            int r2 = r2 + 1
            goto L_0x0737
        L_0x074b:
            fj0.b[] r2 = r10.f59182a
            int r8 = r2.length
            if (r11 >= r8) goto L_0x075b
            fj0.b[] r8 = r0.f59182a
            r2 = r2[r11]
            r8[r4] = r2
            r2 = 1
            int r4 = r4 + r2
            int r11 = r11 + 1
            goto L_0x074b
        L_0x075b:
            r4 = r36
            r2 = 1
            r4.remove(r7)
            r4.remove(r10)
            r4.add(r0)
            r0 = r54
            r29 = r1
            r2 = r5
            r1 = r6
            r3 = r25
            r5 = r4
            r4 = r35
            goto L_0x0229
        L_0x0774:
            r6 = r1
            r26 = r2
            r28 = r5
            r3 = 0
            int r0 = r6.size()
            r1 = 3
            int r0 = r0 * 3
            float[] r0 = new float[r0]
            r9 = 0
        L_0x0784:
            int r1 = r6.size()
            if (r9 >= r1) goto L_0x07b8
            int r1 = r9 * 3
            int r2 = r1 + 0
            java.lang.Object r3 = r6.get(r9)
            com.nutiteq.components.MapPos r3 = (com.nutiteq.components.MapPos) r3
            double r3 = r3.f24175b
            r5 = r26
            double r7 = r5.f24175b
            double r3 = r3 - r7
            float r3 = (float) r3
            r0[r2] = r3
            int r2 = r1 + 1
            java.lang.Object r3 = r6.get(r9)
            com.nutiteq.components.MapPos r3 = (com.nutiteq.components.MapPos) r3
            double r3 = r3.f24176c
            double r7 = r5.f24176c
            double r3 = r3 - r7
            float r3 = (float) r3
            r0[r2] = r3
            r2 = 2
            int r1 = r1 + r2
            r3 = -9223372036854775808
            float r3 = (float) r3
            r0[r1] = r3
            int r9 = r9 + 1
            goto L_0x0784
        L_0x07b8:
            r5 = r26
            oa0.f$a r1 = new oa0.f$a
            com.nutiteq.components.Envelope r2 = new com.nutiteq.components.Envelope
            r3 = r18
            r2.<init>((na0.C12929g) r3)
            r3 = r28
            r1.<init>(r5, r0, r3, r2)
            r0 = r54
            r0.mo39855e(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: oa0.C12968f.mo39846b():void");
    }

    /* renamed from: c */
    public final C12974i.C12975a mo39840c() {
        return (C12969a) this.f32125e;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Polygon [mapPoses=");
        k.append(this.f32111g);
        k.append(", mapPosesHoles=");
        k.append(this.f32112h);
        k.append("]");
        return k.toString();
    }
}
