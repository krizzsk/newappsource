package u60;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import b00.C13556a;
import c70.C13751d;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.design.view.AlertMessageView;
import com.moovit.payment.registration.steps.question.QuestionButton;
import com.moovit.payment.registration.steps.question.QuestionInstructions;
import com.moovit.request.RequestOptions;
import h60.C17322i;
import h60.C17325j;
import h60.C17328k;
import i60.C17559a;
import k60.C17999a;
import p397bu.C13690h;
import p543hq.C17474b;
import p757qu.C19184g;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import v40.C25751f;

/* renamed from: u60.a */
public class C19876a extends C17999a {

    /* renamed from: t */
    public static final /* synthetic */ int f50486t = 0;

    /* renamed from: r */
    public final C19877a f50487r = new C19877a();

    /* renamed from: s */
    public C13556a f50488s = null;

    /* renamed from: u60.a$a */
    public class C19877a extends C20438i<C17322i, C17325j> {
        public C19877a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17322i iVar = (C17322i) cVar;
            C19876a.this.mo46784S1();
            C19876a.this.f50488s = null;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17322i iVar = (C17322i) cVar;
            C17325j jVar = (C17325j) gVar;
            C19876a aVar = C19876a.this;
            int i = C19876a.f50486t;
            aVar.mo50504u2((C17559a) null);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C17322i iVar = (C17322i) cVar;
            C19876a aVar = C19876a.this;
            aVar.mo46795h2(C13751d.m34341b(aVar.requireContext(), (String) null, exc));
            return true;
        }
    }

    /* renamed from: m2 */
    public final C17474b.C17475a mo50497m2() {
        String str;
        QuestionInstructions questionInstructions = mo50500p2().f42768l;
        C17474b.C17475a m2 = super.mo50497m2();
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.ID;
        if (questionInstructions != null) {
            str = questionInstructions.f42865b;
        } else {
            str = null;
        }
        m2.mo49945m(analyticsAttributeKey, str);
        return m2;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AlertMessageView alertMessageView = (AlertMessageView) layoutInflater.inflate(C25751f.payment_registration_question_fragment, viewGroup, false);
        QuestionInstructions questionInstructions = mo50500p2().f42768l;
        if (questionInstructions != null) {
            alertMessageView.setImage(questionInstructions.f42866c);
            alertMessageView.setTitle((CharSequence) questionInstructions.f42867d);
            alertMessageView.setSubtitle((CharSequence) questionInstructions.f42868e);
            QuestionButton questionButton = questionInstructions.f42869f;
            if (questionButton != null) {
                alertMessageView.setPositiveButton((CharSequence) questionButton.f42863c);
                alertMessageView.setPositiveButtonClickListener(new C19184g(3, this, questionInstructions, questionButton));
            }
            QuestionButton questionButton2 = questionInstructions.f42870g;
            if (questionButton2 != null) {
                alertMessageView.setNegativeButton((CharSequence) questionButton2.f42863c);
                alertMessageView.setNegativeButtonClickListener(new C13690h(3, this, questionInstructions, questionButton2));
            }
            return alertMessageView;
        }
        throw new IllegalStateException("PaymentRegistrationInstructions must contain non null QuestionInstructions");
    }

    /* renamed from: q2 */
    public final String mo49058q2() {
        return "step_question";
    }

    /* renamed from: w2 */
    public final boolean mo50506w2() {
        return false;
    }

    /* renamed from: y2 */
    public final void mo52159y2(String str, String str2) {
        if (this.f50488s == null) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "question");
            aVar.mo49939g(AnalyticsAttributeKey.ID, str);
            aVar.mo49939g(AnalyticsAttributeKey.BUTTON_ID, str2);
            mo46797j2(aVar.mo49933a());
            mo46796i2();
            C17322i iVar = new C17322i(mo46783R1(), mo50500p2().f42758b, str, str2);
            StringBuilder sb = new StringBuilder();
            C13715c.m34249o(C17328k.class, sb, "_");
            sb.append(iVar.f44710w);
            sb.append("_");
            sb.append(iVar.f44711x);
            sb.append("_");
            sb.append(iVar.f44712y);
            String sb2 = sb.toString();
            RequestOptions L1 = mo46777L1();
            L1.f42909f = true;
            this.f50488s = mo46793f2(sb2, iVar, L1, this.f50487r);
        }
    }
}
