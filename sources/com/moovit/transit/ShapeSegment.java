package com.moovit.transit;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polyline;
import com.moovit.commons.geo.Polylon;
import com.moovit.network.model.ServerId;
import j40.C5384a;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class ShapeSegment implements C5384a, Polyline, Parcelable {
    public static final Parcelable.Creator<ShapeSegment> CREATOR = new C7802a();

    /* renamed from: f */
    public static final C7803b f23665f = new C7803b(ShapeSegment.class);

    /* renamed from: b */
    public final ServerId f23666b;

    /* renamed from: c */
    public final ServerId f23667c;

    /* renamed from: d */
    public final ServerId f23668d;

    /* renamed from: e */
    public final Polyline f23669e;

    /* renamed from: com.moovit.transit.ShapeSegment$a */
    public class C7802a implements Parcelable.Creator<ShapeSegment> {
        public final Object createFromParcel(Parcel parcel) {
            return (ShapeSegment) C19612n.m46981v(parcel, ShapeSegment.f23665f);
        }

        public final Object[] newArray(int i) {
            return new ShapeSegment[i];
        }
    }

    /* renamed from: com.moovit.transit.ShapeSegment$b */
    public class C7803b extends C19619s<ShapeSegment> {
        public C7803b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            return new ShapeSegment(new ServerId(pVar.mo51924l()), new ServerId(pVar.mo51924l()), new ServerId(pVar.mo51924l()), (Polyline) Polylon.f40988k.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            ShapeSegment shapeSegment = (ShapeSegment) obj;
            ServerId serverId = shapeSegment.f23666b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51939l(shapeSegment.f23667c.f15142b);
            qVar.mo51939l(shapeSegment.f23668d.f15142b);
            Polyline polyline = shapeSegment.f23669e;
            Polylon.C15749e eVar = Polylon.f40987j;
            qVar.mo51939l(eVar.f49804u);
            eVar.mo19622a(polyline, qVar);
        }
    }

    public ShapeSegment(ServerId serverId, ServerId serverId2, ServerId serverId3, Polyline polyline) {
        C21100e.m49373x(serverId, "segmentId");
        this.f23666b = serverId;
        C21100e.m49373x(serverId2, "fromStopId");
        this.f23667c = serverId2;
        C21100e.m49373x(serverId3, "toStopId");
        this.f23668d = serverId3;
        C21100e.m49373x(polyline, "polyline");
        this.f23669e = polyline;
    }

    /* renamed from: U0 */
    public final int mo24338U0() {
        return this.f23669e.mo24338U0();
    }

    /* renamed from: Z0 */
    public final float mo24339Z0() {
        return this.f23669e.mo24339Z0();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShapeSegment)) {
            return false;
        }
        return this.f23666b.equals(((ShapeSegment) obj).f23666b);
    }

    public final BoxE6 getBounds() {
        return this.f23669e.getBounds();
    }

    public final List<LatLonE6> getPoints() {
        return this.f23669e.getPoints();
    }

    public final ServerId getServerId() {
        return this.f23666b;
    }

    public final int hashCode() {
        return this.f23666b.f15142b;
    }

    public final Iterator<LatLonE6> iterator() {
        return this.f23669e.iterator();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23665f);
    }

    /* renamed from: y */
    public final LatLonE6 mo24347y(int i) {
        return this.f23669e.mo24347y(i);
    }
}
