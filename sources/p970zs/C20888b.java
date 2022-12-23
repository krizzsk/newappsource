package p970zs;

import c00.C13722f;
import com.moovit.payment.gateway.PaymentGateway;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.payment.gateway.PaymentGatewayType;
import com.moovit.ticketing.storedvalue.StoredValueStatus;
import h90.C12739a;
import java.util.HashSet;
import p977zz.C20975x0;
import s90.C13078f;
import zendesk.support.HelpItem;

/* renamed from: zs.b */
public final /* synthetic */ class C20888b implements C13722f {

    /* renamed from: b */
    public final /* synthetic */ int f52633b;

    public /* synthetic */ C20888b(int i) {
        this.f52633b = i;
    }

    /* renamed from: o */
    public final boolean mo19661o(Object obj) {
        switch (this.f52633b) {
            case 0:
                HelpItem helpItem = (HelpItem) obj;
                if (helpItem.getViewType() != 2 || helpItem.getId() == null) {
                    return true;
                }
                return false;
            case 1:
                int i = PaymentGatewayFragment.f42661y;
                return C20975x0.m49118e(PaymentGatewayType.PAYMENT_METHOD, ((PaymentGateway) obj).getType());
            default:
                HashSet hashSet = C13078f.f32353s;
                if (((C12739a) obj).f31470d == StoredValueStatus.LOW_BALANCE) {
                    return true;
                }
                return false;
        }
    }
}
