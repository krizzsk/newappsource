package q50;

import android.app.Activity;
import android.os.Bundle;
import c70.C13751d;
import ce0.C21100e;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.MoovitExecutors;
import com.moovit.app.ads.C14757r;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.payment.clearance.ClearanceProvider;
import com.moovit.payment.clearance.ClearanceProviderPaymentInstructions;
import com.moovit.payment.clearance.PaymentMethodToken;
import java.util.concurrent.Executor;
import l30.C5591t;
import p054d0.C4273c0;
import p435de.C16596f;
import p613kq.C18114a;
import p613kq.C18115b;
import p853uu.C19996f;

/* renamed from: q50.b */
public abstract class C19080b<Result, T extends PaymentMethodToken> extends C15682c<MoovitActivity> {

    /* renamed from: o */
    public static final /* synthetic */ int f48501o = 0;

    /* renamed from: n */
    public ClearanceProviderPaymentInstructions f48502n;

    /* renamed from: q50.b$a */
    public static class C19081a<T extends PaymentMethodToken> {

        /* renamed from: a */
        public final String f48503a;

        /* renamed from: b */
        public final T f48504b;

        public C19081a(String str, T t) {
            C21100e.m49373x(str, str);
            this.f48503a = str;
            this.f48504b = t;
        }
    }

    public C19080b() {
        super(MoovitActivity.class);
    }

    /* renamed from: m2 */
    public void mo51512m2(Exception exc) {
        if (exc != null) {
            C16596f.m42113a().mo49364c(exc);
        }
        if (this.f40824e) {
            mo46795h2(C13751d.m34341b(requireContext(), (String) null, exc));
        }
    }

    /* renamed from: n2 */
    public final void mo51513n2(C19081a<T> aVar) {
        if (aVar.f48504b != null) {
            A a = this.f40822c;
            Tasks.call(MoovitExecutors.f37327IO, new C19079a(this, aVar)).addOnSuccessListener((Activity) a, new C19996f(this, 5)).addOnFailureListener((Activity) a, (OnFailureListener) new C5591t(a, 2)).addOnCompleteListener((Activity) a, new C14757r(2, this, aVar));
            return;
        }
        mo51514o2(this.f48502n, aVar);
    }

    /* renamed from: o2 */
    public void mo51514o2(ClearanceProviderPaymentInstructions clearanceProviderPaymentInstructions, C19081a<T> aVar) {
        if (this.f40822c != null) {
            mo46786U1(ClearanceProvider.C16293a.class, new C4273c0(8, clearanceProviderPaymentInstructions.f42587e.f42774c.f42605c, aVar));
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ClearanceProviderPaymentInstructions clearanceProviderPaymentInstructions = (ClearanceProviderPaymentInstructions) mo46782Q1().getParcelable("paymentInstructions");
        this.f48502n = clearanceProviderPaymentInstructions;
        if (clearanceProviderPaymentInstructions == null) {
            throw new ApplicationBugException("Did you use AbstractPaymentFragment.newInstance(...)?");
        }
    }

    /* renamed from: p2 */
    public final void mo51515p2(Result result) {
        mo50776q2(this.f48502n, result).addOnSuccessListener((Executor) MoovitExecutors.COMPUTATION, new C18114a(this, 12)).addOnFailureListener((Activity) requireActivity(), (OnFailureListener) new C18115b(this, 7));
    }

    /* renamed from: q2 */
    public abstract Task<C19081a<T>> mo50776q2(ClearanceProviderPaymentInstructions clearanceProviderPaymentInstructions, Result result);
}
