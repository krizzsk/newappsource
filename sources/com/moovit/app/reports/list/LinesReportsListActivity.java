package com.moovit.app.reports.list;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.MotionEvent;
import c70.C13752e;
import c70.C13753f;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.reports.service.ReportEntityType;
import com.moovit.app.servicealerts.ServiceAlertDetailsActivity;
import com.moovit.design.view.list.ListItemView;
import com.moovit.l10n.C16181a;
import com.moovit.l10n.LinePresentationType;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.network.model.ServerId;
import com.moovit.servicealerts.ServiceAlert;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitLineGroup;
import com.tranzmate.R;
import g30.C4776h;
import i30.C5267c;
import i30.C5268d;
import i30.C5269e;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p001a0.C0016g;
import p543hq.C17474b;
import p548hv.C17501c;
import p594jv.C17942l;
import p618kv.C18145f;
import p824tp.C19728f;
import p906wz.C20436g;

public class LinesReportsListActivity extends ReportsListActivity<TransitLine> implements C17942l.C17944b {

    /* renamed from: o0 */
    public ServerId f39182o0;

    /* renamed from: E2 */
    public static Intent m38851E2(Context context, ServerId serverId, TransitLine transitLine, ServerId serverId2) {
        Intent intent = new Intent(context, LinesReportsListActivity.class);
        intent.putExtra("reportsListDataId", serverId);
        intent.putExtra("reportsListData", transitLine);
        intent.putExtra("LINE_GROUP_ID_EXTRA", serverId2);
        return intent;
    }

    /* renamed from: B2 */
    public final void mo45690B2() {
        this.f39187Z.dispatchTouchEvent(MotionEvent.obtain(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0));
        C18145f.m44854S1(ReportEntityType.LINE, this.f39185X, 0).show(getSupportFragmentManager(), "ReportCategoryListDialog");
    }

    /* renamed from: C2 */
    public final void mo45691C2(ServiceAlert serviceAlert) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "service_alert_clicked");
        aVar.mo49939g(AnalyticsAttributeKey.ALERT_ID, serviceAlert.f23190b);
        aVar.mo49939g(AnalyticsAttributeKey.SERVICE_ALERT_TYPE, C0016g.m12B(serviceAlert.f23191c.f23213b));
        mo44545v2(aVar.mo49933a());
        startActivity(ServiceAlertDetailsActivity.m39147A2(this, serviceAlert, this.f39182o0));
    }

    /* renamed from: D2 */
    public final void mo45692D2(Parcelable parcelable) {
        ListItemView listItemView = (ListItemView) findViewById(R.id.reports_list_title);
        HashSet hashSet = C19728f.f50164e;
        C16181a.m41233b(((C19728f) getSystemService("metro_context")).mo52082b(LinePresentationType.LINE_NEWS), listItemView, (TransitLine) parcelable);
        mo45695A2(mo45693F2());
    }

    /* renamed from: F2 */
    public final C17501c mo45693F2() {
        return new C17501c(this.f39185X, ReportEntityType.LINE);
    }

    /* renamed from: U1 */
    public final void mo44512U1(List<C20436g<?, ?>> list) {
        C5268d a = C5268d.m13299a(list);
        TransitLineGroup transitLineGroup = (TransitLineGroup) a.f17405b.get(this.f39182o0);
        ServerId serverId = this.f39185X;
        if (serverId == null) {
            T t = (Parcelable) transitLineGroup.f23700h.get(0);
            this.f39186Y = t;
            this.f39185X = ((TransitLine) t).f23687c;
            return;
        }
        this.f39186Y = transitLineGroup.mo24377c(serverId);
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        this.f39182o0 = (ServerId) getIntent().getParcelableExtra("LINE_GROUP_ID_EXTRA");
        super.mo19425e2(bundle);
    }

    /* renamed from: f1 */
    public final C13753f<?> mo44522f1() {
        if (this.f39186Y != null) {
            return null;
        }
        this.f39182o0 = (ServerId) getIntent().getParcelableExtra("LINE_GROUP_ID_EXTRA");
        C13752e x1 = mo44548x1();
        String simpleName = getClass().getSimpleName();
        C4776h hVar = C19728f.m47195a(x1.f33852a).f50165a;
        C5269e d = C16759e.m42348d(hVar, "metroInfo");
        d.mo21066a(MetroEntityType.TRANSIT_LINE_GROUP, this.f39182o0);
        C5267c cVar = new C5267c(x1, simpleName, hVar, d);
        return new C13753f<>(cVar.mo21061O(), cVar);
    }

    /* renamed from: l */
    public final void mo45694l(boolean z) {
        if (z) {
            mo45695A2(mo45693F2());
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        hashSet.add("GTFS_METRO_ENTITIES_LOADER");
        hashSet.add("TWITTER_SERVICE_ALERTS_FEEDS");
        return s1;
    }
}
