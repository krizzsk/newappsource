package p780rt;

import android.text.style.ClickableSpan;
import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.intro.getstarted.FirstTimeUseLogoActivity;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import p543hq.C17474b;

/* renamed from: rt.a */
public final class C19326a extends ClickableSpan {

    /* renamed from: b */
    public final /* synthetic */ FirstTimeUseLogoActivity f49180b;

    public C19326a(FirstTimeUseLogoActivity firstTimeUseLogoActivity) {
        this.f49180b = firstTimeUseLogoActivity;
    }

    public final void onClick(View view) {
        FirstTimeUseLogoActivity firstTimeUseLogoActivity = this.f49180b;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "terms_of_use_clicked");
        firstTimeUseLogoActivity.mo44545v2(aVar.mo49933a());
        FirstTimeUseLogoActivity firstTimeUseLogoActivity2 = this.f49180b;
        firstTimeUseLogoActivity2.startActivity(WebViewActivity.m18168y2(firstTimeUseLogoActivity2, firstTimeUseLogoActivity2.getString(R.string.terms_of_use_url), this.f49180b.getString(R.string.terms_of_service_link)));
    }
}
