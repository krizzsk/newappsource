package p687nt;

import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.stopdetail.StopDetailActivity;
import com.moovit.map.MapFragment;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitStop;
import java.util.List;
import p543hq.C17474b;

/* renamed from: nt.i */
public final /* synthetic */ class C18601i implements MapFragment.C16238s {

    /* renamed from: b */
    public final /* synthetic */ C18604l f47367b;

    public /* synthetic */ C18601i(C18604l lVar) {
        this.f47367b = lVar;
    }

    /* renamed from: L0 */
    public final void mo23897L0(MapFragment mapFragment, Object obj) {
        C18604l lVar = this.f47367b;
        int i = C18604l.f47374T;
        lVar.getClass();
        if (obj instanceof TransitStop) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "station_on_map_clicked");
            aVar.mo49941i(AnalyticsAttributeKey.IS_FAVORITE, true);
            lVar.mo46797j2(aVar.mo49933a());
            lVar.startActivity(StopDetailActivity.m39207B2(lVar.requireContext(), ((TransitStop) obj).f23730b, (ServerId) null, (TransitStop) null, (List) null));
        }
    }
}
