package r60;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import ce0.C21100e;
import com.moovit.payment.registration.AccountAuthType;
import com.moovit.payment.registration.PaymentRegistrationInfo;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.moovit.payment.registration.alternative.AlternativeAuthProvider;
import java.util.regex.Pattern;
import k60.C17999a;
import n60.C18527a;
import p001a0.C0017h;
import v40.C25750e;
import v40.C25751f;

/* renamed from: r60.h */
public class C19243h extends C17999a implements AlternativeAuthProvider.C16361a {
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getChildFragmentManager().mo3923A("verification_fragment") == null) {
            AlternativeAuthProvider alternativeAuthProvider = mo50499o2().f42746d;
            if (alternativeAuthProvider != null) {
                alternativeAuthProvider.mo49026b(this);
            } else if (AccountAuthType.EMAIL.equals(mo50499o2().f42745c)) {
                PaymentRegistrationInstructions p2 = mo50500p2();
                PaymentRegistrationInfo o2 = mo50499o2();
                String str = p2.f42758b;
                String str2 = o2.f42754l;
                Bundle bundle2 = new Bundle();
                C21100e.m49373x(str, "paymentContext");
                bundle2.putString("paymentContext", str);
                C21100e.m49373x(str2, "email");
                bundle2.putString("email", str2);
                C18527a aVar = new C18527a();
                aVar.setArguments(bundle2);
                mo51660y2(aVar);
            } else {
                PaymentRegistrationInstructions p22 = mo50500p2();
                PaymentRegistrationInfo o22 = mo50499o2();
                String str3 = p22.f42758b;
                String str4 = o22.f42749g;
                String str5 = o22.f42750h;
                String str6 = o22.f42751i;
                Pattern pattern = C19234e.f48842G;
                Bundle bundle3 = new Bundle();
                C21100e.m49373x(str3, "paymentContext");
                bundle3.putString("paymentContext", str3);
                bundle3.putString("callingCode", str4);
                C21100e.m49373x(str5, "phoneNumber");
                bundle3.putString("phoneNumber", str5);
                bundle3.putString("fullPhoneNumber", str6);
                C19234e eVar = new C19234e();
                eVar.setArguments(bundle3);
                mo51660y2(eVar);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C25751f.payment_registration_step_validation_fragment, viewGroup, false);
    }

    /* renamed from: q2 */
    public final String mo49058q2() {
        if (mo50499o2().f42746d != null) {
            return "step_alternate_signup_impression";
        }
        if (AccountAuthType.EMAIL.equals(mo50499o2().f42745c)) {
            return "step_email_code";
        }
        return "step_phone_code";
    }

    /* renamed from: s2 */
    public final boolean mo50502s2() {
        return false;
    }

    /* renamed from: w2 */
    public final boolean mo50506w2() {
        return false;
    }

    /* renamed from: y2 */
    public final void mo51660y2(Fragment fragment) {
        FragmentManager childFragmentManager = getChildFragmentManager();
        C0909a K = C0017h.m54K(childFragmentManager, childFragmentManager);
        K.mo4111f(C25750e.fragment_container, fragment, "verification_fragment");
        K.mo4040d();
    }
}
