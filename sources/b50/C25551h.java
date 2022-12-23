package b50;

import c70.C13752e;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.payment.account.deposit.DepositInstructions;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;

/* renamed from: b50.h */
public final /* synthetic */ class C25551h implements SuccessContinuation {

    /* renamed from: b */
    public final /* synthetic */ DepositInstructions f63808b;

    /* renamed from: c */
    public final /* synthetic */ PaymentMethod f63809c;

    /* renamed from: d */
    public final /* synthetic */ WebInstruction f63810d;

    /* renamed from: e */
    public final /* synthetic */ String f63811e;

    public /* synthetic */ C25551h(DepositInstructions depositInstructions, PaymentMethod paymentMethod, WebInstruction webInstruction, String str) {
        this.f63808b = depositInstructions;
        this.f63809c = paymentMethod;
        this.f63810d = webInstruction;
        this.f63811e = str;
    }

    public final Task then(Object obj) {
        return Tasks.call(MoovitExecutors.f37327IO, new C25546c(this.f63808b, this.f63809c, this.f63810d, (C13752e) obj, this.f63811e));
    }
}
