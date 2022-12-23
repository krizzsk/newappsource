package p595jw;

import com.moovit.app.history.model.HistoryItem;
import com.moovit.app.surveys.SurveyType;
import com.moovit.app.surveys.answer.SurveyEndReason;
import com.moovit.app.surveys.data.SuggestedRoutesLocalSurvey;
import com.moovit.app.surveys.data.TransitLineGroupLocalSurvey;
import com.moovit.app.surveys.data.TransitStopLocalSurvey;
import com.moovit.app.surveys.data.remote.RemoteSurvey;
import com.moovit.app.surveys.recorder.events.SurveyEvent;
import com.moovit.app.surveys.recorder.events.SurveyLineGroupEvent;
import com.moovit.app.surveys.recorder.events.SurveyStopEvent;
import com.moovit.app.surveys.recorder.events.SurveySuggestedRoutesEvent;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.metroentities.MetroEntityType;
import com.tranzmate.moovit.protocol.surveys.MVEndReason;
import com.tranzmate.moovit.protocol.surveys.MVSurveyType;
import e20.C16776h;
import i30.C5269e;
import java.util.List;
import p372at.C13520f;
import p810sz.C19617r;

/* renamed from: jw.a */
public final class C17948a {

    /* renamed from: a */
    public static final C19617r f46011a;

    /* renamed from: jw.a$a */
    public static /* synthetic */ class C17949a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f46012a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f46013b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f46014c;

        /* renamed from: d */
        public static final /* synthetic */ int[] f46015d;

        /* JADX WARNING: Can't wrap try/catch for region: R(34:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|(2:23|24)|25|27|28|29|30|31|32|33|34|35|37|38|39|40|41|42|(3:43|44|46)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Can't wrap try/catch for region: R(40:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|27|28|29|30|31|32|33|34|35|37|38|39|40|41|42|43|44|46) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x0087 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00a2 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00ac */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00b6 */
        static {
            /*
                com.tranzmate.moovit.protocol.surveys.MVSurveyType[] r0 = com.tranzmate.moovit.protocol.surveys.MVSurveyType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f46015d = r0
                r1 = 1
                com.tranzmate.moovit.protocol.surveys.MVSurveyType r2 = com.tranzmate.moovit.protocol.surveys.MVSurveyType.StopView     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f46015d     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tranzmate.moovit.protocol.surveys.MVSurveyType r3 = com.tranzmate.moovit.protocol.surveys.MVSurveyType.LineView     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f46015d     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tranzmate.moovit.protocol.surveys.MVSurveyType r4 = com.tranzmate.moovit.protocol.surveys.MVSurveyType.SuggestedRoutes     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f46015d     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tranzmate.moovit.protocol.surveys.MVSurveyType r5 = com.tranzmate.moovit.protocol.surveys.MVSurveyType.Itinerary     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                com.moovit.app.surveys.SurveyType[] r4 = com.moovit.app.surveys.SurveyType.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f46014c = r4
                com.moovit.app.surveys.SurveyType r5 = com.moovit.app.surveys.SurveyType.LINE_GROUP     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r4 = f46014c     // Catch:{ NoSuchFieldError -> 0x004e }
                com.moovit.app.surveys.SurveyType r5 = com.moovit.app.surveys.SurveyType.STOP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r4 = f46014c     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.moovit.app.surveys.SurveyType r5 = com.moovit.app.surveys.SurveyType.SUGGESTED_ROUTES     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r4 = f46014c     // Catch:{ NoSuchFieldError -> 0x0062 }
                com.moovit.app.surveys.SurveyType r5 = com.moovit.app.surveys.SurveyType.ITINERARY     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                com.moovit.app.surveys.answer.SurveyEndReason[] r4 = com.moovit.app.surveys.answer.SurveyEndReason.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f46013b = r4
                com.moovit.app.surveys.answer.SurveyEndReason r5 = com.moovit.app.surveys.answer.SurveyEndReason.CANCELLED     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r4 = f46013b     // Catch:{ NoSuchFieldError -> 0x007d }
                com.moovit.app.surveys.answer.SurveyEndReason r5 = com.moovit.app.surveys.answer.SurveyEndReason.FINISHED     // Catch:{ NoSuchFieldError -> 0x007d }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                int[] r4 = f46013b     // Catch:{ NoSuchFieldError -> 0x0087 }
                com.moovit.app.surveys.answer.SurveyEndReason r5 = com.moovit.app.surveys.answer.SurveyEndReason.NOT_RELEVANT     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                int[] r4 = f46013b     // Catch:{ NoSuchFieldError -> 0x0091 }
                com.moovit.app.surveys.answer.SurveyEndReason r5 = com.moovit.app.surveys.answer.SurveyEndReason.NOTIFICATION_DISMISSED     // Catch:{ NoSuchFieldError -> 0x0091 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0091 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0091 }
            L_0x0091:
                com.tranzmate.moovit.protocol.surveys.MVEndReason[] r4 = com.tranzmate.moovit.protocol.surveys.MVEndReason.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f46012a = r4
                com.tranzmate.moovit.protocol.surveys.MVEndReason r5 = com.tranzmate.moovit.protocol.surveys.MVEndReason.Cancelled     // Catch:{ NoSuchFieldError -> 0x00a2 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a2 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x00a2 }
            L_0x00a2:
                int[] r1 = f46012a     // Catch:{ NoSuchFieldError -> 0x00ac }
                com.tranzmate.moovit.protocol.surveys.MVEndReason r4 = com.tranzmate.moovit.protocol.surveys.MVEndReason.Finished     // Catch:{ NoSuchFieldError -> 0x00ac }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ac }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x00ac }
            L_0x00ac:
                int[] r0 = f46012a     // Catch:{ NoSuchFieldError -> 0x00b6 }
                com.tranzmate.moovit.protocol.surveys.MVEndReason r1 = com.tranzmate.moovit.protocol.surveys.MVEndReason.NotRelevant     // Catch:{ NoSuchFieldError -> 0x00b6 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b6 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b6 }
            L_0x00b6:
                int[] r0 = f46012a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.tranzmate.moovit.protocol.surveys.MVEndReason r1 = com.tranzmate.moovit.protocol.surveys.MVEndReason.NotificationDismissed     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p595jw.C17948a.C17949a.<clinit>():void");
        }
    }

    static {
        C19617r.C19618a aVar = new C19617r.C19618a();
        TransitLineGroupLocalSurvey.C15393b bVar = TransitLineGroupLocalSurvey.f39858g;
        aVar.mo51969a(1, TransitLineGroupLocalSurvey.class, bVar, bVar);
        TransitStopLocalSurvey.C15395b bVar2 = TransitStopLocalSurvey.f39862e;
        aVar.mo51969a(2, TransitStopLocalSurvey.class, bVar2, bVar2);
        SuggestedRoutesLocalSurvey.C15388b bVar3 = SuggestedRoutesLocalSurvey.f39849e;
        aVar.mo51969a(3, SuggestedRoutesLocalSurvey.class, bVar3, bVar3);
        RemoteSurvey.C15397b bVar4 = RemoteSurvey.f39864g;
        aVar.mo51969a(4, RemoteSurvey.class, bVar4, bVar4);
        f46011a = aVar.mo51970b();
    }

    /* renamed from: a */
    public static SurveyType m44574a(MVSurveyType mVSurveyType) {
        int i = C17949a.f46015d[mVSurveyType.ordinal()];
        if (i == 1) {
            return SurveyType.STOP;
        }
        if (i == 2) {
            return SurveyType.LINE_GROUP;
        }
        if (i == 3) {
            return SurveyType.SUGGESTED_ROUTES;
        }
        if (i == 4) {
            return SurveyType.ITINERARY;
        }
        throw new IllegalStateException("Unknown server survey type: " + mVSurveyType);
    }

    /* renamed from: b */
    public static MVEndReason m44575b(SurveyEndReason surveyEndReason) {
        int i = C17949a.f46013b[surveyEndReason.ordinal()];
        if (i == 1) {
            return MVEndReason.Cancelled;
        }
        if (i == 2) {
            return MVEndReason.Finished;
        }
        if (i == 3) {
            return MVEndReason.NotRelevant;
        }
        if (i == 4) {
            return MVEndReason.NotificationDismissed;
        }
        throw new IllegalStateException("Unknown end reason: " + surveyEndReason);
    }

    /* renamed from: c */
    public static MVSurveyType m44576c(SurveyType surveyType) {
        int i = C17949a.f46014c[surveyType.ordinal()];
        if (i == 1) {
            return MVSurveyType.LineView;
        }
        if (i == 2) {
            return MVSurveyType.StopView;
        }
        if (i == 3) {
            return MVSurveyType.SuggestedRoutes;
        }
        if (i == 4) {
            return MVSurveyType.Itinerary;
        }
        throw new IllegalStateException("Unknown survey type: " + surveyType);
    }

    /* renamed from: d */
    public static void m44577d(C5269e eVar, SurveyEvent surveyEvent) {
        int i = surveyEvent.f39879b;
        if (i == 0) {
            SurveyLineGroupEvent surveyLineGroupEvent = (SurveyLineGroupEvent) surveyEvent;
            eVar.mo21066a(MetroEntityType.TRANSIT_LINE_GROUP, surveyLineGroupEvent.mo46047c().getServerId());
            if (surveyLineGroupEvent.mo46050f() != null) {
                eVar.mo21066a(MetroEntityType.TRANSIT_STOP, surveyLineGroupEvent.mo46050f().getServerId());
            }
        } else if (i == 1) {
            eVar.mo21066a(MetroEntityType.TRANSIT_STOP, ((SurveyStopEvent) surveyEvent).mo46054c().getServerId());
        } else if (i == 2) {
            HistoryItem historyItem = ((SurveySuggestedRoutesEvent) surveyEvent).f39896e;
            if (historyItem != null) {
                C16776h.C16777a aVar = new C16776h.C16777a(eVar);
                for (Itinerary u0 : (List) historyItem.mo45080Z1(new C13520f())) {
                    for (Leg i0 : u0.mo48295u0()) {
                        i0.mo48338i0(aVar);
                    }
                }
                return;
            }
            throw new IllegalStateException("Did you called SurveyEvent.resolve(...)?");
        }
    }
}
