package com.cubic.umo.pass.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/Location;", "Landroid/os/Parcelable;", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class Location implements Parcelable {
    public static final Parcelable.Creator<Location> CREATOR = new C2252a();

    /* renamed from: b */
    public final double f8126b;

    /* renamed from: c */
    public final double f8127c;

    /* renamed from: com.cubic.umo.pass.model.Location$a */
    public static final class C2252a implements Parcelable.Creator<Location> {
        public final Object createFromParcel(Parcel parcel) {
            C24362h.m61211f(parcel, "parcel");
            return new Location(parcel.readDouble(), parcel.readDouble());
        }

        public final Object[] newArray(int i) {
            return new Location[i];
        }
    }

    public Location(double d, double d2) {
        this.f8126b = d;
        this.f8127c = d2;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C24362h.m61211f(parcel, "out");
        parcel.writeDouble(this.f8126b);
        parcel.writeDouble(this.f8127c);
    }

    public Location() {
        this(0.0d, 0.0d);
    }
}
