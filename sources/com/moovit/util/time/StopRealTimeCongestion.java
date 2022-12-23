package com.moovit.util.time;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20975x0;

public class StopRealTimeCongestion implements Parcelable {
    public static final Parcelable.Creator<StopRealTimeCongestion> CREATOR = new C7908a();

    /* renamed from: f */
    public static final C7909b f23892f = new C7909b(StopRealTimeCongestion.class);

    /* renamed from: b */
    public final CongestionLevel f23893b;

    /* renamed from: c */
    public final CongestionSource f23894c;

    /* renamed from: d */
    public final long f23895d;

    /* renamed from: e */
    public final String f23896e;

    /* renamed from: com.moovit.util.time.StopRealTimeCongestion$a */
    public class C7908a implements Parcelable.Creator<StopRealTimeCongestion> {
        public final Object createFromParcel(Parcel parcel) {
            return (StopRealTimeCongestion) C19612n.m46981v(parcel, StopRealTimeCongestion.f23892f);
        }

        public final Object[] newArray(int i) {
            return new StopRealTimeCongestion[i];
        }
    }

    /* renamed from: com.moovit.util.time.StopRealTimeCongestion$b */
    public class C7909b extends C19619s<StopRealTimeCongestion> {
        public C7909b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            C19584i<CongestionLevel> iVar = CongestionLevel.CODER;
            pVar.getClass();
            return new StopRealTimeCongestion(iVar.read(pVar), CongestionSource.CODER.read(pVar), pVar.mo51925m(), pVar.mo51948t());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            StopRealTimeCongestion stopRealTimeCongestion = (StopRealTimeCongestion) obj;
            CongestionLevel congestionLevel = stopRealTimeCongestion.f23893b;
            C19584i<CongestionLevel> iVar = CongestionLevel.CODER;
            qVar.getClass();
            iVar.write(congestionLevel, qVar);
            CongestionSource.CODER.write(stopRealTimeCongestion.f23894c, qVar);
            qVar.mo51940m(stopRealTimeCongestion.f23895d);
            qVar.mo51955t(stopRealTimeCongestion.f23896e);
        }
    }

    public StopRealTimeCongestion(CongestionLevel congestionLevel, CongestionSource congestionSource, long j, String str) {
        C21100e.m49373x(congestionLevel, "congestionLevel");
        this.f23893b = congestionLevel;
        C21100e.m49373x(congestionSource, "congestionSource");
        this.f23894c = congestionSource;
        this.f23895d = j;
        this.f23896e = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StopRealTimeCongestion)) {
            return false;
        }
        StopRealTimeCongestion stopRealTimeCongestion = (StopRealTimeCongestion) obj;
        if (this.f23893b == stopRealTimeCongestion.f23893b && this.f23894c == stopRealTimeCongestion.f23894c && this.f23895d == stopRealTimeCongestion.f23895d && C20975x0.m49118e(this.f23896e, stopRealTimeCongestion.f23896e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f23893b), C17884p.m44335F(this.f23894c), C17884p.m44334E(this.f23895d), C17884p.m44335F(this.f23896e));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23892f);
    }
}
