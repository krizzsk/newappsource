package com.moovit.commons.geo;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.braze.models.BrazeGeofence;
import com.moovit.commons.geo.LatLonE6;
import java.io.IOException;
import p358af.C13437d;
import p583jk.C17884p;
import p810sz.C19589j;
import p810sz.C19600l;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;

public class CircularArea implements Parcelable {
    public static final Parcelable.Creator<CircularArea> CREATOR = new C15735a();

    /* renamed from: d */
    public static final C15736b f40968d = new C15736b();

    /* renamed from: e */
    public static final C15737c f40969e = new C15737c();

    /* renamed from: b */
    public final LatLonE6 f40970b;

    /* renamed from: c */
    public final int f40971c;

    /* renamed from: com.moovit.commons.geo.CircularArea$a */
    public class C15735a implements Parcelable.Creator<CircularArea> {
        public final Object createFromParcel(Parcel parcel) {
            return (CircularArea) C19612n.m46981v(parcel, CircularArea.f40969e);
        }

        public final Object[] newArray(int i) {
            return new CircularArea[i];
        }
    }

    /* renamed from: com.moovit.commons.geo.CircularArea$b */
    public class C15736b implements C19600l<CircularArea> {
        public final void write(Object obj, C19616q qVar) throws IOException {
            CircularArea circularArea = (CircularArea) obj;
            LatLonE6 latLonE6 = circularArea.f40970b;
            LatLonE6.C15742b bVar = LatLonE6.f40978f;
            qVar.getClass();
            bVar.write(latLonE6, qVar);
            qVar.mo51939l(circularArea.f40971c);
        }
    }

    /* renamed from: com.moovit.commons.geo.CircularArea$c */
    public class C15737c implements C19589j<CircularArea> {
        public final Object read(C19615p pVar) throws IOException {
            LatLonE6.C15743c cVar = LatLonE6.f40979g;
            pVar.getClass();
            return new CircularArea(pVar.mo51924l(), (LatLonE6) cVar.read(pVar));
        }
    }

    public CircularArea(int i, LatLonE6 latLonE6) {
        C21100e.m49373x(latLonE6, "center");
        this.f40970b = latLonE6;
        C21100e.m49359q(i, BrazeGeofence.RADIUS_METERS);
        this.f40971c = i;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CircularArea)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        CircularArea circularArea = (CircularArea) obj;
        if (!this.f40970b.equals(circularArea.f40970b) || this.f40971c != circularArea.f40971c) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f40970b), this.f40971c);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("[center=");
        k.append(this.f40970b);
        k.append(" radius=");
        return C13437d.m33707l(k, this.f40971c, "]");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40968d);
    }
}
