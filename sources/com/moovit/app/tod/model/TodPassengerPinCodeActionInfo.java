package com.moovit.app.tod.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0017h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/app/tod/model/TodPassengerPinCodeActionInfo;", "Landroid/os/Parcelable;", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class TodPassengerPinCodeActionInfo implements Parcelable {
    public static final Parcelable.Creator<TodPassengerPinCodeActionInfo> CREATOR = new C15508a();

    /* renamed from: b */
    public final int f40259b;

    /* renamed from: c */
    public final String f40260c;

    /* renamed from: d */
    public final String f40261d;

    /* renamed from: e */
    public final String f40262e;

    /* renamed from: com.moovit.app.tod.model.TodPassengerPinCodeActionInfo$a */
    public static final class C15508a implements Parcelable.Creator<TodPassengerPinCodeActionInfo> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new TodPassengerPinCodeActionInfo(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new TodPassengerPinCodeActionInfo[i];
        }
    }

    public TodPassengerPinCodeActionInfo(int i, String str, String str2, String str3) {
        C24362h.m61211f(str, "title");
        C24362h.m61211f(str2, "cta");
        this.f40259b = i;
        this.f40260c = str;
        this.f40261d = str2;
        this.f40262e = str3;
        C21100e.m49375y(1, Integer.MAX_VALUE, "numberOfDigits", i);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TodPassengerPinCodeActionInfo)) {
            return false;
        }
        TodPassengerPinCodeActionInfo todPassengerPinCodeActionInfo = (TodPassengerPinCodeActionInfo) obj;
        return this.f40259b == todPassengerPinCodeActionInfo.f40259b && C24362h.m61206a(this.f40260c, todPassengerPinCodeActionInfo.f40260c) && C24362h.m61206a(this.f40261d, todPassengerPinCodeActionInfo.f40261d) && C24362h.m61206a(this.f40262e, todPassengerPinCodeActionInfo.f40262e);
    }

    public final int hashCode() {
        int i;
        int d = C13715c.m34238d(this.f40261d, C13715c.m34238d(this.f40260c, this.f40259b * 31, 31), 31);
        String str = this.f40262e;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        return d + i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodPassengerPinCodeActionInfo(numberOfDigits=");
        k.append(this.f40259b);
        k.append(", title=");
        k.append(this.f40260c);
        k.append(", cta=");
        k.append(this.f40261d);
        k.append(", instructions=");
        return C0017h.m57N(k, this.f40262e, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeInt(this.f40259b);
        parcel.writeString(this.f40260c);
        parcel.writeString(this.f40261d);
        parcel.writeString(this.f40262e);
    }
}
