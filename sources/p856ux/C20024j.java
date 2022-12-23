package p856ux;

import android.content.Context;
import c70.C13752e;
import com.moovit.app.tracking.TrackingEvent;
import com.moovit.appdata.UserContextLoader;
import java.io.File;
import p626lf.C18201b;
import p786rz.C19387a;
import p977zz.C20943i;
import x90.C13242b;
import y90.C13272f;

/* renamed from: ux.j */
public final class C20024j implements C13242b {

    /* renamed from: a */
    public final /* synthetic */ int f50862a;

    public /* synthetic */ C20024j(int i) {
        this.f50862a = i;
    }

    /* renamed from: a */
    public final void mo40113a(C13752e eVar) {
        C13272f m;
        switch (this.f50862a) {
            case 0:
                return;
            case 1:
                Context context = eVar.f33852a;
                if (UserContextLoader.m40004l(context) && (m = UserContextLoader.m40005m(context)) != null) {
                    C18201b.m44928z(context, m.f32925a);
                    return;
                }
                return;
            case 2:
                Context context2 = eVar.f33852a;
                context2.deleteDatabase("moovit.db");
                C19387a.m46676h(new File(new File(context2.getFilesDir(), "stores"), "twitter_sa_handles"));
                context2.getSharedPreferences("events_tracker_store", 0).edit().remove(TrackingEvent.TRIP_PLAN_TRANSPORT_TYPE_DIALOG_DISPLAYED.getPrefsKey()).apply();
                return;
            case 3:
                eVar.f33852a.getSharedPreferences("events_tracker_store", 0).edit().remove(TrackingEvent.WONDO_USER_CONSENT.getPrefsKey()).apply();
                return;
            default:
                C20943i.m49049b(eVar.f33852a, "ride_hailing_preview_prefs");
                return;
        }
    }

    public final String toString() {
        switch (this.f50862a) {
            case 0:
                return "Upgrader188To189";
            case 1:
                return "Upgrader315To316";
            case 2:
                return "Upgrader385To386";
            case 3:
                return "Upgrader425To426";
            default:
                return "Upgrader479To480";
        }
    }
}
