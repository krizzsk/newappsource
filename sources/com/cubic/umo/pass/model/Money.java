package com.cubic.umo.pass.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/Money;", "Landroid/os/Parcelable;", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class Money implements Parcelable {
    public static final Parcelable.Creator<Money> CREATOR = new C2254a();

    /* renamed from: b */
    public final String f8139b;

    /* renamed from: c */
    public final int f8140c;

    /* renamed from: d */
    public final int f8141d;

    /* renamed from: com.cubic.umo.pass.model.Money$a */
    public static final class C2254a implements Parcelable.Creator<Money> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new Money(parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new Money[i];
        }
    }

    public Money(String str, int i, int i2) {
        C24362h.m61211f(str, AppsFlyerProperties.CURRENCY_CODE);
        this.f8139b = str;
        this.f8140c = i;
        this.f8141d = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Money)) {
            return false;
        }
        Money money = (Money) obj;
        return C24362h.m61206a(this.f8139b, money.f8139b) && this.f8140c == money.f8140c && this.f8141d == money.f8141d;
    }

    public final int hashCode() {
        return (((this.f8139b.hashCode() * 31) + this.f8140c) * 31) + this.f8141d;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Money(currencyCode=");
        k.append(this.f8139b);
        k.append(", units=");
        k.append(this.f8140c);
        k.append(", nanos=");
        return C16530d.m42014g(k, this.f8141d, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f8139b);
        parcel.writeInt(this.f8140c);
        parcel.writeInt(this.f8141d);
    }
}
