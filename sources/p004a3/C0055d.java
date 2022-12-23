package p004a3;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.InflateException;
import android.view.animation.AnimationUtils;
import com.appboy.models.InAppMessageBase;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.nearby.messages.Strategy;
import java.util.ArrayList;
import p116i1.C5256j;
import p129j1.C5353d;

/* renamed from: a3.d */
public final class C0055d {

    /* renamed from: a3.d$a */
    public static class C0056a implements TypeEvaluator<C5353d.C5354a[]> {

        /* renamed from: a */
        public C5353d.C5354a[] f74a;

        public final Object evaluate(float f, Object obj, Object obj2) {
            C5353d.C5354a[] aVarArr = (C5353d.C5354a[]) obj;
            C5353d.C5354a[] aVarArr2 = (C5353d.C5354a[]) obj2;
            if (C5353d.m13423a(aVarArr, aVarArr2)) {
                if (!C5353d.m13423a(this.f74a, aVarArr)) {
                    this.f74a = C5353d.m13427e(aVarArr);
                }
                for (int i = 0; i < aVarArr.length; i++) {
                    C5353d.C5354a aVar = this.f74a[i];
                    C5353d.C5354a aVar2 = aVarArr[i];
                    C5353d.C5354a aVar3 = aVarArr2[i];
                    aVar.getClass();
                    aVar.f17651a = aVar2.f17651a;
                    int i2 = 0;
                    while (true) {
                        float[] fArr = aVar2.f17652b;
                        if (i2 >= fArr.length) {
                            break;
                        }
                        aVar.f17652b[i2] = (aVar3.f17652b[i2] * f) + ((1.0f - f) * fArr[i2]);
                        i2++;
                    }
                }
                return this.f74a;
            }
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: android.animation.Animator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.animation.ValueAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.animation.ValueAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.animation.ValueAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: android.animation.ValueAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.animation.ValueAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: android.animation.ValueAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: android.animation.ValueAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: android.animation.ObjectAnimator} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x02fe  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.Animator m106a(android.content.Context r22, android.content.res.Resources r23, android.content.res.Resources.Theme r24, android.content.res.XmlResourceParser r25, android.util.AttributeSet r26, android.animation.AnimatorSet r27, int r28) throws org.xmlpull.p982v1.XmlPullParserException, java.io.IOException {
        /*
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r27
            int r11 = r25.getDepth()
            r0 = 0
            r1 = 0
            r12 = r1
        L_0x000f:
            int r1 = r25.next()
            r2 = 3
            r13 = 0
            if (r1 != r2) goto L_0x001d
            int r3 = r25.getDepth()
            if (r3 <= r11) goto L_0x0325
        L_0x001d:
            r3 = 1
            if (r1 == r3) goto L_0x0325
            r4 = 2
            if (r1 == r4) goto L_0x0024
            goto L_0x000f
        L_0x0024:
            java.lang.String r1 = r25.getName()
            java.lang.String r5 = "objectAnimator"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0044
            android.animation.ObjectAnimator r6 = new android.animation.ObjectAnimator
            r6.<init>()
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r26
            r4 = r6
            r5 = r25
            m110e(r0, r1, r2, r3, r4, r5)
            goto L_0x005b
        L_0x0044:
            java.lang.String r5 = "animator"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0060
            r4 = 0
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r26
            r5 = r25
            android.animation.ValueAnimator r6 = m110e(r0, r1, r2, r3, r4, r5)
        L_0x005b:
            r0 = r6
            r18 = r11
            goto L_0x02f8
        L_0x0060:
            java.lang.String r5 = "set"
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0095
            android.animation.AnimatorSet r14 = new android.animation.AnimatorSet
            r14.<init>()
            int[] r0 = p004a3.C0049a.f61h
            r15 = r26
            android.content.res.TypedArray r6 = p116i1.C5256j.m13278f(r7, r8, r15, r0)
            java.lang.String r0 = "ordering"
            int r16 = p116i1.C5256j.m13275c(r6, r9, r0, r13, r13)
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r14
            r17 = r6
            r6 = r16
            m106a(r0, r1, r2, r3, r4, r5, r6)
            r17.recycle()
            r18 = r11
            r0 = r14
            goto L_0x02f8
        L_0x0095:
            r15 = r26
            java.lang.String r5 = "propertyValuesHolder"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x030e
            android.util.AttributeSet r1 = android.util.Xml.asAttributeSet(r25)
            r6 = 0
        L_0x00a4:
            int r13 = r25.getEventType()
            if (r13 == r2) goto L_0x02d2
            if (r13 == r3) goto L_0x02d2
            if (r13 == r4) goto L_0x00b2
            r25.next()
            goto L_0x00a4
        L_0x00b2:
            java.lang.String r3 = r25.getName()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x02b9
            int[] r3 = p004a3.C0049a.f62i
            android.content.res.TypedArray r3 = p116i1.C5256j.m13278f(r7, r8, r1, r3)
            java.lang.String r13 = "propertyName"
            java.lang.String r13 = p116i1.C5256j.m13276d(r3, r9, r13, r2)
            java.lang.String r14 = "valueType"
            r16 = r1
            r1 = 4
            int r1 = p116i1.C5256j.m13275c(r3, r9, r14, r4, r1)
            r4 = 0
            r14 = r1
            r17 = r5
        L_0x00d6:
            int r5 = r25.next()
            if (r5 == r2) goto L_0x01c1
            r2 = 1
            if (r5 == r2) goto L_0x01c1
            java.lang.String r2 = r25.getName()
            java.lang.String r5 = "keyframe"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L_0x01b2
            java.lang.String r2 = "value"
            r5 = 4
            if (r14 != r5) goto L_0x011f
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r25)
            int[] r14 = p004a3.C0049a.f63j
            android.content.res.TypedArray r5 = p116i1.C5256j.m13278f(r7, r8, r5, r14)
            boolean r14 = p116i1.C5256j.m13277e(r9, r2)
            if (r14 != 0) goto L_0x0103
            r14 = 0
            goto L_0x0108
        L_0x0103:
            r14 = 0
            android.util.TypedValue r14 = r5.peekValue(r14)
        L_0x0108:
            if (r14 == 0) goto L_0x010d
            r18 = 1
            goto L_0x010f
        L_0x010d:
            r18 = 0
        L_0x010f:
            if (r18 == 0) goto L_0x011b
            int r14 = r14.type
            boolean r14 = m109d(r14)
            if (r14 == 0) goto L_0x011b
            r14 = 3
            goto L_0x011c
        L_0x011b:
            r14 = 0
        L_0x011c:
            r5.recycle()
        L_0x011f:
            android.util.AttributeSet r5 = android.util.Xml.asAttributeSet(r25)
            r18 = r11
            int[] r11 = p004a3.C0049a.f63j
            android.content.res.TypedArray r5 = p116i1.C5256j.m13278f(r7, r8, r5, r11)
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.lang.String r7 = "fraction"
            r8 = 3
            float r7 = p116i1.C5256j.m13274b(r5, r9, r7, r8, r11)
            boolean r8 = p116i1.C5256j.m13277e(r9, r2)
            if (r8 != 0) goto L_0x013c
            r8 = 0
            goto L_0x0141
        L_0x013c:
            r8 = 0
            android.util.TypedValue r8 = r5.peekValue(r8)
        L_0x0141:
            if (r8 == 0) goto L_0x0145
            r11 = 1
            goto L_0x0146
        L_0x0145:
            r11 = 0
        L_0x0146:
            r15 = 4
            if (r14 != r15) goto L_0x0157
            if (r11 == 0) goto L_0x0155
            int r8 = r8.type
            boolean r8 = m109d(r8)
            if (r8 == 0) goto L_0x0155
            r8 = 3
            goto L_0x0158
        L_0x0155:
            r8 = 0
            goto L_0x0158
        L_0x0157:
            r8 = r14
        L_0x0158:
            if (r11 == 0) goto L_0x0179
            if (r8 == 0) goto L_0x016e
            r11 = 1
            if (r8 == r11) goto L_0x0164
            r11 = 3
            if (r8 == r11) goto L_0x0164
            r2 = 0
            goto L_0x0184
        L_0x0164:
            r8 = 0
            int r2 = p116i1.C5256j.m13275c(r5, r9, r2, r8, r8)
            android.animation.Keyframe r2 = android.animation.Keyframe.ofInt(r7, r2)
            goto L_0x0184
        L_0x016e:
            r8 = 0
            r11 = 0
            float r2 = p116i1.C5256j.m13274b(r5, r9, r2, r8, r11)
            android.animation.Keyframe r2 = android.animation.Keyframe.ofFloat(r7, r2)
            goto L_0x0184
        L_0x0179:
            if (r8 != 0) goto L_0x0180
            android.animation.Keyframe r2 = android.animation.Keyframe.ofFloat(r7)
            goto L_0x0184
        L_0x0180:
            android.animation.Keyframe r2 = android.animation.Keyframe.ofInt(r7)
        L_0x0184:
            java.lang.String r7 = "interpolator"
            boolean r7 = p116i1.C5256j.m13277e(r9, r7)
            if (r7 != 0) goto L_0x018e
            r7 = 0
            goto L_0x0194
        L_0x018e:
            r7 = 0
            r8 = 1
            int r7 = r5.getResourceId(r8, r7)
        L_0x0194:
            r8 = r22
            if (r7 <= 0) goto L_0x019f
            android.view.animation.Interpolator r7 = android.view.animation.AnimationUtils.loadInterpolator(r8, r7)
            r2.setInterpolator(r7)
        L_0x019f:
            r5.recycle()
            if (r2 == 0) goto L_0x01ae
            if (r4 != 0) goto L_0x01ab
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
        L_0x01ab:
            r4.add(r2)
        L_0x01ae:
            r25.next()
            goto L_0x01b6
        L_0x01b2:
            r8 = r22
            r18 = r11
        L_0x01b6:
            r2 = 3
            r7 = r23
            r8 = r24
            r15 = r26
            r11 = r18
            goto L_0x00d6
        L_0x01c1:
            r8 = r22
            r18 = r11
            if (r4 == 0) goto L_0x029d
            int r2 = r4.size()
            if (r2 <= 0) goto L_0x029d
            r5 = 0
            java.lang.Object r5 = r4.get(r5)
            android.animation.Keyframe r5 = (android.animation.Keyframe) r5
            int r7 = r2 + -1
            java.lang.Object r7 = r4.get(r7)
            android.animation.Keyframe r7 = (android.animation.Keyframe) r7
            float r11 = r7.getFraction()
            r15 = 1065353216(0x3f800000, float:1.0)
            int r19 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r19 >= 0) goto L_0x01fd
            r19 = 0
            int r11 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r11 >= 0) goto L_0x01f0
            r7.setFraction(r15)
            goto L_0x01fd
        L_0x01f0:
            int r11 = r4.size()
            android.animation.Keyframe r7 = m107b(r7, r15)
            r4.add(r11, r7)
            int r2 = r2 + 1
        L_0x01fd:
            float r7 = r5.getFraction()
            r11 = 0
            int r15 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x0218
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 >= 0) goto L_0x020e
            r5.setFraction(r11)
            goto L_0x0218
        L_0x020e:
            android.animation.Keyframe r5 = m107b(r5, r11)
            r7 = 0
            r4.add(r7, r5)
            int r2 = r2 + 1
        L_0x0218:
            android.animation.Keyframe[] r5 = new android.animation.Keyframe[r2]
            r4.toArray(r5)
            r4 = 0
        L_0x021e:
            if (r4 >= r2) goto L_0x0290
            r7 = r5[r4]
            float r11 = r7.getFraction()
            r15 = 0
            int r11 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r11 >= 0) goto L_0x0287
            if (r4 != 0) goto L_0x0231
            r7.setFraction(r15)
            goto L_0x0287
        L_0x0231:
            int r11 = r2 + -1
            if (r4 != r11) goto L_0x023b
            r11 = 1065353216(0x3f800000, float:1.0)
            r7.setFraction(r11)
            goto L_0x0287
        L_0x023b:
            int r7 = r4 + 1
            r15 = r4
        L_0x023e:
            if (r7 >= r11) goto L_0x0255
            r19 = r5[r7]
            float r19 = r19.getFraction()
            r20 = 0
            int r19 = (r19 > r20 ? 1 : (r19 == r20 ? 0 : -1))
            if (r19 < 0) goto L_0x024d
            goto L_0x0255
        L_0x024d:
            int r15 = r7 + 1
            r21 = r15
            r15 = r7
            r7 = r21
            goto L_0x023e
        L_0x0255:
            int r7 = r15 + 1
            r7 = r5[r7]
            float r7 = r7.getFraction()
            int r11 = r4 + -1
            r11 = r5[r11]
            float r11 = r11.getFraction()
            float r7 = r7 - r11
            int r11 = r15 - r4
            int r11 = r11 + 2
            float r11 = (float) r11
            float r7 = r7 / r11
            r11 = r4
        L_0x026d:
            if (r11 > r15) goto L_0x0287
            r19 = r2
            r2 = r5[r11]
            int r20 = r11 + -1
            r20 = r5[r20]
            float r20 = r20.getFraction()
            float r8 = r20 + r7
            r2.setFraction(r8)
            int r11 = r11 + 1
            r8 = r22
            r2 = r19
            goto L_0x026d
        L_0x0287:
            r19 = r2
            int r4 = r4 + 1
            r8 = r22
            r2 = r19
            goto L_0x021e
        L_0x0290:
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofKeyframe(r13, r5)
            r4 = 3
            if (r14 != r4) goto L_0x029f
            a3.e r5 = p004a3.C0057e.f75a
            r2.setEvaluator(r5)
            goto L_0x029f
        L_0x029d:
            r4 = 3
            r2 = 0
        L_0x029f:
            r5 = 0
            r7 = 1
            if (r2 != 0) goto L_0x02a7
            android.animation.PropertyValuesHolder r2 = m108c(r3, r1, r5, r7, r13)
        L_0x02a7:
            if (r2 == 0) goto L_0x02b4
            if (r6 != 0) goto L_0x02b1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r6 = r1
        L_0x02b1:
            r6.add(r2)
        L_0x02b4:
            r3.recycle()
            r2 = r4
            goto L_0x02bf
        L_0x02b9:
            r16 = r1
            r17 = r5
            r18 = r11
        L_0x02bf:
            r25.next()
            r3 = 1
            r4 = 2
            r7 = r23
            r8 = r24
            r15 = r26
            r1 = r16
            r5 = r17
            r11 = r18
            goto L_0x00a4
        L_0x02d2:
            r18 = r11
            if (r6 == 0) goto L_0x02ea
            int r1 = r6.size()
            android.animation.PropertyValuesHolder[] r2 = new android.animation.PropertyValuesHolder[r1]
            r3 = 0
        L_0x02dd:
            if (r3 >= r1) goto L_0x02eb
            java.lang.Object r4 = r6.get(r3)
            android.animation.PropertyValuesHolder r4 = (android.animation.PropertyValuesHolder) r4
            r2[r3] = r4
            int r3 = r3 + 1
            goto L_0x02dd
        L_0x02ea:
            r2 = 0
        L_0x02eb:
            if (r2 == 0) goto L_0x02f7
            boolean r1 = r0 instanceof android.animation.ValueAnimator
            if (r1 == 0) goto L_0x02f7
            r1 = r0
            android.animation.ValueAnimator r1 = (android.animation.ValueAnimator) r1
            r1.setValues(r2)
        L_0x02f7:
            r13 = 1
        L_0x02f8:
            if (r10 == 0) goto L_0x0306
            if (r13 != 0) goto L_0x0306
            if (r12 != 0) goto L_0x0303
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
        L_0x0303:
            r12.add(r0)
        L_0x0306:
            r7 = r23
            r8 = r24
            r11 = r18
            goto L_0x000f
        L_0x030e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Unknown animator name: "
            java.lang.StringBuilder r1 = p379.C13555b.m33972k(r1)
            java.lang.String r2 = r25.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0325:
            if (r10 == 0) goto L_0x034f
            if (r12 == 0) goto L_0x034f
            int r1 = r12.size()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            java.util.Iterator r2 = r12.iterator()
            r3 = 0
        L_0x0334:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0346
            java.lang.Object r4 = r2.next()
            android.animation.Animator r4 = (android.animation.Animator) r4
            int r5 = r3 + 1
            r1[r3] = r4
            r3 = r5
            goto L_0x0334
        L_0x0346:
            if (r28 != 0) goto L_0x034c
            r10.playTogether(r1)
            goto L_0x034f
        L_0x034c:
            r10.playSequentially(r1)
        L_0x034f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p004a3.C0055d.m106a(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, android.content.res.XmlResourceParser, android.util.AttributeSet, android.animation.AnimatorSet, int):android.animation.Animator");
    }

    /* renamed from: b */
    public static Keyframe m107b(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v29, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v32, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.PropertyValuesHolder m108c(android.content.res.TypedArray r11, int r12, int r13, int r14, java.lang.String r15) {
        /*
            android.util.TypedValue r0 = r11.peekValue(r13)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x000a
            r3 = 1
            goto L_0x000b
        L_0x000a:
            r3 = 0
        L_0x000b:
            if (r3 == 0) goto L_0x0010
            int r0 = r0.type
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            android.util.TypedValue r4 = r11.peekValue(r14)
            if (r4 == 0) goto L_0x0019
            r5 = 1
            goto L_0x001a
        L_0x0019:
            r5 = 0
        L_0x001a:
            if (r5 == 0) goto L_0x001f
            int r4 = r4.type
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            r6 = 4
            r7 = 3
            if (r12 != r6) goto L_0x0037
            if (r3 == 0) goto L_0x002c
            boolean r12 = m109d(r0)
            if (r12 != 0) goto L_0x0034
        L_0x002c:
            if (r5 == 0) goto L_0x0036
            boolean r12 = m109d(r4)
            if (r12 == 0) goto L_0x0036
        L_0x0034:
            r12 = 3
            goto L_0x0037
        L_0x0036:
            r12 = 0
        L_0x0037:
            if (r12 != 0) goto L_0x003b
            r6 = 1
            goto L_0x003c
        L_0x003b:
            r6 = 0
        L_0x003c:
            r8 = 0
            r9 = 2
            if (r12 != r9) goto L_0x0098
            java.lang.String r12 = r11.getString(r13)
            java.lang.String r11 = r11.getString(r14)
            j1.d$a[] r13 = p129j1.C5353d.m13425c(r12)
            j1.d$a[] r14 = p129j1.C5353d.m13425c(r11)
            if (r13 != 0) goto L_0x0054
            if (r14 == 0) goto L_0x0156
        L_0x0054:
            if (r13 == 0) goto L_0x0087
            a3.d$a r0 = new a3.d$a
            r0.<init>()
            if (r14 == 0) goto L_0x007c
            boolean r3 = p129j1.C5353d.m13423a(r13, r14)
            if (r3 == 0) goto L_0x006e
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r2] = r13
            r11[r1] = r14
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
            goto L_0x0084
        L_0x006e:
            android.view.InflateException r13 = new android.view.InflateException
            java.lang.String r14 = " Can't morph from "
            java.lang.String r15 = " to "
            java.lang.String r11 = p379.C25541a.m63882l(r14, r12, r15, r11)
            r13.<init>(r11)
            throw r13
        L_0x007c:
            java.lang.Object[] r11 = new java.lang.Object[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofObject(r15, r0, r11)
        L_0x0084:
            r8 = r11
            goto L_0x0156
        L_0x0087:
            if (r14 == 0) goto L_0x0156
            a3.d$a r11 = new a3.d$a
            r11.<init>()
            java.lang.Object[] r12 = new java.lang.Object[r1]
            r12[r2] = r14
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofObject(r15, r11, r12)
            goto L_0x0156
        L_0x0098:
            if (r12 != r7) goto L_0x009d
            a3.e r12 = p004a3.C0057e.f75a
            goto L_0x009e
        L_0x009d:
            r12 = r8
        L_0x009e:
            r7 = 5
            r10 = 0
            if (r6 == 0) goto L_0x00e7
            if (r3 == 0) goto L_0x00d2
            if (r0 != r7) goto L_0x00ab
            float r13 = r11.getDimension(r13, r10)
            goto L_0x00af
        L_0x00ab:
            float r13 = r11.getFloat(r13, r10)
        L_0x00af:
            if (r5 == 0) goto L_0x00c8
            if (r4 != r7) goto L_0x00b8
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00bc
        L_0x00b8:
            float r11 = r11.getFloat(r14, r10)
        L_0x00bc:
            float[] r14 = new float[r9]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r14)
            goto L_0x014e
        L_0x00c8:
            float[] r11 = new float[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r11)
            goto L_0x014e
        L_0x00d2:
            if (r4 != r7) goto L_0x00d9
            float r11 = r11.getDimension(r14, r10)
            goto L_0x00dd
        L_0x00d9:
            float r11 = r11.getFloat(r14, r10)
        L_0x00dd:
            float[] r13 = new float[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofFloat(r15, r13)
            goto L_0x014e
        L_0x00e7:
            if (r3 == 0) goto L_0x012d
            if (r0 != r7) goto L_0x00f1
            float r13 = r11.getDimension(r13, r10)
            int r13 = (int) r13
            goto L_0x0100
        L_0x00f1:
            boolean r0 = m109d(r0)
            if (r0 == 0) goto L_0x00fc
            int r13 = r11.getColor(r13, r2)
            goto L_0x0100
        L_0x00fc:
            int r13 = r11.getInt(r13, r2)
        L_0x0100:
            if (r5 == 0) goto L_0x0124
            if (r4 != r7) goto L_0x010a
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x0119
        L_0x010a:
            boolean r0 = m109d(r4)
            if (r0 == 0) goto L_0x0115
            int r11 = r11.getColor(r14, r2)
            goto L_0x0119
        L_0x0115:
            int r11 = r11.getInt(r14, r2)
        L_0x0119:
            int[] r14 = new int[r9]
            r14[r2] = r13
            r14[r1] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofInt(r15, r14)
            goto L_0x014e
        L_0x0124:
            int[] r11 = new int[r1]
            r11[r2] = r13
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofInt(r15, r11)
            goto L_0x014e
        L_0x012d:
            if (r5 == 0) goto L_0x014f
            if (r4 != r7) goto L_0x0137
            float r11 = r11.getDimension(r14, r10)
            int r11 = (int) r11
            goto L_0x0146
        L_0x0137:
            boolean r13 = m109d(r4)
            if (r13 == 0) goto L_0x0142
            int r11 = r11.getColor(r14, r2)
            goto L_0x0146
        L_0x0142:
            int r11 = r11.getInt(r14, r2)
        L_0x0146:
            int[] r13 = new int[r1]
            r13[r2] = r11
            android.animation.PropertyValuesHolder r11 = android.animation.PropertyValuesHolder.ofInt(r15, r13)
        L_0x014e:
            r8 = r11
        L_0x014f:
            if (r8 == 0) goto L_0x0156
            if (r12 == 0) goto L_0x0156
            r8.setEvaluator(r12)
        L_0x0156:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p004a3.C0055d.m108c(android.content.res.TypedArray, int, int, int, java.lang.String):android.animation.PropertyValuesHolder");
    }

    /* renamed from: d */
    public static boolean m109d(int i) {
        return i >= 28 && i <= 31;
    }

    /* renamed from: e */
    public static ValueAnimator m110e(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ObjectAnimator objectAnimator, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
        ValueAnimator valueAnimator;
        TypedArray typedArray;
        ValueAnimator valueAnimator2;
        TypedArray typedArray2;
        ValueAnimator valueAnimator3;
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder propertyValuesHolder2;
        boolean z;
        int i;
        boolean z2;
        int i2;
        Resources resources2 = resources;
        Resources.Theme theme2 = theme;
        AttributeSet attributeSet2 = attributeSet;
        XmlResourceParser xmlResourceParser2 = xmlResourceParser;
        TypedArray f = C5256j.m13278f(resources2, theme2, attributeSet2, C0049a.f60g);
        TypedArray f2 = C5256j.m13278f(resources2, theme2, attributeSet2, C0049a.f64k);
        if (objectAnimator == null) {
            valueAnimator = new ValueAnimator();
        } else {
            valueAnimator = objectAnimator;
        }
        long c = (long) C5256j.m13275c(f, xmlResourceParser2, InAppMessageBase.DURATION, 1, Strategy.TTL_SECONDS_DEFAULT);
        int i3 = 0;
        long c2 = (long) C5256j.m13275c(f, xmlResourceParser2, "startOffset", 2, 0);
        int c3 = C5256j.m13275c(f, xmlResourceParser2, "valueType", 7, 4);
        if (C5256j.m13277e(xmlResourceParser2, "valueFrom") && C5256j.m13277e(xmlResourceParser2, "valueTo")) {
            if (c3 == 4) {
                TypedValue peekValue = f.peekValue(5);
                if (peekValue != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    i = peekValue.type;
                } else {
                    i = 0;
                }
                TypedValue peekValue2 = f.peekValue(6);
                if (peekValue2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    i2 = peekValue2.type;
                } else {
                    i2 = 0;
                }
                if ((!z || !m109d(i)) && (!z2 || !m109d(i2))) {
                    c3 = 0;
                } else {
                    c3 = 3;
                }
            }
            PropertyValuesHolder c4 = m108c(f, c3, 5, 6, "");
            if (c4 != null) {
                valueAnimator.setValues(new PropertyValuesHolder[]{c4});
            }
        }
        valueAnimator.setDuration(c);
        valueAnimator.setStartDelay(c2);
        valueAnimator.setRepeatCount(C5256j.m13275c(f, xmlResourceParser2, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(C5256j.m13275c(f, xmlResourceParser2, "repeatMode", 4, 1));
        if (f2 != null) {
            ObjectAnimator objectAnimator2 = (ObjectAnimator) valueAnimator;
            String d = C5256j.m13276d(f2, xmlResourceParser2, "pathData", 1);
            if (d != null) {
                String d2 = C5256j.m13276d(f2, xmlResourceParser2, "propertyXName", 2);
                String d3 = C5256j.m13276d(f2, xmlResourceParser2, "propertyYName", 3);
                if (d2 == null && d3 == null) {
                    throw new InflateException(f2.getPositionDescription() + " propertyXName or propertyYName is needed for PathData");
                }
                Path d4 = C5353d.m13426d(d);
                PathMeasure pathMeasure = new PathMeasure(d4, false);
                ArrayList arrayList = new ArrayList();
                arrayList.add(Float.valueOf(BitmapDescriptorFactory.HUE_RED));
                float f3 = BitmapDescriptorFactory.HUE_RED;
                do {
                    f3 += pathMeasure.getLength();
                    arrayList.add(Float.valueOf(f3));
                } while (pathMeasure.nextContour());
                PathMeasure pathMeasure2 = new PathMeasure(d4, false);
                int min = Math.min(100, ((int) (f3 / 0.5f)) + 1);
                float[] fArr = new float[min];
                float[] fArr2 = new float[min];
                float[] fArr3 = new float[2];
                float f4 = f3 / ((float) (min - 1));
                valueAnimator2 = valueAnimator;
                typedArray = f;
                int i4 = 0;
                float f5 = BitmapDescriptorFactory.HUE_RED;
                while (true) {
                    propertyValuesHolder = null;
                    if (i3 >= min) {
                        break;
                    }
                    int i5 = min;
                    pathMeasure2.getPosTan(f5 - ((Float) arrayList.get(i4)).floatValue(), fArr3, (float[]) null);
                    fArr[i3] = fArr3[0];
                    fArr2[i3] = fArr3[1];
                    f5 += f4;
                    int i6 = i4 + 1;
                    if (i6 < arrayList.size() && f5 > ((Float) arrayList.get(i6)).floatValue()) {
                        pathMeasure2.nextContour();
                        i4 = i6;
                    }
                    i3++;
                    min = i5;
                }
                if (d2 != null) {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat(d2, fArr);
                } else {
                    propertyValuesHolder2 = null;
                }
                if (d3 != null) {
                    propertyValuesHolder = PropertyValuesHolder.ofFloat(d3, fArr2);
                }
                if (propertyValuesHolder2 == null) {
                    i3 = 0;
                    objectAnimator2.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
                } else {
                    i3 = 0;
                    if (propertyValuesHolder == null) {
                        objectAnimator2.setValues(new PropertyValuesHolder[]{propertyValuesHolder2});
                    } else {
                        objectAnimator2.setValues(new PropertyValuesHolder[]{propertyValuesHolder2, propertyValuesHolder});
                    }
                }
            } else {
                valueAnimator2 = valueAnimator;
                typedArray = f;
                objectAnimator2.setPropertyName(C5256j.m13276d(f2, xmlResourceParser2, "propertyName", 0));
            }
        } else {
            valueAnimator2 = valueAnimator;
            typedArray = f;
        }
        if (!C5256j.m13277e(xmlResourceParser2, "interpolator")) {
            typedArray2 = typedArray;
        } else {
            typedArray2 = typedArray;
            i3 = typedArray2.getResourceId(i3, i3);
        }
        if (i3 > 0) {
            valueAnimator3 = valueAnimator2;
            valueAnimator3.setInterpolator(AnimationUtils.loadInterpolator(context, i3));
        } else {
            valueAnimator3 = valueAnimator2;
        }
        typedArray2.recycle();
        if (f2 != null) {
            f2.recycle();
        }
        return valueAnimator3;
    }
}
