package p10;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.common.MVLatLon;
import com.tranzmate.moovit.protocol.stopDetails.MVGetStopImageUploadUrlRequest;
import p824tp.C19746x;

/* renamed from: p10.a */
public final class C18866a extends C13778r<C18866a, C18867b, MVGetStopImageUploadUrlRequest> {
    public C18866a(C13752e eVar, ServerId serverId, long j, LatLonE6 latLonE6, int i, int i2, String str) {
        super(eVar, C19746x.server_path_app_server_secured_url, C19746x.api_path_stop_entity_image_upload_url, C18867b.class);
        MVLatLon r = C13749c.m34332r(latLonE6);
        int i3 = serverId.f15142b;
        RO mVGetStopImageUploadUrlRequest = new MVGetStopImageUploadUrlRequest();
        mVGetStopImageUploadUrlRequest.location = r;
        mVGetStopImageUploadUrlRequest.stopId = i3;
        mVGetStopImageUploadUrlRequest.mo31735m();
        mVGetStopImageUploadUrlRequest.timestamp = j;
        mVGetStopImageUploadUrlRequest.mo31736o();
        mVGetStopImageUploadUrlRequest.width = i;
        mVGetStopImageUploadUrlRequest.mo31737p();
        mVGetStopImageUploadUrlRequest.height = i2;
        mVGetStopImageUploadUrlRequest.mo31734l();
        mVGetStopImageUploadUrlRequest.fileSuffix = str;
        this.f33922v = mVGetStopImageUploadUrlRequest;
    }
}
