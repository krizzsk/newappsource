package p856ux;

import c70.C13752e;
import com.moovit.appdata.UserContextLoader;
import com.moovit.network.model.ServerId;
import f10.C16935f;
import g30.C4789q;
import x90.C13242b;

/* renamed from: ux.h */
public final class C20020h implements C13242b {

    /* renamed from: a */
    public final /* synthetic */ int f50860a;

    public /* synthetic */ C20020h(int i) {
        this.f50860a = i;
    }

    /* renamed from: a */
    public final void mo40113a(C13752e eVar) {
        switch (this.f50860a) {
            case 0:
                C16935f.m42762e(eVar.f33852a, (String) null);
                return;
            case 1:
                if (UserContextLoader.m40004l(eVar.f33852a)) {
                    C4789q.m12122d(toString(), (ServerId) null, -1);
                    return;
                }
                return;
            case 2:
            case 3:
                return;
            default:
                eVar.f33852a.deleteFile("payment_account.dat");
                return;
        }
    }

    public final String toString() {
        switch (this.f50860a) {
            case 0:
                return "Upgrader152To153";
            case 1:
                return "Upgrader298To299";
            case 2:
                return "Upgrader378To379";
            case 3:
                return "Upgrader421To422";
            default:
                return "Upgrader470To471";
        }
    }
}
