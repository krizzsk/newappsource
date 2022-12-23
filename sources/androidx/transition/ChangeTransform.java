package androidx.transition;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.WeakHashMap;
import org.xmlpull.p982v1.XmlPullParser;
import p116i1.C5256j;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p330z2.C7426d;
import p330z2.C7434j;
import p330z2.C7438n;
import p330z2.C7441q;
import p330z2.C7444t;

public class ChangeTransform extends Transition {

    /* renamed from: C */
    public static final String[] f4901C = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* renamed from: D */
    public static final C1297a f4902D = new C1297a();

    /* renamed from: E */
    public static final C1298b f4903E = new C1298b(PointF.class);

    /* renamed from: F */
    public static final boolean f4904F = true;

    /* renamed from: A */
    public boolean f4905A = true;

    /* renamed from: B */
    public Matrix f4906B = new Matrix();

    /* renamed from: z */
    public boolean f4907z = true;

    /* renamed from: androidx.transition.ChangeTransform$a */
    public static class C1297a extends Property<C1300d, float[]> {
        public C1297a() {
            super(float[].class, "nonTranslations");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            C1300d dVar = (C1300d) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            C1300d dVar = (C1300d) obj;
            float[] fArr = (float[]) obj2;
            System.arraycopy(fArr, 0, dVar.f4912c, 0, fArr.length);
            dVar.mo5390a();
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$b */
    public static class C1298b extends Property<C1300d, PointF> {
        public C1298b(Class cls) {
            super(cls, "translations");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            C1300d dVar = (C1300d) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            C1300d dVar = (C1300d) obj;
            PointF pointF = (PointF) obj2;
            dVar.getClass();
            dVar.f4913d = pointF.x;
            dVar.f4914e = pointF.y;
            dVar.mo5390a();
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$c */
    public static class C1299c extends C1327f {

        /* renamed from: a */
        public View f4908a;

        /* renamed from: b */
        public C7426d f4909b;

        public C1299c(View view, C7426d dVar) {
            this.f4908a = view;
            this.f4909b = dVar;
        }

        /* renamed from: a */
        public final void mo5374a() {
            this.f4909b.setVisibility(4);
        }

        /* renamed from: c */
        public final void mo5376c() {
            this.f4909b.setVisibility(0);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(5:7|8|9|10|11) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001e */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo5377d(androidx.transition.Transition r8) {
            /*
                r7 = this;
                r8.mo5427w(r7)
                android.view.View r8 = r7.f4908a
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                r2 = 0
                if (r0 != r1) goto L_0x004c
                boolean r0 = p330z2.C7428f.f22828h
                r1 = 0
                r3 = 1
                if (r0 != 0) goto L_0x0035
                boolean r0 = p330z2.C7428f.f22824d     // Catch:{ NoSuchMethodException -> 0x0033 }
                if (r0 != 0) goto L_0x0020
                java.lang.String r0 = "android.view.GhostView"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch:{ ClassNotFoundException -> 0x001e }
                p330z2.C7428f.f22823c = r0     // Catch:{ ClassNotFoundException -> 0x001e }
            L_0x001e:
                p330z2.C7428f.f22824d = r3     // Catch:{ NoSuchMethodException -> 0x0033 }
            L_0x0020:
                java.lang.Class r0 = p330z2.C7428f.f22823c     // Catch:{ NoSuchMethodException -> 0x0033 }
                java.lang.String r4 = "removeGhost"
                java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ NoSuchMethodException -> 0x0033 }
                java.lang.Class<android.view.View> r6 = android.view.View.class
                r5[r1] = r6     // Catch:{ NoSuchMethodException -> 0x0033 }
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r5)     // Catch:{ NoSuchMethodException -> 0x0033 }
                p330z2.C7428f.f22827g = r0     // Catch:{ NoSuchMethodException -> 0x0033 }
                r0.setAccessible(r3)     // Catch:{ NoSuchMethodException -> 0x0033 }
            L_0x0033:
                p330z2.C7428f.f22828h = r3
            L_0x0035:
                java.lang.reflect.Method r0 = p330z2.C7428f.f22827g
                if (r0 == 0) goto L_0x0069
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ IllegalAccessException -> 0x0069, InvocationTargetException -> 0x0041 }
                r3[r1] = r8     // Catch:{ IllegalAccessException -> 0x0069, InvocationTargetException -> 0x0041 }
                r0.invoke(r2, r3)     // Catch:{ IllegalAccessException -> 0x0069, InvocationTargetException -> 0x0041 }
                goto L_0x0069
            L_0x0041:
                r8 = move-exception
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.Throwable r8 = r8.getCause()
                r0.<init>(r8)
                throw r0
            L_0x004c:
                int r0 = p330z2.C7429g.f22830h
                int r0 = p330z2.C7434j.ghost_view
                java.lang.Object r8 = r8.getTag(r0)
                z2.g r8 = (p330z2.C7429g) r8
                if (r8 == 0) goto L_0x0069
                int r0 = r8.f22834e
                int r0 = r0 + -1
                r8.f22834e = r0
                if (r0 > 0) goto L_0x0069
                android.view.ViewParent r0 = r8.getParent()
                z2.e r0 = (p330z2.C7427e) r0
                r0.removeView(r8)
            L_0x0069:
                android.view.View r8 = r7.f4908a
                int r0 = p330z2.C7434j.transition_transform
                r8.setTag(r0, r2)
                android.view.View r8 = r7.f4908a
                int r0 = p330z2.C7434j.parent_matrix
                r8.setTag(r0, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeTransform.C1299c.mo5377d(androidx.transition.Transition):void");
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$d */
    public static class C1300d {

        /* renamed from: a */
        public final Matrix f4910a = new Matrix();

        /* renamed from: b */
        public final View f4911b;

        /* renamed from: c */
        public final float[] f4912c;

        /* renamed from: d */
        public float f4913d;

        /* renamed from: e */
        public float f4914e;

        public C1300d(View view, float[] fArr) {
            this.f4911b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f4912c = fArr2;
            this.f4913d = fArr2[2];
            this.f4914e = fArr2[5];
            mo5390a();
        }

        /* renamed from: a */
        public final void mo5390a() {
            float[] fArr = this.f4912c;
            fArr[2] = this.f4913d;
            fArr[5] = this.f4914e;
            this.f4910a.setValues(fArr);
            C7444t.f22865a.mo23702i(this.f4911b, this.f4910a);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$e */
    public static class C1301e {

        /* renamed from: a */
        public final float f4915a;

        /* renamed from: b */
        public final float f4916b;

        /* renamed from: c */
        public final float f4917c;

        /* renamed from: d */
        public final float f4918d;

        /* renamed from: e */
        public final float f4919e;

        /* renamed from: f */
        public final float f4920f;

        /* renamed from: g */
        public final float f4921g;

        /* renamed from: h */
        public final float f4922h;

        public C1301e(View view) {
            this.f4915a = view.getTranslationX();
            this.f4916b = view.getTranslationY();
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            this.f4917c = C6333d0.C6342i.m15095l(view);
            this.f4918d = view.getScaleX();
            this.f4919e = view.getScaleY();
            this.f4920f = view.getRotationX();
            this.f4921g = view.getRotationY();
            this.f4922h = view.getRotation();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1301e)) {
                return false;
            }
            C1301e eVar = (C1301e) obj;
            if (eVar.f4915a == this.f4915a && eVar.f4916b == this.f4916b && eVar.f4917c == this.f4917c && eVar.f4918d == this.f4918d && eVar.f4919e == this.f4919e && eVar.f4920f == this.f4920f && eVar.f4921g == this.f4921g && eVar.f4922h == this.f4922h) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            float f = this.f4915a;
            int i8 = 0;
            if (f != BitmapDescriptorFactory.HUE_RED) {
                i = Float.floatToIntBits(f);
            } else {
                i = 0;
            }
            int i9 = i * 31;
            float f2 = this.f4916b;
            if (f2 != BitmapDescriptorFactory.HUE_RED) {
                i2 = Float.floatToIntBits(f2);
            } else {
                i2 = 0;
            }
            int i11 = (i9 + i2) * 31;
            float f3 = this.f4917c;
            if (f3 != BitmapDescriptorFactory.HUE_RED) {
                i3 = Float.floatToIntBits(f3);
            } else {
                i3 = 0;
            }
            int i12 = (i11 + i3) * 31;
            float f4 = this.f4918d;
            if (f4 != BitmapDescriptorFactory.HUE_RED) {
                i4 = Float.floatToIntBits(f4);
            } else {
                i4 = 0;
            }
            int i13 = (i12 + i4) * 31;
            float f5 = this.f4919e;
            if (f5 != BitmapDescriptorFactory.HUE_RED) {
                i5 = Float.floatToIntBits(f5);
            } else {
                i5 = 0;
            }
            int i14 = (i13 + i5) * 31;
            float f6 = this.f4920f;
            if (f6 != BitmapDescriptorFactory.HUE_RED) {
                i6 = Float.floatToIntBits(f6);
            } else {
                i6 = 0;
            }
            int i15 = (i14 + i6) * 31;
            float f7 = this.f4921g;
            if (f7 != BitmapDescriptorFactory.HUE_RED) {
                i7 = Float.floatToIntBits(f7);
            } else {
                i7 = 0;
            }
            int i16 = (i15 + i7) * 31;
            float f8 = this.f4922h;
            if (f8 != BitmapDescriptorFactory.HUE_RED) {
                i8 = Float.floatToIntBits(f8);
            }
            return i16 + i8;
        }
    }

    public ChangeTransform() {
    }

    /* renamed from: J */
    public final void mo5385J(C7441q qVar) {
        Matrix matrix;
        View view = qVar.f22855b;
        if (view.getVisibility() != 8) {
            qVar.f22854a.put("android:changeTransform:parent", view.getParent());
            qVar.f22854a.put("android:changeTransform:transforms", new C1301e(view));
            Matrix matrix2 = view.getMatrix();
            if (matrix2 == null || matrix2.isIdentity()) {
                matrix = null;
            } else {
                matrix = new Matrix(matrix2);
            }
            qVar.f22854a.put("android:changeTransform:matrix", matrix);
            if (this.f4905A) {
                Matrix matrix3 = new Matrix();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                C7444t.f22865a.mo23703j(viewGroup, matrix3);
                matrix3.preTranslate((float) (-viewGroup.getScrollX()), (float) (-viewGroup.getScrollY()));
                qVar.f22854a.put("android:changeTransform:parentMatrix", matrix3);
                qVar.f22854a.put("android:changeTransform:intermediateMatrix", view.getTag(C7434j.transition_transform));
                qVar.f22854a.put("android:changeTransform:intermediateParentMatrix", view.getTag(C7434j.parent_matrix));
            }
        }
    }

    /* renamed from: d */
    public final void mo5356d(C7441q qVar) {
        mo5385J(qVar);
    }

    /* renamed from: g */
    public final void mo5357g(C7441q qVar) {
        mo5385J(qVar);
        if (!f4904F) {
            ((ViewGroup) qVar.f22855b.getParent()).startViewTransition(qVar.f22855b);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: android.view.View} */
    /* JADX WARNING: type inference failed for: r7v4, types: [z2.f] */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03ab, code lost:
        if (r3.size() == r5) goto L_0x03b8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03c1  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x044d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e3  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator mo5358k(android.view.ViewGroup r25, p330z2.C7441q r26, p330z2.C7441q r27) {
        /*
            r24 = this;
            r8 = r24
            r0 = r25
            r9 = r26
            r10 = r27
            if (r9 == 0) goto L_0x0455
            if (r10 == 0) goto L_0x0455
            java.util.HashMap r1 = r9.f22854a
            java.lang.String r12 = "android:changeTransform:parent"
            boolean r1 = r1.containsKey(r12)
            if (r1 == 0) goto L_0x0455
            java.util.HashMap r1 = r10.f22854a
            boolean r1 = r1.containsKey(r12)
            if (r1 != 0) goto L_0x0020
            goto L_0x0455
        L_0x0020:
            java.util.HashMap r1 = r9.f22854a
            java.lang.Object r1 = r1.get(r12)
            r13 = r1
            android.view.ViewGroup r13 = (android.view.ViewGroup) r13
            java.util.HashMap r1 = r10.f22854a
            java.lang.Object r1 = r1.get(r12)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            boolean r2 = r8.f4905A
            r15 = 1
            if (r2 == 0) goto L_0x0058
            boolean r2 = r8.mo5424t(r13)
            if (r2 == 0) goto L_0x004e
            boolean r2 = r8.mo5424t(r1)
            if (r2 != 0) goto L_0x0043
            goto L_0x004e
        L_0x0043:
            z2.q r2 = r8.mo5421o(r13, r15)
            if (r2 == 0) goto L_0x0052
            android.view.View r2 = r2.f22855b
            if (r1 != r2) goto L_0x0052
            goto L_0x0050
        L_0x004e:
            if (r13 != r1) goto L_0x0052
        L_0x0050:
            r1 = 1
            goto L_0x0053
        L_0x0052:
            r1 = 0
        L_0x0053:
            if (r1 != 0) goto L_0x0058
            r16 = 1
            goto L_0x005a
        L_0x0058:
            r16 = 0
        L_0x005a:
            java.util.HashMap r1 = r9.f22854a
            java.lang.String r2 = "android:changeTransform:intermediateMatrix"
            java.lang.Object r1 = r1.get(r2)
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            java.lang.String r2 = "android:changeTransform:matrix"
            if (r1 == 0) goto L_0x006d
            java.util.HashMap r3 = r9.f22854a
            r3.put(r2, r1)
        L_0x006d:
            java.util.HashMap r1 = r9.f22854a
            java.lang.String r3 = "android:changeTransform:intermediateParentMatrix"
            java.lang.Object r1 = r1.get(r3)
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            java.lang.String r7 = "android:changeTransform:parentMatrix"
            if (r1 == 0) goto L_0x0080
            java.util.HashMap r3 = r9.f22854a
            r3.put(r7, r1)
        L_0x0080:
            if (r16 == 0) goto L_0x00bb
            java.util.HashMap r1 = r10.f22854a
            java.lang.Object r1 = r1.get(r7)
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            android.view.View r3 = r10.f22855b
            int r4 = p330z2.C7434j.parent_matrix
            r3.setTag(r4, r1)
            android.graphics.Matrix r3 = r8.f4906B
            r3.reset()
            r1.invert(r3)
            java.util.HashMap r1 = r9.f22854a
            java.lang.Object r1 = r1.get(r2)
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            if (r1 != 0) goto L_0x00ad
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            java.util.HashMap r4 = r9.f22854a
            r4.put(r2, r1)
        L_0x00ad:
            java.util.HashMap r4 = r9.f22854a
            java.lang.Object r4 = r4.get(r7)
            android.graphics.Matrix r4 = (android.graphics.Matrix) r4
            r1.postConcat(r4)
            r1.postConcat(r3)
        L_0x00bb:
            java.util.HashMap r1 = r9.f22854a
            java.lang.Object r1 = r1.get(r2)
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            java.util.HashMap r3 = r10.f22854a
            java.lang.Object r2 = r3.get(r2)
            android.graphics.Matrix r2 = (android.graphics.Matrix) r2
            if (r1 != 0) goto L_0x00cf
            z2.i$a r1 = p330z2.C7432i.f22839a
        L_0x00cf:
            if (r2 != 0) goto L_0x00d3
            z2.i$a r2 = p330z2.C7432i.f22839a
        L_0x00d3:
            r4 = r2
            boolean r2 = r1.equals(r4)
            r6 = 1065353216(0x3f800000, float:1.0)
            r5 = 0
            if (r2 == 0) goto L_0x00e3
            r11 = r7
            r21 = r13
            r6 = 0
            goto L_0x0176
        L_0x00e3:
            java.util.HashMap r2 = r10.f22854a
            java.lang.String r11 = "android:changeTransform:transforms"
            java.lang.Object r2 = r2.get(r11)
            r11 = r2
            androidx.transition.ChangeTransform$e r11 = (androidx.transition.ChangeTransform.C1301e) r11
            android.view.View r2 = r10.f22855b
            r2.setTranslationX(r5)
            r2.setTranslationY(r5)
            java.util.WeakHashMap<android.view.View, s1.p0> r18 = p242s1.C6333d0.f19990a
            p242s1.C6333d0.C6342i.m15106w(r2, r5)
            r2.setScaleX(r6)
            r2.setScaleY(r6)
            r2.setRotationX(r5)
            r2.setRotationY(r5)
            r2.setRotation(r5)
            r5 = 9
            float[] r6 = new float[r5]
            r1.getValues(r6)
            float[] r1 = new float[r5]
            r4.getValues(r1)
            androidx.transition.ChangeTransform$d r15 = new androidx.transition.ChangeTransform$d
            r15.<init>(r2, r6)
            androidx.transition.ChangeTransform$a r14 = f4902D
            z2.c r3 = new z2.c
            float[] r5 = new float[r5]
            r3.<init>(r5)
            r21 = r2
            r5 = 2
            float[][] r2 = new float[r5][]
            r20 = 0
            r2[r20] = r6
            r19 = 1
            r2[r19] = r1
            android.animation.PropertyValuesHolder r2 = android.animation.PropertyValuesHolder.ofObject(r14, r3, r2)
            androidx.transition.PathMotion r3 = r8.f4962v
            r14 = r6[r5]
            r22 = 5
            r6 = r6[r22]
            r23 = r7
            r7 = r1[r5]
            r1 = r1[r22]
            android.graphics.Path r1 = r3.mo5353a(r14, r6, r7, r1)
            androidx.transition.ChangeTransform$b r3 = f4903E
            r6 = 0
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofObject(r3, r6, r1)
            android.animation.PropertyValuesHolder[] r3 = new android.animation.PropertyValuesHolder[r5]
            r6 = 0
            r3[r6] = r2
            r2 = 1
            r3[r2] = r1
            android.animation.ObjectAnimator r14 = android.animation.ObjectAnimator.ofPropertyValuesHolder(r15, r3)
            androidx.transition.a r7 = new androidx.transition.a
            r1 = r7
            r6 = r21
            r2 = r24
            r3 = r16
            r21 = r13
            r13 = 2
            r5 = r6
            r6 = r11
            r13 = r7
            r11 = r23
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r14.addListener(r13)
            r14.addPauseListener(r13)
            r6 = r14
        L_0x0176:
            if (r16 == 0) goto L_0x0447
            if (r6 == 0) goto L_0x0447
            boolean r1 = r8.f4907z
            if (r1 == 0) goto L_0x0447
            android.view.View r1 = r10.f22855b
            java.util.HashMap r2 = r10.f22854a
            java.lang.Object r2 = r2.get(r11)
            android.graphics.Matrix r2 = (android.graphics.Matrix) r2
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>(r2)
            z2.v r2 = p330z2.C7444t.f22865a
            r2.mo23704k(r0, r3)
            int r2 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r2 != r4) goto L_0x0200
            boolean r2 = p330z2.C7428f.f22826f
            r4 = 3
            if (r2 != 0) goto L_0x01ce
            boolean r2 = p330z2.C7428f.f22824d     // Catch:{ NoSuchMethodException -> 0x01ca }
            if (r2 != 0) goto L_0x01ac
            java.lang.String r2 = "android.view.GhostView"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ ClassNotFoundException -> 0x01a9 }
            p330z2.C7428f.f22823c = r2     // Catch:{ ClassNotFoundException -> 0x01a9 }
        L_0x01a9:
            r2 = 1
            p330z2.C7428f.f22824d = r2     // Catch:{ NoSuchMethodException -> 0x01ca }
        L_0x01ac:
            java.lang.Class r2 = p330z2.C7428f.f22823c     // Catch:{ NoSuchMethodException -> 0x01ca }
            java.lang.String r5 = "addGhost"
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ NoSuchMethodException -> 0x01ca }
            java.lang.Class<android.view.View> r11 = android.view.View.class
            r13 = 0
            r7[r13] = r11     // Catch:{ NoSuchMethodException -> 0x01ca }
            java.lang.Class<android.view.ViewGroup> r11 = android.view.ViewGroup.class
            r13 = 1
            r7[r13] = r11     // Catch:{ NoSuchMethodException -> 0x01ca }
            java.lang.Class<android.graphics.Matrix> r11 = android.graphics.Matrix.class
            r14 = 2
            r7[r14] = r11     // Catch:{ NoSuchMethodException -> 0x01ca }
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r7)     // Catch:{ NoSuchMethodException -> 0x01ca }
            p330z2.C7428f.f22825e = r2     // Catch:{ NoSuchMethodException -> 0x01ca }
            r2.setAccessible(r13)     // Catch:{ NoSuchMethodException -> 0x01ca }
        L_0x01ca:
            r2 = 1
            p330z2.C7428f.f22826f = r2
            goto L_0x01cf
        L_0x01ce:
            r2 = 1
        L_0x01cf:
            java.lang.reflect.Method r5 = p330z2.C7428f.f22825e
            if (r5 == 0) goto L_0x01f7
            z2.f r7 = new z2.f     // Catch:{ IllegalAccessException -> 0x01f6, InvocationTargetException -> 0x01eb }
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ IllegalAccessException -> 0x01f6, InvocationTargetException -> 0x01eb }
            r11 = 0
            r4[r11] = r1     // Catch:{ IllegalAccessException -> 0x01f6, InvocationTargetException -> 0x01eb }
            r4[r2] = r0     // Catch:{ IllegalAccessException -> 0x01f6, InvocationTargetException -> 0x01eb }
            r0 = 2
            r4[r0] = r3     // Catch:{ IllegalAccessException -> 0x01f6, InvocationTargetException -> 0x01eb }
            r0 = 0
            java.lang.Object r2 = r5.invoke(r0, r4)     // Catch:{ IllegalAccessException -> 0x01f6, InvocationTargetException -> 0x01eb }
            android.view.View r2 = (android.view.View) r2     // Catch:{ IllegalAccessException -> 0x01f6, InvocationTargetException -> 0x01eb }
            r7.<init>((java.lang.Object) r2)     // Catch:{ IllegalAccessException -> 0x01f6, InvocationTargetException -> 0x01eb }
            r11 = r7
            goto L_0x01f8
        L_0x01eb:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.Throwable r0 = r0.getCause()
            r1.<init>(r0)
            throw r1
        L_0x01f6:
        L_0x01f7:
            r11 = 0
        L_0x01f8:
            r21 = r1
            r22 = r6
            r23 = r12
            goto L_0x0405
        L_0x0200:
            int r2 = p330z2.C7429g.f22830h
            android.view.ViewParent r2 = r1.getParent()
            boolean r2 = r2 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x043f
            int r2 = p330z2.C7427e.f22820d
            int r2 = p330z2.C7434j.ghost_view_holder
            java.lang.Object r2 = r0.getTag(r2)
            z2.e r2 = (p330z2.C7427e) r2
            int r4 = p330z2.C7434j.ghost_view
            java.lang.Object r4 = r1.getTag(r4)
            z2.g r4 = (p330z2.C7429g) r4
            if (r4 == 0) goto L_0x022d
            android.view.ViewParent r5 = r4.getParent()
            z2.e r5 = (p330z2.C7427e) r5
            if (r5 == r2) goto L_0x022d
            int r7 = r4.f22834e
            r5.removeView(r4)
            r11 = 0
            goto L_0x022f
        L_0x022d:
            r11 = r4
            r7 = 0
        L_0x022f:
            if (r11 != 0) goto L_0x03f7
            z2.g r4 = new z2.g
            r4.<init>(r1)
            r4.f22835f = r3
            if (r2 != 0) goto L_0x0240
            z2.e r2 = new z2.e
            r2.<init>(r0)
            goto L_0x0256
        L_0x0240:
            boolean r3 = r2.f22822c
            if (r3 == 0) goto L_0x03ef
            android.view.ViewGroup r3 = r2.f22821b
            android.view.ViewGroupOverlay r3 = r3.getOverlay()
            r3.remove(r2)
            android.view.ViewGroup r3 = r2.f22821b
            android.view.ViewGroupOverlay r3 = r3.getOverlay()
            r3.add(r2)
        L_0x0256:
            p330z2.C7429g.m17077b(r0, r2)
            p330z2.C7429g.m17077b(r0, r4)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.view.View r3 = r4.f22833d
            p330z2.C7427e.m17073a(r3, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r5 = r2.getChildCount()
            r11 = 1
            int r5 = r5 - r11
            r11 = 0
        L_0x0272:
            if (r11 > r5) goto L_0x03d5
            int r13 = r11 + r5
            r14 = 2
            int r13 = r13 / r14
            android.view.View r14 = r2.getChildAt(r13)
            z2.g r14 = (p330z2.C7429g) r14
            android.view.View r14 = r14.f22833d
            p330z2.C7427e.m17073a(r14, r3)
            boolean r14 = r0.isEmpty()
            if (r14 != 0) goto L_0x03b0
            boolean r14 = r3.isEmpty()
            if (r14 != 0) goto L_0x03b0
            r14 = 0
            java.lang.Object r15 = r0.get(r14)
            r16 = r5
            java.lang.Object r5 = r3.get(r14)
            if (r15 == r5) goto L_0x029f
            r25 = r0
            goto L_0x02e2
        L_0x029f:
            int r5 = r0.size()
            int r14 = r3.size()
            int r5 = java.lang.Math.min(r5, r14)
            r14 = 1
        L_0x02ac:
            if (r14 >= r5) goto L_0x039c
            java.lang.Object r15 = r0.get(r14)
            android.view.View r15 = (android.view.View) r15
            java.lang.Object r17 = r3.get(r14)
            r25 = r0
            r0 = r17
            android.view.View r0 = (android.view.View) r0
            if (r15 == r0) goto L_0x0387
            android.view.ViewParent r5 = r15.getParent()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r14 = r5.getChildCount()
            float r17 = r15.getZ()
            float r21 = r0.getZ()
            int r17 = (r17 > r21 ? 1 : (r17 == r21 ? 0 : -1))
            if (r17 == 0) goto L_0x02f8
            float r5 = r15.getZ()
            float r0 = r0.getZ()
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x02ed
        L_0x02e2:
            r21 = r1
        L_0x02e4:
            r22 = r6
            r23 = r12
            r6 = 2
            r20 = 0
            goto L_0x03b8
        L_0x02ed:
            r21 = r1
            r22 = r6
            r23 = r12
            r6 = 2
            r20 = 0
            goto L_0x03ae
        L_0x02f8:
            r8 = 0
        L_0x02f9:
            if (r8 >= r14) goto L_0x02e2
            r17 = r14
            int r14 = android.os.Build.VERSION.SDK_INT
            r22 = r6
            r6 = 29
            if (r14 < r6) goto L_0x0312
            int r6 = r5.getChildDrawingOrder(r8)
            r21 = r1
            r1 = r6
            r23 = r12
            r6 = 2
            r20 = 0
            goto L_0x036f
        L_0x0312:
            boolean r6 = p330z2.C7443s.f22864c
            if (r6 != 0) goto L_0x033e
            java.lang.Class<android.view.ViewGroup> r6 = android.view.ViewGroup.class
            java.lang.String r14 = "getChildDrawingOrder"
            r21 = r1
            r10 = 2
            java.lang.Class[] r1 = new java.lang.Class[r10]     // Catch:{ NoSuchMethodException -> 0x0334 }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x0334 }
            r20 = 0
            r1[r20] = r10     // Catch:{ NoSuchMethodException -> 0x0334 }
            r23 = r12
            r12 = 1
            r1[r12] = r10     // Catch:{ NoSuchMethodException -> 0x033a }
            java.lang.reflect.Method r1 = r6.getDeclaredMethod(r14, r1)     // Catch:{ NoSuchMethodException -> 0x033a }
            p330z2.C7443s.f22863b = r1     // Catch:{ NoSuchMethodException -> 0x033a }
            r1.setAccessible(r12)     // Catch:{ NoSuchMethodException -> 0x033a }
            goto L_0x033a
        L_0x0334:
            r23 = r12
            goto L_0x033a
        L_0x0337:
            r21 = r1
            goto L_0x0334
        L_0x033a:
            r1 = 1
            p330z2.C7443s.f22864c = r1
            goto L_0x0342
        L_0x033e:
            r21 = r1
            r23 = r12
        L_0x0342:
            java.lang.reflect.Method r1 = p330z2.C7443s.f22863b
            if (r1 == 0) goto L_0x036b
            r6 = 2
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0367 }
            int r12 = r5.getChildCount()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0367 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0367 }
            r20 = 0
            r10[r20] = r12     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0369 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0369 }
            r14 = 1
            r10[r14] = r12     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0369 }
            java.lang.Object r1 = r1.invoke(r5, r10)     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0369 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0369 }
            int r1 = r1.intValue()     // Catch:{ IllegalAccessException | InvocationTargetException -> 0x0369 }
            goto L_0x036f
        L_0x0367:
            r20 = 0
        L_0x0369:
            goto L_0x036e
        L_0x036b:
            r6 = 2
            r20 = 0
        L_0x036e:
            r1 = r8
        L_0x036f:
            android.view.View r1 = r5.getChildAt(r1)
            if (r1 != r15) goto L_0x0376
            goto L_0x03ae
        L_0x0376:
            if (r1 != r0) goto L_0x0379
            goto L_0x03b8
        L_0x0379:
            int r8 = r8 + 1
            r10 = r27
            r14 = r17
            r1 = r21
            r6 = r22
            r12 = r23
            goto L_0x02f9
        L_0x0387:
            r21 = r1
            r22 = r6
            r23 = r12
            r6 = 2
            r20 = 0
            int r14 = r14 + 1
            r8 = r24
            r0 = r25
            r10 = r27
            r6 = r22
            goto L_0x02ac
        L_0x039c:
            r25 = r0
            r21 = r1
            r22 = r6
            r23 = r12
            r6 = 2
            r20 = 0
            int r0 = r3.size()
            if (r0 != r5) goto L_0x03ae
            goto L_0x03b8
        L_0x03ae:
            r0 = 0
            goto L_0x03b9
        L_0x03b0:
            r25 = r0
            r21 = r1
            r16 = r5
            goto L_0x02e4
        L_0x03b8:
            r0 = 1
        L_0x03b9:
            if (r0 == 0) goto L_0x03c1
            int r13 = r13 + 1
            r11 = r13
            r5 = r16
            goto L_0x03c4
        L_0x03c1:
            int r13 = r13 + -1
            r5 = r13
        L_0x03c4:
            r3.clear()
            r8 = r24
            r0 = r25
            r10 = r27
            r1 = r21
            r6 = r22
            r12 = r23
            goto L_0x0272
        L_0x03d5:
            r21 = r1
            r22 = r6
            r23 = r12
            if (r11 < 0) goto L_0x03e8
            int r0 = r2.getChildCount()
            if (r11 < r0) goto L_0x03e4
            goto L_0x03e8
        L_0x03e4:
            r2.addView(r4, r11)
            goto L_0x03eb
        L_0x03e8:
            r2.addView(r4)
        L_0x03eb:
            r4.f22834e = r7
            r11 = r4
            goto L_0x03ff
        L_0x03ef:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "This GhostViewHolder is detached!"
            r0.<init>(r1)
            throw r0
        L_0x03f7:
            r21 = r1
            r22 = r6
            r23 = r12
            r11.f22835f = r3
        L_0x03ff:
            int r0 = r11.f22834e
            r1 = 1
            int r0 = r0 + r1
            r11.f22834e = r0
        L_0x0405:
            if (r11 != 0) goto L_0x0408
            goto L_0x0454
        L_0x0408:
            java.util.HashMap r0 = r9.f22854a
            r1 = r23
            java.lang.Object r0 = r0.get(r1)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            android.view.View r1 = r9.f22855b
            r11.mo23647a(r0, r1)
            r0 = r24
        L_0x0419:
            androidx.transition.TransitionSet r1 = r0.f4950j
            if (r1 == 0) goto L_0x041f
            r0 = r1
            goto L_0x0419
        L_0x041f:
            androidx.transition.ChangeTransform$c r1 = new androidx.transition.ChangeTransform$c
            r2 = r21
            r1.<init>(r2, r11)
            r0.mo5411a(r1)
            boolean r0 = f4904F
            if (r0 == 0) goto L_0x0454
            android.view.View r0 = r9.f22855b
            r1 = r27
            android.view.View r1 = r1.f22855b
            if (r0 == r1) goto L_0x0439
            r1 = 0
            p330z2.C7444t.m17083b(r0, r1)
        L_0x0439:
            r0 = 1065353216(0x3f800000, float:1.0)
            p330z2.C7444t.m17083b(r2, r0)
            goto L_0x0454
        L_0x043f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Ghosted views must be parented by a ViewGroup"
            r0.<init>(r1)
            throw r0
        L_0x0447:
            r22 = r6
            boolean r0 = f4904F
            if (r0 != 0) goto L_0x0454
            android.view.View r0 = r9.f22855b
            r1 = r21
            r1.endViewTransition(r0)
        L_0x0454:
            return r22
        L_0x0455:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeTransform.mo5358k(android.view.ViewGroup, z2.q, z2.q):android.animation.Animator");
    }

    /* renamed from: q */
    public final String[] mo5359q() {
        return f4901C;
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z;
        boolean z2 = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7438n.f22846e);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        if (!C5256j.m13277e(xmlPullParser, "reparentWithOverlay")) {
            z = true;
        } else {
            z = obtainStyledAttributes.getBoolean(1, true);
        }
        this.f4907z = z;
        this.f4905A = C5256j.m13277e(xmlPullParser, "reparent") ? obtainStyledAttributes.getBoolean(0, true) : z2;
        obtainStyledAttributes.recycle();
    }
}
