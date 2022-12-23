package p761qy;

import android.text.style.ClickableSpan;
import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.wondo.consent.WondoConsentActivity;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import p543hq.C17474b;

/* renamed from: qy.c */
public final class C19203c extends ClickableSpan {

    /* renamed from: b */
    public final /* synthetic */ String f48811b;

    /* renamed from: c */
    public final /* synthetic */ WondoConsentActivity f48812c;

    public C19203c(WondoConsentActivity wondoConsentActivity, String str) {
        this.f48812c = wondoConsentActivity;
        this.f48811b = str;
    }

    public final void onClick(View view) {
        WondoConsentActivity wondoConsentActivity = this.f48812c;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "privacy_policy_clicked");
        wondoConsentActivity.mo44545v2(aVar.mo49933a());
        this.f48812c.startActivity(WebViewActivity.m18168y2(view.getContext(), this.f48812c.getString(R.string.cobrand_wondo_privacy_url), this.f48811b));
    }
}
