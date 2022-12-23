package com.usebutton.sdk.internal.models;

import android.os.Parcel;
import android.os.Parcelable;

public class RecipientApplication implements Parcelable {
    public static final Parcelable.Creator<RecipientApplication> CREATOR = new Parcelable.Creator<RecipientApplication>() {
        public RecipientApplication createFromParcel(Parcel parcel) {
            return new RecipientApplication(parcel);
        }

        public RecipientApplication[] newArray(int i) {
            return new RecipientApplication[i];
        }
    };
    private final String mDescription;
    private final Asset mIcon;
    private final String mName;
    private final String mPackageName;

    public RecipientApplication(String str, String str2, String str3, Asset asset) {
        this.mName = str;
        this.mPackageName = str2;
        this.mDescription = str3;
        this.mIcon = asset;
    }

    public int describeContents() {
        return 0;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public Asset getIcon() {
        return this.mIcon;
    }

    public String getName() {
        return this.mName;
    }

    public String getPackageName() {
        return this.mPackageName;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mName);
        parcel.writeString(this.mPackageName);
        parcel.writeString(this.mDescription);
        parcel.writeParcelable(this.mIcon, 0);
    }

    public RecipientApplication(Parcel parcel) {
        this.mName = parcel.readString();
        this.mPackageName = parcel.readString();
        this.mDescription = parcel.readString();
        this.mIcon = (Asset) parcel.readParcelable(Asset.class.getClassLoader());
    }
}
