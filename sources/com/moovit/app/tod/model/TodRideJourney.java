package com.moovit.app.tod.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.moovit.commons.geo.BoxE6;
import com.moovit.transit.LocationDescriptor;
import java.io.IOException;
import java.util.ArrayList;
import p762qz.C19206b;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TodRideJourney implements Parcelable {
    public static final Parcelable.Creator<TodRideJourney> CREATOR = new C15511a();

    /* renamed from: k */
    public static final C15512b f40283k = new C15512b(TodRideJourney.class);

    /* renamed from: b */
    public final LocationDescriptor f40284b;

    /* renamed from: c */
    public final LocationDescriptor f40285c;

    /* renamed from: d */
    public final LocationDescriptor f40286d;

    /* renamed from: e */
    public final LocationDescriptor f40287e;

    /* renamed from: f */
    public final long f40288f;

    /* renamed from: g */
    public final long f40289g;

    /* renamed from: h */
    public final BoxE6 f40290h;

    /* renamed from: i */
    public final BoxE6 f40291i;

    /* renamed from: j */
    public final BoxE6 f40292j;

    /* renamed from: com.moovit.app.tod.model.TodRideJourney$a */
    public class C15511a implements Parcelable.Creator<TodRideJourney> {
        public final Object createFromParcel(Parcel parcel) {
            return (TodRideJourney) C19612n.m46981v(parcel, TodRideJourney.f40283k);
        }

        public final Object[] newArray(int i) {
            return new TodRideJourney[i];
        }
    }

    /* renamed from: com.moovit.app.tod.model.TodRideJourney$b */
    public class C15512b extends C19619s<TodRideJourney> {
        public C15512b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            LocationDescriptor.C7795c cVar = LocationDescriptor.f23646m;
            pVar.getClass();
            return new TodRideJourney((LocationDescriptor) cVar.read(pVar), (LocationDescriptor) pVar.mo51962q(cVar), (LocationDescriptor) pVar.mo51962q(cVar), (LocationDescriptor) cVar.read(pVar), pVar.mo51925m(), pVar.mo51925m());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TodRideJourney todRideJourney = (TodRideJourney) obj;
            LocationDescriptor locationDescriptor = todRideJourney.f40284b;
            LocationDescriptor.C7794b bVar = LocationDescriptor.f23645l;
            qVar.getClass();
            qVar.mo51939l(3);
            bVar.mo19622a(locationDescriptor, qVar);
            qVar.mo51967q(todRideJourney.f40285c, bVar);
            qVar.mo51967q(todRideJourney.f40286d, bVar);
            LocationDescriptor locationDescriptor2 = todRideJourney.f40287e;
            qVar.mo51939l(3);
            bVar.mo19622a(locationDescriptor2, qVar);
            qVar.mo51940m(todRideJourney.f40288f);
            qVar.mo51940m(todRideJourney.f40289g);
        }
    }

    public TodRideJourney(LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2, LocationDescriptor locationDescriptor3, LocationDescriptor locationDescriptor4, long j, long j2) {
        C21100e.m49373x(locationDescriptor, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        this.f40284b = locationDescriptor;
        this.f40285c = locationDescriptor2;
        this.f40286d = locationDescriptor3;
        C21100e.m49373x(locationDescriptor4, "destination");
        this.f40287e = locationDescriptor4;
        this.f40288f = j;
        this.f40289g = j2;
        BoxE6 b = m39661b(locationDescriptor, locationDescriptor2, locationDescriptor3, locationDescriptor4);
        C21100e.m49373x(b, "bounds");
        this.f40290h = b;
        this.f40291i = m39661b(locationDescriptor, locationDescriptor2);
        m39661b(locationDescriptor2, locationDescriptor3);
        this.f40292j = m39661b(locationDescriptor3, locationDescriptor4);
    }

    /* renamed from: b */
    public static BoxE6 m39661b(C19206b... bVarArr) {
        ArrayList arrayList = new ArrayList(bVarArr.length);
        for (C19206b bVar : bVarArr) {
            if (!(bVar == null || bVar.getLocation() == null)) {
                arrayList.add(bVar);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return BoxE6.m40166f(arrayList);
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodRideJourney{origin=");
        k.append(this.f40284b);
        k.append(", pickup=");
        k.append(this.f40285c);
        k.append(", dropOff=");
        k.append(this.f40286d);
        k.append(", destination=");
        k.append(this.f40287e);
        k.append(", pickupWalkingTime=");
        k.append(this.f40288f);
        k.append(", destinationWalkingTime=");
        k.append(this.f40289g);
        k.append('}');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40283k);
    }
}
