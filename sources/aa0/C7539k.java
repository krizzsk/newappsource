package aa0;

import android.content.Context;
import android.view.View;
import androidx.appcompat.view.menu.C0297i;
import androidx.appcompat.widget.C0475w0;
import p175n.C5773f;
import p977zz.C20943i;

/* renamed from: aa0.k */
public final class C7539k implements View.OnClickListener {

    /* renamed from: b */
    public final C0475w0 f23016b;

    public C7539k(View view, int i, C0475w0.C0476a aVar) {
        C0475w0 w0Var;
        Context context = view.getContext();
        if (C20943i.m49051d(19)) {
            w0Var = new C0475w0(context, view, 16);
        } else {
            w0Var = new C0475w0(context, view, 0);
        }
        this.f23016b = w0Var;
        w0Var.f1653e = aVar;
        new C5773f(w0Var.f1649a).inflate(i, w0Var.f1650b);
    }

    public final void onClick(View view) {
        C0297i iVar = this.f23016b.f1652d;
        boolean z = true;
        if (!iVar.mo1208b()) {
            if (iVar.f984f == null) {
                z = false;
            } else {
                iVar.mo1210d(0, 0, false, false);
            }
        }
        if (!z) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }
}
