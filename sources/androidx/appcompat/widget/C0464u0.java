package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.appcompat.view.menu.C0291f;
import androidx.appcompat.widget.C0475w0;

/* renamed from: androidx.appcompat.widget.u0 */
public final class C0464u0 implements C0291f.C0292a {

    /* renamed from: b */
    public final /* synthetic */ C0475w0 f1628b;

    public C0464u0(C0475w0 w0Var) {
        this.f1628b = w0Var;
    }

    /* renamed from: a */
    public final boolean mo865a(C0291f fVar, MenuItem menuItem) {
        C0475w0.C0476a aVar = this.f1628b.f1653e;
        if (aVar != null) {
            return aVar.onMenuItemClick(menuItem);
        }
        return false;
    }

    /* renamed from: b */
    public final void mo866b(C0291f fVar) {
    }
}
