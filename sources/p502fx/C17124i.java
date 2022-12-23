package p502fx;

import ce0.C21100e;
import com.appboy.models.outgoing.FacebookUser;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.network.model.ServerId;
import j40.C5384a;
import p762qz.C19206b;

/* renamed from: fx.i */
public final class C17124i implements C19206b, C5384a {

    /* renamed from: b */
    public final int f44327b;

    /* renamed from: c */
    public final ServerId f44328c;

    /* renamed from: d */
    public final LatLonE6 f44329d;

    /* renamed from: e */
    public final String f44330e;

    /* renamed from: f */
    public final float f44331f;

    /* renamed from: g */
    public final int f44332g;

    /* renamed from: h */
    public final int f44333h;

    public C17124i(int i, ServerId serverId, LatLonE6 latLonE6, String str, float f, int i2, int i3) {
        this.f44327b = i;
        C21100e.m49373x(serverId, "id");
        this.f44328c = serverId;
        C21100e.m49373x(latLonE6, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        this.f44329d = latLonE6;
        C21100e.m49373x(str, "locationName");
        this.f44330e = str;
        this.f44331f = f;
        this.f44332g = i2;
        this.f44333h = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17124i)) {
            return false;
        }
        return this.f44328c.equals(((C17124i) obj).f44328c);
    }

    public final LatLonE6 getLocation() {
        return this.f44329d;
    }

    public final ServerId getServerId() {
        return this.f44328c;
    }

    public final int hashCode() {
        return this.f44328c.f15142b;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodRideWayPoint{type=");
        k.append(this.f44327b);
        k.append(", id=");
        k.append(this.f44328c);
        k.append('}');
        return k.toString();
    }
}
