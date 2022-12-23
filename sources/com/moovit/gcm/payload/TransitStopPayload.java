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

public class TransitStopPayload extends GcmPayload {
    public static final Parcelable.Creator<TransitStopPayload> CREATOR = new C15966a();

    /* renamed from: d */
    public static final C15967b f41589d = new C15967b();

    /* renamed from: e */
    public static final C15968c f41590e = new C15968c(TransitStopPayload.class);

    /* renamed from: c */
    public final ServerId f41591c;

    /* renamed from: com.moovit.gcm.payload.TransitStopPayload$a */
    public class C15966a implements Parcelable.Creator<TransitStopPayload> {
        public final Object createFromParcel(Parcel parcel) {
            return (TransitStopPayload) C19612n.m46981v(parcel, TransitStopPayload.f41590e);
        }

        public final Object[] newArray(int i) {
            return new TransitStopPayload[i];
        }
    }

    /* renamed from: com.moovit.gcm.payload.TransitStopPayload$b */
    public class C15967b extends C19621u<TransitStopPayload> {
        public C15967b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            TransitStopPayload transitStopPayload = (TransitStopPayload) obj;
            qVar.mo51954p(transitStopPayload.f41546b);
            qVar.mo51939l(transitStopPayload.f41591c.f15142b);
        }
    }

    /* renamed from: com.moovit.gcm.payload.TransitStopPayload$c */
    public class C15968c extends C19620t<TransitStopPayload> {
        public C15968c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new TransitStopPayload(new ServerId(pVar.mo51924l()), pVar.mo51947p());
        }
    }

    public TransitStopPayload(ServerId serverId, String str) {
        super(str);
        this.f41591c = serverId;
    }

    /* renamed from: b */
    public final <T> T mo47976b(GcmPayload.C15923a<T> aVar) {
        return aVar.mo48023n(this);
    }

    /* renamed from: c */
    public final String mo47977c() {
        return "stop";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41589d);
    }
}
