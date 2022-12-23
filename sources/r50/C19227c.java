package r50;

import androidx.fragment.app.Fragment;
import com.moovit.payment.clearance.ClearanceProvider;
import com.moovit.payment.clearance.ClearanceProviderPaymentInstructions;
import com.moovit.payment.clearance.CreditCardRequest;
import java.util.EnumSet;
import java.util.Set;
import m60.C18341a;

/* renamed from: r50.c */
public final class C19227c implements ClearanceProvider {
    /* renamed from: f */
    public final Set<ClearanceProvider.Capabilities> mo48829f() {
        return EnumSet.of(ClearanceProvider.Capabilities.REGISTER_SINGLE_PAYMENT_METHOD, ClearanceProvider.Capabilities.REGISTER_MULTI_PAYMENT_METHOD, ClearanceProvider.Capabilities.DELETE_PAYMENT_METHOD);
    }

    /* renamed from: g */
    public final Fragment mo48830g(CreditCardRequest creditCardRequest) {
        C19228d dVar = new C19228d();
        C18341a.m45148m2(dVar, creditCardRequest);
        return dVar;
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
