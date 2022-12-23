package com.moovit.app.home.dashboard;

import android.app.Activity;
import android.net.Uri;
import com.moovit.C15682c;
import com.moovit.inputfields.C16069a;
import com.moovit.location.C16202a;
import com.moovit.location.LocationAlertFragment;
import com.moovit.payment.clearance.tokenization.TokenizeStatus;
import m50.C18327c;
import p60.C18883a;
import p977zz.C20935e;

/* renamed from: com.moovit.app.home.dashboard.n */
public final /* synthetic */ class C14951n implements C20935e {

    /* renamed from: b */
    public final /* synthetic */ int f38266b;

    /* renamed from: c */
    public final /* synthetic */ C15682c f38267c;

    public /* synthetic */ C14951n(C15682c cVar, int i) {
        this.f38266b = i;
        this.f38267c = cVar;
    }

    public final void invoke(Object obj) {
        switch (this.f38266b) {
            case 0:
                Void voidR = (Void) obj;
                int i = LocationServicesStateSection.f38179r;
                ((LocationServicesStateSection) this.f38267c).mo45126o2();
                return;
            case 1:
                LocationAlertFragment locationAlertFragment = (LocationAlertFragment) this.f38267c;
                Void voidR2 = (Void) obj;
                int i2 = LocationAlertFragment.f42235x;
                A a = locationAlertFragment.f40822c;
                if (a != null && locationAlertFragment.isResumed()) {
                    C16202a.get(a).requestLocationSettings().addOnSuccessListener((Activity) a, locationAlertFragment.f42243u);
                    return;
                }
                return;
            case 2:
                C18327c cVar = (C18327c) this.f38267c;
                TokenizeStatus tokenizeStatus = (TokenizeStatus) obj;
                int i3 = C18327c.f46734x;
                if (cVar.isAdded() && tokenizeStatus == TokenizeStatus.SUCCESS) {
                    cVar.mo51515p2(Uri.parse(cVar.f48511p.f42777b));
                    return;
                }
                return;
            default:
                C16069a aVar = (C16069a) obj;
                int i4 = C18883a.f48058u;
                ((C18883a) this.f38267c).mo51349C2();
                return;
        }
    }
}
