package com.moovit.payment.account.subscription;

import android.app.Application;
import androidx.lifecycle.C0989a;
import androidx.lifecycle.C1043v;
import com.moovit.payment.account.subscription.model.PaymentAccountSubscription;
import ff0.C23349c;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import mf0.C24362h;
import p583jk.C17875h;
import p977zz.C20961r;
import w40.C25761d;
import wh0.C25177g;

public final class AccountSubscriptionViewModel extends C0989a {

    /* renamed from: c */
    public final AccountSubscriptionViewModel$paymentAccountUpdatesReceiver$1 f64128c;

    /* renamed from: d */
    public final C1043v<C20961r<List<PaymentAccountSubscription>>> f64129d;

    /* renamed from: e */
    public final C1043v f64130e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountSubscriptionViewModel(Application application) {
        super(application);
        C24362h.m61211f(application, "application");
        AccountSubscriptionViewModel$paymentAccountUpdatesReceiver$1 accountSubscriptionViewModel$paymentAccountUpdatesReceiver$1 = new AccountSubscriptionViewModel$paymentAccountUpdatesReceiver$1(this);
        this.f64128c = accountSubscriptionViewModel$paymentAccountUpdatesReceiver$1;
        C1043v<C20961r<List<PaymentAccountSubscription>>> vVar = new C1043v<>();
        this.f64129d = vVar;
        this.f64130e = vVar;
        C25761d.m64300h(application, accountSubscriptionViewModel$paymentAccountUpdatesReceiver$1);
        C25177g.m63218b(C17875h.m44315z(this), (CoroutineContext) null, new AccountSubscriptionViewModel$fetchSubscriptions$1(this, (C23349c<? super AccountSubscriptionViewModel$fetchSubscriptions$1>) null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m64278a(com.moovit.payment.account.subscription.AccountSubscriptionViewModel r4, ff0.C23349c r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof com.moovit.payment.account.subscription.AccountSubscriptionViewModel$sendSubscriptionRequest$1
            if (r0 == 0) goto L_0x0016
            r0 = r5
            com.moovit.payment.account.subscription.AccountSubscriptionViewModel$sendSubscriptionRequest$1 r0 = (com.moovit.payment.account.subscription.AccountSubscriptionViewModel$sendSubscriptionRequest$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x001b
        L_0x0016:
            com.moovit.payment.account.subscription.AccountSubscriptionViewModel$sendSubscriptionRequest$1 r0 = new com.moovit.payment.account.subscription.AccountSubscriptionViewModel$sendSubscriptionRequest$1
            r0.<init>(r4, r5)
        L_0x001b:
            java.lang.Object r5 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            p584jl.C17885a.m44475z0(r5)     // Catch:{ Exception -> 0x0058 }
            goto L_0x004e
        L_0x002a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0032:
            p584jl.C17885a.m44475z0(r5)
            android.app.Application r4 = r4.f3907b     // Catch:{ Exception -> 0x0058 }
            java.lang.String r5 = "getApplication()"
            mf0.C24362h.m61210e(r4, r5)     // Catch:{ Exception -> 0x0058 }
            i50.a r5 = new i50.a     // Catch:{ Exception -> 0x0058 }
            c70.e r4 = ce0.C21100e.m49341g0(r4)     // Catch:{ Exception -> 0x0058 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x0058 }
            r0.label = r3     // Catch:{ Exception -> 0x0058 }
            java.lang.Object r5 = com.moovit.commons.request.C15752a.m40209a(r5, r0)     // Catch:{ Exception -> 0x0058 }
            if (r5 != r1) goto L_0x004e
            goto L_0x005e
        L_0x004e:
            i50.b r5 = (i50.C25742b) r5     // Catch:{ Exception -> 0x0058 }
            zz.r r1 = new zz.r     // Catch:{ Exception -> 0x0058 }
            java.util.List<com.moovit.payment.account.subscription.model.PaymentAccountSubscription> r4 = r5.f64177m     // Catch:{ Exception -> 0x0058 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0058 }
            goto L_0x005e
        L_0x0058:
            r4 = move-exception
            zz.r r1 = new zz.r
            r1.<init>((java.lang.Exception) r4)
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.payment.account.subscription.AccountSubscriptionViewModel.m64278a(com.moovit.payment.account.subscription.AccountSubscriptionViewModel, ff0.c):java.lang.Object");
    }

    public final void onCleared() {
        super.onCleared();
        C25761d.m64301k(this.f3907b, this.f64128c);
    }
}
