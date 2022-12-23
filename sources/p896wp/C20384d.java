package p896wp;

import c70.C13752e;
import c70.C13778r;
import com.moovit.ads.AdvertisingInfo;
import com.tranzmate.moovit.protocol.users.MVSetAdvertisingInfoRequest;
import p824tp.C19746x;

/* renamed from: wp.d */
public final class C20384d extends C13778r<C20384d, C20385e, MVSetAdvertisingInfoRequest> {
    public C20384d(C13752e eVar, AdvertisingInfo advertisingInfo) {
        super(eVar, C19746x.server_path_app_server_secured_url, C19746x.api_path_set_advertising_info, C20385e.class);
        RO mVSetAdvertisingInfoRequest = new MVSetAdvertisingInfoRequest(advertisingInfo.f37363b, advertisingInfo.f37364c, advertisingInfo.f37366e);
        String str = advertisingInfo.f37365d;
        if (str != null) {
            mVSetAdvertisingInfoRequest.appSetId = str;
        }
        this.f33922v = mVSetAdvertisingInfoRequest;
    }
}
