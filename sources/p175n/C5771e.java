package p175n;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0291f;
import java.util.ArrayList;
import p154l1.C5554b;
import p175n.C5765a;
import p188o.C5893c;
import p188o.C5900e;
import p241s0.C6313h;

/* renamed from: n.e */
public final class C5771e extends ActionMode {

    /* renamed from: a */
    public final Context f18668a;

    /* renamed from: b */
    public final C5765a f18669b;

    /* renamed from: n.e$a */
    public static class C5772a implements C5765a.C5766a {

        /* renamed from: a */
        public final ActionMode.Callback f18670a;

        /* renamed from: b */
        public final Context f18671b;

        /* renamed from: c */
        public final ArrayList<C5771e> f18672c = new ArrayList<>();

        /* renamed from: d */
        public final C6313h<Menu, Menu> f18673d = new C6313h<>();

        public C5772a(Context context, ActionMode.Callback callback) {
            this.f18671b = context;
            this.f18670a = callback;
        }

        /* renamed from: a */
        public final boolean mo905a(C5765a aVar, MenuItem menuItem) {
            return this.f18670a.onActionItemClicked(mo21640e(aVar), new C5893c(this.f18671b, (C5554b) menuItem));
        }

        /* renamed from: b */
        public final boolean mo906b(C5765a aVar, C0291f fVar) {
            ActionMode.Callback callback = this.f18670a;
            C5771e e = mo21640e(aVar);
            Menu orDefault = this.f18673d.getOrDefault(fVar, null);
            if (orDefault == null) {
                orDefault = new C5900e(this.f18671b, fVar);
                this.f18673d.put(fVar, orDefault);
            }
            return callback.onPrepareActionMode(e, orDefault);
        }

        /* renamed from: c */
        public final boolean mo907c(C5765a aVar, C0291f fVar) {
            ActionMode.Callback callback = this.f18670a;
            C5771e e = mo21640e(aVar);
            Menu orDefault = this.f18673d.getOrDefault(fVar, null);
            if (orDefault == null) {
                orDefault = new C5900e(this.f18671b, fVar);
                this.f18673d.put(fVar, orDefault);
            }
            return callback.onCreateActionMode(e, orDefault);
        }

        /* renamed from: d */
        public final void mo908d(C5765a aVar) {
            this.f18670a.onDestroyActionMode(mo21640e(aVar));
        }

        /* renamed from: e */
        public final C5771e mo21640e(C5765a aVar) {
            int size = this.f18672c.size();
            for (int i = 0; i < size; i++) {
                C5771e eVar = this.f18672c.get(i);
                if (eVar != null && eVar.f18669b == aVar) {
                    return eVar;
                }
            }
            C5771e eVar2 = new C5771e(this.f18671b, aVar);
            this.f18672c.add(eVar2);
            return eVar2;
        }
    }

    public C5771e(Context context, C5765a aVar) {
        this.f18668a = context;
        this.f18669b = aVar;
    }

    public final void finish() {
        this.f18669b.mo993c();
    }

    public final View getCustomView() {
        return this.f18669b.mo994d();
    }

    public final Menu getMenu() {
        return new C5900e(this.f18668a, this.f18669b.mo995e());
    }

    public final MenuInflater getMenuInflater() {
        return this.f18669b.mo996f();
    }

    public final CharSequence getSubtitle() {
        return this.f18669b.mo997g();
    }

    public final Object getTag() {
        return this.f18669b.f18654b;
    }

    public final CharSequence getTitle() {
        return this.f18669b.mo998h();
    }

    public final boolean getTitleOptionalHint() {
        return this.f18669b.f18655c;
    }

    public final void invalidate() {
        this.f18669b.mo999i();
    }

    public final boolean isTitleOptional() {
        return this.f18669b.mo1000j();
    }

    public final void setCustomView(View view) {
        this.f18669b.mo1001k(view);
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.f18669b.mo1003m(charSequence);
    }

    public final void setTag(Object obj) {
        this.f18669b.f18654b = obj;
    }

    public final void setTitle(CharSequence charSequence) {
        this.f18669b.mo1005o(charSequence);
    }

    public final void setTitleOptionalHint(boolean z) {
        this.f18669b.mo1006p(z);
    }

    public final void setSubtitle(int i) {
        this.f18669b.mo1002l(i);
    }

    public final void setTitle(int i) {
        this.f18669b.mo1004n(i);
    }
}
