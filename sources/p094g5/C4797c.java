package p094g5;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.appboy.Constants;

/* renamed from: g5.c */
public final class C4797c {

    /* renamed from: a */
    public static final JsonReader.C1901a f16190a = JsonReader.C1901a.m5315a(Constants.APPBOY_PUSH_CONTENT_KEY, Constants.APPBOY_PUSH_PRIORITY_KEY, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY, "rz", "r", "o", "so", "eo", "sk", "sa");

    /* renamed from: b */
    public static final JsonReader.C1901a f16191b = JsonReader.C1901a.m5315a("k");

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0223, code lost:
        if (((java.lang.Float) ((p120i5.C5280a) ((java.util.List) r12.f19694c).get(0)).f17432b).floatValue() == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        r5 = p094g5.C4799d.m12137b(r0, r8, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006a, code lost:
        if (((java.util.List) r5.f19694c).isEmpty() == false) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006c, code lost:
        r16 = java.lang.Float.valueOf(com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED);
        r17 = java.lang.Float.valueOf(com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED);
        r9 = r1;
        r12 = (java.util.List) r5.f19694c;
        r10 = r5;
        r26 = r6;
        r18 = r13;
        r13 = r7;
        r1 = new p120i5.C5280a(r28, r16, r17, (android.view.animation.Interpolator) null, (float) com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED, java.lang.Float.valueOf(r8.f6460l));
        r12.add(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a2, code lost:
        r10 = r5;
        r26 = r6;
        r18 = r13;
        r13 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b5, code lost:
        if (((p120i5.C5280a) ((java.util.List) r10.f19694c).get(0)).f17432b != null) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b7, code lost:
        ((java.util.List) r10.f19694c).set(0, new p120i5.C5280a(r28, java.lang.Float.valueOf(com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED), java.lang.Float.valueOf(com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED), (android.view.animation.Interpolator) null, (float) com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED, java.lang.Float.valueOf(r8.f6460l)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e0, code lost:
        r1 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e1, code lost:
        r6 = r26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0123, code lost:
        r7 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0124, code lost:
        r13 = r18;
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d1, code lost:
        if (r0 != false) goto L_0x01d6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0229  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0231  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01d9  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01fe  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0206  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p037c5.C1791l m12135a(com.airbnb.lottie.parser.moshi.C1902a r27, com.airbnb.lottie.C1867f r28) throws java.io.IOException {
        /*
            r0 = r27
            r8 = r28
            com.airbnb.lottie.parser.moshi.JsonReader$Token r1 = r27.mo6824B()
            com.airbnb.lottie.parser.moshi.JsonReader$Token r2 = com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_OBJECT
            r10 = 0
            if (r1 != r2) goto L_0x000f
            r11 = 1
            goto L_0x0010
        L_0x000f:
            r11 = 0
        L_0x0010:
            if (r11 == 0) goto L_0x0015
            r27.mo6831i()
        L_0x0015:
            r1 = 0
            r6 = 0
            r7 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r21 = 0
            r22 = 0
            r23 = 0
        L_0x0021:
            boolean r2 = r27.mo6835v()
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x0129
            com.airbnb.lottie.parser.moshi.JsonReader$a r2 = f16190a
            int r2 = r0.mo6826H(r2)
            switch(r2) {
                case 0: goto L_0x00fd;
                case 1: goto L_0x00f4;
                case 2: goto L_0x00e4;
                case 3: goto L_0x0059;
                case 4: goto L_0x005e;
                case 5: goto L_0x0054;
                case 6: goto L_0x004f;
                case 7: goto L_0x004a;
                case 8: goto L_0x0045;
                case 9: goto L_0x0040;
                default: goto L_0x0033;
            }
        L_0x0033:
            r26 = r6
            r18 = r13
            r13 = r7
            r27.mo6827K()
            r27.mo6828N()
            goto L_0x0124
        L_0x0040:
            c5.b r13 = p094g5.C4799d.m12137b(r0, r8, r10)
            goto L_0x0021
        L_0x0045:
            c5.b r14 = p094g5.C4799d.m12137b(r0, r8, r10)
            goto L_0x0021
        L_0x004a:
            c5.b r23 = p094g5.C4799d.m12137b(r0, r8, r10)
            goto L_0x0021
        L_0x004f:
            c5.b r22 = p094g5.C4799d.m12137b(r0, r8, r10)
            goto L_0x0021
        L_0x0054:
            c5.d r21 = p094g5.C4799d.m12138c(r27, r28)
            goto L_0x0021
        L_0x0059:
            java.lang.String r1 = "Lottie doesn't support 3D layers."
            r8.mo6755a(r1)
        L_0x005e:
            c5.b r5 = p094g5.C4799d.m12137b(r0, r8, r10)
            java.lang.Object r1 = r5.f19694c
            java.util.List r1 = (java.util.List) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00a2
            java.lang.Object r1 = r5.f19694c
            r4 = r1
            java.util.List r4 = (java.util.List) r4
            i5.a r2 = new i5.a
            java.lang.Float r16 = java.lang.Float.valueOf(r3)
            java.lang.Float r17 = java.lang.Float.valueOf(r3)
            r18 = 0
            r19 = 0
            float r1 = r8.f6460l
            java.lang.Float r20 = java.lang.Float.valueOf(r1)
            r1 = r2
            r3 = r2
            r2 = r28
            r9 = r3
            r3 = r16
            r12 = r4
            r4 = r17
            r10 = r5
            r5 = r18
            r26 = r6
            r6 = r19
            r18 = r13
            r13 = r7
            r7 = r20
            r1.<init>((com.airbnb.lottie.C1867f) r2, r3, r4, (android.view.animation.Interpolator) r5, (float) r6, (java.lang.Float) r7)
            r12.add(r9)
            goto L_0x00df
        L_0x00a2:
            r10 = r5
            r26 = r6
            r18 = r13
            r13 = r7
            java.lang.Object r1 = r10.f19694c
            java.util.List r1 = (java.util.List) r1
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            i5.a r1 = (p120i5.C5280a) r1
            T r1 = r1.f17432b
            if (r1 != 0) goto L_0x00df
            java.lang.Object r1 = r10.f19694c
            r9 = r1
            java.util.List r9 = (java.util.List) r9
            i5.a r12 = new i5.a
            java.lang.Float r4 = java.lang.Float.valueOf(r3)
            java.lang.Float r5 = java.lang.Float.valueOf(r3)
            r6 = 0
            r7 = 0
            float r1 = r8.f6460l
            java.lang.Float r19 = java.lang.Float.valueOf(r1)
            r1 = r12
            r2 = r28
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r19
            r1.<init>((com.airbnb.lottie.C1867f) r2, r3, r4, (android.view.animation.Interpolator) r5, (float) r6, (java.lang.Float) r7)
            r2 = 0
            r9.set(r2, r12)
            goto L_0x00e0
        L_0x00df:
            r2 = 0
        L_0x00e0:
            r1 = r10
        L_0x00e1:
            r6 = r26
            goto L_0x0123
        L_0x00e4:
            r18 = r13
            r2 = 0
            r13 = r7
            c5.g r6 = new c5.g
            g5.d0 r3 = p094g5.C4800d0.f16193a
            java.util.ArrayList r3 = p094g5.C4825u.m12155a(r0, r8, r4, r3, r2)
            r6.<init>(r3)
            goto L_0x0123
        L_0x00f4:
            r26 = r6
            r18 = r13
            c5.m r7 = p094g5.C4793a.m12134b(r27, r28)
            goto L_0x0124
        L_0x00fd:
            r26 = r6
            r18 = r13
            r13 = r7
            r27.mo6831i()
        L_0x0105:
            boolean r2 = r27.mo6835v()
            if (r2 == 0) goto L_0x011f
            com.airbnb.lottie.parser.moshi.JsonReader$a r2 = f16191b
            int r2 = r0.mo6826H(r2)
            if (r2 == 0) goto L_0x011a
            r27.mo6827K()
            r27.mo6828N()
            goto L_0x0105
        L_0x011a:
            c5.e r15 = p094g5.C4793a.m12133a(r27, r28)
            goto L_0x0105
        L_0x011f:
            r27.mo6833r()
            goto L_0x00e1
        L_0x0123:
            r7 = r13
        L_0x0124:
            r13 = r18
            r10 = 0
            goto L_0x0021
        L_0x0129:
            r26 = r6
            r18 = r13
            r13 = r7
            if (r11 == 0) goto L_0x0133
            r27.mo6833r()
        L_0x0133:
            if (r15 == 0) goto L_0x0151
            boolean r0 = r15.mo6603e()
            if (r0 == 0) goto L_0x014f
            java.util.List r0 = r15.f6255b
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            i5.a r0 = (p120i5.C5280a) r0
            T r0 = r0.f17432b
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            boolean r0 = r0.equals(r3, r3)
            if (r0 == 0) goto L_0x014f
            goto L_0x0151
        L_0x014f:
            r0 = 0
            goto L_0x0152
        L_0x0151:
            r0 = 1
        L_0x0152:
            if (r0 == 0) goto L_0x0155
            r15 = 0
        L_0x0155:
            if (r13 == 0) goto L_0x0179
            boolean r0 = r13 instanceof p037c5.C1788i
            if (r0 != 0) goto L_0x0177
            boolean r0 = r13.mo6603e()
            if (r0 == 0) goto L_0x0177
            java.util.List r0 = r13.mo6604j()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            i5.a r0 = (p120i5.C5280a) r0
            T r0 = r0.f17432b
            android.graphics.PointF r0 = (android.graphics.PointF) r0
            boolean r0 = r0.equals(r3, r3)
            if (r0 == 0) goto L_0x0177
            goto L_0x0179
        L_0x0177:
            r0 = 0
            goto L_0x017a
        L_0x0179:
            r0 = 1
        L_0x017a:
            if (r0 == 0) goto L_0x017d
            r13 = 0
        L_0x017d:
            if (r1 == 0) goto L_0x019f
            boolean r0 = r1.mo6603e()
            if (r0 == 0) goto L_0x019d
            java.lang.Object r0 = r1.f19694c
            java.util.List r0 = (java.util.List) r0
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            i5.a r0 = (p120i5.C5280a) r0
            T r0 = r0.f17432b
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x019d
            goto L_0x019f
        L_0x019d:
            r0 = 0
            goto L_0x01a0
        L_0x019f:
            r0 = 1
        L_0x01a0:
            if (r0 == 0) goto L_0x01a7
            r6 = r26
            r20 = 0
            goto L_0x01ab
        L_0x01a7:
            r20 = r1
            r6 = r26
        L_0x01ab:
            if (r6 == 0) goto L_0x01d6
            boolean r0 = r6.mo6603e()
            if (r0 == 0) goto L_0x01d4
            java.lang.Object r0 = r6.f19694c
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            i5.a r0 = (p120i5.C5280a) r0
            T r0 = r0.f17432b
            i5.d r0 = (p120i5.C5283d) r0
            float r1 = r0.f17452a
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto L_0x01d0
            float r0 = r0.f17453b
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x01d0
            r0 = 1
            goto L_0x01d1
        L_0x01d0:
            r0 = 0
        L_0x01d1:
            if (r0 == 0) goto L_0x01d4
            goto L_0x01d6
        L_0x01d4:
            r0 = 0
            goto L_0x01d7
        L_0x01d6:
            r0 = 1
        L_0x01d7:
            if (r0 == 0) goto L_0x01dc
            r19 = 0
            goto L_0x01de
        L_0x01dc:
            r19 = r6
        L_0x01de:
            if (r14 == 0) goto L_0x0200
            boolean r0 = r14.mo6603e()
            if (r0 == 0) goto L_0x01fe
            java.lang.Object r0 = r14.f19694c
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            i5.a r0 = (p120i5.C5280a) r0
            T r0 = r0.f17432b
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x01fe
            goto L_0x0200
        L_0x01fe:
            r2 = 0
            goto L_0x0201
        L_0x0200:
            r2 = 1
        L_0x0201:
            if (r2 == 0) goto L_0x0204
            r14 = 0
        L_0x0204:
            if (r18 == 0) goto L_0x0229
            boolean r0 = r18.mo6603e()
            r12 = r18
            if (r0 == 0) goto L_0x0226
            java.lang.Object r0 = r12.f19694c
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            i5.a r0 = (p120i5.C5280a) r0
            T r0 = r0.f17432b
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0227
            goto L_0x022b
        L_0x0226:
            r1 = 0
        L_0x0227:
            r9 = 0
            goto L_0x022c
        L_0x0229:
            r12 = r18
        L_0x022b:
            r9 = 1
        L_0x022c:
            if (r9 == 0) goto L_0x0231
            r25 = 0
            goto L_0x0233
        L_0x0231:
            r25 = r12
        L_0x0233:
            c5.l r0 = new c5.l
            r16 = r0
            r17 = r15
            r18 = r13
            r24 = r14
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p094g5.C4797c.m12135a(com.airbnb.lottie.parser.moshi.a, com.airbnb.lottie.f):c5.l");
    }
}
