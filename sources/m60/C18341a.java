package m60;

import android.app.Activity;
import android.os.Bundle;
import c70.C13751d;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.clearance.ClearanceProvider;
import com.moovit.payment.clearance.CreditCardRequest;
import com.moovit.payment.clearance.PaymentMethodToken;
import com.moovit.request.UserRequestError;
import java.util.concurrent.Executor;
import p145k5.C5487f;
import p372at.C13515b;
import p435de.C16596f;
import p484ff.C16984m;
import p543hq.C17474b;
import p672ne.C18540b;
import p805su.C19543e;
import p910xf.C20481j;
import v40.C25754i;
import z20.C20806a;

/* renamed from: m60.a */
public abstract class C18341a<Result, T extends PaymentMethodToken> extends C15682c<MoovitActivity> {

    /* renamed from: o */
    public static final /* synthetic */ int f46767o = 0;

    /* renamed from: n */
    public CreditCardRequest f46768n;

    public C18341a() {
        super(MoovitActivity.class);
    }

    /* renamed from: m2 */
    public static void m45148m2(C18341a aVar, CreditCardRequest creditCardRequest) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("creditCardRequest", creditCardRequest);
        aVar.setArguments(bundle);
    }

    /* renamed from: n2 */
    public void mo50794n2(CreditCardRequest creditCardRequest, PaymentMethod paymentMethod) {
        if (this.f40822c != null) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SET_CREDIT_CARD_RESULT);
            aVar.mo49941i(AnalyticsAttributeKey.SUCCESS, true);
            mo46797j2(aVar.mo49933a());
            C20806a.C20807a aVar2 = new C20806a.C20807a("payment_method_tap");
            aVar2.mo52934b(creditCardRequest.f42590b.f42773b, "payment_context");
            aVar2.mo52935c();
            mo46786U1(ClearanceProvider.C16293a.class, new C18540b(3, creditCardRequest.f42590b.f42774c.f42605c, paymentMethod));
        }
    }

    /* renamed from: o2 */
    public void mo50795o2(Exception exc) {
        if (exc != null) {
            C16596f.m42113a().mo49364c(exc);
        }
        if (this.f40824e) {
            if (exc instanceof UserRequestError) {
                mo46795h2(C13751d.m34341b(requireContext(), (String) null, exc));
            } else {
                mo46795h2(C13751d.m34342c(requireContext(), (String) null, (Exception) null).mo47683l(C25754i.validate_credit_card_error_title).mo47678g(C25754i.validate_credit_card_error_text).mo47673b());
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CreditCardRequest creditCardRequest = (CreditCardRequest) mo46782Q1().getParcelable("creditCardRequest");
        this.f46768n = creditCardRequest;
        if (creditCardRequest == null) {
            throw new ApplicationBugException("Did you use AbstractRegistrationPaymentMethodFragment.newInstance(...)?");
        }
    }

    /* renamed from: p2 */
    public final void mo50796p2(Result result) {
        mo50590r2(this.f46768n, result).addOnSuccessListener((Executor) MoovitExecutors.COMPUTATION, new C16984m(this, 12)).addOnFailureListener((Activity) requireActivity(), (OnFailureListener) new C20481j(this, 6));
    }

    /* renamed from: q2 */
    public final void mo50797q2(T t) {
        A a = this.f40822c;
        Tasks.call(MoovitExecutors.f37327IO, new C5487f(4, this, t)).addOnSuccessListener((Activity) a, new C13515b(this, 11)).addOnFailureListener((Activity) a, (OnFailureListener) new C19543e(this, 6));
    }

    /* renamed from: r2 */
    public abstract Task<T> mo50590r2(CreditCardRequest creditCardRequest, Result result);
}
