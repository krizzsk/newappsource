package b30;

import c70.C13780t;
import com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationSteps;
import com.tranzmate.moovit.protocol.ticketingV2.MVExternalPaymentV2Response;

/* renamed from: b30.e */
public final class C1469e extends C13780t<C1468d, C1469e, MVExternalPaymentV2Response> {

    /* renamed from: m */
    public MVMissingPaymentRegistrationSteps f5342m;

    /* renamed from: n */
    public String f5343n;

    public C1469e() {
        super(MVExternalPaymentV2Response.class);
        this.f5342m = null;
        this.f5343n = null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5816m(c70.C13746a r5, org.apache.thrift.TBase r6) throws java.io.IOException, com.moovit.commons.request.BadResponseException, com.moovit.commons.request.ServerException {
        /*
            r4 = this;
            b30.d r5 = (b30.C1468d) r5
            com.tranzmate.moovit.protocol.ticketingV2.MVExternalPaymentV2Response r6 = (com.tranzmate.moovit.protocol.ticketingV2.MVExternalPaymentV2Response) r6
            F r5 = r6.setField_
            com.tranzmate.moovit.protocol.ticketingV2.MVExternalPaymentV2Response$_Fields r0 = com.tranzmate.moovit.protocol.ticketingV2.MVExternalPaymentV2Response._Fields.MISSING_STEPS
            r1 = 1
            if (r5 != r0) goto L_0x000d
            r2 = 1
            goto L_0x000e
        L_0x000d:
            r2 = 0
        L_0x000e:
            r3 = 0
            if (r2 == 0) goto L_0x0035
            if (r5 != r0) goto L_0x0018
            java.lang.Object r0 = r6.value_
            com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationSteps r0 = (com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationSteps) r0
            goto L_0x0036
        L_0x0018:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "Cannot get field 'missingSteps' because union is currently set to "
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
            F r6 = r6.setField_
            com.tranzmate.moovit.protocol.ticketingV2.MVExternalPaymentV2Response$_Fields r6 = (com.tranzmate.moovit.protocol.ticketingV2.MVExternalPaymentV2Response._Fields) r6
            vi0.c r6 = com.tranzmate.moovit.protocol.ticketingV2.MVExternalPaymentV2Response.m27635k(r6)
            java.lang.String r6 = r6.f63355a
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L_0x0035:
            r0 = r3
        L_0x0036:
            r4.f5342m = r0
            com.tranzmate.moovit.protocol.ticketingV2.MVExternalPaymentV2Response$_Fields r0 = com.tranzmate.moovit.protocol.ticketingV2.MVExternalPaymentV2Response._Fields.PAYMENT_DATA
            if (r5 != r0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r1 = 0
        L_0x003e:
            if (r1 == 0) goto L_0x0065
            if (r5 != r0) goto L_0x0048
            java.lang.Object r5 = r6.value_
            r3 = r5
            java.lang.String r3 = (java.lang.String) r3
            goto L_0x0065
        L_0x0048:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "Cannot get field 'paymentData' because union is currently set to "
            java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
            F r6 = r6.setField_
            com.tranzmate.moovit.protocol.ticketingV2.MVExternalPaymentV2Response$_Fields r6 = (com.tranzmate.moovit.protocol.ticketingV2.MVExternalPaymentV2Response._Fields) r6
            vi0.c r6 = com.tranzmate.moovit.protocol.ticketingV2.MVExternalPaymentV2Response.m27635k(r6)
            java.lang.String r6 = r6.f63355a
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L_0x0065:
            r4.f5343n = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b30.C1469e.mo5816m(c70.a, org.apache.thrift.TBase):void");
    }

    public C1469e(String str) {
        super(MVExternalPaymentV2Response.class);
        this.f5342m = null;
        this.f5343n = str;
    }
}
