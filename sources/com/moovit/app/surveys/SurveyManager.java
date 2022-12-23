package com.moovit.app.surveys;

import android.app.AlarmManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.JobIntentService;
import androidx.lifecycle.C1031o;
import androidx.lifecycle.C1045x;
import androidx.lifecycle.Lifecycle;
import c00.C13717b;
import com.moovit.app.general.settings.notifications.UserNotificationSetting;
import com.moovit.app.surveys.answer.SurveyQuestionnaireAnswer;
import com.moovit.app.surveys.data.Survey;
import com.tranzmate.R;
import java.util.ArrayList;
import p067e1.C4486g;
import p175n.C5768c;
import p389bl.C13641g;
import p567iq.C17635b;
import p595jw.C17948a;
import p595jw.C17950b;
import p619kw.C18153a;
import p619kw.C18154b;
import p690nw.C18641a;
import p734ps.C18977e;
import p977zz.C20927a0;

public class SurveyManager extends C5768c implements C1031o {

    /* renamed from: i */
    public static SurveyManager f39828i;

    /* renamed from: h */
    public final C17950b f39829h = new C17950b(this);

    public SurveyManager(Context context) {
        super(context.getApplicationContext(), (int) R.style.MoovitTheme);
    }

    /* renamed from: d */
    public static SurveyManager m39375d(Context context) {
        if (f39828i == null) {
            synchronized (SurveyManager.class) {
                if (f39828i == null) {
                    f39828i = new SurveyManager(context);
                }
            }
        }
        return f39828i;
    }

    /* renamed from: g */
    public final void mo45976g(C18153a aVar) {
        C17635b.m43779f(this).f50172b.mo42913b(new C18154b(this, aVar), true);
        SurveyQuestionnaireAnswer surveyQuestionnaireAnswer = aVar.f46385b;
        int i = SurveyManagerWorker.f39833l;
        Intent intent = new Intent("com.moovit.survey_manager_worker.action.log_survey_answer");
        intent.putExtra("com.moovit.survey_manager_worker.extra.questionnaire_answer", surveyQuestionnaireAnswer);
        JobIntentService.m2303a(this, SurveyManagerWorker.class, 52468, intent);
    }

    /* renamed from: h */
    public final void mo45977h() {
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancel(R.id.survey_notification_id);
        }
        mo45978i((Survey) null, 0);
    }

    /* renamed from: i */
    public final void mo45978i(Survey survey, long j) {
        Bundle bundle;
        AlarmManager alarmManager = (AlarmManager) getSystemService("alarm");
        if (alarmManager != null) {
            String str = SurveyManagerReceiver.f39830a;
            Class<SurveyManagerReceiver> cls = SurveyManagerReceiver.class;
            String str2 = SurveyManagerReceiver.f39830a;
            if (survey == null) {
                bundle = null;
            } else {
                bundle = new Bundle(1);
                bundle.putByteArray(SurveyManagerReceiver.f39832c, C13641g.m34110B(survey, C17948a.f46011a));
            }
            PendingIntent c = C20927a0.m49008c(this, cls, str2, bundle, (Uri) null);
            if (survey == null) {
                alarmManager.cancel(c);
            } else if (Build.VERSION.SDK_INT >= 23) {
                C4486g.m11708a(alarmManager, 0, j, c);
            } else {
                alarmManager.set(0, j, c);
            }
        }
    }

    @C1045x(Lifecycle.Event.ON_START)
    public void onApplicationStart() {
        mo45978i((Survey) null, 0);
    }

    @C1045x(Lifecycle.Event.ON_STOP)
    public void onApplicationStop() {
        ArrayList arrayList;
        boolean equals = Boolean.TRUE.equals(C18977e.m46090a(this).mo51488b().get(UserNotificationSetting.PushNotificationNewsAndUpdate));
        C18641a aVar = C18641a.f47503b;
        synchronized (aVar) {
            C13717b.m34269p(aVar.f47504a);
            arrayList = new ArrayList(aVar.f47504a);
            aVar.f47504a.clear();
        }
        if (!arrayList.isEmpty() && equals) {
            int i = SurveyManagerWorker.f39833l;
            Intent intent = new Intent("com.moovit.survey_manager_worker.action.request_survey");
            intent.putParcelableArrayListExtra("com.moovit.survey_manager_worker.extra.events", C13717b.m34264k(arrayList));
            JobIntentService.m2303a(this, SurveyManagerWorker.class, 52468, intent);
        }
        arrayList.size();
    }
}
