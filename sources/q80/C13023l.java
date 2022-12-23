package q80;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationSteps;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryResponse;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseVerifacationType;
import h60.C17353s0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.thrift.TBase;
import p80.C12991b;

/* renamed from: q80.l */
public final class C13023l extends C13780t<C13022k, C13023l, MVPurchaseItineraryResponse> {

    /* renamed from: m */
    public boolean f32226m;

    /* renamed from: n */
    public ArrayList f32227n;

    /* renamed from: o */
    public PaymentRegistrationInstructions f32228o;

    /* renamed from: p */
    public PurchaseVerificationType f32229p;

    public C13023l() {
        super(MVPurchaseItineraryResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        boolean z;
        PaymentRegistrationInstructions paymentRegistrationInstructions;
        boolean z2;
        PurchaseVerificationType purchaseVerificationType;
        boolean z3;
        C13022k kVar = (C13022k) aVar;
        MVPurchaseItineraryResponse mVPurchaseItineraryResponse = (MVPurchaseItineraryResponse) tBase;
        F f = mVPurchaseItineraryResponse.setField_;
        F f2 = MVPurchaseItineraryResponse._Fields.MISSING_STEPS;
        boolean z4 = true;
        if (f == f2) {
            z = true;
        } else {
            z = false;
        }
        ArrayList arrayList = null;
        if (!z) {
            paymentRegistrationInstructions = null;
        } else if (f == f2) {
            paymentRegistrationInstructions = C17353s0.m43400n((MVMissingPaymentRegistrationSteps) mVPurchaseItineraryResponse.value_);
        } else {
            StringBuilder k = C13555b.m33972k("Cannot get field 'missingSteps' because union is currently set to ");
            k.append(MVPurchaseItineraryResponse.m28031k((MVPurchaseItineraryResponse._Fields) mVPurchaseItineraryResponse.setField_).f63355a);
            throw new RuntimeException(k.toString());
        }
        this.f32228o = paymentRegistrationInstructions;
        F f3 = mVPurchaseItineraryResponse.setField_;
        F f4 = MVPurchaseItineraryResponse._Fields.VERIFICATION_TYPE;
        if (f3 == f4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            purchaseVerificationType = null;
        } else if (f3 == f4) {
            purchaseVerificationType = C13036y.m32957i((MVPurchaseVerifacationType) mVPurchaseItineraryResponse.value_);
        } else {
            StringBuilder k2 = C13555b.m33972k("Cannot get field 'verificationType' because union is currently set to ");
            k2.append(MVPurchaseItineraryResponse.m28031k((MVPurchaseItineraryResponse._Fields) mVPurchaseItineraryResponse.setField_).f63355a);
            throw new RuntimeException(k2.toString());
        }
        this.f32229p = purchaseVerificationType;
        F f5 = mVPurchaseItineraryResponse.setField_;
        F f6 = MVPurchaseItineraryResponse._Fields.TICKETS;
        if (f5 == f6) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            C12991b bVar = kVar.f32224w;
            if (f5 == f6) {
                arrayList = C13036y.m32956h(bVar, (List) mVPurchaseItineraryResponse.value_);
            } else {
                StringBuilder k3 = C13555b.m33972k("Cannot get field 'tickets' because union is currently set to ");
                k3.append(MVPurchaseItineraryResponse.m28031k((MVPurchaseItineraryResponse._Fields) mVPurchaseItineraryResponse.setField_).f63355a);
                throw new RuntimeException(k3.toString());
            }
        }
        this.f32227n = arrayList;
        int i = kVar.f51768k;
        if (!((i / 100 == 2 || i == -1) && this.f32228o == null && this.f32229p == null)) {
            z4 = false;
        }
        this.f32226m = z4;
    }
}
