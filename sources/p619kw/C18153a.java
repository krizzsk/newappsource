package p619kw;

import ce0.C21100e;
import com.moovit.app.surveys.answer.SurveyQuestionAnswer;
import com.moovit.app.surveys.answer.SurveyQuestionnaireAnswer;
import java.util.List;

/* renamed from: kw.a */
public final class C18153a {

    /* renamed from: a */
    public final String f46384a;

    /* renamed from: b */
    public final SurveyQuestionnaireAnswer f46385b;

    /* renamed from: c */
    public final List<SurveyQuestionAnswer> f46386c;

    public C18153a(String str, SurveyQuestionnaireAnswer surveyQuestionnaireAnswer, List<SurveyQuestionAnswer> list) {
        C21100e.m49373x(str, "serverContext");
        this.f46384a = str;
        this.f46385b = surveyQuestionnaireAnswer;
        C21100e.m49373x(list, "questionAnswers");
        this.f46386c = list;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("SurveyQuestionnaireResult[");
        k.append(this.f46385b);
        k.append(", size=");
        k.append(this.f46386c.size());
        k.append("]");
        return k.toString();
    }
}
