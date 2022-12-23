package com.moovit.app.mot.purchase.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;

public class MotQrCodeStationFare implements Parcelable {
    public static final Parcelable.Creator<MotQrCodeStationFare> CREATOR = new C15169a();

    /* renamed from: b */
    public final TransitLine f39068b;

    /* renamed from: c */
    public final TransitStop f39069c;

    /* renamed from: d */
    public final float f39070d;

    /* renamed from: e */
    public final MotQrCodeActivationFare f39071e;

    /* renamed from: com.moovit.app.mot.purchase.model.MotQrCodeStationFare$a */
    public class C15169a implements Parcelable.Creator<MotQrCodeStationFare> {
        public final Object createFromParcel(Parcel parcel) {
            return new MotQrCodeStationFare(parcel);
        }

        public final Object[] newArray(int i) {
            return new MotQrCodeStationFare[i];
        }
    }

    public MotQrCodeStationFare(TransitLine transitLine, TransitStop transitStop, float f, MotQrCodeActivationFare motQrCodeActivationFare) {
        C21100e.m49373x(transitLine, "line");
        this.f39068b = transitLine;
        this.f39069c = transitStop;
        this.f39070d = f;
        this.f39071e = motQrCodeActivationFare;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f39068b, i);
        parcel.writeParcelable(this.f39069c, i);
        parcel.writeFloat(this.f39070d);
        parcel.writeParcelable(this.f39071e, i);
    }

    public MotQrCodeStationFare(Parcel parcel) {
        TransitLine transitLine = (TransitLine) parcel.readParcelable(TransitLine.class.getClassLoader());
        C21100e.m49373x(transitLine, "line");
        this.f39068b = transitLine;
        TransitStop transitStop = (TransitStop) parcel.readParcelable(TransitStop.class.getClassLoader());
        C21100e.m49373x(transitStop, "destination");
        this.f39069c = transitStop;
        this.f39070d = parcel.readFloat();
        MotQrCodeActivationFare motQrCodeActivationFare = (MotQrCodeActivationFare) parcel.readParcelable(MotQrCodeActivationFare.class.getClassLoader());
        C21100e.m49373x(motQrCodeActivationFare, "activationFare");
        this.f39071e = motQrCodeActivationFare;
    }
}
