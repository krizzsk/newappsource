package m50;

import android.content.Intent;
import android.net.Uri;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.commons.request.BadResponseException;
import com.moovit.payment.clearance.ClearanceProviderPaymentInstructions;
import com.moovit.payment.clearance.ClearanceProviderType;
import com.moovit.payment.clearance.PaymentMethodToken;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;
import l50.C18174d;
import n10.C18505b;
import n50.C18522a;
import p009a8.C0111k;
import p373au.C13533e;
import p977zz.C20944i0;
import q50.C19080b;
import q50.C19083d;

/* renamed from: m50.f */
public class C18330f extends C19083d<PaymentMethodToken> {

    /* renamed from: w */
    public static final /* synthetic */ int f46743w = 0;

    /* renamed from: u */
    public String f46744u;

    /* renamed from: v */
    public String f46745v;

    public final void onStart() {
        super.onStart();
        this.f40822c.setTitle("");
    }

    /* renamed from: q2 */
    public final Task mo50776q2(ClearanceProviderPaymentInstructions clearanceProviderPaymentInstructions, Object obj) {
        PaymentMethodToken paymentMethodToken;
        Uri uri = (Uri) obj;
        if (!Boolean.TRUE.equals(mo46779N1(C18331g.class, new C0111k(5))) || this.f46744u == null) {
            paymentMethodToken = null;
        } else {
            paymentMethodToken = new PaymentMethodToken(this.f46744u);
        }
        String str = this.f46745v;
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
        int i = mo46782Q1().getInt("type");
        boolean equals = Boolean.TRUE.equals(mo46779N1(C18331g.class, new C18505b(3)));
        ClearanceProviderType clearanceProviderType = ClearanceProviderType.BUCKAROO;
        String b = C18522a.m45410b(i);
        ClearanceProviderPaymentInstructions clearanceProviderPaymentInstructions = this.f48502n;
        C21100e.m49373x(clearanceProviderPaymentInstructions, "paymentInstructions");
        return Tasks.call(MoovitExecutors.f37327IO, new C18174d(x1, clearanceProviderType, webInstruction, b, clearanceProviderPaymentInstructions, equals)).onSuccessTask(MoovitExecutors.MAIN_THREAD, new C13533e(this, 14));
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
