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

public class EventInstancePayload extends GcmPayload {
    public static final Parcelable.Creator<EventInstancePayload> CREATOR = new C15911a();

    /* renamed from: e */
    public static final C15912b f41536e = new C15912b();

    /* renamed from: f */
    public static final C15913c f41537f = new C15913c(EventInstancePayload.class);

    /* renamed from: c */
    public final ServerId f41538c;

    /* renamed from: d */
    public final ServerId f41539d;

    /* renamed from: com.moovit.gcm.payload.EventInstancePayload$a */
    public class C15911a implements Parcelable.Creator<EventInstancePayload> {
        public final Object createFromParcel(Parcel parcel) {
            return (EventInstancePayload) C19612n.m46981v(parcel, EventInstancePayload.f41537f);
        }

        public final Object[] newArray(int i) {
            return new EventInstancePayload[i];
        }
    }

    /* renamed from: com.moovit.gcm.payload.EventInstancePayload$b */
    public class C15912b extends C19621u<EventInstancePayload> {
        public C15912b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            EventInstancePayload eventInstancePayload = (EventInstancePayload) obj;
            qVar.mo51954p(eventInstancePayload.f41546b);
            qVar.mo51939l(eventInstancePayload.f41538c.f15142b);
            qVar.mo51939l(eventInstancePayload.f41539d.f15142b);
        }
    }

    /* renamed from: com.moovit.gcm.payload.EventInstancePayload$c */
    public class C15913c extends C19620t<EventInstancePayload> {
        public C15913c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new EventInstancePayload(pVar.mo51947p(), new ServerId(pVar.mo51924l()), new ServerId(pVar.mo51924l()));
        }
    }

    public EventInstancePayload(String str, ServerId serverId, ServerId serverId2) {
        super(str);
        this.f41538c = serverId;
        this.f41539d = serverId2;
    }

    /* renamed from: b */
    public final <T> T mo47976b(GcmPayload.C15923a<T> aVar) {
        aVar.mo48022m(this);
        return null;
    }

    /* renamed from: c */
    public final String mo47977c() {
        return "ride_sharing_event";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41536e);
    }
}
