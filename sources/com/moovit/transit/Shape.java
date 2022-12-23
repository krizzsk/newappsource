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

public class Shape implements C5384a, Polyline, Parcelable {
    public static final Parcelable.Creator<Shape> CREATOR = new C7800a();

    /* renamed from: d */
    public static C7801b f23662d = new C7801b(Shape.class);

    /* renamed from: b */
    public final ServerId f23663b;

    /* renamed from: c */
    public final Polyline f23664c;

    /* renamed from: com.moovit.transit.Shape$a */
    public class C7800a implements Parcelable.Creator<Shape> {
        public final Object createFromParcel(Parcel parcel) {
            return (Shape) C19612n.m46981v(parcel, Shape.f23662d);
        }

        public final Object[] newArray(int i) {
            return new Shape[i];
        }
    }

    /* renamed from: com.moovit.transit.Shape$b */
    public class C7801b extends C19619s<Shape> {
        public C7801b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            return new Shape(new ServerId(pVar.mo51924l()), (Polyline) Polylon.f40988k.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            Shape shape = (Shape) obj;
            ServerId serverId = shape.f23663b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            Polyline polyline = shape.f23664c;
            Polylon.C15749e eVar = Polylon.f40987j;
            qVar.mo51939l(eVar.f49804u);
            eVar.mo19622a(polyline, qVar);
        }
    }

    public Shape(ServerId serverId, Polyline polyline) {
        C21100e.m49373x(serverId, "shapeId");
        this.f23663b = serverId;
        C21100e.m49373x(polyline, "polyline");
        this.f23664c = polyline;
    }

    /* renamed from: U0 */
    public final int mo24338U0() {
        return this.f23664c.mo24338U0();
    }

    /* renamed from: Z0 */
    public final float mo24339Z0() {
        return this.f23664c.mo24339Z0();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shape)) {
            return false;
        }
        return this.f23663b.equals(((Shape) obj).f23663b);
    }

    public final BoxE6 getBounds() {
        return this.f23664c.getBounds();
    }

    public final List<LatLonE6> getPoints() {
        return this.f23664c.getPoints();
    }

    public final ServerId getServerId() {
        return this.f23663b;
    }

    public final int hashCode() {
        return this.f23663b.f15142b;
    }

    public final Iterator<LatLonE6> iterator() {
        return this.f23664c.iterator();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23662d);
    }

    /* renamed from: y */
    public final LatLonE6 mo24347y(int i) {
        return this.f23664c.mo24347y(i);
    }
}
