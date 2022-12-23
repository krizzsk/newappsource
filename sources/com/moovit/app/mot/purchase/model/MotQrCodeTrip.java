package com.moovit.app.mot.purchase.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import com.moovit.util.time.Time;

public class MotQrCodeTrip implements Parcelable {
    public static final Parcelable.Creator<MotQrCodeTrip> CREATOR = new C15170a();

    /* renamed from: b */
    public final TransitStop f39072b;

    /* renamed from: c */
    public final TransitLine f39073c;

    /* renamed from: d */
    public final Time f39074d;

    /* renamed from: com.moovit.app.mot.purchase.model.MotQrCodeTrip$a */
    public class C15170a implements Parcelable.Creator<MotQrCodeTrip> {
        public final Object createFromParcel(Parcel parcel) {
            return new MotQrCodeTrip(parcel);
        }

        public final Object[] newArray(int i) {
            return new MotQrCodeTrip[i];
        }
    }

    public MotQrCodeTrip(TransitStop transitStop, TransitLine transitLine, Time time) {
        C21100e.m49373x(transitLine, "line");
        this.f39073c = transitLine;
        this.f39072b = transitStop;
        C21100e.m49373x(time, "time");
        this.f39074d = time;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f39072b, i);
        parcel.writeParcelable(this.f39073c, i);
        parcel.writeParcelable(this.f39074d, i);
    }

    public MotQrCodeTrip(Parcel parcel) {
        TransitStop transitStop = (TransitStop) parcel.readParcelable(TransitStop.class.getClassLoader());
        C21100e.m49373x(transitStop, "stop");
        this.f39072b = transitStop;
        TransitLine transitLine = (TransitLine) parcel.readParcelable(TransitLine.class.getClassLoader());
        C21100e.m49373x(transitLine, "line");
        this.f39073c = transitLine;
        Time time = (Time) parcel.readParcelable(Time.class.getClassLoader());
        C21100e.m49373x(time, "time");
        this.f39074d = time;
    }
}
