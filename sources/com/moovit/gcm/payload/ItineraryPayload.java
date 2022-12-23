package com.moovit.gcm.payload;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.gcm.payload.GcmPayload;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class ItineraryPayload extends GcmPayload {
    public static final Parcelable.Creator<ItineraryPayload> CREATOR = new C15927a();

    /* renamed from: f */
    public static final C15928b f41549f = new C15928b();

    /* renamed from: g */
    public static final C15929c f41550g = new C15929c(ItineraryPayload.class);

    /* renamed from: c */
    public final String f41551c;

    /* renamed from: d */
    public final ServerId f41552d;

    /* renamed from: e */
    public final int f41553e;

    /* renamed from: com.moovit.gcm.payload.ItineraryPayload$a */
    public class C15927a implements Parcelable.Creator<ItineraryPayload> {
        public final Object createFromParcel(Parcel parcel) {
            return (ItineraryPayload) C19612n.m46981v(parcel, ItineraryPayload.f41550g);
        }

        public final Object[] newArray(int i) {
            return new ItineraryPayload[i];
        }
    }

    /* renamed from: com.moovit.gcm.payload.ItineraryPayload$b */
    public class C15928b extends C19621u<ItineraryPayload> {
        public C15928b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            ItineraryPayload itineraryPayload = (ItineraryPayload) obj;
            qVar.mo51954p(itineraryPayload.f41546b);
            qVar.mo51954p(itineraryPayload.f41551c);
            qVar.mo51939l(itineraryPayload.f41552d.f15142b);
            qVar.mo51939l(itineraryPayload.f41553e);
        }
    }

    /* renamed from: com.moovit.gcm.payload.ItineraryPayload$c */
    public class C15929c extends C19620t<ItineraryPayload> {
        public C15929c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new ItineraryPayload(pVar.mo51947p(), pVar.mo51947p(), new ServerId(pVar.mo51924l()), pVar.mo51924l());
        }
    }

    public ItineraryPayload(String str, String str2, ServerId serverId, int i) {
        super(str);
        C21100e.m49373x(str2, "guid");
        this.f41551c = str2;
        this.f41552d = serverId;
        C21100e.m49359q(i, "initialIndex");
        this.f41553e = i;
    }

    /* renamed from: b */
    public final <T> T mo47976b(GcmPayload.C15923a<T> aVar) {
        aVar.mo48013e(this);
        return null;
    }

    /* renamed from: c */
    public final String mo47977c() {
        return "itinerary";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41549f);
    }
}
