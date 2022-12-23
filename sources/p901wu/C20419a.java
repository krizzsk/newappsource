package p901wu;

import android.location.Location;
import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.checkin.MVCheckinRequest;
import com.tranzmate.moovit.protocol.common.MVGpsLocation;

/* renamed from: wu.a */
public final class C20419a extends C13778r<C20419a, C20420b, MVCheckinRequest> {

    /* renamed from: A */
    public final String f51732A;

    /* renamed from: w */
    public final ServerId f51733w;

    /* renamed from: x */
    public final LatLonE6 f51734x;

    /* renamed from: y */
    public final float f51735y;

    /* renamed from: z */
    public final ServerId f51736z;

    public C20419a(C13752e eVar, ServerId serverId, Location location, ServerId serverId2, String str) {
        super(eVar, R.string.api_path_checkin_request_path, C20420b.class);
        LatLonE6 latLonE6;
        float f;
        C21100e.m49373x(serverId, "line");
        this.f51733w = serverId;
        if (location == null) {
            latLonE6 = null;
        } else {
            latLonE6 = LatLonE6.m40177j(location);
        }
        this.f51734x = latLonE6;
        if (location == null) {
            f = BitmapDescriptorFactory.HUE_RED;
        } else {
            f = location.getAccuracy();
        }
        this.f51735y = f;
        this.f51736z = serverId2;
        this.f51732A = str;
        int i = serverId.f15142b;
        RO mVCheckinRequest = new MVCheckinRequest();
        mVCheckinRequest.lineId = i;
        mVCheckinRequest.mo26010l();
        MVGpsLocation t = C13749c.m34334t(location);
        if (t != null) {
            mVCheckinRequest.userLocation = t;
        }
        if (serverId2 != null) {
            mVCheckinRequest.toStopId = serverId2.f15142b;
            mVCheckinRequest.mo26011m();
        }
        if (str != null) {
            mVCheckinRequest.prevGuid = str;
        }
        mVCheckinRequest.enableRecording = false;
        mVCheckinRequest.mo26009k();
        this.f33922v = mVCheckinRequest;
    }
}
