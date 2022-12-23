package com.moovit.gcm.payload;

import android.os.Parcel;
import android.os.Parcelable;
import com.moovit.gcm.payload.GcmPayload;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class CarpoolRidePayload extends GcmPayload {
    public static final Parcelable.Creator<CarpoolRidePayload> CREATOR = new C15908a();

    /* renamed from: d */
    public static final C15909b f41533d = new C15909b();

    /* renamed from: e */
    public static final C15910c f41534e = new C15910c(CarpoolRidePayload.class);

    /* renamed from: c */
    public final ServerId f41535c;

    /* renamed from: com.moovit.gcm.payload.CarpoolRidePayload$a */
    public class C15908a implements Parcelable.Creator<CarpoolRidePayload> {
        public final Object createFromParcel(Parcel parcel) {
            return (CarpoolRidePayload) C19612n.m46981v(parcel, CarpoolRidePayload.f41534e);
        }

        public final Object[] newArray(int i) {
            return new CarpoolRidePayload[i];
        }
    }

    /* renamed from: com.moovit.gcm.payload.CarpoolRidePayload$b */
    public class C15909b extends C19621u<CarpoolRidePayload> {
        public C15909b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            CarpoolRidePayload carpoolRidePayload = (CarpoolRidePayload) obj;
            qVar.mo51954p(carpoolRidePayload.f41546b);
            qVar.mo51939l(carpoolRidePayload.f41535c.f15142b);
        }
    }

    /* renamed from: com.moovit.gcm.payload.CarpoolRidePayload$c */
    public class C15910c extends C19620t<CarpoolRidePayload> {
        public C15910c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new CarpoolRidePayload(new ServerId(pVar.mo51924l()), pVar.mo51947p());
        }
    }

    public CarpoolRidePayload(ServerId serverId, String str) {
        super(str);
        this.f41535c = serverId;
    }

    /* renamed from: b */
    public final <T> T mo47976b(GcmPayload.C15923a<T> aVar) {
        aVar.mo48008A(this);
        return null;
    }

    /* renamed from: c */
    public final String mo47977c() {
        return "carpool_ride";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41533d);
    }
}
