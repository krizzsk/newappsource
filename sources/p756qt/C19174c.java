package p756qt;

import android.text.style.ClickableSpan;
import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.intro.FirstTimeUseActivityImpl;
import p543hq.C17474b;

/* renamed from: qt.c */
public final class C19174c extends ClickableSpan {

    /* renamed from: b */
    public final /* synthetic */ FirstTimeUseActivityImpl f48759b;

    public C19174c(FirstTimeUseActivityImpl firstTimeUseActivityImpl) {
        this.f48759b = firstTimeUseActivityImpl;
    }

    public final void onClick(View view) {
        FirstTimeUseActivityImpl firstTimeUseActivityImpl = this.f48759b;
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "terms_of_use_clicked");
        firstTimeUseActivityImpl.mo44545v2(aVar.mo49933a());
        FirstTimeUseActivityImpl.m37937G2(this.f48759b, 0);
    }
}
