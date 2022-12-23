package com.moovit.payment.account.bank;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.payment.account.bank.BankPreview;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.account.paymentmethod.PaymentMethodId;
import com.moovit.payment.account.paymentmethod.PaymentMethodStatus;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class BankPaymentMethod extends PaymentMethod {
    public static final Parcelable.Creator<BankPaymentMethod> CREATOR = new C25631a();

    /* renamed from: f */
    public static final C25632b f63931f = new C25632b(BankPaymentMethod.class);

    /* renamed from: e */
    public final BankPreview f63932e;

    /* renamed from: com.moovit.payment.account.bank.BankPaymentMethod$a */
    public class C25631a implements Parcelable.Creator<BankPaymentMethod> {
        public final Object createFromParcel(Parcel parcel) {
            return (BankPaymentMethod) C19612n.m46981v(parcel, BankPaymentMethod.f63931f);
        }

        public final Object[] newArray(int i) {
            return new BankPaymentMethod[i];
        }
    }

    /* renamed from: com.moovit.payment.account.bank.BankPaymentMethod$b */
    public class C25632b extends C19619s<BankPaymentMethod> {
        public C25632b(Class cls) {
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
            return new BankPaymentMethod((PaymentMethodId) bVar.read(pVar), pVar.mo51919b(), (PaymentMethodStatus) pVar.mo51962q(PaymentMethodStatus.CODER), (BankPreview) BankPreview.f63933e.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            BankPaymentMethod bankPaymentMethod = (BankPaymentMethod) obj;
            PaymentMethodId paymentMethodId = bankPaymentMethod.f64052b;
            PaymentMethodId.C25690b bVar = PaymentMethodId.f64055d;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(paymentMethodId, qVar);
            qVar.mo51934b(bankPaymentMethod.f64053c);
            qVar.mo51967q(bankPaymentMethod.f64054d, PaymentMethodStatus.CODER);
            BankPreview bankPreview = bankPaymentMethod.f63932e;
            BankPreview.C25634b bVar2 = BankPreview.f63933e;
            qVar.mo51939l(bVar2.f49802v);
            bVar2.mo179c(bankPreview, qVar);
        }
    }

    public BankPaymentMethod(PaymentMethodId paymentMethodId, boolean z, PaymentMethodStatus paymentMethodStatus, BankPreview bankPreview) {
        super(paymentMethodId, z, paymentMethodStatus);
        C21100e.m49373x(bankPreview, "bankPreview");
        this.f63932e = bankPreview;
    }

    /* renamed from: b */
    public final <V, R> R mo83416b(PaymentMethod.C25688a<V, R> aVar, V v) {
        return aVar.mo48930z0(this, v);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f63931f);
    }
}
