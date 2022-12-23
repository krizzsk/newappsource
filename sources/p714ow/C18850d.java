package p714ow;

import c70.C13746a;
import c70.C13780t;
import com.moovit.app.surveys.data.Survey;
import com.moovit.app.surveys.recorder.events.SurveyEvent;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.network.model.ServerId;
import com.tranzmate.moovit.protocol.surveys.MVLocalLineGroupSurvey;
import com.tranzmate.moovit.protocol.surveys.MVSurvey;
import com.tranzmate.moovit.protocol.surveys.MVSurveyResponse;
import i30.C5269e;
import java.util.List;
import org.apache.thrift.TBase;
import p595jw.C17948a;
import p810sz.C19617r;

/* renamed from: ow.d */
public final class C18850d extends C13780t<C18849c, C18850d, MVSurveyResponse> {

    /* renamed from: m */
    public long f47991m;

    /* renamed from: n */
    public Survey f47992n;

    public C18850d() {
        super(MVSurveyResponse.class);
    }

    /* renamed from: i */
    public final C5269e mo40708i(C13746a aVar, TBase tBase) {
        boolean z;
        boolean z2;
        C5269e eVar = new C5269e();
        List<SurveyEvent> list = ((C18849c) aVar).f47990w;
        MVSurvey mVSurvey = ((MVSurveyResponse) tBase).survey;
        if (mVSurvey != null) {
            C19617r rVar = C17948a.f46011a;
            F f = mVSurvey.setField_;
            boolean z3 = true;
            if (f == MVSurvey._Fields.LOCAL_STOP_SURVEY) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                eVar.mo21066a(MetroEntityType.TRANSIT_STOP, new ServerId(mVSurvey.mo31934m().stopId));
            } else {
                if (f == MVSurvey._Fields.LOCAL_LINE_GROUP_SURVEY) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    MVLocalLineGroupSurvey l = mVSurvey.mo31933l();
                    eVar.mo21066a(MetroEntityType.TRANSIT_LINE_GROUP, new ServerId(l.lineGroupId));
                    if (l.mo31875g()) {
                        eVar.mo21066a(MetroEntityType.TRANSIT_LINE, new ServerId(l.lineId));
                    }
                    if (l.mo31876h()) {
                        eVar.mo21066a(MetroEntityType.TRANSIT_STOP, new ServerId(l.stopId));
                    }
                } else {
                    if (f != MVSurvey._Fields.LOCAL_SUGGESTED_ROUTES_SURVEY) {
                        z3 = false;
                    }
                    if (z3) {
                        C17948a.m44577d(eVar, list.get(mVSurvey.mo31935n().decisionEventIndex));
                    }
                }
            }
        }
        for (SurveyEvent d : list) {
            C17948a.m44577d(eVar, d);
        }
        if (eVar.isEmpty()) {
            return null;
        }
        return eVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: com.moovit.transit.TransitStop} */
    /* JADX WARNING: type inference failed for: r7v0 */
    /* JADX WARNING: type inference failed for: r7v1, types: [com.moovit.app.surveys.data.Survey] */
    /* JADX WARNING: type inference failed for: r9v23 */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v6 */
    /* JADX WARNING: type inference failed for: r2v14, types: [com.moovit.app.surveys.data.remote.RemoteSurvey] */
    /* JADX WARNING: type inference failed for: r7v8 */
    /* JADX WARNING: type inference failed for: r2v15, types: [com.moovit.app.surveys.data.TransitLineGroupLocalSurvey] */
    /* JADX WARNING: type inference failed for: r7v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo40712p(c70.C13746a r9, org.apache.thrift.TBase r10, i30.C5268d r11) throws java.io.IOException, com.moovit.commons.request.BadResponseException, com.moovit.commons.request.ServerException {
        /*
            r8 = this;
            ow.c r9 = (p714ow.C18849c) r9
            com.tranzmate.moovit.protocol.surveys.MVSurveyResponse r10 = (com.tranzmate.moovit.protocol.surveys.MVSurveyResponse) r10
            c70.e r0 = r9.f33829q
            tp.a0 r0 = r0.f33853b
            y90.f r0 = r0.f50160a
            com.moovit.network.model.ServerId r0 = r0.f32927c
            java.util.List<com.moovit.app.surveys.recorder.events.SurveyEvent> r9 = r9.f47990w
            long r1 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            int r4 = r10.showAtSec
            long r4 = (long) r4
            long r3 = r3.toMillis(r4)
            long r3 = r3 + r1
            r8.f47991m = r3
            com.tranzmate.moovit.protocol.surveys.MVSurvey r1 = r10.survey
            java.lang.String r4 = r10.surveyContext
            sz.r r10 = p595jw.C17948a.f46011a
            F r10 = r1.setField_
            com.tranzmate.moovit.protocol.surveys.MVSurvey$_Fields r2 = com.tranzmate.moovit.protocol.surveys.MVSurvey._Fields.LOCAL_STOP_SURVEY
            r3 = 1
            r5 = 0
            if (r10 != r2) goto L_0x002e
            r2 = 1
            goto L_0x002f
        L_0x002e:
            r2 = 0
        L_0x002f:
            java.lang.String r6 = "1"
            r7 = 0
            if (r2 == 0) goto L_0x0059
            com.tranzmate.moovit.protocol.surveys.MVLocalStopSurvey r9 = r1.mo31934m()
            com.moovit.app.surveys.data.Survey$Id r10 = new com.moovit.app.surveys.data.Survey$Id
            com.moovit.network.model.ServerId r1 = new com.moovit.network.model.ServerId
            r2 = -1
            r1.<init>(r2)
            com.moovit.app.surveys.SurveyType r2 = com.moovit.app.surveys.SurveyType.STOP
            r10.<init>(r0, r1, r6, r2)
            int r9 = r9.stopId
            com.moovit.network.model.ServerId r0 = new com.moovit.network.model.ServerId
            r0.<init>(r9)
            com.moovit.transit.TransitStop r9 = r11.mo21064c(r0)
            if (r9 == 0) goto L_0x018c
            com.moovit.app.surveys.data.TransitStopLocalSurvey r7 = new com.moovit.app.surveys.data.TransitStopLocalSurvey
            r7.<init>(r10, r4, r9)
            goto L_0x018c
        L_0x0059:
            com.tranzmate.moovit.protocol.surveys.MVSurvey$_Fields r2 = com.tranzmate.moovit.protocol.surveys.MVSurvey._Fields.LOCAL_LINE_GROUP_SURVEY
            if (r10 != r2) goto L_0x005f
            r2 = 1
            goto L_0x0060
        L_0x005f:
            r2 = 0
        L_0x0060:
            if (r2 == 0) goto L_0x00bc
            com.tranzmate.moovit.protocol.surveys.MVLocalLineGroupSurvey r9 = r1.mo31933l()
            com.moovit.app.surveys.data.Survey$Id r3 = new com.moovit.app.surveys.data.Survey$Id
            com.moovit.network.model.ServerId r10 = new com.moovit.network.model.ServerId
            r1 = -2
            r10.<init>(r1)
            com.moovit.app.surveys.SurveyType r1 = com.moovit.app.surveys.SurveyType.LINE_GROUP
            r3.<init>(r0, r10, r6, r1)
            int r10 = r9.lineGroupId
            com.moovit.network.model.ServerId r0 = new com.moovit.network.model.ServerId
            r0.<init>(r10)
            com.moovit.util.ServerIdMap<com.moovit.transit.TransitLineGroup> r10 = r11.f17405b
            java.lang.Object r10 = r10.get(r0)
            r5 = r10
            com.moovit.transit.TransitLineGroup r5 = (com.moovit.transit.TransitLineGroup) r5
            if (r5 != 0) goto L_0x0087
            goto L_0x018c
        L_0x0087:
            boolean r10 = r9.mo31875g()
            if (r10 == 0) goto L_0x0096
            int r10 = r9.lineId
            com.moovit.network.model.ServerId r0 = new com.moovit.network.model.ServerId
            r0.<init>(r10)
            r6 = r0
            goto L_0x0097
        L_0x0096:
            r6 = r7
        L_0x0097:
            if (r6 == 0) goto L_0x00a1
            com.moovit.transit.TransitLine r10 = r5.mo24377c(r6)
            if (r10 != 0) goto L_0x00a1
            goto L_0x018c
        L_0x00a1:
            boolean r10 = r9.mo31876h()
            if (r10 == 0) goto L_0x00b3
            int r9 = r9.stopId
            com.moovit.network.model.ServerId r10 = new com.moovit.network.model.ServerId
            r10.<init>(r9)
            com.moovit.transit.TransitStop r9 = r11.mo21064c(r10)
            r7 = r9
        L_0x00b3:
            com.moovit.app.surveys.data.TransitLineGroupLocalSurvey r9 = new com.moovit.app.surveys.data.TransitLineGroupLocalSurvey
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x00b9:
            r7 = r9
            goto L_0x018c
        L_0x00bc:
            com.tranzmate.moovit.protocol.surveys.MVSurvey$_Fields r11 = com.tranzmate.moovit.protocol.surveys.MVSurvey._Fields.LOCAL_SUGGESTED_ROUTES_SURVEY
            if (r10 != r11) goto L_0x00c2
            r11 = 1
            goto L_0x00c3
        L_0x00c2:
            r11 = 0
        L_0x00c3:
            if (r11 == 0) goto L_0x00fc
            com.tranzmate.moovit.protocol.surveys.MVLocalSuggestedRoutesSurvey r10 = r1.mo31935n()
            com.moovit.app.surveys.data.Survey$Id r11 = new com.moovit.app.surveys.data.Survey$Id
            com.moovit.network.model.ServerId r1 = new com.moovit.network.model.ServerId
            r2 = -3
            r1.<init>(r2)
            com.moovit.app.surveys.SurveyType r2 = com.moovit.app.surveys.SurveyType.SUGGESTED_ROUTES
            java.lang.String r3 = "2"
            r11.<init>(r0, r1, r3, r2)
            int r10 = r10.decisionEventIndex
            java.lang.Object r9 = r9.get(r10)
            com.moovit.app.surveys.recorder.events.SurveyEvent r9 = (com.moovit.app.surveys.recorder.events.SurveyEvent) r9
            int r10 = r9.f39879b
            r0 = 2
            if (r10 == r0) goto L_0x00e7
            goto L_0x018c
        L_0x00e7:
            com.moovit.app.surveys.recorder.events.SurveySuggestedRoutesEvent r9 = (com.moovit.app.surveys.recorder.events.SurveySuggestedRoutesEvent) r9
            com.moovit.app.history.model.HistoryItem r9 = r9.f39896e
            if (r9 == 0) goto L_0x00f4
            com.moovit.app.surveys.data.SuggestedRoutesLocalSurvey r7 = new com.moovit.app.surveys.data.SuggestedRoutesLocalSurvey
            r7.<init>(r11, r4, r9)
            goto L_0x018c
        L_0x00f4:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Did you called SurveyEvent.resolve(...)?"
            r9.<init>(r10)
            throw r9
        L_0x00fc:
            com.tranzmate.moovit.protocol.surveys.MVSurvey$_Fields r9 = com.tranzmate.moovit.protocol.surveys.MVSurvey._Fields.REMOTE_SURVEY
            if (r10 != r9) goto L_0x0101
            goto L_0x0102
        L_0x0101:
            r3 = 0
        L_0x0102:
            if (r3 == 0) goto L_0x018c
            if (r10 != r9) goto L_0x016f
            java.lang.Object r9 = r1.value_
            com.tranzmate.moovit.protocol.surveys.MVQuestionnaire r9 = (com.tranzmate.moovit.protocol.surveys.MVQuestionnaire) r9
            com.moovit.app.surveys.data.Survey$Id r3 = new com.moovit.app.surveys.data.Survey$Id
            int r10 = r9.f28426id
            com.moovit.network.model.ServerId r11 = new com.moovit.network.model.ServerId
            r11.<init>(r10)
            java.lang.String r10 = r9.version
            com.tranzmate.moovit.protocol.surveys.MVSurveyType r1 = r9.type
            com.moovit.app.surveys.SurveyType r1 = p595jw.C17948a.m44574a(r1)
            r3.<init>(r0, r11, r10, r1)
            java.lang.String r10 = r9.notificationTitle
            boolean r11 = r9.mo31911g()
            if (r11 == 0) goto L_0x012a
            java.lang.String r11 = r9.notificationSubtitle
            r6 = r11
            goto L_0x012b
        L_0x012a:
            r6 = r7
        L_0x012b:
            mw.a r11 = new mw.a
            java.util.List<com.tranzmate.moovit.protocol.surveys.MVQuestionNode> r9 = r9.questions
            r11.<init>(r9)
            java.util.List<com.tranzmate.moovit.protocol.surveys.MVQuestionNode> r9 = r11.f47076a
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x0167
            java.util.List<com.tranzmate.moovit.protocol.surveys.MVQuestionNode> r9 = r11.f47076a
            java.lang.Object r9 = r9.get(r5)
            com.tranzmate.moovit.protocol.surveys.MVQuestionNode r9 = (com.tranzmate.moovit.protocol.surveys.MVQuestionNode) r9
            com.moovit.app.surveys.data.remote.SurveyQuestionTreeNode r7 = r11.mo50900a(r9)
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            boolean r9 = p583jk.C17884p.m44332C(r7, r9, r11)
            if (r9 != 0) goto L_0x015f
            com.moovit.app.surveys.data.remote.RemoteSurvey r9 = new com.moovit.app.surveys.data.remote.RemoteSurvey
            r2 = r9
            r5 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            goto L_0x00b9
        L_0x015f:
            com.moovit.commons.request.BadResponseException r9 = new com.moovit.commons.request.BadResponseException
            java.lang.String r10 = "Remote survey may not contain cycles!"
            r9.<init>((java.lang.String) r10)
            throw r9
        L_0x0167:
            com.moovit.commons.request.BadResponseException r9 = new com.moovit.commons.request.BadResponseException
            java.lang.String r10 = "MVQuestionNodes may not be empty!"
            r9.<init>((java.lang.String) r10)
            throw r9
        L_0x016f:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.String r10 = "Cannot get field 'remoteSurvey' because union is currently set to "
            java.lang.StringBuilder r10 = p379.C13555b.m33972k(r10)
            F r11 = r1.setField_
            com.tranzmate.moovit.protocol.surveys.MVSurvey$_Fields r11 = (com.tranzmate.moovit.protocol.surveys.MVSurvey._Fields) r11
            vi0.c r11 = com.tranzmate.moovit.protocol.surveys.MVSurvey.m27026k(r11)
            java.lang.String r11 = r11.f63355a
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x018c:
            r8.f47992n = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p714ow.C18850d.mo40712p(c70.a, org.apache.thrift.TBase, i30.d):void");
    }
}
