package p976zy;

import android.content.SharedPreferences;
import c70.C13746a;
import c70.C13752e;
import f00.C16919g;
import p824tp.C19746x;
import p906wz.C20432d;

/* renamed from: zy.e */
public final class C20924e extends C13746a<C20924e, C20925f> {

    /* renamed from: v */
    public final C16919g.C16920a f52674v = new C16919g.C16920a("did_execute_firebase_register", false);

    public C20924e(C13752e eVar) {
        super(eVar, C19746x.server_path_app_server_secured_url, C19746x.api_path_firebase_custom_token, true, C20925f.class);
    }

    /* renamed from: L */
    public final boolean mo20305L() {
        return false;
    }

    /* renamed from: u */
    public final void mo6590u(C20432d dVar) {
        super.mo6590u(dVar);
        SharedPreferences sharedPreferences = this.f33829q.f33852a.getSharedPreferences("firebase_register", 0);
        if (this.f52674v.mo19759a(sharedPreferences).booleanValue()) {
            dVar.mo52632a("Is-Repeated-Request", 1);
        } else {
            this.f52674v.mo49545d(sharedPreferences, Boolean.TRUE);
        }
    }
}
