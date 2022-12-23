package t80;

import a30.C0068a;
import a30.C0071c;
import android.content.Context;
import c70.C13752e;
import ce0.C21100e;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.gateway.PaymentGatewayToken;
import com.moovit.payment.gateway.cash.CashGatewayToken;
import com.moovit.payment.gateway.clearanceprovider.ClearanceProviderGatewayToken;
import com.moovit.payment.gateway.googlepay.GooglePayGatewayToken;
import com.moovit.payment.gateway.paymentmethod.PaymentMethodGatewayToken;
import com.moovit.request.UserRequestError;
import com.moovit.ticketing.purchase.PurchaseStep;
import com.moovit.ticketing.purchase.PurchaseStepResult;
import com.moovit.ticketing.purchase.fare.PurchaseFareStep;
import com.moovit.ticketing.purchase.fare.PurchaseTicketFareSelectionStepResult;
import com.moovit.ticketing.purchase.fare.SuggestedTicketFare;
import com.moovit.ticketing.purchase.fare.SuggestedTicketFareSelectionStepResult;
import com.moovit.ticketing.purchase.massabi.PurchaseMasabiStepResult;
import com.moovit.ticketing.purchase.storedvalue.PurchaseStoredValueSelectionStepResult;
import com.moovit.ticketing.purchase.type.PurchaseTypeSelectionStepResult;
import com.moovit.ticketing.ticket.TicketAgency;
import com.tranzmate.moovit.protocol.payments.MVPaymentProvider;
import com.usebutton.sdk.internal.api.AppActionRequest;
import h60.C17353s0;
import m80.C12873i;
import p594jv.C17939i;
import p705on.C18805l;
import q80.C13019h;
import v80.C13184b;

/* renamed from: t80.c */
public abstract class C13116c implements PurchaseStepResult.C7646a<PurchaseStep, ServerException>, PaymentGatewayToken.C16326a<Void, C0071c> {

    /* renamed from: b */
    public final Context f32570b;

    /* renamed from: c */
    public final TicketAgency f32571c;

    /* renamed from: d */
    public final String f32572d;

    public C13116c(Context context, TicketAgency ticketAgency, String str) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f32570b = context.getApplicationContext();
        C21100e.m49373x(ticketAgency, "agency");
        this.f32571c = ticketAgency;
        C21100e.m49373x(str, "configuration");
        this.f32572d = str;
    }

    /* renamed from: a */
    public final Object mo24019a(PurchaseTicketFareSelectionStepResult purchaseTicketFareSelectionStepResult) throws Exception {
        return new PurchaseFareStep(mo40013i() + ".purchase", "masabi_fare_type_purchase", purchaseTicketFareSelectionStepResult.f23303c, purchaseTicketFareSelectionStepResult.f23304d, (String) null);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo22679c(CashGatewayToken cashGatewayToken, Object obj) {
        Void voidR = (Void) obj;
        return null;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ Object mo22681d(ClearanceProviderGatewayToken clearanceProviderGatewayToken, Object obj) {
        Void voidR = (Void) obj;
        return null;
    }

    /* renamed from: e */
    public Object mo24021e(SuggestedTicketFareSelectionStepResult suggestedTicketFareSelectionStepResult) {
        throw new UnsupportedOperationException("Suggestions does not supported!");
    }

    /* renamed from: f */
    public final Object mo22682f(PaymentMethodGatewayToken paymentMethodGatewayToken, Object obj) {
        Void voidR = (Void) obj;
        String str = paymentMethodGatewayToken.f42707c;
        if (str == null) {
            return null;
        }
        return new C0071c(str, MVPaymentProvider.m24873o(C17353s0.m43405s(paymentMethodGatewayToken.f42706b)));
    }

    /* renamed from: g */
    public final Object mo24022g(PurchaseTypeSelectionStepResult purchaseTypeSelectionStepResult) throws Exception {
        throw new UnsupportedOperationException("Type selection does not supported!");
    }

    /* renamed from: i */
    public abstract String mo40013i();

    /* renamed from: j */
    public final /* bridge */ /* synthetic */ Object mo22683j(GooglePayGatewayToken googlePayGatewayToken, Object obj) {
        Void voidR = (Void) obj;
        return null;
    }

    /* renamed from: k */
    public Object mo24024k(PurchaseMasabiStepResult purchaseMasabiStepResult) {
        throw new UnsupportedOperationException("Masabi does not supported!");
    }

    /* renamed from: l */
    public final C0068a mo40015l() {
        return C0068a.m120b(this.f32572d);
    }

    /* renamed from: n */
    public final Object mo24026n(PurchaseStoredValueSelectionStepResult purchaseStoredValueSelectionStepResult) throws Exception {
        throw new UnsupportedOperationException("Stored value does not supported!");
    }

    /* renamed from: o */
    public abstract C13019h mo40016o(C13752e eVar, C13184b bVar, String str) throws ServerException;

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01eb A[SYNTHETIC, Splitter:B:62:0x01eb] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final q80.C13019h mo40017p(c70.C13752e r23, java.lang.String r24, v80.C13184b r25, java.lang.String r26) throws com.moovit.commons.request.ServerException {
        /*
            r22 = this;
            r0 = r25
            r1 = r26
            java.lang.String r2 = r0.f32729a
            java.lang.String r3 = r22.mo40013i()
            boolean r2 = r2.startsWith(r3)
            if (r2 == 0) goto L_0x020d
            a30.a r2 = r22.mo40015l()
            b0.c r3 = r0.f32734f
            com.moovit.ticketing.purchase.fare.TicketFare r4 = r0.f32730b
            java.lang.String r4 = r4.f23326b
            int r4 = java.lang.Integer.parseInt(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            int r4 = r4.intValue()
            r5 = 1
            java.lang.Object r5 = r3.mo5765b(r5)
            com.moovit.payment.gateway.PaymentGatewayToken r5 = (com.moovit.payment.gateway.PaymentGatewayToken) r5
            r10 = 0
            if (r5 == 0) goto L_0x003a
            r11 = r22
            java.lang.Object r5 = r5.mo48944S(r11, r10)
            a30.c r5 = (a30.C0071c) r5
            r9 = r5
            goto L_0x003d
        L_0x003a:
            r11 = r22
            r9 = r10
        L_0x003d:
            r5 = 2
            java.lang.Object r3 = r3.mo5765b(r5)
            z80.c r3 = (z80.C13342c) r3
            if (r3 == 0) goto L_0x0055
            dm.f r5 = new dm.f
            com.moovit.view.cc.a r6 = r3.f33131a
            com.moovit.util.CurrencyAmount r7 = r3.f33132b
            com.moovit.view.cc.a r8 = r3.f33133c
            com.moovit.util.CurrencyAmount r3 = r3.f33134d
            r5.<init>((com.moovit.view.p340cc.C7959a) r6, (com.moovit.util.CurrencyAmount) r7, (com.moovit.view.p340cc.C7959a) r8, (com.moovit.util.CurrencyAmount) r3)
            r12 = r5
            goto L_0x0056
        L_0x0055:
            r12 = r10
        L_0x0056:
            int r3 = r0.f32731c
            com.moovit.util.CurrencyAmount r8 = r0.f32732d
            monitor-enter(r2)
            boolean r5 = r2.mo163f()     // Catch:{ all -> 0x020a }
            if (r5 == 0) goto L_0x0202
            ki.b r5 = r2.mo161d()     // Catch:{ all -> 0x020a }
            ki.j r5 = r5.f46174d     // Catch:{ all -> 0x020a }
            com.google.android.play.core.assetpacks.w2 r6 = r5.mo50532e(r1)     // Catch:{ all -> 0x020a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x020a }
            r7.<init>()     // Catch:{ all -> 0x020a }
            java.lang.String r13 = "Failed to fetch order: id="
            r7.append(r13)     // Catch:{ all -> 0x020a }
            r7.append(r1)     // Catch:{ all -> 0x020a }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x020a }
            r2.mo168k(r6, r1)     // Catch:{ all -> 0x020a }
            java.lang.Object r1 = r6.f36107c     // Catch:{ all -> 0x020a }
            on.i r1 = (p705on.C18801i) r1     // Catch:{ all -> 0x020a }
        L_0x0083:
            java.util.List<on.f> r6 = r1.f47876d     // Catch:{ all -> 0x020a }
            boolean r6 = c00.C13717b.m34258e(r6)     // Catch:{ all -> 0x020a }
            if (r6 != 0) goto L_0x00d3
            java.util.List<on.f> r6 = r1.f47876d     // Catch:{ all -> 0x020a }
            java.lang.Object r6 = c00.C13717b.m34256c(r6)     // Catch:{ all -> 0x020a }
            on.f r6 = (p705on.C18798f) r6     // Catch:{ all -> 0x020a }
            on.l r7 = r6.f47858a     // Catch:{ all -> 0x020a }
            java.lang.Integer r6 = r6.f47859b     // Catch:{ all -> 0x020a }
            eo.b r13 = r5.f46192a     // Catch:{ all -> 0x020a }
            java.lang.Class<mm.b$a> r14 = p656mm.C18401b.C18402a.class
            java.lang.Object r13 = r13.mo49505a(r14, r10)     // Catch:{ all -> 0x020a }
            mm.b$a r13 = (p656mm.C18401b.C18402a) r13     // Catch:{ all -> 0x020a }
            java.lang.String r1 = r1.f47873a     // Catch:{ all -> 0x020a }
            mm.b r20 = new mm.b     // Catch:{ all -> 0x020a }
            go.b r15 = r13.f46920a     // Catch:{ all -> 0x020a }
            mm.c$a r14 = r13.f46921b     // Catch:{ all -> 0x020a }
            on.i$a r13 = r13.f46922c     // Catch:{ all -> 0x020a }
            java.lang.Integer r7 = r7.f47901d     // Catch:{ all -> 0x020a }
            r16 = r13
            r13 = r20
            r17 = r15
            r15 = r16
            r16 = r17
            r17 = r7
            r18 = r6
            r19 = r1
            r13.<init>(r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x020a }
            com.google.android.play.core.assetpacks.w2 r1 = new com.google.android.play.core.assetpacks.w2     // Catch:{ all -> 0x020a }
            al.h r6 = r20.mo40394C()     // Catch:{ all -> 0x020a }
            r1.<init>(r6)     // Catch:{ all -> 0x020a }
            java.lang.String r6 = "Failed to remove product"
            r2.mo168k(r1, r6)     // Catch:{ all -> 0x020a }
            java.lang.Object r1 = r1.f36107c     // Catch:{ all -> 0x020a }
            on.i r1 = (p705on.C18801i) r1     // Catch:{ all -> 0x020a }
            goto L_0x0083
        L_0x00d3:
            java.util.List<on.l> r6 = r1.f47874b     // Catch:{ all -> 0x020a }
            r13 = 0
            if (r6 != 0) goto L_0x00d9
            goto L_0x00f8
        L_0x00d9:
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x020a }
        L_0x00dd:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x020a }
            if (r7 == 0) goto L_0x00f8
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x020a }
            r14 = r7
            on.l r14 = (p705on.C18805l) r14     // Catch:{ all -> 0x020a }
            java.lang.Integer r14 = r14.f47901d     // Catch:{ all -> 0x020a }
            int r14 = r14.intValue()     // Catch:{ all -> 0x020a }
            if (r4 != r14) goto L_0x00f4
            r14 = 1
            goto L_0x00f5
        L_0x00f4:
            r14 = 0
        L_0x00f5:
            if (r14 == 0) goto L_0x00dd
            goto L_0x00f9
        L_0x00f8:
            r7 = r10
        L_0x00f9:
            on.l r7 = (p705on.C18805l) r7     // Catch:{ all -> 0x020a }
            if (r7 == 0) goto L_0x01eb
            java.util.Date r14 = new java.util.Date     // Catch:{ all -> 0x020a }
            r14.<init>()     // Catch:{ all -> 0x020a }
            java.lang.Integer r20 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x020a }
            eo.b r3 = r5.f46192a     // Catch:{ all -> 0x020a }
            java.lang.Class<mm.a$a> r4 = p656mm.C18399a.C18400a.class
            java.lang.Object r3 = r3.mo49505a(r4, r10)     // Catch:{ all -> 0x020a }
            mm.a$a r3 = (p656mm.C18399a.C18400a) r3     // Catch:{ all -> 0x020a }
            java.lang.String r1 = r1.f47873a     // Catch:{ all -> 0x020a }
            mm.a r4 = new mm.a     // Catch:{ all -> 0x020a }
            on.i$a r6 = r3.f46911a     // Catch:{ all -> 0x020a }
            mm.c$a r15 = r3.f46912b     // Catch:{ all -> 0x020a }
            go.b r3 = r3.f46913c     // Catch:{ all -> 0x020a }
            java.lang.Integer r7 = r7.f47901d     // Catch:{ all -> 0x020a }
            r16 = r15
            r15 = r4
            r17 = r6
            r18 = r3
            r19 = r7
            r21 = r1
            r15.<init>(r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x020a }
            com.google.android.play.core.assetpacks.w2 r1 = new com.google.android.play.core.assetpacks.w2     // Catch:{ all -> 0x020a }
            al.h r3 = r4.mo40394C()     // Catch:{ all -> 0x020a }
            r1.<init>(r3)     // Catch:{ all -> 0x020a }
            java.lang.String r3 = "Failed to add product"
            r2.mo168k(r1, r3)     // Catch:{ all -> 0x020a }
            java.lang.Object r1 = r1.f36107c     // Catch:{ all -> 0x020a }
            on.i r1 = (p705on.C18801i) r1     // Catch:{ all -> 0x020a }
            com.google.android.play.core.assetpacks.w2 r1 = r5.mo50530c(r1)     // Catch:{ all -> 0x020a }
            java.lang.String r3 = "Failed to finalise order"
            r2.mo168k(r1, r3)     // Catch:{ all -> 0x020a }
            if (r12 == 0) goto L_0x0158
            java.lang.Object r1 = r1.f36107c     // Catch:{ all -> 0x020a }
            r7 = r1
            on.d r7 = (p705on.C18796d) r7     // Catch:{ all -> 0x020a }
            r3 = r2
            r4 = r5
            r5 = r23
            r6 = r24
            r9 = r12
            b30.e r1 = r3.mo166i(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x020a }
            goto L_0x0167
        L_0x0158:
            java.lang.Object r1 = r1.f36107c     // Catch:{ all -> 0x020a }
            r6 = r1
            on.d r6 = (p705on.C18796d) r6     // Catch:{ all -> 0x020a }
            r3 = r2
            r4 = r5
            r5 = r23
            r7 = r24
            b30.e r1 = r3.mo165h(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x020a }
        L_0x0167:
            com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationSteps r3 = r1.f5342m     // Catch:{ all -> 0x020a }
            r4 = 3
            if (r3 == 0) goto L_0x0173
            a30.a$a r1 = new a30.a$a     // Catch:{ all -> 0x020a }
            r1.<init>(r3)     // Catch:{ all -> 0x020a }
            monitor-exit(r2)
            goto L_0x01a2
        L_0x0173:
            ki.b r3 = r2.mo161d()     // Catch:{ all -> 0x020a }
            ki.w r3 = r3.f46177g     // Catch:{ all -> 0x020a }
            com.masabi.justride.sdk.jobs.ticket.get.AvailableTicketsSortOrder r5 = com.masabi.justride.sdk.jobs.ticket.get.AvailableTicketsSortOrder.RECENTLY_PURCHASED     // Catch:{ all -> 0x020a }
            com.google.android.play.core.assetpacks.w2 r3 = r3.mo50534a(r5)     // Catch:{ all -> 0x020a }
            java.lang.Object r5 = r3.f36108d     // Catch:{ all -> 0x020a }
            pj.a r5 = (p725pj.C18926a) r5     // Catch:{ all -> 0x020a }
            if (r5 == 0) goto L_0x0187
            r5 = 1
            goto L_0x0188
        L_0x0187:
            r5 = 0
        L_0x0188:
            if (r5 != 0) goto L_0x0198
            java.lang.Object r3 = r3.f36107c     // Catch:{ all -> 0x020a }
            java.util.Collection r3 = (java.util.Collection) r3     // Catch:{ all -> 0x020a }
            pq.h r5 = new pq.h     // Catch:{ all -> 0x020a }
            r5.<init>(r14, r4)     // Catch:{ all -> 0x020a }
            java.util.ArrayList r3 = c00.C13723g.m34282c(r3, r5)     // Catch:{ all -> 0x020a }
            goto L_0x0199
        L_0x0198:
            r3 = r10
        L_0x0199:
            a30.a$a r5 = new a30.a$a     // Catch:{ all -> 0x020a }
            java.lang.String r1 = r1.f5343n     // Catch:{ all -> 0x020a }
            r5.<init>(r3, r1)     // Catch:{ all -> 0x020a }
            monitor-exit(r2)
            r1 = r5
        L_0x01a2:
            com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationSteps r3 = r1.f148c
            if (r3 == 0) goto L_0x01b0
            q80.h r0 = new q80.h
            com.moovit.payment.registration.PaymentRegistrationInstructions r1 = h60.C17353s0.m43400n(r3)
            r0.<init>(r1)
            return r0
        L_0x01b0:
            com.moovit.ticketing.purchase.fare.TicketFare r3 = r0.f32730b
            com.moovit.ticketing.ticket.TicketAgency r3 = r3.f23333i
            java.util.List<sn.a> r5 = r1.f146a
            if (r5 == 0) goto L_0x01e3
            java.lang.String r6 = r3.f23495b
            java.util.Map<java.lang.String, java.lang.String> r7 = r2.f144b
            i0.c r8 = new i0.c
            r8.<init>(r4)
            u00.i r4 = new u00.i
            r9 = 2
            r4.<init>(r9)
            s9.b r9 = new s9.b
            r12 = 5
            r9.<init>(r12)
            s80.e r12 = new s80.e
            r12.<init>(r6, r7, r13)
            java.util.IdentityHashMap r4 = q80.C13036y.m32949a(r5, r8, r4, r9, r12)
            s80.f r6 = new s80.f
            r6.<init>(r2, r3, r4)
            java.util.ArrayList r2 = c00.C13720d.m34273c(r5, r10, r6)
            java.util.List r10 = java.util.Collections.unmodifiableList(r2)
        L_0x01e3:
            q80.h r2 = new q80.h
            java.lang.String r1 = r1.f147b
            r2.<init>(r0, r10, r1)
            return r2
        L_0x01eb:
            com.moovit.masabi.MasabiException r0 = new com.moovit.masabi.MasabiException     // Catch:{ all -> 0x020a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x020a }
            r1.<init>()     // Catch:{ all -> 0x020a }
            java.lang.String r3 = "Unable to find product id: "
            r1.append(r3)     // Catch:{ all -> 0x020a }
            r1.append(r4)     // Catch:{ all -> 0x020a }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x020a }
            r0.<init>(r1)     // Catch:{ all -> 0x020a }
            throw r0     // Catch:{ all -> 0x020a }
        L_0x0202:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x020a }
            java.lang.String r1 = "Purchasing with anonymous user!"
            r0.<init>(r1)     // Catch:{ all -> 0x020a }
            throw r0     // Catch:{ all -> 0x020a }
        L_0x020a:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x020d:
            r11 = r22
            com.moovit.ticketing.providers.masabi.MasabiTicketingException r1 = new com.moovit.ticketing.providers.masabi.MasabiTicketingException
            java.lang.String r2 = "Unable to purchase different order id: "
            java.lang.StringBuilder r2 = p379.C13555b.m33972k(r2)
            java.lang.String r3 = r22.mo40013i()
            r2.append(r3)
            java.lang.String r3 = ", "
            r2.append(r3)
            java.lang.String r0 = r0.f32729a
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t80.C13116c.mo40017p(c70.e, java.lang.String, v80.b, java.lang.String):q80.h");
    }

    /* renamed from: q */
    public final void mo40018q(SuggestedTicketFare suggestedTicketFare) throws UserRequestError {
        if (suggestedTicketFare != null) {
            C17939i.m44563k(this.f32570b, suggestedTicketFare);
        }
        Context context = this.f32570b;
        throw new UserRequestError(-40115, context.getString(C12873i.payment_ticket_type_invalid_title), context.getString(C12873i.payment_ticket_type_invalid_sub));
    }

    /* renamed from: r */
    public final void mo40019r(C18805l lVar) throws UserRequestError {
        if (lVar.f47902e.intValue() == 0) {
            throw new UserRequestError(1000, this.f32570b.getString(C12873i.maximum_ticket_type_error_title), this.f32570b.getString(C12873i.maximum_ticket_type_error_msg));
        }
    }
}
