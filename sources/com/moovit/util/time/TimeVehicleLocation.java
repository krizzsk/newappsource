package com.moovit.util.time;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.appboy.models.outgoing.FacebookUser;
import com.moovit.commons.geo.LatLonE6;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20975x0;

public class TimeVehicleLocation implements Parcelable {
    public static final Parcelable.Creator<TimeVehicleLocation> CREATOR = new C7921a();

    /* renamed from: f */
    public static final C7922b f23923f = new C7922b(TimeVehicleLocation.class);

    /* renamed from: b */
    public final String f23924b;

    /* renamed from: c */
    public final long f23925c;

    /* renamed from: d */
    public final LatLonE6 f23926d;

    /* renamed from: e */
    public final VehicleProgress f23927e;

    public static class VehicleProgress implements Parcelable {
        public static final Parcelable.Creator<VehicleProgress> CREATOR = new C7919a();

        /* renamed from: d */
        public static final C7920b f23928d = new C7920b(VehicleProgress.class);

        /* renamed from: b */
        public final int f23929b;

        /* renamed from: c */
        public final int f23930c;

        /* renamed from: com.moovit.util.time.TimeVehicleLocation$VehicleProgress$a */
        public class C7919a implements Parcelable.Creator<VehicleProgress> {
            public final Object createFromParcel(Parcel parcel) {
                return (VehicleProgress) C19612n.m46981v(parcel, VehicleProgress.f23928d);
            }

            public final Object[] newArray(int i) {
                return new VehicleProgress[i];
            }
        }

        /* renamed from: com.moovit.util.time.TimeVehicleLocation$VehicleProgress$b */
        public class C7920b extends C19619s<VehicleProgress> {
            public C7920b(Class cls) {
                super(0, cls);
            }

            /* renamed from: a */
            public final boolean mo177a(int i) {
                return i == 0;
            }

            /* renamed from: b */
            public final Object mo178b(C19615p pVar, int i) throws IOException {
                return new VehicleProgress(pVar.mo51924l(), pVar.mo51924l());
            }

            /* renamed from: c */
            public final void mo179c(Object obj, C19616q qVar) throws IOException {
                VehicleProgress vehicleProgress = (VehicleProgress) obj;
                qVar.mo51939l(vehicleProgress.f23929b);
                qVar.mo51939l(vehicleProgress.f23930c);
            }
        }

        public VehicleProgress(int i, int i2) {
            this.f23929b = i;
            this.f23930c = i2;
        }

        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof VehicleProgress)) {
                return false;
            }
            VehicleProgress vehicleProgress = (VehicleProgress) obj;
            if (this.f23929b == vehicleProgress.f23929b && this.f23930c == vehicleProgress.f23930c) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            return C17884p.m44333D(this.f23929b, this.f23930c);
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("VehicleProgress{nextStopIndex=");
            k.append(this.f23929b);
            k.append(", progress=");
            return C16530d.m42014g(k, this.f23930c, '}');
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C19613o.m46994v(parcel, this, f23928d);
        }
    }

    /* renamed from: com.moovit.util.time.TimeVehicleLocation$a */
    public class C7921a implements Parcelable.Creator<TimeVehicleLocation> {
        public final Object createFromParcel(Parcel parcel) {
            return (TimeVehicleLocation) C19612n.m46981v(parcel, TimeVehicleLocation.f23923f);
        }

        public final Object[] newArray(int i) {
            return new TimeVehicleLocation[i];
        }
    }

    /* renamed from: com.moovit.util.time.TimeVehicleLocation$b */
    public class C7922b extends C19619s<TimeVehicleLocation> {
        public C7922b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new TimeVehicleLocation(pVar.mo51947p(), pVar.mo51925m(), (LatLonE6) LatLonE6.f40979g.read(pVar), (VehicleProgress) pVar.mo51962q(VehicleProgress.f23928d));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TimeVehicleLocation timeVehicleLocation = (TimeVehicleLocation) obj;
            qVar.mo51954p(timeVehicleLocation.f23924b);
            qVar.mo51940m(timeVehicleLocation.f23925c);
            LatLonE6.f40978f.write(timeVehicleLocation.f23926d, qVar);
            qVar.mo51967q(timeVehicleLocation.f23927e, VehicleProgress.f23928d);
        }
    }

    public TimeVehicleLocation(String str, long j, LatLonE6 latLonE6, VehicleProgress vehicleProgress) {
        C21100e.m49373x(str, "vehicleId");
        this.f23924b = str;
        this.f23925c = j;
        C21100e.m49373x(latLonE6, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        this.f23926d = latLonE6;
        this.f23927e = vehicleProgress;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeVehicleLocation)) {
            return false;
        }
        TimeVehicleLocation timeVehicleLocation = (TimeVehicleLocation) obj;
        if (!this.f23924b.equals(timeVehicleLocation.f23924b) || this.f23925c != timeVehicleLocation.f23925c || !this.f23926d.equals(timeVehicleLocation.f23926d) || !C20975x0.m49118e(this.f23927e, timeVehicleLocation.f23927e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f23924b), C17884p.m44334E(this.f23925c), C17884p.m44335F(this.f23926d), C17884p.m44335F(this.f23927e));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TimeVehicleLocation{vehicleId='");
        C25541a.m63890u(k, this.f23924b, '\'', ", sampleTime=");
        k.append(this.f23925c);
        k.append(", location=");
        k.append(this.f23926d);
        k.append(", vehicleProgress=");
        k.append(this.f23927e);
        k.append('}');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23923f);
    }
}
