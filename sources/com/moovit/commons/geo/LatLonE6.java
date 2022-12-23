package com.moovit.commons.geo;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Locale;
import p583jk.C17884p;
import p762qz.C19206b;
import p810sz.C19589j;
import p810sz.C19600l;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p977zz.C20964s0;

public final class LatLonE6 implements C19206b, Parcelable {
    public static final Parcelable.Creator<LatLonE6> CREATOR = new C15741a();

    /* renamed from: d */
    public static final C15744d f40976d = new C15744d();

    /* renamed from: e */
    public static final C15744d f40977e = new C15744d();

    /* renamed from: f */
    public static final C15742b f40978f = new C15742b();

    /* renamed from: g */
    public static final C15743c f40979g = new C15743c();

    /* renamed from: b */
    public final int f40980b;

    /* renamed from: c */
    public final int f40981c;

    /* renamed from: com.moovit.commons.geo.LatLonE6$a */
    public class C15741a implements Parcelable.Creator<LatLonE6> {
        public final Object createFromParcel(Parcel parcel) {
            return (LatLonE6) C19612n.m46981v(parcel, LatLonE6.f40979g);
        }

        public final Object[] newArray(int i) {
            return new LatLonE6[i];
        }
    }

    /* renamed from: com.moovit.commons.geo.LatLonE6$b */
    public class C15742b implements C19600l<LatLonE6> {
        public final void write(Object obj, C19616q qVar) throws IOException {
            LatLonE6 latLonE6 = (LatLonE6) obj;
            qVar.mo51939l(latLonE6.f40980b);
            qVar.mo51939l(latLonE6.f40981c);
        }
    }

    /* renamed from: com.moovit.commons.geo.LatLonE6$c */
    public class C15743c implements C19589j<LatLonE6> {
        public final Object read(C19615p pVar) throws IOException {
            return new LatLonE6(pVar.mo51924l(), pVar.mo51924l());
        }
    }

    /* renamed from: com.moovit.commons.geo.LatLonE6$d */
    public static class C15744d extends ThreadLocal<Location> {
        public final Object initialValue() {
            return new Location((String) null);
        }
    }

    public LatLonE6(int i, int i2) {
        if (i > 90000000 || i < -90000000) {
            throw new IllegalArgumentException(C16759e.m42349e("latitudeMicroDegrees must be in the range [-90,+90]*10^6, but it's ", i));
        }
        this.f40980b = i;
        int i3 = i2 % 360000000;
        if (i3 > 180000000) {
            i3 -= 360000000;
        } else if (i3 < -180000000) {
            i3 += 360000000;
        }
        this.f40981c = i3;
    }

    /* renamed from: b */
    public static int m40173b(double d) {
        return (int) Math.round(d * 1000000.0d);
    }

    /* renamed from: c */
    public static float m40174c(C19206b bVar, C19206b bVar2) {
        return bVar.getLocation().mo46929u((Location) f40976d.get()).distanceTo(bVar2.getLocation().mo46929u((Location) f40977e.get()));
    }

    /* renamed from: f */
    public static void m40175f(StringBuilder sb, int i) {
        boolean z;
        if (i < 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = i << 1;
        if (z) {
            i2 = ~i2;
        }
        while (i2 >= 32) {
            sb.append((char) ((32 | (i2 & 31)) + 63));
            i2 >>= 5;
        }
        sb.append((char) (i2 + 63));
    }

    /* renamed from: g */
    public static LatLonE6 m40176g(double d, double d2) {
        return new LatLonE6(m40173b(d), m40173b(d2));
    }

    /* renamed from: j */
    public static LatLonE6 m40177j(Location location) {
        if (location == null) {
            return null;
        }
        return m40176g(location.getLatitude(), location.getLongitude());
    }

    /* renamed from: r */
    public static String m40178r(int i) {
        return new BigDecimal(i).movePointLeft(6).toPlainString();
    }

    /* renamed from: s */
    public static double m40179s(int i) {
        return ((double) i) / 1000000.0d;
    }

    /* renamed from: t */
    public static float m40180t(LatLonE6 latLonE6, LatLonE6 latLonE62) {
        int i = latLonE62.f40980b;
        int i2 = latLonE6.f40980b;
        int i3 = i - i2;
        return (float) Math.hypot((((double) (latLonE62.f40981c - latLonE6.f40981c)) * Math.cos(Math.toRadians(m40179s((i + i2) / 2)))) / 8.983204953368922d, ((double) i3) / 9.013305360099787d);
    }

    /* renamed from: d */
    public final float mo46918d(Location location) {
        return mo46929u((Location) f40976d.get()).distanceTo(location);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LatLonE6)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        LatLonE6 latLonE6 = (LatLonE6) obj;
        if (this.f40980b == latLonE6.f40980b && this.f40981c == latLonE6.f40981c) {
            return true;
        }
        return false;
    }

    public final LatLonE6 getLocation() {
        return this;
    }

    public final int hashCode() {
        return C17884p.m44333D(this.f40980b, this.f40981c);
    }

    /* renamed from: k */
    public final double mo46922k() {
        return m40179s(this.f40980b);
    }

    /* renamed from: l */
    public final String mo46923l() {
        Object[] objArr = {mo46925n(), mo46927q()};
        String str = C20964s0.f52718a;
        return String.format((Locale) null, "%s,%s", objArr);
    }

    /* renamed from: m */
    public final double mo46924m() {
        return Math.toRadians(mo46922k());
    }

    /* renamed from: n */
    public final String mo46925n() {
        return String.format(Locale.ENGLISH, "%.6f", new Object[]{Double.valueOf(mo46922k())});
    }

    /* renamed from: o */
    public final double mo46926o() {
        return m40179s(this.f40981c);
    }

    /* renamed from: q */
    public final String mo46927q() {
        return String.format(Locale.ENGLISH, "%.6f", new Object[]{Double.valueOf(mo46926o())});
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("[lat=");
        k.append(new BigDecimal(this.f40980b).movePointLeft(6).toString());
        k.append(", lon=");
        k.append(new BigDecimal(this.f40981c).movePointLeft(6).toString());
        k.append("]");
        return k.toString();
    }

    /* renamed from: u */
    public final Location mo46929u(Location location) {
        if (location == null) {
            location = new Location((String) null);
        }
        location.setLatitude(mo46922k());
        location.setLongitude(mo46926o());
        return location;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40978f);
    }
}
