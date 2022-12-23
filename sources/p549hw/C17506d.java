package p549hw;

import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.subscriptions.MVGetUserSubscriptionsResponse;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.List;
import org.apache.thrift.TBase;
import p525gw.C17247b;
import p875vs.C20228e;

/* renamed from: hw.d */
public final class C17506d extends C13780t<C17505c, C17506d, MVGetUserSubscriptionsResponse> {

    /* renamed from: m */
    public List<C17247b> f45074m = Collections.emptyList();

    public C17506d() {
        super(MVGetUserSubscriptionsResponse.class);
    }

    /* renamed from: l */
    public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
        List<C17247b> list;
        C17505c cVar = (C17505c) aVar;
        MVGetUserSubscriptionsResponse mVGetUserSubscriptionsResponse = (MVGetUserSubscriptionsResponse) tBase;
        if (mVGetUserSubscriptionsResponse.mo31798f()) {
            list = C13720d.m34273c(mVGetUserSubscriptionsResponse.activeSubscriptions, (C13722f) null, new C20228e(7));
        } else {
            list = Collections.emptyList();
        }
        this.f45074m = list;
    }
}
