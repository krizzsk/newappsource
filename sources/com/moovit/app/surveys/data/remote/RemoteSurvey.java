package com.moovit.app.surveys.data.remote;

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
import com.moovit.app.surveys.SurveyContainerActivity;
import com.moovit.app.surveys.SurveyManager;
import com.moovit.app.surveys.data.Survey;
import com.moovit.app.surveys.data.remote.SurveyQuestionTreeNode;
import java.io.IOException;
import java.util.ArrayList;
import p001a0.C0017h;
import p067e1.C4503l0;
import p067e1.C4522y;
import p543hq.C17474b;
import p783rw.C19371c;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;
import p977zz.C20927a0;

public class RemoteSurvey extends Survey {
    public static final Parcelable.Creator<RemoteSurvey> CREATOR = new C15396a();

    /* renamed from: g */
    public static C15397b f39864g = new C15397b(RemoteSurvey.class);

    /* renamed from: d */
    public final String f39865d;

    /* renamed from: e */
    public final String f39866e;

    /* renamed from: f */
    public final SurveyQuestionTreeNode f39867f;

    /* renamed from: com.moovit.app.surveys.data.remote.RemoteSurvey$a */
    public class C15396a implements Parcelable.Creator<RemoteSurvey> {
        public final Object createFromParcel(Parcel parcel) {
            return (RemoteSurvey) C19612n.m46981v(parcel, RemoteSurvey.f39864g);
        }

        public final Object[] newArray(int i) {
            return new RemoteSurvey[i];
        }
    }

    /* renamed from: com.moovit.app.surveys.data.remote.RemoteSurvey$b */
    public class C15397b extends C19619s<RemoteSurvey> {
        public C15397b(Class cls) {
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
            return new RemoteSurvey((Survey.C15389Id) bVar.read(pVar), pVar.mo51947p(), pVar.mo51947p(), pVar.mo51948t(), (SurveyQuestionTreeNode) SurveyQuestionTreeNode.f39874f.read(pVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            RemoteSurvey remoteSurvey = (RemoteSurvey) obj;
            Parcelable.Creator<RemoteSurvey> creator = RemoteSurvey.CREATOR;
            Survey.C15389Id id = remoteSurvey.f39851b;
            Survey.C15389Id.C15391b bVar = Survey.C15389Id.f39853f;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(id, qVar);
            qVar.mo51954p(remoteSurvey.f39852c);
            qVar.mo51954p(remoteSurvey.f39865d);
            qVar.mo51955t(remoteSurvey.f39866e);
            SurveyQuestionTreeNode surveyQuestionTreeNode = remoteSurvey.f39867f;
            SurveyQuestionTreeNode.C15401b bVar2 = SurveyQuestionTreeNode.f39874f;
            qVar.mo51939l(bVar2.f49802v);
            bVar2.mo179c(surveyQuestionTreeNode, qVar);
        }
    }

    public RemoteSurvey(Survey.C15389Id id, String str, String str2, String str3, SurveyQuestionTreeNode surveyQuestionTreeNode) {
        super(id, str);
        C21100e.m49373x(str2, "notificationTitle");
        this.f39865d = str2;
        this.f39866e = str3;
        C21100e.m49373x(surveyQuestionTreeNode, "surveyRoot");
        this.f39867f = surveyQuestionTreeNode;
    }

    /* renamed from: b */
    public final Notification mo46004b(SurveyManager surveyManager) {
        ArrayList arrayList = new ArrayList();
        Intent A0 = C14226d.m35335A0(surveyManager);
        Survey.m39400g(A0);
        arrayList.add(A0);
        int i = SurveyContainerActivity.f39827U;
        Intent putExtra = new Intent(surveyManager, SurveyContainerActivity.class).putExtra("extra_survey", this);
        Survey.m39400g(putExtra);
        arrayList.add(putExtra);
        int e = C20927a0.m49010e(134217728);
        if (!arrayList.isEmpty()) {
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            PendingIntent a = C4503l0.C4504a.m11737a(surveyManager, 0, intentArr, e, (Bundle) null);
            C4522y c = mo46011c(surveyManager);
            c.mo20032d(this.f39865d);
            c.mo20031c(this.f39866e);
            c.mo20038j(this.f39865d);
            c.f15626g = a;
            return c.mo20030a();
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }

    /* renamed from: d */
    public final C17474b mo46005d() {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SURVEY_NOTIFICATION_RECEIVED);
        aVar.mo49939g(AnalyticsAttributeKey.PUBLISHER, "remote");
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, C0017h.m65V(this.f39851b.f39857e));
        return aVar.mo49933a();
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: f */
    public final void mo46007f(AppCompatActivity appCompatActivity) {
        String str = C19371c.f49287l;
        Bundle bundle = new Bundle();
        bundle.putParcelable("survey", this);
        C19371c cVar = new C19371c();
        cVar.setArguments(bundle);
        cVar.show(appCompatActivity.getSupportFragmentManager(), C19371c.f49287l);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39864g);
    }
}
