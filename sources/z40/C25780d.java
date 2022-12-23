package z40;

import c70.C13778r;
import com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepCompletedRequest;

/* renamed from: z40.d */
public final class C25780d extends C13778r<C25780d, C25781e, MVAccountFlowStepCompletedRequest> {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: com.tranzmate.moovit.protocol.payments.MVPaymentProvider} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C25780d(c70.C13752e r5, p057d3.C4339c r6) {
        /*
            r4 = this;
            int r0 = v40.C25754i.server_path_app_server_secured_url
            int r1 = v40.C25754i.api_path_account_action_step_completed
            java.lang.Class<z40.e> r2 = z40.C25781e.class
            r4.<init>(r5, r0, r1, r2)
            com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepCompletedRequest r5 = new com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepCompletedRequest
            java.lang.String r0 = r6.mo19844t()
            boolean r1 = r6 instanceof com.moovit.payment.account.actions.model.OptionSelectionStepResult
            if (r1 == 0) goto L_0x002f
            com.moovit.payment.account.actions.model.OptionSelectionStepResult r6 = (com.moovit.payment.account.actions.model.OptionSelectionStepResult) r6
            com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowOptionSelectionStepResult r1 = new com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowOptionSelectionStepResult
            java.lang.String r2 = r6.f63904d
            java.lang.String r6 = r6.f63905e
            r1.<init>()
            r1.type = r2
            r1.selectedOptionId = r6
            com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepResult r6 = new com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepResult
            r6.<init>()
            com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepResult$_Fields r2 = com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepResult._Fields.SELECTION_STEP_RESULT
            r6.setField_ = r2
            r6.value_ = r1
            goto L_0x00c7
        L_0x002f:
            boolean r1 = r6 instanceof y40.C25774c
            if (r1 == 0) goto L_0x0072
            y40.c r6 = (y40.C25774c) r6
            java.lang.String r1 = r6.f64294d
            java.util.List<com.moovit.inputfields.InputFieldValue> r6 = r6.f64295e
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = cf0.C21136j.m49436X(r6, r3)
            r2.<init>(r3)
            java.util.Iterator r6 = r6.iterator()
        L_0x0048:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x005c
            java.lang.Object r3 = r6.next()
            com.moovit.inputfields.InputFieldValue r3 = (com.moovit.inputfields.InputFieldValue) r3
            com.tranzmate.moovit.protocol.payments.MVInputFieldValue r3 = c70.C13749c.m34331q(r3)
            r2.add(r3)
            goto L_0x0048
        L_0x005c:
            com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowInputStepResult r6 = new com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowInputStepResult
            r6.<init>()
            r6.handlerIdentifier = r1
            r6.inputFieldsValues = r2
            com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepResult r1 = new com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepResult
            r1.<init>()
            com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepResult$_Fields r2 = com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepResult._Fields.FORM_STEP_RESULT
            r1.setField_ = r2
            r1.value_ = r6
            r6 = r1
            goto L_0x00c7
        L_0x0072:
            boolean r1 = r6 instanceof y40.C25773b
            if (r1 == 0) goto L_0x008d
            y40.b r6 = (y40.C25773b) r6
            com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowHtmlStepResult r1 = new com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowHtmlStepResult
            java.lang.String r6 = r6.f64291d
            r1.<init>()
            r1.identifier = r6
            com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepResult r6 = new com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepResult
            r6.<init>()
            com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepResult$_Fields r2 = com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepResult._Fields.HTML_STEP_RESULT
            r6.setField_ = r2
            r6.value_ = r1
            goto L_0x00c7
        L_0x008d:
            boolean r1 = r6 instanceof y40.C25775d
            if (r1 == 0) goto L_0x00d1
            y40.d r6 = (y40.C25775d) r6
            com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowPaymentStepResult r1 = new com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowPaymentStepResult
            java.lang.String r2 = r6.f64298d
            r1.<init>()
            r1.identifier = r2
            com.moovit.util.CurrencyAmount r2 = r6.f64299e
            if (r2 == 0) goto L_0x00a6
            com.tranzmate.moovit.protocol.common.MVCurrencyAmount r2 = c70.C13749c.m34330p(r2)
            r1.price = r2
        L_0x00a6:
            java.lang.String r2 = r6.f64301g
            if (r2 == 0) goto L_0x00ac
            r1.discountContextId = r2
        L_0x00ac:
            com.moovit.payment.gateway.PaymentGatewayToken r6 = r6.f64300f
            r2 = 0
            if (r6 == 0) goto L_0x00ba
            jk.h r3 = p583jk.C17875h.f45869m
            java.lang.Object r6 = r6.mo48944S(r3, r2)
            r2 = r6
            com.tranzmate.moovit.protocol.payments.MVPaymentProvider r2 = (com.tranzmate.moovit.protocol.payments.MVPaymentProvider) r2
        L_0x00ba:
            r1.paymentProvider = r2
            com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepResult r6 = new com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepResult
            r6.<init>()
            com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepResult$_Fields r2 = com.tranzmate.moovit.protocol.paymentaccount.MVAccountFlowStepResult._Fields.PAYMENT_STEP_RESULT
            r6.setField_ = r2
            r6.value_ = r1
        L_0x00c7:
            r5.<init>()
            r5.contextId = r0
            r5.stepResult = r6
            r4.f33922v = r5
            return
        L_0x00d1:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: z40.C25780d.<init>(c70.e, d3.c):void");
    }
}
