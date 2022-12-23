package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;
import p188o.C5891a;

/* renamed from: androidx.appcompat.widget.j1 */
public final class C0421j1 implements View.OnClickListener {

    /* renamed from: b */
    public final C5891a f1534b;

    /* renamed from: c */
    public final /* synthetic */ C0424k1 f1535c;

    public C0421j1(C0424k1 k1Var) {
        this.f1535c = k1Var;
        this.f1534b = new C5891a(k1Var.f1536a.getContext(), k1Var.f1544i);
    }

    public final void onClick(View view) {
        C0424k1 k1Var = this.f1535c;
        Window.Callback callback = k1Var.f1547l;
        if (callback != null && k1Var.f1548m) {
            callback.onMenuItemSelected(0, this.f1534b);
        }
    }
}
