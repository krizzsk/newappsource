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
import com.moovit.app.history.TripHistoryActivity;
import com.moovit.app.history.model.HistoryItem;
import com.moovit.app.surveys.SurveyManager;
import com.moovit.app.surveys.data.Survey;
import com.moovit.itinerary.model.Itinerary;
import com.tranzmate.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p001a0.C0017h;
import p067e1.C4503l0;
import p067e1.C4522y;
import p372at.C13520f;
import p543hq.C17474b;
import p738pw.C19035c;
import p759qw.C19196b;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p922xr.C20563b;
import p977zz.C20927a0;

public class SuggestedRoutesLocalSurvey extends Survey {
    public static final Parcelable.Creator<SuggestedRoutesLocalSurvey> CREATOR = new C15387a();

    /* renamed from: e */
    public static C15388b f39849e = new C15388b(SuggestedRoutesLocalSurvey.class);

    /* renamed from: d */
    public final HistoryItem f39850d;

    /* renamed from: com.moovit.app.surveys.data.SuggestedRoutesLocalSurvey$a */
    public class C15387a implements Parcelable.Creator<SuggestedRoutesLocalSurvey> {
        public final Object createFromParcel(Parcel parcel) {
            return (SuggestedRoutesLocalSurvey) C19612n.m46981v(parcel, SuggestedRoutesLocalSurvey.f39849e);
        }

        public final Object[] newArray(int i) {
            return new SuggestedRoutesLocalSurvey[i];
        }
    }

    /* renamed from: com.moovit.app.surveys.data.SuggestedRoutesLocalSurvey$b */
    public class C15388b extends C19619s<SuggestedRoutesLocalSurvey> {
        public C15388b(Class cls) {
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
            return new SuggestedRoutesLocalSurvey((Survey.C15389Id) bVar.read(pVar), pVar.mo51947p(), (HistoryItem) C20563b.f52015c.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            SuggestedRoutesLocalSurvey suggestedRoutesLocalSurvey = (SuggestedRoutesLocalSurvey) obj;
            Survey.C15389Id id = suggestedRoutesLocalSurvey.f39851b;
            Survey.C15389Id.C15391b bVar = Survey.C15389Id.f39853f;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(id, qVar);
            qVar.mo51954p(suggestedRoutesLocalSurvey.f39852c);
            C20563b.f52015c.write(suggestedRoutesLocalSurvey.f39850d, qVar);
        }
    }

    public SuggestedRoutesLocalSurvey(Survey.C15389Id id, String str, HistoryItem historyItem) {
        super(id, str);
        C21100e.m49373x(historyItem, "historyItem");
        this.f39850d = historyItem;
    }

    /* renamed from: b */
    public final Notification mo46004b(SurveyManager surveyManager) {
        String string = surveyManager.getString(R.string.user_in_app_suggested_routes_android_title);
        CharSequence text = surveyManager.getText(R.string.user_in_app_suggested_routes_android_subtitle);
        ArrayList arrayList = new ArrayList();
        Intent A0 = C14226d.m35335A0(surveyManager);
        Survey.m39400g(A0);
        arrayList.add(A0);
        String id = this.f39850d.getId();
        int i = TripHistoryActivity.f38127U;
        Intent intent = new Intent(surveyManager, TripHistoryActivity.class);
        intent.putExtra("historyItemId", id);
        Intent putExtra = intent.putExtra("extra_survey", this);
        Survey.m39400g(putExtra);
        arrayList.add(putExtra);
        int e = C20927a0.m49010e(134217728);
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            PendingIntent a = C4503l0.C4504a.m11737a(surveyManager, 0, intentArr, e, (Bundle) null);
            C4522y c = mo46011c(surveyManager);
            c.mo20032d(string);
            c.mo20031c(text);
            c.mo20038j(string);
            c.f15626g = a;
            return c.mo20030a();
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }

    /* renamed from: d */
    public final C17474b mo46005d() {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SURVEY_NOTIFICATION_RECEIVED);
        aVar.mo49939g(AnalyticsAttributeKey.PUBLISHER, "suggested_routes_satisfaction");
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, C0017h.m65V(this.f39851b.f39857e));
        aVar.mo49939g(AnalyticsAttributeKey.NOTIFICATION_ENTITY_ID, ((Itinerary) ((List) this.f39850d.mo45080Z1(new C13520f())).get(0)).f41894b);
        return aVar.mo49933a();
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public final void mo46007f(AppCompatActivity appCompatActivity) {
        String str = C19035c.f48404k;
        Bundle S1 = C19196b.m46347S1(this);
        C19035c cVar = new C19035c();
        cVar.setArguments(S1);
        cVar.show(appCompatActivity.getSupportFragmentManager(), C19035c.f48404k);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39849e);
    }
}
