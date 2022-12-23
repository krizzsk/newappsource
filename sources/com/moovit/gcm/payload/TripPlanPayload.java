package com.moovit.gcm.payload;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.gcm.payload.GcmPayload;
import com.moovit.suggestedroutes.TripPlanParams;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class TripPlanPayload extends GcmPayload {
    public static final Parcelable.Creator<TripPlanPayload> CREATOR = new C15972a();

    /* renamed from: e */
    public static final C15973b f41594e = new C15973b();

    /* renamed from: f */
    public static final C15974c f41595f = new C15974c(TripPlanPayload.class);

    /* renamed from: c */
    public final TripPlanParams f41596c;

    /* renamed from: d */
    public final boolean f41597d;

    /* renamed from: com.moovit.gcm.payload.TripPlanPayload$a */
    public class C15972a implements Parcelable.Creator<TripPlanPayload> {
        public final Object createFromParcel(Parcel parcel) {
            return (TripPlanPayload) C19612n.m46981v(parcel, TripPlanPayload.f41595f);
        }

        public final Object[] newArray(int i) {
            return new TripPlanPayload[i];
        }
    }

    /* renamed from: com.moovit.gcm.payload.TripPlanPayload$b */
    public class C15973b extends C19621u<TripPlanPayload> {
        public C15973b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            TripPlanPayload tripPlanPayload = (TripPlanPayload) obj;
            qVar.mo51954p(tripPlanPayload.f41546b);
            TripPlanParams tripPlanParams = tripPlanPayload.f41596c;
            TripPlanParams.C7624b bVar = TripPlanParams.f23216h;
            qVar.mo51939l(3);
            bVar.mo19622a(tripPlanParams, qVar);
            qVar.mo51934b(tripPlanPayload.f41597d);
        }
    }

    /* renamed from: com.moovit.gcm.payload.TripPlanPayload$c */
    public class C15974c extends C19620t<TripPlanPayload> {
        public C15974c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new TripPlanPayload(pVar.mo51947p(), (TripPlanParams) TripPlanParams.f23217i.read(pVar), pVar.mo51919b());
        }
    }

    public TripPlanPayload(String str, TripPlanParams tripPlanParams, boolean z) {
        super(str);
        C21100e.m49373x(tripPlanParams, "params");
        this.f41596c = tripPlanParams;
        this.f41597d = z;
    }

    /* renamed from: b */
    public final <T> T mo47976b(GcmPayload.C15923a<T> aVar) {
        return aVar.mo48014f(this);
    }

    /* renamed from: c */
    public final String mo47977c() {
        return "trip_plan";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41594e);
    }
}
