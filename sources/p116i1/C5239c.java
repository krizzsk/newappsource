package p116i1;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* renamed from: i1.c */
public final class C5239c {

    /* renamed from: a */
    public final Shader f17349a;

    /* renamed from: b */
    public final ColorStateList f17350b;

    /* renamed from: c */
    public int f17351c;

    public C5239c(Shader shader, ColorStateList colorStateList, int i) {
        this.f17349a = shader;
        this.f17350b = colorStateList;
        this.f17351c = i;
    }

    /* JADX WARNING: type inference failed for: r4v7, types: [android.graphics.Shader] */
    /* JADX WARNING: type inference failed for: r16v2, types: [android.graphics.RadialGradient] */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r11v10, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0184, code lost:
        throw new org.xmlpull.p982v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p116i1.C5239c m13256a(android.content.res.Resources r28, int r29, android.content.res.Resources.Theme r30) throws java.io.IOException, org.xmlpull.p982v1.XmlPullParserException {
        /*
            r0 = r28
            r1 = r30
            android.content.res.XmlResourceParser r2 = r28.getXml(r29)
            android.util.AttributeSet r3 = android.util.Xml.asAttributeSet(r2)
        L_0x000c:
            int r4 = r2.next()
            r5 = 2
            r6 = 1
            if (r4 == r5) goto L_0x0017
            if (r4 == r6) goto L_0x0017
            goto L_0x000c
        L_0x0017:
            if (r4 != r5) goto L_0x023e
            java.lang.String r4 = r2.getName()
            r4.getClass()
            java.lang.String r7 = "gradient"
            boolean r8 = r4.equals(r7)
            r9 = 0
            if (r8 != 0) goto L_0x005d
            java.lang.String r5 = "selector"
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x003f
            android.content.res.ColorStateList r0 = p116i1.C5238b.m13255b(r0, r2, r3, r1)
            i1.c r1 = new i1.c
            int r2 = r0.getDefaultColor()
            r1.<init>(r9, r0, r2)
            return r1
        L_0x003f:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": unsupported complex color tag "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x005d:
            java.lang.String r4 = r2.getName()
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L_0x0220
            int[] r4 = p055d1.C4333i.GradientColor
            android.content.res.TypedArray r4 = p116i1.C5256j.m13278f(r0, r1, r3, r4)
            int r7 = p055d1.C4333i.GradientColor_android_startX
            java.lang.String r8 = "startX"
            r10 = 0
            float r12 = p116i1.C5256j.m13274b(r4, r2, r8, r7, r10)
            int r7 = p055d1.C4333i.GradientColor_android_startY
            java.lang.String r8 = "startY"
            float r13 = p116i1.C5256j.m13274b(r4, r2, r8, r7, r10)
            int r7 = p055d1.C4333i.GradientColor_android_endX
            java.lang.String r8 = "endX"
            float r14 = p116i1.C5256j.m13274b(r4, r2, r8, r7, r10)
            int r7 = p055d1.C4333i.GradientColor_android_endY
            java.lang.String r8 = "endY"
            float r15 = p116i1.C5256j.m13274b(r4, r2, r8, r7, r10)
            int r7 = p055d1.C4333i.GradientColor_android_centerX
            java.lang.String r8 = "centerX"
            float r7 = p116i1.C5256j.m13274b(r4, r2, r8, r7, r10)
            int r8 = p055d1.C4333i.GradientColor_android_centerY
            java.lang.String r11 = "centerY"
            float r8 = p116i1.C5256j.m13274b(r4, r2, r11, r8, r10)
            int r11 = p055d1.C4333i.GradientColor_android_type
            java.lang.String r9 = "type"
            r5 = 0
            int r9 = p116i1.C5256j.m13275c(r4, r2, r9, r11, r5)
            int r11 = p055d1.C4333i.GradientColor_android_startColor
            java.lang.String r6 = "startColor"
            boolean r6 = p116i1.C5256j.m13277e(r2, r6)
            if (r6 != 0) goto L_0x00b4
            r6 = 0
            goto L_0x00b8
        L_0x00b4:
            int r6 = r4.getColor(r11, r5)
        L_0x00b8:
            java.lang.String r11 = "centerColor"
            boolean r18 = p116i1.C5256j.m13277e(r2, r11)
            int r10 = p055d1.C4333i.GradientColor_android_centerColor
            boolean r11 = p116i1.C5256j.m13277e(r2, r11)
            if (r11 != 0) goto L_0x00c8
            r10 = 0
            goto L_0x00cc
        L_0x00c8:
            int r10 = r4.getColor(r10, r5)
        L_0x00cc:
            int r11 = p055d1.C4333i.GradientColor_android_endColor
            java.lang.String r5 = "endColor"
            boolean r5 = p116i1.C5256j.m13277e(r2, r5)
            if (r5 != 0) goto L_0x00d9
            r5 = 0
            r11 = 0
            goto L_0x00e0
        L_0x00d9:
            r5 = 0
            int r23 = r4.getColor(r11, r5)
            r11 = r23
        L_0x00e0:
            int r0 = p055d1.C4333i.GradientColor_android_tileMode
            r20 = r7
            java.lang.String r7 = "tileMode"
            int r0 = p116i1.C5256j.m13275c(r4, r2, r7, r0, r5)
            int r5 = p055d1.C4333i.GradientColor_android_gradientRadius
            java.lang.String r7 = "gradientRadius"
            r21 = r8
            r8 = 0
            float r5 = p116i1.C5256j.m13274b(r4, r2, r7, r5, r8)
            r4.recycle()
            int r4 = r2.getDepth()
            r7 = 1
            int r4 = r4 + r7
            java.util.ArrayList r8 = new java.util.ArrayList
            r7 = 20
            r8.<init>(r7)
            r22 = r5
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r7)
            r7 = r28
            r24 = r15
        L_0x0111:
            int r15 = r2.next()
            r25 = r14
            r14 = 1
            if (r15 == r14) goto L_0x018c
            int r14 = r2.getDepth()
            r26 = r13
            if (r14 >= r4) goto L_0x0125
            r13 = 3
            if (r15 == r13) goto L_0x018e
        L_0x0125:
            r13 = 2
            if (r15 == r13) goto L_0x0129
            goto L_0x0187
        L_0x0129:
            if (r14 > r4) goto L_0x0185
            java.lang.String r13 = r2.getName()
            java.lang.String r14 = "item"
            boolean r13 = r13.equals(r14)
            if (r13 != 0) goto L_0x0138
            goto L_0x0187
        L_0x0138:
            int[] r13 = p055d1.C4333i.GradientColorItem
            android.content.res.TypedArray r7 = p116i1.C5256j.m13278f(r7, r1, r3, r13)
            int r13 = p055d1.C4333i.GradientColorItem_android_color
            boolean r14 = r7.hasValue(r13)
            int r15 = p055d1.C4333i.GradientColorItem_android_offset
            boolean r27 = r7.hasValue(r15)
            if (r14 == 0) goto L_0x016a
            if (r27 == 0) goto L_0x016a
            r14 = 0
            int r13 = r7.getColor(r13, r14)
            r14 = 0
            float r15 = r7.getFloat(r15, r14)
            r7.recycle()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
            r5.add(r7)
            java.lang.Float r7 = java.lang.Float.valueOf(r15)
            r8.add(r7)
            goto L_0x0185
        L_0x016a:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0185:
            r7 = r28
        L_0x0187:
            r14 = r25
            r13 = r26
            goto L_0x0111
        L_0x018c:
            r26 = r13
        L_0x018e:
            int r1 = r5.size()
            if (r1 <= 0) goto L_0x019a
            i1.e r1 = new i1.e
            r1.<init>((java.util.ArrayList) r5, (java.util.ArrayList) r8)
            goto L_0x019b
        L_0x019a:
            r1 = 0
        L_0x019b:
            if (r1 == 0) goto L_0x019e
            goto L_0x01ab
        L_0x019e:
            if (r18 == 0) goto L_0x01a6
            i1.e r1 = new i1.e
            r1.<init>(r6, r10, r11)
            goto L_0x01ab
        L_0x01a6:
            i1.e r1 = new i1.e
            r1.<init>((int) r6, (int) r11)
        L_0x01ab:
            r2 = 1
            if (r9 == r2) goto L_0x01e2
            r3 = 2
            if (r9 == r3) goto L_0x01d4
            android.graphics.LinearGradient r4 = new android.graphics.LinearGradient
            int[] r5 = r1.f17363a
            float[] r1 = r1.f17364b
            if (r0 == r2) goto L_0x01c1
            if (r0 == r3) goto L_0x01be
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.CLAMP
            goto L_0x01c3
        L_0x01be:
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x01c3
        L_0x01c1:
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.REPEAT
        L_0x01c3:
            r18 = r0
            r11 = r4
            r13 = r26
            r14 = r25
            r15 = r24
            r16 = r5
            r17 = r1
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0210
        L_0x01d4:
            android.graphics.SweepGradient r4 = new android.graphics.SweepGradient
            int[] r0 = r1.f17363a
            float[] r1 = r1.f17364b
            r2 = r20
            r3 = r21
            r4.<init>(r2, r3, r0, r1)
            goto L_0x0210
        L_0x01e2:
            r2 = r20
            r3 = r21
            r4 = 0
            int r4 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0218
            android.graphics.RadialGradient r4 = new android.graphics.RadialGradient
            int[] r5 = r1.f17363a
            float[] r1 = r1.f17364b
            r6 = 1
            if (r0 == r6) goto L_0x01fd
            r6 = 2
            if (r0 == r6) goto L_0x01fa
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.CLAMP
            goto L_0x01ff
        L_0x01fa:
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.MIRROR
            goto L_0x01ff
        L_0x01fd:
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.REPEAT
        L_0x01ff:
            r16 = r4
            r17 = r2
            r18 = r3
            r19 = r22
            r20 = r5
            r21 = r1
            r22 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22)
        L_0x0210:
            i1.c r0 = new i1.c
            r1 = 0
            r2 = 0
            r0.<init>(r4, r1, r2)
            return r0
        L_0x0218:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "<gradient> tag requires 'gradientRadius' attribute with radial type"
            r0.<init>(r1)
            throw r0
        L_0x0220:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r2.getPositionDescription()
            r1.append(r2)
            java.lang.String r2 = ": invalid gradient color tag "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x023e:
            org.xmlpull.v1.XmlPullParserException r0 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r1 = "No start tag found"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p116i1.C5239c.m13256a(android.content.res.Resources, int, android.content.res.Resources$Theme):i1.c");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f17350b;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo21009b() {
        /*
            r1 = this;
            android.graphics.Shader r0 = r1.f17349a
            if (r0 != 0) goto L_0x0010
            android.content.res.ColorStateList r0 = r1.f17350b
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p116i1.C5239c.mo21009b():boolean");
    }
}
