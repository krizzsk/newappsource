package p305x0;

import androidx.constraintlayout.core.widgets.C0697d;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.DependencyNode;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: x0.c */
public final class C7132c extends WidgetRun {

    /* renamed from: k */
    public ArrayList<WidgetRun> f22160k = new ArrayList<>();

    /* renamed from: l */
    public int f22161l;

    public C7132c(int i, ConstraintWidget constraintWidget) {
        super(constraintWidget);
        Object obj;
        boolean z;
        int i2;
        Object obj2;
        this.f2481f = i;
        ConstraintWidget constraintWidget2 = this.f2477b;
        ConstraintWidget q = constraintWidget2.mo2804q(i);
        while (q != null) {
            constraintWidget2 = q;
            q = q.mo2804q(this.f2481f);
        }
        this.f2477b = constraintWidget2;
        ArrayList<WidgetRun> arrayList = this.f22160k;
        int i3 = this.f2481f;
        if (i3 == 0) {
            obj = constraintWidget2.f2416d;
        } else if (i3 == 1) {
            obj = constraintWidget2.f2418e;
        } else {
            obj = null;
        }
        arrayList.add(obj);
        ConstraintWidget p = constraintWidget2.mo2803p(this.f2481f);
        while (p != null) {
            ArrayList<WidgetRun> arrayList2 = this.f22160k;
            int i4 = this.f2481f;
            if (i4 == 0) {
                obj2 = p.f2416d;
            } else if (i4 == 1) {
                obj2 = p.f2418e;
            } else {
                obj2 = null;
            }
            arrayList2.add(obj2);
            p = p.mo2803p(this.f2481f);
        }
        Iterator<WidgetRun> it = this.f22160k.iterator();
        while (it.hasNext()) {
            WidgetRun next = it.next();
            int i5 = this.f2481f;
            if (i5 == 0) {
                next.f2477b.f2412b = this;
            } else if (i5 == 1) {
                next.f2477b.f2414c = this;
            }
        }
        if (this.f2481f != 0 || !((C0697d) this.f2477b.f2406W).f2511B0) {
            z = false;
        } else {
            z = true;
        }
        if (z && this.f22160k.size() > 1) {
            ArrayList<WidgetRun> arrayList3 = this.f22160k;
            this.f2477b = arrayList3.get(arrayList3.size() - 1).f2477b;
        }
        if (this.f2481f == 0) {
            i2 = this.f2477b.f2437n0;
        } else {
            i2 = this.f2477b.f2439o0;
        }
        this.f22161l = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d8  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2815a(p305x0.C7133d r26) {
        /*
            r25 = this;
            r0 = r25
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r0.f2483h
            boolean r2 = r1.f2473j
            if (r2 == 0) goto L_0x03f7
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r0.f2484i
            boolean r3 = r2.f2473j
            if (r3 != 0) goto L_0x0010
            goto L_0x03f7
        L_0x0010:
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r0.f2477b
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r3.f2406W
            boolean r4 = r3 instanceof androidx.constraintlayout.core.widgets.C0697d
            if (r4 == 0) goto L_0x001d
            androidx.constraintlayout.core.widgets.d r3 = (androidx.constraintlayout.core.widgets.C0697d) r3
            boolean r3 = r3.f2511B0
            goto L_0x001e
        L_0x001d:
            r3 = 0
        L_0x001e:
            int r2 = r2.f2470g
            int r1 = r1.f2470g
            int r2 = r2 - r1
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r1 = r0.f22160k
            int r1 = r1.size()
            r4 = 0
        L_0x002a:
            r6 = -1
            r7 = 8
            if (r4 >= r1) goto L_0x0040
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r8 = r0.f22160k
            java.lang.Object r8 = r8.get(r4)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r8 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r8
            androidx.constraintlayout.core.widgets.ConstraintWidget r8 = r8.f2477b
            int r8 = r8.f2429j0
            if (r8 != r7) goto L_0x0041
            int r4 = r4 + 1
            goto L_0x002a
        L_0x0040:
            r4 = -1
        L_0x0041:
            int r8 = r1 + -1
            r9 = r8
        L_0x0044:
            if (r9 < 0) goto L_0x0058
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r10 = r0.f22160k
            java.lang.Object r10 = r10.get(r9)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r10 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r10
            androidx.constraintlayout.core.widgets.ConstraintWidget r10 = r10.f2477b
            int r10 = r10.f2429j0
            if (r10 != r7) goto L_0x0057
            int r9 = r9 + -1
            goto L_0x0044
        L_0x0057:
            r6 = r9
        L_0x0058:
            r9 = 0
        L_0x0059:
            r11 = 2
            if (r9 >= r11) goto L_0x00f8
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x0063:
            if (r13 >= r1) goto L_0x00ea
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r5 = r0.f22160k
            java.lang.Object r5 = r5.get(r13)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r5 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r5
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r5.f2477b
            int r10 = r11.f2429j0
            if (r10 != r7) goto L_0x0075
            goto L_0x00e3
        L_0x0075:
            int r16 = r16 + 1
            if (r13 <= 0) goto L_0x0080
            if (r13 < r4) goto L_0x0080
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r10 = r5.f2483h
            int r10 = r10.f2469f
            int r14 = r14 + r10
        L_0x0080:
            androidx.constraintlayout.core.widgets.analyzer.a r10 = r5.f2480e
            int r7 = r10.f2470g
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = r5.f2479d
            r19 = r7
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r12 == r7) goto L_0x008e
            r7 = 1
            goto L_0x008f
        L_0x008e:
            r7 = 0
        L_0x008f:
            if (r7 == 0) goto L_0x00ad
            int r10 = r0.f2481f
            if (r10 != 0) goto L_0x009e
            androidx.constraintlayout.core.widgets.analyzer.c r12 = r11.f2416d
            androidx.constraintlayout.core.widgets.analyzer.a r12 = r12.f2480e
            boolean r12 = r12.f2473j
            if (r12 != 0) goto L_0x009e
            return
        L_0x009e:
            r12 = 1
            if (r10 != r12) goto L_0x00aa
            androidx.constraintlayout.core.widgets.analyzer.d r10 = r11.f2418e
            androidx.constraintlayout.core.widgets.analyzer.a r10 = r10.f2480e
            boolean r10 = r10.f2473j
            if (r10 != 0) goto L_0x00aa
            return
        L_0x00aa:
            r20 = r7
            goto L_0x00c4
        L_0x00ad:
            r20 = r7
            r12 = 1
            int r7 = r5.f2476a
            if (r7 != r12) goto L_0x00bb
            if (r9 != 0) goto L_0x00bb
            int r7 = r10.f2487m
            int r15 = r15 + 1
            goto L_0x00c1
        L_0x00bb:
            boolean r7 = r10.f2473j
            if (r7 == 0) goto L_0x00c4
            r7 = r19
        L_0x00c1:
            r20 = 1
            goto L_0x00c6
        L_0x00c4:
            r7 = r19
        L_0x00c6:
            if (r20 != 0) goto L_0x00d8
            int r15 = r15 + 1
            float[] r7 = r11.f2441p0
            int r10 = r0.f2481f
            r7 = r7[r10]
            r10 = 0
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 < 0) goto L_0x00d9
            float r17 = r17 + r7
            goto L_0x00d9
        L_0x00d8:
            int r14 = r14 + r7
        L_0x00d9:
            if (r13 >= r8) goto L_0x00e3
            if (r13 >= r6) goto L_0x00e3
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r5 = r5.f2484i
            int r5 = r5.f2469f
            int r5 = -r5
            int r14 = r14 + r5
        L_0x00e3:
            int r13 = r13 + 1
            r7 = 8
            r11 = 2
            goto L_0x0063
        L_0x00ea:
            if (r14 < r2) goto L_0x00f5
            if (r15 != 0) goto L_0x00ef
            goto L_0x00f5
        L_0x00ef:
            int r9 = r9 + 1
            r7 = 8
            goto L_0x0059
        L_0x00f5:
            r5 = r16
            goto L_0x00fd
        L_0x00f8:
            r5 = 0
            r14 = 0
            r15 = 0
            r17 = 0
        L_0x00fd:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r0.f2483h
            int r7 = r7.f2470g
            if (r3 == 0) goto L_0x0107
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r0.f2484i
            int r7 = r7.f2470g
        L_0x0107:
            r9 = 1056964608(0x3f000000, float:0.5)
            if (r14 <= r2) goto L_0x011e
            r10 = 1073741824(0x40000000, float:2.0)
            if (r3 == 0) goto L_0x0117
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 + r10
            goto L_0x011e
        L_0x0117:
            int r11 = r14 - r2
            float r11 = (float) r11
            float r11 = r11 / r10
            float r11 = r11 + r9
            int r10 = (int) r11
            int r7 = r7 - r10
        L_0x011e:
            if (r15 <= 0) goto L_0x0200
            int r10 = r2 - r14
            float r10 = (float) r10
            float r11 = (float) r15
            float r11 = r10 / r11
            float r11 = r11 + r9
            int r11 = (int) r11
            r12 = 0
            r13 = 0
        L_0x012a:
            if (r12 >= r1) goto L_0x01b4
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r9 = r0.f22160k
            java.lang.Object r9 = r9.get(r12)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r9 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r9
            r19 = r11
            androidx.constraintlayout.core.widgets.ConstraintWidget r11 = r9.f2477b
            r20 = r14
            int r14 = r11.f2429j0
            r21 = r7
            r7 = 8
            if (r14 != r7) goto L_0x0143
            goto L_0x019c
        L_0x0143:
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r7 = r9.f2479d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r7 != r14) goto L_0x019c
            androidx.constraintlayout.core.widgets.analyzer.a r7 = r9.f2480e
            boolean r14 = r7.f2473j
            if (r14 != 0) goto L_0x019c
            r14 = 0
            int r18 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r18 <= 0) goto L_0x0165
            float[] r14 = r11.f2441p0
            r22 = r3
            int r3 = r0.f2481f
            r3 = r14[r3]
            float r3 = r3 * r10
            float r3 = r3 / r17
            r14 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r14
            int r3 = (int) r3
            goto L_0x0169
        L_0x0165:
            r22 = r3
            r3 = r19
        L_0x0169:
            int r14 = r0.f2481f
            if (r14 != 0) goto L_0x0172
            int r14 = r11.f2454w
            int r11 = r11.f2452v
            goto L_0x0176
        L_0x0172:
            int r14 = r11.f2457z
            int r11 = r11.f2456y
        L_0x0176:
            r23 = r10
            int r10 = r9.f2476a
            r24 = r5
            r5 = 1
            if (r10 != r5) goto L_0x0186
            int r5 = r7.f2487m
            int r5 = java.lang.Math.min(r3, r5)
            goto L_0x0187
        L_0x0186:
            r5 = r3
        L_0x0187:
            int r5 = java.lang.Math.max(r11, r5)
            if (r14 <= 0) goto L_0x0191
            int r5 = java.lang.Math.min(r14, r5)
        L_0x0191:
            if (r5 == r3) goto L_0x0196
            int r13 = r13 + 1
            r3 = r5
        L_0x0196:
            androidx.constraintlayout.core.widgets.analyzer.a r5 = r9.f2480e
            r5.mo2818d(r3)
            goto L_0x01a2
        L_0x019c:
            r22 = r3
            r24 = r5
            r23 = r10
        L_0x01a2:
            int r12 = r12 + 1
            r11 = r19
            r14 = r20
            r7 = r21
            r3 = r22
            r10 = r23
            r5 = r24
            r9 = 1056964608(0x3f000000, float:0.5)
            goto L_0x012a
        L_0x01b4:
            r22 = r3
            r24 = r5
            r21 = r7
            r20 = r14
            if (r13 <= 0) goto L_0x01f1
            int r15 = r15 - r13
            r3 = 0
            r5 = 0
        L_0x01c1:
            if (r3 >= r1) goto L_0x01ef
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r7 = r0.f22160k
            java.lang.Object r7 = r7.get(r3)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r7 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r7
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r7.f2477b
            int r9 = r9.f2429j0
            r10 = 8
            if (r9 != r10) goto L_0x01d4
            goto L_0x01ec
        L_0x01d4:
            if (r3 <= 0) goto L_0x01dd
            if (r3 < r4) goto L_0x01dd
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r7.f2483h
            int r9 = r9.f2469f
            int r5 = r5 + r9
        L_0x01dd:
            androidx.constraintlayout.core.widgets.analyzer.a r9 = r7.f2480e
            int r9 = r9.f2470g
            int r5 = r5 + r9
            if (r3 >= r8) goto L_0x01ec
            if (r3 >= r6) goto L_0x01ec
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r7 = r7.f2484i
            int r7 = r7.f2469f
            int r7 = -r7
            int r5 = r5 + r7
        L_0x01ec:
            int r3 = r3 + 1
            goto L_0x01c1
        L_0x01ef:
            r14 = r5
            goto L_0x01f3
        L_0x01f1:
            r14 = r20
        L_0x01f3:
            int r3 = r0.f22161l
            r5 = 2
            if (r3 != r5) goto L_0x01fe
            if (r13 != 0) goto L_0x01fe
            r3 = 0
            r0.f22161l = r3
            goto L_0x020a
        L_0x01fe:
            r3 = 0
            goto L_0x020a
        L_0x0200:
            r22 = r3
            r24 = r5
            r21 = r7
            r20 = r14
            r3 = 0
            r5 = 2
        L_0x020a:
            if (r14 <= r2) goto L_0x020e
            r0.f22161l = r5
        L_0x020e:
            if (r24 <= 0) goto L_0x0216
            if (r15 != 0) goto L_0x0216
            if (r4 != r6) goto L_0x0216
            r0.f22161l = r5
        L_0x0216:
            int r5 = r0.f22161l
            r7 = 1
            if (r5 != r7) goto L_0x02b8
            r9 = r24
            if (r9 <= r7) goto L_0x0224
            int r2 = r2 - r14
            int r5 = r9 + -1
            int r2 = r2 / r5
            goto L_0x022b
        L_0x0224:
            if (r9 != r7) goto L_0x022a
            int r2 = r2 - r14
            r5 = 2
            int r2 = r2 / r5
            goto L_0x022b
        L_0x022a:
            r2 = 0
        L_0x022b:
            if (r15 <= 0) goto L_0x022e
            r2 = 0
        L_0x022e:
            r7 = r21
            r5 = 0
        L_0x0231:
            if (r5 >= r1) goto L_0x03f7
            if (r22 == 0) goto L_0x023a
            int r3 = r5 + 1
            int r3 = r1 - r3
            goto L_0x023b
        L_0x023a:
            r3 = r5
        L_0x023b:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r9 = r0.f22160k
            java.lang.Object r3 = r9.get(r3)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r3 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r3.f2477b
            int r9 = r9.f2429j0
            r10 = 8
            if (r9 != r10) goto L_0x0256
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r3.f2483h
            r9.mo2818d(r7)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.f2484i
            r3.mo2818d(r7)
            goto L_0x02b4
        L_0x0256:
            if (r5 <= 0) goto L_0x025d
            if (r22 == 0) goto L_0x025c
            int r7 = r7 - r2
            goto L_0x025d
        L_0x025c:
            int r7 = r7 + r2
        L_0x025d:
            if (r5 <= 0) goto L_0x026e
            if (r5 < r4) goto L_0x026e
            if (r22 == 0) goto L_0x0269
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r3.f2483h
            int r9 = r9.f2469f
            int r7 = r7 - r9
            goto L_0x026e
        L_0x0269:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r3.f2483h
            int r9 = r9.f2469f
            int r7 = r7 + r9
        L_0x026e:
            if (r22 == 0) goto L_0x0276
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r3.f2484i
            r9.mo2818d(r7)
            goto L_0x027b
        L_0x0276:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r3.f2483h
            r9.mo2818d(r7)
        L_0x027b:
            androidx.constraintlayout.core.widgets.analyzer.a r9 = r3.f2480e
            int r10 = r9.f2470g
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r3.f2479d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x028c
            int r11 = r3.f2476a
            r12 = 1
            if (r11 != r12) goto L_0x028c
            int r10 = r9.f2487m
        L_0x028c:
            if (r22 == 0) goto L_0x0290
            int r7 = r7 - r10
            goto L_0x0291
        L_0x0290:
            int r7 = r7 + r10
        L_0x0291:
            if (r22 == 0) goto L_0x0299
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r3.f2483h
            r9.mo2818d(r7)
            goto L_0x029e
        L_0x0299:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r3.f2484i
            r9.mo2818d(r7)
        L_0x029e:
            r9 = 1
            r3.f2482g = r9
            if (r5 >= r8) goto L_0x02b4
            if (r5 >= r6) goto L_0x02b4
            if (r22 == 0) goto L_0x02ae
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.f2484i
            int r3 = r3.f2469f
            int r3 = -r3
            int r7 = r7 - r3
            goto L_0x02b4
        L_0x02ae:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.f2484i
            int r3 = r3.f2469f
            int r3 = -r3
            int r7 = r7 + r3
        L_0x02b4:
            int r5 = r5 + 1
            goto L_0x0231
        L_0x02b8:
            r9 = r24
            if (r5 != 0) goto L_0x034d
            int r2 = r2 - r14
            r5 = 1
            int r7 = r9 + 1
            int r2 = r2 / r7
            if (r15 <= 0) goto L_0x02c4
            r2 = 0
        L_0x02c4:
            r7 = r21
            r5 = 0
        L_0x02c7:
            if (r5 >= r1) goto L_0x03f7
            if (r22 == 0) goto L_0x02d0
            int r3 = r5 + 1
            int r3 = r1 - r3
            goto L_0x02d1
        L_0x02d0:
            r3 = r5
        L_0x02d1:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r9 = r0.f22160k
            java.lang.Object r3 = r9.get(r3)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r3 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r9 = r3.f2477b
            int r9 = r9.f2429j0
            r10 = 8
            if (r9 != r10) goto L_0x02ec
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r3.f2483h
            r9.mo2818d(r7)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.f2484i
            r3.mo2818d(r7)
            goto L_0x0349
        L_0x02ec:
            if (r22 == 0) goto L_0x02f0
            int r7 = r7 - r2
            goto L_0x02f1
        L_0x02f0:
            int r7 = r7 + r2
        L_0x02f1:
            if (r5 <= 0) goto L_0x0302
            if (r5 < r4) goto L_0x0302
            if (r22 == 0) goto L_0x02fd
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r3.f2483h
            int r9 = r9.f2469f
            int r7 = r7 - r9
            goto L_0x0302
        L_0x02fd:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r3.f2483h
            int r9 = r9.f2469f
            int r7 = r7 + r9
        L_0x0302:
            if (r22 == 0) goto L_0x030a
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r3.f2484i
            r9.mo2818d(r7)
            goto L_0x030f
        L_0x030a:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r3.f2483h
            r9.mo2818d(r7)
        L_0x030f:
            androidx.constraintlayout.core.widgets.analyzer.a r9 = r3.f2480e
            int r10 = r9.f2470g
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r3.f2479d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x0324
            int r11 = r3.f2476a
            r12 = 1
            if (r11 != r12) goto L_0x0324
            int r9 = r9.f2487m
            int r10 = java.lang.Math.min(r10, r9)
        L_0x0324:
            if (r22 == 0) goto L_0x0328
            int r7 = r7 - r10
            goto L_0x0329
        L_0x0328:
            int r7 = r7 + r10
        L_0x0329:
            if (r22 == 0) goto L_0x0331
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r3.f2483h
            r9.mo2818d(r7)
            goto L_0x0336
        L_0x0331:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r9 = r3.f2484i
            r9.mo2818d(r7)
        L_0x0336:
            if (r5 >= r8) goto L_0x0349
            if (r5 >= r6) goto L_0x0349
            if (r22 == 0) goto L_0x0343
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.f2484i
            int r3 = r3.f2469f
            int r3 = -r3
            int r7 = r7 - r3
            goto L_0x0349
        L_0x0343:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r3.f2484i
            int r3 = r3.f2469f
            int r3 = -r3
            int r7 = r7 + r3
        L_0x0349:
            int r5 = r5 + 1
            goto L_0x02c7
        L_0x034d:
            r7 = 2
            if (r5 != r7) goto L_0x03f7
            int r5 = r0.f2481f
            if (r5 != 0) goto L_0x0359
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r0.f2477b
            float r5 = r5.f2423g0
            goto L_0x035d
        L_0x0359:
            androidx.constraintlayout.core.widgets.ConstraintWidget r5 = r0.f2477b
            float r5 = r5.f2425h0
        L_0x035d:
            if (r22 == 0) goto L_0x0363
            r7 = 1065353216(0x3f800000, float:1.0)
            float r5 = r7 - r5
        L_0x0363:
            int r2 = r2 - r14
            float r2 = (float) r2
            float r2 = r2 * r5
            r5 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r5
            int r2 = (int) r2
            if (r2 < 0) goto L_0x036f
            if (r15 <= 0) goto L_0x0370
        L_0x036f:
            r2 = 0
        L_0x0370:
            if (r22 == 0) goto L_0x0375
            int r7 = r21 - r2
            goto L_0x0377
        L_0x0375:
            int r7 = r21 + r2
        L_0x0377:
            r5 = 0
        L_0x0378:
            if (r5 >= r1) goto L_0x03f7
            if (r22 == 0) goto L_0x0381
            int r2 = r5 + 1
            int r2 = r1 - r2
            goto L_0x0382
        L_0x0381:
            r2 = r5
        L_0x0382:
            java.util.ArrayList<androidx.constraintlayout.core.widgets.analyzer.WidgetRun> r3 = r0.f22160k
            java.lang.Object r2 = r3.get(r2)
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r2 = (androidx.constraintlayout.core.widgets.analyzer.WidgetRun) r2
            androidx.constraintlayout.core.widgets.ConstraintWidget r3 = r2.f2477b
            int r3 = r3.f2429j0
            r9 = 8
            if (r3 != r9) goto L_0x039e
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r2.f2483h
            r3.mo2818d(r7)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r2.f2484i
            r2.mo2818d(r7)
            r12 = 1
            goto L_0x03f4
        L_0x039e:
            if (r5 <= 0) goto L_0x03af
            if (r5 < r4) goto L_0x03af
            if (r22 == 0) goto L_0x03aa
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r2.f2483h
            int r3 = r3.f2469f
            int r7 = r7 - r3
            goto L_0x03af
        L_0x03aa:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r2.f2483h
            int r3 = r3.f2469f
            int r7 = r7 + r3
        L_0x03af:
            if (r22 == 0) goto L_0x03b7
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r2.f2484i
            r3.mo2818d(r7)
            goto L_0x03bc
        L_0x03b7:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r2.f2483h
            r3.mo2818d(r7)
        L_0x03bc:
            androidx.constraintlayout.core.widgets.analyzer.a r3 = r2.f2480e
            int r10 = r3.f2470g
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r11 = r2.f2479d
            androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r12) goto L_0x03ce
            int r11 = r2.f2476a
            r12 = 1
            if (r11 != r12) goto L_0x03cf
            int r10 = r3.f2487m
            goto L_0x03cf
        L_0x03ce:
            r12 = 1
        L_0x03cf:
            if (r22 == 0) goto L_0x03d3
            int r7 = r7 - r10
            goto L_0x03d4
        L_0x03d3:
            int r7 = r7 + r10
        L_0x03d4:
            if (r22 == 0) goto L_0x03dc
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r2.f2483h
            r3.mo2818d(r7)
            goto L_0x03e1
        L_0x03dc:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r2.f2484i
            r3.mo2818d(r7)
        L_0x03e1:
            if (r5 >= r8) goto L_0x03f4
            if (r5 >= r6) goto L_0x03f4
            if (r22 == 0) goto L_0x03ee
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r2.f2484i
            int r2 = r2.f2469f
            int r2 = -r2
            int r7 = r7 - r2
            goto L_0x03f4
        L_0x03ee:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r2.f2484i
            int r2 = r2.f2469f
            int r2 = -r2
            int r7 = r7 + r2
        L_0x03f4:
            int r5 = r5 + 1
            goto L_0x0378
        L_0x03f7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p305x0.C7132c.mo2815a(x0.d):void");
    }

    /* renamed from: d */
    public final void mo2821d() {
        Iterator<WidgetRun> it = this.f22160k.iterator();
        while (it.hasNext()) {
            it.next().mo2821d();
        }
        int size = this.f22160k.size();
        if (size >= 1) {
            ConstraintWidget constraintWidget = this.f22160k.get(0).f2477b;
            ConstraintWidget constraintWidget2 = this.f22160k.get(size - 1).f2477b;
            if (this.f2481f == 0) {
                ConstraintAnchor constraintAnchor = constraintWidget.f2394K;
                ConstraintAnchor constraintAnchor2 = constraintWidget2.f2396M;
                DependencyNode i = WidgetRun.m2019i(constraintAnchor, 0);
                int e = constraintAnchor.mo2764e();
                ConstraintWidget m = mo23382m();
                if (m != null) {
                    e = m.f2394K.mo2764e();
                }
                if (i != null) {
                    WidgetRun.m2017b(this.f2483h, i, e);
                }
                DependencyNode i2 = WidgetRun.m2019i(constraintAnchor2, 0);
                int e2 = constraintAnchor2.mo2764e();
                ConstraintWidget n = mo23383n();
                if (n != null) {
                    e2 = n.f2396M.mo2764e();
                }
                if (i2 != null) {
                    WidgetRun.m2017b(this.f2484i, i2, -e2);
                }
            } else {
                ConstraintAnchor constraintAnchor3 = constraintWidget.f2395L;
                ConstraintAnchor constraintAnchor4 = constraintWidget2.f2397N;
                DependencyNode i3 = WidgetRun.m2019i(constraintAnchor3, 1);
                int e3 = constraintAnchor3.mo2764e();
                ConstraintWidget m2 = mo23382m();
                if (m2 != null) {
                    e3 = m2.f2395L.mo2764e();
                }
                if (i3 != null) {
                    WidgetRun.m2017b(this.f2483h, i3, e3);
                }
                DependencyNode i4 = WidgetRun.m2019i(constraintAnchor4, 1);
                int e4 = constraintAnchor4.mo2764e();
                ConstraintWidget n2 = mo23383n();
                if (n2 != null) {
                    e4 = n2.f2397N.mo2764e();
                }
                if (i4 != null) {
                    WidgetRun.m2017b(this.f2484i, i4, -e4);
                }
            }
            this.f2483h.f2464a = this;
            this.f2484i.f2464a = this;
        }
    }

    /* renamed from: e */
    public final void mo2822e() {
        for (int i = 0; i < this.f22160k.size(); i++) {
            this.f22160k.get(i).mo2822e();
        }
    }

    /* renamed from: f */
    public final void mo2823f() {
        this.f2478c = null;
        Iterator<WidgetRun> it = this.f22160k.iterator();
        while (it.hasNext()) {
            it.next().mo2823f();
        }
    }

    /* renamed from: j */
    public final long mo2825j() {
        int size = this.f22160k.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            WidgetRun widgetRun = this.f22160k.get(i);
            j = ((long) widgetRun.f2484i.f2469f) + widgetRun.mo2825j() + j + ((long) widgetRun.f2483h.f2469f);
        }
        return j;
    }

    /* renamed from: k */
    public final boolean mo2826k() {
        int size = this.f22160k.size();
        for (int i = 0; i < size; i++) {
            if (!this.f22160k.get(i).mo2826k()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: m */
    public final ConstraintWidget mo23382m() {
        for (int i = 0; i < this.f22160k.size(); i++) {
            ConstraintWidget constraintWidget = this.f22160k.get(i).f2477b;
            if (constraintWidget.f2429j0 != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    /* renamed from: n */
    public final ConstraintWidget mo23383n() {
        for (int size = this.f22160k.size() - 1; size >= 0; size--) {
            ConstraintWidget constraintWidget = this.f22160k.get(size).f2477b;
            if (constraintWidget.f2429j0 != 8) {
                return constraintWidget;
            }
        }
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChainRun ");
        if (this.f2481f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb.append(str);
        Iterator<WidgetRun> it = this.f22160k.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append(it.next());
            sb.append("> ");
        }
        return sb.toString();
    }
}
