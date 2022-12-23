package p880vx;

import android.content.Context;
import android.os.Build;
import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.network.model.ServerId;
import com.moovit.user.LocaleInfo;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.users.MVCreateUserRequest;
import com.tranzmate.moovit.protocol.users.MVDownloadProviderKey;
import com.tranzmate.moovit.protocol.users.MVPhoneOsTypes;
import com.tranzmate.moovit.protocol.users.MVUserType;
import k40.C5479c;
import p824tp.C19721a;
import p824tp.C19731i;
import p977zz.C20975x0;
import y90.C13271e;

/* renamed from: vx.c */
public final class C20245c extends C13778r<C20245c, C20246d, MVCreateUserRequest> {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C20245c(ServerId serverId, C13752e eVar) {
        this((LatLonE6) null, serverId, eVar);
        C21100e.m49373x(serverId, "metroId");
    }

    /* renamed from: L */
    public final boolean mo20305L() {
        return false;
    }

    public C20245c(LatLonE6 latLonE6, ServerId serverId, C13752e eVar) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_create_user_request_path, C20246d.class);
        Context context = eVar.f33852a;
        C19721a aVar = C19731i.m47197a(context).f50171a;
        RO mVCreateUserRequest = new MVCreateUserRequest();
        mVCreateUserRequest.locale = C13749c.m34333s(LocaleInfo.m17919b(context));
        mVCreateUserRequest.deviceName = Build.MANUFACTURER + " " + Build.PRODUCT;
        mVCreateUserRequest.osVersion = Build.VERSION.RELEASE + "_" + Build.VERSION.SDK_INT;
        mVCreateUserRequest.phoneOsType = MVPhoneOsTypes.Android;
        mVCreateUserRequest.screenResolution = C13749c.m34339y(context);
        MVDownloadProviderKey mVDownloadProviderKey = new MVDownloadProviderKey();
        mVDownloadProviderKey.sourceKey = "";
        mVDownloadProviderKey.campaignKey = "";
        mVDownloadProviderKey.placementKey = "";
        mVCreateUserRequest.downloadProviderKey = mVDownloadProviderKey;
        mVCreateUserRequest.appsflyerId = "";
        mVCreateUserRequest.advertisingId = "";
        mVCreateUserRequest.limitAdTrackingEnabled = true;
        mVCreateUserRequest.mo35068D();
        mVCreateUserRequest.requestTime = System.currentTimeMillis();
        mVCreateUserRequest.mo35069E();
        mVCreateUserRequest.uniqueId = C20975x0.m49119f(context);
        mVCreateUserRequest.externalApiKey = "moovit_2751703405";
        mVCreateUserRequest.userType = MVUserType.findByValue(aVar.f50157h);
        mVCreateUserRequest.installationId = C13271e.m33393a(context);
        if (latLonE6 != null) {
            mVCreateUserRequest.userLocation = C13749c.m34332r(latLonE6);
        }
        if (serverId != null) {
            mVCreateUserRequest.selectedMetroAreaId = C5479c.m13667d(serverId);
            mVCreateUserRequest.mo35070F();
        }
        this.f33922v = mVCreateUserRequest;
    }
}
