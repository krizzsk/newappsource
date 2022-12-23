package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionHelper;
import p002a1.C0042d;

public class MotionEffect extends MotionHelper {

    /* renamed from: n */
    public float f2645n = 0.1f;

    /* renamed from: o */
    public int f2646o = 49;

    /* renamed from: p */
    public int f2647p = 50;

    /* renamed from: q */
    public int f2648q = 0;

    /* renamed from: r */
    public int f2649r = 0;

    /* renamed from: s */
    public boolean f2650s = true;

    /* renamed from: t */
    public int f2651t = -1;

    /* renamed from: u */
    public int f2652u = -1;

    public MotionEffect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo2917v(context, attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0189, code lost:
        if (r14 == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) goto L_0x018b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x019d, code lost:
        if (r1 == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) goto L_0x018b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b4  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2916u(androidx.constraintlayout.motion.widget.MotionLayout r23, java.util.HashMap<android.view.View, p328z0.C7394n> r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r24
            android.view.ViewParent r2 = r22.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            android.view.View[] r2 = r0.mo3162m(r2)
            if (r2 != 0) goto L_0x0014
            p328z0.C7376a.m16986a()
            return
        L_0x0014:
            z0.e r3 = new z0.e
            r3.<init>()
            z0.e r4 = new z0.e
            r4.<init>()
            float r5 = r0.f2645n
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.String r6 = "alpha"
            r3.mo23607h(r5, r6)
            float r5 = r0.f2645n
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r4.mo23607h(r5, r6)
            int r5 = r0.f2646o
            r3.f22607a = r5
            int r5 = r0.f2647p
            r4.f22607a = r5
            z0.h r5 = new z0.h
            r5.<init>()
            int r6 = r0.f2646o
            r5.f22607a = r6
            r6 = 0
            r5.f22658o = r6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.String r8 = "percentX"
            r5.mo23611h(r7, r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.String r9 = "percentY"
            r5.mo23611h(r7, r9)
            z0.h r7 = new z0.h
            r7.<init>()
            int r10 = r0.f2647p
            r7.f22607a = r10
            r7.f22658o = r6
            r10 = 1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r7.mo23611h(r11, r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r7.mo23611h(r8, r9)
            int r8 = r0.f2648q
            r9 = 0
            if (r8 <= 0) goto L_0x009e
            z0.e r8 = new z0.e
            r8.<init>()
            z0.e r11 = new z0.e
            r11.<init>()
            int r12 = r0.f2648q
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.String r13 = "translationX"
            r8.mo23607h(r12, r13)
            int r12 = r0.f2647p
            r8.f22607a = r12
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            r11.mo23607h(r12, r13)
            int r12 = r0.f2647p
            int r12 = r12 - r10
            r11.f22607a = r12
            goto L_0x00a0
        L_0x009e:
            r8 = r9
            r11 = r8
        L_0x00a0:
            int r12 = r0.f2649r
            if (r12 <= 0) goto L_0x00d0
            z0.e r9 = new z0.e
            r9.<init>()
            z0.e r12 = new z0.e
            r12.<init>()
            int r13 = r0.f2649r
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r14 = "translationY"
            r9.mo23607h(r13, r14)
            int r13 = r0.f2647p
            r9.f22607a = r13
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            r12.mo23607h(r13, r14)
            int r13 = r0.f2647p
            int r13 = r13 - r10
            r12.f22607a = r13
            r21 = r12
            r12 = r9
            r9 = r21
            goto L_0x00d1
        L_0x00d0:
            r12 = r9
        L_0x00d1:
            int r13 = r0.f2652u
            r15 = -1
            if (r13 != r15) goto L_0x0142
            r13 = 4
            int[] r15 = new int[r13]
            r13 = 0
        L_0x00da:
            int r6 = r2.length
            if (r13 >= r6) goto L_0x012e
            r6 = r2[r13]
            java.lang.Object r6 = r1.get(r6)
            z0.n r6 = (p328z0.C7394n) r6
            if (r6 != 0) goto L_0x00ea
            r20 = r9
            goto L_0x0128
        L_0x00ea:
            z0.p r10 = r6.f22731g
            float r14 = r10.f22756f
            z0.p r6 = r6.f22730f
            r20 = r9
            float r9 = r6.f22756f
            float r14 = r14 - r9
            float r9 = r10.f22757g
            float r6 = r6.f22757g
            float r9 = r9 - r6
            r6 = 0
            int r10 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r10 >= 0) goto L_0x0107
            r10 = 1
            r19 = r15[r10]
            int r19 = r19 + 1
            r15[r10] = r19
            goto L_0x0108
        L_0x0107:
            r10 = 1
        L_0x0108:
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x0113
            r9 = 0
            r18 = r15[r9]
            int r18 = r18 + 1
            r15[r9] = r18
        L_0x0113:
            int r9 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x011e
            r9 = 3
            r16 = r15[r9]
            int r16 = r16 + 1
            r15[r9] = r16
        L_0x011e:
            int r9 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x0128
            r6 = 2
            r9 = r15[r6]
            int r9 = r9 + r10
            r15[r6] = r9
        L_0x0128:
            int r13 = r13 + 1
            r9 = r20
            r10 = 1
            goto L_0x00da
        L_0x012e:
            r20 = r9
            r10 = 0
            r6 = r15[r10]
            r9 = 1
            r13 = 0
            r14 = 4
        L_0x0136:
            if (r9 >= r14) goto L_0x0144
            r10 = r15[r9]
            if (r6 >= r10) goto L_0x013e
            r13 = r9
            r6 = r10
        L_0x013e:
            int r9 = r9 + 1
            r10 = 0
            goto L_0x0136
        L_0x0142:
            r20 = r9
        L_0x0144:
            r9 = 0
        L_0x0145:
            int r6 = r2.length
            if (r9 >= r6) goto L_0x0230
            r6 = r2[r9]
            java.lang.Object r6 = r1.get(r6)
            z0.n r6 = (p328z0.C7394n) r6
            if (r6 != 0) goto L_0x015a
        L_0x0152:
            r10 = r23
            r17 = r2
            r14 = r20
            goto L_0x0223
        L_0x015a:
            z0.p r10 = r6.f22731g
            float r14 = r10.f22756f
            z0.p r15 = r6.f22730f
            float r1 = r15.f22756f
            float r14 = r14 - r1
            float r1 = r10.f22757g
            float r10 = r15.f22757g
            float r1 = r1 - r10
            if (r13 != 0) goto L_0x017b
            r10 = 0
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x0179
            boolean r1 = r0.f2650s
            if (r1 == 0) goto L_0x0177
            int r1 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r1 != 0) goto L_0x0179
        L_0x0177:
            r15 = 1
            goto L_0x018b
        L_0x0179:
            r15 = 1
            goto L_0x018e
        L_0x017b:
            r10 = 0
            r15 = 1
            if (r13 != r15) goto L_0x0190
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 >= 0) goto L_0x018e
            boolean r1 = r0.f2650s
            if (r1 == 0) goto L_0x018b
            int r1 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r1 != 0) goto L_0x018e
        L_0x018b:
            r1 = 0
            r15 = 3
            goto L_0x01b2
        L_0x018e:
            r15 = 3
            goto L_0x01b1
        L_0x0190:
            r15 = 2
            if (r13 != r15) goto L_0x01a0
            int r14 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r14 >= 0) goto L_0x018e
            boolean r14 = r0.f2650s
            if (r14 == 0) goto L_0x018b
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 != 0) goto L_0x018e
            goto L_0x018b
        L_0x01a0:
            r15 = 3
            if (r13 != r15) goto L_0x01b1
            int r14 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r14 <= 0) goto L_0x01b1
            boolean r14 = r0.f2650s
            if (r14 == 0) goto L_0x01af
            int r1 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r1 != 0) goto L_0x01b1
        L_0x01af:
            r1 = 0
            goto L_0x01b2
        L_0x01b1:
            r1 = 1
        L_0x01b2:
            if (r1 == 0) goto L_0x0152
            int r1 = r0.f2651t
            r14 = -1
            if (r1 != r14) goto L_0x01e1
            r6.mo23619a(r3)
            r6.mo23619a(r4)
            r6.mo23619a(r5)
            r6.mo23619a(r7)
            int r1 = r0.f2648q
            if (r1 <= 0) goto L_0x01cf
            r6.mo23619a(r8)
            r6.mo23619a(r11)
        L_0x01cf:
            int r1 = r0.f2649r
            if (r1 <= 0) goto L_0x01de
            r6.mo23619a(r12)
            r14 = r20
            r6.mo23619a(r14)
        L_0x01db:
            r10 = r23
            goto L_0x0221
        L_0x01de:
            r14 = r20
            goto L_0x01db
        L_0x01e1:
            r10 = r23
            r14 = r20
            androidx.constraintlayout.motion.widget.a r15 = r10.f2688h
            if (r15 == 0) goto L_0x0221
            androidx.constraintlayout.motion.widget.d r15 = r15.f2773q
            java.util.ArrayList<androidx.constraintlayout.motion.widget.c> r15 = r15.f2865b
            java.util.Iterator r15 = r15.iterator()
        L_0x01f1:
            boolean r17 = r15.hasNext()
            if (r17 == 0) goto L_0x0221
            java.lang.Object r17 = r15.next()
            r0 = r17
            androidx.constraintlayout.motion.widget.c r0 = (androidx.constraintlayout.motion.widget.C0722c) r0
            r17 = r2
            int r2 = r0.f2830a
            if (r2 != r1) goto L_0x021c
            z0.g r0 = r0.f2835f
            java.util.HashMap<java.lang.Integer, java.util.ArrayList<z0.d>> r0 = r0.f22648a
            r2 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.get(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L_0x0224
            java.util.ArrayList<z0.d> r1 = r6.f22747w
            r1.addAll(r0)
            goto L_0x0224
        L_0x021c:
            r0 = r22
            r2 = r17
            goto L_0x01f1
        L_0x0221:
            r17 = r2
        L_0x0223:
            r2 = -1
        L_0x0224:
            int r9 = r9 + 1
            r0 = r22
            r1 = r24
            r20 = r14
            r2 = r17
            goto L_0x0145
        L_0x0230:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.MotionEffect.mo2916u(androidx.constraintlayout.motion.widget.MotionLayout, java.util.HashMap):void");
    }

    /* renamed from: v */
    public final void mo2917v(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0042d.MotionEffect);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0042d.MotionEffect_motionEffect_start) {
                    int i2 = obtainStyledAttributes.getInt(index, this.f2646o);
                    this.f2646o = i2;
                    this.f2646o = Math.max(Math.min(i2, 99), 0);
                } else if (index == C0042d.MotionEffect_motionEffect_end) {
                    int i3 = obtainStyledAttributes.getInt(index, this.f2647p);
                    this.f2647p = i3;
                    this.f2647p = Math.max(Math.min(i3, 99), 0);
                } else if (index == C0042d.MotionEffect_motionEffect_translationX) {
                    this.f2648q = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2648q);
                } else if (index == C0042d.MotionEffect_motionEffect_translationY) {
                    this.f2649r = obtainStyledAttributes.getDimensionPixelOffset(index, this.f2649r);
                } else if (index == C0042d.MotionEffect_motionEffect_alpha) {
                    this.f2645n = obtainStyledAttributes.getFloat(index, this.f2645n);
                } else if (index == C0042d.MotionEffect_motionEffect_move) {
                    this.f2652u = obtainStyledAttributes.getInt(index, this.f2652u);
                } else if (index == C0042d.MotionEffect_motionEffect_strict) {
                    this.f2650s = obtainStyledAttributes.getBoolean(index, this.f2650s);
                } else if (index == C0042d.MotionEffect_motionEffect_viewTransition) {
                    this.f2651t = obtainStyledAttributes.getResourceId(index, this.f2651t);
                }
            }
            int i4 = this.f2646o;
            int i5 = this.f2647p;
            if (i4 == i5) {
                if (i4 > 0) {
                    this.f2646o = i4 - 1;
                } else {
                    this.f2647p = i5 + 1;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public MotionEffect(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo2917v(context, attributeSet);
    }
}
