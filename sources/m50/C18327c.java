package m50;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.payment.clearance.ClearanceProviderPaymentInstructions;
import com.moovit.payment.clearance.PaymentMethodToken;
import com.moovit.payment.clearance.model.Bank;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;
import n50.C18523b;
import p028ba.C1513g;
import p115i0.C5227c;
import p714ow.C18848b;
import p977zz.C20944i0;
import q50.C19080b;
import q50.C19083d;

/* renamed from: m50.c */
public class C18327c extends C19083d<PaymentMethodToken> {

    /* renamed from: x */
    public static final /* synthetic */ int f46734x = 0;

    /* renamed from: u */
    public String f46735u;

    /* renamed from: v */
    public String f46736v;

    /* renamed from: w */
    public Bank f46737w;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bank bank = (Bank) mo46782Q1().getParcelable("bank");
        this.f46737w = bank;
        if (bank == null) {
            throw new ApplicationBugException("Did you use BuckarooPaymentBankWebFormFragment.newInstance(...)?");
        }
    }

    public final void onStart() {
        super.onStart();
        this.f40822c.setTitle("");
    }

    /* renamed from: q2 */
    public final Task mo50776q2(ClearanceProviderPaymentInstructions clearanceProviderPaymentInstructions, Object obj) {
        PaymentMethodToken paymentMethodToken;
        Uri uri = (Uri) obj;
        if (!Boolean.TRUE.equals(mo46779N1(C18331g.class, new C5227c(2))) || this.f46735u == null) {
            paymentMethodToken = null;
        } else {
            paymentMethodToken = new PaymentMethodToken(this.f46735u);
        }
        String str = this.f46736v;
        if (str != null) {
            return Tasks.forResult(new C19080b.C19081a(str, paymentMethodToken));
        }
        return Tasks.forException(new BadResponseException("Purchase token can't be null!"));
    }

    /* renamed from: s2 */
    public final WebInstruction mo50777s2(String str, String str2, String str3) {
        return WebInstruction.m41735c(str, str3);
    }

    /* renamed from: t2 */
    public final Task<C20944i0<String, WebInstruction>> mo50778t2() {
        C13752e x1 = this.f40822c.mo44548x1();
        WebInstruction webInstruction = this.f48511p;
        boolean equals = Boolean.TRUE.equals(mo46779N1(C18331g.class, new C18848b(5)));
        Bank bank = this.f46737w;
        String str = webInstruction.f42777b;
        String str2 = webInstruction.f42778c;
        String str3 = webInstruction.f42779d;
        String str4 = webInstruction.f42780e;
        ClearanceProviderPaymentInstructions clearanceProviderPaymentInstructions = this.f48502n;
        C21100e.m49373x(clearanceProviderPaymentInstructions, "paymentInstructions");
        return Tasks.call(MoovitExecutors.f37327IO, new C18523b(x1, bank, str, str2, str3, str4, clearanceProviderPaymentInstructions, equals)).onSuccessTask(MoovitExecutors.MAIN_THREAD, new C1513g(this, 12));
    }

    /* renamed from: u2 */
    public final void mo50779u2() {
        getParentFragmentManager().mo3936Q();
    }

    /* renamed from: v2 */
    public final void mo50780v2() {
        getParentFragmentManager().mo3936Q();
    }

    /* renamed from: w2 */
    public final boolean mo50781w2(String str) {
        if (getContext() == null || str.startsWith("http")) {
            return false;
        }
        try {
            Intent parseUri = Intent.parseUri(str, 0);
            parseUri.addFlags(268435456);
            startActivity(parseUri);
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: x2 */
    public final void mo50782x2() {
        getParentFragmentManager().mo3936Q();
    }
}
