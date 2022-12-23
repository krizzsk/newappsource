package com.moovit.itinerary.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.transit.LocationDescriptor;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class PathwayDescriptor implements Parcelable {
    public static final Parcelable.Creator<PathwayDescriptor> CREATOR = new C16096a();

    /* renamed from: d */
    public static final C16097b f41926d = new C16097b();

    /* renamed from: e */
    public static final C16098c f41927e = new C16098c(PathwayDescriptor.class);

    /* renamed from: b */
    public final int f41928b;

    /* renamed from: c */
    public final LocationDescriptor f41929c;

    /* renamed from: com.moovit.itinerary.model.PathwayDescriptor$a */
    public class C16096a implements Parcelable.Creator<PathwayDescriptor> {
        public final Object createFromParcel(Parcel parcel) {
            return (PathwayDescriptor) C19612n.m46981v(parcel, PathwayDescriptor.f41927e);
        }

        public final Object[] newArray(int i) {
            return new PathwayDescriptor[i];
        }
    }

    /* renamed from: com.moovit.itinerary.model.PathwayDescriptor$b */
    public class C16097b extends C19621u<PathwayDescriptor> {
        public C16097b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            PathwayDescriptor pathwayDescriptor = (PathwayDescriptor) obj;
            qVar.mo51939l(pathwayDescriptor.f41928b);
            LocationDescriptor locationDescriptor = pathwayDescriptor.f41929c;
            LocationDescriptor.C7794b bVar = LocationDescriptor.f23645l;
            qVar.mo51939l(3);
            bVar.mo19622a(locationDescriptor, qVar);
        }
    }

    /* renamed from: com.moovit.itinerary.model.PathwayDescriptor$c */
    public class C16098c extends C19620t<PathwayDescriptor> {
        public C16098c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new PathwayDescriptor(pVar.mo51924l(), (LocationDescriptor) LocationDescriptor.f23646m.read(pVar));
        }
    }

    public PathwayDescriptor(int i, LocationDescriptor locationDescriptor) {
        this.f41928b = i;
        C21100e.m49373x(locationDescriptor, "locationDescriptor");
        this.f41929c = locationDescriptor;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PathwayDescriptor)) {
            return false;
        }
        PathwayDescriptor pathwayDescriptor = (PathwayDescriptor) obj;
        if (this.f41928b != pathwayDescriptor.f41928b || !this.f41929c.equals(pathwayDescriptor.f41929c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(this.f41928b, this.f41929c.hashCode());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41926d);
    }
}
