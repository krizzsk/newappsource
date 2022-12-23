package p761qy;

import android.text.style.ClickableSpan;
import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.wondo.consent.WondoConsentActivity;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import p543hq.C17474b;

/* renamed from: qy.b */
public final class C19202b extends ClickableSpan {

    /* renamed from: b */
    public final /* synthetic */ String f48809b;

    /* renamed from: c */
    public final /* synthetic */ WondoConsentActivity f48810c;

    public C19202b(WondoConsentActivity wondoConsentActivity, String str) {
        this.f48810c = wondoConsentActivity;
        this.f48809b = str;
    }

    public final void onClick(View view) {
        WondoConsentActivity wondoConsentActivity = this.f48810c;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "terms_of_use_clicked");
        wondoConsentActivity.mo44545v2(aVar.mo49933a());
        this.f48810c.startActivity(WebViewActivity.m18168y2(view.getContext(), this.f48810c.getString(R.string.cobrand_wondo_terms_of_use_url), this.f48809b));
    }
}
