package com.moovit.app.mot.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.appsflyer.ServerParameters;
import com.moovit.database.DbEntityRef;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitAgency;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19577c;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class MotActivation implements Parcelable {
    public static final Parcelable.Creator<MotActivation> CREATOR = new C15141a();

    /* renamed from: r */
    public static final C15142b f38984r = new C15142b(MotActivation.class);

    /* renamed from: b */
    public final ServerId f38985b;

    /* renamed from: c */
    public final String f38986c;

    /* renamed from: d */
    public final String f38987d;

    /* renamed from: e */
    public final String f38988e;

    /* renamed from: f */
    public final String f38989f;

    /* renamed from: g */
    public final Status f38990g;

    /* renamed from: h */
    public final Image f38991h;

    /* renamed from: i */
    public final String f38992i;

    /* renamed from: j */
    public final DbEntityRef<TransitAgency> f38993j;

    /* renamed from: k */
    public final ActivationType f38994k;

    /* renamed from: l */
    public final MotActivationPrice f38995l;

    /* renamed from: m */
    public final MotActivationFareInfo f38996m;

    /* renamed from: n */
    public final MotActivationStationInfo f38997n;

    /* renamed from: o */
    public final long f38998o;

    /* renamed from: p */
    public final long f38999p;

    /* renamed from: q */
    public final boolean f39000q;

    public enum ActivationType implements Parcelable {
        DEPARTURE,
        ENTRANCE_ONLY,
        ENTRANCE_AND_EXIT;
        
        public static final C19577c<ActivationType> CODER = null;
        public static final Parcelable.Creator<ActivationType> CREATOR = null;

        /* renamed from: com.moovit.app.mot.model.MotActivation$ActivationType$a */
        public class C15139a implements Parcelable.Creator<ActivationType> {
            public final Object createFromParcel(Parcel parcel) {
                return (ActivationType) C19612n.m46981v(parcel, ActivationType.CODER);
            }

            public final Object[] newArray(int i) {
                return new ActivationType[i];
            }
        }

        /* access modifiers changed from: public */
        static {
            ActivationType activationType;
            ActivationType activationType2;
            ActivationType activationType3;
            CODER = new C19577c<>(ActivationType.class, activationType, activationType2, activationType3);
            CREATOR = new C15139a();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C19613o.m46994v(parcel, this, CODER);
        }
    }

    public enum Status implements Parcelable {
        ACTIVE,
        COMPLETED,
        HISTORICAL;
        
        public static final C19577c<Status> CODER = null;
        public static final Parcelable.Creator<Status> CREATOR = null;

        /* renamed from: com.moovit.app.mot.model.MotActivation$Status$a */
        public class C15140a implements Parcelable.Creator<Status> {
            public final Object createFromParcel(Parcel parcel) {
                return (Status) C19612n.m46981v(parcel, Status.CODER);
            }

            public final Object[] newArray(int i) {
                return new Status[i];
            }
        }

        /* access modifiers changed from: public */
        static {
            Status status;
            Status status2;
            Status status3;
            CREATOR = new C15140a();
            CODER = new C19577c<>(Status.class, status, status2, status3);
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C19613o.m46994v(parcel, this, CODER);
        }
    }

    /* renamed from: com.moovit.app.mot.model.MotActivation$a */
    public class C15141a implements Parcelable.Creator<MotActivation> {
        public final Object createFromParcel(Parcel parcel) {
            return (MotActivation) C19612n.m46981v(parcel, MotActivation.f38984r);
        }

        public final Object[] newArray(int i) {
            return new MotActivation[i];
        }
    }

    /* renamed from: com.moovit.app.mot.model.MotActivation$b */
    public class C15142b extends C19619s<MotActivation> {
        public C15142b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            C19615p pVar2 = pVar;
            pVar.getClass();
            ServerId serverId = r2;
            ServerId serverId2 = new ServerId(pVar.mo51924l());
            return new MotActivation(serverId, pVar.mo51947p(), pVar.mo51947p(), pVar.mo51947p(), pVar.mo51947p(), (Status) C13555b.m33968g(Status.CODER, pVar2), (Image) pVar2.mo51962q(C16019d.m40803a().f41718d), pVar.mo51948t(), (DbEntityRef) pVar2.mo51962q(DbEntityRef.AGENCY_REF_CODER), (ActivationType) pVar2.mo51962q(ActivationType.CODER), (MotActivationPrice) pVar2.mo51962q(MotActivationPrice.f39004e), (MotActivationFareInfo) pVar2.mo51962q(MotActivationFareInfo.f39001d), (MotActivationStationInfo) pVar2.mo51962q(MotActivationStationInfo.f39020d), pVar.mo51925m(), pVar.mo51925m(), pVar.mo51919b());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            MotActivation motActivation = (MotActivation) obj;
            ServerId serverId = motActivation.f38985b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51954p(motActivation.f38986c);
            qVar.mo51954p(motActivation.f38987d);
            qVar.mo51954p(motActivation.f38988e);
            qVar.mo51954p(motActivation.f38989f);
            Status.CODER.write(motActivation.f38990g, qVar);
            qVar.mo51967q(motActivation.f38991h, C16019d.m40803a().f41718d);
            qVar.mo51955t(motActivation.f38992i);
            qVar.mo51967q(motActivation.f38993j, DbEntityRef.AGENCY_REF_CODER);
            qVar.mo51967q(motActivation.f38994k, ActivationType.CODER);
            qVar.mo51967q(motActivation.f38995l, MotActivationPrice.f39004e);
            qVar.mo51967q(motActivation.f38996m, MotActivationFareInfo.f39001d);
            qVar.mo51967q(motActivation.f38997n, MotActivationStationInfo.f39020d);
            qVar.mo51940m(motActivation.f38998o);
            qVar.mo51940m(motActivation.f38999p);
            qVar.mo51934b(motActivation.f39000q);
        }
    }

    public MotActivation(ServerId serverId, String str, String str2, String str3, String str4, Status status, Image image, String str5, DbEntityRef<TransitAgency> dbEntityRef, ActivationType activationType, MotActivationPrice motActivationPrice, MotActivationFareInfo motActivationFareInfo, MotActivationStationInfo motActivationStationInfo, long j, long j2, boolean z) {
        ActivationType activationType2 = activationType;
        this.f38985b = serverId;
        C21100e.m49373x(str, "activationTitle");
        this.f38986c = str;
        C21100e.m49373x(str2, "profileName");
        this.f38987d = str2;
        C21100e.m49373x(str3, "agencyName");
        this.f38988e = str3;
        C21100e.m49373x(str4, "priceReference");
        this.f38989f = str4;
        C21100e.m49373x(status, ServerParameters.STATUS);
        this.f38990g = status;
        this.f38991h = image;
        this.f38992i = str5;
        this.f38993j = dbEntityRef;
        C21100e.m49373x(activationType2, "activationType");
        this.f38994k = activationType2;
        this.f38995l = motActivationPrice;
        this.f38996m = motActivationFareInfo;
        this.f38997n = motActivationStationInfo;
        this.f38998o = j;
        this.f38999p = j2;
        this.f39000q = z;
    }

    /* renamed from: b */
    public final TransitAgency mo45524b() {
        DbEntityRef<TransitAgency> dbEntityRef = this.f38993j;
        if (dbEntityRef != null) {
            return dbEntityRef.get();
        }
        return null;
    }

    /* renamed from: c */
    public final Image mo45525c() {
        TransitAgency b = mo45524b();
        if (b != null) {
            return b.f23675e;
        }
        return null;
    }

    /* renamed from: d */
    public final ServerId mo45526d() {
        DbEntityRef<TransitAgency> dbEntityRef = this.f38993j;
        if (dbEntityRef != null) {
            return dbEntityRef.getServerId();
        }
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MotActivation)) {
            return false;
        }
        MotActivation motActivation = (MotActivation) obj;
        if (!this.f38985b.equals(motActivation.f38985b) || !this.f38989f.equals(motActivation.f38989f)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final String mo45529f() {
        TransitAgency b = mo45524b();
        if (b != null) {
            return b.f23673c;
        }
        return this.f38988e;
    }

    public final int hashCode() {
        return C17884p.m44333D(this.f38985b.f15142b, this.f38989f.hashCode());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f38984r);
    }
}
