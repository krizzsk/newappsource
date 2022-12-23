package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p114i.C5224j;
import p127j.C5344a;
import p242s1.C6333d0;

public class LinearLayoutCompat extends ViewGroup {

    /* renamed from: b */
    public boolean f1209b;

    /* renamed from: c */
    public int f1210c;

    /* renamed from: d */
    public int f1211d;

    /* renamed from: e */
    public int f1212e;

    /* renamed from: f */
    public int f1213f;

    /* renamed from: g */
    public int f1214g;

    /* renamed from: h */
    public float f1215h;

    /* renamed from: i */
    public boolean f1216i;

    /* renamed from: j */
    public int[] f1217j;

    /* renamed from: k */
    public int[] f1218k;

    /* renamed from: l */
    public Drawable f1219l;

    /* renamed from: m */
    public int f1220m;

    /* renamed from: n */
    public int f1221n;

    /* renamed from: o */
    public int f1222o;

    /* renamed from: p */
    public int f1223p;

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public LinearLayoutCompat(Context context) {
        this(context, (AttributeSet) null);
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public final void mo1722d(Canvas canvas, int i) {
        this.f1219l.setBounds(getPaddingLeft() + this.f1223p, i, (getWidth() - getPaddingRight()) - this.f1223p, this.f1221n + i);
        this.f1219l.draw(canvas);
    }

    /* renamed from: e */
    public final void mo1723e(Canvas canvas, int i) {
        this.f1219l.setBounds(i, getPaddingTop() + this.f1223p, this.f1220m + i, (getHeight() - getPaddingBottom()) - this.f1223p);
        this.f1219l.draw(canvas);
    }

    /* renamed from: f */
    public LayoutParams generateDefaultLayoutParams() {
        int i = this.f1212e;
        if (i == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    /* renamed from: g */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getBaseline() {
        int i;
        if (this.f1210c < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.f1210c;
        if (childCount > i2) {
            View childAt = getChildAt(i2);
            int baseline = childAt.getBaseline();
            if (baseline != -1) {
                int i3 = this.f1211d;
                if (this.f1212e == 1 && (i = this.f1213f & 112) != 48) {
                    if (i == 16) {
                        i3 += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f1214g) / 2;
                    } else if (i == 80) {
                        i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1214g;
                    }
                }
                return i3 + ((LayoutParams) childAt.getLayoutParams()).topMargin + baseline;
            } else if (this.f1210c == 0) {
                return -1;
            } else {
                throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            }
        } else {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1210c;
    }

    public Drawable getDividerDrawable() {
        return this.f1219l;
    }

    public int getDividerPadding() {
        return this.f1223p;
    }

    public int getDividerWidth() {
        return this.f1220m;
    }

    public int getGravity() {
        return this.f1213f;
    }

    public int getOrientation() {
        return this.f1212e;
    }

    public int getShowDividers() {
        return this.f1222o;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f1215h;
    }

    /* renamed from: h */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* renamed from: i */
    public final boolean mo1734i(int i) {
        if (i == 0) {
            if ((this.f1222o & 1) != 0) {
                return true;
            }
            return false;
        } else if (i == getChildCount()) {
            if ((this.f1222o & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.f1222o & 2) == 0) {
            return false;
        } else {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (this.f1219l != null) {
            int i6 = 0;
            if (this.f1212e == 1) {
                int virtualChildCount = getVirtualChildCount();
                while (i6 < virtualChildCount) {
                    View childAt = getChildAt(i6);
                    if (!(childAt == null || childAt.getVisibility() == 8 || !mo1734i(i6))) {
                        mo1722d(canvas, (childAt.getTop() - ((LayoutParams) childAt.getLayoutParams()).topMargin) - this.f1221n);
                    }
                    i6++;
                }
                if (mo1734i(virtualChildCount)) {
                    View childAt2 = getChildAt(virtualChildCount - 1);
                    if (childAt2 == null) {
                        i5 = (getHeight() - getPaddingBottom()) - this.f1221n;
                    } else {
                        i5 = childAt2.getBottom() + ((LayoutParams) childAt2.getLayoutParams()).bottomMargin;
                    }
                    mo1722d(canvas, i5);
                    return;
                }
                return;
            }
            int virtualChildCount2 = getVirtualChildCount();
            boolean a = C0453r1.m1265a(this);
            while (i6 < virtualChildCount2) {
                View childAt3 = getChildAt(i6);
                if (!(childAt3 == null || childAt3.getVisibility() == 8 || !mo1734i(i6))) {
                    LayoutParams layoutParams = (LayoutParams) childAt3.getLayoutParams();
                    if (a) {
                        i4 = childAt3.getRight() + layoutParams.rightMargin;
                    } else {
                        i4 = (childAt3.getLeft() - layoutParams.leftMargin) - this.f1220m;
                    }
                    mo1723e(canvas, i4);
                }
                i6++;
            }
            if (mo1734i(virtualChildCount2)) {
                View childAt4 = getChildAt(virtualChildCount2 - 1);
                if (childAt4 != null) {
                    LayoutParams layoutParams2 = (LayoutParams) childAt4.getLayoutParams();
                    if (a) {
                        i3 = childAt4.getLeft() - layoutParams2.leftMargin;
                        i2 = this.f1220m;
                    } else {
                        i = childAt4.getRight() + layoutParams2.rightMargin;
                        mo1723e(canvas, i);
                    }
                } else if (a) {
                    i = getPaddingLeft();
                    mo1723e(canvas, i);
                } else {
                    i3 = getWidth() - getPaddingRight();
                    i2 = this.f1220m;
                }
                i = i3 - i2;
                mo1723e(canvas, i);
            }
        }
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018d  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x019f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            int r1 = r0.f1212e
            r2 = 80
            r3 = 16
            r4 = 8
            r5 = 5
            r6 = 8388615(0x800007, float:1.1754953E-38)
            r7 = 1
            if (r1 != r7) goto L_0x00b8
            int r1 = r17.getPaddingLeft()
            int r8 = r21 - r19
            int r9 = r17.getPaddingRight()
            int r9 = r8 - r9
            int r8 = r8 - r1
            int r10 = r17.getPaddingRight()
            int r8 = r8 - r10
            int r10 = r17.getVirtualChildCount()
            int r11 = r0.f1213f
            r12 = r11 & 112(0x70, float:1.57E-43)
            r6 = r6 & r11
            if (r12 == r3) goto L_0x0041
            if (r12 == r2) goto L_0x0035
            int r2 = r17.getPaddingTop()
            goto L_0x004d
        L_0x0035:
            int r2 = r17.getPaddingTop()
            int r2 = r2 + r22
            int r2 = r2 - r20
            int r3 = r0.f1214g
            int r2 = r2 - r3
            goto L_0x004d
        L_0x0041:
            int r2 = r17.getPaddingTop()
            int r3 = r22 - r20
            int r11 = r0.f1214g
            int r3 = r3 - r11
            int r3 = r3 / 2
            int r2 = r2 + r3
        L_0x004d:
            r3 = 0
        L_0x004e:
            if (r3 >= r10) goto L_0x01ce
            android.view.View r11 = r0.getChildAt(r3)
            if (r11 != 0) goto L_0x0059
            int r2 = r2 + 0
            goto L_0x00b3
        L_0x0059:
            int r12 = r11.getVisibility()
            if (r12 == r4) goto L_0x00b3
            int r4 = r11.getMeasuredWidth()
            int r12 = r11.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r13 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r13
            int r14 = r13.gravity
            if (r14 >= 0) goto L_0x0072
            r14 = r6
        L_0x0072:
            java.util.WeakHashMap<android.view.View, s1.p0> r15 = p242s1.C6333d0.f19990a
            int r15 = p242s1.C6333d0.C6338e.m15063d(r17)
            int r14 = android.view.Gravity.getAbsoluteGravity(r14, r15)
            r14 = r14 & 7
            if (r14 == r7) goto L_0x008b
            if (r14 == r5) goto L_0x0086
            int r5 = r13.leftMargin
            int r5 = r5 + r1
            goto L_0x0096
        L_0x0086:
            int r5 = r9 - r4
            int r14 = r13.rightMargin
            goto L_0x0095
        L_0x008b:
            int r5 = r8 - r4
            int r5 = r5 / 2
            int r5 = r5 + r1
            int r14 = r13.leftMargin
            int r5 = r5 + r14
            int r14 = r13.rightMargin
        L_0x0095:
            int r5 = r5 - r14
        L_0x0096:
            boolean r14 = r0.mo1734i(r3)
            if (r14 == 0) goto L_0x009f
            int r14 = r0.f1221n
            int r2 = r2 + r14
        L_0x009f:
            int r14 = r13.topMargin
            int r2 = r2 + r14
            int r14 = r2 + 0
            int r4 = r4 + r5
            int r15 = r12 + r14
            r11.layout(r5, r14, r4, r15)
            int r4 = r13.bottomMargin
            r5 = 0
            int r2 = p379.C16530d.m42011d(r12, r4, r5, r2)
            int r3 = r3 + 0
        L_0x00b3:
            int r3 = r3 + r7
            r4 = 8
            r5 = 5
            goto L_0x004e
        L_0x00b8:
            boolean r1 = androidx.appcompat.widget.C0453r1.m1265a(r17)
            int r2 = r17.getPaddingTop()
            int r3 = r22 - r20
            int r4 = r17.getPaddingBottom()
            int r4 = r3 - r4
            int r3 = r3 - r2
            int r5 = r17.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r17.getVirtualChildCount()
            int r8 = r0.f1213f
            r6 = r6 & r8
            r8 = r8 & 112(0x70, float:1.57E-43)
            boolean r9 = r0.f1209b
            int[] r10 = r0.f1217j
            int[] r11 = r0.f1218k
            java.util.WeakHashMap<android.view.View, s1.p0> r12 = p242s1.C6333d0.f19990a
            int r12 = p242s1.C6333d0.C6338e.m15063d(r17)
            int r6 = android.view.Gravity.getAbsoluteGravity(r6, r12)
            if (r6 == r7) goto L_0x00fd
            r7 = 5
            if (r6 == r7) goto L_0x00f1
            int r6 = r17.getPaddingLeft()
            goto L_0x0109
        L_0x00f1:
            int r6 = r17.getPaddingLeft()
            int r6 = r6 + r21
            int r6 = r6 - r19
            int r7 = r0.f1214g
            int r6 = r6 - r7
            goto L_0x0109
        L_0x00fd:
            int r6 = r17.getPaddingLeft()
            int r7 = r21 - r19
            int r12 = r0.f1214g
            int r7 = r7 - r12
            int r7 = r7 / 2
            int r6 = r6 + r7
        L_0x0109:
            if (r1 == 0) goto L_0x010f
            int r1 = r5 + -1
            r7 = -1
            goto L_0x0111
        L_0x010f:
            r1 = 0
            r7 = 1
        L_0x0111:
            r12 = 0
        L_0x0112:
            if (r12 >= r5) goto L_0x01ce
            int r13 = r7 * r12
            int r13 = r13 + r1
            android.view.View r14 = r0.getChildAt(r13)
            if (r14 != 0) goto L_0x0123
            int r6 = r6 + 0
            r18 = r1
            goto L_0x01b8
        L_0x0123:
            int r15 = r14.getVisibility()
            r18 = r1
            r1 = 8
            if (r15 == r1) goto L_0x01b8
            int r1 = r14.getMeasuredWidth()
            int r15 = r14.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r16 = r14.getLayoutParams()
            r20 = r5
            r5 = r16
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r5 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r5
            if (r9 == 0) goto L_0x014f
            r19 = r7
            int r7 = r5.height
            r22 = r8
            r8 = -1
            if (r7 == r8) goto L_0x0153
            int r7 = r14.getBaseline()
            goto L_0x0154
        L_0x014f:
            r19 = r7
            r22 = r8
        L_0x0153:
            r7 = -1
        L_0x0154:
            int r8 = r5.gravity
            if (r8 >= 0) goto L_0x015a
            r8 = r22
        L_0x015a:
            r8 = r8 & 112(0x70, float:1.57E-43)
            r16 = r9
            r9 = 16
            if (r8 == r9) goto L_0x018d
            r9 = 48
            if (r8 == r9) goto L_0x017f
            r9 = 80
            if (r8 == r9) goto L_0x016c
            r8 = r2
            goto L_0x0199
        L_0x016c:
            int r8 = r4 - r15
            int r9 = r5.bottomMargin
            int r8 = r8 - r9
            r9 = -1
            if (r7 == r9) goto L_0x0199
            int r9 = r14.getMeasuredHeight()
            int r9 = r9 - r7
            r7 = 2
            r7 = r11[r7]
            int r7 = r7 - r9
            int r8 = r8 - r7
            goto L_0x0199
        L_0x017f:
            r8 = -1
            int r9 = r5.topMargin
            int r9 = r9 + r2
            if (r7 == r8) goto L_0x018b
            r8 = 1
            r8 = r10[r8]
            int r8 = r8 - r7
            int r8 = r8 + r9
            goto L_0x0199
        L_0x018b:
            r8 = r9
            goto L_0x0199
        L_0x018d:
            int r7 = r3 - r15
            int r7 = r7 / 2
            int r7 = r7 + r2
            int r8 = r5.topMargin
            int r7 = r7 + r8
            int r8 = r5.bottomMargin
            int r8 = r7 - r8
        L_0x0199:
            boolean r7 = r0.mo1734i(r13)
            if (r7 == 0) goto L_0x01a2
            int r7 = r0.f1220m
            int r6 = r6 + r7
        L_0x01a2:
            int r7 = r5.leftMargin
            int r6 = r6 + r7
            int r7 = r6 + 0
            int r9 = r1 + r7
            int r15 = r15 + r8
            r14.layout(r7, r8, r9, r15)
            int r5 = r5.rightMargin
            r7 = 0
            int r1 = p379.C16530d.m42011d(r1, r5, r7, r6)
            int r12 = r12 + 0
            r6 = r1
            goto L_0x01c0
        L_0x01b8:
            r20 = r5
            r19 = r7
            r22 = r8
            r16 = r9
        L_0x01c0:
            int r12 = r12 + 1
            r1 = r18
            r7 = r19
            r5 = r20
            r8 = r22
            r9 = r16
            goto L_0x0112
        L_0x01ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onLayout(boolean, int, int, int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:142:0x02f0  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:208:0x04a2  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04a7  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04d0  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04d5  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x04dd  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x0500  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x050f  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x052f  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0552  */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x055f  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0561  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0569  */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0574  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x05fe  */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x0650  */
    /* JADX WARNING: Removed duplicated region for block: B:309:0x06ce  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x06eb  */
    /* JADX WARNING: Removed duplicated region for block: B:357:0x07dc  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x0834  */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x083c  */
    /* JADX WARNING: Removed duplicated region for block: B:380:0x0897  */
    /* JADX WARNING: Removed duplicated region for block: B:429:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r33, int r34) {
        /*
            r32 = this;
            r6 = r32
            r7 = r33
            r8 = r34
            int r0 = r6.f1212e
            r1 = -2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 8
            r4 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            r9 = 1
            r10 = 0
            if (r0 != r9) goto L_0x038f
            r6.f1214g = r10
            int r9 = r32.getVirtualChildCount()
            int r11 = android.view.View.MeasureSpec.getMode(r33)
            int r12 = android.view.View.MeasureSpec.getMode(r34)
            int r13 = r6.f1210c
            boolean r14 = r6.f1216i
            r0 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 1
            r23 = 0
            r0 = 0
            r2 = 0
            r7 = 0
            r8 = 0
            r10 = 0
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            r16 = 0
            r17 = 0
        L_0x0043:
            if (r10 >= r9) goto L_0x0177
            android.view.View r18 = r6.getChildAt(r10)
            if (r18 != 0) goto L_0x0051
            int r1 = r6.f1214g
            int r1 = r1 + r0
            r6.f1214g = r1
            goto L_0x0059
        L_0x0051:
            int r0 = r18.getVisibility()
            if (r0 != r3) goto L_0x005f
            int r10 = r10 + 0
        L_0x0059:
            r19 = r9
            r25 = r12
            goto L_0x0166
        L_0x005f:
            boolean r0 = r6.mo1734i(r10)
            if (r0 == 0) goto L_0x006c
            int r0 = r6.f1214g
            int r3 = r6.f1221n
            int r0 = r0 + r3
            r6.f1214g = r0
        L_0x006c:
            android.view.ViewGroup$LayoutParams r0 = r18.getLayoutParams()
            r3 = r0
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r3 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r3
            float r0 = r3.weight
            float r20 = r20 + r0
            if (r12 != r5) goto L_0x0099
            int r5 = r3.height
            if (r5 != 0) goto L_0x0099
            int r5 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x0099
            int r0 = r6.f1214g
            int r1 = r3.topMargin
            int r1 = r1 + r0
            int r4 = r3.bottomMargin
            int r1 = r1 + r4
            int r0 = java.lang.Math.max(r0, r1)
            r6.f1214g = r0
            r21 = 1
            r26 = r2
            r19 = r9
            r25 = r12
            r12 = r3
            goto L_0x00f0
        L_0x0099:
            int r5 = r3.height
            if (r5 != 0) goto L_0x00a6
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00a6
            r3.height = r1
            r0 = 0
            r5 = 0
            goto L_0x00aa
        L_0x00a6:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00aa:
            r19 = 0
            int r0 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x00b5
            int r0 = r6.f1214g
            r24 = r0
            goto L_0x00b8
        L_0x00b5:
            r0 = 0
            r24 = 0
        L_0x00b8:
            r0 = r32
            r1 = r18
            r4 = r2
            r2 = r33
            r25 = r12
            r12 = r3
            r3 = r19
            r26 = r4
            r4 = r34
            r19 = r9
            r9 = r5
            r5 = r24
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            if (r9 == r15) goto L_0x00d4
            r12.height = r9
        L_0x00d4:
            int r0 = r18.getMeasuredHeight()
            int r1 = r6.f1214g
            int r2 = r1 + r0
            int r3 = r12.topMargin
            int r2 = r2 + r3
            int r3 = r12.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 + 0
            int r1 = java.lang.Math.max(r1, r2)
            r6.f1214g = r1
            if (r14 == 0) goto L_0x00f0
            int r7 = java.lang.Math.max(r0, r7)
        L_0x00f0:
            if (r13 < 0) goto L_0x00fa
            int r0 = r10 + 1
            if (r13 != r0) goto L_0x00fa
            int r0 = r6.f1214g
            r6.f1211d = r0
        L_0x00fa:
            if (r10 >= r13) goto L_0x010c
            float r0 = r12.weight
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0104
            goto L_0x010c
        L_0x0104:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex."
            r0.<init>(r1)
            throw r0
        L_0x010c:
            r0 = 1073741824(0x40000000, float:2.0)
            if (r11 == r0) goto L_0x0119
            int r0 = r12.width
            r1 = -1
            if (r0 != r1) goto L_0x0119
            r0 = 1
            r23 = 1
            goto L_0x011a
        L_0x0119:
            r0 = 0
        L_0x011a:
            int r1 = r12.leftMargin
            int r2 = r12.rightMargin
            int r1 = r1 + r2
            int r2 = r18.getMeasuredWidth()
            int r2 = r2 + r1
            int r3 = java.lang.Math.max(r8, r2)
            int r4 = r18.getMeasuredState()
            r5 = r17
            int r4 = android.view.View.combineMeasuredStates(r5, r4)
            if (r22 == 0) goto L_0x013b
            int r5 = r12.width
            r8 = -1
            if (r5 != r8) goto L_0x013b
            r5 = 1
            goto L_0x013c
        L_0x013b:
            r5 = 0
        L_0x013c:
            float r8 = r12.weight
            r9 = 0
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L_0x0150
            if (r0 == 0) goto L_0x0146
            goto L_0x0147
        L_0x0146:
            r1 = r2
        L_0x0147:
            r9 = r16
            int r8 = java.lang.Math.max(r9, r1)
            r2 = r26
            goto L_0x015d
        L_0x0150:
            r9 = r16
            if (r0 == 0) goto L_0x0155
            goto L_0x0156
        L_0x0155:
            r1 = r2
        L_0x0156:
            r15 = r26
            int r2 = java.lang.Math.max(r15, r1)
            r8 = r9
        L_0x015d:
            int r10 = r10 + 0
            r17 = r4
            r22 = r5
            r16 = r8
            r8 = r3
        L_0x0166:
            int r10 = r10 + 1
            r0 = 0
            r1 = -2
            r15 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 8
            r4 = 0
            r5 = 1073741824(0x40000000, float:2.0)
            r9 = r19
            r12 = r25
            goto L_0x0043
        L_0x0177:
            r15 = r2
            r19 = r9
            r25 = r12
            r9 = r16
            r5 = r17
            int r0 = r6.f1214g
            r10 = r19
            if (r0 <= 0) goto L_0x0193
            boolean r0 = r6.mo1734i(r10)
            if (r0 == 0) goto L_0x0193
            int r0 = r6.f1214g
            int r1 = r6.f1221n
            int r0 = r0 + r1
            r6.f1214g = r0
        L_0x0193:
            if (r14 == 0) goto L_0x01d6
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r25
            if (r1 == r0) goto L_0x019d
            if (r1 != 0) goto L_0x01d8
        L_0x019d:
            r0 = 0
            r6.f1214g = r0
            r2 = 0
        L_0x01a1:
            if (r2 >= r10) goto L_0x01d8
            android.view.View r3 = r6.getChildAt(r2)
            if (r3 != 0) goto L_0x01af
            int r3 = r6.f1214g
            int r3 = r3 + r0
            r6.f1214g = r3
            goto L_0x01d2
        L_0x01af:
            int r0 = r3.getVisibility()
            r4 = 8
            if (r0 != r4) goto L_0x01ba
            int r2 = r2 + 0
            goto L_0x01d2
        L_0x01ba:
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r0
            int r3 = r6.f1214g
            int r4 = r3 + r7
            int r12 = r0.topMargin
            int r4 = r4 + r12
            int r0 = r0.bottomMargin
            int r4 = r4 + r0
            int r4 = r4 + 0
            int r0 = java.lang.Math.max(r3, r4)
            r6.f1214g = r0
        L_0x01d2:
            int r2 = r2 + 1
            r0 = 0
            goto L_0x01a1
        L_0x01d6:
            r1 = r25
        L_0x01d8:
            int r0 = r6.f1214g
            int r2 = r32.getPaddingTop()
            int r3 = r32.getPaddingBottom()
            int r3 = r3 + r2
            int r3 = r3 + r0
            r6.f1214g = r3
            int r0 = r32.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r3, r0)
            r2 = 0
            r3 = r9
            r9 = r34
            int r0 = android.view.View.resolveSizeAndState(r0, r9, r2)
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r0
            int r4 = r6.f1214g
            int r2 = r2 - r4
            if (r21 != 0) goto L_0x0248
            if (r2 == 0) goto L_0x0207
            r4 = 0
            int r4 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0207
            goto L_0x0248
        L_0x0207:
            int r2 = java.lang.Math.max(r15, r3)
            if (r14 == 0) goto L_0x0244
            r3 = 1073741824(0x40000000, float:2.0)
            if (r1 == r3) goto L_0x0244
            r1 = 0
        L_0x0212:
            if (r1 >= r10) goto L_0x0244
            android.view.View r3 = r6.getChildAt(r1)
            if (r3 == 0) goto L_0x0241
            int r4 = r3.getVisibility()
            r12 = 8
            if (r4 != r12) goto L_0x0223
            goto L_0x0241
        L_0x0223:
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r4 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r4
            float r4 = r4.weight
            r12 = 0
            int r4 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x0241
            int r4 = r3.getMeasuredWidth()
            r12 = 1073741824(0x40000000, float:2.0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r12)
            int r12 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r12)
            r3.measure(r4, r12)
        L_0x0241:
            int r1 = r1 + 1
            goto L_0x0212
        L_0x0244:
            r9 = r33
            goto L_0x032f
        L_0x0248:
            float r3 = r6.f1215h
            r4 = 0
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x0251
            r20 = r3
        L_0x0251:
            r3 = 0
            r6.f1214g = r3
        L_0x0254:
            if (r3 >= r10) goto L_0x031e
            android.view.View r4 = r6.getChildAt(r3)
            int r7 = r4.getVisibility()
            r12 = 8
            if (r7 != r12) goto L_0x0268
            r9 = r33
            r25 = r1
            goto L_0x0316
        L_0x0268:
            android.view.ViewGroup$LayoutParams r7 = r4.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r7 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r7
            float r12 = r7.weight
            r13 = 0
            int r13 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r13 <= 0) goto L_0x02cc
            float r13 = (float) r2
            float r13 = r13 * r12
            float r13 = r13 / r20
            int r13 = (int) r13
            float r20 = r20 - r12
            int r2 = r2 - r13
            int r12 = r32.getPaddingLeft()
            int r14 = r32.getPaddingRight()
            int r14 = r14 + r12
            int r12 = r7.leftMargin
            int r14 = r14 + r12
            int r12 = r7.rightMargin
            int r14 = r14 + r12
            int r12 = r7.width
            r9 = r33
            int r12 = android.view.ViewGroup.getChildMeasureSpec(r9, r14, r12)
            int r14 = r7.height
            if (r14 != 0) goto L_0x02aa
            r14 = 1073741824(0x40000000, float:2.0)
            if (r1 == r14) goto L_0x029e
            goto L_0x02ac
        L_0x029e:
            if (r13 <= 0) goto L_0x02a1
            goto L_0x02a2
        L_0x02a1:
            r13 = 0
        L_0x02a2:
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r14)
            r4.measure(r12, r13)
            goto L_0x02c1
        L_0x02aa:
            r14 = 1073741824(0x40000000, float:2.0)
        L_0x02ac:
            int r16 = r4.getMeasuredHeight()
            int r16 = r16 + r13
            if (r16 >= 0) goto L_0x02b8
            r16 = 0
            r13 = 0
            goto L_0x02ba
        L_0x02b8:
            r13 = r16
        L_0x02ba:
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r14)
            r4.measure(r12, r13)
        L_0x02c1:
            int r12 = r4.getMeasuredState()
            r12 = r12 & -256(0xffffffffffffff00, float:NaN)
            int r5 = android.view.View.combineMeasuredStates(r5, r12)
            goto L_0x02ce
        L_0x02cc:
            r9 = r33
        L_0x02ce:
            int r12 = r7.leftMargin
            int r13 = r7.rightMargin
            int r12 = r12 + r13
            int r13 = r4.getMeasuredWidth()
            int r13 = r13 + r12
            int r8 = java.lang.Math.max(r8, r13)
            r14 = 1073741824(0x40000000, float:2.0)
            if (r11 == r14) goto L_0x02e9
            int r14 = r7.width
            r25 = r1
            r1 = -1
            if (r14 != r1) goto L_0x02ec
            r14 = 1
            goto L_0x02ed
        L_0x02e9:
            r25 = r1
            r1 = -1
        L_0x02ec:
            r14 = 0
        L_0x02ed:
            if (r14 == 0) goto L_0x02f0
            goto L_0x02f1
        L_0x02f0:
            r12 = r13
        L_0x02f1:
            int r12 = java.lang.Math.max(r15, r12)
            if (r22 == 0) goto L_0x02fd
            int r13 = r7.width
            if (r13 != r1) goto L_0x02fd
            r1 = 1
            goto L_0x02fe
        L_0x02fd:
            r1 = 0
        L_0x02fe:
            int r13 = r6.f1214g
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r13
            int r14 = r7.topMargin
            int r4 = r4 + r14
            int r7 = r7.bottomMargin
            int r4 = r4 + r7
            int r4 = r4 + 0
            int r4 = java.lang.Math.max(r13, r4)
            r6.f1214g = r4
            r22 = r1
            r15 = r12
        L_0x0316:
            int r3 = r3 + 1
            r9 = r34
            r1 = r25
            goto L_0x0254
        L_0x031e:
            r9 = r33
            int r1 = r6.f1214g
            int r2 = r32.getPaddingTop()
            int r3 = r32.getPaddingBottom()
            int r3 = r3 + r2
            int r3 = r3 + r1
            r6.f1214g = r3
            r2 = r15
        L_0x032f:
            if (r22 != 0) goto L_0x0336
            r1 = 1073741824(0x40000000, float:2.0)
            if (r11 == r1) goto L_0x0336
            goto L_0x0337
        L_0x0336:
            r2 = r8
        L_0x0337:
            int r1 = r32.getPaddingLeft()
            int r3 = r32.getPaddingRight()
            int r3 = r3 + r1
            int r3 = r3 + r2
            int r1 = r32.getSuggestedMinimumWidth()
            int r1 = java.lang.Math.max(r3, r1)
            int r1 = android.view.View.resolveSizeAndState(r1, r9, r5)
            r6.setMeasuredDimension(r1, r0)
            if (r23 == 0) goto L_0x08d5
            int r0 = r32.getMeasuredWidth()
            r1 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r1)
            r0 = 0
            r8 = 0
        L_0x035e:
            if (r8 >= r10) goto L_0x08d5
            android.view.View r1 = r6.getChildAt(r8)
            int r0 = r1.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x038c
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r9 = r0
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r9 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r9
            int r0 = r9.width
            r2 = -1
            if (r0 != r2) goto L_0x038c
            int r11 = r9.height
            int r0 = r1.getMeasuredHeight()
            r9.height = r0
            r3 = 0
            r5 = 0
            r0 = r32
            r2 = r7
            r4 = r34
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r9.height = r11
        L_0x038c:
            int r8 = r8 + 1
            goto L_0x035e
        L_0x038f:
            r9 = r7
            r0 = 0
            r7 = 1
            r6.f1214g = r0
            int r8 = r32.getVirtualChildCount()
            int r10 = android.view.View.MeasureSpec.getMode(r33)
            int r11 = android.view.View.MeasureSpec.getMode(r34)
            int[] r0 = r6.f1217j
            r1 = 4
            if (r0 == 0) goto L_0x03a9
            int[] r0 = r6.f1218k
            if (r0 != 0) goto L_0x03b1
        L_0x03a9:
            int[] r0 = new int[r1]
            r6.f1217j = r0
            int[] r0 = new int[r1]
            r6.f1218k = r0
        L_0x03b1:
            int[] r12 = r6.f1217j
            int[] r13 = r6.f1218k
            r0 = 3
            r1 = -1
            r12[r0] = r1
            r14 = 2
            r12[r14] = r1
            r12[r7] = r1
            r2 = 0
            r12[r2] = r1
            r13[r0] = r1
            r13[r14] = r1
            r13[r7] = r1
            r13[r2] = r1
            boolean r15 = r6.f1209b
            boolean r5 = r6.f1216i
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 != r0) goto L_0x03d5
            r0 = 1
            r16 = 1
            goto L_0x03d8
        L_0x03d5:
            r0 = 0
            r16 = 0
        L_0x03d8:
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r17 = 0
            r18 = 0
            r19 = 1
            r20 = 0
            r21 = 0
            r0 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r7 = 0
            r14 = 0
        L_0x03ed:
            if (r2 >= r8) goto L_0x0593
            r22 = r5
            android.view.View r5 = r6.getChildAt(r2)
            if (r5 != 0) goto L_0x0402
            int r5 = r6.f1214g
            int r5 = r5 + 0
            r6.f1214g = r5
            r23 = r0
            r24 = r3
            goto L_0x0410
        L_0x0402:
            r23 = r0
            int r0 = r5.getVisibility()
            r24 = r3
            r3 = 8
            if (r0 != r3) goto L_0x0418
            int r2 = r2 + 0
        L_0x0410:
            r0 = r23
            r3 = r24
            r24 = r10
            goto L_0x0589
        L_0x0418:
            boolean r0 = r6.mo1734i(r2)
            if (r0 == 0) goto L_0x0425
            int r0 = r6.f1214g
            int r3 = r6.f1220m
            int r0 = r0 + r3
            r6.f1214g = r0
        L_0x0425:
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            r3 = r0
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r3 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r3
            float r0 = r3.weight
            float r25 = r1 + r0
            r1 = 1073741824(0x40000000, float:2.0)
            if (r10 != r1) goto L_0x0488
            int r1 = r3.width
            if (r1 != 0) goto L_0x0488
            r1 = 0
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0488
            if (r16 == 0) goto L_0x044c
            int r0 = r6.f1214g
            int r1 = r3.leftMargin
            r26 = r2
            int r2 = r3.rightMargin
            int r1 = r1 + r2
            int r1 = r1 + r0
            r6.f1214g = r1
            goto L_0x045c
        L_0x044c:
            r26 = r2
            int r0 = r6.f1214g
            int r1 = r3.leftMargin
            int r1 = r1 + r0
            int r2 = r3.rightMargin
            int r1 = r1 + r2
            int r0 = java.lang.Math.max(r0, r1)
            r6.f1214g = r0
        L_0x045c:
            if (r15 == 0) goto L_0x0474
            r0 = 0
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r0)
            r5.measure(r0, r0)
            r0 = r3
            r9 = r23
            r30 = r24
            r23 = r26
            r26 = r5
            r24 = r10
            r10 = r4
            goto L_0x0505
        L_0x0474:
            r0 = 1073741824(0x40000000, float:2.0)
            r18 = 1
            r0 = r3
            r1 = r23
            r30 = r24
            r23 = r26
            r2 = 1073741824(0x40000000, float:2.0)
            r26 = r5
            r24 = r10
            r10 = r4
            goto L_0x0508
        L_0x0488:
            r26 = r2
            int r1 = r3.width
            if (r1 != 0) goto L_0x0499
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x049a
            r0 = -2
            r3.width = r0
            r0 = 0
            r2 = 0
            goto L_0x049e
        L_0x0499:
            r1 = 0
        L_0x049a:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x049e:
            int r0 = (r25 > r1 ? 1 : (r25 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x04a7
            int r0 = r6.f1214g
            r27 = r0
            goto L_0x04aa
        L_0x04a7:
            r0 = 0
            r27 = 0
        L_0x04aa:
            r28 = 0
            r1 = r23
            r0 = r32
            r9 = r1
            r1 = r5
            r29 = r2
            r23 = r26
            r2 = r33
            r31 = r3
            r30 = r24
            r3 = r27
            r24 = r10
            r10 = r4
            r4 = r34
            r26 = r5
            r5 = r28
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r29
            if (r1 == r0) goto L_0x04d5
            r0 = r31
            r0.width = r1
            goto L_0x04d7
        L_0x04d5:
            r0 = r31
        L_0x04d7:
            int r1 = r26.getMeasuredWidth()
            if (r16 == 0) goto L_0x04ec
            int r2 = r6.f1214g
            int r3 = r0.leftMargin
            int r3 = r3 + r1
            int r4 = r0.rightMargin
            r5 = 0
            int r2 = p379.C16530d.m42011d(r3, r4, r5, r2)
            r6.f1214g = r2
            goto L_0x04fe
        L_0x04ec:
            int r2 = r6.f1214g
            int r3 = r2 + r1
            int r4 = r0.leftMargin
            int r3 = r3 + r4
            int r4 = r0.rightMargin
            int r3 = r3 + r4
            int r3 = r3 + 0
            int r2 = java.lang.Math.max(r2, r3)
            r6.f1214g = r2
        L_0x04fe:
            if (r22 == 0) goto L_0x0505
            int r1 = java.lang.Math.max(r1, r9)
            goto L_0x0506
        L_0x0505:
            r1 = r9
        L_0x0506:
            r2 = 1073741824(0x40000000, float:2.0)
        L_0x0508:
            if (r11 == r2) goto L_0x0513
            int r2 = r0.height
            r3 = -1
            if (r2 != r3) goto L_0x0513
            r2 = 1
            r20 = 1
            goto L_0x0514
        L_0x0513:
            r2 = 0
        L_0x0514:
            int r3 = r0.topMargin
            int r4 = r0.bottomMargin
            int r3 = r3 + r4
            int r4 = r26.getMeasuredHeight()
            int r4 = r4 + r3
            int r5 = r26.getMeasuredState()
            int r5 = android.view.View.combineMeasuredStates(r14, r5)
            if (r15 == 0) goto L_0x0552
            int r9 = r26.getBaseline()
            r14 = -1
            if (r9 == r14) goto L_0x0552
            int r14 = r0.gravity
            if (r14 >= 0) goto L_0x0535
            int r14 = r6.f1213f
        L_0x0535:
            r14 = r14 & 112(0x70, float:1.57E-43)
            int r14 = r14 >> 4
            r14 = r14 & -2
            int r14 = r14 >> 1
            r26 = r1
            r1 = r12[r14]
            int r1 = java.lang.Math.max(r1, r9)
            r12[r14] = r1
            r1 = r13[r14]
            int r9 = r4 - r9
            int r1 = java.lang.Math.max(r1, r9)
            r13[r14] = r1
            goto L_0x0554
        L_0x0552:
            r26 = r1
        L_0x0554:
            int r1 = java.lang.Math.max(r10, r4)
            if (r19 == 0) goto L_0x0561
            int r9 = r0.height
            r10 = -1
            if (r9 != r10) goto L_0x0561
            r9 = 1
            goto L_0x0562
        L_0x0561:
            r9 = 0
        L_0x0562:
            float r0 = r0.weight
            r10 = 0
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x0574
            if (r2 == 0) goto L_0x056c
            goto L_0x056d
        L_0x056c:
            r3 = r4
        L_0x056d:
            r0 = r30
            int r3 = java.lang.Math.max(r0, r3)
            goto L_0x057f
        L_0x0574:
            r0 = r30
            if (r2 == 0) goto L_0x0579
            goto L_0x057a
        L_0x0579:
            r3 = r4
        L_0x057a:
            int r7 = java.lang.Math.max(r7, r3)
            r3 = r0
        L_0x057f:
            int r2 = r23 + 0
            r4 = r1
            r14 = r5
            r19 = r9
            r1 = r25
            r0 = r26
        L_0x0589:
            int r2 = r2 + 1
            r9 = r33
            r5 = r22
            r10 = r24
            goto L_0x03ed
        L_0x0593:
            r9 = r0
            r0 = r3
            r22 = r5
            r24 = r10
            r10 = r4
            int r2 = r6.f1214g
            if (r2 <= 0) goto L_0x05ab
            boolean r2 = r6.mo1734i(r8)
            if (r2 == 0) goto L_0x05ab
            int r2 = r6.f1214g
            int r3 = r6.f1220m
            int r2 = r2 + r3
            r6.f1214g = r2
        L_0x05ab:
            r2 = 1
            r3 = r12[r2]
            r2 = -1
            if (r3 != r2) goto L_0x05c7
            r4 = 0
            r4 = r12[r4]
            if (r4 != r2) goto L_0x05c7
            r4 = 2
            r5 = r12[r4]
            if (r5 != r2) goto L_0x05c7
            r4 = 3
            r5 = r12[r4]
            if (r5 == r2) goto L_0x05c1
            goto L_0x05c8
        L_0x05c1:
            r4 = r10
            r23 = r14
            r25 = r15
            goto L_0x05fc
        L_0x05c7:
            r4 = 3
        L_0x05c8:
            r2 = r12[r4]
            r4 = 0
            r4 = r12[r4]
            r23 = r14
            r5 = 2
            r14 = r12[r5]
            int r3 = java.lang.Math.max(r3, r14)
            int r3 = java.lang.Math.max(r4, r3)
            int r2 = java.lang.Math.max(r2, r3)
            r3 = 3
            r3 = r13[r3]
            r4 = 0
            r4 = r13[r4]
            r25 = r15
            r14 = 1
            r15 = r13[r14]
            r14 = r13[r5]
            int r5 = java.lang.Math.max(r15, r14)
            int r4 = java.lang.Math.max(r4, r5)
            int r3 = java.lang.Math.max(r3, r4)
            int r3 = r3 + r2
            int r4 = java.lang.Math.max(r10, r3)
        L_0x05fc:
            if (r22 == 0) goto L_0x0650
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r24
            if (r3 == r2) goto L_0x0606
            if (r3 != 0) goto L_0x0652
        L_0x0606:
            r2 = 0
            r6.f1214g = r2
            r5 = 0
        L_0x060a:
            if (r5 >= r8) goto L_0x0652
            android.view.View r10 = r6.getChildAt(r5)
            if (r10 != 0) goto L_0x0618
            int r10 = r6.f1214g
            int r10 = r10 + r2
            r6.f1214g = r10
            goto L_0x064c
        L_0x0618:
            int r2 = r10.getVisibility()
            r14 = 8
            if (r2 != r14) goto L_0x0623
            int r5 = r5 + 0
            goto L_0x064c
        L_0x0623:
            android.view.ViewGroup$LayoutParams r2 = r10.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r2 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r2
            if (r16 == 0) goto L_0x063a
            int r10 = r6.f1214g
            int r14 = r2.leftMargin
            int r14 = r14 + r9
            int r2 = r2.rightMargin
            r15 = 0
            int r2 = p379.C16530d.m42011d(r14, r2, r15, r10)
            r6.f1214g = r2
            goto L_0x064c
        L_0x063a:
            int r10 = r6.f1214g
            int r14 = r10 + r9
            int r15 = r2.leftMargin
            int r14 = r14 + r15
            int r2 = r2.rightMargin
            int r14 = r14 + r2
            int r14 = r14 + 0
            int r2 = java.lang.Math.max(r10, r14)
            r6.f1214g = r2
        L_0x064c:
            int r5 = r5 + 1
            r2 = 0
            goto L_0x060a
        L_0x0650:
            r3 = r24
        L_0x0652:
            int r2 = r6.f1214g
            int r5 = r32.getPaddingLeft()
            int r10 = r32.getPaddingRight()
            int r10 = r10 + r5
            int r10 = r10 + r2
            r6.f1214g = r10
            int r2 = r32.getSuggestedMinimumWidth()
            int r2 = java.lang.Math.max(r10, r2)
            r5 = 0
            r10 = r9
            r9 = r33
            int r2 = android.view.View.resolveSizeAndState(r2, r9, r5)
            r5 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r2
            int r14 = r6.f1214g
            int r5 = r5 - r14
            if (r18 != 0) goto L_0x06c7
            if (r5 == 0) goto L_0x0681
            r14 = 0
            int r14 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r14 <= 0) goto L_0x0681
            goto L_0x06c7
        L_0x0681:
            int r0 = java.lang.Math.max(r7, r0)
            if (r22 == 0) goto L_0x06be
            r1 = 1073741824(0x40000000, float:2.0)
            if (r3 == r1) goto L_0x06be
            r1 = 0
        L_0x068c:
            if (r1 >= r8) goto L_0x06be
            android.view.View r3 = r6.getChildAt(r1)
            if (r3 == 0) goto L_0x06bb
            int r5 = r3.getVisibility()
            r7 = 8
            if (r5 != r7) goto L_0x069d
            goto L_0x06bb
        L_0x069d:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r5 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r5
            float r5 = r5.weight
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L_0x06bb
            r5 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r5)
            int r12 = r3.getMeasuredHeight()
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r5)
            r3.measure(r7, r5)
        L_0x06bb:
            int r1 = r1 + 1
            goto L_0x068c
        L_0x06be:
            r1 = 0
            r5 = r34
            r18 = r8
            r14 = r23
            goto L_0x086e
        L_0x06c7:
            float r0 = r6.f1215h
            r4 = 0
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x06cf
            r1 = r0
        L_0x06cf:
            r0 = 3
            r4 = -1
            r12[r0] = r4
            r10 = 2
            r12[r10] = r4
            r14 = 1
            r12[r14] = r4
            r15 = 0
            r12[r15] = r4
            r13[r0] = r4
            r13[r10] = r4
            r13[r14] = r4
            r13[r15] = r4
            r6.f1214g = r15
            r0 = 0
            r14 = r23
        L_0x06e9:
            if (r0 >= r8) goto L_0x0812
            android.view.View r10 = r6.getChildAt(r0)
            if (r10 == 0) goto L_0x07fd
            int r15 = r10.getVisibility()
            r9 = 8
            if (r15 != r9) goto L_0x06fb
            goto L_0x07fd
        L_0x06fb:
            android.view.ViewGroup$LayoutParams r9 = r10.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r9 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r9
            float r15 = r9.weight
            r18 = 0
            int r18 = (r15 > r18 ? 1 : (r15 == r18 ? 0 : -1))
            if (r18 <= 0) goto L_0x076a
            r18 = r8
            float r8 = (float) r5
            float r8 = r8 * r15
            float r8 = r8 / r1
            int r8 = (int) r8
            float r1 = r1 - r15
            int r5 = r5 - r8
            int r15 = r32.getPaddingTop()
            int r22 = r32.getPaddingBottom()
            int r22 = r22 + r15
            int r15 = r9.topMargin
            int r22 = r22 + r15
            int r15 = r9.bottomMargin
            int r15 = r22 + r15
            r22 = r1
            int r1 = r9.height
            r23 = r5
            r5 = r34
            int r1 = android.view.ViewGroup.getChildMeasureSpec(r5, r15, r1)
            int r15 = r9.width
            if (r15 != 0) goto L_0x0745
            r15 = 1073741824(0x40000000, float:2.0)
            if (r3 == r15) goto L_0x0739
            goto L_0x0747
        L_0x0739:
            if (r8 <= 0) goto L_0x073c
            goto L_0x073d
        L_0x073c:
            r8 = 0
        L_0x073d:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r15)
            r10.measure(r8, r1)
            goto L_0x075c
        L_0x0745:
            r15 = 1073741824(0x40000000, float:2.0)
        L_0x0747:
            int r24 = r10.getMeasuredWidth()
            int r24 = r24 + r8
            if (r24 >= 0) goto L_0x0753
            r24 = 0
            r8 = 0
            goto L_0x0755
        L_0x0753:
            r8 = r24
        L_0x0755:
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r15)
            r10.measure(r8, r1)
        L_0x075c:
            int r1 = r10.getMeasuredState()
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = r1 & r8
            int r14 = android.view.View.combineMeasuredStates(r14, r1)
            r1 = r22
            goto L_0x0771
        L_0x076a:
            r18 = r8
            r8 = r5
            r5 = r34
            r23 = r8
        L_0x0771:
            if (r16 == 0) goto L_0x078a
            int r8 = r6.f1214g
            int r15 = r10.getMeasuredWidth()
            r22 = r1
            int r1 = r9.leftMargin
            int r15 = r15 + r1
            int r1 = r9.rightMargin
            r24 = r3
            r3 = 0
            int r1 = p379.C16530d.m42011d(r15, r1, r3, r8)
            r6.f1214g = r1
            goto L_0x07a3
        L_0x078a:
            r22 = r1
            r24 = r3
            int r1 = r6.f1214g
            int r3 = r10.getMeasuredWidth()
            int r3 = r3 + r1
            int r8 = r9.leftMargin
            int r3 = r3 + r8
            int r8 = r9.rightMargin
            int r3 = r3 + r8
            int r3 = r3 + 0
            int r1 = java.lang.Math.max(r1, r3)
            r6.f1214g = r1
        L_0x07a3:
            r1 = 1073741824(0x40000000, float:2.0)
            if (r11 == r1) goto L_0x07ae
            int r1 = r9.height
            r3 = -1
            if (r1 != r3) goto L_0x07ae
            r1 = 1
            goto L_0x07af
        L_0x07ae:
            r1 = 0
        L_0x07af:
            int r3 = r9.topMargin
            int r8 = r9.bottomMargin
            int r3 = r3 + r8
            int r8 = r10.getMeasuredHeight()
            int r8 = r8 + r3
            int r4 = java.lang.Math.max(r4, r8)
            if (r1 == 0) goto L_0x07c0
            goto L_0x07c1
        L_0x07c0:
            r3 = r8
        L_0x07c1:
            int r1 = java.lang.Math.max(r7, r3)
            if (r19 == 0) goto L_0x07ce
            int r3 = r9.height
            r7 = -1
            if (r3 != r7) goto L_0x07cf
            r3 = 1
            goto L_0x07d0
        L_0x07ce:
            r7 = -1
        L_0x07cf:
            r3 = 0
        L_0x07d0:
            if (r25 == 0) goto L_0x07f7
            int r10 = r10.getBaseline()
            if (r10 == r7) goto L_0x07f7
            int r7 = r9.gravity
            if (r7 >= 0) goto L_0x07de
            int r7 = r6.f1213f
        L_0x07de:
            r7 = r7 & 112(0x70, float:1.57E-43)
            int r7 = r7 >> 4
            r7 = r7 & -2
            int r7 = r7 >> 1
            r9 = r12[r7]
            int r9 = java.lang.Math.max(r9, r10)
            r12[r7] = r9
            r9 = r13[r7]
            int r8 = r8 - r10
            int r8 = java.lang.Math.max(r9, r8)
            r13[r7] = r8
        L_0x07f7:
            r7 = r1
            r19 = r3
            r1 = r22
            goto L_0x0806
        L_0x07fd:
            r24 = r3
            r18 = r8
            r8 = r5
            r5 = r34
            r23 = r8
        L_0x0806:
            int r0 = r0 + 1
            r9 = r33
            r8 = r18
            r5 = r23
            r3 = r24
            goto L_0x06e9
        L_0x0812:
            r5 = r34
            r18 = r8
            int r0 = r6.f1214g
            int r1 = r32.getPaddingLeft()
            int r3 = r32.getPaddingRight()
            int r3 = r3 + r1
            int r3 = r3 + r0
            r6.f1214g = r3
            r0 = 1
            r1 = r12[r0]
            r0 = -1
            if (r1 != r0) goto L_0x083c
            r3 = 0
            r3 = r12[r3]
            if (r3 != r0) goto L_0x083c
            r3 = 2
            r8 = r12[r3]
            if (r8 != r0) goto L_0x083c
            r3 = 3
            r8 = r12[r3]
            if (r8 == r0) goto L_0x083a
            goto L_0x083d
        L_0x083a:
            r0 = 0
            goto L_0x086c
        L_0x083c:
            r3 = 3
        L_0x083d:
            r0 = r12[r3]
            r8 = 0
            r9 = r12[r8]
            r10 = 2
            r12 = r12[r10]
            int r1 = java.lang.Math.max(r1, r12)
            int r1 = java.lang.Math.max(r9, r1)
            int r0 = java.lang.Math.max(r0, r1)
            r1 = r13[r3]
            r3 = r13[r8]
            r9 = 1
            r9 = r13[r9]
            r10 = r13[r10]
            int r9 = java.lang.Math.max(r9, r10)
            int r3 = java.lang.Math.max(r3, r9)
            int r1 = java.lang.Math.max(r1, r3)
            int r1 = r1 + r0
            int r0 = java.lang.Math.max(r4, r1)
            r4 = r0
        L_0x086c:
            r1 = 0
            r0 = r7
        L_0x086e:
            if (r19 != 0) goto L_0x0875
            r3 = 1073741824(0x40000000, float:2.0)
            if (r11 == r3) goto L_0x0875
            goto L_0x0876
        L_0x0875:
            r0 = r4
        L_0x0876:
            int r3 = r32.getPaddingTop()
            int r4 = r32.getPaddingBottom()
            int r4 = r4 + r3
            int r4 = r4 + r0
            int r0 = r32.getSuggestedMinimumHeight()
            int r0 = java.lang.Math.max(r4, r0)
            r3 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3 = r3 & r14
            r2 = r2 | r3
            int r3 = r14 << 16
            int r0 = android.view.View.resolveSizeAndState(r0, r5, r3)
            r6.setMeasuredDimension(r2, r0)
            if (r20 == 0) goto L_0x08d5
            int r0 = r32.getMeasuredHeight()
            r2 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            r8 = r1
            r9 = r18
        L_0x08a4:
            if (r8 >= r9) goto L_0x08d5
            android.view.View r1 = r6.getChildAt(r8)
            int r0 = r1.getVisibility()
            r2 = 8
            if (r0 == r2) goto L_0x08d2
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            r10 = r0
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r10 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r10
            int r0 = r10.height
            r2 = -1
            if (r0 != r2) goto L_0x08d2
            int r11 = r10.width
            int r0 = r1.getMeasuredWidth()
            r10.width = r0
            r3 = 0
            r5 = 0
            r0 = r32
            r2 = r33
            r4 = r7
            r0.measureChildWithMargins(r1, r2, r3, r4, r5)
            r10.width = r11
        L_0x08d2:
            int r8 = r8 + 1
            goto L_0x08a4
        L_0x08d5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.onMeasure(int, int):void");
    }

    public void setBaselineAligned(boolean z) {
        this.f1209b = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            StringBuilder k = C13555b.m33972k("base aligned child index out of range (0, ");
            k.append(getChildCount());
            k.append(")");
            throw new IllegalArgumentException(k.toString());
        }
        this.f1210c = i;
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable != this.f1219l) {
            this.f1219l = drawable;
            boolean z = false;
            if (drawable != null) {
                this.f1220m = drawable.getIntrinsicWidth();
                this.f1221n = drawable.getIntrinsicHeight();
            } else {
                this.f1220m = 0;
                this.f1221n = 0;
            }
            if (drawable == null) {
                z = true;
            }
            setWillNotDraw(z);
            requestLayout();
        }
    }

    public void setDividerPadding(int i) {
        this.f1223p = i;
    }

    public void setGravity(int i) {
        if (this.f1213f != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f1213f = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.f1213f;
        if ((8388615 & i3) != i2) {
            this.f1213f = i2 | (-8388616 & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.f1216i = z;
    }

    public void setOrientation(int i) {
        if (this.f1212e != i) {
            this.f1212e = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.f1222o) {
            requestLayout();
        }
        this.f1222o = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.f1213f;
        if ((i3 & 112) != i2) {
            this.f1213f = i2 | (i3 & -113);
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.f1215h = Math.max(BitmapDescriptorFactory.HUE_RED, f);
    }

    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Drawable drawable;
        int resourceId;
        this.f1209b = true;
        this.f1210c = -1;
        this.f1211d = 0;
        this.f1213f = 8388659;
        int[] iArr = C5224j.LinearLayoutCompat;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        C6333d0.m15028p(this, context, iArr, attributeSet, obtainStyledAttributes, i, 0);
        int i2 = obtainStyledAttributes.getInt(C5224j.LinearLayoutCompat_android_orientation, -1);
        if (i2 >= 0) {
            setOrientation(i2);
        }
        int i3 = obtainStyledAttributes.getInt(C5224j.LinearLayoutCompat_android_gravity, -1);
        if (i3 >= 0) {
            setGravity(i3);
        }
        boolean z = obtainStyledAttributes.getBoolean(C5224j.LinearLayoutCompat_android_baselineAligned, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.f1215h = obtainStyledAttributes.getFloat(C5224j.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f1210c = obtainStyledAttributes.getInt(C5224j.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f1216i = obtainStyledAttributes.getBoolean(C5224j.LinearLayoutCompat_measureWithLargestChild, false);
        int i4 = C5224j.LinearLayoutCompat_divider;
        if (!obtainStyledAttributes.hasValue(i4) || (resourceId = obtainStyledAttributes.getResourceId(i4, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(i4);
        } else {
            drawable = C5344a.m13397a(context, resourceId);
        }
        setDividerDrawable(drawable);
        this.f1222o = obtainStyledAttributes.getInt(C5224j.LinearLayoutCompat_showDividers, 0);
        this.f1223p = obtainStyledAttributes.getDimensionPixelSize(C5224j.LinearLayoutCompat_dividerPadding, 0);
        obtainStyledAttributes.recycle();
    }
}
