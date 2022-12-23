package com.usebutton.sdk.internal.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.usebutton.sdk.internal.api.models.AutofillDTO;

public class Autofill implements Parcelable {
    public static final Parcelable.Creator<Autofill> CREATOR = new Parcelable.Creator<Autofill>() {
        public Autofill createFromParcel(Parcel parcel) {
            return new Autofill(parcel);
        }

        public Autofill[] newArray(int i) {
            return new Autofill[i];
        }
    };
    private final boolean disableCreditCardAutofill;
    private final boolean disableSystemAutofill;

    public Autofill(boolean z, boolean z2) {
        this.disableSystemAutofill = z;
        this.disableCreditCardAutofill = z2;
    }

    public static Autofill fromDTO(AutofillDTO autofillDTO) {
        if (autofillDTO == null) {
            return null;
        }
        return new Autofill(autofillDTO.shouldDisableSystemAutofill(), autofillDTO.shouldDisableCreditCardAutofill());
    }

    public int describeContents() {
        return 0;
    }

    public boolean shouldDisableCreditCardAutofill() {
        return this.disableCreditCardAutofill;
    }

    public boolean shouldDisableSystemAutofill() {
        return this.disableSystemAutofill;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Autofill{disableSystemAutofill=");
        k.append(this.disableSystemAutofill);
        k.append(", disableCreditCardAutofill=");
        return C13715c.m34247m(k, this.disableCreditCardAutofill, '}');
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.disableSystemAutofill ? (byte) 1 : 0);
        parcel.writeByte(this.disableCreditCardAutofill ? (byte) 1 : 0);
    }

    public Autofill(Parcel parcel) {
        boolean z = true;
        this.disableSystemAutofill = parcel.readByte() != 0;
        this.disableCreditCardAutofill = parcel.readByte() == 0 ? false : z;
    }
}
