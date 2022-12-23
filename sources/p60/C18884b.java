package p60;

import c70.C13751d;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.payment.registration.steps.input.InputFieldsInstructions;
import com.moovit.request.RequestOptions;
import h60.C17357t0;
import h60.C17360u0;
import i60.C17559a;
import java.util.ArrayList;
import p543hq.C17474b;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import v40.C25754i;

/* renamed from: p60.b */
public class C18884b extends C18883a {

    /* renamed from: w */
    public static final /* synthetic */ int f48062w = 0;

    /* renamed from: v */
    public final C18885a f48063v = new C18885a();

    /* renamed from: p60.b$a */
    public class C18885a extends C20438i<C17357t0, C17360u0> {
        public C18885a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17357t0 t0Var = (C17357t0) cVar;
            C18884b bVar = C18884b.this;
            int i = C18884b.f48062w;
            bVar.mo50501r2();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17357t0 t0Var = (C17357t0) cVar;
            C17360u0 u0Var = (C17360u0) gVar;
            C18884b bVar = C18884b.this;
            int i = C18884b.f48062w;
            bVar.mo50504u2((C17559a) null);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C17357t0 t0Var = (C17357t0) cVar;
            C18884b.this.mo51350E2(exc);
            C18884b bVar = C18884b.this;
            bVar.mo46795h2(C13751d.m34341b(bVar.requireContext(), (String) null, exc));
            return true;
        }
    }

    /* renamed from: A2 */
    public final InputFieldsInstructions mo51080A2() {
        return mo50500p2().f42769m.f42814b;
    }

    /* renamed from: D2 */
    public final void mo51081D2(InputFieldsInstructions inputFieldsInstructions, ArrayList arrayList) {
        mo50507x2();
        C17357t0 t0Var = new C17357t0(mo46783R1(), inputFieldsInstructions.f42804b, inputFieldsInstructions.f42805c, arrayList);
        RequestOptions L1 = mo46777L1();
        L1.f42909f = true;
        mo46793f2("payment_registration_input_request", t0Var, L1, this.f48063v);
    }

    /* renamed from: m2 */
    public final C17474b.C17475a mo50497m2() {
        C17474b.C17475a m2 = super.mo50497m2();
        m2.mo49939g(AnalyticsAttributeKey.ID, mo51080A2().f42804b);
        return m2;
    }

    /* renamed from: n2 */
    public final C17474b.C17475a mo50498n2() {
        C17474b.C17475a n2 = super.mo50498n2();
        n2.mo49939g(AnalyticsAttributeKey.ID, mo51080A2().f42804b);
        return n2;
    }

    /* renamed from: q2 */
    public final String mo49058q2() {
        return "step_input";
    }

    /* renamed from: s2 */
    public final boolean mo50502s2() {
        return false;
    }

    /* renamed from: y2 */
    public final C17474b.C17475a mo51352y2(boolean z) {
        C17474b.C17475a y2 = super.mo51352y2(z);
        y2.mo49939g(AnalyticsAttributeKey.ID, mo51080A2().f42804b);
        return y2;
    }

    /* renamed from: z2 */
    public final int mo51082z2() {
        return C25754i.action_continue;
    }
}
