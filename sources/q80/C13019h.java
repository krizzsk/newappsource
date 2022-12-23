package q80;

import c70.C13746a;
import c70.C13780t;
import ce0.C21100e;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.moovit.ticketing.ticket.Ticket;
import com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationSteps;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFareData;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFareResponse;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseVerifacationType;
import h60.C17353s0;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.List;
import org.apache.thrift.TBase;
import v80.C13184b;

/* renamed from: q80.h */
public final class C13019h extends C13780t<C13018g, C13019h, MVPurchaseFareResponse> {

    /* renamed from: m */
    public boolean f32216m;

    /* renamed from: n */
    public C13184b f32217n;

    /* renamed from: o */
    public List<Ticket> f32218o;

    /* renamed from: p */
    public String f32219p;

    /* renamed from: q */
    public PaymentRegistrationInstructions f32220q;

    /* renamed from: r */
    public PurchaseVerificationType f32221r;

    public C13019h() {
        super(MVPurchaseFareResponse.class);
    }

    /* renamed from: l */
    public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
        boolean z;
        boolean z2;
        MVPurchaseFareData mVPurchaseFareData;
        List<Ticket> list;
        String str;
        boolean z3;
        PaymentRegistrationInstructions paymentRegistrationInstructions;
        boolean z4;
        C13018g gVar = (C13018g) aVar;
        MVPurchaseFareResponse mVPurchaseFareResponse = (MVPurchaseFareResponse) tBase;
        F f = mVPurchaseFareResponse.setField_;
        F f2 = MVPurchaseFareResponse._Fields.VERIFICATION_TYPE;
        boolean z5 = true;
        if (f == f2) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !MVPurchaseVerifacationType.NONE.equals(mVPurchaseFareResponse.mo32559l())) {
            this.f32217n = gVar.f32215x;
            F f3 = mVPurchaseFareResponse.setField_;
            F f4 = MVPurchaseFareResponse._Fields.FARE_DATA;
            if (f3 == f4) {
                z2 = true;
            } else {
                z2 = false;
            }
            PurchaseVerificationType purchaseVerificationType = null;
            if (!z2) {
                mVPurchaseFareData = null;
            } else if (f3 == f4) {
                mVPurchaseFareData = (MVPurchaseFareData) mVPurchaseFareResponse.value_;
            } else {
                StringBuilder k = C13555b.m33972k("Cannot get field 'fareData' because union is currently set to ");
                k.append(MVPurchaseFareResponse.m27857k((MVPurchaseFareResponse._Fields) mVPurchaseFareResponse.setField_).f63355a);
                throw new RuntimeException(k.toString());
            }
            if (mVPurchaseFareData == null || !mVPurchaseFareData.mo32537g()) {
                list = null;
            } else {
                list = Collections.unmodifiableList(C13036y.m32956h(gVar.f32214w, mVPurchaseFareData.tickets));
            }
            this.f32218o = list;
            if (mVPurchaseFareData == null || !mVPurchaseFareData.mo32536f()) {
                str = null;
            } else {
                str = mVPurchaseFareData.paymentData;
            }
            this.f32219p = str;
            F f5 = mVPurchaseFareResponse.setField_;
            F f6 = MVPurchaseFareResponse._Fields.MISSING_STEPS;
            if (f5 == f6) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                paymentRegistrationInstructions = null;
            } else if (f5 == f6) {
                paymentRegistrationInstructions = C17353s0.m43400n((MVMissingPaymentRegistrationSteps) mVPurchaseFareResponse.value_);
            } else {
                StringBuilder k2 = C13555b.m33972k("Cannot get field 'missingSteps' because union is currently set to ");
                k2.append(MVPurchaseFareResponse.m27857k((MVPurchaseFareResponse._Fields) mVPurchaseFareResponse.setField_).f63355a);
                throw new RuntimeException(k2.toString());
            }
            this.f32220q = paymentRegistrationInstructions;
            if (mVPurchaseFareResponse.setField_ == f2) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                purchaseVerificationType = C13036y.m32957i(mVPurchaseFareResponse.mo32559l());
            }
            this.f32221r = purchaseVerificationType;
            int i = gVar.f51768k;
            if (!((i / 100 == 2 || i == -1) && this.f32220q == null && purchaseVerificationType == null)) {
                z5 = false;
            }
            this.f32216m = z5;
            return;
        }
        StringBuilder k3 = C13555b.m33972k("Illegal purchase verification type: ");
        k3.append(mVPurchaseFareResponse.mo32559l());
        throw new BadResponseException(k3.toString());
    }

    public C13019h(C13184b bVar, List<Ticket> list, String str) {
        super(MVPurchaseFareResponse.class);
        this.f32216m = true;
        C21100e.m49373x(bVar, "purchaseInfo");
        this.f32217n = bVar;
        this.f32218o = list;
        this.f32219p = str;
        this.f32220q = null;
        this.f32221r = null;
    }

    public C13019h(PaymentRegistrationInstructions paymentRegistrationInstructions) {
        super(MVPurchaseFareResponse.class);
        this.f32216m = false;
        this.f32217n = null;
        this.f32218o = null;
        this.f32219p = null;
        this.f32220q = paymentRegistrationInstructions;
        this.f32221r = null;
    }
}
