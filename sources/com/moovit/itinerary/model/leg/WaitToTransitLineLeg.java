package com.moovit.itinerary.model.leg;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.geo.Polyline;
import com.moovit.commons.geo.Polylon;
import com.moovit.database.DbEntityRef;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.servicealerts.LineServiceAlertDigest;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import com.moovit.util.time.StopRealTimeInformation;
import com.moovit.util.time.Time;
import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p810sz.C19620t;
import p810sz.C19621u;

public class WaitToTransitLineLeg implements Leg {
    public static final Parcelable.Creator<WaitToTransitLineLeg> CREATOR = new C16165a();

    /* renamed from: l */
    public static final C16166b f42129l = new C16166b();

    /* renamed from: m */
    public static final C16167c f42130m = new C16167c(WaitToTransitLineLeg.class);

    /* renamed from: b */
    public final Time f42131b;

    /* renamed from: c */
    public final Time f42132c;

    /* renamed from: d */
    public final Time f42133d;

    /* renamed from: e */
    public final Time f42134e;

    /* renamed from: f */
    public final DbEntityRef<TransitLine> f42135f;

    /* renamed from: g */
    public final DbEntityRef<TransitStop> f42136g;

    /* renamed from: h */
    public final DbEntityRef<TransitStop> f42137h;

    /* renamed from: i */
    public final DeparturesInfo f42138i;

    /* renamed from: j */
    public final LineServiceAlertDigest f42139j;

    /* renamed from: k */
    public final boolean f42140k;

    public static class DeparturesInfo implements Parcelable {
        public static final Parcelable.Creator<DeparturesInfo> CREATOR = new C16163a();

        /* renamed from: e */
        public static final C16164b f42141e = new C16164b(DeparturesInfo.class);

        /* renamed from: b */
        public final Schedule f42142b;

        /* renamed from: c */
        public final StopRealTimeInformation f42143c;

        /* renamed from: d */
        public final byte[] f42144d;

        /* renamed from: com.moovit.itinerary.model.leg.WaitToTransitLineLeg$DeparturesInfo$a */
        public class C16163a implements Parcelable.Creator<DeparturesInfo> {
            public final Object createFromParcel(Parcel parcel) {
                return (DeparturesInfo) C19612n.m46981v(parcel, DeparturesInfo.f42141e);
            }

            public final Object[] newArray(int i) {
                return new DeparturesInfo[i];
            }
        }

        /* renamed from: com.moovit.itinerary.model.leg.WaitToTransitLineLeg$DeparturesInfo$b */
        public class C16164b extends C19619s<DeparturesInfo> {
            public C16164b(Class cls) {
                super(0, cls);
            }

            /* renamed from: a */
            public final boolean mo177a(int i) {
                return i == 0;
            }

            /* renamed from: b */
            public final Object mo178b(C19615p pVar, int i) throws IOException {
                Schedule.C7798c cVar = Schedule.f23659e;
                pVar.getClass();
                return new DeparturesInfo((Schedule) cVar.read(pVar), (StopRealTimeInformation) pVar.mo51962q(StopRealTimeInformation.f23897c), pVar.mo51944d());
            }

            /* renamed from: c */
            public final void mo179c(Object obj, C19616q qVar) throws IOException {
                DeparturesInfo departuresInfo = (DeparturesInfo) obj;
                Schedule schedule = departuresInfo.f42142b;
                Schedule.C7797b bVar = Schedule.f23658d;
                qVar.getClass();
                qVar.mo51939l(bVar.f49804u);
                bVar.mo19622a(schedule, qVar);
                qVar.mo51967q(departuresInfo.f42143c, StopRealTimeInformation.f23897c);
                qVar.mo51951e(departuresInfo.f42144d);
            }
        }

        public DeparturesInfo(Schedule schedule, StopRealTimeInformation stopRealTimeInformation, byte[] bArr) {
            C21100e.m49373x(schedule, "schedule");
            this.f42142b = schedule;
            this.f42143c = stopRealTimeInformation;
            this.f42144d = bArr;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            C19613o.m46994v(parcel, this, f42141e);
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.WaitToTransitLineLeg$a */
    public class C16165a implements Parcelable.Creator<WaitToTransitLineLeg> {
        public final Object createFromParcel(Parcel parcel) {
            return (WaitToTransitLineLeg) C19612n.m46981v(parcel, WaitToTransitLineLeg.f42130m);
        }

        public final Object[] newArray(int i) {
            return new WaitToTransitLineLeg[i];
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.WaitToTransitLineLeg$b */
    public class C16166b extends C19621u<WaitToTransitLineLeg> {
        public C16166b() {
            super(3);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            WaitToTransitLineLeg waitToTransitLineLeg = (WaitToTransitLineLeg) obj;
            Time time = waitToTransitLineLeg.f42131b;
            Time.C7913b bVar = Time.f23899o;
            qVar.getClass();
            qVar.mo51939l(6);
            bVar.mo19622a(time, qVar);
            Time time2 = waitToTransitLineLeg.f42132c;
            qVar.mo51939l(6);
            bVar.mo19622a(time2, qVar);
            Time time3 = waitToTransitLineLeg.f42133d;
            qVar.mo51939l(6);
            bVar.mo19622a(time3, qVar);
            Time time4 = waitToTransitLineLeg.f42134e;
            qVar.mo51939l(6);
            bVar.mo19622a(time4, qVar);
            DbEntityRef.TRANSIT_LINE_REF_CODER.write(waitToTransitLineLeg.f42135f, qVar);
            DbEntityRef.TRANSIT_STOP_REF_CODER.write(waitToTransitLineLeg.f42136g, qVar);
            DbEntityRef.TRANSIT_STOP_REF_CODER.write(waitToTransitLineLeg.f42137h, qVar);
            DeparturesInfo departuresInfo = waitToTransitLineLeg.f42138i;
            DeparturesInfo.C16164b bVar2 = DeparturesInfo.f42141e;
            qVar.mo51939l(bVar2.f49802v);
            bVar2.mo179c(departuresInfo, qVar);
            qVar.mo51967q(waitToTransitLineLeg.f42139j, LineServiceAlertDigest.f23183e);
            qVar.mo51934b(waitToTransitLineLeg.f42140k);
        }
    }

    /* renamed from: com.moovit.itinerary.model.leg.WaitToTransitLineLeg$c */
    public class C16167c extends C19620t<WaitToTransitLineLeg> {
        public C16167c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i >= 0 && i <= 3;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            if (i == 1) {
                Time.C7914c cVar = Time.f23900p;
                pVar.getClass();
                return new WaitToTransitLineLeg((Time) cVar.read(pVar), (Time) cVar.read(pVar), (Time) cVar.read(pVar), (Time) cVar.read(pVar), DbEntityRef.TRANSIT_LINE_REF_CODER.read(pVar), DbEntityRef.TRANSIT_STOP_REF_CODER.read(pVar), DbEntityRef.TRANSIT_STOP_REF_CODER.read(pVar), new DeparturesInfo((Schedule) Schedule.f23659e.read(pVar), (StopRealTimeInformation) null, (byte[]) null), (LineServiceAlertDigest) pVar.mo51962q(LineServiceAlertDigest.f23184f), false);
            } else if (i == 2) {
                Time.C7914c cVar2 = Time.f23900p;
                pVar.getClass();
                return new WaitToTransitLineLeg((Time) cVar2.read(pVar), (Time) cVar2.read(pVar), (Time) cVar2.read(pVar), (Time) cVar2.read(pVar), DbEntityRef.TRANSIT_LINE_REF_CODER.read(pVar), DbEntityRef.TRANSIT_STOP_REF_CODER.read(pVar), DbEntityRef.TRANSIT_STOP_REF_CODER.read(pVar), new DeparturesInfo((Schedule) Schedule.f23659e.read(pVar), (StopRealTimeInformation) null, (byte[]) null), (LineServiceAlertDigest) pVar.mo51962q(LineServiceAlertDigest.f23184f), pVar.mo51919b());
            } else if (i != 3) {
                Time.C7914c cVar3 = Time.f23900p;
                pVar.getClass();
                Time time = (Time) cVar3.read(pVar);
                Time time2 = (Time) cVar3.read(pVar);
                return new WaitToTransitLineLeg(time, time2, time, time2, DbEntityRef.TRANSIT_LINE_REF_CODER.read(pVar), DbEntityRef.TRANSIT_STOP_REF_CODER.read(pVar), DbEntityRef.TRANSIT_STOP_REF_CODER.read(pVar), new DeparturesInfo((Schedule) Schedule.f23659e.read(pVar), (StopRealTimeInformation) null, (byte[]) null), (LineServiceAlertDigest) pVar.mo51962q(LineServiceAlertDigest.f23184f), false);
            } else {
                Time.C7914c cVar4 = Time.f23900p;
                pVar.getClass();
                return new WaitToTransitLineLeg((Time) cVar4.read(pVar), (Time) cVar4.read(pVar), (Time) cVar4.read(pVar), (Time) cVar4.read(pVar), DbEntityRef.TRANSIT_LINE_REF_CODER.read(pVar), DbEntityRef.TRANSIT_STOP_REF_CODER.read(pVar), DbEntityRef.TRANSIT_STOP_REF_CODER.read(pVar), (DeparturesInfo) DeparturesInfo.f42141e.read(pVar), (LineServiceAlertDigest) pVar.mo51962q(LineServiceAlertDigest.f23184f), pVar.mo51919b());
            }
        }
    }

    public WaitToTransitLineLeg(Time time, Time time2, Time time3, Time time4, DbEntityRef<TransitLine> dbEntityRef, DbEntityRef<TransitStop> dbEntityRef2, DbEntityRef<TransitStop> dbEntityRef3, DeparturesInfo departuresInfo, LineServiceAlertDigest lineServiceAlertDigest, boolean z) {
        C21100e.m49373x(time, "startTime");
        this.f42131b = time;
        C21100e.m49373x(time2, "endTime");
        this.f42132c = time2;
        C21100e.m49373x(time3, "staticStartTime");
        this.f42133d = time3;
        C21100e.m49373x(time4, "staticEndTime");
        this.f42134e = time4;
        C21100e.m49373x(dbEntityRef, "waitToLineRef");
        this.f42135f = dbEntityRef;
        C21100e.m49373x(dbEntityRef2, "waitAtStopRef");
        this.f42136g = dbEntityRef2;
        C21100e.m49373x(dbEntityRef3, "dropOffStopRef");
        this.f42137h = dbEntityRef3;
        C21100e.m49373x(departuresInfo, "departuresInfo");
        this.f42138i = departuresInfo;
        this.f42139j = lineServiceAlertDigest;
        this.f42140k = z;
    }

    /* renamed from: K1 */
    public final Time mo48331K1() {
        return this.f42132c;
    }

    /* renamed from: W */
    public final LocationDescriptor mo48332W() {
        return LocationDescriptor.m17769c(this.f42136g.get());
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e2 */
    public final LocationDescriptor mo48334e2() {
        return LocationDescriptor.m17769c(this.f42137h.get());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WaitToTransitLineLeg)) {
            return false;
        }
        WaitToTransitLineLeg waitToTransitLineLeg = (WaitToTransitLineLeg) obj;
        if (!this.f42131b.equals(waitToTransitLineLeg.f42131b) || !this.f42132c.equals(waitToTransitLineLeg.f42132c) || !this.f42133d.equals(waitToTransitLineLeg.f42133d) || !this.f42134e.equals(waitToTransitLineLeg.f42134e) || !this.f42135f.equals(waitToTransitLineLeg.f42135f) || !this.f42136g.equals(waitToTransitLineLeg.f42136g) || !this.f42137h.equals(waitToTransitLineLeg.f42137h)) {
            return false;
        }
        return true;
    }

    public final int getType() {
        return 3;
    }

    public final int hashCode() {
        return C17884p.m44333D(this.f42131b.hashCode(), this.f42132c.hashCode(), this.f42133d.hashCode(), this.f42134e.hashCode(), this.f42135f.hashCode(), this.f42136g.hashCode(), this.f42137h.hashCode());
    }

    /* renamed from: i0 */
    public final <T> T mo48338i0(Leg.C16144a<T> aVar) {
        return aVar.mo39915g(this);
    }

    /* renamed from: o1 */
    public final Time mo48339o1() {
        return this.f42131b;
    }

    /* renamed from: w1 */
    public final Polyline mo48340w1() {
        return Polylon.m40193b(this.f42136g.get().f23732d);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f42129l);
    }
}
