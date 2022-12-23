package p897wq;

import com.facebook.ads.AdSettings;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.moovit.MoovitApplication;
import com.moovit.app.ads.C14741h;

/* renamed from: wq.a */
public final class C20392a implements C20395d {
    /* renamed from: a */
    public final void mo52609a(MoovitApplication moovitApplication, boolean z, boolean z2) {
        if (z2) {
            AdSettings.setDataProcessingOptions(new String[0]);
        } else {
            AdSettings.setDataProcessingOptions(new String[]{"LDU"}, 1, 1000);
        }
    }

    /* renamed from: b */
    public final void mo52610b(AdManagerAdRequest.Builder builder, C14741h hVar, boolean z, boolean z2) {
    }
}
