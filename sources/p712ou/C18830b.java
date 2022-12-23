package p712ou;

import ce0.C21100e;
import com.appboy.models.outgoing.FacebookUser;
import com.moovit.app.mot.model.MotActivationPrice;
import com.moovit.app.mot.model.MotNearestStationInfo;
import com.moovit.commons.geo.LatLonE6;

/* renamed from: ou.b */
public final class C18830b {

    /* renamed from: a */
    public final LatLonE6 f47942a;

    /* renamed from: b */
    public final MotActivationPrice f47943b;

    /* renamed from: c */
    public final MotNearestStationInfo f47944c;

    public C18830b(MotActivationPrice motActivationPrice, MotNearestStationInfo motNearestStationInfo, LatLonE6 latLonE6) {
        C21100e.m49373x(latLonE6, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        this.f47942a = latLonE6;
        this.f47943b = motActivationPrice;
        this.f47944c = motNearestStationInfo;
    }
}
