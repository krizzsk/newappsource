package com.moovit.servicealerts;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.appsflyer.ServerParameters;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.servicealerts.ServiceAlertAffectedLine;
import com.moovit.servicealerts.ServiceStatus;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class LineServiceAlertDigest implements Parcelable {
    public static final Parcelable.Creator<LineServiceAlertDigest> CREATOR = new C7611a();

    /* renamed from: e */
    public static final C7612b f23183e = new C7612b();

    /* renamed from: f */
    public static final C7613c f23184f = new C7613c(LineServiceAlertDigest.class);

    /* renamed from: b */
    public final ServiceAlertAffectedLine f23185b;

    /* renamed from: c */
    public final ServiceStatus f23186c;

    /* renamed from: d */
    public final List<String> f23187d;

    /* renamed from: com.moovit.servicealerts.LineServiceAlertDigest$a */
    public class C7611a implements Parcelable.Creator<LineServiceAlertDigest> {
        public final Object createFromParcel(Parcel parcel) {
            return (LineServiceAlertDigest) C19612n.m46981v(parcel, LineServiceAlertDigest.f23184f);
        }

        public final Object[] newArray(int i) {
            return new LineServiceAlertDigest[i];
        }
    }

    /* renamed from: com.moovit.servicealerts.LineServiceAlertDigest$b */
    public class C7612b extends C19621u<LineServiceAlertDigest> {
        public C7612b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            LineServiceAlertDigest lineServiceAlertDigest = (LineServiceAlertDigest) obj;
            ServiceAlertAffectedLine serviceAlertAffectedLine = lineServiceAlertDigest.f23185b;
            ServiceAlertAffectedLine.C7618b bVar = ServiceAlertAffectedLine.f23202e;
            qVar.getClass();
            qVar.mo51939l(0);
            bVar.mo19622a(serviceAlertAffectedLine, qVar);
            ServiceStatus serviceStatus = lineServiceAlertDigest.f23186c;
            ServiceStatus.C7621b bVar2 = ServiceStatus.f23211d;
            qVar.mo51939l(0);
            bVar2.mo19622a(serviceStatus, qVar);
            List<String> list = lineServiceAlertDigest.f23187d;
            if (list == null) {
                qVar.mo51939l(-1);
                return;
            }
            qVar.mo51939l(list.size());
            for (String t : list) {
                qVar.mo51955t(t);
            }
        }
    }

    /* renamed from: com.moovit.servicealerts.LineServiceAlertDigest$c */
    public class C7613c extends C19620t<LineServiceAlertDigest> {
        public C7613c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            ArrayList arrayList;
            ServiceAlertAffectedLine.C7619c cVar = ServiceAlertAffectedLine.f23203f;
            pVar.getClass();
            ServiceAlertAffectedLine serviceAlertAffectedLine = (ServiceAlertAffectedLine) cVar.read(pVar);
            ServiceStatus serviceStatus = (ServiceStatus) ServiceStatus.f23212e.read(pVar);
            int l = pVar.mo51924l();
            if (l == -1) {
                arrayList = null;
            } else {
                ArrayList arrayList2 = new ArrayList(l);
                for (int i2 = 0; i2 < l; i2++) {
                    arrayList2.add(pVar.mo51948t());
                }
                arrayList = arrayList2;
            }
            return new LineServiceAlertDigest(serviceAlertAffectedLine, serviceStatus, arrayList);
        }
    }

    public LineServiceAlertDigest(ServiceAlertAffectedLine serviceAlertAffectedLine, ServiceStatus serviceStatus, List<String> list) {
        C21100e.m49373x(serviceAlertAffectedLine, "affectedLine");
        this.f23185b = serviceAlertAffectedLine;
        C21100e.m49373x(serviceStatus, ServerParameters.STATUS);
        this.f23186c = serviceStatus;
        C21100e.m49373x(list, "alertIds");
        this.f23187d = Collections.unmodifiableList(list);
        if (list.isEmpty()) {
            throw new ApplicationBugException("alertIds may not be empty!");
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23183e);
    }
}
