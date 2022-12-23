package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.menu.C0291f;
import androidx.appcompat.view.menu.C0295h;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.Toolbar;
import ce0.C21100e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p114i.C5215a;
import p114i.C5220f;
import p114i.C5222h;
import p114i.C5224j;
import p127j.C5344a;
import p242s1.C6333d0;
import p242s1.C6382p0;

/* renamed from: androidx.appcompat.widget.k1 */
public final class C0424k1 implements C0415i0 {

    /* renamed from: a */
    public Toolbar f1536a;

    /* renamed from: b */
    public int f1537b;

    /* renamed from: c */
    public C0383a1 f1538c;

    /* renamed from: d */
    public View f1539d;

    /* renamed from: e */
    public Drawable f1540e;

    /* renamed from: f */
    public Drawable f1541f;

    /* renamed from: g */
    public Drawable f1542g;

    /* renamed from: h */
    public boolean f1543h;

    /* renamed from: i */
    public CharSequence f1544i;

    /* renamed from: j */
    public CharSequence f1545j;

    /* renamed from: k */
    public CharSequence f1546k;

    /* renamed from: l */
    public Window.Callback f1547l;

    /* renamed from: m */
    public boolean f1548m;

    /* renamed from: n */
    public ActionMenuPresenter f1549n;

    /* renamed from: o */
    public int f1550o = 0;

    /* renamed from: p */
    public Drawable f1551p;

    /* renamed from: androidx.appcompat.widget.k1$a */
    public class C0425a extends C21100e {

        /* renamed from: i */
        public boolean f1552i = false;

        /* renamed from: j */
        public final /* synthetic */ int f1553j;

        public C0425a(int i) {
            this.f1553j = i;
        }

        /* renamed from: a */
        public final void mo2022a(View view) {
            this.f1552i = true;
        }

        /* renamed from: b */
        public final void mo909b(View view) {
            if (!this.f1552i) {
                C0424k1.this.f1536a.setVisibility(this.f1553j);
            }
        }

        /* renamed from: d */
        public final void mo957d() {
            C0424k1.this.f1536a.setVisibility(0);
        }
    }

    public C0424k1(Toolbar toolbar, boolean z) {
        boolean z2;
        int i;
        Drawable drawable;
        int i2 = C5222h.abc_action_bar_up_description;
        this.f1536a = toolbar;
        this.f1544i = toolbar.getTitle();
        this.f1545j = toolbar.getSubtitle();
        if (this.f1544i != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f1543h = z2;
        this.f1542g = toolbar.getNavigationIcon();
        C0413h1 m = C0413h1.m1063m(toolbar.getContext(), (AttributeSet) null, C5224j.ActionBar, C5215a.actionBarStyle);
        this.f1551p = m.mo2091e(C5224j.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence k = m.mo2097k(C5224j.ActionBar_title);
            if (!TextUtils.isEmpty(k)) {
                setTitle(k);
            }
            CharSequence k2 = m.mo2097k(C5224j.ActionBar_subtitle);
            if (!TextUtils.isEmpty(k2)) {
                mo2116j(k2);
            }
            Drawable e = m.mo2091e(C5224j.ActionBar_logo);
            if (e != null) {
                this.f1541f = e;
                mo2142y();
            }
            Drawable e2 = m.mo2091e(C5224j.ActionBar_icon);
            if (e2 != null) {
                setIcon(e2);
            }
            if (this.f1542g == null && (drawable = this.f1551p) != null) {
                mo2135w(drawable);
            }
            mo2115i(m.mo2094h(C5224j.ActionBar_displayOptions, 0));
            int i3 = m.mo2095i(C5224j.ActionBar_customNavigationLayout, 0);
            if (i3 != 0) {
                View inflate = LayoutInflater.from(this.f1536a.getContext()).inflate(i3, this.f1536a, false);
                View view = this.f1539d;
                if (!(view == null || (this.f1537b & 16) == 0)) {
                    this.f1536a.removeView(view);
                }
                this.f1539d = inflate;
                if (!(inflate == null || (this.f1537b & 16) == 0)) {
                    this.f1536a.addView(inflate);
                }
                mo2115i(this.f1537b | 16);
            }
            int layoutDimension = m.f1515b.getLayoutDimension(C5224j.ActionBar_height, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = this.f1536a.getLayoutParams();
                layoutParams.height = layoutDimension;
                this.f1536a.setLayoutParams(layoutParams);
            }
            int c = m.mo2089c(C5224j.ActionBar_contentInsetStart, -1);
            int c2 = m.mo2089c(C5224j.ActionBar_contentInsetEnd, -1);
            if (c >= 0 || c2 >= 0) {
                Toolbar toolbar2 = this.f1536a;
                int max = Math.max(c, 0);
                int max2 = Math.max(c2, 0);
                if (toolbar2.f1410u == null) {
                    toolbar2.f1410u = new C0489z0();
                }
                toolbar2.f1410u.mo2212a(max, max2);
            }
            int i4 = m.mo2095i(C5224j.ActionBar_titleTextStyle, 0);
            if (i4 != 0) {
                Toolbar toolbar3 = this.f1536a;
                Context context = toolbar3.getContext();
                toolbar3.f1402m = i4;
                AppCompatTextView appCompatTextView = toolbar3.f1392c;
                if (appCompatTextView != null) {
                    appCompatTextView.setTextAppearance(context, i4);
                }
            }
            int i5 = m.mo2095i(C5224j.ActionBar_subtitleTextStyle, 0);
            if (i5 != 0) {
                Toolbar toolbar4 = this.f1536a;
                Context context2 = toolbar4.getContext();
                toolbar4.f1403n = i5;
                AppCompatTextView appCompatTextView2 = toolbar4.f1393d;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTextAppearance(context2, i5);
                }
            }
            int i6 = m.mo2095i(C5224j.ActionBar_popupTheme, 0);
            if (i6 != 0) {
                this.f1536a.setPopupTheme(i6);
            }
        } else {
            if (this.f1536a.getNavigationIcon() != null) {
                i = 15;
                this.f1551p = this.f1536a.getNavigationIcon();
            } else {
                i = 11;
            }
            this.f1537b = i;
        }
        m.mo2099n();
        if (i2 != this.f1550o) {
            this.f1550o = i2;
            if (TextUtils.isEmpty(this.f1536a.getNavigationContentDescription())) {
                mo2119m(this.f1550o);
            }
        }
        this.f1546k = this.f1536a.getNavigationContentDescription();
        this.f1536a.setNavigationOnClickListener(new C0421j1(this));
    }

    /* renamed from: a */
    public final boolean mo2104a() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.f1536a;
        if (toolbar.getVisibility() != 0 || (actionMenuView = toolbar.f1391b) == null || !actionMenuView.f1101t) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo2105b(C0291f fVar, AppCompatDelegateImpl.C0225d dVar) {
        if (this.f1549n == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f1536a.getContext());
            this.f1549n = actionMenuPresenter;
            actionMenuPresenter.f868j = C5220f.action_menu_presenter;
        }
        ActionMenuPresenter actionMenuPresenter2 = this.f1549n;
        actionMenuPresenter2.f864f = dVar;
        Toolbar toolbar = this.f1536a;
        if (fVar != null || toolbar.f1391b != null) {
            toolbar.mo1916e();
            C0291f fVar2 = toolbar.f1391b.f1098q;
            if (fVar2 != fVar) {
                if (fVar2 != null) {
                    fVar2.mo1126r(toolbar.f1385M);
                    fVar2.mo1126r(toolbar.f1386N);
                }
                if (toolbar.f1386N == null) {
                    toolbar.f1386N = new Toolbar.C0377d();
                }
                actionMenuPresenter2.f1079s = true;
                if (fVar != null) {
                    fVar.mo1101b(actionMenuPresenter2, toolbar.f1400k);
                    fVar.mo1101b(toolbar.f1386N, toolbar.f1400k);
                } else {
                    actionMenuPresenter2.mo1075k(toolbar.f1400k, (C0291f) null);
                    toolbar.f1386N.mo1075k(toolbar.f1400k, (C0291f) null);
                    actionMenuPresenter2.mo1054i(true);
                    toolbar.f1386N.mo1054i(true);
                }
                toolbar.f1391b.setPopupTheme(toolbar.f1401l);
                toolbar.f1391b.setPresenter(actionMenuPresenter2);
                toolbar.f1385M = actionMenuPresenter2;
            }
        }
    }

    /* renamed from: c */
    public final boolean mo2106c() {
        boolean z;
        ActionMenuView actionMenuView = this.f1536a.f1391b;
        if (actionMenuView == null) {
            return false;
        }
        ActionMenuPresenter actionMenuPresenter = actionMenuView.f1102u;
        if (actionMenuPresenter == null || !actionMenuPresenter.mo1322l()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    public final void collapseActionView() {
        C0295h hVar;
        Toolbar.C0377d dVar = this.f1536a.f1386N;
        if (dVar == null) {
            hVar = null;
        } else {
            hVar = dVar.f1423c;
        }
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    /* renamed from: d */
    public final boolean mo2108d() {
        boolean z;
        ActionMenuView actionMenuView = this.f1536a.f1391b;
        if (actionMenuView == null) {
            return false;
        }
        ActionMenuPresenter actionMenuPresenter = actionMenuView.f1102u;
        if (actionMenuPresenter == null || !actionMenuPresenter.mo1325o()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo2109e() {
        boolean z;
        ActionMenuView actionMenuView = this.f1536a.f1391b;
        if (actionMenuView == null) {
            return false;
        }
        ActionMenuPresenter actionMenuPresenter = actionMenuView.f1102u;
        if (actionMenuPresenter == null || !actionMenuPresenter.mo1323m()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void mo2110f() {
        this.f1548m = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0021 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2111g() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f1536a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f1391b
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0022
            androidx.appcompat.widget.ActionMenuPresenter r0 = r0.f1102u
            if (r0 == 0) goto L_0x001e
            androidx.appcompat.widget.ActionMenuPresenter$c r3 = r0.f1083w
            if (r3 != 0) goto L_0x0019
            boolean r0 = r0.mo1323m()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = 0
            goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            if (r0 == 0) goto L_0x001e
            r0 = 1
            goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            if (r0 == 0) goto L_0x0022
            r1 = 1
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0424k1.mo2111g():boolean");
    }

    public final Context getContext() {
        return this.f1536a.getContext();
    }

    public final CharSequence getTitle() {
        return this.f1536a.getTitle();
    }

    /* renamed from: h */
    public final boolean mo2114h() {
        Toolbar.C0377d dVar = this.f1536a.f1386N;
        if (dVar == null || dVar.f1423c == null) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final void mo2115i(int i) {
        View view;
        int i2 = this.f1537b ^ i;
        this.f1537b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    mo2141x();
                }
                if ((this.f1537b & 4) != 0) {
                    Toolbar toolbar = this.f1536a;
                    Drawable drawable = this.f1542g;
                    if (drawable == null) {
                        drawable = this.f1551p;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    this.f1536a.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                mo2142y();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f1536a.setTitle(this.f1544i);
                    this.f1536a.setSubtitle(this.f1545j);
                } else {
                    this.f1536a.setTitle((CharSequence) null);
                    this.f1536a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.f1539d) != null) {
                if ((i & 16) != 0) {
                    this.f1536a.addView(view);
                } else {
                    this.f1536a.removeView(view);
                }
            }
        }
    }

    /* renamed from: j */
    public final void mo2116j(CharSequence charSequence) {
        this.f1545j = charSequence;
        if ((this.f1537b & 8) != 0) {
            this.f1536a.setSubtitle(charSequence);
        }
    }

    /* renamed from: k */
    public final void mo2117k() {
    }

    /* renamed from: l */
    public final C6382p0 mo2118l(int i, long j) {
        float f;
        C6382p0 a = C6333d0.m15013a(this.f1536a);
        if (i == 0) {
            f = 1.0f;
        } else {
            f = BitmapDescriptorFactory.HUE_RED;
        }
        a.mo22491a(f);
        a.mo22495e(j);
        a.mo22497g(new C0425a(i));
        return a;
    }

    /* renamed from: m */
    public final void mo2119m(int i) {
        String str;
        if (i == 0) {
            str = null;
        } else {
            str = getContext().getString(i);
        }
        this.f1546k = str;
        mo2141x();
    }

    /* renamed from: n */
    public final void mo2120n() {
    }

    /* renamed from: o */
    public final void mo2121o(boolean z) {
        this.f1536a.setCollapsible(z);
    }

    /* renamed from: p */
    public final void mo2122p() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.f1536a.f1391b;
        if (actionMenuView != null && (actionMenuPresenter = actionMenuView.f1102u) != null) {
            actionMenuPresenter.mo1322l();
            ActionMenuPresenter.C0314a aVar = actionMenuPresenter.f1082v;
            if (aVar != null && aVar.mo1208b()) {
                aVar.f988j.dismiss();
            }
        }
    }

    /* renamed from: q */
    public final void mo2123q() {
    }

    /* renamed from: r */
    public final void mo2124r() {
        Toolbar toolbar;
        C0383a1 a1Var = this.f1538c;
        if (a1Var != null && a1Var.getParent() == (toolbar = this.f1536a)) {
            toolbar.removeView(this.f1538c);
        }
        this.f1538c = null;
    }

    /* renamed from: s */
    public final void mo2125s(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = C5344a.m13397a(getContext(), i);
        } else {
            drawable = null;
        }
        this.f1541f = drawable;
        mo2142y();
    }

    public final void setIcon(int i) {
        setIcon(i != 0 ? C5344a.m13397a(getContext(), i) : null);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f1543h = true;
        this.f1544i = charSequence;
        if ((this.f1537b & 8) != 0) {
            this.f1536a.setTitle(charSequence);
            if (this.f1543h) {
                C6333d0.m15031s(this.f1536a.getRootView(), charSequence);
            }
        }
    }

    public final void setVisibility(int i) {
        this.f1536a.setVisibility(i);
    }

    public final void setWindowCallback(Window.Callback callback) {
        this.f1547l = callback;
    }

    public final void setWindowTitle(CharSequence charSequence) {
        if (!this.f1543h) {
            this.f1544i = charSequence;
            if ((this.f1537b & 8) != 0) {
                this.f1536a.setTitle(charSequence);
                if (this.f1543h) {
                    C6333d0.m15031s(this.f1536a.getRootView(), charSequence);
                }
            }
        }
    }

    /* renamed from: t */
    public final void mo2132t(int i) {
        mo2135w(i != 0 ? C5344a.m13397a(getContext(), i) : null);
    }

    /* renamed from: u */
    public final int mo2133u() {
        return this.f1537b;
    }

    /* renamed from: v */
    public final void mo2134v() {
    }

    /* renamed from: w */
    public final void mo2135w(Drawable drawable) {
        this.f1542g = drawable;
        if ((this.f1537b & 4) != 0) {
            Toolbar toolbar = this.f1536a;
            if (drawable == null) {
                drawable = this.f1551p;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f1536a.setNavigationIcon((Drawable) null);
    }

    /* renamed from: x */
    public final void mo2141x() {
        if ((this.f1537b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1546k)) {
            this.f1536a.setNavigationContentDescription(this.f1550o);
        } else {
            this.f1536a.setNavigationContentDescription(this.f1546k);
        }
    }

    /* renamed from: y */
    public final void mo2142y() {
        Drawable drawable;
        int i = this.f1537b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f1541f;
            if (drawable == null) {
                drawable = this.f1540e;
            }
        } else {
            drawable = this.f1540e;
        }
        this.f1536a.setLogo(drawable);
    }

    public final void setIcon(Drawable drawable) {
        this.f1540e = drawable;
        mo2142y();
    }
}
