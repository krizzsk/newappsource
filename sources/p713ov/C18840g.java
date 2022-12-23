package p713ov;

import android.view.View;
import p713ov.C18837f;
import p977zz.C20935e;

/* renamed from: ov.g */
public final /* synthetic */ class C18840g implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ C18837f.C18839b f47968b;

    /* renamed from: c */
    public final /* synthetic */ int f47969c;

    public /* synthetic */ C18840g(C18837f.C18839b bVar, int i) {
        this.f47968b = bVar;
        this.f47969c = i;
    }

    public final void onClick(View view) {
        C18837f.C18839b bVar = this.f47968b;
        int i = this.f47969c;
        int i2 = bVar.f47966h;
        if (i2 != -1) {
            bVar.notifyItemChanged(i2);
        }
        bVar.f47966h = i;
        bVar.notifyItemChanged(i);
        C20935e<C18837f.C18839b> eVar = bVar.f47967i;
        if (eVar != null) {
            eVar.invoke(bVar);
        }
    }
}
