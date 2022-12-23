package u50;

import androidx.fragment.app.Fragment;
import com.moovit.payment.clearance.ClearanceProvider;
import com.moovit.payment.clearance.ClearanceProviderPaymentInstructions;
import com.moovit.payment.clearance.CreditCardRequest;
import java.util.Collections;
import java.util.Set;

/* renamed from: u50.a */
public final class C19875a implements ClearanceProvider {
    /* renamed from: f */
    public final Set<ClearanceProvider.Capabilities> mo48829f() {
        return Collections.emptySet();
    }

    /* renamed from: g */
    public final Fragment mo48830g(CreditCardRequest creditCardRequest) {
        throw new UnsupportedOperationException("Wunder does not support tokenization!");
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
