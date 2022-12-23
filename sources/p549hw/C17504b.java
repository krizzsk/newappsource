package p549hw;

import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.subscriptions.MVGetSubscriptionsResponse;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import org.apache.thrift.TBase;
import p828tt.C19759a;

/* renamed from: hw.b */
public final class C17504b extends C13780t<C17503a, C17504b, MVGetSubscriptionsResponse> {

    /* renamed from: m */
    public ArrayList f45073m;

    public C17504b() {
        super(MVGetSubscriptionsResponse.class);
    }

    /* renamed from: l */
    public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
        C17503a aVar2 = (C17503a) aVar;
        this.f45073m = C13720d.m34273c(((MVGetSubscriptionsResponse) tBase).offeredSubscriptions, (C13722f) null, new C19759a(4));
    }
}
