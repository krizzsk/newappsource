package com.moovit.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import p358af.C13437d;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class GeofenceMetadata implements Parcelable {
    public static final Parcelable.Creator<GeofenceMetadata> CREATOR = new C4201a();

    /* renamed from: k */
    public static final C4202b f15022k = new C4202b();

    /* renamed from: l */
    public static final C4203c f15023l = new C4203c(GeofenceMetadata.class);

    /* renamed from: b */
    public final ArrivalState f15024b;

    /* renamed from: c */
    public final boolean f15025c;

    /* renamed from: d */
    public final int f15026d;

    /* renamed from: e */
    public int f15027e;

    /* renamed from: f */
    public final boolean f15028f;

    /* renamed from: g */
    public final int f15029g;

    /* renamed from: h */
    public final int f15030h;

    /* renamed from: i */
    public final int f15031i;

    /* renamed from: j */
    public final int f15032j;

    /* renamed from: com.moovit.navigation.GeofenceMetadata$a */
    public class C4201a implements Parcelable.Creator<GeofenceMetadata> {
        public final Object createFromParcel(Parcel parcel) {
            return (GeofenceMetadata) C19612n.m46981v(parcel, GeofenceMetadata.f15023l);
        }

        public final Object[] newArray(int i) {
            return new GeofenceMetadata[i];
        }
    }

    /* renamed from: com.moovit.navigation.GeofenceMetadata$b */
    public class C4202b extends C19621u<GeofenceMetadata> {
        public C4202b() {
            super(2);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            GeofenceMetadata geofenceMetadata = (GeofenceMetadata) obj;
            qVar.mo51967q(geofenceMetadata.f15024b, ArrivalState.CODER);
            qVar.mo51934b(geofenceMetadata.f15025c);
            qVar.mo51939l(geofenceMetadata.f15026d);
            qVar.mo51939l(geofenceMetadata.f15027e);
            qVar.mo51934b(geofenceMetadata.f15028f);
            qVar.mo51939l(geofenceMetadata.f15029g);
            qVar.mo51939l(geofenceMetadata.f15030h);
            qVar.mo51939l(geofenceMetadata.f15031i);
            qVar.mo51939l(geofenceMetadata.f15032j);
        }
    }

    /* renamed from: com.moovit.navigation.GeofenceMetadata$c */
    public class C4203c extends C19620t<GeofenceMetadata> {
        public C4203c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i <= 2;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            boolean z;
            int i2;
            ArrivalState arrivalState = (ArrivalState) pVar.mo51962q(ArrivalState.CODER);
            boolean b = pVar.mo51919b();
            int l = pVar.mo51924l();
            int l2 = pVar.mo51924l();
            if (i <= 1 || !pVar.mo51919b()) {
                z = false;
            } else {
                z = true;
            }
            int l3 = pVar.mo51924l();
            int l4 = pVar.mo51924l();
            int l5 = pVar.mo51924l();
            if (i == 0) {
                i2 = (int) TimeUnit.HOURS.toSeconds(1);
            } else {
                i2 = pVar.mo51924l();
            }
            return new GeofenceMetadata(arrivalState, b, l, l2, z, l3, l4, l5, i2);
        }
    }

    public GeofenceMetadata(ArrivalState arrivalState, boolean z, int i, int i2, boolean z2, int i3, int i4, int i5, int i6) {
        C21100e.m49373x(arrivalState, "arrivalState");
        this.f15024b = arrivalState;
        this.f15025c = z;
        C21100e.m49359q(i, "distToDest");
        this.f15026d = i;
        C21100e.m49359q(i2, "timeToDest");
        this.f15027e = i2;
        this.f15028f = z2;
        this.f15029g = i3;
        this.f15030h = i4;
        this.f15031i = i5;
        C21100e.m49359q(i6, "expirationFromEtaSeconds");
        this.f15032j = i6;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("GeofenceMetadata[arrivalState: ");
        k.append(this.f15024b);
        k.append(" dist: ");
        k.append(this.f15026d);
        k.append("m, ETA: ");
        k.append(this.f15027e);
        k.append("s  nextStopIndex: ");
        return C13437d.m33707l(k, this.f15029g, "]");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f15022k);
    }
}
