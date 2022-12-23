package q80;

import c00.C13717b;
import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicketReceiptResponse;
import java.io.IOException;
import java.util.Collections;
import m90.C12890b;
import org.apache.thrift.TBase;

/* renamed from: q80.w */
public final class C13034w extends C13780t<C13033v, C13034w, MVTicketReceiptResponse> {

    /* renamed from: m */
    public C12890b f32244m;

    public C13034w() {
        super(MVTicketReceiptResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C13033v vVar = (C13033v) aVar;
        this.f32244m = (C12890b) C13717b.m34256c(C13032u.m32945q(vVar.f51759b, Collections.singletonList(vVar.f32243w), Collections.singletonList((MVTicketReceiptResponse) tBase)));
    }

    public C13034w(C12890b bVar) {
        super(MVTicketReceiptResponse.class);
        this.f32244m = bVar;
    }
}
