package com.facebook.share.model;

import android.os.Parcel;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/facebook/share/model/ShareMessengerActionButton;", "Lcom/facebook/share/model/ShareModel;", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public abstract class ShareMessengerActionButton implements ShareModel {

    /* renamed from: b */
    public final String f8937b;

    public ShareMessengerActionButton(Parcel parcel) {
        C24362h.m61211f(parcel, "parcel");
        this.f8937b = parcel.readString();
    }

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "dest");
        parcel.writeString(this.f8937b);
    }
}
