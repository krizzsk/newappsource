package q80;

import c70.C13780t;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.moovit.ticketing.purchase.extrainfo.split.PurchaseSplitInstructions;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseSplitResponse;

/* renamed from: q80.n */
public final class C13025n extends C13780t<C13024m, C13025n, MVPurchaseSplitResponse> {

    /* renamed from: m */
    public PaymentRegistrationInstructions f32230m;

    /* renamed from: n */
    public PurchaseSplitInstructions f32231n;

    public C13025n() {
        super(MVPurchaseSplitResponse.class);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.moovit.ticketing.purchase.extrainfo.split.PurchaseSplitInstructions} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.moovit.payment.clearance.model.CreditCardFields} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v3 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5816m(c70.C13746a r5, org.apache.thrift.TBase r6) throws java.io.IOException, com.moovit.commons.request.BadResponseException, com.moovit.commons.request.ServerException {
        /*
            r4 = this;
            q80.m r5 = (q80.C13024m) r5
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseSplitResponse r6 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseSplitResponse) r6
            F r5 = r6.setField_
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseSplitResponse$_Fields r0 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseSplitResponse._Fields.MISSING_STEPS
            r1 = 1
            if (r5 != r0) goto L_0x000d
            r2 = 1
            goto L_0x000e
        L_0x000d:
            r2 = 0
        L_0x000e:
            r3 = 0
            if (r2 == 0) goto L_0x0039
            if (r5 != r0) goto L_0x001c
            java.lang.Object r5 = r6.value_
            com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationSteps r5 = (com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationSteps) r5
            com.moovit.payment.registration.PaymentRegistrationInstructions r5 = h60.C17353s0.m43400n(r5)
            goto L_0x003a
        L_0x001c:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "Cannot get field 'missingSteps' because union is currently set to "
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
            F r6 = r6.setField_
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseSplitResponse$_Fields r6 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseSplitResponse._Fields) r6
            vi0.c r6 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseSplitResponse.m28102k(r6)
            java.lang.String r6 = r6.f63355a
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L_0x0039:
            r5 = r3
        L_0x003a:
            r4.f32230m = r5
            F r5 = r6.setField_
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseSplitResponse$_Fields r0 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseSplitResponse._Fields.INSTRUCTIONS
            if (r5 != r0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r1 = 0
        L_0x0044:
            if (r1 == 0) goto L_0x008f
            if (r5 != r0) goto L_0x0072
            java.lang.Object r5 = r6.value_
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseSplitInstructions r5 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseSplitInstructions) r5
            sz.r r6 = q80.C13036y.f32248a
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseVerifacationType r6 = r5.mainPaymentMethodVerificationType
            com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType r6 = q80.C13036y.m32957i(r6)
            boolean r0 = r5.mo32723g()
            if (r0 == 0) goto L_0x006b
            com.tranzmate.moovit.protocol.payments.MVSpecialCreditCardFields r5 = r5.secondaryPaymentMethodExtraRequiredFields
            sz.r r0 = h60.C17353s0.f44739a
            boolean r0 = r5.cardHolderId
            boolean r1 = r5.postalCode
            boolean r2 = r5.countryCode
            boolean r5 = r5.billingAddress
            com.moovit.payment.clearance.model.CreditCardFields r3 = new com.moovit.payment.clearance.model.CreditCardFields
            r3.<init>(r0, r1, r2, r5)
        L_0x006b:
            com.moovit.ticketing.purchase.extrainfo.split.PurchaseSplitInstructions r5 = new com.moovit.ticketing.purchase.extrainfo.split.PurchaseSplitInstructions
            r5.<init>(r6, r3)
            r3 = r5
            goto L_0x008f
        L_0x0072:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "Cannot get field 'instructions' because union is currently set to "
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
            F r6 = r6.setField_
            com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseSplitResponse$_Fields r6 = (com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseSplitResponse._Fields) r6
            vi0.c r6 = com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseSplitResponse.m28102k(r6)
            java.lang.String r6 = r6.f63355a
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L_0x008f:
            r4.f32231n = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q80.C13025n.mo5816m(c70.a, org.apache.thrift.TBase):void");
    }
}
