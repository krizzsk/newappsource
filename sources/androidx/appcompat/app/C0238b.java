package androidx.appcompat.app;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.tranzmate.R;
import p139k.C5442d;

/* renamed from: androidx.appcompat.app.b */
public final class C0238b implements DrawerLayout.C0820e {

    /* renamed from: a */
    public final C0239a f712a;

    /* renamed from: b */
    public final DrawerLayout f713b;

    /* renamed from: c */
    public C5442d f714c;

    /* renamed from: d */
    public final int f715d;

    /* renamed from: e */
    public final int f716e;

    /* renamed from: f */
    public boolean f717f = false;

    /* renamed from: androidx.appcompat.app.b$a */
    public interface C0239a {
        /* renamed from: a */
        Context mo898a();

        /* renamed from: b */
        boolean mo899b();

        /* renamed from: c */
        void mo900c(C5442d dVar, int i);

        /* renamed from: d */
        Drawable mo901d();

        /* renamed from: e */
        void mo902e(int i);
    }

    /* renamed from: androidx.appcompat.app.b$b */
    public interface C0240b {
        C0239a getDrawerToggleDelegate();
    }

    /* renamed from: androidx.appcompat.app.b$c */
    public static class C0241c implements C0239a {

        /* renamed from: a */
        public final Activity f718a;

        /* renamed from: androidx.appcompat.app.b$c$a */
        public static class C0242a {
            /* renamed from: a */
            public static void m480a(ActionBar actionBar, int i) {
                actionBar.setHomeActionContentDescription(i);
            }

            /* renamed from: b */
            public static void m481b(ActionBar actionBar, Drawable drawable) {
                actionBar.setHomeAsUpIndicator(drawable);
            }
        }

        public C0241c(Activity activity) {
            this.f718a = activity;
        }

        /* renamed from: a */
        public final Context mo898a() {
            ActionBar actionBar = this.f718a.getActionBar();
            if (actionBar != null) {
                return actionBar.getThemedContext();
            }
            return this.f718a;
        }

        /* renamed from: b */
        public final boolean mo899b() {
            ActionBar actionBar = this.f718a.getActionBar();
            if (actionBar == null || (actionBar.getDisplayOptions() & 4) == 0) {
                return false;
            }
            return true;
        }

        /* renamed from: c */
        public final void mo900c(C5442d dVar, int i) {
            ActionBar actionBar = this.f718a.getActionBar();
            if (actionBar != null) {
                C0242a.m481b(actionBar, dVar);
                C0242a.m480a(actionBar, i);
            }
        }

        /* renamed from: d */
        public final Drawable mo901d() {
            TypedArray obtainStyledAttributes = mo898a().obtainStyledAttributes((AttributeSet) null, new int[]{16843531}, 16843470, 0);
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
            return drawable;
        }

        /* renamed from: e */
        public final void mo902e(int i) {
            ActionBar actionBar = this.f718a.getActionBar();
            if (actionBar != null) {
                C0242a.m480a(actionBar, i);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.b$d */
    public static class C0243d implements C0239a {

        /* renamed from: a */
        public final Toolbar f719a;

        /* renamed from: b */
        public final Drawable f720b;

        /* renamed from: c */
        public final CharSequence f721c;

        public C0243d(Toolbar toolbar) {
            this.f719a = toolbar;
            this.f720b = toolbar.getNavigationIcon();
            this.f721c = toolbar.getNavigationContentDescription();
        }

        /* renamed from: a */
        public final Context mo898a() {
            return this.f719a.getContext();
        }

        /* renamed from: b */
        public final boolean mo899b() {
            return true;
        }

        /* renamed from: c */
        public final void mo900c(C5442d dVar, int i) {
            this.f719a.setNavigationIcon((Drawable) dVar);
            mo902e(i);
        }

        /* renamed from: d */
        public final Drawable mo901d() {
            return this.f720b;
        }

        /* renamed from: e */
        public final void mo902e(int i) {
            if (i == 0) {
                this.f719a.setNavigationContentDescription(this.f721c);
            } else {
                this.f719a.setNavigationContentDescription(i);
            }
        }
    }

    public C0238b(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar) {
        if (toolbar != null) {
            this.f712a = new C0243d(toolbar);
            toolbar.setNavigationOnClickListener(new C0237a(this));
        } else if (activity instanceof C0240b) {
            this.f712a = ((C0240b) activity).getDrawerToggleDelegate();
        } else {
            this.f712a = new C0241c(activity);
        }
        this.f713b = drawerLayout;
        this.f715d = R.string.more_activity_title;
        this.f716e = 0;
        this.f714c = new C5442d(this.f712a.mo898a());
        this.f712a.mo901d();
    }

    /* renamed from: a */
    public final void mo933a() {
    }

    /* renamed from: b */
    public final void mo934b(float f) {
        mo937e(Math.min(1.0f, Math.max(BitmapDescriptorFactory.HUE_RED, f)));
    }

    /* renamed from: c */
    public final void mo935c() {
        mo937e(BitmapDescriptorFactory.HUE_RED);
        this.f712a.mo902e(this.f715d);
    }

    /* renamed from: d */
    public final void mo936d() {
        mo937e(1.0f);
        this.f712a.mo902e(this.f716e);
    }

    /* renamed from: e */
    public final void mo937e(float f) {
        if (f == 1.0f) {
            C5442d dVar = this.f714c;
            if (!dVar.f17957i) {
                dVar.f17957i = true;
                dVar.invalidateSelf();
            }
        } else if (f == BitmapDescriptorFactory.HUE_RED) {
            C5442d dVar2 = this.f714c;
            if (dVar2.f17957i) {
                dVar2.f17957i = false;
                dVar2.invalidateSelf();
            }
        }
        C5442d dVar3 = this.f714c;
        if (dVar3.f17958j != f) {
            dVar3.f17958j = f;
            dVar3.invalidateSelf();
        }
    }

    /* renamed from: f */
    public final void mo938f() {
        int i;
        if (this.f713b.mo3557o()) {
            mo937e(1.0f);
        } else {
            mo937e(BitmapDescriptorFactory.HUE_RED);
        }
        C5442d dVar = this.f714c;
        if (this.f713b.mo3557o()) {
            i = this.f716e;
        } else {
            i = this.f715d;
        }
        if (!this.f717f && !this.f712a.mo899b()) {
            this.f717f = true;
        }
        this.f712a.mo900c(dVar, i);
    }

    /* renamed from: g */
    public final void mo939g() {
        boolean z;
        int i = this.f713b.mo3554i(8388611);
        View f = this.f713b.mo3546f(8388611);
        if (f != null) {
            z = DrawerLayout.m2481r(f);
        } else {
            z = false;
        }
        if (z && i != 2) {
            this.f713b.mo3542d(true);
        } else if (i != 1) {
            DrawerLayout drawerLayout = this.f713b;
            View f2 = drawerLayout.mo3546f(8388611);
            if (f2 != null) {
                drawerLayout.mo3580t(f2);
                return;
            }
            StringBuilder k = C13555b.m33972k("No drawer view found with gravity ");
            k.append(DrawerLayout.m2476l(8388611));
            throw new IllegalArgumentException(k.toString());
        }
    }
}
