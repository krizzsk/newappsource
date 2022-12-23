package m50;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import c00.C13717b;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.clearance.ClearanceProvider;
import com.moovit.payment.clearance.ClearanceProviderType;
import com.moovit.payment.clearance.CreditCardRequest;
import com.moovit.payment.clearance.model.Bank;
import java.util.List;
import m50.C18323a;
import m50.C18333i;
import m60.C18341a;
import n50.C18522a;
import p001a0.C0017h;
import p216q1.C6133b;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;
import w40.C25760c;

/* renamed from: m50.m */
public class C18340m extends C15682c<MoovitActivity> implements ClearanceProvider.C16293a, C18333i.C18334a, C18323a.C18325b {

    /* renamed from: o */
    public static final /* synthetic */ int f46765o = 0;

    /* renamed from: n */
    public CreditCardRequest f46766n;

    public C18340m() {
        super(MoovitActivity.class);
    }

    /* renamed from: U */
    public final void mo48833U(ClearanceProviderType clearanceProviderType, String str) {
        throw new ApplicationBugException("Host did not implement callback!");
    }

    /* renamed from: h0 */
    public final void mo50775h0(Bank bank) {
        CreditCardRequest creditCardRequest = this.f46766n;
        Bundle bundle = new Bundle();
        bundle.putParcelable("bank", bank);
        C18337j jVar = new C18337j();
        bundle.putParcelable("creditCardRequest", creditCardRequest);
        jVar.setArguments(bundle);
        mo50793n2(jVar, true);
    }

    /* renamed from: m2 */
    public final Fragment mo50792m2(int i) {
        switch (i) {
            case 1:
                CreditCardRequest creditCardRequest = this.f46766n;
                C18338k kVar = new C18338k();
                C18341a.m45148m2(kVar, creditCardRequest);
                return kVar;
            case 2:
            case 7:
                return C18323a.m45100m2(this.f46766n.f42590b, i);
            case 3:
            case 4:
            case 5:
            case 6:
                CreditCardRequest creditCardRequest2 = this.f46766n;
                Bundle bundle = new Bundle();
                bundle.putInt("type", i);
                C18339l lVar = new C18339l();
                bundle.putParcelable("creditCardRequest", creditCardRequest2);
                lVar.setArguments(bundle);
                return lVar;
            default:
                throw new IllegalStateException(C16759e.m42349e("Unknown BuckarooPaymentMethod type: ", i));
        }
    }

    /* renamed from: n2 */
    public final void mo50793n2(C15682c cVar, boolean z) {
        FragmentManager childFragmentManager = getChildFragmentManager();
        C0909a K = C0017h.m54K(childFragmentManager, childFragmentManager);
        K.mo4111f(C25750e.fragment_container, cVar, (String) null);
        if (z) {
            K.mo4110c((String) null);
        }
        K.mo4040d();
    }

    /* renamed from: o1 */
    public final void mo48834o1(ClearanceProviderType clearanceProviderType, PaymentMethod paymentMethod) {
        mo46786U1(ClearanceProvider.C16293a.class, new C25760c(1, clearanceProviderType, paymentMethod));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        CreditCardRequest creditCardRequest = (CreditCardRequest) mo46782Q1().getParcelable("creditCardRequest");
        this.f46766n = creditCardRequest;
        if (creditCardRequest == null) {
            throw new ApplicationBugException("Did you use BuckarooRegistrationFragment.newInstance(...)?");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C25751f.buackroo_payment_fragment, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        List<Integer> a = C18522a.m45409a(this.f46766n.f42590b.f42774c.f42606d.get("buckarooSupportedPaymentMethodsKey"));
        if (getChildFragmentManager().mo3983z(C25750e.fragment_container) == null) {
            if (a.size() == 1) {
                mo50793n2((C15682c) mo50792m2(((Integer) C13717b.m34256c(a)).intValue()), false);
            } else {
                mo50793n2(C18333i.m45129n2(this.f46766n.f42590b, getResources().getString(C25754i.payment_one_off_mm_title), C6133b.m14694a(getResources().getString(C25754i.payment_one_off_mm_message)), false), false);
            }
        }
    }

    /* renamed from: u0 */
    public final void mo50787u0(int i) {
        mo50793n2((C15682c) mo50792m2(i), true);
    }
}
