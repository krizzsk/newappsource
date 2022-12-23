package com.moovit.util.time;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20975x0;

public class TimeVehicleAttributes implements Parcelable {
    public static final Parcelable.Creator<TimeVehicleAttributes> CREATOR = new C7917a();

    /* renamed from: g */
    public static final C7918b f23917g = new C7918b(TimeVehicleAttributes.class);

    /* renamed from: b */
    public final long f23918b;

    /* renamed from: c */
    public final CongestionLevel f23919c;

    /* renamed from: d */
    public final CongestionSource f23920d;

    /* renamed from: e */
    public final Boolean f23921e;

    /* renamed from: f */
    public final Boolean f23922f;

    /* renamed from: com.moovit.util.time.TimeVehicleAttributes$a */
    public class C7917a implements Parcelable.Creator<TimeVehicleAttributes> {
        public final Object createFromParcel(Parcel parcel) {
            return (TimeVehicleAttributes) C19612n.m46981v(parcel, TimeVehicleAttributes.f23917g);
        }

        public final Object[] newArray(int i) {
            return new TimeVehicleAttributes[i];
        }
    }

    /* renamed from: com.moovit.util.time.TimeVehicleAttributes$b */
    public class C7918b extends C19619s<TimeVehicleAttributes> {
        public C7918b(Class cls) {
            super(2, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 2;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            Boolean bool;
            C19615p pVar2 = pVar;
            int i2 = i;
            Boolean bool2 = null;
            if (i2 == 2) {
                long m = pVar.mo51925m();
                CongestionLevel congestionLevel = (CongestionLevel) pVar2.mo51962q(CongestionLevel.CODER);
                CongestionSource congestionSource = (CongestionSource) pVar2.mo51962q(CongestionSource.CODER);
                if (!pVar.mo51919b()) {
                    bool = null;
                } else {
                    bool = Boolean.valueOf(pVar.mo51919b());
                }
                if (!(!pVar.mo51919b())) {
                    bool2 = Boolean.valueOf(pVar.mo51919b());
                }
                return new TimeVehicleAttributes(m, congestionLevel, congestionSource, bool, bool2);
            } else if (i2 == 1) {
                long m2 = pVar.mo51925m();
                CongestionLevel congestionLevel2 = (CongestionLevel) pVar2.mo51962q(CongestionLevel.CODER);
                CongestionSource congestionSource2 = (CongestionSource) pVar2.mo51962q(CongestionSource.CODER);
                if (!(!pVar.mo51919b())) {
                    bool2 = Boolean.valueOf(pVar.mo51919b());
                }
                return new TimeVehicleAttributes(m2, congestionLevel2, congestionSource2, bool2, (Boolean) null);
            } else {
                long m3 = pVar.mo51925m();
                CongestionLevel congestionLevel3 = (CongestionLevel) pVar2.mo51962q(CongestionLevel.CODER);
                if (!(!pVar.mo51919b())) {
                    bool2 = Boolean.valueOf(pVar.mo51919b());
                }
                return new TimeVehicleAttributes(m3, congestionLevel3, (CongestionSource) null, bool2, (Boolean) null);
            }
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TimeVehicleAttributes timeVehicleAttributes = (TimeVehicleAttributes) obj;
            qVar.mo51940m(timeVehicleAttributes.f23918b);
            qVar.mo51967q(timeVehicleAttributes.f23919c, CongestionLevel.CODER);
            qVar.mo51967q(timeVehicleAttributes.f23920d, CongestionSource.CODER);
            Boolean bool = timeVehicleAttributes.f23921e;
            if (bool == null) {
                qVar.mo51934b(false);
            } else {
                qVar.mo51934b(true);
                qVar.mo51934b(bool.booleanValue());
            }
            Boolean bool2 = timeVehicleAttributes.f23922f;
            if (bool2 == null) {
                qVar.mo51934b(false);
                return;
            }
            qVar.mo51934b(true);
            qVar.mo51934b(bool2.booleanValue());
        }
    }

    public TimeVehicleAttributes(long j, CongestionLevel congestionLevel, CongestionSource congestionSource, Boolean bool, Boolean bool2) {
        this.f23918b = j;
        this.f23919c = congestionLevel;
        this.f23920d = congestionSource;
        this.f23921e = bool;
        this.f23922f = bool2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeVehicleAttributes)) {
            return false;
        }
        TimeVehicleAttributes timeVehicleAttributes = (TimeVehicleAttributes) obj;
        if (this.f23918b != timeVehicleAttributes.f23918b || !C20975x0.m49118e(this.f23919c, timeVehicleAttributes.f23919c) || !C20975x0.m49118e(this.f23920d, timeVehicleAttributes.f23920d) || !C20975x0.m49118e(this.f23921e, timeVehicleAttributes.f23921e) || !C20975x0.m49118e(this.f23922f, timeVehicleAttributes.f23922f)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44334E(this.f23918b), C17884p.m44335F(this.f23919c), C17884p.m44335F(this.f23920d), C17884p.m44335F(this.f23921e), C17884p.m44335F(this.f23922f));
    }

    public final String toString() {
        String str;
        StringBuilder k = C13555b.m33972k("TimeVehicleAttributes{reportTime='");
        k.append(this.f23918b);
        k.append('\'');
        k.append(", congestionLevel=");
        CongestionLevel congestionLevel = this.f23919c;
        String str2 = null;
        if (congestionLevel != null) {
            str = congestionLevel.toString();
        } else {
            str = null;
        }
        k.append(str);
        k.append(", congestionSource=");
        CongestionSource congestionSource = this.f23920d;
        if (congestionSource != null) {
            str2 = congestionSource.toString();
        }
        k.append(str2);
        k.append(", isAccessible=");
        k.append(this.f23921e);
        k.append(", isNfcSupported=");
        k.append(this.f23922f);
        k.append('}');
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23917g);
    }
}
