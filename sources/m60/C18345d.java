package m60;

import c70.C13751d;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.payment.clearance.CreditCardToken;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;
import p555ie.C17589h;
import p977zz.C20944i0;
import v40.C25754i;

/* renamed from: m60.d */
public abstract class C18345d extends C18346e<CreditCardToken> {

    /* renamed from: u */
    public static final /* synthetic */ int f46775u = 0;

    /* renamed from: u2 */
    public final Task<C20944i0<String, WebInstruction>> mo50591u2() {
        return Tasks.call(MoovitExecutors.f37327IO, new C17589h(this, 5));
    }

    /* renamed from: v2 */
    public final void mo50592v2() {
        mo50800z2();
    }

    /* renamed from: w2 */
    public final void mo50593w2() {
        mo50800z2();
    }

    /* renamed from: y2 */
    public final void mo50595y2() {
        mo50800z2();
    }

    /* renamed from: z2 */
    public final void mo50800z2() {
        mo46795h2(C13751d.m34342c(requireContext(), (String) null, (Exception) null).mo47683l(C25754i.validate_credit_card_error_title).mo47678g(C25754i.validate_credit_card_error_text).mo47673b());
    }
}
