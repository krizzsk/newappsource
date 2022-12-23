package m50;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import c70.C13752e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.payment.clearance.ClearanceProviderPaymentInstructions;
import com.moovit.payment.clearance.CreditCardRequest;
import com.moovit.payment.clearance.PaymentMethodToken;
import com.moovit.payment.clearance.model.Bank;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;
import h60.C17327j1;
import m60.C18346e;
import n50.C18523b;
import p977zz.C20944i0;

/* renamed from: m50.j */
public class C18337j extends C18346e<PaymentMethodToken> {

    /* renamed from: w */
    public static final /* synthetic */ int f46761w = 0;

    /* renamed from: u */
    public String f46762u;

    /* renamed from: v */
    public Bank f46763v;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bank bank = (Bank) mo46782Q1().getParcelable("bank");
        this.f46763v = bank;
        if (bank == null) {
            throw new ApplicationBugException("Did you use BuckarooRegistrationBankFormFragment.newInstance(...)?");
        }
    }

    public final void onStart() {
        super.onStart();
        this.f40822c.setTitle("");
    }

    /* renamed from: r2 */
    public final Task mo50590r2(CreditCardRequest creditCardRequest, Object obj) {
        Uri uri = (Uri) obj;
        if (this.f46762u != null) {
            return Tasks.forResult(new PaymentMethodToken(this.f46762u));
        }
        return Tasks.forException(new BadResponseException("Token can't be null!"));
    }

    /* renamed from: t2 */
    public final WebInstruction mo50790t2(String str, String str2, String str3) {
        return WebInstruction.m41735c(str, str3);
    }

    /* renamed from: u2 */
    public final Task<C20944i0<String, WebInstruction>> mo50591u2() {
        C13752e x1 = this.f40822c.mo44548x1();
        WebInstruction webInstruction = this.f46777p;
        return Tasks.call(MoovitExecutors.f37327IO, new C18523b(x1, this.f46763v, webInstruction.f42777b, webInstruction.f42778c, webInstruction.f42779d, webInstruction.f42780e, (ClearanceProviderPaymentInstructions) null, true)).onSuccessTask(MoovitExecutors.MAIN_THREAD, new C17327j1(this, 22));
    }

    /* renamed from: v2 */
    public final void mo50592v2() {
        getParentFragmentManager().mo3936Q();
    }

    /* renamed from: w2 */
    public final void mo50593w2() {
        getParentFragmentManager().mo3936Q();
    }

    /* renamed from: x2 */
    public final boolean mo50594x2(String str) {
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

    /* renamed from: y2 */
    public final void mo50595y2() {
        getParentFragmentManager().mo3936Q();
    }
}
