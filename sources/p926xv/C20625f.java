package p926xv;

import android.content.Context;
import android.widget.CompoundButton;
import android.widget.Toast;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.servicealerts.ServiceAlertDetailsActivity;
import com.moovit.network.model.ServerId;
import com.moovit.servicealerts.ServiceAlert;
import com.tranzmate.R;
import p001a0.C0016g;
import p455dy.C16753e;
import p543hq.C17474b;

/* renamed from: xv.f */
public final /* synthetic */ class C20625f implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ ServiceAlertDetailsActivity f52143a;

    /* renamed from: b */
    public final /* synthetic */ C16753e f52144b;

    /* renamed from: c */
    public final /* synthetic */ ServiceAlert f52145c;

    /* renamed from: d */
    public final /* synthetic */ ServerId f52146d;

    public /* synthetic */ C20625f(ServiceAlertDetailsActivity serviceAlertDetailsActivity, C16753e eVar, ServiceAlert serviceAlert, ServerId serverId) {
        this.f52143a = serviceAlertDetailsActivity;
        this.f52144b = eVar;
        this.f52145c = serviceAlert;
        this.f52146d = serverId;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        ServiceAlertDetailsActivity serviceAlertDetailsActivity = this.f52143a;
        C16753e eVar = this.f52144b;
        ServiceAlert serviceAlert = this.f52145c;
        ServerId serverId = this.f52146d;
        int i = ServiceAlertDetailsActivity.f39553Y;
        serviceAlertDetailsActivity.getClass();
        Context context = compoundButton.getContext();
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
        serviceAlertDetailsActivity.mo44545v2(aVar.mo49933a());
    }
}
