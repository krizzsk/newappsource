package com.moovit.app.stoparrivals;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.servicealerts.ServiceStatusCategory;
import com.moovit.transit.TransitLine;
import com.moovit.util.time.Time;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/moovit/app/stoparrivals/StopArrival;", "Landroid/os/Parcelable;", "App_moovitWorldRelease"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class StopArrival implements Parcelable {
    public static final Parcelable.Creator<StopArrival> CREATOR = new C15315a();

    /* renamed from: b */
    public final TransitLine f39599b;

    /* renamed from: c */
    public final Time f39600c;

    /* renamed from: d */
    public final int f39601d;

    /* renamed from: e */
    public final ServiceStatusCategory f39602e;

    /* renamed from: com.moovit.app.stoparrivals.StopArrival$a */
    public static final class C15315a implements Parcelable.Creator<StopArrival> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new StopArrival((TransitLine) parcel.readParcelable(StopArrival.class.getClassLoader()), (Time) parcel.readParcelable(StopArrival.class.getClassLoader()), parcel.readInt(), parcel.readInt() == 0 ? null : ServiceStatusCategory.valueOf(parcel.readString()));
        }

        public final Object[] newArray(int i) {
            return new StopArrival[i];
        }
    }

    public StopArrival(TransitLine transitLine, Time time, int i, ServiceStatusCategory serviceStatusCategory) {
        C24362h.m61211f(transitLine, "line");
        C24362h.m61211f(time, "arrival");
        this.f39599b = transitLine;
        this.f39600c = time;
        this.f39601d = i;
        this.f39602e = serviceStatusCategory;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopArrival)) {
            return false;
        }
        StopArrival stopArrival = (StopArrival) obj;
        return C24362h.m61206a(this.f39599b, stopArrival.f39599b) && C24362h.m61206a(this.f39600c, stopArrival.f39600c) && this.f39601d == stopArrival.f39601d && this.f39602e == stopArrival.f39602e;
    }

    public final int hashCode() {
        int hashCode = (((this.f39600c.hashCode() + (this.f39599b.hashCode() * 31)) * 31) + this.f39601d) * 31;
        ServiceStatusCategory serviceStatusCategory = this.f39602e;
        return hashCode + (serviceStatusCategory == null ? 0 : serviceStatusCategory.hashCode());
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("StopArrival(line=");
        k.append(this.f39599b);
        k.append(", arrival=");
        k.append(this.f39600c);
        k.append(", tripIndex=");
        k.append(this.f39601d);
        k.append(", serviceAlert=");
        k.append(this.f39602e);
        k.append(')');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeParcelable(this.f39599b, i);
        parcel.writeParcelable(this.f39600c, i);
        parcel.writeInt(this.f39601d);
        ServiceStatusCategory serviceStatusCategory = this.f39602e;
        if (serviceStatusCategory == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(serviceStatusCategory.name());
    }
}
