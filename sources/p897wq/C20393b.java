package p897wq;

import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.moovit.MoovitApplication;
import com.moovit.app.ads.C14741h;

/* renamed from: wq.b */
public final class C20393b implements C20395d {
    /* renamed from: a */
    public final void mo52609a(MoovitApplication moovitApplication, boolean z, boolean z2) {
        String str;
        InneractiveAdManager.initialize(moovitApplication, "125782");
        InneractiveAdManager.setGdprConsent(z);
        if (z2) {
            str = "1YNN";
        } else {
            str = "1YYN";
        }
        InneractiveAdManager.setUSPrivacyString(str);
    }

    /* renamed from: b */
    public final void mo52610b(AdManagerAdRequest.Builder builder, C14741h hVar, boolean z, boolean z2) {
    }
}
