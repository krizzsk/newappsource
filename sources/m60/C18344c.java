package m60;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.marketing.MarketingEventImpressionBinder;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.clearance.ClearanceProvider;
import com.moovit.payment.clearance.ClearanceProviderType;
import com.moovit.payment.clearance.CreditCardRequest;
import com.moovit.payment.registration.steps.p419cc.CreditCardInstructions;
import k60.C17999a;
import p001a0.C0017h;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;
import z20.C20806a;

/* renamed from: m60.c */
public class C18344c extends C17999a implements ClearanceProvider.C16293a {
    /* renamed from: U */
    public final void mo48833U(ClearanceProviderType clearanceProviderType, String str) {
        throw new ApplicationBugException("Host did not implement callback!");
    }

    /* renamed from: o1 */
    public final void mo48834o1(ClearanceProviderType clearanceProviderType, PaymentMethod paymentMethod) {
        mo50503t2();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C25751f.payment_registration_step_credit_card_fragment, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        C20806a.C20807a aVar = new C20806a.C20807a("payment_method_view");
        aVar.mo52934b(mo50500p2().f42758b, "payment_context");
        MarketingEventImpressionBinder.m41586a(this, aVar.mo52933a());
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        CreditCardInstructions y2 = mo50799y2();
        Fragment g = y2.f42774c.f42605c.getClearanceProvider().mo48830g(new CreditCardRequest(y2, CreditCardRequest.Action.ADD, true, C25754i.payment_registration_enter_credit_card_title, C25754i.payment_registration_enter_credit_card_subtitle));
        FragmentManager childFragmentManager = getChildFragmentManager();
        C0909a K = C0017h.m54K(childFragmentManager, childFragmentManager);
        K.mo4111f(C25750e.card_form_container, g, "add_credit_card_fragment");
        K.mo4040d();
    }

    /* renamed from: q2 */
    public String mo49058q2() {
        return "step_credit_card";
    }

    /* renamed from: w2 */
    public final boolean mo50506w2() {
        return false;
    }

    /* renamed from: y2 */
    public CreditCardInstructions mo50799y2() {
        return mo50500p2().f42760d;
    }
}
