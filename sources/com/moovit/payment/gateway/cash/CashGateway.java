package com.moovit.payment.gateway.cash;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.image.model.Image;
import com.moovit.payment.gateway.PaymentGateway;
import com.moovit.payment.gateway.PaymentGatewayInfo;
import com.moovit.payment.gateway.PaymentGatewayToken;
import com.moovit.payment.gateway.PaymentGatewayType;

public class CashGateway implements PaymentGateway {
    public static final Parcelable.Creator<CashGateway> CREATOR = new C16332a();

    /* renamed from: b */
    public final Image f42687b;

    /* renamed from: c */
    public final String f42688c;

    /* renamed from: d */
    public final String f42689d;

    /* renamed from: com.moovit.payment.gateway.cash.CashGateway$a */
    public class C16332a implements Parcelable.Creator<CashGateway> {
        public final Object createFromParcel(Parcel parcel) {
            return new CashGateway(parcel);
        }

        public final Object[] newArray(int i) {
            return new CashGateway[i];
        }
    }

    public CashGateway(Image image, String str, String str2) {
        this.f42687b = image;
        this.f42688c = str;
        this.f42689d = str2;
    }

    /* renamed from: B1 */
    public final Task<Boolean> mo48903B1(Context context, PaymentGatewayInfo paymentGatewayInfo) {
        return Tasks.forResult(Boolean.TRUE);
    }

    /* renamed from: F1 */
    public final <V, R> R mo48904F1(PaymentGateway.C16321b<V, R> bVar, V v) {
        return bVar.mo48921u1(this, v);
    }

    /* renamed from: J0 */
    public final PaymentGateway.Tokenizer mo48905J0(PaymentGateway.C16320a aVar) {
        return new PaymentGateway.SimpleTokenizer((PaymentGatewayToken) new CashGatewayToken());
    }

    public final int describeContents() {
        return 0;
    }

    public final PaymentGatewayType getType() {
        return PaymentGatewayType.CASH;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f42687b, i);
        parcel.writeString(this.f42688c);
        parcel.writeString(this.f42689d);
    }

    public CashGateway(Parcel parcel) {
        this.f42687b = (Image) parcel.readParcelable(Image.class.getClassLoader());
        this.f42688c = parcel.readString();
        this.f42689d = parcel.readString();
    }
}
