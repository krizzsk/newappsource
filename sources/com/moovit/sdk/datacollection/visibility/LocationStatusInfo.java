package com.moovit.sdk.datacollection.visibility;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class LocationStatusInfo implements Parcelable {
    public static final Parcelable.Creator<LocationStatusInfo> CREATOR = new C16448a();

    /* renamed from: e */
    public static final C16449b f42993e = new C16449b();

    /* renamed from: f */
    public static final C16450c f42994f = new C16450c(LocationStatusInfo.class);

    /* renamed from: b */
    public LocationMode f42995b;

    /* renamed from: c */
    public boolean f42996c;

    /* renamed from: d */
    public boolean f42997d;

    /* renamed from: com.moovit.sdk.datacollection.visibility.LocationStatusInfo$a */
    public class C16448a implements Parcelable.Creator<LocationStatusInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return (LocationStatusInfo) C19612n.m46981v(parcel, LocationStatusInfo.f42994f);
        }

        public final Object[] newArray(int i) {
            return new LocationStatusInfo[i];
        }
    }

    /* renamed from: com.moovit.sdk.datacollection.visibility.LocationStatusInfo$b */
    public class C16449b extends C19621u<LocationStatusInfo> {
        public C16449b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            LocationStatusInfo locationStatusInfo = (LocationStatusInfo) obj;
            LocationMode locationMode = locationStatusInfo.f42995b;
            C19584i<LocationMode> iVar = LocationMode.CODER;
            qVar.getClass();
            iVar.write(locationMode, qVar);
            qVar.mo51934b(locationStatusInfo.f42996c);
            qVar.mo51934b(locationStatusInfo.f42997d);
        }
    }

    /* renamed from: com.moovit.sdk.datacollection.visibility.LocationStatusInfo$c */
    public class C16450c extends C19620t<LocationStatusInfo> {
        public C16450c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            C19584i<LocationMode> iVar = LocationMode.CODER;
            pVar.getClass();
            return new LocationStatusInfo(iVar.read(pVar), pVar.mo51919b(), pVar.mo51919b());
        }
    }

    public LocationStatusInfo(LocationMode locationMode, boolean z, boolean z2) {
        this.f42995b = locationMode;
        this.f42996c = z;
        this.f42997d = z2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationStatusInfo)) {
            return false;
        }
        LocationStatusInfo locationStatusInfo = (LocationStatusInfo) obj;
        if (this.f42996c == locationStatusInfo.f42996c && this.f42997d == locationStatusInfo.f42997d && this.f42995b == locationStatusInfo.f42995b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f42995b.hashCode() * 31) + (this.f42996c ? 1 : 0)) * 31) + (this.f42997d ? 1 : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42993e);
    }
}
