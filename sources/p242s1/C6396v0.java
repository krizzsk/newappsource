package p242s1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets$Builder;
import android.view.WindowInsets$Type;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import p129j1.C5349b;
import p229r1.C6232b;
import p242s1.C6331d;
import p242s1.C6333d0;

/* renamed from: s1.v0 */
public final class C6396v0 {

    /* renamed from: b */
    public static final C6396v0 f20043b;

    /* renamed from: a */
    public final C6407k f20044a;

    @SuppressLint({"SoonBlockedPrivateApi"})
    /* renamed from: s1.v0$a */
    public static class C6397a {

        /* renamed from: a */
        public static Field f20045a;

        /* renamed from: b */
        public static Field f20046b;

        /* renamed from: c */
        public static Field f20047c;

        /* renamed from: d */
        public static boolean f20048d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f20045a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f20046b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f20047c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
        }
    }

    /* renamed from: s1.v0$d */
    public static class C6400d extends C6399c {
        public C6400d() {
        }

        public C6400d(C6396v0 v0Var) {
            super(v0Var);
        }
    }

    /* renamed from: s1.v0$e */
    public static class C6401e {
        public C6401e() {
            this(new C6396v0());
        }

        /* renamed from: a */
        public final void mo22514a() {
        }

        /* renamed from: b */
        public C6396v0 mo22511b() {
            throw null;
        }

        /* renamed from: c */
        public void mo22512c(C5349b bVar) {
            throw null;
        }

        /* renamed from: d */
        public void mo22513d(C5349b bVar) {
            throw null;
        }

        public C6401e(C6396v0 v0Var) {
        }
    }

    /* renamed from: s1.v0$f */
    public static class C6402f extends C6407k {

        /* renamed from: h */
        public static boolean f20056h = false;

        /* renamed from: i */
        public static Method f20057i;

        /* renamed from: j */
        public static Class<?> f20058j;

        /* renamed from: k */
        public static Field f20059k;

        /* renamed from: l */
        public static Field f20060l;

        /* renamed from: c */
        public final WindowInsets f20061c;

        /* renamed from: d */
        public C5349b[] f20062d;

        /* renamed from: e */
        public C5349b f20063e = null;

        /* renamed from: f */
        public C6396v0 f20064f;

        /* renamed from: g */
        public C5349b f20065g;

        public C6402f(C6396v0 v0Var, WindowInsets windowInsets) {
            super(v0Var);
            this.f20061c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: r */
        private C5349b m15268r(int i, boolean z) {
            C5349b bVar = C5349b.f17645e;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    C5349b s = mo22523s(i2, z);
                    bVar = C5349b.m13418a(Math.max(bVar.f17646a, s.f17646a), Math.max(bVar.f17647b, s.f17647b), Math.max(bVar.f17648c, s.f17648c), Math.max(bVar.f17649d, s.f17649d));
                }
            }
            return bVar;
        }

        /* renamed from: t */
        private C5349b m15269t() {
            C6396v0 v0Var = this.f20064f;
            if (v0Var != null) {
                return v0Var.f20044a.mo22527h();
            }
            return C5349b.f17645e;
        }

        /* renamed from: u */
        private C5349b m15270u(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f20056h) {
                    m15271v();
                }
                Method method = f20057i;
                if (!(method == null || f20058j == null || f20059k == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            return null;
                        }
                        Rect rect = (Rect) f20059k.get(f20060l.get(invoke));
                        if (rect != null) {
                            return C5349b.m13418a(rect.left, rect.top, rect.right, rect.bottom);
                        }
                        return null;
                    } catch (ReflectiveOperationException e) {
                        e.getMessage();
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        /* renamed from: v */
        private static void m15271v() {
            try {
                f20057i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f20058j = cls;
                f20059k = cls.getDeclaredField("mVisibleInsets");
                f20060l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f20059k.setAccessible(true);
                f20060l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
            f20056h = true;
        }

        /* renamed from: d */
        public void mo22515d(View view) {
            C5349b u = m15270u(view);
            if (u == null) {
                u = C5349b.f17645e;
            }
            mo22524w(u);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f20065g, ((C6402f) obj).f20065g);
        }

        /* renamed from: f */
        public C5349b mo22517f(int i) {
            return m15268r(i, false);
        }

        /* renamed from: j */
        public final C5349b mo22518j() {
            if (this.f20063e == null) {
                this.f20063e = C5349b.m13418a(this.f20061c.getSystemWindowInsetLeft(), this.f20061c.getSystemWindowInsetTop(), this.f20061c.getSystemWindowInsetRight(), this.f20061c.getSystemWindowInsetBottom());
            }
            return this.f20063e;
        }

        /* renamed from: l */
        public C6396v0 mo22519l(int i, int i2, int i3, int i4) {
            C6401e eVar;
            C6396v0 i5 = C6396v0.m15249i(this.f20061c, (View) null);
            int i6 = Build.VERSION.SDK_INT;
            if (i6 >= 30) {
                eVar = new C6400d(i5);
            } else if (i6 >= 29) {
                eVar = new C6399c(i5);
            } else {
                eVar = new C6398b(i5);
            }
            eVar.mo22513d(C6396v0.m15248f(mo22518j(), i, i2, i3, i4));
            eVar.mo22512c(C6396v0.m15248f(mo22527h(), i, i2, i3, i4));
            return eVar.mo22511b();
        }

        /* renamed from: n */
        public boolean mo22520n() {
            return this.f20061c.isRound();
        }

        /* renamed from: o */
        public void mo22521o(C5349b[] bVarArr) {
            this.f20062d = bVarArr;
        }

        /* renamed from: p */
        public void mo22522p(C6396v0 v0Var) {
            this.f20064f = v0Var;
        }

        /* renamed from: s */
        public C5349b mo22523s(int i, boolean z) {
            int i2;
            C6331d dVar;
            int i3;
            int i4;
            int i5;
            int i6 = 0;
            if (i != 1) {
                C5349b bVar = null;
                if (i != 2) {
                    if (i == 8) {
                        C5349b[] bVarArr = this.f20062d;
                        if (bVarArr != null) {
                            bVar = bVarArr[3];
                        }
                        if (bVar != null) {
                            return bVar;
                        }
                        C5349b j = mo22518j();
                        C5349b t = m15269t();
                        int i7 = j.f17649d;
                        if (i7 > t.f17649d) {
                            return C5349b.m13418a(0, 0, 0, i7);
                        }
                        C5349b bVar2 = this.f20065g;
                        if (bVar2 == null || bVar2.equals(C5349b.f17645e) || (i2 = this.f20065g.f17649d) <= t.f17649d) {
                            return C5349b.f17645e;
                        }
                        return C5349b.m13418a(0, 0, 0, i2);
                    } else if (i == 16) {
                        return mo22534i();
                    } else {
                        if (i == 32) {
                            return mo22533g();
                        }
                        if (i == 64) {
                            return mo22535k();
                        }
                        if (i != 128) {
                            return C5349b.f17645e;
                        }
                        C6396v0 v0Var = this.f20064f;
                        if (v0Var != null) {
                            dVar = v0Var.mo22502a();
                        } else {
                            dVar = mo22531e();
                        }
                        if (dVar == null) {
                            return C5349b.f17645e;
                        }
                        int i8 = Build.VERSION.SDK_INT;
                        if (i8 >= 28) {
                            i3 = C6331d.C6332a.m15010d(dVar.f19989a);
                        } else {
                            i3 = 0;
                        }
                        if (i8 >= 28) {
                            i4 = C6331d.C6332a.m15012f(dVar.f19989a);
                        } else {
                            i4 = 0;
                        }
                        if (i8 >= 28) {
                            i5 = C6331d.C6332a.m15011e(dVar.f19989a);
                        } else {
                            i5 = 0;
                        }
                        if (i8 >= 28) {
                            i6 = C6331d.C6332a.m15009c(dVar.f19989a);
                        }
                        return C5349b.m13418a(i3, i4, i5, i6);
                    }
                } else if (z) {
                    C5349b t2 = m15269t();
                    C5349b h = mo22527h();
                    return C5349b.m13418a(Math.max(t2.f17646a, h.f17646a), 0, Math.max(t2.f17648c, h.f17648c), Math.max(t2.f17649d, h.f17649d));
                } else {
                    C5349b j2 = mo22518j();
                    C6396v0 v0Var2 = this.f20064f;
                    if (v0Var2 != null) {
                        bVar = v0Var2.f20044a.mo22527h();
                    }
                    int i9 = j2.f17649d;
                    if (bVar != null) {
                        i9 = Math.min(i9, bVar.f17649d);
                    }
                    return C5349b.m13418a(j2.f17646a, 0, j2.f17648c, i9);
                }
            } else if (z) {
                return C5349b.m13418a(0, Math.max(m15269t().f17647b, mo22518j().f17647b), 0, 0);
            } else {
                return C5349b.m13418a(0, mo22518j().f17647b, 0, 0);
            }
        }

        /* renamed from: w */
        public void mo22524w(C5349b bVar) {
            this.f20065g = bVar;
        }
    }

    /* renamed from: s1.v0$g */
    public static class C6403g extends C6402f {

        /* renamed from: m */
        public C5349b f20066m = null;

        public C6403g(C6396v0 v0Var, WindowInsets windowInsets) {
            super(v0Var, windowInsets);
        }

        /* renamed from: b */
        public C6396v0 mo22525b() {
            return C6396v0.m15249i(this.f20061c.consumeStableInsets(), (View) null);
        }

        /* renamed from: c */
        public C6396v0 mo22526c() {
            return C6396v0.m15249i(this.f20061c.consumeSystemWindowInsets(), (View) null);
        }

        /* renamed from: h */
        public final C5349b mo22527h() {
            if (this.f20066m == null) {
                this.f20066m = C5349b.m13418a(this.f20061c.getStableInsetLeft(), this.f20061c.getStableInsetTop(), this.f20061c.getStableInsetRight(), this.f20061c.getStableInsetBottom());
            }
            return this.f20066m;
        }

        /* renamed from: m */
        public boolean mo22528m() {
            return this.f20061c.isConsumed();
        }

        /* renamed from: q */
        public void mo22529q(C5349b bVar) {
            this.f20066m = bVar;
        }
    }

    /* renamed from: s1.v0$h */
    public static class C6404h extends C6403g {
        public C6404h(C6396v0 v0Var, WindowInsets windowInsets) {
            super(v0Var, windowInsets);
        }

        /* renamed from: a */
        public C6396v0 mo22530a() {
            return C6396v0.m15249i(this.f20061c.consumeDisplayCutout(), (View) null);
        }

        /* renamed from: e */
        public C6331d mo22531e() {
            DisplayCutout d = this.f20061c.getDisplayCutout();
            if (d == null) {
                return null;
            }
            return new C6331d(d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6404h)) {
                return false;
            }
            C6404h hVar = (C6404h) obj;
            if (!Objects.equals(this.f20061c, hVar.f20061c) || !Objects.equals(this.f20065g, hVar.f20065g)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f20061c.hashCode();
        }
    }

    /* renamed from: s1.v0$i */
    public static class C6405i extends C6404h {

        /* renamed from: n */
        public C5349b f20067n = null;

        /* renamed from: o */
        public C5349b f20068o = null;

        /* renamed from: p */
        public C5349b f20069p = null;

        public C6405i(C6396v0 v0Var, WindowInsets windowInsets) {
            super(v0Var, windowInsets);
        }

        /* renamed from: g */
        public C5349b mo22533g() {
            if (this.f20068o == null) {
                this.f20068o = C5349b.m13419b(this.f20061c.getMandatorySystemGestureInsets());
            }
            return this.f20068o;
        }

        /* renamed from: i */
        public C5349b mo22534i() {
            if (this.f20067n == null) {
                this.f20067n = C5349b.m13419b(this.f20061c.getSystemGestureInsets());
            }
            return this.f20067n;
        }

        /* renamed from: k */
        public C5349b mo22535k() {
            if (this.f20069p == null) {
                this.f20069p = C5349b.m13419b(this.f20061c.getTappableElementInsets());
            }
            return this.f20069p;
        }

        /* renamed from: l */
        public C6396v0 mo22519l(int i, int i2, int i3, int i4) {
            return C6396v0.m15249i(this.f20061c.inset(i, i2, i3, i4), (View) null);
        }

        /* renamed from: q */
        public void mo22529q(C5349b bVar) {
        }
    }

    /* renamed from: s1.v0$j */
    public static class C6406j extends C6405i {

        /* renamed from: q */
        public static final C6396v0 f20070q = C6396v0.m15249i(WindowInsets.CONSUMED, (View) null);

        public C6406j(C6396v0 v0Var, WindowInsets windowInsets) {
            super(v0Var, windowInsets);
        }

        /* renamed from: d */
        public final void mo22515d(View view) {
        }

        /* renamed from: f */
        public C5349b mo22517f(int i) {
            return C5349b.m13419b(this.f20061c.getInsets(C6408l.m15312a(i)));
        }
    }

    /* renamed from: s1.v0$k */
    public static class C6407k {

        /* renamed from: b */
        public static final C6396v0 f20071b;

        /* renamed from: a */
        public final C6396v0 f20072a;

        static {
            C6401e eVar;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                eVar = new C6400d();
            } else if (i >= 29) {
                eVar = new C6399c();
            } else {
                eVar = new C6398b();
            }
            f20071b = eVar.mo22511b().f20044a.mo22530a().f20044a.mo22525b().f20044a.mo22526c();
        }

        public C6407k(C6396v0 v0Var) {
            this.f20072a = v0Var;
        }

        /* renamed from: a */
        public C6396v0 mo22530a() {
            return this.f20072a;
        }

        /* renamed from: b */
        public C6396v0 mo22525b() {
            return this.f20072a;
        }

        /* renamed from: c */
        public C6396v0 mo22526c() {
            return this.f20072a;
        }

        /* renamed from: d */
        public void mo22515d(View view) {
        }

        /* renamed from: e */
        public C6331d mo22531e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6407k)) {
                return false;
            }
            C6407k kVar = (C6407k) obj;
            if (mo22520n() != kVar.mo22520n() || mo22528m() != kVar.mo22528m() || !C6232b.m14816a(mo22518j(), kVar.mo22518j()) || !C6232b.m14816a(mo22527h(), kVar.mo22527h()) || !C6232b.m14816a(mo22531e(), kVar.mo22531e())) {
                return false;
            }
            return true;
        }

        /* renamed from: f */
        public C5349b mo22517f(int i) {
            return C5349b.f17645e;
        }

        /* renamed from: g */
        public C5349b mo22533g() {
            return mo22518j();
        }

        /* renamed from: h */
        public C5349b mo22527h() {
            return C5349b.f17645e;
        }

        public int hashCode() {
            return C6232b.m14817b(Boolean.valueOf(mo22520n()), Boolean.valueOf(mo22528m()), mo22518j(), mo22527h(), mo22531e());
        }

        /* renamed from: i */
        public C5349b mo22534i() {
            return mo22518j();
        }

        /* renamed from: j */
        public C5349b mo22518j() {
            return C5349b.f17645e;
        }

        /* renamed from: k */
        public C5349b mo22535k() {
            return mo22518j();
        }

        /* renamed from: l */
        public C6396v0 mo22519l(int i, int i2, int i3, int i4) {
            return f20071b;
        }

        /* renamed from: m */
        public boolean mo22528m() {
            return false;
        }

        /* renamed from: n */
        public boolean mo22520n() {
            return false;
        }

        /* renamed from: o */
        public void mo22521o(C5349b[] bVarArr) {
        }

        /* renamed from: p */
        public void mo22522p(C6396v0 v0Var) {
        }

        /* renamed from: q */
        public void mo22529q(C5349b bVar) {
        }
    }

    /* renamed from: s1.v0$l */
    public static final class C6408l {
        /* renamed from: a */
        public static int m15312a(int i) {
            int i2;
            int i3 = 0;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i & i4) != 0) {
                    if (i4 == 1) {
                        i2 = WindowInsets$Type.statusBars();
                    } else if (i4 == 2) {
                        i2 = WindowInsets$Type.navigationBars();
                    } else if (i4 == 4) {
                        i2 = WindowInsets$Type.captionBar();
                    } else if (i4 == 8) {
                        i2 = WindowInsets$Type.ime();
                    } else if (i4 == 16) {
                        i2 = WindowInsets$Type.systemGestures();
                    } else if (i4 == 32) {
                        i2 = WindowInsets$Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        i2 = WindowInsets$Type.tappableElement();
                    } else if (i4 == 128) {
                        i2 = WindowInsets$Type.displayCutout();
                    }
                    i3 |= i2;
                }
            }
            return i3;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f20043b = C6406j.f20070q;
        } else {
            f20043b = C6407k.f20071b;
        }
    }

    public C6396v0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f20044a = new C6406j(this, windowInsets);
        } else if (i >= 29) {
            this.f20044a = new C6405i(this, windowInsets);
        } else if (i >= 28) {
            this.f20044a = new C6404h(this, windowInsets);
        } else {
            this.f20044a = new C6403g(this, windowInsets);
        }
    }

    /* renamed from: f */
    public static C5349b m15248f(C5349b bVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, bVar.f17646a - i);
        int max2 = Math.max(0, bVar.f17647b - i2);
        int max3 = Math.max(0, bVar.f17648c - i3);
        int max4 = Math.max(0, bVar.f17649d - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return bVar;
        }
        return C5349b.m13418a(max, max2, max3, max4);
    }

    /* renamed from: i */
    public static C6396v0 m15249i(WindowInsets windowInsets, View view) {
        C6396v0 v0Var;
        windowInsets.getClass();
        C6396v0 v0Var2 = new C6396v0(windowInsets);
        if (view != null) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            if (C6333d0.C6340g.m15075b(view)) {
                if (Build.VERSION.SDK_INT >= 23) {
                    v0Var = C6333d0.C6344j.m15110a(view);
                } else {
                    v0Var = C6333d0.C6342i.m15093j(view);
                }
                v0Var2.f20044a.mo22522p(v0Var);
                v0Var2.f20044a.mo22515d(view.getRootView());
            }
        }
        return v0Var2;
    }

    /* renamed from: a */
    public final C6331d mo22502a() {
        return this.f20044a.mo22531e();
    }

    @Deprecated
    /* renamed from: b */
    public final int mo22503b() {
        return this.f20044a.mo22518j().f17649d;
    }

    @Deprecated
    /* renamed from: c */
    public final int mo22504c() {
        return this.f20044a.mo22518j().f17646a;
    }

    @Deprecated
    /* renamed from: d */
    public final int mo22505d() {
        return this.f20044a.mo22518j().f17648c;
    }

    @Deprecated
    /* renamed from: e */
    public final int mo22506e() {
        return this.f20044a.mo22518j().f17647b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6396v0)) {
            return false;
        }
        return C6232b.m14816a(this.f20044a, ((C6396v0) obj).f20044a);
    }

    @Deprecated
    /* renamed from: g */
    public final C6396v0 mo22508g(int i, int i2, int i3, int i4) {
        C6401e eVar;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            eVar = new C6400d(this);
        } else if (i5 >= 29) {
            eVar = new C6399c(this);
        } else {
            eVar = new C6398b(this);
        }
        eVar.mo22513d(C5349b.m13418a(i, i2, i3, i4));
        return eVar.mo22511b();
    }

    /* renamed from: h */
    public final WindowInsets mo22509h() {
        C6407k kVar = this.f20044a;
        if (kVar instanceof C6402f) {
            return ((C6402f) kVar).f20061c;
        }
        return null;
    }

    public final int hashCode() {
        C6407k kVar = this.f20044a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    /* renamed from: s1.v0$b */
    public static class C6398b extends C6401e {

        /* renamed from: c */
        public static Field f20049c = null;

        /* renamed from: d */
        public static boolean f20050d = false;

        /* renamed from: e */
        public static Constructor<WindowInsets> f20051e = null;

        /* renamed from: f */
        public static boolean f20052f = false;

        /* renamed from: a */
        public WindowInsets f20053a;

        /* renamed from: b */
        public C5349b f20054b;

        public C6398b() {
            this.f20053a = m15257e();
        }

        /* renamed from: e */
        private static WindowInsets m15257e() {
            if (!f20050d) {
                try {
                    f20049c = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException unused) {
                }
                f20050d = true;
            }
            Field field = f20049c;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException unused2) {
                }
            }
            if (!f20052f) {
                try {
                    f20051e = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException unused3) {
                }
                f20052f = true;
            }
            Constructor<WindowInsets> constructor = f20051e;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException unused4) {
                }
            }
            return null;
        }

        /* renamed from: b */
        public C6396v0 mo22511b() {
            mo22514a();
            C6396v0 i = C6396v0.m15249i(this.f20053a, (View) null);
            i.f20044a.mo22521o((C5349b[]) null);
            i.f20044a.mo22529q(this.f20054b);
            return i;
        }

        /* renamed from: c */
        public void mo22512c(C5349b bVar) {
            this.f20054b = bVar;
        }

        /* renamed from: d */
        public void mo22513d(C5349b bVar) {
            WindowInsets windowInsets = this.f20053a;
            if (windowInsets != null) {
                this.f20053a = windowInsets.replaceSystemWindowInsets(bVar.f17646a, bVar.f17647b, bVar.f17648c, bVar.f17649d);
            }
        }

        public C6398b(C6396v0 v0Var) {
            super(v0Var);
            this.f20053a = v0Var.mo22509h();
        }
    }

    /* renamed from: s1.v0$c */
    public static class C6399c extends C6401e {

        /* renamed from: a */
        public final WindowInsets$Builder f20055a;

        public C6399c() {
            this.f20055a = new WindowInsets$Builder();
        }

        /* renamed from: b */
        public C6396v0 mo22511b() {
            mo22514a();
            C6396v0 i = C6396v0.m15249i(this.f20055a.build(), (View) null);
            i.f20044a.mo22521o((C5349b[]) null);
            return i;
        }

        /* renamed from: c */
        public void mo22512c(C5349b bVar) {
            this.f20055a.setStableInsets(bVar.mo21131c());
        }

        /* renamed from: d */
        public void mo22513d(C5349b bVar) {
            this.f20055a.setSystemWindowInsets(bVar.mo21131c());
        }

        public C6399c(C6396v0 v0Var) {
            super(v0Var);
            WindowInsets$Builder windowInsets$Builder;
            WindowInsets h = v0Var.mo22509h();
            if (h != null) {
                windowInsets$Builder = new WindowInsets$Builder(h);
            } else {
                new WindowInsets$Builder
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0011: CONSTRUCTOR  (r0v1 ? I:android.view.WindowInsets$Builder) =  call: android.view.WindowInsets$Builder.<init>():void type: CONSTRUCTOR in method: s1.v0.c.<init>(s1.v0):void, dex: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v1 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 51 more
                    */
                /*
                    this = this;
                    r1.<init>(r2)
                    android.view.WindowInsets r2 = r2.mo22509h()
                    if (r2 == 0) goto L_0x000f
                    android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
                    r0.<init>(r2)
                    goto L_0x0014
                L_0x000f:
                    android.view.WindowInsets$Builder r0 = new android.view.WindowInsets$Builder
                    r0.<init>()
                L_0x0014:
                    r1.f20055a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p242s1.C6396v0.C6399c.<init>(s1.v0):void");
            }
        }

        public C6396v0() {
            this.f20044a = new C6407k(this);
        }
    }
