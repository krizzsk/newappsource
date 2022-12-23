package b50;

import c00.C13723g;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.moovit.payment.account.deposit.DepositInstructions;
import com.moovit.payment.account.model.PaymentAccount;
import java.util.Collections;

/* renamed from: b50.g */
public final /* synthetic */ class C25550g implements Continuation {

    /* renamed from: b */
    public final /* synthetic */ DepositInstructions f63807b;

    public /* synthetic */ C25550g(DepositInstructions depositInstructions) {
        this.f63807b = depositInstructions;
    }

    public final Object then(Task task) {
        PaymentAccount paymentAccount;
        DepositInstructions depositInstructions = this.f63807b;
        if (task.isSuccessful()) {
            paymentAccount = (PaymentAccount) task.getResult();
        } else {
            paymentAccount = null;
        }
        if (paymentAccount == null) {
            return Collections.emptyList();
        }
        return C13723g.m34282c(paymentAccount.f64016e, new C25552i(depositInstructions.f63960d, 0));
    }
}
