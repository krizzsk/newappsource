package com.moovit.carpool;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.carpool.PassengerRideStop;
import com.moovit.transit.LocationDescriptor;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20975x0;

public class PassengerRideStops implements Parcelable {
    public static final Parcelable.Creator<PassengerRideStops> CREATOR = new C15722a();

    /* renamed from: f */
    public static final C15723b f40950f = new C15723b(PassengerRideStops.class);

    /* renamed from: b */
    public final PassengerRideStop f40951b;

    /* renamed from: c */
    public final PassengerRideStop f40952c;

    /* renamed from: d */
    public final LocationDescriptor f40953d;

    /* renamed from: e */
    public final LocationDescriptor f40954e;

    /* renamed from: com.moovit.carpool.PassengerRideStops$a */
    public class C15722a implements Parcelable.Creator<PassengerRideStops> {
        public final Object createFromParcel(Parcel parcel) {
            return (PassengerRideStops) C19612n.m46981v(parcel, PassengerRideStops.f40950f);
        }

        public final Object[] newArray(int i) {
            return new PassengerRideStops[i];
        }
    }

    /* renamed from: com.moovit.carpool.PassengerRideStops$b */
    public class C15723b extends C19619s<PassengerRideStops> {
        public C15723b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 1;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.moovit.transit.LocationDescriptor} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo178b(p810sz.C19615p r6, int r7) throws java.io.IOException {
            /*
                r5 = this;
                com.moovit.carpool.PassengerRideStop$b r0 = com.moovit.carpool.PassengerRideStop.f40947d
                r6.getClass()
                java.lang.Object r1 = r0.read(r6)
                com.moovit.carpool.PassengerRideStop r1 = (com.moovit.carpool.PassengerRideStop) r1
                java.lang.Object r0 = r0.read(r6)
                com.moovit.carpool.PassengerRideStop r0 = (com.moovit.carpool.PassengerRideStop) r0
                r2 = 0
                r3 = 1
                if (r7 < r3) goto L_0x001e
                com.moovit.transit.LocationDescriptor$c r4 = com.moovit.transit.LocationDescriptor.f23646m
                java.lang.Object r4 = r6.mo51962q(r4)
                com.moovit.transit.LocationDescriptor r4 = (com.moovit.transit.LocationDescriptor) r4
                goto L_0x001f
            L_0x001e:
                r4 = r2
            L_0x001f:
                if (r7 < r3) goto L_0x002a
                com.moovit.transit.LocationDescriptor$c r7 = com.moovit.transit.LocationDescriptor.f23646m
                java.lang.Object r6 = r6.mo51962q(r7)
                r2 = r6
                com.moovit.transit.LocationDescriptor r2 = (com.moovit.transit.LocationDescriptor) r2
            L_0x002a:
                com.moovit.carpool.PassengerRideStops r6 = new com.moovit.carpool.PassengerRideStops
                r6.<init>(r1, r0, r4, r2)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.carpool.PassengerRideStops.C15723b.mo178b(sz.p, int):java.lang.Object");
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PassengerRideStops passengerRideStops = (PassengerRideStops) obj;
            PassengerRideStop passengerRideStop = passengerRideStops.f40951b;
            PassengerRideStop.C15721b bVar = PassengerRideStop.f40947d;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(passengerRideStop, qVar);
            PassengerRideStop passengerRideStop2 = passengerRideStops.f40952c;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(passengerRideStop2, qVar);
            LocationDescriptor locationDescriptor = passengerRideStops.f40953d;
            LocationDescriptor.C7794b bVar2 = LocationDescriptor.f23645l;
            qVar.mo51967q(locationDescriptor, bVar2);
            qVar.mo51967q(passengerRideStops.f40954e, bVar2);
        }
    }

    public PassengerRideStops(PassengerRideStop passengerRideStop, PassengerRideStop passengerRideStop2, LocationDescriptor locationDescriptor, LocationDescriptor locationDescriptor2) {
        C21100e.m49373x(passengerRideStop, "pickupStop");
        this.f40951b = passengerRideStop;
        C21100e.m49373x(passengerRideStop2, "dropOffStop");
        this.f40952c = passengerRideStop2;
        this.f40953d = locationDescriptor;
        this.f40954e = locationDescriptor2;
    }

    /* renamed from: b */
    public static PassengerRideStops m40150b() {
        return new PassengerRideStops(new PassengerRideStop(0, (Short) null), new PassengerRideStop(99, (Short) null), (LocationDescriptor) null, (LocationDescriptor) null);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassengerRideStops)) {
            return false;
        }
        PassengerRideStops passengerRideStops = (PassengerRideStops) obj;
        if (!this.f40951b.equals(passengerRideStops.f40951b) || !this.f40952c.equals(passengerRideStops.f40952c) || !C20975x0.m49118e(this.f40953d, passengerRideStops.f40953d) || !C20975x0.m49118e(this.f40954e, passengerRideStops.f40954e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f40951b), C17884p.m44335F(this.f40952c), C17884p.m44335F(this.f40953d), C17884p.m44335F(this.f40954e));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40950f);
    }
}
