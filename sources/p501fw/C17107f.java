package p501fw;

import android.text.style.ClickableSpan;
import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import p543hq.C17474b;

/* renamed from: fw.f */
public final class C17107f extends ClickableSpan {

    /* renamed from: b */
    public final /* synthetic */ C17108g f44277b;

    public C17107f(C17108g gVar) {
        this.f44277b = gVar;
    }

    public final void onClick(View view) {
        C17108g gVar = this.f44277b;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "privacy_policy_clicked");
        gVar.mo46797j2(aVar.mo49933a());
        C17108g gVar2 = this.f44277b;
        gVar2.startActivity(WebViewActivity.m18168y2(gVar2.requireActivity(), this.f44277b.getString(R.string.privacy_url), this.f44277b.getString(R.string.privacy_policy)));
    }
}
