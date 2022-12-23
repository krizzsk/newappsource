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

public class CarpoolInvitationToRidePayload extends GcmPayload {
    public static final Parcelable.Creator<CarpoolInvitationToRidePayload> CREATOR = new C15905a();

    /* renamed from: d */
    public static final C15906b f41530d = new C15906b();

    /* renamed from: e */
    public static final C15907c f41531e = new C15907c(CarpoolInvitationToRidePayload.class);

    /* renamed from: c */
    public final ServerId f41532c;

    /* renamed from: com.moovit.gcm.payload.CarpoolInvitationToRidePayload$a */
    public class C15905a implements Parcelable.Creator<CarpoolInvitationToRidePayload> {
        public final Object createFromParcel(Parcel parcel) {
            return (CarpoolInvitationToRidePayload) C19612n.m46981v(parcel, CarpoolInvitationToRidePayload.f41531e);
        }

        public final Object[] newArray(int i) {
            return new CarpoolInvitationToRidePayload[i];
        }
    }

    /* renamed from: com.moovit.gcm.payload.CarpoolInvitationToRidePayload$b */
    public class C15906b extends C19621u<CarpoolInvitationToRidePayload> {
        public C15906b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            CarpoolInvitationToRidePayload carpoolInvitationToRidePayload = (CarpoolInvitationToRidePayload) obj;
            qVar.mo51954p(carpoolInvitationToRidePayload.f41546b);
            qVar.mo51939l(carpoolInvitationToRidePayload.f41532c.f15142b);
        }
    }

    /* renamed from: com.moovit.gcm.payload.CarpoolInvitationToRidePayload$c */
    public class C15907c extends C19620t<CarpoolInvitationToRidePayload> {
        public C15907c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new CarpoolInvitationToRidePayload(new ServerId(pVar.mo51924l()), pVar.mo51947p());
        }
    }

    public CarpoolInvitationToRidePayload(ServerId serverId, String str) {
        super(str);
        this.f41532c = serverId;
    }

    /* renamed from: b */
    public final <T> T mo47976b(GcmPayload.C15923a<T> aVar) {
        aVar.mo48010b(this);
        return null;
    }

    /* renamed from: c */
    public final String mo47977c() {
        return "carpool_ride_invite";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41530d);
    }
}
