package androidx.appcompat.widget;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0291f;
import androidx.appcompat.view.menu.C0297i;
import p114i.C5215a;

/* renamed from: androidx.appcompat.widget.w0 */
public final class C0475w0 {

    /* renamed from: a */
    public final Context f1649a;

    /* renamed from: b */
    public final C0291f f1650b;

    /* renamed from: c */
    public final View f1651c;

    /* renamed from: d */
    public final C0297i f1652d;

    /* renamed from: e */
    public C0476a f1653e;

    /* renamed from: androidx.appcompat.widget.w0$a */
    public interface C0476a {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public C0475w0(Context context, View view, int i) {
        int i2 = C5215a.popupMenuStyle;
        this.f1649a = context;
        this.f1651c = view;
        C0291f fVar = new C0291f(context);
        this.f1650b = fVar;
        fVar.mo1139w(new C0464u0(this));
        C0297i iVar = new C0297i(i2, 0, context, view, fVar, false);
        this.f1652d = iVar;
        iVar.f985g = i;
        iVar.f989k = new C0467v0(this);
    }
}
