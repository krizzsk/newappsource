package p897wq;

import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.moovit.MoovitApplication;
import com.moovit.app.ads.C14741h;
import com.vungle.warren.Vungle;

/* renamed from: wq.g */
public final class C20398g implements C20395d {
    /* renamed from: a */
    public final void mo52609a(MoovitApplication moovitApplication, boolean z, boolean z2) {
        Vungle.Consent consent;
        Vungle.Consent consent2;
        if (z) {
            consent = Vungle.Consent.OPTED_IN;
        } else {
            consent = Vungle.Consent.OPTED_OUT;
        }
        Vungle.updateConsentStatus(consent, (String) null);
        if (z2) {
            consent2 = Vungle.Consent.OPTED_IN;
        } else {
            consent2 = Vungle.Consent.OPTED_OUT;
        }
        Vungle.updateCCPAStatus(consent2);
    }

    /* renamed from: b */
    public final void mo52610b(AdManagerAdRequest.Builder builder, C14741h hVar, boolean z, boolean z2) {
    }
}
