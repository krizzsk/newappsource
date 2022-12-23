package com.cubic.umo.pass.internal;

import bf0.C21050d;
import com.cubic.umo.pass.model.BillingAddress;
import com.cubic.umo.pass.model.CreditCard;
import com.cubic.umo.pass.model.FundingSourceDTO;
import ff0.C23349c;
import gf0.C23413c;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import lf0.C24240p;
import wh0.C25235z;

@C23413c(mo58554c = "com.cubic.umo.pass.internal.ImplUserRepo$addCreditCard$2", mo58555f = "ImplUserRepo.kt", mo58556l = {81, 83, 85, 90}, mo58557m = "invokeSuspend")
@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo59060d2 = {"Lwh0/z;", "Lcom/cubic/umo/pass/model/FundingSourceDTO;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 6, 0})
public final class ImplUserRepo$addCreditCard$2 extends SuspendLambda implements C24240p<C25235z, C23349c<? super FundingSourceDTO>, Object> {
    public final /* synthetic */ BillingAddress $billingAddress;
    public final /* synthetic */ CreditCard $model;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ ImplUserRepo this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImplUserRepo$addCreditCard$2(ImplUserRepo implUserRepo, CreditCard creditCard, BillingAddress billingAddress, C23349c<? super ImplUserRepo$addCreditCard$2> cVar) {
        super(2, cVar);
        this.this$0 = implUserRepo;
        this.$model = creditCard;
        this.$billingAddress = billingAddress;
    }

    public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
        return new ImplUserRepo$addCreditCard$2(this.this$0, this.$model, this.$billingAddress, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ImplUserRepo$addCreditCard$2) create((C25235z) obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ac A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L_0x0045
            if (r1 == r5) goto L_0x0041
            if (r1 == r4) goto L_0x0029
            if (r1 == r3) goto L_0x0020
            if (r1 != r2) goto L_0x0018
            p584jl.C17885a.m44475z0(r11)
            goto L_0x00ad
        L_0x0018:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0020:
            java.lang.Object r1 = r10.L$0
            com.cubic.umo.pass.internal.ImplUserRepo r1 = (com.cubic.umo.pass.internal.ImplUserRepo) r1
            p584jl.C17885a.m44475z0(r11)
            goto L_0x009e
        L_0x0029:
            java.lang.Object r1 = r10.L$3
            com.cubic.umo.pass.model.FullUserDTO r1 = (com.cubic.umo.pass.model.FullUserDTO) r1
            java.lang.Object r4 = r10.L$2
            com.cubic.umo.pass.model.BillingAddress r4 = (com.cubic.umo.pass.model.BillingAddress) r4
            java.lang.Object r5 = r10.L$1
            com.cubic.umo.pass.model.CreditCard r5 = (com.cubic.umo.pass.model.CreditCard) r5
            java.lang.Object r7 = r10.L$0
            com.cubic.umo.pass.internal.ImplUserRepo r7 = (com.cubic.umo.pass.internal.ImplUserRepo) r7
            p584jl.C17885a.m44475z0(r11)
            r9 = r4
            r4 = r1
            r1 = r7
            r7 = r9
            goto L_0x0077
        L_0x0041:
            p584jl.C17885a.m44475z0(r11)
            goto L_0x0057
        L_0x0045:
            p584jl.C17885a.m44475z0(r11)
            com.cubic.umo.pass.internal.ImplUserRepo r11 = r10.this$0
            com.cubic.umo.pass.internal.AccountController r11 = r11.f7858b
            r10.label = r5
            r7.a r11 = r11.f7856b
            java.lang.Object r11 = r11.mo11661c(r10)
            if (r11 != r0) goto L_0x0057
            return r0
        L_0x0057:
            com.cubic.umo.pass.internal.ImplUserRepo r1 = r10.this$0
            com.cubic.umo.pass.model.CreditCard r5 = r10.$model
            com.cubic.umo.pass.model.BillingAddress r7 = r10.$billingAddress
            com.cubic.umo.pass.model.FullUserDTO r11 = (com.cubic.umo.pass.model.FullUserDTO) r11
            com.cubic.umo.pass.internal.AccountController r8 = r1.f7858b
            r10.L$0 = r1
            r10.L$1 = r5
            r10.L$2 = r7
            r10.L$3 = r11
            r10.label = r4
            r7.a r4 = r8.f7856b
            java.lang.Object r4 = r4.mo11661c(r10)
            if (r4 != r0) goto L_0x0074
            return r0
        L_0x0074:
            r9 = r4
            r4 = r11
            r11 = r9
        L_0x0077:
            com.cubic.umo.pass.model.FullUserDTO r11 = (com.cubic.umo.pass.model.FullUserDTO) r11
            com.cubic.umo.pass.model.FundingSourceDTO r11 = r11.f8096e
            if (r11 != 0) goto L_0x00b5
            com.cubic.umo.pass.internal.AccountController r11 = r1.f7858b
            r7.a r11 = r11.f7856b
            com.cubic.umo.pass.model.AgencyInformation r4 = r4.f8094c
            mf0.C24362h.m61208c(r4)
            java.lang.String r4 = r4.f7946j
            com.cubic.umo.pass.model.CCPaymentInfo r8 = new com.cubic.umo.pass.model.CCPaymentInfo
            r8.<init>(r5, r7)
            r10.L$0 = r1
            r10.L$1 = r6
            r10.L$2 = r6
            r10.L$3 = r6
            r10.label = r3
            java.lang.Object r11 = r11.mo11659a(r4, r8, r10)
            if (r11 != r0) goto L_0x009e
            return r0
        L_0x009e:
            com.cubic.umo.pass.internal.AccountController r11 = r1.f7858b
            r10.L$0 = r6
            r10.label = r2
            r7.a r11 = r11.f7856b
            java.lang.Object r11 = r11.mo11661c(r10)
            if (r11 != r0) goto L_0x00ad
            return r0
        L_0x00ad:
            com.cubic.umo.pass.model.FullUserDTO r11 = (com.cubic.umo.pass.model.FullUserDTO) r11
            com.cubic.umo.pass.model.FundingSourceDTO r11 = r11.f8096e
            mf0.C24362h.m61208c(r11)
            return r11
        L_0x00b5:
            com.cubic.umo.exception.InvalidRequestException r11 = new com.cubic.umo.exception.InvalidRequestException
            r0 = 402(0x192, float:5.63E-43)
            java.lang.String r1 = "Account already has a CC info. Please delete the current CC info."
            r11.<init>(r0, r1)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cubic.umo.pass.internal.ImplUserRepo$addCreditCard$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
