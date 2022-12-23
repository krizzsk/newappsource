package com.moovit.app.tod.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionInfo;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAudio;

public class TodRideVehicleAudio extends TodRideVehicleActionInfo {
    public static final Parcelable.Creator<TodRideVehicleAudio> CREATOR = new C15518a();

    /* renamed from: b */
    public final boolean f40313b;

    /* renamed from: com.moovit.app.tod.model.TodRideVehicleAudio$a */
    public class C15518a implements Parcelable.Creator<TodRideVehicleAudio> {
        public final Object createFromParcel(Parcel parcel) {
            return new TodRideVehicleAudio(parcel);
        }

        public final Object[] newArray(int i) {
            return new TodRideVehicleAudio[i];
        }
    }

    public TodRideVehicleAudio(boolean z) {
        this.f40313b = z;
    }

    /* renamed from: b */
    public final void mo46340b(MVTodVehicleActionInfo mVTodVehicleActionInfo) {
        MVTodVehicleAudio mVTodVehicleAudio = new MVTodVehicleAudio();
        mVTodVehicleAudio.playing = this.f40313b;
        mVTodVehicleAudio.mo33894g();
        mVTodVehicleActionInfo.setField_ = MVTodVehicleActionInfo._Fields.AUDIO;
        mVTodVehicleActionInfo.value_ = mVTodVehicleAudio;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof TodRideVehicleAudio) && this.f40313b == ((TodRideVehicleAudio) obj).f40313b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f40313b ? 1 : 0;
    }

    public final String toString() {
        return C13715c.m34247m(C13555b.m33972k("TodRideVehicleAudio{playing="), this.f40313b, '}');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f40313b ? 1 : 0);
    }

    public TodRideVehicleAudio(Parcel parcel) {
        this.f40313b = parcel.readInt() != 1 ? false : true;
    }
}
