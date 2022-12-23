package p520gr;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.carpool.MVAssignCouponToPassengerRequest;

/* renamed from: gr.c */
public final class C17222c extends C13778r<C17222c, C17223d, MVAssignCouponToPassengerRequest> {
    public C17222c(C13752e eVar, String str) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_carpool_send_coupon_code, C17223d.class);
        RO mVAssignCouponToPassengerRequest = new MVAssignCouponToPassengerRequest();
        mVAssignCouponToPassengerRequest.couponCode = str;
        this.f33922v = mVAssignCouponToPassengerRequest;
    }
}
