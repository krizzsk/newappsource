package p856ux;

import c70.C13752e;
import java.io.File;
import p786rz.C19387a;
import p977zz.C20943i;
import x90.C13242b;

/* renamed from: ux.l */
public final class C20026l implements C13242b {

    /* renamed from: a */
    public final /* synthetic */ int f50864a;

    public /* synthetic */ C20026l(int i) {
        this.f50864a = i;
    }

    /* renamed from: a */
    public final void mo40113a(C13752e eVar) {
        switch (this.f50864a) {
            case 0:
                File file = new File(new File(eVar.f33852a.getFilesDir(), "stores"), "navigation");
                if (file.exists() && file.isDirectory()) {
                    C19387a.m46676h(file);
                    return;
                }
                return;
            case 1:
                eVar.f33852a.deleteFile("survey_answers");
                return;
            case 2:
                C20943i.m49049b(eVar.f33852a, "user_creation_failure");
                return;
            case 3:
                eVar.f33852a.deleteFile("app_gcm_actions_state.dat");
                return;
            default:
                C19387a.m46676h(new File(new File(eVar.f33852a.getFilesDir(), "stores"), "micro_mobility_user_wallet_store"));
                return;
        }
    }

    public final String toString() {
        switch (this.f50864a) {
            case 0:
                return "Upgrader217To218";
            case 1:
                return "Upgrader323To324";
            case 2:
                return "Upgrader391To392";
            case 3:
                return "Upgrader430To431";
            default:
                return "Upgrader486To487";
        }
    }
}
