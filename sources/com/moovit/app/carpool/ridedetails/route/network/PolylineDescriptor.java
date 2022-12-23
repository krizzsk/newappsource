package com.moovit.app.carpool.ridedetails.route.network;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.commons.geo.Polyline;
import com.moovit.commons.geo.Polylon;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class PolylineDescriptor implements Parcelable {
    public static final Parcelable.Creator<PolylineDescriptor> CREATOR = new C14842a();

    /* renamed from: d */
    public static C14843b f37910d = new C14843b(PolylineDescriptor.class);

    /* renamed from: b */
    public final int f37911b;

    /* renamed from: c */
    public final Polyline f37912c;

    /* renamed from: com.moovit.app.carpool.ridedetails.route.network.PolylineDescriptor$a */
    public class C14842a implements Parcelable.Creator<PolylineDescriptor> {
        public final Object createFromParcel(Parcel parcel) {
            return (PolylineDescriptor) C19612n.m46981v(parcel, PolylineDescriptor.f37910d);
        }

        public final Object[] newArray(int i) {
            return new PolylineDescriptor[i];
        }
    }

    /* renamed from: com.moovit.app.carpool.ridedetails.route.network.PolylineDescriptor$b */
    public class C14843b extends C19619s<PolylineDescriptor> {
        public C14843b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new PolylineDescriptor((Polyline) pVar.mo51962q(Polylon.f40988k), pVar.mo51924l());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            PolylineDescriptor polylineDescriptor = (PolylineDescriptor) obj;
            qVar.mo51967q(polylineDescriptor.f37912c, Polylon.f40987j);
            qVar.mo51939l(polylineDescriptor.f37911b);
        }
    }

    public PolylineDescriptor(Polyline polyline, int i) {
        this.f37911b = i;
        this.f37912c = polyline;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f37910d);
    }
}
