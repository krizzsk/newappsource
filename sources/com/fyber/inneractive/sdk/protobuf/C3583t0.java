package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C3490e;
import com.fyber.inneractive.sdk.protobuf.C3534j0;
import com.fyber.inneractive.sdk.protobuf.C3569r1;
import com.fyber.inneractive.sdk.protobuf.C3609z;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* renamed from: com.fyber.inneractive.sdk.protobuf.t0 */
public final class C3583t0<T> implements C3498f1<T> {

    /* renamed from: r */
    public static final int[] f12553r = new int[0];

    /* renamed from: s */
    public static final Unsafe f12554s;

    /* renamed from: a */
    public final int[] f12555a;

    /* renamed from: b */
    public final Object[] f12556b;

    /* renamed from: c */
    public final int f12557c;

    /* renamed from: d */
    public final int f12558d;

    /* renamed from: e */
    public final C3564q0 f12559e;

    /* renamed from: f */
    public final boolean f12560f;

    /* renamed from: g */
    public final boolean f12561g;

    /* renamed from: h */
    public final boolean f12562h;

    /* renamed from: i */
    public final boolean f12563i;

    /* renamed from: j */
    public final int[] f12564j;

    /* renamed from: k */
    public final int f12565k;

    /* renamed from: l */
    public final int f12566l;

    /* renamed from: m */
    public final C3602v0 f12567m;

    /* renamed from: n */
    public final C3500g0 f12568n;

    /* renamed from: o */
    public final C3550m1<?, ?> f12569o;

    /* renamed from: p */
    public final C3567r<?> f12570p;

    /* renamed from: q */
    public final C3546l0 f12571q;

    static {
        Unsafe unsafe;
        Unsafe unsafe2 = C3569r1.f12539a;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new C3566q1());
        } catch (Throwable unused) {
            unsafe = null;
        }
        f12554s = unsafe;
    }

    public C3583t0(int[] iArr, Object[] objArr, int i, int i2, C3564q0 q0Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, C3602v0 v0Var, C3500g0 g0Var, C3550m1<?, ?> m1Var, C3567r<?> rVar, C3546l0 l0Var) {
        boolean z3;
        this.f12555a = iArr;
        this.f12556b = objArr;
        this.f12557c = i;
        this.f12558d = i2;
        this.f12561g = q0Var instanceof GeneratedMessageLite;
        this.f12562h = z;
        if (rVar == null || !rVar.mo15164a(q0Var)) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.f12560f = z3;
        this.f12563i = z2;
        this.f12564j = iArr2;
        this.f12565k = i3;
        this.f12566l = i4;
        this.f12567m = v0Var;
        this.f12568n = g0Var;
        this.f12569o = m1Var;
        this.f12570p = rVar;
        this.f12559e = q0Var;
        this.f12571q = l0Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:125:0x0274  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0340  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0342  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0399  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> com.fyber.inneractive.sdk.protobuf.C3583t0 m9527a(com.fyber.inneractive.sdk.protobuf.C3555o0 r33, com.fyber.inneractive.sdk.protobuf.C3602v0 r34, com.fyber.inneractive.sdk.protobuf.C3500g0 r35, com.fyber.inneractive.sdk.protobuf.C3550m1 r36, com.fyber.inneractive.sdk.protobuf.C3567r r37, com.fyber.inneractive.sdk.protobuf.C3546l0 r38) {
        /*
            r0 = r33
            boolean r1 = r0 instanceof com.fyber.inneractive.sdk.protobuf.C3489d1
            if (r1 == 0) goto L_0x041c
            com.fyber.inneractive.sdk.protobuf.d1 r0 = (com.fyber.inneractive.sdk.protobuf.C3489d1) r0
            int r1 = r0.f12418d
            r2 = 1
            r1 = r1 & r2
            if (r1 != r2) goto L_0x0011
            com.fyber.inneractive.sdk.protobuf.a1 r1 = com.fyber.inneractive.sdk.protobuf.C3478a1.PROTO2
            goto L_0x0013
        L_0x0011:
            com.fyber.inneractive.sdk.protobuf.a1 r1 = com.fyber.inneractive.sdk.protobuf.C3478a1.PROTO3
        L_0x0013:
            com.fyber.inneractive.sdk.protobuf.a1 r3 = com.fyber.inneractive.sdk.protobuf.C3478a1.PROTO3
            r4 = 0
            if (r1 != r3) goto L_0x001a
            r11 = 1
            goto L_0x001b
        L_0x001a:
            r11 = 0
        L_0x001b:
            java.lang.String r1 = r0.f12416b
            int r3 = r1.length()
            char r5 = r1.charAt(r4)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r6) goto L_0x0035
            r5 = 1
        L_0x002b:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0036
            r5 = r7
            goto L_0x002b
        L_0x0035:
            r7 = 1
        L_0x0036:
            int r5 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x0055
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0042:
            int r10 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0052
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r9
            r7 = r7 | r5
            int r9 = r9 + 13
            r5 = r10
            goto L_0x0042
        L_0x0052:
            int r5 = r5 << r9
            r7 = r7 | r5
            r5 = r10
        L_0x0055:
            if (r7 != 0) goto L_0x0062
            int[] r7 = f12553r
            r14 = r7
            r7 = 0
            r9 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            goto L_0x0173
        L_0x0062:
            int r7 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r6) goto L_0x0081
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x006e:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x007e
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r5 = r5 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L_0x006e
        L_0x007e:
            int r7 = r7 << r9
            r5 = r5 | r7
            r7 = r10
        L_0x0081:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r6) goto L_0x00a0
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L_0x008d:
            int r12 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x009d
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r12
            goto L_0x008d
        L_0x009d:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r12
        L_0x00a0:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r6) goto L_0x00bf
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00ac:
            int r13 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00bc
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r12
            r9 = r9 | r10
            int r12 = r12 + 13
            r10 = r13
            goto L_0x00ac
        L_0x00bc:
            int r10 = r10 << r12
            r9 = r9 | r10
            r10 = r13
        L_0x00bf:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r6) goto L_0x00de
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00cb:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00db
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r10 = r10 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00cb
        L_0x00db:
            int r12 = r12 << r13
            r10 = r10 | r12
            r12 = r14
        L_0x00de:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r6) goto L_0x00fd
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00ea:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x00fa
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00ea
        L_0x00fa:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00fd:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r6) goto L_0x011e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0109:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x011a
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0109
        L_0x011a:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x011e:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r6) goto L_0x0141
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x012a:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x013c
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x012a
        L_0x013c:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0141:
            int r16 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r6) goto L_0x0166
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r4 = r16
            r16 = 13
        L_0x014f:
            int r17 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r6) goto L_0x0161
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r16
            r15 = r15 | r4
            int r16 = r16 + 13
            r4 = r17
            goto L_0x014f
        L_0x0161:
            int r4 = r4 << r16
            r15 = r15 | r4
            r16 = r17
        L_0x0166:
            int r4 = r15 + r13
            int r4 = r4 + r14
            int[] r4 = new int[r4]
            int r14 = r5 * 2
            int r14 = r14 + r7
            r7 = r14
            r14 = r4
            r4 = r5
            r5 = r16
        L_0x0173:
            sun.misc.Unsafe r8 = f12554s
            java.lang.Object[] r2 = r0.f12417c
            com.fyber.inneractive.sdk.protobuf.q0 r6 = r0.f12415a
            java.lang.Class r6 = r6.getClass()
            r19 = r5
            int r5 = r12 * 3
            int[] r5 = new int[r5]
            int r12 = r12 * 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r20 = r15 + r13
            r13 = r7
            r22 = r15
            r7 = r19
            r23 = r20
            r19 = 0
            r21 = 0
        L_0x0194:
            if (r7 >= r3) goto L_0x03ee
            int r24 = r7 + 1
            char r7 = r1.charAt(r7)
            r25 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r3) goto L_0x01c8
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r3 = r24
            r24 = 13
        L_0x01a9:
            int r26 = r3 + 1
            char r3 = r1.charAt(r3)
            r27 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r15) goto L_0x01c2
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r7 = r7 | r3
            int r24 = r24 + 13
            r3 = r26
            r15 = r27
            goto L_0x01a9
        L_0x01c2:
            int r3 = r3 << r24
            r7 = r7 | r3
            r3 = r26
            goto L_0x01cc
        L_0x01c8:
            r27 = r15
            r3 = r24
        L_0x01cc:
            int r15 = r3 + 1
            char r3 = r1.charAt(r3)
            r24 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r15) goto L_0x01fe
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r15 = r24
            r24 = 13
        L_0x01df:
            int r26 = r15 + 1
            char r15 = r1.charAt(r15)
            r28 = r10
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x01f8
            r10 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r24
            r3 = r3 | r10
            int r24 = r24 + 13
            r15 = r26
            r10 = r28
            goto L_0x01df
        L_0x01f8:
            int r10 = r15 << r24
            r3 = r3 | r10
            r15 = r26
            goto L_0x0202
        L_0x01fe:
            r28 = r10
            r15 = r24
        L_0x0202:
            r10 = r3 & 255(0xff, float:3.57E-43)
            r24 = r9
            r9 = r3 & 1024(0x400, float:1.435E-42)
            if (r9 == 0) goto L_0x0210
            int r9 = r19 + 1
            r14[r19] = r21
            r19 = r9
        L_0x0210:
            r9 = 51
            r30 = r0
            if (r10 < r9) goto L_0x02af
            int r9 = r15 + 1
            char r15 = r1.charAt(r15)
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r0) goto L_0x023f
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r31 = 13
        L_0x0225:
            int r32 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r0) goto L_0x023a
            r0 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r31
            r15 = r15 | r0
            int r31 = r31 + 13
            r9 = r32
            r0 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0225
        L_0x023a:
            int r0 = r9 << r31
            r15 = r15 | r0
            r9 = r32
        L_0x023f:
            int r0 = r10 + -51
            r31 = r9
            r9 = 9
            if (r0 == r9) goto L_0x025f
            r9 = 17
            if (r0 != r9) goto L_0x024c
            goto L_0x025f
        L_0x024c:
            r9 = 12
            if (r0 != r9) goto L_0x026c
            if (r11 != 0) goto L_0x026c
            int r0 = r21 / 3
            int r0 = r0 * 2
            r9 = 1
            int r0 = r0 + r9
            int r9 = r13 + 1
            r13 = r2[r13]
            r12[r0] = r13
            goto L_0x026b
        L_0x025f:
            int r0 = r21 / 3
            int r0 = r0 * 2
            r9 = 1
            int r0 = r0 + r9
            int r9 = r13 + 1
            r13 = r2[r13]
            r12[r0] = r13
        L_0x026b:
            r13 = r9
        L_0x026c:
            int r15 = r15 * 2
            r0 = r2[r15]
            boolean r9 = r0 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L_0x0277
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            goto L_0x027f
        L_0x0277:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.reflect.Field r0 = m9528a((java.lang.Class<?>) r6, (java.lang.String) r0)
            r2[r15] = r0
        L_0x027f:
            r9 = r4
            r32 = r5
            long r4 = r8.objectFieldOffset(r0)
            int r0 = (int) r4
            int r15 = r15 + 1
            r4 = r2[r15]
            boolean r5 = r4 instanceof java.lang.reflect.Field
            if (r5 == 0) goto L_0x0292
            java.lang.reflect.Field r4 = (java.lang.reflect.Field) r4
            goto L_0x029a
        L_0x0292:
            java.lang.String r4 = (java.lang.String) r4
            java.lang.reflect.Field r4 = m9528a((java.lang.Class<?>) r6, (java.lang.String) r4)
            r2[r15] = r4
        L_0x029a:
            long r4 = r8.objectFieldOffset(r4)
            int r5 = (int) r4
            r4 = r0
            r18 = r1
            r15 = r31
            r0 = 55296(0xd800, float:7.7486E-41)
            r17 = 1
            r31 = r13
            r13 = r6
            r6 = 0
            goto L_0x03b5
        L_0x02af:
            r9 = r4
            r32 = r5
            int r0 = r13 + 1
            r4 = r2[r13]
            java.lang.String r4 = (java.lang.String) r4
            java.lang.reflect.Field r4 = m9528a((java.lang.Class<?>) r6, (java.lang.String) r4)
            r5 = 49
            r13 = 9
            if (r10 == r13) goto L_0x0326
            r13 = 17
            if (r10 != r13) goto L_0x02c7
            goto L_0x0326
        L_0x02c7:
            r13 = 27
            if (r10 == r13) goto L_0x0314
            if (r10 != r5) goto L_0x02ce
            goto L_0x0314
        L_0x02ce:
            r13 = 12
            if (r10 == r13) goto L_0x0303
            r13 = 30
            if (r10 == r13) goto L_0x0303
            r13 = 44
            if (r10 != r13) goto L_0x02db
            goto L_0x0303
        L_0x02db:
            r13 = 50
            if (r10 != r13) goto L_0x0300
            int r13 = r22 + 1
            r14[r22] = r21
            int r22 = r21 / 3
            int r22 = r22 * 2
            int r26 = r0 + 1
            r0 = r2[r0]
            r12[r22] = r0
            r0 = r3 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x02fc
            int r22 = r22 + 1
            int r0 = r26 + 1
            r26 = r2[r26]
            r12[r22] = r26
            r22 = r13
            goto L_0x0300
        L_0x02fc:
            r22 = r13
            r0 = r26
        L_0x0300:
            r17 = 1
            goto L_0x0334
        L_0x0303:
            if (r11 != 0) goto L_0x0300
            int r13 = r21 / 3
            int r13 = r13 * 2
            r17 = 1
            int r13 = r13 + 1
            int r26 = r0 + 1
            r0 = r2[r0]
            r12[r13] = r0
            goto L_0x0322
        L_0x0314:
            r17 = 1
            int r13 = r21 / 3
            int r13 = r13 * 2
            int r13 = r13 + 1
            int r26 = r0 + 1
            r0 = r2[r0]
            r12[r13] = r0
        L_0x0322:
            r13 = r6
            r0 = r26
            goto L_0x0335
        L_0x0326:
            r17 = 1
            int r13 = r21 / 3
            int r13 = r13 * 2
            int r13 = r13 + 1
            java.lang.Class r26 = r4.getType()
            r12[r13] = r26
        L_0x0334:
            r13 = r6
        L_0x0335:
            long r5 = r8.objectFieldOffset(r4)
            int r4 = (int) r5
            r5 = r3 & 4096(0x1000, float:5.74E-42)
            r6 = 4096(0x1000, float:5.74E-42)
            if (r5 != r6) goto L_0x0342
            r5 = 1
            goto L_0x0343
        L_0x0342:
            r5 = 0
        L_0x0343:
            if (r5 == 0) goto L_0x0399
            r5 = 17
            if (r10 > r5) goto L_0x0399
            int r5 = r15 + 1
            char r6 = r1.charAt(r15)
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r15) goto L_0x036e
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r18 = 13
        L_0x0358:
            int r29 = r5 + 1
            char r5 = r1.charAt(r5)
            if (r5 < r15) goto L_0x036a
            r5 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r5 = r5 << r18
            r6 = r6 | r5
            int r18 = r18 + 13
            r5 = r29
            goto L_0x0358
        L_0x036a:
            int r5 = r5 << r18
            r6 = r6 | r5
            goto L_0x0370
        L_0x036e:
            r29 = r5
        L_0x0370:
            int r5 = r9 * 2
            int r18 = r6 / 32
            int r18 = r18 + r5
            r5 = r2[r18]
            boolean r15 = r5 instanceof java.lang.reflect.Field
            if (r15 == 0) goto L_0x037f
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            goto L_0x0387
        L_0x037f:
            java.lang.String r5 = (java.lang.String) r5
            java.lang.reflect.Field r5 = m9528a((java.lang.Class<?>) r13, (java.lang.String) r5)
            r2[r18] = r5
        L_0x0387:
            r31 = r0
            r18 = r1
            long r0 = r8.objectFieldOffset(r5)
            int r1 = (int) r0
            int r6 = r6 % 32
            r5 = r1
            r15 = r29
            r0 = 55296(0xd800, float:7.7486E-41)
            goto L_0x03a7
        L_0x0399:
            r31 = r0
            r18 = r1
            r0 = 55296(0xd800, float:7.7486E-41)
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r6 = 0
        L_0x03a7:
            r1 = 18
            if (r10 < r1) goto L_0x03b5
            r1 = 49
            if (r10 > r1) goto L_0x03b5
            int r1 = r23 + 1
            r14[r23] = r4
            r23 = r1
        L_0x03b5:
            int r1 = r21 + 1
            r32[r21] = r7
            int r7 = r1 + 1
            r0 = r3 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x03c2
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03c3
        L_0x03c2:
            r0 = 0
        L_0x03c3:
            r3 = r3 & 256(0x100, float:3.59E-43)
            if (r3 == 0) goto L_0x03ca
            r3 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03cb
        L_0x03ca:
            r3 = 0
        L_0x03cb:
            r0 = r0 | r3
            int r3 = r10 << 20
            r0 = r0 | r3
            r0 = r0 | r4
            r32[r1] = r0
            int r21 = r7 + 1
            int r0 = r6 << 20
            r0 = r0 | r5
            r32[r7] = r0
            r4 = r9
            r6 = r13
            r7 = r15
            r1 = r18
            r9 = r24
            r3 = r25
            r15 = r27
            r10 = r28
            r0 = r30
            r13 = r31
            r5 = r32
            goto L_0x0194
        L_0x03ee:
            r30 = r0
            r32 = r5
            r24 = r9
            r28 = r10
            r27 = r15
            com.fyber.inneractive.sdk.protobuf.t0 r0 = new com.fyber.inneractive.sdk.protobuf.t0
            r1 = r30
            com.fyber.inneractive.sdk.protobuf.q0 r10 = r1.f12415a
            r1 = 0
            r2 = r32
            r5 = r0
            r6 = r2
            r7 = r12
            r8 = r24
            r9 = r28
            r12 = r1
            r13 = r14
            r14 = r27
            r15 = r20
            r16 = r34
            r17 = r35
            r18 = r36
            r19 = r37
            r20 = r38
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        L_0x041c:
            com.fyber.inneractive.sdk.protobuf.j1 r0 = (com.fyber.inneractive.sdk.protobuf.C3536j1) r0
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C3583t0.m9527a(com.fyber.inneractive.sdk.protobuf.o0, com.fyber.inneractive.sdk.protobuf.v0, com.fyber.inneractive.sdk.protobuf.g0, com.fyber.inneractive.sdk.protobuf.m1, com.fyber.inneractive.sdk.protobuf.r, com.fyber.inneractive.sdk.protobuf.l0):com.fyber.inneractive.sdk.protobuf.t0");
    }

    /* renamed from: d */
    public static long m9533d(int i) {
        return (long) (i & 1048575);
    }

    /* renamed from: e */
    public static C3553n1 m9535e(Object obj) {
        GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) obj;
        C3553n1 n1Var = generatedMessageLite.unknownFields;
        if (n1Var != C3553n1.f12524f) {
            return n1Var;
        }
        C3553n1 c = C3553n1.m9372c();
        generatedMessageLite.unknownFields = c;
        return c;
    }

    /* renamed from: f */
    public static int m9536f(int i) {
        return (i & 267386880) >>> 20;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01d4, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r10, r5) == com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r11, r5)) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01ef, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r10, r5) == com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r11, r5)) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x020c, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r10, r5) == com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r11, r5)) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C3507h1.m8934a(com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r10, r5), com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r11, r5)) != false) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0228, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r10, r5) == com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r11, r5)) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x024c, code lost:
        if (java.lang.Float.floatToIntBits(r4.mo15177d(r10, r5)) == java.lang.Float.floatToIntBits(r4.mo15177d(r11, r5))) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0272, code lost:
        if (java.lang.Double.doubleToLongBits(r4.mo15176c(r10, r5)) == java.lang.Double.doubleToLongBits(r4.mo15176c(r11, r5))) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0275, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007c, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C3507h1.m8934a(com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r10, r5), com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r11, r5)) != false) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0099, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r10, r5) == com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r11, r5)) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b4, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r10, r5) == com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r11, r5)) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d1, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r10, r5) == com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r11, r5)) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ec, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r10, r5) == com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r11, r5)) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0107, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r10, r5) == com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r11, r5)) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0122, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r10, r5) == com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r11, r5)) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0141, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C3507h1.m8934a(com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r10, r5), com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r11, r5)) != false) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0160, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C3507h1.m8934a(com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r10, r5), com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r11, r5)) != false) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x017f, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C3507h1.m8934a(com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r10, r5), com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r11, r5)) != false) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x019c, code lost:
        if (r4.mo15173a(r10, r5) == r4.mo15173a(r11, r5)) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01b7, code lost:
        if (com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r10, r5) == com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r11, r5)) goto L_0x0276;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo14897b(T r10, T r11) {
        /*
            r9 = this;
            int[] r0 = r9.f12555a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            r3 = 1
            if (r2 >= r0) goto L_0x027d
            int[] r4 = r9.f12555a
            int r5 = r2 + 1
            r4 = r4[r5]
            long r5 = m9533d((int) r4)
            int r4 = m9536f(r4)
            switch(r4) {
                case 0: goto L_0x024f;
                case 1: goto L_0x022b;
                case 2: goto L_0x020f;
                case 3: goto L_0x01f3;
                case 4: goto L_0x01d8;
                case 5: goto L_0x01bb;
                case 6: goto L_0x01a0;
                case 7: goto L_0x0183;
                case 8: goto L_0x0164;
                case 9: goto L_0x0145;
                case 10: goto L_0x0126;
                case 11: goto L_0x010b;
                case 12: goto L_0x00f0;
                case 13: goto L_0x00d5;
                case 14: goto L_0x00b8;
                case 15: goto L_0x009d;
                case 16: goto L_0x0080;
                case 17: goto L_0x0061;
                case 18: goto L_0x0053;
                case 19: goto L_0x0053;
                case 20: goto L_0x0053;
                case 21: goto L_0x0053;
                case 22: goto L_0x0053;
                case 23: goto L_0x0053;
                case 24: goto L_0x0053;
                case 25: goto L_0x0053;
                case 26: goto L_0x0053;
                case 27: goto L_0x0053;
                case 28: goto L_0x0053;
                case 29: goto L_0x0053;
                case 30: goto L_0x0053;
                case 31: goto L_0x0053;
                case 32: goto L_0x0053;
                case 33: goto L_0x0053;
                case 34: goto L_0x0053;
                case 35: goto L_0x0053;
                case 36: goto L_0x0053;
                case 37: goto L_0x0053;
                case 38: goto L_0x0053;
                case 39: goto L_0x0053;
                case 40: goto L_0x0053;
                case 41: goto L_0x0053;
                case 42: goto L_0x0053;
                case 43: goto L_0x0053;
                case 44: goto L_0x0053;
                case 45: goto L_0x0053;
                case 46: goto L_0x0053;
                case 47: goto L_0x0053;
                case 48: goto L_0x0053;
                case 49: goto L_0x0053;
                case 50: goto L_0x0045;
                case 51: goto L_0x001b;
                case 52: goto L_0x001b;
                case 53: goto L_0x001b;
                case 54: goto L_0x001b;
                case 55: goto L_0x001b;
                case 56: goto L_0x001b;
                case 57: goto L_0x001b;
                case 58: goto L_0x001b;
                case 59: goto L_0x001b;
                case 60: goto L_0x001b;
                case 61: goto L_0x001b;
                case 62: goto L_0x001b;
                case 63: goto L_0x001b;
                case 64: goto L_0x001b;
                case 65: goto L_0x001b;
                case 66: goto L_0x001b;
                case 67: goto L_0x001b;
                case 68: goto L_0x001b;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x0276
        L_0x001b:
            int[] r4 = r9.f12555a
            int r7 = r2 + 2
            r4 = r4[r7]
            r7 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r7
            long r7 = (long) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r10, r7)
            int r7 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r11, r7)
            if (r4 != r7) goto L_0x0032
            r4 = 1
            goto L_0x0033
        L_0x0032:
            r4 = 0
        L_0x0033:
            if (r4 == 0) goto L_0x0275
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r10, r5)
            java.lang.Object r5 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r11, r5)
            boolean r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8934a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x0275
            goto L_0x0276
        L_0x0045:
            java.lang.Object r3 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r10, r5)
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r11, r5)
            boolean r3 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8934a((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x0276
        L_0x0053:
            java.lang.Object r3 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r10, r5)
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r11, r5)
            boolean r3 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8934a((java.lang.Object) r3, (java.lang.Object) r4)
            goto L_0x0276
        L_0x0061:
            boolean r4 = r9.mo15199a(r10, (int) r2)
            boolean r7 = r9.mo15199a(r11, (int) r2)
            if (r4 != r7) goto L_0x006d
            r4 = 1
            goto L_0x006e
        L_0x006d:
            r4 = 0
        L_0x006e:
            if (r4 == 0) goto L_0x0275
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r10, r5)
            java.lang.Object r5 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r11, r5)
            boolean r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8934a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x0275
            goto L_0x0276
        L_0x0080:
            boolean r4 = r9.mo15199a(r10, (int) r2)
            boolean r7 = r9.mo15199a(r11, (int) r2)
            if (r4 != r7) goto L_0x008c
            r4 = 1
            goto L_0x008d
        L_0x008c:
            r4 = 0
        L_0x008d:
            if (r4 == 0) goto L_0x0275
            long r7 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r10, r5)
            long r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r11, r5)
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0275
            goto L_0x0276
        L_0x009d:
            boolean r4 = r9.mo15199a(r10, (int) r2)
            boolean r7 = r9.mo15199a(r11, (int) r2)
            if (r4 != r7) goto L_0x00a9
            r4 = 1
            goto L_0x00aa
        L_0x00a9:
            r4 = 0
        L_0x00aa:
            if (r4 == 0) goto L_0x0275
            int r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r10, r5)
            int r5 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r11, r5)
            if (r4 != r5) goto L_0x0275
            goto L_0x0276
        L_0x00b8:
            boolean r4 = r9.mo15199a(r10, (int) r2)
            boolean r7 = r9.mo15199a(r11, (int) r2)
            if (r4 != r7) goto L_0x00c4
            r4 = 1
            goto L_0x00c5
        L_0x00c4:
            r4 = 0
        L_0x00c5:
            if (r4 == 0) goto L_0x0275
            long r7 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r10, r5)
            long r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r11, r5)
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0275
            goto L_0x0276
        L_0x00d5:
            boolean r4 = r9.mo15199a(r10, (int) r2)
            boolean r7 = r9.mo15199a(r11, (int) r2)
            if (r4 != r7) goto L_0x00e1
            r4 = 1
            goto L_0x00e2
        L_0x00e1:
            r4 = 0
        L_0x00e2:
            if (r4 == 0) goto L_0x0275
            int r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r10, r5)
            int r5 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r11, r5)
            if (r4 != r5) goto L_0x0275
            goto L_0x0276
        L_0x00f0:
            boolean r4 = r9.mo15199a(r10, (int) r2)
            boolean r7 = r9.mo15199a(r11, (int) r2)
            if (r4 != r7) goto L_0x00fc
            r4 = 1
            goto L_0x00fd
        L_0x00fc:
            r4 = 0
        L_0x00fd:
            if (r4 == 0) goto L_0x0275
            int r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r10, r5)
            int r5 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r11, r5)
            if (r4 != r5) goto L_0x0275
            goto L_0x0276
        L_0x010b:
            boolean r4 = r9.mo15199a(r10, (int) r2)
            boolean r7 = r9.mo15199a(r11, (int) r2)
            if (r4 != r7) goto L_0x0117
            r4 = 1
            goto L_0x0118
        L_0x0117:
            r4 = 0
        L_0x0118:
            if (r4 == 0) goto L_0x0275
            int r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r10, r5)
            int r5 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r11, r5)
            if (r4 != r5) goto L_0x0275
            goto L_0x0276
        L_0x0126:
            boolean r4 = r9.mo15199a(r10, (int) r2)
            boolean r7 = r9.mo15199a(r11, (int) r2)
            if (r4 != r7) goto L_0x0132
            r4 = 1
            goto L_0x0133
        L_0x0132:
            r4 = 0
        L_0x0133:
            if (r4 == 0) goto L_0x0275
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r10, r5)
            java.lang.Object r5 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r11, r5)
            boolean r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8934a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x0275
            goto L_0x0276
        L_0x0145:
            boolean r4 = r9.mo15199a(r10, (int) r2)
            boolean r7 = r9.mo15199a(r11, (int) r2)
            if (r4 != r7) goto L_0x0151
            r4 = 1
            goto L_0x0152
        L_0x0151:
            r4 = 0
        L_0x0152:
            if (r4 == 0) goto L_0x0275
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r10, r5)
            java.lang.Object r5 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r11, r5)
            boolean r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8934a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x0275
            goto L_0x0276
        L_0x0164:
            boolean r4 = r9.mo15199a(r10, (int) r2)
            boolean r7 = r9.mo15199a(r11, (int) r2)
            if (r4 != r7) goto L_0x0170
            r4 = 1
            goto L_0x0171
        L_0x0170:
            r4 = 0
        L_0x0171:
            if (r4 == 0) goto L_0x0275
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r10, r5)
            java.lang.Object r5 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r11, r5)
            boolean r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8934a((java.lang.Object) r4, (java.lang.Object) r5)
            if (r4 == 0) goto L_0x0275
            goto L_0x0276
        L_0x0183:
            boolean r4 = r9.mo15199a(r10, (int) r2)
            boolean r7 = r9.mo15199a(r11, (int) r2)
            if (r4 != r7) goto L_0x018f
            r4 = 1
            goto L_0x0190
        L_0x018f:
            r4 = 0
        L_0x0190:
            if (r4 == 0) goto L_0x0275
            com.fyber.inneractive.sdk.protobuf.r1$d r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.f12543e
            boolean r7 = r4.mo15173a(r10, r5)
            boolean r4 = r4.mo15173a(r11, r5)
            if (r7 != r4) goto L_0x0275
            goto L_0x0276
        L_0x01a0:
            boolean r4 = r9.mo15199a(r10, (int) r2)
            boolean r7 = r9.mo15199a(r11, (int) r2)
            if (r4 != r7) goto L_0x01ac
            r4 = 1
            goto L_0x01ad
        L_0x01ac:
            r4 = 0
        L_0x01ad:
            if (r4 == 0) goto L_0x0275
            int r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r10, r5)
            int r5 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r11, r5)
            if (r4 != r5) goto L_0x0275
            goto L_0x0276
        L_0x01bb:
            boolean r4 = r9.mo15199a(r10, (int) r2)
            boolean r7 = r9.mo15199a(r11, (int) r2)
            if (r4 != r7) goto L_0x01c7
            r4 = 1
            goto L_0x01c8
        L_0x01c7:
            r4 = 0
        L_0x01c8:
            if (r4 == 0) goto L_0x0275
            long r7 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r10, r5)
            long r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r11, r5)
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0275
            goto L_0x0276
        L_0x01d8:
            boolean r4 = r9.mo15199a(r10, (int) r2)
            boolean r7 = r9.mo15199a(r11, (int) r2)
            if (r4 != r7) goto L_0x01e4
            r4 = 1
            goto L_0x01e5
        L_0x01e4:
            r4 = 0
        L_0x01e5:
            if (r4 == 0) goto L_0x0275
            int r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r10, r5)
            int r5 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r11, r5)
            if (r4 != r5) goto L_0x0275
            goto L_0x0276
        L_0x01f3:
            boolean r4 = r9.mo15199a(r10, (int) r2)
            boolean r7 = r9.mo15199a(r11, (int) r2)
            if (r4 != r7) goto L_0x01ff
            r4 = 1
            goto L_0x0200
        L_0x01ff:
            r4 = 0
        L_0x0200:
            if (r4 == 0) goto L_0x0275
            long r7 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r10, r5)
            long r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r11, r5)
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0275
            goto L_0x0276
        L_0x020f:
            boolean r4 = r9.mo15199a(r10, (int) r2)
            boolean r7 = r9.mo15199a(r11, (int) r2)
            if (r4 != r7) goto L_0x021b
            r4 = 1
            goto L_0x021c
        L_0x021b:
            r4 = 0
        L_0x021c:
            if (r4 == 0) goto L_0x0275
            long r7 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r10, r5)
            long r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r11, r5)
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0275
            goto L_0x0276
        L_0x022b:
            boolean r4 = r9.mo15199a(r10, (int) r2)
            boolean r7 = r9.mo15199a(r11, (int) r2)
            if (r4 != r7) goto L_0x0237
            r4 = 1
            goto L_0x0238
        L_0x0237:
            r4 = 0
        L_0x0238:
            if (r4 == 0) goto L_0x0275
            com.fyber.inneractive.sdk.protobuf.r1$d r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.f12543e
            float r7 = r4.mo15177d(r10, r5)
            int r7 = java.lang.Float.floatToIntBits(r7)
            float r4 = r4.mo15177d(r11, r5)
            int r4 = java.lang.Float.floatToIntBits(r4)
            if (r7 != r4) goto L_0x0275
            goto L_0x0276
        L_0x024f:
            boolean r4 = r9.mo15199a(r10, (int) r2)
            boolean r7 = r9.mo15199a(r11, (int) r2)
            if (r4 != r7) goto L_0x025b
            r4 = 1
            goto L_0x025c
        L_0x025b:
            r4 = 0
        L_0x025c:
            if (r4 == 0) goto L_0x0275
            com.fyber.inneractive.sdk.protobuf.r1$d r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.f12543e
            double r7 = r4.mo15176c(r10, r5)
            long r7 = java.lang.Double.doubleToLongBits(r7)
            double r4 = r4.mo15176c(r11, r5)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            int r6 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0275
            goto L_0x0276
        L_0x0275:
            r3 = 0
        L_0x0276:
            if (r3 != 0) goto L_0x0279
            return r1
        L_0x0279:
            int r2 = r2 + 3
            goto L_0x0005
        L_0x027d:
            com.fyber.inneractive.sdk.protobuf.m1<?, ?> r0 = r9.f12569o
            java.lang.Object r0 = r0.mo15115b(r10)
            com.fyber.inneractive.sdk.protobuf.m1<?, ?> r2 = r9.f12569o
            java.lang.Object r2 = r2.mo15115b(r11)
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0290
            return r1
        L_0x0290:
            boolean r0 = r9.f12560f
            if (r0 == 0) goto L_0x02a5
            com.fyber.inneractive.sdk.protobuf.r<?> r0 = r9.f12570p
            com.fyber.inneractive.sdk.protobuf.u r10 = r0.mo15158a((java.lang.Object) r10)
            com.fyber.inneractive.sdk.protobuf.r<?> r0 = r9.f12570p
            com.fyber.inneractive.sdk.protobuf.u r11 = r0.mo15158a((java.lang.Object) r11)
            boolean r10 = r10.equals(r11)
            return r10
        L_0x02a5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C3583t0.mo14897b(java.lang.Object, java.lang.Object):boolean");
    }

    /* renamed from: c */
    public final C3498f1 mo15207c(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f12556b;
        C3498f1 f1Var = (C3498f1) objArr[i2];
        if (f1Var != null) {
            return f1Var;
        }
        C3498f1 a = C3481b1.f12402c.mo14786a((Class) objArr[i2 + 1]);
        this.f12556b[i2] = a;
        return a;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c1, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x022b, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x022c, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo14899d(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f12555a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x0230
            int r3 = r8.mo15209g(r1)
            int[] r4 = r8.f12555a
            r4 = r4[r1]
            long r5 = m9533d((int) r3)
            int r3 = m9536f(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x021b;
                case 1: goto L_0x020e;
                case 2: goto L_0x0203;
                case 3: goto L_0x01f8;
                case 4: goto L_0x01f1;
                case 5: goto L_0x01e6;
                case 6: goto L_0x01df;
                case 7: goto L_0x01d2;
                case 8: goto L_0x01c5;
                case 9: goto L_0x01b7;
                case 10: goto L_0x01ab;
                case 11: goto L_0x01a3;
                case 12: goto L_0x019b;
                case 13: goto L_0x0193;
                case 14: goto L_0x0187;
                case 15: goto L_0x017f;
                case 16: goto L_0x0173;
                case 17: goto L_0x0168;
                case 18: goto L_0x015c;
                case 19: goto L_0x015c;
                case 20: goto L_0x015c;
                case 21: goto L_0x015c;
                case 22: goto L_0x015c;
                case 23: goto L_0x015c;
                case 24: goto L_0x015c;
                case 25: goto L_0x015c;
                case 26: goto L_0x015c;
                case 27: goto L_0x015c;
                case 28: goto L_0x015c;
                case 29: goto L_0x015c;
                case 30: goto L_0x015c;
                case 31: goto L_0x015c;
                case 32: goto L_0x015c;
                case 33: goto L_0x015c;
                case 34: goto L_0x015c;
                case 35: goto L_0x015c;
                case 36: goto L_0x015c;
                case 37: goto L_0x015c;
                case 38: goto L_0x015c;
                case 39: goto L_0x015c;
                case 40: goto L_0x015c;
                case 41: goto L_0x015c;
                case 42: goto L_0x015c;
                case 43: goto L_0x015c;
                case 44: goto L_0x015c;
                case 45: goto L_0x015c;
                case 46: goto L_0x015c;
                case 47: goto L_0x015c;
                case 48: goto L_0x015c;
                case 49: goto L_0x015c;
                case 50: goto L_0x0150;
                case 51: goto L_0x013a;
                case 52: goto L_0x0128;
                case 53: goto L_0x0116;
                case 54: goto L_0x0104;
                case 55: goto L_0x00f6;
                case 56: goto L_0x00e4;
                case 57: goto L_0x00d6;
                case 58: goto L_0x00c4;
                case 59: goto L_0x00b0;
                case 60: goto L_0x009e;
                case 61: goto L_0x008c;
                case 62: goto L_0x007e;
                case 63: goto L_0x0070;
                case 64: goto L_0x0062;
                case 65: goto L_0x0050;
                case 66: goto L_0x0042;
                case 67: goto L_0x0030;
                case 68: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x022c
        L_0x001e:
            boolean r3 = r8.mo15200a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            java.lang.Object r3 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x022b
        L_0x0030:
            boolean r3 = r8.mo15200a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            long r3 = m9534e(r9, r5)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3609z.m9635a((long) r3)
            goto L_0x022b
        L_0x0042:
            boolean r3 = r8.mo15200a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            int r3 = m9532d(r9, r5)
            goto L_0x022b
        L_0x0050:
            boolean r3 = r8.mo15200a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            long r3 = m9534e(r9, r5)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3609z.m9635a((long) r3)
            goto L_0x022b
        L_0x0062:
            boolean r3 = r8.mo15200a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            int r3 = m9532d(r9, r5)
            goto L_0x022b
        L_0x0070:
            boolean r3 = r8.mo15200a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            int r3 = m9532d(r9, r5)
            goto L_0x022b
        L_0x007e:
            boolean r3 = r8.mo15200a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            int r3 = m9532d(r9, r5)
            goto L_0x022b
        L_0x008c:
            boolean r3 = r8.mo15200a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            java.lang.Object r3 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x022b
        L_0x009e:
            boolean r3 = r8.mo15200a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            java.lang.Object r3 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x022b
        L_0x00b0:
            boolean r3 = r8.mo15200a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            java.lang.Object r3 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x022b
        L_0x00c4:
            boolean r3 = r8.mo15200a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            boolean r3 = m9529a(r9, (long) r5)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3609z.m9636a((boolean) r3)
            goto L_0x022b
        L_0x00d6:
            boolean r3 = r8.mo15200a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            int r3 = m9532d(r9, r5)
            goto L_0x022b
        L_0x00e4:
            boolean r3 = r8.mo15200a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            long r3 = m9534e(r9, r5)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3609z.m9635a((long) r3)
            goto L_0x022b
        L_0x00f6:
            boolean r3 = r8.mo15200a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            int r3 = m9532d(r9, r5)
            goto L_0x022b
        L_0x0104:
            boolean r3 = r8.mo15200a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            long r3 = m9534e(r9, r5)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3609z.m9635a((long) r3)
            goto L_0x022b
        L_0x0116:
            boolean r3 = r8.mo15200a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            long r3 = m9534e(r9, r5)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3609z.m9635a((long) r3)
            goto L_0x022b
        L_0x0128:
            boolean r3 = r8.mo15200a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            float r3 = m9531c(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x022b
        L_0x013a:
            boolean r3 = r8.mo15200a(r9, (int) r4, (int) r1)
            if (r3 == 0) goto L_0x022c
            int r2 = r2 * 53
            double r3 = m9530b(r9, (long) r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3609z.m9635a((long) r3)
            goto L_0x022b
        L_0x0150:
            int r2 = r2 * 53
            java.lang.Object r3 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x022b
        L_0x015c:
            int r2 = r2 * 53
            java.lang.Object r3 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x022b
        L_0x0168:
            java.lang.Object r3 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
            goto L_0x01c1
        L_0x0173:
            int r2 = r2 * 53
            long r3 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r9, r5)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3609z.m9635a((long) r3)
            goto L_0x022b
        L_0x017f:
            int r2 = r2 * 53
            int r3 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r9, r5)
            goto L_0x022b
        L_0x0187:
            int r2 = r2 * 53
            long r3 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r9, r5)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3609z.m9635a((long) r3)
            goto L_0x022b
        L_0x0193:
            int r2 = r2 * 53
            int r3 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r9, r5)
            goto L_0x022b
        L_0x019b:
            int r2 = r2 * 53
            int r3 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r9, r5)
            goto L_0x022b
        L_0x01a3:
            int r2 = r2 * 53
            int r3 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r9, r5)
            goto L_0x022b
        L_0x01ab:
            int r2 = r2 * 53
            java.lang.Object r3 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x022b
        L_0x01b7:
            java.lang.Object r3 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
        L_0x01c1:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x022c
        L_0x01c5:
            int r2 = r2 * 53
            java.lang.Object r3 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x022b
        L_0x01d2:
            int r2 = r2 * 53
            com.fyber.inneractive.sdk.protobuf.r1$d r3 = com.fyber.inneractive.sdk.protobuf.C3569r1.f12543e
            boolean r3 = r3.mo15173a(r9, r5)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3609z.m9636a((boolean) r3)
            goto L_0x022b
        L_0x01df:
            int r2 = r2 * 53
            int r3 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r9, r5)
            goto L_0x022b
        L_0x01e6:
            int r2 = r2 * 53
            long r3 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r9, r5)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3609z.m9635a((long) r3)
            goto L_0x022b
        L_0x01f1:
            int r2 = r2 * 53
            int r3 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r9, r5)
            goto L_0x022b
        L_0x01f8:
            int r2 = r2 * 53
            long r3 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r9, r5)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3609z.m9635a((long) r3)
            goto L_0x022b
        L_0x0203:
            int r2 = r2 * 53
            long r3 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r9, r5)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3609z.m9635a((long) r3)
            goto L_0x022b
        L_0x020e:
            int r2 = r2 * 53
            com.fyber.inneractive.sdk.protobuf.r1$d r3 = com.fyber.inneractive.sdk.protobuf.C3569r1.f12543e
            float r3 = r3.mo15177d(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x022b
        L_0x021b:
            int r2 = r2 * 53
            com.fyber.inneractive.sdk.protobuf.r1$d r3 = com.fyber.inneractive.sdk.protobuf.C3569r1.f12543e
            double r3 = r3.mo15176c(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3609z.m9635a((long) r3)
        L_0x022b:
            int r2 = r2 + r3
        L_0x022c:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x0230:
            int r2 = r2 * 53
            com.fyber.inneractive.sdk.protobuf.m1<?, ?> r0 = r8.f12569o
            java.lang.Object r0 = r0.mo15115b(r9)
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            boolean r1 = r8.f12560f
            if (r1 == 0) goto L_0x0250
            int r0 = r0 * 53
            com.fyber.inneractive.sdk.protobuf.r<?> r1 = r8.f12570p
            com.fyber.inneractive.sdk.protobuf.u r9 = r1.mo15158a((java.lang.Object) r9)
            com.fyber.inneractive.sdk.protobuf.i1<T, java.lang.Object> r9 = r9.f12612a
            int r9 = r9.hashCode()
            int r0 = r0 + r9
        L_0x0250:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C3583t0.mo14899d(java.lang.Object):int");
    }

    /* renamed from: g */
    public final int mo15209g(int i) {
        return this.f12555a[i + 1];
    }

    /* renamed from: e */
    public static <T> long m9534e(T t, long j) {
        return ((Long) C3569r1.m9439g(t, j)).longValue();
    }

    /* renamed from: c */
    public void mo14898c(T t) {
        int i;
        int i2 = this.f12565k;
        while (true) {
            i = this.f12566l;
            if (i2 >= i) {
                break;
            }
            long d = m9533d(mo15209g(this.f12564j[i2]));
            Object g = C3569r1.m9439g(t, d);
            if (g != null) {
                C3569r1.m9426a((Object) t, d, this.f12571q.mo15096e(g));
            }
            i2++;
        }
        int length = this.f12564j.length;
        while (i < length) {
            this.f12568n.mo14911a(t, (long) this.f12564j[i]);
            i++;
        }
        this.f12569o.mo15122e(t);
        if (this.f12560f) {
            this.f12570p.mo15166c(t);
        }
    }

    /* renamed from: e */
    public final int mo15208e(int i) {
        if (i < this.f12557c || i > this.f12558d) {
            return -1;
        }
        return mo15184a(i, 0);
    }

    /* renamed from: c */
    public static <T> float m9531c(T t, long j) {
        return ((Float) C3569r1.m9439g(t, j)).floatValue();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0324, code lost:
        r4 = r4 + (r5 + r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x050f, code lost:
        r4 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0511, code lost:
        r11 = r11 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0687, code lost:
        r13 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x06b7, code lost:
        r13 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x06ba, code lost:
        r11 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x06de, code lost:
        r13 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:0x0871, code lost:
        r3 = (r3 + r7) + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:411:0x08f0, code lost:
        r11 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x095e, code lost:
        r11 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0a68, code lost:
        r11 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0a88, code lost:
        r5 = r5 + r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0a8c, code lost:
        r4 = r4 + 3;
        r11 = r13;
        r6 = 1048575;
        r7 = 1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo14896b(T r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            boolean r2 = r0.f12562h
            r3 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r7 = 1
            r8 = 0
            r10 = 0
            if (r2 == 0) goto L_0x0522
            sun.misc.Unsafe r2 = f12554s
            r11 = 0
            r12 = 0
        L_0x0014:
            int[] r13 = r0.f12555a
            int r13 = r13.length
            if (r11 >= r13) goto L_0x0515
            int r13 = r0.mo15209g(r11)
            int r14 = m9536f(r13)
            int[] r15 = r0.f12555a
            r15 = r15[r11]
            long r4 = m9533d((int) r13)
            com.fyber.inneractive.sdk.protobuf.v r13 = com.fyber.inneractive.sdk.protobuf.C3600v.DOUBLE_LIST_PACKED
            int r13 = r13.f12623a
            if (r14 < r13) goto L_0x003d
            com.fyber.inneractive.sdk.protobuf.v r13 = com.fyber.inneractive.sdk.protobuf.C3600v.SINT64_LIST_PACKED
            int r13 = r13.f12623a
            if (r14 > r13) goto L_0x003d
            int[] r13 = r0.f12555a
            int r16 = r11 + 2
            r13 = r13[r16]
            r13 = r13 & r6
            goto L_0x003e
        L_0x003d:
            r13 = 0
        L_0x003e:
            switch(r14) {
                case 0: goto L_0x0503;
                case 1: goto L_0x04f8;
                case 2: goto L_0x04e9;
                case 3: goto L_0x04da;
                case 4: goto L_0x04cb;
                case 5: goto L_0x04c0;
                case 6: goto L_0x04b5;
                case 7: goto L_0x04aa;
                case 8: goto L_0x048c;
                case 9: goto L_0x0478;
                case 10: goto L_0x0466;
                case 11: goto L_0x0456;
                case 12: goto L_0x0446;
                case 13: goto L_0x043a;
                case 14: goto L_0x042e;
                case 15: goto L_0x041e;
                case 16: goto L_0x040e;
                case 17: goto L_0x03f8;
                case 18: goto L_0x03ec;
                case 19: goto L_0x03e0;
                case 20: goto L_0x03d4;
                case 21: goto L_0x03c8;
                case 22: goto L_0x03bc;
                case 23: goto L_0x03b0;
                case 24: goto L_0x03a4;
                case 25: goto L_0x0398;
                case 26: goto L_0x038c;
                case 27: goto L_0x037c;
                case 28: goto L_0x0370;
                case 29: goto L_0x0364;
                case 30: goto L_0x0358;
                case 31: goto L_0x034c;
                case 32: goto L_0x0340;
                case 33: goto L_0x0334;
                case 34: goto L_0x0328;
                case 35: goto L_0x0308;
                case 36: goto L_0x02eb;
                case 37: goto L_0x02ce;
                case 38: goto L_0x02b1;
                case 39: goto L_0x0293;
                case 40: goto L_0x0275;
                case 41: goto L_0x0257;
                case 42: goto L_0x0237;
                case 43: goto L_0x0219;
                case 44: goto L_0x01fb;
                case 45: goto L_0x01dd;
                case 46: goto L_0x01bf;
                case 47: goto L_0x01a1;
                case 48: goto L_0x0183;
                case 49: goto L_0x0173;
                case 50: goto L_0x0163;
                case 51: goto L_0x0155;
                case 52: goto L_0x0149;
                case 53: goto L_0x0139;
                case 54: goto L_0x0129;
                case 55: goto L_0x0119;
                case 56: goto L_0x010d;
                case 57: goto L_0x0101;
                case 58: goto L_0x00f5;
                case 59: goto L_0x00d7;
                case 60: goto L_0x00c3;
                case 61: goto L_0x00b1;
                case 62: goto L_0x00a1;
                case 63: goto L_0x0091;
                case 64: goto L_0x0085;
                case 65: goto L_0x0079;
                case 66: goto L_0x0069;
                case 67: goto L_0x0059;
                case 68: goto L_0x0043;
                default: goto L_0x0041;
            }
        L_0x0041:
            goto L_0x0511
        L_0x0043:
            boolean r13 = r0.mo15200a(r1, (int) r15, (int) r11)
            if (r13 == 0) goto L_0x0511
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r1, r4)
            com.fyber.inneractive.sdk.protobuf.q0 r4 = (com.fyber.inneractive.sdk.protobuf.C3564q0) r4
            com.fyber.inneractive.sdk.protobuf.f1 r5 = r0.mo15207c((int) r11)
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9229a(r15, r4, r5)
            goto L_0x0510
        L_0x0059:
            boolean r13 = r0.mo15200a(r1, (int) r15, (int) r11)
            if (r13 == 0) goto L_0x0511
            long r4 = m9534e(r1, r4)
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9246d((int) r15, (long) r4)
            goto L_0x0510
        L_0x0069:
            boolean r13 = r0.mo15200a(r1, (int) r15, (int) r11)
            if (r13 == 0) goto L_0x0511
            int r4 = m9532d(r1, r4)
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9247e((int) r15, (int) r4)
            goto L_0x0510
        L_0x0079:
            boolean r4 = r0.mo15200a(r1, (int) r15, (int) r11)
            if (r4 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9243c((int) r15, (long) r8)
            goto L_0x0510
        L_0x0085:
            boolean r4 = r0.mo15200a(r1, (int) r15, (int) r11)
            if (r4 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9245d((int) r15, (int) r10)
            goto L_0x0510
        L_0x0091:
            boolean r13 = r0.mo15200a(r1, (int) r15, (int) r11)
            if (r13 == 0) goto L_0x0511
            int r4 = m9532d(r1, r4)
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9226a((int) r15, (int) r4)
            goto L_0x0510
        L_0x00a1:
            boolean r13 = r0.mo15200a(r1, (int) r15, (int) r11)
            if (r13 == 0) goto L_0x0511
            int r4 = m9532d(r1, r4)
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9249f((int) r15, (int) r4)
            goto L_0x0510
        L_0x00b1:
            boolean r13 = r0.mo15200a(r1, (int) r15, (int) r11)
            if (r13 == 0) goto L_0x0511
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r1, r4)
            com.fyber.inneractive.sdk.protobuf.i r4 = (com.fyber.inneractive.sdk.protobuf.C3508i) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9228a((int) r15, (com.fyber.inneractive.sdk.protobuf.C3508i) r4)
            goto L_0x0510
        L_0x00c3:
            boolean r13 = r0.mo15200a(r1, (int) r15, (int) r11)
            if (r13 == 0) goto L_0x0511
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r1, r4)
            com.fyber.inneractive.sdk.protobuf.f1 r5 = r0.mo15207c((int) r11)
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8922a((int) r15, (java.lang.Object) r4, (com.fyber.inneractive.sdk.protobuf.C3498f1) r5)
            goto L_0x0510
        L_0x00d7:
            boolean r13 = r0.mo15200a(r1, (int) r15, (int) r11)
            if (r13 == 0) goto L_0x0511
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r1, r4)
            boolean r5 = r4 instanceof com.fyber.inneractive.sdk.protobuf.C3508i
            if (r5 == 0) goto L_0x00ed
            com.fyber.inneractive.sdk.protobuf.i r4 = (com.fyber.inneractive.sdk.protobuf.C3508i) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9228a((int) r15, (com.fyber.inneractive.sdk.protobuf.C3508i) r4)
            goto L_0x0510
        L_0x00ed:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9230a((int) r15, (java.lang.String) r4)
            goto L_0x0510
        L_0x00f5:
            boolean r4 = r0.mo15200a(r1, (int) r15, (int) r11)
            if (r4 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9231a((int) r15, (boolean) r7)
            goto L_0x0510
        L_0x0101:
            boolean r4 = r0.mo15200a(r1, (int) r15, (int) r11)
            if (r4 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9238b((int) r15, (int) r10)
            goto L_0x0510
        L_0x010d:
            boolean r4 = r0.mo15200a(r1, (int) r15, (int) r11)
            if (r4 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9227a((int) r15, (long) r8)
            goto L_0x0510
        L_0x0119:
            boolean r13 = r0.mo15200a(r1, (int) r15, (int) r11)
            if (r13 == 0) goto L_0x0511
            int r4 = m9532d(r1, r4)
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9242c((int) r15, (int) r4)
            goto L_0x0510
        L_0x0129:
            boolean r13 = r0.mo15200a(r1, (int) r15, (int) r11)
            if (r13 == 0) goto L_0x0511
            long r4 = m9534e(r1, r4)
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9248e((int) r15, (long) r4)
            goto L_0x0510
        L_0x0139:
            boolean r13 = r0.mo15200a(r1, (int) r15, (int) r11)
            if (r13 == 0) goto L_0x0511
            long r4 = m9534e(r1, r4)
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9239b((int) r15, (long) r4)
            goto L_0x0510
        L_0x0149:
            boolean r4 = r0.mo15200a(r1, (int) r15, (int) r11)
            if (r4 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9225a((int) r15, (float) r3)
            goto L_0x0510
        L_0x0155:
            boolean r4 = r0.mo15200a(r1, (int) r15, (int) r11)
            if (r4 == 0) goto L_0x0511
            r4 = 0
            int r13 = com.fyber.inneractive.sdk.protobuf.C3540l.m9224a((int) r15, (double) r4)
            goto L_0x050f
        L_0x0163:
            com.fyber.inneractive.sdk.protobuf.l0 r13 = r0.f12571q
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r1, r4)
            java.lang.Object r5 = r0.mo15201b((int) r11)
            int r4 = r13.mo15090a(r15, r4, r5)
            goto L_0x0510
        L_0x0173:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.fyber.inneractive.sdk.protobuf.f1 r5 = r0.mo15207c((int) r11)
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8924a((int) r15, (java.util.List<com.fyber.inneractive.sdk.protobuf.C3564q0>) r4, (com.fyber.inneractive.sdk.protobuf.C3498f1) r5)
            goto L_0x0510
        L_0x0183:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8955g(r4)
            if (r4 <= 0) goto L_0x0511
            boolean r5 = r0.f12563i
            if (r5 == 0) goto L_0x0197
            long r13 = (long) r13
            r2.putInt(r1, r13, r4)
        L_0x0197:
            int r5 = com.fyber.inneractive.sdk.protobuf.C3540l.m9237b((int) r15)
            int r13 = com.fyber.inneractive.sdk.protobuf.C3540l.m9241c((int) r4)
            goto L_0x0324
        L_0x01a1:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8952f(r4)
            if (r4 <= 0) goto L_0x0511
            boolean r5 = r0.f12563i
            if (r5 == 0) goto L_0x01b5
            long r13 = (long) r13
            r2.putInt(r1, r13, r4)
        L_0x01b5:
            int r5 = com.fyber.inneractive.sdk.protobuf.C3540l.m9237b((int) r15)
            int r13 = com.fyber.inneractive.sdk.protobuf.C3540l.m9241c((int) r4)
            goto L_0x0324
        L_0x01bf:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8943c(r4)
            if (r4 <= 0) goto L_0x0511
            boolean r5 = r0.f12563i
            if (r5 == 0) goto L_0x01d3
            long r13 = (long) r13
            r2.putInt(r1, r13, r4)
        L_0x01d3:
            int r5 = com.fyber.inneractive.sdk.protobuf.C3540l.m9237b((int) r15)
            int r13 = com.fyber.inneractive.sdk.protobuf.C3540l.m9241c((int) r4)
            goto L_0x0324
        L_0x01dd:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8938b(r4)
            if (r4 <= 0) goto L_0x0511
            boolean r5 = r0.f12563i
            if (r5 == 0) goto L_0x01f1
            long r13 = (long) r13
            r2.putInt(r1, r13, r4)
        L_0x01f1:
            int r5 = com.fyber.inneractive.sdk.protobuf.C3540l.m9237b((int) r15)
            int r13 = com.fyber.inneractive.sdk.protobuf.C3540l.m9241c((int) r4)
            goto L_0x0324
        L_0x01fb:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8926a((java.util.List<java.lang.Integer>) r4)
            if (r4 <= 0) goto L_0x0511
            boolean r5 = r0.f12563i
            if (r5 == 0) goto L_0x020f
            long r13 = (long) r13
            r2.putInt(r1, r13, r4)
        L_0x020f:
            int r5 = com.fyber.inneractive.sdk.protobuf.C3540l.m9237b((int) r15)
            int r13 = com.fyber.inneractive.sdk.protobuf.C3540l.m9241c((int) r4)
            goto L_0x0324
        L_0x0219:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8958h(r4)
            if (r4 <= 0) goto L_0x0511
            boolean r5 = r0.f12563i
            if (r5 == 0) goto L_0x022d
            long r13 = (long) r13
            r2.putInt(r1, r13, r4)
        L_0x022d:
            int r5 = com.fyber.inneractive.sdk.protobuf.C3540l.m9237b((int) r15)
            int r13 = com.fyber.inneractive.sdk.protobuf.C3540l.m9241c((int) r4)
            goto L_0x0324
        L_0x0237:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            java.lang.Class<?> r5 = com.fyber.inneractive.sdk.protobuf.C3507h1.f12439a
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0511
            boolean r5 = r0.f12563i
            if (r5 == 0) goto L_0x024d
            long r13 = (long) r13
            r2.putInt(r1, r13, r4)
        L_0x024d:
            int r5 = com.fyber.inneractive.sdk.protobuf.C3540l.m9237b((int) r15)
            int r13 = com.fyber.inneractive.sdk.protobuf.C3540l.m9241c((int) r4)
            goto L_0x0324
        L_0x0257:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8938b(r4)
            if (r4 <= 0) goto L_0x0511
            boolean r5 = r0.f12563i
            if (r5 == 0) goto L_0x026b
            long r13 = (long) r13
            r2.putInt(r1, r13, r4)
        L_0x026b:
            int r5 = com.fyber.inneractive.sdk.protobuf.C3540l.m9237b((int) r15)
            int r13 = com.fyber.inneractive.sdk.protobuf.C3540l.m9241c((int) r4)
            goto L_0x0324
        L_0x0275:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8943c(r4)
            if (r4 <= 0) goto L_0x0511
            boolean r5 = r0.f12563i
            if (r5 == 0) goto L_0x0289
            long r13 = (long) r13
            r2.putInt(r1, r13, r4)
        L_0x0289:
            int r5 = com.fyber.inneractive.sdk.protobuf.C3540l.m9237b((int) r15)
            int r13 = com.fyber.inneractive.sdk.protobuf.C3540l.m9241c((int) r4)
            goto L_0x0324
        L_0x0293:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8946d(r4)
            if (r4 <= 0) goto L_0x0511
            boolean r5 = r0.f12563i
            if (r5 == 0) goto L_0x02a7
            long r13 = (long) r13
            r2.putInt(r1, r13, r4)
        L_0x02a7:
            int r5 = com.fyber.inneractive.sdk.protobuf.C3540l.m9237b((int) r15)
            int r13 = com.fyber.inneractive.sdk.protobuf.C3540l.m9241c((int) r4)
            goto L_0x0324
        L_0x02b1:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8961i(r4)
            if (r4 <= 0) goto L_0x0511
            boolean r5 = r0.f12563i
            if (r5 == 0) goto L_0x02c5
            long r13 = (long) r13
            r2.putInt(r1, r13, r4)
        L_0x02c5:
            int r5 = com.fyber.inneractive.sdk.protobuf.C3540l.m9237b((int) r15)
            int r13 = com.fyber.inneractive.sdk.protobuf.C3540l.m9241c((int) r4)
            goto L_0x0324
        L_0x02ce:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8949e(r4)
            if (r4 <= 0) goto L_0x0511
            boolean r5 = r0.f12563i
            if (r5 == 0) goto L_0x02e2
            long r13 = (long) r13
            r2.putInt(r1, r13, r4)
        L_0x02e2:
            int r5 = com.fyber.inneractive.sdk.protobuf.C3540l.m9237b((int) r15)
            int r13 = com.fyber.inneractive.sdk.protobuf.C3540l.m9241c((int) r4)
            goto L_0x0324
        L_0x02eb:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8938b(r4)
            if (r4 <= 0) goto L_0x0511
            boolean r5 = r0.f12563i
            if (r5 == 0) goto L_0x02ff
            long r13 = (long) r13
            r2.putInt(r1, r13, r4)
        L_0x02ff:
            int r5 = com.fyber.inneractive.sdk.protobuf.C3540l.m9237b((int) r15)
            int r13 = com.fyber.inneractive.sdk.protobuf.C3540l.m9241c((int) r4)
            goto L_0x0324
        L_0x0308:
            java.lang.Object r4 = r2.getObject(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8943c(r4)
            if (r4 <= 0) goto L_0x0511
            boolean r5 = r0.f12563i
            if (r5 == 0) goto L_0x031c
            long r13 = (long) r13
            r2.putInt(r1, r13, r4)
        L_0x031c:
            int r5 = com.fyber.inneractive.sdk.protobuf.C3540l.m9237b((int) r15)
            int r13 = com.fyber.inneractive.sdk.protobuf.C3540l.m9241c((int) r4)
        L_0x0324:
            int r5 = r5 + r13
            int r4 = r4 + r5
            goto L_0x0510
        L_0x0328:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8957h(r15, r4, r10)
            goto L_0x0510
        L_0x0334:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8954g(r15, r4, r10)
            goto L_0x0510
        L_0x0340:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8945d(r15, r4, r10)
            goto L_0x0510
        L_0x034c:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8942c(r15, r4, r10)
            goto L_0x0510
        L_0x0358:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8937b((int) r15, (java.util.List<java.lang.Integer>) r4, (boolean) r10)
            goto L_0x0510
        L_0x0364:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8960i(r15, r4, r10)
            goto L_0x0510
        L_0x0370:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8923a((int) r15, (java.util.List<com.fyber.inneractive.sdk.protobuf.C3508i>) r4)
            goto L_0x0510
        L_0x037c:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            com.fyber.inneractive.sdk.protobuf.f1 r5 = r0.mo15207c((int) r11)
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8936b((int) r15, (java.util.List<?>) r4, (com.fyber.inneractive.sdk.protobuf.C3498f1) r5)
            goto L_0x0510
        L_0x038c:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8935b(r15, r4)
            goto L_0x0510
        L_0x0398:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8925a((int) r15, (java.util.List<?>) r4, (boolean) r10)
            goto L_0x0510
        L_0x03a4:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8942c(r15, r4, r10)
            goto L_0x0510
        L_0x03b0:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8945d(r15, r4, r10)
            goto L_0x0510
        L_0x03bc:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8948e(r15, r4, r10)
            goto L_0x0510
        L_0x03c8:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8963j(r15, r4, r10)
            goto L_0x0510
        L_0x03d4:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8951f(r15, r4, r10)
            goto L_0x0510
        L_0x03e0:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8942c(r15, r4, r10)
            goto L_0x0510
        L_0x03ec:
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r1, r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8945d(r15, r4, r10)
            goto L_0x0510
        L_0x03f8:
            boolean r13 = r0.mo15199a(r1, (int) r11)
            if (r13 == 0) goto L_0x0511
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r1, r4)
            com.fyber.inneractive.sdk.protobuf.q0 r4 = (com.fyber.inneractive.sdk.protobuf.C3564q0) r4
            com.fyber.inneractive.sdk.protobuf.f1 r5 = r0.mo15207c((int) r11)
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9229a(r15, r4, r5)
            goto L_0x0510
        L_0x040e:
            boolean r13 = r0.mo15199a(r1, (int) r11)
            if (r13 == 0) goto L_0x0511
            long r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r1, r4)
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9246d((int) r15, (long) r4)
            goto L_0x0510
        L_0x041e:
            boolean r13 = r0.mo15199a(r1, (int) r11)
            if (r13 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r1, r4)
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9247e((int) r15, (int) r4)
            goto L_0x0510
        L_0x042e:
            boolean r4 = r0.mo15199a(r1, (int) r11)
            if (r4 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9243c((int) r15, (long) r8)
            goto L_0x0510
        L_0x043a:
            boolean r4 = r0.mo15199a(r1, (int) r11)
            if (r4 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9245d((int) r15, (int) r10)
            goto L_0x0510
        L_0x0446:
            boolean r13 = r0.mo15199a(r1, (int) r11)
            if (r13 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r1, r4)
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9226a((int) r15, (int) r4)
            goto L_0x0510
        L_0x0456:
            boolean r13 = r0.mo15199a(r1, (int) r11)
            if (r13 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r1, r4)
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9249f((int) r15, (int) r4)
            goto L_0x0510
        L_0x0466:
            boolean r13 = r0.mo15199a(r1, (int) r11)
            if (r13 == 0) goto L_0x0511
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r1, r4)
            com.fyber.inneractive.sdk.protobuf.i r4 = (com.fyber.inneractive.sdk.protobuf.C3508i) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9228a((int) r15, (com.fyber.inneractive.sdk.protobuf.C3508i) r4)
            goto L_0x0510
        L_0x0478:
            boolean r13 = r0.mo15199a(r1, (int) r11)
            if (r13 == 0) goto L_0x0511
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r1, r4)
            com.fyber.inneractive.sdk.protobuf.f1 r5 = r0.mo15207c((int) r11)
            int r4 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8922a((int) r15, (java.lang.Object) r4, (com.fyber.inneractive.sdk.protobuf.C3498f1) r5)
            goto L_0x0510
        L_0x048c:
            boolean r13 = r0.mo15199a(r1, (int) r11)
            if (r13 == 0) goto L_0x0511
            java.lang.Object r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r1, r4)
            boolean r5 = r4 instanceof com.fyber.inneractive.sdk.protobuf.C3508i
            if (r5 == 0) goto L_0x04a2
            com.fyber.inneractive.sdk.protobuf.i r4 = (com.fyber.inneractive.sdk.protobuf.C3508i) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9228a((int) r15, (com.fyber.inneractive.sdk.protobuf.C3508i) r4)
            goto L_0x0510
        L_0x04a2:
            java.lang.String r4 = (java.lang.String) r4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9230a((int) r15, (java.lang.String) r4)
            goto L_0x0510
        L_0x04aa:
            boolean r4 = r0.mo15199a(r1, (int) r11)
            if (r4 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9231a((int) r15, (boolean) r7)
            goto L_0x0510
        L_0x04b5:
            boolean r4 = r0.mo15199a(r1, (int) r11)
            if (r4 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9238b((int) r15, (int) r10)
            goto L_0x0510
        L_0x04c0:
            boolean r4 = r0.mo15199a(r1, (int) r11)
            if (r4 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9227a((int) r15, (long) r8)
            goto L_0x0510
        L_0x04cb:
            boolean r13 = r0.mo15199a(r1, (int) r11)
            if (r13 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r1, r4)
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9242c((int) r15, (int) r4)
            goto L_0x0510
        L_0x04da:
            boolean r13 = r0.mo15199a(r1, (int) r11)
            if (r13 == 0) goto L_0x0511
            long r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r1, r4)
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9248e((int) r15, (long) r4)
            goto L_0x0510
        L_0x04e9:
            boolean r13 = r0.mo15199a(r1, (int) r11)
            if (r13 == 0) goto L_0x0511
            long r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r1, r4)
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9239b((int) r15, (long) r4)
            goto L_0x0510
        L_0x04f8:
            boolean r4 = r0.mo15199a(r1, (int) r11)
            if (r4 == 0) goto L_0x0511
            int r4 = com.fyber.inneractive.sdk.protobuf.C3540l.m9225a((int) r15, (float) r3)
            goto L_0x0510
        L_0x0503:
            boolean r4 = r0.mo15199a(r1, (int) r11)
            if (r4 == 0) goto L_0x0511
            r4 = 0
            int r13 = com.fyber.inneractive.sdk.protobuf.C3540l.m9224a((int) r15, (double) r4)
        L_0x050f:
            r4 = r13
        L_0x0510:
            int r12 = r12 + r4
        L_0x0511:
            int r11 = r11 + 3
            goto L_0x0014
        L_0x0515:
            com.fyber.inneractive.sdk.protobuf.m1<?, ?> r2 = r0.f12569o
            java.lang.Object r1 = r2.mo15115b(r1)
            int r1 = r2.mo15119c(r1)
            int r1 = r1 + r12
            goto L_0x0ab2
        L_0x0522:
            sun.misc.Unsafe r2 = f12554s
            r4 = 0
            r5 = 0
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x052a:
            int[] r13 = r0.f12555a
            int r13 = r13.length
            if (r4 >= r13) goto L_0x0a96
            int r13 = r0.mo15209g(r4)
            int[] r14 = r0.f12555a
            r14 = r14[r4]
            int r15 = m9536f(r13)
            r3 = 17
            if (r15 > r3) goto L_0x0554
            int[] r3 = r0.f12555a
            int r17 = r4 + 2
            r3 = r3[r17]
            r10 = r3 & r6
            int r18 = r3 >>> 20
            int r18 = r7 << r18
            if (r10 == r11) goto L_0x056f
            long r11 = (long) r10
            int r12 = r2.getInt(r1, r11)
            r11 = r10
            goto L_0x056f
        L_0x0554:
            boolean r3 = r0.f12563i
            if (r3 == 0) goto L_0x056c
            com.fyber.inneractive.sdk.protobuf.v r3 = com.fyber.inneractive.sdk.protobuf.C3600v.DOUBLE_LIST_PACKED
            int r3 = r3.f12623a
            if (r15 < r3) goto L_0x056c
            com.fyber.inneractive.sdk.protobuf.v r3 = com.fyber.inneractive.sdk.protobuf.C3600v.SINT64_LIST_PACKED
            int r3 = r3.f12623a
            if (r15 > r3) goto L_0x056c
            int[] r3 = r0.f12555a
            int r10 = r4 + 2
            r3 = r3[r10]
            r3 = r3 & r6
            goto L_0x056d
        L_0x056c:
            r3 = 0
        L_0x056d:
            r18 = 0
        L_0x056f:
            long r6 = m9533d((int) r13)
            switch(r15) {
                case 0: goto L_0x0a7a;
                case 1: goto L_0x0a6b;
                case 2: goto L_0x0a59;
                case 3: goto L_0x0a49;
                case 4: goto L_0x0a39;
                case 5: goto L_0x0a2d;
                case 6: goto L_0x0a21;
                case 7: goto L_0x0a0e;
                case 8: goto L_0x09f1;
                case 9: goto L_0x09de;
                case 10: goto L_0x09cd;
                case 11: goto L_0x09be;
                case 12: goto L_0x09af;
                case 13: goto L_0x09a2;
                case 14: goto L_0x0997;
                case 15: goto L_0x0988;
                case 16: goto L_0x0979;
                case 17: goto L_0x0964;
                case 18: goto L_0x0952;
                case 19: goto L_0x0945;
                case 20: goto L_0x0938;
                case 21: goto L_0x092b;
                case 22: goto L_0x091e;
                case 23: goto L_0x0911;
                case 24: goto L_0x0904;
                case 25: goto L_0x08f7;
                case 26: goto L_0x08e5;
                case 27: goto L_0x08d5;
                case 28: goto L_0x08c9;
                case 29: goto L_0x08bb;
                case 30: goto L_0x08ad;
                case 31: goto L_0x089f;
                case 32: goto L_0x0891;
                case 33: goto L_0x0883;
                case 34: goto L_0x0875;
                case 35: goto L_0x0854;
                case 36: goto L_0x0836;
                case 37: goto L_0x0818;
                case 38: goto L_0x07fa;
                case 39: goto L_0x07db;
                case 40: goto L_0x07bc;
                case 41: goto L_0x079d;
                case 42: goto L_0x077c;
                case 43: goto L_0x075d;
                case 44: goto L_0x073e;
                case 45: goto L_0x071f;
                case 46: goto L_0x0700;
                case 47: goto L_0x06e1;
                case 48: goto L_0x06bf;
                case 49: goto L_0x06a9;
                case 50: goto L_0x069a;
                case 51: goto L_0x068c;
                case 52: goto L_0x067c;
                case 53: goto L_0x066d;
                case 54: goto L_0x065e;
                case 55: goto L_0x064f;
                case 56: goto L_0x0644;
                case 57: goto L_0x0638;
                case 58: goto L_0x062b;
                case 59: goto L_0x060d;
                case 60: goto L_0x05f9;
                case 61: goto L_0x05e7;
                case 62: goto L_0x05d7;
                case 63: goto L_0x05c7;
                case 64: goto L_0x05ba;
                case 65: goto L_0x05ae;
                case 66: goto L_0x059e;
                case 67: goto L_0x058e;
                case 68: goto L_0x0578;
                default: goto L_0x0576;
            }
        L_0x0576:
            goto L_0x06de
        L_0x0578:
            boolean r3 = r0.mo15200a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06de
            java.lang.Object r3 = r2.getObject(r1, r6)
            com.fyber.inneractive.sdk.protobuf.q0 r3 = (com.fyber.inneractive.sdk.protobuf.C3564q0) r3
            com.fyber.inneractive.sdk.protobuf.f1 r6 = r0.mo15207c((int) r4)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9229a(r14, r3, r6)
            goto L_0x06b7
        L_0x058e:
            boolean r3 = r0.mo15200a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06de
            long r6 = m9534e(r1, r6)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9246d((int) r14, (long) r6)
            goto L_0x06b7
        L_0x059e:
            boolean r3 = r0.mo15200a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06de
            int r3 = m9532d(r1, r6)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9247e((int) r14, (int) r3)
            goto L_0x06b7
        L_0x05ae:
            boolean r3 = r0.mo15200a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06de
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9243c((int) r14, (long) r8)
            goto L_0x06b7
        L_0x05ba:
            boolean r3 = r0.mo15200a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06de
            r3 = 0
            int r6 = com.fyber.inneractive.sdk.protobuf.C3540l.m9245d((int) r14, (int) r3)
            goto L_0x0687
        L_0x05c7:
            boolean r3 = r0.mo15200a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06de
            int r3 = m9532d(r1, r6)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9226a((int) r14, (int) r3)
            goto L_0x06b7
        L_0x05d7:
            boolean r3 = r0.mo15200a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06de
            int r3 = m9532d(r1, r6)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9249f((int) r14, (int) r3)
            goto L_0x06b7
        L_0x05e7:
            boolean r3 = r0.mo15200a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06de
            java.lang.Object r3 = r2.getObject(r1, r6)
            com.fyber.inneractive.sdk.protobuf.i r3 = (com.fyber.inneractive.sdk.protobuf.C3508i) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9228a((int) r14, (com.fyber.inneractive.sdk.protobuf.C3508i) r3)
            goto L_0x06b7
        L_0x05f9:
            boolean r3 = r0.mo15200a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06de
            java.lang.Object r3 = r2.getObject(r1, r6)
            com.fyber.inneractive.sdk.protobuf.f1 r6 = r0.mo15207c((int) r4)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8922a((int) r14, (java.lang.Object) r3, (com.fyber.inneractive.sdk.protobuf.C3498f1) r6)
            goto L_0x06b7
        L_0x060d:
            boolean r3 = r0.mo15200a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06de
            java.lang.Object r3 = r2.getObject(r1, r6)
            boolean r6 = r3 instanceof com.fyber.inneractive.sdk.protobuf.C3508i
            if (r6 == 0) goto L_0x0623
            com.fyber.inneractive.sdk.protobuf.i r3 = (com.fyber.inneractive.sdk.protobuf.C3508i) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9228a((int) r14, (com.fyber.inneractive.sdk.protobuf.C3508i) r3)
            goto L_0x06b7
        L_0x0623:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9230a((int) r14, (java.lang.String) r3)
            goto L_0x06b7
        L_0x062b:
            boolean r3 = r0.mo15200a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06de
            r3 = 1
            int r6 = com.fyber.inneractive.sdk.protobuf.C3540l.m9231a((int) r14, (boolean) r3)
            r13 = r11
            goto L_0x0689
        L_0x0638:
            boolean r3 = r0.mo15200a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06de
            r3 = 0
            int r6 = com.fyber.inneractive.sdk.protobuf.C3540l.m9238b((int) r14, (int) r3)
            goto L_0x0687
        L_0x0644:
            boolean r3 = r0.mo15200a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06de
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9227a((int) r14, (long) r8)
            goto L_0x06b7
        L_0x064f:
            boolean r3 = r0.mo15200a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06de
            int r3 = m9532d(r1, r6)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9242c((int) r14, (int) r3)
            goto L_0x06b7
        L_0x065e:
            boolean r3 = r0.mo15200a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06de
            long r6 = m9534e(r1, r6)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9248e((int) r14, (long) r6)
            goto L_0x06b7
        L_0x066d:
            boolean r3 = r0.mo15200a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06de
            long r6 = m9534e(r1, r6)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9239b((int) r14, (long) r6)
            goto L_0x06b7
        L_0x067c:
            boolean r3 = r0.mo15200a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06de
            r3 = 0
            int r6 = com.fyber.inneractive.sdk.protobuf.C3540l.m9225a((int) r14, (float) r3)
        L_0x0687:
            r13 = r11
            r3 = 1
        L_0x0689:
            r10 = 0
            goto L_0x0a68
        L_0x068c:
            boolean r3 = r0.mo15200a(r1, (int) r14, (int) r4)
            if (r3 == 0) goto L_0x06de
            r6 = 0
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9224a((int) r14, (double) r6)
            r13 = r11
            goto L_0x06ba
        L_0x069a:
            com.fyber.inneractive.sdk.protobuf.l0 r3 = r0.f12571q
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.lang.Object r7 = r0.mo15201b((int) r4)
            int r3 = r3.mo15090a(r14, r6, r7)
            goto L_0x06b7
        L_0x06a9:
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            com.fyber.inneractive.sdk.protobuf.f1 r6 = r0.mo15207c((int) r4)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8924a((int) r14, (java.util.List<com.fyber.inneractive.sdk.protobuf.C3564q0>) r3, (com.fyber.inneractive.sdk.protobuf.C3498f1) r6)
        L_0x06b7:
            r13 = r11
            r6 = 0
        L_0x06ba:
            r10 = 0
            r11 = r3
            r3 = 1
            goto L_0x0a88
        L_0x06bf:
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8955g(r6)
            if (r6 <= 0) goto L_0x06de
            boolean r7 = r0.f12563i
            r13 = r11
            if (r7 == 0) goto L_0x06d4
            long r10 = (long) r3
            r2.putInt(r1, r10, r6)
        L_0x06d4:
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9237b((int) r14)
            int r7 = com.fyber.inneractive.sdk.protobuf.C3540l.m9241c((int) r6)
            goto L_0x0871
        L_0x06de:
            r13 = r11
            goto L_0x0a1b
        L_0x06e1:
            r13 = r11
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8952f(r6)
            if (r6 <= 0) goto L_0x0a1b
            boolean r7 = r0.f12563i
            if (r7 == 0) goto L_0x06f6
            long r10 = (long) r3
            r2.putInt(r1, r10, r6)
        L_0x06f6:
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9237b((int) r14)
            int r7 = com.fyber.inneractive.sdk.protobuf.C3540l.m9241c((int) r6)
            goto L_0x0871
        L_0x0700:
            r13 = r11
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8943c(r6)
            if (r6 <= 0) goto L_0x0a1b
            boolean r7 = r0.f12563i
            if (r7 == 0) goto L_0x0715
            long r10 = (long) r3
            r2.putInt(r1, r10, r6)
        L_0x0715:
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9237b((int) r14)
            int r7 = com.fyber.inneractive.sdk.protobuf.C3540l.m9241c((int) r6)
            goto L_0x0871
        L_0x071f:
            r13 = r11
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8938b(r6)
            if (r6 <= 0) goto L_0x0a1b
            boolean r7 = r0.f12563i
            if (r7 == 0) goto L_0x0734
            long r10 = (long) r3
            r2.putInt(r1, r10, r6)
        L_0x0734:
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9237b((int) r14)
            int r7 = com.fyber.inneractive.sdk.protobuf.C3540l.m9241c((int) r6)
            goto L_0x0871
        L_0x073e:
            r13 = r11
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8926a((java.util.List<java.lang.Integer>) r6)
            if (r6 <= 0) goto L_0x0a1b
            boolean r7 = r0.f12563i
            if (r7 == 0) goto L_0x0753
            long r10 = (long) r3
            r2.putInt(r1, r10, r6)
        L_0x0753:
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9237b((int) r14)
            int r7 = com.fyber.inneractive.sdk.protobuf.C3540l.m9241c((int) r6)
            goto L_0x0871
        L_0x075d:
            r13 = r11
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8958h(r6)
            if (r6 <= 0) goto L_0x0a1b
            boolean r7 = r0.f12563i
            if (r7 == 0) goto L_0x0772
            long r10 = (long) r3
            r2.putInt(r1, r10, r6)
        L_0x0772:
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9237b((int) r14)
            int r7 = com.fyber.inneractive.sdk.protobuf.C3540l.m9241c((int) r6)
            goto L_0x0871
        L_0x077c:
            r13 = r11
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            java.lang.Class<?> r7 = com.fyber.inneractive.sdk.protobuf.C3507h1.f12439a
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0a1b
            boolean r7 = r0.f12563i
            if (r7 == 0) goto L_0x0793
            long r10 = (long) r3
            r2.putInt(r1, r10, r6)
        L_0x0793:
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9237b((int) r14)
            int r7 = com.fyber.inneractive.sdk.protobuf.C3540l.m9241c((int) r6)
            goto L_0x0871
        L_0x079d:
            r13 = r11
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8938b(r6)
            if (r6 <= 0) goto L_0x0a1b
            boolean r7 = r0.f12563i
            if (r7 == 0) goto L_0x07b2
            long r10 = (long) r3
            r2.putInt(r1, r10, r6)
        L_0x07b2:
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9237b((int) r14)
            int r7 = com.fyber.inneractive.sdk.protobuf.C3540l.m9241c((int) r6)
            goto L_0x0871
        L_0x07bc:
            r13 = r11
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8943c(r6)
            if (r6 <= 0) goto L_0x0a1b
            boolean r7 = r0.f12563i
            if (r7 == 0) goto L_0x07d1
            long r10 = (long) r3
            r2.putInt(r1, r10, r6)
        L_0x07d1:
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9237b((int) r14)
            int r7 = com.fyber.inneractive.sdk.protobuf.C3540l.m9241c((int) r6)
            goto L_0x0871
        L_0x07db:
            r13 = r11
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8946d(r6)
            if (r6 <= 0) goto L_0x0a1b
            boolean r7 = r0.f12563i
            if (r7 == 0) goto L_0x07f0
            long r10 = (long) r3
            r2.putInt(r1, r10, r6)
        L_0x07f0:
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9237b((int) r14)
            int r7 = com.fyber.inneractive.sdk.protobuf.C3540l.m9241c((int) r6)
            goto L_0x0871
        L_0x07fa:
            r13 = r11
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8961i(r6)
            if (r6 <= 0) goto L_0x0a1b
            boolean r7 = r0.f12563i
            if (r7 == 0) goto L_0x080f
            long r10 = (long) r3
            r2.putInt(r1, r10, r6)
        L_0x080f:
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9237b((int) r14)
            int r7 = com.fyber.inneractive.sdk.protobuf.C3540l.m9241c((int) r6)
            goto L_0x0871
        L_0x0818:
            r13 = r11
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8949e(r6)
            if (r6 <= 0) goto L_0x0a1b
            boolean r7 = r0.f12563i
            if (r7 == 0) goto L_0x082d
            long r10 = (long) r3
            r2.putInt(r1, r10, r6)
        L_0x082d:
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9237b((int) r14)
            int r7 = com.fyber.inneractive.sdk.protobuf.C3540l.m9241c((int) r6)
            goto L_0x0871
        L_0x0836:
            r13 = r11
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8938b(r6)
            if (r6 <= 0) goto L_0x0a1b
            boolean r7 = r0.f12563i
            if (r7 == 0) goto L_0x084b
            long r10 = (long) r3
            r2.putInt(r1, r10, r6)
        L_0x084b:
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9237b((int) r14)
            int r7 = com.fyber.inneractive.sdk.protobuf.C3540l.m9241c((int) r6)
            goto L_0x0871
        L_0x0854:
            r13 = r11
            java.lang.Object r6 = r2.getObject(r1, r6)
            java.util.List r6 = (java.util.List) r6
            int r6 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8943c(r6)
            if (r6 <= 0) goto L_0x0a1b
            boolean r7 = r0.f12563i
            if (r7 == 0) goto L_0x0869
            long r10 = (long) r3
            r2.putInt(r1, r10, r6)
        L_0x0869:
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9237b((int) r14)
            int r7 = com.fyber.inneractive.sdk.protobuf.C3540l.m9241c((int) r6)
        L_0x0871:
            int r3 = r3 + r7
            int r3 = r3 + r6
            goto L_0x08f0
        L_0x0875:
            r13 = r11
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            r10 = 0
            int r3 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8957h(r14, r3, r10)
            goto L_0x095e
        L_0x0883:
            r13 = r11
            r10 = 0
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8954g(r14, r3, r10)
            goto L_0x095e
        L_0x0891:
            r13 = r11
            r10 = 0
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8945d(r14, r3, r10)
            goto L_0x095e
        L_0x089f:
            r13 = r11
            r10 = 0
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8942c(r14, r3, r10)
            goto L_0x095e
        L_0x08ad:
            r13 = r11
            r10 = 0
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8937b((int) r14, (java.util.List<java.lang.Integer>) r3, (boolean) r10)
            goto L_0x095e
        L_0x08bb:
            r13 = r11
            r10 = 0
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8960i(r14, r3, r10)
            goto L_0x095e
        L_0x08c9:
            r13 = r11
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8923a((int) r14, (java.util.List<com.fyber.inneractive.sdk.protobuf.C3508i>) r3)
            goto L_0x08f0
        L_0x08d5:
            r13 = r11
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            com.fyber.inneractive.sdk.protobuf.f1 r6 = r0.mo15207c((int) r4)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8936b((int) r14, (java.util.List<?>) r3, (com.fyber.inneractive.sdk.protobuf.C3498f1) r6)
            goto L_0x08f0
        L_0x08e5:
            r13 = r11
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8935b(r14, r3)
        L_0x08f0:
            r11 = r3
        L_0x08f1:
            r3 = 1
        L_0x08f2:
            r6 = 0
            r10 = 0
            goto L_0x0a88
        L_0x08f7:
            r13 = r11
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            r10 = 0
            int r3 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8925a((int) r14, (java.util.List<?>) r3, (boolean) r10)
            goto L_0x095e
        L_0x0904:
            r13 = r11
            r10 = 0
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8942c(r14, r3, r10)
            goto L_0x095e
        L_0x0911:
            r13 = r11
            r10 = 0
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8945d(r14, r3, r10)
            goto L_0x095e
        L_0x091e:
            r13 = r11
            r10 = 0
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8948e(r14, r3, r10)
            goto L_0x095e
        L_0x092b:
            r13 = r11
            r10 = 0
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8963j(r14, r3, r10)
            goto L_0x095e
        L_0x0938:
            r13 = r11
            r10 = 0
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8951f(r14, r3, r10)
            goto L_0x095e
        L_0x0945:
            r13 = r11
            r10 = 0
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8942c(r14, r3, r10)
            goto L_0x095e
        L_0x0952:
            r13 = r11
            r10 = 0
            java.lang.Object r3 = r2.getObject(r1, r6)
            java.util.List r3 = (java.util.List) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8945d(r14, r3, r10)
        L_0x095e:
            r11 = r3
            r3 = 1
        L_0x0960:
            r6 = 0
            goto L_0x0a88
        L_0x0964:
            r13 = r11
            r3 = r12 & r18
            if (r3 == 0) goto L_0x0a1b
            java.lang.Object r3 = r2.getObject(r1, r6)
            com.fyber.inneractive.sdk.protobuf.q0 r3 = (com.fyber.inneractive.sdk.protobuf.C3564q0) r3
            com.fyber.inneractive.sdk.protobuf.f1 r6 = r0.mo15207c((int) r4)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9229a(r14, r3, r6)
            goto L_0x08f0
        L_0x0979:
            r13 = r11
            r3 = r12 & r18
            if (r3 == 0) goto L_0x0a1b
            long r6 = r2.getLong(r1, r6)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9246d((int) r14, (long) r6)
            goto L_0x08f0
        L_0x0988:
            r13 = r11
            r3 = r12 & r18
            if (r3 == 0) goto L_0x0a1b
            int r3 = r2.getInt(r1, r6)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9247e((int) r14, (int) r3)
            goto L_0x08f0
        L_0x0997:
            r13 = r11
            r3 = r12 & r18
            if (r3 == 0) goto L_0x0a1b
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9243c((int) r14, (long) r8)
            goto L_0x08f0
        L_0x09a2:
            r13 = r11
            r3 = r12 & r18
            if (r3 == 0) goto L_0x0a1b
            r3 = 0
            int r6 = com.fyber.inneractive.sdk.protobuf.C3540l.m9245d((int) r14, (int) r3)
            r11 = r6
            goto L_0x08f1
        L_0x09af:
            r13 = r11
            r3 = r12 & r18
            if (r3 == 0) goto L_0x0a1b
            int r3 = r2.getInt(r1, r6)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9226a((int) r14, (int) r3)
            goto L_0x08f0
        L_0x09be:
            r13 = r11
            r3 = r12 & r18
            if (r3 == 0) goto L_0x0a1b
            int r3 = r2.getInt(r1, r6)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9249f((int) r14, (int) r3)
            goto L_0x08f0
        L_0x09cd:
            r13 = r11
            r3 = r12 & r18
            if (r3 == 0) goto L_0x0a1b
            java.lang.Object r3 = r2.getObject(r1, r6)
            com.fyber.inneractive.sdk.protobuf.i r3 = (com.fyber.inneractive.sdk.protobuf.C3508i) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9228a((int) r14, (com.fyber.inneractive.sdk.protobuf.C3508i) r3)
            goto L_0x08f0
        L_0x09de:
            r13 = r11
            r3 = r12 & r18
            if (r3 == 0) goto L_0x0a1b
            java.lang.Object r3 = r2.getObject(r1, r6)
            com.fyber.inneractive.sdk.protobuf.f1 r6 = r0.mo15207c((int) r4)
            int r3 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8922a((int) r14, (java.lang.Object) r3, (com.fyber.inneractive.sdk.protobuf.C3498f1) r6)
            goto L_0x08f0
        L_0x09f1:
            r13 = r11
            r3 = r12 & r18
            if (r3 == 0) goto L_0x0a1b
            java.lang.Object r3 = r2.getObject(r1, r6)
            boolean r6 = r3 instanceof com.fyber.inneractive.sdk.protobuf.C3508i
            if (r6 == 0) goto L_0x0a06
            com.fyber.inneractive.sdk.protobuf.i r3 = (com.fyber.inneractive.sdk.protobuf.C3508i) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9228a((int) r14, (com.fyber.inneractive.sdk.protobuf.C3508i) r3)
            goto L_0x08f0
        L_0x0a06:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = com.fyber.inneractive.sdk.protobuf.C3540l.m9230a((int) r14, (java.lang.String) r3)
            goto L_0x08f0
        L_0x0a0e:
            r13 = r11
            r3 = r12 & r18
            if (r3 == 0) goto L_0x0a1b
            r3 = 1
            int r6 = com.fyber.inneractive.sdk.protobuf.C3540l.m9231a((int) r14, (boolean) r3)
            r11 = r6
            goto L_0x08f2
        L_0x0a1b:
            r3 = 1
            r6 = 0
            r10 = 0
            goto L_0x0a8c
        L_0x0a21:
            r13 = r11
            r3 = 1
            r6 = r12 & r18
            r10 = 0
            if (r6 == 0) goto L_0x0a8a
            int r6 = com.fyber.inneractive.sdk.protobuf.C3540l.m9238b((int) r14, (int) r10)
            goto L_0x0a68
        L_0x0a2d:
            r13 = r11
            r3 = 1
            r10 = 0
            r6 = r12 & r18
            if (r6 == 0) goto L_0x0a8a
            int r6 = com.fyber.inneractive.sdk.protobuf.C3540l.m9227a((int) r14, (long) r8)
            goto L_0x0a68
        L_0x0a39:
            r13 = r11
            r3 = 1
            r10 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x0a8a
            int r6 = r2.getInt(r1, r6)
            int r6 = com.fyber.inneractive.sdk.protobuf.C3540l.m9242c((int) r14, (int) r6)
            goto L_0x0a68
        L_0x0a49:
            r13 = r11
            r3 = 1
            r10 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x0a8a
            long r6 = r2.getLong(r1, r6)
            int r6 = com.fyber.inneractive.sdk.protobuf.C3540l.m9248e((int) r14, (long) r6)
            goto L_0x0a68
        L_0x0a59:
            r13 = r11
            r3 = 1
            r10 = 0
            r11 = r12 & r18
            if (r11 == 0) goto L_0x0a8a
            long r6 = r2.getLong(r1, r6)
            int r6 = com.fyber.inneractive.sdk.protobuf.C3540l.m9239b((int) r14, (long) r6)
        L_0x0a68:
            r11 = r6
            goto L_0x0960
        L_0x0a6b:
            r13 = r11
            r3 = 1
            r10 = 0
            r6 = r12 & r18
            if (r6 == 0) goto L_0x0a8a
            r6 = 0
            int r7 = com.fyber.inneractive.sdk.protobuf.C3540l.m9225a((int) r14, (float) r6)
            r11 = r7
            goto L_0x0960
        L_0x0a7a:
            r13 = r11
            r3 = 1
            r6 = 0
            r10 = 0
            r7 = r12 & r18
            if (r7 == 0) goto L_0x0a8a
            r6 = 0
            int r11 = com.fyber.inneractive.sdk.protobuf.C3540l.m9224a((int) r14, (double) r6)
        L_0x0a88:
            int r5 = r5 + r11
            goto L_0x0a8c
        L_0x0a8a:
            r6 = 0
        L_0x0a8c:
            int r4 = r4 + 3
            r11 = r13
            r3 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r7 = 1
            goto L_0x052a
        L_0x0a96:
            com.fyber.inneractive.sdk.protobuf.m1<?, ?> r2 = r0.f12569o
            java.lang.Object r3 = r2.mo15115b(r1)
            int r2 = r2.mo15119c(r3)
            int r2 = r2 + r5
            boolean r3 = r0.f12560f
            if (r3 == 0) goto L_0x0ab1
            com.fyber.inneractive.sdk.protobuf.r<?> r3 = r0.f12570p
            com.fyber.inneractive.sdk.protobuf.u r1 = r3.mo15158a((java.lang.Object) r1)
            int r1 = r1.mo15221d()
            int r1 = r1 + r2
            goto L_0x0ab2
        L_0x0ab1:
            r1 = r2
        L_0x0ab2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C3583t0.mo14896b(java.lang.Object):int");
    }

    /* renamed from: d */
    public static <T> int m9532d(T t, long j) {
        return ((Integer) C3569r1.m9439g(t, j)).intValue();
    }

    /* renamed from: a */
    public static Field m9528a(Class<?> cls, String str) {
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

    /* renamed from: a */
    public T mo14890a() {
        return this.f12567m.mo15229a(this.f12559e);
    }

    /* renamed from: a */
    public void mo14893a(T t, T t2) {
        t2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f12555a;
            if (i < iArr.length) {
                int i2 = iArr[i + 1];
                long d = m9533d(i2);
                int i3 = this.f12555a[i];
                switch (m9536f(i2)) {
                    case 0:
                        if (!mo15199a(t2, i)) {
                            break;
                        } else {
                            C3569r1.C3573d dVar = C3569r1.f12543e;
                            dVar.mo15170a((Object) t, d, dVar.mo15176c(t2, d));
                            mo15202b(t, i);
                            break;
                        }
                    case 1:
                        if (!mo15199a(t2, i)) {
                            break;
                        } else {
                            C3569r1.C3573d dVar2 = C3569r1.f12543e;
                            dVar2.mo15171a((Object) t, d, dVar2.mo15177d(t2, d));
                            mo15202b(t, i);
                            break;
                        }
                    case 2:
                        if (!mo15199a(t2, i)) {
                            break;
                        } else {
                            C3569r1.m9425a((Object) t, d, C3569r1.m9438f(t2, d));
                            mo15202b(t, i);
                            break;
                        }
                    case 3:
                        if (!mo15199a(t2, i)) {
                            break;
                        } else {
                            C3569r1.m9425a((Object) t, d, C3569r1.m9438f(t2, d));
                            mo15202b(t, i);
                            break;
                        }
                    case 4:
                        if (!mo15199a(t2, i)) {
                            break;
                        } else {
                            C3569r1.m9424a((Object) t, d, C3569r1.m9437e(t2, d));
                            mo15202b(t, i);
                            break;
                        }
                    case 5:
                        if (!mo15199a(t2, i)) {
                            break;
                        } else {
                            C3569r1.m9425a((Object) t, d, C3569r1.m9438f(t2, d));
                            mo15202b(t, i);
                            break;
                        }
                    case 6:
                        if (!mo15199a(t2, i)) {
                            break;
                        } else {
                            C3569r1.m9424a((Object) t, d, C3569r1.m9437e(t2, d));
                            mo15202b(t, i);
                            break;
                        }
                    case 7:
                        if (!mo15199a(t2, i)) {
                            break;
                        } else {
                            C3569r1.C3573d dVar3 = C3569r1.f12543e;
                            dVar3.mo15172a((Object) t, d, dVar3.mo15173a(t2, d));
                            mo15202b(t, i);
                            break;
                        }
                    case 8:
                        if (!mo15199a(t2, i)) {
                            break;
                        } else {
                            C3569r1.m9426a((Object) t, d, C3569r1.m9439g(t2, d));
                            mo15202b(t, i);
                            break;
                        }
                    case 9:
                        mo15198a(t, t2, i);
                        break;
                    case 10:
                        if (!mo15199a(t2, i)) {
                            break;
                        } else {
                            C3569r1.m9426a((Object) t, d, C3569r1.m9439g(t2, d));
                            mo15202b(t, i);
                            break;
                        }
                    case 11:
                        if (!mo15199a(t2, i)) {
                            break;
                        } else {
                            C3569r1.m9424a((Object) t, d, C3569r1.m9437e(t2, d));
                            mo15202b(t, i);
                            break;
                        }
                    case 12:
                        if (!mo15199a(t2, i)) {
                            break;
                        } else {
                            C3569r1.m9424a((Object) t, d, C3569r1.m9437e(t2, d));
                            mo15202b(t, i);
                            break;
                        }
                    case 13:
                        if (!mo15199a(t2, i)) {
                            break;
                        } else {
                            C3569r1.m9424a((Object) t, d, C3569r1.m9437e(t2, d));
                            mo15202b(t, i);
                            break;
                        }
                    case 14:
                        if (!mo15199a(t2, i)) {
                            break;
                        } else {
                            C3569r1.m9425a((Object) t, d, C3569r1.m9438f(t2, d));
                            mo15202b(t, i);
                            break;
                        }
                    case 15:
                        if (!mo15199a(t2, i)) {
                            break;
                        } else {
                            C3569r1.m9424a((Object) t, d, C3569r1.m9437e(t2, d));
                            mo15202b(t, i);
                            break;
                        }
                    case 16:
                        if (!mo15199a(t2, i)) {
                            break;
                        } else {
                            C3569r1.m9425a((Object) t, d, C3569r1.m9438f(t2, d));
                            mo15202b(t, i);
                            break;
                        }
                    case 17:
                        mo15198a(t, t2, i);
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
                        this.f12568n.mo14912a(t, t2, d);
                        break;
                    case 50:
                        C3546l0 l0Var = this.f12571q;
                        Class<?> cls = C3507h1.f12439a;
                        C3569r1.m9426a((Object) t, d, l0Var.mo15091a(C3569r1.m9439g(t, d), C3569r1.m9439g(t2, d)));
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
                        if (!mo15200a(t2, i3, i)) {
                            break;
                        } else {
                            C3569r1.m9426a((Object) t, d, C3569r1.m9439g(t2, d));
                            mo15203b(t, i3, i);
                            break;
                        }
                    case 60:
                        mo15206b(t, t2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!mo15200a(t2, i3, i)) {
                            break;
                        } else {
                            C3569r1.m9426a((Object) t, d, C3569r1.m9439g(t2, d));
                            mo15203b(t, i3, i);
                            break;
                        }
                    case 68:
                        mo15206b(t, t2, i);
                        break;
                }
                i += 3;
            } else {
                C3550m1<?, ?> m1Var = this.f12569o;
                Class<?> cls2 = C3507h1.f12439a;
                m1Var.mo15120c(t, m1Var.mo15107a(m1Var.mo15115b(t), m1Var.mo15115b(t2)));
                if (this.f12560f) {
                    C3567r<?> rVar = this.f12570p;
                    C3596u<?> a = rVar.mo15158a((Object) t2);
                    if (!a.f12612a.isEmpty()) {
                        rVar.mo15165b(t).mo15216a(a);
                        return;
                    }
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x053f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14892a(T r18, com.fyber.inneractive.sdk.protobuf.C3599u1 r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r19.getClass()
            boolean r3 = r0.f12562h
            if (r3 == 0) goto L_0x0012
            r17.mo15205b(r18, (com.fyber.inneractive.sdk.protobuf.C3599u1) r19)
            goto L_0x055d
        L_0x0012:
            boolean r3 = r0.f12560f
            if (r3 == 0) goto L_0x002f
            com.fyber.inneractive.sdk.protobuf.r<?> r3 = r0.f12570p
            com.fyber.inneractive.sdk.protobuf.u r3 = r3.mo15158a((java.lang.Object) r1)
            com.fyber.inneractive.sdk.protobuf.i1<T, java.lang.Object> r5 = r3.f12612a
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x002f
            java.util.Iterator r3 = r3.mo15225f()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0031
        L_0x002f:
            r3 = 0
            r5 = 0
        L_0x0031:
            int[] r6 = r0.f12555a
            int r6 = r6.length
            sun.misc.Unsafe r7 = f12554s
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r10 = 0
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r12 = 0
        L_0x003e:
            if (r10 >= r6) goto L_0x053d
            int r13 = r0.mo15209g(r10)
            int[] r14 = r0.f12555a
            r14 = r14[r10]
            int r15 = m9536f(r13)
            r4 = 17
            if (r15 > r4) goto L_0x0066
            int[] r4 = r0.f12555a
            int r16 = r10 + 2
            r4 = r4[r16]
            r9 = r4 & r8
            if (r9 == r11) goto L_0x0060
            long r11 = (long) r9
            int r12 = r7.getInt(r1, r11)
            r11 = r9
        L_0x0060:
            int r4 = r4 >>> 20
            r9 = 1
            int r4 = r9 << r4
            goto L_0x0067
        L_0x0066:
            r4 = 0
        L_0x0067:
            if (r5 == 0) goto L_0x0085
            com.fyber.inneractive.sdk.protobuf.r<?> r9 = r0.f12570p
            int r9 = r9.mo15157a((java.util.Map.Entry<?, ?>) r5)
            if (r9 > r14) goto L_0x0085
            com.fyber.inneractive.sdk.protobuf.r<?> r9 = r0.f12570p
            r9.mo15163a(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0083
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0067
        L_0x0083:
            r5 = 0
            goto L_0x0067
        L_0x0085:
            long r8 = m9533d((int) r13)
            switch(r15) {
                case 0: goto L_0x0526;
                case 1: goto L_0x0515;
                case 2: goto L_0x0504;
                case 3: goto L_0x04f3;
                case 4: goto L_0x04e2;
                case 5: goto L_0x04d1;
                case 6: goto L_0x04c0;
                case 7: goto L_0x04ac;
                case 8: goto L_0x049f;
                case 9: goto L_0x048b;
                case 10: goto L_0x0477;
                case 11: goto L_0x0465;
                case 12: goto L_0x0453;
                case 13: goto L_0x0441;
                case 14: goto L_0x042f;
                case 15: goto L_0x041f;
                case 16: goto L_0x040f;
                case 17: goto L_0x03fb;
                case 18: goto L_0x03eb;
                case 19: goto L_0x03db;
                case 20: goto L_0x03cb;
                case 21: goto L_0x03bb;
                case 22: goto L_0x03ab;
                case 23: goto L_0x039b;
                case 24: goto L_0x038b;
                case 25: goto L_0x037b;
                case 26: goto L_0x036b;
                case 27: goto L_0x0359;
                case 28: goto L_0x034b;
                case 29: goto L_0x033b;
                case 30: goto L_0x032b;
                case 31: goto L_0x031b;
                case 32: goto L_0x030b;
                case 33: goto L_0x02fb;
                case 34: goto L_0x02eb;
                case 35: goto L_0x02db;
                case 36: goto L_0x02cb;
                case 37: goto L_0x02bb;
                case 38: goto L_0x02ab;
                case 39: goto L_0x029b;
                case 40: goto L_0x028b;
                case 41: goto L_0x027b;
                case 42: goto L_0x026b;
                case 43: goto L_0x025b;
                case 44: goto L_0x024b;
                case 45: goto L_0x023b;
                case 46: goto L_0x022b;
                case 47: goto L_0x021b;
                case 48: goto L_0x020b;
                case 49: goto L_0x01f8;
                case 50: goto L_0x01ef;
                case 51: goto L_0x01dd;
                case 52: goto L_0x01cb;
                case 53: goto L_0x01b7;
                case 54: goto L_0x01a3;
                case 55: goto L_0x018f;
                case 56: goto L_0x017b;
                case 57: goto L_0x0167;
                case 58: goto L_0x0153;
                case 59: goto L_0x0144;
                case 60: goto L_0x012e;
                case 61: goto L_0x0118;
                case 62: goto L_0x0104;
                case 63: goto L_0x00f0;
                case 64: goto L_0x00dc;
                case 65: goto L_0x00c8;
                case 66: goto L_0x00b6;
                case 67: goto L_0x00a4;
                case 68: goto L_0x008e;
                default: goto L_0x008c;
            }
        L_0x008c:
            goto L_0x0378
        L_0x008e:
            boolean r4 = r0.mo15200a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0378
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.fyber.inneractive.sdk.protobuf.f1 r8 = r0.mo15207c((int) r10)
            r9 = r2
            com.fyber.inneractive.sdk.protobuf.m r9 = (com.fyber.inneractive.sdk.protobuf.C3548m) r9
            r9.mo15103a(r14, r4, r8)
            goto L_0x0378
        L_0x00a4:
            boolean r4 = r0.mo15200a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0378
            long r8 = m9534e(r1, r8)
            r4 = r2
            com.fyber.inneractive.sdk.protobuf.m r4 = (com.fyber.inneractive.sdk.protobuf.C3548m) r4
            r4.mo15101a((int) r14, (long) r8)
            goto L_0x0378
        L_0x00b6:
            boolean r4 = r0.mo15200a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0378
            int r4 = m9532d(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            r8.mo15100a((int) r14, (int) r4)
            goto L_0x0378
        L_0x00c8:
            boolean r4 = r0.mo15200a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0378
            long r8 = m9534e(r1, r8)
            r4 = r2
            com.fyber.inneractive.sdk.protobuf.m r4 = (com.fyber.inneractive.sdk.protobuf.C3548m) r4
            com.fyber.inneractive.sdk.protobuf.l r4 = r4.f12518a
            r4.mo15070f((int) r14, (long) r8)
            goto L_0x0378
        L_0x00dc:
            boolean r4 = r0.mo15200a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0378
            int r4 = m9532d(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f12518a
            r8.mo15072g((int) r14, (int) r4)
            goto L_0x0378
        L_0x00f0:
            boolean r4 = r0.mo15200a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0378
            int r4 = m9532d(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f12518a
            r8.mo15074h(r14, r4)
            goto L_0x0378
        L_0x0104:
            boolean r4 = r0.mo15200a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0378
            int r4 = m9532d(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f12518a
            r8.mo15076j(r14, r4)
            goto L_0x0378
        L_0x0118:
            boolean r4 = r0.mo15200a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0378
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.fyber.inneractive.sdk.protobuf.i r4 = (com.fyber.inneractive.sdk.protobuf.C3508i) r4
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f12518a
            r8.mo15061b((int) r14, (com.fyber.inneractive.sdk.protobuf.C3508i) r4)
            goto L_0x0378
        L_0x012e:
            boolean r4 = r0.mo15200a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0378
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.fyber.inneractive.sdk.protobuf.f1 r8 = r0.mo15207c((int) r10)
            r9 = r2
            com.fyber.inneractive.sdk.protobuf.m r9 = (com.fyber.inneractive.sdk.protobuf.C3548m) r9
            r9.mo15104b(r14, r4, r8)
            goto L_0x0378
        L_0x0144:
            boolean r4 = r0.mo15200a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0378
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.mo15191a((int) r14, (java.lang.Object) r4, (com.fyber.inneractive.sdk.protobuf.C3599u1) r2)
            goto L_0x0378
        L_0x0153:
            boolean r4 = r0.mo15200a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0378
            boolean r4 = m9529a(r1, (long) r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f12518a
            r8.mo15064b((int) r14, (boolean) r4)
            goto L_0x0378
        L_0x0167:
            boolean r4 = r0.mo15200a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0378
            int r4 = m9532d(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f12518a
            r8.mo15072g((int) r14, (int) r4)
            goto L_0x0378
        L_0x017b:
            boolean r4 = r0.mo15200a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0378
            long r8 = m9534e(r1, r8)
            r4 = r2
            com.fyber.inneractive.sdk.protobuf.m r4 = (com.fyber.inneractive.sdk.protobuf.C3548m) r4
            com.fyber.inneractive.sdk.protobuf.l r4 = r4.f12518a
            r4.mo15070f((int) r14, (long) r8)
            goto L_0x0378
        L_0x018f:
            boolean r4 = r0.mo15200a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0378
            int r4 = m9532d(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f12518a
            r8.mo15074h(r14, r4)
            goto L_0x0378
        L_0x01a3:
            boolean r4 = r0.mo15200a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0378
            long r8 = m9534e(r1, r8)
            r4 = r2
            com.fyber.inneractive.sdk.protobuf.m r4 = (com.fyber.inneractive.sdk.protobuf.C3548m) r4
            com.fyber.inneractive.sdk.protobuf.l r4 = r4.f12518a
            r4.mo15073g((int) r14, (long) r8)
            goto L_0x0378
        L_0x01b7:
            boolean r4 = r0.mo15200a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0378
            long r8 = m9534e(r1, r8)
            r4 = r2
            com.fyber.inneractive.sdk.protobuf.m r4 = (com.fyber.inneractive.sdk.protobuf.C3548m) r4
            com.fyber.inneractive.sdk.protobuf.l r4 = r4.f12518a
            r4.mo15073g((int) r14, (long) r8)
            goto L_0x0378
        L_0x01cb:
            boolean r4 = r0.mo15200a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0378
            float r4 = m9531c(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            r8.mo15099a((int) r14, (float) r4)
            goto L_0x0378
        L_0x01dd:
            boolean r4 = r0.mo15200a(r1, (int) r14, (int) r10)
            if (r4 == 0) goto L_0x0378
            double r8 = m9530b(r1, (long) r8)
            r4 = r2
            com.fyber.inneractive.sdk.protobuf.m r4 = (com.fyber.inneractive.sdk.protobuf.C3548m) r4
            r4.mo15098a((int) r14, (double) r8)
            goto L_0x0378
        L_0x01ef:
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.mo15193a((com.fyber.inneractive.sdk.protobuf.C3599u1) r2, (int) r14, (java.lang.Object) r4, (int) r10)
            goto L_0x0378
        L_0x01f8:
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.f1 r9 = r0.mo15207c((int) r10)
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8932a((int) r4, (java.util.List<?>) r8, (com.fyber.inneractive.sdk.protobuf.C3599u1) r2, (com.fyber.inneractive.sdk.protobuf.C3498f1) r9)
            goto L_0x0378
        L_0x020b:
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 1
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8966l(r4, r8, r2, r13)
            goto L_0x0378
        L_0x021b:
            r13 = 1
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8965k(r4, r8, r2, r13)
            goto L_0x0378
        L_0x022b:
            r13 = 1
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8964j(r4, r8, r2, r13)
            goto L_0x0378
        L_0x023b:
            r13 = 1
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8962i(r4, r8, r2, r13)
            goto L_0x0378
        L_0x024b:
            r13 = 1
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8944c(r4, r8, r2, r13)
            goto L_0x0378
        L_0x025b:
            r13 = 1
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8967m(r4, r8, r2, r13)
            goto L_0x0378
        L_0x026b:
            r13 = 1
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8933a((int) r4, (java.util.List<java.lang.Boolean>) r8, (com.fyber.inneractive.sdk.protobuf.C3599u1) r2, (boolean) r13)
            goto L_0x0378
        L_0x027b:
            r13 = 1
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8947d(r4, r8, r2, r13)
            goto L_0x0378
        L_0x028b:
            r13 = 1
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8950e(r4, r8, r2, r13)
            goto L_0x0378
        L_0x029b:
            r13 = 1
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8956g(r4, r8, r2, r13)
            goto L_0x0378
        L_0x02ab:
            r13 = 1
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8968n(r4, r8, r2, r13)
            goto L_0x0378
        L_0x02bb:
            r13 = 1
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8959h(r4, r8, r2, r13)
            goto L_0x0378
        L_0x02cb:
            r13 = 1
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8953f(r4, r8, r2, r13)
            goto L_0x0378
        L_0x02db:
            r13 = 1
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8941b((int) r4, (java.util.List<java.lang.Double>) r8, (com.fyber.inneractive.sdk.protobuf.C3599u1) r2, (boolean) r13)
            goto L_0x0378
        L_0x02eb:
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8966l(r4, r8, r2, r13)
            goto L_0x0536
        L_0x02fb:
            r13 = 0
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8965k(r4, r8, r2, r13)
            goto L_0x0536
        L_0x030b:
            r13 = 0
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8964j(r4, r8, r2, r13)
            goto L_0x0536
        L_0x031b:
            r13 = 0
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8962i(r4, r8, r2, r13)
            goto L_0x0536
        L_0x032b:
            r13 = 0
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8944c(r4, r8, r2, r13)
            goto L_0x0536
        L_0x033b:
            r13 = 0
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8967m(r4, r8, r2, r13)
            goto L_0x0536
        L_0x034b:
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8931a((int) r4, (java.util.List<com.fyber.inneractive.sdk.protobuf.C3508i>) r8, (com.fyber.inneractive.sdk.protobuf.C3599u1) r2)
            goto L_0x0378
        L_0x0359:
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.f1 r9 = r0.mo15207c((int) r10)
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8940b((int) r4, (java.util.List<?>) r8, (com.fyber.inneractive.sdk.protobuf.C3599u1) r2, (com.fyber.inneractive.sdk.protobuf.C3498f1) r9)
            goto L_0x0378
        L_0x036b:
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8939b((int) r4, (java.util.List<java.lang.String>) r8, (com.fyber.inneractive.sdk.protobuf.C3599u1) r2)
        L_0x0378:
            r13 = 0
            goto L_0x0536
        L_0x037b:
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            r13 = 0
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8933a((int) r4, (java.util.List<java.lang.Boolean>) r8, (com.fyber.inneractive.sdk.protobuf.C3599u1) r2, (boolean) r13)
            goto L_0x0536
        L_0x038b:
            r13 = 0
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8947d(r4, r8, r2, r13)
            goto L_0x0536
        L_0x039b:
            r13 = 0
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8950e(r4, r8, r2, r13)
            goto L_0x0536
        L_0x03ab:
            r13 = 0
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8956g(r4, r8, r2, r13)
            goto L_0x0536
        L_0x03bb:
            r13 = 0
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8968n(r4, r8, r2, r13)
            goto L_0x0536
        L_0x03cb:
            r13 = 0
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8959h(r4, r8, r2, r13)
            goto L_0x0536
        L_0x03db:
            r13 = 0
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8953f(r4, r8, r2, r13)
            goto L_0x0536
        L_0x03eb:
            r13 = 0
            int[] r4 = r0.f12555a
            r4 = r4[r10]
            java.lang.Object r8 = r7.getObject(r1, r8)
            java.util.List r8 = (java.util.List) r8
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8941b((int) r4, (java.util.List<java.lang.Double>) r8, (com.fyber.inneractive.sdk.protobuf.C3599u1) r2, (boolean) r13)
            goto L_0x0536
        L_0x03fb:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0536
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.fyber.inneractive.sdk.protobuf.f1 r8 = r0.mo15207c((int) r10)
            r9 = r2
            com.fyber.inneractive.sdk.protobuf.m r9 = (com.fyber.inneractive.sdk.protobuf.C3548m) r9
            r9.mo15103a(r14, r4, r8)
            goto L_0x0536
        L_0x040f:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0536
            long r8 = r7.getLong(r1, r8)
            r4 = r2
            com.fyber.inneractive.sdk.protobuf.m r4 = (com.fyber.inneractive.sdk.protobuf.C3548m) r4
            r4.mo15101a((int) r14, (long) r8)
            goto L_0x0536
        L_0x041f:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0536
            int r4 = r7.getInt(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            r8.mo15100a((int) r14, (int) r4)
            goto L_0x0536
        L_0x042f:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0536
            long r8 = r7.getLong(r1, r8)
            r4 = r2
            com.fyber.inneractive.sdk.protobuf.m r4 = (com.fyber.inneractive.sdk.protobuf.C3548m) r4
            com.fyber.inneractive.sdk.protobuf.l r4 = r4.f12518a
            r4.mo15070f((int) r14, (long) r8)
            goto L_0x0536
        L_0x0441:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0536
            int r4 = r7.getInt(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f12518a
            r8.mo15072g((int) r14, (int) r4)
            goto L_0x0536
        L_0x0453:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0536
            int r4 = r7.getInt(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f12518a
            r8.mo15074h(r14, r4)
            goto L_0x0536
        L_0x0465:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0536
            int r4 = r7.getInt(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f12518a
            r8.mo15076j(r14, r4)
            goto L_0x0536
        L_0x0477:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0536
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.fyber.inneractive.sdk.protobuf.i r4 = (com.fyber.inneractive.sdk.protobuf.C3508i) r4
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f12518a
            r8.mo15061b((int) r14, (com.fyber.inneractive.sdk.protobuf.C3508i) r4)
            goto L_0x0536
        L_0x048b:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0536
            java.lang.Object r4 = r7.getObject(r1, r8)
            com.fyber.inneractive.sdk.protobuf.f1 r8 = r0.mo15207c((int) r10)
            r9 = r2
            com.fyber.inneractive.sdk.protobuf.m r9 = (com.fyber.inneractive.sdk.protobuf.C3548m) r9
            r9.mo15104b(r14, r4, r8)
            goto L_0x0536
        L_0x049f:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0536
            java.lang.Object r4 = r7.getObject(r1, r8)
            r0.mo15191a((int) r14, (java.lang.Object) r4, (com.fyber.inneractive.sdk.protobuf.C3599u1) r2)
            goto L_0x0536
        L_0x04ac:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0536
            com.fyber.inneractive.sdk.protobuf.r1$d r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.f12543e
            boolean r4 = r4.mo15173a(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f12518a
            r8.mo15064b((int) r14, (boolean) r4)
            goto L_0x0536
        L_0x04c0:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0536
            int r4 = r7.getInt(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f12518a
            r8.mo15072g((int) r14, (int) r4)
            goto L_0x0536
        L_0x04d1:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0536
            long r8 = r7.getLong(r1, r8)
            r4 = r2
            com.fyber.inneractive.sdk.protobuf.m r4 = (com.fyber.inneractive.sdk.protobuf.C3548m) r4
            com.fyber.inneractive.sdk.protobuf.l r4 = r4.f12518a
            r4.mo15070f((int) r14, (long) r8)
            goto L_0x0536
        L_0x04e2:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0536
            int r4 = r7.getInt(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f12518a
            r8.mo15074h(r14, r4)
            goto L_0x0536
        L_0x04f3:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0536
            long r8 = r7.getLong(r1, r8)
            r4 = r2
            com.fyber.inneractive.sdk.protobuf.m r4 = (com.fyber.inneractive.sdk.protobuf.C3548m) r4
            com.fyber.inneractive.sdk.protobuf.l r4 = r4.f12518a
            r4.mo15073g((int) r14, (long) r8)
            goto L_0x0536
        L_0x0504:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0536
            long r8 = r7.getLong(r1, r8)
            r4 = r2
            com.fyber.inneractive.sdk.protobuf.m r4 = (com.fyber.inneractive.sdk.protobuf.C3548m) r4
            com.fyber.inneractive.sdk.protobuf.l r4 = r4.f12518a
            r4.mo15073g((int) r14, (long) r8)
            goto L_0x0536
        L_0x0515:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0536
            com.fyber.inneractive.sdk.protobuf.r1$d r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.f12543e
            float r4 = r4.mo15177d(r1, r8)
            r8 = r2
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            r8.mo15099a((int) r14, (float) r4)
            goto L_0x0536
        L_0x0526:
            r13 = 0
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0536
            com.fyber.inneractive.sdk.protobuf.r1$d r4 = com.fyber.inneractive.sdk.protobuf.C3569r1.f12543e
            double r8 = r4.mo15176c(r1, r8)
            r4 = r2
            com.fyber.inneractive.sdk.protobuf.m r4 = (com.fyber.inneractive.sdk.protobuf.C3548m) r4
            r4.mo15098a((int) r14, (double) r8)
        L_0x0536:
            int r10 = r10 + 3
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x003e
        L_0x053d:
            if (r5 == 0) goto L_0x0554
            com.fyber.inneractive.sdk.protobuf.r<?> r4 = r0.f12570p
            r4.mo15163a(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0552
            java.lang.Object r4 = r3.next()
            r5 = r4
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x053d
        L_0x0552:
            r5 = 0
            goto L_0x053d
        L_0x0554:
            com.fyber.inneractive.sdk.protobuf.m1<?, ?> r3 = r0.f12569o
            java.lang.Object r1 = r3.mo15115b(r1)
            r3.mo15117b(r1, (com.fyber.inneractive.sdk.protobuf.C3599u1) r2)
        L_0x055d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C3583t0.mo14892a(java.lang.Object, com.fyber.inneractive.sdk.protobuf.u1):void");
    }

    /* renamed from: a */
    public final <K, V> void mo15193a(C3599u1 u1Var, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            this.f12571q.mo15097f(this.f12556b[(i2 / 3) * 2]);
            Map<?, ?> a = this.f12571q.mo15092a(obj);
            C3548m mVar = (C3548m) u1Var;
            mVar.f12518a.getClass();
            Iterator<Map.Entry<?, ?>> it = a.entrySet().iterator();
            if (it.hasNext()) {
                Map.Entry next = it.next();
                mVar.f12518a.mo15075i(i, 2);
                next.getKey();
                next.getValue();
                throw null;
            }
        }
    }

    /* renamed from: a */
    public void mo14891a(T t, C3493e1 e1Var, C3562q qVar) throws IOException {
        qVar.getClass();
        mo15192a(this.f12569o, this.f12570p, t, e1Var, qVar);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: a */
    public final <UT, UB, ET extends com.fyber.inneractive.sdk.protobuf.C3596u.C3597a<ET>> void mo15192a(com.fyber.inneractive.sdk.protobuf.C3550m1<UT, UB> r17, com.fyber.inneractive.sdk.protobuf.C3567r<ET> r18, T r19, com.fyber.inneractive.sdk.protobuf.C3493e1 r20, com.fyber.inneractive.sdk.protobuf.C3562q r21) throws java.io.IOException {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            r10 = r19
            r0 = r20
            r11 = r21
            r12 = 0
            r13 = r12
            r14 = r13
        L_0x000d:
            int r1 = r20.mo14869s()     // Catch:{ all -> 0x0613 }
            int r3 = r8.mo15208e((int) r1)     // Catch:{ all -> 0x0613 }
            if (r3 >= 0) goto L_0x008f
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0033
            int r0 = r8.f12565k
        L_0x001e:
            int r1 = r8.f12566l
            if (r0 >= r1) goto L_0x002d
            int[] r1 = r8.f12564j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo15190a((java.lang.Object) r10, (int) r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x001e
        L_0x002d:
            if (r13 == 0) goto L_0x0032
            r9.mo15118b((java.lang.Object) r10, r13)
        L_0x0032:
            return
        L_0x0033:
            boolean r2 = r8.f12560f     // Catch:{ all -> 0x0613 }
            if (r2 != 0) goto L_0x003b
            r15 = r18
            r3 = r12
            goto L_0x0044
        L_0x003b:
            com.fyber.inneractive.sdk.protobuf.q0 r2 = r8.f12559e     // Catch:{ all -> 0x0613 }
            r15 = r18
            java.lang.Object r1 = r15.mo15160a(r11, r2, r1)     // Catch:{ all -> 0x0613 }
            r3 = r1
        L_0x0044:
            if (r3 == 0) goto L_0x005d
            if (r14 != 0) goto L_0x004d
            com.fyber.inneractive.sdk.protobuf.u r1 = r18.mo15165b(r19)     // Catch:{ all -> 0x0613 }
            r14 = r1
        L_0x004d:
            r1 = r18
            r2 = r20
            r4 = r21
            r5 = r14
            r6 = r13
            r7 = r17
            java.lang.Object r1 = r1.mo15159a(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0613 }
        L_0x005b:
            r13 = r1
            goto L_0x000d
        L_0x005d:
            boolean r1 = r9.mo15113a((com.fyber.inneractive.sdk.protobuf.C3493e1) r0)     // Catch:{ all -> 0x0613 }
            if (r1 == 0) goto L_0x006a
            boolean r1 = r20.mo14851i()     // Catch:{ all -> 0x0613 }
            if (r1 == 0) goto L_0x0078
            goto L_0x000d
        L_0x006a:
            if (r13 != 0) goto L_0x0071
            java.lang.Object r1 = r9.mo15106a((java.lang.Object) r10)     // Catch:{ all -> 0x0613 }
            r13 = r1
        L_0x0071:
            boolean r1 = r9.mo15114a(r13, (com.fyber.inneractive.sdk.protobuf.C3493e1) r0)     // Catch:{ all -> 0x0613 }
            if (r1 == 0) goto L_0x0078
            goto L_0x000d
        L_0x0078:
            int r0 = r8.f12565k
        L_0x007a:
            int r1 = r8.f12566l
            if (r0 >= r1) goto L_0x0089
            int[] r1 = r8.f12564j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo15190a((java.lang.Object) r10, (int) r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x007a
        L_0x0089:
            if (r13 == 0) goto L_0x008e
            r9.mo15118b((java.lang.Object) r10, r13)
        L_0x008e:
            return
        L_0x008f:
            r15 = r18
            int r4 = r8.mo15209g(r3)     // Catch:{ all -> 0x0613 }
            int r2 = m9536f(r4)     // Catch:{ a -> 0x05cc }
            switch(r2) {
                case 0: goto L_0x059e;
                case 1: goto L_0x058e;
                case 2: goto L_0x057e;
                case 3: goto L_0x056e;
                case 4: goto L_0x055e;
                case 5: goto L_0x054e;
                case 6: goto L_0x053e;
                case 7: goto L_0x052e;
                case 8: goto L_0x0526;
                case 9: goto L_0x04ef;
                case 10: goto L_0x04df;
                case 11: goto L_0x04cf;
                case 12: goto L_0x04ac;
                case 13: goto L_0x049c;
                case 14: goto L_0x048c;
                case 15: goto L_0x047c;
                case 16: goto L_0x046c;
                case 17: goto L_0x0435;
                case 18: goto L_0x0426;
                case 19: goto L_0x0417;
                case 20: goto L_0x0408;
                case 21: goto L_0x03f9;
                case 22: goto L_0x03ea;
                case 23: goto L_0x03db;
                case 24: goto L_0x03cc;
                case 25: goto L_0x03bd;
                case 26: goto L_0x03b8;
                case 27: goto L_0x03a6;
                case 28: goto L_0x0397;
                case 29: goto L_0x0388;
                case 30: goto L_0x0371;
                case 31: goto L_0x0362;
                case 32: goto L_0x0353;
                case 33: goto L_0x0344;
                case 34: goto L_0x0335;
                case 35: goto L_0x0326;
                case 36: goto L_0x0317;
                case 37: goto L_0x0308;
                case 38: goto L_0x02f9;
                case 39: goto L_0x02ea;
                case 40: goto L_0x02db;
                case 41: goto L_0x02cc;
                case 42: goto L_0x02bd;
                case 43: goto L_0x02ae;
                case 44: goto L_0x0297;
                case 45: goto L_0x0288;
                case 46: goto L_0x0279;
                case 47: goto L_0x026a;
                case 48: goto L_0x025b;
                case 49: goto L_0x0245;
                case 50: goto L_0x0234;
                case 51: goto L_0x0220;
                case 52: goto L_0x020c;
                case 53: goto L_0x01f8;
                case 54: goto L_0x01e4;
                case 55: goto L_0x01d0;
                case 56: goto L_0x01bc;
                case 57: goto L_0x01a8;
                case 58: goto L_0x0194;
                case 59: goto L_0x018c;
                case 60: goto L_0x0153;
                case 61: goto L_0x0143;
                case 62: goto L_0x012f;
                case 63: goto L_0x0108;
                case 64: goto L_0x00f4;
                case 65: goto L_0x00e0;
                case 66: goto L_0x00cc;
                case 67: goto L_0x00b8;
                case 68: goto L_0x00a4;
                default: goto L_0x009c;
            }     // Catch:{ a -> 0x05cc }
        L_0x009c:
            if (r13 != 0) goto L_0x05af
            java.lang.Object r1 = r17.mo15105a()     // Catch:{ a -> 0x05cc }
            goto L_0x05ae
        L_0x00a4:
            long r4 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.f1 r2 = r8.mo15207c((int) r3)     // Catch:{ a -> 0x05cc }
            java.lang.Object r2 = r0.mo14828a(r2, (com.fyber.inneractive.sdk.protobuf.C3562q) r11)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9426a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05cc }
            r8.mo15203b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x00b8:
            long r4 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            long r6 = r20.mo14856l()     // Catch:{ a -> 0x05cc }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9426a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05cc }
            r8.mo15203b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x00cc:
            long r4 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            int r2 = r20.mo14852j()     // Catch:{ a -> 0x05cc }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9426a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05cc }
            r8.mo15203b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x00e0:
            long r4 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            long r6 = r20.mo14870t()     // Catch:{ a -> 0x05cc }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9426a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05cc }
            r8.mo15203b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x00f4:
            long r4 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            int r2 = r20.mo14858m()     // Catch:{ a -> 0x05cc }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9426a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05cc }
            r8.mo15203b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x0108:
            int r2 = r20.mo14833b()     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.z$e r5 = r8.mo15189a((int) r3)     // Catch:{ a -> 0x05cc }
            if (r5 == 0) goto L_0x011f
            boolean r5 = r5.mo15254a(r2)     // Catch:{ a -> 0x05cc }
            if (r5 == 0) goto L_0x0119
            goto L_0x011f
        L_0x0119:
            java.lang.Object r1 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8928a((int) r1, (int) r2, r13, r9)     // Catch:{ a -> 0x05cc }
            goto L_0x005b
        L_0x011f:
            long r4 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9426a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05cc }
            r8.mo15203b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x012f:
            long r4 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            int r2 = r20.mo14838c()     // Catch:{ a -> 0x05cc }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9426a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05cc }
            r8.mo15203b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x0143:
            long r4 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.i r2 = r20.mo14827a()     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9426a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05cc }
            r8.mo15203b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x0153:
            boolean r2 = r8.mo15200a(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05cc }
            if (r2 == 0) goto L_0x0175
            long r5 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.lang.Object r2 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r10, r5)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.f1 r5 = r8.mo15207c((int) r3)     // Catch:{ a -> 0x05cc }
            java.lang.Object r5 = r0.mo14834b(r5, (com.fyber.inneractive.sdk.protobuf.C3562q) r11)     // Catch:{ a -> 0x05cc }
            java.lang.Object r2 = com.fyber.inneractive.sdk.protobuf.C3609z.m9637a((java.lang.Object) r2, (java.lang.Object) r5)     // Catch:{ a -> 0x05cc }
            long r4 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9426a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05cc }
            goto L_0x0187
        L_0x0175:
            long r4 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.f1 r2 = r8.mo15207c((int) r3)     // Catch:{ a -> 0x05cc }
            java.lang.Object r2 = r0.mo14834b(r2, (com.fyber.inneractive.sdk.protobuf.C3562q) r11)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9426a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05cc }
            r8.mo15202b(r10, (int) r3)     // Catch:{ a -> 0x05cc }
        L_0x0187:
            r8.mo15203b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x018c:
            r8.mo15194a((java.lang.Object) r10, (int) r4, (com.fyber.inneractive.sdk.protobuf.C3493e1) r0)     // Catch:{ a -> 0x05cc }
            r8.mo15203b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x0194:
            long r4 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            boolean r2 = r20.mo14868r()     // Catch:{ a -> 0x05cc }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9426a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05cc }
            r8.mo15203b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x01a8:
            long r4 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            int r2 = r20.mo14866q()     // Catch:{ a -> 0x05cc }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9426a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05cc }
            r8.mo15203b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x01bc:
            long r4 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            long r6 = r20.mo14846g()     // Catch:{ a -> 0x05cc }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9426a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05cc }
            r8.mo15203b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x01d0:
            long r4 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            int r2 = r20.mo14840d()     // Catch:{ a -> 0x05cc }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9426a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05cc }
            r8.mo15203b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x01e4:
            long r4 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            long r6 = r20.mo14844f()     // Catch:{ a -> 0x05cc }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9426a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05cc }
            r8.mo15203b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x01f8:
            long r4 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            long r6 = r20.mo14862o()     // Catch:{ a -> 0x05cc }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9426a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05cc }
            r8.mo15203b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x020c:
            long r4 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            float r2 = r20.mo14854k()     // Catch:{ a -> 0x05cc }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9426a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05cc }
            r8.mo15203b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x0220:
            long r4 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            double r6 = r20.mo14848h()     // Catch:{ a -> 0x05cc }
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9426a((java.lang.Object) r10, (long) r4, (java.lang.Object) r2)     // Catch:{ a -> 0x05cc }
            r8.mo15203b(r10, (int) r1, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x0234:
            java.lang.Object r4 = r8.mo15201b((int) r3)     // Catch:{ a -> 0x05cc }
            r1 = r16
            r2 = r19
            r5 = r21
            r6 = r20
            r1.mo15196a((java.lang.Object) r2, (int) r3, (java.lang.Object) r4, (com.fyber.inneractive.sdk.protobuf.C3562q) r5, (com.fyber.inneractive.sdk.protobuf.C3493e1) r6)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x0245:
            long r4 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.f1 r6 = r8.mo15207c((int) r3)     // Catch:{ a -> 0x05cc }
            r1 = r16
            r2 = r19
            r3 = r4
            r5 = r20
            r7 = r21
            r1.mo15197a((java.lang.Object) r2, (long) r3, (com.fyber.inneractive.sdk.protobuf.C3493e1) r5, r6, (com.fyber.inneractive.sdk.protobuf.C3562q) r7)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x025b:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f12568n     // Catch:{ a -> 0x05cc }
            long r2 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.util.List r1 = r1.mo14913b(r10, r2)     // Catch:{ a -> 0x05cc }
            r0.mo14847g(r1)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x026a:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f12568n     // Catch:{ a -> 0x05cc }
            long r2 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.util.List r1 = r1.mo14913b(r10, r2)     // Catch:{ a -> 0x05cc }
            r0.mo14839c(r1)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x0279:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f12568n     // Catch:{ a -> 0x05cc }
            long r2 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.util.List r1 = r1.mo14913b(r10, r2)     // Catch:{ a -> 0x05cc }
            r0.mo14859m(r1)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x0288:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f12568n     // Catch:{ a -> 0x05cc }
            long r2 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.util.List r1 = r1.mo14913b(r10, r2)     // Catch:{ a -> 0x05cc }
            r0.mo14845f(r1)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x0297:
            com.fyber.inneractive.sdk.protobuf.g0 r2 = r8.f12568n     // Catch:{ a -> 0x05cc }
            long r4 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.util.List r2 = r2.mo14913b(r10, r4)     // Catch:{ a -> 0x05cc }
            r0.mo14865p(r2)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.z$e r3 = r8.mo15189a((int) r3)     // Catch:{ a -> 0x05cc }
            java.lang.Object r1 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8930a((int) r1, (java.util.List<java.lang.Integer>) r2, (com.fyber.inneractive.sdk.protobuf.C3609z.C3614e) r3, r13, r9)     // Catch:{ a -> 0x05cc }
            goto L_0x005b
        L_0x02ae:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f12568n     // Catch:{ a -> 0x05cc }
            long r2 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.util.List r1 = r1.mo14913b(r10, r2)     // Catch:{ a -> 0x05cc }
            r0.mo14850i(r1)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x02bd:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f12568n     // Catch:{ a -> 0x05cc }
            long r2 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.util.List r1 = r1.mo14913b(r10, r2)     // Catch:{ a -> 0x05cc }
            r0.mo14857l(r1)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x02cc:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f12568n     // Catch:{ a -> 0x05cc }
            long r2 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.util.List r1 = r1.mo14913b(r10, r2)     // Catch:{ a -> 0x05cc }
            r0.mo14843e(r1)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x02db:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f12568n     // Catch:{ a -> 0x05cc }
            long r2 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.util.List r1 = r1.mo14913b(r10, r2)     // Catch:{ a -> 0x05cc }
            r0.mo14861n(r1)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x02ea:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f12568n     // Catch:{ a -> 0x05cc }
            long r2 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.util.List r1 = r1.mo14913b(r10, r2)     // Catch:{ a -> 0x05cc }
            r0.mo14863o(r1)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x02f9:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f12568n     // Catch:{ a -> 0x05cc }
            long r2 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.util.List r1 = r1.mo14913b(r10, r2)     // Catch:{ a -> 0x05cc }
            r0.mo14830a(r1)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x0308:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f12568n     // Catch:{ a -> 0x05cc }
            long r2 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.util.List r1 = r1.mo14913b(r10, r2)     // Catch:{ a -> 0x05cc }
            r0.mo14855k(r1)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x0317:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f12568n     // Catch:{ a -> 0x05cc }
            long r2 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.util.List r1 = r1.mo14913b(r10, r2)     // Catch:{ a -> 0x05cc }
            r0.mo14841d(r1)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x0326:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f12568n     // Catch:{ a -> 0x05cc }
            long r2 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.util.List r1 = r1.mo14913b(r10, r2)     // Catch:{ a -> 0x05cc }
            r0.mo14853j(r1)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x0335:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f12568n     // Catch:{ a -> 0x05cc }
            long r2 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.util.List r1 = r1.mo14913b(r10, r2)     // Catch:{ a -> 0x05cc }
            r0.mo14847g(r1)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x0344:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f12568n     // Catch:{ a -> 0x05cc }
            long r2 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.util.List r1 = r1.mo14913b(r10, r2)     // Catch:{ a -> 0x05cc }
            r0.mo14839c(r1)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x0353:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f12568n     // Catch:{ a -> 0x05cc }
            long r2 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.util.List r1 = r1.mo14913b(r10, r2)     // Catch:{ a -> 0x05cc }
            r0.mo14859m(r1)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x0362:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f12568n     // Catch:{ a -> 0x05cc }
            long r2 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.util.List r1 = r1.mo14913b(r10, r2)     // Catch:{ a -> 0x05cc }
            r0.mo14845f(r1)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x0371:
            com.fyber.inneractive.sdk.protobuf.g0 r2 = r8.f12568n     // Catch:{ a -> 0x05cc }
            long r4 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.util.List r2 = r2.mo14913b(r10, r4)     // Catch:{ a -> 0x05cc }
            r0.mo14865p(r2)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.z$e r3 = r8.mo15189a((int) r3)     // Catch:{ a -> 0x05cc }
            java.lang.Object r1 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8930a((int) r1, (java.util.List<java.lang.Integer>) r2, (com.fyber.inneractive.sdk.protobuf.C3609z.C3614e) r3, r13, r9)     // Catch:{ a -> 0x05cc }
            goto L_0x005b
        L_0x0388:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f12568n     // Catch:{ a -> 0x05cc }
            long r2 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.util.List r1 = r1.mo14913b(r10, r2)     // Catch:{ a -> 0x05cc }
            r0.mo14850i(r1)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x0397:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f12568n     // Catch:{ a -> 0x05cc }
            long r2 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.util.List r1 = r1.mo14913b(r10, r2)     // Catch:{ a -> 0x05cc }
            r0.mo14849h(r1)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x03a6:
            com.fyber.inneractive.sdk.protobuf.f1 r5 = r8.mo15207c((int) r3)     // Catch:{ a -> 0x05cc }
            r1 = r16
            r2 = r19
            r3 = r4
            r4 = r20
            r6 = r21
            r1.mo15195a((java.lang.Object) r2, (int) r3, (com.fyber.inneractive.sdk.protobuf.C3493e1) r4, r5, (com.fyber.inneractive.sdk.protobuf.C3562q) r6)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x03b8:
            r8.mo15204b((java.lang.Object) r10, (int) r4, (com.fyber.inneractive.sdk.protobuf.C3493e1) r0)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x03bd:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f12568n     // Catch:{ a -> 0x05cc }
            long r2 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.util.List r1 = r1.mo14913b(r10, r2)     // Catch:{ a -> 0x05cc }
            r0.mo14857l(r1)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x03cc:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f12568n     // Catch:{ a -> 0x05cc }
            long r2 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.util.List r1 = r1.mo14913b(r10, r2)     // Catch:{ a -> 0x05cc }
            r0.mo14843e(r1)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x03db:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f12568n     // Catch:{ a -> 0x05cc }
            long r2 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.util.List r1 = r1.mo14913b(r10, r2)     // Catch:{ a -> 0x05cc }
            r0.mo14861n(r1)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x03ea:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f12568n     // Catch:{ a -> 0x05cc }
            long r2 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.util.List r1 = r1.mo14913b(r10, r2)     // Catch:{ a -> 0x05cc }
            r0.mo14863o(r1)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x03f9:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f12568n     // Catch:{ a -> 0x05cc }
            long r2 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.util.List r1 = r1.mo14913b(r10, r2)     // Catch:{ a -> 0x05cc }
            r0.mo14830a(r1)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x0408:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f12568n     // Catch:{ a -> 0x05cc }
            long r2 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.util.List r1 = r1.mo14913b(r10, r2)     // Catch:{ a -> 0x05cc }
            r0.mo14855k(r1)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x0417:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f12568n     // Catch:{ a -> 0x05cc }
            long r2 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.util.List r1 = r1.mo14913b(r10, r2)     // Catch:{ a -> 0x05cc }
            r0.mo14841d(r1)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x0426:
            com.fyber.inneractive.sdk.protobuf.g0 r1 = r8.f12568n     // Catch:{ a -> 0x05cc }
            long r2 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.util.List r1 = r1.mo14913b(r10, r2)     // Catch:{ a -> 0x05cc }
            r0.mo14853j(r1)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x0435:
            boolean r1 = r8.mo15199a(r10, (int) r3)     // Catch:{ a -> 0x05cc }
            if (r1 == 0) goto L_0x0458
            long r1 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.lang.Object r1 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r10, r1)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.f1 r2 = r8.mo15207c((int) r3)     // Catch:{ a -> 0x05cc }
            java.lang.Object r2 = r0.mo14828a(r2, (com.fyber.inneractive.sdk.protobuf.C3562q) r11)     // Catch:{ a -> 0x05cc }
            java.lang.Object r1 = com.fyber.inneractive.sdk.protobuf.C3609z.m9637a((java.lang.Object) r1, (java.lang.Object) r2)     // Catch:{ a -> 0x05cc }
            long r2 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9426a((java.lang.Object) r10, (long) r2, (java.lang.Object) r1)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x0458:
            long r1 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.f1 r4 = r8.mo15207c((int) r3)     // Catch:{ a -> 0x05cc }
            java.lang.Object r4 = r0.mo14828a(r4, (com.fyber.inneractive.sdk.protobuf.C3562q) r11)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9426a((java.lang.Object) r10, (long) r1, (java.lang.Object) r4)     // Catch:{ a -> 0x05cc }
            r8.mo15202b(r10, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x046c:
            long r1 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            long r4 = r20.mo14856l()     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9425a((java.lang.Object) r10, (long) r1, (long) r4)     // Catch:{ a -> 0x05cc }
            r8.mo15202b(r10, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x047c:
            long r1 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            int r4 = r20.mo14852j()     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9424a((java.lang.Object) r10, (long) r1, (int) r4)     // Catch:{ a -> 0x05cc }
            r8.mo15202b(r10, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x048c:
            long r1 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            long r4 = r20.mo14870t()     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9425a((java.lang.Object) r10, (long) r1, (long) r4)     // Catch:{ a -> 0x05cc }
            r8.mo15202b(r10, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x049c:
            long r1 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            int r4 = r20.mo14858m()     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9424a((java.lang.Object) r10, (long) r1, (int) r4)     // Catch:{ a -> 0x05cc }
            r8.mo15202b(r10, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x04ac:
            int r2 = r20.mo14833b()     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.z$e r5 = r8.mo15189a((int) r3)     // Catch:{ a -> 0x05cc }
            if (r5 == 0) goto L_0x04c3
            boolean r5 = r5.mo15254a(r2)     // Catch:{ a -> 0x05cc }
            if (r5 == 0) goto L_0x04bd
            goto L_0x04c3
        L_0x04bd:
            java.lang.Object r1 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8928a((int) r1, (int) r2, r13, r9)     // Catch:{ a -> 0x05cc }
            goto L_0x005b
        L_0x04c3:
            long r4 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9424a((java.lang.Object) r10, (long) r4, (int) r2)     // Catch:{ a -> 0x05cc }
            r8.mo15202b(r10, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x04cf:
            long r1 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            int r4 = r20.mo14838c()     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9424a((java.lang.Object) r10, (long) r1, (int) r4)     // Catch:{ a -> 0x05cc }
            r8.mo15202b(r10, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x04df:
            long r1 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.i r4 = r20.mo14827a()     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9426a((java.lang.Object) r10, (long) r1, (java.lang.Object) r4)     // Catch:{ a -> 0x05cc }
            r8.mo15202b(r10, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x04ef:
            boolean r1 = r8.mo15199a(r10, (int) r3)     // Catch:{ a -> 0x05cc }
            if (r1 == 0) goto L_0x0512
            long r1 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            java.lang.Object r1 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r10, r1)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.f1 r2 = r8.mo15207c((int) r3)     // Catch:{ a -> 0x05cc }
            java.lang.Object r2 = r0.mo14834b(r2, (com.fyber.inneractive.sdk.protobuf.C3562q) r11)     // Catch:{ a -> 0x05cc }
            java.lang.Object r1 = com.fyber.inneractive.sdk.protobuf.C3609z.m9637a((java.lang.Object) r1, (java.lang.Object) r2)     // Catch:{ a -> 0x05cc }
            long r2 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9426a((java.lang.Object) r10, (long) r2, (java.lang.Object) r1)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x0512:
            long r1 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.f1 r4 = r8.mo15207c((int) r3)     // Catch:{ a -> 0x05cc }
            java.lang.Object r4 = r0.mo14834b(r4, (com.fyber.inneractive.sdk.protobuf.C3562q) r11)     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9426a((java.lang.Object) r10, (long) r1, (java.lang.Object) r4)     // Catch:{ a -> 0x05cc }
            r8.mo15202b(r10, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x0526:
            r8.mo15194a((java.lang.Object) r10, (int) r4, (com.fyber.inneractive.sdk.protobuf.C3493e1) r0)     // Catch:{ a -> 0x05cc }
            r8.mo15202b(r10, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x052e:
            long r1 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            boolean r4 = r20.mo14868r()     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9427a((java.lang.Object) r10, (long) r1, (boolean) r4)     // Catch:{ a -> 0x05cc }
            r8.mo15202b(r10, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x053e:
            long r1 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            int r4 = r20.mo14866q()     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9424a((java.lang.Object) r10, (long) r1, (int) r4)     // Catch:{ a -> 0x05cc }
            r8.mo15202b(r10, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x054e:
            long r1 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            long r4 = r20.mo14846g()     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9425a((java.lang.Object) r10, (long) r1, (long) r4)     // Catch:{ a -> 0x05cc }
            r8.mo15202b(r10, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x055e:
            long r1 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            int r4 = r20.mo14840d()     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9424a((java.lang.Object) r10, (long) r1, (int) r4)     // Catch:{ a -> 0x05cc }
            r8.mo15202b(r10, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x056e:
            long r1 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            long r4 = r20.mo14844f()     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9425a((java.lang.Object) r10, (long) r1, (long) r4)     // Catch:{ a -> 0x05cc }
            r8.mo15202b(r10, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x057e:
            long r1 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            long r4 = r20.mo14862o()     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9425a((java.lang.Object) r10, (long) r1, (long) r4)     // Catch:{ a -> 0x05cc }
            r8.mo15202b(r10, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x058e:
            long r1 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            float r4 = r20.mo14854k()     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9423a((java.lang.Object) r10, (long) r1, (float) r4)     // Catch:{ a -> 0x05cc }
            r8.mo15202b(r10, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x059e:
            long r1 = m9533d((int) r4)     // Catch:{ a -> 0x05cc }
            double r4 = r20.mo14848h()     // Catch:{ a -> 0x05cc }
            com.fyber.inneractive.sdk.protobuf.C3569r1.m9422a((java.lang.Object) r10, (long) r1, (double) r4)     // Catch:{ a -> 0x05cc }
            r8.mo15202b(r10, (int) r3)     // Catch:{ a -> 0x05cc }
            goto L_0x000d
        L_0x05ae:
            r13 = r1
        L_0x05af:
            boolean r1 = r9.mo15114a(r13, (com.fyber.inneractive.sdk.protobuf.C3493e1) r0)     // Catch:{ a -> 0x05cc }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f12565k
        L_0x05b7:
            int r1 = r8.f12566l
            if (r0 >= r1) goto L_0x05c6
            int[] r1 = r8.f12564j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo15190a((java.lang.Object) r10, (int) r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05b7
        L_0x05c6:
            if (r13 == 0) goto L_0x05cb
            r9.mo15118b((java.lang.Object) r10, r13)
        L_0x05cb:
            return
        L_0x05cc:
            boolean r1 = r9.mo15113a((com.fyber.inneractive.sdk.protobuf.C3493e1) r0)     // Catch:{ all -> 0x0613 }
            if (r1 == 0) goto L_0x05ef
            boolean r1 = r20.mo14851i()     // Catch:{ all -> 0x0613 }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f12565k
        L_0x05da:
            int r1 = r8.f12566l
            if (r0 >= r1) goto L_0x05e9
            int[] r1 = r8.f12564j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo15190a((java.lang.Object) r10, (int) r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05da
        L_0x05e9:
            if (r13 == 0) goto L_0x05ee
            r9.mo15118b((java.lang.Object) r10, r13)
        L_0x05ee:
            return
        L_0x05ef:
            if (r13 != 0) goto L_0x05f6
            java.lang.Object r1 = r9.mo15106a((java.lang.Object) r10)     // Catch:{ all -> 0x0613 }
            r13 = r1
        L_0x05f6:
            boolean r1 = r9.mo15114a(r13, (com.fyber.inneractive.sdk.protobuf.C3493e1) r0)     // Catch:{ all -> 0x0613 }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f12565k
        L_0x05fe:
            int r1 = r8.f12566l
            if (r0 >= r1) goto L_0x060d
            int[] r1 = r8.f12564j
            r1 = r1[r0]
            java.lang.Object r13 = r8.mo15190a((java.lang.Object) r10, (int) r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05fe
        L_0x060d:
            if (r13 == 0) goto L_0x0612
            r9.mo15118b((java.lang.Object) r10, r13)
        L_0x0612:
            return
        L_0x0613:
            r0 = move-exception
            int r1 = r8.f12565k
        L_0x0616:
            int r2 = r8.f12566l
            if (r1 >= r2) goto L_0x0625
            int[] r2 = r8.f12564j
            r2 = r2[r1]
            java.lang.Object r13 = r8.mo15190a((java.lang.Object) r10, (int) r2, r13, r9)
            int r1 = r1 + 1
            goto L_0x0616
        L_0x0625:
            if (r13 == 0) goto L_0x062a
            r9.mo15118b((java.lang.Object) r10, r13)
        L_0x062a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C3583t0.mo15192a(com.fyber.inneractive.sdk.protobuf.m1, com.fyber.inneractive.sdk.protobuf.r, java.lang.Object, com.fyber.inneractive.sdk.protobuf.e1, com.fyber.inneractive.sdk.protobuf.q):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x0624  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15205b(T r13, com.fyber.inneractive.sdk.protobuf.C3599u1 r14) throws java.io.IOException {
        /*
            r12 = this;
            boolean r0 = r12.f12560f
            r1 = 0
            if (r0 == 0) goto L_0x001e
            com.fyber.inneractive.sdk.protobuf.r<?> r0 = r12.f12570p
            com.fyber.inneractive.sdk.protobuf.u r0 = r0.mo15158a((java.lang.Object) r13)
            com.fyber.inneractive.sdk.protobuf.i1<T, java.lang.Object> r2 = r0.f12612a
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x001e
            java.util.Iterator r0 = r0.mo15225f()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0020
        L_0x001e:
            r0 = r1
            r2 = r0
        L_0x0020:
            int[] r3 = r12.f12555a
            int r3 = r3.length
            r4 = 0
            r5 = 0
        L_0x0025:
            if (r5 >= r3) goto L_0x0622
            int r6 = r12.mo15209g(r5)
            int[] r7 = r12.f12555a
            r7 = r7[r5]
        L_0x002f:
            if (r2 == 0) goto L_0x004d
            com.fyber.inneractive.sdk.protobuf.r<?> r8 = r12.f12570p
            int r8 = r8.mo15157a((java.util.Map.Entry<?, ?>) r2)
            if (r8 > r7) goto L_0x004d
            com.fyber.inneractive.sdk.protobuf.r<?> r8 = r12.f12570p
            r8.mo15163a(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004b
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x002f
        L_0x004b:
            r2 = r1
            goto L_0x002f
        L_0x004d:
            int r8 = m9536f(r6)
            r9 = 1
            switch(r8) {
                case 0: goto L_0x0608;
                case 1: goto L_0x05f1;
                case 2: goto L_0x05da;
                case 3: goto L_0x05c3;
                case 4: goto L_0x05ac;
                case 5: goto L_0x0594;
                case 6: goto L_0x057c;
                case 7: goto L_0x0562;
                case 8: goto L_0x054f;
                case 9: goto L_0x0535;
                case 10: goto L_0x051b;
                case 11: goto L_0x0503;
                case 12: goto L_0x04eb;
                case 13: goto L_0x04d3;
                case 14: goto L_0x04bb;
                case 15: goto L_0x04a5;
                case 16: goto L_0x048f;
                case 17: goto L_0x0475;
                case 18: goto L_0x0462;
                case 19: goto L_0x044f;
                case 20: goto L_0x043c;
                case 21: goto L_0x0429;
                case 22: goto L_0x0416;
                case 23: goto L_0x0403;
                case 24: goto L_0x03f0;
                case 25: goto L_0x03dd;
                case 26: goto L_0x03ca;
                case 27: goto L_0x03b3;
                case 28: goto L_0x03a0;
                case 29: goto L_0x038d;
                case 30: goto L_0x037a;
                case 31: goto L_0x0367;
                case 32: goto L_0x0354;
                case 33: goto L_0x0341;
                case 34: goto L_0x032e;
                case 35: goto L_0x031b;
                case 36: goto L_0x0308;
                case 37: goto L_0x02f5;
                case 38: goto L_0x02e2;
                case 39: goto L_0x02cf;
                case 40: goto L_0x02bc;
                case 41: goto L_0x02a9;
                case 42: goto L_0x0296;
                case 43: goto L_0x0283;
                case 44: goto L_0x0270;
                case 45: goto L_0x025d;
                case 46: goto L_0x024a;
                case 47: goto L_0x0237;
                case 48: goto L_0x0224;
                case 49: goto L_0x020d;
                case 50: goto L_0x0200;
                case 51: goto L_0x01ea;
                case 52: goto L_0x01d4;
                case 53: goto L_0x01bc;
                case 54: goto L_0x01a4;
                case 55: goto L_0x018c;
                case 56: goto L_0x0174;
                case 57: goto L_0x015c;
                case 58: goto L_0x0144;
                case 59: goto L_0x0131;
                case 60: goto L_0x0117;
                case 61: goto L_0x00fd;
                case 62: goto L_0x00e5;
                case 63: goto L_0x00cd;
                case 64: goto L_0x00b5;
                case 65: goto L_0x009d;
                case 66: goto L_0x0087;
                case 67: goto L_0x0071;
                case 68: goto L_0x0057;
                default: goto L_0x0055;
            }
        L_0x0055:
            goto L_0x061e
        L_0x0057:
            boolean r8 = r12.mo15200a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r8)
            com.fyber.inneractive.sdk.protobuf.f1 r8 = r12.mo15207c((int) r5)
            r9 = r14
            com.fyber.inneractive.sdk.protobuf.m r9 = (com.fyber.inneractive.sdk.protobuf.C3548m) r9
            r9.mo15103a(r7, r6, r8)
            goto L_0x061e
        L_0x0071:
            boolean r8 = r12.mo15200a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            long r8 = m9534e(r13, r8)
            r6 = r14
            com.fyber.inneractive.sdk.protobuf.m r6 = (com.fyber.inneractive.sdk.protobuf.C3548m) r6
            r6.mo15101a((int) r7, (long) r8)
            goto L_0x061e
        L_0x0087:
            boolean r8 = r12.mo15200a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            int r6 = m9532d(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            r8.mo15100a((int) r7, (int) r6)
            goto L_0x061e
        L_0x009d:
            boolean r8 = r12.mo15200a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            long r8 = m9534e(r13, r8)
            r6 = r14
            com.fyber.inneractive.sdk.protobuf.m r6 = (com.fyber.inneractive.sdk.protobuf.C3548m) r6
            com.fyber.inneractive.sdk.protobuf.l r6 = r6.f12518a
            r6.mo15070f((int) r7, (long) r8)
            goto L_0x061e
        L_0x00b5:
            boolean r8 = r12.mo15200a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            int r6 = m9532d(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f12518a
            r8.mo15072g((int) r7, (int) r6)
            goto L_0x061e
        L_0x00cd:
            boolean r8 = r12.mo15200a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            int r6 = m9532d(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f12518a
            r8.mo15074h(r7, r6)
            goto L_0x061e
        L_0x00e5:
            boolean r8 = r12.mo15200a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            int r6 = m9532d(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f12518a
            r8.mo15076j(r7, r6)
            goto L_0x061e
        L_0x00fd:
            boolean r8 = r12.mo15200a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r8)
            com.fyber.inneractive.sdk.protobuf.i r6 = (com.fyber.inneractive.sdk.protobuf.C3508i) r6
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f12518a
            r8.mo15061b((int) r7, (com.fyber.inneractive.sdk.protobuf.C3508i) r6)
            goto L_0x061e
        L_0x0117:
            boolean r8 = r12.mo15200a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r8)
            com.fyber.inneractive.sdk.protobuf.f1 r8 = r12.mo15207c((int) r5)
            r9 = r14
            com.fyber.inneractive.sdk.protobuf.m r9 = (com.fyber.inneractive.sdk.protobuf.C3548m) r9
            r9.mo15104b(r7, r6, r8)
            goto L_0x061e
        L_0x0131:
            boolean r8 = r12.mo15200a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r8)
            r12.mo15191a((int) r7, (java.lang.Object) r6, (com.fyber.inneractive.sdk.protobuf.C3599u1) r14)
            goto L_0x061e
        L_0x0144:
            boolean r8 = r12.mo15200a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            boolean r6 = m9529a(r13, (long) r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f12518a
            r8.mo15064b((int) r7, (boolean) r6)
            goto L_0x061e
        L_0x015c:
            boolean r8 = r12.mo15200a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            int r6 = m9532d(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f12518a
            r8.mo15072g((int) r7, (int) r6)
            goto L_0x061e
        L_0x0174:
            boolean r8 = r12.mo15200a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            long r8 = m9534e(r13, r8)
            r6 = r14
            com.fyber.inneractive.sdk.protobuf.m r6 = (com.fyber.inneractive.sdk.protobuf.C3548m) r6
            com.fyber.inneractive.sdk.protobuf.l r6 = r6.f12518a
            r6.mo15070f((int) r7, (long) r8)
            goto L_0x061e
        L_0x018c:
            boolean r8 = r12.mo15200a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            int r6 = m9532d(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f12518a
            r8.mo15074h(r7, r6)
            goto L_0x061e
        L_0x01a4:
            boolean r8 = r12.mo15200a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            long r8 = m9534e(r13, r8)
            r6 = r14
            com.fyber.inneractive.sdk.protobuf.m r6 = (com.fyber.inneractive.sdk.protobuf.C3548m) r6
            com.fyber.inneractive.sdk.protobuf.l r6 = r6.f12518a
            r6.mo15073g((int) r7, (long) r8)
            goto L_0x061e
        L_0x01bc:
            boolean r8 = r12.mo15200a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            long r8 = m9534e(r13, r8)
            r6 = r14
            com.fyber.inneractive.sdk.protobuf.m r6 = (com.fyber.inneractive.sdk.protobuf.C3548m) r6
            com.fyber.inneractive.sdk.protobuf.l r6 = r6.f12518a
            r6.mo15073g((int) r7, (long) r8)
            goto L_0x061e
        L_0x01d4:
            boolean r8 = r12.mo15200a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            float r6 = m9531c(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            r8.mo15099a((int) r7, (float) r6)
            goto L_0x061e
        L_0x01ea:
            boolean r8 = r12.mo15200a(r13, (int) r7, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            double r8 = m9530b(r13, (long) r8)
            r6 = r14
            com.fyber.inneractive.sdk.protobuf.m r6 = (com.fyber.inneractive.sdk.protobuf.C3548m) r6
            r6.mo15098a((int) r7, (double) r8)
            goto L_0x061e
        L_0x0200:
            long r8 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r8)
            r12.mo15193a((com.fyber.inneractive.sdk.protobuf.C3599u1) r14, (int) r7, (java.lang.Object) r6, (int) r5)
            goto L_0x061e
        L_0x020d:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r8 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.f1 r8 = r12.mo15207c((int) r5)
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8932a((int) r7, (java.util.List<?>) r6, (com.fyber.inneractive.sdk.protobuf.C3599u1) r14, (com.fyber.inneractive.sdk.protobuf.C3498f1) r8)
            goto L_0x061e
        L_0x0224:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r10 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8966l(r7, r6, r14, r9)
            goto L_0x061e
        L_0x0237:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r10 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8965k(r7, r6, r14, r9)
            goto L_0x061e
        L_0x024a:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r10 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8964j(r7, r6, r14, r9)
            goto L_0x061e
        L_0x025d:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r10 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8962i(r7, r6, r14, r9)
            goto L_0x061e
        L_0x0270:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r10 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8944c(r7, r6, r14, r9)
            goto L_0x061e
        L_0x0283:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r10 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8967m(r7, r6, r14, r9)
            goto L_0x061e
        L_0x0296:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r10 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8933a((int) r7, (java.util.List<java.lang.Boolean>) r6, (com.fyber.inneractive.sdk.protobuf.C3599u1) r14, (boolean) r9)
            goto L_0x061e
        L_0x02a9:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r10 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8947d(r7, r6, r14, r9)
            goto L_0x061e
        L_0x02bc:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r10 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8950e(r7, r6, r14, r9)
            goto L_0x061e
        L_0x02cf:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r10 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8956g(r7, r6, r14, r9)
            goto L_0x061e
        L_0x02e2:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r10 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8968n(r7, r6, r14, r9)
            goto L_0x061e
        L_0x02f5:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r10 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8959h(r7, r6, r14, r9)
            goto L_0x061e
        L_0x0308:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r10 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8953f(r7, r6, r14, r9)
            goto L_0x061e
        L_0x031b:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r10 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r10)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8941b((int) r7, (java.util.List<java.lang.Double>) r6, (com.fyber.inneractive.sdk.protobuf.C3599u1) r14, (boolean) r9)
            goto L_0x061e
        L_0x032e:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r8 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8966l(r7, r6, r14, r4)
            goto L_0x061e
        L_0x0341:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r8 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8965k(r7, r6, r14, r4)
            goto L_0x061e
        L_0x0354:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r8 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8964j(r7, r6, r14, r4)
            goto L_0x061e
        L_0x0367:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r8 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8962i(r7, r6, r14, r4)
            goto L_0x061e
        L_0x037a:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r8 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8944c(r7, r6, r14, r4)
            goto L_0x061e
        L_0x038d:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r8 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8967m(r7, r6, r14, r4)
            goto L_0x061e
        L_0x03a0:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r8 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8931a((int) r7, (java.util.List<com.fyber.inneractive.sdk.protobuf.C3508i>) r6, (com.fyber.inneractive.sdk.protobuf.C3599u1) r14)
            goto L_0x061e
        L_0x03b3:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r8 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.f1 r8 = r12.mo15207c((int) r5)
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8940b((int) r7, (java.util.List<?>) r6, (com.fyber.inneractive.sdk.protobuf.C3599u1) r14, (com.fyber.inneractive.sdk.protobuf.C3498f1) r8)
            goto L_0x061e
        L_0x03ca:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r8 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8939b((int) r7, (java.util.List<java.lang.String>) r6, (com.fyber.inneractive.sdk.protobuf.C3599u1) r14)
            goto L_0x061e
        L_0x03dd:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r8 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8933a((int) r7, (java.util.List<java.lang.Boolean>) r6, (com.fyber.inneractive.sdk.protobuf.C3599u1) r14, (boolean) r4)
            goto L_0x061e
        L_0x03f0:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r8 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8947d(r7, r6, r14, r4)
            goto L_0x061e
        L_0x0403:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r8 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8950e(r7, r6, r14, r4)
            goto L_0x061e
        L_0x0416:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r8 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8956g(r7, r6, r14, r4)
            goto L_0x061e
        L_0x0429:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r8 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8968n(r7, r6, r14, r4)
            goto L_0x061e
        L_0x043c:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r8 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8959h(r7, r6, r14, r4)
            goto L_0x061e
        L_0x044f:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r8 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8953f(r7, r6, r14, r4)
            goto L_0x061e
        L_0x0462:
            int[] r7 = r12.f12555a
            r7 = r7[r5]
            long r8 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r8)
            java.util.List r6 = (java.util.List) r6
            com.fyber.inneractive.sdk.protobuf.C3507h1.m8941b((int) r7, (java.util.List<java.lang.Double>) r6, (com.fyber.inneractive.sdk.protobuf.C3599u1) r14, (boolean) r4)
            goto L_0x061e
        L_0x0475:
            boolean r8 = r12.mo15199a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r8)
            com.fyber.inneractive.sdk.protobuf.f1 r8 = r12.mo15207c((int) r5)
            r9 = r14
            com.fyber.inneractive.sdk.protobuf.m r9 = (com.fyber.inneractive.sdk.protobuf.C3548m) r9
            r9.mo15103a(r7, r6, r8)
            goto L_0x061e
        L_0x048f:
            boolean r8 = r12.mo15199a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            long r8 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r13, r8)
            r6 = r14
            com.fyber.inneractive.sdk.protobuf.m r6 = (com.fyber.inneractive.sdk.protobuf.C3548m) r6
            r6.mo15101a((int) r7, (long) r8)
            goto L_0x061e
        L_0x04a5:
            boolean r8 = r12.mo15199a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            int r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            r8.mo15100a((int) r7, (int) r6)
            goto L_0x061e
        L_0x04bb:
            boolean r8 = r12.mo15199a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            long r8 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r13, r8)
            r6 = r14
            com.fyber.inneractive.sdk.protobuf.m r6 = (com.fyber.inneractive.sdk.protobuf.C3548m) r6
            com.fyber.inneractive.sdk.protobuf.l r6 = r6.f12518a
            r6.mo15070f((int) r7, (long) r8)
            goto L_0x061e
        L_0x04d3:
            boolean r8 = r12.mo15199a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            int r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f12518a
            r8.mo15072g((int) r7, (int) r6)
            goto L_0x061e
        L_0x04eb:
            boolean r8 = r12.mo15199a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            int r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f12518a
            r8.mo15074h(r7, r6)
            goto L_0x061e
        L_0x0503:
            boolean r8 = r12.mo15199a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            int r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f12518a
            r8.mo15076j(r7, r6)
            goto L_0x061e
        L_0x051b:
            boolean r8 = r12.mo15199a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r8)
            com.fyber.inneractive.sdk.protobuf.i r6 = (com.fyber.inneractive.sdk.protobuf.C3508i) r6
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f12518a
            r8.mo15061b((int) r7, (com.fyber.inneractive.sdk.protobuf.C3508i) r6)
            goto L_0x061e
        L_0x0535:
            boolean r8 = r12.mo15199a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r8)
            com.fyber.inneractive.sdk.protobuf.f1 r8 = r12.mo15207c((int) r5)
            r9 = r14
            com.fyber.inneractive.sdk.protobuf.m r9 = (com.fyber.inneractive.sdk.protobuf.C3548m) r9
            r9.mo15104b(r7, r6, r8)
            goto L_0x061e
        L_0x054f:
            boolean r8 = r12.mo15199a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9439g(r13, r8)
            r12.mo15191a((int) r7, (java.lang.Object) r6, (com.fyber.inneractive.sdk.protobuf.C3599u1) r14)
            goto L_0x061e
        L_0x0562:
            boolean r8 = r12.mo15199a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            com.fyber.inneractive.sdk.protobuf.r1$d r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.f12543e
            boolean r6 = r6.mo15173a(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f12518a
            r8.mo15064b((int) r7, (boolean) r6)
            goto L_0x061e
        L_0x057c:
            boolean r8 = r12.mo15199a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            int r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f12518a
            r8.mo15072g((int) r7, (int) r6)
            goto L_0x061e
        L_0x0594:
            boolean r8 = r12.mo15199a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            long r8 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r13, r8)
            r6 = r14
            com.fyber.inneractive.sdk.protobuf.m r6 = (com.fyber.inneractive.sdk.protobuf.C3548m) r6
            com.fyber.inneractive.sdk.protobuf.l r6 = r6.f12518a
            r6.mo15070f((int) r7, (long) r8)
            goto L_0x061e
        L_0x05ac:
            boolean r8 = r12.mo15199a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            int r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9437e(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            com.fyber.inneractive.sdk.protobuf.l r8 = r8.f12518a
            r8.mo15074h(r7, r6)
            goto L_0x061e
        L_0x05c3:
            boolean r8 = r12.mo15199a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            long r8 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r13, r8)
            r6 = r14
            com.fyber.inneractive.sdk.protobuf.m r6 = (com.fyber.inneractive.sdk.protobuf.C3548m) r6
            com.fyber.inneractive.sdk.protobuf.l r6 = r6.f12518a
            r6.mo15073g((int) r7, (long) r8)
            goto L_0x061e
        L_0x05da:
            boolean r8 = r12.mo15199a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            long r8 = com.fyber.inneractive.sdk.protobuf.C3569r1.m9438f(r13, r8)
            r6 = r14
            com.fyber.inneractive.sdk.protobuf.m r6 = (com.fyber.inneractive.sdk.protobuf.C3548m) r6
            com.fyber.inneractive.sdk.protobuf.l r6 = r6.f12518a
            r6.mo15073g((int) r7, (long) r8)
            goto L_0x061e
        L_0x05f1:
            boolean r8 = r12.mo15199a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            com.fyber.inneractive.sdk.protobuf.r1$d r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.f12543e
            float r6 = r6.mo15177d(r13, r8)
            r8 = r14
            com.fyber.inneractive.sdk.protobuf.m r8 = (com.fyber.inneractive.sdk.protobuf.C3548m) r8
            r8.mo15099a((int) r7, (float) r6)
            goto L_0x061e
        L_0x0608:
            boolean r8 = r12.mo15199a(r13, (int) r5)
            if (r8 == 0) goto L_0x061e
            long r8 = m9533d((int) r6)
            com.fyber.inneractive.sdk.protobuf.r1$d r6 = com.fyber.inneractive.sdk.protobuf.C3569r1.f12543e
            double r8 = r6.mo15176c(r13, r8)
            r6 = r14
            com.fyber.inneractive.sdk.protobuf.m r6 = (com.fyber.inneractive.sdk.protobuf.C3548m) r6
            r6.mo15098a((int) r7, (double) r8)
        L_0x061e:
            int r5 = r5 + 3
            goto L_0x0025
        L_0x0622:
            if (r2 == 0) goto L_0x0638
            com.fyber.inneractive.sdk.protobuf.r<?> r3 = r12.f12570p
            r3.mo15163a(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0636
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0622
        L_0x0636:
            r2 = r1
            goto L_0x0622
        L_0x0638:
            com.fyber.inneractive.sdk.protobuf.m1<?, ?> r0 = r12.f12569o
            java.lang.Object r13 = r0.mo15115b(r13)
            r0.mo15117b(r13, (com.fyber.inneractive.sdk.protobuf.C3599u1) r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C3583t0.mo15205b(java.lang.Object, com.fyber.inneractive.sdk.protobuf.u1):void");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0207  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0376 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x0375 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0375 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01b7  */
    /* renamed from: a */
    public final int mo15186a(T r16, byte[] r17, int r18, int r19, int r20, int r21, int r22, int r23, long r24, int r26, long r27, com.fyber.inneractive.sdk.protobuf.C3490e.C3491a r29) throws java.io.IOException {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r2 = r20
            r6 = r22
            r8 = r23
            r9 = r27
            r7 = r29
            sun.misc.Unsafe r11 = f12554s
            java.lang.Object r12 = r11.getObject(r1, r9)
            com.fyber.inneractive.sdk.protobuf.z$j r12 = (com.fyber.inneractive.sdk.protobuf.C3609z.C3620j) r12
            boolean r13 = r12.mo14792d()
            r14 = 2
            if (r13 != 0) goto L_0x0034
            int r13 = r12.size()
            if (r13 != 0) goto L_0x002b
            r13 = 10
            goto L_0x002d
        L_0x002b:
            int r13 = r13 * 2
        L_0x002d:
            com.fyber.inneractive.sdk.protobuf.z$j r12 = r12.mo14808b(r13)
            r11.putObject(r1, r9, r12)
        L_0x0034:
            r9 = 5
            r10 = 0
            r13 = 1
            switch(r26) {
                case 18: goto L_0x0346;
                case 19: goto L_0x0317;
                case 20: goto L_0x02ec;
                case 21: goto L_0x02ec;
                case 22: goto L_0x02d2;
                case 23: goto L_0x02a9;
                case 24: goto L_0x0280;
                case 25: goto L_0x0246;
                case 26: goto L_0x018f;
                case 27: goto L_0x0175;
                case 28: goto L_0x011b;
                case 29: goto L_0x02d2;
                case 30: goto L_0x00e5;
                case 31: goto L_0x0280;
                case 32: goto L_0x02a9;
                case 33: goto L_0x00b2;
                case 34: goto L_0x007f;
                case 35: goto L_0x0346;
                case 36: goto L_0x0317;
                case 37: goto L_0x02ec;
                case 38: goto L_0x02ec;
                case 39: goto L_0x02d2;
                case 40: goto L_0x02a9;
                case 41: goto L_0x0280;
                case 42: goto L_0x0246;
                case 43: goto L_0x02d2;
                case 44: goto L_0x00e5;
                case 45: goto L_0x0280;
                case 46: goto L_0x02a9;
                case 47: goto L_0x00b2;
                case 48: goto L_0x007f;
                case 49: goto L_0x003d;
                default: goto L_0x003b;
            }
        L_0x003b:
            goto L_0x0375
        L_0x003d:
            r1 = 3
            if (r6 != r1) goto L_0x0375
            com.fyber.inneractive.sdk.protobuf.f1 r1 = r15.mo15207c((int) r8)
            r6 = r2 & -8
            r6 = r6 | 4
            r21 = r1
            r22 = r17
            r23 = r18
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.fyber.inneractive.sdk.protobuf.C3490e.m8755a((com.fyber.inneractive.sdk.protobuf.C3498f1) r21, (byte[]) r22, (int) r23, (int) r24, (int) r25, (com.fyber.inneractive.sdk.protobuf.C3490e.C3491a) r26)
            java.lang.Object r8 = r7.f12421c
            r12.add(r8)
        L_0x005d:
            if (r4 >= r5) goto L_0x0375
            int r8 = com.fyber.inneractive.sdk.protobuf.C3490e.m8765d(r3, r4, r7)
            int r9 = r7.f12419a
            if (r2 == r9) goto L_0x0069
            goto L_0x0375
        L_0x0069:
            r21 = r1
            r22 = r17
            r23 = r8
            r24 = r19
            r25 = r6
            r26 = r29
            int r4 = com.fyber.inneractive.sdk.protobuf.C3490e.m8755a((com.fyber.inneractive.sdk.protobuf.C3498f1) r21, (byte[]) r22, (int) r23, (int) r24, (int) r25, (com.fyber.inneractive.sdk.protobuf.C3490e.C3491a) r26)
            java.lang.Object r8 = r7.f12421c
            r12.add(r8)
            goto L_0x005d
        L_0x007f:
            if (r6 != r14) goto L_0x0087
            int r1 = com.fyber.inneractive.sdk.protobuf.C3490e.m8770g(r3, r4, r12, r7)
            goto L_0x0376
        L_0x0087:
            if (r6 != 0) goto L_0x0375
            com.fyber.inneractive.sdk.protobuf.h0 r12 = (com.fyber.inneractive.sdk.protobuf.C3506h0) r12
            int r1 = com.fyber.inneractive.sdk.protobuf.C3490e.m8767e(r3, r4, r7)
            long r8 = r7.f12420b
            long r8 = com.fyber.inneractive.sdk.protobuf.C3529j.m9021a((long) r8)
            r12.mo14915a(r8)
        L_0x0098:
            if (r1 >= r5) goto L_0x0376
            int r4 = com.fyber.inneractive.sdk.protobuf.C3490e.m8765d(r3, r1, r7)
            int r6 = r7.f12419a
            if (r2 == r6) goto L_0x00a4
            goto L_0x0376
        L_0x00a4:
            int r1 = com.fyber.inneractive.sdk.protobuf.C3490e.m8767e(r3, r4, r7)
            long r8 = r7.f12420b
            long r8 = com.fyber.inneractive.sdk.protobuf.C3529j.m9021a((long) r8)
            r12.mo14915a(r8)
            goto L_0x0098
        L_0x00b2:
            if (r6 != r14) goto L_0x00ba
            int r1 = com.fyber.inneractive.sdk.protobuf.C3490e.m8769f(r3, r4, r12, r7)
            goto L_0x0376
        L_0x00ba:
            if (r6 != 0) goto L_0x0375
            com.fyber.inneractive.sdk.protobuf.y r12 = (com.fyber.inneractive.sdk.protobuf.C3607y) r12
            int r1 = com.fyber.inneractive.sdk.protobuf.C3490e.m8765d(r3, r4, r7)
            int r4 = r7.f12419a
            int r4 = com.fyber.inneractive.sdk.protobuf.C3529j.m9025b(r4)
            r12.mo15242c(r4)
        L_0x00cb:
            if (r1 >= r5) goto L_0x0376
            int r4 = com.fyber.inneractive.sdk.protobuf.C3490e.m8765d(r3, r1, r7)
            int r6 = r7.f12419a
            if (r2 == r6) goto L_0x00d7
            goto L_0x0376
        L_0x00d7:
            int r1 = com.fyber.inneractive.sdk.protobuf.C3490e.m8765d(r3, r4, r7)
            int r4 = r7.f12419a
            int r4 = com.fyber.inneractive.sdk.protobuf.C3529j.m9025b(r4)
            r12.mo15242c(r4)
            goto L_0x00cb
        L_0x00e5:
            if (r6 != r14) goto L_0x00ec
            int r2 = com.fyber.inneractive.sdk.protobuf.C3490e.m8771h(r3, r4, r12, r7)
            goto L_0x00fd
        L_0x00ec:
            if (r6 != 0) goto L_0x0375
            r2 = r20
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r12
            r7 = r29
            int r2 = com.fyber.inneractive.sdk.protobuf.C3490e.m8752a((int) r2, (byte[]) r3, (int) r4, (int) r5, (com.fyber.inneractive.sdk.protobuf.C3609z.C3620j<?>) r6, (com.fyber.inneractive.sdk.protobuf.C3490e.C3491a) r7)
        L_0x00fd:
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r1 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite) r1
            com.fyber.inneractive.sdk.protobuf.n1 r3 = r1.unknownFields
            com.fyber.inneractive.sdk.protobuf.n1 r4 = com.fyber.inneractive.sdk.protobuf.C3553n1.f12524f
            if (r3 != r4) goto L_0x0106
            r3 = 0
        L_0x0106:
            com.fyber.inneractive.sdk.protobuf.z$e r4 = r15.mo15189a((int) r8)
            com.fyber.inneractive.sdk.protobuf.m1<?, ?> r5 = r0.f12569o
            r6 = r21
            java.lang.Object r3 = com.fyber.inneractive.sdk.protobuf.C3507h1.m8930a((int) r6, (java.util.List<java.lang.Integer>) r12, (com.fyber.inneractive.sdk.protobuf.C3609z.C3614e) r4, r3, r5)
            com.fyber.inneractive.sdk.protobuf.n1 r3 = (com.fyber.inneractive.sdk.protobuf.C3553n1) r3
            if (r3 == 0) goto L_0x0118
            r1.unknownFields = r3
        L_0x0118:
            r1 = r2
            goto L_0x0376
        L_0x011b:
            if (r6 != r14) goto L_0x0375
            int r1 = com.fyber.inneractive.sdk.protobuf.C3490e.m8765d(r3, r4, r7)
            int r4 = r7.f12419a
            if (r4 < 0) goto L_0x0170
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x016b
            if (r4 != 0) goto L_0x0131
            com.fyber.inneractive.sdk.protobuf.i r4 = com.fyber.inneractive.sdk.protobuf.C3508i.f12443b
            r12.add(r4)
            goto L_0x0139
        L_0x0131:
            com.fyber.inneractive.sdk.protobuf.i r6 = com.fyber.inneractive.sdk.protobuf.C3508i.m8971a((byte[]) r3, (int) r1, (int) r4)
            r12.add(r6)
        L_0x0138:
            int r1 = r1 + r4
        L_0x0139:
            if (r1 >= r5) goto L_0x0376
            int r4 = com.fyber.inneractive.sdk.protobuf.C3490e.m8765d(r3, r1, r7)
            int r6 = r7.f12419a
            if (r2 == r6) goto L_0x0145
            goto L_0x0376
        L_0x0145:
            int r1 = com.fyber.inneractive.sdk.protobuf.C3490e.m8765d(r3, r4, r7)
            int r4 = r7.f12419a
            if (r4 < 0) goto L_0x0166
            int r6 = r3.length
            int r6 = r6 - r1
            if (r4 > r6) goto L_0x0161
            if (r4 != 0) goto L_0x0159
            com.fyber.inneractive.sdk.protobuf.i r4 = com.fyber.inneractive.sdk.protobuf.C3508i.f12443b
            r12.add(r4)
            goto L_0x0139
        L_0x0159:
            com.fyber.inneractive.sdk.protobuf.i r6 = com.fyber.inneractive.sdk.protobuf.C3508i.m8971a((byte[]) r3, (int) r1, (int) r4)
            r12.add(r6)
            goto L_0x0138
        L_0x0161:
            com.fyber.inneractive.sdk.protobuf.a0 r1 = com.fyber.inneractive.sdk.protobuf.C3476a0.m8735i()
            throw r1
        L_0x0166:
            com.fyber.inneractive.sdk.protobuf.a0 r1 = com.fyber.inneractive.sdk.protobuf.C3476a0.m8732f()
            throw r1
        L_0x016b:
            com.fyber.inneractive.sdk.protobuf.a0 r1 = com.fyber.inneractive.sdk.protobuf.C3476a0.m8735i()
            throw r1
        L_0x0170:
            com.fyber.inneractive.sdk.protobuf.a0 r1 = com.fyber.inneractive.sdk.protobuf.C3476a0.m8732f()
            throw r1
        L_0x0175:
            if (r6 != r14) goto L_0x0375
            com.fyber.inneractive.sdk.protobuf.f1 r1 = r15.mo15207c((int) r8)
            r21 = r1
            r22 = r20
            r23 = r17
            r24 = r18
            r25 = r19
            r26 = r12
            r27 = r29
            int r1 = com.fyber.inneractive.sdk.protobuf.C3490e.m8754a(r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0376
        L_0x018f:
            if (r6 != r14) goto L_0x0375
            r8 = 536870912(0x20000000, double:2.652494739E-315)
            long r8 = r24 & r8
            java.lang.String r1 = ""
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 != 0) goto L_0x01e4
            int r4 = com.fyber.inneractive.sdk.protobuf.C3490e.m8765d(r3, r4, r7)
            int r6 = r7.f12419a
            if (r6 < 0) goto L_0x01df
            if (r6 != 0) goto L_0x01aa
            r12.add(r1)
            goto L_0x01b5
        L_0x01aa:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.fyber.inneractive.sdk.protobuf.C3609z.f12640a
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
        L_0x01b4:
            int r4 = r4 + r6
        L_0x01b5:
            if (r4 >= r5) goto L_0x0375
            int r6 = com.fyber.inneractive.sdk.protobuf.C3490e.m8765d(r3, r4, r7)
            int r8 = r7.f12419a
            if (r2 == r8) goto L_0x01c1
            goto L_0x0375
        L_0x01c1:
            int r4 = com.fyber.inneractive.sdk.protobuf.C3490e.m8765d(r3, r6, r7)
            int r6 = r7.f12419a
            if (r6 < 0) goto L_0x01da
            if (r6 != 0) goto L_0x01cf
            r12.add(r1)
            goto L_0x01b5
        L_0x01cf:
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r9 = com.fyber.inneractive.sdk.protobuf.C3609z.f12640a
            r8.<init>(r3, r4, r6, r9)
            r12.add(r8)
            goto L_0x01b4
        L_0x01da:
            com.fyber.inneractive.sdk.protobuf.a0 r1 = com.fyber.inneractive.sdk.protobuf.C3476a0.m8732f()
            throw r1
        L_0x01df:
            com.fyber.inneractive.sdk.protobuf.a0 r1 = com.fyber.inneractive.sdk.protobuf.C3476a0.m8732f()
            throw r1
        L_0x01e4:
            int r4 = com.fyber.inneractive.sdk.protobuf.C3490e.m8765d(r3, r4, r7)
            int r6 = r7.f12419a
            if (r6 < 0) goto L_0x0241
            if (r6 != 0) goto L_0x01f2
            r12.add(r1)
            goto L_0x0205
        L_0x01f2:
            int r8 = r4 + r6
            boolean r9 = com.fyber.inneractive.sdk.protobuf.C3576s1.m9505b(r3, r4, r8)
            if (r9 == 0) goto L_0x023c
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.fyber.inneractive.sdk.protobuf.C3609z.f12640a
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
        L_0x0204:
            r4 = r8
        L_0x0205:
            if (r4 >= r5) goto L_0x0375
            int r6 = com.fyber.inneractive.sdk.protobuf.C3490e.m8765d(r3, r4, r7)
            int r8 = r7.f12419a
            if (r2 == r8) goto L_0x0211
            goto L_0x0375
        L_0x0211:
            int r4 = com.fyber.inneractive.sdk.protobuf.C3490e.m8765d(r3, r6, r7)
            int r6 = r7.f12419a
            if (r6 < 0) goto L_0x0237
            if (r6 != 0) goto L_0x021f
            r12.add(r1)
            goto L_0x0205
        L_0x021f:
            int r8 = r4 + r6
            boolean r9 = com.fyber.inneractive.sdk.protobuf.C3576s1.m9505b(r3, r4, r8)
            if (r9 == 0) goto L_0x0232
            java.lang.String r9 = new java.lang.String
            java.nio.charset.Charset r10 = com.fyber.inneractive.sdk.protobuf.C3609z.f12640a
            r9.<init>(r3, r4, r6, r10)
            r12.add(r9)
            goto L_0x0204
        L_0x0232:
            com.fyber.inneractive.sdk.protobuf.a0 r1 = com.fyber.inneractive.sdk.protobuf.C3476a0.m8729c()
            throw r1
        L_0x0237:
            com.fyber.inneractive.sdk.protobuf.a0 r1 = com.fyber.inneractive.sdk.protobuf.C3476a0.m8732f()
            throw r1
        L_0x023c:
            com.fyber.inneractive.sdk.protobuf.a0 r1 = com.fyber.inneractive.sdk.protobuf.C3476a0.m8729c()
            throw r1
        L_0x0241:
            com.fyber.inneractive.sdk.protobuf.a0 r1 = com.fyber.inneractive.sdk.protobuf.C3476a0.m8732f()
            throw r1
        L_0x0246:
            if (r6 != r14) goto L_0x024e
            int r1 = com.fyber.inneractive.sdk.protobuf.C3490e.m8759a((byte[]) r3, (int) r4, (com.fyber.inneractive.sdk.protobuf.C3609z.C3620j<?>) r12, (com.fyber.inneractive.sdk.protobuf.C3490e.C3491a) r7)
            goto L_0x0376
        L_0x024e:
            if (r6 != 0) goto L_0x0375
            com.fyber.inneractive.sdk.protobuf.g r12 = (com.fyber.inneractive.sdk.protobuf.C3499g) r12
            int r1 = com.fyber.inneractive.sdk.protobuf.C3490e.m8767e(r3, r4, r7)
            long r8 = r7.f12420b
            r4 = 0
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x025f
            r6 = 1
            goto L_0x0260
        L_0x025f:
            r6 = 0
        L_0x0260:
            r12.mo14900a(r6)
        L_0x0263:
            if (r1 >= r5) goto L_0x0376
            int r6 = com.fyber.inneractive.sdk.protobuf.C3490e.m8765d(r3, r1, r7)
            int r8 = r7.f12419a
            if (r2 == r8) goto L_0x026f
            goto L_0x0376
        L_0x026f:
            int r1 = com.fyber.inneractive.sdk.protobuf.C3490e.m8767e(r3, r6, r7)
            long r8 = r7.f12420b
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 == 0) goto L_0x027b
            r6 = 1
            goto L_0x027c
        L_0x027b:
            r6 = 0
        L_0x027c:
            r12.mo14900a(r6)
            goto L_0x0263
        L_0x0280:
            if (r6 != r14) goto L_0x0288
            int r1 = com.fyber.inneractive.sdk.protobuf.C3490e.m8764c(r3, r4, r12, r7)
            goto L_0x0376
        L_0x0288:
            if (r6 != r9) goto L_0x0375
            com.fyber.inneractive.sdk.protobuf.y r12 = (com.fyber.inneractive.sdk.protobuf.C3607y) r12
            int r1 = com.fyber.inneractive.sdk.protobuf.C3490e.m8757a(r17, r18)
            r12.mo15242c(r1)
        L_0x0293:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0376
            int r4 = com.fyber.inneractive.sdk.protobuf.C3490e.m8765d(r3, r1, r7)
            int r6 = r7.f12419a
            if (r2 == r6) goto L_0x02a1
            goto L_0x0376
        L_0x02a1:
            int r1 = com.fyber.inneractive.sdk.protobuf.C3490e.m8757a(r3, r4)
            r12.mo15242c(r1)
            goto L_0x0293
        L_0x02a9:
            if (r6 != r14) goto L_0x02b1
            int r1 = com.fyber.inneractive.sdk.protobuf.C3490e.m8766d(r3, r4, r12, r7)
            goto L_0x0376
        L_0x02b1:
            if (r6 != r13) goto L_0x0375
            com.fyber.inneractive.sdk.protobuf.h0 r12 = (com.fyber.inneractive.sdk.protobuf.C3506h0) r12
            long r8 = com.fyber.inneractive.sdk.protobuf.C3490e.m8762b(r17, r18)
            r12.mo14915a(r8)
        L_0x02bc:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0376
            int r4 = com.fyber.inneractive.sdk.protobuf.C3490e.m8765d(r3, r1, r7)
            int r6 = r7.f12419a
            if (r2 == r6) goto L_0x02ca
            goto L_0x0376
        L_0x02ca:
            long r8 = com.fyber.inneractive.sdk.protobuf.C3490e.m8762b(r3, r4)
            r12.mo14915a(r8)
            goto L_0x02bc
        L_0x02d2:
            if (r6 != r14) goto L_0x02da
            int r1 = com.fyber.inneractive.sdk.protobuf.C3490e.m8771h(r3, r4, r12, r7)
            goto L_0x0376
        L_0x02da:
            if (r6 != 0) goto L_0x0375
            r21 = r17
            r22 = r18
            r23 = r19
            r24 = r12
            r25 = r29
            int r1 = com.fyber.inneractive.sdk.protobuf.C3490e.m8752a((int) r20, (byte[]) r21, (int) r22, (int) r23, (com.fyber.inneractive.sdk.protobuf.C3609z.C3620j<?>) r24, (com.fyber.inneractive.sdk.protobuf.C3490e.C3491a) r25)
            goto L_0x0376
        L_0x02ec:
            if (r6 != r14) goto L_0x02f4
            int r1 = com.fyber.inneractive.sdk.protobuf.C3490e.m8772i(r3, r4, r12, r7)
            goto L_0x0376
        L_0x02f4:
            if (r6 != 0) goto L_0x0375
            com.fyber.inneractive.sdk.protobuf.h0 r12 = (com.fyber.inneractive.sdk.protobuf.C3506h0) r12
            int r1 = com.fyber.inneractive.sdk.protobuf.C3490e.m8767e(r3, r4, r7)
            long r8 = r7.f12420b
            r12.mo14915a(r8)
        L_0x0301:
            if (r1 >= r5) goto L_0x0376
            int r4 = com.fyber.inneractive.sdk.protobuf.C3490e.m8765d(r3, r1, r7)
            int r6 = r7.f12419a
            if (r2 == r6) goto L_0x030d
            goto L_0x0376
        L_0x030d:
            int r1 = com.fyber.inneractive.sdk.protobuf.C3490e.m8767e(r3, r4, r7)
            long r8 = r7.f12420b
            r12.mo14915a(r8)
            goto L_0x0301
        L_0x0317:
            if (r6 != r14) goto L_0x031e
            int r1 = com.fyber.inneractive.sdk.protobuf.C3490e.m8768e(r3, r4, r12, r7)
            goto L_0x0376
        L_0x031e:
            if (r6 != r9) goto L_0x0375
            com.fyber.inneractive.sdk.protobuf.w r12 = (com.fyber.inneractive.sdk.protobuf.C3603w) r12
            int r1 = com.fyber.inneractive.sdk.protobuf.C3490e.m8757a(r17, r18)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo15230a(r1)
        L_0x032d:
            int r1 = r4 + 4
            if (r1 >= r5) goto L_0x0376
            int r4 = com.fyber.inneractive.sdk.protobuf.C3490e.m8765d(r3, r1, r7)
            int r6 = r7.f12419a
            if (r2 == r6) goto L_0x033a
            goto L_0x0376
        L_0x033a:
            int r1 = com.fyber.inneractive.sdk.protobuf.C3490e.m8757a(r3, r4)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.mo15230a(r1)
            goto L_0x032d
        L_0x0346:
            if (r6 != r14) goto L_0x034d
            int r1 = com.fyber.inneractive.sdk.protobuf.C3490e.m8761b(r3, r4, r12, r7)
            goto L_0x0376
        L_0x034d:
            if (r6 != r13) goto L_0x0375
            com.fyber.inneractive.sdk.protobuf.n r12 = (com.fyber.inneractive.sdk.protobuf.C3551n) r12
            long r8 = com.fyber.inneractive.sdk.protobuf.C3490e.m8762b(r17, r18)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo15124a(r8)
        L_0x035c:
            int r1 = r4 + 8
            if (r1 >= r5) goto L_0x0376
            int r4 = com.fyber.inneractive.sdk.protobuf.C3490e.m8765d(r3, r1, r7)
            int r6 = r7.f12419a
            if (r2 == r6) goto L_0x0369
            goto L_0x0376
        L_0x0369:
            long r8 = com.fyber.inneractive.sdk.protobuf.C3490e.m8762b(r3, r4)
            double r8 = java.lang.Double.longBitsToDouble(r8)
            r12.mo15124a(r8)
            goto L_0x035c
        L_0x0375:
            r1 = r4
        L_0x0376:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C3583t0.mo15186a(java.lang.Object, byte[], int, int, int, int, int, int, long, int, long, com.fyber.inneractive.sdk.protobuf.e$a):int");
    }

    /* renamed from: b */
    public final Object mo15201b(int i) {
        return this.f12556b[(i / 3) * 2];
    }

    /* renamed from: b */
    public final void mo15204b(Object obj, int i, C3493e1 e1Var) throws IOException {
        if ((536870912 & i) != 0) {
            e1Var.mo14836b(this.f12568n.mo14913b(obj, m9533d(i)));
        } else {
            e1Var.mo14867q(this.f12568n.mo14913b(obj, m9533d(i)));
        }
    }

    /* renamed from: b */
    public final void mo15206b(T t, T t2, int i) {
        int[] iArr = this.f12555a;
        int i2 = iArr[i + 1];
        int i3 = iArr[i];
        long d = m9533d(i2);
        if (mo15200a(t2, i3, i)) {
            Object obj = null;
            if (mo15200a(t, i3, i)) {
                obj = C3569r1.m9439g(t, d);
            }
            Object g = C3569r1.m9439g(t2, d);
            if (obj != null && g != null) {
                C3569r1.m9426a((Object) t, d, C3609z.m9637a(obj, g));
                mo15203b(t, i3, i);
            } else if (g != null) {
                C3569r1.m9426a((Object) t, d, g);
                mo15203b(t, i3, i);
            }
        }
    }

    /* renamed from: b */
    public final void mo15202b(T t, int i) {
        int i2 = this.f12555a[i + 2];
        long j = (long) (1048575 & i2);
        if (j != 1048575) {
            C3569r1.m9424a((Object) t, j, (1 << (i2 >>> 20)) | C3569r1.m9437e(t, j));
        }
    }

    /* renamed from: b */
    public final void mo15203b(T t, int i, int i2) {
        C3569r1.m9424a((Object) t, (long) (this.f12555a[i2 + 2] & 1048575), i);
    }

    /* renamed from: b */
    public static <T> double m9530b(T t, long j) {
        return ((Double) C3569r1.m9439g(t, j)).doubleValue();
    }

    /* renamed from: a */
    public final <K, V> int mo15187a(T t, byte[] bArr, int i, int i2, int i3, long j, C3490e.C3491a aVar) throws IOException {
        Unsafe unsafe = f12554s;
        Object obj = this.f12556b[(i3 / 3) * 2];
        Object object = unsafe.getObject(t, j);
        if (this.f12571q.mo15095d(object)) {
            Object b = this.f12571q.mo15093b(obj);
            this.f12571q.mo15091a(b, object);
            unsafe.putObject(t, j, b);
            object = b;
        }
        this.f12571q.mo15097f(obj);
        this.f12571q.mo15094c(object);
        int d = C3490e.m8765d(bArr, i, aVar);
        int i4 = aVar.f12419a;
        if (i4 < 0 || i4 > i2 - d) {
            throw C3476a0.m8735i();
        }
        throw null;
    }

    /* renamed from: a */
    public final int mo15185a(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, C3490e.C3491a aVar) throws IOException {
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i11 = i3;
        int i12 = i4;
        int i13 = i5;
        long j2 = j;
        int i14 = i8;
        C3490e.C3491a aVar2 = aVar;
        Unsafe unsafe = f12554s;
        long j3 = (long) (this.f12555a[i14 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i13 == 1) {
                    unsafe.putObject(t2, j2, Double.valueOf(Double.longBitsToDouble(C3490e.m8762b(bArr, i))));
                    int i15 = i9 + 8;
                    unsafe.putInt(t2, j3, i12);
                    return i15;
                }
                break;
            case 52:
                if (i13 == 5) {
                    unsafe.putObject(t2, j2, Float.valueOf(Float.intBitsToFloat(C3490e.m8757a(bArr, i))));
                    int i16 = i9 + 4;
                    unsafe.putInt(t2, j3, i12);
                    return i16;
                }
                break;
            case 53:
            case 54:
                if (i13 == 0) {
                    int e = C3490e.m8767e(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Long.valueOf(aVar2.f12420b));
                    unsafe.putInt(t2, j3, i12);
                    return e;
                }
                break;
            case 55:
            case 62:
                if (i13 == 0) {
                    int d = C3490e.m8765d(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Integer.valueOf(aVar2.f12419a));
                    unsafe.putInt(t2, j3, i12);
                    return d;
                }
                break;
            case 56:
            case 65:
                if (i13 == 1) {
                    unsafe.putObject(t2, j2, Long.valueOf(C3490e.m8762b(bArr, i)));
                    int i17 = i9 + 8;
                    unsafe.putInt(t2, j3, i12);
                    return i17;
                }
                break;
            case 57:
            case 64:
                if (i13 == 5) {
                    unsafe.putObject(t2, j2, Integer.valueOf(C3490e.m8757a(bArr, i)));
                    int i18 = i9 + 4;
                    unsafe.putInt(t2, j3, i12);
                    return i18;
                }
                break;
            case 58:
                if (i13 == 0) {
                    int e2 = C3490e.m8767e(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Boolean.valueOf(aVar2.f12420b != 0));
                    unsafe.putInt(t2, j3, i12);
                    return e2;
                }
                break;
            case 59:
                if (i13 == 2) {
                    int d2 = C3490e.m8765d(bArr2, i9, aVar2);
                    int i19 = aVar2.f12419a;
                    if (i19 == 0) {
                        unsafe.putObject(t2, j2, "");
                    } else if ((i6 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) == 0 || C3576s1.m9505b(bArr2, d2, d2 + i19)) {
                        unsafe.putObject(t2, j2, new String(bArr2, d2, i19, C3609z.f12640a));
                        d2 += i19;
                    } else {
                        throw C3476a0.m8729c();
                    }
                    unsafe.putInt(t2, j3, i12);
                    return d2;
                }
                break;
            case 60:
                if (i13 == 2) {
                    int a = C3490e.m8756a(mo15207c(i14), bArr2, i9, i2, aVar2);
                    Object object = unsafe.getInt(t2, j3) == i12 ? unsafe.getObject(t2, j2) : null;
                    if (object == null) {
                        unsafe.putObject(t2, j2, aVar2.f12421c);
                    } else {
                        unsafe.putObject(t2, j2, C3609z.m9637a(object, aVar2.f12421c));
                    }
                    unsafe.putInt(t2, j3, i12);
                    return a;
                }
                break;
            case 61:
                if (i13 == 2) {
                    int a2 = C3490e.m8758a(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, aVar2.f12421c);
                    unsafe.putInt(t2, j3, i12);
                    return a2;
                }
                break;
            case 63:
                if (i13 == 0) {
                    int d3 = C3490e.m8765d(bArr2, i9, aVar2);
                    int i21 = aVar2.f12419a;
                    C3609z.C3614e a3 = mo15189a(i14);
                    if (a3 == null || a3.mo15254a(i21)) {
                        unsafe.putObject(t2, j2, Integer.valueOf(i21));
                        unsafe.putInt(t2, j3, i12);
                    } else {
                        m9535e((Object) t).mo15136a(i11, (Object) Long.valueOf((long) i21));
                    }
                    return d3;
                }
                break;
            case 66:
                if (i13 == 0) {
                    int d4 = C3490e.m8765d(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Integer.valueOf(C3529j.m9025b(aVar2.f12419a)));
                    unsafe.putInt(t2, j3, i12);
                    return d4;
                }
                break;
            case 67:
                if (i13 == 0) {
                    int e3 = C3490e.m8767e(bArr2, i9, aVar2);
                    unsafe.putObject(t2, j2, Long.valueOf(C3529j.m9021a(aVar2.f12420b)));
                    unsafe.putInt(t2, j3, i12);
                    return e3;
                }
                break;
            case 68:
                if (i13 == 3) {
                    int a4 = C3490e.m8755a(mo15207c(i14), bArr, i, i2, (i11 & -8) | 4, aVar);
                    Object object2 = unsafe.getInt(t2, j3) == i12 ? unsafe.getObject(t2, j2) : null;
                    if (object2 == null) {
                        unsafe.putObject(t2, j2, aVar2.f12421c);
                    } else {
                        unsafe.putObject(t2, j2, C3609z.m9637a(object2, aVar2.f12421c));
                    }
                    unsafe.putInt(t2, j3, i12);
                    return a4;
                }
                break;
        }
        return i9;
    }

    /* renamed from: a */
    public final C3609z.C3614e mo15189a(int i) {
        return (C3609z.C3614e) this.f12556b[((i / 3) * 2) + 1];
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r20v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v13, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v3, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v19, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v10, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v21, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v22, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v24, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v25, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v26, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v27, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v29, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v30, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v31, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v33, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v34, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v35, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v37, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v38, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v40, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v41, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v43, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v44, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v36, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v37, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x02d8, code lost:
        r0 = r7 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x02da, code lost:
        r5 = r6 | r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02dc, code lost:
        r12 = r8;
        r27 = r10;
        r2 = r11;
        r10 = r15;
        r6 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02e5, code lost:
        r7 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02e6, code lost:
        r20 = r6;
        r2 = r7;
        r33 = r8;
        r27 = r10;
        r21 = r11;
        r9 = r13;
        r22 = r25;
        r8 = r35;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0396, code lost:
        if (r0 != r15) goto L_0x03e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x03e2, code lost:
        if (r0 != r15) goto L_0x03e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x03f8, code lost:
        r8 = r35;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0181, code lost:
        r7 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0253, code lost:
        r7 = r3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo15188a(T r31, byte[] r32, int r33, int r34, int r35, com.fyber.inneractive.sdk.protobuf.C3490e.C3491a r36) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r9 = r36
            sun.misc.Unsafe r10 = f12554s
            r16 = 0
            r0 = r33
            r1 = -1
            r2 = 0
            r3 = 0
            r5 = 0
            r6 = 1048575(0xfffff, float:1.469367E-39)
        L_0x0019:
            r17 = 0
            if (r0 >= r13) goto L_0x0488
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002c
            int r0 = com.fyber.inneractive.sdk.protobuf.C3490e.m8753a((int) r0, (byte[]) r12, (int) r3, (com.fyber.inneractive.sdk.protobuf.C3490e.C3491a) r9)
            int r3 = r9.f12419a
            r4 = r3
            r3 = r0
            goto L_0x002d
        L_0x002c:
            r4 = r0
        L_0x002d:
            int r0 = r4 >>> 3
            r7 = r4 & 7
            r8 = 3
            if (r0 <= r1) goto L_0x0044
            int r2 = r2 / r8
            int r1 = r15.f12557c
            if (r0 < r1) goto L_0x0042
            int r1 = r15.f12558d
            if (r0 > r1) goto L_0x0042
            int r1 = r15.mo15184a((int) r0, (int) r2)
            goto L_0x0048
        L_0x0042:
            r1 = -1
            goto L_0x0048
        L_0x0044:
            int r1 = r15.mo15208e((int) r0)
        L_0x0048:
            r2 = r1
            r1 = -1
            if (r2 != r1) goto L_0x005d
            r33 = r0
            r2 = r3
            r9 = r4
            r20 = r5
            r22 = r6
            r27 = r10
            r8 = r11
            r18 = -1
            r21 = 0
            goto L_0x03fc
        L_0x005d:
            int[] r1 = r15.f12555a
            int r20 = r2 + 1
            r1 = r1[r20]
            int r8 = m9536f(r1)
            long r11 = m9533d((int) r1)
            r20 = r4
            r4 = 17
            r21 = r1
            if (r8 > r4) goto L_0x02f6
            int[] r4 = r15.f12555a
            int r22 = r2 + 2
            r4 = r4[r22]
            int r22 = r4 >>> 20
            r1 = 1
            int r22 = r1 << r22
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r13
            r18 = r2
            if (r4 == r6) goto L_0x0094
            if (r6 == r13) goto L_0x008c
            long r1 = (long) r6
            r10.putInt(r14, r1, r5)
        L_0x008c:
            long r1 = (long) r4
            int r5 = r10.getInt(r14, r1)
            r25 = r4
            goto L_0x0096
        L_0x0094:
            r25 = r6
        L_0x0096:
            r6 = r5
            r1 = 5
            switch(r8) {
                case 0: goto L_0x02b4;
                case 1: goto L_0x0294;
                case 2: goto L_0x0271;
                case 3: goto L_0x0271;
                case 4: goto L_0x0256;
                case 5: goto L_0x0231;
                case 6: goto L_0x0215;
                case 7: goto L_0x01ea;
                case 8: goto L_0x01c2;
                case 9: goto L_0x0187;
                case 10: goto L_0x0166;
                case 11: goto L_0x0256;
                case 12: goto L_0x0134;
                case 13: goto L_0x0215;
                case 14: goto L_0x0231;
                case 15: goto L_0x011a;
                case 16: goto L_0x00ef;
                case 17: goto L_0x00a7;
                default: goto L_0x009b;
            }
        L_0x009b:
            r12 = r32
            r8 = r0
            r7 = r3
            r11 = r18
            r13 = r20
            r18 = -1
            goto L_0x0182
        L_0x00a7:
            r2 = 3
            if (r7 != r2) goto L_0x00e3
            int r1 = r0 << 3
            r4 = r1 | 4
            r2 = r18
            com.fyber.inneractive.sdk.protobuf.f1 r1 = r15.mo15207c((int) r2)
            r8 = r0
            r0 = r1
            r18 = -1
            r1 = r32
            r7 = r2
            r2 = r3
            r3 = r34
            r5 = r20
            r13 = r5
            r5 = r36
            int r0 = com.fyber.inneractive.sdk.protobuf.C3490e.m8755a((com.fyber.inneractive.sdk.protobuf.C3498f1) r0, (byte[]) r1, (int) r2, (int) r3, (int) r4, (com.fyber.inneractive.sdk.protobuf.C3490e.C3491a) r5)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x00d1
            java.lang.Object r1 = r9.f12421c
            r10.putObject(r14, r11, r1)
            goto L_0x00de
        L_0x00d1:
            java.lang.Object r1 = r10.getObject(r14, r11)
            java.lang.Object r2 = r9.f12421c
            java.lang.Object r1 = com.fyber.inneractive.sdk.protobuf.C3609z.m9637a((java.lang.Object) r1, (java.lang.Object) r2)
            r10.putObject(r14, r11, r1)
        L_0x00de:
            r12 = r32
            r11 = r7
            goto L_0x017c
        L_0x00e3:
            r8 = r0
            r7 = r18
            r13 = r20
            r18 = -1
            r12 = r32
            r11 = r7
            goto L_0x01bd
        L_0x00ef:
            r8 = r0
            r4 = r18
            r13 = r20
            r18 = -1
            if (r7 != 0) goto L_0x0115
            r1 = r11
            r12 = r32
            int r7 = com.fyber.inneractive.sdk.protobuf.C3490e.m8767e(r12, r3, r9)
            r19 = r1
            long r0 = r9.f12420b
            long r23 = com.fyber.inneractive.sdk.protobuf.C3529j.m9021a((long) r0)
            r0 = r10
            r2 = r19
            r1 = r31
            r11 = r4
            r4 = r23
            r0.putLong(r1, r2, r4)
            r0 = r7
            goto L_0x017c
        L_0x0115:
            r12 = r32
            r11 = r4
            goto L_0x0181
        L_0x011a:
            r8 = r0
            r4 = r11
            r11 = r18
            r13 = r20
            r18 = -1
            r12 = r32
            if (r7 != 0) goto L_0x0181
            int r0 = com.fyber.inneractive.sdk.protobuf.C3490e.m8765d(r12, r3, r9)
            int r1 = r9.f12419a
            int r1 = com.fyber.inneractive.sdk.protobuf.C3529j.m9025b(r1)
            r10.putInt(r14, r4, r1)
            goto L_0x017c
        L_0x0134:
            r8 = r0
            r4 = r11
            r11 = r18
            r13 = r20
            r18 = -1
            r12 = r32
            if (r7 != 0) goto L_0x0181
            int r0 = com.fyber.inneractive.sdk.protobuf.C3490e.m8765d(r12, r3, r9)
            int r1 = r9.f12419a
            com.fyber.inneractive.sdk.protobuf.z$e r2 = r15.mo15189a((int) r11)
            if (r2 == 0) goto L_0x0162
            boolean r2 = r2.mo15254a(r1)
            if (r2 == 0) goto L_0x0153
            goto L_0x0162
        L_0x0153:
            com.fyber.inneractive.sdk.protobuf.n1 r2 = m9535e((java.lang.Object) r31)
            long r3 = (long) r1
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            r2.mo15136a((int) r13, (java.lang.Object) r1)
            r5 = r6
            goto L_0x02dc
        L_0x0162:
            r10.putInt(r14, r4, r1)
            goto L_0x017c
        L_0x0166:
            r8 = r0
            r4 = r11
            r11 = r18
            r13 = r20
            r0 = 2
            r18 = -1
            r12 = r32
            if (r7 != r0) goto L_0x0181
            int r0 = com.fyber.inneractive.sdk.protobuf.C3490e.m8758a(r12, r3, r9)
            java.lang.Object r1 = r9.f12421c
            r10.putObject(r14, r4, r1)
        L_0x017c:
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x02da
        L_0x0181:
            r7 = r3
        L_0x0182:
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x02e6
        L_0x0187:
            r8 = r0
            r4 = r11
            r11 = r18
            r13 = r20
            r0 = 2
            r18 = -1
            r12 = r32
            if (r7 != r0) goto L_0x01bb
            com.fyber.inneractive.sdk.protobuf.f1 r0 = r15.mo15207c((int) r11)
            r2 = r34
            r19 = 1048575(0xfffff, float:1.469367E-39)
            int r0 = com.fyber.inneractive.sdk.protobuf.C3490e.m8756a((com.fyber.inneractive.sdk.protobuf.C3498f1) r0, (byte[]) r12, (int) r3, (int) r2, (com.fyber.inneractive.sdk.protobuf.C3490e.C3491a) r9)
            r1 = r6 & r22
            if (r1 != 0) goto L_0x01ac
            java.lang.Object r1 = r9.f12421c
            r10.putObject(r14, r4, r1)
            goto L_0x02da
        L_0x01ac:
            java.lang.Object r1 = r10.getObject(r14, r4)
            java.lang.Object r3 = r9.f12421c
            java.lang.Object r1 = com.fyber.inneractive.sdk.protobuf.C3609z.m9637a((java.lang.Object) r1, (java.lang.Object) r3)
            r10.putObject(r14, r4, r1)
            goto L_0x02da
        L_0x01bb:
            r2 = r34
        L_0x01bd:
            r19 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0253
        L_0x01c2:
            r2 = r34
            r8 = r0
            r4 = r11
            r11 = r18
            r13 = r20
            r0 = 2
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r32
            if (r7 != r0) goto L_0x0253
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x01df
            int r0 = com.fyber.inneractive.sdk.protobuf.C3490e.m8760b(r12, r3, r9)
            goto L_0x01e3
        L_0x01df:
            int r0 = com.fyber.inneractive.sdk.protobuf.C3490e.m8763c(r12, r3, r9)
        L_0x01e3:
            java.lang.Object r1 = r9.f12421c
            r10.putObject(r14, r4, r1)
            goto L_0x02da
        L_0x01ea:
            r2 = r34
            r8 = r0
            r4 = r11
            r11 = r18
            r13 = r20
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r32
            if (r7 != 0) goto L_0x0253
            int r0 = com.fyber.inneractive.sdk.protobuf.C3490e.m8767e(r12, r3, r9)
            r33 = r0
            long r0 = r9.f12420b
            r20 = 0
            int r3 = (r0 > r20 ? 1 : (r0 == r20 ? 0 : -1))
            if (r3 == 0) goto L_0x020b
            r1 = 1
            goto L_0x020c
        L_0x020b:
            r1 = 0
        L_0x020c:
            com.fyber.inneractive.sdk.protobuf.r1$d r0 = com.fyber.inneractive.sdk.protobuf.C3569r1.f12543e
            r0.mo15172a((java.lang.Object) r14, (long) r4, (boolean) r1)
            r0 = r33
            goto L_0x02da
        L_0x0215:
            r2 = r34
            r8 = r0
            r4 = r11
            r11 = r18
            r13 = r20
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r32
            if (r7 != r1) goto L_0x0253
            int r0 = com.fyber.inneractive.sdk.protobuf.C3490e.m8757a(r12, r3)
            r10.putInt(r14, r4, r0)
            int r0 = r3 + 4
            goto L_0x02da
        L_0x0231:
            r2 = r34
            r8 = r0
            r4 = r11
            r11 = r18
            r13 = r20
            r0 = 1
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r32
            if (r7 != r0) goto L_0x0253
            long r20 = com.fyber.inneractive.sdk.protobuf.C3490e.m8762b(r12, r3)
            r0 = r10
            r1 = r31
            r7 = r3
            r2 = r4
            r4 = r20
            r0.putLong(r1, r2, r4)
            goto L_0x02d8
        L_0x0253:
            r7 = r3
            goto L_0x02e6
        L_0x0256:
            r8 = r0
            r2 = r3
            r4 = r11
            r11 = r18
            r13 = r20
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r32
            if (r7 != 0) goto L_0x02e5
            int r0 = com.fyber.inneractive.sdk.protobuf.C3490e.m8765d(r12, r2, r9)
            int r1 = r9.f12419a
            r10.putInt(r14, r4, r1)
            goto L_0x02da
        L_0x0271:
            r8 = r0
            r2 = r3
            r4 = r11
            r11 = r18
            r13 = r20
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r32
            if (r7 != 0) goto L_0x02e5
            int r7 = com.fyber.inneractive.sdk.protobuf.C3490e.m8767e(r12, r2, r9)
            long r2 = r9.f12420b
            r0 = r10
            r1 = r31
            r20 = r2
            r2 = r4
            r4 = r20
            r0.putLong(r1, r2, r4)
            r0 = r7
            goto L_0x02da
        L_0x0294:
            r8 = r0
            r2 = r3
            r4 = r11
            r11 = r18
            r13 = r20
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r32
            if (r7 != r1) goto L_0x02e5
            int r0 = com.fyber.inneractive.sdk.protobuf.C3490e.m8757a(r12, r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.fyber.inneractive.sdk.protobuf.r1$d r1 = com.fyber.inneractive.sdk.protobuf.C3569r1.f12543e
            r1.mo15171a((java.lang.Object) r14, (long) r4, (float) r0)
            int r0 = r2 + 4
            goto L_0x02da
        L_0x02b4:
            r8 = r0
            r2 = r3
            r4 = r11
            r11 = r18
            r13 = r20
            r0 = 1
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r32
            if (r7 != r0) goto L_0x02e5
            long r0 = com.fyber.inneractive.sdk.protobuf.C3490e.m8762b(r12, r2)
            double r20 = java.lang.Double.longBitsToDouble(r0)
            com.fyber.inneractive.sdk.protobuf.r1$d r0 = com.fyber.inneractive.sdk.protobuf.C3569r1.f12543e
            r1 = r31
            r7 = r2
            r2 = r4
            r4 = r20
            r0.mo15170a((java.lang.Object) r1, (long) r2, (double) r4)
        L_0x02d8:
            int r0 = r7 + 8
        L_0x02da:
            r5 = r6 | r22
        L_0x02dc:
            r12 = r8
            r27 = r10
            r2 = r11
            r10 = r15
            r6 = r25
            goto L_0x034b
        L_0x02e5:
            r7 = r2
        L_0x02e6:
            r20 = r6
            r2 = r7
            r33 = r8
            r27 = r10
            r21 = r11
            r9 = r13
            r22 = r25
            r8 = r35
            goto L_0x03fc
        L_0x02f6:
            r4 = r0
            r1 = r3
            r13 = r20
            r18 = -1
            r19 = 1048575(0xfffff, float:1.469367E-39)
            r28 = r11
            r12 = r32
            r11 = r2
            r2 = r28
            r0 = 27
            if (r8 != r0) goto L_0x0361
            r0 = 2
            if (r7 != r0) goto L_0x0352
            java.lang.Object r0 = r10.getObject(r14, r2)
            com.fyber.inneractive.sdk.protobuf.z$j r0 = (com.fyber.inneractive.sdk.protobuf.C3609z.C3620j) r0
            boolean r7 = r0.mo14792d()
            if (r7 != 0) goto L_0x032b
            int r7 = r0.size()
            if (r7 != 0) goto L_0x0322
            r7 = 10
            goto L_0x0324
        L_0x0322:
            int r7 = r7 * 2
        L_0x0324:
            com.fyber.inneractive.sdk.protobuf.z$j r0 = r0.mo14808b(r7)
            r10.putObject(r14, r2, r0)
        L_0x032b:
            r7 = r0
            com.fyber.inneractive.sdk.protobuf.f1 r0 = r15.mo15207c((int) r11)
            r3 = r1
            r1 = r13
            r2 = r32
            r8 = r4
            r4 = r34
            r20 = r5
            r5 = r7
            r22 = r6
            r6 = r36
            int r0 = com.fyber.inneractive.sdk.protobuf.C3490e.m8754a(r0, r1, r2, r3, r4, r5, r6)
            r12 = r8
            r27 = r10
            r2 = r11
            r10 = r15
            r5 = r20
            r6 = r22
        L_0x034b:
            r8 = r35
            r11 = r9
            r9 = r13
            r13 = r14
            goto L_0x047a
        L_0x0352:
            r20 = r5
            r22 = r6
            r15 = r1
            r33 = r4
            r27 = r10
            r21 = r11
            r24 = r13
            goto L_0x03b1
        L_0x0361:
            r20 = r5
            r22 = r6
            r6 = r1
            r5 = r4
            r0 = 49
            if (r8 > r0) goto L_0x0399
            r1 = r21
            long r0 = (long) r1
            r23 = r0
            r0 = r30
            r1 = r31
            r25 = r2
            r2 = r32
            r3 = r6
            r4 = r34
            r33 = r5
            r5 = r13
            r15 = r6
            r6 = r33
            r19 = r8
            r8 = r11
            r27 = r10
            r9 = r23
            r21 = r11
            r11 = r19
            r24 = r13
            r12 = r25
            r14 = r36
            int r0 = r0.mo15186a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (com.fyber.inneractive.sdk.protobuf.C3490e.C3491a) r14)
            if (r0 == r15) goto L_0x03f8
            goto L_0x03e4
        L_0x0399:
            r25 = r2
            r33 = r5
            r15 = r6
            r19 = r8
            r27 = r10
            r24 = r13
            r1 = r21
            r21 = r11
            r0 = 50
            r9 = r19
            if (r9 != r0) goto L_0x03ca
            r0 = 2
            if (r7 == r0) goto L_0x03b7
        L_0x03b1:
            r8 = r35
            r2 = r15
        L_0x03b4:
            r9 = r24
            goto L_0x03fc
        L_0x03b7:
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r21
            r6 = r25
            r8 = r36
            r0.mo15187a(r1, r2, r3, r4, r5, r6, r8)
            throw r17
        L_0x03ca:
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r24
            r6 = r33
            r10 = r25
            r12 = r21
            r13 = r36
            int r0 = r0.mo15185a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (com.fyber.inneractive.sdk.protobuf.C3490e.C3491a) r13)
            if (r0 == r15) goto L_0x03f8
        L_0x03e4:
            r10 = r30
            r13 = r31
            r12 = r33
            r8 = r35
            r11 = r36
            r5 = r20
            r2 = r21
            r6 = r22
            r9 = r24
            goto L_0x047a
        L_0x03f8:
            r8 = r35
            r2 = r0
            goto L_0x03b4
        L_0x03fc:
            if (r9 != r8) goto L_0x040c
            if (r8 == 0) goto L_0x040c
            r10 = r30
            r13 = r31
            r0 = r2
            r3 = r9
            r5 = r20
            r6 = r22
            goto L_0x0491
        L_0x040c:
            r10 = r30
            boolean r0 = r10.f12560f
            if (r0 == 0) goto L_0x045f
            r11 = r36
            com.fyber.inneractive.sdk.protobuf.q r0 = r11.f12422d
            com.fyber.inneractive.sdk.protobuf.q r1 = com.fyber.inneractive.sdk.protobuf.C3562q.m9406a()
            if (r0 == r1) goto L_0x045a
            com.fyber.inneractive.sdk.protobuf.q0 r0 = r10.f12559e
            com.fyber.inneractive.sdk.protobuf.m1<?, ?> r6 = r10.f12569o
            com.fyber.inneractive.sdk.protobuf.q r1 = r11.f12422d
            java.util.Map<com.fyber.inneractive.sdk.protobuf.q$a, com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$d<?, ?>> r1 = r1.f12536a
            com.fyber.inneractive.sdk.protobuf.q$a r3 = new com.fyber.inneractive.sdk.protobuf.q$a
            r12 = r33
            r3.<init>(r0, r12)
            java.lang.Object r0 = r1.get(r3)
            r5 = r0
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$d r5 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.C3468d) r5
            if (r5 != 0) goto L_0x0446
            com.fyber.inneractive.sdk.protobuf.n1 r4 = m9535e((java.lang.Object) r31)
            r0 = r9
            r1 = r32
            r3 = r34
            r5 = r36
            int r0 = com.fyber.inneractive.sdk.protobuf.C3490e.m8751a((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.fyber.inneractive.sdk.protobuf.C3553n1) r4, (com.fyber.inneractive.sdk.protobuf.C3490e.C3491a) r5)
            r13 = r31
            goto L_0x0474
        L_0x0446:
            r13 = r31
            r4 = r13
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage r4 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.ExtendableMessage) r4
            r4.ensureExtensionsAreMutable()
            r0 = r9
            r1 = r32
            r3 = r34
            r7 = r36
            int r0 = com.fyber.inneractive.sdk.protobuf.C3490e.m8749a(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0474
        L_0x045a:
            r13 = r31
            r12 = r33
            goto L_0x0465
        L_0x045f:
            r13 = r31
            r12 = r33
            r11 = r36
        L_0x0465:
            com.fyber.inneractive.sdk.protobuf.n1 r4 = m9535e((java.lang.Object) r31)
            r0 = r9
            r1 = r32
            r3 = r34
            r5 = r36
            int r0 = com.fyber.inneractive.sdk.protobuf.C3490e.m8751a((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.fyber.inneractive.sdk.protobuf.C3553n1) r4, (com.fyber.inneractive.sdk.protobuf.C3490e.C3491a) r5)
        L_0x0474:
            r5 = r20
            r2 = r21
            r6 = r22
        L_0x047a:
            r3 = r9
            r15 = r10
            r9 = r11
            r1 = r12
            r14 = r13
            r10 = r27
            r12 = r32
            r13 = r34
            r11 = r8
            goto L_0x0019
        L_0x0488:
            r20 = r5
            r22 = r6
            r27 = r10
            r8 = r11
            r13 = r14
            r10 = r15
        L_0x0491:
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r6 == r1) goto L_0x049c
            long r1 = (long) r6
            r4 = r27
            r4.putInt(r13, r1, r5)
        L_0x049c:
            int r1 = r10.f12565k
            r2 = r17
        L_0x04a0:
            int r4 = r10.f12566l
            if (r1 >= r4) goto L_0x04b3
            int[] r4 = r10.f12564j
            r4 = r4[r1]
            com.fyber.inneractive.sdk.protobuf.m1<?, ?> r5 = r10.f12569o
            java.lang.Object r2 = r10.mo15190a((java.lang.Object) r13, (int) r4, r2, r5)
            com.fyber.inneractive.sdk.protobuf.n1 r2 = (com.fyber.inneractive.sdk.protobuf.C3553n1) r2
            int r1 = r1 + 1
            goto L_0x04a0
        L_0x04b3:
            if (r2 == 0) goto L_0x04ba
            com.fyber.inneractive.sdk.protobuf.m1<?, ?> r1 = r10.f12569o
            r1.mo15118b((java.lang.Object) r13, r2)
        L_0x04ba:
            if (r8 != 0) goto L_0x04c6
            r1 = r34
            if (r0 != r1) goto L_0x04c1
            goto L_0x04cc
        L_0x04c1:
            com.fyber.inneractive.sdk.protobuf.a0 r0 = com.fyber.inneractive.sdk.protobuf.C3476a0.m8733g()
            throw r0
        L_0x04c6:
            r1 = r34
            if (r0 > r1) goto L_0x04cd
            if (r3 != r8) goto L_0x04cd
        L_0x04cc:
            return r0
        L_0x04cd:
            com.fyber.inneractive.sdk.protobuf.a0 r0 = com.fyber.inneractive.sdk.protobuf.C3476a0.m8733g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C3583t0.mo15188a(java.lang.Object, byte[], int, int, int, com.fyber.inneractive.sdk.protobuf.e$a):int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v14, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v15, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02b2, code lost:
        if (r0 != r15) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0308, code lost:
        if (r0 != r15) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0311, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0102, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ec, code lost:
        r17 = r4 + 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x020b, code lost:
        r17 = r8 + 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x020d, code lost:
        r6 = r6 | r21;
        r28 = r10;
        r2 = r13;
        r0 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0215, code lost:
        r8 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0216, code lost:
        r2 = r8;
        r28 = r10;
        r20 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo14894a(T r31, byte[] r32, int r33, int r34, com.fyber.inneractive.sdk.protobuf.C3490e.C3491a r35) throws java.io.IOException {
        /*
            r30 = this;
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            boolean r0 = r15.f12562h
            if (r0 == 0) goto L_0x0353
            sun.misc.Unsafe r9 = f12554s
            r10 = -1
            r16 = 0
            r0 = r33
            r1 = -1
            r2 = 0
            r6 = 0
            r7 = 1048575(0xfffff, float:1.469367E-39)
        L_0x001b:
            if (r0 >= r13) goto L_0x0336
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002d
            int r0 = com.fyber.inneractive.sdk.protobuf.C3490e.m8753a((int) r0, (byte[]) r12, (int) r3, (com.fyber.inneractive.sdk.protobuf.C3490e.C3491a) r11)
            int r3 = r11.f12419a
            r4 = r0
            r17 = r3
            goto L_0x0030
        L_0x002d:
            r17 = r0
            r4 = r3
        L_0x0030:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x0047
            int r2 = r2 / 3
            int r0 = r15.f12557c
            if (r5 < r0) goto L_0x0045
            int r0 = r15.f12558d
            if (r5 > r0) goto L_0x0045
            int r0 = r15.mo15184a((int) r5, (int) r2)
            goto L_0x004b
        L_0x0045:
            r0 = -1
            goto L_0x004b
        L_0x0047:
            int r0 = r15.mo15208e((int) r5)
        L_0x004b:
            r2 = r0
            if (r2 != r10) goto L_0x0059
            r2 = r4
            r19 = r5
            r28 = r9
            r18 = -1
            r20 = 0
            goto L_0x0313
        L_0x0059:
            int[] r0 = r15.f12555a
            int r1 = r2 + 1
            r1 = r0[r1]
            int r0 = m9536f(r1)
            r18 = r9
            long r8 = m9533d((int) r1)
            r10 = 17
            r33 = r5
            if (r0 > r10) goto L_0x021f
            int[] r10 = r15.f12555a
            int r21 = r2 + 2
            r10 = r10[r21]
            int r21 = r10 >>> 20
            r5 = 1
            int r21 = r5 << r21
            r13 = 1048575(0xfffff, float:1.469367E-39)
            r10 = r10 & r13
            r23 = r1
            r19 = r2
            if (r10 == r7) goto L_0x009c
            if (r7 == r13) goto L_0x008d
            long r1 = (long) r7
            r7 = r18
            r7.putInt(r14, r1, r6)
            goto L_0x008f
        L_0x008d:
            r7 = r18
        L_0x008f:
            if (r10 == r13) goto L_0x0096
            long r1 = (long) r10
            int r6 = r7.getInt(r14, r1)
        L_0x0096:
            r29 = r10
            r10 = r7
            r7 = r29
            goto L_0x009e
        L_0x009c:
            r10 = r18
        L_0x009e:
            r1 = 5
            switch(r0) {
                case 0: goto L_0x01ef;
                case 1: goto L_0x01d6;
                case 2: goto L_0x01bf;
                case 3: goto L_0x01bf;
                case 4: goto L_0x01ac;
                case 5: goto L_0x0192;
                case 6: goto L_0x017f;
                case 7: goto L_0x015f;
                case 8: goto L_0x013b;
                case 9: goto L_0x0108;
                case 10: goto L_0x00ed;
                case 11: goto L_0x01ac;
                case 12: goto L_0x00dd;
                case 13: goto L_0x017f;
                case 14: goto L_0x0192;
                case 15: goto L_0x00c9;
                case 16: goto L_0x00ac;
                default: goto L_0x00a2;
            }
        L_0x00a2:
            r8 = r4
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r33
            goto L_0x0216
        L_0x00ac:
            if (r3 != 0) goto L_0x00c4
            int r17 = com.fyber.inneractive.sdk.protobuf.C3490e.m8767e(r12, r4, r11)
            long r0 = r11.f12420b
            long r4 = com.fyber.inneractive.sdk.protobuf.C3529j.m9021a((long) r0)
            r0 = r10
            r1 = r31
            r13 = r19
            r2 = r8
            r19 = r33
            r0.putLong(r1, r2, r4)
            goto L_0x00fd
        L_0x00c4:
            r13 = r19
            r19 = r33
            goto L_0x0102
        L_0x00c9:
            r13 = r19
            r19 = r33
            if (r3 != 0) goto L_0x0102
            int r17 = com.fyber.inneractive.sdk.protobuf.C3490e.m8765d(r12, r4, r11)
            int r0 = r11.f12419a
            int r0 = com.fyber.inneractive.sdk.protobuf.C3529j.m9025b(r0)
            r10.putInt(r14, r8, r0)
            goto L_0x00fd
        L_0x00dd:
            r13 = r19
            r19 = r33
            if (r3 != 0) goto L_0x0102
            int r17 = com.fyber.inneractive.sdk.protobuf.C3490e.m8765d(r12, r4, r11)
            int r0 = r11.f12419a
            r10.putInt(r14, r8, r0)
            goto L_0x00fd
        L_0x00ed:
            r13 = r19
            r0 = 2
            r19 = r33
            if (r3 != r0) goto L_0x0102
            int r17 = com.fyber.inneractive.sdk.protobuf.C3490e.m8758a(r12, r4, r11)
            java.lang.Object r0 = r11.f12421c
            r10.putObject(r14, r8, r0)
        L_0x00fd:
            r18 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x020d
        L_0x0102:
            r8 = r4
            r18 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0216
        L_0x0108:
            r13 = r19
            r0 = 2
            r19 = r33
            if (r3 != r0) goto L_0x0134
            com.fyber.inneractive.sdk.protobuf.f1 r0 = r15.mo15207c((int) r13)
            r2 = r34
            r18 = 1048575(0xfffff, float:1.469367E-39)
            int r17 = com.fyber.inneractive.sdk.protobuf.C3490e.m8756a((com.fyber.inneractive.sdk.protobuf.C3498f1) r0, (byte[]) r12, (int) r4, (int) r2, (com.fyber.inneractive.sdk.protobuf.C3490e.C3491a) r11)
            java.lang.Object r0 = r10.getObject(r14, r8)
            if (r0 != 0) goto L_0x0129
            java.lang.Object r0 = r11.f12421c
            r10.putObject(r14, r8, r0)
            goto L_0x020d
        L_0x0129:
            java.lang.Object r1 = r11.f12421c
            java.lang.Object r0 = com.fyber.inneractive.sdk.protobuf.C3609z.m9637a((java.lang.Object) r0, (java.lang.Object) r1)
            r10.putObject(r14, r8, r0)
            goto L_0x020d
        L_0x0134:
            r2 = r34
            r18 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0215
        L_0x013b:
            r2 = r34
            r13 = r19
            r0 = 2
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r33
            if (r3 != r0) goto L_0x0215
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r23 & r0
            if (r0 != 0) goto L_0x0152
            int r0 = com.fyber.inneractive.sdk.protobuf.C3490e.m8760b(r12, r4, r11)
            goto L_0x0156
        L_0x0152:
            int r0 = com.fyber.inneractive.sdk.protobuf.C3490e.m8763c(r12, r4, r11)
        L_0x0156:
            r17 = r0
            java.lang.Object r0 = r11.f12421c
            r10.putObject(r14, r8, r0)
            goto L_0x020d
        L_0x015f:
            r2 = r34
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r33
            if (r3 != 0) goto L_0x0215
            int r17 = com.fyber.inneractive.sdk.protobuf.C3490e.m8767e(r12, r4, r11)
            long r0 = r11.f12420b
            r3 = 0
            int r22 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r22 == 0) goto L_0x0177
            goto L_0x0178
        L_0x0177:
            r5 = 0
        L_0x0178:
            com.fyber.inneractive.sdk.protobuf.r1$d r0 = com.fyber.inneractive.sdk.protobuf.C3569r1.f12543e
            r0.mo15172a((java.lang.Object) r14, (long) r8, (boolean) r5)
            goto L_0x020d
        L_0x017f:
            r2 = r34
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r33
            if (r3 != r1) goto L_0x0215
            int r0 = com.fyber.inneractive.sdk.protobuf.C3490e.m8757a(r12, r4)
            r10.putInt(r14, r8, r0)
            goto L_0x01ec
        L_0x0192:
            r2 = r34
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r33
            if (r3 != r5) goto L_0x0215
            long r22 = com.fyber.inneractive.sdk.protobuf.C3490e.m8762b(r12, r4)
            r0 = r10
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r22
            r0.putLong(r1, r2, r4)
            goto L_0x020b
        L_0x01ac:
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r33
            if (r3 != 0) goto L_0x0215
            int r17 = com.fyber.inneractive.sdk.protobuf.C3490e.m8765d(r12, r4, r11)
            int r0 = r11.f12419a
            r10.putInt(r14, r8, r0)
            goto L_0x020d
        L_0x01bf:
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r33
            if (r3 != 0) goto L_0x0215
            int r17 = com.fyber.inneractive.sdk.protobuf.C3490e.m8767e(r12, r4, r11)
            long r4 = r11.f12420b
            r0 = r10
            r1 = r31
            r2 = r8
            r0.putLong(r1, r2, r4)
            goto L_0x020d
        L_0x01d6:
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r33
            if (r3 != r1) goto L_0x0215
            int r0 = com.fyber.inneractive.sdk.protobuf.C3490e.m8757a(r12, r4)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.fyber.inneractive.sdk.protobuf.r1$d r1 = com.fyber.inneractive.sdk.protobuf.C3569r1.f12543e
            r1.mo15171a((java.lang.Object) r14, (long) r8, (float) r0)
        L_0x01ec:
            int r17 = r4 + 4
            goto L_0x020d
        L_0x01ef:
            r13 = r19
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r19 = r33
            if (r3 != r5) goto L_0x0215
            long r0 = com.fyber.inneractive.sdk.protobuf.C3490e.m8762b(r12, r4)
            double r22 = java.lang.Double.longBitsToDouble(r0)
            com.fyber.inneractive.sdk.protobuf.r1$d r0 = com.fyber.inneractive.sdk.protobuf.C3569r1.f12543e
            r1 = r31
            r2 = r8
            r8 = r4
            r4 = r22
            r0.mo15170a((java.lang.Object) r1, (long) r2, (double) r4)
        L_0x020b:
            int r17 = r8 + 8
        L_0x020d:
            r6 = r6 | r21
            r28 = r10
            r2 = r13
            r0 = r17
            goto L_0x0267
        L_0x0215:
            r8 = r4
        L_0x0216:
            r2 = r8
            r28 = r10
            r20 = r13
            r18 = -1
            goto L_0x0313
        L_0x021f:
            r19 = r33
            r23 = r1
            r13 = r2
            r5 = r4
            r10 = r18
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r1 = 27
            if (r0 != r1) goto L_0x0278
            r1 = 2
            if (r3 != r1) goto L_0x026b
            java.lang.Object r0 = r10.getObject(r14, r8)
            com.fyber.inneractive.sdk.protobuf.z$j r0 = (com.fyber.inneractive.sdk.protobuf.C3609z.C3620j) r0
            boolean r1 = r0.mo14792d()
            if (r1 != 0) goto L_0x024f
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0246
            r1 = 10
            goto L_0x0248
        L_0x0246:
            int r1 = r1 * 2
        L_0x0248:
            com.fyber.inneractive.sdk.protobuf.z$j r0 = r0.mo14808b(r1)
            r10.putObject(r14, r8, r0)
        L_0x024f:
            r8 = r0
            com.fyber.inneractive.sdk.protobuf.f1 r0 = r15.mo15207c((int) r13)
            r1 = r17
            r2 = r32
            r3 = r5
            r4 = r34
            r5 = r8
            r8 = r6
            r6 = r35
            int r0 = com.fyber.inneractive.sdk.protobuf.C3490e.m8754a(r0, r1, r2, r3, r4, r5, r6)
            r6 = r8
            r28 = r10
            r2 = r13
        L_0x0267:
            r18 = -1
            goto L_0x0325
        L_0x026b:
            r15 = r5
            r24 = r6
            r25 = r7
            r28 = r10
            r20 = r13
            r18 = -1
            goto L_0x02d4
        L_0x0278:
            r1 = 49
            if (r0 > r1) goto L_0x02b6
            r1 = r23
            long r1 = (long) r1
            r4 = r0
            r0 = r30
            r21 = r1
            r1 = r31
            r2 = r32
            r33 = r3
            r3 = r5
            r23 = r4
            r4 = r34
            r15 = r5
            r5 = r17
            r24 = r6
            r6 = r19
            r25 = r7
            r7 = r33
            r26 = r8
            r9 = 1048575(0xfffff, float:1.469367E-39)
            r8 = r13
            r28 = r10
            r18 = -1
            r9 = r21
            r11 = r23
            r20 = r13
            r12 = r26
            r14 = r35
            int r0 = r0.mo15186a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (long) r9, (int) r11, (long) r12, (com.fyber.inneractive.sdk.protobuf.C3490e.C3491a) r14)
            if (r0 == r15) goto L_0x0311
            goto L_0x030a
        L_0x02b6:
            r33 = r3
            r15 = r5
            r24 = r6
            r25 = r7
            r26 = r8
            r28 = r10
            r20 = r13
            r1 = r23
            r18 = -1
            r23 = r0
            r0 = 50
            r9 = r23
            if (r9 != r0) goto L_0x02ee
            r7 = r33
            r0 = 2
            if (r7 == r0) goto L_0x02da
        L_0x02d4:
            r2 = r15
        L_0x02d5:
            r6 = r24
            r7 = r25
            goto L_0x0313
        L_0x02da:
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r20
            r6 = r26
            r8 = r35
            r0.mo15187a(r1, r2, r3, r4, r5, r6, r8)
            r0 = 0
            throw r0
        L_0x02ee:
            r7 = r33
            r0 = r30
            r8 = r1
            r1 = r31
            r2 = r32
            r3 = r15
            r4 = r34
            r5 = r17
            r6 = r19
            r10 = r26
            r12 = r20
            r13 = r35
            int r0 = r0.mo15185a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (int) r6, (int) r7, (int) r8, (int) r9, (long) r10, (int) r12, (com.fyber.inneractive.sdk.protobuf.C3490e.C3491a) r13)
            if (r0 == r15) goto L_0x0311
        L_0x030a:
            r2 = r20
            r6 = r24
            r7 = r25
            goto L_0x0325
        L_0x0311:
            r2 = r0
            goto L_0x02d5
        L_0x0313:
            com.fyber.inneractive.sdk.protobuf.n1 r4 = m9535e((java.lang.Object) r31)
            r0 = r17
            r1 = r32
            r3 = r34
            r5 = r35
            int r0 = com.fyber.inneractive.sdk.protobuf.C3490e.m8751a((int) r0, (byte[]) r1, (int) r2, (int) r3, (com.fyber.inneractive.sdk.protobuf.C3553n1) r4, (com.fyber.inneractive.sdk.protobuf.C3490e.C3491a) r5)
            r2 = r20
        L_0x0325:
            r15 = r30
            r14 = r31
            r12 = r32
            r13 = r34
            r11 = r35
            r1 = r19
            r9 = r28
            r10 = -1
            goto L_0x001b
        L_0x0336:
            r24 = r6
            r28 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x0349
            long r1 = (long) r7
            r3 = r31
            r6 = r24
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x0349:
            r4 = r34
            if (r0 != r4) goto L_0x034e
            goto L_0x0365
        L_0x034e:
            com.fyber.inneractive.sdk.protobuf.a0 r0 = com.fyber.inneractive.sdk.protobuf.C3476a0.m8733g()
            throw r0
        L_0x0353:
            r4 = r13
            r3 = r14
            r5 = 0
            r0 = r30
            r1 = r31
            r2 = r32
            r3 = r33
            r4 = r34
            r6 = r35
            r0.mo15188a(r1, (byte[]) r2, (int) r3, (int) r4, (int) r5, (com.fyber.inneractive.sdk.protobuf.C3490e.C3491a) r6)
        L_0x0365:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C3583t0.mo14894a(java.lang.Object, byte[], int, int, com.fyber.inneractive.sdk.protobuf.e$a):void");
    }

    /* renamed from: a */
    public final boolean mo14895a(T t) {
        int i = 0;
        int i2 = 1048575;
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i >= this.f12565k) {
                return !this.f12560f || this.f12570p.mo15158a((Object) t).mo15223e();
            }
            int i4 = this.f12564j[i];
            int i5 = this.f12555a[i4];
            int g = mo15209g(i4);
            int i6 = this.f12555a[i4 + 2];
            int i7 = i6 & 1048575;
            int i8 = 1 << (i6 >>> 20);
            if (i7 != i2) {
                if (i7 != 1048575) {
                    i3 = f12554s.getInt(t, (long) i7);
                }
                i2 = i7;
            }
            if ((268435456 & g) != 0) {
                if (!(i2 == 1048575 ? mo15199a(t, i4) : (i3 & i8) != 0)) {
                    return false;
                }
            }
            int f = m9536f(g);
            if (f == 9 || f == 17) {
                if (i2 == 1048575) {
                    z = mo15199a(t, i4);
                } else if ((i3 & i8) == 0) {
                    z = false;
                }
                if (z && !mo15207c(i4).mo14895a(C3569r1.m9439g(t, m9533d(g)))) {
                    return false;
                }
            } else {
                if (f != 27) {
                    if (f == 60 || f == 68) {
                        if (mo15200a(t, i5, i4) && !mo15207c(i4).mo14895a(C3569r1.m9439g(t, m9533d(g)))) {
                            return false;
                        }
                    } else if (f != 49) {
                        if (f == 50 && !this.f12571q.mo15092a(C3569r1.m9439g(t, m9533d(g))).isEmpty()) {
                            this.f12571q.mo15097f(this.f12556b[(i4 / 3) * 2]);
                            throw null;
                        }
                    }
                }
                List list = (List) C3569r1.m9439g(t, m9533d(g));
                if (!list.isEmpty()) {
                    C3498f1 c = mo15207c(i4);
                    int i9 = 0;
                    while (true) {
                        if (i9 >= list.size()) {
                            break;
                        } else if (!c.mo14895a(list.get(i9))) {
                            z = false;
                            break;
                        } else {
                            i9++;
                        }
                    }
                }
                if (!z) {
                    return false;
                }
            }
            i++;
        }
    }

    /* renamed from: a */
    public final void mo15191a(int i, Object obj, C3599u1 u1Var) throws IOException {
        if (obj instanceof String) {
            ((C3548m) u1Var).f12518a.mo15063b(i, (String) obj);
            return;
        }
        ((C3548m) u1Var).f12518a.mo15061b(i, (C3508i) obj);
    }

    /* renamed from: a */
    public final void mo15194a(Object obj, int i, C3493e1 e1Var) throws IOException {
        if ((536870912 & i) != 0) {
            C3569r1.m9426a(obj, m9533d(i), (Object) e1Var.mo14864p());
        } else if (this.f12561g) {
            C3569r1.m9426a(obj, m9533d(i), (Object) e1Var.mo14860n());
        } else {
            C3569r1.m9426a(obj, m9533d(i), (Object) e1Var.mo14827a());
        }
    }

    /* renamed from: a */
    public final <E> void mo15195a(Object obj, int i, C3493e1 e1Var, C3498f1<E> f1Var, C3562q qVar) throws IOException {
        e1Var.mo14837b(this.f12568n.mo14913b(obj, m9533d(i)), f1Var, qVar);
    }

    /* renamed from: a */
    public final <E> void mo15197a(Object obj, long j, C3493e1 e1Var, C3498f1<E> f1Var, C3562q qVar) throws IOException {
        e1Var.mo14831a(this.f12568n.mo14913b(obj, j), f1Var, qVar);
    }

    /* renamed from: a */
    public final <UT, UB> UB mo15190a(Object obj, int i, UB ub, C3550m1<UT, UB> m1Var) {
        C3609z.C3614e a;
        int[] iArr = this.f12555a;
        int i2 = iArr[i];
        Object g = C3569r1.m9439g(obj, m9533d(iArr[i + 1]));
        if (g == null || (a = mo15189a(i)) == null) {
            return ub;
        }
        Map<?, ?> c = this.f12571q.mo15094c(g);
        this.f12571q.mo15097f(this.f12556b[(i / 3) * 2]);
        for (Map.Entry next : c.entrySet()) {
            if (!a.mo15254a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    m1Var.mo15105a();
                }
                next.getKey();
                next.getValue();
                throw null;
            }
        }
        return ub;
    }

    /* renamed from: a */
    public final <K, V> void mo15196a(Object obj, int i, Object obj2, C3562q qVar, C3493e1 e1Var) throws IOException {
        long d = m9533d(this.f12555a[i + 1]);
        Object g = C3569r1.m9439g(obj, d);
        if (g == null) {
            g = this.f12571q.mo15093b(obj2);
            C3569r1.m9426a(obj, d, g);
        } else if (this.f12571q.mo15095d(g)) {
            Object b = this.f12571q.mo15093b(obj2);
            this.f12571q.mo15091a(b, g);
            C3569r1.m9426a(obj, d, b);
            g = b;
        }
        Map<?, ?> c = this.f12571q.mo15094c(g);
        this.f12571q.mo15097f(obj2);
        e1Var.mo14832a(c, (C3534j0.C3535a) null, qVar);
    }

    /* renamed from: a */
    public final void mo15198a(T t, T t2, int i) {
        long d = m9533d(this.f12555a[i + 1]);
        if (mo15199a(t2, i)) {
            Object g = C3569r1.m9439g(t, d);
            Object g2 = C3569r1.m9439g(t2, d);
            if (g != null && g2 != null) {
                C3569r1.m9426a((Object) t, d, C3609z.m9637a(g, g2));
                mo15202b(t, i);
            } else if (g2 != null) {
                C3569r1.m9426a((Object) t, d, g2);
                mo15202b(t, i);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo15199a(T t, int i) {
        int[] iArr = this.f12555a;
        int i2 = iArr[i + 2];
        long j = (long) (1048575 & i2);
        if (j == 1048575) {
            int i3 = iArr[i + 1];
            long d = m9533d(i3);
            switch (m9536f(i3)) {
                case 0:
                    if (C3569r1.f12543e.mo15176c(t, d) != 0.0d) {
                        return true;
                    }
                    return false;
                case 1:
                    if (C3569r1.f12543e.mo15177d(t, d) != BitmapDescriptorFactory.HUE_RED) {
                        return true;
                    }
                    return false;
                case 2:
                    if (C3569r1.m9438f(t, d) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (C3569r1.m9438f(t, d) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (C3569r1.m9437e(t, d) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (C3569r1.m9438f(t, d) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (C3569r1.m9437e(t, d) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return C3569r1.f12543e.mo15173a(t, d);
                case 8:
                    Object g = C3569r1.m9439g(t, d);
                    if (g instanceof String) {
                        return !((String) g).isEmpty();
                    }
                    if (g instanceof C3508i) {
                        return !C3508i.f12443b.equals(g);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (C3569r1.m9439g(t, d) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    return !C3508i.f12443b.equals(C3569r1.m9439g(t, d));
                case 11:
                    if (C3569r1.m9437e(t, d) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (C3569r1.m9437e(t, d) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (C3569r1.m9437e(t, d) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (C3569r1.m9438f(t, d) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (C3569r1.m9437e(t, d) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (C3569r1.m9438f(t, d) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (C3569r1.m9439g(t, d) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            if ((C3569r1.m9437e(t, j) & (1 << (i2 >>> 20))) != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo15200a(T t, int i, int i2) {
        return C3569r1.m9437e(t, (long) (this.f12555a[i2 + 2] & 1048575)) == i;
    }

    /* renamed from: a */
    public static <T> boolean m9529a(T t, long j) {
        return ((Boolean) C3569r1.m9439g(t, j)).booleanValue();
    }

    /* renamed from: a */
    public final int mo15184a(int i, int i2) {
        int length = (this.f12555a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.f12555a[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
