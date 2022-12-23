package com.moovit.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.geo.Geofence;
import com.moovit.navigation.GeofenceMetadata;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import p001a0.C0016g;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import p977zz.C20975x0;

public class NavigationGeofence implements Parcelable, Comparable<NavigationGeofence> {
    public static final Parcelable.Creator<NavigationGeofence> CREATOR = new C4211a();

    /* renamed from: h */
    public static final C4212b f15044h = new C4212b();

    /* renamed from: i */
    public static final C4213c f15045i = new C4213c(NavigationGeofence.class);

    /* renamed from: b */
    public final Geofence f15046b;

    /* renamed from: c */
    public final ServerId f15047c;

    /* renamed from: d */
    public final int f15048d;

    /* renamed from: e */
    public final int f15049e;

    /* renamed from: f */
    public final int f15050f;

    /* renamed from: g */
    public final GeofenceMetadata f15051g;

    /* renamed from: com.moovit.navigation.NavigationGeofence$a */
    public class C4211a implements Parcelable.Creator<NavigationGeofence> {
        public final Object createFromParcel(Parcel parcel) {
            return (NavigationGeofence) C19612n.m46981v(parcel, NavigationGeofence.f15045i);
        }

        public final Object[] newArray(int i) {
            return new NavigationGeofence[i];
        }
    }

    /* renamed from: com.moovit.navigation.NavigationGeofence$b */
    public class C4212b extends C19621u<NavigationGeofence> {
        public C4212b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            NavigationGeofence navigationGeofence = (NavigationGeofence) obj;
            Geofence geofence = navigationGeofence.f15046b;
            Geofence.C15739b bVar = Geofence.f40972d;
            qVar.getClass();
            qVar.mo51939l(0);
            bVar.mo19622a(geofence, qVar);
            qVar.mo51939l(navigationGeofence.f15047c.f15142b);
            qVar.mo51939l(navigationGeofence.f15049e);
            qVar.mo51939l(navigationGeofence.f15048d);
            qVar.mo51939l(navigationGeofence.f15050f);
            GeofenceMetadata geofenceMetadata = navigationGeofence.f15051g;
            GeofenceMetadata.C4202b bVar2 = GeofenceMetadata.f15022k;
            qVar.mo51939l(2);
            bVar2.mo19622a(geofenceMetadata, qVar);
        }
    }

    /* renamed from: com.moovit.navigation.NavigationGeofence$c */
    public class C4213c extends C19620t<NavigationGeofence> {
        public C4213c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            Geofence.C15740c cVar = Geofence.f40973e;
            pVar.getClass();
            return new NavigationGeofence((Geofence) cVar.read(pVar), new ServerId(pVar.mo51924l()), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51924l(), (GeofenceMetadata) GeofenceMetadata.f15023l.read(pVar));
        }
    }

    public NavigationGeofence(Geofence geofence, ServerId serverId, int i, int i2, int i3, GeofenceMetadata geofenceMetadata) {
        C21100e.m49373x(geofence, "geofence");
        this.f15046b = geofence;
        this.f15047c = serverId;
        C21100e.m49359q(i, "legIndex");
        this.f15048d = i;
        C21100e.m49359q(i2, "pathIndex");
        this.f15049e = i2;
        C21100e.m49359q(i3, "inLegIndex");
        this.f15050f = i3;
        C21100e.m49373x(geofenceMetadata, "metadata");
        this.f15051g = geofenceMetadata;
    }

    /* renamed from: b */
    public final int compareTo(NavigationGeofence navigationGeofence) {
        if (navigationGeofence.f15048d != this.f15048d) {
            throw new IllegalStateException("Can't compare geofences of different legs");
        } else if (navigationGeofence.f15049e == this.f15049e) {
            return C20975x0.m49114a(this.f15050f, navigationGeofence.f15050f);
        } else {
            throw new IllegalStateException("Can't compare geofences of different paths");
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NavigationGeofence)) {
            return false;
        }
        NavigationGeofence navigationGeofence = (NavigationGeofence) obj;
        if (navigationGeofence.f15048d == this.f15048d && navigationGeofence.f15049e == this.f15049e && navigationGeofence.f15050f == this.f15050f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C17884p.m44333D(this.f15048d, this.f15049e, this.f15050f);
    }

    public final String toString() {
        Class<NavigationGeofence> cls = NavigationGeofence.class;
        StringBuilder t = C0016g.m36t("NavigationGeofence", "[");
        t.append(this.f15048d + ":" + this.f15049e + ":" + this.f15050f);
        t.append(" ");
        t.append(this.f15051g);
        t.append("]");
        return t.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f15044h);
    }
}
