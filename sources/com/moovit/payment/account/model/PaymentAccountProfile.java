package com.moovit.payment.account.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.appsflyer.ServerParameters;
import com.google.android.gms.common.Scopes;
import com.moovit.commons.utils.LinkedText;
import com.moovit.payment.registration.steps.profile.PaymentProfile;
import com.moovit.payment.registration.steps.profile.certificate.PaymentCertificateStatus;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class PaymentAccountProfile implements Parcelable {
    public static final Parcelable.Creator<PaymentAccountProfile> CREATOR = new C25681a();

    /* renamed from: f */
    public static final C25682b f64032f = new C25682b(PaymentAccountProfile.class);

    /* renamed from: b */
    public final PaymentProfile f64033b;

    /* renamed from: c */
    public final long f64034c;

    /* renamed from: d */
    public final PaymentCertificateStatus f64035d;

    /* renamed from: e */
    public final LinkedText f64036e;

    /* renamed from: com.moovit.payment.account.model.PaymentAccountProfile$a */
    public class C25681a implements Parcelable.Creator<PaymentAccountProfile> {
        public final Object createFromParcel(Parcel parcel) {
            return (PaymentAccountProfile) C19612n.m46981v(parcel, PaymentAccountProfile.f64032f);
        }

        public final Object[] newArray(int i) {
            return new PaymentAccountProfile[i];
        }
    }

    /* renamed from: com.moovit.payment.account.model.PaymentAccountProfile$b */
    public class C25682b extends C19619s<PaymentAccountProfile> {
        public C25682b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            PaymentProfile.C16390b bVar = PaymentProfile.f42827i;
            pVar.getClass();
            return new PaymentAccountProfile((PaymentProfile) bVar.read(pVar), pVar.mo51925m(), (PaymentCertificateStatus) C13555b.m33968g(PaymentCertificateStatus.CODER, pVar), (LinkedText) LinkedText.f41026d.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PaymentAccountProfile paymentAccountProfile = (PaymentAccountProfile) obj;
            PaymentProfile paymentProfile = paymentAccountProfile.f64033b;
            PaymentProfile.C16390b bVar = PaymentProfile.f42827i;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(paymentProfile, qVar);
            qVar.mo51940m(paymentAccountProfile.f64034c);
            PaymentCertificateStatus.CODER.write(paymentAccountProfile.f64035d, qVar);
            LinkedText linkedText = paymentAccountProfile.f64036e;
            LinkedText.C15774b bVar2 = LinkedText.f41026d;
            qVar.mo51939l(bVar2.f49802v);
            bVar2.mo179c(linkedText, qVar);
        }
    }

    public PaymentAccountProfile(PaymentProfile paymentProfile, long j, PaymentCertificateStatus paymentCertificateStatus, LinkedText linkedText) {
        C21100e.m49373x(paymentProfile, Scopes.PROFILE);
        this.f64033b = paymentProfile;
        this.f64034c = j;
        C21100e.m49373x(paymentCertificateStatus, ServerParameters.STATUS);
        this.f64035d = paymentCertificateStatus;
        C21100e.m49373x(linkedText, "linkedText");
        this.f64036e = linkedText;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentAccountProfile)) {
            return false;
        }
        PaymentAccountProfile paymentAccountProfile = (PaymentAccountProfile) obj;
        if (!this.f64033b.equals(paymentAccountProfile.f64033b) || this.f64034c != paymentAccountProfile.f64034c || !this.f64035d.equals(paymentAccountProfile.f64035d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f64033b), C17884p.m44334E(this.f64034c), C17884p.m44335F(this.f64035d));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f64032f);
    }
}
