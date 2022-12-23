package com.moovit.transit;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.database.DbEntityRef;
import java.io.IOException;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class TransitStopPlatform implements Parcelable {
    public static final Parcelable.Creator<TransitStopPlatform> CREATOR = new C7832a();

    /* renamed from: d */
    public static final C7833b f23752d = new C7833b();

    /* renamed from: e */
    public static final C7834c f23753e = new C7834c(TransitStopPlatform.class);

    /* renamed from: b */
    public final String f23754b;

    /* renamed from: c */
    public final List<DbEntityRef<TransitLine>> f23755c;

    /* renamed from: com.moovit.transit.TransitStopPlatform$a */
    public class C7832a implements Parcelable.Creator<TransitStopPlatform> {
        public final Object createFromParcel(Parcel parcel) {
            return (TransitStopPlatform) C19612n.m46981v(parcel, TransitStopPlatform.f23753e);
        }

        public final Object[] newArray(int i) {
            return new TransitStopPlatform[i];
        }
    }

    /* renamed from: com.moovit.transit.TransitStopPlatform$b */
    public class C7833b extends C19621u<TransitStopPlatform> {
        public C7833b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            TransitStopPlatform transitStopPlatform = (TransitStopPlatform) obj;
            qVar.mo51954p(transitStopPlatform.f23754b);
            qVar.mo51965h(transitStopPlatform.f23755c, DbEntityRef.TRANSIT_LINE_REF_CODER);
        }
    }

    /* renamed from: com.moovit.transit.TransitStopPlatform$c */
    public class C7834c extends C19620t<TransitStopPlatform> {
        public C7834c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new TransitStopPlatform(pVar.mo51947p(), pVar.mo51959g(DbEntityRef.TRANSIT_LINE_REF_CODER));
        }
    }

    public TransitStopPlatform(String str, List<DbEntityRef<TransitLine>> list) {
        C21100e.m49373x(str, "name");
        this.f23754b = str;
        C21100e.m49373x(list, "lineRefs");
        this.f23755c = list;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TransitStopPlatform)) {
            return false;
        }
        return this.f23754b.equals(((TransitStopPlatform) obj).f23754b);
    }

    public final int hashCode() {
        return this.f23754b.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23752d);
    }
}
