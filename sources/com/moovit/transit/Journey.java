package com.moovit.transit;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.transit.LocationDescriptor;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public final class Journey implements Parcelable {
    public static final Parcelable.Creator<Journey> CREATOR = new C7790a();

    /* renamed from: d */
    public static final C7791b f23641d = new C7791b();

    /* renamed from: e */
    public static final C7792c f23642e = new C7792c(Journey.class);

    /* renamed from: b */
    public final LocationDescriptor f23643b;

    /* renamed from: c */
    public final LocationDescriptor f23644c;

    /* renamed from: com.moovit.transit.Journey$a */
    public class C7790a implements Parcelable.Creator<Journey> {
        public final Object createFromParcel(Parcel parcel) {
            return (Journey) C19612n.m46981v(parcel, Journey.f23642e);
        }

        public final Object[] newArray(int i) {
            return new Journey[i];
        }
    }

    /* renamed from: com.moovit.transit.Journey$b */
    public class C7791b extends C19621u<Journey> {
        public C7791b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            Journey journey = (Journey) obj;
            LocationDescriptor locationDescriptor = journey.f23643b;
            LocationDescriptor.C7794b bVar = LocationDescriptor.f23645l;
            qVar.getClass();
            qVar.mo51939l(3);
            bVar.mo19622a(locationDescriptor, qVar);
            LocationDescriptor locationDescriptor2 = journey.f23644c;
            qVar.mo51939l(3);
            bVar.mo19622a(locationDescriptor2, qVar);
        }
    }

    /* renamed from: com.moovit.transit.Journey$c */
    public class C7792c extends C19620t<Journey> {
        public C7792c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            LocationDescriptor.C7795c cVar = LocationDescriptor.f23646m;
            pVar.getClass();
            return new Journey((LocationDescriptor) cVar.read(pVar), (LocationDescriptor) cVar.read(pVar));
        }
    }

    public Journey(LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2) {
        this.f23643b = locationDescriptor;
        this.f23644c = locationDescriptor2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Journey)) {
            return false;
        }
        Journey journey = (Journey) obj;
        if (!this.f23643b.equals(journey.f23643b) || !this.f23644c.equals(journey.f23644c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(this.f23643b.hashCode(), this.f23644c.hashCode());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23641d);
    }
}
