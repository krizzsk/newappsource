package p881vy;

import c70.C13746a;
import c70.C13780t;
import com.moovit.app.wondo.tickets.model.WondoFullScreenDisplayInfo;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.ridesharing.model.RideSharingRegistrationSteps;
import com.tranzmate.moovit.protocol.ridesharing.MVEventRegistrationSteps;
import com.tranzmate.moovit.protocol.wondo.MVWondoConfirmation;
import com.tranzmate.moovit.protocol.wondo.MVWondoRedeemRewardResponse;
import java.io.IOException;
import org.apache.thrift.TBase;
import p785ry.C19385e;

/* renamed from: vy.h */
public final class C20254h extends C13780t<C20253g, C20254h, MVWondoRedeemRewardResponse> {

    /* renamed from: m */
    public WondoFullScreenDisplayInfo f51360m = null;

    /* renamed from: n */
    public RideSharingRegistrationSteps f51361n = null;

    public C20254h() {
        super(MVWondoRedeemRewardResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        boolean z;
        C20253g gVar = (C20253g) aVar;
        MVWondoRedeemRewardResponse mVWondoRedeemRewardResponse = (MVWondoRedeemRewardResponse) tBase;
        F f = mVWondoRedeemRewardResponse.setField_;
        F f2 = MVWondoRedeemRewardResponse._Fields.CONFIRMATION;
        boolean z2 = true;
        if (f == f2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (f == f2) {
                this.f51360m = C20255i.m47823b((MVWondoConfirmation) mVWondoRedeemRewardResponse.value_);
            } else {
                StringBuilder k = C13555b.m33972k("Cannot get field 'confirmation' because union is currently set to ");
                k.append(MVWondoRedeemRewardResponse.m31988k((MVWondoRedeemRewardResponse._Fields) mVWondoRedeemRewardResponse.setField_).f63355a);
                throw new RuntimeException(k.toString());
            }
        }
        F f3 = mVWondoRedeemRewardResponse.setField_;
        F f4 = MVWondoRedeemRewardResponse._Fields.STEPS;
        if (f3 != f4) {
            z2 = false;
        }
        if (z2) {
            if (f3 == f4) {
                this.f51361n = C20255i.m47822a((MVEventRegistrationSteps) mVWondoRedeemRewardResponse.value_);
            } else {
                StringBuilder k2 = C13555b.m33972k("Cannot get field 'steps' because union is currently set to ");
                k2.append(MVWondoRedeemRewardResponse.m31988k((MVWondoRedeemRewardResponse._Fields) mVWondoRedeemRewardResponse.setField_).f63355a);
                throw new RuntimeException(k2.toString());
            }
        }
        if (this.f51361n == null) {
            C19385e.f49315c.f49316a.set((Object) null);
        }
    }
}
