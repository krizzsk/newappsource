package androidx.appcompat.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.menu.C0291f;
import androidx.appcompat.view.menu.C0300j;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.C0424k1;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;

/* renamed from: androidx.appcompat.app.t */
public final class C0265t extends ActionBar {

    /* renamed from: a */
    public final C0424k1 f770a;

    /* renamed from: b */
    public final Window.Callback f771b;

    /* renamed from: c */
    public final C0270e f772c;

    /* renamed from: d */
    public boolean f773d;

    /* renamed from: e */
    public boolean f774e;

    /* renamed from: f */
    public boolean f775f;

    /* renamed from: g */
    public ArrayList<ActionBar.C0214a> f776g = new ArrayList<>();

    /* renamed from: h */
    public final C0266a f777h = new C0266a();

    /* renamed from: androidx.appcompat.app.t$a */
    public class C0266a implements Runnable {
        public C0266a() {
        }

        public final void run() {
            C0291f fVar;
            C0265t tVar = C0265t.this;
            Menu z = tVar.mo985z();
            if (z instanceof C0291f) {
                fVar = (C0291f) z;
            } else {
                fVar = null;
            }
            if (fVar != null) {
                fVar.mo1142z();
            }
            try {
                z.clear();
                if (!tVar.f771b.onCreatePanelMenu(0, z) || !tVar.f771b.onPreparePanel(0, (View) null, z)) {
                    z.clear();
                }
            } finally {
                if (fVar != null) {
                    fVar.mo1141y();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.app.t$b */
    public class C0267b implements Toolbar.C0378e {
        public C0267b() {
        }
    }

    /* renamed from: androidx.appcompat.app.t$c */
    public final class C0268c implements C0300j.C0301a {

        /* renamed from: b */
        public boolean f780b;

        public C0268c() {
        }

        /* renamed from: b */
        public final void mo903b(C0291f fVar, boolean z) {
            if (!this.f780b) {
                this.f780b = true;
                C0265t.this.f770a.mo2122p();
                C0265t.this.f771b.onPanelClosed(108, fVar);
                this.f780b = false;
            }
        }

        /* renamed from: c */
        public final boolean mo904c(C0291f fVar) {
            C0265t.this.f771b.onMenuOpened(108, fVar);
            return true;
        }
    }

    /* renamed from: androidx.appcompat.app.t$d */
    public final class C0269d implements C0291f.C0292a {
        public C0269d() {
        }

        /* renamed from: a */
        public final boolean mo865a(C0291f fVar, MenuItem menuItem) {
            return false;
        }

        /* renamed from: b */
        public final void mo866b(C0291f fVar) {
            if (C0265t.this.f770a.mo2109e()) {
                C0265t.this.f771b.onPanelClosed(108, fVar);
            } else if (C0265t.this.f771b.onPreparePanel(0, (View) null, fVar)) {
                C0265t.this.f771b.onMenuOpened(108, fVar);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.t$e */
    public class C0270e implements AppCompatDelegateImpl.C0224c {
        public C0270e() {
        }
    }

    public C0265t(Toolbar toolbar, CharSequence charSequence, AppCompatDelegateImpl.C0230h hVar) {
        C0267b bVar = new C0267b();
        toolbar.getClass();
        C0424k1 k1Var = new C0424k1(toolbar, false);
        this.f770a = k1Var;
        hVar.getClass();
        this.f771b = hVar;
        k1Var.f1547l = hVar;
        toolbar.setOnMenuItemClickListener(bVar);
        k1Var.setWindowTitle(charSequence);
        this.f772c = new C0270e();
    }

    /* renamed from: A */
    public final void mo984A(int i, int i2) {
        C0424k1 k1Var = this.f770a;
        k1Var.mo2115i((i & i2) | ((~i2) & k1Var.f1537b));
    }

    /* renamed from: a */
    public final boolean mo779a() {
        return this.f770a.mo2106c();
    }

    /* renamed from: b */
    public final boolean mo780b() {
        if (!this.f770a.mo2114h()) {
            return false;
        }
        this.f770a.collapseActionView();
        return true;
    }

    /* renamed from: c */
    public final void mo781c(boolean z) {
        if (z != this.f775f) {
            this.f775f = z;
            int size = this.f776g.size();
            for (int i = 0; i < size; i++) {
                this.f776g.get(i).mo804a();
            }
        }
    }

    /* renamed from: d */
    public final int mo782d() {
        return this.f770a.f1537b;
    }

    /* renamed from: e */
    public final Context mo783e() {
        return this.f770a.getContext();
    }

    /* renamed from: f */
    public final boolean mo784f() {
        this.f770a.f1536a.removeCallbacks(this.f777h);
        Toolbar toolbar = this.f770a.f1536a;
        C0266a aVar = this.f777h;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        C6333d0.C6337d.m15053m(toolbar, aVar);
        return true;
    }

    /* renamed from: g */
    public final void mo785g() {
    }

    /* renamed from: h */
    public final void mo786h() {
        this.f770a.f1536a.removeCallbacks(this.f777h);
    }

    /* renamed from: i */
    public final boolean mo787i(int i, KeyEvent keyEvent) {
        int i2;
        Menu z = mo985z();
        if (z == null) {
            return false;
        }
        if (keyEvent != null) {
            i2 = keyEvent.getDeviceId();
        } else {
            i2 = -1;
        }
        boolean z2 = true;
        if (KeyCharacterMap.load(i2).getKeyboardType() == 1) {
            z2 = false;
        }
        z.setQwertyMode(z2);
        return z.performShortcut(i, keyEvent, 0);
    }

    /* renamed from: j */
    public final boolean mo788j(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            mo789k();
        }
        return true;
    }

    /* renamed from: k */
    public final boolean mo789k() {
        return this.f770a.mo2108d();
    }

    /* renamed from: l */
    public final void mo790l(boolean z) {
    }

    /* renamed from: m */
    public final void mo791m(boolean z) {
        mo984A(z ? 4 : 0, 4);
    }

    /* renamed from: n */
    public final void mo792n() {
        mo984A(2, 2);
    }

    /* renamed from: o */
    public final void mo793o(boolean z) {
        mo984A(z ? 8 : 0, 8);
    }

    /* renamed from: p */
    public final void mo794p(int i) {
        this.f770a.mo2119m(i);
    }

    /* renamed from: q */
    public final void mo795q(int i) {
        this.f770a.mo2132t(i);
    }

    /* renamed from: r */
    public final void mo796r(Drawable drawable) {
        this.f770a.mo2135w(drawable);
    }

    /* renamed from: s */
    public final void mo797s(boolean z) {
    }

    /* renamed from: t */
    public final void mo798t(boolean z) {
    }

    /* renamed from: u */
    public final void mo799u(CharSequence charSequence) {
        this.f770a.mo2116j(charSequence);
    }

    /* renamed from: v */
    public final void mo800v(int i) {
        C0424k1 k1Var = this.f770a;
        k1Var.setTitle(i != 0 ? k1Var.getContext().getText(i) : null);
    }

    /* renamed from: w */
    public final void mo801w(CharSequence charSequence) {
        this.f770a.setTitle(charSequence);
    }

    /* renamed from: x */
    public final void mo802x(CharSequence charSequence) {
        this.f770a.setWindowTitle(charSequence);
    }

    /* renamed from: z */
    public final Menu mo985z() {
        if (!this.f774e) {
            C0424k1 k1Var = this.f770a;
            C0268c cVar = new C0268c();
            C0269d dVar = new C0269d();
            Toolbar toolbar = k1Var.f1536a;
            toolbar.f1387O = cVar;
            toolbar.f1388P = dVar;
            ActionMenuView actionMenuView = toolbar.f1391b;
            if (actionMenuView != null) {
                actionMenuView.f1103v = cVar;
                actionMenuView.f1104w = dVar;
            }
            this.f774e = true;
        }
        return this.f770a.f1536a.getMenu();
    }
}
