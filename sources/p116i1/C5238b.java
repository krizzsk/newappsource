package p116i1;

import android.util.TypedValue;

/* renamed from: i1.b */
public final class C5238b {

    /* renamed from: a */
    public static final ThreadLocal<TypedValue> f17348a = new ThreadLocal<>();

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0016  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m13254a(android.content.res.Resources r4, android.content.res.XmlResourceParser r5, android.content.res.Resources.Theme r6) throws org.xmlpull.p982v1.XmlPullParserException, java.io.IOException {
        /*
            android.util.AttributeSet r0 = android.util.Xml.asAttributeSet(r5)
        L_0x0004:
            int r1 = r5.next()
            r2 = 2
            if (r1 == r2) goto L_0x000f
            r3 = 1
            if (r1 == r3) goto L_0x000f
            goto L_0x0004
        L_0x000f:
            if (r1 != r2) goto L_0x0016
            android.content.res.ColorStateList r4 = m13255b(r4, r5, r0, r6)
            return r4
        L_0x0016:
            org.xmlpull.v1.XmlPullParserException r4 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r5 = "No start tag found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p116i1.C5238b.m13254a(android.content.res.Resources, android.content.res.XmlResourceParser, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }

    /* JADX WARNING: type inference failed for: r1v13, types: [java.lang.Object[], java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0122 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x013f  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList m13255b(android.content.res.Resources r36, android.content.res.XmlResourceParser r37, android.util.AttributeSet r38, android.content.res.Resources.Theme r39) throws org.xmlpull.p982v1.XmlPullParserException, java.io.IOException {
        /*
            r0 = r36
            r1 = r38
            r2 = r39
            java.lang.String r3 = r37.getName()
            java.lang.String r4 = "selector"
            boolean r4 = r3.equals(r4)
            if (r4 == 0) goto L_0x035c
            int r3 = r37.getDepth()
            r4 = 1
            int r3 = r3 + r4
            r5 = 20
            int[][] r6 = new int[r5][]
            int[] r5 = new int[r5]
            r7 = 0
            r8 = 0
        L_0x0020:
            int r9 = r37.next()
            if (r9 == r4) goto L_0x034b
            int r10 = r37.getDepth()
            if (r10 >= r3) goto L_0x002f
            r11 = 3
            if (r9 == r11) goto L_0x034b
        L_0x002f:
            r11 = 2
            if (r9 != r11) goto L_0x033b
            if (r10 > r3) goto L_0x033b
            java.lang.String r9 = r37.getName()
            java.lang.String r10 = "item"
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0042
            goto L_0x033b
        L_0x0042:
            int[] r9 = p055d1.C4333i.ColorStateListItem
            if (r2 != 0) goto L_0x004b
            android.content.res.TypedArray r9 = r0.obtainAttributes(r1, r9)
            goto L_0x004f
        L_0x004b:
            android.content.res.TypedArray r9 = r2.obtainStyledAttributes(r1, r9, r7, r7)
        L_0x004f:
            int r10 = p055d1.C4333i.ColorStateListItem_android_color
            r12 = -1
            int r13 = r9.getResourceId(r10, r12)
            r14 = 31
            r15 = -65281(0xffffffffffff00ff, float:NaN)
            if (r13 == r12) goto L_0x0096
            java.lang.ThreadLocal<android.util.TypedValue> r12 = f17348a
            java.lang.Object r16 = r12.get()
            android.util.TypedValue r16 = (android.util.TypedValue) r16
            if (r16 != 0) goto L_0x0070
            android.util.TypedValue r11 = new android.util.TypedValue
            r11.<init>()
            r12.set(r11)
            goto L_0x0072
        L_0x0070:
            r11 = r16
        L_0x0072:
            r0.getValue(r13, r11, r4)
            int r11 = r11.type
            r12 = 28
            if (r11 < r12) goto L_0x007f
            if (r11 > r14) goto L_0x007f
            r11 = 1
            goto L_0x0080
        L_0x007f:
            r11 = 0
        L_0x0080:
            if (r11 != 0) goto L_0x0096
            android.content.res.XmlResourceParser r10 = r0.getXml(r13)     // Catch:{ Exception -> 0x008f }
            android.content.res.ColorStateList r10 = m13254a(r0, r10, r2)     // Catch:{ Exception -> 0x008f }
            int r10 = r10.getDefaultColor()     // Catch:{ Exception -> 0x008f }
            goto L_0x009a
        L_0x008f:
            int r10 = p055d1.C4333i.ColorStateListItem_android_color
            int r10 = r9.getColor(r10, r15)
            goto L_0x009a
        L_0x0096:
            int r10 = r9.getColor(r10, r15)
        L_0x009a:
            int r11 = p055d1.C4333i.ColorStateListItem_android_alpha
            boolean r12 = r9.hasValue(r11)
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r12 == 0) goto L_0x00a9
            float r11 = r9.getFloat(r11, r13)
            goto L_0x00b8
        L_0x00a9:
            int r11 = p055d1.C4333i.ColorStateListItem_alpha
            boolean r12 = r9.hasValue(r11)
            if (r12 == 0) goto L_0x00b6
            float r11 = r9.getFloat(r11, r13)
            goto L_0x00b8
        L_0x00b6:
            r11 = 1065353216(0x3f800000, float:1.0)
        L_0x00b8:
            int r12 = android.os.Build.VERSION.SDK_INT
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r12 < r14) goto L_0x00cb
            int r12 = p055d1.C4333i.ColorStateListItem_android_lStar
            boolean r14 = r9.hasValue(r12)
            if (r14 == 0) goto L_0x00cb
            float r12 = r9.getFloat(r12, r15)
            goto L_0x00d1
        L_0x00cb:
            int r12 = p055d1.C4333i.ColorStateListItem_lStar
            float r12 = r9.getFloat(r12, r15)
        L_0x00d1:
            r9.recycle()
            int r9 = r38.getAttributeCount()
            int[] r14 = new int[r9]
            r4 = 0
            r15 = 0
        L_0x00dc:
            if (r15 >= r9) goto L_0x010a
            int r13 = r1.getAttributeNameResource(r15)
            r7 = 16843173(0x10101a5, float:2.3694738E-38)
            if (r13 == r7) goto L_0x0102
            r7 = 16843551(0x101031f, float:2.3695797E-38)
            if (r13 == r7) goto L_0x0102
            int r7 = p055d1.C4325a.alpha
            if (r13 == r7) goto L_0x0102
            int r7 = p055d1.C4325a.lStar
            if (r13 == r7) goto L_0x0102
            int r7 = r4 + 1
            r0 = 0
            boolean r19 = r1.getAttributeBooleanValue(r15, r0)
            if (r19 == 0) goto L_0x00fe
            goto L_0x00ff
        L_0x00fe:
            int r13 = -r13
        L_0x00ff:
            r14[r4] = r13
            r4 = r7
        L_0x0102:
            int r15 = r15 + 1
            r0 = r36
            r7 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00dc
        L_0x010a:
            int[] r0 = android.util.StateSet.trimStateSet(r14, r4)
            r4 = 1120403456(0x42c80000, float:100.0)
            r7 = 0
            int r9 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r9 < 0) goto L_0x011b
            int r9 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r9 > 0) goto L_0x011b
            r9 = 1
            goto L_0x011c
        L_0x011b:
            r9 = 0
        L_0x011c:
            r13 = 1065353216(0x3f800000, float:1.0)
            int r14 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r14 != 0) goto L_0x012b
            if (r9 != 0) goto L_0x012b
            r7 = r0
            r30 = r3
            r16 = 1
            goto L_0x02f7
        L_0x012b:
            int r13 = android.graphics.Color.alpha(r10)
            float r13 = (float) r13
            float r13 = r13 * r11
            r11 = 1056964608(0x3f000000, float:0.5)
            float r13 = r13 + r11
            int r11 = (int) r13
            r13 = 255(0xff, float:3.57E-43)
            r14 = 0
            int r11 = ce0.C21100e.m49377z(r11, r14, r13)
            if (r9 == 0) goto L_0x02ea
            i1.a r9 = p116i1.C5237a.m13250a(r10)
            float r10 = r9.f17339a
            float r9 = r9.f17340b
            i1.k r13 = p116i1.C5257k.f17379k
            double r14 = (double) r9
            r19 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r21 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r21 < 0) goto L_0x02e0
            int r14 = java.lang.Math.round(r12)
            double r14 = (double) r14
            r19 = 0
            int r21 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r21 <= 0) goto L_0x02e0
            int r14 = java.lang.Math.round(r12)
            double r14 = (double) r14
            r19 = 4636737291354636288(0x4059000000000000, double:100.0)
            int r21 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r21 < 0) goto L_0x0168
            goto L_0x02e0
        L_0x0168:
            int r14 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r14 >= 0) goto L_0x016e
            r10 = 0
            goto L_0x0174
        L_0x016e:
            r14 = 1135869952(0x43b40000, float:360.0)
            float r10 = java.lang.Math.min(r14, r10)
        L_0x0174:
            r15 = r9
            r14 = 0
            r19 = 1
            r20 = 0
        L_0x017a:
            float r22 = r20 - r9
            float r22 = java.lang.Math.abs(r22)
            r23 = 1053609165(0x3ecccccd, float:0.4)
            int r22 = (r22 > r23 ? 1 : (r22 == r23 ? 0 : -1))
            if (r22 < 0) goto L_0x02cf
            r22 = 1148846080(0x447a0000, float:1000.0)
            r23 = 1148846080(0x447a0000, float:1000.0)
            r24 = 0
            r25 = 1120403456(0x42c80000, float:100.0)
            r26 = 0
        L_0x0191:
            float r27 = r24 - r25
            float r27 = java.lang.Math.abs(r27)
            r28 = 1008981770(0x3c23d70a, float:0.01)
            r29 = 1073741824(0x40000000, float:2.0)
            int r27 = (r27 > r28 ? 1 : (r27 == r28 ? 0 : -1))
            if (r27 <= 0) goto L_0x0287
            float r27 = r25 - r24
            float r27 = r27 / r29
            float r7 = r27 + r24
            i1.a r4 = p116i1.C5237a.m13251b(r7, r15, r10)
            i1.k r1 = p116i1.C5257k.f17379k
            int r1 = r4.mo21008d(r1)
            int r4 = android.graphics.Color.red(r1)
            float r4 = mf0.C24361g.m61158b0(r4)
            int r30 = android.graphics.Color.green(r1)
            float r30 = mf0.C24361g.m61158b0(r30)
            int r31 = android.graphics.Color.blue(r1)
            float r31 = mf0.C24361g.m61158b0(r31)
            float[][] r32 = mf0.C24361g.f61682k
            r16 = 1
            r32 = r32[r16]
            r18 = 0
            r33 = r32[r18]
            float r4 = r4 * r33
            r33 = r32[r16]
            float r30 = r30 * r33
            float r30 = r30 + r4
            r4 = 2
            r17 = r32[r4]
            float r31 = r31 * r17
            float r31 = r31 + r30
            r17 = 1120403456(0x42c80000, float:100.0)
            float r4 = r31 / r17
            r30 = 1007753895(0x3c111aa7, float:0.008856452)
            int r30 = (r4 > r30 ? 1 : (r4 == r30 ? 0 : -1))
            if (r30 > 0) goto L_0x01f4
            r30 = 1147261687(0x4461d2f7, float:903.2963)
            float r4 = r4 * r30
            r30 = r3
            goto L_0x0204
        L_0x01f4:
            r30 = r3
            double r2 = (double) r4
            double r2 = java.lang.Math.cbrt(r2)
            float r2 = (float) r2
            r3 = 1122500608(0x42e80000, float:116.0)
            float r2 = r2 * r3
            r3 = 1098907648(0x41800000, float:16.0)
            float r4 = r2 - r3
        L_0x0204:
            float r2 = r12 - r4
            float r2 = java.lang.Math.abs(r2)
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x025f
            i1.a r1 = p116i1.C5237a.m13250a(r1)
            float r3 = r1.f17341c
            r31 = r2
            float r2 = r1.f17340b
            i1.a r2 = p116i1.C5237a.m13251b(r3, r2, r10)
            float r3 = r1.f17345g
            r32 = r7
            float r7 = r2.f17345g
            float r3 = r3 - r7
            float r7 = r1.f17346h
            r33 = r10
            float r10 = r2.f17346h
            float r7 = r7 - r10
            float r10 = r1.f17347i
            float r2 = r2.f17347i
            float r10 = r10 - r2
            float r3 = r3 * r3
            float r7 = r7 * r7
            float r7 = r7 + r3
            float r10 = r10 * r10
            float r10 = r10 + r7
            double r2 = (double) r10
            double r2 = java.lang.Math.sqrt(r2)
            r34 = 4609028894647239311(0x3ff68f5c28f5c28f, double:1.41)
            r7 = r0
            r10 = r1
            r0 = 4603849755075763241(0x3fe428f5c28f5c29, double:0.63)
            double r0 = java.lang.Math.pow(r2, r0)
            double r0 = r0 * r34
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 > 0) goto L_0x0266
            r23 = r0
            r26 = r10
            r22 = r31
            goto L_0x0266
        L_0x025f:
            r32 = r7
            r33 = r10
            r1 = 1065353216(0x3f800000, float:1.0)
            r7 = r0
        L_0x0266:
            r0 = 0
            int r2 = (r22 > r0 ? 1 : (r22 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0270
            int r2 = (r23 > r0 ? 1 : (r23 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x0270
            goto L_0x0293
        L_0x0270:
            int r2 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r2 >= 0) goto L_0x0277
            r24 = r32
            goto L_0x0279
        L_0x0277:
            r25 = r32
        L_0x0279:
            r1 = r38
            r2 = r39
            r0 = r7
            r3 = r30
            r10 = r33
            r4 = 1120403456(0x42c80000, float:100.0)
            r7 = 0
            goto L_0x0191
        L_0x0287:
            r7 = r0
            r30 = r3
            r33 = r10
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            r16 = 1
            r17 = 1120403456(0x42c80000, float:100.0)
        L_0x0293:
            r2 = r26
            if (r19 == 0) goto L_0x02b4
            if (r2 == 0) goto L_0x029e
            int r10 = r2.mo21008d(r13)
            goto L_0x02ef
        L_0x029e:
            float r2 = r9 - r20
            float r2 = r2 / r29
            float r15 = r2 + r20
            r1 = r38
            r2 = r39
            r0 = r7
            r3 = r30
            r10 = r33
            r4 = 1120403456(0x42c80000, float:100.0)
            r7 = 0
            r19 = 0
            goto L_0x017a
        L_0x02b4:
            if (r2 != 0) goto L_0x02b8
            r9 = r15
            goto L_0x02bb
        L_0x02b8:
            r14 = r2
            r20 = r15
        L_0x02bb:
            float r2 = r9 - r20
            float r2 = r2 / r29
            float r15 = r2 + r20
            r1 = r38
            r2 = r39
            r0 = r7
            r3 = r30
            r10 = r33
            r4 = 1120403456(0x42c80000, float:100.0)
            r7 = 0
            goto L_0x017a
        L_0x02cf:
            r7 = r0
            r30 = r3
            r16 = 1
            if (r14 != 0) goto L_0x02db
            int r10 = mf0.C24361g.m61149S(r12)
            goto L_0x02ef
        L_0x02db:
            int r10 = r14.mo21008d(r13)
            goto L_0x02ef
        L_0x02e0:
            r7 = r0
            r30 = r3
            r16 = 1
            int r10 = mf0.C24361g.m61149S(r12)
            goto L_0x02ef
        L_0x02ea:
            r7 = r0
            r30 = r3
            r16 = 1
        L_0x02ef:
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            r0 = r0 & r10
            int r1 = r11 << 24
            r10 = r0 | r1
        L_0x02f7:
            int r0 = r8 + 1
            int r1 = r5.length
            r2 = 8
            r3 = 4
            if (r0 <= r1) goto L_0x030d
            if (r8 > r3) goto L_0x0304
            r1 = 8
            goto L_0x0306
        L_0x0304:
            int r1 = r8 * 2
        L_0x0306:
            int[] r1 = new int[r1]
            r4 = 0
            java.lang.System.arraycopy(r5, r4, r1, r4, r8)
            r5 = r1
        L_0x030d:
            r5[r8] = r10
            int r1 = r6.length
            if (r0 <= r1) goto L_0x032a
            java.lang.Class r1 = r6.getClass()
            java.lang.Class r1 = r1.getComponentType()
            if (r8 > r3) goto L_0x031d
            goto L_0x031f
        L_0x031d:
            int r2 = r8 * 2
        L_0x031f:
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r1, r2)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r2 = 0
            java.lang.System.arraycopy(r6, r2, r1, r2, r8)
            r6 = r1
        L_0x032a:
            r6[r8] = r7
            int[][] r6 = (int[][]) r6
            r1 = r38
            r2 = r39
            r8 = r0
            r3 = r30
            r4 = 1
            r7 = 0
            r0 = r36
            goto L_0x0020
        L_0x033b:
            r30 = r3
            r16 = 1
            r0 = r36
            r1 = r38
            r2 = r39
            r3 = r30
            r4 = 1
            r7 = 0
            goto L_0x0020
        L_0x034b:
            int[] r0 = new int[r8]
            int[][] r1 = new int[r8][]
            r2 = 0
            java.lang.System.arraycopy(r5, r2, r0, r2, r8)
            java.lang.System.arraycopy(r6, r2, r1, r2, r8)
            android.content.res.ColorStateList r2 = new android.content.res.ColorStateList
            r2.<init>(r1, r0)
            return r2
        L_0x035c:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r37.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid color state list tag "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p116i1.C5238b.m13255b(android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):android.content.res.ColorStateList");
    }
}
