package com.google.protobuf;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.protobuf.C14625q;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p911xg.C20503k;
import p911xg.C20506n;
import p911xg.C20510r;
import p911xg.C20511s;
import p911xg.C20512t;
import p911xg.C20513u;
import p911xg.C20518x;
import sun.misc.Unsafe;

/* renamed from: com.google.protobuf.v */
public final class C14632v<T> implements C20512t<T> {

    /* renamed from: o */
    public static final int[] f36880o = new int[0];

    /* renamed from: p */
    public static final Unsafe f36881p = C20518x.m48173p();

    /* renamed from: a */
    public final int[] f36882a;

    /* renamed from: b */
    public final Object[] f36883b;

    /* renamed from: c */
    public final C14629t f36884c;

    /* renamed from: d */
    public final boolean f36885d;

    /* renamed from: e */
    public final boolean f36886e;

    /* renamed from: f */
    public final boolean f36887f;

    /* renamed from: g */
    public final int[] f36888g;

    /* renamed from: h */
    public final int f36889h;

    /* renamed from: i */
    public final int f36890i;

    /* renamed from: j */
    public final C20506n f36891j;

    /* renamed from: k */
    public final C14621o f36892k;

    /* renamed from: l */
    public final C14597c0<?, ?> f36893l;

    /* renamed from: m */
    public final C14603g<?> f36894m;

    /* renamed from: n */
    public final C14627r f36895n;

    public C14632v(int[] iArr, Object[] objArr, int i, int i2, C14629t tVar, boolean z, int[] iArr2, int i3, int i4, C20506n nVar, C14621o oVar, C14597c0 c0Var, C14603g gVar, C14627r rVar) {
        boolean z2;
        this.f36882a = iArr;
        this.f36883b = objArr;
        boolean z3 = tVar instanceof GeneratedMessageLite;
        this.f36886e = z;
        if (gVar == null || !gVar.mo44071d(tVar)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.f36885d = z2;
        this.f36887f = false;
        this.f36888g = iArr2;
        this.f36889h = i3;
        this.f36890i = i4;
        this.f36891j = nVar;
        this.f36892k = oVar;
        this.f36893l = c0Var;
        this.f36894m = gVar;
        this.f36884c = tVar;
        this.f36895n = rVar;
    }

    /* renamed from: m */
    public static List m36659m(long j, Object obj) {
        return (List) C20518x.m48172o(j, obj);
    }

    /* renamed from: p */
    public static C14632v m36660p(C20503k kVar, C20506n nVar, C14621o oVar, C14597c0 c0Var, C14603g gVar, C14627r rVar) {
        if (kVar instanceof C20511s) {
            return m36661q((C20511s) kVar, nVar, oVar, c0Var, gVar, rVar);
        }
        C20513u uVar = (C20513u) kVar;
        ProtoSyntax protoSyntax = ProtoSyntax.PROTO2;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0328  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0378  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> com.google.protobuf.C14632v<T> m36661q(p911xg.C20511s r32, p911xg.C20506n r33, com.google.protobuf.C14621o r34, com.google.protobuf.C14597c0<?, ?> r35, com.google.protobuf.C14603g<?> r36, com.google.protobuf.C14627r r37) {
        /*
            com.google.protobuf.ProtoSyntax r0 = r32.mo52689c()
            com.google.protobuf.ProtoSyntax r1 = com.google.protobuf.ProtoSyntax.PROTO3
            r2 = 0
            if (r0 != r1) goto L_0x000b
            r10 = 1
            goto L_0x000c
        L_0x000b:
            r10 = 0
        L_0x000c:
            java.lang.String r0 = r32.mo52692e()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0028
            r4 = 1
        L_0x001e:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0029
            r4 = r6
            goto L_0x001e
        L_0x0028:
            r6 = 1
        L_0x0029:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0048
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0035:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0045
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0035
        L_0x0045:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
        L_0x0048:
            if (r6 != 0) goto L_0x0057
            int[] r6 = f36880o
            r13 = r6
            r6 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            goto L_0x0166
        L_0x0057:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0076
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0063:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0073
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0063
        L_0x0073:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
        L_0x0076:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0095
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0082:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0092
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0082
        L_0x0092:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
        L_0x0095:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00b4
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a1:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b1
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a1
        L_0x00b1:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00b4:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00d3
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c0:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00d0
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c0
        L_0x00d0:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00d3:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00f2
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00df:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00ef
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00df
        L_0x00ef:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00f2:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x0111
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00fe:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x010e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00fe
        L_0x010e:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x0111:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0132
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x011d:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x012e
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x011d
        L_0x012e:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x0132:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0155
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x013e:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x0150
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x013e
        L_0x0150:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0155:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 * 2
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
            r31 = r14
            r14 = r12
            r12 = r31
        L_0x0166:
            sun.misc.Unsafe r15 = f36881p
            java.lang.Object[] r17 = r32.mo52691d()
            com.google.protobuf.t r18 = r32.mo52688b()
            java.lang.Class r2 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 * 2
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r14 = r14 + r12
            r21 = r12
            r22 = r14
            r19 = 0
            r20 = 0
        L_0x0185:
            if (r4 >= r1) goto L_0x03ca
            int r23 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01ad
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r3 = r23
            r23 = 13
        L_0x0195:
            int r25 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01a7
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r23
            r4 = r4 | r3
            int r23 = r23 + 13
            r3 = r25
            goto L_0x0195
        L_0x01a7:
            int r3 = r3 << r23
            r4 = r4 | r3
            r3 = r25
            goto L_0x01af
        L_0x01ad:
            r3 = r23
        L_0x01af:
            int r23 = r3 + 1
            char r3 = r0.charAt(r3)
            if (r3 < r5) goto L_0x01dc
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r5 = r23
            r23 = 13
        L_0x01bd:
            int r26 = r5 + 1
            char r5 = r0.charAt(r5)
            r27 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r1) goto L_0x01d6
            r1 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r23
            r3 = r3 | r1
            int r23 = r23 + 13
            r5 = r26
            r1 = r27
            goto L_0x01bd
        L_0x01d6:
            int r1 = r5 << r23
            r3 = r3 | r1
            r1 = r26
            goto L_0x01e0
        L_0x01dc:
            r27 = r1
            r1 = r23
        L_0x01e0:
            r5 = r3 & 255(0xff, float:3.57E-43)
            r23 = r14
            r14 = r3 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01ee
            int r14 = r20 + 1
            r13[r20] = r19
            r20 = r14
        L_0x01ee:
            r14 = 51
            if (r5 < r14) goto L_0x0294
            int r14 = r1 + 1
            char r1 = r0.charAt(r1)
            r26 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r14) goto L_0x0224
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r14 = r26
            r26 = 13
        L_0x0205:
            int r29 = r14 + 1
            char r14 = r0.charAt(r14)
            r30 = r12
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r12) goto L_0x021e
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r26
            r1 = r1 | r12
            int r26 = r26 + 13
            r14 = r29
            r12 = r30
            goto L_0x0205
        L_0x021e:
            int r12 = r14 << r26
            r1 = r1 | r12
            r14 = r29
            goto L_0x0228
        L_0x0224:
            r30 = r12
            r14 = r26
        L_0x0228:
            int r12 = r5 + -51
            r26 = r14
            r14 = 9
            if (r12 == r14) goto L_0x0248
            r14 = 17
            if (r12 != r14) goto L_0x0235
            goto L_0x0248
        L_0x0235:
            r14 = 12
            if (r12 != r14) goto L_0x0256
            if (r10 != 0) goto L_0x0256
            int r12 = r19 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
            goto L_0x0254
        L_0x0248:
            int r12 = r19 / 3
            int r12 = r12 * 2
            r14 = 1
            int r12 = r12 + r14
            int r14 = r16 + 1
            r16 = r17[r16]
            r11[r12] = r16
        L_0x0254:
            r16 = r14
        L_0x0256:
            int r1 = r1 * 2
            r12 = r17[r1]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0261
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x0269
        L_0x0261:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = m36664t(r2, r12)
            r17[r1] = r12
        L_0x0269:
            r14 = r8
            r29 = r9
            long r8 = r15.objectFieldOffset(r12)
            int r9 = (int) r8
            int r1 = r1 + 1
            r8 = r17[r1]
            boolean r12 = r8 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x027c
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            goto L_0x0284
        L_0x027c:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m36664t(r2, r8)
            r17[r1] = r8
        L_0x0284:
            r1 = r9
            long r8 = r15.objectFieldOffset(r8)
            int r9 = (int) r8
            r8 = r9
            r12 = r10
            r25 = r11
            r24 = 1
            r9 = r1
            r1 = 0
            goto L_0x0393
        L_0x0294:
            r14 = r8
            r29 = r9
            r30 = r12
            int r8 = r16 + 1
            r9 = r17[r16]
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m36664t(r2, r9)
            r12 = 9
            if (r5 == r12) goto L_0x030b
            r12 = 17
            if (r5 != r12) goto L_0x02ac
            goto L_0x030b
        L_0x02ac:
            r12 = 27
            if (r5 == r12) goto L_0x02fc
            r12 = 49
            if (r5 != r12) goto L_0x02b5
            goto L_0x02fc
        L_0x02b5:
            r12 = 12
            if (r5 == r12) goto L_0x02e8
            r12 = 30
            if (r5 == r12) goto L_0x02e8
            r12 = 44
            if (r5 != r12) goto L_0x02c2
            goto L_0x02e8
        L_0x02c2:
            r12 = 50
            if (r5 != r12) goto L_0x02f9
            int r12 = r21 + 1
            r13[r21] = r19
            int r21 = r19 / 3
            int r21 = r21 * 2
            int r26 = r8 + 1
            r8 = r17[r8]
            r11[r21] = r8
            r8 = r3 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L_0x02e3
            int r21 = r21 + 1
            int r8 = r26 + 1
            r26 = r17[r26]
            r11[r21] = r26
            r21 = r12
            goto L_0x02f9
        L_0x02e3:
            r21 = r12
        L_0x02e5:
            r24 = 1
            goto L_0x031b
        L_0x02e8:
            if (r10 != 0) goto L_0x02f9
            int r12 = r19 / 3
            int r12 = r12 * 2
            r24 = 1
            int r12 = r12 + 1
            int r26 = r8 + 1
            r8 = r17[r8]
            r11[r12] = r8
            goto L_0x02e5
        L_0x02f9:
            r24 = 1
            goto L_0x0319
        L_0x02fc:
            int r12 = r19 / 3
            int r12 = r12 * 2
            r24 = 1
            int r12 = r12 + 1
            int r26 = r8 + 1
            r8 = r17[r8]
            r11[r12] = r8
            goto L_0x031b
        L_0x030b:
            r24 = 1
            int r12 = r19 / 3
            int r12 = r12 * 2
            int r12 = r12 + 1
            java.lang.Class r26 = r9.getType()
            r11[r12] = r26
        L_0x0319:
            r26 = r8
        L_0x031b:
            long r8 = r15.objectFieldOffset(r9)
            int r9 = (int) r8
            r8 = r3 & 4096(0x1000, float:5.74E-42)
            r12 = 4096(0x1000, float:5.74E-42)
            if (r8 != r12) goto L_0x0328
            r8 = 1
            goto L_0x0329
        L_0x0328:
            r8 = 0
        L_0x0329:
            if (r8 == 0) goto L_0x0378
            r8 = 17
            if (r5 > r8) goto L_0x0378
            int r8 = r1 + 1
            char r1 = r0.charAt(r1)
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r12) goto L_0x0354
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r25 = 13
        L_0x033e:
            int r28 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r12) goto L_0x0350
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r25
            r1 = r1 | r8
            int r25 = r25 + 13
            r8 = r28
            goto L_0x033e
        L_0x0350:
            int r8 = r8 << r25
            r1 = r1 | r8
            goto L_0x0356
        L_0x0354:
            r28 = r8
        L_0x0356:
            int r8 = r6 * 2
            int r25 = r1 / 32
            int r25 = r25 + r8
            r8 = r17[r25]
            boolean r12 = r8 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x0365
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            goto L_0x036d
        L_0x0365:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = m36664t(r2, r8)
            r17[r25] = r8
        L_0x036d:
            r12 = r10
            r25 = r11
            long r10 = r15.objectFieldOffset(r8)
            int r8 = (int) r10
            int r1 = r1 % 32
            goto L_0x0381
        L_0x0378:
            r12 = r10
            r25 = r11
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r28 = r1
            r1 = 0
        L_0x0381:
            r10 = 18
            if (r5 < r10) goto L_0x038f
            r10 = 49
            if (r5 > r10) goto L_0x038f
            int r10 = r22 + 1
            r13[r22] = r9
            r22 = r10
        L_0x038f:
            r16 = r26
            r26 = r28
        L_0x0393:
            int r10 = r19 + 1
            r7[r19] = r4
            int r4 = r10 + 1
            r11 = r3 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x03a0
            r11 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03a1
        L_0x03a0:
            r11 = 0
        L_0x03a1:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x03a8
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03a9
        L_0x03a8:
            r3 = 0
        L_0x03a9:
            r3 = r3 | r11
            int r5 = r5 << 20
            r3 = r3 | r5
            r3 = r3 | r9
            r7[r10] = r3
            int r19 = r4 + 1
            int r1 = r1 << 20
            r1 = r1 | r8
            r7[r4] = r1
            r10 = r12
            r8 = r14
            r14 = r23
            r11 = r25
            r4 = r26
            r1 = r27
            r9 = r29
            r12 = r30
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0185
        L_0x03ca:
            r29 = r9
            r25 = r11
            r30 = r12
            r23 = r14
            r14 = r8
            r12 = r10
            com.google.protobuf.v r0 = new com.google.protobuf.v
            com.google.protobuf.t r9 = r32.mo52688b()
            r4 = r0
            r5 = r7
            r6 = r25
            r7 = r14
            r8 = r29
            r11 = r13
            r12 = r30
            r13 = r23
            r14 = r33
            r15 = r34
            r16 = r35
            r17 = r36
            r18 = r37
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C14632v.m36661q(xg.s, xg.n, com.google.protobuf.o, com.google.protobuf.c0, com.google.protobuf.g, com.google.protobuf.r):com.google.protobuf.v");
    }

    /* renamed from: r */
    public static int m36662r(long j, Object obj) {
        return ((Integer) C20518x.m48172o(j, obj)).intValue();
    }

    /* renamed from: s */
    public static long m36663s(long j, Object obj) {
        return ((Long) C20518x.m48172o(j, obj)).longValue();
    }

    /* renamed from: t */
    public static Field m36664t(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder l = C13555b.m33973l("Field ", str, " for ");
            C13715c.m34249o(cls, l, " not found. Known fields are ");
            l.append(Arrays.toString(declaredFields));
            throw new RuntimeException(l.toString());
        }
    }

    /* renamed from: z */
    public static void m36665z(int i, Object obj, C14602f fVar) throws IOException {
        if (obj instanceof String) {
            fVar.f36850a.mo43921N(i, (String) obj);
            return;
        }
        fVar.mo44051b(i, (ByteString) obj);
    }

    /* renamed from: a */
    public final void mo44129a(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.f36882a.length; i += 3) {
            int w = mo44147w(i);
            long j = (long) (1048575 & w);
            int i2 = this.f36882a[i];
            switch ((w & 267386880) >>> 20) {
                case 0:
                    if (!mo44141k(i, t2)) {
                        break;
                    } else {
                        C20518x.f51909c.mo52712m(t, j, C20518x.m48168k(j, t2));
                        mo44145u(i, t);
                        break;
                    }
                case 1:
                    if (!mo44141k(i, t2)) {
                        break;
                    } else {
                        C20518x.f51909c.mo52713n(t, j, C20518x.m48169l(j, t2));
                        mo44145u(i, t);
                        break;
                    }
                case 2:
                    if (!mo44141k(i, t2)) {
                        break;
                    } else {
                        C20518x.m48178u(t, j, C20518x.m48171n(j, t2));
                        mo44145u(i, t);
                        break;
                    }
                case 3:
                    if (!mo44141k(i, t2)) {
                        break;
                    } else {
                        C20518x.m48178u(t, j, C20518x.m48171n(j, t2));
                        mo44145u(i, t);
                        break;
                    }
                case 4:
                    if (!mo44141k(i, t2)) {
                        break;
                    } else {
                        C20518x.m48177t(t, C20518x.m48170m(j, t2), j);
                        mo44145u(i, t);
                        break;
                    }
                case 5:
                    if (!mo44141k(i, t2)) {
                        break;
                    } else {
                        C20518x.m48178u(t, j, C20518x.m48171n(j, t2));
                        mo44145u(i, t);
                        break;
                    }
                case 6:
                    if (!mo44141k(i, t2)) {
                        break;
                    } else {
                        C20518x.m48177t(t, C20518x.m48170m(j, t2), j);
                        mo44145u(i, t);
                        break;
                    }
                case 7:
                    if (!mo44141k(i, t2)) {
                        break;
                    } else {
                        C20518x.f51909c.mo52710k(t, j, C20518x.m48164g(j, t2));
                        mo44145u(i, t);
                        break;
                    }
                case 8:
                    if (!mo44141k(i, t2)) {
                        break;
                    } else {
                        C20518x.m48179v(t, j, C20518x.m48172o(j, t2));
                        mo44145u(i, t);
                        break;
                    }
                case 9:
                    mo44143n(i, t, t2);
                    break;
                case 10:
                    if (!mo44141k(i, t2)) {
                        break;
                    } else {
                        C20518x.m48179v(t, j, C20518x.m48172o(j, t2));
                        mo44145u(i, t);
                        break;
                    }
                case 11:
                    if (!mo44141k(i, t2)) {
                        break;
                    } else {
                        C20518x.m48177t(t, C20518x.m48170m(j, t2), j);
                        mo44145u(i, t);
                        break;
                    }
                case 12:
                    if (!mo44141k(i, t2)) {
                        break;
                    } else {
                        C20518x.m48177t(t, C20518x.m48170m(j, t2), j);
                        mo44145u(i, t);
                        break;
                    }
                case 13:
                    if (!mo44141k(i, t2)) {
                        break;
                    } else {
                        C20518x.m48177t(t, C20518x.m48170m(j, t2), j);
                        mo44145u(i, t);
                        break;
                    }
                case 14:
                    if (!mo44141k(i, t2)) {
                        break;
                    } else {
                        C20518x.m48178u(t, j, C20518x.m48171n(j, t2));
                        mo44145u(i, t);
                        break;
                    }
                case 15:
                    if (!mo44141k(i, t2)) {
                        break;
                    } else {
                        C20518x.m48177t(t, C20518x.m48170m(j, t2), j);
                        mo44145u(i, t);
                        break;
                    }
                case 16:
                    if (!mo44141k(i, t2)) {
                        break;
                    } else {
                        C20518x.m48178u(t, j, C20518x.m48171n(j, t2));
                        mo44145u(i, t);
                        break;
                    }
                case 17:
                    mo44143n(i, t, t2);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.f36892k.mo44114b(t, j, t2);
                    break;
                case 50:
                    C14627r rVar = this.f36895n;
                    Class<?> cls = C14636z.f36903a;
                    C20518x.m48179v(t, j, rVar.mo44124a(C20518x.m48172o(j, t), C20518x.m48172o(j, t2)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (!mo44142l(i2, i, t2)) {
                        break;
                    } else {
                        C20518x.m48179v(t, j, C20518x.m48172o(j, t2));
                        mo44146v(i2, i, t);
                        break;
                    }
                case 60:
                    mo44144o(i, t, t2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (!mo44142l(i2, i, t2)) {
                        break;
                    } else {
                        C20518x.m48179v(t, j, C20518x.m48172o(j, t2));
                        mo44146v(i2, i, t);
                        break;
                    }
                case 68:
                    mo44144o(i, t, t2);
                    break;
            }
        }
        C14597c0<?, ?> c0Var = this.f36893l;
        Class<?> cls2 = C14636z.f36903a;
        c0Var.mo44042f(t, c0Var.mo44041e(c0Var.mo44037a(t), c0Var.mo44037a(t2)));
        if (this.f36885d) {
            C14636z.m36692A(this.f36894m, t, t2);
        }
    }

    /* renamed from: b */
    public final void mo44130b(T t) {
        int i;
        int i2 = this.f36889h;
        while (true) {
            i = this.f36890i;
            if (i2 >= i) {
                break;
            }
            long w = (long) (mo44147w(this.f36888g[i2]) & 1048575);
            Object o = C20518x.m48172o(w, t);
            if (o != null) {
                C20518x.m48179v(t, w, this.f36895n.mo44127d(o));
            }
            i2++;
        }
        int length = this.f36888g.length;
        while (i < length) {
            this.f36892k.mo44113a((long) this.f36888g[i], t);
            i++;
        }
        this.f36893l.mo44040d(t);
        if (this.f36885d) {
            this.f36894m.mo44072e(t);
        }
    }

    /* renamed from: c */
    public final boolean mo44131c(T t) {
        boolean z;
        boolean z2;
        int i = 0;
        int i2 = 1048575;
        int i3 = 0;
        while (true) {
            boolean z3 = true;
            if (i < this.f36889h) {
                int i4 = this.f36888g[i];
                int i5 = this.f36882a[i4];
                int w = mo44147w(i4);
                int i6 = this.f36882a[i4 + 2];
                int i7 = i6 & 1048575;
                int i8 = 1 << (i6 >>> 20);
                if (i7 != i2) {
                    if (i7 != 1048575) {
                        i3 = f36881p.getInt(t, (long) i7);
                    }
                    i2 = i7;
                }
                if ((268435456 & w) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (i2 == 1048575) {
                        z2 = mo44141k(i4, t);
                    } else if ((i3 & i8) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        return false;
                    }
                }
                int i9 = (267386880 & w) >>> 20;
                if (i9 == 9 || i9 == 17) {
                    if (i2 == 1048575) {
                        z3 = mo44141k(i4, t);
                    } else if ((i3 & i8) == 0) {
                        z3 = false;
                    }
                    if (z3 && !mo44137h(i4).mo44131c(C20518x.m48172o((long) (w & 1048575), t))) {
                        return false;
                    }
                } else {
                    if (i9 != 27) {
                        if (i9 == 60 || i9 == 68) {
                            if (mo44142l(i5, i4, t) && !mo44137h(i4).mo44131c(C20518x.m48172o((long) (w & 1048575), t))) {
                                return false;
                            }
                        } else if (i9 != 49) {
                            if (i9 != 50) {
                                continue;
                            } else {
                                MapFieldLite c = this.f36895n.mo44126c(C20518x.m48172o((long) (w & 1048575), t));
                                if (!c.isEmpty()) {
                                    if (this.f36895n.mo44125b(mo44136g(i4)).f36878c.getJavaType() == WireFormat$JavaType.MESSAGE) {
                                        C20512t<?> tVar = null;
                                        Iterator it = c.values().iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            Object next = it.next();
                                            if (tVar == null) {
                                                tVar = C20510r.f51897c.mo52690a(next.getClass());
                                            }
                                            if (!tVar.mo44131c(next)) {
                                                z3 = false;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (!z3) {
                                    return false;
                                }
                            }
                        }
                    }
                    List list = (List) C20518x.m48172o((long) (w & 1048575), t);
                    if (!list.isEmpty()) {
                        C20512t h = mo44137h(i4);
                        int i11 = 0;
                        while (true) {
                            if (i11 >= list.size()) {
                                break;
                            } else if (!h.mo44131c(list.get(i11))) {
                                z3 = false;
                                break;
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (!z3) {
                        return false;
                    }
                }
                i++;
            } else if (!this.f36885d || this.f36894m.mo44069b(t).mo44081i()) {
                return true;
            } else {
                return false;
            }
        }
    }

    /* renamed from: d */
    public final int mo44132d(T t) {
        return this.f36886e ? mo44140j(t) : mo44139i(t);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v16, resolved type: java.util.Map$Entry} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x02de  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0300  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0322  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x038c  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x039d  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x03ae  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x03bf  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x03d0  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x03e1  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x03f2  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0403  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x043a  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x044b  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x045c  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x046d  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x047e  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x04a2  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x04b7  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x04c8  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x04d9  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x04ea  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x04fb  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x050c  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x051d  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x052e  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x053f  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x05bc  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x05d1  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x05e2  */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x05f3  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x0604  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x0615  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0626  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x0637  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:221:0x064a  */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x065f  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0670  */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0687  */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0698  */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x06a9  */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x06ba  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x06cb  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x06dc  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x06f3  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x070a  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0715  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x072a  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x073b  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x074c  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x075d  */
    /* JADX WARNING: Removed duplicated region for block: B:257:0x076e  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x077f  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0790  */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x07a1  */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x07b2  */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x07c3  */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x07d4  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x07e5  */
    /* JADX WARNING: Removed duplicated region for block: B:265:0x07f6  */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0807  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0818  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0829  */
    /* JADX WARNING: Removed duplicated region for block: B:269:0x083a  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x084b  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x085c  */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x086d  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x087e  */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x088f  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x08a4  */
    /* JADX WARNING: Removed duplicated region for block: B:276:0x08b5  */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x08c6  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x08d7  */
    /* JADX WARNING: Removed duplicated region for block: B:279:0x08e8  */
    /* JADX WARNING: Removed duplicated region for block: B:280:0x08f9  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x090a  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x091b  */
    /* JADX WARNING: Removed duplicated region for block: B:283:0x092c  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x093d  */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x0952  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0963  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0974  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0985  */
    /* JADX WARNING: Removed duplicated region for block: B:299:0x0996  */
    /* JADX WARNING: Removed duplicated region for block: B:302:0x09a7  */
    /* JADX WARNING: Removed duplicated region for block: B:305:0x09b8  */
    /* JADX WARNING: Removed duplicated region for block: B:308:0x09cb  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x09e0  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x09f1  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0a02  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0a12  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0a22  */
    /* JADX WARNING: Removed duplicated region for block: B:326:0x0a32  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0a42  */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0a52  */
    /* JADX WARNING: Removed duplicated region for block: B:335:0x0a62  */
    /* JADX WARNING: Removed duplicated region for block: B:340:0x0a77  */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x0550 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:348:0x0066 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:569:0x0a71 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0223  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0234  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0267  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0278  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0289  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x029a  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02cd  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44133e(java.lang.Object r14, com.google.protobuf.C14602f r15) throws java.io.IOException {
        /*
            r13 = this;
            r15.getClass()
            com.google.protobuf.Writer$FieldOrder r0 = com.google.protobuf.Writer$FieldOrder.ASCENDING
            com.google.protobuf.Writer$FieldOrder r1 = com.google.protobuf.Writer$FieldOrder.DESCENDING
            r2 = 0
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = 1
            r5 = 267386880(0xff00000, float:2.3665827E-29)
            r6 = 0
            if (r0 != r1) goto L_0x0567
            com.google.protobuf.c0<?, ?> r0 = r13.f36893l
            com.google.protobuf.d0 r1 = r0.mo44037a(r14)
            r0.mo44044h(r1, r15)
            boolean r0 = r13.f36885d
            if (r0 == 0) goto L_0x0061
            com.google.protobuf.g<?> r0 = r13.f36894m
            com.google.protobuf.i r0 = r0.mo44069b(r14)
            boolean r1 = r0.mo44079h()
            if (r1 != 0) goto L_0x0061
            boolean r1 = r0.f36855c
            if (r1 == 0) goto L_0x0047
            com.google.protobuf.l$b r1 = new com.google.protobuf.l$b
            com.google.protobuf.b0<T, java.lang.Object> r0 = r0.f36853a
            com.google.protobuf.b0<K, V>$b r7 = r0.f36821h
            if (r7 != 0) goto L_0x003d
            com.google.protobuf.b0$b r7 = new com.google.protobuf.b0$b
            r7.<init>()
            r0.f36821h = r7
        L_0x003d:
            com.google.protobuf.b0<K, V>$b r0 = r0.f36821h
            java.util.Iterator r0 = r0.iterator()
            r1.<init>(r0)
            goto L_0x005a
        L_0x0047:
            com.google.protobuf.b0<T, java.lang.Object> r0 = r0.f36853a
            com.google.protobuf.b0<K, V>$b r1 = r0.f36821h
            if (r1 != 0) goto L_0x0054
            com.google.protobuf.b0$b r1 = new com.google.protobuf.b0$b
            r1.<init>()
            r0.f36821h = r1
        L_0x0054:
            com.google.protobuf.b0<K, V>$b r0 = r0.f36821h
            java.util.Iterator r1 = r0.iterator()
        L_0x005a:
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x0063
        L_0x0061:
            r0 = r6
            r1 = r0
        L_0x0063:
            int[] r7 = r13.f36882a
            int r7 = r7.length
        L_0x0066:
            int r7 = r7 + -3
            if (r7 < 0) goto L_0x0550
            int r8 = r13.mo44147w(r7)
            int[] r9 = r13.f36882a
            r9 = r9[r7]
        L_0x0072:
            if (r0 == 0) goto L_0x008f
            com.google.protobuf.g<?> r10 = r13.f36894m
            r10.mo44068a(r0)
            if (r9 >= 0) goto L_0x008f
            com.google.protobuf.g<?> r10 = r13.f36894m
            r10.mo44073f(r0)
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008d
            java.lang.Object r0 = r1.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x0072
        L_0x008d:
            r0 = r6
            goto L_0x0072
        L_0x008f:
            r10 = r8 & r5
            int r10 = r10 >>> 20
            switch(r10) {
                case 0: goto L_0x053f;
                case 1: goto L_0x052e;
                case 2: goto L_0x051d;
                case 3: goto L_0x050c;
                case 4: goto L_0x04fb;
                case 5: goto L_0x04ea;
                case 6: goto L_0x04d9;
                case 7: goto L_0x04c8;
                case 8: goto L_0x04b7;
                case 9: goto L_0x04a2;
                case 10: goto L_0x048f;
                case 11: goto L_0x047e;
                case 12: goto L_0x046d;
                case 13: goto L_0x045c;
                case 14: goto L_0x044b;
                case 15: goto L_0x043a;
                case 16: goto L_0x0429;
                case 17: goto L_0x0414;
                case 18: goto L_0x0403;
                case 19: goto L_0x03f2;
                case 20: goto L_0x03e1;
                case 21: goto L_0x03d0;
                case 22: goto L_0x03bf;
                case 23: goto L_0x03ae;
                case 24: goto L_0x039d;
                case 25: goto L_0x038c;
                case 26: goto L_0x037b;
                case 27: goto L_0x0366;
                case 28: goto L_0x0355;
                case 29: goto L_0x0344;
                case 30: goto L_0x0333;
                case 31: goto L_0x0322;
                case 32: goto L_0x0311;
                case 33: goto L_0x0300;
                case 34: goto L_0x02ef;
                case 35: goto L_0x02de;
                case 36: goto L_0x02cd;
                case 37: goto L_0x02bc;
                case 38: goto L_0x02ab;
                case 39: goto L_0x029a;
                case 40: goto L_0x0289;
                case 41: goto L_0x0278;
                case 42: goto L_0x0267;
                case 43: goto L_0x0256;
                case 44: goto L_0x0245;
                case 45: goto L_0x0234;
                case 46: goto L_0x0223;
                case 47: goto L_0x0212;
                case 48: goto L_0x0201;
                case 49: goto L_0x01ec;
                case 50: goto L_0x01e1;
                case 51: goto L_0x01ca;
                case 52: goto L_0x01b3;
                case 53: goto L_0x01a2;
                case 54: goto L_0x0191;
                case 55: goto L_0x0180;
                case 56: goto L_0x016f;
                case 57: goto L_0x015e;
                case 58: goto L_0x0147;
                case 59: goto L_0x0136;
                case 60: goto L_0x0121;
                case 61: goto L_0x010e;
                case 62: goto L_0x00fd;
                case 63: goto L_0x00ec;
                case 64: goto L_0x00db;
                case 65: goto L_0x00cb;
                case 66: goto L_0x00bb;
                case 67: goto L_0x00ab;
                case 68: goto L_0x0097;
                default: goto L_0x0096;
            }
        L_0x0096:
            goto L_0x0066
        L_0x0097:
            boolean r10 = r13.mo44142l(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            xg.t r10 = r13.mo44137h(r7)
            r15.mo44057h(r9, r10, r8)
            goto L_0x0066
        L_0x00ab:
            boolean r10 = r13.mo44142l(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            long r10 = m36663s(r10, r14)
            r15.mo44065p(r9, r10)
            goto L_0x0066
        L_0x00bb:
            boolean r10 = r13.mo44142l(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            int r8 = m36662r(r10, r14)
            r15.mo44064o(r9, r8)
            goto L_0x0066
        L_0x00cb:
            boolean r10 = r13.mo44142l(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            long r10 = m36663s(r10, r14)
            r15.mo44063n(r9, r10)
            goto L_0x0066
        L_0x00db:
            boolean r10 = r13.mo44142l(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            int r8 = m36662r(r10, r14)
            r15.mo44062m(r9, r8)
            goto L_0x0066
        L_0x00ec:
            boolean r10 = r13.mo44142l(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            int r8 = m36662r(r10, r14)
            r15.mo44053d(r9, r8)
            goto L_0x0066
        L_0x00fd:
            boolean r10 = r13.mo44142l(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            int r8 = m36662r(r10, r14)
            r15.mo44066q(r9, r8)
            goto L_0x0066
        L_0x010e:
            boolean r10 = r13.mo44142l(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            com.google.protobuf.ByteString r8 = (com.google.protobuf.ByteString) r8
            r15.mo44051b(r9, r8)
            goto L_0x0066
        L_0x0121:
            boolean r10 = r13.mo44142l(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            xg.t r10 = r13.mo44137h(r7)
            r15.mo44060k(r9, r10, r8)
            goto L_0x0066
        L_0x0136:
            boolean r10 = r13.mo44142l(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            m36665z(r9, r8, r15)
            goto L_0x0066
        L_0x0147:
            boolean r10 = r13.mo44142l(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r15.mo44050a(r9, r8)
            goto L_0x0066
        L_0x015e:
            boolean r10 = r13.mo44142l(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            int r8 = m36662r(r10, r14)
            r15.mo44054e(r9, r8)
            goto L_0x0066
        L_0x016f:
            boolean r10 = r13.mo44142l(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            long r10 = m36663s(r10, r14)
            r15.mo44055f(r9, r10)
            goto L_0x0066
        L_0x0180:
            boolean r10 = r13.mo44142l(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            int r8 = m36662r(r10, r14)
            r15.mo44058i(r9, r8)
            goto L_0x0066
        L_0x0191:
            boolean r10 = r13.mo44142l(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            long r10 = m36663s(r10, r14)
            r15.mo44067r(r9, r10)
            goto L_0x0066
        L_0x01a2:
            boolean r10 = r13.mo44142l(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            long r10 = m36663s(r10, r14)
            r15.mo44059j(r9, r10)
            goto L_0x0066
        L_0x01b3:
            boolean r10 = r13.mo44142l(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            r15.mo44056g(r8, r9)
            goto L_0x0066
        L_0x01ca:
            boolean r10 = r13.mo44142l(r9, r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.lang.Double r8 = (java.lang.Double) r8
            double r10 = r8.doubleValue()
            r15.mo44052c(r9, r10)
            goto L_0x0066
        L_0x01e1:
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            r13.mo44149y(r15, r9, r8, r7)
            goto L_0x0066
        L_0x01ec:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            xg.t r10 = r13.mo44137h(r7)
            com.google.protobuf.C14636z.m36701J(r9, r8, r15, r10)
            goto L_0x0066
        L_0x0201:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36708Q(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0212:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36707P(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0223:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36706O(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0234:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36705N(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0245:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36697F(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0256:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36710S(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0267:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36694C(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0278:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36698G(r9, r8, r15, r4)
            goto L_0x0066
        L_0x0289:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36699H(r9, r8, r15, r4)
            goto L_0x0066
        L_0x029a:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36702K(r9, r8, r15, r4)
            goto L_0x0066
        L_0x02ab:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36711T(r9, r8, r15, r4)
            goto L_0x0066
        L_0x02bc:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36703L(r9, r8, r15, r4)
            goto L_0x0066
        L_0x02cd:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36700I(r9, r8, r15, r4)
            goto L_0x0066
        L_0x02de:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36696E(r9, r8, r15, r4)
            goto L_0x0066
        L_0x02ef:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36708Q(r9, r8, r15, r2)
            goto L_0x0066
        L_0x0300:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36707P(r9, r8, r15, r2)
            goto L_0x0066
        L_0x0311:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36706O(r9, r8, r15, r2)
            goto L_0x0066
        L_0x0322:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36705N(r9, r8, r15, r2)
            goto L_0x0066
        L_0x0333:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36697F(r9, r8, r15, r2)
            goto L_0x0066
        L_0x0344:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36710S(r9, r8, r15, r2)
            goto L_0x0066
        L_0x0355:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36695D(r9, r8, r15)
            goto L_0x0066
        L_0x0366:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            xg.t r10 = r13.mo44137h(r7)
            com.google.protobuf.C14636z.m36704M(r9, r8, r15, r10)
            goto L_0x0066
        L_0x037b:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36709R(r9, r8, r15)
            goto L_0x0066
        L_0x038c:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36694C(r9, r8, r15, r2)
            goto L_0x0066
        L_0x039d:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36698G(r9, r8, r15, r2)
            goto L_0x0066
        L_0x03ae:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36699H(r9, r8, r15, r2)
            goto L_0x0066
        L_0x03bf:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36702K(r9, r8, r15, r2)
            goto L_0x0066
        L_0x03d0:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36711T(r9, r8, r15, r2)
            goto L_0x0066
        L_0x03e1:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36703L(r9, r8, r15, r2)
            goto L_0x0066
        L_0x03f2:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36700I(r9, r8, r15, r2)
            goto L_0x0066
        L_0x0403:
            int[] r9 = r13.f36882a
            r9 = r9[r7]
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36696E(r9, r8, r15, r2)
            goto L_0x0066
        L_0x0414:
            boolean r10 = r13.mo44141k(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            xg.t r10 = r13.mo44137h(r7)
            r15.mo44057h(r9, r10, r8)
            goto L_0x0066
        L_0x0429:
            boolean r10 = r13.mo44141k(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            long r10 = p911xg.C20518x.m48171n(r10, r14)
            r15.mo44065p(r9, r10)
            goto L_0x0066
        L_0x043a:
            boolean r10 = r13.mo44141k(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            int r8 = p911xg.C20518x.m48170m(r10, r14)
            r15.mo44064o(r9, r8)
            goto L_0x0066
        L_0x044b:
            boolean r10 = r13.mo44141k(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            long r10 = p911xg.C20518x.m48171n(r10, r14)
            r15.mo44063n(r9, r10)
            goto L_0x0066
        L_0x045c:
            boolean r10 = r13.mo44141k(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            int r8 = p911xg.C20518x.m48170m(r10, r14)
            r15.mo44062m(r9, r8)
            goto L_0x0066
        L_0x046d:
            boolean r10 = r13.mo44141k(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            int r8 = p911xg.C20518x.m48170m(r10, r14)
            r15.mo44053d(r9, r8)
            goto L_0x0066
        L_0x047e:
            boolean r10 = r13.mo44141k(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            int r8 = p911xg.C20518x.m48170m(r10, r14)
            r15.mo44066q(r9, r8)
            goto L_0x0066
        L_0x048f:
            boolean r10 = r13.mo44141k(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            com.google.protobuf.ByteString r8 = (com.google.protobuf.ByteString) r8
            r15.mo44051b(r9, r8)
            goto L_0x0066
        L_0x04a2:
            boolean r10 = r13.mo44141k(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            xg.t r10 = r13.mo44137h(r7)
            r15.mo44060k(r9, r10, r8)
            goto L_0x0066
        L_0x04b7:
            boolean r10 = r13.mo44141k(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            java.lang.Object r8 = p911xg.C20518x.m48172o(r10, r14)
            m36665z(r9, r8, r15)
            goto L_0x0066
        L_0x04c8:
            boolean r10 = r13.mo44141k(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            boolean r8 = p911xg.C20518x.m48164g(r10, r14)
            r15.mo44050a(r9, r8)
            goto L_0x0066
        L_0x04d9:
            boolean r10 = r13.mo44141k(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            int r8 = p911xg.C20518x.m48170m(r10, r14)
            r15.mo44054e(r9, r8)
            goto L_0x0066
        L_0x04ea:
            boolean r10 = r13.mo44141k(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            long r10 = p911xg.C20518x.m48171n(r10, r14)
            r15.mo44055f(r9, r10)
            goto L_0x0066
        L_0x04fb:
            boolean r10 = r13.mo44141k(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            int r8 = p911xg.C20518x.m48170m(r10, r14)
            r15.mo44058i(r9, r8)
            goto L_0x0066
        L_0x050c:
            boolean r10 = r13.mo44141k(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            long r10 = p911xg.C20518x.m48171n(r10, r14)
            r15.mo44067r(r9, r10)
            goto L_0x0066
        L_0x051d:
            boolean r10 = r13.mo44141k(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            long r10 = p911xg.C20518x.m48171n(r10, r14)
            r15.mo44059j(r9, r10)
            goto L_0x0066
        L_0x052e:
            boolean r10 = r13.mo44141k(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            float r8 = p911xg.C20518x.m48169l(r10, r14)
            r15.mo44056g(r8, r9)
            goto L_0x0066
        L_0x053f:
            boolean r10 = r13.mo44141k(r7, r14)
            if (r10 == 0) goto L_0x0066
            r8 = r8 & r3
            long r10 = (long) r8
            double r10 = p911xg.C20518x.m48168k(r10, r14)
            r15.mo44052c(r9, r10)
            goto L_0x0066
        L_0x0550:
            if (r0 == 0) goto L_0x0a98
            com.google.protobuf.g<?> r14 = r13.f36894m
            r14.mo44073f(r0)
            boolean r14 = r1.hasNext()
            if (r14 == 0) goto L_0x0565
            java.lang.Object r14 = r1.next()
            r0 = r14
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            goto L_0x0550
        L_0x0565:
            r0 = r6
            goto L_0x0550
        L_0x0567:
            boolean r0 = r13.f36886e
            if (r0 == 0) goto L_0x0a95
            boolean r0 = r13.f36885d
            if (r0 == 0) goto L_0x0586
            com.google.protobuf.g<?> r0 = r13.f36894m
            com.google.protobuf.i r0 = r0.mo44069b(r14)
            boolean r1 = r0.mo44079h()
            if (r1 != 0) goto L_0x0586
            java.util.Iterator r0 = r0.mo44082k()
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0588
        L_0x0586:
            r0 = r6
            r1 = r0
        L_0x0588:
            int[] r7 = r13.f36882a
            int r7 = r7.length
            r8 = 0
        L_0x058c:
            if (r8 >= r7) goto L_0x0a75
            int r9 = r13.mo44147w(r8)
            int[] r10 = r13.f36882a
            r10 = r10[r8]
        L_0x0596:
            if (r1 == 0) goto L_0x05b3
            com.google.protobuf.g<?> r11 = r13.f36894m
            r11.mo44068a(r1)
            if (r10 < 0) goto L_0x05b3
            com.google.protobuf.g<?> r11 = r13.f36894m
            r11.mo44073f(r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x05b1
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0596
        L_0x05b1:
            r1 = r6
            goto L_0x0596
        L_0x05b3:
            r11 = r9 & r5
            int r11 = r11 >>> 20
            switch(r11) {
                case 0: goto L_0x0a62;
                case 1: goto L_0x0a52;
                case 2: goto L_0x0a42;
                case 3: goto L_0x0a32;
                case 4: goto L_0x0a22;
                case 5: goto L_0x0a12;
                case 6: goto L_0x0a02;
                case 7: goto L_0x09f1;
                case 8: goto L_0x09e0;
                case 9: goto L_0x09cb;
                case 10: goto L_0x09b8;
                case 11: goto L_0x09a7;
                case 12: goto L_0x0996;
                case 13: goto L_0x0985;
                case 14: goto L_0x0974;
                case 15: goto L_0x0963;
                case 16: goto L_0x0952;
                case 17: goto L_0x093d;
                case 18: goto L_0x092c;
                case 19: goto L_0x091b;
                case 20: goto L_0x090a;
                case 21: goto L_0x08f9;
                case 22: goto L_0x08e8;
                case 23: goto L_0x08d7;
                case 24: goto L_0x08c6;
                case 25: goto L_0x08b5;
                case 26: goto L_0x08a4;
                case 27: goto L_0x088f;
                case 28: goto L_0x087e;
                case 29: goto L_0x086d;
                case 30: goto L_0x085c;
                case 31: goto L_0x084b;
                case 32: goto L_0x083a;
                case 33: goto L_0x0829;
                case 34: goto L_0x0818;
                case 35: goto L_0x0807;
                case 36: goto L_0x07f6;
                case 37: goto L_0x07e5;
                case 38: goto L_0x07d4;
                case 39: goto L_0x07c3;
                case 40: goto L_0x07b2;
                case 41: goto L_0x07a1;
                case 42: goto L_0x0790;
                case 43: goto L_0x077f;
                case 44: goto L_0x076e;
                case 45: goto L_0x075d;
                case 46: goto L_0x074c;
                case 47: goto L_0x073b;
                case 48: goto L_0x072a;
                case 49: goto L_0x0715;
                case 50: goto L_0x070a;
                case 51: goto L_0x06f3;
                case 52: goto L_0x06dc;
                case 53: goto L_0x06cb;
                case 54: goto L_0x06ba;
                case 55: goto L_0x06a9;
                case 56: goto L_0x0698;
                case 57: goto L_0x0687;
                case 58: goto L_0x0670;
                case 59: goto L_0x065f;
                case 60: goto L_0x064a;
                case 61: goto L_0x0637;
                case 62: goto L_0x0626;
                case 63: goto L_0x0615;
                case 64: goto L_0x0604;
                case 65: goto L_0x05f3;
                case 66: goto L_0x05e2;
                case 67: goto L_0x05d1;
                case 68: goto L_0x05bc;
                default: goto L_0x05ba;
            }
        L_0x05ba:
            goto L_0x0a71
        L_0x05bc:
            boolean r11 = r13.mo44142l(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            xg.t r11 = r13.mo44137h(r8)
            r15.mo44057h(r10, r11, r9)
            goto L_0x0a71
        L_0x05d1:
            boolean r11 = r13.mo44142l(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            long r11 = m36663s(r11, r14)
            r15.mo44065p(r10, r11)
            goto L_0x0a71
        L_0x05e2:
            boolean r11 = r13.mo44142l(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            int r9 = m36662r(r11, r14)
            r15.mo44064o(r10, r9)
            goto L_0x0a71
        L_0x05f3:
            boolean r11 = r13.mo44142l(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            long r11 = m36663s(r11, r14)
            r15.mo44063n(r10, r11)
            goto L_0x0a71
        L_0x0604:
            boolean r11 = r13.mo44142l(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            int r9 = m36662r(r11, r14)
            r15.mo44062m(r10, r9)
            goto L_0x0a71
        L_0x0615:
            boolean r11 = r13.mo44142l(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            int r9 = m36662r(r11, r14)
            r15.mo44053d(r10, r9)
            goto L_0x0a71
        L_0x0626:
            boolean r11 = r13.mo44142l(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            int r9 = m36662r(r11, r14)
            r15.mo44066q(r10, r9)
            goto L_0x0a71
        L_0x0637:
            boolean r11 = r13.mo44142l(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            com.google.protobuf.ByteString r9 = (com.google.protobuf.ByteString) r9
            r15.mo44051b(r10, r9)
            goto L_0x0a71
        L_0x064a:
            boolean r11 = r13.mo44142l(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            xg.t r11 = r13.mo44137h(r8)
            r15.mo44060k(r10, r11, r9)
            goto L_0x0a71
        L_0x065f:
            boolean r11 = r13.mo44142l(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            m36665z(r10, r9, r15)
            goto L_0x0a71
        L_0x0670:
            boolean r11 = r13.mo44142l(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r15.mo44050a(r10, r9)
            goto L_0x0a71
        L_0x0687:
            boolean r11 = r13.mo44142l(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            int r9 = m36662r(r11, r14)
            r15.mo44054e(r10, r9)
            goto L_0x0a71
        L_0x0698:
            boolean r11 = r13.mo44142l(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            long r11 = m36663s(r11, r14)
            r15.mo44055f(r10, r11)
            goto L_0x0a71
        L_0x06a9:
            boolean r11 = r13.mo44142l(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            int r9 = m36662r(r11, r14)
            r15.mo44058i(r10, r9)
            goto L_0x0a71
        L_0x06ba:
            boolean r11 = r13.mo44142l(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            long r11 = m36663s(r11, r14)
            r15.mo44067r(r10, r11)
            goto L_0x0a71
        L_0x06cb:
            boolean r11 = r13.mo44142l(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            long r11 = m36663s(r11, r14)
            r15.mo44059j(r10, r11)
            goto L_0x0a71
        L_0x06dc:
            boolean r11 = r13.mo44142l(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            r15.mo44056g(r9, r10)
            goto L_0x0a71
        L_0x06f3:
            boolean r11 = r13.mo44142l(r10, r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.lang.Double r9 = (java.lang.Double) r9
            double r11 = r9.doubleValue()
            r15.mo44052c(r10, r11)
            goto L_0x0a71
        L_0x070a:
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            r13.mo44149y(r15, r10, r9, r8)
            goto L_0x0a71
        L_0x0715:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            xg.t r11 = r13.mo44137h(r8)
            com.google.protobuf.C14636z.m36701J(r10, r9, r15, r11)
            goto L_0x0a71
        L_0x072a:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36708Q(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x073b:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36707P(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x074c:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36706O(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x075d:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36705N(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x076e:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36697F(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x077f:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36710S(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x0790:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36694C(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x07a1:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36698G(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x07b2:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36699H(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x07c3:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36702K(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x07d4:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36711T(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x07e5:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36703L(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x07f6:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36700I(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x0807:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36696E(r10, r9, r15, r4)
            goto L_0x0a71
        L_0x0818:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36708Q(r10, r9, r15, r2)
            goto L_0x0a71
        L_0x0829:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36707P(r10, r9, r15, r2)
            goto L_0x0a71
        L_0x083a:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36706O(r10, r9, r15, r2)
            goto L_0x0a71
        L_0x084b:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36705N(r10, r9, r15, r2)
            goto L_0x0a71
        L_0x085c:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36697F(r10, r9, r15, r2)
            goto L_0x0a71
        L_0x086d:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36710S(r10, r9, r15, r2)
            goto L_0x0a71
        L_0x087e:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36695D(r10, r9, r15)
            goto L_0x0a71
        L_0x088f:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            xg.t r11 = r13.mo44137h(r8)
            com.google.protobuf.C14636z.m36704M(r10, r9, r15, r11)
            goto L_0x0a71
        L_0x08a4:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36709R(r10, r9, r15)
            goto L_0x0a71
        L_0x08b5:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36694C(r10, r9, r15, r2)
            goto L_0x0a71
        L_0x08c6:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36698G(r10, r9, r15, r2)
            goto L_0x0a71
        L_0x08d7:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36699H(r10, r9, r15, r2)
            goto L_0x0a71
        L_0x08e8:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36702K(r10, r9, r15, r2)
            goto L_0x0a71
        L_0x08f9:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36711T(r10, r9, r15, r2)
            goto L_0x0a71
        L_0x090a:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36703L(r10, r9, r15, r2)
            goto L_0x0a71
        L_0x091b:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36700I(r10, r9, r15, r2)
            goto L_0x0a71
        L_0x092c:
            int[] r10 = r13.f36882a
            r10 = r10[r8]
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            java.util.List r9 = (java.util.List) r9
            com.google.protobuf.C14636z.m36696E(r10, r9, r15, r2)
            goto L_0x0a71
        L_0x093d:
            boolean r11 = r13.mo44141k(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            xg.t r11 = r13.mo44137h(r8)
            r15.mo44057h(r10, r11, r9)
            goto L_0x0a71
        L_0x0952:
            boolean r11 = r13.mo44141k(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            long r11 = p911xg.C20518x.m48171n(r11, r14)
            r15.mo44065p(r10, r11)
            goto L_0x0a71
        L_0x0963:
            boolean r11 = r13.mo44141k(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            int r9 = p911xg.C20518x.m48170m(r11, r14)
            r15.mo44064o(r10, r9)
            goto L_0x0a71
        L_0x0974:
            boolean r11 = r13.mo44141k(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            long r11 = p911xg.C20518x.m48171n(r11, r14)
            r15.mo44063n(r10, r11)
            goto L_0x0a71
        L_0x0985:
            boolean r11 = r13.mo44141k(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            int r9 = p911xg.C20518x.m48170m(r11, r14)
            r15.mo44062m(r10, r9)
            goto L_0x0a71
        L_0x0996:
            boolean r11 = r13.mo44141k(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            int r9 = p911xg.C20518x.m48170m(r11, r14)
            r15.mo44053d(r10, r9)
            goto L_0x0a71
        L_0x09a7:
            boolean r11 = r13.mo44141k(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            int r9 = p911xg.C20518x.m48170m(r11, r14)
            r15.mo44066q(r10, r9)
            goto L_0x0a71
        L_0x09b8:
            boolean r11 = r13.mo44141k(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            com.google.protobuf.ByteString r9 = (com.google.protobuf.ByteString) r9
            r15.mo44051b(r10, r9)
            goto L_0x0a71
        L_0x09cb:
            boolean r11 = r13.mo44141k(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            xg.t r11 = r13.mo44137h(r8)
            r15.mo44060k(r10, r11, r9)
            goto L_0x0a71
        L_0x09e0:
            boolean r11 = r13.mo44141k(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            java.lang.Object r9 = p911xg.C20518x.m48172o(r11, r14)
            m36665z(r10, r9, r15)
            goto L_0x0a71
        L_0x09f1:
            boolean r11 = r13.mo44141k(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            boolean r9 = p911xg.C20518x.m48164g(r11, r14)
            r15.mo44050a(r10, r9)
            goto L_0x0a71
        L_0x0a02:
            boolean r11 = r13.mo44141k(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            int r9 = p911xg.C20518x.m48170m(r11, r14)
            r15.mo44054e(r10, r9)
            goto L_0x0a71
        L_0x0a12:
            boolean r11 = r13.mo44141k(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            long r11 = p911xg.C20518x.m48171n(r11, r14)
            r15.mo44055f(r10, r11)
            goto L_0x0a71
        L_0x0a22:
            boolean r11 = r13.mo44141k(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            int r9 = p911xg.C20518x.m48170m(r11, r14)
            r15.mo44058i(r10, r9)
            goto L_0x0a71
        L_0x0a32:
            boolean r11 = r13.mo44141k(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            long r11 = p911xg.C20518x.m48171n(r11, r14)
            r15.mo44067r(r10, r11)
            goto L_0x0a71
        L_0x0a42:
            boolean r11 = r13.mo44141k(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            long r11 = p911xg.C20518x.m48171n(r11, r14)
            r15.mo44059j(r10, r11)
            goto L_0x0a71
        L_0x0a52:
            boolean r11 = r13.mo44141k(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            float r9 = p911xg.C20518x.m48169l(r11, r14)
            r15.mo44056g(r9, r10)
            goto L_0x0a71
        L_0x0a62:
            boolean r11 = r13.mo44141k(r8, r14)
            if (r11 == 0) goto L_0x0a71
            r9 = r9 & r3
            long r11 = (long) r9
            double r11 = p911xg.C20518x.m48168k(r11, r14)
            r15.mo44052c(r10, r11)
        L_0x0a71:
            int r8 = r8 + 3
            goto L_0x058c
        L_0x0a75:
            if (r1 == 0) goto L_0x0a8b
            com.google.protobuf.g<?> r2 = r13.f36894m
            r2.mo44073f(r1)
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0a89
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            goto L_0x0a75
        L_0x0a89:
            r1 = r6
            goto L_0x0a75
        L_0x0a8b:
            com.google.protobuf.c0<?, ?> r0 = r13.f36893l
            com.google.protobuf.d0 r14 = r0.mo44037a(r14)
            r0.mo44044h(r14, r15)
            goto L_0x0a98
        L_0x0a95:
            r13.mo44148x(r14, r15)
        L_0x0a98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C14632v.mo44133e(java.lang.Object, com.google.protobuf.f):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
        if (com.google.protobuf.C14636z.m36693B(p911xg.C20518x.m48172o(r6, r10), p911xg.C20518x.m48172o(r6, r11)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0071, code lost:
        if (com.google.protobuf.C14636z.m36693B(p911xg.C20518x.m48172o(r6, r10), p911xg.C20518x.m48172o(r6, r11)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0085, code lost:
        if (p911xg.C20518x.m48171n(r6, r10) == p911xg.C20518x.m48171n(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0097, code lost:
        if (p911xg.C20518x.m48170m(r6, r10) == p911xg.C20518x.m48170m(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ab, code lost:
        if (p911xg.C20518x.m48171n(r6, r10) == p911xg.C20518x.m48171n(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00bd, code lost:
        if (p911xg.C20518x.m48170m(r6, r10) == p911xg.C20518x.m48170m(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cf, code lost:
        if (p911xg.C20518x.m48170m(r6, r10) == p911xg.C20518x.m48170m(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e1, code lost:
        if (p911xg.C20518x.m48170m(r6, r10) == p911xg.C20518x.m48170m(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f7, code lost:
        if (com.google.protobuf.C14636z.m36693B(p911xg.C20518x.m48172o(r6, r10), p911xg.C20518x.m48172o(r6, r11)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x010d, code lost:
        if (com.google.protobuf.C14636z.m36693B(p911xg.C20518x.m48172o(r6, r10), p911xg.C20518x.m48172o(r6, r11)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0123, code lost:
        if (com.google.protobuf.C14636z.m36693B(p911xg.C20518x.m48172o(r6, r10), p911xg.C20518x.m48172o(r6, r11)) != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0135, code lost:
        if (p911xg.C20518x.m48164g(r6, r10) == p911xg.C20518x.m48164g(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0147, code lost:
        if (p911xg.C20518x.m48170m(r6, r10) == p911xg.C20518x.m48170m(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x015b, code lost:
        if (p911xg.C20518x.m48171n(r6, r10) == p911xg.C20518x.m48171n(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x016d, code lost:
        if (p911xg.C20518x.m48170m(r6, r10) == p911xg.C20518x.m48170m(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0180, code lost:
        if (p911xg.C20518x.m48171n(r6, r10) == p911xg.C20518x.m48171n(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0193, code lost:
        if (p911xg.C20518x.m48171n(r6, r10) == p911xg.C20518x.m48171n(r6, r11)) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ac, code lost:
        if (java.lang.Float.floatToIntBits(p911xg.C20518x.m48169l(r6, r10)) == java.lang.Float.floatToIntBits(p911xg.C20518x.m48169l(r6, r11))) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01c7, code lost:
        if (java.lang.Double.doubleToLongBits(p911xg.C20518x.m48168k(r6, r10)) == java.lang.Double.doubleToLongBits(p911xg.C20518x.m48168k(r6, r11))) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01ca, code lost:
        r3 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f36882a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x01d2
            int r4 = r9.mo44147w(r2)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r4 & r5
            long r6 = (long) r6
            r8 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r8
            int r4 = r4 >>> 20
            switch(r4) {
                case 0: goto L_0x01af;
                case 1: goto L_0x0196;
                case 2: goto L_0x0183;
                case 3: goto L_0x0170;
                case 4: goto L_0x015f;
                case 5: goto L_0x014b;
                case 6: goto L_0x0139;
                case 7: goto L_0x0127;
                case 8: goto L_0x0111;
                case 9: goto L_0x00fb;
                case 10: goto L_0x00e5;
                case 11: goto L_0x00d3;
                case 12: goto L_0x00c1;
                case 13: goto L_0x00af;
                case 14: goto L_0x009b;
                case 15: goto L_0x0089;
                case 16: goto L_0x0075;
                case 17: goto L_0x005f;
                case 18: goto L_0x0051;
                case 19: goto L_0x0051;
                case 20: goto L_0x0051;
                case 21: goto L_0x0051;
                case 22: goto L_0x0051;
                case 23: goto L_0x0051;
                case 24: goto L_0x0051;
                case 25: goto L_0x0051;
                case 26: goto L_0x0051;
                case 27: goto L_0x0051;
                case 28: goto L_0x0051;
                case 29: goto L_0x0051;
                case 30: goto L_0x0051;
                case 31: goto L_0x0051;
                case 32: goto L_0x0051;
                case 33: goto L_0x0051;
                case 34: goto L_0x0051;
                case 35: goto L_0x0051;
                case 36: goto L_0x0051;
                case 37: goto L_0x0051;
                case 38: goto L_0x0051;
                case 39: goto L_0x0051;
                case 40: goto L_0x0051;
                case 41: goto L_0x0051;
                case 42: goto L_0x0051;
                case 43: goto L_0x0051;
                case 44: goto L_0x0051;
                case 45: goto L_0x0051;
                case 46: goto L_0x0051;
                case 47: goto L_0x0051;
                case 48: goto L_0x0051;
                case 49: goto L_0x0051;
                case 50: goto L_0x0043;
                case 51: goto L_0x001c;
                case 52: goto L_0x001c;
                case 53: goto L_0x001c;
                case 54: goto L_0x001c;
                case 55: goto L_0x001c;
                case 56: goto L_0x001c;
                case 57: goto L_0x001c;
                case 58: goto L_0x001c;
                case 59: goto L_0x001c;
                case 60: goto L_0x001c;
                case 61: goto L_0x001c;
                case 62: goto L_0x001c;
                case 63: goto L_0x001c;
                case 64: goto L_0x001c;
                case 65: goto L_0x001c;
                case 66: goto L_0x001c;
                case 67: goto L_0x001c;
                case 68: goto L_0x001c;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x01cb
        L_0x001c:
            int[] r4 = r9.f36882a
            int r8 = r2 + 2
            r4 = r4[r8]
            r4 = r4 & r5
            long r4 = (long) r4
            int r8 = p911xg.C20518x.m48170m(r4, r10)
            int r4 = p911xg.C20518x.m48170m(r4, r11)
            if (r8 != r4) goto L_0x0030
            r4 = 1
            goto L_0x0031
        L_0x0030:
            r4 = 0
        L_0x0031:
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = p911xg.C20518x.m48172o(r6, r10)
            java.lang.Object r5 = p911xg.C20518x.m48172o(r6, r11)
            boolean r4 = com.google.protobuf.C14636z.m36693B(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0043:
            java.lang.Object r3 = p911xg.C20518x.m48172o(r6, r10)
            java.lang.Object r4 = p911xg.C20518x.m48172o(r6, r11)
            boolean r3 = com.google.protobuf.C14636z.m36693B(r3, r4)
            goto L_0x01cb
        L_0x0051:
            java.lang.Object r3 = p911xg.C20518x.m48172o(r6, r10)
            java.lang.Object r4 = p911xg.C20518x.m48172o(r6, r11)
            boolean r3 = com.google.protobuf.C14636z.m36693B(r3, r4)
            goto L_0x01cb
        L_0x005f:
            boolean r4 = r9.mo44135f(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = p911xg.C20518x.m48172o(r6, r10)
            java.lang.Object r5 = p911xg.C20518x.m48172o(r6, r11)
            boolean r4 = com.google.protobuf.C14636z.m36693B(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0075:
            boolean r4 = r9.mo44135f(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = p911xg.C20518x.m48171n(r6, r10)
            long r6 = p911xg.C20518x.m48171n(r6, r11)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0089:
            boolean r4 = r9.mo44135f(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = p911xg.C20518x.m48170m(r6, r10)
            int r5 = p911xg.C20518x.m48170m(r6, r11)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x009b:
            boolean r4 = r9.mo44135f(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = p911xg.C20518x.m48171n(r6, r10)
            long r6 = p911xg.C20518x.m48171n(r6, r11)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x00af:
            boolean r4 = r9.mo44135f(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = p911xg.C20518x.m48170m(r6, r10)
            int r5 = p911xg.C20518x.m48170m(r6, r11)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x00c1:
            boolean r4 = r9.mo44135f(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = p911xg.C20518x.m48170m(r6, r10)
            int r5 = p911xg.C20518x.m48170m(r6, r11)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x00d3:
            boolean r4 = r9.mo44135f(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = p911xg.C20518x.m48170m(r6, r10)
            int r5 = p911xg.C20518x.m48170m(r6, r11)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x00e5:
            boolean r4 = r9.mo44135f(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = p911xg.C20518x.m48172o(r6, r10)
            java.lang.Object r5 = p911xg.C20518x.m48172o(r6, r11)
            boolean r4 = com.google.protobuf.C14636z.m36693B(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x00fb:
            boolean r4 = r9.mo44135f(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = p911xg.C20518x.m48172o(r6, r10)
            java.lang.Object r5 = p911xg.C20518x.m48172o(r6, r11)
            boolean r4 = com.google.protobuf.C14636z.m36693B(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0111:
            boolean r4 = r9.mo44135f(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            java.lang.Object r4 = p911xg.C20518x.m48172o(r6, r10)
            java.lang.Object r5 = p911xg.C20518x.m48172o(r6, r11)
            boolean r4 = com.google.protobuf.C14636z.m36693B(r4, r5)
            if (r4 == 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0127:
            boolean r4 = r9.mo44135f(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            boolean r4 = p911xg.C20518x.m48164g(r6, r10)
            boolean r5 = p911xg.C20518x.m48164g(r6, r11)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x0139:
            boolean r4 = r9.mo44135f(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = p911xg.C20518x.m48170m(r6, r10)
            int r5 = p911xg.C20518x.m48170m(r6, r11)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x014b:
            boolean r4 = r9.mo44135f(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = p911xg.C20518x.m48171n(r6, r10)
            long r6 = p911xg.C20518x.m48171n(r6, r11)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x015f:
            boolean r4 = r9.mo44135f(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            int r4 = p911xg.C20518x.m48170m(r6, r10)
            int r5 = p911xg.C20518x.m48170m(r6, r11)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x0170:
            boolean r4 = r9.mo44135f(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = p911xg.C20518x.m48171n(r6, r10)
            long r6 = p911xg.C20518x.m48171n(r6, r11)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0183:
            boolean r4 = r9.mo44135f(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            long r4 = p911xg.C20518x.m48171n(r6, r10)
            long r6 = p911xg.C20518x.m48171n(r6, r11)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x0196:
            boolean r4 = r9.mo44135f(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            float r4 = p911xg.C20518x.m48169l(r6, r10)
            int r4 = java.lang.Float.floatToIntBits(r4)
            float r5 = p911xg.C20518x.m48169l(r6, r11)
            int r5 = java.lang.Float.floatToIntBits(r5)
            if (r4 != r5) goto L_0x01ca
            goto L_0x01cb
        L_0x01af:
            boolean r4 = r9.mo44135f(r2, r10, r11)
            if (r4 == 0) goto L_0x01ca
            double r4 = p911xg.C20518x.m48168k(r6, r10)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            double r6 = p911xg.C20518x.m48168k(r6, r11)
            long r6 = java.lang.Double.doubleToLongBits(r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x01ca
            goto L_0x01cb
        L_0x01ca:
            r3 = 0
        L_0x01cb:
            if (r3 != 0) goto L_0x01ce
            return r1
        L_0x01ce:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x01d2:
            com.google.protobuf.c0<?, ?> r0 = r9.f36893l
            com.google.protobuf.d0 r0 = r0.mo44037a(r10)
            com.google.protobuf.c0<?, ?> r2 = r9.f36893l
            com.google.protobuf.d0 r2 = r2.mo44037a(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x01e5
            return r1
        L_0x01e5:
            boolean r0 = r9.f36885d
            if (r0 == 0) goto L_0x01fa
            com.google.protobuf.g<?> r0 = r9.f36894m
            com.google.protobuf.i r10 = r0.mo44069b(r10)
            com.google.protobuf.g<?> r0 = r9.f36894m
            com.google.protobuf.i r11 = r0.mo44069b(r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x01fa:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C14632v.equals(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final boolean mo44135f(int i, Object obj, Object obj2) {
        return mo44141k(i, obj) == mo44141k(i, obj2);
    }

    /* renamed from: g */
    public final Object mo44136g(int i) {
        return this.f36883b[(i / 3) * 2];
    }

    /* renamed from: h */
    public final C20512t mo44137h(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f36883b;
        C20512t tVar = (C20512t) objArr[i2];
        if (tVar != null) {
            return tVar;
        }
        C20512t a = C20510r.f51897c.mo52690a((Class) objArr[i2 + 1]);
        this.f36883b[i2] = a;
        return a;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00de, code lost:
        if (r3 != false) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01d9, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01f3, code lost:
        if (r3 != false) goto L_0x01f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01f6, code lost:
        r8 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01f8, code lost:
        r3 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0242, code lost:
        r2 = r3 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0244, code lost:
        r1 = r1 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode(T r11) {
        /*
            r10 = this;
            int[] r0 = r10.f36882a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x0248
            int r3 = r10.mo44147w(r1)
            int[] r4 = r10.f36882a
            r4 = r4[r1]
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r5 = r5 & r3
            long r5 = (long) r5
            r7 = 267386880(0xff00000, float:2.3665827E-29)
            r3 = r3 & r7
            int r3 = r3 >>> 20
            r7 = 37
            r8 = 1231(0x4cf, float:1.725E-42)
            r9 = 1237(0x4d5, float:1.733E-42)
            switch(r3) {
                case 0: goto L_0x0234;
                case 1: goto L_0x0229;
                case 2: goto L_0x021e;
                case 3: goto L_0x0213;
                case 4: goto L_0x020c;
                case 5: goto L_0x0201;
                case 6: goto L_0x01fa;
                case 7: goto L_0x01eb;
                case 8: goto L_0x01de;
                case 9: goto L_0x01cf;
                case 10: goto L_0x01c3;
                case 11: goto L_0x01bb;
                case 12: goto L_0x01b3;
                case 13: goto L_0x01ab;
                case 14: goto L_0x019f;
                case 15: goto L_0x0197;
                case 16: goto L_0x018b;
                case 17: goto L_0x0180;
                case 18: goto L_0x0174;
                case 19: goto L_0x0174;
                case 20: goto L_0x0174;
                case 21: goto L_0x0174;
                case 22: goto L_0x0174;
                case 23: goto L_0x0174;
                case 24: goto L_0x0174;
                case 25: goto L_0x0174;
                case 26: goto L_0x0174;
                case 27: goto L_0x0174;
                case 28: goto L_0x0174;
                case 29: goto L_0x0174;
                case 30: goto L_0x0174;
                case 31: goto L_0x0174;
                case 32: goto L_0x0174;
                case 33: goto L_0x0174;
                case 34: goto L_0x0174;
                case 35: goto L_0x0174;
                case 36: goto L_0x0174;
                case 37: goto L_0x0174;
                case 38: goto L_0x0174;
                case 39: goto L_0x0174;
                case 40: goto L_0x0174;
                case 41: goto L_0x0174;
                case 42: goto L_0x0174;
                case 43: goto L_0x0174;
                case 44: goto L_0x0174;
                case 45: goto L_0x0174;
                case 46: goto L_0x0174;
                case 47: goto L_0x0174;
                case 48: goto L_0x0174;
                case 49: goto L_0x0174;
                case 50: goto L_0x0168;
                case 51: goto L_0x014c;
                case 52: goto L_0x0134;
                case 53: goto L_0x0122;
                case 54: goto L_0x0110;
                case 55: goto L_0x0102;
                case 56: goto L_0x00f0;
                case 57: goto L_0x00e2;
                case 58: goto L_0x00ca;
                case 59: goto L_0x00b6;
                case 60: goto L_0x00a4;
                case 61: goto L_0x0092;
                case 62: goto L_0x0084;
                case 63: goto L_0x0076;
                case 64: goto L_0x0068;
                case 65: goto L_0x0056;
                case 66: goto L_0x0048;
                case 67: goto L_0x0036;
                case 68: goto L_0x0024;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x0244
        L_0x0024:
            boolean r3 = r10.mo44142l(r4, r1, r11)
            if (r3 == 0) goto L_0x0244
            java.lang.Object r3 = p911xg.C20518x.m48172o(r5, r11)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0242
        L_0x0036:
            boolean r3 = r10.mo44142l(r4, r1, r11)
            if (r3 == 0) goto L_0x0244
            int r2 = r2 * 53
            long r3 = m36663s(r5, r11)
            int r3 = com.google.protobuf.C14610k.m36622a(r3)
            goto L_0x0242
        L_0x0048:
            boolean r3 = r10.mo44142l(r4, r1, r11)
            if (r3 == 0) goto L_0x0244
            int r2 = r2 * 53
            int r3 = m36662r(r5, r11)
            goto L_0x0242
        L_0x0056:
            boolean r3 = r10.mo44142l(r4, r1, r11)
            if (r3 == 0) goto L_0x0244
            int r2 = r2 * 53
            long r3 = m36663s(r5, r11)
            int r3 = com.google.protobuf.C14610k.m36622a(r3)
            goto L_0x0242
        L_0x0068:
            boolean r3 = r10.mo44142l(r4, r1, r11)
            if (r3 == 0) goto L_0x0244
            int r2 = r2 * 53
            int r3 = m36662r(r5, r11)
            goto L_0x0242
        L_0x0076:
            boolean r3 = r10.mo44142l(r4, r1, r11)
            if (r3 == 0) goto L_0x0244
            int r2 = r2 * 53
            int r3 = m36662r(r5, r11)
            goto L_0x0242
        L_0x0084:
            boolean r3 = r10.mo44142l(r4, r1, r11)
            if (r3 == 0) goto L_0x0244
            int r2 = r2 * 53
            int r3 = m36662r(r5, r11)
            goto L_0x0242
        L_0x0092:
            boolean r3 = r10.mo44142l(r4, r1, r11)
            if (r3 == 0) goto L_0x0244
            int r2 = r2 * 53
            java.lang.Object r3 = p911xg.C20518x.m48172o(r5, r11)
            int r3 = r3.hashCode()
            goto L_0x0242
        L_0x00a4:
            boolean r3 = r10.mo44142l(r4, r1, r11)
            if (r3 == 0) goto L_0x0244
            java.lang.Object r3 = p911xg.C20518x.m48172o(r5, r11)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0242
        L_0x00b6:
            boolean r3 = r10.mo44142l(r4, r1, r11)
            if (r3 == 0) goto L_0x0244
            int r2 = r2 * 53
            java.lang.Object r3 = p911xg.C20518x.m48172o(r5, r11)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0242
        L_0x00ca:
            boolean r3 = r10.mo44142l(r4, r1, r11)
            if (r3 == 0) goto L_0x0244
            int r2 = r2 * 53
            java.lang.Object r3 = p911xg.C20518x.m48172o(r5, r11)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.nio.charset.Charset r4 = com.google.protobuf.C14610k.f36861a
            if (r3 == 0) goto L_0x01f6
            goto L_0x01f8
        L_0x00e2:
            boolean r3 = r10.mo44142l(r4, r1, r11)
            if (r3 == 0) goto L_0x0244
            int r2 = r2 * 53
            int r3 = m36662r(r5, r11)
            goto L_0x0242
        L_0x00f0:
            boolean r3 = r10.mo44142l(r4, r1, r11)
            if (r3 == 0) goto L_0x0244
            int r2 = r2 * 53
            long r3 = m36663s(r5, r11)
            int r3 = com.google.protobuf.C14610k.m36622a(r3)
            goto L_0x0242
        L_0x0102:
            boolean r3 = r10.mo44142l(r4, r1, r11)
            if (r3 == 0) goto L_0x0244
            int r2 = r2 * 53
            int r3 = m36662r(r5, r11)
            goto L_0x0242
        L_0x0110:
            boolean r3 = r10.mo44142l(r4, r1, r11)
            if (r3 == 0) goto L_0x0244
            int r2 = r2 * 53
            long r3 = m36663s(r5, r11)
            int r3 = com.google.protobuf.C14610k.m36622a(r3)
            goto L_0x0242
        L_0x0122:
            boolean r3 = r10.mo44142l(r4, r1, r11)
            if (r3 == 0) goto L_0x0244
            int r2 = r2 * 53
            long r3 = m36663s(r5, r11)
            int r3 = com.google.protobuf.C14610k.m36622a(r3)
            goto L_0x0242
        L_0x0134:
            boolean r3 = r10.mo44142l(r4, r1, r11)
            if (r3 == 0) goto L_0x0244
            int r2 = r2 * 53
            java.lang.Object r3 = p911xg.C20518x.m48172o(r5, r11)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0242
        L_0x014c:
            boolean r3 = r10.mo44142l(r4, r1, r11)
            if (r3 == 0) goto L_0x0244
            int r2 = r2 * 53
            java.lang.Object r3 = p911xg.C20518x.m48172o(r5, r11)
            java.lang.Double r3 = (java.lang.Double) r3
            double r3 = r3.doubleValue()
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.C14610k.m36622a(r3)
            goto L_0x0242
        L_0x0168:
            int r2 = r2 * 53
            java.lang.Object r3 = p911xg.C20518x.m48172o(r5, r11)
            int r3 = r3.hashCode()
            goto L_0x0242
        L_0x0174:
            int r2 = r2 * 53
            java.lang.Object r3 = p911xg.C20518x.m48172o(r5, r11)
            int r3 = r3.hashCode()
            goto L_0x0242
        L_0x0180:
            java.lang.Object r3 = p911xg.C20518x.m48172o(r5, r11)
            if (r3 == 0) goto L_0x01d9
            int r7 = r3.hashCode()
            goto L_0x01d9
        L_0x018b:
            int r2 = r2 * 53
            long r3 = p911xg.C20518x.m48171n(r5, r11)
            int r3 = com.google.protobuf.C14610k.m36622a(r3)
            goto L_0x0242
        L_0x0197:
            int r2 = r2 * 53
            int r3 = p911xg.C20518x.m48170m(r5, r11)
            goto L_0x0242
        L_0x019f:
            int r2 = r2 * 53
            long r3 = p911xg.C20518x.m48171n(r5, r11)
            int r3 = com.google.protobuf.C14610k.m36622a(r3)
            goto L_0x0242
        L_0x01ab:
            int r2 = r2 * 53
            int r3 = p911xg.C20518x.m48170m(r5, r11)
            goto L_0x0242
        L_0x01b3:
            int r2 = r2 * 53
            int r3 = p911xg.C20518x.m48170m(r5, r11)
            goto L_0x0242
        L_0x01bb:
            int r2 = r2 * 53
            int r3 = p911xg.C20518x.m48170m(r5, r11)
            goto L_0x0242
        L_0x01c3:
            int r2 = r2 * 53
            java.lang.Object r3 = p911xg.C20518x.m48172o(r5, r11)
            int r3 = r3.hashCode()
            goto L_0x0242
        L_0x01cf:
            java.lang.Object r3 = p911xg.C20518x.m48172o(r5, r11)
            if (r3 == 0) goto L_0x01d9
            int r7 = r3.hashCode()
        L_0x01d9:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0244
        L_0x01de:
            int r2 = r2 * 53
            java.lang.Object r3 = p911xg.C20518x.m48172o(r5, r11)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0242
        L_0x01eb:
            int r2 = r2 * 53
            boolean r3 = p911xg.C20518x.m48164g(r5, r11)
            java.nio.charset.Charset r4 = com.google.protobuf.C14610k.f36861a
            if (r3 == 0) goto L_0x01f6
            goto L_0x01f8
        L_0x01f6:
            r8 = 1237(0x4d5, float:1.733E-42)
        L_0x01f8:
            r3 = r8
            goto L_0x0242
        L_0x01fa:
            int r2 = r2 * 53
            int r3 = p911xg.C20518x.m48170m(r5, r11)
            goto L_0x0242
        L_0x0201:
            int r2 = r2 * 53
            long r3 = p911xg.C20518x.m48171n(r5, r11)
            int r3 = com.google.protobuf.C14610k.m36622a(r3)
            goto L_0x0242
        L_0x020c:
            int r2 = r2 * 53
            int r3 = p911xg.C20518x.m48170m(r5, r11)
            goto L_0x0242
        L_0x0213:
            int r2 = r2 * 53
            long r3 = p911xg.C20518x.m48171n(r5, r11)
            int r3 = com.google.protobuf.C14610k.m36622a(r3)
            goto L_0x0242
        L_0x021e:
            int r2 = r2 * 53
            long r3 = p911xg.C20518x.m48171n(r5, r11)
            int r3 = com.google.protobuf.C14610k.m36622a(r3)
            goto L_0x0242
        L_0x0229:
            int r2 = r2 * 53
            float r3 = p911xg.C20518x.m48169l(r5, r11)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0242
        L_0x0234:
            int r2 = r2 * 53
            double r3 = p911xg.C20518x.m48168k(r5, r11)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.google.protobuf.C14610k.m36622a(r3)
        L_0x0242:
            int r3 = r3 + r2
            r2 = r3
        L_0x0244:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x0248:
            int r2 = r2 * 53
            com.google.protobuf.c0<?, ?> r0 = r10.f36893l
            com.google.protobuf.d0 r0 = r0.mo44037a(r11)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r10.f36885d
            if (r1 == 0) goto L_0x0266
            int r0 = r0 * 53
            com.google.protobuf.g<?> r1 = r10.f36894m
            com.google.protobuf.i r11 = r1.mo44069b(r11)
            int r11 = r11.hashCode()
            int r0 = r0 + r11
        L_0x0266:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C14632v.hashCode(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0337, code lost:
        r3 = p379.C16530d.m42011d(r7, r6, r1, r3);
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo44139i(T r15) {
        /*
            r14 = this;
            sun.misc.Unsafe r0 = f36881p
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = 0
            r3 = 0
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r5 = 0
        L_0x000b:
            int[] r6 = r14.f36882a
            int r6 = r6.length
            if (r2 >= r6) goto L_0x0505
            int r6 = r14.mo44147w(r2)
            int[] r7 = r14.f36882a
            r8 = r7[r2]
            r9 = 267386880(0xff00000, float:2.3665827E-29)
            r9 = r9 & r6
            int r9 = r9 >>> 20
            r10 = 17
            r11 = 1
            if (r9 > r10) goto L_0x0035
            int r10 = r2 + 2
            r7 = r7[r10]
            r10 = r7 & r1
            int r12 = r7 >>> 20
            int r11 = r11 << r12
            if (r10 == r4) goto L_0x0053
            long r4 = (long) r10
            int r4 = r0.getInt(r15, r4)
            r5 = r4
            r4 = r10
            goto L_0x0053
        L_0x0035:
            boolean r7 = r14.f36887f
            if (r7 == 0) goto L_0x0051
            com.google.protobuf.FieldType r7 = com.google.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r7 = r7.mo43934id()
            if (r9 < r7) goto L_0x0051
            com.google.protobuf.FieldType r7 = com.google.protobuf.FieldType.SINT64_LIST_PACKED
            int r7 = r7.mo43934id()
            if (r9 > r7) goto L_0x0051
            int[] r7 = r14.f36882a
            int r10 = r2 + 2
            r7 = r7[r10]
            r7 = r7 & r1
            goto L_0x0052
        L_0x0051:
            r7 = 0
        L_0x0052:
            r11 = 0
        L_0x0053:
            r1 = r1 & r6
            long r12 = (long) r1
            switch(r9) {
                case 0: goto L_0x04f5;
                case 1: goto L_0x04ec;
                case 2: goto L_0x04df;
                case 3: goto L_0x04d2;
                case 4: goto L_0x04c5;
                case 5: goto L_0x04bc;
                case 6: goto L_0x04b3;
                case 7: goto L_0x04aa;
                case 8: goto L_0x0490;
                case 9: goto L_0x047e;
                case 10: goto L_0x046e;
                case 11: goto L_0x0460;
                case 12: goto L_0x0452;
                case 13: goto L_0x0448;
                case 14: goto L_0x043e;
                case 15: goto L_0x0430;
                case 16: goto L_0x0422;
                case 17: goto L_0x040e;
                case 18: goto L_0x0402;
                case 19: goto L_0x03f6;
                case 20: goto L_0x03ea;
                case 21: goto L_0x03de;
                case 22: goto L_0x03d2;
                case 23: goto L_0x03c6;
                case 24: goto L_0x03ba;
                case 25: goto L_0x03ae;
                case 26: goto L_0x03a2;
                case 27: goto L_0x0392;
                case 28: goto L_0x0386;
                case 29: goto L_0x037a;
                case 30: goto L_0x036e;
                case 31: goto L_0x0362;
                case 32: goto L_0x0356;
                case 33: goto L_0x034a;
                case 34: goto L_0x033e;
                case 35: goto L_0x031b;
                case 36: goto L_0x02fe;
                case 37: goto L_0x02e1;
                case 38: goto L_0x02c4;
                case 39: goto L_0x02a6;
                case 40: goto L_0x0288;
                case 41: goto L_0x026a;
                case 42: goto L_0x024c;
                case 43: goto L_0x022e;
                case 44: goto L_0x0210;
                case 45: goto L_0x01f2;
                case 46: goto L_0x01d4;
                case 47: goto L_0x01b6;
                case 48: goto L_0x0198;
                case 49: goto L_0x0188;
                case 50: goto L_0x0178;
                case 51: goto L_0x016c;
                case 52: goto L_0x0160;
                case 53: goto L_0x0150;
                case 54: goto L_0x0140;
                case 55: goto L_0x0130;
                case 56: goto L_0x0124;
                case 57: goto L_0x0118;
                case 58: goto L_0x010c;
                case 59: goto L_0x00ee;
                case 60: goto L_0x00da;
                case 61: goto L_0x00c8;
                case 62: goto L_0x00b8;
                case 63: goto L_0x00a8;
                case 64: goto L_0x009c;
                case 65: goto L_0x0090;
                case 66: goto L_0x0080;
                case 67: goto L_0x0070;
                case 68: goto L_0x005a;
                default: goto L_0x0058;
            }
        L_0x0058:
            goto L_0x04fe
        L_0x005a:
            boolean r1 = r14.mo44142l(r8, r2, r15)
            if (r1 == 0) goto L_0x04fe
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.protobuf.t r1 = (com.google.protobuf.C14629t) r1
            xg.t r6 = r14.mo44137h(r2)
            int r1 = com.google.protobuf.CodedOutputStream.m36437i(r8, r1, r6)
            goto L_0x04fd
        L_0x0070:
            boolean r1 = r14.mo44142l(r8, r2, r15)
            if (r1 == 0) goto L_0x04fe
            long r6 = m36663s(r12, r15)
            int r1 = com.google.protobuf.CodedOutputStream.m36445q(r8, r6)
            goto L_0x04fd
        L_0x0080:
            boolean r1 = r14.mo44142l(r8, r2, r15)
            if (r1 == 0) goto L_0x04fe
            int r1 = m36662r(r12, r15)
            int r1 = com.google.protobuf.CodedOutputStream.m36444p(r8, r1)
            goto L_0x04fd
        L_0x0090:
            boolean r1 = r14.mo44142l(r8, r2, r15)
            if (r1 == 0) goto L_0x04fe
            int r1 = com.google.protobuf.CodedOutputStream.m36443o(r8)
            goto L_0x04fd
        L_0x009c:
            boolean r1 = r14.mo44142l(r8, r2, r15)
            if (r1 == 0) goto L_0x04fe
            int r1 = com.google.protobuf.CodedOutputStream.m36442n(r8)
            goto L_0x04fd
        L_0x00a8:
            boolean r1 = r14.mo44142l(r8, r2, r15)
            if (r1 == 0) goto L_0x04fe
            int r1 = m36662r(r12, r15)
            int r1 = com.google.protobuf.CodedOutputStream.m36433e(r8, r1)
            goto L_0x04fd
        L_0x00b8:
            boolean r1 = r14.mo44142l(r8, r2, r15)
            if (r1 == 0) goto L_0x04fe
            int r1 = m36662r(r12, r15)
            int r1 = com.google.protobuf.CodedOutputStream.m36449u(r8, r1)
            goto L_0x04fd
        L_0x00c8:
            boolean r1 = r14.mo44142l(r8, r2, r15)
            if (r1 == 0) goto L_0x04fe
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.protobuf.ByteString r1 = (com.google.protobuf.ByteString) r1
            int r1 = com.google.protobuf.CodedOutputStream.m36431c(r8, r1)
            goto L_0x04fd
        L_0x00da:
            boolean r1 = r14.mo44142l(r8, r2, r15)
            if (r1 == 0) goto L_0x04fe
            java.lang.Object r1 = r0.getObject(r15, r12)
            xg.t r6 = r14.mo44137h(r2)
            int r1 = com.google.protobuf.C14636z.m36726o(r8, r6, r1)
            goto L_0x04fd
        L_0x00ee:
            boolean r1 = r14.mo44142l(r8, r2, r15)
            if (r1 == 0) goto L_0x04fe
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof com.google.protobuf.ByteString
            if (r6 == 0) goto L_0x0104
            com.google.protobuf.ByteString r1 = (com.google.protobuf.ByteString) r1
            int r1 = com.google.protobuf.CodedOutputStream.m36431c(r8, r1)
            goto L_0x04fd
        L_0x0104:
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.google.protobuf.CodedOutputStream.m36446r(r8, r1)
            goto L_0x04fd
        L_0x010c:
            boolean r1 = r14.mo44142l(r8, r2, r15)
            if (r1 == 0) goto L_0x04fe
            int r1 = com.google.protobuf.CodedOutputStream.m36430b(r8)
            goto L_0x04fd
        L_0x0118:
            boolean r1 = r14.mo44142l(r8, r2, r15)
            if (r1 == 0) goto L_0x04fe
            int r1 = com.google.protobuf.CodedOutputStream.m36434f(r8)
            goto L_0x04fd
        L_0x0124:
            boolean r1 = r14.mo44142l(r8, r2, r15)
            if (r1 == 0) goto L_0x04fe
            int r1 = com.google.protobuf.CodedOutputStream.m36435g(r8)
            goto L_0x04fd
        L_0x0130:
            boolean r1 = r14.mo44142l(r8, r2, r15)
            if (r1 == 0) goto L_0x04fe
            int r1 = m36662r(r12, r15)
            int r1 = com.google.protobuf.CodedOutputStream.m36438j(r8, r1)
            goto L_0x04fd
        L_0x0140:
            boolean r1 = r14.mo44142l(r8, r2, r15)
            if (r1 == 0) goto L_0x04fe
            long r6 = m36663s(r12, r15)
            int r1 = com.google.protobuf.CodedOutputStream.m36451w(r8, r6)
            goto L_0x04fd
        L_0x0150:
            boolean r1 = r14.mo44142l(r8, r2, r15)
            if (r1 == 0) goto L_0x04fe
            long r6 = m36663s(r12, r15)
            int r1 = com.google.protobuf.CodedOutputStream.m36440l(r8, r6)
            goto L_0x04fd
        L_0x0160:
            boolean r1 = r14.mo44142l(r8, r2, r15)
            if (r1 == 0) goto L_0x04fe
            int r1 = com.google.protobuf.CodedOutputStream.m36436h(r8)
            goto L_0x04fd
        L_0x016c:
            boolean r1 = r14.mo44142l(r8, r2, r15)
            if (r1 == 0) goto L_0x04fe
            int r1 = com.google.protobuf.CodedOutputStream.m36432d(r8)
            goto L_0x04fd
        L_0x0178:
            com.google.protobuf.r r1 = r14.f36895n
            java.lang.Object r6 = r0.getObject(r15, r12)
            java.lang.Object r7 = r14.mo44136g(r2)
            int r1 = r1.mo44128e(r8, r6, r7)
            goto L_0x04fd
        L_0x0188:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            xg.t r6 = r14.mo44137h(r2)
            int r1 = com.google.protobuf.C14636z.m36721j(r8, r1, r6)
            goto L_0x04fd
        L_0x0198:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36731t(r1)
            if (r1 <= 0) goto L_0x04fe
            boolean r6 = r14.f36887f
            if (r6 == 0) goto L_0x01ac
            long r6 = (long) r7
            r0.putInt(r15, r6, r1)
        L_0x01ac:
            int r6 = com.google.protobuf.CodedOutputStream.m36448t(r8)
            int r7 = com.google.protobuf.CodedOutputStream.m36450v(r1)
            goto L_0x0337
        L_0x01b6:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36729r(r1)
            if (r1 <= 0) goto L_0x04fe
            boolean r6 = r14.f36887f
            if (r6 == 0) goto L_0x01ca
            long r6 = (long) r7
            r0.putInt(r15, r6, r1)
        L_0x01ca:
            int r6 = com.google.protobuf.CodedOutputStream.m36448t(r8)
            int r7 = com.google.protobuf.CodedOutputStream.m36450v(r1)
            goto L_0x0337
        L_0x01d4:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36720i(r1)
            if (r1 <= 0) goto L_0x04fe
            boolean r6 = r14.f36887f
            if (r6 == 0) goto L_0x01e8
            long r6 = (long) r7
            r0.putInt(r15, r6, r1)
        L_0x01e8:
            int r6 = com.google.protobuf.CodedOutputStream.m36448t(r8)
            int r7 = com.google.protobuf.CodedOutputStream.m36450v(r1)
            goto L_0x0337
        L_0x01f2:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36718g(r1)
            if (r1 <= 0) goto L_0x04fe
            boolean r6 = r14.f36887f
            if (r6 == 0) goto L_0x0206
            long r6 = (long) r7
            r0.putInt(r15, r6, r1)
        L_0x0206:
            int r6 = com.google.protobuf.CodedOutputStream.m36448t(r8)
            int r7 = com.google.protobuf.CodedOutputStream.m36450v(r1)
            goto L_0x0337
        L_0x0210:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36716e(r1)
            if (r1 <= 0) goto L_0x04fe
            boolean r6 = r14.f36887f
            if (r6 == 0) goto L_0x0224
            long r6 = (long) r7
            r0.putInt(r15, r6, r1)
        L_0x0224:
            int r6 = com.google.protobuf.CodedOutputStream.m36448t(r8)
            int r7 = com.google.protobuf.CodedOutputStream.m36450v(r1)
            goto L_0x0337
        L_0x022e:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36734w(r1)
            if (r1 <= 0) goto L_0x04fe
            boolean r6 = r14.f36887f
            if (r6 == 0) goto L_0x0242
            long r6 = (long) r7
            r0.putInt(r15, r6, r1)
        L_0x0242:
            int r6 = com.google.protobuf.CodedOutputStream.m36448t(r8)
            int r7 = com.google.protobuf.CodedOutputStream.m36450v(r1)
            goto L_0x0337
        L_0x024c:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36713b(r1)
            if (r1 <= 0) goto L_0x04fe
            boolean r6 = r14.f36887f
            if (r6 == 0) goto L_0x0260
            long r6 = (long) r7
            r0.putInt(r15, r6, r1)
        L_0x0260:
            int r6 = com.google.protobuf.CodedOutputStream.m36448t(r8)
            int r7 = com.google.protobuf.CodedOutputStream.m36450v(r1)
            goto L_0x0337
        L_0x026a:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36718g(r1)
            if (r1 <= 0) goto L_0x04fe
            boolean r6 = r14.f36887f
            if (r6 == 0) goto L_0x027e
            long r6 = (long) r7
            r0.putInt(r15, r6, r1)
        L_0x027e:
            int r6 = com.google.protobuf.CodedOutputStream.m36448t(r8)
            int r7 = com.google.protobuf.CodedOutputStream.m36450v(r1)
            goto L_0x0337
        L_0x0288:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36720i(r1)
            if (r1 <= 0) goto L_0x04fe
            boolean r6 = r14.f36887f
            if (r6 == 0) goto L_0x029c
            long r6 = (long) r7
            r0.putInt(r15, r6, r1)
        L_0x029c:
            int r6 = com.google.protobuf.CodedOutputStream.m36448t(r8)
            int r7 = com.google.protobuf.CodedOutputStream.m36450v(r1)
            goto L_0x0337
        L_0x02a6:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36723l(r1)
            if (r1 <= 0) goto L_0x04fe
            boolean r6 = r14.f36887f
            if (r6 == 0) goto L_0x02ba
            long r6 = (long) r7
            r0.putInt(r15, r6, r1)
        L_0x02ba:
            int r6 = com.google.protobuf.CodedOutputStream.m36448t(r8)
            int r7 = com.google.protobuf.CodedOutputStream.m36450v(r1)
            goto L_0x0337
        L_0x02c4:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36736y(r1)
            if (r1 <= 0) goto L_0x04fe
            boolean r6 = r14.f36887f
            if (r6 == 0) goto L_0x02d8
            long r6 = (long) r7
            r0.putInt(r15, r6, r1)
        L_0x02d8:
            int r6 = com.google.protobuf.CodedOutputStream.m36448t(r8)
            int r7 = com.google.protobuf.CodedOutputStream.m36450v(r1)
            goto L_0x0337
        L_0x02e1:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36725n(r1)
            if (r1 <= 0) goto L_0x04fe
            boolean r6 = r14.f36887f
            if (r6 == 0) goto L_0x02f5
            long r6 = (long) r7
            r0.putInt(r15, r6, r1)
        L_0x02f5:
            int r6 = com.google.protobuf.CodedOutputStream.m36448t(r8)
            int r7 = com.google.protobuf.CodedOutputStream.m36450v(r1)
            goto L_0x0337
        L_0x02fe:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36718g(r1)
            if (r1 <= 0) goto L_0x04fe
            boolean r6 = r14.f36887f
            if (r6 == 0) goto L_0x0312
            long r6 = (long) r7
            r0.putInt(r15, r6, r1)
        L_0x0312:
            int r6 = com.google.protobuf.CodedOutputStream.m36448t(r8)
            int r7 = com.google.protobuf.CodedOutputStream.m36450v(r1)
            goto L_0x0337
        L_0x031b:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36720i(r1)
            if (r1 <= 0) goto L_0x04fe
            boolean r6 = r14.f36887f
            if (r6 == 0) goto L_0x032f
            long r6 = (long) r7
            r0.putInt(r15, r6, r1)
        L_0x032f:
            int r6 = com.google.protobuf.CodedOutputStream.m36448t(r8)
            int r7 = com.google.protobuf.CodedOutputStream.m36450v(r1)
        L_0x0337:
            int r1 = p379.C16530d.m42011d(r7, r6, r1, r3)
            r3 = r1
            goto L_0x04fe
        L_0x033e:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36730s(r8, r1)
            goto L_0x04fd
        L_0x034a:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36728q(r8, r1)
            goto L_0x04fd
        L_0x0356:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36719h(r8, r1)
            goto L_0x04fd
        L_0x0362:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36717f(r8, r1)
            goto L_0x04fd
        L_0x036e:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36715d(r8, r1)
            goto L_0x04fd
        L_0x037a:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36733v(r8, r1)
            goto L_0x04fd
        L_0x0386:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36714c(r8, r1)
            goto L_0x04fd
        L_0x0392:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            xg.t r6 = r14.mo44137h(r2)
            int r1 = com.google.protobuf.C14636z.m36727p(r8, r1, r6)
            goto L_0x04fd
        L_0x03a2:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36732u(r8, r1)
            goto L_0x04fd
        L_0x03ae:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36712a(r8, r1)
            goto L_0x04fd
        L_0x03ba:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36717f(r8, r1)
            goto L_0x04fd
        L_0x03c6:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36719h(r8, r1)
            goto L_0x04fd
        L_0x03d2:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36722k(r8, r1)
            goto L_0x04fd
        L_0x03de:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36735x(r8, r1)
            goto L_0x04fd
        L_0x03ea:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36724m(r8, r1)
            goto L_0x04fd
        L_0x03f6:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36717f(r8, r1)
            goto L_0x04fd
        L_0x0402:
            java.lang.Object r1 = r0.getObject(r15, r12)
            java.util.List r1 = (java.util.List) r1
            int r1 = com.google.protobuf.C14636z.m36719h(r8, r1)
            goto L_0x04fd
        L_0x040e:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04fe
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.protobuf.t r1 = (com.google.protobuf.C14629t) r1
            xg.t r6 = r14.mo44137h(r2)
            int r1 = com.google.protobuf.CodedOutputStream.m36437i(r8, r1, r6)
            goto L_0x04fd
        L_0x0422:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04fe
            long r6 = r0.getLong(r15, r12)
            int r1 = com.google.protobuf.CodedOutputStream.m36445q(r8, r6)
            goto L_0x04fd
        L_0x0430:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04fe
            int r1 = r0.getInt(r15, r12)
            int r1 = com.google.protobuf.CodedOutputStream.m36444p(r8, r1)
            goto L_0x04fd
        L_0x043e:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04fe
            int r1 = com.google.protobuf.CodedOutputStream.m36443o(r8)
            goto L_0x04fd
        L_0x0448:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04fe
            int r1 = com.google.protobuf.CodedOutputStream.m36442n(r8)
            goto L_0x04fd
        L_0x0452:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04fe
            int r1 = r0.getInt(r15, r12)
            int r1 = com.google.protobuf.CodedOutputStream.m36433e(r8, r1)
            goto L_0x04fd
        L_0x0460:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04fe
            int r1 = r0.getInt(r15, r12)
            int r1 = com.google.protobuf.CodedOutputStream.m36449u(r8, r1)
            goto L_0x04fd
        L_0x046e:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04fe
            java.lang.Object r1 = r0.getObject(r15, r12)
            com.google.protobuf.ByteString r1 = (com.google.protobuf.ByteString) r1
            int r1 = com.google.protobuf.CodedOutputStream.m36431c(r8, r1)
            goto L_0x04fd
        L_0x047e:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04fe
            java.lang.Object r1 = r0.getObject(r15, r12)
            xg.t r6 = r14.mo44137h(r2)
            int r1 = com.google.protobuf.C14636z.m36726o(r8, r6, r1)
            goto L_0x04fd
        L_0x0490:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04fe
            java.lang.Object r1 = r0.getObject(r15, r12)
            boolean r6 = r1 instanceof com.google.protobuf.ByteString
            if (r6 == 0) goto L_0x04a3
            com.google.protobuf.ByteString r1 = (com.google.protobuf.ByteString) r1
            int r1 = com.google.protobuf.CodedOutputStream.m36431c(r8, r1)
            goto L_0x04fd
        L_0x04a3:
            java.lang.String r1 = (java.lang.String) r1
            int r1 = com.google.protobuf.CodedOutputStream.m36446r(r8, r1)
            goto L_0x04fd
        L_0x04aa:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04fe
            int r1 = com.google.protobuf.CodedOutputStream.m36430b(r8)
            goto L_0x04fd
        L_0x04b3:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04fe
            int r1 = com.google.protobuf.CodedOutputStream.m36434f(r8)
            goto L_0x04fd
        L_0x04bc:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04fe
            int r1 = com.google.protobuf.CodedOutputStream.m36435g(r8)
            goto L_0x04fd
        L_0x04c5:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04fe
            int r1 = r0.getInt(r15, r12)
            int r1 = com.google.protobuf.CodedOutputStream.m36438j(r8, r1)
            goto L_0x04fd
        L_0x04d2:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04fe
            long r6 = r0.getLong(r15, r12)
            int r1 = com.google.protobuf.CodedOutputStream.m36451w(r8, r6)
            goto L_0x04fd
        L_0x04df:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04fe
            long r6 = r0.getLong(r15, r12)
            int r1 = com.google.protobuf.CodedOutputStream.m36440l(r8, r6)
            goto L_0x04fd
        L_0x04ec:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04fe
            int r1 = com.google.protobuf.CodedOutputStream.m36436h(r8)
            goto L_0x04fd
        L_0x04f5:
            r1 = r5 & r11
            if (r1 == 0) goto L_0x04fe
            int r1 = com.google.protobuf.CodedOutputStream.m36432d(r8)
        L_0x04fd:
            int r3 = r3 + r1
        L_0x04fe:
            int r2 = r2 + 3
            r1 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x000b
        L_0x0505:
            com.google.protobuf.c0<?, ?> r0 = r14.f36893l
            com.google.protobuf.d0 r1 = r0.mo44037a(r15)
            int r0 = r0.mo44038b(r1)
            int r0 = r0 + r3
            boolean r1 = r14.f36885d
            if (r1 == 0) goto L_0x051f
            com.google.protobuf.g<?> r1 = r14.f36894m
            com.google.protobuf.i r15 = r1.mo44069b(r15)
            int r15 = r15.mo44078g()
            int r0 = r0 + r15
        L_0x051f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C14632v.mo44139i(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0314, code lost:
        r2 = p379.C16530d.m42011d(r5, r3, r4, r2);
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo44140j(T r11) {
        /*
            r10 = this;
            sun.misc.Unsafe r0 = f36881p
            r1 = 0
            r2 = 0
        L_0x0004:
            int[] r3 = r10.f36882a
            int r3 = r3.length
            if (r1 >= r3) goto L_0x04e1
            int r3 = r10.mo44147w(r1)
            r4 = 267386880(0xff00000, float:2.3665827E-29)
            r4 = r4 & r3
            int r4 = r4 >>> 20
            int[] r5 = r10.f36882a
            r5 = r5[r1]
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r6
            long r7 = (long) r3
            com.google.protobuf.FieldType r3 = com.google.protobuf.FieldType.DOUBLE_LIST_PACKED
            int r3 = r3.mo43934id()
            if (r4 < r3) goto L_0x0033
            com.google.protobuf.FieldType r3 = com.google.protobuf.FieldType.SINT64_LIST_PACKED
            int r3 = r3.mo43934id()
            if (r4 > r3) goto L_0x0033
            int[] r3 = r10.f36882a
            int r9 = r1 + 2
            r3 = r3[r9]
            r3 = r3 & r6
            goto L_0x0034
        L_0x0033:
            r3 = 0
        L_0x0034:
            switch(r4) {
                case 0: goto L_0x04d2;
                case 1: goto L_0x04c7;
                case 2: goto L_0x04b8;
                case 3: goto L_0x04a9;
                case 4: goto L_0x049a;
                case 5: goto L_0x048f;
                case 6: goto L_0x0484;
                case 7: goto L_0x0479;
                case 8: goto L_0x045c;
                case 9: goto L_0x0448;
                case 10: goto L_0x0436;
                case 11: goto L_0x0426;
                case 12: goto L_0x0416;
                case 13: goto L_0x040a;
                case 14: goto L_0x03fe;
                case 15: goto L_0x03ee;
                case 16: goto L_0x03de;
                case 17: goto L_0x03c8;
                case 18: goto L_0x03be;
                case 19: goto L_0x03b4;
                case 20: goto L_0x03aa;
                case 21: goto L_0x03a0;
                case 22: goto L_0x0396;
                case 23: goto L_0x038c;
                case 24: goto L_0x0382;
                case 25: goto L_0x0378;
                case 26: goto L_0x036e;
                case 27: goto L_0x0360;
                case 28: goto L_0x0356;
                case 29: goto L_0x034c;
                case 30: goto L_0x0342;
                case 31: goto L_0x0338;
                case 32: goto L_0x032e;
                case 33: goto L_0x0324;
                case 34: goto L_0x031a;
                case 35: goto L_0x02f8;
                case 36: goto L_0x02db;
                case 37: goto L_0x02be;
                case 38: goto L_0x02a1;
                case 39: goto L_0x0283;
                case 40: goto L_0x0265;
                case 41: goto L_0x0247;
                case 42: goto L_0x0229;
                case 43: goto L_0x020b;
                case 44: goto L_0x01ed;
                case 45: goto L_0x01cf;
                case 46: goto L_0x01b1;
                case 47: goto L_0x0193;
                case 48: goto L_0x0175;
                case 49: goto L_0x0167;
                case 50: goto L_0x0157;
                case 51: goto L_0x014b;
                case 52: goto L_0x013f;
                case 53: goto L_0x012f;
                case 54: goto L_0x011f;
                case 55: goto L_0x010f;
                case 56: goto L_0x0103;
                case 57: goto L_0x00f7;
                case 58: goto L_0x00eb;
                case 59: goto L_0x00cd;
                case 60: goto L_0x00b9;
                case 61: goto L_0x00a7;
                case 62: goto L_0x0097;
                case 63: goto L_0x0087;
                case 64: goto L_0x007b;
                case 65: goto L_0x006f;
                case 66: goto L_0x005f;
                case 67: goto L_0x004f;
                case 68: goto L_0x0039;
                default: goto L_0x0037;
            }
        L_0x0037:
            goto L_0x04dd
        L_0x0039:
            boolean r3 = r10.mo44142l(r5, r1, r11)
            if (r3 == 0) goto L_0x04dd
            java.lang.Object r3 = p911xg.C20518x.m48172o(r7, r11)
            com.google.protobuf.t r3 = (com.google.protobuf.C14629t) r3
            xg.t r4 = r10.mo44137h(r1)
            int r3 = com.google.protobuf.CodedOutputStream.m36437i(r5, r3, r4)
            goto L_0x04dc
        L_0x004f:
            boolean r3 = r10.mo44142l(r5, r1, r11)
            if (r3 == 0) goto L_0x04dd
            long r3 = m36663s(r7, r11)
            int r3 = com.google.protobuf.CodedOutputStream.m36445q(r5, r3)
            goto L_0x04dc
        L_0x005f:
            boolean r3 = r10.mo44142l(r5, r1, r11)
            if (r3 == 0) goto L_0x04dd
            int r3 = m36662r(r7, r11)
            int r3 = com.google.protobuf.CodedOutputStream.m36444p(r5, r3)
            goto L_0x04dc
        L_0x006f:
            boolean r3 = r10.mo44142l(r5, r1, r11)
            if (r3 == 0) goto L_0x04dd
            int r3 = com.google.protobuf.CodedOutputStream.m36443o(r5)
            goto L_0x04dc
        L_0x007b:
            boolean r3 = r10.mo44142l(r5, r1, r11)
            if (r3 == 0) goto L_0x04dd
            int r3 = com.google.protobuf.CodedOutputStream.m36442n(r5)
            goto L_0x04dc
        L_0x0087:
            boolean r3 = r10.mo44142l(r5, r1, r11)
            if (r3 == 0) goto L_0x04dd
            int r3 = m36662r(r7, r11)
            int r3 = com.google.protobuf.CodedOutputStream.m36433e(r5, r3)
            goto L_0x04dc
        L_0x0097:
            boolean r3 = r10.mo44142l(r5, r1, r11)
            if (r3 == 0) goto L_0x04dd
            int r3 = m36662r(r7, r11)
            int r3 = com.google.protobuf.CodedOutputStream.m36449u(r5, r3)
            goto L_0x04dc
        L_0x00a7:
            boolean r3 = r10.mo44142l(r5, r1, r11)
            if (r3 == 0) goto L_0x04dd
            java.lang.Object r3 = p911xg.C20518x.m48172o(r7, r11)
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            int r3 = com.google.protobuf.CodedOutputStream.m36431c(r5, r3)
            goto L_0x04dc
        L_0x00b9:
            boolean r3 = r10.mo44142l(r5, r1, r11)
            if (r3 == 0) goto L_0x04dd
            java.lang.Object r3 = p911xg.C20518x.m48172o(r7, r11)
            xg.t r4 = r10.mo44137h(r1)
            int r3 = com.google.protobuf.C14636z.m36726o(r5, r4, r3)
            goto L_0x04dc
        L_0x00cd:
            boolean r3 = r10.mo44142l(r5, r1, r11)
            if (r3 == 0) goto L_0x04dd
            java.lang.Object r3 = p911xg.C20518x.m48172o(r7, r11)
            boolean r4 = r3 instanceof com.google.protobuf.ByteString
            if (r4 == 0) goto L_0x00e3
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            int r3 = com.google.protobuf.CodedOutputStream.m36431c(r5, r3)
            goto L_0x04dc
        L_0x00e3:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.protobuf.CodedOutputStream.m36446r(r5, r3)
            goto L_0x04dc
        L_0x00eb:
            boolean r3 = r10.mo44142l(r5, r1, r11)
            if (r3 == 0) goto L_0x04dd
            int r3 = com.google.protobuf.CodedOutputStream.m36430b(r5)
            goto L_0x04dc
        L_0x00f7:
            boolean r3 = r10.mo44142l(r5, r1, r11)
            if (r3 == 0) goto L_0x04dd
            int r3 = com.google.protobuf.CodedOutputStream.m36434f(r5)
            goto L_0x04dc
        L_0x0103:
            boolean r3 = r10.mo44142l(r5, r1, r11)
            if (r3 == 0) goto L_0x04dd
            int r3 = com.google.protobuf.CodedOutputStream.m36435g(r5)
            goto L_0x04dc
        L_0x010f:
            boolean r3 = r10.mo44142l(r5, r1, r11)
            if (r3 == 0) goto L_0x04dd
            int r3 = m36662r(r7, r11)
            int r3 = com.google.protobuf.CodedOutputStream.m36438j(r5, r3)
            goto L_0x04dc
        L_0x011f:
            boolean r3 = r10.mo44142l(r5, r1, r11)
            if (r3 == 0) goto L_0x04dd
            long r3 = m36663s(r7, r11)
            int r3 = com.google.protobuf.CodedOutputStream.m36451w(r5, r3)
            goto L_0x04dc
        L_0x012f:
            boolean r3 = r10.mo44142l(r5, r1, r11)
            if (r3 == 0) goto L_0x04dd
            long r3 = m36663s(r7, r11)
            int r3 = com.google.protobuf.CodedOutputStream.m36440l(r5, r3)
            goto L_0x04dc
        L_0x013f:
            boolean r3 = r10.mo44142l(r5, r1, r11)
            if (r3 == 0) goto L_0x04dd
            int r3 = com.google.protobuf.CodedOutputStream.m36436h(r5)
            goto L_0x04dc
        L_0x014b:
            boolean r3 = r10.mo44142l(r5, r1, r11)
            if (r3 == 0) goto L_0x04dd
            int r3 = com.google.protobuf.CodedOutputStream.m36432d(r5)
            goto L_0x04dc
        L_0x0157:
            com.google.protobuf.r r3 = r10.f36895n
            java.lang.Object r4 = p911xg.C20518x.m48172o(r7, r11)
            java.lang.Object r6 = r10.mo44136g(r1)
            int r3 = r3.mo44128e(r5, r4, r6)
            goto L_0x04dc
        L_0x0167:
            java.util.List r3 = m36659m(r7, r11)
            xg.t r4 = r10.mo44137h(r1)
            int r3 = com.google.protobuf.C14636z.m36721j(r5, r3, r4)
            goto L_0x04dc
        L_0x0175:
            java.lang.Object r4 = r0.getObject(r11, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C14636z.m36731t(r4)
            if (r4 <= 0) goto L_0x04dd
            boolean r6 = r10.f36887f
            if (r6 == 0) goto L_0x0189
            long r6 = (long) r3
            r0.putInt(r11, r6, r4)
        L_0x0189:
            int r3 = com.google.protobuf.CodedOutputStream.m36448t(r5)
            int r5 = com.google.protobuf.CodedOutputStream.m36450v(r4)
            goto L_0x0314
        L_0x0193:
            java.lang.Object r4 = r0.getObject(r11, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C14636z.m36729r(r4)
            if (r4 <= 0) goto L_0x04dd
            boolean r6 = r10.f36887f
            if (r6 == 0) goto L_0x01a7
            long r6 = (long) r3
            r0.putInt(r11, r6, r4)
        L_0x01a7:
            int r3 = com.google.protobuf.CodedOutputStream.m36448t(r5)
            int r5 = com.google.protobuf.CodedOutputStream.m36450v(r4)
            goto L_0x0314
        L_0x01b1:
            java.lang.Object r4 = r0.getObject(r11, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C14636z.m36720i(r4)
            if (r4 <= 0) goto L_0x04dd
            boolean r6 = r10.f36887f
            if (r6 == 0) goto L_0x01c5
            long r6 = (long) r3
            r0.putInt(r11, r6, r4)
        L_0x01c5:
            int r3 = com.google.protobuf.CodedOutputStream.m36448t(r5)
            int r5 = com.google.protobuf.CodedOutputStream.m36450v(r4)
            goto L_0x0314
        L_0x01cf:
            java.lang.Object r4 = r0.getObject(r11, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C14636z.m36718g(r4)
            if (r4 <= 0) goto L_0x04dd
            boolean r6 = r10.f36887f
            if (r6 == 0) goto L_0x01e3
            long r6 = (long) r3
            r0.putInt(r11, r6, r4)
        L_0x01e3:
            int r3 = com.google.protobuf.CodedOutputStream.m36448t(r5)
            int r5 = com.google.protobuf.CodedOutputStream.m36450v(r4)
            goto L_0x0314
        L_0x01ed:
            java.lang.Object r4 = r0.getObject(r11, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C14636z.m36716e(r4)
            if (r4 <= 0) goto L_0x04dd
            boolean r6 = r10.f36887f
            if (r6 == 0) goto L_0x0201
            long r6 = (long) r3
            r0.putInt(r11, r6, r4)
        L_0x0201:
            int r3 = com.google.protobuf.CodedOutputStream.m36448t(r5)
            int r5 = com.google.protobuf.CodedOutputStream.m36450v(r4)
            goto L_0x0314
        L_0x020b:
            java.lang.Object r4 = r0.getObject(r11, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C14636z.m36734w(r4)
            if (r4 <= 0) goto L_0x04dd
            boolean r6 = r10.f36887f
            if (r6 == 0) goto L_0x021f
            long r6 = (long) r3
            r0.putInt(r11, r6, r4)
        L_0x021f:
            int r3 = com.google.protobuf.CodedOutputStream.m36448t(r5)
            int r5 = com.google.protobuf.CodedOutputStream.m36450v(r4)
            goto L_0x0314
        L_0x0229:
            java.lang.Object r4 = r0.getObject(r11, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C14636z.m36713b(r4)
            if (r4 <= 0) goto L_0x04dd
            boolean r6 = r10.f36887f
            if (r6 == 0) goto L_0x023d
            long r6 = (long) r3
            r0.putInt(r11, r6, r4)
        L_0x023d:
            int r3 = com.google.protobuf.CodedOutputStream.m36448t(r5)
            int r5 = com.google.protobuf.CodedOutputStream.m36450v(r4)
            goto L_0x0314
        L_0x0247:
            java.lang.Object r4 = r0.getObject(r11, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C14636z.m36718g(r4)
            if (r4 <= 0) goto L_0x04dd
            boolean r6 = r10.f36887f
            if (r6 == 0) goto L_0x025b
            long r6 = (long) r3
            r0.putInt(r11, r6, r4)
        L_0x025b:
            int r3 = com.google.protobuf.CodedOutputStream.m36448t(r5)
            int r5 = com.google.protobuf.CodedOutputStream.m36450v(r4)
            goto L_0x0314
        L_0x0265:
            java.lang.Object r4 = r0.getObject(r11, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C14636z.m36720i(r4)
            if (r4 <= 0) goto L_0x04dd
            boolean r6 = r10.f36887f
            if (r6 == 0) goto L_0x0279
            long r6 = (long) r3
            r0.putInt(r11, r6, r4)
        L_0x0279:
            int r3 = com.google.protobuf.CodedOutputStream.m36448t(r5)
            int r5 = com.google.protobuf.CodedOutputStream.m36450v(r4)
            goto L_0x0314
        L_0x0283:
            java.lang.Object r4 = r0.getObject(r11, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C14636z.m36723l(r4)
            if (r4 <= 0) goto L_0x04dd
            boolean r6 = r10.f36887f
            if (r6 == 0) goto L_0x0297
            long r6 = (long) r3
            r0.putInt(r11, r6, r4)
        L_0x0297:
            int r3 = com.google.protobuf.CodedOutputStream.m36448t(r5)
            int r5 = com.google.protobuf.CodedOutputStream.m36450v(r4)
            goto L_0x0314
        L_0x02a1:
            java.lang.Object r4 = r0.getObject(r11, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C14636z.m36736y(r4)
            if (r4 <= 0) goto L_0x04dd
            boolean r6 = r10.f36887f
            if (r6 == 0) goto L_0x02b5
            long r6 = (long) r3
            r0.putInt(r11, r6, r4)
        L_0x02b5:
            int r3 = com.google.protobuf.CodedOutputStream.m36448t(r5)
            int r5 = com.google.protobuf.CodedOutputStream.m36450v(r4)
            goto L_0x0314
        L_0x02be:
            java.lang.Object r4 = r0.getObject(r11, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C14636z.m36725n(r4)
            if (r4 <= 0) goto L_0x04dd
            boolean r6 = r10.f36887f
            if (r6 == 0) goto L_0x02d2
            long r6 = (long) r3
            r0.putInt(r11, r6, r4)
        L_0x02d2:
            int r3 = com.google.protobuf.CodedOutputStream.m36448t(r5)
            int r5 = com.google.protobuf.CodedOutputStream.m36450v(r4)
            goto L_0x0314
        L_0x02db:
            java.lang.Object r4 = r0.getObject(r11, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C14636z.m36718g(r4)
            if (r4 <= 0) goto L_0x04dd
            boolean r6 = r10.f36887f
            if (r6 == 0) goto L_0x02ef
            long r6 = (long) r3
            r0.putInt(r11, r6, r4)
        L_0x02ef:
            int r3 = com.google.protobuf.CodedOutputStream.m36448t(r5)
            int r5 = com.google.protobuf.CodedOutputStream.m36450v(r4)
            goto L_0x0314
        L_0x02f8:
            java.lang.Object r4 = r0.getObject(r11, r7)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.google.protobuf.C14636z.m36720i(r4)
            if (r4 <= 0) goto L_0x04dd
            boolean r6 = r10.f36887f
            if (r6 == 0) goto L_0x030c
            long r6 = (long) r3
            r0.putInt(r11, r6, r4)
        L_0x030c:
            int r3 = com.google.protobuf.CodedOutputStream.m36448t(r5)
            int r5 = com.google.protobuf.CodedOutputStream.m36450v(r4)
        L_0x0314:
            int r2 = p379.C16530d.m42011d(r5, r3, r4, r2)
            goto L_0x04dd
        L_0x031a:
            java.util.List r3 = m36659m(r7, r11)
            int r3 = com.google.protobuf.C14636z.m36730s(r5, r3)
            goto L_0x04dc
        L_0x0324:
            java.util.List r3 = m36659m(r7, r11)
            int r3 = com.google.protobuf.C14636z.m36728q(r5, r3)
            goto L_0x04dc
        L_0x032e:
            java.util.List r3 = m36659m(r7, r11)
            int r3 = com.google.protobuf.C14636z.m36719h(r5, r3)
            goto L_0x04dc
        L_0x0338:
            java.util.List r3 = m36659m(r7, r11)
            int r3 = com.google.protobuf.C14636z.m36717f(r5, r3)
            goto L_0x04dc
        L_0x0342:
            java.util.List r3 = m36659m(r7, r11)
            int r3 = com.google.protobuf.C14636z.m36715d(r5, r3)
            goto L_0x04dc
        L_0x034c:
            java.util.List r3 = m36659m(r7, r11)
            int r3 = com.google.protobuf.C14636z.m36733v(r5, r3)
            goto L_0x04dc
        L_0x0356:
            java.util.List r3 = m36659m(r7, r11)
            int r3 = com.google.protobuf.C14636z.m36714c(r5, r3)
            goto L_0x04dc
        L_0x0360:
            java.util.List r3 = m36659m(r7, r11)
            xg.t r4 = r10.mo44137h(r1)
            int r3 = com.google.protobuf.C14636z.m36727p(r5, r3, r4)
            goto L_0x04dc
        L_0x036e:
            java.util.List r3 = m36659m(r7, r11)
            int r3 = com.google.protobuf.C14636z.m36732u(r5, r3)
            goto L_0x04dc
        L_0x0378:
            java.util.List r3 = m36659m(r7, r11)
            int r3 = com.google.protobuf.C14636z.m36712a(r5, r3)
            goto L_0x04dc
        L_0x0382:
            java.util.List r3 = m36659m(r7, r11)
            int r3 = com.google.protobuf.C14636z.m36717f(r5, r3)
            goto L_0x04dc
        L_0x038c:
            java.util.List r3 = m36659m(r7, r11)
            int r3 = com.google.protobuf.C14636z.m36719h(r5, r3)
            goto L_0x04dc
        L_0x0396:
            java.util.List r3 = m36659m(r7, r11)
            int r3 = com.google.protobuf.C14636z.m36722k(r5, r3)
            goto L_0x04dc
        L_0x03a0:
            java.util.List r3 = m36659m(r7, r11)
            int r3 = com.google.protobuf.C14636z.m36735x(r5, r3)
            goto L_0x04dc
        L_0x03aa:
            java.util.List r3 = m36659m(r7, r11)
            int r3 = com.google.protobuf.C14636z.m36724m(r5, r3)
            goto L_0x04dc
        L_0x03b4:
            java.util.List r3 = m36659m(r7, r11)
            int r3 = com.google.protobuf.C14636z.m36717f(r5, r3)
            goto L_0x04dc
        L_0x03be:
            java.util.List r3 = m36659m(r7, r11)
            int r3 = com.google.protobuf.C14636z.m36719h(r5, r3)
            goto L_0x04dc
        L_0x03c8:
            boolean r3 = r10.mo44141k(r1, r11)
            if (r3 == 0) goto L_0x04dd
            java.lang.Object r3 = p911xg.C20518x.m48172o(r7, r11)
            com.google.protobuf.t r3 = (com.google.protobuf.C14629t) r3
            xg.t r4 = r10.mo44137h(r1)
            int r3 = com.google.protobuf.CodedOutputStream.m36437i(r5, r3, r4)
            goto L_0x04dc
        L_0x03de:
            boolean r3 = r10.mo44141k(r1, r11)
            if (r3 == 0) goto L_0x04dd
            long r3 = p911xg.C20518x.m48171n(r7, r11)
            int r3 = com.google.protobuf.CodedOutputStream.m36445q(r5, r3)
            goto L_0x04dc
        L_0x03ee:
            boolean r3 = r10.mo44141k(r1, r11)
            if (r3 == 0) goto L_0x04dd
            int r3 = p911xg.C20518x.m48170m(r7, r11)
            int r3 = com.google.protobuf.CodedOutputStream.m36444p(r5, r3)
            goto L_0x04dc
        L_0x03fe:
            boolean r3 = r10.mo44141k(r1, r11)
            if (r3 == 0) goto L_0x04dd
            int r3 = com.google.protobuf.CodedOutputStream.m36443o(r5)
            goto L_0x04dc
        L_0x040a:
            boolean r3 = r10.mo44141k(r1, r11)
            if (r3 == 0) goto L_0x04dd
            int r3 = com.google.protobuf.CodedOutputStream.m36442n(r5)
            goto L_0x04dc
        L_0x0416:
            boolean r3 = r10.mo44141k(r1, r11)
            if (r3 == 0) goto L_0x04dd
            int r3 = p911xg.C20518x.m48170m(r7, r11)
            int r3 = com.google.protobuf.CodedOutputStream.m36433e(r5, r3)
            goto L_0x04dc
        L_0x0426:
            boolean r3 = r10.mo44141k(r1, r11)
            if (r3 == 0) goto L_0x04dd
            int r3 = p911xg.C20518x.m48170m(r7, r11)
            int r3 = com.google.protobuf.CodedOutputStream.m36449u(r5, r3)
            goto L_0x04dc
        L_0x0436:
            boolean r3 = r10.mo44141k(r1, r11)
            if (r3 == 0) goto L_0x04dd
            java.lang.Object r3 = p911xg.C20518x.m48172o(r7, r11)
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            int r3 = com.google.protobuf.CodedOutputStream.m36431c(r5, r3)
            goto L_0x04dc
        L_0x0448:
            boolean r3 = r10.mo44141k(r1, r11)
            if (r3 == 0) goto L_0x04dd
            java.lang.Object r3 = p911xg.C20518x.m48172o(r7, r11)
            xg.t r4 = r10.mo44137h(r1)
            int r3 = com.google.protobuf.C14636z.m36726o(r5, r4, r3)
            goto L_0x04dc
        L_0x045c:
            boolean r3 = r10.mo44141k(r1, r11)
            if (r3 == 0) goto L_0x04dd
            java.lang.Object r3 = p911xg.C20518x.m48172o(r7, r11)
            boolean r4 = r3 instanceof com.google.protobuf.ByteString
            if (r4 == 0) goto L_0x0472
            com.google.protobuf.ByteString r3 = (com.google.protobuf.ByteString) r3
            int r3 = com.google.protobuf.CodedOutputStream.m36431c(r5, r3)
            goto L_0x04dc
        L_0x0472:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.google.protobuf.CodedOutputStream.m36446r(r5, r3)
            goto L_0x04dc
        L_0x0479:
            boolean r3 = r10.mo44141k(r1, r11)
            if (r3 == 0) goto L_0x04dd
            int r3 = com.google.protobuf.CodedOutputStream.m36430b(r5)
            goto L_0x04dc
        L_0x0484:
            boolean r3 = r10.mo44141k(r1, r11)
            if (r3 == 0) goto L_0x04dd
            int r3 = com.google.protobuf.CodedOutputStream.m36434f(r5)
            goto L_0x04dc
        L_0x048f:
            boolean r3 = r10.mo44141k(r1, r11)
            if (r3 == 0) goto L_0x04dd
            int r3 = com.google.protobuf.CodedOutputStream.m36435g(r5)
            goto L_0x04dc
        L_0x049a:
            boolean r3 = r10.mo44141k(r1, r11)
            if (r3 == 0) goto L_0x04dd
            int r3 = p911xg.C20518x.m48170m(r7, r11)
            int r3 = com.google.protobuf.CodedOutputStream.m36438j(r5, r3)
            goto L_0x04dc
        L_0x04a9:
            boolean r3 = r10.mo44141k(r1, r11)
            if (r3 == 0) goto L_0x04dd
            long r3 = p911xg.C20518x.m48171n(r7, r11)
            int r3 = com.google.protobuf.CodedOutputStream.m36451w(r5, r3)
            goto L_0x04dc
        L_0x04b8:
            boolean r3 = r10.mo44141k(r1, r11)
            if (r3 == 0) goto L_0x04dd
            long r3 = p911xg.C20518x.m48171n(r7, r11)
            int r3 = com.google.protobuf.CodedOutputStream.m36440l(r5, r3)
            goto L_0x04dc
        L_0x04c7:
            boolean r3 = r10.mo44141k(r1, r11)
            if (r3 == 0) goto L_0x04dd
            int r3 = com.google.protobuf.CodedOutputStream.m36436h(r5)
            goto L_0x04dc
        L_0x04d2:
            boolean r3 = r10.mo44141k(r1, r11)
            if (r3 == 0) goto L_0x04dd
            int r3 = com.google.protobuf.CodedOutputStream.m36432d(r5)
        L_0x04dc:
            int r2 = r2 + r3
        L_0x04dd:
            int r1 = r1 + 3
            goto L_0x0004
        L_0x04e1:
            com.google.protobuf.c0<?, ?> r0 = r10.f36893l
            com.google.protobuf.d0 r11 = r0.mo44037a(r11)
            int r11 = r0.mo44038b(r11)
            int r11 = r11 + r2
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C14632v.mo44140j(java.lang.Object):int");
    }

    /* renamed from: k */
    public final boolean mo44141k(int i, Object obj) {
        boolean equals;
        int i2 = this.f36882a[i + 2];
        long j = (long) (i2 & 1048575);
        if (j == 1048575) {
            int w = mo44147w(i);
            long j2 = (long) (w & 1048575);
            switch ((w & 267386880) >>> 20) {
                case 0:
                    if (C20518x.m48168k(j2, obj) != 0.0d) {
                        return true;
                    }
                    return false;
                case 1:
                    if (C20518x.m48169l(j2, obj) != BitmapDescriptorFactory.HUE_RED) {
                        return true;
                    }
                    return false;
                case 2:
                    if (C20518x.m48171n(j2, obj) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (C20518x.m48171n(j2, obj) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (C20518x.m48170m(j2, obj) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (C20518x.m48171n(j2, obj) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (C20518x.m48170m(j2, obj) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return C20518x.m48164g(j2, obj);
                case 8:
                    Object o = C20518x.m48172o(j2, obj);
                    if (o instanceof String) {
                        equals = ((String) o).isEmpty();
                        break;
                    } else if (o instanceof ByteString) {
                        equals = ByteString.f36798b.equals(o);
                        break;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (C20518x.m48172o(j2, obj) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    equals = ByteString.f36798b.equals(C20518x.m48172o(j2, obj));
                    break;
                case 11:
                    if (C20518x.m48170m(j2, obj) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (C20518x.m48170m(j2, obj) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (C20518x.m48170m(j2, obj) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (C20518x.m48171n(j2, obj) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (C20518x.m48170m(j2, obj) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (C20518x.m48171n(j2, obj) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (C20518x.m48172o(j2, obj) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
            return !equals;
        } else if (((1 << (i2 >>> 20)) & C20518x.m48170m(j, obj)) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: l */
    public final boolean mo44142l(int i, int i2, Object obj) {
        if (C20518x.m48170m((long) (this.f36882a[i2 + 2] & 1048575), obj) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final void mo44143n(int i, Object obj, Object obj2) {
        long w = (long) (mo44147w(i) & 1048575);
        if (mo44141k(i, obj2)) {
            Object o = C20518x.m48172o(w, obj);
            Object o2 = C20518x.m48172o(w, obj2);
            if (o != null && o2 != null) {
                C20518x.m48179v(obj, w, C14610k.m36623b(o, o2));
                mo44145u(i, obj);
            } else if (o2 != null) {
                C20518x.m48179v(obj, w, o2);
                mo44145u(i, obj);
            }
        }
    }

    /* renamed from: o */
    public final void mo44144o(int i, Object obj, Object obj2) {
        int w = mo44147w(i);
        int i2 = this.f36882a[i];
        long j = (long) (w & 1048575);
        if (mo44142l(i2, i, obj2)) {
            Object obj3 = null;
            if (mo44142l(i2, i, obj)) {
                obj3 = C20518x.m48172o(j, obj);
            }
            Object o = C20518x.m48172o(j, obj2);
            if (obj3 != null && o != null) {
                C20518x.m48179v(obj, j, C14610k.m36623b(obj3, o));
                mo44146v(i2, i, obj);
            } else if (o != null) {
                C20518x.m48179v(obj, j, o);
                mo44146v(i2, i, obj);
            }
        }
    }

    /* renamed from: u */
    public final void mo44145u(int i, Object obj) {
        int i2 = this.f36882a[i + 2];
        long j = (long) (1048575 & i2);
        if (j != 1048575) {
            C20518x.m48177t(obj, (1 << (i2 >>> 20)) | C20518x.m48170m(j, obj), j);
        }
    }

    /* renamed from: v */
    public final void mo44146v(int i, int i2, Object obj) {
        C20518x.m48177t(obj, i, (long) (this.f36882a[i2 + 2] & 1048575));
    }

    /* renamed from: w */
    public final int mo44147w(int i) {
        return this.f36882a[i + 1];
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x030e  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0340  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0350  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0360  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0380  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0390  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x03b0  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x03ce  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x03db  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x03e8  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x03f5  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0402  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x040f  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x042f  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x043b  */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0447  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0453  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x045f  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x046b  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x0477  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0483  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x04a0  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x018e  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01bf  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x020f  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x029f  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x02af  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x02bf  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02df  */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44148x(java.lang.Object r18, com.google.protobuf.C14602f r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f36885d
            if (r3 == 0) goto L_0x0021
            com.google.protobuf.g<?> r3 = r0.f36894m
            com.google.protobuf.i r3 = r3.mo44069b(r1)
            boolean r5 = r3.mo44079h()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.mo44082k()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            int[] r6 = r0.f36882a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f36881p
            r10 = 0
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x002d:
            if (r10 >= r6) goto L_0x049e
            int r13 = r0.mo44147w(r10)
            int[] r14 = r0.f36882a
            r15 = r14[r10]
            r16 = 267386880(0xff00000, float:2.3665827E-29)
            r16 = r13 & r16
            int r4 = r16 >>> 20
            r9 = 17
            if (r4 > r9) goto L_0x0058
            int r9 = r10 + 2
            r9 = r14[r9]
            r14 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r9 & r14
            if (r8 == r11) goto L_0x0052
            long r11 = (long) r8
            int r12 = r7.getInt(r1, r11)
            r11 = r8
        L_0x0052:
            int r8 = r9 >>> 20
            r9 = 1
            int r8 = r9 << r8
            goto L_0x0059
        L_0x0058:
            r8 = 0
        L_0x0059:
            if (r5 == 0) goto L_0x0076
            com.google.protobuf.g<?> r9 = r0.f36894m
            r9.mo44068a(r5)
            if (r15 < 0) goto L_0x0076
            com.google.protobuf.g<?> r9 = r0.f36894m
            r9.mo44073f(r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0074
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0059
        L_0x0074:
            r5 = 0
            goto L_0x0059
        L_0x0076:
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r13 & r9
            long r13 = (long) r13
            switch(r4) {
                case 0: goto L_0x048f;
                case 1: goto L_0x0483;
                case 2: goto L_0x0477;
                case 3: goto L_0x046b;
                case 4: goto L_0x045f;
                case 5: goto L_0x0453;
                case 6: goto L_0x0447;
                case 7: goto L_0x043b;
                case 8: goto L_0x042f;
                case 9: goto L_0x041e;
                case 10: goto L_0x040f;
                case 11: goto L_0x0402;
                case 12: goto L_0x03f5;
                case 13: goto L_0x03e8;
                case 14: goto L_0x03db;
                case 15: goto L_0x03ce;
                case 16: goto L_0x03c1;
                case 17: goto L_0x03b0;
                case 18: goto L_0x03a0;
                case 19: goto L_0x0390;
                case 20: goto L_0x0380;
                case 21: goto L_0x0370;
                case 22: goto L_0x0360;
                case 23: goto L_0x0350;
                case 24: goto L_0x0340;
                case 25: goto L_0x0330;
                case 26: goto L_0x0321;
                case 27: goto L_0x030e;
                case 28: goto L_0x02ff;
                case 29: goto L_0x02ef;
                case 30: goto L_0x02df;
                case 31: goto L_0x02cf;
                case 32: goto L_0x02bf;
                case 33: goto L_0x02af;
                case 34: goto L_0x029f;
                case 35: goto L_0x028f;
                case 36: goto L_0x027f;
                case 37: goto L_0x026f;
                case 38: goto L_0x025f;
                case 39: goto L_0x024f;
                case 40: goto L_0x023f;
                case 41: goto L_0x022f;
                case 42: goto L_0x021f;
                case 43: goto L_0x020f;
                case 44: goto L_0x01ff;
                case 45: goto L_0x01ef;
                case 46: goto L_0x01df;
                case 47: goto L_0x01cf;
                case 48: goto L_0x01bf;
                case 49: goto L_0x01ac;
                case 50: goto L_0x01a3;
                case 51: goto L_0x018e;
                case 52: goto L_0x0179;
                case 53: goto L_0x016a;
                case 54: goto L_0x015b;
                case 55: goto L_0x014c;
                case 56: goto L_0x013d;
                case 57: goto L_0x012e;
                case 58: goto L_0x0119;
                case 59: goto L_0x010a;
                case 60: goto L_0x00f7;
                case 61: goto L_0x00e7;
                case 62: goto L_0x00d9;
                case 63: goto L_0x00cb;
                case 64: goto L_0x00bd;
                case 65: goto L_0x00af;
                case 66: goto L_0x00a1;
                case 67: goto L_0x0093;
                case 68: goto L_0x0081;
                default: goto L_0x007e;
            }
        L_0x007e:
            r4 = 0
            goto L_0x049a
        L_0x0081:
            boolean r4 = r0.mo44142l(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r13)
            xg.t r8 = r0.mo44137h(r10)
            r2.mo44057h(r15, r8, r4)
            goto L_0x007e
        L_0x0093:
            boolean r4 = r0.mo44142l(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            long r13 = m36663s(r13, r1)
            r2.mo44065p(r15, r13)
            goto L_0x007e
        L_0x00a1:
            boolean r4 = r0.mo44142l(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            int r4 = m36662r(r13, r1)
            r2.mo44064o(r15, r4)
            goto L_0x007e
        L_0x00af:
            boolean r4 = r0.mo44142l(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            long r13 = m36663s(r13, r1)
            r2.mo44063n(r15, r13)
            goto L_0x007e
        L_0x00bd:
            boolean r4 = r0.mo44142l(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            int r4 = m36662r(r13, r1)
            r2.mo44062m(r15, r4)
            goto L_0x007e
        L_0x00cb:
            boolean r4 = r0.mo44142l(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            int r4 = m36662r(r13, r1)
            r2.mo44053d(r15, r4)
            goto L_0x007e
        L_0x00d9:
            boolean r4 = r0.mo44142l(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            int r4 = m36662r(r13, r1)
            r2.mo44066q(r15, r4)
            goto L_0x007e
        L_0x00e7:
            boolean r4 = r0.mo44142l(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r13)
            com.google.protobuf.ByteString r4 = (com.google.protobuf.ByteString) r4
            r2.mo44051b(r15, r4)
            goto L_0x007e
        L_0x00f7:
            boolean r4 = r0.mo44142l(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r13)
            xg.t r8 = r0.mo44137h(r10)
            r2.mo44060k(r15, r8, r4)
            goto L_0x007e
        L_0x010a:
            boolean r4 = r0.mo44142l(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = r7.getObject(r1, r13)
            m36665z(r15, r4, r2)
            goto L_0x007e
        L_0x0119:
            boolean r4 = r0.mo44142l(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = p911xg.C20518x.m48172o(r13, r1)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r2.mo44050a(r15, r4)
            goto L_0x007e
        L_0x012e:
            boolean r4 = r0.mo44142l(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            int r4 = m36662r(r13, r1)
            r2.mo44054e(r15, r4)
            goto L_0x007e
        L_0x013d:
            boolean r4 = r0.mo44142l(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            long r13 = m36663s(r13, r1)
            r2.mo44055f(r15, r13)
            goto L_0x007e
        L_0x014c:
            boolean r4 = r0.mo44142l(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            int r4 = m36662r(r13, r1)
            r2.mo44058i(r15, r4)
            goto L_0x007e
        L_0x015b:
            boolean r4 = r0.mo44142l(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            long r13 = m36663s(r13, r1)
            r2.mo44067r(r15, r13)
            goto L_0x007e
        L_0x016a:
            boolean r4 = r0.mo44142l(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            long r13 = m36663s(r13, r1)
            r2.mo44059j(r15, r13)
            goto L_0x007e
        L_0x0179:
            boolean r4 = r0.mo44142l(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = p911xg.C20518x.m48172o(r13, r1)
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r2.mo44056g(r4, r15)
            goto L_0x007e
        L_0x018e:
            boolean r4 = r0.mo44142l(r15, r10, r1)
            if (r4 == 0) goto L_0x007e
            java.lang.Object r4 = p911xg.C20518x.m48172o(r13, r1)
            java.lang.Double r4 = (java.lang.Double) r4
            double r13 = r4.doubleValue()
            r2.mo44052c(r15, r13)
            goto L_0x007e
        L_0x01a3:
            java.lang.Object r4 = r7.getObject(r1, r13)
            r0.mo44149y(r2, r15, r4, r10)
            goto L_0x007e
        L_0x01ac:
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            xg.t r13 = r0.mo44137h(r10)
            com.google.protobuf.C14636z.m36701J(r4, r8, r2, r13)
            goto L_0x007e
        L_0x01bf:
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 1
            com.google.protobuf.C14636z.m36708Q(r4, r8, r2, r15)
            goto L_0x007e
        L_0x01cf:
            r15 = 1
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36707P(r4, r8, r2, r15)
            goto L_0x007e
        L_0x01df:
            r15 = 1
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36706O(r4, r8, r2, r15)
            goto L_0x007e
        L_0x01ef:
            r15 = 1
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36705N(r4, r8, r2, r15)
            goto L_0x007e
        L_0x01ff:
            r15 = 1
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36697F(r4, r8, r2, r15)
            goto L_0x007e
        L_0x020f:
            r15 = 1
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36710S(r4, r8, r2, r15)
            goto L_0x007e
        L_0x021f:
            r15 = 1
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36694C(r4, r8, r2, r15)
            goto L_0x007e
        L_0x022f:
            r15 = 1
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36698G(r4, r8, r2, r15)
            goto L_0x007e
        L_0x023f:
            r15 = 1
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36699H(r4, r8, r2, r15)
            goto L_0x007e
        L_0x024f:
            r15 = 1
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36702K(r4, r8, r2, r15)
            goto L_0x007e
        L_0x025f:
            r15 = 1
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36711T(r4, r8, r2, r15)
            goto L_0x007e
        L_0x026f:
            r15 = 1
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36703L(r4, r8, r2, r15)
            goto L_0x007e
        L_0x027f:
            r15 = 1
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36700I(r4, r8, r2, r15)
            goto L_0x007e
        L_0x028f:
            r15 = 1
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36696E(r4, r8, r2, r15)
            goto L_0x007e
        L_0x029f:
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.protobuf.C14636z.m36708Q(r4, r8, r2, r15)
            goto L_0x007e
        L_0x02af:
            r15 = 0
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36707P(r4, r8, r2, r15)
            goto L_0x007e
        L_0x02bf:
            r15 = 0
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36706O(r4, r8, r2, r15)
            goto L_0x007e
        L_0x02cf:
            r15 = 0
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36705N(r4, r8, r2, r15)
            goto L_0x007e
        L_0x02df:
            r15 = 0
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36697F(r4, r8, r2, r15)
            goto L_0x007e
        L_0x02ef:
            r15 = 0
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36710S(r4, r8, r2, r15)
            goto L_0x007e
        L_0x02ff:
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36695D(r4, r8, r2)
            goto L_0x007e
        L_0x030e:
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            xg.t r13 = r0.mo44137h(r10)
            com.google.protobuf.C14636z.m36704M(r4, r8, r2, r13)
            goto L_0x007e
        L_0x0321:
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36709R(r4, r8, r2)
            goto L_0x007e
        L_0x0330:
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            r15 = 0
            com.google.protobuf.C14636z.m36694C(r4, r8, r2, r15)
            goto L_0x007e
        L_0x0340:
            r15 = 0
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36698G(r4, r8, r2, r15)
            goto L_0x007e
        L_0x0350:
            r15 = 0
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36699H(r4, r8, r2, r15)
            goto L_0x007e
        L_0x0360:
            r15 = 0
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36702K(r4, r8, r2, r15)
            goto L_0x007e
        L_0x0370:
            r15 = 0
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36711T(r4, r8, r2, r15)
            goto L_0x007e
        L_0x0380:
            r15 = 0
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36703L(r4, r8, r2, r15)
            goto L_0x007e
        L_0x0390:
            r15 = 0
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36700I(r4, r8, r2, r15)
            goto L_0x007e
        L_0x03a0:
            r15 = 0
            int[] r4 = r0.f36882a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r13)
            java.util.List r8 = (java.util.List) r8
            com.google.protobuf.C14636z.m36696E(r4, r8, r2, r15)
            goto L_0x007e
        L_0x03b0:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x049a
            java.lang.Object r8 = r7.getObject(r1, r13)
            xg.t r13 = r0.mo44137h(r10)
            r2.mo44057h(r15, r13, r8)
            goto L_0x049a
        L_0x03c1:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x049a
            long r13 = r7.getLong(r1, r13)
            r2.mo44065p(r15, r13)
            goto L_0x049a
        L_0x03ce:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x049a
            int r8 = r7.getInt(r1, r13)
            r2.mo44064o(r15, r8)
            goto L_0x049a
        L_0x03db:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x049a
            long r13 = r7.getLong(r1, r13)
            r2.mo44063n(r15, r13)
            goto L_0x049a
        L_0x03e8:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x049a
            int r8 = r7.getInt(r1, r13)
            r2.mo44062m(r15, r8)
            goto L_0x049a
        L_0x03f5:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x049a
            int r8 = r7.getInt(r1, r13)
            r2.mo44053d(r15, r8)
            goto L_0x049a
        L_0x0402:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x049a
            int r8 = r7.getInt(r1, r13)
            r2.mo44066q(r15, r8)
            goto L_0x049a
        L_0x040f:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x049a
            java.lang.Object r8 = r7.getObject(r1, r13)
            com.google.protobuf.ByteString r8 = (com.google.protobuf.ByteString) r8
            r2.mo44051b(r15, r8)
            goto L_0x049a
        L_0x041e:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x049a
            java.lang.Object r8 = r7.getObject(r1, r13)
            xg.t r13 = r0.mo44137h(r10)
            r2.mo44060k(r15, r13, r8)
            goto L_0x049a
        L_0x042f:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x049a
            java.lang.Object r8 = r7.getObject(r1, r13)
            m36665z(r15, r8, r2)
            goto L_0x049a
        L_0x043b:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x049a
            boolean r8 = p911xg.C20518x.m48164g(r13, r1)
            r2.mo44050a(r15, r8)
            goto L_0x049a
        L_0x0447:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x049a
            int r8 = r7.getInt(r1, r13)
            r2.mo44054e(r15, r8)
            goto L_0x049a
        L_0x0453:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x049a
            long r13 = r7.getLong(r1, r13)
            r2.mo44055f(r15, r13)
            goto L_0x049a
        L_0x045f:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x049a
            int r8 = r7.getInt(r1, r13)
            r2.mo44058i(r15, r8)
            goto L_0x049a
        L_0x046b:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x049a
            long r13 = r7.getLong(r1, r13)
            r2.mo44067r(r15, r13)
            goto L_0x049a
        L_0x0477:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x049a
            long r13 = r7.getLong(r1, r13)
            r2.mo44059j(r15, r13)
            goto L_0x049a
        L_0x0483:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x049a
            float r8 = p911xg.C20518x.m48169l(r13, r1)
            r2.mo44056g(r8, r15)
            goto L_0x049a
        L_0x048f:
            r4 = 0
            r8 = r8 & r12
            if (r8 == 0) goto L_0x049a
            double r13 = p911xg.C20518x.m48168k(r13, r1)
            r2.mo44052c(r15, r13)
        L_0x049a:
            int r10 = r10 + 3
            goto L_0x002d
        L_0x049e:
            if (r5 == 0) goto L_0x04b5
            com.google.protobuf.g<?> r4 = r0.f36894m
            r4.mo44073f(r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04b3
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x049e
        L_0x04b3:
            r5 = 0
            goto L_0x049e
        L_0x04b5:
            com.google.protobuf.c0<?, ?> r3 = r0.f36893l
            com.google.protobuf.d0 r1 = r3.mo44037a(r1)
            r3.mo44044h(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C14632v.mo44148x(java.lang.Object, com.google.protobuf.f):void");
    }

    /* renamed from: y */
    public final void mo44149y(C14602f fVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            C14625q.C14626a<?, ?> b = this.f36895n.mo44125b(mo44136g(i2));
            MapFieldLite c = this.f36895n.mo44126c(obj);
            fVar.f36850a.getClass();
            for (Map.Entry entry : c.entrySet()) {
                fVar.f36850a.mo43923P(i, 2);
                fVar.f36850a.mo43925R(C14625q.m36643a(b, entry.getKey(), entry.getValue()));
                C14625q.m36644b(fVar.f36850a, b, entry.getKey(), entry.getValue());
            }
        }
    }
}
