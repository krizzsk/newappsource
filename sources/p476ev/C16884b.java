package p476ev;

import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.common.MVPromotionSectionResponse;
import java.io.IOException;
import org.apache.thrift.TBase;
import p452dv.C16724a;
import p826tr.C19752b;

/* renamed from: ev.b */
public final class C16884b extends C13780t<C16883a, C16884b, MVPromotionSectionResponse> {

    /* renamed from: m */
    public C16724a f43907m;

    public C16884b() {
        super(MVPromotionSectionResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C16883a aVar2 = (C16883a) aVar;
        MVPromotionSectionResponse mVPromotionSectionResponse = (MVPromotionSectionResponse) tBase;
        this.f43907m = new C16724a(mVPromotionSectionResponse.sectionTitle, C13720d.m34273c(mVPromotionSectionResponse.promotions, (C13722f) null, new C19752b(4)));
    }
}
