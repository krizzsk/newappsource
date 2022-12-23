package p881vy;

import c70.C13746a;
import c70.C13780t;
import com.moovit.app.wondo.tickets.model.WondoFullScreenDisplayInfo;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.ridesharing.model.RideSharingRegistrationSteps;
import com.tranzmate.moovit.protocol.ridesharing.MVEventRegistrationSteps;
import com.tranzmate.moovit.protocol.wondo.MVWondoConfirmation;
import com.tranzmate.moovit.protocol.wondo.MVWondoPurchaseOfferResponse;
import java.io.IOException;
import org.apache.thrift.TBase;
import p785ry.C19385e;

/* renamed from: vy.f */
public final class C20252f extends C13780t<C20251e, C20252f, MVWondoPurchaseOfferResponse> {

    /* renamed from: m */
    public WondoFullScreenDisplayInfo f51356m = null;

    /* renamed from: n */
    public RideSharingRegistrationSteps f51357n = null;

    public C20252f() {
        super(MVWondoPurchaseOfferResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        boolean z;
        C20251e eVar = (C20251e) aVar;
        MVWondoPurchaseOfferResponse mVWondoPurchaseOfferResponse = (MVWondoPurchaseOfferResponse) tBase;
        F f = mVWondoPurchaseOfferResponse.setField_;
        F f2 = MVWondoPurchaseOfferResponse._Fields.CONFIRMATION;
        boolean z2 = true;
        if (f == f2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (f == f2) {
                this.f51356m = C20255i.m47823b((MVWondoConfirmation) mVWondoPurchaseOfferResponse.value_);
            } else {
                StringBuilder k = C13555b.m33972k("Cannot get field 'confirmation' because union is currently set to ");
                k.append(MVWondoPurchaseOfferResponse.m31969k((MVWondoPurchaseOfferResponse._Fields) mVWondoPurchaseOfferResponse.setField_).f63355a);
                throw new RuntimeException(k.toString());
            }
        }
        F f3 = mVWondoPurchaseOfferResponse.setField_;
        F f4 = MVWondoPurchaseOfferResponse._Fields.STEPS;
        if (f3 != f4) {
            z2 = false;
        }
        if (z2) {
            if (f3 == f4) {
                this.f51357n = C20255i.m47822a((MVEventRegistrationSteps) mVWondoPurchaseOfferResponse.value_);
            } else {
                StringBuilder k2 = C13555b.m33972k("Cannot get field 'steps' because union is currently set to ");
                k2.append(MVWondoPurchaseOfferResponse.m31969k((MVWondoPurchaseOfferResponse._Fields) mVWondoPurchaseOfferResponse.setField_).f63355a);
                throw new RuntimeException(k2.toString());
            }
        }
        if (this.f51357n == null) {
            C19385e.f49315c.f49316a.set((Object) null);
        }
    }
}
