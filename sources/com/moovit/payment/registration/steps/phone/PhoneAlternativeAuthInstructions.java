package com.moovit.payment.registration.steps.phone;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.payment.registration.alternative.AlternativeAuthProvider;
import com.moovit.payment.registration.alternative.AlternativeWebAuthProvider;

public class PhoneAlternativeAuthInstructions implements Parcelable {
    public static final Parcelable.Creator<PhoneAlternativeAuthInstructions> CREATOR = new C16387a();

    /* renamed from: b */
    public final String f42823b;

    /* renamed from: c */
    public final AlternativeAuthProvider f42824c;

    /* renamed from: com.moovit.payment.registration.steps.phone.PhoneAlternativeAuthInstructions$a */
    public class C16387a implements Parcelable.Creator<PhoneAlternativeAuthInstructions> {
        public final Object createFromParcel(Parcel parcel) {
            return new PhoneAlternativeAuthInstructions(parcel);
        }

        public final Object[] newArray(int i) {
            return new PhoneAlternativeAuthInstructions[i];
        }
    }

    public PhoneAlternativeAuthInstructions(String str, AlternativeWebAuthProvider alternativeWebAuthProvider) {
        C21100e.m49373x(str, "actionText");
        this.f42823b = str;
        C21100e.m49373x(alternativeWebAuthProvider, "alternativeAuthProvider");
        this.f42824c = alternativeWebAuthProvider;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f42823b);
        parcel.writeParcelable(this.f42824c, i);
    }

    public PhoneAlternativeAuthInstructions(Parcel parcel) {
        String readString = parcel.readString();
        C21100e.m49373x(readString, "actionText");
        this.f42823b = readString;
        AlternativeAuthProvider alternativeAuthProvider = (AlternativeAuthProvider) parcel.readParcelable(AlternativeAuthProvider.class.getClassLoader());
        C21100e.m49373x(alternativeAuthProvider, "alternativeAuthProvider");
        this.f42824c = alternativeAuthProvider;
    }
}
