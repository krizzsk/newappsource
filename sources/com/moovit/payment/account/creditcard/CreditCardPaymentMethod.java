package com.moovit.payment.account.creditcard;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.account.paymentmethod.PaymentMethodId;
import com.moovit.payment.account.paymentmethod.PaymentMethodStatus;
import com.moovit.view.p340cc.CreditCardPreview;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class CreditCardPaymentMethod extends PaymentMethod {
    public static final Parcelable.Creator<CreditCardPaymentMethod> CREATOR = new C25637a();

    /* renamed from: f */
    public static final C25638b f63942f = new C25638b(CreditCardPaymentMethod.class);

    /* renamed from: e */
    public final CreditCardPreview f63943e;

    /* renamed from: com.moovit.payment.account.creditcard.CreditCardPaymentMethod$a */
    public class C25637a implements Parcelable.Creator<CreditCardPaymentMethod> {
        public final Object createFromParcel(Parcel parcel) {
            return (CreditCardPaymentMethod) C19612n.m46981v(parcel, CreditCardPaymentMethod.f63942f);
        }

        public final Object[] newArray(int i) {
            return new CreditCardPaymentMethod[i];
        }
    }

    /* renamed from: com.moovit.payment.account.creditcard.CreditCardPaymentMethod$b */
    public class C25638b extends C19619s<CreditCardPaymentMethod> {
        public C25638b(Class cls) {
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
            return new CreditCardPaymentMethod((PaymentMethodId) bVar.read(pVar), pVar.mo51919b(), (PaymentMethodStatus) pVar.mo51962q(PaymentMethodStatus.CODER), (CreditCardPreview) CreditCardPreview.f24081f.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            CreditCardPaymentMethod creditCardPaymentMethod = (CreditCardPaymentMethod) obj;
            PaymentMethodId paymentMethodId = creditCardPaymentMethod.f64052b;
            PaymentMethodId.C25690b bVar = PaymentMethodId.f64055d;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(paymentMethodId, qVar);
            qVar.mo51934b(creditCardPaymentMethod.f64053c);
            qVar.mo51967q(creditCardPaymentMethod.f64054d, PaymentMethodStatus.CODER);
            CreditCardPreview creditCardPreview = creditCardPaymentMethod.f63943e;
            CreditCardPreview.C7956b bVar2 = CreditCardPreview.f24081f;
            qVar.mo51939l(bVar2.f49802v);
            bVar2.mo179c(creditCardPreview, qVar);
        }
    }

    public CreditCardPaymentMethod(PaymentMethodId paymentMethodId, boolean z, PaymentMethodStatus paymentMethodStatus, CreditCardPreview creditCardPreview) {
        super(paymentMethodId, z, paymentMethodStatus);
        C21100e.m49373x(creditCardPreview, "creditCardPreview");
        this.f63943e = creditCardPreview;
    }

    /* renamed from: b */
    public final <V, R> R mo83416b(PaymentMethod.C25688a<V, R> aVar, V v) {
        return aVar.mo48923C1(this, v);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f63942f);
    }
}
