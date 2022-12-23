package p714ow;

import c00.C13727i;
import c00.C13733n;
import com.google.android.gms.awareness.fence.TimeFence;
import com.moovit.app.surveys.answer.SurveyQuestionnaireAnswer;
import com.moovit.database.DbEntityRef;
import com.moovit.network.model.ServerId;
import com.moovit.payment.gateway.PaymentGatewayFragment;
import com.moovit.sdk.profilers.schedule.ScheduleBasedProfiler;
import com.moovit.transit.TransitStop;
import com.tranzmate.moovit.protocol.surveys.MVSurveyContext;
import com.tranzmate.moovit.protocol.surveys.MVSurveyType;
import com.tranzmate.moovit.protocol.ticketingV2.MVTicket;
import java.util.Arrays;
import java.util.TimeZone;
import p595jw.C17948a;
import p798sn.C19494b;
import p810sz.C19617r;
import q80.C13036y;
import s80.C13065d;
import t70.C19639a;

/* renamed from: ow.a */
public final /* synthetic */ class C18847a implements C13733n {

    /* renamed from: b */
    public final /* synthetic */ int f47988b;

    public /* synthetic */ C18847a(int i) {
        this.f47988b = i;
    }

    public final Object convert(Object obj) {
        switch (this.f47988b) {
            case 0:
                SurveyQuestionnaireAnswer surveyQuestionnaireAnswer = (SurveyQuestionnaireAnswer) obj;
                C19617r rVar = C17948a.f46011a;
                MVSurveyType c = C17948a.m44576c(surveyQuestionnaireAnswer.f39842b.f39857e);
                long j = surveyQuestionnaireAnswer.f39843c;
                int i = surveyQuestionnaireAnswer.f39842b.f39854b.f15142b;
                MVSurveyContext mVSurveyContext = new MVSurveyContext();
                mVSurveyContext.type = c;
                mVSurveyContext.lastSeenTime = j;
                mVSurveyContext.mo31944j();
                mVSurveyContext.metroAreaId = i;
                mVSurveyContext.mo31945k();
                mVSurveyContext.endReason = C17948a.m44575b(surveyQuestionnaireAnswer.f39844d);
                return mVSurveyContext;
            case 1:
                return Integer.valueOf(((ServerId) obj).f15142b);
            case 2:
                return DbEntityRef.newTransitStopRef((TransitStop) obj);
            case 3:
                return ((ServerId) obj).mo19751c();
            case 4:
                return ((PaymentGatewayFragment.C16322a) obj).mo23109n0();
            case 5:
                C19639a aVar = (C19639a) obj;
                return TimeFence.inIntervalOfDay(ScheduleBasedProfiler.f43046n[aVar.f49828a - 1], TimeZone.getDefault(), (long) aVar.f49829b, (long) aVar.f49830c);
            case 6:
                C19617r rVar2 = C13036y.f32248a;
                return C13036y.m32955g(((MVTicket) obj).status);
            default:
                C19494b bVar = (C19494b) obj;
                ServerId serverId = C13065d.f32318d;
                return new C13727i(Arrays.asList(new Iterable[]{bVar.f49582a, bVar.f49583b, bVar.f49584c}));
        }
    }
}
