package p504fz;

import c00.C13720d;
import c00.C13722f;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.externalservices.MVRentalBikesRTRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import p824tp.C19746x;
import p875vs.C20228e;

/* renamed from: fz.f */
public final class C17134f extends C13778r<C17134f, C17135g, MVRentalBikesRTRequest> {

    /* renamed from: w */
    public final Collection<ServerId> f44365w;

    public C17134f(C13752e eVar, HashSet hashSet) {
        super(eVar, C19746x.api_path_bicycle_request_path, C17135g.class);
        C21100e.m49373x(hashSet, "ids");
        this.f44365w = hashSet;
        ArrayList c = C13720d.m34273c(hashSet, (C13722f) null, new C20228e(11));
        RO mVRentalBikesRTRequest = new MVRentalBikesRTRequest();
        mVRentalBikesRTRequest.rentalBikeStopIds = c;
        this.f33922v = mVRentalBikesRTRequest;
    }

    /* renamed from: B */
    public final boolean mo21057B() {
        return true;
    }
}
