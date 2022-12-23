package com.moovit.servicealerts;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.database.DbEntityRef;
import com.moovit.network.model.ServerId;
import com.moovit.servicealerts.ServiceStatus;
import com.moovit.transit.TransitAgency;
import com.moovit.util.Text;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import p834tz.C19794a;

public class ServiceAlert implements Parcelable {
    public static final Parcelable.Creator<ServiceAlert> CREATOR = new C7614a();

    /* renamed from: n */
    public static final C7615b f23188n = new C7615b();

    /* renamed from: o */
    public static final C7616c f23189o = new C7616c(ServiceAlert.class);

    /* renamed from: b */
    public final String f23190b;

    /* renamed from: c */
    public final ServiceStatus f23191c;

    /* renamed from: d */
    public final DbEntityRef<TransitAgency> f23192d;

    /* renamed from: e */
    public final List<ServiceAlertAffectedLine> f23193e;

    /* renamed from: f */
    public final Date f23194f;

    /* renamed from: g */
    public final Date f23195g;

    /* renamed from: h */
    public final Date f23196h;

    /* renamed from: i */
    public final String f23197i;

    /* renamed from: j */
    public final Text f23198j;

    /* renamed from: k */
    public final String f23199k;

    /* renamed from: l */
    public final String f23200l;

    /* renamed from: m */
    public final String f23201m;

    /* renamed from: com.moovit.servicealerts.ServiceAlert$a */
    public class C7614a implements Parcelable.Creator<ServiceAlert> {
        public final Object createFromParcel(Parcel parcel) {
            return (ServiceAlert) C19612n.m46981v(parcel, ServiceAlert.f23189o);
        }

        public final Object[] newArray(int i) {
            return new ServiceAlert[i];
        }
    }

    /* renamed from: com.moovit.servicealerts.ServiceAlert$b */
    public class C7615b extends C19621u<ServiceAlert> {
        public C7615b() {
            super(2);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            ServiceAlert serviceAlert = (ServiceAlert) obj;
            qVar.mo51954p(serviceAlert.f23190b);
            qVar.mo51967q(serviceAlert.f23192d, DbEntityRef.AGENCY_REF_CODER);
            ServiceStatus serviceStatus = serviceAlert.f23191c;
            ServiceStatus.C7621b bVar = ServiceStatus.f23211d;
            qVar.mo51939l(0);
            bVar.mo19622a(serviceStatus, qVar);
            qVar.mo51965h(serviceAlert.f23193e, ServiceAlertAffectedLine.f23202e);
            Date date = serviceAlert.f23194f;
            C19794a.C19796b bVar2 = C19794a.f50323a;
            qVar.mo51967q(date, bVar2);
            qVar.mo51967q(serviceAlert.f23195g, bVar2);
            qVar.mo51967q(serviceAlert.f23196h, bVar2);
            qVar.mo51955t(serviceAlert.f23197i);
            qVar.mo51967q(serviceAlert.f23198j, Text.f23874e);
            qVar.mo51955t(serviceAlert.f23199k);
            qVar.mo51955t(serviceAlert.f23200l);
            qVar.mo51955t(serviceAlert.f23201m);
        }
    }

    /* renamed from: com.moovit.servicealerts.ServiceAlert$c */
    public class C7616c extends C19620t<ServiceAlert> {
        public C7616c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i >= 0 && i <= 2;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            String str;
            String str2;
            String p = pVar.mo51947p();
            DbEntityRef dbEntityRef = (DbEntityRef) pVar.mo51962q(DbEntityRef.AGENCY_REF_CODER);
            ServiceStatus serviceStatus = (ServiceStatus) ServiceStatus.f23212e.read(pVar);
            ArrayList g = pVar.mo51959g(ServiceAlertAffectedLine.f23203f);
            C19794a.C19796b bVar = C19794a.f50323a;
            Date date = (Date) pVar.mo51962q(bVar);
            Date date2 = (Date) pVar.mo51962q(bVar);
            Date date3 = (Date) pVar.mo51962q(bVar);
            String t = pVar.mo51948t();
            Text text = (Text) pVar.mo51962q(Text.f23875f);
            String t2 = pVar.mo51948t();
            if (i >= 1) {
                str = pVar.mo51948t();
            } else {
                str = null;
            }
            if (i >= 2) {
                str2 = pVar.mo51948t();
            } else {
                str2 = null;
            }
            return new ServiceAlert(p, serviceStatus, dbEntityRef, g, date, date2, date3, t, text, t2, str, str2);
        }
    }

    public ServiceAlert(String str, ServiceStatus serviceStatus, DbEntityRef dbEntityRef, ArrayList arrayList, Date date, Date date2, Date date3, String str2, Text text, String str3, String str4, String str5) {
        C21100e.m49373x(str, "alertId");
        this.f23190b = str;
        this.f23192d = dbEntityRef;
        C21100e.m49373x(serviceStatus, "serviceStatus");
        this.f23191c = serviceStatus;
        this.f23193e = arrayList;
        this.f23194f = date;
        this.f23195g = date2;
        this.f23196h = date3;
        this.f23197i = str2;
        this.f23198j = text;
        this.f23199k = str3;
        this.f23200l = str4;
        this.f23201m = str5;
    }

    /* renamed from: b */
    public final boolean mo23925b(ServerId serverId) {
        List<ServiceAlertAffectedLine> list = this.f23193e;
        if (list == null) {
            return false;
        }
        for (ServiceAlertAffectedLine serviceAlertAffectedLine : list) {
            if (serverId.equals(serviceAlertAffectedLine.f23206d)) {
                return true;
            }
        }
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23188n);
    }
}
