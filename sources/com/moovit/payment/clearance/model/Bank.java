package com.moovit.payment.clearance.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;

public class Bank implements Parcelable {
    public static final Parcelable.Creator<Bank> CREATOR = new C16303a();

    /* renamed from: b */
    public final String f42599b;

    /* renamed from: c */
    public final ServerId f42600c;

    /* renamed from: d */
    public final String f42601d;

    /* renamed from: e */
    public final Image f42602e;

    /* renamed from: com.moovit.payment.clearance.model.Bank$a */
    public class C16303a implements Parcelable.Creator<Bank> {
        public final Object createFromParcel(Parcel parcel) {
            return new Bank(parcel);
        }

        public final Object[] newArray(int i) {
            return new Bank[i];
        }
    }

    public Bank(Image image, ServerId serverId, String str, String str2) {
        C21100e.m49373x(str, "type");
        this.f42599b = str;
        this.f42600c = serverId;
        C21100e.m49373x(str2, "name");
        this.f42601d = str2;
        C21100e.m49373x(image, "icon");
        this.f42602e = image;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f42599b);
        parcel.writeParcelable(this.f42600c, i);
        parcel.writeString(this.f42601d);
        parcel.writeParcelable(this.f42602e, i);
    }

    public Bank(Parcel parcel) {
        String readString = parcel.readString();
        C21100e.m49373x(readString, "type");
        this.f42599b = readString;
        ServerId serverId = (ServerId) parcel.readParcelable(ServerId.class.getClassLoader());
        C21100e.m49373x(serverId, "id");
        this.f42600c = serverId;
        String readString2 = parcel.readString();
        C21100e.m49373x(readString2, "name");
        this.f42601d = readString2;
        Image image = (Image) parcel.readParcelable(Image.class.getClassLoader());
        C21100e.m49373x(image, "icon");
        this.f42602e = image;
    }
}
