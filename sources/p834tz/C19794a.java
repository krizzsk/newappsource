package p834tz;

import android.graphics.PointF;
import android.location.Location;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import p810sz.C19584i;
import p810sz.C19589j;
import p810sz.C19600l;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19617r;
import p810sz.C19619s;

/* renamed from: tz.a */
public final class C19794a {

    /* renamed from: a */
    public static final C19796b f50323a = new C19796b();

    /* renamed from: b */
    public static final C19797c f50324b = new C19797c();

    /* renamed from: c */
    public static final C19798d f50325c = new C19798d();

    /* renamed from: d */
    public static final C19799e f50326d = new C19799e();

    /* renamed from: e */
    public static final C19800f f50327e = new C19800f();

    /* renamed from: f */
    public static final C19801g f50328f = new C19801g();

    /* renamed from: g */
    public static final C19802h f50329g = new C19802h(Location.class);

    /* renamed from: h */
    public static final C19795a f50330h = new C19795a();

    /* renamed from: tz.a$a */
    public class C19795a implements C19584i<Parcelable> {
        public final Object read(C19615p pVar) throws IOException {
            Parcel obtain = Parcel.obtain();
            try {
                byte[] d = pVar.mo51944d();
                obtain.unmarshall(d, 0, d.length);
                obtain.setDataPosition(0);
                return obtain.readParcelable(C19795a.class.getClassLoader());
            } finally {
                obtain.recycle();
            }
        }

        public final void write(Object obj, C19616q qVar) throws IOException {
            Parcelable parcelable = (Parcelable) obj;
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeParcelable(parcelable, 0);
                qVar.mo51951e(obtain.marshall());
            } finally {
                obtain.recycle();
            }
        }
    }

    /* renamed from: tz.a$b */
    public class C19796b implements C19584i<Date> {
        public final Object read(C19615p pVar) throws IOException {
            return new Date(pVar.mo51925m());
        }

        public final void write(Object obj, C19616q qVar) throws IOException {
            qVar.mo51940m(((Date) obj).getTime());
        }
    }

    /* renamed from: tz.a$c */
    public class C19797c implements C19584i<PointF> {
        public final Object read(C19615p pVar) throws IOException {
            return new PointF(pVar.mo51923j(), pVar.mo51923j());
        }

        public final void write(Object obj, C19616q qVar) throws IOException {
            PointF pointF = (PointF) obj;
            qVar.mo51938j(pointF.x);
            qVar.mo51938j(pointF.y);
        }
    }

    /* renamed from: tz.a$d */
    public class C19798d implements C19584i<SparseIntArray> {
        public final Object read(C19615p pVar) throws IOException {
            int l = pVar.mo51924l();
            SparseIntArray sparseIntArray = new SparseIntArray(l);
            for (int i = 0; i < l; i++) {
                sparseIntArray.append(pVar.mo51924l(), pVar.mo51924l());
            }
            return sparseIntArray;
        }

        public final void write(Object obj, C19616q qVar) throws IOException {
            SparseIntArray sparseIntArray = (SparseIntArray) obj;
            int size = sparseIntArray.size();
            qVar.mo51939l(size);
            for (int i = 0; i < size; i++) {
                qVar.mo51939l(sparseIntArray.keyAt(i));
                qVar.mo51939l(sparseIntArray.valueAt(i));
            }
        }
    }

    /* renamed from: tz.a$e */
    public class C19799e implements C19584i<Uri> {
        public final Object read(C19615p pVar) throws IOException {
            return Uri.parse(pVar.mo51947p());
        }

        public final void write(Object obj, C19616q qVar) throws IOException {
            qVar.mo51954p(((Uri) obj).toString());
        }
    }

    /* renamed from: tz.a$f */
    public class C19800f implements C19584i<File> {
        public final Object read(C19615p pVar) throws IOException {
            return new File(pVar.mo51947p());
        }

        public final void write(Object obj, C19616q qVar) throws IOException {
            qVar.mo51954p(((File) obj).getPath());
        }
    }

    /* renamed from: tz.a$g */
    public class C19801g implements C19584i<BigDecimal> {
        public final Object read(C19615p pVar) throws IOException {
            return new BigDecimal(pVar.mo51947p());
        }

        public final void write(Object obj, C19616q qVar) throws IOException {
            qVar.mo51954p(((BigDecimal) obj).toEngineeringString());
        }
    }

    /* renamed from: tz.a$h */
    public class C19802h extends C19619s<Location> {
        public C19802h(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            Location location = new Location(pVar.mo51948t());
            location.setLatitude(pVar.mo51922i());
            location.setLongitude(pVar.mo51922i());
            location.setTime(pVar.mo51925m());
            byte c = pVar.mo51920c();
            if ((c & 1) != 0) {
                location.setAccuracy(pVar.mo51923j());
            }
            if ((c & 2) != 0) {
                location.setSpeed(pVar.mo51923j());
            }
            if ((c & 4) != 0) {
                location.setBearing(pVar.mo51923j());
            }
            if ((c & 8) != 0) {
                location.setAltitude(pVar.mo51922i());
            }
            return location;
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            byte b;
            Location location = (Location) obj;
            qVar.mo51955t(location.getProvider());
            qVar.mo51937i(location.getLatitude());
            qVar.mo51937i(location.getLongitude());
            qVar.mo51940m(location.getTime());
            boolean hasAccuracy = location.hasAccuracy();
            boolean hasSpeed = location.hasSpeed();
            boolean hasBearing = location.hasBearing();
            boolean hasAltitude = location.hasAltitude();
            if (hasAccuracy) {
                b = (byte) 1;
            } else {
                b = 0;
            }
            if (hasSpeed) {
                b = (byte) (b | 2);
            }
            if (hasBearing) {
                b = (byte) (b | 4);
            }
            if (hasAltitude) {
                b = (byte) (b | 8);
            }
            qVar.mo51935c(b);
            if (hasAccuracy) {
                qVar.mo51938j(location.getAccuracy());
            }
            if (hasSpeed) {
                qVar.mo51938j(location.getSpeed());
            }
            if (hasBearing) {
                qVar.mo51938j(location.getBearing());
            }
            if (hasAltitude) {
                qVar.mo51937i(location.getAltitude());
            }
        }
    }

    static {
        C19617r.C19618a aVar = new C19617r.C19618a();
        aVar.mo51969a(0, String.class, C19600l.f49790t, C19589j.f49779k);
        aVar.mo51969a(1, Boolean.class, C19600l.f49782l, C19589j.f49771c);
        aVar.mo51969a(2, Byte.class, C19600l.f49783m, C19589j.f49772d);
        aVar.mo51969a(3, Short.class, C19600l.f49784n, C19589j.f49773e);
        aVar.mo51969a(4, Character.class, C19600l.f49789s, C19589j.f49778j);
        aVar.mo51969a(5, Integer.class, C19600l.f49785o, C19589j.f49774f);
        aVar.mo51969a(6, Float.class, C19600l.f49787q, C19589j.f49776h);
        aVar.mo51969a(7, Long.class, C19600l.f49786p, C19589j.f49775g);
        aVar.mo51969a(8, Double.class, C19600l.f49788r, C19589j.f49777i);
        aVar.mo51970b();
    }
}
