package p736pu;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.ptb.activations.MVPTBSetActivationByLocationResponse;
import i30.C5268d;
import i30.C5269e;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.thrift.TBase;
import p664mu.C18443f;

/* renamed from: pu.m */
public final class C19005m extends C13780t<C19004l, C19005m, MVPTBSetActivationByLocationResponse> {

    /* renamed from: m */
    public final ArrayList f48359m = new ArrayList(0);

    public C19005m() {
        super(MVPTBSetActivationByLocationResponse.class);
    }

    /* renamed from: i */
    public final C5269e mo40708i(C13746a aVar, TBase tBase) {
        C19004l lVar = (C19004l) aVar;
        C5269e.C5270a aVar2 = new C5269e.C5270a();
        C19000i.m46112c(aVar2, ((MVPTBSetActivationByLocationResponse) tBase).activationsGroup.activations);
        return aVar2.mo21074a();
    }

    /* renamed from: p */
    public final void mo40712p(C13746a aVar, TBase tBase, C5268d dVar) throws IOException, BadResponseException, ServerException {
        C19000i.m46110a(((C19004l) aVar).f48355w, ((MVPTBSetActivationByLocationResponse) tBase).activationsGroup, this.f48359m, dVar);
        C18443f.m45298d().mo50890g();
        if (this.f48359m.isEmpty()) {
            throw new BadResponseException("Activations may not be empty!");
        }
    }
}
