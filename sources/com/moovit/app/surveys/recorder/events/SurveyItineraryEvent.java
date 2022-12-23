package com.moovit.app.surveys.recorder.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import c70.C13752e;
import ce0.C21100e;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.itinerary.model.Itinerary;
import e20.C16776h;
import java.io.IOException;
import java.util.HashSet;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p824tp.C19722a0;
import p824tp.C19728f;

public class SurveyItineraryEvent extends SurveyEvent {
    public static final Parcelable.Creator<SurveyItineraryEvent> CREATOR = new C15402a();

    /* renamed from: f */
    public static C15403b f39881f = new C15403b(SurveyItineraryEvent.class);

    /* renamed from: d */
    public final Itinerary f39882d;

    /* renamed from: e */
    public Itinerary f39883e = null;

    /* renamed from: com.moovit.app.surveys.recorder.events.SurveyItineraryEvent$a */
    public class C15402a implements Parcelable.Creator<SurveyItineraryEvent> {
        public final Object createFromParcel(Parcel parcel) {
            return (SurveyItineraryEvent) C19612n.m46981v(parcel, SurveyItineraryEvent.f39881f);
        }

        public final Object[] newArray(int i) {
            return new SurveyItineraryEvent[i];
        }
    }

    /* renamed from: com.moovit.app.surveys.recorder.events.SurveyItineraryEvent$b */
    public class C15403b extends C19619s<SurveyItineraryEvent> {
        public C15403b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new SurveyItineraryEvent(pVar.mo51925m(), (Itinerary) Itinerary.f41893g.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            SurveyItineraryEvent surveyItineraryEvent = (SurveyItineraryEvent) obj;
            qVar.mo51940m(surveyItineraryEvent.f39880c);
            Itinerary itinerary = surveyItineraryEvent.f39882d;
            Itinerary.C16086b bVar = Itinerary.f41892f;
            qVar.mo51939l(0);
            bVar.mo19622a(itinerary, qVar);
        }
    }

    public SurveyItineraryEvent(long j, Itinerary itinerary) {
        super(3, j);
        C21100e.m49373x(itinerary, "itinerary");
        this.f39882d = itinerary;
    }

    /* renamed from: b */
    public final void mo46040b(Context context) throws SurveyEventResolveException {
        try {
            C13752e eVar = new C13752e(context, (C19722a0) context.getSystemService("user_context"), (AnalyticsFlowKey) null);
            HashSet hashSet = C19728f.f50164e;
            Itinerary a = C16776h.m42406a(eVar, (C19728f) context.getSystemService("metro_context"), this.f39882d);
            this.f39883e = a;
            if (a == null) {
                throw new SurveyEventResolveException("Unable to resolve itinerary event");
            }
        } catch (Exception e) {
            throw new SurveyEventResolveException(e);
        }
    }

    /* renamed from: c */
    public final Itinerary mo46042c() {
        Itinerary itinerary = this.f39883e;
        if (itinerary != null) {
            return itinerary;
        }
        throw new IllegalStateException("Did you called SurveyEvent.resolve(...)?");
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39881f);
    }
}
