package com.moovit.app.stoparrivals;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0017h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/app/stoparrivals/TripsSelectionUpdate;", "Landroid/os/Parcelable;", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class TripsSelectionUpdate implements Parcelable {
    public static final Parcelable.Creator<TripsSelectionUpdate> CREATOR = new C15320a();

    /* renamed from: b */
    public final int f39623b;

    /* renamed from: c */
    public final StopArrival f39624c;

    /* renamed from: d */
    public final StopArrival f39625d;

    /* renamed from: e */
    public final String f39626e;

    /* renamed from: com.moovit.app.stoparrivals.TripsSelectionUpdate$a */
    public static final class C15320a implements Parcelable.Creator<TripsSelectionUpdate> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new TripsSelectionUpdate(parcel.readInt(), parcel.readInt() == 0 ? null : StopArrival.CREATOR.createFromParcel(parcel), StopArrival.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new TripsSelectionUpdate[i];
        }
    }

    public TripsSelectionUpdate(int i, StopArrival stopArrival, StopArrival stopArrival2, String str) {
        C24362h.m61211f(stopArrival2, "currArrival");
        this.f39623b = i;
        this.f39624c = stopArrival;
        this.f39625d = stopArrival2;
        this.f39626e = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TripsSelectionUpdate)) {
            return false;
        }
        TripsSelectionUpdate tripsSelectionUpdate = (TripsSelectionUpdate) obj;
        return this.f39623b == tripsSelectionUpdate.f39623b && C24362h.m61206a(this.f39624c, tripsSelectionUpdate.f39624c) && C24362h.m61206a(this.f39625d, tripsSelectionUpdate.f39625d) && C24362h.m61206a(this.f39626e, tripsSelectionUpdate.f39626e);
    }

    public final int hashCode() {
        int i = this.f39623b * 31;
        StopArrival stopArrival = this.f39624c;
        int i2 = 0;
        int hashCode = (this.f39625d.hashCode() + ((i + (stopArrival == null ? 0 : stopArrival.hashCode())) * 31)) * 31;
        String str = this.f39626e;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TripsSelectionUpdate(adapterPosition=");
        k.append(this.f39623b);
        k.append(", prevArrival=");
        k.append(this.f39624c);
        k.append(", currArrival=");
        k.append(this.f39625d);
        k.append(", analyticKey=");
        return C0017h.m57N(k, this.f39626e, ')');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeInt(this.f39623b);
        StopArrival stopArrival = this.f39624c;
        if (stopArrival == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stopArrival.writeToParcel(parcel, i);
        }
        this.f39625d.writeToParcel(parcel, i);
        parcel.writeString(this.f39626e);
    }
}
