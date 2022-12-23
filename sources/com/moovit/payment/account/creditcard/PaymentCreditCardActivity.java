package com.moovit.payment.account.creditcard;

import a50.C25542a;
import a50.C25543b;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import c00.C13717b;
import c70.C13753f;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.marketing.MarketingEventImpressionBinder;
import com.moovit.payment.MoovitPaymentActivity;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.moovit.payment.clearance.ClearanceProvider;
import com.moovit.payment.clearance.ClearanceProviderType;
import com.moovit.payment.clearance.CreditCardRequest;
import com.moovit.payment.registration.steps.p419cc.CreditCardInstructions;
import com.moovit.payment.registration.steps.p419cc.WebInstruction;
import com.moovit.request.RequestOptions;
import com.usebutton.sdk.internal.events.Events;
import java.util.List;
import p001a0.C0017h;
import p543hq.C17474b;
import p906wz.C20436g;
import v40.C25750e;
import v40.C25751f;
import v40.C25754i;
import z20.C20806a;

public class PaymentCreditCardActivity extends MoovitPaymentActivity implements ClearanceProvider.C16293a {

    /* renamed from: Y */
    public static final /* synthetic */ int f63944Y = 0;

    /* renamed from: U */
    public String f63945U;

    /* renamed from: X */
    public CreditCardInstructions f63946X;

    /* renamed from: y2 */
    public static Intent m64074y2(Context context, CreditCardInstructions creditCardInstructions, CreditCardRequest.Action action, boolean z, int i, int i2) {
        return m64075z2(context, creditCardInstructions.f42773b, creditCardInstructions, action, z, i, i2);
    }

    /* renamed from: z2 */
    public static Intent m64075z2(Context context, String str, CreditCardInstructions creditCardInstructions, CreditCardRequest.Action action, boolean z, int i, int i2) {
        Intent intent = new Intent(context, PaymentCreditCardActivity.class);
        intent.putExtra("paymentContext", str);
        if (creditCardInstructions != null) {
            intent.putExtra("creditCardInstructions", creditCardInstructions);
        }
        intent.putExtra(Events.PROPERTY_ACTION, action);
        if (i != 0) {
            intent.putExtra("title", i);
        }
        if (i2 != 0) {
            intent.putExtra("subtitle", i2);
        }
        intent.putExtra("markAsDefault", z);
        return intent;
    }

    /* renamed from: U */
    public final void mo48833U(ClearanceProviderType clearanceProviderType, String str) {
        throw new ApplicationBugException("Host did not implement callback!");
    }

    /* renamed from: U1 */
    public final void mo44512U1(List<C20436g<?, ?>> list) {
        this.f63946X = ((C25543b) C13717b.m34256c(list)).f63800m;
    }

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        Uri data = intent.getData();
        if (data != null) {
            WebInstruction.m41737f(this, data);
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C25751f.payment_registration_step_credit_card_fragment);
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("title", C25754i.payment_registration_enter_credit_card_title);
        int intExtra2 = intent.getIntExtra("subtitle", C25754i.payment_registration_enter_credit_card_subtitle);
        CreditCardRequest.Action action = (CreditCardRequest.Action) intent.getParcelableExtra(Events.PROPERTY_ACTION);
        boolean booleanExtra = intent.getBooleanExtra("markAsDefault", true);
        CreditCardInstructions creditCardInstructions = this.f63946X;
        if (creditCardInstructions == null || action == null) {
            finish();
            return;
        }
        Fragment g = this.f63946X.f42774c.f42605c.getClearanceProvider().mo48830g(new CreditCardRequest(creditCardInstructions, action, booleanExtra, intExtra, intExtra2));
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C0909a K = C0017h.m54K(supportFragmentManager, supportFragmentManager);
        K.mo4111f(C25750e.card_form_container, g, "add_credit_card_fragment");
        K.mo4040d();
        C20806a.C20807a aVar = new C20806a.C20807a("payment_method_view");
        aVar.mo52934b(this.f63945U, "payment_context");
        MarketingEventImpressionBinder.m41586a(this, aVar.mo52933a());
    }

    /* renamed from: f1 */
    public final C13753f<?> mo44522f1() {
        Intent intent = getIntent();
        this.f63945U = intent.getStringExtra("paymentContext");
        CreditCardInstructions creditCardInstructions = (CreditCardInstructions) intent.getParcelableExtra("creditCardInstructions");
        this.f63946X = creditCardInstructions;
        if (creditCardInstructions != null) {
            return null;
        }
        C25542a aVar = new C25542a(mo44548x1(), this.f63945U);
        StringBuilder sb = new StringBuilder();
        C13715c.m34249o(C25542a.class, sb, "#");
        sb.append(aVar.f63799w);
        String sb2 = sb.toString();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        return new C13753f<>(sb2, aVar, requestOptions);
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        String stringExtra = getIntent().getStringExtra("paymentContext");
        C17474b.C17475a m1 = super.mo19762m1();
        m1.mo49945m(AnalyticsAttributeKey.ID, stringExtra);
        return m1;
    }

    /* renamed from: o1 */
    public final void mo48834o1(ClearanceProviderType clearanceProviderType, PaymentMethod paymentMethod) {
        Intent intent = new Intent();
        intent.putExtra("clearanceProviderType", clearanceProviderType);
        intent.putExtra("paymentMethod", paymentMethod);
        setResult(-1, intent);
        finish();
    }
}
