package com.moovit.commons.geo;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p583jk.C17884p;
import p762qz.C19205a;
import p762qz.C19206b;
import p810sz.C19589j;
import p810sz.C19600l;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;

public final class BoxE6 implements Parcelable {
    public static final Parcelable.Creator<BoxE6> CREATOR = new C15732a();

    /* renamed from: f */
    public static final C15733b f40962f = new C15733b();

    /* renamed from: g */
    public static final C15734c f40963g = new C15734c();

    /* renamed from: b */
    public final int f40964b;

    /* renamed from: c */
    public final int f40965c;

    /* renamed from: d */
    public final int f40966d;

    /* renamed from: e */
    public final int f40967e;

    /* renamed from: com.moovit.commons.geo.BoxE6$a */
    public class C15732a implements Parcelable.Creator<BoxE6> {
        public final Object createFromParcel(Parcel parcel) {
            return (BoxE6) C19612n.m46981v(parcel, BoxE6.f40963g);
        }

        public final Object[] newArray(int i) {
            return new BoxE6[i];
        }
    }

    /* renamed from: com.moovit.commons.geo.BoxE6$b */
    public class C15733b implements C19600l<BoxE6> {
        public final void write(Object obj, C19616q qVar) throws IOException {
            BoxE6 boxE6 = (BoxE6) obj;
            qVar.mo51939l(boxE6.f40964b);
            qVar.mo51939l(boxE6.f40965c);
            qVar.mo51939l(boxE6.f40966d);
            qVar.mo51939l(boxE6.f40967e);
        }
    }

    /* renamed from: com.moovit.commons.geo.BoxE6$c */
    public class C15734c implements C19589j<BoxE6> {
        public final Object read(C19615p pVar) throws IOException {
            return new BoxE6(pVar.mo51924l(), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51924l());
        }
    }

    public BoxE6(int i, int i2, int i3, int i4) {
        if (i <= i2) {
            this.f40964b = i;
            this.f40965c = i2;
            this.f40966d = i3;
            this.f40967e = i4;
            return;
        }
        throw new IllegalStateException("south may not be greater than north");
    }

    /* renamed from: c */
    public static BoxE6 m40164c(LatLonE6 latLonE6, LatLonE6 latLonE62) {
        return new BoxE6(Math.min(latLonE6.f40980b, latLonE62.f40980b), Math.max(latLonE6.f40980b, latLonE62.f40980b), Math.min(latLonE6.f40981c, latLonE62.f40981c), Math.max(latLonE6.f40981c, latLonE62.f40981c));
    }

    /* renamed from: d */
    public static BoxE6 m40165d(Collection<? extends C19205a> collection) {
        if (!collection.isEmpty()) {
            Iterator<? extends C19205a> it = collection.iterator();
            BoxE6 bounds = ((C19205a) it.next()).getBounds();
            while (it.hasNext()) {
                bounds = bounds.mo46895b(((C19205a) it.next()).getBounds());
            }
            return bounds;
        }
        throw new IllegalArgumentException("bounds collection is empty");
    }

    /* renamed from: f */
    public static BoxE6 m40166f(Collection<? extends C19206b> collection) {
        if (!collection.isEmpty()) {
            Iterator<? extends C19206b> it = collection.iterator();
            LatLonE6 location = ((C19206b) it.next()).getLocation();
            int i = location.f40980b;
            int i2 = location.f40981c;
            int i3 = i;
            int i4 = i3;
            int i5 = i2;
            while (it.hasNext()) {
                LatLonE6 location2 = ((C19206b) it.next()).getLocation();
                i4 = Math.max(i4, location2.f40980b);
                i3 = Math.min(i3, location2.f40980b);
                i5 = Math.max(i5, location2.f40981c);
                i2 = Math.min(i2, location2.f40981c);
            }
            return new BoxE6(i3, i4, i2, i5);
        }
        throw new IllegalArgumentException("points collection is empty");
    }

    /* renamed from: g */
    public static BoxE6 m40167g(C19206b... bVarArr) {
        return m40166f(Arrays.asList(bVarArr));
    }

    /* renamed from: b */
    public final BoxE6 mo46895b(BoxE6 boxE6) {
        return new BoxE6(Math.min(this.f40964b, boxE6.f40964b), Math.max(this.f40965c, boxE6.f40965c), Math.min(this.f40966d, boxE6.f40966d), Math.max(this.f40967e, boxE6.f40967e));
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof BoxE6)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        BoxE6 boxE6 = (BoxE6) obj;
        if (this.f40964b == boxE6.f40964b && this.f40965c == boxE6.f40965c && this.f40966d == boxE6.f40966d && this.f40967e == boxE6.f40967e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C17884p.m44333D(this.f40964b, this.f40967e, this.f40965c, this.f40966d);
    }

    /* renamed from: j */
    public final BoxE6 mo46899j(BoxE6 boxE6) {
        boolean z;
        boolean z2;
        boolean z3;
        int max = Math.max(this.f40964b, boxE6.f40964b);
        int min = Math.min(this.f40965c, boxE6.f40965c);
        int i = this.f40966d;
        int i2 = this.f40967e;
        boolean z4 = true;
        if (i > i2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = i2;
        }
        int i3 = boxE6.f40966d;
        int i4 = boxE6.f40967e;
        if (i3 > i4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            i3 = i4;
        }
        int max2 = Math.max(i, i3);
        int i5 = this.f40966d;
        int i6 = this.f40967e;
        if (i5 > i6) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3) {
            i5 = i6;
        }
        int i7 = boxE6.f40966d;
        int i8 = boxE6.f40967e;
        if (i7 <= i8) {
            z4 = false;
        }
        if (!z4) {
            i7 = i8;
        }
        int min2 = Math.min(i5, i7);
        if (max > min || max2 > min2) {
            return null;
        }
        return new BoxE6(max, min, max2, min2);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("[BoxE6 s:n=");
        k.append(LatLonE6.m40178r(this.f40964b));
        k.append(":");
        k.append(LatLonE6.m40178r(this.f40965c));
        k.append(" w:e=");
        k.append(LatLonE6.m40178r(this.f40966d));
        k.append(":");
        k.append(LatLonE6.m40178r(this.f40967e));
        k.append("]");
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40962f);
    }
}
