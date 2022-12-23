package p897wq;

import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.moovit.MoovitApplication;
import com.moovit.app.ads.C14741h;
import com.unity3d.ads.metadata.MetaData;

/* renamed from: wq.f */
public final class C20397f implements C20395d {
    /* renamed from: a */
    public final void mo52609a(MoovitApplication moovitApplication, boolean z, boolean z2) {
        MetaData metaData = new MetaData(moovitApplication);
        metaData.set("gdpr.consent", (Object) Boolean.valueOf(z));
        metaData.commit();
        MetaData metaData2 = new MetaData(moovitApplication);
        metaData2.set("privacy.consent", (Object) Boolean.valueOf(z2));
        metaData2.commit();
    }

    /* renamed from: b */
    public final void mo52610b(AdManagerAdRequest.Builder builder, C14741h hVar, boolean z, boolean z2) {
    }
}
