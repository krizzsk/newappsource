package x40;

import android.net.Uri;
import android.widget.Toast;
import c70.C13751d;
import com.appsflyer.internal.referrer.Payload;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.payment.account.actions.PaymentAccountActionActivity;
import com.moovit.payment.registration.PaymentRegistrationActivity;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.moovit.payment.registration.PaymentRegistrationType;
import je0.C23715f;
import mf0.C24362h;
import p057d3.C4339c;
import p543hq.C17474b;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20927a0;
import w40.C25761d;
import y40.C25772a;
import z40.C25780d;
import z40.C25781e;

/* renamed from: x40.d */
public final class C25770d extends C20438i<C25780d, C25781e> {

    /* renamed from: b */
    public final /* synthetic */ PaymentAccountActionActivity f64284b;

    /* renamed from: c */
    public final /* synthetic */ C4339c f64285c;

    public C25770d(PaymentAccountActionActivity paymentAccountActionActivity, C4339c cVar) {
        this.f64284b = paymentAccountActionActivity;
        this.f64285c = cVar;
    }

    /* renamed from: a */
    public final void mo313a(C20431c cVar, boolean z) {
        C24362h.m61211f((C25780d) cVar, "request");
        this.f64284b.mo44506I1();
    }

    /* renamed from: k */
    public final void mo21408k(C20431c cVar, C20436g gVar) {
        C25781e eVar = (C25781e) gVar;
        C24362h.m61211f((C25780d) cVar, "request");
        C24362h.m61211f(eVar, Payload.RESPONSE);
        PaymentAccountActionActivity paymentAccountActionActivity = this.f64284b;
        int i = PaymentAccountActionActivity.f63869X;
        paymentAccountActionActivity.getClass();
        C23715f fVar = eVar.f64304m;
        if (fVar != null) {
            paymentAccountActionActivity.mo83343z2(fVar);
            return;
        }
        PaymentRegistrationInstructions paymentRegistrationInstructions = eVar.f64305n;
        if (paymentRegistrationInstructions != null) {
            paymentAccountActionActivity.startActivity(PaymentRegistrationActivity.m41719z2(paymentAccountActionActivity, PaymentRegistrationType.PURCHASE, paymentRegistrationInstructions));
            return;
        }
        C25772a aVar = eVar.f64306o;
        if (aVar != null) {
            String str = aVar.f64287a;
            if (str != null) {
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "redeem_benefit_success_message");
                paymentAccountActionActivity.mo44545v2(aVar2.mo49933a());
                Toast.makeText(paymentAccountActionActivity, str, 1).show();
            }
            String str2 = aVar.f64288b;
            if (str2 != null) {
                C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.STEPS_COMPLETED);
                aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "action_open_deep_link");
                aVar3.mo49939g(AnalyticsAttributeKey.URI, str2);
                paymentAccountActionActivity.mo44545v2(aVar3.mo49933a());
                C20927a0.m49017l(paymentAccountActionActivity, C20927a0.m49014i(Uri.parse(str2)));
            }
            C25761d.m64299a().mo83591f();
            paymentAccountActionActivity.finish();
        }
    }

    /* renamed from: w */
    public final boolean mo21415w(C20431c cVar, Exception exc) {
        C25780d dVar = (C25780d) cVar;
        PaymentAccountActionActivity paymentAccountActionActivity = this.f64284b;
        C4339c cVar2 = this.f64285c;
        int i = PaymentAccountActionActivity.f63869X;
        paymentAccountActionActivity.getClass();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "general_error");
        aVar.mo49939g(AnalyticsAttributeKey.SOURCE, cVar2.mo19843s());
        aVar.mo49935c(AnalyticsAttributeKey.ERROR_CODE, C13751d.m34343d(exc));
        paymentAccountActionActivity.mo44545v2(aVar.mo49933a());
        paymentAccountActionActivity.mo44506I1();
        paymentAccountActionActivity.mo44530n2(C13751d.m34341b(paymentAccountActionActivity, (String) null, exc));
        return true;
    }
}
