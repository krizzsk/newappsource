package com.moovit.gcm.payload;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.gcm.payload.GcmPayload;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class NearbyPayload extends GcmPayload {
    public static final Parcelable.Creator<NearbyPayload> CREATOR = new C15939a();

    /* renamed from: d */
    public static final C15940b f41564d = new C15940b();

    /* renamed from: e */
    public static final C15941c f41565e = new C15941c(NearbyPayload.class);

    /* renamed from: c */
    public final LatLonE6 f41566c;

    /* renamed from: com.moovit.gcm.payload.NearbyPayload$a */
    public class C15939a implements Parcelable.Creator<NearbyPayload> {
        public final Object createFromParcel(Parcel parcel) {
            return (NearbyPayload) C19612n.m46981v(parcel, NearbyPayload.f41565e);
        }

        public final Object[] newArray(int i) {
            return new NearbyPayload[i];
        }
    }

    /* renamed from: com.moovit.gcm.payload.NearbyPayload$b */
    public class C15940b extends C19621u<NearbyPayload> {
        public C15940b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            NearbyPayload nearbyPayload = (NearbyPayload) obj;
            qVar.mo51954p(nearbyPayload.f41546b);
            qVar.mo51967q(nearbyPayload.f41566c, LatLonE6.f40978f);
        }
    }

    /* renamed from: com.moovit.gcm.payload.NearbyPayload$c */
    public class C15941c extends C19620t<NearbyPayload> {
        public C15941c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new NearbyPayload(pVar.mo51947p(), (LatLonE6) pVar.mo51962q(LatLonE6.f40979g));
        }
    }

    public NearbyPayload(String str, LatLonE6 latLonE6) {
        super(str);
        this.f41566c = latLonE6;
    }

    /* renamed from: b */
    public final <T> T mo47976b(GcmPayload.C15923a<T> aVar) {
        aVar.mo48029t(this);
        return null;
    }

    /* renamed from: c */
    public final String mo47977c() {
        return "near_me";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41564d);
    }
}
