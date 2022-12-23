package o60;

import c70.C13751d;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.payment.registration.steps.input.InputFieldsInstructions;
import com.moovit.request.RequestOptions;
import h60.C17329k0;
import h60.C17332l0;
import i60.C17559a;
import java.util.ArrayList;
import p543hq.C17474b;
import p60.C18883a;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import v40.C25754i;

/* renamed from: o60.a */
public class C18719a extends C18883a {

    /* renamed from: w */
    public static final /* synthetic */ int f47629w = 0;

    /* renamed from: v */
    public final C18720a f47630v = new C18720a();

    /* renamed from: o60.a$a */
    public class C18720a extends C20438i<C17329k0, C17332l0> {
        public C18720a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17329k0 k0Var = (C17329k0) cVar;
            C18719a aVar = C18719a.this;
            int i = C18719a.f47629w;
            aVar.mo50501r2();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17329k0 k0Var = (C17329k0) cVar;
            C17559a aVar = ((C17332l0) gVar).f44722m;
            if (aVar != null) {
                C18719a aVar2 = C18719a.this;
                C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.LOGIN);
                aVar3.mo49939g(AnalyticsAttributeKey.ID, aVar.f45166b);
                aVar3.mo49941i(AnalyticsAttributeKey.IS_MIGRATED_USER, aVar.f45167c);
                aVar2.mo46797j2(aVar3.mo49933a());
            }
            C18719a aVar4 = C18719a.this;
            int i = C18719a.f47629w;
            aVar4.mo50504u2(aVar);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C17329k0 k0Var = (C17329k0) cVar;
            C18719a aVar = C18719a.this;
            int i = C18719a.f47629w;
            aVar.mo51350E2(exc);
            C18719a aVar2 = C18719a.this;
            aVar2.mo46795h2(C13751d.m34341b(aVar2.requireContext(), (String) null, exc));
            return true;
        }
    }

    /* renamed from: A2 */
    public final InputFieldsInstructions mo51080A2() {
        return mo50500p2().f42764h.f42785b;
    }

    /* renamed from: D2 */
    public final void mo51081D2(InputFieldsInstructions inputFieldsInstructions, ArrayList arrayList) {
        mo50507x2();
        C17329k0 k0Var = new C17329k0(mo46783R1(), inputFieldsInstructions.f42804b, inputFieldsInstructions.f42805c, arrayList);
        RequestOptions L1 = mo46777L1();
        L1.f42909f = true;
        mo46793f2("payment_external_account_connect_request", k0Var, L1, this.f47630v);
    }

    /* renamed from: q2 */
    public final String mo49058q2() {
        return "step_external_account";
    }

    /* renamed from: s2 */
    public final boolean mo50502s2() {
        return false;
    }

    /* renamed from: z2 */
    public final int mo51082z2() {
        return C25754i.action_connect;
    }
}
