package com.moovit.app.surveys.recorder.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.database.DbEntityRef;
import com.moovit.transit.TransitStop;
import com.moovit.util.time.Time;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class SurveyStopEvent extends SurveyEvent {
    public static final Parcelable.Creator<SurveyStopEvent> CREATOR = new C15406a();

    /* renamed from: g */
    public static C15407b f39890g = new C15407b(SurveyStopEvent.class);

    /* renamed from: d */
    public final DbEntityRef<TransitStop> f39891d;

    /* renamed from: e */
    public final LatLonE6 f39892e;

    /* renamed from: f */
    public final Time f39893f;

    /* renamed from: com.moovit.app.surveys.recorder.events.SurveyStopEvent$a */
    public class C15406a implements Parcelable.Creator<SurveyStopEvent> {
        public final Object createFromParcel(Parcel parcel) {
            return (SurveyStopEvent) C19612n.m46981v(parcel, SurveyStopEvent.f39890g);
        }

        public final Object[] newArray(int i) {
            return new SurveyStopEvent[i];
        }
    }

    /* renamed from: com.moovit.app.surveys.recorder.events.SurveyStopEvent$b */
    public class C15407b extends C19619s<SurveyStopEvent> {
        public C15407b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new SurveyStopEvent(pVar.mo51925m(), DbEntityRef.TRANSIT_STOP_REF_CODER.read(pVar), (LatLonE6) pVar.mo51962q(LatLonE6.f40979g), (Time) pVar.mo51962q(Time.f23900p));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            SurveyStopEvent surveyStopEvent = (SurveyStopEvent) obj;
            qVar.mo51940m(surveyStopEvent.f39880c);
            DbEntityRef.TRANSIT_STOP_REF_CODER.write(surveyStopEvent.f39891d, qVar);
            qVar.mo51967q(surveyStopEvent.f39892e, LatLonE6.f40978f);
            qVar.mo51967q(surveyStopEvent.f39893f, Time.f23899o);
        }
    }

    public SurveyStopEvent(long j, DbEntityRef<TransitStop> dbEntityRef, LatLonE6 latLonE6, Time time) {
        super(1, j);
        C21100e.m49373x(dbEntityRef, "stopRef");
        this.f39891d = dbEntityRef;
        this.f39892e = latLonE6;
        this.f39893f = time;
    }

    /* renamed from: b */
    public final void mo46040b(Context context) throws SurveyEventResolveException {
        this.f39891d.resolve(context);
        if (!this.f39891d.isResolved()) {
            StringBuilder k = C13555b.m33972k("Unable to resolve stop: ");
            k.append(this.f39891d.getServerId());
            throw new SurveyEventResolveException(k.toString());
        }
    }

    /* renamed from: c */
    public final DbEntityRef<TransitStop> mo46054c() {
        if (this.f39891d.isResolved()) {
            return this.f39891d;
        }
        throw new IllegalStateException("Did you called SurveyEvent.resolve(...)?");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39890g);
    }
}
