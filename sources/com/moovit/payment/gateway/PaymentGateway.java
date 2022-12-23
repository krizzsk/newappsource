package com.moovit.payment.gateway;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import b00.C13556a;
import ce0.C21100e;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.moovit.MoovitActivity;
import com.moovit.payment.gateway.cash.CashGateway;
import com.moovit.payment.gateway.clearanceprovider.ClearanceProviderGateway;
import com.moovit.payment.gateway.googlepay.GooglePayGateway;
import com.moovit.payment.gateway.paymentmethod.PaymentMethodGateway;
import com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType;
import com.moovit.request.UserRequestError;
import com.moovit.util.CurrencyAmount;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p669mz.C18490f;

public interface PaymentGateway extends Parcelable {

    /* renamed from: com.moovit.payment.gateway.PaymentGateway$a */
    public static class C16320a {

        /* renamed from: a */
        public final String f42656a;

        /* renamed from: b */
        public final String f42657b;

        /* renamed from: c */
        public final Map<String, String> f42658c;

        /* renamed from: d */
        public final PurchaseVerificationType f42659d;

        /* renamed from: e */
        public final CurrencyAmount f42660e;

        public C16320a(String str, String str2, Map<String, String> map, PurchaseVerificationType purchaseVerificationType, CurrencyAmount currencyAmount) {
            Map<String, String> map2;
            C21100e.m49373x(str, "paymentContext");
            this.f42656a = str;
            this.f42657b = str2;
            if (map != null) {
                map2 = Collections.unmodifiableMap(map);
            } else {
                map2 = Collections.emptyMap();
            }
            this.f42658c = map2;
            C21100e.m49373x(purchaseVerificationType, "verificationType");
            this.f42659d = purchaseVerificationType;
            this.f42660e = currencyAmount;
        }
    }

    /* renamed from: com.moovit.payment.gateway.PaymentGateway$b */
    public interface C16321b<V, R> {
        /* renamed from: O */
        R mo48919O(ClearanceProviderGateway clearanceProviderGateway, V v);

        /* renamed from: d1 */
        R mo48920d1(GooglePayGateway googlePayGateway, V v);

        /* renamed from: u1 */
        R mo48921u1(CashGateway cashGateway, V v);

        /* renamed from: w1 */
        R mo48922w1(PaymentMethodGateway paymentMethodGateway, V v);
    }

    /* renamed from: B1 */
    Task<Boolean> mo48903B1(Context context, PaymentGatewayInfo paymentGatewayInfo);

    /* renamed from: F1 */
    <V, R> R mo48904F1(C16321b<V, R> bVar, V v);

    /* renamed from: J0 */
    Tokenizer mo48905J0(C16320a aVar);

    PaymentGatewayType getType();

    public static class SimpleTokenizer extends Tokenizer {
        public static final Parcelable.Creator<SimpleTokenizer> CREATOR = new C16318a();

        /* renamed from: d */
        public final PaymentGatewayToken f42650d;

        /* renamed from: com.moovit.payment.gateway.PaymentGateway$SimpleTokenizer$a */
        public class C16318a implements Parcelable.Creator<SimpleTokenizer> {
            public final Object createFromParcel(Parcel parcel) {
                return new SimpleTokenizer(parcel);
            }

            public final Object[] newArray(int i) {
                return new SimpleTokenizer[i];
            }
        }

        public SimpleTokenizer(PaymentGatewayToken paymentGatewayToken) {
            this.f42650d = paymentGatewayToken;
        }

        public final int describeContents() {
            return 0;
        }

        /* renamed from: f */
        public final void mo48908f(MoovitActivity moovitActivity) {
            mo48912b(new Tokenizer.Result(1, this.f42650d, (UserRequestError) null));
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f42650d, i);
        }

        public SimpleTokenizer(Parcel parcel) {
            super(parcel);
            PaymentGatewayToken paymentGatewayToken = (PaymentGatewayToken) parcel.readParcelable(PaymentGatewayToken.class.getClassLoader());
            C21100e.m49373x(paymentGatewayToken, FirebaseMessagingService.EXTRA_TOKEN);
            this.f42650d = paymentGatewayToken;
        }
    }

    public static abstract class Tokenizer implements C13556a, Parcelable {

        /* renamed from: b */
        public final AtomicBoolean f42651b;

        /* renamed from: c */
        public final C18490f<Result> f42652c;

        public Tokenizer() {
            this.f42651b = new AtomicBoolean(false);
            this.f42652c = new C18490f<>();
        }

        /* renamed from: b */
        public final void mo48912b(Result result) {
            this.f42652c.postValue(result);
        }

        /* renamed from: c */
        public boolean mo48913c(MoovitActivity moovitActivity, int i, int i2, Intent intent) {
            return false;
        }

        public final boolean cancel(boolean z) {
            if (this.f42651b.compareAndSet(false, true)) {
                mo48914d();
                mo48912b(new Result(3, (PaymentGatewayToken) null, (UserRequestError) null));
            }
            return true;
        }

        /* renamed from: d */
        public void mo48914d() {
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: f */
        public abstract void mo48908f(MoovitActivity moovitActivity);

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f42651b.get() ? 1 : 0);
            parcel.writeParcelable(this.f42652c.getValue(), i);
        }

        public static class Result implements Parcelable {
            public static final Parcelable.Creator<Result> CREATOR = new C16319a();

            /* renamed from: b */
            public int f42653b;

            /* renamed from: c */
            public PaymentGatewayToken f42654c;

            /* renamed from: d */
            public Exception f42655d;

            /* renamed from: com.moovit.payment.gateway.PaymentGateway$Tokenizer$Result$a */
            public class C16319a implements Parcelable.Creator<Result> {
                public final Object createFromParcel(Parcel parcel) {
                    return new Result(parcel);
                }

                public final Object[] newArray(int i) {
                    return new Result[i];
                }
            }

            public Result(int i, PaymentGatewayToken paymentGatewayToken, UserRequestError userRequestError) {
                this.f42653b = i;
                this.f42654c = paymentGatewayToken;
                this.f42655d = userRequestError;
            }

            public final int describeContents() {
                return 0;
            }

            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f42653b);
                parcel.writeParcelable(this.f42654c, i);
                parcel.writeSerializable(this.f42655d);
            }

            public Result(Parcel parcel) {
                this.f42653b = parcel.readInt();
                this.f42654c = (PaymentGatewayToken) parcel.readParcelable(PaymentGatewayToken.class.getClassLoader());
                this.f42655d = (Exception) parcel.readSerializable();
            }
        }

        public Tokenizer(Parcel parcel) {
            this.f42651b = new AtomicBoolean(parcel.readInt() != 1 ? false : true);
            C18490f<Result> fVar = new C18490f<>();
            this.f42652c = fVar;
            fVar.setValue((Result) parcel.readParcelable(Result.class.getClassLoader()));
        }
    }
}
