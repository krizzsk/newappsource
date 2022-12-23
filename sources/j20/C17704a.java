package j20;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.moovit.protocol.search.MVForwardGeocodingRequest;
import p824tp.C19746x;

/* renamed from: j20.a */
public final class C17704a extends C13778r<C17704a, C17705b, MVForwardGeocodingRequest> {
    public C17704a(C13752e eVar, String str) {
        super(eVar, C19746x.api_path_forward_geocoder, C17705b.class);
        int i = eVar.f33853b.f50160a.f32927c.f15142b;
        RO mVForwardGeocodingRequest = new MVForwardGeocodingRequest();
        mVForwardGeocodingRequest.query = str;
        mVForwardGeocodingRequest.metroAreaId = i;
        mVForwardGeocodingRequest.mo31440i();
        this.f33922v = mVForwardGeocodingRequest;
    }
}
