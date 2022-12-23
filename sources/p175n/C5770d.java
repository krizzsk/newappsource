package p175n;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0291f;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionMenuPresenter;
import java.lang.ref.WeakReference;
import p175n.C5765a;

/* renamed from: n.d */
public final class C5770d extends C5765a implements C0291f.C0292a {

    /* renamed from: d */
    public Context f18662d;

    /* renamed from: e */
    public ActionBarContextView f18663e;

    /* renamed from: f */
    public C5765a.C5766a f18664f;

    /* renamed from: g */
    public WeakReference<View> f18665g;

    /* renamed from: h */
    public boolean f18666h;

    /* renamed from: i */
    public C0291f f18667i;

    public C5770d(Context context, ActionBarContextView actionBarContextView, C5765a.C5766a aVar) {
        this.f18662d = context;
        this.f18663e = actionBarContextView;
        this.f18664f = aVar;
        C0291f fVar = new C0291f(actionBarContextView.getContext());
        fVar.f933l = 1;
        this.f18667i = fVar;
        fVar.f926e = this;
    }

    /* renamed from: a */
    public final boolean mo865a(C0291f fVar, MenuItem menuItem) {
        return this.f18664f.mo905a(this, menuItem);
    }

    /* renamed from: b */
    public final void mo866b(C0291f fVar) {
        mo999i();
        ActionMenuPresenter actionMenuPresenter = this.f18663e.f1432e;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo1325o();
        }
    }

    /* renamed from: c */
    public final void mo993c() {
        if (!this.f18666h) {
            this.f18666h = true;
            this.f18664f.mo908d(this);
        }
    }

    /* renamed from: d */
    public final View mo994d() {
        WeakReference<View> weakReference = this.f18665g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* renamed from: e */
    public final C0291f mo995e() {
        return this.f18667i;
    }

    /* renamed from: f */
    public final MenuInflater mo996f() {
        return new C5773f(this.f18663e.getContext());
    }

    /* renamed from: g */
    public final CharSequence mo997g() {
        return this.f18663e.getSubtitle();
    }

    /* renamed from: h */
    public final CharSequence mo998h() {
        return this.f18663e.getTitle();
    }

    /* renamed from: i */
    public final void mo999i() {
        this.f18664f.mo906b(this, this.f18667i);
    }

    /* renamed from: j */
    public final boolean mo1000j() {
        return this.f18663e.f1037t;
    }

    /* renamed from: k */
    public final void mo1001k(View view) {
        WeakReference<View> weakReference;
        this.f18663e.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference<>(view);
        } else {
            weakReference = null;
        }
        this.f18665g = weakReference;
    }

    /* renamed from: l */
    public final void mo1002l(int i) {
        mo1003m(this.f18662d.getString(i));
    }

    /* renamed from: m */
    public final void mo1003m(CharSequence charSequence) {
        this.f18663e.setSubtitle(charSequence);
    }

    /* renamed from: n */
    public final void mo1004n(int i) {
        mo1005o(this.f18662d.getString(i));
    }

    /* renamed from: o */
    public final void mo1005o(CharSequence charSequence) {
        this.f18663e.setTitle(charSequence);
    }

    /* renamed from: p */
    public final void mo1006p(boolean z) {
        this.f18655c = z;
        this.f18663e.setTitleOptional(z);
    }
}
