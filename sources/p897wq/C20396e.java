package p897wq;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.moovit.MoovitApplication;
import com.moovit.app.ads.C14741h;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.mediation.MoovitMediationAdapter;

/* renamed from: wq.e */
public final class C20396e implements C20395d {
    /* renamed from: a */
    public final void mo52609a(MoovitApplication moovitApplication, boolean z, boolean z2) {
    }

    /* renamed from: b */
    public final void mo52610b(AdManagerAdRequest.Builder builder, C14741h hVar, boolean z, boolean z2) {
        Class<MoovitMediationAdapter> cls = MoovitMediationAdapter.class;
        Bundle bundle = new Bundle(2);
        Location location = (Location) hVar.f37521a.get(1);
        if (location != null) {
            bundle.putParcelable(MoovitMediationAdapter.EXTRA_USER_LOCATION, location);
        }
        LatLonE6 latLonE6 = (LatLonE6) hVar.f37521a.get(2);
        if (latLonE6 != null) {
            bundle.putParcelable(MoovitMediationAdapter.EXTRA_TARGET_LOCATION, latLonE6);
        }
        builder.addNetworkExtrasBundle(cls, bundle);
    }
}
