package t30;

import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityDamageReportsResponse;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.thrift.TBase;
import p066e0.C4454r0;

/* renamed from: t30.v */
public final class C6582v extends C13780t<C6581u, C6582v, MVMicroMobilityDamageReportsResponse> {

    /* renamed from: m */
    public ArrayList f20400m;

    public C6582v() {
        super(MVMicroMobilityDamageReportsResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C6581u uVar = (C6581u) aVar;
        this.f20400m = C13720d.m34273c(((MVMicroMobilityDamageReportsResponse) tBase).reports, (C13722f) null, new C4454r0(16));
    }
}
