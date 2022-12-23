package com.moovit.umo.ads;

import com.moovit.commons.request.BadResponseException;
import com.tranzmate.moovit.protocol.ticketingV2.MVUmoAdsSdkConnectionInfo;
import com.tranzmate.moovit.protocol.ticketingV2.MVUmoAdsSdkConnectionResponse;
import java.io.IOException;
import java.net.HttpURLConnection;
import k40.C5481e;
import org.apache.thrift.TBase;
import p094g5.C4811j;
import p906wz.C20431c;

/* renamed from: com.moovit.umo.ads.b */
public final class C7873b extends C5481e<C7872a, C7873b, MVUmoAdsSdkConnectionResponse> {

    /* renamed from: g */
    public C4811j f23831g;

    public C7873b() {
        super(MVUmoAdsSdkConnectionResponse.class);
    }

    /* renamed from: e */
    public final void mo21366e(C20431c cVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException {
        boolean z;
        C4811j jVar;
        C7872a aVar = (C7872a) cVar;
        MVUmoAdsSdkConnectionResponse mVUmoAdsSdkConnectionResponse = (MVUmoAdsSdkConnectionResponse) tBase;
        F f = mVUmoAdsSdkConnectionResponse.setField_;
        F f2 = MVUmoAdsSdkConnectionResponse._Fields.SDK_CONNECTION_INFO;
        if (f == f2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            jVar = null;
        } else if (f == f2) {
            MVUmoAdsSdkConnectionInfo mVUmoAdsSdkConnectionInfo = (MVUmoAdsSdkConnectionInfo) mVUmoAdsSdkConnectionResponse.value_;
            jVar = new C4811j(mVUmoAdsSdkConnectionInfo.publisherId, mVUmoAdsSdkConnectionInfo.clientId, mVUmoAdsSdkConnectionInfo.clientSecret, mVUmoAdsSdkConnectionInfo.sdkEnv, mVUmoAdsSdkConnectionInfo.slotId);
        } else {
            MVUmoAdsSdkConnectionResponse.m28775k((MVUmoAdsSdkConnectionResponse._Fields) mVUmoAdsSdkConnectionResponse.setField_);
            throw new RuntimeException("Cannot get field 'sdkConnectionInfo' because union is currently set to sdkConnectionInfo");
        }
        this.f23831g = jVar;
        if (jVar == null) {
            throw new BadResponseException("Unsupported umo ads info type");
        }
    }
}
