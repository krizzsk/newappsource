package com.moovit.servicealerts;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class ServiceAlertAffectedLine implements Parcelable {
    public static final Parcelable.Creator<ServiceAlertAffectedLine> CREATOR = new C7617a();

    /* renamed from: e */
    public static final C7618b f23202e = new C7618b();

    /* renamed from: f */
    public static final C7619c f23203f = new C7619c(ServiceAlertAffectedLine.class);

    /* renamed from: b */
    public final String f23204b;

    /* renamed from: c */
    public final Image f23205c;

    /* renamed from: d */
    public final ServerId f23206d;

    /* renamed from: com.moovit.servicealerts.ServiceAlertAffectedLine$a */
    public class C7617a implements Parcelable.Creator<ServiceAlertAffectedLine> {
        public final Object createFromParcel(Parcel parcel) {
            return (ServiceAlertAffectedLine) C19612n.m46981v(parcel, ServiceAlertAffectedLine.f23203f);
        }

        public final Object[] newArray(int i) {
            return new ServiceAlertAffectedLine[i];
        }
    }

    /* renamed from: com.moovit.servicealerts.ServiceAlertAffectedLine$b */
    public class C7618b extends C19621u<ServiceAlertAffectedLine> {
        public C7618b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            ServiceAlertAffectedLine serviceAlertAffectedLine = (ServiceAlertAffectedLine) obj;
            qVar.mo51954p(serviceAlertAffectedLine.f23204b);
            qVar.mo51967q(serviceAlertAffectedLine.f23205c, C16019d.m40803a().f41718d);
            ServerId serverId = serviceAlertAffectedLine.f23206d;
            if (serverId == null) {
                qVar.mo51934b(false);
                return;
            }
            qVar.mo51934b(true);
            qVar.mo51939l(serverId.f15142b);
        }
    }

    /* renamed from: com.moovit.servicealerts.ServiceAlertAffectedLine$c */
    public class C7619c extends C19620t<ServiceAlertAffectedLine> {
        public C7619c(Class cls) {
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
            Image image = (Image) pVar.mo51962q(C16019d.m40803a().f41718d);
            if (!pVar.mo51919b()) {
                serverId = null;
            } else {
                serverId = new ServerId(pVar.mo51924l());
            }
            return new ServiceAlertAffectedLine(image, serverId, p);
        }
    }

    public ServiceAlertAffectedLine(Image image, ServerId serverId, String str) {
        C21100e.m49373x(str, "name");
        this.f23204b = str;
        this.f23205c = image;
        this.f23206d = serverId;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return this.f23204b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23202e);
    }
}
