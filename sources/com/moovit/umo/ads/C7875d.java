package com.moovit.umo.ads;

import com.moovit.commons.request.BadResponseException;
import com.tranzmate.moovit.protocol.ticketingV2.MVUmoRefreshAccessTokenResponse;
import java.io.IOException;
import java.net.HttpURLConnection;
import k40.C5481e;
import org.apache.thrift.TBase;
import p906wz.C20431c;

/* renamed from: com.moovit.umo.ads.d */
public final class C7875d extends C5481e<C7874c, C7875d, MVUmoRefreshAccessTokenResponse> {

    /* renamed from: g */
    public String f23832g;

    /* renamed from: h */
    public long f23833h;

    public C7875d() {
        super(MVUmoRefreshAccessTokenResponse.class);
    }

    /* renamed from: e */
    public final void mo21366e(C20431c cVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException {
        String str;
        long j;
        C7874c cVar2 = (C7874c) cVar;
        MVUmoRefreshAccessTokenResponse mVUmoRefreshAccessTokenResponse = (MVUmoRefreshAccessTokenResponse) tBase;
        if (mVUmoRefreshAccessTokenResponse.mo33250f()) {
            str = mVUmoRefreshAccessTokenResponse.accessToken;
        } else {
            str = null;
        }
        this.f23832g = str;
        if (mVUmoRefreshAccessTokenResponse.mo33251g()) {
            j = mVUmoRefreshAccessTokenResponse.expirationTime;
        } else {
            j = 0;
        }
        this.f23833h = j;
    }
}
