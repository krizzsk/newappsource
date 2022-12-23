package com.moovit.transit;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.geo.Polyline;
import com.moovit.commons.geo.Polylon;
import com.moovit.database.DbEntityRef;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p241s0.C6302b;
import p583jk.C17884p;
import p762qz.C19205a;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p988j$.util.Collection;
import p988j$.util.stream.Collectors;
import u90.C13139b;
import u90.C13140c;

public class TransitPatternShape implements C19205a, Parcelable {
    public static final Parcelable.Creator<TransitPatternShape> CREATOR = new C7821a();

    /* renamed from: d */
    public static final C7822b f23712d = new C7822b(TransitPatternShape.class);

    /* renamed from: b */
    public final List<DbEntityRef<ShapeSegment>> f23713b;

    /* renamed from: c */
    public final C6302b f23714c = new C6302b();

    /* renamed from: com.moovit.transit.TransitPatternShape$a */
    public class C7821a implements Parcelable.Creator<TransitPatternShape> {
        public final Object createFromParcel(Parcel parcel) {
            return (TransitPatternShape) C19612n.m46981v(parcel, TransitPatternShape.f23712d);
        }

        public final Object[] newArray(int i) {
            return new TransitPatternShape[i];
        }
    }

    /* renamed from: com.moovit.transit.TransitPatternShape$b */
    public class C7822b extends C19619s<TransitPatternShape> {
        public C7822b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new TransitPatternShape(pVar.mo51959g(DbEntityRef.SHAPE_SEGMENT_REF_CODER));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            qVar.mo51965h(((TransitPatternShape) obj).f23713b, DbEntityRef.SHAPE_SEGMENT_REF_CODER);
        }
    }

    public TransitPatternShape(ArrayList arrayList) {
        C21100e.m49373x(arrayList, "shapeSegments");
        this.f23713b = Collections.unmodifiableList(arrayList);
    }

    /* renamed from: b */
    public final Polylon mo24395b(int i, int i2) {
        return new Polylon((List) Collection.EL.stream(DbEntityRef.getEntities(this.f23713b.subList(i, i2))).map(new C13139b()).flatMap(new C13140c()).collect(Collectors.toList()));
    }

    /* renamed from: c */
    public final Polyline mo24396c(int i, int i2) {
        if (i < 0 || i2 > this.f23713b.size() || i2 <= i) {
            return null;
        }
        String str = i + "_" + i2;
        Polyline polyline = (Polyline) this.f23714c.getOrDefault(str, null);
        if (polyline == null) {
            synchronized (this.f23714c) {
                Polyline polyline2 = (Polyline) this.f23714c.getOrDefault(str, null);
                if (polyline2 == null) {
                    Polylon b = mo24395b(i, i2);
                    this.f23714c.put(str, b);
                    polyline = b;
                } else {
                    polyline = polyline2;
                }
            }
        }
        return polyline;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransitPatternShape)) {
            return false;
        }
        return this.f23713b.equals(((TransitPatternShape) obj).f23713b);
    }

    public final BoxE6 getBounds() {
        return BoxE6.m40165d(DbEntityRef.getEntities(this.f23713b));
    }

    public final int hashCode() {
        return C17884p.m44335F(this.f23713b);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23712d);
    }
}
