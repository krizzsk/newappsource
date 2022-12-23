package com.moovit.app.tod.shuttle.model;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.app.tod.shuttle.model.TodShuttlePattern;
import com.moovit.app.tod.shuttle.model.TodShuttleSchedule;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TodShuttleTrip implements Parcelable {
    public static final Parcelable.Creator<TodShuttleTrip> CREATOR = new C15562a();

    /* renamed from: g */
    public static final C15563b f40430g = new C15563b(TodShuttleTrip.class);

    /* renamed from: b */
    public final String f40431b;

    /* renamed from: c */
    public final TodShuttlePattern f40432c;

    /* renamed from: d */
    public final TodShuttleSchedule f40433d;

    /* renamed from: e */
    public final long f40434e;

    /* renamed from: f */
    public final boolean f40435f;

    /* renamed from: com.moovit.app.tod.shuttle.model.TodShuttleTrip$a */
    public class C15562a implements Parcelable.Creator<TodShuttleTrip> {
        public final Object createFromParcel(Parcel parcel) {
            return (TodShuttleTrip) C19612n.m46981v(parcel, TodShuttleTrip.f40430g);
        }

        public final Object[] newArray(int i) {
            return new TodShuttleTrip[i];
        }
    }

    /* renamed from: com.moovit.app.tod.shuttle.model.TodShuttleTrip$b */
    public class C15563b extends C19619s<TodShuttleTrip> {
        public C15563b(Class cls) {
            super(1, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i >= 0 && i <= 1;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            long j;
            boolean z;
            String p = pVar.mo51947p();
            TodShuttlePattern todShuttlePattern = (TodShuttlePattern) TodShuttlePattern.f40417f.read(pVar);
            TodShuttleSchedule todShuttleSchedule = (TodShuttleSchedule) TodShuttleSchedule.f40424c.read(pVar);
            if (i >= 1) {
                j = pVar.mo51925m();
            } else {
                j = -1;
            }
            if (i < 1 || !pVar.mo51919b()) {
                z = false;
            } else {
                z = true;
            }
            return new TodShuttleTrip(p, todShuttlePattern, todShuttleSchedule, j, z);
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TodShuttleTrip todShuttleTrip = (TodShuttleTrip) obj;
            qVar.mo51954p(todShuttleTrip.f40431b);
            TodShuttlePattern todShuttlePattern = todShuttleTrip.f40432c;
            TodShuttlePattern.C15555b bVar = TodShuttlePattern.f40417f;
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(todShuttlePattern, qVar);
            TodShuttleSchedule todShuttleSchedule = todShuttleTrip.f40433d;
            TodShuttleSchedule.C15559b bVar2 = TodShuttleSchedule.f40424c;
            qVar.mo51939l(bVar2.f49802v);
            bVar2.mo179c(todShuttleSchedule, qVar);
            qVar.mo51940m(todShuttleTrip.f40434e);
            qVar.mo51934b(todShuttleTrip.f40435f);
        }
    }

    public TodShuttleTrip(String str, TodShuttlePattern todShuttlePattern, TodShuttleSchedule todShuttleSchedule, long j, boolean z) {
        C21100e.m49373x(str, "id");
        this.f40431b = str;
        C21100e.m49373x(todShuttlePattern, "pattern");
        this.f40432c = todShuttlePattern;
        C21100e.m49373x(todShuttleSchedule, "schedule");
        this.f40433d = todShuttleSchedule;
        this.f40434e = j;
        this.f40435f = z;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TodShuttleTrip)) {
            return false;
        }
        return this.f40431b.equals(((TodShuttleTrip) obj).f40431b);
    }

    public final int hashCode() {
        return C17884p.m44335F(this.f40431b);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodShuttleTrip{id='");
        C25541a.m63890u(k, this.f40431b, '\'', ", pattern=");
        k.append(this.f40432c);
        k.append(", schedule=");
        k.append(this.f40433d);
        k.append(", lockTime=");
        k.append(this.f40434e);
        k.append(", inaccurateTimes=");
        return C13715c.m34247m(k, this.f40435f, '}');
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f40430g);
    }
}
