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
import com.moovit.app.linedetail.p416ui.LineDetailActivity;
import com.moovit.app.surveys.SurveyManager;
import com.moovit.app.surveys.data.Survey;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLineGroup;
import com.moovit.transit.TransitStop;
import com.moovit.util.time.Time;
import com.tranzmate.R;
import java.io.IOException;
import java.util.ArrayList;
import p001a0.C0017h;
import p067e1.C4503l0;
import p067e1.C4522y;
import p543hq.C17474b;
import p738pw.C19033a;
import p759qw.C19196b;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class TransitLineGroupLocalSurvey extends Survey {
    public static final Parcelable.Creator<TransitLineGroupLocalSurvey> CREATOR = new C15392a();

    /* renamed from: g */
    public static C15393b f39858g = new C15393b(TransitLineGroupLocalSurvey.class);

    /* renamed from: d */
    public final TransitLineGroup f39859d;

    /* renamed from: e */
    public final ServerId f39860e;

    /* renamed from: f */
    public final TransitStop f39861f;

    /* renamed from: com.moovit.app.surveys.data.TransitLineGroupLocalSurvey$a */
    public class C15392a implements Parcelable.Creator<TransitLineGroupLocalSurvey> {
        public final Object createFromParcel(Parcel parcel) {
            return (TransitLineGroupLocalSurvey) C19612n.m46981v(parcel, TransitLineGroupLocalSurvey.f39858g);
        }

        public final Object[] newArray(int i) {
            return new TransitLineGroupLocalSurvey[i];
        }
    }

    /* renamed from: com.moovit.app.surveys.data.TransitLineGroupLocalSurvey$b */
    public class C15393b extends C19619s<TransitLineGroupLocalSurvey> {
        public C15393b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            ServerId serverId;
            Survey.C15389Id.C15391b bVar = Survey.C15389Id.f39853f;
            pVar.getClass();
            Survey.C15389Id id = (Survey.C15389Id) bVar.read(pVar);
            String p = pVar.mo51947p();
            TransitLineGroup transitLineGroup = (TransitLineGroup) TransitLineGroup.f23693o.read(pVar);
            if (!pVar.mo51919b()) {
                serverId = null;
            } else {
                serverId = new ServerId(pVar.mo51924l());
            }
            return new TransitLineGroupLocalSurvey(id, p, transitLineGroup, serverId, (TransitStop) pVar.mo51962q(TransitStop.f23729s));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            TransitLineGroupLocalSurvey transitLineGroupLocalSurvey = (TransitLineGroupLocalSurvey) obj;
            Survey.C15389Id id = transitLineGroupLocalSurvey.f39851b;
            Survey.C15389Id.C15391b bVar = Survey.C15389Id.f39853f;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(id, qVar);
            qVar.mo51954p(transitLineGroupLocalSurvey.f39852c);
            TransitLineGroup transitLineGroup = transitLineGroupLocalSurvey.f39859d;
            TransitLineGroup.C7816b bVar2 = TransitLineGroup.f23692n;
            qVar.mo51939l(1);
            bVar2.mo19622a(transitLineGroup, qVar);
            ServerId serverId = transitLineGroupLocalSurvey.f39860e;
            if (serverId == null) {
                qVar.mo51934b(false);
            } else {
                qVar.mo51934b(true);
                qVar.mo51939l(serverId.f15142b);
            }
            qVar.mo51967q(transitLineGroupLocalSurvey.f39861f, TransitStop.f23728r);
        }
    }

    public TransitLineGroupLocalSurvey(Survey.C15389Id id, String str, TransitLineGroup transitLineGroup, ServerId serverId, TransitStop transitStop) {
        super(id, str);
        C21100e.m49373x(transitLineGroup, "lineGroup");
        this.f39859d = transitLineGroup;
        this.f39860e = serverId;
        this.f39861f = transitStop;
    }

    /* renamed from: b */
    public final Notification mo46004b(SurveyManager surveyManager) {
        ServerId serverId;
        CharSequence text = surveyManager.getText(R.string.user_in_app_feedback_displayed_times_android_title);
        CharSequence text2 = surveyManager.getText(R.string.user_in_app_feedback_arrival_times_android_subtitle);
        ArrayList arrayList = new ArrayList();
        Intent A0 = C14226d.m35335A0(surveyManager);
        Survey.m39400g(A0);
        arrayList.add(A0);
        ServerId serverId2 = this.f39859d.f23694b;
        ServerId serverId3 = this.f39860e;
        TransitStop transitStop = this.f39861f;
        if (transitStop != null) {
            serverId = transitStop.f23730b;
        } else {
            serverId = null;
        }
        Intent putExtra = LineDetailActivity.m38386y2(surveyManager, serverId2, serverId3, serverId, (Time) null).putExtra("extra_survey", this);
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
        aVar.mo49939g(AnalyticsAttributeKey.PUBLISHER, "line_group_satisfaction");
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, C0017h.m65V(this.f39851b.f39857e));
        aVar.mo49937e(AnalyticsAttributeKey.NOTIFICATION_ENTITY_ID, this.f39859d.f23694b);
        return aVar.mo49933a();
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public final void mo46007f(AppCompatActivity appCompatActivity) {
        C19033a aVar = new C19033a();
        aVar.setArguments(C19196b.m46347S1(this));
        aVar.show(appCompatActivity.getSupportFragmentManager(), C19033a.f48402k);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39858g);
    }
}
