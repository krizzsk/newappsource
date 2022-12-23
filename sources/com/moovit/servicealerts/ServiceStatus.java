package com.moovit.servicealerts;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.appboy.models.outgoing.TwitterUser;
import java.io.IOException;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class ServiceStatus implements Parcelable {
    public static final Parcelable.Creator<ServiceStatus> CREATOR = new C7620a();

    /* renamed from: d */
    public static final C7621b f23211d = new C7621b();

    /* renamed from: e */
    public static final C7622c f23212e = new C7622c(ServiceStatus.class);

    /* renamed from: b */
    public final ServiceStatusCategory f23213b;

    /* renamed from: c */
    public final String f23214c;

    /* renamed from: com.moovit.servicealerts.ServiceStatus$a */
    public class C7620a implements Parcelable.Creator<ServiceStatus> {
        public final Object createFromParcel(Parcel parcel) {
            return (ServiceStatus) C19612n.m46981v(parcel, ServiceStatus.f23212e);
        }

        public final Object[] newArray(int i) {
            return new ServiceStatus[i];
        }
    }

    /* renamed from: com.moovit.servicealerts.ServiceStatus$b */
    public class C7621b extends C19621u<ServiceStatus> {
        public C7621b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            ServiceStatus serviceStatus = (ServiceStatus) obj;
            ServiceStatusCategory serviceStatusCategory = serviceStatus.f23213b;
            C19584i<ServiceStatusCategory> iVar = ServiceStatusCategory.CODER;
            qVar.getClass();
            iVar.write(serviceStatusCategory, qVar);
            qVar.mo51954p(serviceStatus.f23214c);
        }
    }

    /* renamed from: com.moovit.servicealerts.ServiceStatus$c */
    public class C7622c extends C19620t<ServiceStatus> {
        public C7622c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            C19584i<ServiceStatusCategory> iVar = ServiceStatusCategory.CODER;
            pVar.getClass();
            return new ServiceStatus(iVar.read(pVar), pVar.mo51947p());
        }
    }

    public ServiceStatus(ServiceStatusCategory serviceStatusCategory, String str) {
        C21100e.m49373x(serviceStatusCategory, "category");
        this.f23213b = serviceStatusCategory;
        C21100e.m49373x(str, TwitterUser.DESCRIPTION_KEY);
        this.f23214c = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23211d);
    }
}
