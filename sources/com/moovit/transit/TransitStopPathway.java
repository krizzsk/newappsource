package com.moovit.transit;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.appboy.models.outgoing.FacebookUser;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.network.model.ServerId;
import j40.C5384a;
import java.io.IOException;
import p762qz.C19206b;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import p824tp.C19746x;

public class TransitStopPathway implements C5384a, C19206b, Parcelable {
    public static final Parcelable.Creator<TransitStopPathway> CREATOR = new C7829a();

    /* renamed from: f */
    public static final C7830b f23746f = new C7830b();

    /* renamed from: g */
    public static final C7831c f23747g = new C7831c(TransitStopPathway.class);

    /* renamed from: b */
    public final ServerId f23748b;

    /* renamed from: c */
    public int f23749c;

    /* renamed from: d */
    public String f23750d;

    /* renamed from: e */
    public LatLonE6 f23751e;

    /* renamed from: com.moovit.transit.TransitStopPathway$a */
    public class C7829a implements Parcelable.Creator<TransitStopPathway> {
        public final Object createFromParcel(Parcel parcel) {
            return (TransitStopPathway) C19612n.m46981v(parcel, TransitStopPathway.f23747g);
        }

        public final Object[] newArray(int i) {
            return new TransitStopPathway[i];
        }
    }

    /* renamed from: com.moovit.transit.TransitStopPathway$b */
    public class C7830b extends C19621u<TransitStopPathway> {
        public C7830b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            TransitStopPathway transitStopPathway = (TransitStopPathway) obj;
            ServerId serverId = transitStopPathway.f23748b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51939l(transitStopPathway.f23749c);
            qVar.mo51955t(transitStopPathway.f23750d);
            LatLonE6.f40978f.write(transitStopPathway.f23751e, qVar);
        }
    }

    /* renamed from: com.moovit.transit.TransitStopPathway$c */
    public class C7831c extends C19620t<TransitStopPathway> {
        public C7831c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            return new TransitStopPathway(new ServerId(pVar.mo51924l()), pVar.mo51924l(), pVar.mo51948t(), (LatLonE6) LatLonE6.f40979g.read(pVar));
        }
    }

    public TransitStopPathway(ServerId serverId, int i, String str, LatLonE6 latLonE6) {
        C21100e.m49373x(serverId, "id");
        this.f23748b = serverId;
        this.f23749c = i;
        this.f23750d = str;
        C21100e.m49373x(latLonE6, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        this.f23751e = latLonE6;
    }

    /* renamed from: b */
    public static int m17847b(int i) {
        if (i == 1) {
            return C19746x.pathway_map_info_window_entrance;
        }
        if (i == 2) {
            return C19746x.pathway_map_info_window_exit;
        }
        if (i != 3) {
            return 0;
        }
        return C19746x.pathway_map_info_window_entrance_exit;
    }

    /* renamed from: c */
    public final boolean mo24419c() {
        return (this.f23749c & 1) != 0;
    }

    /* renamed from: d */
    public final boolean mo24420d() {
        return (this.f23749c & 2) != 0;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TransitStopPathway)) {
            return false;
        }
        return this.f23748b.equals(((TransitStopPathway) obj).f23748b);
    }

    public final LatLonE6 getLocation() {
        return this.f23751e;
    }

    public final ServerId getServerId() {
        return this.f23748b;
    }

    public int hashCode() {
        return this.f23748b.f15142b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23746f);
    }
}
