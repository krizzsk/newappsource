package com.moovit.payment.gateway.googlepay;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.moovit.MoovitActivity;

/* renamed from: com.moovit.payment.gateway.googlepay.c */
public final /* synthetic */ class C16342c implements OnCompleteListener {

    /* renamed from: b */
    public final /* synthetic */ MoovitActivity f42701b;

    public /* synthetic */ C16342c(MoovitActivity moovitActivity) {
        this.f42701b = moovitActivity;
    }

    public final void onComplete(Task task) {
        AutoResolveHelper.resolveTask(task, this.f42701b, 3834);
    }
}
