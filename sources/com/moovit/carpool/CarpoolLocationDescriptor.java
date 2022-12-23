package com.moovit.carpool;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.geo.LatLonE6;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class CarpoolLocationDescriptor implements Parcelable {
    public static final Parcelable.Creator<CarpoolLocationDescriptor> CREATOR = new C15702a();

    /* renamed from: g */
    public static final C15703b f40892g = new C15703b();

    /* renamed from: h */
    public static final C15704c f40893h = new C15704c(CarpoolLocationDescriptor.class);

    /* renamed from: b */
    public final String f40894b;

    /* renamed from: c */
    public final String f40895c;

    /* renamed from: d */
    public final LatLonE6 f40896d;

    /* renamed from: e */
    public final BoxE6 f40897e;

    /* renamed from: f */
    public final CameraDescriptor f40898f;

    /* renamed from: com.moovit.carpool.CarpoolLocationDescriptor$a */
    public class C15702a implements Parcelable.Creator<CarpoolLocationDescriptor> {
        public final Object createFromParcel(Parcel parcel) {
            return (CarpoolLocationDescriptor) C19612n.m46981v(parcel, CarpoolLocationDescriptor.f40893h);
        }

        public final Object[] newArray(int i) {
            return new CarpoolLocationDescriptor[i];
        }
    }

    /* renamed from: com.moovit.carpool.CarpoolLocationDescriptor$b */
    public class C15703b extends C19621u<CarpoolLocationDescriptor> {
        public C15703b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            CarpoolLocationDescriptor carpoolLocationDescriptor = (CarpoolLocationDescriptor) obj;
            qVar.mo51954p(carpoolLocationDescriptor.f40894b);
            qVar.mo51954p(carpoolLocationDescriptor.f40895c);
            LatLonE6.f40978f.write(carpoolLocationDescriptor.f40896d, qVar);
            BoxE6 boxE6 = carpoolLocationDescriptor.f40897e;
            qVar.mo51939l(boxE6.f40964b);
            qVar.mo51939l(boxE6.f40965c);
            qVar.mo51939l(boxE6.f40966d);
            qVar.mo51939l(boxE6.f40967e);
            qVar.mo51967q(carpoolLocationDescriptor.f40898f, CameraDescriptor.f40858e);
        }
    }

    /* renamed from: com.moovit.carpool.CarpoolLocationDescriptor$c */
    public class C15704c extends C19620t<CarpoolLocationDescriptor> {
        public C15704c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new CarpoolLocationDescriptor(pVar.mo51947p(), pVar.mo51947p(), (LatLonE6) LatLonE6.f40979g.read(pVar), new BoxE6(pVar.mo51924l(), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51924l()), (CameraDescriptor) pVar.mo51962q(CameraDescriptor.f40859f));
        }
    }

    public CarpoolLocationDescriptor(String str, String str2, LatLonE6 latLonE6, BoxE6 boxE6, CameraDescriptor cameraDescriptor) {
        C21100e.m49373x(str, "name");
        this.f40894b = str;
        C21100e.m49373x(str2, "address");
        this.f40895c = str2;
        C21100e.m49373x(latLonE6, "coordinates");
        this.f40896d = latLonE6;
        this.f40897e = boxE6;
        this.f40898f = cameraDescriptor;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CarpoolLocationDescriptor)) {
            return false;
        }
        return this.f40896d.equals(((CarpoolLocationDescriptor) obj).f40896d);
    }

    public final int hashCode() {
        return this.f40896d.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40892g);
    }
}
