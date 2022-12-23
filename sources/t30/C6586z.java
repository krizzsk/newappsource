package t30;

import c00.C13720d;
import c00.C13722f;
import c40.C1779c;
import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityZonesResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import org.apache.thrift.TBase;
import p875vs.C20228e;

/* renamed from: t30.z */
public final class C6586z extends C13780t<C6585y, C6586z, MVMicroMobilityZonesResponse> {

    /* renamed from: m */
    public List<C1779c> f20403m = Collections.emptyList();

    public C6586z() {
        super(MVMicroMobilityZonesResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        List<C1779c> list;
        C6585y yVar = (C6585y) aVar;
        MVMicroMobilityZonesResponse mVMicroMobilityZonesResponse = (MVMicroMobilityZonesResponse) tBase;
        if (mVMicroMobilityZonesResponse.mo29052f()) {
            list = C13720d.m34273c(mVMicroMobilityZonesResponse.zones, (C13722f) null, new C20228e(18));
        } else {
            list = Collections.emptyList();
        }
        this.f20403m = list;
    }
}
