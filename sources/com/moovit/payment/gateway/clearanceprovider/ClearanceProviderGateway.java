package com.moovit.payment.gateway.clearanceprovider;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitActivity;
import com.moovit.payment.clearance.ClearanceProvider;
import com.moovit.payment.clearance.ClearanceProviderPaymentInstructions;
import com.moovit.payment.clearance.ClearanceProviderType;
import com.moovit.payment.gateway.PaymentGateway;
import com.moovit.payment.gateway.PaymentGatewayInfo;
import com.moovit.payment.gateway.PaymentGatewayToken;
import com.moovit.payment.gateway.PaymentGatewayType;
import com.moovit.payment.registration.steps.p419cc.CreditCardInstructions;
import com.moovit.request.UserRequestError;
import com.moovit.util.CurrencyAmount;
import java.util.Map;
import p583jk.C17884p;

public class ClearanceProviderGateway implements PaymentGateway {
    public static final Parcelable.Creator<ClearanceProviderGateway> CREATOR = new C16335a();

    /* renamed from: b */
    public final CreditCardInstructions f42690b;

    /* renamed from: com.moovit.payment.gateway.clearanceprovider.ClearanceProviderGateway$a */
    public class C16335a implements Parcelable.Creator<ClearanceProviderGateway> {
        public final Object createFromParcel(Parcel parcel) {
            return new ClearanceProviderGateway(parcel);
        }

        public final Object[] newArray(int i) {
            return new ClearanceProviderGateway[i];
        }
    }

    public ClearanceProviderGateway(CreditCardInstructions creditCardInstructions) {
        this.f42690b = creditCardInstructions;
    }

    /* renamed from: B1 */
    public final Task<Boolean> mo48903B1(Context context, PaymentGatewayInfo paymentGatewayInfo) {
        String str;
        boolean z;
        if (paymentGatewayInfo != null) {
            str = paymentGatewayInfo.f42675d;
        } else {
            str = null;
        }
        if (str == null || !this.f42690b.f42774c.f42605c.getClearanceProvider().mo48829f().contains(ClearanceProvider.Capabilities.PAYMENT)) {
            z = false;
        } else {
            z = true;
        }
        return Tasks.forResult(Boolean.valueOf(z));
    }

    /* renamed from: F1 */
    public final <V, R> R mo48904F1(PaymentGateway.C16321b<V, R> bVar, V v) {
        return bVar.mo48919O(this, v);
    }

    /* renamed from: J0 */
    public final PaymentGateway.Tokenizer mo48905J0(PaymentGateway.C16320a aVar) {
        return new ClearanceProviderTokenizer(aVar.f42656a, aVar.f42657b, aVar.f42658c, aVar.f42660e, this.f42690b);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClearanceProviderGateway)) {
            return false;
        }
        return this.f42690b.equals(((ClearanceProviderGateway) obj).f42690b);
    }

    public final PaymentGatewayType getType() {
        return PaymentGatewayType.CLEARANCE_PROVIDER;
    }

    public final int hashCode() {
        return C17884p.m44335F(this.f42690b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f42690b, i);
    }

    public static class ClearanceProviderTokenizer extends PaymentGateway.Tokenizer {
        public static final Parcelable.Creator<ClearanceProviderTokenizer> CREATOR = new C16334a();

        /* renamed from: d */
        public final ClearanceProviderPaymentInstructions f42691d;

        /* renamed from: com.moovit.payment.gateway.clearanceprovider.ClearanceProviderGateway$ClearanceProviderTokenizer$a */
        public class C16334a implements Parcelable.Creator<ClearanceProviderTokenizer> {
            public final Object createFromParcel(Parcel parcel) {
                return new ClearanceProviderTokenizer(parcel);
            }

            public final Object[] newArray(int i) {
                return new ClearanceProviderTokenizer[i];
            }
        }

        public ClearanceProviderTokenizer(String str, String str2, Map<String, String> map, CurrencyAmount currencyAmount, CreditCardInstructions creditCardInstructions) {
            this.f42691d = new ClearanceProviderPaymentInstructions(str, str2, map, creditCardInstructions, currencyAmount);
        }

        /* renamed from: c */
        public final boolean mo48913c(MoovitActivity moovitActivity, int i, int i2, Intent intent) {
            if (i != 3835) {
                return false;
            }
            if (i2 == -1) {
                int i3 = PaymentClearanceProviderActivity.f42694U;
                ClearanceProviderType clearanceProviderType = (ClearanceProviderType) intent.getParcelableExtra("clearanceProviderType");
                String stringExtra = intent.getStringExtra("paymentToken");
                if (clearanceProviderType == null || stringExtra == null) {
                    mo48912b(new PaymentGateway.Tokenizer.Result(3, (PaymentGatewayToken) null, (UserRequestError) null));
                } else {
                    mo48912b(new PaymentGateway.Tokenizer.Result(1, new ClearanceProviderGatewayToken(clearanceProviderType, stringExtra), (UserRequestError) null));
                }
            } else if (i2 == 0) {
                mo48912b(new PaymentGateway.Tokenizer.Result(3, (PaymentGatewayToken) null, (UserRequestError) null));
            }
            return true;
        }

        public final int describeContents() {
            return 0;
        }

        /* renamed from: f */
        public final void mo48908f(MoovitActivity moovitActivity) {
            ClearanceProviderPaymentInstructions clearanceProviderPaymentInstructions = this.f42691d;
            int i = PaymentClearanceProviderActivity.f42694U;
            Intent intent = new Intent(moovitActivity, PaymentClearanceProviderActivity.class);
            intent.putExtra("paymentInstructions", clearanceProviderPaymentInstructions);
            moovitActivity.startActivityForResult(intent, 3835);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f42691d, i);
        }

        public ClearanceProviderTokenizer(Parcel parcel) {
            super(parcel);
            ClearanceProviderPaymentInstructions clearanceProviderPaymentInstructions = (ClearanceProviderPaymentInstructions) parcel.readParcelable(ClearanceProviderPaymentInstructions.class.getClassLoader());
            C21100e.m49373x(clearanceProviderPaymentInstructions, "paymentInstructions");
            this.f42691d = clearanceProviderPaymentInstructions;
        }
    }

    public ClearanceProviderGateway(Parcel parcel) {
        CreditCardInstructions creditCardInstructions = (CreditCardInstructions) parcel.readParcelable(CreditCardInstructions.class.getClassLoader());
        C21100e.m49373x(creditCardInstructions, "creditCardInstructions");
        this.f42690b = creditCardInstructions;
    }
}
