package com.moovit.payment.account.subscription;

import bf0.C21050d;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import wh0.C25235z;

@C23413c(mo58554c = "com.moovit.payment.account.subscription.AccountSubscriptionMenuItemFragment$updateUi$1", mo58555f = "AccountSubscriptionMenuItemFragment.kt", mo58556l = {86, 93}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Lbf0/d;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class AccountSubscriptionMenuItemFragment$updateUi$1 extends SuspendLambda implements C24240p<C25235z, C23349c<? super C21050d>, Object> {
    public int label;
    public final /* synthetic */ AccountSubscriptionMenuItemFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccountSubscriptionMenuItemFragment$updateUi$1(AccountSubscriptionMenuItemFragment accountSubscriptionMenuItemFragment, C23349c<? super AccountSubscriptionMenuItemFragment$updateUi$1> cVar) {
        super(2, cVar);
        this.this$0 = accountSubscriptionMenuItemFragment;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new AccountSubscriptionMenuItemFragment$updateUi$1(this.this$0, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((AccountSubscriptionMenuItemFragment$updateUi$1) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0090, code lost:
        if (c00.C13723g.m34280a(r9.f64021j, new p732pq.C18950k(com.moovit.payment.account.model.PaymentAccountProductType.SUBSCRIPTION, 4)) == true) goto L_0x0094;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00e4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r8.label
            r2 = 0
            r3 = 0
            r4 = 2
            java.lang.String r5 = "menuItem"
            java.lang.String r6 = "requireContext()"
            r7 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 == r7) goto L_0x001e
            if (r1 != r4) goto L_0x0016
            p584jl.C17885a.m44475z0(r9)
            goto L_0x007e
        L_0x0016:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x001e:
            p584jl.C17885a.m44475z0(r9)
            goto L_0x0046
        L_0x0022:
            p584jl.C17885a.m44475z0(r9)
            com.moovit.payment.account.subscription.AccountSubscriptionMenuItemFragment r9 = r8.this$0
            android.content.Context r9 = r9.requireContext()
            mf0.C24362h.m61210e(r9, r6)
            lz.a r9 = ce0.C21100e.m49329X(r9)
            java.lang.String r1 = "CONFIGURATION"
            com.google.android.gms.tasks.Task r9 = r9.mo50699k(r1)
            java.lang.String r1 = "appDataManager.loadDataP…tDataParts.CONFIGURATION)"
            mf0.C24362h.m61210e(r9, r1)
            r8.label = r7
            java.lang.Object r9 = com.moovit.commons.async.AsyncExtKt.m40163a(r9, r8)
            if (r9 != r0) goto L_0x0046
            return r0
        L_0x0046:
            q00.a r9 = (q00.C19047a) r9
            r00.a r1 = v50.C20101a.f51013Z
            java.lang.Object r9 = r9.mo51505b(r1)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x0068
            com.moovit.payment.account.subscription.AccountSubscriptionMenuItemFragment r9 = r8.this$0
            com.moovit.design.view.list.ListItemView r9 = r9.f64126o
            if (r9 == 0) goto L_0x0064
            r0 = 8
            r9.setVisibility(r0)
            bf0.d r9 = bf0.C21050d.f52856a
            return r9
        L_0x0064:
            mf0.C24362h.m61217l(r5)
            throw r3
        L_0x0068:
            w40.d r9 = w40.C25761d.m64299a()
            com.google.android.gms.tasks.Task r9 = r9.mo83587b(r2)
            java.lang.String r1 = "getInstance().paymentAccount"
            mf0.C24362h.m61210e(r9, r1)
            r8.label = r4
            java.lang.Object r9 = com.moovit.commons.async.AsyncExtKt.m40163a(r9, r8)
            if (r9 != r0) goto L_0x007e
            return r0
        L_0x007e:
            com.moovit.payment.account.model.PaymentAccount r9 = (com.moovit.payment.account.model.PaymentAccount) r9
            if (r9 == 0) goto L_0x0093
            com.moovit.payment.account.model.PaymentAccountProductType r0 = com.moovit.payment.account.model.PaymentAccountProductType.SUBSCRIPTION
            java.util.List<d50.a> r9 = r9.f64021j
            pq.k r1 = new pq.k
            r4 = 4
            r1.<init>(r0, r4)
            boolean r9 = c00.C13723g.m34280a(r9, r1)
            if (r9 != r7) goto L_0x0093
            goto L_0x0094
        L_0x0093:
            r7 = 0
        L_0x0094:
            if (r7 == 0) goto L_0x00a9
            int r9 = com.moovit.payment.account.subscription.AccountMySubscriptionActivity.f64120X
            com.moovit.payment.account.subscription.AccountSubscriptionMenuItemFragment r9 = r8.this$0
            android.content.Context r9 = r9.requireContext()
            mf0.C24362h.m61210e(r9, r6)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.moovit.payment.account.subscription.AccountMySubscriptionActivity> r1 = com.moovit.payment.account.subscription.AccountMySubscriptionActivity.class
            r0.<init>(r9, r1)
            goto L_0x00c6
        L_0x00a9:
            int r9 = com.moovit.payment.account.actions.PaymentAccountActionActivity.f63869X
            com.moovit.payment.account.subscription.AccountSubscriptionMenuItemFragment r9 = r8.this$0
            android.content.Context r9 = r9.requireContext()
            mf0.C24362h.m61210e(r9, r6)
            com.moovit.payment.account.actions.model.SubscriptionIntent r0 = new com.moovit.payment.account.actions.model.SubscriptionIntent
            r0.<init>()
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.moovit.payment.account.actions.PaymentAccountActionActivity> r4 = com.moovit.payment.account.actions.PaymentAccountActionActivity.class
            r1.<init>(r9, r4)
            java.lang.String r9 = "accountActionIntent"
            r1.putExtra(r9, r0)
            r0 = r1
        L_0x00c6:
            com.moovit.payment.account.subscription.AccountSubscriptionMenuItemFragment r9 = r8.this$0
            com.moovit.design.view.list.ListItemView r1 = r9.f64126o
            if (r1 == 0) goto L_0x00e4
            h50.a r4 = new h50.a
            r4.<init>(r9, r0)
            r1.setOnClickListener(r4)
            com.moovit.payment.account.subscription.AccountSubscriptionMenuItemFragment r9 = r8.this$0
            com.moovit.design.view.list.ListItemView r9 = r9.f64126o
            if (r9 == 0) goto L_0x00e0
            r9.setVisibility(r2)
            bf0.d r9 = bf0.C21050d.f52856a
            return r9
        L_0x00e0:
            mf0.C24362h.m61217l(r5)
            throw r3
        L_0x00e4:
            mf0.C24362h.m61217l(r5)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.payment.account.subscription.AccountSubscriptionMenuItemFragment$updateUi$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
