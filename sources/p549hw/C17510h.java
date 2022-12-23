package p549hw;

import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.subscriptions.MVUpdateSubscriptionsPurchaseResponse;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.List;
import org.apache.thrift.TBase;
import p525gw.C17247b;
import p900wt.C20415e;

/* renamed from: hw.h */
public final class C17510h extends C13780t<C17509g, C17510h, MVUpdateSubscriptionsPurchaseResponse> {

    /* renamed from: m */
    public List<C17247b> f45078m = Collections.emptyList();

    public C17510h() {
        super(MVUpdateSubscriptionsPurchaseResponse.class);
    }

    /* renamed from: l */
    public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
        List<C17247b> list;
        C17509g gVar = (C17509g) aVar;
        MVUpdateSubscriptionsPurchaseResponse mVUpdateSubscriptionsPurchaseResponse = (MVUpdateSubscriptionsPurchaseResponse) tBase;
        if (mVUpdateSubscriptionsPurchaseResponse.mo31839f()) {
            list = C13720d.m34273c(mVUpdateSubscriptionsPurchaseResponse.activeSubscriptions, (C13722f) null, new C20415e(2));
        } else {
            list = Collections.emptyList();
        }
        this.f45078m = list;
    }
}
