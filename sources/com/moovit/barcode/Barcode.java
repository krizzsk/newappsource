package com.moovit.barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.appboy.models.MessageButton;
import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0017h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/barcode/Barcode;", "Landroid/os/Parcelable;", "Barcode_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class Barcode implements Parcelable {
    public static final Parcelable.Creator<Barcode> CREATOR = new C15678a();

    /* renamed from: b */
    public final String f40798b;

    /* renamed from: com.moovit.barcode.Barcode$a */
    public static final class C15678a implements Parcelable.Creator<Barcode> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new Barcode(parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new Barcode[i];
        }
    }

    public Barcode(String str) {
        C24362h.m61211f(str, MessageButton.TEXT);
        this.f40798b = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Barcode) && C24362h.m61206a(this.f40798b, ((Barcode) obj).f40798b);
    }

    public final int hashCode() {
        return this.f40798b.hashCode();
    }

    public final String toString() {
        return C0017h.m57N(C13555b.m33972k("Barcode(text="), this.f40798b, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f40798b);
    }
}
