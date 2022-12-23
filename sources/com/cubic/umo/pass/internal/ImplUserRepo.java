package com.cubic.umo.pass.internal;

import bf0.C21050d;
import com.cubic.umo.pass.model.AgencyInformation;
import com.cubic.umo.pass.model.BillingAddress;
import com.cubic.umo.pass.model.CreditCard;
import com.cubic.umo.pass.model.FundingSourceDTO;
import com.cubic.umo.pass.repo.C2260a;
import ff0.C23347a;
import ff0.C23349c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p057d3.C4339c;
import p335z7.C7492a;
import p583jk.C17884p;
import w90.C13225c;
import w90.C13226d;
import w90.C13227e;
import w90.C13228f;
import wh0.C25177g;
import wh0.C25230y;

public final class ImplUserRepo extends C4339c implements C2260a {

    /* renamed from: b */
    public final AccountController f7858b = AccountController.f7854c.getValue();

    /* renamed from: com.cubic.umo.pass.internal.ImplUserRepo$a */
    public static final class C2244a extends C23347a implements C25230y {
        public C2244a() {
            super(C25230y.C25231a.f63504b);
        }

        /* renamed from: p */
        public final void mo11674p(CoroutineContext coroutineContext, Throwable th) {
            throw th;
        }
    }

    /* renamed from: com.cubic.umo.pass.internal.ImplUserRepo$b */
    public static final class C2245b extends C23347a implements C25230y {
        public C2245b() {
            super(C25230y.C25231a.f63504b);
        }

        /* renamed from: p */
        public final void mo11674p(CoroutineContext coroutineContext, Throwable th) {
            throw th;
        }
    }

    /* renamed from: com.cubic.umo.pass.internal.ImplUserRepo$c */
    public static final class C2246c extends C23347a implements C25230y {
        public C2246c() {
            super(C25230y.C25231a.f63504b);
        }

        /* renamed from: p */
        public final void mo11674p(CoroutineContext coroutineContext, Throwable th) {
            throw th;
        }
    }

    /* renamed from: com.cubic.umo.pass.internal.ImplUserRepo$d */
    public static final class C2247d extends C23347a implements C25230y {
        public C2247d() {
            super(C25230y.C25231a.f63504b);
        }

        /* renamed from: p */
        public final void mo11674p(CoroutineContext coroutineContext, Throwable th) {
            throw th;
        }
    }

    /* renamed from: b */
    public final Object mo11666b(String str, C23349c<? super AgencyInformation> cVar) {
        return C25177g.m63221e(C7492a.f22973b.f52870b.mo53082y(C17884p.m44356a()).mo53082y(new C2245b()), new ImplUserRepo$changeAgency$2(this, str, (C23349c<? super ImplUserRepo$changeAgency$2>) null), cVar);
    }

    /* renamed from: c */
    public final void mo11667c(CreditCard creditCard, BillingAddress billingAddress, C13226d dVar) {
        C2260a.C2261a.m6100a(this, creditCard, billingAddress, dVar);
    }

    /* renamed from: d */
    public final Object mo11668d(FundingSourceDTO fundingSourceDTO, C23349c<? super C21050d> cVar) {
        Object e = C25177g.m63221e(C7492a.f22973b.f52870b.mo53082y(C17884p.m44356a()).mo53082y(new C2246c()), new ImplUserRepo$deleteCreditCardInfo$2(this, fundingSourceDTO, (C23349c<? super ImplUserRepo$deleteCreditCardInfo$2>) null), cVar);
        if (e == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return e;
        }
        return C21050d.f52856a;
    }

    /* renamed from: f */
    public final void mo11669f(String str, C13225c cVar) {
        C2260a.C2261a.m6101b(this, str, cVar);
    }

    /* renamed from: k */
    public final void mo11670k(FundingSourceDTO fundingSourceDTO, C13228f fVar) {
        C2260a.C2261a.m6102c(this, fundingSourceDTO, fVar);
    }

    /* renamed from: l */
    public final Object mo11671l(C23349c<? super FundingSourceDTO> cVar) {
        return C25177g.m63221e(C7492a.f22973b.f52870b.mo53082y(C17884p.m44356a()).mo53082y(new C2247d()), new ImplUserRepo$getCreditCardInfo$2(this, (C23349c<? super ImplUserRepo$getCreditCardInfo$2>) null), cVar);
    }

    /* renamed from: n */
    public final void mo11672n(C13227e eVar) {
        C2260a.C2261a.m6103d(this, eVar);
    }

    /* renamed from: q */
    public final Object mo11673q(CreditCard creditCard, BillingAddress billingAddress, C23349c<? super FundingSourceDTO> cVar) {
        return C25177g.m63221e(C7492a.f22973b.f52870b.mo53082y(C17884p.m44356a()).mo53082y(new C2244a()), new ImplUserRepo$addCreditCard$2(this, creditCard, billingAddress, (C23349c<? super ImplUserRepo$addCreditCard$2>) null), cVar);
    }
}
