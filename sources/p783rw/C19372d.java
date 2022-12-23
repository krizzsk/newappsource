package p783rw;

import android.view.MenuItem;
import androidx.appcompat.widget.C0475w0;
import c70.C13752e;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.moovit.MoovitExecutors;
import com.moovit.app.surveys.data.remote.SurveyAnswerTreeNode;
import com.moovit.micromobility.ride.MicroMobilityRide;
import com.moovit.network.model.ServerId;
import com.moovit.payment.account.creditcard.CreditCardPaymentMethod;
import com.moovit.payment.account.paymentmethod.PaymentAccountPaymentMethodsFragment;
import com.moovit.payment.account.profile.PaymentAccountAddProfileActivity;
import com.veriff.sdk.camera.camera2.interop.CaptureRequestOptions;
import com.veriff.sdk.camera.core.impl.Config;
import g50.C25727a;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import l30.C5577i;
import p304x.C7071l0;
import p372at.C13515b;
import p783rw.C19373e;
import p785ry.C19382b;
import p977zz.C20949l;
import v40.C25750e;

/* renamed from: rw.d */
public final /* synthetic */ class C19372d implements C20949l, SuccessContinuation, C0475w0.C0476a, Config.OptionMatcher {

    /* renamed from: b */
    public final /* synthetic */ int f49292b;

    /* renamed from: c */
    public final /* synthetic */ Object f49293c;

    /* renamed from: d */
    public final /* synthetic */ Object f49294d;

    public /* synthetic */ C19372d(int i, Object obj, Object obj2) {
        this.f49292b = i;
        this.f49293c = obj;
        this.f49294d = obj2;
    }

    /* renamed from: a */
    public final boolean mo51781a(Config.Option option) {
        return ((CaptureRequestOptions.Builder) this.f49293c).getMutableConfig().insertOption(option, ((Config) this.f49294d).getOptionPriority(option), ((Config) this.f49294d).retrieveOption(option));
    }

    public final boolean invoke(Object obj) {
        switch (this.f49292b) {
            case 0:
                ((C19373e.C19374a) obj).mo51777L0(((C19373e) this.f49293c).f49296h, (SurveyAnswerTreeNode) this.f49294d);
                return true;
            default:
                ((PaymentAccountAddProfileActivity) obj).mo83549y2(((C25727a) this.f49293c).f64157n, (List) this.f49294d);
                return true;
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        PaymentAccountPaymentMethodsFragment.C25687c cVar = (PaymentAccountPaymentMethodsFragment.C25687c) this.f49293c;
        CreditCardPaymentMethod creditCardPaymentMethod = (CreditCardPaymentMethod) this.f49294d;
        cVar.getClass();
        if (menuItem.getItemId() != C25750e.action_delete) {
            return false;
        }
        PaymentAccountPaymentMethodsFragment.m64194n2(PaymentAccountPaymentMethodsFragment.this, creditCardPaymentMethod.f64052b);
        return false;
    }

    public final Task then(Object obj) {
        C5577i iVar = (C5577i) this.f49293c;
        C5577i iVar2 = C5577i.f18275d;
        Task<MicroMobilityRide> d = iVar.mo21403d((ServerId) this.f49294d);
        ExecutorService executorService = MoovitExecutors.COMPUTATION;
        return d.onSuccessTask(executorService, new C7071l0((C13752e) obj, 13)).addOnFailureListener((Executor) executorService, (OnFailureListener) new C19382b(1)).addOnSuccessListener((Executor) executorService, new C13515b(iVar, 5));
    }
}
