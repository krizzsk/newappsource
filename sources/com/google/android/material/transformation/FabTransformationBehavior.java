package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import p380bc.C13577a;
import p380bc.C13583g;
import p380bc.C13584h;
import p583jk.C17875h;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    public final Rect f35718c = new Rect();

    /* renamed from: d */
    public final RectF f35719d = new RectF();

    /* renamed from: e */
    public final RectF f35720e = new RectF();

    /* renamed from: f */
    public final int[] f35721f = new int[2];

    /* renamed from: g */
    public float f35722g;

    /* renamed from: h */
    public float f35723h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    public class C14217a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f35724a;

        /* renamed from: b */
        public final /* synthetic */ View f35725b;

        /* renamed from: c */
        public final /* synthetic */ View f35726c;

        public C14217a(boolean z, View view, View view2) {
            this.f35724a = z;
            this.f35725b = view;
            this.f35726c = view2;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f35724a) {
                this.f35725b.setVisibility(4);
                this.f35726c.setAlpha(1.0f);
                this.f35726c.setVisibility(0);
            }
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f35724a) {
                this.f35725b.setVisibility(0);
                this.f35726c.setAlpha(BitmapDescriptorFactory.HUE_RED);
                this.f35726c.setVisibility(4);
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    public static class C14218b {

        /* renamed from: a */
        public C13583g f35727a;

        /* renamed from: b */
        public C17875h f35728b;
    }

    public FabTransformationBehavior() {
    }

    /* renamed from: c */
    public static Pair m35316c(float f, float f2, boolean z, C14218b bVar) {
        C13584h hVar;
        C13584h hVar2;
        int i;
        if (f == BitmapDescriptorFactory.HUE_RED || f2 == BitmapDescriptorFactory.HUE_RED) {
            hVar2 = bVar.f35727a.mo40467f("translationXLinear");
            hVar = bVar.f35727a.mo40467f("translationYLinear");
        } else if ((!z || f2 >= BitmapDescriptorFactory.HUE_RED) && (z || i <= 0)) {
            hVar2 = bVar.f35727a.mo40467f("translationXCurveDownwards");
            hVar = bVar.f35727a.mo40467f("translationYCurveDownwards");
        } else {
            hVar2 = bVar.f35727a.mo40467f("translationXCurveUpwards");
            hVar = bVar.f35727a.mo40467f("translationYCurveUpwards");
        }
        return new Pair(hVar2, hVar);
    }

    /* renamed from: f */
    public static float m35317f(C14218b bVar, C13584h hVar, float f) {
        long j = hVar.f33551a;
        long j2 = hVar.f33552b;
        C13584h f2 = bVar.f35727a.mo40467f("expansion");
        float interpolation = hVar.mo40473b().getInterpolation(((float) (((f2.f33551a + f2.f33552b) + 17) - j)) / ((float) j2));
        LinearInterpolator linearInterpolator = C13577a.f33537a;
        return C16759e.m42347c(BitmapDescriptorFactory.HUE_RED, f, interpolation, f);
    }

    /* JADX WARNING: type inference failed for: r1v11, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x03cd A[LOOP:1: B:100:0x03cb->B:101:0x03cd, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0198  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x02ef  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x034a  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.AnimatorSet mo42675b(android.view.View r27, android.view.View r28, boolean r29, boolean r30) {
        /*
            r26 = this;
            r0 = r26
            r1 = r27
            r2 = r28
            r3 = r29
            android.content.Context r4 = r28.getContext()
            com.google.android.material.transformation.FabTransformationBehavior$b r4 = r0.mo42679h(r4, r3)
            if (r3 == 0) goto L_0x001e
            float r5 = r27.getTranslationX()
            r0.f35722g = r5
            float r5 = r27.getTranslationY()
            r0.f35723h = r5
        L_0x001e:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.WeakHashMap<android.view.View, s1.p0> r7 = p242s1.C6333d0.f19990a
            float r7 = p242s1.C6333d0.C6342i.m15092i(r28)
            float r8 = p242s1.C6333d0.C6342i.m15092i(r27)
            float r7 = r7 - r8
            r8 = 0
            r9 = 1
            r10 = 0
            if (r3 == 0) goto L_0x0049
            if (r30 != 0) goto L_0x003e
            float r7 = -r7
            r2.setTranslationZ(r7)
        L_0x003e:
            android.util.Property r7 = android.view.View.TRANSLATION_Z
            float[] r11 = new float[r9]
            r11[r10] = r8
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r2, r7, r11)
            goto L_0x0054
        L_0x0049:
            android.util.Property r11 = android.view.View.TRANSLATION_Z
            float[] r12 = new float[r9]
            float r7 = -r7
            r12[r10] = r7
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r2, r11, r12)
        L_0x0054:
            bc.g r11 = r4.f35727a
            java.lang.String r12 = "elevation"
            bc.h r11 = r11.mo40467f(r12)
            r11.mo40472a(r7)
            r5.add(r7)
            android.graphics.RectF r7 = r0.f35719d
            jk.h r11 = r4.f35728b
            float r11 = r0.mo42676d(r1, r2, r11)
            jk.h r12 = r4.f35728b
            float r12 = r0.mo42677e(r1, r2, r12)
            android.util.Pair r13 = m35316c(r11, r12, r3, r4)
            java.lang.Object r14 = r13.first
            bc.h r14 = (p380bc.C13584h) r14
            java.lang.Object r13 = r13.second
            bc.h r13 = (p380bc.C13584h) r13
            if (r3 == 0) goto L_0x00c6
            if (r30 != 0) goto L_0x0088
            float r15 = -r11
            r2.setTranslationX(r15)
            float r15 = -r12
            r2.setTranslationY(r15)
        L_0x0088:
            android.util.Property r15 = android.view.View.TRANSLATION_X
            r16 = r6
            float[] r6 = new float[r9]
            r6[r10] = r8
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r15, r6)
            android.util.Property r15 = android.view.View.TRANSLATION_Y
            r17 = r6
            float[] r6 = new float[r9]
            r6[r10] = r8
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r15, r6)
            float r11 = -r11
            float r12 = -r12
            float r11 = m35317f(r4, r14, r11)
            float r12 = m35317f(r4, r13, r12)
            android.graphics.Rect r15 = r0.f35718c
            r2.getWindowVisibleDisplayFrame(r15)
            android.graphics.RectF r8 = r0.f35719d
            r8.set(r15)
            android.graphics.RectF r15 = r0.f35720e
            r0.mo42678g(r2, r15)
            r15.offset(r11, r12)
            r15.intersect(r8)
            r7.set(r15)
            r8 = r6
            r6 = r17
            goto L_0x00de
        L_0x00c6:
            r16 = r6
            android.util.Property r6 = android.view.View.TRANSLATION_X
            float[] r8 = new float[r9]
            float r11 = -r11
            r8[r10] = r11
            android.animation.ObjectAnimator r6 = android.animation.ObjectAnimator.ofFloat(r2, r6, r8)
            android.util.Property r8 = android.view.View.TRANSLATION_Y
            float[] r11 = new float[r9]
            float r12 = -r12
            r11[r10] = r12
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r2, r8, r11)
        L_0x00de:
            r14.mo40472a(r6)
            r13.mo40472a(r8)
            r5.add(r6)
            r5.add(r8)
            float r6 = r7.width()
            float r7 = r7.height()
            jk.h r8 = r4.f35728b
            float r8 = r0.mo42676d(r1, r2, r8)
            jk.h r11 = r4.f35728b
            float r11 = r0.mo42677e(r1, r2, r11)
            android.util.Pair r12 = m35316c(r8, r11, r3, r4)
            java.lang.Object r13 = r12.first
            bc.h r13 = (p380bc.C13584h) r13
            java.lang.Object r12 = r12.second
            bc.h r12 = (p380bc.C13584h) r12
            android.util.Property r14 = android.view.View.TRANSLATION_X
            float[] r15 = new float[r9]
            if (r3 == 0) goto L_0x0111
            goto L_0x0113
        L_0x0111:
            float r8 = r0.f35722g
        L_0x0113:
            r15[r10] = r8
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r1, r14, r15)
            android.util.Property r14 = android.view.View.TRANSLATION_Y
            float[] r15 = new float[r9]
            if (r3 == 0) goto L_0x0120
            goto L_0x0122
        L_0x0120:
            float r11 = r0.f35723h
        L_0x0122:
            r15[r10] = r11
            android.animation.ObjectAnimator r11 = android.animation.ObjectAnimator.ofFloat(r1, r14, r15)
            r13.mo40472a(r8)
            r12.mo40472a(r11)
            r5.add(r8)
            r5.add(r11)
            boolean r8 = r2 instanceof com.google.android.material.circularreveal.C13950c
            if (r8 == 0) goto L_0x018c
            boolean r11 = r1 instanceof android.widget.ImageView
            if (r11 != 0) goto L_0x013d
            goto L_0x018c
        L_0x013d:
            r11 = r2
            com.google.android.material.circularreveal.c r11 = (com.google.android.material.circularreveal.C13950c) r11
            r12 = r1
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            android.graphics.drawable.Drawable r12 = r12.getDrawable()
            if (r12 != 0) goto L_0x014a
            goto L_0x018c
        L_0x014a:
            r12.mutate()
            r13 = 255(0xff, float:3.57E-43)
            if (r3 == 0) goto L_0x0161
            if (r30 != 0) goto L_0x0156
            r12.setAlpha(r13)
        L_0x0156:
            bc.d r13 = p380bc.C13580d.f33544a
            int[] r14 = new int[r9]
            r14[r10] = r10
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofInt(r12, r13, r14)
            goto L_0x016b
        L_0x0161:
            bc.d r14 = p380bc.C13580d.f33544a
            int[] r15 = new int[r9]
            r15[r10] = r13
            android.animation.ObjectAnimator r13 = android.animation.ObjectAnimator.ofInt(r12, r14, r15)
        L_0x016b:
            com.google.android.material.transformation.a r14 = new com.google.android.material.transformation.a
            r14.<init>(r2)
            r13.addUpdateListener(r14)
            bc.g r14 = r4.f35727a
            java.lang.String r15 = "iconFade"
            bc.h r14 = r14.mo40467f(r15)
            r14.mo40472a(r13)
            r5.add(r13)
            com.google.android.material.transformation.b r13 = new com.google.android.material.transformation.b
            r13.<init>(r11, r12)
            r11 = r16
            r11.add(r13)
            goto L_0x018e
        L_0x018c:
            r11 = r16
        L_0x018e:
            if (r8 != 0) goto L_0x0198
            r0 = r2
            r25 = r4
            r18 = r8
            r2 = r11
            goto L_0x02e8
        L_0x0198:
            r12 = r2
            com.google.android.material.circularreveal.c r12 = (com.google.android.material.circularreveal.C13950c) r12
            jk.h r13 = r4.f35728b
            android.graphics.RectF r14 = r0.f35719d
            android.graphics.RectF r15 = r0.f35720e
            r0.mo42678g(r1, r14)
            float r9 = r0.f35722g
            float r10 = r0.f35723h
            r14.offset(r9, r10)
            r0.mo42678g(r2, r15)
            float r9 = r0.mo42676d(r1, r2, r13)
            float r9 = -r9
            r10 = 0
            r15.offset(r9, r10)
            float r9 = r14.centerX()
            float r10 = r15.left
            float r9 = r9 - r10
            jk.h r10 = r4.f35728b
            android.graphics.RectF r13 = r0.f35719d
            android.graphics.RectF r14 = r0.f35720e
            r0.mo42678g(r1, r13)
            float r15 = r0.f35722g
            r18 = r8
            float r8 = r0.f35723h
            r13.offset(r15, r8)
            r0.mo42678g(r2, r14)
            float r8 = r0.mo42677e(r1, r2, r10)
            float r8 = -r8
            r10 = 0
            r14.offset(r10, r8)
            float r8 = r13.centerY()
            float r10 = r14.top
            float r8 = r8 - r10
            r10 = r1
            com.google.android.material.floatingactionbutton.FloatingActionButton r10 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r10
            android.graphics.Rect r13 = r0.f35718c
            boolean r14 = p242s1.C6333d0.C6340g.m15076c(r10)
            if (r14 == 0) goto L_0x01fd
            int r14 = r10.getWidth()
            int r15 = r10.getHeight()
            r1 = 0
            r13.set(r1, r1, r14, r15)
            r10.mo41675k(r13)
        L_0x01fd:
            android.graphics.Rect r1 = r0.f35718c
            int r1 = r1.width()
            float r1 = (float) r1
            r10 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r10
            bc.g r10 = r4.f35727a
            java.lang.String r13 = "expansion"
            bc.h r10 = r10.mo40467f(r13)
            if (r3 == 0) goto L_0x0254
            if (r30 != 0) goto L_0x021b
            com.google.android.material.circularreveal.c$d r15 = new com.google.android.material.circularreveal.c$d
            r15.<init>(r9, r8, r1)
            r12.setRevealInfo(r15)
        L_0x021b:
            if (r30 == 0) goto L_0x0223
            com.google.android.material.circularreveal.c$d r1 = r12.getRevealInfo()
            float r1 = r1.f34618c
        L_0x0223:
            float r6 = p626lf.C18201b.m44917n(r9, r8, r6, r7)
            android.animation.AnimatorSet r6 = com.google.android.material.circularreveal.C13947a.m34824a(r12, r9, r8, r6)
            com.google.android.material.transformation.c r7 = new com.google.android.material.transformation.c
            r7.<init>(r12)
            r6.addListener(r7)
            long r13 = r10.f33551a
            int r7 = (int) r9
            int r8 = (int) r8
            r15 = r4
            r3 = 0
            int r9 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r9 <= 0) goto L_0x024b
            android.animation.Animator r1 = android.view.ViewAnimationUtils.createCircularReveal(r2, r7, r8, r1, r1)
            r1.setStartDelay(r3)
            r1.setDuration(r13)
            r5.add(r1)
        L_0x024b:
            r0 = r2
            r21 = r11
            r22 = r12
            r25 = r15
            goto L_0x02d6
        L_0x0254:
            r15 = r4
            com.google.android.material.circularreveal.c$d r3 = r12.getRevealInfo()
            float r3 = r3.f34618c
            android.animation.AnimatorSet r6 = com.google.android.material.circularreveal.C13947a.m34824a(r12, r9, r8, r1)
            long r13 = r10.f33551a
            int r4 = (int) r9
            int r7 = (int) r8
            r8 = 0
            int r19 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r19 <= 0) goto L_0x0276
            android.animation.Animator r3 = android.view.ViewAnimationUtils.createCircularReveal(r2, r4, r7, r3, r3)
            r3.setStartDelay(r8)
            r3.setDuration(r13)
            r5.add(r3)
        L_0x0276:
            long r13 = r10.f33551a
            long r8 = r10.f33552b
            r3 = r15
            bc.g r15 = r3.f35727a
            s0.h<java.lang.String, bc.h> r0 = r15.f33549a
            int r0 = r0.f19969d
            r19 = r6
            r21 = r11
            r22 = r12
            r6 = 0
            r11 = 0
        L_0x028a:
            if (r6 >= r0) goto L_0x02b2
            r20 = r0
            s0.h<java.lang.String, bc.h> r0 = r15.f33549a
            java.lang.Object r0 = r0.mo22422l(r6)
            bc.h r0 = (p380bc.C13584h) r0
            r23 = r1
            long r1 = r0.f33551a
            r25 = r3
            r24 = r4
            long r3 = r0.f33552b
            long r1 = r1 + r3
            long r11 = java.lang.Math.max(r11, r1)
            int r6 = r6 + 1
            r2 = r28
            r0 = r20
            r1 = r23
            r4 = r24
            r3 = r25
            goto L_0x028a
        L_0x02b2:
            r23 = r1
            r25 = r3
            r24 = r4
            long r13 = r13 + r8
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x02d2
            r0 = r28
            r1 = r23
            r2 = r24
            android.animation.Animator r1 = android.view.ViewAnimationUtils.createCircularReveal(r0, r2, r7, r1, r1)
            r1.setStartDelay(r13)
            long r11 = r11 - r13
            r1.setDuration(r11)
            r5.add(r1)
            goto L_0x02d4
        L_0x02d2:
            r0 = r28
        L_0x02d4:
            r6 = r19
        L_0x02d6:
            r10.mo40472a(r6)
            r5.add(r6)
            hc.a r1 = new hc.a
            r2 = r22
            r1.<init>(r2)
            r2 = r21
            r2.add(r1)
        L_0x02e8:
            if (r18 != 0) goto L_0x02ef
            r6 = r29
            r3 = r25
            goto L_0x0343
        L_0x02ef:
            r1 = r0
            com.google.android.material.circularreveal.c r1 = (com.google.android.material.circularreveal.C13950c) r1
            java.util.WeakHashMap<android.view.View, s1.p0> r3 = p242s1.C6333d0.f19990a
            android.content.res.ColorStateList r3 = p242s1.C6333d0.C6342i.m15090g(r27)
            if (r3 == 0) goto L_0x0307
            int[] r4 = r27.getDrawableState()
            int r6 = r3.getDefaultColor()
            int r3 = r3.getColorForState(r4, r6)
            goto L_0x0308
        L_0x0307:
            r3 = 0
        L_0x0308:
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r3
            r6 = r29
            if (r6 == 0) goto L_0x0322
            if (r30 != 0) goto L_0x0315
            r1.setCircularRevealScrimColor(r3)
        L_0x0315:
            com.google.android.material.circularreveal.c$c r3 = com.google.android.material.circularreveal.C13950c.C13953c.f34615a
            r7 = 1
            int[] r8 = new int[r7]
            r9 = 0
            r8[r9] = r4
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofInt(r1, r3, r8)
            goto L_0x032e
        L_0x0322:
            r7 = 1
            r9 = 0
            com.google.android.material.circularreveal.c$c r4 = com.google.android.material.circularreveal.C13950c.C13953c.f34615a
            int[] r8 = new int[r7]
            r8[r9] = r3
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofInt(r1, r4, r8)
        L_0x032e:
            bc.b r3 = p380bc.C13578b.f33542a
            r1.setEvaluator(r3)
            r3 = r25
            bc.g r4 = r3.f35727a
            java.lang.String r7 = "color"
            bc.h r4 = r4.mo40467f(r7)
            r4.mo40472a(r1)
            r5.add(r1)
        L_0x0343:
            boolean r1 = r0 instanceof android.view.ViewGroup
            if (r1 != 0) goto L_0x034a
        L_0x0347:
            r9 = 0
            goto L_0x03b4
        L_0x034a:
            int r4 = p355ac.C13405f.mtrl_child_content_container
            android.view.View r4 = r0.findViewById(r4)
            r7 = 0
            if (r4 == 0) goto L_0x035b
            boolean r1 = r4 instanceof android.view.ViewGroup
            if (r1 == 0) goto L_0x0379
            r7 = r4
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L_0x0379
        L_0x035b:
            boolean r4 = r0 instanceof com.google.android.material.transformation.TransformationChildLayout
            if (r4 != 0) goto L_0x036a
            boolean r4 = r0 instanceof com.google.android.material.transformation.TransformationChildCard
            if (r4 == 0) goto L_0x0364
            goto L_0x036a
        L_0x0364:
            if (r1 == 0) goto L_0x0379
            r7 = r0
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            goto L_0x0379
        L_0x036a:
            r1 = r0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r4 = 0
            android.view.View r1 = r1.getChildAt(r4)
            boolean r4 = r1 instanceof android.view.ViewGroup
            if (r4 == 0) goto L_0x0379
            r7 = r1
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
        L_0x0379:
            if (r7 != 0) goto L_0x037c
            goto L_0x0347
        L_0x037c:
            if (r6 == 0) goto L_0x0399
            if (r30 != 0) goto L_0x038a
            bc.c r1 = p380bc.C13579c.f33543a
            r4 = 0
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            r1.set(r7, r4)
        L_0x038a:
            bc.c r1 = p380bc.C13579c.f33543a
            r4 = 1
            float[] r4 = new float[r4]
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            r4[r9] = r8
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r7, r1, r4)
            goto L_0x03a6
        L_0x0399:
            r4 = 1
            r9 = 0
            bc.c r1 = p380bc.C13579c.f33543a
            float[] r4 = new float[r4]
            r8 = 0
            r4[r9] = r8
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofFloat(r7, r1, r4)
        L_0x03a6:
            bc.g r3 = r3.f35727a
            java.lang.String r4 = "contentFade"
            bc.h r3 = r3.mo40467f(r4)
            r3.mo40472a(r1)
            r5.add(r1)
        L_0x03b4:
            android.animation.AnimatorSet r1 = new android.animation.AnimatorSet
            r1.<init>()
            p583jk.C17884p.m44345P(r1, r5)
            com.google.android.material.transformation.FabTransformationBehavior$a r3 = new com.google.android.material.transformation.FabTransformationBehavior$a
            r4 = r27
            r3.<init>(r6, r0, r4)
            r1.addListener(r3)
            int r0 = r2.size()
            r10 = 0
        L_0x03cb:
            if (r10 >= r0) goto L_0x03d9
            java.lang.Object r3 = r2.get(r10)
            android.animation.Animator$AnimatorListener r3 = (android.animation.Animator.AnimatorListener) r3
            r1.addListener(r3)
            int r10 = r10 + 1
            goto L_0x03cb
        L_0x03d9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.mo42675b(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    /* renamed from: d */
    public final float mo42676d(View view, View view2, C17875h hVar) {
        RectF rectF = this.f35719d;
        RectF rectF2 = this.f35720e;
        mo42678g(view, rectF);
        rectF.offset(this.f35722g, this.f35723h);
        mo42678g(view2, rectF2);
        hVar.getClass();
        return (rectF2.centerX() - rectF.centerX()) + BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: e */
    public final float mo42677e(View view, View view2, C17875h hVar) {
        RectF rectF = this.f35719d;
        RectF rectF2 = this.f35720e;
        mo42678g(view, rectF);
        rectF.offset(this.f35722g, this.f35723h);
        mo42678g(view2, rectF2);
        hVar.getClass();
        return (rectF2.centerY() - rectF.centerY()) + BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: g */
    public final void mo42678g(View view, RectF rectF) {
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f35721f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: h */
    public abstract C14218b mo42679h(Context context, boolean z);

    public final boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    public final void onAttachedToLayoutParams(CoordinatorLayout.C0752e eVar) {
        if (eVar.f3276h == 0) {
            eVar.f3276h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
