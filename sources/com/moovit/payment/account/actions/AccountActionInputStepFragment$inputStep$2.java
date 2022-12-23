package com.moovit.payment.account.actions;

import android.os.Parcelable;
import com.moovit.payment.account.actions.model.InputStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;

@Metadata(mo59059d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo59060d2 = {"<anonymous>", "Lcom/moovit/payment/account/actions/model/InputStep;", "invoke"}, mo59061k = 3, mo59062mv = {1, 7, 1}, mo59064xi = 48)
public final class AccountActionInputStepFragment$inputStep$2 extends Lambda implements C24225a<InputStep> {
    public final /* synthetic */ AccountActionInputStepFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountActionInputStepFragment$inputStep$2(AccountActionInputStepFragment accountActionInputStepFragment) {
        super(0);
        this.this$0 = accountActionInputStepFragment;
    }

    public final Object invoke() {
        Parcelable parcelable = this.this$0.requireArguments().getParcelable("inputStep");
        C24362h.m61208c(parcelable);
        return (InputStep) parcelable;
    }
}
