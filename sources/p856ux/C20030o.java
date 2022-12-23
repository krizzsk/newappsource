package p856ux;

import android.content.Context;
import c70.C13752e;
import com.bumptech.glide.C2116c;
import com.moovit.app.general.settings.privacy.C14894a;
import com.moovit.app.tracking.TrackingEvent;
import com.moovit.appdata.UserContextLoader;
import com.moovit.commons.utils.ApplicationBugException;
import java.io.File;
import p311x6.C7172i;
import p311x6.C7176l;
import p435de.C16596f;
import p584jl.C17885a;
import p786rz.C19387a;
import p824tp.C19722a0;
import p977zz.C20943i;
import w40.C25761d;
import x90.C13242b;
import y90.C13272f;

/* renamed from: ux.o */
public final class C20030o implements C13242b {

    /* renamed from: a */
    public final /* synthetic */ int f50867a;

    public /* synthetic */ C20030o(int i) {
        this.f50867a = i;
    }

    /* renamed from: a */
    public final void mo40113a(C13752e eVar) {
        C13272f m;
        switch (this.f50867a) {
            case 0:
                File file = new File(new File(eVar.f33852a.getFilesDir(), "stores"), "top_search_locations");
                if (file.isDirectory()) {
                    C19387a.m46676h(file);
                    return;
                }
                return;
            case 1:
                C14894a b = C14894a.m37560b(eVar.f33852a);
                if (b.mo45013c().contains(C14894a.f38076d.f43935a)) {
                    b.mo45018h();
                    return;
                }
                return;
            case 2:
                Context context = eVar.f33852a;
                C20943i.m49049b(context, "intro_offline");
                try {
                    C2116c b2 = C2116c.m5520b(context);
                    b2.getClass();
                    if (C7176l.m16788h()) {
                        b2.f6881b.f7066f.mo10966a().clear();
                        C2116c b3 = C2116c.m5520b(context);
                        b3.getClass();
                        C7176l.m16781a();
                        ((C7172i) b3.f6883d).mo23473e(0);
                        b3.f6882c.mo20084b();
                        b3.f6886g.mo20073b();
                        return;
                    }
                    throw new IllegalArgumentException("You must call this method on a background thread");
                } catch (Exception e) {
                    C16596f a = C16596f.m42113a();
                    StringBuilder k = C13555b.m33972k("Failed to clear Glide cache on ");
                    k.append(toString());
                    a.mo49364c(new ApplicationBugException(k.toString(), e));
                    return;
                }
            case 3:
                Context context2 = eVar.f33852a;
                context2.deleteFile("payment_account.dat");
                TrackingEvent trackingEvent = TrackingEvent.ON_BOARDING_CAMPAIGN;
                context2.getSharedPreferences("events_tracker_store", 0).edit().putInt(trackingEvent.getPrefsKey(), trackingEvent.getMaxOccurrences()).apply();
                return;
            default:
                Context context3 = eVar.f33852a;
                C19722a0 a0Var = null;
                if (UserContextLoader.m40004l(context3) && (m = UserContextLoader.m40005m(context3)) != null) {
                    a0Var = new C19722a0(m);
                }
                if (a0Var != null) {
                    C17885a.m44448l0(context3, a0Var);
                    C17885a.m44449m0(context3, C25761d.m64299a().mo83588c());
                    return;
                }
                return;
        }
    }

    public final String toString() {
        switch (this.f50867a) {
            case 0:
                return "Upgrader242To243";
            case 1:
                return "Upgrader345To346";
            case 2:
                return "Upgrader406To407";
            case 3:
                return "Upgrader445To446";
            default:
                return "Upgrader499To500";
        }
    }
}
