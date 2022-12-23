package com.moovit;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.exoplayer2.p052ui.C4053s;
import com.google.android.gms.common.GoogleApiAvailability;
import com.moovit.design.view.AlertMessageView;
import java.util.HashSet;
import java.util.Set;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19746x;

public final class GooglePlayServicesUnavailableActivity extends MoovitActivity {

    /* renamed from: X */
    public static final /* synthetic */ int f37289X = 0;

    /* renamed from: U */
    public Intent f37290U;

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        this.f37290U = (Intent) getIntent().getParcelableExtra("intent_to_launch_on_success");
        setContentView(C19742t.google_play_services_unavailable);
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        GoogleApiAvailability instance = GoogleApiAvailability.getInstance();
        int isGooglePlayServicesAvailable = instance.isGooglePlayServicesAvailable(this);
        if (isGooglePlayServicesAvailable != 0) {
            String errorString = instance.getErrorString(isGooglePlayServicesAvailable);
            AlertMessageView alertMessageView = (AlertMessageView) findViewById(C19740r.error_view);
            alertMessageView.setSubtitle((CharSequence) errorString);
            if (instance.isUserResolvableError(isGooglePlayServicesAvailable)) {
                alertMessageView.setPositiveButton(C19746x.resolve_google_services_unavailability);
                alertMessageView.setPositiveButtonClickListener(new C4053s(isGooglePlayServicesAvailable, 1, this));
                return;
            }
            alertMessageView.setPositiveButton((CharSequence) null);
        } else if (!isFinishing()) {
            MoovitApplication<?, ?, ?> moovitApplication = MoovitApplication.f37317k;
            Intent intent = this.f37290U;
            moovitApplication.f37321e.mo50689b("GOOGLE_PLAY_SERVICES");
            moovitApplication.mo44574v(this, intent);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1001) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && !isFinishing()) {
            MoovitApplication<?, ?, ?> moovitApplication = MoovitApplication.f37317k;
            Intent intent2 = this.f37290U;
            moovitApplication.f37321e.mo50689b("GOOGLE_PLAY_SERVICES");
            moovitApplication.mo44574v(this, intent2);
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).clear();
        return s1;
    }
}
