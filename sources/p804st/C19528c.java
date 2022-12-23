package p804st;

import android.text.style.ClickableSpan;
import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.web.WebViewActivity;
import com.tranzmate.R;
import p543hq.C17474b;

/* renamed from: st.c */
public final class C19528c extends ClickableSpan {

    /* renamed from: b */
    public final /* synthetic */ C19526b f49632b;

    public C19528c(C19526b bVar) {
        this.f49632b = bVar;
    }

    public final void onClick(View view) {
        C19526b bVar = this.f49632b;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "terms_of_use_clicked");
        bVar.mo46797j2(aVar.mo49933a());
        this.f49632b.startActivity(WebViewActivity.m18168y2(view.getContext(), this.f49632b.getString(R.string.terms_of_use_url), this.f49632b.getString(R.string.terms_of_service_link)));
    }
}
