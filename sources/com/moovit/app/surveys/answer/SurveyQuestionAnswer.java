package com.moovit.app.surveys.answer;

import android.os.Parcel;
import android.os.Parcelable;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import p810sz.C19612n;
import p810sz.C19613o;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

public class SurveyQuestionAnswer implements Parcelable {
    public static final Parcelable.Creator<SurveyQuestionAnswer> CREATOR = new C15379a();

    /* renamed from: f */
    public static C15380b f39835f = new C15380b(SurveyQuestionAnswer.class);

    /* renamed from: b */
    public final ServerId f39836b;

    /* renamed from: c */
    public final ServerId f39837c;

    /* renamed from: d */
    public final ServerId f39838d;

    /* renamed from: e */
    public final String f39839e;

    /* renamed from: com.moovit.app.surveys.answer.SurveyQuestionAnswer$a */
    public class C15379a implements Parcelable.Creator<SurveyQuestionAnswer> {
        public final Object createFromParcel(Parcel parcel) {
            return (SurveyQuestionAnswer) C19612n.m46981v(parcel, SurveyQuestionAnswer.f39835f);
        }

        public final Object[] newArray(int i) {
            return new SurveyQuestionAnswer[i];
        }
    }

    /* renamed from: com.moovit.app.surveys.answer.SurveyQuestionAnswer$b */
    public class C15380b extends C19619s<SurveyQuestionAnswer> {
        public C15380b(Class cls) {
            super(0, cls);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            pVar.getClass();
            return new SurveyQuestionAnswer(new ServerId(pVar.mo51924l()), new ServerId(pVar.mo51924l()), new ServerId(pVar.mo51924l()), pVar.mo51947p());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            SurveyQuestionAnswer surveyQuestionAnswer = (SurveyQuestionAnswer) obj;
            ServerId serverId = surveyQuestionAnswer.f39836b;
            qVar.getClass();
            qVar.mo51939l(serverId.f15142b);
            qVar.mo51939l(surveyQuestionAnswer.f39837c.f15142b);
            qVar.mo51939l(surveyQuestionAnswer.f39838d.f15142b);
            qVar.mo51954p(surveyQuestionAnswer.f39839e);
        }
    }

    public SurveyQuestionAnswer(ServerId serverId, ServerId serverId2, ServerId serverId3, String str) {
        C21100e.m49373x(serverId, "nodeId");
        this.f39836b = serverId;
        C21100e.m49373x(serverId2, "questionId");
        this.f39837c = serverId2;
        C21100e.m49373x(serverId3, "answerId");
        this.f39838d = serverId3;
        C21100e.m49373x(str, "answerValue");
        this.f39839e = str;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C19613o.m46994v(parcel, this, f39835f);
    }
}
