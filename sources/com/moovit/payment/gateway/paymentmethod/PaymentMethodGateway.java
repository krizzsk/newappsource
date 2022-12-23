package com.moovit.payment.gateway.paymentmethod;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.payment.account.balance.BalancePaymentMethod;
import com.moovit.payment.account.bank.BankPaymentMethod;
import com.moovit.payment.account.creditcard.CreditCardPaymentMethod;
import com.moovit.payment.account.externalpayment.ExternalPaymentMethod;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.gateway.PaymentGateway;
import com.moovit.payment.gateway.PaymentGatewayInfo;
import com.moovit.payment.gateway.PaymentGatewayToken;
import com.moovit.payment.gateway.PaymentGatewayType;
import p583jk.C17884p;

public class PaymentMethodGateway implements PaymentGateway, PaymentMethod.C25688a<PurchaseVerificationType, PaymentGateway.Tokenizer> {
    public static final Parcelable.Creator<PaymentMethodGateway> CREATOR = new C16344a();

    /* renamed from: b */
    public final PaymentMethod f42704b;

    /* renamed from: com.moovit.payment.gateway.paymentmethod.PaymentMethodGateway$a */
    public class C16344a implements Parcelable.Creator<PaymentMethodGateway> {
        public final Object createFromParcel(Parcel parcel) {
            return new PaymentMethodGateway(parcel);
        }

        public final Object[] newArray(int i) {
            return new PaymentMethodGateway[i];
        }
    }

    /* renamed from: com.moovit.payment.gateway.paymentmethod.PaymentMethodGateway$b */
    public static /* synthetic */ class C16345b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42705a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType[] r0 = com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42705a = r0
                com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType r1 = com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType.CVV     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f42705a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType r1 = com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType.NONE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.payment.gateway.paymentmethod.PaymentMethodGateway.C16345b.<clinit>():void");
        }
    }

    public PaymentMethodGateway(PaymentMethod paymentMethod) {
        C21100e.m49373x(paymentMethod, "paymentMethod");
        this.f42704b = paymentMethod;
    }

    /* renamed from: B1 */
    public final Task<Boolean> mo48903B1(Context context, PaymentGatewayInfo paymentGatewayInfo) {
        return Tasks.forResult(Boolean.TRUE);
    }

    /* renamed from: C1 */
    public final Object mo48923C1(CreditCardPaymentMethod creditCardPaymentMethod, Object obj) {
        if (C16345b.f42705a[((PurchaseVerificationType) obj).ordinal()] != 1) {
            return new PaymentGateway.SimpleTokenizer((PaymentGatewayToken) new PaymentMethodGatewayToken(creditCardPaymentMethod.f64052b, (String) null));
        }
        return new PaymentMethodCvvTokenizer(creditCardPaymentMethod);
    }

    /* renamed from: F1 */
    public final <V, R> R mo48904F1(PaymentGateway.C16321b<V, R> bVar, V v) {
        return bVar.mo48922w1(this, v);
    }

    /* renamed from: J0 */
    public final PaymentGateway.Tokenizer mo48905J0(PaymentGateway.C16320a aVar) {
        return (PaymentGateway.Tokenizer) this.f42704b.mo83416b(this, aVar.f42659d);
    }

    /* renamed from: K0 */
    public final Object mo48924K0(ExternalPaymentMethod externalPaymentMethod, Object obj) {
        PurchaseVerificationType purchaseVerificationType = (PurchaseVerificationType) obj;
        return new PaymentGateway.SimpleTokenizer((PaymentGatewayToken) new PaymentMethodGatewayToken(externalPaymentMethod.f64052b, (String) null));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodGateway)) {
            return false;
        }
        return this.f42704b.equals(((PaymentMethodGateway) obj).f42704b);
    }

    public final PaymentGatewayType getType() {
        return PaymentGatewayType.PAYMENT_METHOD;
    }

    public final int hashCode() {
        return C17884p.m44335F(this.f42704b);
    }

    /* renamed from: u */
    public final Object mo48929u(BalancePaymentMethod balancePaymentMethod, Object obj) {
        PurchaseVerificationType purchaseVerificationType = (PurchaseVerificationType) obj;
        return new PaymentGateway.SimpleTokenizer((PaymentGatewayToken) new PaymentMethodGatewayToken(balancePaymentMethod.f64052b, (String) null));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f42704b, i);
    }

    /* renamed from: z0 */
    public final Object mo48930z0(BankPaymentMethod bankPaymentMethod, Object obj) {
        PurchaseVerificationType purchaseVerificationType = (PurchaseVerificationType) obj;
        return new PaymentGateway.SimpleTokenizer((PaymentGatewayToken) new PaymentMethodGatewayToken(bankPaymentMethod.f64052b, (String) null));
    }

    public PaymentMethodGateway(Parcel parcel) {
        PaymentMethod paymentMethod = (PaymentMethod) parcel.readParcelable(PaymentMethod.class.getClassLoader());
        C21100e.m49373x(paymentMethod, "PaymentMethod");
        this.f42704b = paymentMethod;
    }
}
