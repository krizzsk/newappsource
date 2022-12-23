package p094g5;

import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: g5.h */
public final class C4807h {

    /* renamed from: a */
    public static final JsonReader.C1901a f16202a = JsonReader.C1901a.m5315a("ty", "d");

    /* JADX WARNING: type inference failed for: r6v2, types: [d5.b] */
    /* JADX WARNING: type inference failed for: r6v6 */
    /* JADX WARNING: type inference failed for: r6v14 */
    /* JADX WARNING: type inference failed for: r6v27 */
    /* JADX WARNING: type inference failed for: r17v6, types: [d5.a] */
    /* JADX WARNING: type inference failed for: r17v7, types: [d5.h] */
    /* JADX WARNING: type inference failed for: r18v26, types: [d5.d] */
    /* JADX WARNING: type inference failed for: r19v30, types: [com.airbnb.lottie.model.content.a] */
    /* JADX WARNING: type inference failed for: r17v8, types: [d5.e] */
    /* JADX WARNING: type inference failed for: r17v9, types: [d5.f] */
    /* JADX WARNING: type inference failed for: r17v10, types: [com.airbnb.lottie.model.content.PolystarShape] */
    /* JADX WARNING: type inference failed for: r19v31, types: [com.airbnb.lottie.model.content.ShapeStroke] */
    /* JADX WARNING: type inference failed for: r17v11, types: [com.airbnb.lottie.model.content.ShapeTrimPath] */
    /* JADX WARNING: type inference failed for: r6v28 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x01eb A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p059d5.C4370b m12143a(com.airbnb.lottie.parser.moshi.C1902a r33, com.airbnb.lottie.C1867f r34) throws java.io.IOException {
        /*
            r0 = r33
            r1 = r34
            r33.mo6831i()
            r2 = 2
            r3 = 2
        L_0x0009:
            boolean r4 = r33.mo6835v()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L_0x002c
            com.airbnb.lottie.parser.moshi.JsonReader$a r4 = f16202a
            int r4 = r0.mo6826H(r4)
            if (r4 == 0) goto L_0x0027
            if (r4 == r5) goto L_0x0022
            r33.mo6827K()
            r33.mo6828N()
            goto L_0x0009
        L_0x0022:
            int r3 = r33.mo6838z()
            goto L_0x0009
        L_0x0027:
            java.lang.String r4 = r33.mo6823A()
            goto L_0x002d
        L_0x002c:
            r4 = r6
        L_0x002d:
            if (r4 != 0) goto L_0x0030
            return r6
        L_0x0030:
            int r7 = r4.hashCode()
            r8 = 3
            r9 = 4
            r10 = 5
            r12 = 0
            switch(r7) {
                case 3239: goto L_0x00d2;
                case 3270: goto L_0x00c7;
                case 3295: goto L_0x00bc;
                case 3307: goto L_0x00b1;
                case 3308: goto L_0x00a6;
                case 3488: goto L_0x009b;
                case 3633: goto L_0x0090;
                case 3646: goto L_0x0085;
                case 3669: goto L_0x0077;
                case 3679: goto L_0x0069;
                case 3681: goto L_0x005b;
                case 3705: goto L_0x004c;
                case 3710: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x00dd
        L_0x003d:
            java.lang.String r7 = "tr"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x0048
            goto L_0x00dd
        L_0x0048:
            r7 = 12
            goto L_0x00de
        L_0x004c:
            java.lang.String r7 = "tm"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x0057
            goto L_0x00dd
        L_0x0057:
            r7 = 11
            goto L_0x00de
        L_0x005b:
            java.lang.String r7 = "st"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x0065
            goto L_0x00dd
        L_0x0065:
            r7 = 10
            goto L_0x00de
        L_0x0069:
            java.lang.String r7 = "sr"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x0073
            goto L_0x00dd
        L_0x0073:
            r7 = 9
            goto L_0x00de
        L_0x0077:
            java.lang.String r7 = "sh"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x0081
            goto L_0x00dd
        L_0x0081:
            r7 = 8
            goto L_0x00de
        L_0x0085:
            java.lang.String r7 = "rp"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x008e
            goto L_0x00dd
        L_0x008e:
            r7 = 7
            goto L_0x00de
        L_0x0090:
            java.lang.String r7 = "rc"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x0099
            goto L_0x00dd
        L_0x0099:
            r7 = 6
            goto L_0x00de
        L_0x009b:
            java.lang.String r7 = "mm"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x00a4
            goto L_0x00dd
        L_0x00a4:
            r7 = 5
            goto L_0x00de
        L_0x00a6:
            java.lang.String r7 = "gs"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x00af
            goto L_0x00dd
        L_0x00af:
            r7 = 4
            goto L_0x00de
        L_0x00b1:
            java.lang.String r7 = "gr"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x00ba
            goto L_0x00dd
        L_0x00ba:
            r7 = 3
            goto L_0x00de
        L_0x00bc:
            java.lang.String r7 = "gf"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x00c5
            goto L_0x00dd
        L_0x00c5:
            r7 = 2
            goto L_0x00de
        L_0x00c7:
            java.lang.String r7 = "fl"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x00d0
            goto L_0x00dd
        L_0x00d0:
            r7 = 1
            goto L_0x00de
        L_0x00d2:
            java.lang.String r7 = "el"
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x00db
            goto L_0x00dd
        L_0x00db:
            r7 = 0
            goto L_0x00de
        L_0x00dd:
            r7 = -1
        L_0x00de:
            java.lang.String r13 = "o"
            java.lang.String r14 = "g"
            java.lang.String r15 = "d"
            r6 = 100
            r11 = 1065353216(0x3f800000, float:1.0)
            r18 = 0
            switch(r7) {
                case 0: goto L_0x06a2;
                case 1: goto L_0x062e;
                case 2: goto L_0x0578;
                case 3: goto L_0x0531;
                case 4: goto L_0x03ee;
                case 5: goto L_0x03b1;
                case 6: goto L_0x0369;
                case 7: goto L_0x0321;
                case 8: goto L_0x02dd;
                case 9: goto L_0x0272;
                case 10: goto L_0x015f;
                case 11: goto L_0x010a;
                case 12: goto L_0x0104;
                default: goto L_0x00ed;
            }
        L_0x00ed:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unknown shape type "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            p107h5.C5055c.m12896b(r1)
            r6 = 0
            goto L_0x06f7
        L_0x0104:
            c5.l r6 = p094g5.C4797c.m12135a(r33, r34)
            goto L_0x06f7
        L_0x010a:
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = p094g5.C4812j0.f16213a
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
        L_0x0118:
            boolean r3 = r33.mo6835v()
            if (r3 == 0) goto L_0x0156
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = p094g5.C4812j0.f16213a
            int r3 = r0.mo6826H(r3)
            if (r3 == 0) goto L_0x0151
            if (r3 == r5) goto L_0x014c
            if (r3 == r2) goto L_0x0147
            if (r3 == r8) goto L_0x0142
            if (r3 == r9) goto L_0x0139
            if (r3 == r10) goto L_0x0134
            r33.mo6828N()
            goto L_0x0118
        L_0x0134:
            boolean r23 = r33.mo6836w()
            goto L_0x0118
        L_0x0139:
            int r3 = r33.mo6838z()
            com.airbnb.lottie.model.content.ShapeTrimPath$Type r19 = com.airbnb.lottie.model.content.ShapeTrimPath.Type.forId(r3)
            goto L_0x0118
        L_0x0142:
            java.lang.String r18 = r33.mo6823A()
            goto L_0x0118
        L_0x0147:
            c5.b r22 = p094g5.C4799d.m12137b(r0, r1, r12)
            goto L_0x0118
        L_0x014c:
            c5.b r21 = p094g5.C4799d.m12137b(r0, r1, r12)
            goto L_0x0118
        L_0x0151:
            c5.b r20 = p094g5.C4799d.m12137b(r0, r1, r12)
            goto L_0x0118
        L_0x0156:
            com.airbnb.lottie.model.content.ShapeTrimPath r6 = new com.airbnb.lottie.model.content.ShapeTrimPath
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23)
            goto L_0x06f7
        L_0x015f:
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = p094g5.C4810i0.f16206a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
        L_0x0177:
            boolean r7 = r33.mo6835v()
            if (r7 == 0) goto L_0x024e
            com.airbnb.lottie.parser.moshi.JsonReader$a r7 = p094g5.C4810i0.f16206a
            int r7 = r0.mo6826H(r7)
            switch(r7) {
                case 0: goto L_0x0248;
                case 1: goto L_0x0242;
                case 2: goto L_0x023c;
                case 3: goto L_0x0236;
                case 4: goto L_0x0229;
                case 5: goto L_0x021c;
                case 6: goto L_0x0213;
                case 7: goto L_0x020d;
                case 8: goto L_0x018a;
                default: goto L_0x0186;
            }
        L_0x0186:
            r33.mo6828N()
            goto L_0x0177
        L_0x018a:
            r33.mo6830e()
        L_0x018d:
            boolean r7 = r33.mo6835v()
            if (r7 == 0) goto L_0x01f9
            r33.mo6831i()
            r7 = 0
            r8 = 0
        L_0x0198:
            boolean r9 = r33.mo6835v()
            if (r9 == 0) goto L_0x01b9
            com.airbnb.lottie.parser.moshi.JsonReader$a r9 = p094g5.C4810i0.f16207b
            int r9 = r0.mo6826H(r9)
            if (r9 == 0) goto L_0x01b4
            if (r9 == r5) goto L_0x01af
            r33.mo6827K()
            r33.mo6828N()
            goto L_0x0198
        L_0x01af:
            c5.b r7 = p094g5.C4799d.m12137b(r0, r1, r5)
            goto L_0x0198
        L_0x01b4:
            java.lang.String r8 = r33.mo6823A()
            goto L_0x0198
        L_0x01b9:
            r33.mo6833r()
            r8.getClass()
            int r9 = r8.hashCode()
            if (r9 == r6) goto L_0x01e0
            r10 = 103(0x67, float:1.44E-43)
            if (r9 == r10) goto L_0x01d7
            r10 = 111(0x6f, float:1.56E-43)
            if (r9 == r10) goto L_0x01ce
            goto L_0x01e6
        L_0x01ce:
            boolean r8 = r8.equals(r13)
            if (r8 != 0) goto L_0x01d5
            goto L_0x01e6
        L_0x01d5:
            r8 = 2
            goto L_0x01e9
        L_0x01d7:
            boolean r8 = r8.equals(r14)
            if (r8 != 0) goto L_0x01de
            goto L_0x01e6
        L_0x01de:
            r8 = 1
            goto L_0x01e9
        L_0x01e0:
            boolean r8 = r8.equals(r15)
            if (r8 != 0) goto L_0x01e8
        L_0x01e6:
            r8 = -1
            goto L_0x01e9
        L_0x01e8:
            r8 = 0
        L_0x01e9:
            if (r8 == 0) goto L_0x01f3
            if (r8 == r5) goto L_0x01f3
            if (r8 == r2) goto L_0x01f0
            goto L_0x018d
        L_0x01f0:
            r21 = r7
            goto L_0x018d
        L_0x01f3:
            r1.f6462n = r5
            r3.add(r7)
            goto L_0x018d
        L_0x01f9:
            r33.mo6832q()
            int r7 = r3.size()
            if (r7 != r5) goto L_0x0177
            java.lang.Object r7 = r3.get(r12)
            c5.b r7 = (p037c5.C1781b) r7
            r3.add(r7)
            goto L_0x0177
        L_0x020d:
            boolean r29 = r33.mo6836w()
            goto L_0x0177
        L_0x0213:
            double r7 = r33.mo6837x()
            float r7 = (float) r7
            r28 = r7
            goto L_0x0177
        L_0x021c:
            com.airbnb.lottie.model.content.ShapeStroke$LineJoinType[] r7 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.values()
            int r8 = r33.mo6838z()
            int r8 = r8 - r5
            r27 = r7[r8]
            goto L_0x0177
        L_0x0229:
            com.airbnb.lottie.model.content.ShapeStroke$LineCapType[] r7 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.values()
            int r8 = r33.mo6838z()
            int r8 = r8 - r5
            r26 = r7[r8]
            goto L_0x0177
        L_0x0236:
            c5.d r4 = p094g5.C4799d.m12138c(r33, r34)
            goto L_0x0177
        L_0x023c:
            c5.b r25 = p094g5.C4799d.m12137b(r0, r1, r5)
            goto L_0x0177
        L_0x0242:
            c5.a r23 = p094g5.C4799d.m12136a(r33, r34)
            goto L_0x0177
        L_0x0248:
            java.lang.String r20 = r33.mo6823A()
            goto L_0x0177
        L_0x024e:
            if (r4 != 0) goto L_0x0265
            c5.d r1 = new c5.d
            i5.a r2 = new i5.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r2.<init>(r4)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r1.<init>(r2)
            r24 = r1
            goto L_0x0267
        L_0x0265:
            r24 = r4
        L_0x0267:
            com.airbnb.lottie.model.content.ShapeStroke r6 = new com.airbnb.lottie.model.content.ShapeStroke
            r19 = r6
            r22 = r3
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            goto L_0x06f7
        L_0x0272:
            com.airbnb.lottie.parser.moshi.JsonReader$a r2 = p094g5.C4794a0.f16186a
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
        L_0x0288:
            boolean r2 = r33.mo6835v()
            if (r2 == 0) goto L_0x02d4
            com.airbnb.lottie.parser.moshi.JsonReader$a r2 = p094g5.C4794a0.f16186a
            int r2 = r0.mo6826H(r2)
            switch(r2) {
                case 0: goto L_0x02cf;
                case 1: goto L_0x02c6;
                case 2: goto L_0x02c1;
                case 3: goto L_0x02bc;
                case 4: goto L_0x02b7;
                case 5: goto L_0x02b2;
                case 6: goto L_0x02ad;
                case 7: goto L_0x02a8;
                case 8: goto L_0x02a3;
                case 9: goto L_0x029e;
                default: goto L_0x0297;
            }
        L_0x0297:
            r33.mo6827K()
            r33.mo6828N()
            goto L_0x0288
        L_0x029e:
            boolean r27 = r33.mo6836w()
            goto L_0x0288
        L_0x02a3:
            c5.b r25 = p094g5.C4799d.m12137b(r0, r1, r12)
            goto L_0x0288
        L_0x02a8:
            c5.b r23 = p094g5.C4799d.m12137b(r0, r1, r5)
            goto L_0x0288
        L_0x02ad:
            c5.b r26 = p094g5.C4799d.m12137b(r0, r1, r12)
            goto L_0x0288
        L_0x02b2:
            c5.b r24 = p094g5.C4799d.m12137b(r0, r1, r5)
            goto L_0x0288
        L_0x02b7:
            c5.b r22 = p094g5.C4799d.m12137b(r0, r1, r12)
            goto L_0x0288
        L_0x02bc:
            c5.m r21 = p094g5.C4793a.m12134b(r33, r34)
            goto L_0x0288
        L_0x02c1:
            c5.b r20 = p094g5.C4799d.m12137b(r0, r1, r12)
            goto L_0x0288
        L_0x02c6:
            int r2 = r33.mo6838z()
            com.airbnb.lottie.model.content.PolystarShape$Type r19 = com.airbnb.lottie.model.content.PolystarShape.Type.forValue(r2)
            goto L_0x0288
        L_0x02cf:
            java.lang.String r18 = r33.mo6823A()
            goto L_0x0288
        L_0x02d4:
            com.airbnb.lottie.model.content.PolystarShape r6 = new com.airbnb.lottie.model.content.PolystarShape
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x06f7
        L_0x02dd:
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = p094g5.C4808h0.f16203a
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
        L_0x02e3:
            boolean r9 = r33.mo6835v()
            if (r9 == 0) goto L_0x031a
            com.airbnb.lottie.parser.moshi.JsonReader$a r9 = p094g5.C4808h0.f16203a
            int r9 = r0.mo6826H(r9)
            if (r9 == 0) goto L_0x0315
            if (r9 == r5) goto L_0x0310
            if (r9 == r2) goto L_0x0300
            if (r9 == r8) goto L_0x02fb
            r33.mo6828N()
            goto L_0x02e3
        L_0x02fb:
            boolean r7 = r33.mo6836w()
            goto L_0x02e3
        L_0x0300:
            c5.h r3 = new c5.h
            float r9 = p107h5.C5059g.m12910c()
            g5.e0 r10 = p094g5.C4802e0.f16196a
            java.util.ArrayList r9 = p094g5.C4825u.m12155a(r0, r1, r9, r10, r12)
            r3.<init>(r9)
            goto L_0x02e3
        L_0x0310:
            int r4 = r33.mo6838z()
            goto L_0x02e3
        L_0x0315:
            java.lang.String r6 = r33.mo6823A()
            goto L_0x02e3
        L_0x031a:
            d5.j r1 = new d5.j
            r1.<init>(r6, r4, r3, r7)
            goto L_0x0575
        L_0x0321:
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = p094g5.C4798c0.f16192a
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
        L_0x032d:
            boolean r3 = r33.mo6835v()
            if (r3 == 0) goto L_0x0360
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = p094g5.C4798c0.f16192a
            int r3 = r0.mo6826H(r3)
            if (r3 == 0) goto L_0x035b
            if (r3 == r5) goto L_0x0356
            if (r3 == r2) goto L_0x0351
            if (r3 == r8) goto L_0x034c
            if (r3 == r9) goto L_0x0347
            r33.mo6828N()
            goto L_0x032d
        L_0x0347:
            boolean r22 = r33.mo6836w()
            goto L_0x032d
        L_0x034c:
            c5.l r21 = p094g5.C4797c.m12135a(r33, r34)
            goto L_0x032d
        L_0x0351:
            c5.b r20 = p094g5.C4799d.m12137b(r0, r1, r12)
            goto L_0x032d
        L_0x0356:
            c5.b r19 = p094g5.C4799d.m12137b(r0, r1, r12)
            goto L_0x032d
        L_0x035b:
            java.lang.String r18 = r33.mo6823A()
            goto L_0x032d
        L_0x0360:
            d5.f r6 = new d5.f
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22)
            goto L_0x06f7
        L_0x0369:
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = p094g5.C4796b0.f16189a
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
        L_0x0375:
            boolean r3 = r33.mo6835v()
            if (r3 == 0) goto L_0x03a8
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = p094g5.C4796b0.f16189a
            int r3 = r0.mo6826H(r3)
            if (r3 == 0) goto L_0x03a3
            if (r3 == r5) goto L_0x039e
            if (r3 == r2) goto L_0x0399
            if (r3 == r8) goto L_0x0394
            if (r3 == r9) goto L_0x038f
            r33.mo6828N()
            goto L_0x0375
        L_0x038f:
            boolean r22 = r33.mo6836w()
            goto L_0x0375
        L_0x0394:
            c5.b r21 = p094g5.C4799d.m12137b(r0, r1, r5)
            goto L_0x0375
        L_0x0399:
            c5.f r20 = p094g5.C4799d.m12139d(r33, r34)
            goto L_0x0375
        L_0x039e:
            c5.m r19 = p094g5.C4793a.m12134b(r33, r34)
            goto L_0x0375
        L_0x03a3:
            java.lang.String r18 = r33.mo6823A()
            goto L_0x0375
        L_0x03a8:
            d5.e r6 = new d5.e
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22)
            goto L_0x06f7
        L_0x03b1:
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = p094g5.C4829x.f16247a
            r3 = 0
            r6 = 0
        L_0x03b5:
            boolean r4 = r33.mo6835v()
            if (r4 == 0) goto L_0x03e1
            com.airbnb.lottie.parser.moshi.JsonReader$a r4 = p094g5.C4829x.f16247a
            int r4 = r0.mo6826H(r4)
            if (r4 == 0) goto L_0x03dc
            if (r4 == r5) goto L_0x03d3
            if (r4 == r2) goto L_0x03ce
            r33.mo6827K()
            r33.mo6828N()
            goto L_0x03b5
        L_0x03ce:
            boolean r12 = r33.mo6836w()
            goto L_0x03b5
        L_0x03d3:
            int r3 = r33.mo6838z()
            com.airbnb.lottie.model.content.MergePaths$MergePathsMode r3 = com.airbnb.lottie.model.content.MergePaths.MergePathsMode.forId(r3)
            goto L_0x03b5
        L_0x03dc:
            java.lang.String r6 = r33.mo6823A()
            goto L_0x03b5
        L_0x03e1:
            com.airbnb.lottie.model.content.MergePaths r2 = new com.airbnb.lottie.model.content.MergePaths
            r2.<init>(r6, r3, r12)
            java.lang.String r3 = "Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove()."
            r1.mo6755a(r3)
            r6 = r2
            goto L_0x06f7
        L_0x03ee:
            com.airbnb.lottie.parser.moshi.JsonReader$a r2 = p094g5.C4820q.f16228a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 0
            r32 = 0
        L_0x040c:
            boolean r4 = r33.mo6835v()
            if (r4 == 0) goto L_0x050d
            com.airbnb.lottie.parser.moshi.JsonReader$a r4 = p094g5.C4820q.f16228a
            int r4 = r0.mo6826H(r4)
            switch(r4) {
                case 0: goto L_0x0507;
                case 1: goto L_0x04d1;
                case 2: goto L_0x04cb;
                case 3: goto L_0x04bc;
                case 4: goto L_0x04b6;
                case 5: goto L_0x04b0;
                case 6: goto L_0x04aa;
                case 7: goto L_0x049d;
                case 8: goto L_0x0490;
                case 9: goto L_0x0487;
                case 10: goto L_0x0482;
                case 11: goto L_0x0422;
                default: goto L_0x041b;
            }
        L_0x041b:
            r33.mo6827K()
            r33.mo6828N()
            goto L_0x040c
        L_0x0422:
            r33.mo6830e()
        L_0x0425:
            boolean r4 = r33.mo6835v()
            if (r4 == 0) goto L_0x046f
            r33.mo6831i()
            r4 = 0
            r7 = 0
        L_0x0430:
            boolean r8 = r33.mo6835v()
            if (r8 == 0) goto L_0x0451
            com.airbnb.lottie.parser.moshi.JsonReader$a r8 = p094g5.C4820q.f16230c
            int r8 = r0.mo6826H(r8)
            if (r8 == 0) goto L_0x044c
            if (r8 == r5) goto L_0x0447
            r33.mo6827K()
            r33.mo6828N()
            goto L_0x0430
        L_0x0447:
            c5.b r4 = p094g5.C4799d.m12137b(r0, r1, r5)
            goto L_0x0430
        L_0x044c:
            java.lang.String r7 = r33.mo6823A()
            goto L_0x0430
        L_0x0451:
            r33.mo6833r()
            boolean r8 = r7.equals(r13)
            if (r8 == 0) goto L_0x045d
            r31 = r4
            goto L_0x0425
        L_0x045d:
            boolean r8 = r7.equals(r15)
            if (r8 != 0) goto L_0x0469
            boolean r7 = r7.equals(r14)
            if (r7 == 0) goto L_0x0425
        L_0x0469:
            r1.f6462n = r5
            r2.add(r4)
            goto L_0x0425
        L_0x046f:
            r33.mo6832q()
            int r4 = r2.size()
            if (r4 != r5) goto L_0x040c
            java.lang.Object r4 = r2.get(r12)
            c5.b r4 = (p037c5.C1781b) r4
            r2.add(r4)
            goto L_0x040c
        L_0x0482:
            boolean r32 = r33.mo6836w()
            goto L_0x040c
        L_0x0487:
            double r7 = r33.mo6837x()
            float r4 = (float) r7
            r29 = r4
            goto L_0x040c
        L_0x0490:
            com.airbnb.lottie.model.content.ShapeStroke$LineJoinType[] r4 = com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.values()
            int r7 = r33.mo6838z()
            int r7 = r7 - r5
            r28 = r4[r7]
            goto L_0x040c
        L_0x049d:
            com.airbnb.lottie.model.content.ShapeStroke$LineCapType[] r4 = com.airbnb.lottie.model.content.ShapeStroke.LineCapType.values()
            int r7 = r33.mo6838z()
            int r7 = r7 - r5
            r27 = r4[r7]
            goto L_0x040c
        L_0x04aa:
            c5.b r26 = p094g5.C4799d.m12137b(r0, r1, r5)
            goto L_0x040c
        L_0x04b0:
            c5.f r25 = p094g5.C4799d.m12139d(r33, r34)
            goto L_0x040c
        L_0x04b6:
            c5.f r24 = p094g5.C4799d.m12139d(r33, r34)
            goto L_0x040c
        L_0x04bc:
            int r4 = r33.mo6838z()
            if (r4 != r5) goto L_0x04c5
            com.airbnb.lottie.model.content.GradientType r4 = com.airbnb.lottie.model.content.GradientType.LINEAR
            goto L_0x04c7
        L_0x04c5:
            com.airbnb.lottie.model.content.GradientType r4 = com.airbnb.lottie.model.content.GradientType.RADIAL
        L_0x04c7:
            r21 = r4
            goto L_0x040c
        L_0x04cb:
            c5.d r3 = p094g5.C4799d.m12138c(r33, r34)
            goto L_0x040c
        L_0x04d1:
            r33.mo6831i()
            r4 = -1
        L_0x04d5:
            boolean r7 = r33.mo6835v()
            if (r7 == 0) goto L_0x0502
            com.airbnb.lottie.parser.moshi.JsonReader$a r7 = p094g5.C4820q.f16229b
            int r7 = r0.mo6826H(r7)
            if (r7 == 0) goto L_0x04fd
            if (r7 == r5) goto L_0x04ec
            r33.mo6827K()
            r33.mo6828N()
            goto L_0x04d5
        L_0x04ec:
            c5.c r7 = new c5.c
            g5.o r8 = new g5.o
            r8.<init>(r4)
            java.util.ArrayList r8 = p094g5.C4825u.m12155a(r0, r1, r11, r8, r12)
            r7.<init>(r8)
            r22 = r7
            goto L_0x04d5
        L_0x04fd:
            int r4 = r33.mo6838z()
            goto L_0x04d5
        L_0x0502:
            r33.mo6833r()
            goto L_0x040c
        L_0x0507:
            java.lang.String r20 = r33.mo6823A()
            goto L_0x040c
        L_0x050d:
            if (r3 != 0) goto L_0x0524
            c5.d r1 = new c5.d
            i5.a r3 = new i5.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r3.<init>(r4)
            java.util.List r3 = java.util.Collections.singletonList(r3)
            r1.<init>(r3)
            r23 = r1
            goto L_0x0526
        L_0x0524:
            r23 = r3
        L_0x0526:
            com.airbnb.lottie.model.content.a r6 = new com.airbnb.lottie.model.content.a
            r19 = r6
            r30 = r2
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x06f7
        L_0x0531:
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = p094g5.C4806g0.f16201a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r6 = 0
        L_0x0539:
            boolean r4 = r33.mo6835v()
            if (r4 == 0) goto L_0x0570
            com.airbnb.lottie.parser.moshi.JsonReader$a r4 = p094g5.C4806g0.f16201a
            int r4 = r0.mo6826H(r4)
            if (r4 == 0) goto L_0x056b
            if (r4 == r5) goto L_0x0566
            if (r4 == r2) goto L_0x054f
            r33.mo6828N()
            goto L_0x0539
        L_0x054f:
            r33.mo6830e()
        L_0x0552:
            boolean r4 = r33.mo6835v()
            if (r4 == 0) goto L_0x0562
            d5.b r4 = m12143a(r33, r34)
            if (r4 == 0) goto L_0x0552
            r3.add(r4)
            goto L_0x0552
        L_0x0562:
            r33.mo6832q()
            goto L_0x0539
        L_0x0566:
            boolean r12 = r33.mo6836w()
            goto L_0x0539
        L_0x056b:
            java.lang.String r6 = r33.mo6823A()
            goto L_0x0539
        L_0x0570:
            d5.i r1 = new d5.i
            r1.<init>(r3, r6, r12)
        L_0x0575:
            r6 = r1
            goto L_0x06f7
        L_0x0578:
            com.airbnb.lottie.parser.moshi.JsonReader$a r2 = p094g5.C4819p.f16226a
            android.graphics.Path$FillType r2 = android.graphics.Path.FillType.WINDING
            r21 = r2
            r16 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 0
        L_0x058c:
            boolean r2 = r33.mo6835v()
            if (r2 == 0) goto L_0x060c
            com.airbnb.lottie.parser.moshi.JsonReader$a r2 = p094g5.C4819p.f16226a
            int r2 = r0.mo6826H(r2)
            switch(r2) {
                case 0: goto L_0x0607;
                case 1: goto L_0x05d2;
                case 2: goto L_0x05cd;
                case 3: goto L_0x05bf;
                case 4: goto L_0x05ba;
                case 5: goto L_0x05b5;
                case 6: goto L_0x05a7;
                case 7: goto L_0x05a2;
                default: goto L_0x059b;
            }
        L_0x059b:
            r33.mo6827K()
            r33.mo6828N()
            goto L_0x058c
        L_0x05a2:
            boolean r26 = r33.mo6836w()
            goto L_0x058c
        L_0x05a7:
            int r2 = r33.mo6838z()
            if (r2 != r5) goto L_0x05b0
            android.graphics.Path$FillType r2 = android.graphics.Path.FillType.WINDING
            goto L_0x05b2
        L_0x05b0:
            android.graphics.Path$FillType r2 = android.graphics.Path.FillType.EVEN_ODD
        L_0x05b2:
            r21 = r2
            goto L_0x058c
        L_0x05b5:
            c5.f r25 = p094g5.C4799d.m12139d(r33, r34)
            goto L_0x058c
        L_0x05ba:
            c5.f r24 = p094g5.C4799d.m12139d(r33, r34)
            goto L_0x058c
        L_0x05bf:
            int r2 = r33.mo6838z()
            if (r2 != r5) goto L_0x05c8
            com.airbnb.lottie.model.content.GradientType r2 = com.airbnb.lottie.model.content.GradientType.LINEAR
            goto L_0x05ca
        L_0x05c8:
            com.airbnb.lottie.model.content.GradientType r2 = com.airbnb.lottie.model.content.GradientType.RADIAL
        L_0x05ca:
            r20 = r2
            goto L_0x058c
        L_0x05cd:
            c5.d r16 = p094g5.C4799d.m12138c(r33, r34)
            goto L_0x058c
        L_0x05d2:
            r33.mo6831i()
            r2 = -1
        L_0x05d6:
            boolean r3 = r33.mo6835v()
            if (r3 == 0) goto L_0x0603
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = p094g5.C4819p.f16227b
            int r3 = r0.mo6826H(r3)
            if (r3 == 0) goto L_0x05fe
            if (r3 == r5) goto L_0x05ed
            r33.mo6827K()
            r33.mo6828N()
            goto L_0x05d6
        L_0x05ed:
            c5.c r3 = new c5.c
            g5.o r4 = new g5.o
            r4.<init>(r2)
            java.util.ArrayList r4 = p094g5.C4825u.m12155a(r0, r1, r11, r4, r12)
            r3.<init>(r4)
            r22 = r3
            goto L_0x05d6
        L_0x05fe:
            int r2 = r33.mo6838z()
            goto L_0x05d6
        L_0x0603:
            r33.mo6833r()
            goto L_0x058c
        L_0x0607:
            java.lang.String r19 = r33.mo6823A()
            goto L_0x058c
        L_0x060c:
            if (r16 != 0) goto L_0x0623
            c5.d r1 = new c5.d
            i5.a r2 = new i5.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r2.<init>(r3)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r1.<init>(r2)
            r23 = r1
            goto L_0x0625
        L_0x0623:
            r23 = r16
        L_0x0625:
            d5.d r6 = new d5.d
            r18 = r6
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x06f7
        L_0x062e:
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = p094g5.C4804f0.f16199a
            r3 = 1
            r16 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r23 = 0
        L_0x063b:
            boolean r4 = r33.mo6835v()
            if (r4 == 0) goto L_0x0678
            com.airbnb.lottie.parser.moshi.JsonReader$a r4 = p094g5.C4804f0.f16199a
            int r4 = r0.mo6826H(r4)
            if (r4 == 0) goto L_0x0673
            if (r4 == r5) goto L_0x066e
            if (r4 == r2) goto L_0x0669
            if (r4 == r8) goto L_0x0664
            if (r4 == r9) goto L_0x065f
            if (r4 == r10) goto L_0x065a
            r33.mo6827K()
            r33.mo6828N()
            goto L_0x063b
        L_0x065a:
            boolean r23 = r33.mo6836w()
            goto L_0x063b
        L_0x065f:
            int r3 = r33.mo6838z()
            goto L_0x063b
        L_0x0664:
            boolean r19 = r33.mo6836w()
            goto L_0x063b
        L_0x0669:
            c5.d r16 = p094g5.C4799d.m12138c(r33, r34)
            goto L_0x063b
        L_0x066e:
            c5.a r21 = p094g5.C4799d.m12136a(r33, r34)
            goto L_0x063b
        L_0x0673:
            java.lang.String r18 = r33.mo6823A()
            goto L_0x063b
        L_0x0678:
            if (r16 != 0) goto L_0x068f
            c5.d r1 = new c5.d
            i5.a r2 = new i5.a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r2.<init>(r4)
            java.util.List r2 = java.util.Collections.singletonList(r2)
            r1.<init>(r2)
            r22 = r1
            goto L_0x0691
        L_0x068f:
            r22 = r16
        L_0x0691:
            if (r3 != r5) goto L_0x0696
            android.graphics.Path$FillType r1 = android.graphics.Path.FillType.WINDING
            goto L_0x0698
        L_0x0696:
            android.graphics.Path$FillType r1 = android.graphics.Path.FillType.EVEN_ODD
        L_0x0698:
            r20 = r1
            d5.h r6 = new d5.h
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23)
            goto L_0x06f7
        L_0x06a2:
            com.airbnb.lottie.parser.moshi.JsonReader$a r4 = p094g5.C4803f.f16198a
            if (r3 != r8) goto L_0x06a8
            r3 = 1
            goto L_0x06a9
        L_0x06a8:
            r3 = 0
        L_0x06a9:
            r21 = r3
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
        L_0x06b3:
            boolean r3 = r33.mo6835v()
            if (r3 == 0) goto L_0x06f0
            com.airbnb.lottie.parser.moshi.JsonReader$a r3 = p094g5.C4803f.f16198a
            int r3 = r0.mo6826H(r3)
            if (r3 == 0) goto L_0x06eb
            if (r3 == r5) goto L_0x06e6
            if (r3 == r2) goto L_0x06e1
            if (r3 == r8) goto L_0x06dc
            if (r3 == r9) goto L_0x06d0
            r33.mo6827K()
            r33.mo6828N()
            goto L_0x06b3
        L_0x06d0:
            int r3 = r33.mo6838z()
            if (r3 != r8) goto L_0x06d9
            r21 = 1
            goto L_0x06b3
        L_0x06d9:
            r21 = 0
            goto L_0x06b3
        L_0x06dc:
            boolean r22 = r33.mo6836w()
            goto L_0x06b3
        L_0x06e1:
            c5.f r20 = p094g5.C4799d.m12139d(r33, r34)
            goto L_0x06b3
        L_0x06e6:
            c5.m r19 = p094g5.C4793a.m12134b(r33, r34)
            goto L_0x06b3
        L_0x06eb:
            java.lang.String r18 = r33.mo6823A()
            goto L_0x06b3
        L_0x06f0:
            d5.a r6 = new d5.a
            r17 = r6
            r17.<init>(r18, r19, r20, r21, r22)
        L_0x06f7:
            boolean r1 = r33.mo6835v()
            if (r1 == 0) goto L_0x0701
            r33.mo6828N()
            goto L_0x06f7
        L_0x0701:
            r33.mo6833r()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p094g5.C4807h.m12143a(com.airbnb.lottie.parser.moshi.a, com.airbnb.lottie.f):d5.b");
    }
}
