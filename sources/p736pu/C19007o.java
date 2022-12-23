package p736pu;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBFinishTrainActivationResponse;
import i30.C5268d;
import i30.C5269e;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.thrift.TBase;
import p664mu.C18443f;

/* renamed from: pu.o */
public final class C19007o extends C13780t<C19006n, C19007o, MVPTBFinishTrainActivationResponse> {

    /* renamed from: m */
    public final ArrayList f48361m = new ArrayList(0);

    public C19007o() {
        super(MVPTBFinishTrainActivationResponse.class);
    }

    /* renamed from: i */
    public final C5269e mo40708i(C13746a aVar, TBase tBase) {
        C19006n nVar = (C19006n) aVar;
        C5269e.C5270a aVar2 = new C5269e.C5270a();
        C19000i.m46112c(aVar2, ((MVPTBFinishTrainActivationResponse) tBase).finishTrainActivations.activations);
        return aVar2.mo21074a();
    }

    /* renamed from: p */
    public final void mo40712p(C13746a aVar, TBase tBase, C5268d dVar) throws IOException, BadResponseException, ServerException {
        C19000i.m46110a(((C19006n) aVar).f48360w, ((MVPTBFinishTrainActivationResponse) tBase).finishTrainActivations, this.f48361m, dVar);
        C18443f.m45298d().mo50890g();
    }
}
