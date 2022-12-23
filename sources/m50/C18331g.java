package m50;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.clearance.ClearanceProvider;
import com.moovit.payment.clearance.ClearanceProviderPaymentInstructions;
import com.moovit.payment.clearance.ClearanceProviderType;
import com.moovit.payment.clearance.model.Bank;
import m50.C18323a;
import m50.C18333i;
import p001a0.C0017h;
import p028ba.C1512f;
import p672ne.C18540b;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;

/* renamed from: m50.g */
public class C18331g extends C15682c<MoovitActivity> implements ClearanceProvider.C16293a, C18333i.C18334a, C18323a.C18325b {

    /* renamed from: o */
    public static final /* synthetic */ int f46746o = 0;

    /* renamed from: n */
    public ClearanceProviderPaymentInstructions f46747n;

    public C18331g() {
        super(MoovitActivity.class);
    }

    /* renamed from: U */
    public final void mo48833U(ClearanceProviderType clearanceProviderType, String str) {
        mo46786U1(ClearanceProvider.C16293a.class, new C18540b(2, clearanceProviderType, str));
    }

    /* renamed from: h0 */
    public final void mo50775h0(Bank bank) {
        ClearanceProviderPaymentInstructions clearanceProviderPaymentInstructions = this.f46747n;
        Bundle bundle = new Bundle();
        bundle.putParcelable("bank", bank);
        C18327c cVar = new C18327c();
        bundle.putParcelable("paymentInstructions", clearanceProviderPaymentInstructions);
        cVar.setArguments(bundle);
        mo50786n2("payment_fragment_bank", cVar, true);
    }

    /* renamed from: m2 */
    public final boolean mo50785m2() {
        C18333i iVar = (C18333i) getChildFragmentManager().mo3923A("payment_fragment_chooser");
        if (iVar == null || !Boolean.TRUE.equals(iVar.mo50788m2())) {
            return false;
        }
        return true;
    }

    /* renamed from: n2 */
    public final void mo50786n2(String str, C15682c cVar, boolean z) {
        FragmentManager childFragmentManager = getChildFragmentManager();
        C0909a K = C0017h.m54K(childFragmentManager, childFragmentManager);
        K.mo4111f(C25750e.fragment_container, cVar, str);
        if (z) {
            K.mo4110c((String) null);
        }
        K.mo4040d();
    }

    /* renamed from: o1 */
    public final void mo48834o1(ClearanceProviderType clearanceProviderType, PaymentMethod paymentMethod) {
        mo46786U1(ClearanceProvider.C16293a.class, new C1512f(6, clearanceProviderType, paymentMethod));
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ClearanceProviderPaymentInstructions clearanceProviderPaymentInstructions = (ClearanceProviderPaymentInstructions) mo46782Q1().getParcelable("paymentInstructions");
        this.f46747n = clearanceProviderPaymentInstructions;
        if (clearanceProviderPaymentInstructions == null) {
            throw new ApplicationBugException("Did you use BuckarooPaymentFragment.newInstance(...)?");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C25751f.buackroo_payment_fragment, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getChildFragmentManager().mo3983z(C25750e.fragment_container) == null) {
            Resources resources = getResources();
            mo50786n2("payment_fragment_chooser", C18333i.m45129n2(this.f46747n.f42587e, resources.getString(C25754i.payment_one_off_title), resources.getString(C25754i.payment_one_off_subtitle), true), false);
        }
    }

    /* renamed from: u0 */
    public final void mo50787u0(int i) {
        C15682c cVar;
        String e = C16759e.m42349e("payment_fragment_method_", i);
        switch (i) {
            case 1:
                ClearanceProviderPaymentInstructions clearanceProviderPaymentInstructions = this.f46747n;
                C18329e eVar = new C18329e();
                Bundle bundle = new Bundle();
                bundle.putParcelable("paymentInstructions", clearanceProviderPaymentInstructions);
                eVar.setArguments(bundle);
                cVar = eVar;
                break;
            case 2:
            case 7:
                cVar = C18323a.m45100m2(this.f46747n.f42587e, i);
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                ClearanceProviderPaymentInstructions clearanceProviderPaymentInstructions2 = this.f46747n;
                Bundle bundle2 = new Bundle();
                bundle2.putInt("type", i);
                cVar = new C18330f();
                bundle2.putParcelable("paymentInstructions", clearanceProviderPaymentInstructions2);
                cVar.setArguments(bundle2);
                break;
            default:
                throw new IllegalStateException(C16759e.m42349e("Unknown BuckarooPaymentMethod type: ", i));
        }
        mo50786n2(e, cVar, true);
    }
}
