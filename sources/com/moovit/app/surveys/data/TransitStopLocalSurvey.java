package com.moovit.app.surveys.data;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import ce0.C21100e;
import com.google.android.play.core.appupdate.C14226d;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.stopdetail.StopDetailActivity;
import com.moovit.app.surveys.SurveyManager;
import com.moovit.app.surveys.data.Survey;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitStop;
import com.tranzmate.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p001a0.C0017h;
import p067e1.C4503l0;
import p067e1.C4522y;
import p543hq.C17474b;
import p738pw.C19034b;
import p759qw.C19196b;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TransitStopLocalSurvey extends Survey {
    public static final Parcelable.Creator<TransitStopLocalSurvey> CREATOR = new C15394a();

    /* renamed from: e */
    public static C15395b f39862e = new C15395b(TransitStopLocalSurvey.class);

    /* renamed from: d */
    public final TransitStop f39863d;

    /* renamed from: com.moovit.app.surveys.data.TransitStopLocalSurvey$a */
    public class C15394a implements Parcelable.Creator<TransitStopLocalSurvey> {
        public final Object createFromParcel(Parcel parcel) {
            return (TransitStopLocalSurvey) C19612n.m46981v(parcel, TransitStopLocalSurvey.f39862e);
        }

        public final Object[] newArray(int i) {
            return new TransitStopLocalSurvey[i];
        }
    }

    /* renamed from: com.moovit.app.surveys.data.TransitStopLocalSurvey$b */
    public class C15395b extends C19619s<TransitStopLocalSurvey> {
        public C15395b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            Survey.C15389Id.C15391b bVar = Survey.C15389Id.f39853f;
            pVar.getClass();
            return new TransitStopLocalSurvey((Survey.C15389Id) bVar.read(pVar), pVar.mo51947p(), (TransitStop) TransitStop.f23729s.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TransitStopLocalSurvey transitStopLocalSurvey = (TransitStopLocalSurvey) obj;
            Survey.C15389Id id = transitStopLocalSurvey.f39851b;
            Survey.C15389Id.C15391b bVar = Survey.C15389Id.f39853f;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(id, qVar);
            qVar.mo51954p(transitStopLocalSurvey.f39852c);
            TransitStop transitStop = transitStopLocalSurvey.f39863d;
            TransitStop.C7827b bVar2 = TransitStop.f23728r;
            qVar.mo51939l(6);
            bVar2.mo19622a(transitStop, qVar);
        }
    }

    public TransitStopLocalSurvey(Survey.C15389Id id, String str, TransitStop transitStop) {
        super(id, str);
        C21100e.m49373x(transitStop, "stop");
        this.f39863d = transitStop;
    }

    /* renamed from: b */
    public final Notification mo46004b(SurveyManager surveyManager) {
        CharSequence text = surveyManager.getText(R.string.user_in_app_feedback_displayed_times_android_title);
        CharSequence text2 = surveyManager.getText(R.string.user_in_app_feedback_arrival_times_android_subtitle);
        ArrayList arrayList = new ArrayList();
        Intent A0 = C14226d.m35335A0(surveyManager);
        Survey.m39400g(A0);
        arrayList.add(A0);
        Intent putExtra = StopDetailActivity.m39207B2(surveyManager, this.f39863d.f23730b, (ServerId) null, (TransitStop) null, (List) null).putExtra("extra_survey", this);
        Survey.m39400g(putExtra);
        arrayList.add(putExtra);
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            PendingIntent a = C4503l0.C4504a.m11737a(surveyManager, 0, intentArr, 134217728, (Bundle) null);
            C4522y c = mo46011c(surveyManager);
            c.mo20032d(text);
            c.mo20031c(text2);
            c.mo20038j(text);
            c.f15626g = a;
            return c.mo20030a();
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }

    /* renamed from: d */
    public final C17474b mo46005d() {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SURVEY_NOTIFICATION_RECEIVED);
        aVar.mo49939g(AnalyticsAttributeKey.PUBLISHER, "stop_satisfaction");
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, C0017h.m65V(this.f39851b.f39857e));
        aVar.mo49937e(AnalyticsAttributeKey.NOTIFICATION_ENTITY_ID, this.f39863d.f23730b);
        return aVar.mo49933a();
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public final void mo46007f(AppCompatActivity appCompatActivity) {
        C19034b bVar = new C19034b();
        bVar.setArguments(C19196b.m46347S1(this));
        bVar.show(appCompatActivity.getSupportFragmentManager(), C19034b.f48403k);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39862e);
    }
}
