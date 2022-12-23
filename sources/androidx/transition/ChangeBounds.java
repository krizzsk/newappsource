package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import p116i1.C5256j;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p330z2.C7435k;
import p330z2.C7438n;
import p330z2.C7441q;
import p330z2.C7443s;
import p330z2.C7444t;

public class ChangeBounds extends Transition {

    /* renamed from: A */
    public static final String[] f4869A = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: B */
    public static final C1284b f4870B = new C1284b(PointF.class);

    /* renamed from: C */
    public static final C1285c f4871C = new C1285c(PointF.class);

    /* renamed from: D */
    public static final C1286d f4872D = new C1286d(PointF.class);

    /* renamed from: E */
    public static final C1287e f4873E = new C1287e(PointF.class);

    /* renamed from: F */
    public static final C1288f f4874F = new C1288f(PointF.class);

    /* renamed from: G */
    public static C7435k f4875G = new C7435k();

    /* renamed from: z */
    public boolean f4876z = false;

    /* renamed from: androidx.transition.ChangeBounds$a */
    public static class C1283a extends Property<Drawable, PointF> {

        /* renamed from: a */
        public Rect f4877a = new Rect();

        public C1283a(Class cls) {
            super(cls, "boundsOrigin");
        }

        public final Object get(Object obj) {
            ((Drawable) obj).copyBounds(this.f4877a);
            Rect rect = this.f4877a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        public final void set(Object obj, Object obj2) {
            Drawable drawable = (Drawable) obj;
            PointF pointF = (PointF) obj2;
            drawable.copyBounds(this.f4877a);
            this.f4877a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f4877a);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$b */
    public static class C1284b extends Property<C1292j, PointF> {
        public C1284b(Class cls) {
            super(cls, "topLeft");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            C1292j jVar = (C1292j) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            C1292j jVar = (C1292j) obj;
            PointF pointF = (PointF) obj2;
            jVar.getClass();
            jVar.f4887a = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            jVar.f4888b = round;
            int i = jVar.f4892f + 1;
            jVar.f4892f = i;
            if (i == jVar.f4893g) {
                C7444t.m17082a(jVar.f4891e, jVar.f4887a, round, jVar.f4889c, jVar.f4890d);
                jVar.f4892f = 0;
                jVar.f4893g = 0;
            }
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$c */
    public static class C1285c extends Property<C1292j, PointF> {
        public C1285c(Class cls) {
            super(cls, "bottomRight");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            C1292j jVar = (C1292j) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            C1292j jVar = (C1292j) obj;
            PointF pointF = (PointF) obj2;
            jVar.getClass();
            jVar.f4889c = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            jVar.f4890d = round;
            int i = jVar.f4893g + 1;
            jVar.f4893g = i;
            if (jVar.f4892f == i) {
                C7444t.m17082a(jVar.f4891e, jVar.f4887a, jVar.f4888b, jVar.f4889c, round);
                jVar.f4892f = 0;
                jVar.f4893g = 0;
            }
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$d */
    public static class C1286d extends Property<View, PointF> {
        public C1286d(Class cls) {
            super(cls, "bottomRight");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            C7444t.m17082a(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$e */
    public static class C1287e extends Property<View, PointF> {
        public C1287e(Class cls) {
            super(cls, "topLeft");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            C7444t.m17082a(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$f */
    public static class C1288f extends Property<View, PointF> {
        public C1288f(Class cls) {
            super(cls, "position");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C7444t.m17082a(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$g */
    public class C1289g extends AnimatorListenerAdapter {
        private C1292j mViewBounds;

        public C1289g(C1292j jVar) {
            this.mViewBounds = jVar;
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$h */
    public class C1290h extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f4878a;

        /* renamed from: b */
        public final /* synthetic */ View f4879b;

        /* renamed from: c */
        public final /* synthetic */ Rect f4880c;

        /* renamed from: d */
        public final /* synthetic */ int f4881d;

        /* renamed from: e */
        public final /* synthetic */ int f4882e;

        /* renamed from: f */
        public final /* synthetic */ int f4883f;

        /* renamed from: g */
        public final /* synthetic */ int f4884g;

        public C1290h(View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f4879b = view;
            this.f4880c = rect;
            this.f4881d = i;
            this.f4882e = i2;
            this.f4883f = i3;
            this.f4884g = i4;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f4878a = true;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f4878a) {
                View view = this.f4879b;
                Rect rect = this.f4880c;
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6339f.m15073c(view, rect);
                C7444t.m17082a(this.f4879b, this.f4881d, this.f4882e, this.f4883f, this.f4884g);
            }
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$i */
    public class C1291i extends C1327f {

        /* renamed from: a */
        public boolean f4885a = false;

        /* renamed from: b */
        public final /* synthetic */ ViewGroup f4886b;

        public C1291i(ViewGroup viewGroup) {
            this.f4886b = viewGroup;
        }

        /* renamed from: a */
        public final void mo5374a() {
            C7443s.m17081a(this.f4886b, false);
        }

        /* renamed from: b */
        public final void mo5375b() {
            C7443s.m17081a(this.f4886b, false);
            this.f4885a = true;
        }

        /* renamed from: c */
        public final void mo5376c() {
            C7443s.m17081a(this.f4886b, true);
        }

        /* renamed from: d */
        public final void mo5377d(Transition transition) {
            if (!this.f4885a) {
                C7443s.m17081a(this.f4886b, false);
            }
            transition.mo5427w(this);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$j */
    public static class C1292j {

        /* renamed from: a */
        public int f4887a;

        /* renamed from: b */
        public int f4888b;

        /* renamed from: c */
        public int f4889c;

        /* renamed from: d */
        public int f4890d;

        /* renamed from: e */
        public View f4891e;

        /* renamed from: f */
        public int f4892f;

        /* renamed from: g */
        public int f4893g;

        public C1292j(View view) {
            this.f4891e = view;
        }
    }

    static {
        new C1283a(PointF.class);
    }

    public ChangeBounds() {
    }

    /* renamed from: J */
    public final void mo5355J(C7441q qVar) {
        View view = qVar.f22855b;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6340g.m15076c(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            qVar.f22854a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            qVar.f22854a.put("android:changeBounds:parent", qVar.f22855b.getParent());
            if (this.f4876z) {
                qVar.f22854a.put("android:changeBounds:clip", C6333d0.C6339f.m15071a(view));
            }
        }
    }

    /* renamed from: d */
    public final void mo5356d(C7441q qVar) {
        mo5355J(qVar);
    }

    /* renamed from: g */
    public final void mo5357g(C7441q qVar) {
        mo5355J(qVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ac  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator mo5358k(android.view.ViewGroup r20, p330z2.C7441q r21, p330z2.C7441q r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r2 = r22
            if (r1 == 0) goto L_0x01c2
            if (r2 != 0) goto L_0x000c
            goto L_0x01c2
        L_0x000c:
            java.util.HashMap r4 = r1.f22854a
            java.util.HashMap r5 = r2.f22854a
            java.lang.String r6 = "android:changeBounds:parent"
            java.lang.Object r4 = r4.get(r6)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            java.lang.Object r5 = r5.get(r6)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r4 == 0) goto L_0x01c0
            if (r5 != 0) goto L_0x0024
            goto L_0x01c0
        L_0x0024:
            android.view.View r4 = r2.f22855b
            java.util.HashMap r5 = r1.f22854a
            java.lang.String r6 = "android:changeBounds:bounds"
            java.lang.Object r5 = r5.get(r6)
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            java.util.HashMap r7 = r2.f22854a
            java.lang.Object r6 = r7.get(r6)
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            int r7 = r5.left
            int r9 = r6.left
            int r8 = r5.top
            int r10 = r6.top
            int r11 = r5.right
            int r12 = r6.right
            int r5 = r5.bottom
            int r13 = r6.bottom
            int r6 = r11 - r7
            int r14 = r5 - r8
            int r15 = r12 - r9
            int r3 = r13 - r10
            java.util.HashMap r1 = r1.f22854a
            r16 = r4
            java.lang.String r4 = "android:changeBounds:clip"
            java.lang.Object r1 = r1.get(r4)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            java.util.HashMap r2 = r2.f22854a
            java.lang.Object r2 = r2.get(r4)
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            if (r6 == 0) goto L_0x0068
            if (r14 != 0) goto L_0x006c
        L_0x0068:
            if (r15 == 0) goto L_0x007d
            if (r3 == 0) goto L_0x007d
        L_0x006c:
            if (r7 != r9) goto L_0x0074
            if (r8 == r10) goto L_0x0071
            goto L_0x0074
        L_0x0071:
            r17 = 0
            goto L_0x0076
        L_0x0074:
            r17 = 1
        L_0x0076:
            if (r11 != r12) goto L_0x007a
            if (r5 == r13) goto L_0x007f
        L_0x007a:
            int r17 = r17 + 1
            goto L_0x007f
        L_0x007d:
            r17 = 0
        L_0x007f:
            if (r1 == 0) goto L_0x0087
            boolean r18 = r1.equals(r2)
            if (r18 == 0) goto L_0x008b
        L_0x0087:
            if (r1 != 0) goto L_0x008d
            if (r2 == 0) goto L_0x008d
        L_0x008b:
            int r17 = r17 + 1
        L_0x008d:
            r4 = r17
            if (r4 <= 0) goto L_0x01be
            r17 = r2
            boolean r2 = r0.f4876z
            r18 = r1
            r1 = 2
            if (r2 != 0) goto L_0x0122
            r2 = r16
            p330z2.C7444t.m17082a(r2, r7, r8, r11, r5)
            if (r4 != r1) goto L_0x00f7
            if (r6 != r15) goto L_0x00b7
            if (r14 != r3) goto L_0x00b7
            androidx.transition.PathMotion r1 = r0.f4962v
            float r3 = (float) r7
            float r4 = (float) r8
            float r5 = (float) r9
            float r6 = (float) r10
            android.graphics.Path r1 = r1.mo5353a(r3, r4, r5, r6)
            androidx.transition.ChangeBounds$f r3 = f4874F
            r4 = 0
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofObject(r2, r3, r4, r1)
            goto L_0x011f
        L_0x00b7:
            androidx.transition.ChangeBounds$j r3 = new androidx.transition.ChangeBounds$j
            r3.<init>(r2)
            androidx.transition.PathMotion r4 = r0.f4962v
            float r6 = (float) r7
            float r7 = (float) r8
            float r8 = (float) r9
            float r9 = (float) r10
            android.graphics.Path r4 = r4.mo5353a(r6, r7, r8, r9)
            androidx.transition.ChangeBounds$b r6 = f4870B
            r7 = 0
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofObject(r3, r6, r7, r4)
            androidx.transition.PathMotion r6 = r0.f4962v
            float r8 = (float) r11
            float r5 = (float) r5
            float r9 = (float) r12
            float r10 = (float) r13
            android.graphics.Path r5 = r6.mo5353a(r8, r5, r9, r10)
            androidx.transition.ChangeBounds$c r6 = f4871C
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofObject(r3, r6, r7, r5)
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r7 = 0
            r1[r7] = r4
            r4 = 1
            r1[r4] = r5
            r6.playTogether(r1)
            androidx.transition.ChangeBounds$g r1 = new androidx.transition.ChangeBounds$g
            r1.<init>(r3)
            r6.addListener(r1)
            r1 = r6
            goto L_0x011f
        L_0x00f7:
            if (r7 != r9) goto L_0x010e
            if (r8 == r10) goto L_0x00fc
            goto L_0x010e
        L_0x00fc:
            androidx.transition.PathMotion r1 = r0.f4962v
            float r3 = (float) r11
            float r4 = (float) r5
            float r5 = (float) r12
            float r6 = (float) r13
            android.graphics.Path r1 = r1.mo5353a(r3, r4, r5, r6)
            androidx.transition.ChangeBounds$d r3 = f4872D
            r4 = 0
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofObject(r2, r3, r4, r1)
            goto L_0x011f
        L_0x010e:
            r4 = 0
            androidx.transition.PathMotion r1 = r0.f4962v
            float r3 = (float) r7
            float r5 = (float) r8
            float r6 = (float) r9
            float r7 = (float) r10
            android.graphics.Path r1 = r1.mo5353a(r3, r5, r6, r7)
            androidx.transition.ChangeBounds$e r3 = f4873E
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofObject(r2, r3, r4, r1)
        L_0x011f:
            r4 = 1
            goto L_0x01a4
        L_0x0122:
            r2 = r16
            int r4 = java.lang.Math.max(r6, r15)
            int r5 = java.lang.Math.max(r14, r3)
            int r4 = r4 + r7
            int r5 = r5 + r8
            p330z2.C7444t.m17082a(r2, r7, r8, r4, r5)
            if (r7 != r9) goto L_0x0138
            if (r8 == r10) goto L_0x0136
            goto L_0x0138
        L_0x0136:
            r4 = 0
            goto L_0x0149
        L_0x0138:
            androidx.transition.PathMotion r4 = r0.f4962v
            float r5 = (float) r7
            float r7 = (float) r8
            float r8 = (float) r9
            float r11 = (float) r10
            android.graphics.Path r4 = r4.mo5353a(r5, r7, r8, r11)
            androidx.transition.ChangeBounds$f r5 = f4874F
            r7 = 0
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofObject(r2, r5, r7, r4)
        L_0x0149:
            if (r18 != 0) goto L_0x0152
            android.graphics.Rect r5 = new android.graphics.Rect
            r7 = 0
            r5.<init>(r7, r7, r6, r14)
            goto L_0x0155
        L_0x0152:
            r7 = 0
            r5 = r18
        L_0x0155:
            if (r17 != 0) goto L_0x015d
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>(r7, r7, r15, r3)
            goto L_0x015f
        L_0x015d:
            r6 = r17
        L_0x015f:
            boolean r3 = r5.equals(r6)
            if (r3 != 0) goto L_0x0188
            java.util.WeakHashMap<android.view.View, s1.p0> r3 = p242s1.C6333d0.f19990a
            p242s1.C6333d0.C6339f.m15073c(r2, r5)
            z2.k r3 = f4875G
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r8[r7] = r5
            r5 = 1
            r8[r5] = r6
            java.lang.String r5 = "clipBounds"
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofObject(r2, r5, r3, r8)
            androidx.transition.ChangeBounds$h r5 = new androidx.transition.ChangeBounds$h
            r6 = r5
            r7 = r2
            r8 = r17
            r11 = r12
            r12 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r3.addListener(r5)
            goto L_0x0189
        L_0x0188:
            r3 = 0
        L_0x0189:
            boolean r5 = androidx.transition.C1331h.f5016a
            if (r4 != 0) goto L_0x018f
            r1 = r3
            goto L_0x011f
        L_0x018f:
            if (r3 != 0) goto L_0x0193
            r1 = r4
            goto L_0x011f
        L_0x0193:
            android.animation.AnimatorSet r5 = new android.animation.AnimatorSet
            r5.<init>()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r6 = 0
            r1[r6] = r4
            r4 = 1
            r1[r4] = r3
            r5.playTogether(r1)
            r1 = r5
        L_0x01a4:
            android.view.ViewParent r3 = r2.getParent()
            boolean r3 = r3 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x01bd
            android.view.ViewParent r2 = r2.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            p330z2.C7443s.m17081a(r2, r4)
            androidx.transition.ChangeBounds$i r3 = new androidx.transition.ChangeBounds$i
            r3.<init>(r2)
            r0.mo5411a(r3)
        L_0x01bd:
            return r1
        L_0x01be:
            r1 = 0
            return r1
        L_0x01c0:
            r1 = 0
            return r1
        L_0x01c2:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeBounds.mo5358k(android.view.ViewGroup, z2.q, z2.q):android.animation.Animator");
    }

    /* renamed from: q */
    public final String[] mo5359q() {
        return f4869A;
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7438n.f22843b);
        z = C5256j.m13277e((XmlResourceParser) attributeSet, "resizeClip") ? obtainStyledAttributes.getBoolean(0, false) : z;
        obtainStyledAttributes.recycle();
        this.f4876z = z;
    }
}
