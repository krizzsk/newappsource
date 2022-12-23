package p619kw;

import android.content.Context;
import c00.C13720d;
import c00.C13722f;
import com.moovit.app.surveys.answer.SurveyQuestionnaireAnswer;
import com.moovit.app.surveys.data.Survey;
import com.tranzmate.moovit.protocol.common.MVVersion;
import com.tranzmate.moovit.protocol.kinesis.MVQuestionnaireResult;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;
import com.tranzmate.moovit.protocol.surveys.MVEndReason;
import com.tranzmate.moovit.protocol.surveys.MVSurveyType;
import com.tranzmate.moovit.protocol.users.MVUpdateVersionRequest;
import java.util.ArrayList;
import org.apache.thrift.TBase;
import p401bz.C13712f;
import p595jw.C17948a;
import p638lr.C18267n;
import p810sz.C19617r;
import p977zz.C20964s0;
import p977zz.C20975x0;

/* renamed from: kw.b */
public class C18154b extends C13712f {

    /* renamed from: c */
    public final /* synthetic */ int f46387c = 1;

    /* renamed from: d */
    public final Object f46388d;

    public C18154b(Context context, C18153a aVar) {
        super(context);
        this.f46388d = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ TBase mo21426a() {
        switch (this.f46387c) {
            case 0:
                return mo50581k();
            default:
                return mo50581k();
        }
    }

    /* renamed from: e */
    public MVUpdateVersionRequest mo50580e() {
        String[] A = C20964s0.m49080A((String) this.f46388d, '.');
        int[] iArr = new int[4];
        for (int i = 0; i < A.length; i++) {
            iArr[i] = Integer.valueOf(A[i]).intValue();
        }
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        MVVersion mVVersion = new MVVersion();
        mVVersion.major = i2;
        mVVersion.mo26463k();
        mVVersion.minor = i3;
        mVVersion.mo26464l();
        mVVersion.build = i4;
        mVVersion.mo26462j();
        mVVersion.revision = i5;
        mVVersion.mo26465m();
        String f = C20975x0.m49119f(this.f33791b);
        MVUpdateVersionRequest mVUpdateVersionRequest = new MVUpdateVersionRequest();
        mVUpdateVersionRequest.newClientVersion = mVVersion;
        mVUpdateVersionRequest.androidId = f;
        return mVUpdateVersionRequest;
    }

    /* renamed from: k */
    public final MVServerMessage mo50581k() {
        switch (this.f46387c) {
            case 0:
                C18153a aVar = (C18153a) this.f46388d;
                C19617r rVar = C17948a.f46011a;
                SurveyQuestionnaireAnswer surveyQuestionnaireAnswer = aVar.f46385b;
                long j = surveyQuestionnaireAnswer.f39843c;
                Survey.C15389Id id = surveyQuestionnaireAnswer.f39842b;
                int i = id.f39855c.f15142b;
                MVSurveyType c = C17948a.m44576c(id.f39857e);
                MVEndReason b = C17948a.m44575b(aVar.f46385b.f39844d);
                String str = aVar.f46384a;
                ArrayList<O> c2 = C13720d.m34273c(aVar.f46386c, (C13722f) null, new C18267n(7));
                MVQuestionnaireResult mVQuestionnaireResult = new MVQuestionnaireResult();
                mVQuestionnaireResult.timestamp = j;
                mVQuestionnaireResult.mo27905o();
                mVQuestionnaireResult.questionnaireId = i;
                mVQuestionnaireResult.mo27904m();
                mVQuestionnaireResult.surveyType = c;
                mVQuestionnaireResult.endReason = b;
                mVQuestionnaireResult.surveyContext = str;
                mVQuestionnaireResult.answers = c2;
                String str2 = aVar.f46385b.f39842b.f39856d;
                if (str2 != null) {
                    mVQuestionnaireResult.questionnaireVersion = str2;
                }
                MVServerMessage mVServerMessage = new MVServerMessage();
                mVServerMessage.setField_ = MVServerMessage._Fields.QUESTIONNAIRE_RESULT;
                mVServerMessage.value_ = mVQuestionnaireResult;
                return mVServerMessage;
            default:
                MVUpdateVersionRequest e = mo50580e();
                MVServerMessage mVServerMessage2 = new MVServerMessage();
                e.getClass();
                mVServerMessage2.setField_ = MVServerMessage._Fields.UPGRADE_VERSION;
                mVServerMessage2.value_ = e;
                return mVServerMessage2;
        }
    }

    public C18154b(Context context) {
        super(context);
        this.f46388d = "5.108.1.564";
    }
}
