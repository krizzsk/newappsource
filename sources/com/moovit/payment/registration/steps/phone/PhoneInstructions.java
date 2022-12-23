package com.moovit.payment.registration.steps.phone;

import android.os.Parcel;
import android.os.Parcelable;

public class PhoneInstructions implements Parcelable {
    public static final Parcelable.Creator<PhoneInstructions> CREATOR = new C16388a();

    /* renamed from: b */
    public final PhoneAlternativeAuthInstructions f42825b;

    /* renamed from: c */
    public final PhoneAlternativeAuthInstructions f42826c;

    /* renamed from: com.moovit.payment.registration.steps.phone.PhoneInstructions$a */
    public class C16388a implements Parcelable.Creator<PhoneInstructions> {
        public final Object createFromParcel(Parcel parcel) {
            return new PhoneInstructions(parcel);
        }

        public final Object[] newArray(int i) {
            return new PhoneInstructions[i];
        }
    }

    public PhoneInstructions(PhoneAlternativeAuthInstructions phoneAlternativeAuthInstructions, PhoneAlternativeAuthInstructions phoneAlternativeAuthInstructions2) {
        this.f42825b = phoneAlternativeAuthInstructions;
        this.f42826c = phoneAlternativeAuthInstructions2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f42825b, i);
        parcel.writeParcelable(this.f42826c, i);
    }

    public PhoneInstructions(Parcel parcel) {
        this.f42825b = (PhoneAlternativeAuthInstructions) parcel.readParcelable(PhoneAlternativeAuthInstructions.class.getClassLoader());
        this.f42826c = (PhoneAlternativeAuthInstructions) parcel.readParcelable(PhoneAlternativeAuthInstructions.class.getClassLoader());
    }
}
