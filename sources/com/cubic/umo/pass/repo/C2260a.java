package com.cubic.umo.pass.repo;

import bf0.C21050d;
import com.appsflyer.ServerParameters;
import com.cubic.umo.exception.SDKException;
import com.cubic.umo.pass.model.AgencyInformation;
import com.cubic.umo.pass.model.BillingAddress;
import com.cubic.umo.pass.model.CreditCard;
import com.cubic.umo.pass.model.FundingSourceDTO;
import ff0.C23349c;
import java.io.IOException;
import kotlin.coroutines.CoroutineContext;
import mf0.C24362h;
import p389bl.C13637c;
import w90.C13225c;
import w90.C13226d;
import w90.C13227e;
import w90.C13228f;
import wh0.C25177g;

/* renamed from: com.cubic.umo.pass.repo.a */
public interface C2260a {

    /* renamed from: com.cubic.umo.pass.repo.a$a */
    public static final class C2261a {
        /* renamed from: a */
        public static void m6100a(C2260a aVar, CreditCard creditCard, BillingAddress billingAddress, C13226d dVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(creditCard, ServerParameters.MODEL);
            C24362h.m61211f(billingAddress, "billingAddress");
            C25177g.m63218b(C13637c.m34065b(), (CoroutineContext) null, new UserRepo$addCreditCard$1(dVar, aVar, creditCard, billingAddress, (C23349c<? super UserRepo$addCreditCard$1>) null), 3);
        }

        /* renamed from: b */
        public static void m6101b(C2260a aVar, String str, C13225c cVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(str, "agencyId");
            C25177g.m63218b(C13637c.m34065b(), (CoroutineContext) null, new UserRepo$changeAgency$1(cVar, aVar, str, (C23349c<? super UserRepo$changeAgency$1>) null), 3);
        }

        /* renamed from: c */
        public static void m6102c(C2260a aVar, FundingSourceDTO fundingSourceDTO, C13228f fVar) {
            C24362h.m61211f(aVar, "this");
            C24362h.m61211f(fundingSourceDTO, "ccInfo");
            C25177g.m63218b(C13637c.m34065b(), (CoroutineContext) null, new UserRepo$deleteCreditCardInfo$1(aVar, fundingSourceDTO, fVar, (C23349c<? super UserRepo$deleteCreditCardInfo$1>) null), 3);
        }

        /* renamed from: d */
        public static void m6103d(C2260a aVar, C13227e eVar) {
            C24362h.m61211f(aVar, "this");
            C25177g.m63218b(C13637c.m34065b(), (CoroutineContext) null, new UserRepo$getCreditCardInfo$1(eVar, aVar, (C23349c<? super UserRepo$getCreditCardInfo$1>) null), 3);
        }
    }

    /* renamed from: b */
    Object mo11666b(String str, C23349c<? super AgencyInformation> cVar) throws SDKException, IOException;

    /* renamed from: c */
    void mo11667c(CreditCard creditCard, BillingAddress billingAddress, C13226d dVar);

    /* renamed from: d */
    Object mo11668d(FundingSourceDTO fundingSourceDTO, C23349c<? super C21050d> cVar) throws SDKException, IOException;

    /* renamed from: f */
    void mo11669f(String str, C13225c cVar);

    /* renamed from: k */
    void mo11670k(FundingSourceDTO fundingSourceDTO, C13228f fVar);

    /* renamed from: l */
    Object mo11671l(C23349c<? super FundingSourceDTO> cVar) throws SDKException, IOException;

    /* renamed from: n */
    void mo11672n(C13227e eVar);

    /* renamed from: q */
    Object mo11673q(CreditCard creditCard, BillingAddress billingAddress, C23349c<? super FundingSourceDTO> cVar) throws SDKException, IOException;
}
