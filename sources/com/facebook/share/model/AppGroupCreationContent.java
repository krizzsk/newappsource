package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo59060d2 = {"Lcom/facebook/share/model/AppGroupCreationContent;", "Lcom/facebook/share/model/ShareModel;", "AppGroupPrivacy", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class AppGroupCreationContent implements ShareModel {
    public static final Parcelable.Creator<AppGroupCreationContent> CREATOR = new C2491a();

    /* renamed from: b */
    public final String f8900b;

    /* renamed from: c */
    public final String f8901c;

    /* renamed from: d */
    public final AppGroupPrivacy f8902d;

    @Metadata(mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo59060d2 = {"Lcom/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy;", "", "(Ljava/lang/String;I)V", "Open", "Closed", "facebook-common_release"}, mo59061k = 1, mo59062mv = {1, 5, 1}, mo59064xi = 48)
    public enum AppGroupPrivacy {
        Open,
        Closed
    }

    /* renamed from: com.facebook.share.model.AppGroupCreationContent$a */
    public static final class C2491a implements Parcelable.Creator<AppGroupCreationContent> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new AppGroupCreationContent(parcel);
        }

        public final Object[] newArray(int i) {
            return new AppGroupCreationContent[i];
        }
    }

    public AppGroupCreationContent(Parcel parcel) {
        C24362h.m61211f(parcel, "parcel");
        this.f8900b = parcel.readString();
        this.f8901c = parcel.readString();
        this.f8902d = (AppGroupPrivacy) parcel.readSerializable();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeString(this.f8900b);
        parcel.writeString(this.f8901c);
        parcel.writeSerializable(this.f8902d);
    }
}
