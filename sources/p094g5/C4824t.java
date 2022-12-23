package p094g5;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.appboy.Constants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import p107h5.C5058f;
import p107h5.C5059g;
import p241s0.C6314i;
import p268u1.C6676a;

/* renamed from: g5.t */
public final class C4824t {

    /* renamed from: a */
    public static final LinearInterpolator f16234a = new LinearInterpolator();

    /* renamed from: b */
    public static C6314i<WeakReference<Interpolator>> f16235b;

    /* renamed from: c */
    public static JsonReader.C1901a f16236c = JsonReader.C1901a.m5315a(Constants.APPBOY_PUSH_TITLE_KEY, Constants.APPBOY_PUSH_SUMMARY_TEXT_KEY, "e", "o", "i", "h", "to", "ti");

    /* renamed from: d */
    public static JsonReader.C1901a f16237d = JsonReader.C1901a.m5315a("x", "y");

    /* renamed from: a */
    public static Interpolator m12153a(PointF pointF, PointF pointF2) {
        int i;
        Interpolator interpolator;
        WeakReference weakReference;
        Interpolator interpolator2;
        Class<C4824t> cls = C4824t.class;
        pointF.x = C5058f.m12905b(pointF.x, -1.0f, 1.0f);
        pointF.y = C5058f.m12905b(pointF.y, -100.0f, 100.0f);
        pointF2.x = C5058f.m12905b(pointF2.x, -1.0f, 1.0f);
        float b = C5058f.m12905b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = b;
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = pointF2.x;
        C5059g.C5060a aVar = C5059g.f17057a;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            i = (int) (((float) 527) * f);
        } else {
            i = 17;
        }
        if (f2 != BitmapDescriptorFactory.HUE_RED) {
            i = (int) (((float) (i * 31)) * f2);
        }
        if (f3 != BitmapDescriptorFactory.HUE_RED) {
            i = (int) (((float) (i * 31)) * f3);
        }
        if (b != BitmapDescriptorFactory.HUE_RED) {
            i = (int) (((float) (i * 31)) * b);
        }
        synchronized (cls) {
            if (f16235b == null) {
                f16235b = new C6314i<>();
            }
            interpolator = null;
            weakReference = (WeakReference) f16235b.mo22434g(i, (Integer) null);
        }
        if (weakReference != null) {
            interpolator = (Interpolator) weakReference.get();
        }
        if (weakReference == null || interpolator == null) {
            try {
                interpolator2 = C6676a.m15756b(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e) {
                if ("The Path cannot loop back on itself.".equals(e.getMessage())) {
                    interpolator2 = C6676a.m15756b(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, BitmapDescriptorFactory.HUE_RED), pointF2.y);
                } else {
                    interpolator2 = new LinearInterpolator();
                }
            }
            interpolator = interpolator2;
            try {
                WeakReference weakReference2 = new WeakReference(interpolator);
                synchronized (cls) {
                    f16235b.mo22435h(i, weakReference2);
                }
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x017c, code lost:
        r14 = r24;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> p120i5.C5280a<T> m12154b(com.airbnb.lottie.parser.moshi.JsonReader r19, com.airbnb.lottie.C1867f r20, float r21, p094g5.C4814k0<T> r22, boolean r23, boolean r24) throws java.io.IOException {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r4 = 1
            if (r23 == 0) goto L_0x020b
            if (r24 == 0) goto L_0x020b
            r19.mo6831i()
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x001b:
            boolean r17 = r19.mo6835v()
            if (r17 == 0) goto L_0x01af
            com.airbnb.lottie.parser.moshi.JsonReader$a r6 = f16236c
            int r6 = r0.mo6826H(r6)
            switch(r6) {
                case 0: goto L_0x019f;
                case 1: goto L_0x0194;
                case 2: goto L_0x0187;
                case 3: goto L_0x00f3;
                case 4: goto L_0x0049;
                case 5: goto L_0x003f;
                case 6: goto L_0x003a;
                case 7: goto L_0x0035;
                default: goto L_0x002a;
            }
        L_0x002a:
            r18 = r7
            r24 = r14
            r23 = r15
            r19.mo6828N()
            goto L_0x01a8
        L_0x0035:
            android.graphics.PointF r7 = p094g5.C4822s.m12150b(r0, r1)
            goto L_0x001b
        L_0x003a:
            android.graphics.PointF r15 = p094g5.C4822s.m12150b(r0, r1)
            goto L_0x001b
        L_0x003f:
            int r6 = r19.mo6838z()
            if (r6 != r4) goto L_0x0047
            r8 = 1
            goto L_0x001b
        L_0x0047:
            r8 = 0
            goto L_0x001b
        L_0x0049:
            com.airbnb.lottie.parser.moshi.JsonReader$Token r6 = r19.mo6824B()
            com.airbnb.lottie.parser.moshi.JsonReader$Token r4 = com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_OBJECT
            if (r6 != r4) goto L_0x00e6
            r19.mo6831i()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
        L_0x0058:
            boolean r18 = r19.mo6835v()
            if (r18 == 0) goto L_0x00cf
            r18 = r7
            com.airbnb.lottie.parser.moshi.JsonReader$a r7 = f16237d
            int r7 = r0.mo6826H(r7)
            if (r7 == 0) goto L_0x009d
            r23 = r15
            r15 = 1
            if (r7 == r15) goto L_0x0071
            r19.mo6828N()
            goto L_0x007f
        L_0x0071:
            com.airbnb.lottie.parser.moshi.JsonReader$Token r4 = r19.mo6824B()
            com.airbnb.lottie.parser.moshi.JsonReader$Token r6 = com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER
            if (r4 != r6) goto L_0x0082
            double r6 = r19.mo6837x()
            float r4 = (float) r6
            r6 = r4
        L_0x007f:
            r24 = r14
            goto L_0x00c8
        L_0x0082:
            r19.mo6830e()
            r24 = r14
            double r14 = r19.mo6837x()
            float r4 = (float) r14
            com.airbnb.lottie.parser.moshi.JsonReader$Token r7 = r19.mo6824B()
            if (r7 != r6) goto L_0x0098
            double r6 = r19.mo6837x()
            float r6 = (float) r6
            goto L_0x0099
        L_0x0098:
            r6 = r4
        L_0x0099:
            r19.mo6832q()
            goto L_0x00c8
        L_0x009d:
            r24 = r14
            r23 = r15
            com.airbnb.lottie.parser.moshi.JsonReader$Token r3 = r19.mo6824B()
            com.airbnb.lottie.parser.moshi.JsonReader$Token r5 = com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER
            if (r3 != r5) goto L_0x00b0
            double r14 = r19.mo6837x()
            float r3 = (float) r14
            r5 = r3
            goto L_0x00c8
        L_0x00b0:
            r19.mo6830e()
            double r14 = r19.mo6837x()
            float r3 = (float) r14
            com.airbnb.lottie.parser.moshi.JsonReader$Token r7 = r19.mo6824B()
            if (r7 != r5) goto L_0x00c4
            double r14 = r19.mo6837x()
            float r5 = (float) r14
            goto L_0x00c5
        L_0x00c4:
            r5 = r3
        L_0x00c5:
            r19.mo6832q()
        L_0x00c8:
            r15 = r23
            r14 = r24
            r7 = r18
            goto L_0x0058
        L_0x00cf:
            r18 = r7
            r24 = r14
            r23 = r15
            android.graphics.PointF r7 = new android.graphics.PointF
            r7.<init>(r3, r4)
            android.graphics.PointF r3 = new android.graphics.PointF
            r3.<init>(r5, r6)
            r19.mo6833r()
            r5 = r3
            r3 = r7
            goto L_0x017c
        L_0x00e6:
            r18 = r7
            r24 = r14
            r23 = r15
            android.graphics.PointF r4 = p094g5.C4822s.m12150b(r0, r1)
            r11 = r4
            goto L_0x01a8
        L_0x00f3:
            r18 = r7
            r24 = r14
            r23 = r15
            com.airbnb.lottie.parser.moshi.JsonReader$Token r4 = r19.mo6824B()
            com.airbnb.lottie.parser.moshi.JsonReader$Token r6 = com.airbnb.lottie.parser.moshi.JsonReader.Token.BEGIN_OBJECT
            if (r4 != r6) goto L_0x017f
            r19.mo6831i()
            r4 = 0
            r6 = 0
            r7 = 0
            r12 = 0
        L_0x0108:
            boolean r13 = r19.mo6835v()
            if (r13 == 0) goto L_0x016d
            com.airbnb.lottie.parser.moshi.JsonReader$a r13 = f16237d
            int r13 = r0.mo6826H(r13)
            if (r13 == 0) goto L_0x0145
            r14 = 1
            if (r13 == r14) goto L_0x011d
            r19.mo6828N()
            goto L_0x0108
        L_0x011d:
            com.airbnb.lottie.parser.moshi.JsonReader$Token r6 = r19.mo6824B()
            com.airbnb.lottie.parser.moshi.JsonReader$Token r12 = com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER
            if (r6 != r12) goto L_0x012c
            double r12 = r19.mo6837x()
            float r12 = (float) r12
            r6 = r12
            goto L_0x0108
        L_0x012c:
            r19.mo6830e()
            double r13 = r19.mo6837x()
            float r6 = (float) r13
            com.airbnb.lottie.parser.moshi.JsonReader$Token r13 = r19.mo6824B()
            if (r13 != r12) goto L_0x0140
            double r12 = r19.mo6837x()
            float r12 = (float) r12
            goto L_0x0141
        L_0x0140:
            r12 = r6
        L_0x0141:
            r19.mo6832q()
            goto L_0x0108
        L_0x0145:
            com.airbnb.lottie.parser.moshi.JsonReader$Token r4 = r19.mo6824B()
            com.airbnb.lottie.parser.moshi.JsonReader$Token r7 = com.airbnb.lottie.parser.moshi.JsonReader.Token.NUMBER
            if (r4 != r7) goto L_0x0154
            double r13 = r19.mo6837x()
            float r7 = (float) r13
            r4 = r7
            goto L_0x0108
        L_0x0154:
            r19.mo6830e()
            double r13 = r19.mo6837x()
            float r4 = (float) r13
            com.airbnb.lottie.parser.moshi.JsonReader$Token r13 = r19.mo6824B()
            if (r13 != r7) goto L_0x0168
            double r13 = r19.mo6837x()
            float r7 = (float) r13
            goto L_0x0169
        L_0x0168:
            r7 = r4
        L_0x0169:
            r19.mo6832q()
            goto L_0x0108
        L_0x016d:
            android.graphics.PointF r13 = new android.graphics.PointF
            r13.<init>(r4, r6)
            android.graphics.PointF r4 = new android.graphics.PointF
            r4.<init>(r7, r12)
            r19.mo6833r()
            r12 = r13
            r13 = r4
        L_0x017c:
            r14 = r24
            goto L_0x01a8
        L_0x017f:
            android.graphics.PointF r4 = p094g5.C4822s.m12150b(r0, r1)
            r14 = r24
            r9 = r4
            goto L_0x01a8
        L_0x0187:
            r18 = r7
            r24 = r14
            r23 = r15
            java.lang.Object r4 = r2.mo20314a(r0, r1)
            r16 = r4
            goto L_0x01a8
        L_0x0194:
            r18 = r7
            r24 = r14
            r23 = r15
            java.lang.Object r10 = r2.mo20314a(r0, r1)
            goto L_0x01a8
        L_0x019f:
            r18 = r7
            r23 = r15
            double r6 = r19.mo6837x()
            float r14 = (float) r6
        L_0x01a8:
            r15 = r23
            r7 = r18
            r4 = 1
            goto L_0x001b
        L_0x01af:
            r18 = r7
            r24 = r14
            r23 = r15
            r19.mo6833r()
            if (r8 == 0) goto L_0x01bf
            android.view.animation.LinearInterpolator r0 = f16234a
            r16 = r10
            goto L_0x01e0
        L_0x01bf:
            if (r9 == 0) goto L_0x01c8
            if (r11 == 0) goto L_0x01c8
            android.view.animation.Interpolator r0 = m12153a(r9, r11)
            goto L_0x01e0
        L_0x01c8:
            if (r12 == 0) goto L_0x01de
            if (r13 == 0) goto L_0x01de
            if (r3 == 0) goto L_0x01de
            if (r5 == 0) goto L_0x01de
            android.view.animation.Interpolator r0 = m12153a(r12, r3)
            android.view.animation.Interpolator r1 = m12153a(r13, r5)
            r12 = r0
            r13 = r1
            r11 = r16
            r0 = 0
            goto L_0x01e4
        L_0x01de:
            android.view.animation.LinearInterpolator r0 = f16234a
        L_0x01e0:
            r11 = r16
            r12 = 0
            r13 = 0
        L_0x01e4:
            if (r12 == 0) goto L_0x01f5
            if (r13 == 0) goto L_0x01f5
            i5.a r0 = new i5.a
            r8 = r0
            r9 = r20
            r14 = r24
            r8.<init>((com.airbnb.lottie.C1867f) r9, (java.lang.Object) r10, (java.lang.Object) r11, (android.view.animation.Interpolator) r12, (android.view.animation.Interpolator) r13, (float) r14)
            r15 = r23
            goto L_0x0204
        L_0x01f5:
            i5.a r1 = new i5.a
            r14 = 0
            r8 = r1
            r9 = r20
            r12 = r0
            r13 = r24
            r8.<init>((com.airbnb.lottie.C1867f) r9, r10, r11, (android.view.animation.Interpolator) r12, (float) r13, (java.lang.Float) r14)
            r15 = r23
            r0 = r1
        L_0x0204:
            r0.f17445o = r15
            r7 = r18
            r0.f17446p = r7
            return r0
        L_0x020b:
            if (r23 == 0) goto L_0x0289
            r19.mo6831i()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r10 = 0
            r13 = 0
            r15 = 0
            r17 = 0
        L_0x0219:
            boolean r7 = r19.mo6835v()
            if (r7 == 0) goto L_0x0263
            com.airbnb.lottie.parser.moshi.JsonReader$a r7 = f16236c
            int r7 = r0.mo6826H(r7)
            r8 = 1065353216(0x3f800000, float:1.0)
            switch(r7) {
                case 0: goto L_0x025c;
                case 1: goto L_0x0256;
                case 2: goto L_0x0250;
                case 3: goto L_0x024a;
                case 4: goto L_0x0244;
                case 5: goto L_0x0239;
                case 6: goto L_0x0234;
                case 7: goto L_0x022f;
                default: goto L_0x022a;
            }
        L_0x022a:
            r9 = 1
            r19.mo6828N()
            goto L_0x0219
        L_0x022f:
            android.graphics.PointF r5 = p094g5.C4822s.m12150b(r0, r1)
            goto L_0x0219
        L_0x0234:
            android.graphics.PointF r4 = p094g5.C4822s.m12150b(r0, r1)
            goto L_0x0219
        L_0x0239:
            int r7 = r19.mo6838z()
            r9 = 1
            if (r7 != r9) goto L_0x0242
            r15 = 1
            goto L_0x0219
        L_0x0242:
            r15 = 0
            goto L_0x0219
        L_0x0244:
            r9 = 1
            android.graphics.PointF r3 = p094g5.C4822s.m12150b(r0, r8)
            goto L_0x0219
        L_0x024a:
            r9 = 1
            android.graphics.PointF r6 = p094g5.C4822s.m12150b(r0, r8)
            goto L_0x0219
        L_0x0250:
            r9 = 1
            java.lang.Object r17 = r2.mo20314a(r0, r1)
            goto L_0x0219
        L_0x0256:
            r9 = 1
            java.lang.Object r10 = r2.mo20314a(r0, r1)
            goto L_0x0219
        L_0x025c:
            r9 = 1
            double r7 = r19.mo6837x()
            float r13 = (float) r7
            goto L_0x0219
        L_0x0263:
            r19.mo6833r()
            if (r15 == 0) goto L_0x026d
            android.view.animation.LinearInterpolator r0 = f16234a
            r12 = r0
            r11 = r10
            goto L_0x027b
        L_0x026d:
            if (r6 == 0) goto L_0x0276
            if (r3 == 0) goto L_0x0276
            android.view.animation.Interpolator r0 = m12153a(r6, r3)
            goto L_0x0278
        L_0x0276:
            android.view.animation.LinearInterpolator r0 = f16234a
        L_0x0278:
            r12 = r0
            r11 = r17
        L_0x027b:
            i5.a r0 = new i5.a
            r14 = 0
            r8 = r0
            r9 = r20
            r8.<init>((com.airbnb.lottie.C1867f) r9, r10, r11, (android.view.animation.Interpolator) r12, (float) r13, (java.lang.Float) r14)
            r0.f17445o = r4
            r0.f17446p = r5
            return r0
        L_0x0289:
            java.lang.Object r0 = r2.mo20314a(r0, r1)
            i5.a r1 = new i5.a
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p094g5.C4824t.m12154b(com.airbnb.lottie.parser.moshi.JsonReader, com.airbnb.lottie.f, float, g5.k0, boolean, boolean):i5.a");
    }
}
