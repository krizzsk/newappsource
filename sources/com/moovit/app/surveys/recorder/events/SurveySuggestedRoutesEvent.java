package com.moovit.app.surveys.recorder.events;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.app.history.model.HistoryItem;
import java.io.IOException;
import p372at.C13516c;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class SurveySuggestedRoutesEvent extends SurveyEvent {
    public static final Parcelable.Creator<SurveySuggestedRoutesEvent> CREATOR = new C15408a();

    /* renamed from: f */
    public static C15409b f39894f = new C15409b(SurveySuggestedRoutesEvent.class);

    /* renamed from: d */
    public final String f39895d;

    /* renamed from: e */
    public transient HistoryItem f39896e;

    /* renamed from: com.moovit.app.surveys.recorder.events.SurveySuggestedRoutesEvent$a */
    public class C15408a implements Parcelable.Creator<SurveySuggestedRoutesEvent> {
        public final Object createFromParcel(Parcel parcel) {
            return (SurveySuggestedRoutesEvent) C19612n.m46981v(parcel, SurveySuggestedRoutesEvent.f39894f);
        }

        public final Object[] newArray(int i) {
            return new SurveySuggestedRoutesEvent[i];
        }
    }

    /* renamed from: com.moovit.app.surveys.recorder.events.SurveySuggestedRoutesEvent$b */
    public class C15409b extends C19619s<SurveySuggestedRoutesEvent> {
        public C15409b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new SurveySuggestedRoutesEvent(pVar.mo51925m(), pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            SurveySuggestedRoutesEvent surveySuggestedRoutesEvent = (SurveySuggestedRoutesEvent) obj;
            qVar.mo51940m(surveySuggestedRoutesEvent.f39880c);
            qVar.mo51954p(surveySuggestedRoutesEvent.f39895d);
        }
    }

    public SurveySuggestedRoutesEvent(long j, String str) {
        super(2, j);
        C21100e.m49373x(str, "historyItemId");
        this.f39895d = str;
    }

    /* renamed from: b */
    public final void mo46040b(Context context) throws SurveyEventResolveException {
        HistoryItem b = ((C13516c) context.getSystemService("history_controller")).mo40409b(this.f39895d);
        this.f39896e = b;
        if (b == null) {
            StringBuilder k = C13555b.m33972k("Unable to resolve history item: ");
            k.append(this.f39895d);
            throw new SurveyEventResolveException(k.toString());
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39894f);
    }
}
