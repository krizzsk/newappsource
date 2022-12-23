package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.menu.C0291f;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.C0383a1;
import androidx.appcompat.widget.C0415i0;
import androidx.appcompat.widget.Toolbar;
import ce0.C21100e;
import com.appboy.support.StringUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p114i.C5215a;
import p114i.C5216b;
import p114i.C5220f;
import p114i.C5224j;
import p175n.C5765a;
import p175n.C5773f;
import p175n.C5776g;
import p242s1.C6333d0;
import p242s1.C6378n0;
import p242s1.C6382p0;
import p242s1.C6388r0;
import p358af.C13437d;

/* renamed from: androidx.appcompat.app.w */
public final class C0274w extends ActionBar implements ActionBarOverlayLayout.C0312d {

    /* renamed from: A */
    public static final DecelerateInterpolator f794A = new DecelerateInterpolator();

    /* renamed from: z */
    public static final AccelerateInterpolator f795z = new AccelerateInterpolator();

    /* renamed from: a */
    public Context f796a;

    /* renamed from: b */
    public Context f797b;

    /* renamed from: c */
    public ActionBarOverlayLayout f798c;

    /* renamed from: d */
    public ActionBarContainer f799d;

    /* renamed from: e */
    public C0415i0 f800e;

    /* renamed from: f */
    public ActionBarContextView f801f;

    /* renamed from: g */
    public View f802g;

    /* renamed from: h */
    public boolean f803h;

    /* renamed from: i */
    public C0278d f804i;

    /* renamed from: j */
    public C0278d f805j;

    /* renamed from: k */
    public C5765a.C5766a f806k;

    /* renamed from: l */
    public boolean f807l;

    /* renamed from: m */
    public ArrayList<ActionBar.C0214a> f808m = new ArrayList<>();

    /* renamed from: n */
    public boolean f809n;

    /* renamed from: o */
    public int f810o = 0;

    /* renamed from: p */
    public boolean f811p = true;

    /* renamed from: q */
    public boolean f812q;

    /* renamed from: r */
    public boolean f813r;

    /* renamed from: s */
    public boolean f814s = true;

    /* renamed from: t */
    public C5776g f815t;

    /* renamed from: u */
    public boolean f816u;

    /* renamed from: v */
    public boolean f817v;

    /* renamed from: w */
    public final C0275a f818w = new C0275a();

    /* renamed from: x */
    public final C0276b f819x = new C0276b();

    /* renamed from: y */
    public final C0277c f820y = new C0277c();

    /* renamed from: androidx.appcompat.app.w$a */
    public class C0275a extends C21100e {
        public C0275a() {
        }

        /* renamed from: b */
        public final void mo909b(View view) {
            View view2;
            C0274w wVar = C0274w.this;
            if (wVar.f811p && (view2 = wVar.f802g) != null) {
                view2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                C0274w.this.f799d.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            }
            C0274w.this.f799d.setVisibility(8);
            C0274w.this.f799d.setTransitioning(false);
            C0274w wVar2 = C0274w.this;
            wVar2.f815t = null;
            C5765a.C5766a aVar = wVar2.f806k;
            if (aVar != null) {
                aVar.mo908d(wVar2.f805j);
                wVar2.f805j = null;
                wVar2.f806k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = C0274w.this.f798c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6341h.m15083c(actionBarOverlayLayout);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.w$b */
    public class C0276b extends C21100e {
        public C0276b() {
        }

        /* renamed from: b */
        public final void mo909b(View view) {
            C0274w wVar = C0274w.this;
            wVar.f815t = null;
            wVar.f799d.requestLayout();
        }
    }

    /* renamed from: androidx.appcompat.app.w$c */
    public class C0277c implements C6388r0 {
        public C0277c() {
        }
    }

    /* renamed from: androidx.appcompat.app.w$d */
    public class C0278d extends C5765a implements C0291f.C0292a {

        /* renamed from: d */
        public final Context f824d;

        /* renamed from: e */
        public final C0291f f825e;

        /* renamed from: f */
        public C5765a.C5766a f826f;

        /* renamed from: g */
        public WeakReference<View> f827g;

        public C0278d(Context context, AppCompatDelegateImpl.C0226e eVar) {
            this.f824d = context;
            this.f826f = eVar;
            C0291f fVar = new C0291f(context);
            fVar.f933l = 1;
            this.f825e = fVar;
            fVar.f926e = this;
        }

        /* renamed from: a */
        public final boolean mo865a(C0291f fVar, MenuItem menuItem) {
            C5765a.C5766a aVar = this.f826f;
            if (aVar != null) {
                return aVar.mo905a(this, menuItem);
            }
            return false;
        }

        /* renamed from: b */
        public final void mo866b(C0291f fVar) {
            if (this.f826f != null) {
                mo999i();
                ActionMenuPresenter actionMenuPresenter = C0274w.this.f801f.f1432e;
                if (actionMenuPresenter != null) {
                    actionMenuPresenter.mo1325o();
                }
            }
        }

        /* renamed from: c */
        public final void mo993c() {
            C0274w wVar = C0274w.this;
            if (wVar.f804i == this) {
                if (!(!wVar.f812q)) {
                    wVar.f805j = this;
                    wVar.f806k = this.f826f;
                } else {
                    this.f826f.mo908d(this);
                }
                this.f826f = null;
                C0274w.this.mo992z(false);
                ActionBarContextView actionBarContextView = C0274w.this.f801f;
                if (actionBarContextView.f1029l == null) {
                    actionBarContextView.mo1251h();
                }
                C0274w wVar2 = C0274w.this;
                wVar2.f798c.setHideOnContentScrollEnabled(wVar2.f817v);
                C0274w.this.f804i = null;
            }
        }

        /* renamed from: d */
        public final View mo994d() {
            WeakReference<View> weakReference = this.f827g;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        /* renamed from: e */
        public final C0291f mo995e() {
            return this.f825e;
        }

        /* renamed from: f */
        public final MenuInflater mo996f() {
            return new C5773f(this.f824d);
        }

        /* renamed from: g */
        public final CharSequence mo997g() {
            return C0274w.this.f801f.getSubtitle();
        }

        /* renamed from: h */
        public final CharSequence mo998h() {
            return C0274w.this.f801f.getTitle();
        }

        /* renamed from: i */
        public final void mo999i() {
            if (C0274w.this.f804i == this) {
                this.f825e.mo1142z();
                try {
                    this.f826f.mo906b(this, this.f825e);
                } finally {
                    this.f825e.mo1141y();
                }
            }
        }

        /* renamed from: j */
        public final boolean mo1000j() {
            return C0274w.this.f801f.f1037t;
        }

        /* renamed from: k */
        public final void mo1001k(View view) {
            C0274w.this.f801f.setCustomView(view);
            this.f827g = new WeakReference<>(view);
        }

        /* renamed from: l */
        public final void mo1002l(int i) {
            mo1003m(C0274w.this.f796a.getResources().getString(i));
        }

        /* renamed from: m */
        public final void mo1003m(CharSequence charSequence) {
            C0274w.this.f801f.setSubtitle(charSequence);
        }

        /* renamed from: n */
        public final void mo1004n(int i) {
            mo1005o(C0274w.this.f796a.getResources().getString(i));
        }

        /* renamed from: o */
        public final void mo1005o(CharSequence charSequence) {
            C0274w.this.f801f.setTitle(charSequence);
        }

        /* renamed from: p */
        public final void mo1006p(boolean z) {
            this.f18655c = z;
            C0274w.this.f801f.setTitleOptional(z);
        }
    }

    public C0274w(Activity activity, boolean z) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        mo988A(decorView);
        if (!z) {
            this.f802g = decorView.findViewById(16908290);
        }
    }

    /* renamed from: A */
    public final void mo988A(View view) {
        C0415i0 i0Var;
        boolean z;
        boolean z2;
        boolean z3;
        String str;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(C5220f.decor_content_parent);
        this.f798c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(C5220f.action_bar);
        if (findViewById instanceof C0415i0) {
            i0Var = (C0415i0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            i0Var = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder k = C13555b.m33972k("Can't make a decor toolbar out of ");
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
            }
            k.append(str);
            throw new IllegalStateException(k.toString());
        }
        this.f800e = i0Var;
        this.f801f = (ActionBarContextView) view.findViewById(C5220f.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(C5220f.action_bar_container);
        this.f799d = actionBarContainer;
        C0415i0 i0Var2 = this.f800e;
        if (i0Var2 == null || this.f801f == null || actionBarContainer == null) {
            throw new IllegalStateException(C13437d.m33705j(C0274w.class, new StringBuilder(), " can only be used with a compatible window decor layout"));
        }
        this.f796a = i0Var2.getContext();
        if ((this.f800e.mo2133u() & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f803h = true;
        }
        Context context = this.f796a;
        if (context.getApplicationInfo().targetSdkVersion < 14) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 || z) {
            z3 = true;
        } else {
            z3 = false;
        }
        mo797s(z3);
        mo990C(context.getResources().getBoolean(C5216b.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f796a.obtainStyledAttributes((AttributeSet) null, C5224j.ActionBar, C5215a.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(C5224j.ActionBar_hideOnContentScroll, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f798c;
            if (actionBarOverlayLayout2.f1050i) {
                this.f817v = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(C5224j.ActionBar_elevation, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f799d;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6342i.m15102s(actionBarContainer2, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: B */
    public final void mo989B(int i, int i2) {
        int u = this.f800e.mo2133u();
        if ((i2 & 4) != 0) {
            this.f803h = true;
        }
        this.f800e.mo2115i((i & i2) | ((~i2) & u));
    }

    /* renamed from: C */
    public final void mo990C(boolean z) {
        this.f809n = z;
        if (!z) {
            this.f800e.mo2124r();
            this.f799d.setTabContainer((C0383a1) null);
        } else {
            this.f799d.setTabContainer((C0383a1) null);
            this.f800e.mo2124r();
        }
        this.f800e.mo2117k();
        C0415i0 i0Var = this.f800e;
        boolean z2 = this.f809n;
        i0Var.mo2121o(false);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f798c;
        boolean z3 = this.f809n;
        actionBarOverlayLayout.setHasNonEmbeddedTabs(false);
    }

    /* renamed from: D */
    public final void mo991D(boolean z) {
        boolean z2;
        View view;
        View view2;
        View view3;
        boolean z3 = this.f812q;
        if (!this.f813r && z3) {
            z2 = false;
        } else {
            z2 = true;
        }
        C6378n0 n0Var = null;
        if (z2) {
            if (!this.f814s) {
                this.f814s = true;
                C5776g gVar = this.f815t;
                if (gVar != null) {
                    gVar.mo21645a();
                }
                this.f799d.setVisibility(0);
                if (this.f810o != 0 || (!this.f816u && !z)) {
                    this.f799d.setAlpha(1.0f);
                    this.f799d.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    if (this.f811p && (view2 = this.f802g) != null) {
                        view2.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    }
                    this.f819x.mo909b((View) null);
                } else {
                    this.f799d.setTranslationY(BitmapDescriptorFactory.HUE_RED);
                    float f = (float) (-this.f799d.getHeight());
                    if (z) {
                        int[] iArr = {0, 0};
                        this.f799d.getLocationInWindow(iArr);
                        f -= (float) iArr[1];
                    }
                    this.f799d.setTranslationY(f);
                    C5776g gVar2 = new C5776g();
                    C6382p0 a = C6333d0.m15013a(this.f799d);
                    a.mo22499i(BitmapDescriptorFactory.HUE_RED);
                    C0277c cVar = this.f820y;
                    View view4 = a.f20040a.get();
                    if (view4 != null) {
                        if (cVar != null) {
                            n0Var = new C6378n0(cVar, view4);
                        }
                        C6382p0.C6384b.m15231a(view4.animate(), n0Var);
                    }
                    if (!gVar2.f18718e) {
                        gVar2.f18714a.add(a);
                    }
                    if (this.f811p && (view3 = this.f802g) != null) {
                        view3.setTranslationY(f);
                        C6382p0 a2 = C6333d0.m15013a(this.f802g);
                        a2.mo22499i(BitmapDescriptorFactory.HUE_RED);
                        if (!gVar2.f18718e) {
                            gVar2.f18714a.add(a2);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = f794A;
                    boolean z4 = gVar2.f18718e;
                    if (!z4) {
                        gVar2.f18716c = decelerateInterpolator;
                    }
                    if (!z4) {
                        gVar2.f18715b = 250;
                    }
                    C0276b bVar = this.f819x;
                    if (!z4) {
                        gVar2.f18717d = bVar;
                    }
                    this.f815t = gVar2;
                    gVar2.mo21646b();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f798c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                    C6333d0.C6341h.m15083c(actionBarOverlayLayout);
                }
            }
        } else if (this.f814s) {
            this.f814s = false;
            C5776g gVar3 = this.f815t;
            if (gVar3 != null) {
                gVar3.mo21645a();
            }
            if (this.f810o != 0 || (!this.f816u && !z)) {
                this.f818w.mo909b((View) null);
                return;
            }
            this.f799d.setAlpha(1.0f);
            this.f799d.setTransitioning(true);
            C5776g gVar4 = new C5776g();
            float f2 = (float) (-this.f799d.getHeight());
            if (z) {
                int[] iArr2 = {0, 0};
                this.f799d.getLocationInWindow(iArr2);
                f2 -= (float) iArr2[1];
            }
            C6382p0 a3 = C6333d0.m15013a(this.f799d);
            a3.mo22499i(f2);
            C0277c cVar2 = this.f820y;
            View view5 = a3.f20040a.get();
            if (view5 != null) {
                if (cVar2 != null) {
                    n0Var = new C6378n0(cVar2, view5);
                }
                C6382p0.C6384b.m15231a(view5.animate(), n0Var);
            }
            if (!gVar4.f18718e) {
                gVar4.f18714a.add(a3);
            }
            if (this.f811p && (view = this.f802g) != null) {
                C6382p0 a4 = C6333d0.m15013a(view);
                a4.mo22499i(f2);
                if (!gVar4.f18718e) {
                    gVar4.f18714a.add(a4);
                }
            }
            AccelerateInterpolator accelerateInterpolator = f795z;
            boolean z5 = gVar4.f18718e;
            if (!z5) {
                gVar4.f18716c = accelerateInterpolator;
            }
            if (!z5) {
                gVar4.f18715b = 250;
            }
            C0275a aVar = this.f818w;
            if (!z5) {
                gVar4.f18717d = aVar;
            }
            this.f815t = gVar4;
            gVar4.mo21646b();
        }
    }

    /* renamed from: b */
    public final boolean mo780b() {
        C0415i0 i0Var = this.f800e;
        if (i0Var == null || !i0Var.mo2114h()) {
            return false;
        }
        this.f800e.collapseActionView();
        return true;
    }

    /* renamed from: c */
    public final void mo781c(boolean z) {
        if (z != this.f807l) {
            this.f807l = z;
            int size = this.f808m.size();
            for (int i = 0; i < size; i++) {
                this.f808m.get(i).mo804a();
            }
        }
    }

    /* renamed from: d */
    public final int mo782d() {
        return this.f800e.mo2133u();
    }

    /* renamed from: e */
    public final Context mo783e() {
        if (this.f797b == null) {
            TypedValue typedValue = new TypedValue();
            this.f796a.getTheme().resolveAttribute(C5215a.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f797b = new ContextThemeWrapper(this.f796a, i);
            } else {
                this.f797b = this.f796a;
            }
        }
        return this.f797b;
    }

    /* renamed from: g */
    public final void mo785g() {
        mo990C(this.f796a.getResources().getBoolean(C5216b.abc_action_bar_embed_tabs));
    }

    /* renamed from: i */
    public final boolean mo787i(int i, KeyEvent keyEvent) {
        C0291f fVar;
        int i2;
        C0278d dVar = this.f804i;
        if (dVar == null || (fVar = dVar.f825e) == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        boolean z = true;
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1) {
            z = false;
        }
        fVar.setQwertyMode(z);
        return fVar.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: l */
    public final void mo790l(boolean z) {
        if (!this.f803h) {
            mo791m(z);
        }
    }

    /* renamed from: m */
    public final void mo791m(boolean z) {
        mo989B(z ? 4 : 0, 4);
    }

    /* renamed from: n */
    public final void mo792n() {
        mo989B(2, 2);
    }

    /* renamed from: o */
    public final void mo793o(boolean z) {
        mo989B(z ? 8 : 0, 8);
    }

    /* renamed from: p */
    public final void mo794p(int i) {
        this.f800e.mo2119m(i);
    }

    /* renamed from: q */
    public final void mo795q(int i) {
        this.f800e.mo2132t(i);
    }

    /* renamed from: r */
    public final void mo796r(Drawable drawable) {
        this.f800e.mo2135w(drawable);
    }

    /* renamed from: s */
    public final void mo797s(boolean z) {
        this.f800e.mo2123q();
    }

    /* renamed from: t */
    public final void mo798t(boolean z) {
        C5776g gVar;
        this.f816u = z;
        if (!z && (gVar = this.f815t) != null) {
            gVar.mo21645a();
        }
    }

    /* renamed from: u */
    public final void mo799u(CharSequence charSequence) {
        this.f800e.mo2116j(charSequence);
    }

    /* renamed from: v */
    public final void mo800v(int i) {
        mo801w(this.f796a.getString(i));
    }

    /* renamed from: w */
    public final void mo801w(CharSequence charSequence) {
        this.f800e.setTitle(charSequence);
    }

    /* renamed from: x */
    public final void mo802x(CharSequence charSequence) {
        this.f800e.setWindowTitle(charSequence);
    }

    /* renamed from: y */
    public final C5765a mo803y(AppCompatDelegateImpl.C0226e eVar) {
        C0278d dVar = this.f804i;
        if (dVar != null) {
            dVar.mo993c();
        }
        this.f798c.setHideOnContentScrollEnabled(false);
        this.f801f.mo1251h();
        C0278d dVar2 = new C0278d(this.f801f.getContext(), eVar);
        dVar2.f825e.mo1142z();
        try {
            if (!dVar2.f826f.mo907c(dVar2, dVar2.f825e)) {
                return null;
            }
            this.f804i = dVar2;
            dVar2.mo999i();
            this.f801f.mo1243f(dVar2);
            mo992z(true);
            return dVar2;
        } finally {
            dVar2.f825e.mo1141y();
        }
    }

    /* renamed from: z */
    public final void mo992z(boolean z) {
        C6382p0 p0Var;
        C6382p0 p0Var2;
        long j;
        if (z) {
            if (!this.f813r) {
                this.f813r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f798c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                mo991D(false);
            }
        } else if (this.f813r) {
            this.f813r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f798c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            mo991D(false);
        }
        ActionBarContainer actionBarContainer = this.f799d;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6340g.m15076c(actionBarContainer)) {
            if (z) {
                p0Var = this.f800e.mo2118l(4, 100);
                p0Var2 = this.f801f.mo2018e(0, 200);
            } else {
                p0Var2 = this.f800e.mo2118l(0, 200);
                p0Var = this.f801f.mo2018e(8, 100);
            }
            C5776g gVar = new C5776g();
            gVar.f18714a.add(p0Var);
            View view = p0Var.f20040a.get();
            if (view != null) {
                j = view.animate().getDuration();
            } else {
                j = 0;
            }
            View view2 = p0Var2.f20040a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j);
            }
            gVar.f18714a.add(p0Var2);
            gVar.mo21646b();
        } else if (z) {
            this.f800e.setVisibility(4);
            this.f801f.setVisibility(0);
        } else {
            this.f800e.setVisibility(0);
            this.f801f.setVisibility(8);
        }
    }

    public C0274w(Dialog dialog) {
        new ArrayList();
        mo988A(dialog.getWindow().getDecorView());
    }
}
