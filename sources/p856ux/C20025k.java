package p856ux;

import android.content.Context;
import c70.C13752e;
import com.appboy.Appboy;
import com.moovit.appdata.UserContextLoader;
import com.moovit.gcm.condition.GcmTimePeriodCondition;
import com.moovit.gcm.notification.GcmNotification;
import com.moovit.gcm.payload.LoginPayload;
import com.moovit.gcm.popup.LocalPopup;
import com.moovit.maintenance.MaintenanceManager;
import k10.C17993a;
import p626lf.C18201b;
import p977zz.C20943i;
import x90.C13242b;
import y90.C13272f;

/* renamed from: ux.k */
public final class C20025k implements C13242b {

    /* renamed from: a */
    public final /* synthetic */ int f50863a;

    public /* synthetic */ C20025k(int i) {
        this.f50863a = i;
    }

    /* renamed from: a */
    public final void mo40113a(C13752e eVar) {
        C13272f m;
        switch (this.f50863a) {
            case 0:
                Context context = eVar.f33852a;
                long currentTimeMillis = System.currentTimeMillis();
                C17993a.f46075a.mo50494j(context, new LocalPopup(new GcmTimePeriodCondition(currentTimeMillis, 31449600000L + currentTimeMillis), new LoginPayload("-666"), (GcmNotification) null));
                return;
            case 1:
                Context context2 = eVar.f33852a;
                if (UserContextLoader.m40004l(context2) && (m = UserContextLoader.m40005m(context2)) != null) {
                    C18201b.m44928z(context2, m.f32925a);
                    return;
                }
                return;
            case 2:
                eVar.f33852a.deleteDatabase("moovit_embed.db");
                return;
            case 3:
                Context context3 = eVar.f33852a;
                context3.deleteDatabase("moovit_app.db");
                MaintenanceManager.m41336b(context3);
                return;
            default:
                Context context4 = eVar.f33852a;
                C20943i.m49049b(context4, "com.moovit.braze.profile");
                Appboy.wipeData(context4);
                context4.deleteFile("payment_account.dat");
                return;
        }
    }

    public final String toString() {
        switch (this.f50863a) {
            case 0:
                return "Upgrader196To197";
            case 1:
                return "Upgrader319To320";
            case 2:
                return "Upgrader387To388";
            case 3:
                return "Upgrader428To429";
            default:
                return "Upgrader481To482";
        }
    }
}
