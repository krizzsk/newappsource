package p759qw;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import ce0.C21100e;
import com.moovit.C15676b;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.surveys.SurveyManager;
import com.moovit.app.surveys.answer.SurveyEndReason;
import com.moovit.app.surveys.answer.SurveyQuestionnaireAnswer;
import com.moovit.app.surveys.data.Survey;
import com.moovit.app.surveys.view.abs.LocalSurveyType;
import java.util.Collections;
import p543hq.C17474b;
import p619kw.C18153a;
import p738pw.C19036d;

/* renamed from: qw.b */
public abstract class C19196b extends C15676b<MoovitActivity> {

    /* renamed from: h */
    public Survey.C15389Id f48801h;

    /* renamed from: i */
    public String f48802i;

    public C19196b() {
        super(MoovitActivity.class);
    }

    /* renamed from: S1 */
    public static Bundle m46347S1(Survey survey) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("surveyId", survey.f39851b);
        bundle.putString("serverContext", survey.f39852c);
        return bundle;
    }

    /* renamed from: T1 */
    public abstract String mo51492T1();

    /* renamed from: U1 */
    public abstract String mo51493U1();

    /* renamed from: V1 */
    public abstract LocalSurveyType mo51494V1();

    /* renamed from: W1 */
    public final void mo51614W1(boolean z) {
        LocalSurveyType V1 = mo51494V1();
        String str = C19036d.f48405m;
        Bundle bundle = new Bundle();
        bundle.putBoolean("requestFeedback", z);
        C21100e.m49373x(V1, "surveyType");
        bundle.putParcelable("surveyType", V1);
        C19036d dVar = new C19036d();
        dVar.setArguments(bundle);
        dVar.show(getFragmentManager(), C19036d.f48405m);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo22564R1(new C17474b(AnalyticsEventKey.SURVEY_SHOWN));
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Context context = getContext();
        if (context != null) {
            SurveyManager.m39375d(context).mo45976g(new C18153a(this.f48802i, new SurveyQuestionnaireAnswer(this.f48801h, System.currentTimeMillis(), SurveyEndReason.CANCELLED), Collections.emptyList()));
        }
        super.onCancel(dialogInterface);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle K1 = mo46752K1();
        this.f48801h = (Survey.C15389Id) K1.getParcelable("surveyId");
        this.f48802i = K1.getString("serverContext");
    }
}
