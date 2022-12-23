package com.moovit.app.tod.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleAC;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionInfo;
import p583jk.C17884p;

public class TodRideVehicleAC extends TodRideVehicleActionInfo {
    public static final Parcelable.Creator<TodRideVehicleAC> CREATOR = new C15517a();

    /* renamed from: b */
    public final boolean f40309b;

    /* renamed from: c */
    public final int f40310c;

    /* renamed from: d */
    public final float f40311d;

    /* renamed from: com.moovit.app.tod.model.TodRideVehicleAC$a */
    public class C15517a implements Parcelable.Creator<TodRideVehicleAC> {
        public final Object createFromParcel(Parcel parcel) {
            return new TodRideVehicleAC(parcel);
        }

        public final Object[] newArray(int i) {
            return new TodRideVehicleAC[i];
        }
    }

    public TodRideVehicleAC(int i, float f, boolean z) {
        this.f40309b = z;
        this.f40310c = i;
        this.f40311d = f;
    }

    /* renamed from: b */
    public final void mo46340b(MVTodVehicleActionInfo mVTodVehicleActionInfo) {
        MVTodVehicleAC mVTodVehicleAC = new MVTodVehicleAC();
        mVTodVehicleAC.enabled = this.f40309b;
        mVTodVehicleAC.mo33867i();
        mVTodVehicleAC.fanLevel = (byte) this.f40310c;
        mVTodVehicleAC.mo33868j();
        mVTodVehicleAC.temperature = (double) this.f40311d;
        mVTodVehicleAC.mo33869k();
        mVTodVehicleActionInfo.setField_ = MVTodVehicleActionInfo._Fields.AC;
        mVTodVehicleActionInfo.value_ = mVTodVehicleAC;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TodRideVehicleAC)) {
            return false;
        }
        TodRideVehicleAC todRideVehicleAC = (TodRideVehicleAC) obj;
        if (this.f40309b == todRideVehicleAC.f40309b && this.f40310c == todRideVehicleAC.f40310c && todRideVehicleAC.f40311d == this.f40311d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.f40309b;
        return C17884p.m44333D(z ? 1 : 0, this.f40310c, Float.floatToIntBits(this.f40311d));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodRideVehicleAC{enabled=");
        k.append(this.f40309b);
        k.append(", fanLevel=");
        k.append(this.f40310c);
        k.append(", temperature=");
        k.append(this.f40311d);
        k.append('}');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f40309b ? 1 : 0);
        parcel.writeInt(this.f40310c);
        parcel.writeFloat(this.f40311d);
    }

    public TodRideVehicleAC(Parcel parcel) {
        this.f40309b = parcel.readInt() != 1 ? false : true;
        this.f40310c = parcel.readInt();
        this.f40311d = parcel.readFloat();
    }
}
