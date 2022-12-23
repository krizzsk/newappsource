package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zza;
import java.util.concurrent.Future;

/* renamed from: com.android.billingclient.api.d0 */
public final /* synthetic */ class C1946d0 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ Future f6756b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f6757c;

    public /* synthetic */ C1946d0(Future future, Runnable runnable) {
        this.f6756b = future;
        this.f6757c = runnable;
    }

    public final void run() {
        Future future = this.f6756b;
        Runnable runnable = this.f6757c;
        if (!future.isDone() && !future.isCancelled()) {
            future.cancel(true);
            zza.zzk("BillingClient", "Async task is taking too long, cancel it!");
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
