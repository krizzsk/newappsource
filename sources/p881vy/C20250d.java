package p881vy;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.image.model.UriImage;
import com.tranzmate.moovit.protocol.wondo.MVWondoInviteResponse;
import java.io.IOException;
import org.apache.thrift.TBase;
import p833ty.C19793a;

/* renamed from: vy.d */
public final class C20250d extends C13780t<C20249c, C20250d, MVWondoInviteResponse> {

    /* renamed from: m */
    public C19793a f51354m;

    public C20250d() {
        super(MVWondoInviteResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C20249c cVar = (C20249c) aVar;
        MVWondoInviteResponse mVWondoInviteResponse = (MVWondoInviteResponse) tBase;
        try {
            this.f51354m = new C19793a(UriImage.m40912c(mVWondoInviteResponse.imageUrl, new String[0]), mVWondoInviteResponse.title, mVWondoInviteResponse.subtitle, mVWondoInviteResponse.actionText, mVWondoInviteResponse.legalUrl, mVWondoInviteResponse.shareSubject, mVWondoInviteResponse.shareDescription);
        } catch (Exception e) {
            throw new BadResponseException("Unable to decode wondo invite.", e);
        }
    }
}
