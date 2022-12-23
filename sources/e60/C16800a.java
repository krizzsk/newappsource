package e60;

import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.payment.invoices.AccountInvoicesActivity;
import p543hq.C17474b;
import p977zz.C20927a0;

/* renamed from: e60.a */
public final class C16800a extends ClickableSpan {

    /* renamed from: b */
    public final /* synthetic */ AccountInvoicesActivity f43753b;

    public C16800a(AccountInvoicesActivity accountInvoicesActivity) {
        this.f43753b = accountInvoicesActivity;
    }

    public final void onClick(View view) {
        AccountInvoicesActivity accountInvoicesActivity = this.f43753b;
        int i = AccountInvoicesActivity.f42708l0;
        accountInvoicesActivity.getClass();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "send_feedback_clicked");
        accountInvoicesActivity.mo44545v2(aVar.mo49933a());
        Intent i2 = C20927a0.m49014i(Uri.parse("moovit://feedback"));
        i2.setPackage(accountInvoicesActivity.getPackageName());
        if (i2.resolveActivity(accountInvoicesActivity.getPackageManager()) != null) {
            accountInvoicesActivity.startActivity(i2);
        }
    }
}
