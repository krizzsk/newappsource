package com.moovit.util.time;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.appsflyer.ServerParameters;
import com.moovit.database.DbEntityRef;
import com.moovit.network.model.LongServerId;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitPattern;
import java.io.IOException;
import p001a0.C0016g;
import p583jk.C17884p;
import p810sz.C19577c;
import p810sz.C19584i;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;
import p824tp.C19735m;
import p824tp.C19746x;
import p977zz.C20975x0;

public class Time implements Parcelable, Comparable<Time> {
    public static final Parcelable.Creator<Time> CREATOR = new C7912a();

    /* renamed from: o */
    public static final C7913b f23899o = new C7913b();

    /* renamed from: p */
    public static final C7914c f23900p = new C7914c(Time.class);

    /* renamed from: b */
    public final long f23901b;

    /* renamed from: c */
    public final long f23902c;

    /* renamed from: d */
    public final int f23903d;

    /* renamed from: e */
    public final LongServerId f23904e;

    /* renamed from: f */
    public final DbEntityRef<TransitPattern> f23905f;

    /* renamed from: g */
    public final int f23906g;

    /* renamed from: h */
    public final ServerId f23907h;

    /* renamed from: i */
    public final TimeFrequency f23908i;

    /* renamed from: j */
    public final String f23909j;

    /* renamed from: k */
    public final Status f23910k;

    /* renamed from: l */
    public final boolean f23911l;

    /* renamed from: m */
    public final TimeVehicleLocation f23912m;

    /* renamed from: n */
    public final TimeVehicleAttributes f23913n;

    public enum Status {
        UNKNOWN(0, 0),
        ON_TIME(r3, r4),
        DELAY(C19746x.station_schedule_state_delayed, C19735m.colorProblem),
        AHEAD_OF_TIME(C19746x.station_schedule_state_early, r4),
        CANCELED(C19746x.station_schedule_state_canceled, C19735m.colorCritical);
        
        public static C19584i<Status> CODER;
        private final int colorAttrId;
        private final int textResId;

        /* access modifiers changed from: public */
        static {
            Status status;
            Status status2;
            Status status3;
            Status status4;
            Status status5;
            CODER = new C19577c(Status.class, status, status2, status3, status4, status5);
        }

        private Status(int i, int i2) {
            this.textResId = i;
            this.colorAttrId = i2;
        }

        public int getColorAttrId() {
            return this.colorAttrId;
        }

        public int getTextResId() {
            return this.textResId;
        }
    }

    /* renamed from: com.moovit.util.time.Time$a */
    public class C7912a implements Parcelable.Creator<Time> {
        public final Object createFromParcel(Parcel parcel) {
            return (Time) C19612n.m46981v(parcel, Time.f23900p);
        }

        public final Object[] newArray(int i) {
            return new Time[i];
        }
    }

    /* renamed from: com.moovit.util.time.Time$b */
    public class C7913b extends C19621u<Time> {
        public C7913b() {
            super(6);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            Time time = (Time) obj;
            qVar.mo51940m(time.f23901b);
            qVar.mo51940m(time.f23902c);
            qVar.mo51939l(time.f23903d);
            qVar.mo51967q(time.f23904e, LongServerId.f15136c);
            qVar.mo51967q(time.f23905f, DbEntityRef.TRANSIT_PATTERN_REF_CODER);
            qVar.mo51939l(time.f23906g);
            ServerId serverId = time.f23907h;
            if (serverId == null) {
                qVar.mo51934b(false);
            } else {
                qVar.mo51934b(true);
                qVar.mo51939l(serverId.f15142b);
            }
            qVar.mo51967q(time.f23908i, TimeFrequency.f23914d);
            qVar.mo51955t(time.f23909j);
            Status.CODER.write(time.f23910k, qVar);
            qVar.mo51934b(time.f23911l);
            qVar.mo51967q(time.f23912m, TimeVehicleLocation.f23923f);
            qVar.mo51967q(time.f23913n, TimeVehicleAttributes.f23917g);
        }
    }

    /* renamed from: com.moovit.util.time.Time$c */
    public class C7914c extends C19620t<Time> {
        public C7914c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i >= 0 && i <= 6;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            LongServerId longServerId;
            LongServerId longServerId2;
            LongServerId longServerId3;
            LongServerId longServerId4;
            ServerId serverId;
            C19615p pVar2 = pVar;
            switch (i) {
                case 1:
                    long m = pVar.mo51925m();
                    long m2 = pVar.mo51925m();
                    if (!pVar.mo51919b()) {
                        longServerId = null;
                    } else {
                        longServerId = new LongServerId((long) pVar.mo51924l());
                    }
                    return new Time(m, m2, 4, longServerId, (DbEntityRef) pVar2.mo51962q(DbEntityRef.TRANSIT_PATTERN_REF_CODER), -1, (ServerId) null, (TimeFrequency) pVar2.mo51962q(TimeFrequency.f23914d), pVar.mo51948t(), Status.CODER.read(pVar2), pVar.mo51919b(), (TimeVehicleLocation) null, (TimeVehicleAttributes) null);
                case 2:
                    long m3 = pVar.mo51925m();
                    long m4 = pVar.mo51925m();
                    if (!pVar.mo51919b()) {
                        longServerId2 = null;
                    } else {
                        longServerId2 = new LongServerId((long) pVar.mo51924l());
                    }
                    return new Time(m3, m4, 4, longServerId2, (DbEntityRef) pVar2.mo51962q(DbEntityRef.TRANSIT_PATTERN_REF_CODER), -1, (ServerId) null, (TimeFrequency) pVar2.mo51962q(TimeFrequency.f23914d), pVar.mo51948t(), Status.CODER.read(pVar2), pVar.mo51919b(), (TimeVehicleLocation) pVar2.mo51962q(TimeVehicleLocation.f23923f), (TimeVehicleAttributes) null);
                case 3:
                    long m5 = pVar.mo51925m();
                    long m6 = pVar.mo51925m();
                    int l = pVar.mo51924l();
                    if (!pVar.mo51919b()) {
                        longServerId3 = null;
                    } else {
                        longServerId3 = new LongServerId((long) pVar.mo51924l());
                    }
                    return new Time(m5, m6, l, longServerId3, (DbEntityRef) pVar2.mo51962q(DbEntityRef.TRANSIT_PATTERN_REF_CODER), pVar.mo51924l(), (ServerId) null, (TimeFrequency) pVar2.mo51962q(TimeFrequency.f23914d), pVar.mo51948t(), Status.CODER.read(pVar2), pVar.mo51919b(), (TimeVehicleLocation) pVar2.mo51962q(TimeVehicleLocation.f23923f), (TimeVehicleAttributes) null);
                case 4:
                    long m7 = pVar.mo51925m();
                    long m8 = pVar.mo51925m();
                    int l2 = pVar.mo51924l();
                    if (!pVar.mo51919b()) {
                        longServerId4 = null;
                    } else {
                        longServerId4 = new LongServerId((long) pVar.mo51924l());
                    }
                    return new Time(m7, m8, l2, longServerId4, (DbEntityRef) pVar2.mo51962q(DbEntityRef.TRANSIT_PATTERN_REF_CODER), pVar.mo51924l(), (ServerId) null, (TimeFrequency) pVar2.mo51962q(TimeFrequency.f23914d), pVar.mo51948t(), Status.CODER.read(pVar2), pVar.mo51919b(), (TimeVehicleLocation) pVar2.mo51962q(TimeVehicleLocation.f23923f), (TimeVehicleAttributes) pVar2.mo51962q(TimeVehicleAttributes.f23917g));
                case 5:
                    return new Time(pVar.mo51925m(), pVar.mo51925m(), pVar.mo51924l(), (LongServerId) pVar2.mo51962q(LongServerId.f15136c), (DbEntityRef) pVar2.mo51962q(DbEntityRef.TRANSIT_PATTERN_REF_CODER), pVar.mo51924l(), (ServerId) null, (TimeFrequency) pVar2.mo51962q(TimeFrequency.f23914d), pVar.mo51948t(), Status.CODER.read(pVar2), pVar.mo51919b(), (TimeVehicleLocation) pVar2.mo51962q(TimeVehicleLocation.f23923f), (TimeVehicleAttributes) pVar2.mo51962q(TimeVehicleAttributes.f23917g));
                case 6:
                    long m9 = pVar.mo51925m();
                    long m11 = pVar.mo51925m();
                    int l3 = pVar.mo51924l();
                    LongServerId longServerId5 = (LongServerId) pVar2.mo51962q(LongServerId.f15136c);
                    DbEntityRef dbEntityRef = (DbEntityRef) pVar2.mo51962q(DbEntityRef.TRANSIT_PATTERN_REF_CODER);
                    int l4 = pVar.mo51924l();
                    if (!pVar.mo51919b()) {
                        serverId = null;
                    } else {
                        serverId = new ServerId(pVar.mo51924l());
                    }
                    return new Time(m9, m11, l3, longServerId5, dbEntityRef, l4, serverId, (TimeFrequency) pVar2.mo51962q(TimeFrequency.f23914d), pVar.mo51948t(), Status.CODER.read(pVar2), pVar.mo51919b(), (TimeVehicleLocation) pVar2.mo51962q(TimeVehicleLocation.f23923f), (TimeVehicleAttributes) pVar2.mo51962q(TimeVehicleAttributes.f23917g));
                default:
                    long m12 = pVar.mo51925m();
                    if (pVar.mo51919b()) {
                        return new Time(m12, m12);
                    }
                    return new Time(m12);
            }
        }
    }

    public Time(long j) {
        this(j, -1);
    }

    /* renamed from: k */
    public static Time m17980k() {
        return new Time(System.currentTimeMillis());
    }

    /* renamed from: l */
    public static Time m17981l(Time time) {
        Time time2 = time;
        if (!time.mo24633j()) {
            return time2;
        }
        return new Time(time2.f23901b, -1, time2.f23903d, time2.f23904e, time2.f23905f, time2.f23906g, time2.f23907h, time2.f23908i, (String) null, Status.UNKNOWN, time2.f23911l, (TimeVehicleLocation) null, (TimeVehicleAttributes) null);
    }

    /* renamed from: b */
    public final int compareTo(Time time) {
        return Long.compare(mo24631g(), time.mo24631g());
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Time)) {
            return false;
        }
        Time time = (Time) obj;
        if (this.f23901b != time.f23901b || this.f23902c != time.f23902c || this.f23903d != time.f23903d || !C20975x0.m49118e(this.f23904e, time.f23904e) || !C20975x0.m49118e(this.f23905f, time.f23905f) || this.f23906g != time.f23906g || !C20975x0.m49118e(this.f23907h, time.f23907h) || !C20975x0.m49118e(this.f23908i, time.f23908i) || !C20975x0.m49118e(this.f23909j, time.f23909j) || !this.f23910k.equals(time.f23910k) || this.f23911l != time.f23911l || !C20975x0.m49118e(this.f23912m, time.f23912m) || !C20975x0.m49118e(this.f23913n, time.f23913n)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final ServerId mo24630f() {
        DbEntityRef<TransitPattern> dbEntityRef = this.f23905f;
        if (dbEntityRef != null) {
            return dbEntityRef.getServerId();
        }
        return null;
    }

    /* renamed from: g */
    public final long mo24631g() {
        return mo24633j() ? this.f23902c : this.f23901b;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44334E(this.f23901b), C17884p.m44334E(this.f23902c), this.f23903d, C17884p.m44335F(this.f23904e), C17884p.m44335F(this.f23905f), this.f23906g, C17884p.m44335F(this.f23907h), C17884p.m44335F(this.f23908i), C17884p.m44335F(this.f23909j), C17884p.m44335F(this.f23910k), this.f23911l, C17884p.m44335F(this.f23912m), C17884p.m44335F(this.f23913n));
    }

    /* renamed from: j */
    public final boolean mo24633j() {
        return this.f23902c != -1;
    }

    public final String toString() {
        String str;
        StringBuilder k = C13555b.m33972k("Time[static=");
        k.append(C7925b.m18013a(this.f23901b));
        k.append(", real=");
        if (mo24633j()) {
            str = C7925b.m18013a(this.f23902c);
        } else {
            str = "none";
        }
        return C0016g.m31o(k, str, "]");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f23899o);
    }

    public Time(long j, long j2) {
        this(j, j2, 4, (LongServerId) null, (DbEntityRef<TransitPattern>) null, -1, (ServerId) null, (TimeFrequency) null, (String) null, Status.UNKNOWN, false, (TimeVehicleLocation) null, (TimeVehicleAttributes) null);
    }

    public Time(long j, long j2, int i, LongServerId longServerId, DbEntityRef<TransitPattern> dbEntityRef, int i2, ServerId serverId, TimeFrequency timeFrequency, String str, Status status, boolean z, TimeVehicleLocation timeVehicleLocation, TimeVehicleAttributes timeVehicleAttributes) {
        Status status2 = status;
        long j3 = j;
        this.f23901b = Math.max(0, j);
        this.f23902c = j2;
        this.f23903d = i != 0 ? i : 4;
        this.f23904e = longServerId;
        this.f23905f = dbEntityRef;
        this.f23906g = i2;
        this.f23907h = serverId;
        this.f23908i = timeFrequency;
        this.f23909j = str;
        C21100e.m49373x(status2, ServerParameters.STATUS);
        this.f23910k = status2;
        this.f23911l = z;
        this.f23912m = timeVehicleLocation;
        this.f23913n = timeVehicleAttributes;
    }
}
