package com.moovit.app.intro.getstarted;

import android.os.Bundle;
import android.view.View;
import c10.C13743d;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppApplication;
import com.moovit.app.intro.FirstTimeUseActivity;
import com.moovit.location.C16202a;
import p001a0.C0016g;
import p073e7.C4584b;
import p102h0.C5021e;
import p543hq.C17474b;
import p880vx.C20244b;
import p968zq.C20885c;

public abstract class GetStartedFirstTimeUseActivity extends FirstTimeUseActivity {

    /* renamed from: p0 */
    public static final /* synthetic */ int f38453p0 = 0;

    /* renamed from: n0 */
    public View f38454n0;

    /* renamed from: o0 */
    public View f38455o0;

    /* renamed from: B2 */
    public static void m37960B2() {
        ((C20244b) MoovitAppApplication.m37038x().f37321e.mo50693f("USER_CONTEXT")).f51351d = true;
    }

    /* renamed from: A2 */
    public final void mo45243A2() {
        this.f38455o0.setVisibility(4);
        this.f38454n0.setVisibility(0);
    }

    /* renamed from: C2 */
    public abstract View mo45247C2();

    /* renamed from: D2 */
    public abstract View mo45248D2();

    /* renamed from: E2 */
    public abstract void mo45249E2();

    /* renamed from: F2 */
    public final void mo45254F2() {
        boolean z;
        C16202a aVar = C16202a.get(this);
        if (aVar.hasLocationPermissions()) {
            C13743d dVar = C13743d.f33820d;
            if (dVar.mo40666b() == null && dVar.mo40665a() == null) {
                z = false;
            } else {
                z = true;
            }
            mo45245y2(z);
            return;
        }
        aVar.requestLocationPermissions((MoovitActivity) this, (C16202a.C16205c<MoovitActivity>) new C5021e(this, 10));
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        mo45249E2();
        this.f38454n0 = mo45248D2();
        View C2 = mo45247C2();
        this.f38455o0 = C2;
        C2.setOnClickListener(new C4584b(this, 16));
    }

    /* renamed from: t0 */
    public final boolean mo19430t0(String str, int i, Bundle bundle) {
        boolean z;
        if ("apps_flyer_data_sharing_consent".equals(str)) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "appsflyer_consent");
            aVar.mo49939g(AnalyticsAttributeKey.DIALOG_ACTION_TYPE, C0016g.m17G(i));
            mo44545v2(aVar.mo49933a());
            if (i == -1) {
                z = true;
            } else {
                z = false;
            }
            C20885c cVar = C20885c.f52624c;
            if (cVar != null) {
                cVar.mo52990b(z);
                mo45254F2();
                return true;
            }
            throw new IllegalStateException("you must call initialize first");
        }
        super.mo19430t0(str, i, bundle);
        return true;
    }
}
