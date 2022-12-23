package com.moovit.app.mot.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.image.model.Image;
import com.moovit.transit.TransitStop;

public class MotNearestStationInfo implements Parcelable {
    public static final Parcelable.Creator<MotNearestStationInfo> CREATOR = new C15155a();

    /* renamed from: b */
    public final TransitStop f39023b;

    /* renamed from: c */
    public final Image f39024c;

    /* renamed from: com.moovit.app.mot.model.MotNearestStationInfo$a */
    public class C15155a implements Parcelable.Creator<MotNearestStationInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return new MotNearestStationInfo(parcel);
        }

        public final Object[] newArray(int i) {
            return new MotNearestStationInfo[i];
        }
    }

    public MotNearestStationInfo(TransitStop transitStop, Image image) {
        C21100e.m49373x(transitStop, "stop");
        this.f39023b = transitStop;
        this.f39024c = image;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f39023b, i);
        parcel.writeParcelable(this.f39024c, i);
    }

    public MotNearestStationInfo(Parcel parcel) {
        TransitStop transitStop = (TransitStop) parcel.readParcelable(TransitStop.class.getClassLoader());
        C21100e.m49373x(transitStop, "stop");
        this.f39023b = transitStop;
        this.f39024c = (Image) parcel.readParcelable(Image.class.getClassLoader());
    }
}
