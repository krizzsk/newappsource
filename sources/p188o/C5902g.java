package p188o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import p154l1.C5555c;

/* renamed from: o.g */
public final class C5902g extends C5900e implements SubMenu {

    /* renamed from: e */
    public final C5555c f18976e;

    public C5902g(Context context, C5555c cVar) {
        super(context, cVar);
        this.f18976e = cVar;
    }

    public final void clearHeader() {
        this.f18976e.clearHeader();
    }

    public final MenuItem getItem() {
        return mo21795d(this.f18976e.getItem());
    }

    public final SubMenu setHeaderIcon(int i) {
        this.f18976e.setHeaderIcon(i);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        this.f18976e.setHeaderTitle(i);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        this.f18976e.setHeaderView(view);
        return this;
    }

    public final SubMenu setIcon(int i) {
        this.f18976e.setIcon(i);
        return this;
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.f18976e.setHeaderIcon(drawable);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f18976e.setHeaderTitle(charSequence);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.f18976e.setIcon(drawable);
        return this;
    }
}
