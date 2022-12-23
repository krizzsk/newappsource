package p723ph;

import com.appboy.models.InAppMessageBase;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.play.core.appupdate.C14226d;
import com.iab.omid.library.fyber.adsession.Owner;
import com.iab.omid.library.fyber.publisher.AdSessionStatePublisher;
import org.json.JSONObject;
import p389bl.C13637c;
import p699oh.C18749b;
import p699oh.C18750c;
import p699oh.C18754g;
import p746qh.C19126f;
import p792sh.C19461a;

/* renamed from: ph.a */
public final class C18923a {

    /* renamed from: a */
    public final C18754g f48164a;

    public C18923a(C18754g gVar) {
        this.f48164a = gVar;
    }

    /* renamed from: a */
    public static C18923a m46000a(C18749b bVar) {
        boolean z;
        C18754g gVar = (C18754g) bVar;
        C14226d.m35346l0(bVar, "AdSession is null");
        C18750c cVar = gVar.f47711b;
        cVar.getClass();
        if (Owner.NATIVE == cVar.f47693b) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
        } else if (!gVar.f47715f) {
            C14226d.m35350q0(gVar);
            AdSessionStatePublisher adSessionStatePublisher = gVar.f47714e;
            if (adSessionStatePublisher.f36930c == null) {
                C18923a aVar = new C18923a(gVar);
                adSessionStatePublisher.f36930c = aVar;
                return aVar;
            }
            throw new IllegalStateException("MediaEvents already exists for AdSession");
        } else {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* renamed from: b */
    public final void mo51436b(float f, float f2) {
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException("Invalid Media duration");
        } else if (f2 < BitmapDescriptorFactory.HUE_RED || f2 > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        } else {
            C14226d.m35351r0(this.f48164a);
            JSONObject jSONObject = new JSONObject();
            C19461a.m46861c(jSONObject, InAppMessageBase.DURATION, Float.valueOf(f));
            C19461a.m46861c(jSONObject, "mediaPlayerVolume", Float.valueOf(f2));
            C19461a.m46861c(jSONObject, "deviceVolume", Float.valueOf(C19126f.m46285a().f48623a));
            C13637c.m34066c(this.f48164a.f47714e.mo44193h(), "publishMediaEvent", "start", jSONObject);
        }
    }

    /* renamed from: c */
    public final void mo51437c(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED || f > 1.0f) {
            throw new IllegalArgumentException("Invalid Media volume");
        }
        C14226d.m35351r0(this.f48164a);
        JSONObject jSONObject = new JSONObject();
        C19461a.m46861c(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
        C19461a.m46861c(jSONObject, "deviceVolume", Float.valueOf(C19126f.m46285a().f48623a));
        C13637c.m34066c(this.f48164a.f47714e.mo44193h(), "publishMediaEvent", "volumeChange", jSONObject);
    }
}
