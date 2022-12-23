package m50;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.moovit.payment.clearance.ClearanceProvider;
import com.moovit.payment.clearance.ClearanceProviderPaymentInstructions;
import com.moovit.payment.clearance.CreditCardRequest;
import java.io.IOException;
import java.util.EnumSet;
import java.util.Set;
import n50.C18522a;

/* renamed from: m50.b */
public final class C18326b implements ClearanceProvider {
    /* renamed from: f */
    public final Set<ClearanceProvider.Capabilities> mo48829f() {
        return EnumSet.of(ClearanceProvider.Capabilities.REGISTER_SINGLE_PAYMENT_METHOD, ClearanceProvider.Capabilities.REGISTER_MULTI_PAYMENT_METHOD, ClearanceProvider.Capabilities.DELETE_PAYMENT_METHOD, ClearanceProvider.Capabilities.PAYMENT);
    }

    /* renamed from: g */
    public final Fragment mo48830g(CreditCardRequest creditCardRequest) {
        int i = C18340m.f46765o;
        Bundle bundle = new Bundle();
        bundle.putParcelable("creditCardRequest", creditCardRequest);
        C18340m mVar = new C18340m();
        mVar.setArguments(bundle);
        return mVar;
    }

    /* renamed from: h */
    public final Fragment mo48831h(ClearanceProviderPaymentInstructions clearanceProviderPaymentInstructions) {
        int i = C18331g.f46746o;
        Bundle bundle = new Bundle();
        bundle.putParcelable("paymentInstructions", clearanceProviderPaymentInstructions);
        C18331g gVar = new C18331g();
        gVar.setArguments(bundle);
        return gVar;
    }

    /* renamed from: i */
    public final String mo48832i(String str) throws IOException {
        return C18522a.m45411c(str);
    }
}
