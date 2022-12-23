package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.core.widget.C0798j;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p114i.C5215a;
import p114i.C5224j;
import p188o.C5901f;
import p242s1.C6333d0;
import p242s1.C6382p0;

public class ListPopupWindow implements C5901f {

    /* renamed from: A */
    public static Method f1224A;

    /* renamed from: B */
    public static Method f1225B;

    /* renamed from: C */
    public static Method f1226C;

    /* renamed from: b */
    public Context f1227b;

    /* renamed from: c */
    public ListAdapter f1228c;

    /* renamed from: d */
    public C0427l0 f1229d;

    /* renamed from: e */
    public int f1230e;

    /* renamed from: f */
    public int f1231f;

    /* renamed from: g */
    public int f1232g;

    /* renamed from: h */
    public int f1233h;

    /* renamed from: i */
    public int f1234i;

    /* renamed from: j */
    public boolean f1235j;

    /* renamed from: k */
    public boolean f1236k;

    /* renamed from: l */
    public boolean f1237l;

    /* renamed from: m */
    public int f1238m;

    /* renamed from: n */
    public int f1239n;

    /* renamed from: o */
    public C0348d f1240o;

    /* renamed from: p */
    public View f1241p;

    /* renamed from: q */
    public AdapterView.OnItemClickListener f1242q;

    /* renamed from: r */
    public final C0351g f1243r;

    /* renamed from: s */
    public final C0350f f1244s;

    /* renamed from: t */
    public final C0349e f1245t;

    /* renamed from: u */
    public final C0347c f1246u;

    /* renamed from: v */
    public final Handler f1247v;

    /* renamed from: w */
    public final Rect f1248w;

    /* renamed from: x */
    public Rect f1249x;

    /* renamed from: y */
    public boolean f1250y;

    /* renamed from: z */
    public PopupWindow f1251z;

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$a */
    public static class C0345a {
        /* renamed from: a */
        public static int m861a(PopupWindow popupWindow, View view, int i, boolean z) {
            return popupWindow.getMaxAvailableHeight(view, i, z);
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$b */
    public static class C0346b {
        /* renamed from: a */
        public static void m862a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        /* renamed from: b */
        public static void m863b(PopupWindow popupWindow, boolean z) {
            popupWindow.setIsClippedToScreen(z);
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$c */
    public class C0347c implements Runnable {
        public C0347c() {
        }

        public final void run() {
            C0427l0 l0Var = ListPopupWindow.this.f1229d;
            if (l0Var != null) {
                l0Var.setListSelectionHidden(true);
                l0Var.requestLayout();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$d */
    public class C0348d extends DataSetObserver {
        public C0348d() {
        }

        public final void onChanged() {
            if (ListPopupWindow.this.mo1048a()) {
                ListPopupWindow.this.show();
            }
        }

        public final void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$e */
    public class C0349e implements AbsListView.OnScrollListener {
        public C0349e() {
        }

        public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        }

        public final void onScrollStateChanged(AbsListView absListView, int i) {
            boolean z = true;
            if (i == 1) {
                if (ListPopupWindow.this.f1251z.getInputMethodMode() != 2) {
                    z = false;
                }
                if (!z && ListPopupWindow.this.f1251z.getContentView() != null) {
                    ListPopupWindow listPopupWindow = ListPopupWindow.this;
                    listPopupWindow.f1247v.removeCallbacks(listPopupWindow.f1243r);
                    ListPopupWindow.this.f1243r.run();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$f */
    public class C0350f implements View.OnTouchListener {
        public C0350f() {
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = ListPopupWindow.this.f1251z) != null && popupWindow.isShowing() && x >= 0 && x < ListPopupWindow.this.f1251z.getWidth() && y >= 0 && y < ListPopupWindow.this.f1251z.getHeight()) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                listPopupWindow.f1247v.postDelayed(listPopupWindow.f1243r, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                ListPopupWindow listPopupWindow2 = ListPopupWindow.this;
                listPopupWindow2.f1247v.removeCallbacks(listPopupWindow2.f1243r);
                return false;
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.ListPopupWindow$g */
    public class C0351g implements Runnable {
        public C0351g() {
        }

        public final void run() {
            C0427l0 l0Var = ListPopupWindow.this.f1229d;
            if (l0Var != null) {
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                if (C6333d0.C6340g.m15075b(l0Var) && ListPopupWindow.this.f1229d.getCount() > ListPopupWindow.this.f1229d.getChildCount()) {
                    int childCount = ListPopupWindow.this.f1229d.getChildCount();
                    ListPopupWindow listPopupWindow = ListPopupWindow.this;
                    if (childCount <= listPopupWindow.f1239n) {
                        listPopupWindow.f1251z.setInputMethodMode(2);
                        ListPopupWindow.this.show();
                    }
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                f1224A = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
            }
            try {
                f1226C = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                f1225B = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public ListPopupWindow(Context context) {
        this(context, (AttributeSet) null, C5215a.listPopupWindowStyle);
    }

    /* renamed from: a */
    public final boolean mo1048a() {
        return this.f1251z.isShowing();
    }

    /* renamed from: b */
    public final int mo1750b() {
        return this.f1232g;
    }

    /* renamed from: d */
    public final void mo1751d(int i) {
        this.f1232g = i;
    }

    public final void dismiss() {
        this.f1251z.dismiss();
        this.f1251z.setContentView((View) null);
        this.f1229d = null;
        this.f1247v.removeCallbacks(this.f1243r);
    }

    /* renamed from: f */
    public final Drawable mo1752f() {
        return this.f1251z.getBackground();
    }

    /* renamed from: h */
    public final void mo1753h(int i) {
        this.f1233h = i;
        this.f1235j = true;
    }

    /* renamed from: k */
    public final int mo1754k() {
        if (!this.f1235j) {
            return 0;
        }
        return this.f1233h;
    }

    /* renamed from: l */
    public void mo1626l(ListAdapter listAdapter) {
        C0348d dVar = this.f1240o;
        if (dVar == null) {
            this.f1240o = new C0348d();
        } else {
            ListAdapter listAdapter2 = this.f1228c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dVar);
            }
        }
        this.f1228c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1240o);
        }
        C0427l0 l0Var = this.f1229d;
        if (l0Var != null) {
            l0Var.setAdapter(this.f1228c);
        }
    }

    /* renamed from: n */
    public final C0427l0 mo1057n() {
        return this.f1229d;
    }

    /* renamed from: o */
    public final void mo1755o(Drawable drawable) {
        this.f1251z.setBackgroundDrawable(drawable);
    }

    /* renamed from: p */
    public C0427l0 mo1756p(Context context, boolean z) {
        return new C0427l0(context, z);
    }

    /* renamed from: q */
    public final void mo1757q(int i) {
        Drawable background = this.f1251z.getBackground();
        if (background != null) {
            background.getPadding(this.f1248w);
            Rect rect = this.f1248w;
            this.f1231f = rect.left + rect.right + i;
            return;
        }
        this.f1231f = i;
    }

    public final void show() {
        int i;
        boolean z;
        int i2;
        int i3;
        boolean z2;
        C0427l0 l0Var;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (this.f1229d == null) {
            C0427l0 p = mo1756p(this.f1227b, !this.f1250y);
            this.f1229d = p;
            p.setAdapter(this.f1228c);
            this.f1229d.setOnItemClickListener(this.f1242q);
            this.f1229d.setFocusable(true);
            this.f1229d.setFocusableInTouchMode(true);
            this.f1229d.setOnItemSelectedListener(new C0443o0(this));
            this.f1229d.setOnScrollListener(this.f1245t);
            this.f1251z.setContentView(this.f1229d);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f1251z.getContentView();
        }
        Drawable background = this.f1251z.getBackground();
        int i9 = 0;
        if (background != null) {
            background.getPadding(this.f1248w);
            Rect rect = this.f1248w;
            int i11 = rect.top;
            i = rect.bottom + i11;
            if (!this.f1235j) {
                this.f1233h = -i11;
            }
        } else {
            this.f1248w.setEmpty();
            i = 0;
        }
        if (this.f1251z.getInputMethodMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        View view = this.f1241p;
        int i12 = this.f1233h;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f1225B;
            if (method != null) {
                try {
                    i2 = ((Integer) method.invoke(this.f1251z, new Object[]{view, Integer.valueOf(i12), Boolean.valueOf(z)})).intValue();
                } catch (Exception unused) {
                }
            }
            i2 = this.f1251z.getMaxAvailableHeight(view, i12);
        } else {
            i2 = C0345a.m861a(this.f1251z, view, i12, z);
        }
        if (this.f1230e == -1) {
            i3 = i2 + i;
        } else {
            int i13 = this.f1231f;
            if (i13 == -2) {
                int i14 = this.f1227b.getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = this.f1248w;
                i7 = View.MeasureSpec.makeMeasureSpec(i14 - (rect2.left + rect2.right), Integer.MIN_VALUE);
            } else if (i13 != -1) {
                i7 = View.MeasureSpec.makeMeasureSpec(i13, 1073741824);
            } else {
                int i15 = this.f1227b.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.f1248w;
                i7 = View.MeasureSpec.makeMeasureSpec(i15 - (rect3.left + rect3.right), 1073741824);
            }
            int a = this.f1229d.mo2143a(i7, i2 + 0);
            if (a > 0) {
                i8 = this.f1229d.getPaddingBottom() + this.f1229d.getPaddingTop() + i + 0;
            } else {
                i8 = 0;
            }
            i3 = a + i8;
        }
        if (this.f1251z.getInputMethodMode() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        C0798j.m2413b(this.f1251z, this.f1234i);
        if (this.f1251z.isShowing()) {
            View view2 = this.f1241p;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            if (C6333d0.C6340g.m15075b(view2)) {
                int i16 = this.f1231f;
                if (i16 == -1) {
                    i16 = -1;
                } else if (i16 == -2) {
                    i16 = this.f1241p.getWidth();
                }
                int i17 = this.f1230e;
                if (i17 == -1) {
                    if (!z2) {
                        i3 = -1;
                    }
                    if (z2) {
                        PopupWindow popupWindow = this.f1251z;
                        if (this.f1231f == -1) {
                            i6 = -1;
                        } else {
                            i6 = 0;
                        }
                        popupWindow.setWidth(i6);
                        this.f1251z.setHeight(0);
                    } else {
                        PopupWindow popupWindow2 = this.f1251z;
                        if (this.f1231f == -1) {
                            i9 = -1;
                        }
                        popupWindow2.setWidth(i9);
                        this.f1251z.setHeight(-1);
                    }
                } else if (i17 != -2) {
                    i3 = i17;
                }
                this.f1251z.setOutsideTouchable(true);
                PopupWindow popupWindow3 = this.f1251z;
                View view3 = this.f1241p;
                int i18 = this.f1232g;
                int i19 = this.f1233h;
                if (i16 < 0) {
                    i4 = -1;
                } else {
                    i4 = i16;
                }
                if (i3 < 0) {
                    i5 = -1;
                } else {
                    i5 = i3;
                }
                popupWindow3.update(view3, i18, i19, i4, i5);
                return;
            }
            return;
        }
        int i21 = this.f1231f;
        if (i21 == -1) {
            i21 = -1;
        } else if (i21 == -2) {
            i21 = this.f1241p.getWidth();
        }
        int i22 = this.f1230e;
        if (i22 == -1) {
            i3 = -1;
        } else if (i22 != -2) {
            i3 = i22;
        }
        this.f1251z.setWidth(i21);
        this.f1251z.setHeight(i3);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f1224A;
            if (method2 != null) {
                try {
                    method2.invoke(this.f1251z, new Object[]{Boolean.TRUE});
                } catch (Exception unused2) {
                }
            }
        } else {
            C0346b.m863b(this.f1251z, true);
        }
        this.f1251z.setOutsideTouchable(true);
        this.f1251z.setTouchInterceptor(this.f1244s);
        if (this.f1237l) {
            C0798j.m2412a(this.f1251z, this.f1236k);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f1226C;
            if (method3 != null) {
                try {
                    method3.invoke(this.f1251z, new Object[]{this.f1249x});
                } catch (Exception unused3) {
                }
            }
        } else {
            C0346b.m862a(this.f1251z, this.f1249x);
        }
        C0798j.C0799a.m2414a(this.f1251z, this.f1241p, this.f1232g, this.f1233h, this.f1238m);
        this.f1229d.setSelection(-1);
        if ((!this.f1250y || this.f1229d.isInTouchMode()) && (l0Var = this.f1229d) != null) {
            l0Var.setListSelectionHidden(true);
            l0Var.requestLayout();
        }
        if (!this.f1250y) {
            this.f1247v.post(this.f1246u);
        }
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C5215a.listPopupWindowStyle);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public ListPopupWindow(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1230e = -2;
        this.f1231f = -2;
        this.f1234i = 1002;
        this.f1238m = 0;
        this.f1239n = Integer.MAX_VALUE;
        this.f1243r = new C0351g();
        this.f1244s = new C0350f();
        this.f1245t = new C0349e();
        this.f1246u = new C0347c();
        this.f1248w = new Rect();
        this.f1227b = context;
        this.f1247v = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5224j.ListPopupWindow, i, i2);
        this.f1232g = obtainStyledAttributes.getDimensionPixelOffset(C5224j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(C5224j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f1233h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1235j = true;
        }
        obtainStyledAttributes.recycle();
        AppCompatPopupWindow appCompatPopupWindow = new AppCompatPopupWindow(context, attributeSet, i, i2);
        this.f1251z = appCompatPopupWindow;
        appCompatPopupWindow.setInputMethodMode(1);
    }
}
