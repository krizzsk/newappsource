package p775ro;

import android.widget.Toast;
import p364al.C13487h;
import p364al.C13488i;
import p605ki.C18066t;

/* renamed from: ro.g */
public final /* synthetic */ class C19302g implements C13488i {

    /* renamed from: a */
    public final /* synthetic */ C19305j f49100a;

    public /* synthetic */ C19302g(C19305j jVar) {
        this.f49100a = jVar;
    }

    /* renamed from: a */
    public final void mo40393a(C13487h hVar) {
        C19305j jVar = this.f49100a;
        jVar.getClass();
        if (hVar.mo40399a()) {
            Toast.makeText(((C19297d) jVar.f45943a).getContext(), C18066t.com_masabi_justride_sdk_ticket_activation_error, 1).show();
        } else {
            jVar.mo51730j();
        }
    }
}
