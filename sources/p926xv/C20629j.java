package p926xv;

import android.content.Context;
import android.widget.Toast;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.design.view.list.AbstractListItemView;
import com.moovit.network.model.ServerId;
import com.moovit.servicealerts.ServiceAlert;
import com.tranzmate.R;
import p001a0.C0016g;
import p455dy.C16753e;
import p543hq.C17474b;

/* renamed from: xv.j */
public final /* synthetic */ class C20629j implements AbstractListItemView.C15871b {

    /* renamed from: a */
    public final /* synthetic */ C20630k f52152a;

    /* renamed from: b */
    public final /* synthetic */ C16753e f52153b;

    /* renamed from: c */
    public final /* synthetic */ ServiceAlert f52154c;

    public /* synthetic */ C20629j(C20630k kVar, C16753e eVar, ServiceAlert serviceAlert) {
        this.f52152a = kVar;
        this.f52153b = eVar;
        this.f52154c = serviceAlert;
    }

    /* renamed from: a */
    public final void mo23219a(AbstractListItemView abstractListItemView, boolean z) {
        C20630k kVar = this.f52152a;
        C16753e eVar = this.f52153b;
        ServiceAlert serviceAlert = this.f52154c;
        int i = C20630k.f52155o;
        kVar.getClass();
        Context context = abstractListItemView.getContext();
        ServerId serverId = kVar.f52157i;
        if (z) {
            eVar.mo49431e(serverId);
            Toast.makeText(context, R.string.line_added_favorite, 0).show();
        } else {
            eVar.mo49443r(serverId);
            Toast.makeText(context, R.string.line_removed_favorite, 0).show();
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "favorite_action_switched");
        aVar.mo49939g(AnalyticsAttributeKey.ALERT_ID, serviceAlert.f23190b);
        aVar.mo49941i(AnalyticsAttributeKey.STATUS, z);
        aVar.mo49939g(AnalyticsAttributeKey.SERVICE_ALERT_TYPE, C0016g.m12B(serviceAlert.f23191c.f23213b));
        kVar.mo22564R1(aVar.mo49933a());
    }
}
