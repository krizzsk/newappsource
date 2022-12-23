package p595jw;

import android.content.Context;
import ce0.C21100e;
import com.moovit.app.surveys.answer.SurveyQuestionnaireAnswer;
import com.usebutton.sdk.internal.api.AppActionRequest;
import f00.C16919g;
import java.util.ArrayList;
import java.util.List;
import p389bl.C13641g;
import p810sz.C19575a;

/* renamed from: jw.b */
public final class C17950b {

    /* renamed from: a */
    public final Context f46016a;

    /* renamed from: b */
    public final C16919g.C16925f f46017b = new C16919g.C16925f("last_shown_survey_timestamp", 0);

    public C17950b(Context context) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f46016a = context;
    }

    /* renamed from: a */
    public final List<SurveyQuestionnaireAnswer> mo50473a() {
        C21100e.m49355o();
        List<SurveyQuestionnaireAnswer> list = (List) C13641g.m34133v(this.f46016a, "survey_questionnaire_answers", C19575a.m46957a(SurveyQuestionnaireAnswer.f39841f, true));
        if (list != null) {
            return list;
        }
        return new ArrayList(1);
    }

    /* renamed from: b */
    public final void mo50474b() {
        this.f46017b.mo49545d(this.f46016a.getSharedPreferences("survey_store", 0), Long.valueOf(System.currentTimeMillis()));
    }
}
