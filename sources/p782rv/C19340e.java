package p782rv;

import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import p543hq.C17474b;

/* renamed from: rv.e */
public final /* synthetic */ class C19340e implements View.OnFocusChangeListener {

    /* renamed from: b */
    public final /* synthetic */ C19342g f49209b;

    public /* synthetic */ C19340e(C19342g gVar) {
        this.f49209b = gVar;
    }

    public final void onFocusChange(View view, boolean z) {
        C19342g gVar = this.f49209b;
        int i = C19342g.f49212A;
        gVar.getClass();
        if (z) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.ON_FOCUS);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "phone_number_clicked");
            gVar.mo46797j2(aVar.mo49933a());
        }
    }
}
