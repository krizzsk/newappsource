package p736pu;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBActivationsGroup;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBSetActivationResponse;
import i30.C5268d;
import i30.C5269e;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.thrift.TBase;
import p664mu.C18443f;

/* renamed from: pu.q */
public final class C19009q extends C13780t<C19008p, C19009q, MVPTBSetActivationResponse> {

    /* renamed from: m */
    public final ArrayList f48364m = new ArrayList(0);

    public C19009q() {
        super(MVPTBSetActivationResponse.class);
    }

    /* renamed from: i */
    public final C5269e mo40708i(C13746a aVar, TBase tBase) {
        C19008p pVar = (C19008p) aVar;
        C5269e.C5270a aVar2 = new C5269e.C5270a();
        MVPTBActivationsGroup mVPTBActivationsGroup = ((MVPTBSetActivationResponse) tBase).activationsGroup;
        if (mVPTBActivationsGroup != null) {
            C19000i.m46112c(aVar2, mVPTBActivationsGroup.activations);
        }
        return aVar2.mo21074a();
    }

    /* renamed from: p */
    public final void mo40712p(C13746a aVar, TBase tBase, C5268d dVar) throws IOException, BadResponseException, ServerException {
        C19000i.m46110a(((C19008p) aVar).f48362w, ((MVPTBSetActivationResponse) tBase).activationsGroup, this.f48364m, dVar);
        C18443f.m45298d().mo50890g();
    }
}
