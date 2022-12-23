package com.moovit.payment.account.externalpayment;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.payment.account.externalpayment.ExternalPaymentMethodPreview;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.account.paymentmethod.PaymentMethodId;
import com.moovit.payment.account.paymentmethod.PaymentMethodStatus;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class ExternalPaymentMethod extends PaymentMethod {
    public static final Parcelable.Creator<ExternalPaymentMethod> CREATOR = new C25668a();

    /* renamed from: f */
    public static final C25669b f64006f = new C25669b(ExternalPaymentMethod.class);

    /* renamed from: e */
    public final ExternalPaymentMethodPreview f64007e;

    /* renamed from: com.moovit.payment.account.externalpayment.ExternalPaymentMethod$a */
    public class C25668a implements Parcelable.Creator<ExternalPaymentMethod> {
        public final Object createFromParcel(Parcel parcel) {
            return (ExternalPaymentMethod) C19612n.m46981v(parcel, ExternalPaymentMethod.f64006f);
        }

        public final Object[] newArray(int i) {
            return new ExternalPaymentMethod[i];
        }
    }

    /* renamed from: com.moovit.payment.account.externalpayment.ExternalPaymentMethod$b */
    public class C25669b extends C19619s<ExternalPaymentMethod> {
        public C25669b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            PaymentMethodId.C25690b bVar = PaymentMethodId.f64055d;
            pVar.getClass();
            return new ExternalPaymentMethod((PaymentMethodId) bVar.read(pVar), pVar.mo51919b(), (PaymentMethodStatus) pVar.mo51962q(PaymentMethodStatus.CODER), (ExternalPaymentMethodPreview) ExternalPaymentMethodPreview.f64008e.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            ExternalPaymentMethod externalPaymentMethod = (ExternalPaymentMethod) obj;
            PaymentMethodId paymentMethodId = externalPaymentMethod.f64052b;
            PaymentMethodId.C25690b bVar = PaymentMethodId.f64055d;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(paymentMethodId, qVar);
            qVar.mo51934b(externalPaymentMethod.f64053c);
            qVar.mo51967q(externalPaymentMethod.f64054d, PaymentMethodStatus.CODER);
            ExternalPaymentMethodPreview externalPaymentMethodPreview = externalPaymentMethod.f64007e;
            ExternalPaymentMethodPreview.C25671b bVar2 = ExternalPaymentMethodPreview.f64008e;
            qVar.mo51939l(bVar2.f49802v);
            bVar2.mo179c(externalPaymentMethodPreview, qVar);
        }
    }

    public ExternalPaymentMethod(PaymentMethodId paymentMethodId, boolean z, PaymentMethodStatus paymentMethodStatus, ExternalPaymentMethodPreview externalPaymentMethodPreview) {
        super(paymentMethodId, z, paymentMethodStatus);
        C21100e.m49373x(externalPaymentMethodPreview, "preview");
        this.f64007e = externalPaymentMethodPreview;
    }

    /* renamed from: b */
    public final <V, R> R mo83416b(PaymentMethod.C25688a<V, R> aVar, V v) {
        return aVar.mo48924K0(this, v);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f64006f);
    }
}
