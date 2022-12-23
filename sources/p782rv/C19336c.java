package p782rv;

import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.UiUtils;
import p543hq.C17474b;

/* renamed from: rv.c */
public final /* synthetic */ class C19336c implements View.OnFocusChangeListener {

    /* renamed from: b */
    public final /* synthetic */ C19337d f49200b;

    public /* synthetic */ C19336c(C19337d dVar) {
        this.f49200b = dVar;
    }

    public final void onFocusChange(View view, boolean z) {
        C19337d dVar = this.f49200b;
        int i = C19337d.f49201s;
        dVar.getClass();
        if (z) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.ON_FOCUS);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "edit_email_clicked");
            dVar.mo46797j2(aVar.mo49933a());
            UiUtils.m40240H(view.getContext());
        }
    }
}
