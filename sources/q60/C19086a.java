package q60;

import ce0.C21100e;
import com.moovit.payment.registration.steps.mot.payment.MotPaymentMethodInstructions;
import com.moovit.payment.registration.steps.p419cc.CreditCardInstructions;
import m60.C18344c;
import p009a8.C0114n;

/* renamed from: q60.a */
public class C19086a extends C18344c {

    /* renamed from: r */
    public static final /* synthetic */ int f48518r = 0;

    /* renamed from: q60.a$a */
    public interface C19087a {
        /* renamed from: J0 */
        void mo51519J0();
    }

    static {
        Class<C19086a> cls = C19086a.class;
    }

    /* renamed from: q2 */
    public final String mo49058q2() {
        return "substep_mot_credit_card";
    }

    /* renamed from: t2 */
    public final void mo50503t2() {
        mo46786U1(C19087a.class, new C0114n(17));
    }

    /* renamed from: y2 */
    public final CreditCardInstructions mo50799y2() {
        MotPaymentMethodInstructions motPaymentMethodInstructions = mo50500p2().f42761e;
        C21100e.m49373x(motPaymentMethodInstructions, "motPaymentMethodInstructions");
        return motPaymentMethodInstructions.f42821b;
    }
}
