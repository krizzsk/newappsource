package p737pv;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.ridesharing.model.Event;
import com.tranzmate.moovit.protocol.ridesharing.MVRSGetEventByIdResponse;
import d70.C16536a;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: pv.h */
public final class C19017h extends C13780t<C19016g, C19017h, MVRSGetEventByIdResponse> {

    /* renamed from: m */
    public Event f48378m = null;

    public C19017h() {
        super(MVRSGetEventByIdResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C19016g gVar = (C19016g) aVar;
        this.f48378m = C16536a.m42029a(((MVRSGetEventByIdResponse) tBase).event);
    }
}
