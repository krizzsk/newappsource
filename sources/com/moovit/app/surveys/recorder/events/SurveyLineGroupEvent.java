package com.moovit.app.surveys.recorder.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.database.DbEntityRef;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitLineGroup;
import com.moovit.transit.TransitStop;
import com.moovit.util.time.Time;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class SurveyLineGroupEvent extends SurveyEvent {
    public static final Parcelable.Creator<SurveyLineGroupEvent> CREATOR = new C15404a();

    /* renamed from: i */
    public static C15405b f39884i = new C15405b(SurveyLineGroupEvent.class);

    /* renamed from: d */
    public final DbEntityRef<TransitLineGroup> f39885d;

    /* renamed from: e */
    public final DbEntityRef<TransitLine> f39886e;

    /* renamed from: f */
    public final DbEntityRef<TransitStop> f39887f;

    /* renamed from: g */
    public final LatLonE6 f39888g;

    /* renamed from: h */
    public final Time f39889h;

    /* renamed from: com.moovit.app.surveys.recorder.events.SurveyLineGroupEvent$a */
    public class C15404a implements Parcelable.Creator<SurveyLineGroupEvent> {
        public final Object createFromParcel(Parcel parcel) {
            return (SurveyLineGroupEvent) C19612n.m46981v(parcel, SurveyLineGroupEvent.f39884i);
        }

        public final Object[] newArray(int i) {
            return new SurveyLineGroupEvent[i];
        }
    }

    /* renamed from: com.moovit.app.surveys.recorder.events.SurveyLineGroupEvent$b */
    public class C15405b extends C19619s<SurveyLineGroupEvent> {
        public C15405b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new SurveyLineGroupEvent(pVar.mo51925m(), DbEntityRef.TRANSIT_LINE_GROUP_REF_CODER.read(pVar), (DbEntityRef) pVar.mo51962q(DbEntityRef.TRANSIT_LINE_REF_CODER), (DbEntityRef) pVar.mo51962q(DbEntityRef.TRANSIT_STOP_REF_CODER), (LatLonE6) pVar.mo51962q(LatLonE6.f40979g), (Time) pVar.mo51962q(Time.f23900p));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            SurveyLineGroupEvent surveyLineGroupEvent = (SurveyLineGroupEvent) obj;
            qVar.mo51940m(surveyLineGroupEvent.f39880c);
            DbEntityRef.TRANSIT_LINE_GROUP_REF_CODER.write(surveyLineGroupEvent.f39885d, qVar);
            qVar.mo51967q(surveyLineGroupEvent.f39886e, DbEntityRef.TRANSIT_LINE_REF_CODER);
            qVar.mo51967q(surveyLineGroupEvent.f39887f, DbEntityRef.TRANSIT_STOP_REF_CODER);
            qVar.mo51967q(surveyLineGroupEvent.f39888g, LatLonE6.f40978f);
            qVar.mo51967q(surveyLineGroupEvent.f39889h, Time.f23899o);
        }
    }

    public SurveyLineGroupEvent(long j, DbEntityRef<TransitLineGroup> dbEntityRef, DbEntityRef<TransitLine> dbEntityRef2, DbEntityRef<TransitStop> dbEntityRef3, LatLonE6 latLonE6, Time time) {
        super(0, j);
        C21100e.m49373x(dbEntityRef, "lineGroupRef");
        this.f39885d = dbEntityRef;
        this.f39886e = dbEntityRef2;
        this.f39887f = dbEntityRef3;
        this.f39888g = latLonE6;
        this.f39889h = time;
    }

    /* renamed from: b */
    public final void mo46040b(Context context) throws SurveyEventResolveException {
        this.f39885d.resolve(context);
        if (this.f39885d.isResolved()) {
            DbEntityRef<TransitLine> dbEntityRef = this.f39886e;
            if (dbEntityRef != null) {
                dbEntityRef.resolve(context);
                if (!this.f39886e.isResolved()) {
                    StringBuilder k = C13555b.m33972k("Unable to resolve line: ");
                    k.append(this.f39886e.getServerId());
                    throw new SurveyEventResolveException(k.toString());
                }
            }
            DbEntityRef<TransitStop> dbEntityRef2 = this.f39887f;
            if (dbEntityRef2 != null) {
                dbEntityRef2.resolve(context);
                if (!this.f39887f.isResolved()) {
                    StringBuilder k2 = C13555b.m33972k("Unable to resolve stop: ");
                    k2.append(this.f39887f.getServerId());
                    throw new SurveyEventResolveException(k2.toString());
                }
                return;
            }
            return;
        }
        StringBuilder k3 = C13555b.m33972k("Unable to resolve line group: ");
        k3.append(this.f39885d.getServerId());
        throw new SurveyEventResolveException(k3.toString());
    }

    /* renamed from: c */
    public final DbEntityRef<TransitLineGroup> mo46047c() {
        if (this.f39885d.isResolved()) {
            return this.f39885d;
        }
        throw new IllegalStateException("Did you called SurveyEvent.resolve(...)?");
    }

    /* renamed from: d */
    public final DbEntityRef<TransitLine> mo46048d() {
        DbEntityRef<TransitLine> dbEntityRef = this.f39886e;
        if (dbEntityRef == null || dbEntityRef.isResolved()) {
            return this.f39886e;
        }
        throw new IllegalStateException("Did you called SurveyEvent.resolve(...)?");
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public final DbEntityRef<TransitStop> mo46050f() {
        DbEntityRef<TransitStop> dbEntityRef = this.f39887f;
        if (dbEntityRef == null || dbEntityRef.isResolved()) {
            return this.f39887f;
        }
        throw new IllegalStateException("Did you called SurveyEvent.resolve(...)?");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39884i);
    }
}
