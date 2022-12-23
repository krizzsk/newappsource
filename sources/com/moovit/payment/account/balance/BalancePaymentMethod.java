package com.moovit.payment.account.balance;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.payment.account.balance.BalancePreview;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.account.paymentmethod.PaymentMethodId;
import com.moovit.payment.account.paymentmethod.PaymentMethodStatus;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class BalancePaymentMethod extends PaymentMethod {
    public static final Parcelable.Creator<BalancePaymentMethod> CREATOR = new C25627a();

    /* renamed from: f */
    public static final C25628b f63925f = new C25628b(BalancePaymentMethod.class);

    /* renamed from: e */
    public final BalancePreview f63926e;

    /* renamed from: com.moovit.payment.account.balance.BalancePaymentMethod$a */
    public class C25627a implements Parcelable.Creator<BalancePaymentMethod> {
        public final Object createFromParcel(Parcel parcel) {
            return (BalancePaymentMethod) C19612n.m46981v(parcel, BalancePaymentMethod.f63925f);
        }

        public final Object[] newArray(int i) {
            return new BalancePaymentMethod[i];
        }
    }

    /* renamed from: com.moovit.payment.account.balance.BalancePaymentMethod$b */
    public class C25628b extends C19619s<BalancePaymentMethod> {
        public C25628b(Class cls) {
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
            return new BalancePaymentMethod((PaymentMethodId) bVar.read(pVar), pVar.mo51919b(), (PaymentMethodStatus) pVar.mo51962q(PaymentMethodStatus.CODER), (BalancePreview) BalancePreview.f63927e.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            BalancePaymentMethod balancePaymentMethod = (BalancePaymentMethod) obj;
            PaymentMethodId paymentMethodId = balancePaymentMethod.f64052b;
            PaymentMethodId.C25690b bVar = PaymentMethodId.f64055d;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(paymentMethodId, qVar);
            qVar.mo51934b(balancePaymentMethod.f64053c);
            qVar.mo51967q(balancePaymentMethod.f64054d, PaymentMethodStatus.CODER);
            BalancePreview balancePreview = balancePaymentMethod.f63926e;
            BalancePreview.C25630b bVar2 = BalancePreview.f63927e;
            qVar.mo51939l(bVar2.f49802v);
            bVar2.mo179c(balancePreview, qVar);
        }
    }

    public BalancePaymentMethod(PaymentMethodId paymentMethodId, boolean z, PaymentMethodStatus paymentMethodStatus, BalancePreview balancePreview) {
        super(paymentMethodId, z, paymentMethodStatus);
        C21100e.m49373x(balancePreview, "balancePreview");
        this.f63926e = balancePreview;
    }

    /* renamed from: b */
    public final <V, R> R mo83416b(PaymentMethod.C25688a<V, R> aVar, V v) {
        return aVar.mo48929u(this, v);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f63925f);
    }
}
