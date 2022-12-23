package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.widget.C0796h;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p114i.C5215a;
import p139k.C5441c;

/* renamed from: androidx.appcompat.widget.l0 */
public class C0427l0 extends ListView {

    /* renamed from: b */
    public final Rect f1555b = new Rect();

    /* renamed from: c */
    public int f1556c = 0;

    /* renamed from: d */
    public int f1557d = 0;

    /* renamed from: e */
    public int f1558e = 0;

    /* renamed from: f */
    public int f1559f = 0;

    /* renamed from: g */
    public int f1560g;

    /* renamed from: h */
    public Field f1561h;

    /* renamed from: i */
    public C0430c f1562i;

    /* renamed from: j */
    public boolean f1563j;

    /* renamed from: k */
    public boolean f1564k;

    /* renamed from: l */
    public boolean f1565l;

    /* renamed from: m */
    public C0796h f1566m;

    /* renamed from: n */
    public C0431d f1567n;

    /* renamed from: androidx.appcompat.widget.l0$a */
    public static class C0428a {
        /* renamed from: a */
        public static void m1180a(View view, float f, float f2) {
            view.drawableHotspotChanged(f, f2);
        }
    }

    /* renamed from: androidx.appcompat.widget.l0$b */
    public static class C0429b {

        /* renamed from: a */
        public static Method f1568a;

        /* renamed from: b */
        public static Method f1569b;

        /* renamed from: c */
        public static Method f1570c;

        /* renamed from: d */
        public static boolean f1571d = true;

        static {
            Class<AbsListView> cls = AbsListView.class;
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("positionSelector", new Class[]{cls2, View.class, Boolean.TYPE, cls3, cls3});
                f1568a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", new Class[]{cls2});
                f1569b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", new Class[]{cls2});
                f1570c = declaredMethod3;
                declaredMethod3.setAccessible(true);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.l0$c */
    public static class C0430c extends C5441c {

        /* renamed from: c */
        public boolean f1572c = true;

        public C0430c(Drawable drawable) {
            super(drawable);
        }

        public final void draw(Canvas canvas) {
            if (this.f1572c) {
                super.draw(canvas);
            }
        }

        public final void setHotspot(float f, float f2) {
            if (this.f1572c) {
                super.setHotspot(f, f2);
            }
        }

        public final void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.f1572c) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public final boolean setState(int[] iArr) {
            if (this.f1572c) {
                return super.setState(iArr);
            }
            return false;
        }

        public final boolean setVisible(boolean z, boolean z2) {
            if (this.f1572c) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* renamed from: androidx.appcompat.widget.l0$d */
    public class C0431d implements Runnable {
        public C0431d() {
        }

        public final void run() {
            C0427l0 l0Var = C0427l0.this;
            l0Var.f1567n = null;
            l0Var.drawableStateChanged();
        }
    }

    public C0427l0(Context context, boolean z) {
        super(context, (AttributeSet) null, C5215a.dropDownListViewStyle);
        this.f1564k = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.f1561h = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z) {
        C0430c cVar = this.f1562i;
        if (cVar != null) {
            cVar.f1572c = z;
        }
    }

    /* renamed from: a */
    public final int mo2143a(int i, int i2) {
        int i3;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i4 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i4;
        }
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        View view = null;
        int i5 = 0;
        for (int i6 = 0; i6 < count; i6++) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i5) {
                view = null;
                i5 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i7 = layoutParams.height;
            if (i7 > 0) {
                i3 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
            } else {
                i3 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i3);
            view.forceLayout();
            if (i6 > 0) {
                i4 += dividerHeight;
            }
            i4 += view.getMeasuredHeight();
            if (i4 >= i2) {
                return i2;
            }
        }
        return i4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r3 != 3) goto L_0x0121;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0157  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2144b(android.view.MotionEvent r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            int r3 = r17.getActionMasked()
            r4 = 0
            r5 = 1
            if (r3 == r5) goto L_0x0016
            r0 = 2
            if (r3 == r0) goto L_0x0014
            r0 = 3
            if (r3 == r0) goto L_0x001d
            goto L_0x0121
        L_0x0014:
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            int r6 = r17.findPointerIndex(r18)
            if (r6 >= 0) goto L_0x0020
        L_0x001d:
            r0 = 0
            goto L_0x0122
        L_0x0020:
            float r7 = r2.getX(r6)
            int r7 = (int) r7
            float r6 = r2.getY(r6)
            int r6 = (int) r6
            int r8 = r1.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L_0x0033
            goto L_0x0123
        L_0x0033:
            int r0 = r16.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.f1565l = r5
            androidx.appcompat.widget.C0427l0.C0428a.m1180a(r1, r7, r6)
            boolean r0 = r16.isPressed()
            if (r0 != 0) goto L_0x004d
            r1.setPressed(r5)
        L_0x004d:
            r16.layoutChildren()
            int r0 = r1.f1560g
            if (r0 == r9) goto L_0x006a
            int r11 = r16.getFirstVisiblePosition()
            int r0 = r0 - r11
            android.view.View r0 = r1.getChildAt(r0)
            if (r0 == 0) goto L_0x006a
            if (r0 == r10) goto L_0x006a
            boolean r11 = r0.isPressed()
            if (r11 == 0) goto L_0x006a
            r0.setPressed(r4)
        L_0x006a:
            r1.f1560g = r8
            int r0 = r10.getLeft()
            float r0 = (float) r0
            float r0 = r7 - r0
            int r11 = r10.getTop()
            float r11 = (float) r11
            float r11 = r6 - r11
            androidx.appcompat.widget.C0427l0.C0428a.m1180a(r10, r0, r11)
            boolean r0 = r10.isPressed()
            if (r0 != 0) goto L_0x0086
            r10.setPressed(r5)
        L_0x0086:
            android.graphics.drawable.Drawable r11 = r16.getSelector()
            if (r11 == 0) goto L_0x0090
            if (r8 == r9) goto L_0x0090
            r12 = 1
            goto L_0x0091
        L_0x0090:
            r12 = 0
        L_0x0091:
            if (r12 == 0) goto L_0x0096
            r11.setVisible(r4, r4)
        L_0x0096:
            android.graphics.Rect r0 = r1.f1555b
            int r13 = r10.getLeft()
            int r14 = r10.getTop()
            int r15 = r10.getRight()
            int r5 = r10.getBottom()
            r0.set(r13, r14, r15, r5)
            int r5 = r0.left
            int r13 = r1.f1556c
            int r5 = r5 - r13
            r0.left = r5
            int r5 = r0.top
            int r13 = r1.f1557d
            int r5 = r5 - r13
            r0.top = r5
            int r5 = r0.right
            int r13 = r1.f1558e
            int r5 = r5 + r13
            r0.right = r5
            int r5 = r0.bottom
            int r13 = r1.f1559f
            int r5 = r5 + r13
            r0.bottom = r5
            java.lang.reflect.Field r0 = r1.f1561h     // Catch:{ IllegalAccessException -> 0x00e7 }
            boolean r0 = r0.getBoolean(r1)     // Catch:{ IllegalAccessException -> 0x00e7 }
            boolean r5 = r10.isEnabled()     // Catch:{ IllegalAccessException -> 0x00e7 }
            if (r5 == r0) goto L_0x00eb
            java.lang.reflect.Field r5 = r1.f1561h     // Catch:{ IllegalAccessException -> 0x00e7 }
            if (r0 != 0) goto L_0x00d9
            r0 = 1
            goto L_0x00da
        L_0x00d9:
            r0 = 0
        L_0x00da:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x00e7 }
            r5.set(r1, r0)     // Catch:{ IllegalAccessException -> 0x00e7 }
            if (r8 == r9) goto L_0x00eb
            r16.refreshDrawableState()     // Catch:{ IllegalAccessException -> 0x00e7 }
            goto L_0x00eb
        L_0x00e7:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00eb:
            if (r12 == 0) goto L_0x0106
            android.graphics.Rect r0 = r1.f1555b
            float r5 = r0.exactCenterX()
            float r0 = r0.exactCenterY()
            int r12 = r16.getVisibility()
            if (r12 != 0) goto L_0x00ff
            r12 = 1
            goto L_0x0100
        L_0x00ff:
            r12 = 0
        L_0x0100:
            r11.setVisible(r12, r4)
            p141k1.C5450a.C5452b.m13614e(r11, r5, r0)
        L_0x0106:
            android.graphics.drawable.Drawable r0 = r16.getSelector()
            if (r0 == 0) goto L_0x0111
            if (r8 == r9) goto L_0x0111
            p141k1.C5450a.C5452b.m13614e(r0, r7, r6)
        L_0x0111:
            r1.setSelectorEnabled(r4)
            r16.refreshDrawableState()
            r5 = 1
            if (r3 != r5) goto L_0x0121
            long r5 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r5)
        L_0x0121:
            r0 = 1
        L_0x0122:
            r5 = 0
        L_0x0123:
            if (r0 == 0) goto L_0x0127
            if (r5 == 0) goto L_0x013f
        L_0x0127:
            r1.f1565l = r4
            r1.setPressed(r4)
            r16.drawableStateChanged()
            int r3 = r1.f1560g
            int r5 = r16.getFirstVisiblePosition()
            int r3 = r3 - r5
            android.view.View r3 = r1.getChildAt(r3)
            if (r3 == 0) goto L_0x013f
            r3.setPressed(r4)
        L_0x013f:
            if (r0 == 0) goto L_0x0157
            androidx.core.widget.h r3 = r1.f1566m
            if (r3 != 0) goto L_0x014c
            androidx.core.widget.h r3 = new androidx.core.widget.h
            r3.<init>(r1)
            r1.f1566m = r3
        L_0x014c:
            androidx.core.widget.h r3 = r1.f1566m
            boolean r4 = r3.f3407q
            r4 = 1
            r3.f3407q = r4
            r3.onTouch(r1, r2)
            goto L_0x0164
        L_0x0157:
            androidx.core.widget.h r2 = r1.f1566m
            if (r2 == 0) goto L_0x0164
            boolean r3 = r2.f3407q
            if (r3 == 0) goto L_0x0162
            r2.mo3520d()
        L_0x0162:
            r2.f3407q = r4
        L_0x0164:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0427l0.mo2144b(android.view.MotionEvent, int):boolean");
    }

    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.f1555b.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.f1555b);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public final void drawableStateChanged() {
        if (this.f1567n == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            Drawable selector = getSelector();
            if (selector != null && this.f1565l && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
    }

    public final boolean hasFocus() {
        return this.f1564k || super.hasFocus();
    }

    public final boolean hasWindowFocus() {
        return this.f1564k || super.hasWindowFocus();
    }

    public final boolean isFocused() {
        return this.f1564k || super.isFocused();
    }

    public final boolean isInTouchMode() {
        return (this.f1564k && this.f1563j) || super.isInTouchMode();
    }

    public final void onDetachedFromWindow() {
        this.f1567n = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f1567n == null) {
            C0431d dVar = new C0431d();
            this.f1567n = dVar;
            post(dVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i < 30 || !C0429b.f1571d) {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            C0429b.f1568a.invoke(this, new Object[]{Integer.valueOf(pointToPosition), childAt, Boolean.FALSE, -1, -1});
                            C0429b.f1569b.invoke(this, new Object[]{Integer.valueOf(pointToPosition)});
                            C0429b.f1570c.invoke(this, new Object[]{Integer.valueOf(pointToPosition)});
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e2) {
                            e2.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f1565l && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1560g = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        C0431d dVar = this.f1567n;
        if (dVar != null) {
            C0427l0 l0Var = C0427l0.this;
            l0Var.f1567n = null;
            l0Var.removeCallbacks(dVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.f1563j = z;
    }

    public void setSelector(Drawable drawable) {
        C0430c cVar;
        if (drawable != null) {
            cVar = new C0430c(drawable);
        } else {
            cVar = null;
        }
        this.f1562i = cVar;
        super.setSelector(cVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1556c = rect.left;
        this.f1557d = rect.top;
        this.f1558e = rect.right;
        this.f1559f = rect.bottom;
    }
}
