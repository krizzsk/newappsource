package p501fw;

import android.text.style.ClickableSpan;
import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import p543hq.C17474b;

/* renamed from: fw.i */
public final class C17111i extends ClickableSpan {

    /* renamed from: b */
    public final /* synthetic */ C17113k f44284b;

    public C17111i(C17113k kVar) {
        this.f44284b = kVar;
    }

    public final void onClick(View view) {
        C17113k kVar = this.f44284b;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "terms_of_use_clicked");
        kVar.mo46797j2(aVar.mo49933a());
        C17113k kVar2 = this.f44284b;
        kVar2.startActivity(WebViewActivity.m18168y2(kVar2.requireActivity(), this.f44284b.getString(R.string.terms_of_use_url), this.f44284b.getString(R.string.terms_of_service)));
    }
}
