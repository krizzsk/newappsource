package p401bz;

import android.content.Context;
import ce0.C21100e;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;
import com.tranzmate.moovit.protocol.kinesis.MVSurveyAnswers;
import java.util.Map;
import org.apache.thrift.TBase;

/* renamed from: bz.g */
public final class C13713g extends C13712f {

    /* renamed from: c */
    public final int f33789c;

    /* renamed from: d */
    public final Map<String, String> f33790d;

    public C13713g(Context context, int i, Map<String, String> map) {
        super(context);
        Integer valueOf = Integer.valueOf(i);
        C21100e.m49373x(valueOf, "id");
        this.f33789c = valueOf.intValue();
        C21100e.m49373x(map, "answers");
        this.f33790d = map;
    }

    /* renamed from: a */
    public final TBase mo21426a() {
        int i = this.f33789c;
        Map<String, String> map = this.f33790d;
        MVSurveyAnswers mVSurveyAnswers = new MVSurveyAnswers();
        mVSurveyAnswers.surveyId = i;
        mVSurveyAnswers.mo27938h();
        mVSurveyAnswers.q2answer = map;
        MVServerMessage mVServerMessage = new MVServerMessage();
        mVServerMessage.setField_ = MVServerMessage._Fields.SURVEY_ANSWERS;
        mVServerMessage.value_ = mVSurveyAnswers;
        return mVServerMessage;
    }
}
