package l50;

import android.content.Intent;
import android.net.Uri;
import c70.C13752e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.commons.request.BadResponseException;
import com.moovit.payment.clearance.CreditCardRequest;
import com.moovit.payment.clearance.PaymentMethodToken;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;
import m60.C18346e;
import p304x.C7071l0;
import p977zz.C20944i0;

/* renamed from: l50.c */
public abstract class C18173c extends C18346e<PaymentMethodToken> {

    /* renamed from: v */
    public static final /* synthetic */ int f46410v = 0;

    /* renamed from: u */
    public String f46411u;

    public final void onStart() {
        super.onStart();
        this.f40822c.setTitle("");
    }

    /* renamed from: r2 */
    public final Task mo50590r2(CreditCardRequest creditCardRequest, Object obj) {
        Uri uri = (Uri) obj;
        if (this.f46411u != null) {
            return Tasks.forResult(new PaymentMethodToken(this.f46411u));
        }
        return Tasks.forException(new BadResponseException("Token can't be null!"));
    }

    /* renamed from: u2 */
    public final Task<C20944i0<String, WebInstruction>> mo50591u2() {
        return Tasks.call(MoovitExecutors.f37327IO, mo50596z2(this.f40822c.mo44548x1(), this.f46777p)).onSuccessTask(MoovitExecutors.MAIN_THREAD, new C7071l0(this, 14));
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

    /* renamed from: z2 */
    public abstract C18174d mo50596z2(C13752e eVar, WebInstruction webInstruction);
}
