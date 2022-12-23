package com.moovit.gcm.payload;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.gcm.payload.GcmPayload;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class TransportationMapsPayload extends GcmPayload {
    public static final Parcelable.Creator<TransportationMapsPayload> CREATOR = new C15969a();

    /* renamed from: c */
    public static final C15970b f41592c = new C15970b();

    /* renamed from: d */
    public static final C15971c f41593d = new C15971c(TransportationMapsPayload.class);

    /* renamed from: com.moovit.gcm.payload.TransportationMapsPayload$a */
    public class C15969a implements Parcelable.Creator<TransportationMapsPayload> {
        public final Object createFromParcel(Parcel parcel) {
            return (TransportationMapsPayload) C19612n.m46981v(parcel, TransportationMapsPayload.f41593d);
        }

        public final Object[] newArray(int i) {
            return new TransportationMapsPayload[i];
        }
    }

    /* renamed from: com.moovit.gcm.payload.TransportationMapsPayload$b */
    public class C15970b extends C19621u<TransportationMapsPayload> {
        public C15970b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            qVar.mo51954p(((TransportationMapsPayload) obj).f41546b);
        }
    }

    /* renamed from: com.moovit.gcm.payload.TransportationMapsPayload$c */
    public class C15971c extends C19620t<TransportationMapsPayload> {
        public C15971c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new TransportationMapsPayload(pVar.mo51947p());
        }
    }

    public TransportationMapsPayload(String str) {
        super(str);
    }

    /* renamed from: b */
    public final <T> T mo47976b(GcmPayload.C15923a<T> aVar) {
        aVar.mo48026q(this);
        return null;
    }

    /* renamed from: c */
    public final String mo47977c() {
        return "transportation_maps";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41592c);
    }
}
