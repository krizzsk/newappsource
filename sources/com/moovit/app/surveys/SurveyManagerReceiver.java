package com.moovit.app.surveys;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationManagerCompat;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.app.surveys.answer.SurveyEndReason;
import com.moovit.app.surveys.answer.SurveyQuestionnaireAnswer;
import com.moovit.app.surveys.data.Survey;
import com.moovit.util.SafeBroadcastReceiver;
import com.tranzmate.R;
import java.util.Collections;
import p269u2.C6677a;
import p389bl.C13641g;
import p543hq.C17474b;
import p567iq.C17635b;
import p595jw.C17948a;
import p619kw.C18153a;

public class SurveyManagerReceiver extends SafeBroadcastReceiver {

    /* renamed from: a */
    public static final String f39830a;

    /* renamed from: b */
    public static final String f39831b;

    /* renamed from: c */
    public static final String f39832c;

    static {
        String name = SurveyManagerReceiver.class.getName();
        f39830a = C25541a.m63881k(name, ".action.survey_notification_alarm");
        f39831b = C25541a.m63881k(name, ".action.survey_notification_dismissed");
        f39832c = C25541a.m63881k(name, ".extra.survey");
    }

    /* renamed from: a */
    public final void mo24574a(Context context, Intent intent) {
        Survey survey = (Survey) C13641g.m34120h(intent.getByteArrayExtra(f39832c), C17948a.f46011a);
        String action = intent.getAction();
        if (f39830a.equals(action)) {
            SurveyManager d = SurveyManager.m39375d(context);
            d.f39829h.mo50474b();
            NotificationManagerCompat.from(d).notify(R.id.survey_notification_id, survey.mo46004b(d));
            C6677a aVar = C17635b.m43779f(d).f50173c;
            AnalyticsFlowKey analyticsFlowKey = AnalyticsFlowKey.SURVEY_NOTIFICATION;
            C17474b[] bVarArr = {survey.mo46005d()};
            aVar.getClass();
            C6677a.m15759j(d, analyticsFlowKey, true, bVarArr);
        } else if (f39831b.equals(action)) {
            SurveyManager d2 = SurveyManager.m39375d(context);
            d2.mo45977h();
            d2.f39829h.mo50474b();
            d2.mo45976g(new C18153a(survey.f39852c, new SurveyQuestionnaireAnswer(survey.f39851b, System.currentTimeMillis(), SurveyEndReason.NOTIFICATION_DISMISSED), Collections.emptyList()));
        }
    }
}
