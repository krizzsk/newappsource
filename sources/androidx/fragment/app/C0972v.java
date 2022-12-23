package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.fragment.app.v */
public final class C0972v {

    /* renamed from: a */
    public final CopyOnWriteArrayList<C0973a> f3860a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    public final FragmentManager f3861b;

    /* renamed from: androidx.fragment.app.v$a */
    public static final class C0973a {

        /* renamed from: a */
        public final FragmentManager.C0896l f3862a;

        /* renamed from: b */
        public final boolean f3863b;

        public C0973a(FragmentManager.C0896l lVar, boolean z) {
            this.f3862a = lVar;
            this.f3863b = z;
        }
    }

    public C0972v(FragmentManager fragmentManager) {
        this.f3861b = fragmentManager;
    }

    /* renamed from: a */
    public final void mo4196a(boolean z) {
        Fragment fragment = this.f3861b.f3645x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f3635n.mo4196a(true);
        }
        Iterator<C0973a> it = this.f3860a.iterator();
        while (it.hasNext()) {
            C0973a next = it.next();
            if (!z || next.f3863b) {
                next.f3862a.getClass();
            }
        }
    }

    /* renamed from: b */
    public final void mo4197b(boolean z) {
        FragmentManager fragmentManager = this.f3861b;
        Context context = fragmentManager.f3643v.f3854c;
        Fragment fragment = fragmentManager.f3645x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f3635n.mo4197b(true);
        }
        Iterator<C0973a> it = this.f3860a.iterator();
        while (it.hasNext()) {
            C0973a next = it.next();
            if (!z || next.f3863b) {
                next.f3862a.getClass();
            }
        }
    }

    /* renamed from: c */
    public final void mo4198c(boolean z) {
        Fragment fragment = this.f3861b.f3645x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f3635n.mo4198c(true);
        }
        Iterator<C0973a> it = this.f3860a.iterator();
        while (it.hasNext()) {
            C0973a next = it.next();
            if (!z || next.f3863b) {
                next.f3862a.getClass();
            }
        }
    }

    /* renamed from: d */
    public final void mo4199d(boolean z) {
        Fragment fragment = this.f3861b.f3645x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f3635n.mo4199d(true);
        }
        Iterator<C0973a> it = this.f3860a.iterator();
        while (it.hasNext()) {
            C0973a next = it.next();
            if (!z || next.f3863b) {
                next.f3862a.getClass();
            }
        }
    }

    /* renamed from: e */
    public final void mo4200e(boolean z) {
        Fragment fragment = this.f3861b.f3645x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f3635n.mo4200e(true);
        }
        Iterator<C0973a> it = this.f3860a.iterator();
        while (it.hasNext()) {
            C0973a next = it.next();
            if (!z || next.f3863b) {
                next.f3862a.getClass();
            }
        }
    }

    /* renamed from: f */
    public final void mo4201f(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f3861b.f3645x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f3635n.mo4201f(fragment, true);
        }
        Iterator<C0973a> it = this.f3860a.iterator();
        while (it.hasNext()) {
            C0973a next = it.next();
            if (!z || next.f3863b) {
                next.f3862a.mo3998a(fragment);
            }
        }
    }

    /* renamed from: g */
    public final void mo4202g(boolean z) {
        FragmentManager fragmentManager = this.f3861b;
        Context context = fragmentManager.f3643v.f3854c;
        Fragment fragment = fragmentManager.f3645x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f3635n.mo4202g(true);
        }
        Iterator<C0973a> it = this.f3860a.iterator();
        while (it.hasNext()) {
            C0973a next = it.next();
            if (!z || next.f3863b) {
                next.f3862a.getClass();
            }
        }
    }

    /* renamed from: h */
    public final void mo4203h(boolean z) {
        Fragment fragment = this.f3861b.f3645x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f3635n.mo4203h(true);
        }
        Iterator<C0973a> it = this.f3860a.iterator();
        while (it.hasNext()) {
            C0973a next = it.next();
            if (!z || next.f3863b) {
                next.f3862a.getClass();
            }
        }
    }

    /* renamed from: i */
    public final void mo4204i(Fragment fragment, boolean z) {
        Fragment fragment2 = this.f3861b.f3645x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f3635n.mo4204i(fragment, true);
        }
        Iterator<C0973a> it = this.f3860a.iterator();
        while (it.hasNext()) {
            C0973a next = it.next();
            if (!z || next.f3863b) {
                next.f3862a.mo3999b(fragment);
            }
        }
    }

    /* renamed from: j */
    public final void mo4205j(boolean z) {
        Fragment fragment = this.f3861b.f3645x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f3635n.mo4205j(true);
        }
        Iterator<C0973a> it = this.f3860a.iterator();
        while (it.hasNext()) {
            C0973a next = it.next();
            if (!z || next.f3863b) {
                next.f3862a.getClass();
            }
        }
    }

    /* renamed from: k */
    public final void mo4206k(boolean z) {
        Fragment fragment = this.f3861b.f3645x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f3635n.mo4206k(true);
        }
        Iterator<C0973a> it = this.f3860a.iterator();
        while (it.hasNext()) {
            C0973a next = it.next();
            if (!z || next.f3863b) {
                next.f3862a.getClass();
            }
        }
    }

    /* renamed from: l */
    public final void mo4207l(boolean z) {
        Fragment fragment = this.f3861b.f3645x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f3635n.mo4207l(true);
        }
        Iterator<C0973a> it = this.f3860a.iterator();
        while (it.hasNext()) {
            C0973a next = it.next();
            if (!z || next.f3863b) {
                next.f3862a.getClass();
            }
        }
    }

    /* renamed from: m */
    public final void mo4208m(Fragment fragment, View view, Bundle bundle, boolean z) {
        Fragment fragment2 = this.f3861b.f3645x;
        if (fragment2 != null) {
            fragment2.getParentFragmentManager().f3635n.mo4208m(fragment, view, bundle, true);
        }
        Iterator<C0973a> it = this.f3860a.iterator();
        while (it.hasNext()) {
            C0973a next = it.next();
            if (!z || next.f3863b) {
                next.f3862a.mo4000c(this.f3861b, fragment, view);
            }
        }
    }

    /* renamed from: n */
    public final void mo4209n(boolean z) {
        Fragment fragment = this.f3861b.f3645x;
        if (fragment != null) {
            fragment.getParentFragmentManager().f3635n.mo4209n(true);
        }
        Iterator<C0973a> it = this.f3860a.iterator();
        while (it.hasNext()) {
            C0973a next = it.next();
            if (!z || next.f3863b) {
                next.f3862a.getClass();
            }
        }
    }
}
