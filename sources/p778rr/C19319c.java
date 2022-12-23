package p778rr;

import android.content.Context;
import ce0.C21100e;
import com.appboy.models.InAppMessageBase;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.carpool.MVCarPoolDidntBookAnswer;
import com.tranzmate.moovit.protocol.carpool.MVCarPoolSurveyAnswer;
import com.tranzmate.moovit.protocol.kinesis.MVServerMessage;
import org.apache.thrift.TBase;
import p401bz.C13712f;

/* renamed from: rr.c */
public final class C19319c extends C13712f {

    /* renamed from: c */
    public ServerId f49165c;

    /* renamed from: d */
    public String f49166d;

    public C19319c(Context context, ServerId serverId, String str) {
        super(context);
        this.f49165c = serverId;
        C21100e.m49373x(str, InAppMessageBase.MESSAGE);
        this.f49166d = str;
    }

    /* renamed from: a */
    public final TBase mo21426a() {
        int i = this.f49165c.f15142b;
        String str = this.f49166d;
        MVCarPoolDidntBookAnswer mVCarPoolDidntBookAnswer = new MVCarPoolDidntBookAnswer();
        mVCarPoolDidntBookAnswer.rideId = i;
        mVCarPoolDidntBookAnswer.mo25457h();
        mVCarPoolDidntBookAnswer.surveyText = str;
        MVCarPoolSurveyAnswer mVCarPoolSurveyAnswer = new MVCarPoolSurveyAnswer();
        mVCarPoolSurveyAnswer.setField_ = MVCarPoolSurveyAnswer._Fields.CAR_POOL_DIDNT_BOOK_ANSWER;
        mVCarPoolSurveyAnswer.value_ = mVCarPoolDidntBookAnswer;
        MVServerMessage mVServerMessage = new MVServerMessage();
        mVServerMessage.setField_ = MVServerMessage._Fields.CAR_POOL_RIDE_SURVEY;
        mVServerMessage.value_ = mVCarPoolSurveyAnswer;
        return mVServerMessage;
    }
}
