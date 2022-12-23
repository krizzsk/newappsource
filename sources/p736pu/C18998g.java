package p736pu;

import c00.C13717b;
import c70.C13746a;
import c70.C13752e;
import c70.C13780t;
import ce0.C21100e;
import com.moovit.app.mot.protocol.GetMotUserActivationsRequest;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBActivationsGroup;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBGetUserActivationsResponse;
import g30.C4776h;
import i30.C5265a;
import i30.C5268d;
import i30.C5269e;
import i30.C5274h;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import org.apache.thrift.TBase;
import p824tp.C19728f;

/* renamed from: pu.g */
public final class C18998g extends C13780t<GetMotUserActivationsRequest, C18998g, MVPTBGetUserActivationsResponse> {

    /* renamed from: m */
    public final ArrayList f48345m = new ArrayList(0);

    public C18998g() {
        super(MVPTBGetUserActivationsResponse.class);
    }

    /* renamed from: g */
    public final C5265a mo40706g(C13746a aVar, HttpURLConnection httpURLConnection, C5269e eVar) {
        String externalForm = httpURLConnection.getURL().toExternalForm();
        C13752e eVar2 = ((GetMotUserActivationsRequest) aVar).f33829q;
        C4776h hVar = C19728f.m47195a(eVar2.f33852a).f50165a;
        C21100e.m49373x(externalForm, "source");
        C21100e.m49373x(hVar, "metroInfo");
        return new C5274h(eVar2, externalForm, hVar, eVar);
    }

    /* renamed from: i */
    public final C5269e mo40708i(C13746a aVar, TBase tBase) {
        GetMotUserActivationsRequest getMotUserActivationsRequest = (GetMotUserActivationsRequest) aVar;
        List<MVPTBActivationsGroup> list = ((MVPTBGetUserActivationsResponse) tBase).activations;
        if (C13717b.m34258e(list)) {
            return null;
        }
        C5269e.C5270a aVar2 = new C5269e.C5270a();
        for (MVPTBActivationsGroup mVPTBActivationsGroup : list) {
            C19000i.m46112c(aVar2, mVPTBActivationsGroup.activations);
        }
        return aVar2.mo21074a();
    }

    /* renamed from: p */
    public final void mo40712p(C13746a aVar, TBase tBase, C5268d dVar) throws IOException, BadResponseException, ServerException {
        C19728f fVar = ((GetMotUserActivationsRequest) aVar).f39025w;
        List<MVPTBActivationsGroup> list = ((MVPTBGetUserActivationsResponse) tBase).activations;
        if (!C13717b.m34258e(list)) {
            for (MVPTBActivationsGroup a : list) {
                C19000i.m46110a(fVar, a, this.f48345m, dVar);
            }
        }
    }
}
