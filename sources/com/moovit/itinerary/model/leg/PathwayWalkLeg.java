package com.moovit.itinerary.model.leg;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polyline;
import com.moovit.commons.geo.Polylon;
import com.moovit.database.DbEntityRef;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.TransitStop;
import com.moovit.transit.TransitStopPathway;
import com.moovit.util.time.Time;
import java.io.IOException;
import java.util.List;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import p824tp.C19739q;
import p977zz.C20975x0;
import x00.C20440a;

public class PathwayWalkLeg implements Leg {
    public static final Parcelable.Creator<PathwayWalkLeg> CREATOR = new C16148a();

    /* renamed from: g */
    public static final C16149b f42088g = new C16149b();

    /* renamed from: h */
    public static final C16150c f42089h = new C16150c(PathwayWalkLeg.class);

    /* renamed from: b */
    public final Time f42090b;

    /* renamed from: c */
    public final Time f42091c;

    /* renamed from: d */
    public final DbEntityRef<TransitStop> f42092d;

    /* renamed from: e */
    public final ServerId f42093e;

    /* renamed from: f */
    public final ServerId f42094f;

    /* renamed from: com.moovit.itinerary.model.leg.PathwayWalkLeg$a */
    public class C16148a implements Parcelable.Creator<PathwayWalkLeg> {
        public final Object createFromParcel(Parcel parcel) {
            return (PathwayWalkLeg) C19612n.m46981v(parcel, PathwayWalkLeg.f42089h);
        }

        public final Object[] newArray(int i) {
            return new PathwayWalkLeg[i];
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.PathwayWalkLeg$b */
    public class C16149b extends C19621u<PathwayWalkLeg> {
        public C16149b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            PathwayWalkLeg pathwayWalkLeg = (PathwayWalkLeg) obj;
            Time time = pathwayWalkLeg.f42090b;
            Time.C7913b bVar = Time.f23899o;
            qVar.getClass();
            qVar.mo51939l(6);
            bVar.mo19622a(time, qVar);
            Time time2 = pathwayWalkLeg.f42091c;
            qVar.mo51939l(6);
            bVar.mo19622a(time2, qVar);
            DbEntityRef.TRANSIT_STOP_REF_CODER.write(pathwayWalkLeg.f42092d, qVar);
            ServerId serverId = pathwayWalkLeg.f42093e;
            if (serverId == null) {
                qVar.mo51934b(false);
            } else {
                qVar.mo51934b(true);
                qVar.mo51939l(serverId.f15142b);
            }
            ServerId serverId2 = pathwayWalkLeg.f42094f;
            if (serverId2 == null) {
                qVar.mo51934b(false);
                return;
            }
            qVar.mo51934b(true);
            qVar.mo51939l(serverId2.f15142b);
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.PathwayWalkLeg$c */
    public class C16150c extends C19620t<PathwayWalkLeg> {
        public C16150c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            ServerId serverId;
            ServerId serverId2;
            Time.C7914c cVar = Time.f23900p;
            pVar.getClass();
            Time time = (Time) cVar.read(pVar);
            Time time2 = (Time) cVar.read(pVar);
            DbEntityRef read = DbEntityRef.TRANSIT_STOP_REF_CODER.read(pVar);
            if (!pVar.mo51919b()) {
                serverId = null;
            } else {
                serverId = new ServerId(pVar.mo51924l());
            }
            if (!pVar.mo51919b()) {
                serverId2 = null;
            } else {
                serverId2 = new ServerId(pVar.mo51924l());
            }
            return new PathwayWalkLeg(time, time2, read, serverId, serverId2);
        }
    }

    public PathwayWalkLeg(Time time, Time time2, DbEntityRef<TransitStop> dbEntityRef, ServerId serverId, ServerId serverId2) {
        C21100e.m49373x(time, "startTime");
        this.f42090b = time;
        C21100e.m49373x(time2, "endTime");
        this.f42091c = time2;
        C21100e.m49373x(dbEntityRef, "stopRef");
        this.f42092d = dbEntityRef;
        this.f42093e = serverId;
        this.f42094f = serverId2;
    }

    /* renamed from: K1 */
    public final Time mo48331K1() {
        return this.f42091c;
    }

    /* renamed from: W */
    public final LocationDescriptor mo48332W() {
        TransitStopPathway transitStopPathway;
        int i;
        ResourceImage resourceImage = null;
        if (this.f42093e == null) {
            transitStopPathway = null;
        } else {
            transitStopPathway = this.f42092d.get().f23740l.get(this.f42093e);
        }
        if (transitStopPathway == null) {
            return LocationDescriptor.m17769c(this.f42092d.get());
        }
        LocationDescriptor.LocationType locationType = LocationDescriptor.LocationType.COORDINATE;
        LocationDescriptor.SourceType sourceType = LocationDescriptor.SourceType.EXTERNAL;
        String str = transitStopPathway.f23750d;
        LatLonE6 latLonE6 = transitStopPathway.f23751e;
        int i2 = transitStopPathway.f23749c;
        if (i2 == 1) {
            i = C19739q.ic_pathway_entrance_16_on_surface_emphasis_high;
        } else if (i2 == 2) {
            i = C19739q.ic_pathway_exit_16_on_surface_emphasis_high;
        } else if (i2 != 3) {
            i = 0;
        } else {
            i = C19739q.ic_pathway_both_16_on_surface_emphasis_high;
        }
        if (i != 0) {
            resourceImage = new ResourceImage(i, new String[0]);
        }
        return new LocationDescriptor(locationType, sourceType, (ServerId) null, (String) null, str, (List<C20440a>) null, latLonE6, (LatLonE6) null, resourceImage, (Image) null);
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e2 */
    public final LocationDescriptor mo48334e2() {
        TransitStopPathway transitStopPathway;
        int i;
        ResourceImage resourceImage = null;
        if (this.f42094f == null) {
            transitStopPathway = null;
        } else {
            transitStopPathway = this.f42092d.get().f23740l.get(this.f42094f);
        }
        if (transitStopPathway == null) {
            return LocationDescriptor.m17769c(this.f42092d.get());
        }
        LocationDescriptor.LocationType locationType = LocationDescriptor.LocationType.COORDINATE;
        LocationDescriptor.SourceType sourceType = LocationDescriptor.SourceType.EXTERNAL;
        String str = transitStopPathway.f23750d;
        LatLonE6 latLonE6 = transitStopPathway.f23751e;
        int i2 = transitStopPathway.f23749c;
        if (i2 == 1) {
            i = C19739q.ic_pathway_entrance_16_on_surface_emphasis_high;
        } else if (i2 == 2) {
            i = C19739q.ic_pathway_exit_16_on_surface_emphasis_high;
        } else if (i2 != 3) {
            i = 0;
        } else {
            i = C19739q.ic_pathway_both_16_on_surface_emphasis_high;
        }
        if (i != 0) {
            resourceImage = new ResourceImage(i, new String[0]);
        }
        return new LocationDescriptor(locationType, sourceType, (ServerId) null, (String) null, str, (List<C20440a>) null, latLonE6, (LatLonE6) null, resourceImage, (Image) null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PathwayWalkLeg)) {
            return false;
        }
        PathwayWalkLeg pathwayWalkLeg = (PathwayWalkLeg) obj;
        if (!this.f42090b.equals(pathwayWalkLeg.f42090b) || !this.f42091c.equals(pathwayWalkLeg.f42091c) || !this.f42092d.equals(pathwayWalkLeg.f42092d) || !C20975x0.m49118e(this.f42093e, pathwayWalkLeg.f42093e) || !C20975x0.m49118e(this.f42094f, pathwayWalkLeg.f42094f)) {
            return false;
        }
        return true;
    }

    public final int getType() {
        return 8;
    }

    public final int hashCode() {
        return C17884p.m44333D(this.f42090b.hashCode(), this.f42091c.hashCode(), this.f42092d.hashCode(), C17884p.m44335F(this.f42093e), C17884p.m44335F(this.f42094f));
    }

    /* renamed from: i0 */
    public final <T> T mo48338i0(Leg.C16144a<T> aVar) {
        return aVar.mo39925q(this);
    }

    /* renamed from: o1 */
    public final Time mo48339o1() {
        return this.f42090b;
    }

    /* renamed from: w1 */
    public final Polyline mo48340w1() {
        return Polylon.m40193b(mo48332W().mo24310d(), mo48334e2().mo24310d());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42088g);
    }
}
