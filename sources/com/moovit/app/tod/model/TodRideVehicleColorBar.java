package com.moovit.app.tod.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.utils.Color;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleActionInfo;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodVehicleColorBar;
import p583jk.C17884p;

public class TodRideVehicleColorBar extends TodRideVehicleActionInfo {
    public static final Parcelable.Creator<TodRideVehicleColorBar> CREATOR = new C15519a();

    /* renamed from: b */
    public final Color f40314b;

    /* renamed from: com.moovit.app.tod.model.TodRideVehicleColorBar$a */
    public class C15519a implements Parcelable.Creator<TodRideVehicleColorBar> {
        public final Object createFromParcel(Parcel parcel) {
            return new TodRideVehicleColorBar(parcel);
        }

        public final Object[] newArray(int i) {
            return new TodRideVehicleColorBar[i];
        }
    }

    public TodRideVehicleColorBar(Color color) {
        C21100e.m49373x(color, "mainColor");
        this.f40314b = color;
    }

    /* renamed from: b */
    public final void mo46340b(MVTodVehicleActionInfo mVTodVehicleActionInfo) {
        MVTodVehicleColorBar mVTodVehicleColorBar = new MVTodVehicleColorBar();
        mVTodVehicleColorBar.color = this.f40314b.f41007b;
        mVTodVehicleColorBar.mo33901g();
        mVTodVehicleActionInfo.setField_ = MVTodVehicleActionInfo._Fields.COLOR_BAR;
        mVTodVehicleActionInfo.value_ = mVTodVehicleColorBar;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TodRideVehicleColorBar)) {
            return false;
        }
        return this.f40314b.equals(((TodRideVehicleColorBar) obj).f40314b);
    }

    public final int hashCode() {
        return C17884p.m44335F(this.f40314b);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodRideVehicleColorBar{mainColor=");
        k.append(this.f40314b);
        k.append('}');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f40314b, i);
    }

    public TodRideVehicleColorBar(Parcel parcel) {
        this.f40314b = (Color) parcel.readParcelable(Color.class.getClassLoader());
    }
}
