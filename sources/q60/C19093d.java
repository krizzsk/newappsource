package q60;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.moovit.payment.registration.steps.mot.payment.MotPangoInstructions;
import com.moovit.payment.registration.steps.mot.payment.MotPaymentMethodInstructions;
import i60.C17559a;
import java.util.Collections;
import java.util.Set;
import k60.C17999a;
import p001a0.C0017h;
import q60.C19086a;
import q60.C19088b;
import v40.C25747b;
import v40.C25750e;
import v40.C25751f;

/* renamed from: q60.d */
public class C19093d extends C17999a implements C19088b.C19091c, C19086a.C19087a {

    /* renamed from: r */
    public MotPaymentMethodInstructions f48535r;

    /* renamed from: J0 */
    public final void mo51519J0() {
        mo50504u2((C17559a) null);
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("CONFIGURATION");
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        Fragment fragment;
        mo50505v2();
        if (getChildFragmentManager().mo3983z(C25750e.fragment_container) == null) {
            MotPaymentMethodInstructions motPaymentMethodInstructions = this.f48535r;
            MotPangoInstructions motPangoInstructions = motPaymentMethodInstructions.f42822c;
            if (motPangoInstructions != null) {
                String str = motPaymentMethodInstructions.f42821b.f42773b;
                int i = C19088b.f48519z;
                Bundle bundle = new Bundle();
                bundle.putParcelable("pangoInstructions", motPangoInstructions);
                bundle.putString("paymentContext", str);
                fragment = new C19088b();
                fragment.setArguments(bundle);
            } else {
                fragment = new C19086a();
            }
            mo51525y2(fragment);
        }
    }

    /* renamed from: i0 */
    public final void mo51523i0() {
        mo51525y2(new C19086a());
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        MotPaymentMethodInstructions motPaymentMethodInstructions = mo50500p2().f42761e;
        this.f48535r = motPaymentMethodInstructions;
        if (motPaymentMethodInstructions == null) {
            throw new IllegalStateException("Missing MOT payment method instructions");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C25751f.payment_registration_step_mot_payment_method_fragment, viewGroup, false);
    }

    /* renamed from: p1 */
    public final void mo51524p1() {
        mo50504u2((C17559a) null);
    }

    /* renamed from: q2 */
    public final String mo49058q2() {
        return "step_mot_payment_method";
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
    public final void mo51525y2(Fragment fragment) {
        FragmentManager childFragmentManager = getChildFragmentManager();
        C0909a K = C0017h.m54K(childFragmentManager, childFragmentManager);
        K.mo4112g(C25747b.slide_fragment_enter, C25747b.slide_fragment_exit, C25747b.slide_fragment_pop_enter, C25747b.slide_fragment_pop_exit);
        int i = C25750e.fragment_container;
        K.mo4111f(i, fragment, (String) null);
        if (childFragmentManager.mo3983z(i) != null) {
            K.mo4110c((String) null);
        }
        K.mo4040d();
    }
}
