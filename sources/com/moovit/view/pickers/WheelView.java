package com.moovit.view.pickers;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.Scroller;
import androidx.viewpager2.widget.C1373d;
import com.moovit.view.pickers.C7969a;
import ia0.C12763a;
import ia0.C12764b;
import ia0.C12765c;
import ia0.C12766d;
import ia0.C12769g;
import java.util.LinkedList;
import java.util.List;
import k00.C17988b;
import p824tp.C19739q;

public class WheelView extends View {

    /* renamed from: b */
    public int f24123b = 0;

    /* renamed from: c */
    public int f24124c = 3;

    /* renamed from: d */
    public int f24125d = 0;

    /* renamed from: e */
    public Drawable f24126e;

    /* renamed from: f */
    public C7969a f24127f = new C7969a(getContext(), this.f24138q);

    /* renamed from: g */
    public boolean f24128g;

    /* renamed from: h */
    public int f24129h;

    /* renamed from: i */
    public boolean f24130i = false;

    /* renamed from: j */
    public LinearLayout f24131j;

    /* renamed from: k */
    public int f24132k;

    /* renamed from: l */
    public C12769g f24133l;

    /* renamed from: m */
    public C1373d f24134m = new C1373d(this);

    /* renamed from: n */
    public LinkedList f24135n = new LinkedList();

    /* renamed from: o */
    public LinkedList f24136o = new LinkedList();

    /* renamed from: p */
    public LinkedList f24137p = new LinkedList();

    /* renamed from: q */
    public C7967a f24138q = new C7967a();

    /* renamed from: r */
    public final C7968b f24139r = new C7968b();

    /* renamed from: com.moovit.view.pickers.WheelView$a */
    public class C7967a implements C7969a.C7972c {
        public C7967a() {
        }

        /* renamed from: a */
        public final void mo24869a(int i) {
            WheelView.m18154a(WheelView.this, i);
            int height = WheelView.this.getHeight();
            WheelView wheelView = WheelView.this;
            int i2 = wheelView.f24129h;
            if (i2 > height) {
                wheelView.f24129h = height;
                wheelView.f24127f.f24145d.forceFinished(true);
                return;
            }
            int i3 = -height;
            if (i2 < i3) {
                wheelView.f24129h = i3;
                wheelView.f24127f.f24145d.forceFinished(true);
            }
        }
    }

    /* renamed from: com.moovit.view.pickers.WheelView$b */
    public class C7968b extends DataSetObserver {
        public C7968b() {
        }

        public final void onChanged() {
            WheelView.this.mo24855d(false);
        }

        public final void onInvalidated() {
            WheelView.this.mo24855d(true);
        }
    }

    public WheelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public static void m18154a(WheelView wheelView, int i) {
        wheelView.f24129h += i;
        int itemHeight = wheelView.getItemHeight();
        int i2 = wheelView.f24129h / itemHeight;
        int i3 = wheelView.f24123b - i2;
        int a = ((C12763a) wheelView.f24133l).mo39614a();
        int i4 = wheelView.f24129h % itemHeight;
        if (Math.abs(i4) <= itemHeight / 2) {
            i4 = 0;
        }
        if (wheelView.f24130i && a > 0) {
            if (i4 > 0) {
                i3--;
                i2++;
            } else if (i4 < 0) {
                i3++;
                i2--;
            }
            while (i3 < 0) {
                i3 += a;
            }
            i3 %= a;
        } else if (i3 < 0) {
            i2 = wheelView.f24123b;
            i3 = 0;
        } else if (i3 >= a) {
            i2 = (wheelView.f24123b - a) + 1;
            i3 = a - 1;
        } else if (i3 > 0 && i4 > 0) {
            i3--;
            i2++;
        } else if (i3 < a - 1 && i4 < 0) {
            i3++;
            i2--;
        }
        int i5 = wheelView.f24129h;
        if (i3 != wheelView.f24123b) {
            wheelView.mo24857f(i3, false);
        } else {
            wheelView.invalidate();
        }
        int i6 = i5 - (i2 * itemHeight);
        wheelView.f24129h = i6;
        if (i6 > wheelView.getHeight()) {
            wheelView.f24129h = wheelView.getHeight() + (wheelView.f24129h % wheelView.getHeight());
        }
    }

    private int getItemHeight() {
        int i = this.f24125d;
        if (i != 0) {
            return i;
        }
        LinearLayout linearLayout = this.f24131j;
        if (linearLayout == null || linearLayout.getChildAt(0) == null) {
            return getHeight() / this.f24124c;
        }
        int height = this.f24131j.getChildAt(0).getHeight();
        this.f24125d = height;
        return height;
    }

    private C12764b getItemsRange() {
        if (getItemHeight() == 0) {
            return null;
        }
        int i = this.f24123b;
        int i2 = 1;
        while (getItemHeight() * i2 < getHeight()) {
            i--;
            i2 += 2;
        }
        int i3 = this.f24129h;
        if (i3 != 0) {
            if (i3 > 0) {
                i--;
            }
            int itemHeight = i3 / getItemHeight();
            i -= itemHeight;
            i2 = (int) (Math.asin((double) itemHeight) + ((double) (i2 + 1)));
        }
        return new C12764b(i, i2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: android.view.View} */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.lang.CharSequence] */
    /* JADX WARNING: type inference failed for: r3v7, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* JADX WARNING: type inference failed for: r2v17 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo24853b(int r7, boolean r8) {
        /*
            r6 = this;
            ia0.g r0 = r6.f24133l
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x00a4
            ia0.a r0 = (ia0.C12763a) r0
            int r0 = r0.mo39614a()
            if (r0 != 0) goto L_0x0010
            goto L_0x00a4
        L_0x0010:
            ia0.g r0 = r6.f24133l
            ia0.a r0 = (ia0.C12763a) r0
            int r0 = r0.mo39614a()
            boolean r3 = r6.mo24856e(r7)
            if (r3 != 0) goto L_0x004a
            ia0.g r7 = r6.f24133l
            androidx.viewpager2.widget.d r0 = r6.f24134m
            java.lang.Object r0 = r0.f5106c
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0037
            int r3 = r0.size()
            if (r3 <= 0) goto L_0x0037
            java.lang.Object r2 = r0.get(r1)
            android.view.View r2 = (android.view.View) r2
            r0.remove(r1)
        L_0x0037:
            android.widget.LinearLayout r0 = r6.f24131j
            ia0.a r7 = (ia0.C12763a) r7
            if (r2 != 0) goto L_0x0046
            android.view.LayoutInflater r7 = r7.f31533b
            int r2 = p824tp.C19742t.wheel_item
            android.view.View r2 = r7.inflate(r2, r0, r1)
            goto L_0x00a4
        L_0x0046:
            r7.getClass()
            goto L_0x00a4
        L_0x004a:
            if (r7 >= 0) goto L_0x004e
            int r7 = r7 + r0
            goto L_0x004a
        L_0x004e:
            int r7 = r7 % r0
            ia0.g r0 = r6.f24133l
            androidx.viewpager2.widget.d r3 = r6.f24134m
            java.lang.Object r3 = r3.f5105b
            java.util.List r3 = (java.util.List) r3
            if (r3 == 0) goto L_0x0069
            int r4 = r3.size()
            if (r4 <= 0) goto L_0x0069
            java.lang.Object r4 = r3.get(r1)
            android.view.View r4 = (android.view.View) r4
            r3.remove(r1)
            goto L_0x006a
        L_0x0069:
            r4 = r2
        L_0x006a:
            android.widget.LinearLayout r3 = r6.f24131j
            ia0.a r0 = (ia0.C12763a) r0
            r0.getClass()
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 != 0) goto L_0x0080
            android.view.LayoutInflater r4 = r0.f31533b
            int r5 = p824tp.C19742t.wheel_item
            android.view.View r3 = r4.inflate(r5, r3, r1)
            r4 = r3
            android.widget.TextView r4 = (android.widget.TextView) r4
        L_0x0080:
            if (r7 < 0) goto L_0x009c
            java.util.List<T> r3 = r0.f31534c
            int r3 = r3.size()
            if (r7 >= r3) goto L_0x009c
            java.util.List<T> r0 = r0.f31534c
            java.lang.Object r7 = r0.get(r7)
            boolean r0 = r7 instanceof java.lang.CharSequence
            if (r0 == 0) goto L_0x0098
            r2 = r7
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            goto L_0x009c
        L_0x0098:
            java.lang.String r2 = r7.toString()
        L_0x009c:
            if (r2 != 0) goto L_0x00a0
            java.lang.String r2 = ""
        L_0x00a0:
            r4.setText(r2)
            r2 = r4
        L_0x00a4:
            if (r2 == 0) goto L_0x00b5
            if (r8 == 0) goto L_0x00ae
            android.widget.LinearLayout r7 = r6.f24131j
            r7.addView(r2, r1)
            goto L_0x00b3
        L_0x00ae:
            android.widget.LinearLayout r7 = r6.f24131j
            r7.addView(r2)
        L_0x00b3:
            r7 = 1
            return r7
        L_0x00b5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.view.pickers.WheelView.mo24853b(int, boolean):boolean");
    }

    /* renamed from: c */
    public final int mo24854c(int i, int i2) {
        if (this.f24126e == null) {
            this.f24126e = C17988b.m44611b(C19739q.wdg_wheel_cover, getContext());
        }
        this.f24131j.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.f24131j.measure(View.MeasureSpec.makeMeasureSpec(i, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = this.f24131j.getMeasuredWidth();
        if (i2 != 1073741824) {
            int max = Math.max(measuredWidth + 20, getSuggestedMinimumWidth());
            if (i2 != Integer.MIN_VALUE || i >= max) {
                i = max;
            }
        }
        this.f24131j.measure(View.MeasureSpec.makeMeasureSpec(i - 20, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return i;
    }

    /* renamed from: d */
    public final void mo24855d(boolean z) {
        if (z) {
            C1373d dVar = this.f24134m;
            List list = (List) dVar.f5105b;
            if (list != null) {
                list.clear();
            }
            List list2 = (List) dVar.f5106c;
            if (list2 != null) {
                list2.clear();
            }
            LinearLayout linearLayout = this.f24131j;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            this.f24129h = 0;
        } else {
            LinearLayout linearLayout2 = this.f24131j;
            if (linearLayout2 != null) {
                this.f24134m.mo5646b(linearLayout2, this.f24132k, new C12764b(0, 0));
            }
        }
        invalidate();
    }

    /* renamed from: e */
    public final boolean mo24856e(int i) {
        C12769g gVar = this.f24133l;
        if (gVar == null || ((C12763a) gVar).mo39614a() <= 0 || (!this.f24130i && (i < 0 || i >= ((C12763a) this.f24133l).mo39614a()))) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void mo24857f(int i, boolean z) {
        int min;
        C12769g gVar = this.f24133l;
        if (gVar != null && ((C12763a) gVar).mo39614a() != 0) {
            int a = ((C12763a) this.f24133l).mo39614a();
            if (i < 0 || i >= a) {
                if (this.f24130i) {
                    while (i < 0) {
                        i += a;
                    }
                    i %= a;
                } else {
                    return;
                }
            }
            int i2 = this.f24123b;
            if (i == i2) {
                return;
            }
            if (z) {
                int i3 = i - i2;
                if (this.f24130i && (min = (Math.min(i, i2) + a) - Math.max(i, this.f24123b)) < Math.abs(i3)) {
                    i3 = i3 < 0 ? min : -min;
                }
                this.f24127f.mo24873b((i3 * getItemHeight()) - this.f24129h);
                return;
            }
            this.f24129h = 0;
            this.f24123b = i;
            playSoundEffect(0);
            for (C12765c a2 : this.f24135n) {
                a2.mo39475a(i);
            }
            invalidate();
        }
    }

    public int getCurrentItem() {
        return this.f24123b;
    }

    public C12769g getViewAdapter() {
        return this.f24133l;
    }

    public final void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        C12769g gVar = this.f24133l;
        if (gVar != null && ((C12763a) gVar).mo39614a() > 0) {
            C12764b itemsRange = getItemsRange();
            LinearLayout linearLayout = this.f24131j;
            if (linearLayout != null) {
                int b = this.f24134m.mo5646b(linearLayout, this.f24132k, itemsRange);
                if (this.f24132k != b) {
                    z = true;
                } else {
                    z = false;
                }
                this.f24132k = b;
            } else {
                if (linearLayout == null) {
                    LinearLayout linearLayout2 = new LinearLayout(getContext());
                    this.f24131j = linearLayout2;
                    linearLayout2.setOrientation(1);
                }
                z = true;
            }
            if (!z) {
                if (this.f24132k == itemsRange.f31535a && this.f24131j.getChildCount() == itemsRange.f31536b) {
                    z = false;
                } else {
                    z = true;
                }
            }
            int i = this.f24132k;
            int i2 = itemsRange.f31535a;
            if (i <= i2 || i > (itemsRange.f31536b + i2) - 1) {
                this.f24132k = i2;
            } else {
                int i3 = i - 1;
                while (i3 >= itemsRange.f31535a && mo24853b(i3, true)) {
                    this.f24132k = i3;
                    i3--;
                }
            }
            int i4 = this.f24132k;
            for (int childCount = this.f24131j.getChildCount(); childCount < itemsRange.f31536b; childCount++) {
                if (!mo24853b(this.f24132k + childCount, false) && this.f24131j.getChildCount() == 0) {
                    i4++;
                }
            }
            this.f24132k = i4;
            if (z) {
                mo24854c(getWidth(), 1073741824);
                int width = getWidth();
                this.f24131j.layout(0, 0, width - 20, getHeight());
            }
            canvas.save();
            canvas.translate(10.0f, (float) ((-(((getItemHeight() - getHeight()) / 2) + ((this.f24123b - this.f24132k) * getItemHeight()))) + this.f24129h));
            this.f24131j.draw(canvas);
            canvas.restore();
            this.f24126e.setBounds(0, 0, getWidth(), getHeight());
            this.f24126e.draw(canvas);
        }
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        LinearLayout linearLayout = this.f24131j;
        linearLayout.layout(0, 0, (i3 - i) - 20, i4 - i2);
    }

    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        LinearLayout linearLayout = this.f24131j;
        if (linearLayout != null) {
            this.f24134m.mo5646b(linearLayout, this.f24132k, new C12764b(0, 0));
        } else if (linearLayout == null) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            this.f24131j = linearLayout2;
            linearLayout2.setOrientation(1);
        }
        int i3 = this.f24124c / 2;
        for (int i4 = this.f24123b + i3; i4 >= this.f24123b - i3; i4--) {
            if (mo24853b(i4, true)) {
                this.f24132k = i4;
            }
        }
        int c = mo24854c(size, mode);
        if (mode2 != 1073741824) {
            LinearLayout linearLayout3 = this.f24131j;
            if (!(linearLayout3 == null || linearLayout3.getChildAt(0) == null)) {
                this.f24125d = linearLayout3.getChildAt(0).getMeasuredHeight();
            }
            int i5 = this.f24125d;
            int max = Math.max((this.f24124c * i5) - ((i5 * 10) / 50), getSuggestedMinimumHeight());
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.min(max, size2);
            } else {
                size2 = max;
            }
        }
        setMeasuredDimension(c, size2);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int y;
        int i;
        if (isEnabled() && getViewAdapter() != null) {
            int action = motionEvent.getAction();
            if (action != 1) {
                if (action == 2 && getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
            } else if (!this.f24128g) {
                int y2 = ((int) motionEvent.getY()) - (getHeight() / 2);
                if (y2 > 0) {
                    i = (getItemHeight() / 2) + y2;
                } else {
                    i = y2 - (getItemHeight() / 2);
                }
                int itemHeight = i / getItemHeight();
                if (itemHeight != 0 && mo24856e(this.f24123b + itemHeight)) {
                    for (C12766d a : this.f24137p) {
                        a.mo39615a();
                    }
                }
            }
            C7969a aVar = this.f24127f;
            aVar.getClass();
            int action2 = motionEvent.getAction();
            if (action2 == 0) {
                aVar.f24147f = motionEvent.getY();
                aVar.f24145d.forceFinished(true);
                aVar.f24150i.removeMessages(0);
                aVar.f24150i.removeMessages(1);
            } else if (action2 == 2 && (y = (int) (motionEvent.getY() - aVar.f24147f)) != 0) {
                aVar.mo24874c();
                ((C7967a) aVar.f24142a).mo24869a(y);
                aVar.f24147f = motionEvent.getY();
            }
            if (!aVar.f24144c.onTouchEvent(motionEvent) && motionEvent.getAction() == 1) {
                aVar.mo24872a();
            }
        }
        return true;
    }

    public void setCurrentItem(int i) {
        mo24857f(i, false);
    }

    public void setCyclic(boolean z) {
        this.f24130i = z;
        mo24855d(false);
    }

    public void setInterpolator(Interpolator interpolator) {
        C7969a aVar = this.f24127f;
        aVar.f24145d.forceFinished(true);
        aVar.f24145d = new Scroller(aVar.f24143b, interpolator);
    }

    public void setViewAdapter(C12769g gVar) {
        C12769g gVar2 = this.f24133l;
        if (gVar2 != null) {
            C7968b bVar = this.f24139r;
            LinkedList linkedList = ((C12763a) gVar2).f31532a;
            if (linkedList != null) {
                linkedList.remove(bVar);
            }
        }
        this.f24133l = gVar;
        if (gVar != null) {
            C7968b bVar2 = this.f24139r;
            C12763a aVar = (C12763a) gVar;
            if (aVar.f31532a == null) {
                aVar.f31532a = new LinkedList();
            }
            aVar.f31532a.add(bVar2);
        }
        mo24855d(true);
    }

    public void setVisibleItems(int i) {
        this.f24124c = i;
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
