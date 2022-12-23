package p661mr;

import c70.C13746a;
import c70.C13749c;
import c70.C13780t;
import com.moovit.app.carpool.referral.CarpoolReferralCouponDetails;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.carpool.MVCarPoolCoupon;
import com.tranzmate.moovit.protocol.carpool.MVCarPoolCouponResponse;
import java.io.IOException;
import java.net.HttpURLConnection;
import org.apache.thrift.TBase;

/* renamed from: mr.b */
public final class C18425b extends C13780t<C18424a, C18425b, MVCarPoolCouponResponse> {

    /* renamed from: m */
    public CarpoolReferralCouponDetails f46974m;

    public C18425b() {
        super(MVCarPoolCouponResponse.class);
    }

    /* renamed from: l */
    public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
        C18424a aVar2 = (C18424a) aVar;
        MVCarPoolCoupon mVCarPoolCoupon = ((MVCarPoolCouponResponse) tBase).coupon;
        this.f46974m = new CarpoolReferralCouponDetails(mVCarPoolCoupon.code, mVCarPoolCoupon.landingPageUrl, mVCarPoolCoupon.passengerCreditValidityDays, C13749c.m34317c(mVCarPoolCoupon.driverBonusAmount), C13749c.m34317c(mVCarPoolCoupon.passengerCreditAmount));
    }
}
