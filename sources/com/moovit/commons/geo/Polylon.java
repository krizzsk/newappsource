package com.moovit.commons.geo;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.commons.geo.LatLonE6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p810sz.C19575a;
import p810sz.C19576b;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class Polylon implements Polyline, Polygon, Parcelable, Iterable<LatLonE6> {
    public static final Parcelable.Creator<Polylon> CREATOR = new C15745a();

    /* renamed from: e */
    public static final C19576b f40982e = new C19576b(LatLonE6.f40978f, true);

    /* renamed from: f */
    public static final C19575a f40983f = C19575a.m46957a(LatLonE6.f40979g, true);

    /* renamed from: g */
    public static final C15746b f40984g = new C15746b();

    /* renamed from: h */
    public static final C15747c f40985h = new C15747c(Polylon.class);

    /* renamed from: i */
    public static final C15748d f40986i = new C15748d();

    /* renamed from: j */
    public static final C15749e f40987j = new C15749e();

    /* renamed from: k */
    public static final C15750f f40988k = new C15750f(Polyline.class);

    /* renamed from: b */
    public final List<LatLonE6> f40989b;

    /* renamed from: c */
    public final BoxE6 f40990c;

    /* renamed from: d */
    public float f40991d;

    /* renamed from: com.moovit.commons.geo.Polylon$a */
    public class C15745a implements Parcelable.Creator<Polylon> {
        public final Object createFromParcel(Parcel parcel) {
            return (Polylon) C19612n.m46981v(parcel, Polylon.f40985h);
        }

        public final Object[] newArray(int i) {
            return new Polylon[i];
        }
    }

    /* renamed from: com.moovit.commons.geo.Polylon$b */
    public class C15746b extends C19621u<Polylon> {
        public C15746b() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            Polylon polylon = (Polylon) obj;
            List<LatLonE6> list = polylon.f40989b;
            C19576b bVar = Polylon.f40982e;
            qVar.getClass();
            bVar.write(list, qVar);
            qVar.mo51938j(polylon.f40991d);
        }
    }

    /* renamed from: com.moovit.commons.geo.Polylon$c */
    public class C15747c extends C19620t<Polylon> {
        public C15747c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 1 || i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            if (i == 1) {
                C19575a aVar = Polylon.f40983f;
                pVar.getClass();
                return new Polylon((ArrayList) aVar.read(pVar), pVar.mo51923j(), false);
            }
            C19575a aVar2 = Polylon.f40983f;
            pVar.getClass();
            return new Polylon((ArrayList) aVar2.read(pVar), -1.0f, false);
        }
    }

    /* renamed from: com.moovit.commons.geo.Polylon$d */
    public class C15748d extends C19621u<Polygon> {
        public C15748d() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            Polylon.f40982e.write(((Polygon) obj).getPoints(), qVar);
        }
    }

    /* renamed from: com.moovit.commons.geo.Polylon$e */
    public class C15749e extends C19621u<Polyline> {
        public C15749e() {
            super(1);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            Polyline polyline = (Polyline) obj;
            List<LatLonE6> points = polyline.getPoints();
            C19576b bVar = Polylon.f40982e;
            qVar.getClass();
            bVar.write(points, qVar);
            qVar.mo51938j(polyline.mo24339Z0());
        }
    }

    /* renamed from: com.moovit.commons.geo.Polylon$f */
    public class C15750f extends C19620t<Polyline> {
        public C15750f(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i <= 1;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            if (i == 1) {
                C19575a aVar = Polylon.f40983f;
                pVar.getClass();
                return new Polylon((ArrayList) aVar.read(pVar), pVar.mo51923j(), false);
            }
            C19575a aVar2 = Polylon.f40983f;
            pVar.getClass();
            return new Polylon((ArrayList) aVar2.read(pVar), -1.0f, false);
        }
    }

    public Polylon() {
        throw null;
    }

    public Polylon(List<LatLonE6> list) {
        this(list, true);
    }

    /* renamed from: b */
    public static Polylon m40193b(LatLonE6... latLonE6Arr) {
        return new Polylon(Arrays.asList(latLonE6Arr), -1.0f, false);
    }

    /* renamed from: d */
    public static Polylon m40194d(float f, String str) {
        int i;
        int i2;
        int i3;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            int i7 = 0;
            int i8 = 0;
            while (true) {
                i = i4 + 1;
                int charAt = str.charAt(i4) - '?';
                i8 |= (charAt & 31) << i7;
                i7 += 5;
                if (charAt < 32) {
                    break;
                }
                i4 = i;
            }
            if ((i8 & 1) != 0) {
                i2 = ~(i8 >> 1);
            } else {
                i2 = i8 >> 1;
            }
            int i9 = i2 + i5;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                i3 = i + 1;
                int charAt2 = str.charAt(i) - '?';
                i12 |= (charAt2 & 31) << i11;
                i11 += 5;
                if (charAt2 < 32) {
                    break;
                }
                i = i3;
            }
            int i13 = i12 & 1;
            int i14 = i12 >> 1;
            if (i13 != 0) {
                i14 = ~i14;
            }
            i6 += i14;
            arrayList.add(new LatLonE6(i9 * 10, i6 * 10));
            i5 = i9;
            i4 = i3;
        }
        return new Polylon(arrayList, f, false);
    }

    /* renamed from: m */
    public static Polylon m40195m(String str) {
        return m40194d(-1.0f, str);
    }

    /* renamed from: n */
    public static String m40196n(Polyline polyline) {
        List<LatLonE6> points = polyline.getPoints();
        LatLonE6.C15744d dVar = LatLonE6.f40976d;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int i2 = 0;
        for (LatLonE6 next : points) {
            int i3 = next.f40980b / 10;
            int i4 = next.f40981c / 10;
            LatLonE6.m40175f(sb, i3 - i);
            LatLonE6.m40175f(sb, i4 - i2);
            i2 = i4;
            i = i3;
        }
        return sb.toString();
    }

    /* renamed from: U0 */
    public final int mo24338U0() {
        return this.f40989b.size();
    }

    /* renamed from: Z0 */
    public final float mo24339Z0() {
        if (this.f40991d < BitmapDescriptorFactory.HUE_RED) {
            this.f40991d = BitmapDescriptorFactory.HUE_RED;
            int size = this.f40989b.size();
            if (size >= 2) {
                Location u = this.f40989b.get(0).mo46929u((Location) null);
                int i = 1;
                while (i < size) {
                    Location u2 = this.f40989b.get(i).mo46929u((Location) null);
                    this.f40991d = u.distanceTo(u2) + this.f40991d;
                    i++;
                    u = u2;
                }
            }
        }
        return this.f40991d;
    }

    public final int describeContents() {
        return 0;
    }

    public final BoxE6 getBounds() {
        return this.f40990c;
    }

    public final List<LatLonE6> getPoints() {
        return Collections.unmodifiableList(this.f40989b);
    }

    /* renamed from: h */
    public final boolean mo46935h(LatLonE6 latLonE6) {
        boolean z;
        boolean z2;
        Polylon polylon = this;
        LatLonE6 latLonE62 = latLonE6;
        long j = (long) latLonE62.f40981c;
        long j2 = (long) latLonE62.f40980b;
        int size = polylon.f40989b.size();
        int i = 0;
        boolean z3 = false;
        while (i < size) {
            LatLonE6 latLonE63 = polylon.f40989b.get(i);
            int i2 = i + 1;
            LatLonE6 latLonE64 = polylon.f40989b.get(i2 % size);
            if (latLonE63.f40980b > latLonE64.f40980b) {
                LatLonE6 latLonE65 = latLonE64;
                latLonE64 = latLonE63;
                latLonE63 = latLonE65;
            }
            long j3 = (long) latLonE63.f40981c;
            long j4 = (long) latLonE63.f40980b;
            int i3 = i2;
            long j5 = (long) latLonE64.f40981c;
            long j6 = (long) latLonE64.f40980b;
            if (j2 > j4) {
                z = true;
            } else {
                z = false;
            }
            int i4 = size;
            if (j2 > j6) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                if ((j6 - j4) * (j - j3) > (j2 - j4) * (j5 - j3)) {
                    z3 = !z3;
                }
            }
            polylon = this;
            i = i3;
            size = i4;
        }
        return z3;
    }

    public final Iterator<LatLonE6> iterator() {
        return this.f40989b.iterator();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40984g);
    }

    /* renamed from: y */
    public final LatLonE6 mo24347y(int i) {
        return this.f40989b.get(i);
    }

    public Polylon(List<LatLonE6> list, boolean z) {
        this(list, -1.0f, z);
    }

    public Polylon(List<LatLonE6> list, float f, boolean z) {
        if (list == null) {
            throw new IllegalArgumentException("points may not be null");
        } else if (!list.isEmpty()) {
            this.f40989b = Collections.unmodifiableList(z ? new ArrayList<>(list) : list);
            this.f40990c = BoxE6.m40166f(list);
            this.f40991d = f;
        } else {
            throw new IllegalArgumentException("points may not be empty");
        }
    }
}
