package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0291f;

/* renamed from: androidx.appcompat.view.menu.m */
public class C0307m extends C0291f implements SubMenu {

    /* renamed from: A */
    public C0295h f1015A;

    /* renamed from: z */
    public C0291f f1016z;

    public C0307m(Context context, C0291f fVar, C0295h hVar) {
        super(context);
        this.f1016z = fVar;
        this.f1015A = hVar;
    }

    /* renamed from: d */
    public final boolean mo1106d(C0295h hVar) {
        return this.f1016z.mo1106d(hVar);
    }

    /* renamed from: e */
    public final boolean mo1107e(C0291f fVar, MenuItem menuItem) {
        if (super.mo1107e(fVar, menuItem) || this.f1016z.mo1107e(fVar, menuItem)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo1108f(C0295h hVar) {
        return this.f1016z.mo1108f(hVar);
    }

    public final MenuItem getItem() {
        return this.f1015A;
    }

    /* renamed from: j */
    public final String mo1116j() {
        int i;
        C0295h hVar = this.f1015A;
        if (hVar != null) {
            i = hVar.f952a;
        } else {
            i = 0;
        }
        if (i == 0) {
            return null;
        }
        return C16759e.m42350f("android:menu:actionviewstates", ":", i);
    }

    /* renamed from: k */
    public final C0291f mo1117k() {
        return this.f1016z.mo1117k();
    }

    /* renamed from: m */
    public final boolean mo1119m() {
        return this.f1016z.mo1119m();
    }

    /* renamed from: n */
    public final boolean mo1120n() {
        return this.f1016z.mo1120n();
    }

    /* renamed from: o */
    public final boolean mo1121o() {
        return this.f1016z.mo1121o();
    }

    public final void setGroupDividerEnabled(boolean z) {
        this.f1016z.setGroupDividerEnabled(z);
    }

    public final SubMenu setHeaderIcon(Drawable drawable) {
        mo1140x(0, (CharSequence) null, 0, drawable, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        mo1140x(0, charSequence, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderView(View view) {
        mo1140x(0, (CharSequence) null, 0, (Drawable) null, view);
        return this;
    }

    public final SubMenu setIcon(Drawable drawable) {
        this.f1015A.setIcon(drawable);
        return this;
    }

    public final void setQwertyMode(boolean z) {
        this.f1016z.setQwertyMode(z);
    }

    /* renamed from: w */
    public final void mo1139w(C0291f.C0292a aVar) {
        throw null;
    }

    public final SubMenu setHeaderIcon(int i) {
        mo1140x(0, (CharSequence) null, i, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setHeaderTitle(int i) {
        mo1140x(i, (CharSequence) null, 0, (Drawable) null, (View) null);
        return this;
    }

    public final SubMenu setIcon(int i) {
        this.f1015A.setIcon(i);
        return this;
    }
}
