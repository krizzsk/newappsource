package z90;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.user.extras.ExtraUserInfoAvailability;
import com.tranzmate.moovit.protocol.users.MVUserRegistrationStateResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: z90.c */
public final class C13345c extends C13780t<C13344b, C13345c, MVUserRegistrationStateResponse> {

    /* renamed from: m */
    public ExtraUserInfoAvailability f33135m;

    public C13345c() {
        super(MVUserRegistrationStateResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C13344b bVar = (C13344b) aVar;
        MVUserRegistrationStateResponse mVUserRegistrationStateResponse = (MVUserRegistrationStateResponse) tBase;
        this.f33135m = new ExtraUserInfoAvailability(mVUserRegistrationStateResponse.isPhoneRegistered, mVUserRegistrationStateResponse.isFBRegistered, mVUserRegistrationStateResponse.isCreditCardRegistered);
    }
}
