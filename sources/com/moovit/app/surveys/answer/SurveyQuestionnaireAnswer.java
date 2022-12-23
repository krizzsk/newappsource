package com.moovit.app.surveys.answer;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.app.surveys.data.Survey;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19620t;
import p810sz.C19621u;

public class SurveyQuestionnaireAnswer implements Parcelable {
    public static final Parcelable.Creator<SurveyQuestionnaireAnswer> CREATOR = new C15381a();

    /* renamed from: e */
    public static final C15382b f39840e = new C15382b();

    /* renamed from: f */
    public static final C15383c f39841f = new C15383c(SurveyQuestionnaireAnswer.class);

    /* renamed from: b */
    public final Survey.C15389Id f39842b;

    /* renamed from: c */
    public final long f39843c;

    /* renamed from: d */
    public final SurveyEndReason f39844d;

    /* renamed from: com.moovit.app.surveys.answer.SurveyQuestionnaireAnswer$a */
    public class C15381a implements Parcelable.Creator<SurveyQuestionnaireAnswer> {
        public final Object createFromParcel(Parcel parcel) {
            return (SurveyQuestionnaireAnswer) C19612n.m46981v(parcel, SurveyQuestionnaireAnswer.f39841f);
        }

        public final Object[] newArray(int i) {
            return new SurveyQuestionnaireAnswer[i];
        }
    }

    /* renamed from: com.moovit.app.surveys.answer.SurveyQuestionnaireAnswer$b */
    public class C15382b extends C19621u<SurveyQuestionnaireAnswer> {
        public C15382b() {
            super(0);
        }

        /* renamed from: a */
        public final void mo19622a(Object obj, C19616q qVar) throws IOException {
            SurveyQuestionnaireAnswer surveyQuestionnaireAnswer = (SurveyQuestionnaireAnswer) obj;
            Survey.C15389Id id = surveyQuestionnaireAnswer.f39842b;
            Survey.C15389Id.C15391b bVar = Survey.C15389Id.f39853f;
            qVar.getClass();
            qVar.mo51939l(bVar.f49802v);
            bVar.mo179c(id, qVar);
            qVar.mo51940m(surveyQuestionnaireAnswer.f39843c);
            SurveyEndReason.CODER.write(surveyQuestionnaireAnswer.f39844d, qVar);
        }
    }

    /* renamed from: com.moovit.app.surveys.answer.SurveyQuestionnaireAnswer$c */
    public class C15383c extends C19620t<SurveyQuestionnaireAnswer> {
        public C15383c(Class cls) {
            super(cls);
        }

        /* renamed from: a */
        public final boolean mo19623a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo19624b(C19615p pVar, int i) throws IOException {
            Survey.C15389Id.C15391b bVar = Survey.C15389Id.f39853f;
            pVar.getClass();
            return new SurveyQuestionnaireAnswer((Survey.C15389Id) bVar.read(pVar), pVar.mo51925m(), (SurveyEndReason) C13555b.m33968g(SurveyEndReason.CODER, pVar));
        }
    }

    public SurveyQuestionnaireAnswer(Survey.C15389Id id, long j, SurveyEndReason surveyEndReason) {
        C21100e.m49373x(id, "surveyId");
        this.f39842b = id;
        this.f39843c = j;
        C21100e.m49373x(surveyEndReason, "surveyEndReason");
        this.f39844d = surveyEndReason;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("SurveyQuestionnaireAnswer[");
        k.append(this.f39842b);
        k.append(", ");
        k.append(this.f39844d);
        k.append("]");
        return k.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39840e);
    }
}
