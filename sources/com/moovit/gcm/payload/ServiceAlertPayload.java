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

public class ServiceAlertPayload extends GcmPayload {
    public static final Parcelable.Creator<ServiceAlertPayload> CREATOR = new C15951a();

    /* renamed from: d */
    public static final C15952b f41573d = new C15952b();

    /* renamed from: e */
    public static final C15953c f41574e = new C15953c(ServiceAlertPayload.class);

    /* renamed from: c */
    public final String f41575c;

    /* renamed from: com.moovit.gcm.payload.ServiceAlertPayload$a */
    public class C15951a implements Parcelable.Creator<ServiceAlertPayload> {
        public final Object createFromParcel(Parcel parcel) {
            return (ServiceAlertPayload) C19612n.m46981v(parcel, ServiceAlertPayload.f41574e);
        }

        public final Object[] newArray(int i) {
            return new ServiceAlertPayload[i];
        }
    }

    /* renamed from: com.moovit.gcm.payload.ServiceAlertPayload$b */
    public class C15952b extends C19621u<ServiceAlertPayload> {
        public C15952b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            ServiceAlertPayload serviceAlertPayload = (ServiceAlertPayload) obj;
            qVar.mo51954p(serviceAlertPayload.f41546b);
            qVar.mo51954p(serviceAlertPayload.f41575c);
        }
    }

    /* renamed from: com.moovit.gcm.payload.ServiceAlertPayload$c */
    public class C15953c extends C19620t<ServiceAlertPayload> {
        public C15953c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            return new ServiceAlertPayload(pVar.mo51947p(), pVar.mo51947p());
        }
    }

    public ServiceAlertPayload(String str, String str2) {
        super(str);
        C21100e.m49373x(str2, "alertId");
        this.f41575c = str2;
    }

    /* renamed from: b */
    public final <T> T mo47976b(GcmPayload.C15923a<T> aVar) {
        return aVar.mo48034y(this);
    }

    /* renamed from: c */
    public final String mo47977c() {
        return "service_alert";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f41573d);
    }
}
