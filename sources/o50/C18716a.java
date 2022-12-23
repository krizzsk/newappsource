package o50;

import androidx.fragment.app.Fragment;
import com.moovit.payment.clearance.ClearanceProvider;
import com.moovit.payment.clearance.ClearanceProviderPaymentInstructions;
import com.moovit.payment.clearance.CreditCardRequest;
import java.util.EnumSet;
import java.util.Set;
import m60.C18341a;

/* renamed from: o50.a */
public final class C18716a implements ClearanceProvider {
    /* renamed from: f */
    public final Set<ClearanceProvider.Capabilities> mo48829f() {
        return EnumSet.of(ClearanceProvider.Capabilities.REGISTER_SINGLE_PAYMENT_METHOD, ClearanceProvider.Capabilities.CHANGE_SINGLE_PAYMENT_METHOD);
    }

    /* renamed from: g */
    public final Fragment mo48830g(CreditCardRequest creditCardRequest) {
        C18717b bVar = new C18717b();
        C18341a.m45148m2(bVar, creditCardRequest);
        return bVar;
    }

    /* renamed from: h */
    public final /* synthetic */ Fragment mo48831h(ClearanceProviderPaymentInstructions clearanceProviderPaymentInstructions) {
        C16530d.m42008a(this);
        throw null;
    }

    /* renamed from: i */
    public final String mo48832i(String str) {
        return str;
    }
}
