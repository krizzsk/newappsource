package com.moovit.payment.registration;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.payment.registration.alternative.AlternativeAuthProvider;
import com.moovit.payment.registration.steps.p420id.PaymentAccountId;
import com.moovit.view.address.Address;
import java.util.Calendar;

public final class PaymentRegistrationInfo implements Parcelable {
    public static final Parcelable.Creator<PaymentRegistrationInfo> CREATOR = new C16358a();

    /* renamed from: b */
    public String f42744b;

    /* renamed from: c */
    public AccountAuthType f42745c;

    /* renamed from: d */
    public AlternativeAuthProvider f42746d;

    /* renamed from: e */
    public boolean f42747e;

    /* renamed from: f */
    public int f42748f;

    /* renamed from: g */
    public String f42749g;

    /* renamed from: h */
    public String f42750h;

    /* renamed from: i */
    public String f42751i;

    /* renamed from: j */
    public String f42752j;

    /* renamed from: k */
    public String f42753k;

    /* renamed from: l */
    public String f42754l;

    /* renamed from: m */
    public Calendar f42755m;

    /* renamed from: n */
    public PaymentAccountId f42756n;

    /* renamed from: o */
    public Address f42757o;

    /* renamed from: com.moovit.payment.registration.PaymentRegistrationInfo$a */
    public class C16358a implements Parcelable.Creator<PaymentRegistrationInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return new PaymentRegistrationInfo(parcel);
        }

        public final Object[] newArray(int i) {
            return new PaymentRegistrationInfo[i];
        }
    }

    public PaymentRegistrationInfo() {
        this.f42744b = null;
        this.f42745c = null;
        this.f42746d = null;
        this.f42747e = false;
        this.f42748f = -1;
        this.f42749g = null;
        this.f42750h = null;
        this.f42751i = null;
        this.f42752j = null;
        this.f42753k = null;
        this.f42754l = null;
        this.f42755m = null;
        this.f42756n = null;
        this.f42757o = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f42744b);
        parcel.writeParcelable(this.f42745c, i);
        parcel.writeParcelable(this.f42746d, i);
        parcel.writeInt(this.f42747e ? 1 : 0);
        parcel.writeInt(this.f42748f);
        parcel.writeString(this.f42749g);
        parcel.writeString(this.f42750h);
        parcel.writeString(this.f42751i);
        parcel.writeString(this.f42752j);
        parcel.writeString(this.f42753k);
        parcel.writeString(this.f42754l);
        parcel.writeSerializable(this.f42755m);
        parcel.writeParcelable(this.f42756n, i);
        parcel.writeParcelable(this.f42757o, i);
    }

    public PaymentRegistrationInfo(Parcel parcel) {
        this.f42744b = parcel.readString();
        this.f42745c = (AccountAuthType) parcel.readParcelable(AccountAuthType.class.getClassLoader());
        this.f42746d = (AlternativeAuthProvider) parcel.readParcelable(AlternativeAuthProvider.class.getClassLoader());
        this.f42747e = parcel.readInt() != 1 ? false : true;
        this.f42748f = parcel.readInt();
        this.f42749g = parcel.readString();
        this.f42750h = parcel.readString();
        this.f42751i = parcel.readString();
        this.f42752j = parcel.readString();
        this.f42753k = parcel.readString();
        this.f42754l = parcel.readString();
        this.f42755m = (Calendar) parcel.readSerializable();
        this.f42756n = (PaymentAccountId) parcel.readParcelable(PaymentAccountId.class.getClassLoader());
        this.f42757o = (Address) parcel.readParcelable(Address.class.getClassLoader());
    }
}
