package h60;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import com.moovit.view.address.Address;
import com.tranzmate.moovit.protocol.common.MVUserAddress;
import com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationSetAddressRequest;
import v40.C25754i;

/* renamed from: h60.x0 */
public final class C17369x0 extends C13778r<C17369x0, C17372y0, MVPaymentRegistrationSetAddressRequest> {
    public C17369x0(C13752e eVar, Address address) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_update_address, C17372y0.class);
        MVUserAddress x = C13749c.m34338x(address);
        RO mVPaymentRegistrationSetAddressRequest = new MVPaymentRegistrationSetAddressRequest();
        mVPaymentRegistrationSetAddressRequest.address = x;
        this.f33922v = mVPaymentRegistrationSetAddressRequest;
    }
}
