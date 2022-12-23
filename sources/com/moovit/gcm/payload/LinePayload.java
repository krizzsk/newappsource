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

public class LinePayload extends GcmPayload {
    public static final Parcelable.Creator<LinePayload> CREATOR = new C15930a();

    /* renamed from: f */
    public static final C15931b f41554f = new C15931b();

    /* renamed from: g */
    public static final C15932c f41555g = new C15932c(LinePayload.class);

    /* renamed from: c */
    public final ServerId f41556c;

    /* renamed from: d */
    public final ServerId f41557d;

    /* renamed from: e */
    public ServerId f41558e;

    /* renamed from: com.moovit.gcm.payload.LinePayload$a */
    public class C15930a implements Parcelable.Creator<LinePayload> {
        public final Object createFromParcel(Parcel parcel) {
            return (LinePayload) C19612n.m46981v(parcel, LinePayload.f41555g);
        }

        public final Object[] newArray(int i) {
            return new LinePayload[i];
        }
    }

    /* renamed from: com.moovit.gcm.payload.LinePayload$b */
    public class C15931b extends C19621u<LinePayload> {
        public C15931b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            LinePayload linePayload = (LinePayload) obj;
            qVar.mo51954p(linePayload.f41546b);
            qVar.mo51939l(linePayload.f41556c.f15142b);
            ServerId serverId = linePayload.f41557d;
            if (serverId == null) {
                qVar.mo51934b(false);
            } else {
                qVar.mo51934b(true);
                qVar.mo51939l(serverId.f15142b);
            }
            ServerId serverId2 = linePayload.f41558e;
            if (serverId2 == null) {
                qVar.mo51934b(false);
                return;
            }
            qVar.mo51934b(true);
            qVar.mo51939l(serverId2.f15142b);
        }
    }

    /* renamed from: com.moovit.gcm.payload.LinePayload$c */
    public class C15932c extends C19620t<LinePayload> {
        public C15932c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            ServerId serverId;
            String p = pVar.mo51947p();
            ServerId serverId2 = new ServerId(pVar.mo51924l());
            ServerId serverId3 = null;
            if (!pVar.mo51919b()) {
                serverId = null;
            } else {
                serverId = new ServerId(pVar.mo51924l());
            }
            if (!(!pVar.mo51919b())) {
                serverId3 = new ServerId(pVar.mo51924l());
            }
            return new LinePayload(serverId2, serverId, serverId3, p);
        }
    }

    public LinePayload(ServerId serverId, ServerId serverId2, ServerId serverId3, String str) {
        super(str);
        this.f41556c = serverId;
        this.f41557d = serverId2;
        this.f41558e = serverId3;
    }

    /* renamed from: b */
    public final <T> T mo47976b(GcmPayload.C15923a<T> aVar) {
        aVar.mo48009a(this);
        return null;
    }

    /* renamed from: c */
    public final String mo47977c() {
        return "line";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41554f);
    }
}
