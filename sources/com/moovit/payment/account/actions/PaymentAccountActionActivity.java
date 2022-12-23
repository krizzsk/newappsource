package com.moovit.payment.account.actions;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import c70.C13752e;
import com.moovit.payment.account.actions.model.AccountActionIntent;
import com.moovit.payment.account.actions.model.DeepLinkActionIntent;
import com.moovit.payment.account.actions.model.HtmlStep;
import com.moovit.payment.account.actions.model.InputStep;
import com.moovit.payment.account.actions.model.OptionSelectionStep;
import com.moovit.payment.account.actions.model.PaymentStep;
import com.moovit.payment.gateway.AbstractPaymentGatewayActivity;
import com.moovit.request.RequestOptions;
import je0.C23715f;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import mf0.C24362h;
import v40.C25747b;
import v40.C25750e;
import v40.C25751f;
import x40.C25771e;
import z40.C25778b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo59060d2 = {"Lcom/moovit/payment/account/actions/PaymentAccountActionActivity;", "Lcom/moovit/payment/gateway/AbstractPaymentGatewayActivity;", "<init>", "()V", "Payment_release"}, mo59061k = 1, mo59062mv = {1, 7, 1})
public final class PaymentAccountActionActivity extends AbstractPaymentGatewayActivity {

    /* renamed from: X */
    public static final /* synthetic */ int f63869X = 0;

    /* renamed from: A2 */
    public static AccountActionIntent m64042A2(Intent intent) {
        Uri data;
        if (intent != null) {
            if (C24362h.m61206a("android.intent.action.VIEW", intent.getAction()) && (data = intent.getData()) != null) {
                return new DeepLinkActionIntent(data);
            }
            AccountActionIntent accountActionIntent = (AccountActionIntent) intent.getParcelableExtra("accountActionIntent");
            if (accountActionIntent != null) {
                return accountActionIntent;
            }
        }
        throw new IllegalStateException("Did you use PaymentAccountActionActivity.newInstance(..)?");
    }

    /* renamed from: V0 */
    public final void mo19423V0(Bundle bundle, String str) {
        C24362h.m61211f(bundle, "args");
        if (mo44529n1(C25750e.fragment_container) == null) {
            finish();
        } else if (bundle.getInt("errorCode", -1) == 60004) {
            finish();
        }
    }

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        setIntent(intent);
        mo83342y2(m64042A2(intent));
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView(C25751f.account_action_activity);
        if (mo44529n1(C25750e.fragment_container) == null) {
            mo83342y2(m64042A2(getIntent()));
        }
    }

    /* renamed from: y2 */
    public final void mo83342y2(AccountActionIntent accountActionIntent) {
        mo44543u2((CharSequence) null);
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        C13752e x1 = mo44548x1();
        C24362h.m61210e(x1, "requestContext");
        mo44527k2(C25778b.class.getName(), new C25778b(x1, accountActionIntent), requestOptions, new C25771e(this));
    }

    /* renamed from: z2 */
    public final void mo83343z2(C23715f fVar) {
        Fragment fragment;
        if (fVar instanceof OptionSelectionStep) {
            int i = AccountActionSelectionStepFragment.f63858q;
            fragment = new AccountActionSelectionStepFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("selectionStep", (OptionSelectionStep) fVar);
            fragment.setArguments(bundle);
        } else if (fVar instanceof InputStep) {
            int i2 = AccountActionInputStepFragment.f63851q;
            fragment = new AccountActionInputStepFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("inputStep", (InputStep) fVar);
            fragment.setArguments(bundle2);
        } else if (fVar instanceof HtmlStep) {
            int i3 = AccountActionHtmlStepFragment.f63849o;
            fragment = new AccountActionHtmlStepFragment();
            Bundle bundle3 = new Bundle();
            bundle3.putParcelable("htmlStep", (HtmlStep) fVar);
            fragment.setArguments(bundle3);
        } else if (fVar instanceof PaymentStep) {
            int i4 = AccountActionPaymentStepFragment.f63855p;
            fragment = new AccountActionPaymentStepFragment();
            Bundle bundle4 = new Bundle();
            bundle4.putParcelable("paymentStep", (PaymentStep) fVar);
            fragment.setArguments(bundle4);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        int i5 = C25750e.fragment_container;
        if (mo44529n1(i5) == null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            C24362h.m61210e(supportFragmentManager, "supportFragmentManager");
            C0909a aVar = new C0909a(supportFragmentManager);
            aVar.mo4111f(i5, fragment, (String) null);
            aVar.mo4040d();
            return;
        }
        FragmentManager supportFragmentManager2 = getSupportFragmentManager();
        C24362h.m61210e(supportFragmentManager2, "supportFragmentManager");
        C0909a aVar2 = new C0909a(supportFragmentManager2);
        aVar2.mo4112g(C25747b.slide_fragment_enter, C25747b.slide_fragment_exit, C25747b.slide_fragment_pop_enter, C25747b.slide_fragment_pop_exit);
        aVar2.mo4111f(i5, fragment, (String) null);
        aVar2.mo4110c((String) null);
        aVar2.mo4040d();
    }
}
