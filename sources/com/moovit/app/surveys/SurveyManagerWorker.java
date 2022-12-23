package com.moovit.app.surveys;

import android.content.Context;
import android.content.Intent;
import ce0.C21100e;
import com.moovit.app.MoovitAppJobIntentService;
import com.moovit.app.surveys.answer.SurveyQuestionnaireAnswer;
import com.moovit.app.surveys.recorder.events.SurveyEvent;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p001a0.C0016g;
import p435de.C16596f;
import p595jw.C17950b;
import p786rz.C19387a;
import p810sz.C19610m;

public class SurveyManagerWorker extends MoovitAppJobIntentService {

    /* renamed from: l */
    public static final /* synthetic */ int f39833l = 0;

    /* renamed from: com.moovit.app.surveys.SurveyManagerWorker$a */
    public static /* synthetic */ class C15376a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39834a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.moovit.app.surveys.SurveyType[] r0 = com.moovit.app.surveys.SurveyType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39834a = r0
                com.moovit.app.surveys.SurveyType r1 = com.moovit.app.surveys.SurveyType.LINE_GROUP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f39834a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.surveys.SurveyType r1 = com.moovit.app.surveys.SurveyType.STOP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f39834a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.surveys.SurveyType r1 = com.moovit.app.surveys.SurveyType.SUGGESTED_ROUTES     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f39834a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.app.surveys.SurveyType r1 = com.moovit.app.surveys.SurveyType.ITINERARY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.surveys.SurveyManagerWorker.C15376a.<clinit>():void");
        }
    }

    /* renamed from: i */
    public static boolean m39380i(int i, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((SurveyEvent) it.next()).f39879b == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final HashSet mo44579g() {
        HashSet g = super.mo44579g();
        C0016g.m11A(g, "USER_CONTEXT", "METRO_CONTEXT", "HISTORY", "SURVEY_CONFIGURATION");
        g.add("LATEST_ITINERARY_CONTROLLER");
        return g;
    }

    /* renamed from: h */
    public final void mo44581h(Intent intent) {
        try {
            String action = intent.getAction();
            if ("com.moovit.survey_manager_worker.action.request_survey".equals(action)) {
                mo45982k(intent);
            } else if ("com.moovit.survey_manager_worker.action.log_survey_answer".equals(action)) {
                mo45981j(intent);
            }
        } catch (Exception e) {
            C16596f.m42113a().mo49364c(e);
        }
    }

    /* renamed from: j */
    public final void mo45981j(Intent intent) {
        SurveyQuestionnaireAnswer surveyQuestionnaireAnswer = (SurveyQuestionnaireAnswer) intent.getParcelableExtra("com.moovit.survey_manager_worker.extra.questionnaire_answer");
        if (surveyQuestionnaireAnswer != null) {
            C17950b bVar = SurveyManager.m39375d(this).f39829h;
            bVar.getClass();
            C21100e.m49355o();
            List<SurveyQuestionnaireAnswer> a = bVar.mo50473a();
            a.add(surveyQuestionnaireAnswer);
            C21100e.m49355o();
            Context context = bVar.f46016a;
            SurveyQuestionnaireAnswer.C15382b bVar2 = SurveyQuestionnaireAnswer.f39840e;
            BufferedOutputStream bufferedOutputStream = null;
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(context.openFileOutput("survey_questionnaire_answers", 0));
                try {
                    new C19610m(bufferedOutputStream2).mo51965h(a, bVar2);
                    C19387a.m46677i(bufferedOutputStream2);
                } catch (IOException unused) {
                    bufferedOutputStream = bufferedOutputStream2;
                    C19387a.m46677i(bufferedOutputStream);
                } catch (Throwable th) {
                    th = th;
                    bufferedOutputStream = bufferedOutputStream2;
                    C19387a.m46677i(bufferedOutputStream);
                    throw th;
                }
            } catch (IOException unused2) {
                C19387a.m46677i(bufferedOutputStream);
            } catch (Throwable th2) {
                th = th2;
                C19387a.m46677i(bufferedOutputStream);
                throw th;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a1  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo45982k(android.content.Intent r10) {
        /*
            r9 = this;
            java.lang.String r0 = "SURVEY_CONFIGURATION"
            java.lang.Object r0 = r9.mo44578f(r0)
            com.moovit.app.surveys.configuration.SurveyConfiguration r0 = (com.moovit.app.surveys.configuration.SurveyConfiguration) r0
            java.lang.String r1 = "com.moovit.survey_manager_worker.extra.events"
            java.util.ArrayList r10 = r10.getParcelableArrayListExtra(r1)
            c00.C13717b.m34269p(r10)
            java.util.Iterator r1 = r10.iterator()
        L_0x0015:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0025
            java.lang.Object r2 = r1.next()
            com.moovit.app.surveys.recorder.events.SurveyEvent r2 = (com.moovit.app.surveys.recorder.events.SurveyEvent) r2
            r2.mo46040b(r9)
            goto L_0x0015
        L_0x0025:
            java.util.Set<com.moovit.app.surveys.SurveyType> r1 = r0.f39847b
            boolean r2 = r1.isEmpty()
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0031
            goto L_0x009d
        L_0x0031:
            com.moovit.app.surveys.SurveyManager r2 = com.moovit.app.surveys.SurveyManager.m39375d(r9)
            jw.b r2 = r2.f39829h
            f00.g$f r5 = r2.f46017b
            android.content.Context r2 = r2.f46016a
            java.lang.String r6 = "survey_store"
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r6, r4)
            java.lang.Long r2 = r5.mo19759a(r2)
            long r5 = r2.longValue()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r5
            long r5 = r2.toSeconds(r7)
            int r0 = r0.f39848c
            long r7 = (long) r0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x005c
            goto L_0x009d
        L_0x005c:
            java.util.Iterator r0 = r1.iterator()
        L_0x0060:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0097
            java.lang.Object r2 = r0.next()
            com.moovit.app.surveys.SurveyType r2 = (com.moovit.app.surveys.SurveyType) r2
            int[] r5 = com.moovit.app.surveys.SurveyManagerWorker.C15376a.f39834a
            int r2 = r2.ordinal()
            r2 = r5[r2]
            if (r2 == r3) goto L_0x0090
            r5 = 2
            if (r2 == r5) goto L_0x008b
            r6 = 3
            if (r2 == r6) goto L_0x0086
            r5 = 4
            if (r2 == r5) goto L_0x0081
            r2 = 0
            goto L_0x0094
        L_0x0081:
            boolean r2 = m39380i(r6, r10)
            goto L_0x0094
        L_0x0086:
            boolean r2 = m39380i(r5, r10)
            goto L_0x0094
        L_0x008b:
            boolean r2 = m39380i(r3, r10)
            goto L_0x0094
        L_0x0090:
            boolean r2 = m39380i(r4, r10)
        L_0x0094:
            if (r2 == 0) goto L_0x0060
            goto L_0x009e
        L_0x0097:
            c00.C13717b.m34269p(r10)
            c00.C13717b.m34269p(r1)
        L_0x009d:
            r3 = 0
        L_0x009e:
            if (r3 != 0) goto L_0x00a1
            return
        L_0x00a1:
            c00.C13717b.m34269p(r10)
            c70.e r0 = new c70.e     // Catch:{ Exception -> 0x00db }
            java.lang.String r1 = "user_context"
            java.lang.Object r1 = r9.getSystemService(r1)     // Catch:{ Exception -> 0x00db }
            tp.a0 r1 = (p824tp.C19722a0) r1     // Catch:{ Exception -> 0x00db }
            r2 = 0
            r0.<init>(r9, r1, r2)     // Catch:{ Exception -> 0x00db }
            com.moovit.app.surveys.SurveyManager r1 = com.moovit.app.surveys.SurveyManager.m39375d(r9)     // Catch:{ Exception -> 0x00db }
            jw.b r1 = r1.f39829h     // Catch:{ Exception -> 0x00db }
            java.util.List r1 = r1.mo50473a()     // Catch:{ Exception -> 0x00db }
            ow.c r2 = new ow.c     // Catch:{ Exception -> 0x00db }
            r2.<init>(r0, r1, r10)     // Catch:{ Exception -> 0x00db }
            wz.g r10 = r2.mo52626J()     // Catch:{ Exception -> 0x00db }
            ow.d r10 = (p714ow.C18850d) r10     // Catch:{ Exception -> 0x00db }
            long r0 = r10.f47991m
            com.moovit.app.surveys.data.Survey r10 = r10.f47992n
            if (r10 == 0) goto L_0x00da
            com.moovit.app.surveys.SurveyManager r2 = com.moovit.app.surveys.SurveyManager.m39375d(r9)
            r2.getClass()
            com.moovit.util.time.C7925b.m18016d(r2, r0)
            r2.mo45978i(r10, r0)
        L_0x00da:
            return
        L_0x00db:
            r10 = move-exception
            com.moovit.app.surveys.recorder.request.SurveyRequestException r0 = new com.moovit.app.surveys.recorder.request.SurveyRequestException
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.surveys.SurveyManagerWorker.mo45982k(android.content.Intent):void");
    }
}
