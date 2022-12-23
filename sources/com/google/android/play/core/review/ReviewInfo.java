package com.google.android.play.core.review;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"RestrictedApi"})
public abstract class ReviewInfo implements Parcelable {
    public static final Parcelable.Creator<ReviewInfo> CREATOR = new C14346a();

    /* renamed from: b */
    public abstract PendingIntent mo42948b();

    /* renamed from: c */
    public abstract boolean mo42949c();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(mo42948b(), 0);
        parcel.writeInt(mo42949c() ? 1 : 0);
    }
}
