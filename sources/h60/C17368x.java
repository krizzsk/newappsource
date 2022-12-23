package h60;

import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationProfilesListResponse;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.thrift.TBase;
import p828tt.C19759a;

/* renamed from: h60.x */
public final class C17368x extends C13780t<C17365w, C17368x, MVPaymentRegistrationProfilesListResponse> {

    /* renamed from: m */
    public ArrayList f44760m;

    public C17368x() {
        super(MVPaymentRegistrationProfilesListResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C17365w wVar = (C17365w) aVar;
        this.f44760m = C13720d.m34273c(((MVPaymentRegistrationProfilesListResponse) tBase).profiles, (C13722f) null, new C19759a(16));
    }
}
