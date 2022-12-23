package s50;

import c70.C13752e;
import com.moovit.payment.clearance.ClearanceProviderPaymentInstructions;
import com.moovit.payment.clearance.ClearanceProviderType;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;
import l50.C18173c;
import l50.C18174d;

/* renamed from: s50.b */
public class C19432b extends C18173c {
    /* renamed from: t2 */
    public final WebInstruction mo50790t2(String str, String str2, String str3) {
        return WebInstruction.m41734b(str, str3);
    }

    /* renamed from: z2 */
    public final C18174d mo50596z2(C13752e eVar, WebInstruction webInstruction) {
        return new C18174d(eVar, ClearanceProviderType.STRIPE, webInstruction, (String) null, (ClearanceProviderPaymentInstructions) null, true);
    }
}
