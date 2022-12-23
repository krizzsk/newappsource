package com.moovit.commons.geo;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.braze.models.BrazeGeofence;
import com.moovit.commons.geo.LatLonE6;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class Geofence implements Parcelable {
    public static final Parcelable.Creator<Geofence> CREATOR = new C15738a();

    /* renamed from: d */
    public static final C15739b f40972d = new C15739b();

    /* renamed from: e */
    public static final C15740c f40973e = new C15740c(Geofence.class);

    /* renamed from: b */
    public final LatLonE6 f40974b;

    /* renamed from: c */
    public final float f40975c;

    /* renamed from: com.moovit.commons.geo.Geofence$a */
    public class C15738a implements Parcelable.Creator<Geofence> {
        public final Object createFromParcel(Parcel parcel) {
            return (Geofence) C19612n.m46981v(parcel, Geofence.f40973e);
        }

        public final Object[] newArray(int i) {
            return new Geofence[i];
        }
    }

    /* renamed from: com.moovit.commons.geo.Geofence$b */
    public class C15739b extends C19621u<Geofence> {
        public C15739b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            Geofence geofence = (Geofence) obj;
            LatLonE6 latLonE6 = geofence.f40974b;
            LatLonE6.C15742b bVar = LatLonE6.f40978f;
            qVar.getClass();
            bVar.write(latLonE6, qVar);
            qVar.mo51938j(geofence.f40975c);
        }
    }

    /* renamed from: com.moovit.commons.geo.Geofence$c */
    public class C15740c extends C19620t<Geofence> {
        public C15740c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            LatLonE6.C15743c cVar = LatLonE6.f40979g;
            pVar.getClass();
            return new Geofence((LatLonE6) cVar.read(pVar), pVar.mo51923j());
        }
    }

    public Geofence(LatLonE6 latLonE6, float f) {
        C21100e.m49373x(latLonE6, "center");
        this.f40974b = latLonE6;
        C21100e.m49357p(f, BrazeGeofence.RADIUS_METERS);
        this.f40975c = f;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Geofence)) {
            return false;
        }
        Geofence geofence = (Geofence) obj;
        if (this == geofence) {
            return true;
        }
        if (!this.f40974b.equals(geofence.f40974b) || Float.floatToIntBits(this.f40975c) != Float.floatToIntBits(geofence.f40975c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f40974b), Float.floatToIntBits(this.f40975c));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("[center=");
        k.append(this.f40974b);
        k.append(", radius=");
        k.append(this.f40975c);
        k.append("m]");
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40972d);
    }
}
