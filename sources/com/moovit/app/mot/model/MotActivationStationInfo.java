package com.moovit.app.mot.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.database.DbEntityRef;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitStop;
import java.io.IOException;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class MotActivationStationInfo implements Parcelable {
    public static final Parcelable.Creator<MotActivationStationInfo> CREATOR = new C15153a();

    /* renamed from: d */
    public static final C15154b f39020d = new C15154b(MotActivationStationInfo.class);

    /* renamed from: b */
    public final DbEntityRef<TransitStop> f39021b;

    /* renamed from: c */
    public final DbEntityRef<TransitStop> f39022c;

    /* renamed from: com.moovit.app.mot.model.MotActivationStationInfo$a */
    public class C15153a implements Parcelable.Creator<MotActivationStationInfo> {
        public final Object createFromParcel(Parcel parcel) {
            return (MotActivationStationInfo) C19612n.m46981v(parcel, MotActivationStationInfo.f39020d);
        }

        public final Object[] newArray(int i) {
            return new MotActivationStationInfo[i];
        }
    }

    /* renamed from: com.moovit.app.mot.model.MotActivationStationInfo$b */
    public class C15154b extends C19619s<MotActivationStationInfo> {
        public C15154b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            C19584i<DbEntityRef<TransitStop>> iVar = DbEntityRef.TRANSIT_STOP_REF_CODER;
            pVar.getClass();
            return new MotActivationStationInfo(iVar.read(pVar), (DbEntityRef) pVar.mo51962q(DbEntityRef.TRANSIT_STOP_REF_CODER));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MotActivationStationInfo motActivationStationInfo = (MotActivationStationInfo) obj;
            DbEntityRef<TransitStop> dbEntityRef = motActivationStationInfo.f39021b;
            C19584i<DbEntityRef<TransitStop>> iVar = DbEntityRef.TRANSIT_STOP_REF_CODER;
            qVar.getClass();
            iVar.write(dbEntityRef, qVar);
            qVar.mo51967q(motActivationStationInfo.f39022c, DbEntityRef.TRANSIT_STOP_REF_CODER);
        }
    }

    public MotActivationStationInfo(DbEntityRef<TransitStop> dbEntityRef, DbEntityRef<TransitStop> dbEntityRef2) {
        C21100e.m49373x(dbEntityRef, "originStopRef");
        this.f39021b = dbEntityRef;
        this.f39022c = dbEntityRef2;
    }

    /* renamed from: b */
    public final TransitStop mo45574b() {
        DbEntityRef<TransitStop> dbEntityRef = this.f39022c;
        if (dbEntityRef != null) {
            return dbEntityRef.get();
        }
        return null;
    }

    /* renamed from: c */
    public final ServerId mo45575c() {
        return this.f39021b.getServerId();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39020d);
    }
}
