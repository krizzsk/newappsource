package com.moovit.gcm.payload;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.gcm.payload.GcmPayload;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class TodRidePayload extends GcmPayload {
    public static final Parcelable.Creator<TodRidePayload> CREATOR = new C15963a();

    /* renamed from: d */
    public static final C15964b f41586d = new C15964b();

    /* renamed from: e */
    public static final C15965c f41587e = new C15965c(TodRidePayload.class);

    /* renamed from: c */
    public final String f41588c;

    /* renamed from: com.moovit.gcm.payload.TodRidePayload$a */
    public class C15963a implements Parcelable.Creator<TodRidePayload> {
        public final Object createFromParcel(Parcel parcel) {
            return (TodRidePayload) C19612n.m46981v(parcel, TodRidePayload.f41587e);
        }

        public final Object[] newArray(int i) {
            return new TodRidePayload[i];
        }
    }

    /* renamed from: com.moovit.gcm.payload.TodRidePayload$b */
    public class C15964b extends C19621u<TodRidePayload> {
        public C15964b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            TodRidePayload todRidePayload = (TodRidePayload) obj;
            qVar.mo51954p(todRidePayload.f41546b);
            qVar.mo51954p(todRidePayload.f41588c);
        }
    }

    /* renamed from: com.moovit.gcm.payload.TodRidePayload$c */
    public class C15965c extends C19620t<TodRidePayload> {
        public C15965c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new TodRidePayload(pVar.mo51947p(), pVar.mo51947p());
        }
    }

    public TodRidePayload(String str, String str2) {
        super(str);
        C21100e.m49373x(str2, "rideId");
        this.f41588c = str2;
    }

    /* renamed from: b */
    public final <T> T mo47976b(GcmPayload.C15923a<T> aVar) {
        aVar.mo48012d(this);
        return null;
    }

    /* renamed from: c */
    public final String mo47977c() {
        return "tod_ride";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41586d);
    }
}
