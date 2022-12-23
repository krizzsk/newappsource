package com.moovit.carpool;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20975x0;

public class PassengerRideStop implements Parcelable {
    public static final Parcelable.Creator<PassengerRideStop> CREATOR = new C15720a();

    /* renamed from: d */
    public static final C15721b f40947d = new C15721b(PassengerRideStop.class);

    /* renamed from: b */
    public final short f40948b;

    /* renamed from: c */
    public final Short f40949c;

    /* renamed from: com.moovit.carpool.PassengerRideStop$a */
    public class C15720a implements Parcelable.Creator<PassengerRideStop> {
        public final Object createFromParcel(Parcel parcel) {
            return (PassengerRideStop) C19612n.m46981v(parcel, PassengerRideStop.f40947d);
        }

        public final Object[] newArray(int i) {
            return new PassengerRideStop[i];
        }
    }

    /* renamed from: com.moovit.carpool.PassengerRideStop$b */
    public class C15721b extends C19619s<PassengerRideStop> {
        public C15721b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 1 || i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            short r = pVar.mo51926r();
            Short sh = null;
            if (i >= 1 && !(!pVar.mo51919b())) {
                sh = Short.valueOf(pVar.mo51926r());
            }
            return new PassengerRideStop(r, sh);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PassengerRideStop passengerRideStop = (PassengerRideStop) obj;
            qVar.mo51941r(passengerRideStop.f40948b);
            Short sh = passengerRideStop.f40949c;
            if (sh == null) {
                qVar.mo51934b(false);
                return;
            }
            qVar.mo51934b(true);
            qVar.mo51941r(sh.shortValue());
        }
    }

    public PassengerRideStop(short s, Short sh) {
        this.f40948b = s;
        this.f40949c = sh;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassengerRideStop)) {
            return false;
        }
        PassengerRideStop passengerRideStop = (PassengerRideStop) obj;
        if (this.f40948b != passengerRideStop.f40948b || !C20975x0.m49118e(this.f40949c, passengerRideStop.f40949c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(this.f40948b, C17884p.m44335F(this.f40949c));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40947d);
    }
}
