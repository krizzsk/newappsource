package p761qy;

import aa0.C7524a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.moovit.MoovitActivity;
import com.moovit.app.MoovitAppApplication;
import com.moovit.app.tracking.TrackingEvent;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.app.wondo.consent.WondoConsentActivity;
import java.util.ArrayList;
import p090g1.C4732a;
import p527gy.C17264g;
import p646lz.C18299a;
import p874vr.C20199a;
import q00.C19047a;

/* renamed from: qy.d */
public final class C19204d implements C7524a<Intent> {
    /* renamed from: c */
    public static void m46353c(Context context) {
        TrackingEvent trackingEvent = TrackingEvent.WONDO_USER_CONSENT;
        context.getSharedPreferences("events_tracker_store", 0).edit().putInt(trackingEvent.getPrefsKey(), trackingEvent.getMaxOccurrences()).apply();
    }

    /* renamed from: a */
    public final Object mo23790a(MoovitActivity moovitActivity) throws Exception {
        boolean z;
        boolean exists;
        C18299a aVar = MoovitAppApplication.m37038x().f37321e;
        C19047a aVar2 = (C19047a) aVar.mo50695h("CONFIGURATION", false);
        if (aVar2 != null && ((Boolean) aVar2.mo51505b(C20199a.f51306x0)).booleanValue()) {
            TrackingEvent trackingEvent = TrackingEvent.WONDO_USER_CONSENT;
            if (moovitActivity.getSharedPreferences("events_tracker_store", 0).getInt(trackingEvent.getPrefsKey(), 0) >= trackingEvent.getMaxOccurrences()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                C17264g a = C17264g.m43277a(moovitActivity);
                synchronized (a) {
                    exists = a.f44628a.getFileStreamPath("user_profile.dat").exists();
                }
                if (exists) {
                    if (((UserAccountManager) aVar.mo50695h("USER_ACCOUNT", false)).mo46575f().mo49805e().f44616o.f40615b) {
                        m46353c(moovitActivity);
                    } else {
                        int i = WondoConsentActivity.f40676U;
                        return new Intent(moovitActivity, WondoConsentActivity.class);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo23791b(MoovitActivity moovitActivity, Object obj) {
        ArrayList arrayList = new ArrayList();
        arrayList.add((Intent) obj);
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C4732a.startActivities(moovitActivity, intentArr, (Bundle) null)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                moovitActivity.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
