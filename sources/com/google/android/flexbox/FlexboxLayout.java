package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.flexbox.C4093c;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;

public class FlexboxLayout extends ViewGroup implements C4091a {

    /* renamed from: b */
    public int f14678b;

    /* renamed from: c */
    public int f14679c;

    /* renamed from: d */
    public int f14680d;

    /* renamed from: e */
    public int f14681e;

    /* renamed from: f */
    public int f14682f;

    /* renamed from: g */
    public int f14683g;

    /* renamed from: h */
    public Drawable f14684h;

    /* renamed from: i */
    public Drawable f14685i;

    /* renamed from: j */
    public int f14686j;

    /* renamed from: k */
    public int f14687k;

    /* renamed from: l */
    public int f14688l;

    /* renamed from: m */
    public int f14689m;

    /* renamed from: n */
    public int[] f14690n;

    /* renamed from: o */
    public SparseIntArray f14691o;

    /* renamed from: p */
    public C4093c f14692p;

    /* renamed from: q */
    public List<C4092b> f14693q;

    /* renamed from: r */
    public C4093c.C4094a f14694r;

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo16767a(View view, int i, int i2, C4092b bVar) {
        if (!mo16804p(i, i2)) {
            return;
        }
        if (mo16795j()) {
            int i3 = bVar.f14763e;
            int i4 = this.f14689m;
            bVar.f14763e = i3 + i4;
            bVar.f14764f += i4;
            return;
        }
        int i5 = bVar.f14763e;
        int i6 = this.f14688l;
        bVar.f14763e = i5 + i6;
        bVar.f14764f += i6;
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.f14691o == null) {
            this.f14691o = new SparseIntArray(getChildCount());
        }
        C4093c cVar = this.f14692p;
        SparseIntArray sparseIntArray = this.f14691o;
        int flexItemCount = cVar.f14777a.getFlexItemCount();
        ArrayList f = cVar.mo16870f(flexItemCount);
        C4093c.C4095b bVar = new C4093c.C4095b();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            bVar.f14785c = 1;
        } else {
            bVar.f14785c = ((FlexItem) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount) {
            bVar.f14784b = flexItemCount;
        } else if (i < cVar.f14777a.getFlexItemCount()) {
            bVar.f14784b = i;
            for (int i2 = i; i2 < flexItemCount; i2++) {
                ((C4093c.C4095b) f.get(i2)).f14784b++;
            }
        } else {
            bVar.f14784b = flexItemCount;
        }
        f.add(bVar);
        this.f14690n = C4093c.m11049r(flexItemCount + 1, f, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public final int mo16769b(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    /* renamed from: c */
    public final View mo16770c(int i) {
        return getChildAt(i);
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: d */
    public final int mo16772d(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    /* renamed from: e */
    public final int mo16773e(View view) {
        return 0;
    }

    /* renamed from: f */
    public final void mo16774f(C4092b bVar) {
        if (mo16795j()) {
            if ((this.f14687k & 4) > 0) {
                int i = bVar.f14763e;
                int i2 = this.f14689m;
                bVar.f14763e = i + i2;
                bVar.f14764f += i2;
            }
        } else if ((this.f14686j & 4) > 0) {
            int i3 = bVar.f14763e;
            int i4 = this.f14688l;
            bVar.f14763e = i3 + i4;
            bVar.f14764f += i4;
        }
    }

    /* renamed from: g */
    public final View mo16775g(int i) {
        return mo16800o(i);
    }

    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getAlignContent() {
        return this.f14682f;
    }

    public int getAlignItems() {
        return this.f14681e;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.f14684h;
    }

    public Drawable getDividerDrawableVertical() {
        return this.f14685i;
    }

    public int getFlexDirection() {
        return this.f14678b;
    }

    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<C4092b> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f14693q.size());
        for (C4092b next : this.f14693q) {
            if (next.f14766h - next.f14767i != 0) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public List<C4092b> getFlexLinesInternal() {
        return this.f14693q;
    }

    public int getFlexWrap() {
        return this.f14679c;
    }

    public int getJustifyContent() {
        return this.f14680d;
    }

    public int getLargestMainSize() {
        int i = Integer.MIN_VALUE;
        for (C4092b bVar : this.f14693q) {
            i = Math.max(i, bVar.f14763e);
        }
        return i;
    }

    public int getMaxLine() {
        return this.f14683g;
    }

    public int getShowDividerHorizontal() {
        return this.f14686j;
    }

    public int getShowDividerVertical() {
        return this.f14687k;
    }

    public int getSumOfCrossSize() {
        int i;
        int i2;
        int size = this.f14693q.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            C4092b bVar = this.f14693q.get(i4);
            if (mo16805q(i4)) {
                if (mo16795j()) {
                    i2 = this.f14688l;
                } else {
                    i2 = this.f14689m;
                }
                i3 += i2;
            }
            if (mo16806r(i4)) {
                if (mo16795j()) {
                    i = this.f14688l;
                } else {
                    i = this.f14689m;
                }
                i3 += i;
            }
            i3 += bVar.f14765g;
        }
        return i3;
    }

    /* renamed from: h */
    public final void mo16793h(int i, View view) {
    }

    /* renamed from: i */
    public final int mo16794i(View view, int i, int i2) {
        int i3;
        int i4 = 0;
        if (mo16795j()) {
            if (mo16804p(i, i2)) {
                i4 = 0 + this.f14689m;
            }
            if ((this.f14687k & 4) <= 0) {
                return i4;
            }
            i3 = this.f14689m;
        } else {
            if (mo16804p(i, i2)) {
                i4 = 0 + this.f14688l;
            }
            if ((this.f14686j & 4) <= 0) {
                return i4;
            }
            i3 = this.f14688l;
        }
        return i4 + i3;
    }

    /* renamed from: j */
    public final boolean mo16795j() {
        int i = this.f14678b;
        return i == 0 || i == 1;
    }

    /* renamed from: k */
    public final void mo16796k(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f14693q.size();
        for (int i5 = 0; i5 < size; i5++) {
            C4092b bVar = this.f14693q.get(i5);
            for (int i6 = 0; i6 < bVar.f14766h; i6++) {
                int i7 = bVar.f14773o + i6;
                View o = mo16800o(i7);
                if (!(o == null || o.getVisibility() == 8)) {
                    LayoutParams layoutParams = (LayoutParams) o.getLayoutParams();
                    if (mo16804p(i7, i6)) {
                        if (z) {
                            i4 = o.getRight() + layoutParams.rightMargin;
                        } else {
                            i4 = (o.getLeft() - layoutParams.leftMargin) - this.f14689m;
                        }
                        mo16799n(canvas, i4, bVar.f14760b, bVar.f14765g);
                    }
                    if (i6 == bVar.f14766h - 1 && (this.f14687k & 4) > 0) {
                        if (z) {
                            i3 = (o.getLeft() - layoutParams.leftMargin) - this.f14689m;
                        } else {
                            i3 = o.getRight() + layoutParams.rightMargin;
                        }
                        mo16799n(canvas, i3, bVar.f14760b, bVar.f14765g);
                    }
                }
            }
            if (mo16805q(i5)) {
                if (z2) {
                    i2 = bVar.f14762d;
                } else {
                    i2 = bVar.f14760b - this.f14688l;
                }
                mo16798m(canvas, paddingLeft, i2, max);
            }
            if (mo16806r(i5) && (this.f14686j & 4) > 0) {
                if (z2) {
                    i = bVar.f14760b - this.f14688l;
                } else {
                    i = bVar.f14762d;
                }
                mo16798m(canvas, paddingLeft, i, max);
            }
        }
    }

    /* renamed from: l */
    public final void mo16797l(Canvas canvas, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f14693q.size();
        for (int i5 = 0; i5 < size; i5++) {
            C4092b bVar = this.f14693q.get(i5);
            for (int i6 = 0; i6 < bVar.f14766h; i6++) {
                int i7 = bVar.f14773o + i6;
                View o = mo16800o(i7);
                if (!(o == null || o.getVisibility() == 8)) {
                    LayoutParams layoutParams = (LayoutParams) o.getLayoutParams();
                    if (mo16804p(i7, i6)) {
                        if (z2) {
                            i4 = o.getBottom() + layoutParams.bottomMargin;
                        } else {
                            i4 = (o.getTop() - layoutParams.topMargin) - this.f14688l;
                        }
                        mo16798m(canvas, bVar.f14759a, i4, bVar.f14765g);
                    }
                    if (i6 == bVar.f14766h - 1 && (this.f14686j & 4) > 0) {
                        if (z2) {
                            i3 = (o.getTop() - layoutParams.topMargin) - this.f14688l;
                        } else {
                            i3 = o.getBottom() + layoutParams.bottomMargin;
                        }
                        mo16798m(canvas, bVar.f14759a, i3, bVar.f14765g);
                    }
                }
            }
            if (mo16805q(i5)) {
                if (z) {
                    i2 = bVar.f14761c;
                } else {
                    i2 = bVar.f14759a - this.f14689m;
                }
                mo16799n(canvas, i2, paddingTop, max);
            }
            if (mo16806r(i5) && (this.f14687k & 4) > 0) {
                if (z) {
                    i = bVar.f14759a - this.f14689m;
                } else {
                    i = bVar.f14761c;
                }
                mo16799n(canvas, i, paddingTop, max);
            }
        }
    }

    /* renamed from: m */
    public final void mo16798m(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f14684h;
        if (drawable != null) {
            drawable.setBounds(i, i2, i3 + i, this.f14688l + i2);
            this.f14684h.draw(canvas);
        }
    }

    /* renamed from: n */
    public final void mo16799n(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.f14685i;
        if (drawable != null) {
            drawable.setBounds(i, i2, this.f14689m + i, i3 + i2);
            this.f14685i.draw(canvas);
        }
    }

    /* renamed from: o */
    public final View mo16800o(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.f14690n;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    public final void onDraw(Canvas canvas) {
        boolean z;
        boolean z2;
        if (this.f14685i != null || this.f14684h != null) {
            if (this.f14686j != 0 || this.f14687k != 0) {
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                int d = C6333d0.C6338e.m15063d(this);
                int i = this.f14678b;
                boolean z3 = false;
                boolean z4 = true;
                if (i == 0) {
                    if (d == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (this.f14679c == 2) {
                        z3 = true;
                    }
                    mo16796k(canvas, z, z3);
                } else if (i == 1) {
                    if (d != 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (this.f14679c == 2) {
                        z3 = true;
                    }
                    mo16796k(canvas, z2, z3);
                } else if (i == 2) {
                    if (d != 1) {
                        z4 = false;
                    }
                    if (this.f14679c == 2) {
                        z4 = !z4;
                    }
                    mo16797l(canvas, z4, false);
                } else if (i == 3) {
                    if (d == 1) {
                        z3 = true;
                    }
                    if (this.f14679c == 2) {
                        z3 = !z3;
                    }
                    mo16797l(canvas, z3, true);
                }
            }
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        boolean z3;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        int d = C6333d0.C6338e.m15063d(this);
        int i5 = this.f14678b;
        boolean z4 = false;
        if (i5 == 0) {
            if (d == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            mo16807s(i, i2, i3, i4, z2);
        } else if (i5 == 1) {
            if (d != 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            mo16807s(i, i2, i3, i4, z3);
        } else if (i5 == 2) {
            if (d == 1) {
                z4 = true;
            }
            if (this.f14679c == 2) {
                z4 = !z4;
            }
            mo16821t(i, i2, i3, i4, z4, false);
        } else if (i5 == 3) {
            if (d == 1) {
                z4 = true;
            }
            if (this.f14679c == 2) {
                z4 = !z4;
            }
            mo16821t(i, i2, i3, i4, z4, true);
        } else {
            StringBuilder k = C13555b.m33972k("Invalid flex direction is set: ");
            k.append(this.f14678b);
            throw new IllegalStateException(k.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ed  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r15, int r16) {
        /*
            r14 = this;
            r0 = r14
            r9 = r15
            r10 = r16
            android.util.SparseIntArray r1 = r0.f14691o
            if (r1 != 0) goto L_0x0013
            android.util.SparseIntArray r1 = new android.util.SparseIntArray
            int r2 = r14.getChildCount()
            r1.<init>(r2)
            r0.f14691o = r1
        L_0x0013:
            com.google.android.flexbox.c r1 = r0.f14692p
            android.util.SparseIntArray r2 = r0.f14691o
            com.google.android.flexbox.a r3 = r1.f14777a
            int r3 = r3.getFlexItemCount()
            int r4 = r2.size()
            r5 = 1
            r11 = 0
            if (r4 == r3) goto L_0x0026
            goto L_0x0042
        L_0x0026:
            r4 = 0
        L_0x0027:
            if (r4 >= r3) goto L_0x0047
            com.google.android.flexbox.a r6 = r1.f14777a
            android.view.View r6 = r6.mo16770c(r4)
            if (r6 != 0) goto L_0x0032
            goto L_0x0044
        L_0x0032:
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            com.google.android.flexbox.FlexItem r6 = (com.google.android.flexbox.FlexItem) r6
            int r6 = r6.getOrder()
            int r7 = r2.get(r4)
            if (r6 == r7) goto L_0x0044
        L_0x0042:
            r1 = 1
            goto L_0x0048
        L_0x0044:
            int r4 = r4 + 1
            goto L_0x0027
        L_0x0047:
            r1 = 0
        L_0x0048:
            if (r1 == 0) goto L_0x005e
            com.google.android.flexbox.c r1 = r0.f14692p
            android.util.SparseIntArray r2 = r0.f14691o
            com.google.android.flexbox.a r3 = r1.f14777a
            int r3 = r3.getFlexItemCount()
            java.util.ArrayList r1 = r1.mo16870f(r3)
            int[] r1 = com.google.android.flexbox.C4093c.m11049r(r3, r1, r2)
            r0.f14690n = r1
        L_0x005e:
            int r1 = r0.f14678b
            r12 = 3
            r13 = 2
            r2 = 0
            if (r1 == 0) goto L_0x00c4
            if (r1 == r5) goto L_0x00c4
            if (r1 == r13) goto L_0x0081
            if (r1 != r12) goto L_0x006c
            goto L_0x0081
        L_0x006c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid value for the flex direction is set: "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            int r3 = r0.f14678b
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0081:
            java.util.List<com.google.android.flexbox.b> r1 = r0.f14693q
            r1.clear()
            com.google.android.flexbox.c$a r3 = r0.f14694r
            r3.f14782a = r2
            r3.f14783b = r11
            com.google.android.flexbox.c r1 = r0.f14692p
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = 0
            r7 = -1
            r8 = 0
            r2 = r3
            r3 = r16
            r4 = r15
            r1.mo16867b(r2, r3, r4, r5, r6, r7, r8)
            com.google.android.flexbox.c$a r1 = r0.f14694r
            java.util.List<com.google.android.flexbox.b> r1 = r1.f14782a
            r0.f14693q = r1
            com.google.android.flexbox.c r1 = r0.f14692p
            r1.mo16872h(r15, r10, r11)
            com.google.android.flexbox.c r1 = r0.f14692p
            int r2 = r14.getPaddingLeft()
            int r3 = r14.getPaddingRight()
            int r3 = r3 + r2
            r1.mo16871g(r15, r10, r3)
            com.google.android.flexbox.c r1 = r0.f14692p
            r1.mo16884u(r11)
            int r1 = r0.f14678b
            com.google.android.flexbox.c$a r2 = r0.f14694r
            int r2 = r2.f14783b
            r14.mo16822u(r1, r15, r10, r2)
            goto L_0x017c
        L_0x00c4:
            java.util.List<com.google.android.flexbox.b> r1 = r0.f14693q
            r1.clear()
            com.google.android.flexbox.c$a r3 = r0.f14694r
            r3.f14782a = r2
            r3.f14783b = r11
            com.google.android.flexbox.c r1 = r0.f14692p
            r5 = 2147483647(0x7fffffff, float:NaN)
            r6 = 0
            r7 = -1
            r8 = 0
            r2 = r3
            r3 = r15
            r4 = r16
            r1.mo16867b(r2, r3, r4, r5, r6, r7, r8)
            com.google.android.flexbox.c$a r1 = r0.f14694r
            java.util.List<com.google.android.flexbox.b> r1 = r1.f14782a
            r0.f14693q = r1
            com.google.android.flexbox.c r1 = r0.f14692p
            r1.mo16872h(r15, r10, r11)
            int r1 = r0.f14681e
            if (r1 != r12) goto L_0x0160
            java.util.List<com.google.android.flexbox.b> r1 = r0.f14693q
            java.util.Iterator r1 = r1.iterator()
        L_0x00f3:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0160
            java.lang.Object r2 = r1.next()
            com.google.android.flexbox.b r2 = (com.google.android.flexbox.C4092b) r2
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 0
        L_0x0102:
            int r5 = r2.f14766h
            if (r4 >= r5) goto L_0x015d
            int r5 = r2.f14773o
            int r5 = r5 + r4
            android.view.View r5 = r14.mo16800o(r5)
            if (r5 == 0) goto L_0x015a
            int r6 = r5.getVisibility()
            r7 = 8
            if (r6 != r7) goto L_0x0118
            goto L_0x015a
        L_0x0118:
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            com.google.android.flexbox.FlexboxLayout$LayoutParams r6 = (com.google.android.flexbox.FlexboxLayout.LayoutParams) r6
            int r7 = r0.f14679c
            if (r7 == r13) goto L_0x013c
            int r7 = r2.f14770l
            int r8 = r5.getBaseline()
            int r7 = r7 - r8
            int r8 = r6.topMargin
            int r7 = java.lang.Math.max(r7, r8)
            int r5 = r5.getMeasuredHeight()
            int r5 = r5 + r7
            int r6 = r6.bottomMargin
            int r5 = r5 + r6
            int r3 = java.lang.Math.max(r3, r5)
            goto L_0x015a
        L_0x013c:
            int r7 = r2.f14770l
            int r8 = r5.getMeasuredHeight()
            int r7 = r7 - r8
            int r8 = r5.getBaseline()
            int r8 = r8 + r7
            int r7 = r6.bottomMargin
            int r7 = java.lang.Math.max(r8, r7)
            int r5 = r5.getMeasuredHeight()
            int r6 = r6.topMargin
            int r5 = r5 + r6
            int r5 = r5 + r7
            int r3 = java.lang.Math.max(r3, r5)
        L_0x015a:
            int r4 = r4 + 1
            goto L_0x0102
        L_0x015d:
            r2.f14765g = r3
            goto L_0x00f3
        L_0x0160:
            com.google.android.flexbox.c r1 = r0.f14692p
            int r2 = r14.getPaddingTop()
            int r3 = r14.getPaddingBottom()
            int r3 = r3 + r2
            r1.mo16871g(r15, r10, r3)
            com.google.android.flexbox.c r1 = r0.f14692p
            r1.mo16884u(r11)
            int r1 = r0.f14678b
            com.google.android.flexbox.c$a r2 = r0.f14694r
            int r2 = r2.f14783b
            r14.mo16822u(r1, r15, r10, r2)
        L_0x017c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.onMeasure(int, int):void");
    }

    /* renamed from: p */
    public final boolean mo16804p(int i, int i2) {
        boolean z;
        int i3 = 1;
        while (true) {
            if (i3 > i2) {
                z = true;
                break;
            }
            View o = mo16800o(i - i3);
            if (o != null && o.getVisibility() != 8) {
                z = false;
                break;
            }
            i3++;
        }
        if (z) {
            if (mo16795j()) {
                if ((this.f14687k & 1) != 0) {
                    return true;
                }
                return false;
            } else if ((this.f14686j & 1) != 0) {
                return true;
            } else {
                return false;
            }
        } else if (mo16795j()) {
            if ((this.f14687k & 2) != 0) {
                return true;
            }
            return false;
        } else if ((this.f14686j & 2) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: q */
    public final boolean mo16805q(int i) {
        boolean z;
        if (i < 0 || i >= this.f14693q.size()) {
            return false;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                z = true;
                break;
            }
            C4092b bVar = this.f14693q.get(i2);
            if (bVar.f14766h - bVar.f14767i > 0) {
                z = false;
                break;
            }
            i2++;
        }
        if (z) {
            if (mo16795j()) {
                if ((this.f14686j & 1) != 0) {
                    return true;
                }
                return false;
            } else if ((this.f14687k & 1) != 0) {
                return true;
            } else {
                return false;
            }
        } else if (mo16795j()) {
            if ((this.f14686j & 2) != 0) {
                return true;
            }
            return false;
        } else if ((this.f14687k & 2) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: r */
    public final boolean mo16806r(int i) {
        if (i < 0 || i >= this.f14693q.size()) {
            return false;
        }
        for (int i2 = i + 1; i2 < this.f14693q.size(); i2++) {
            C4092b bVar = this.f14693q.get(i2);
            if (bVar.f14766h - bVar.f14767i > 0) {
                return false;
            }
        }
        if (mo16795j()) {
            if ((this.f14686j & 4) != 0) {
                return true;
            }
            return false;
        } else if ((this.f14687k & 4) != 0) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00dc  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16807s(int r26, int r27, int r28, int r29, boolean r30) {
        /*
            r25 = this;
            r0 = r25
            int r1 = r25.getPaddingLeft()
            int r2 = r25.getPaddingRight()
            int r3 = r29 - r27
            int r4 = r28 - r26
            int r5 = r25.getPaddingBottom()
            int r3 = r3 - r5
            int r5 = r25.getPaddingTop()
            java.util.List<com.google.android.flexbox.b> r6 = r0.f14693q
            int r6 = r6.size()
            r7 = 0
        L_0x001e:
            if (r7 >= r6) goto L_0x020c
            java.util.List<com.google.android.flexbox.b> r8 = r0.f14693q
            java.lang.Object r8 = r8.get(r7)
            com.google.android.flexbox.b r8 = (com.google.android.flexbox.C4092b) r8
            boolean r9 = r0.mo16805q(r7)
            if (r9 == 0) goto L_0x0032
            int r9 = r0.f14688l
            int r3 = r3 - r9
            int r5 = r5 + r9
        L_0x0032:
            int r9 = r0.f14680d
            r10 = 4
            r11 = 2
            r12 = 0
            r13 = 1
            if (r9 == 0) goto L_0x00cc
            if (r9 == r13) goto L_0x00c1
            r14 = 1073741824(0x40000000, float:2.0)
            if (r9 == r11) goto L_0x00ab
            r11 = 3
            if (r9 == r11) goto L_0x0092
            if (r9 == r10) goto L_0x0077
            r10 = 5
            if (r9 != r10) goto L_0x0062
            int r9 = r8.f14766h
            int r10 = r8.f14767i
            int r9 = r9 - r10
            if (r9 == 0) goto L_0x0059
            int r10 = r8.f14763e
            int r10 = r4 - r10
            float r10 = (float) r10
            int r9 = r9 + 1
            float r9 = (float) r9
            float r10 = r10 / r9
            goto L_0x005a
        L_0x0059:
            r10 = 0
        L_0x005a:
            float r9 = (float) r1
            float r9 = r9 + r10
            int r11 = r4 - r2
            float r11 = (float) r11
            float r11 = r11 - r10
            goto L_0x00d2
        L_0x0062:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid justifyContent is set: "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            int r3 = r0.f14680d
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0077:
            int r9 = r8.f14766h
            int r10 = r8.f14767i
            int r9 = r9 - r10
            if (r9 == 0) goto L_0x0086
            int r10 = r8.f14763e
            int r10 = r4 - r10
            float r10 = (float) r10
            float r9 = (float) r9
            float r10 = r10 / r9
            goto L_0x0088
        L_0x0086:
            r9 = 0
            r10 = 0
        L_0x0088:
            float r9 = (float) r1
            float r11 = r10 / r14
            float r9 = r9 + r11
            int r14 = r4 - r2
            float r14 = (float) r14
            float r11 = r14 - r11
            goto L_0x00d2
        L_0x0092:
            float r9 = (float) r1
            int r10 = r8.f14766h
            int r11 = r8.f14767i
            int r10 = r10 - r11
            if (r10 == r13) goto L_0x009e
            int r10 = r10 + -1
            float r10 = (float) r10
            goto L_0x00a0
        L_0x009e:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x00a0:
            int r11 = r8.f14763e
            int r11 = r4 - r11
            float r11 = (float) r11
            float r10 = r11 / r10
            int r11 = r4 - r2
            float r11 = (float) r11
            goto L_0x00d2
        L_0x00ab:
            float r9 = (float) r1
            int r10 = r8.f14763e
            int r11 = r4 - r10
            float r11 = (float) r11
            float r11 = r11 / r14
            float r11 = r11 + r9
            int r9 = r4 - r2
            float r9 = (float) r9
            int r10 = r4 - r10
            float r10 = (float) r10
            float r10 = r10 / r14
            float r9 = r9 - r10
            r24 = r11
            r11 = r9
            r9 = r24
            goto L_0x00d1
        L_0x00c1:
            int r9 = r8.f14763e
            int r10 = r4 - r9
            int r10 = r10 + r2
            float r10 = (float) r10
            int r9 = r9 - r1
            float r9 = (float) r9
            r11 = r9
            r9 = r10
            goto L_0x00d1
        L_0x00cc:
            float r9 = (float) r1
            int r10 = r4 - r2
            float r10 = (float) r10
            r11 = r10
        L_0x00d1:
            r10 = 0
        L_0x00d2:
            float r16 = java.lang.Math.max(r10, r12)
            r10 = 0
            r15 = 0
        L_0x00d8:
            int r10 = r8.f14766h
            if (r15 >= r10) goto L_0x0200
            int r10 = r8.f14773o
            int r10 = r10 + r15
            android.view.View r17 = r0.mo16800o(r10)
            if (r17 == 0) goto L_0x01f5
            int r12 = r17.getVisibility()
            r14 = 8
            if (r12 != r14) goto L_0x00ef
            goto L_0x01f5
        L_0x00ef:
            android.view.ViewGroup$LayoutParams r12 = r17.getLayoutParams()
            r14 = r12
            com.google.android.flexbox.FlexboxLayout$LayoutParams r14 = (com.google.android.flexbox.FlexboxLayout.LayoutParams) r14
            int r12 = r14.leftMargin
            float r12 = (float) r12
            float r9 = r9 + r12
            int r12 = r14.rightMargin
            float r12 = (float) r12
            float r11 = r11 - r12
            boolean r10 = r0.mo16804p(r10, r15)
            if (r10 == 0) goto L_0x0110
            int r10 = r0.f14689m
            float r12 = (float) r10
            float r9 = r9 + r12
            float r11 = r11 - r12
            r18 = r9
            r20 = r10
            r19 = r11
            goto L_0x0117
        L_0x0110:
            r10 = 0
            r18 = r9
            r19 = r11
            r20 = 0
        L_0x0117:
            int r9 = r8.f14766h
            int r9 = r9 - r13
            if (r15 != r9) goto L_0x0127
            int r9 = r0.f14687k
            r9 = r9 & 4
            if (r9 <= 0) goto L_0x0127
            int r9 = r0.f14689m
            r21 = r9
            goto L_0x012a
        L_0x0127:
            r9 = 0
            r21 = 0
        L_0x012a:
            int r9 = r0.f14679c
            r10 = 2
            if (r9 != r10) goto L_0x017a
            if (r30 == 0) goto L_0x0157
            com.google.android.flexbox.c r9 = r0.f14692p
            int r10 = java.lang.Math.round(r19)
            int r11 = r17.getMeasuredWidth()
            int r12 = r10 - r11
            int r10 = r17.getMeasuredHeight()
            int r13 = r3 - r10
            int r22 = java.lang.Math.round(r19)
            r10 = r17
            r11 = r8
            r23 = r1
            r1 = r14
            r14 = r22
            r22 = r15
            r15 = r3
            r9.mo16879o(r10, r11, r12, r13, r14, r15)
            goto L_0x01bc
        L_0x0157:
            r23 = r1
            r1 = r14
            r22 = r15
            com.google.android.flexbox.c r9 = r0.f14692p
            int r12 = java.lang.Math.round(r18)
            int r10 = r17.getMeasuredHeight()
            int r13 = r3 - r10
            int r10 = java.lang.Math.round(r18)
            int r11 = r17.getMeasuredWidth()
            int r14 = r11 + r10
            r10 = r17
            r11 = r8
            r15 = r3
            r9.mo16879o(r10, r11, r12, r13, r14, r15)
            goto L_0x01bc
        L_0x017a:
            r23 = r1
            r1 = r14
            r22 = r15
            if (r30 == 0) goto L_0x019f
            com.google.android.flexbox.c r9 = r0.f14692p
            int r10 = java.lang.Math.round(r19)
            int r11 = r17.getMeasuredWidth()
            int r12 = r10 - r11
            int r14 = java.lang.Math.round(r19)
            int r10 = r17.getMeasuredHeight()
            int r15 = r10 + r5
            r10 = r17
            r11 = r8
            r13 = r5
            r9.mo16879o(r10, r11, r12, r13, r14, r15)
            goto L_0x01bc
        L_0x019f:
            com.google.android.flexbox.c r9 = r0.f14692p
            int r12 = java.lang.Math.round(r18)
            int r10 = java.lang.Math.round(r18)
            int r11 = r17.getMeasuredWidth()
            int r14 = r11 + r10
            int r10 = r17.getMeasuredHeight()
            int r15 = r10 + r5
            r10 = r17
            r11 = r8
            r13 = r5
            r9.mo16879o(r10, r11, r12, r13, r14, r15)
        L_0x01bc:
            int r9 = r17.getMeasuredWidth()
            float r9 = (float) r9
            float r9 = r9 + r16
            int r10 = r1.rightMargin
            float r10 = (float) r10
            float r9 = r9 + r10
            float r15 = r9 + r18
            int r9 = r17.getMeasuredWidth()
            float r9 = (float) r9
            float r9 = r9 + r16
            int r1 = r1.leftMargin
            float r1 = (float) r1
            float r9 = r9 + r1
            float r19 = r19 - r9
            if (r30 == 0) goto L_0x01e5
            r12 = 0
            r14 = 0
            r9 = r8
            r10 = r17
            r11 = r21
            r13 = r20
            r9.mo16865a(r10, r11, r12, r13, r14)
            goto L_0x01f1
        L_0x01e5:
            r12 = 0
            r14 = 0
            r9 = r8
            r10 = r17
            r11 = r20
            r13 = r21
            r9.mo16865a(r10, r11, r12, r13, r14)
        L_0x01f1:
            r9 = r15
            r11 = r19
            goto L_0x01f9
        L_0x01f5:
            r23 = r1
            r22 = r15
        L_0x01f9:
            int r15 = r22 + 1
            r13 = 1
            r1 = r23
            goto L_0x00d8
        L_0x0200:
            r23 = r1
            int r1 = r8.f14765g
            int r5 = r5 + r1
            int r3 = r3 - r1
            int r7 = r7 + 1
            r1 = r23
            goto L_0x001e
        L_0x020c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.mo16807s(int, int, int, int, boolean):void");
    }

    public void setAlignContent(int i) {
        if (this.f14682f != i) {
            this.f14682f = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.f14681e != i) {
            this.f14681e = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable != this.f14684h) {
            this.f14684h = drawable;
            if (drawable != null) {
                this.f14688l = drawable.getIntrinsicHeight();
            } else {
                this.f14688l = 0;
            }
            if (this.f14684h == null && this.f14685i == null) {
                setWillNotDraw(true);
            } else {
                setWillNotDraw(false);
            }
            requestLayout();
        }
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable != this.f14685i) {
            this.f14685i = drawable;
            if (drawable != null) {
                this.f14689m = drawable.getIntrinsicWidth();
            } else {
                this.f14689m = 0;
            }
            if (this.f14684h == null && this.f14685i == null) {
                setWillNotDraw(true);
            } else {
                setWillNotDraw(false);
            }
            requestLayout();
        }
    }

    public void setFlexDirection(int i) {
        if (this.f14678b != i) {
            this.f14678b = i;
            requestLayout();
        }
    }

    public void setFlexLines(List<C4092b> list) {
        this.f14693q = list;
    }

    public void setFlexWrap(int i) {
        if (this.f14679c != i) {
            this.f14679c = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.f14680d != i) {
            this.f14680d = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.f14683g != i) {
            this.f14683g = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.f14686j) {
            this.f14686j = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.f14687k) {
            this.f14687k = i;
            requestLayout();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00da  */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16821t(int r28, int r29, int r30, int r31, boolean r32, boolean r33) {
        /*
            r27 = this;
            r0 = r27
            int r1 = r27.getPaddingTop()
            int r2 = r27.getPaddingBottom()
            int r3 = r27.getPaddingRight()
            int r4 = r27.getPaddingLeft()
            int r5 = r30 - r28
            int r6 = r31 - r29
            int r5 = r5 - r3
            java.util.List<com.google.android.flexbox.b> r3 = r0.f14693q
            int r3 = r3.size()
            r7 = 0
        L_0x001e:
            if (r7 >= r3) goto L_0x0204
            java.util.List<com.google.android.flexbox.b> r8 = r0.f14693q
            java.lang.Object r8 = r8.get(r7)
            com.google.android.flexbox.b r8 = (com.google.android.flexbox.C4092b) r8
            boolean r9 = r0.mo16805q(r7)
            if (r9 == 0) goto L_0x0032
            int r9 = r0.f14689m
            int r4 = r4 + r9
            int r5 = r5 - r9
        L_0x0032:
            int r9 = r0.f14680d
            r10 = 4
            r11 = 0
            r12 = 1
            if (r9 == 0) goto L_0x00c9
            if (r9 == r12) goto L_0x00c1
            r13 = 2
            r14 = 1073741824(0x40000000, float:2.0)
            if (r9 == r13) goto L_0x00ab
            r13 = 3
            if (r9 == r13) goto L_0x0092
            if (r9 == r10) goto L_0x0077
            r10 = 5
            if (r9 != r10) goto L_0x0062
            int r9 = r8.f14766h
            int r10 = r8.f14767i
            int r9 = r9 - r10
            if (r9 == 0) goto L_0x0059
            int r10 = r8.f14763e
            int r10 = r6 - r10
            float r10 = (float) r10
            int r9 = r9 + 1
            float r9 = (float) r9
            float r10 = r10 / r9
            goto L_0x005a
        L_0x0059:
            r10 = 0
        L_0x005a:
            float r9 = (float) r1
            float r9 = r9 + r10
            int r12 = r6 - r2
            float r12 = (float) r12
            float r12 = r12 - r10
            goto L_0x00d0
        L_0x0062:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid justifyContent is set: "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            int r3 = r0.f14680d
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0077:
            int r9 = r8.f14766h
            int r10 = r8.f14767i
            int r9 = r9 - r10
            if (r9 == 0) goto L_0x0086
            int r10 = r8.f14763e
            int r10 = r6 - r10
            float r10 = (float) r10
            float r9 = (float) r9
            float r10 = r10 / r9
            goto L_0x0088
        L_0x0086:
            r9 = 0
            r10 = 0
        L_0x0088:
            float r9 = (float) r1
            float r12 = r10 / r14
            float r9 = r9 + r12
            int r13 = r6 - r2
            float r13 = (float) r13
            float r12 = r13 - r12
            goto L_0x00d0
        L_0x0092:
            float r9 = (float) r1
            int r10 = r8.f14766h
            int r13 = r8.f14767i
            int r10 = r10 - r13
            if (r10 == r12) goto L_0x009e
            int r10 = r10 + -1
            float r10 = (float) r10
            goto L_0x00a0
        L_0x009e:
            r10 = 1065353216(0x3f800000, float:1.0)
        L_0x00a0:
            int r12 = r8.f14763e
            int r12 = r6 - r12
            float r12 = (float) r12
            float r10 = r12 / r10
            int r12 = r6 - r2
            float r12 = (float) r12
            goto L_0x00d0
        L_0x00ab:
            float r9 = (float) r1
            int r10 = r8.f14763e
            int r12 = r6 - r10
            float r12 = (float) r12
            float r12 = r12 / r14
            float r12 = r12 + r9
            int r9 = r6 - r2
            float r9 = (float) r9
            int r10 = r6 - r10
            float r10 = (float) r10
            float r10 = r10 / r14
            float r9 = r9 - r10
            r26 = r12
            r12 = r9
            r9 = r26
            goto L_0x00cf
        L_0x00c1:
            int r9 = r8.f14763e
            int r10 = r6 - r9
            int r10 = r10 + r2
            float r10 = (float) r10
            int r9 = r9 - r1
            goto L_0x00cc
        L_0x00c9:
            float r10 = (float) r1
            int r9 = r6 - r2
        L_0x00cc:
            float r9 = (float) r9
            r12 = r9
            r9 = r10
        L_0x00cf:
            r10 = 0
        L_0x00d0:
            float r17 = java.lang.Math.max(r10, r11)
            r10 = 0
            r15 = 0
        L_0x00d6:
            int r10 = r8.f14766h
            if (r15 >= r10) goto L_0x01fc
            int r10 = r8.f14773o
            int r10 = r10 + r15
            android.view.View r18 = r0.mo16800o(r10)
            if (r18 == 0) goto L_0x01f6
            int r11 = r18.getVisibility()
            r13 = 8
            if (r11 != r13) goto L_0x00ed
            goto L_0x01f6
        L_0x00ed:
            android.view.ViewGroup$LayoutParams r11 = r18.getLayoutParams()
            r14 = r11
            com.google.android.flexbox.FlexboxLayout$LayoutParams r14 = (com.google.android.flexbox.FlexboxLayout.LayoutParams) r14
            int r11 = r14.topMargin
            float r11 = (float) r11
            float r9 = r9 + r11
            int r11 = r14.bottomMargin
            float r11 = (float) r11
            float r12 = r12 - r11
            boolean r10 = r0.mo16804p(r10, r15)
            if (r10 == 0) goto L_0x010e
            int r10 = r0.f14688l
            float r11 = (float) r10
            float r9 = r9 + r11
            float r12 = r12 - r11
            r19 = r9
            r21 = r10
            r20 = r12
            goto L_0x0115
        L_0x010e:
            r10 = 0
            r19 = r9
            r20 = r12
            r21 = 0
        L_0x0115:
            int r9 = r8.f14766h
            int r9 = r9 + -1
            if (r15 != r9) goto L_0x0126
            int r9 = r0.f14686j
            r9 = r9 & 4
            if (r9 <= 0) goto L_0x0126
            int r9 = r0.f14688l
            r22 = r9
            goto L_0x0129
        L_0x0126:
            r9 = 0
            r22 = 0
        L_0x0129:
            if (r32 == 0) goto L_0x0178
            if (r33 == 0) goto L_0x0155
            com.google.android.flexbox.c r9 = r0.f14692p
            r12 = 1
            int r10 = r18.getMeasuredWidth()
            int r13 = r5 - r10
            int r10 = java.lang.Math.round(r20)
            int r11 = r18.getMeasuredHeight()
            int r16 = r10 - r11
            int r23 = java.lang.Math.round(r20)
            r10 = r18
            r11 = r8
            r24 = r14
            r14 = r16
            r25 = r15
            r15 = r5
            r16 = r23
            r9.mo16880p(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x01bb
        L_0x0155:
            r24 = r14
            r25 = r15
            com.google.android.flexbox.c r9 = r0.f14692p
            r12 = 1
            int r10 = r18.getMeasuredWidth()
            int r13 = r5 - r10
            int r14 = java.lang.Math.round(r19)
            int r10 = java.lang.Math.round(r19)
            int r11 = r18.getMeasuredHeight()
            int r16 = r11 + r10
            r10 = r18
            r11 = r8
            r15 = r5
            r9.mo16880p(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x01bb
        L_0x0178:
            r24 = r14
            r25 = r15
            if (r33 == 0) goto L_0x019d
            com.google.android.flexbox.c r9 = r0.f14692p
            r12 = 0
            int r10 = java.lang.Math.round(r20)
            int r11 = r18.getMeasuredHeight()
            int r14 = r10 - r11
            int r10 = r18.getMeasuredWidth()
            int r15 = r10 + r4
            int r16 = java.lang.Math.round(r20)
            r10 = r18
            r11 = r8
            r13 = r4
            r9.mo16880p(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x01bb
        L_0x019d:
            com.google.android.flexbox.c r9 = r0.f14692p
            r12 = 0
            int r14 = java.lang.Math.round(r19)
            int r10 = r18.getMeasuredWidth()
            int r15 = r10 + r4
            int r10 = java.lang.Math.round(r19)
            int r11 = r18.getMeasuredHeight()
            int r16 = r11 + r10
            r10 = r18
            r11 = r8
            r13 = r4
            r9.mo16880p(r10, r11, r12, r13, r14, r15, r16)
        L_0x01bb:
            int r9 = r18.getMeasuredHeight()
            float r9 = (float) r9
            float r9 = r9 + r17
            r11 = r24
            int r10 = r11.bottomMargin
            float r10 = (float) r10
            float r9 = r9 + r10
            float r15 = r9 + r19
            int r9 = r18.getMeasuredHeight()
            float r9 = (float) r9
            float r9 = r9 + r17
            int r10 = r11.topMargin
            float r10 = (float) r10
            float r9 = r9 + r10
            float r20 = r20 - r9
            if (r33 == 0) goto L_0x01e6
            r11 = 0
            r13 = 0
            r9 = r8
            r10 = r18
            r12 = r22
            r14 = r21
            r9.mo16865a(r10, r11, r12, r13, r14)
            goto L_0x01f2
        L_0x01e6:
            r11 = 0
            r13 = 0
            r9 = r8
            r10 = r18
            r12 = r21
            r14 = r22
            r9.mo16865a(r10, r11, r12, r13, r14)
        L_0x01f2:
            r9 = r15
            r12 = r20
            goto L_0x01f8
        L_0x01f6:
            r25 = r15
        L_0x01f8:
            int r15 = r25 + 1
            goto L_0x00d6
        L_0x01fc:
            int r8 = r8.f14765g
            int r4 = r4 + r8
            int r5 = r5 - r8
            int r7 = r7 + 1
            goto L_0x001e
        L_0x0204:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayout.mo16821t(int, int, int, int, boolean, boolean):void");
    }

    /* renamed from: u */
    public final void mo16822u(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            i5 = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            i6 = getLargestMainSize();
        } else if (i == 2 || i == 3) {
            i5 = getLargestMainSize();
            i6 = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        } else {
            throw new IllegalArgumentException(C16759e.m42349e("Invalid flex direction: ", i));
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < i6) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = i6;
            }
            i7 = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            i7 = View.resolveSizeAndState(i6, i2, i4);
        } else if (mode == 1073741824) {
            if (size < i6) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            i7 = View.resolveSizeAndState(size, i2, i4);
        } else {
            throw new IllegalStateException(C16759e.m42349e("Unknown width mode is set: ", mode));
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < i5) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = i5;
            }
            i8 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            i8 = View.resolveSizeAndState(i5, i3, i4);
        } else if (mode2 == 1073741824) {
            if (size2 < i5) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            i8 = View.resolveSizeAndState(size2, i3, i4);
        } else {
            throw new IllegalStateException(C16759e.m42349e("Unknown height mode is set: ", mode2));
        }
        setMeasuredDimension(i7, i8);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14683g = -1;
        this.f14692p = new C4093c(this);
        this.f14693q = new ArrayList();
        this.f14694r = new C4093c.C4094a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4096d.FlexboxLayout, i, 0);
        this.f14678b = obtainStyledAttributes.getInt(C4096d.FlexboxLayout_flexDirection, 0);
        this.f14679c = obtainStyledAttributes.getInt(C4096d.FlexboxLayout_flexWrap, 0);
        this.f14680d = obtainStyledAttributes.getInt(C4096d.FlexboxLayout_justifyContent, 0);
        this.f14681e = obtainStyledAttributes.getInt(C4096d.FlexboxLayout_alignItems, 0);
        this.f14682f = obtainStyledAttributes.getInt(C4096d.FlexboxLayout_alignContent, 0);
        this.f14683g = obtainStyledAttributes.getInt(C4096d.FlexboxLayout_maxLine, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(C4096d.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(C4096d.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(C4096d.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = obtainStyledAttributes.getInt(C4096d.FlexboxLayout_showDivider, 0);
        if (i2 != 0) {
            this.f14687k = i2;
            this.f14686j = i2;
        }
        int i3 = obtainStyledAttributes.getInt(C4096d.FlexboxLayout_showDividerVertical, 0);
        if (i3 != 0) {
            this.f14687k = i3;
        }
        int i4 = obtainStyledAttributes.getInt(C4096d.FlexboxLayout_showDividerHorizontal, 0);
        if (i4 != 0) {
            this.f14686j = i4;
        }
        obtainStyledAttributes.recycle();
    }

    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new C4086a();

        /* renamed from: b */
        public int f14695b = 1;

        /* renamed from: c */
        public float f14696c = BitmapDescriptorFactory.HUE_RED;

        /* renamed from: d */
        public float f14697d = 1.0f;

        /* renamed from: e */
        public int f14698e = -1;

        /* renamed from: f */
        public float f14699f = -1.0f;

        /* renamed from: g */
        public int f14700g = -1;

        /* renamed from: h */
        public int f14701h = -1;

        /* renamed from: i */
        public int f14702i = 16777215;

        /* renamed from: j */
        public int f14703j = 16777215;

        /* renamed from: k */
        public boolean f14704k;

        /* renamed from: com.google.android.flexbox.FlexboxLayout$LayoutParams$a */
        public class C4086a implements Parcelable.Creator<LayoutParams> {
            public final Object createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            public final Object[] newArray(int i) {
                return new LayoutParams[i];
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4096d.FlexboxLayout_Layout);
            this.f14695b = obtainStyledAttributes.getInt(C4096d.FlexboxLayout_Layout_layout_order, 1);
            this.f14696c = obtainStyledAttributes.getFloat(C4096d.FlexboxLayout_Layout_layout_flexGrow, BitmapDescriptorFactory.HUE_RED);
            this.f14697d = obtainStyledAttributes.getFloat(C4096d.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.f14698e = obtainStyledAttributes.getInt(C4096d.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.f14699f = obtainStyledAttributes.getFraction(C4096d.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.f14700g = obtainStyledAttributes.getDimensionPixelSize(C4096d.FlexboxLayout_Layout_layout_minWidth, -1);
            this.f14701h = obtainStyledAttributes.getDimensionPixelSize(C4096d.FlexboxLayout_Layout_layout_minHeight, -1);
            this.f14702i = obtainStyledAttributes.getDimensionPixelSize(C4096d.FlexboxLayout_Layout_layout_maxWidth, 16777215);
            this.f14703j = obtainStyledAttributes.getDimensionPixelSize(C4096d.FlexboxLayout_Layout_layout_maxHeight, 16777215);
            this.f14704k = obtainStyledAttributes.getBoolean(C4096d.FlexboxLayout_Layout_layout_wrapBefore, false);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: G0 */
        public final boolean mo16749G0() {
            return this.f14704k;
        }

        /* renamed from: Q1 */
        public final int mo16750Q1() {
            return this.rightMargin;
        }

        /* renamed from: T1 */
        public final int mo16751T1() {
            return this.f14701h;
        }

        /* renamed from: b0 */
        public final int mo16752b0() {
            return this.f14698e;
        }

        /* renamed from: c0 */
        public final float mo16753c0() {
            return this.f14697d;
        }

        public final int describeContents() {
            return 0;
        }

        /* renamed from: f0 */
        public final int mo16754f0() {
            return this.f14700g;
        }

        public final int getHeight() {
            return this.height;
        }

        public final int getMaxHeight() {
            return this.f14703j;
        }

        public final int getMaxWidth() {
            return this.f14702i;
        }

        public final int getOrder() {
            return this.f14695b;
        }

        public final int getWidth() {
            return this.width;
        }

        /* renamed from: m0 */
        public final int mo16760m0() {
            return this.topMargin;
        }

        /* renamed from: n0 */
        public final void mo16761n0(int i) {
            this.f14701h = i;
        }

        /* renamed from: p0 */
        public final float mo16762p0() {
            return this.f14696c;
        }

        /* renamed from: s1 */
        public final int mo16763s1() {
            return this.bottomMargin;
        }

        public final void setMinWidth(int i) {
            this.f14700g = i;
        }

        /* renamed from: v1 */
        public final int mo16765v1() {
            return this.leftMargin;
        }

        /* renamed from: w0 */
        public final float mo16766w0() {
            return this.f14699f;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f14695b);
            parcel.writeFloat(this.f14696c);
            parcel.writeFloat(this.f14697d);
            parcel.writeInt(this.f14698e);
            parcel.writeFloat(this.f14699f);
            parcel.writeInt(this.f14700g);
            parcel.writeInt(this.f14701h);
            parcel.writeInt(this.f14702i);
            parcel.writeInt(this.f14703j);
            parcel.writeByte(this.f14704k ? (byte) 1 : 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f14695b = layoutParams.f14695b;
            this.f14696c = layoutParams.f14696c;
            this.f14697d = layoutParams.f14697d;
            this.f14698e = layoutParams.f14698e;
            this.f14699f = layoutParams.f14699f;
            this.f14700g = layoutParams.f14700g;
            this.f14701h = layoutParams.f14701h;
            this.f14702i = layoutParams.f14702i;
            this.f14703j = layoutParams.f14703j;
            this.f14704k = layoutParams.f14704k;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public LayoutParams(Parcel parcel) {
            super(0, 0);
            boolean z = false;
            this.f14695b = parcel.readInt();
            this.f14696c = parcel.readFloat();
            this.f14697d = parcel.readFloat();
            this.f14698e = parcel.readInt();
            this.f14699f = parcel.readFloat();
            this.f14700g = parcel.readInt();
            this.f14701h = parcel.readInt();
            this.f14702i = parcel.readInt();
            this.f14703j = parcel.readInt();
            this.f14704k = parcel.readByte() != 0 ? true : z;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }
}
