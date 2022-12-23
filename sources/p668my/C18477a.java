package p668my;

import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.useraccount.providers.moovit.MoovitConnectProviderActivity;
import p543hq.C17474b;

/* renamed from: my.a */
public final class C18477a implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ MoovitConnectProviderActivity f47080b;

    public C18477a(MoovitConnectProviderActivity moovitConnectProviderActivity) {
        this.f47080b = moovitConnectProviderActivity;
    }

    public final void onClick(View view) {
        MoovitConnectProviderActivity moovitConnectProviderActivity = this.f47080b;
        int i = MoovitConnectProviderActivity.f40653x0;
        moovitConnectProviderActivity.getClass();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, moovitConnectProviderActivity.f40662p0.getForwarderAnalyticsType());
        moovitConnectProviderActivity.mo44545v2(aVar.mo49933a());
        int i2 = MoovitConnectProviderActivity.C15645g.f40675a[moovitConnectProviderActivity.f40662p0.ordinal()];
        if (i2 == 1) {
            moovitConnectProviderActivity.mo46653C2(MoovitConnectProviderActivity.Mode.RESET);
        } else if (i2 == 2) {
            moovitConnectProviderActivity.mo46653C2(MoovitConnectProviderActivity.Mode.LOGIN);
        }
    }
}
