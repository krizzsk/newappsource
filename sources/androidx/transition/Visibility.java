package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import p116i1.C5256j;
import p330z2.C7438n;
import p330z2.C7441q;
import p330z2.C7443s;
import p330z2.C7444t;

public abstract class Visibility extends Transition {

    /* renamed from: A */
    public static final String[] f4975A = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: z */
    public int f4976z = 3;

    /* renamed from: androidx.transition.Visibility$a */
    public static class C1318a extends AnimatorListenerAdapter implements Transition.C1315d {

        /* renamed from: a */
        public final View f4977a;

        /* renamed from: b */
        public final int f4978b;

        /* renamed from: c */
        public final ViewGroup f4979c;

        /* renamed from: d */
        public final boolean f4980d;

        /* renamed from: e */
        public boolean f4981e;

        /* renamed from: f */
        public boolean f4982f = false;

        public C1318a(View view, int i) {
            this.f4977a = view;
            this.f4978b = i;
            this.f4979c = (ViewGroup) view.getParent();
            this.f4980d = true;
            mo5438f(true);
        }

        /* renamed from: a */
        public final void mo5374a() {
            mo5438f(false);
        }

        /* renamed from: b */
        public final void mo5375b() {
        }

        /* renamed from: c */
        public final void mo5376c() {
            mo5438f(true);
        }

        /* renamed from: d */
        public final void mo5377d(Transition transition) {
            if (!this.f4982f) {
                C7444t.m17084c(this.f4978b, this.f4977a);
                ViewGroup viewGroup = this.f4979c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            mo5438f(false);
            transition.mo5427w(this);
        }

        /* renamed from: e */
        public final void mo5432e() {
        }

        /* renamed from: f */
        public final void mo5438f(boolean z) {
            ViewGroup viewGroup;
            if (this.f4980d && this.f4981e != z && (viewGroup = this.f4979c) != null) {
                this.f4981e = z;
                C7443s.m17081a(viewGroup, z);
            }
        }

        public final void onAnimationCancel(Animator animator) {
            this.f4982f = true;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f4982f) {
                C7444t.m17084c(this.f4978b, this.f4977a);
                ViewGroup viewGroup = this.f4979c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            mo5438f(false);
        }

        public final void onAnimationPause(Animator animator) {
            if (!this.f4982f) {
                C7444t.m17084c(this.f4978b, this.f4977a);
            }
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationResume(Animator animator) {
            if (!this.f4982f) {
                C7444t.m17084c(0, this.f4977a);
            }
        }

        public final void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: androidx.transition.Visibility$b */
    public static class C1319b {

        /* renamed from: a */
        public boolean f4983a;

        /* renamed from: b */
        public boolean f4984b;

        /* renamed from: c */
        public int f4985c;

        /* renamed from: d */
        public int f4986d;

        /* renamed from: e */
        public ViewGroup f4987e;

        /* renamed from: f */
        public ViewGroup f4988f;
    }

    public Visibility() {
    }

    /* renamed from: K */
    public static C1319b m3588K(C7441q qVar, C7441q qVar2) {
        C1319b bVar = new C1319b();
        bVar.f4983a = false;
        bVar.f4984b = false;
        if (qVar == null || !qVar.f22854a.containsKey("android:visibility:visibility")) {
            bVar.f4985c = -1;
            bVar.f4987e = null;
        } else {
            bVar.f4985c = ((Integer) qVar.f22854a.get("android:visibility:visibility")).intValue();
            bVar.f4987e = (ViewGroup) qVar.f22854a.get("android:visibility:parent");
        }
        if (qVar2 == null || !qVar2.f22854a.containsKey("android:visibility:visibility")) {
            bVar.f4986d = -1;
            bVar.f4988f = null;
        } else {
            bVar.f4986d = ((Integer) qVar2.f22854a.get("android:visibility:visibility")).intValue();
            bVar.f4988f = (ViewGroup) qVar2.f22854a.get("android:visibility:parent");
        }
        if (qVar != null && qVar2 != null) {
            int i = bVar.f4985c;
            int i2 = bVar.f4986d;
            if (i == i2 && bVar.f4987e == bVar.f4988f) {
                return bVar;
            }
            if (i != i2) {
                if (i == 0) {
                    bVar.f4984b = false;
                    bVar.f4983a = true;
                } else if (i2 == 0) {
                    bVar.f4984b = true;
                    bVar.f4983a = true;
                }
            } else if (bVar.f4988f == null) {
                bVar.f4984b = false;
                bVar.f4983a = true;
            } else if (bVar.f4987e == null) {
                bVar.f4984b = true;
                bVar.f4983a = true;
            }
        } else if (qVar == null && bVar.f4986d == 0) {
            bVar.f4984b = true;
            bVar.f4983a = true;
        } else if (qVar2 == null && bVar.f4985c == 0) {
            bVar.f4984b = false;
            bVar.f4983a = true;
        }
        return bVar;
    }

    /* renamed from: J */
    public final void mo5437J(C7441q qVar) {
        qVar.f22854a.put("android:visibility:visibility", Integer.valueOf(qVar.f22855b.getVisibility()));
        qVar.f22854a.put("android:visibility:parent", qVar.f22855b.getParent());
        int[] iArr = new int[2];
        qVar.f22855b.getLocationOnScreen(iArr);
        qVar.f22854a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: L */
    public Animator mo5393L(ViewGroup viewGroup, View view, C7441q qVar, C7441q qVar2) {
        return null;
    }

    /* renamed from: M */
    public Animator mo5394M(ViewGroup viewGroup, View view, C7441q qVar) {
        return null;
    }

    /* renamed from: d */
    public void mo5356d(C7441q qVar) {
        mo5437J(qVar);
    }

    /* renamed from: g */
    public void mo5357g(C7441q qVar) {
        mo5437J(qVar);
    }

    /* JADX WARNING: type inference failed for: r16v4, types: [android.view.ViewParent] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
        if (m3588K(mo5421o(r4, false), mo5422r(r4, false)).f4983a != false) goto L_0x0048;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01cc  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator mo5358k(android.view.ViewGroup r21, p330z2.C7441q r22, p330z2.C7441q r23) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r23
            androidx.transition.Visibility$b r4 = m3588K(r22, r23)
            boolean r5 = r4.f4983a
            if (r5 == 0) goto L_0x0289
            android.view.ViewGroup r5 = r4.f4987e
            if (r5 != 0) goto L_0x0018
            android.view.ViewGroup r5 = r4.f4988f
            if (r5 == 0) goto L_0x0289
        L_0x0018:
            boolean r5 = r4.f4984b
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x004a
            int r4 = r0.f4976z
            r4 = r4 & r7
            if (r4 != r7) goto L_0x0048
            if (r3 != 0) goto L_0x0026
            goto L_0x0048
        L_0x0026:
            if (r2 != 0) goto L_0x0041
            android.view.View r4 = r3.f22855b
            android.view.ViewParent r4 = r4.getParent()
            android.view.View r4 = (android.view.View) r4
            z2.q r5 = r0.mo5421o(r4, r8)
            z2.q r4 = r0.mo5422r(r4, r8)
            androidx.transition.Visibility$b r4 = m3588K(r5, r4)
            boolean r4 = r4.f4983a
            if (r4 == 0) goto L_0x0041
            goto L_0x0048
        L_0x0041:
            android.view.View r4 = r3.f22855b
            android.animation.Animator r6 = r0.mo5393L(r1, r4, r2, r3)
            goto L_0x0049
        L_0x0048:
            r6 = 0
        L_0x0049:
            return r6
        L_0x004a:
            int r4 = r4.f4986d
            int r5 = r0.f4976z
            r9 = 2
            r5 = r5 & r9
            if (r5 == r9) goto L_0x0053
            goto L_0x0055
        L_0x0053:
            if (r2 != 0) goto L_0x0058
        L_0x0055:
            r2 = r0
            goto L_0x0287
        L_0x0058:
            android.view.View r5 = r2.f22855b
            if (r3 == 0) goto L_0x005f
            android.view.View r3 = r3.f22855b
            goto L_0x0060
        L_0x005f:
            r3 = 0
        L_0x0060:
            int r10 = p330z2.C7434j.save_overlay_view
            java.lang.Object r11 = r5.getTag(r10)
            android.view.View r11 = (android.view.View) r11
            if (r11 == 0) goto L_0x0071
            r18 = r4
            r19 = r10
            r3 = 0
            goto L_0x0205
        L_0x0071:
            if (r3 == 0) goto L_0x0082
            android.view.ViewParent r11 = r3.getParent()
            if (r11 != 0) goto L_0x007a
            goto L_0x0082
        L_0x007a:
            r11 = 4
            if (r4 != r11) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            if (r5 != r3) goto L_0x0088
        L_0x0080:
            r11 = 0
            goto L_0x0086
        L_0x0082:
            if (r3 == 0) goto L_0x0088
            r11 = r3
            r3 = 0
        L_0x0086:
            r12 = 0
            goto L_0x008b
        L_0x0088:
            r3 = 0
            r11 = 0
            r12 = 1
        L_0x008b:
            if (r12 == 0) goto L_0x01fc
            android.view.ViewParent r12 = r5.getParent()
            if (r12 != 0) goto L_0x009c
            r23 = r3
            r18 = r4
            r11 = r5
        L_0x0098:
            r19 = r10
            goto L_0x0202
        L_0x009c:
            android.view.ViewParent r12 = r5.getParent()
            boolean r12 = r12 instanceof android.view.View
            if (r12 == 0) goto L_0x01fc
            android.view.ViewParent r12 = r5.getParent()
            android.view.View r12 = (android.view.View) r12
            z2.q r13 = r0.mo5422r(r12, r7)
            z2.q r14 = r0.mo5421o(r12, r7)
            androidx.transition.Visibility$b r13 = m3588K(r13, r14)
            boolean r13 = r13.f4983a
            if (r13 != 0) goto L_0x01e5
            boolean r11 = androidx.transition.C1331h.f5016a
            android.graphics.Matrix r11 = new android.graphics.Matrix
            r11.<init>()
            int r13 = r12.getScrollX()
            int r13 = -r13
            float r13 = (float) r13
            int r12 = r12.getScrollY()
            int r12 = -r12
            float r12 = (float) r12
            r11.setTranslate(r13, r12)
            z2.v r12 = p330z2.C7444t.f22865a
            r12.mo23703j(r5, r11)
            r12.mo23704k(r1, r11)
            android.graphics.RectF r12 = new android.graphics.RectF
            int r13 = r5.getWidth()
            float r13 = (float) r13
            int r14 = r5.getHeight()
            float r14 = (float) r14
            r15 = 0
            r12.<init>(r15, r15, r13, r14)
            r11.mapRect(r12)
            float r13 = r12.left
            int r13 = java.lang.Math.round(r13)
            float r14 = r12.top
            int r14 = java.lang.Math.round(r14)
            float r15 = r12.right
            int r15 = java.lang.Math.round(r15)
            float r6 = r12.bottom
            int r6 = java.lang.Math.round(r6)
            android.widget.ImageView r9 = new android.widget.ImageView
            android.content.Context r8 = r5.getContext()
            r9.<init>(r8)
            android.widget.ImageView$ScaleType r8 = android.widget.ImageView.ScaleType.CENTER_CROP
            r9.setScaleType(r8)
            boolean r8 = androidx.transition.C1331h.f5016a
            if (r8 == 0) goto L_0x011f
            boolean r8 = r5.isAttachedToWindow()
            r8 = r8 ^ r7
            boolean r16 = r21.isAttachedToWindow()
            goto L_0x0122
        L_0x011f:
            r8 = 0
            r16 = 0
        L_0x0122:
            boolean r17 = androidx.transition.C1331h.f5017b
            if (r17 == 0) goto L_0x014b
            if (r8 == 0) goto L_0x014b
            if (r16 != 0) goto L_0x0133
            r23 = r3
            r18 = r4
            r19 = r10
            r0 = 0
            goto L_0x01ca
        L_0x0133:
            android.view.ViewParent r16 = r5.getParent()
            r7 = r16
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            int r16 = r7.indexOfChild(r5)
            r23 = r3
            android.view.ViewGroupOverlay r3 = r21.getOverlay()
            r3.add(r5)
            r3 = r16
            goto L_0x014f
        L_0x014b:
            r23 = r3
            r3 = 0
            r7 = 0
        L_0x014f:
            float r16 = r12.width()
            r18 = r4
            int r4 = java.lang.Math.round(r16)
            float r16 = r12.height()
            r19 = r10
            int r10 = java.lang.Math.round(r16)
            if (r4 <= 0) goto L_0x01bb
            if (r10 <= 0) goto L_0x01bb
            r16 = 1233125376(0x49800000, float:1048576.0)
            int r0 = r4 * r10
            float r0 = (float) r0
            float r0 = r16 / r0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = java.lang.Math.min(r2, r0)
            float r2 = (float) r4
            float r2 = r2 * r0
            int r2 = java.lang.Math.round(r2)
            float r4 = (float) r10
            float r4 = r4 * r0
            int r4 = java.lang.Math.round(r4)
            float r10 = r12.left
            float r10 = -r10
            float r12 = r12.top
            float r12 = -r12
            r11.postTranslate(r10, r12)
            r11.postScale(r0, r0)
            boolean r0 = androidx.transition.C1331h.f5018c
            if (r0 == 0) goto L_0x01a9
            android.graphics.Picture r0 = new android.graphics.Picture
            r0.<init>()
            android.graphics.Canvas r2 = r0.beginRecording(r2, r4)
            r2.concat(r11)
            r5.draw(r2)
            r0.endRecording()
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0)
            goto L_0x01bc
        L_0x01a9:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r2, r4, r0)
            android.graphics.Canvas r2 = new android.graphics.Canvas
            r2.<init>(r0)
            r2.concat(r11)
            r5.draw(r2)
            goto L_0x01bc
        L_0x01bb:
            r0 = 0
        L_0x01bc:
            if (r17 == 0) goto L_0x01ca
            if (r8 == 0) goto L_0x01ca
            android.view.ViewGroupOverlay r2 = r21.getOverlay()
            r2.remove(r5)
            r7.addView(r5, r3)
        L_0x01ca:
            if (r0 == 0) goto L_0x01cf
            r9.setImageBitmap(r0)
        L_0x01cf:
            int r0 = r15 - r13
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r3 = r6 - r14
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            r9.measure(r0, r2)
            r9.layout(r13, r14, r15, r6)
            r11 = r9
            goto L_0x0202
        L_0x01e5:
            r23 = r3
            r18 = r4
            r19 = r10
            int r0 = r12.getId()
            android.view.ViewParent r2 = r12.getParent()
            if (r2 != 0) goto L_0x0202
            r2 = -1
            if (r0 == r2) goto L_0x0202
            r1.findViewById(r0)
            goto L_0x0202
        L_0x01fc:
            r23 = r3
            r18 = r4
            goto L_0x0098
        L_0x0202:
            r3 = r23
            r7 = 0
        L_0x0205:
            if (r11 == 0) goto L_0x025e
            r0 = r22
            if (r7 != 0) goto L_0x023e
            java.util.HashMap r2 = r0.f22854a
            java.lang.String r3 = "android:visibility:screenLocation"
            java.lang.Object r2 = r2.get(r3)
            int[] r2 = (int[]) r2
            r3 = 0
            r4 = r2[r3]
            r6 = 1
            r2 = r2[r6]
            r8 = 2
            int[] r8 = new int[r8]
            r1.getLocationOnScreen(r8)
            r3 = r8[r3]
            int r4 = r4 - r3
            int r3 = r11.getLeft()
            int r4 = r4 - r3
            r11.offsetLeftAndRight(r4)
            r3 = r8[r6]
            int r2 = r2 - r3
            int r3 = r11.getTop()
            int r2 = r2 - r3
            r11.offsetTopAndBottom(r2)
            android.view.ViewGroupOverlay r2 = r21.getOverlay()
            r2.add(r11)
        L_0x023e:
            r2 = r20
            android.animation.Animator r6 = r2.mo5394M(r1, r11, r0)
            if (r7 != 0) goto L_0x0288
            if (r6 != 0) goto L_0x0250
            android.view.ViewGroupOverlay r0 = r21.getOverlay()
            r0.remove(r11)
            goto L_0x0288
        L_0x0250:
            r0 = r19
            r5.setTag(r0, r11)
            androidx.transition.j r0 = new androidx.transition.j
            r0.<init>(r2, r1, r11, r5)
            r2.mo5411a(r0)
            goto L_0x0288
        L_0x025e:
            r2 = r20
            r0 = r22
            if (r3 == 0) goto L_0x0287
            int r4 = r3.getVisibility()
            r5 = 0
            p330z2.C7444t.m17084c(r5, r3)
            android.animation.Animator r6 = r2.mo5394M(r1, r3, r0)
            if (r6 == 0) goto L_0x0283
            androidx.transition.Visibility$a r0 = new androidx.transition.Visibility$a
            r1 = r18
            r0.<init>(r3, r1)
            r6.addListener(r0)
            r6.addPauseListener(r0)
            r2.mo5411a(r0)
            goto L_0x0288
        L_0x0283:
            p330z2.C7444t.m17084c(r4, r3)
            goto L_0x0288
        L_0x0287:
            r6 = 0
        L_0x0288:
            return r6
        L_0x0289:
            r2 = r0
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.mo5358k(android.view.ViewGroup, z2.q, z2.q):android.animation.Animator");
    }

    /* renamed from: q */
    public final String[] mo5359q() {
        return f4975A;
    }

    /* renamed from: s */
    public final boolean mo5423s(C7441q qVar, C7441q qVar2) {
        if (qVar == null && qVar2 == null) {
            return false;
        }
        if (qVar != null && qVar2 != null && qVar2.f22854a.containsKey("android:visibility:visibility") != qVar.f22854a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C1319b K = m3588K(qVar, qVar2);
        if (!K.f4983a) {
            return false;
        }
        if (K.f4985c == 0 || K.f4986d == 0) {
            return true;
        }
        return false;
    }

    @SuppressLint({"RestrictedApi"})
    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7438n.f22844c);
        int c = C5256j.m13275c(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (c == 0) {
            return;
        }
        if ((c & -4) == 0) {
            this.f4976z = c;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
}
