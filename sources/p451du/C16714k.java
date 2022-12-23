package p451du;

import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.linedetail.p416ui.LineDetailMapFragment;
import com.moovit.map.C16277g;
import com.moovit.map.MapFragment;
import p543hq.C17474b;

/* renamed from: du.k */
public final /* synthetic */ class C16714k implements MapFragment.C16232m {

    /* renamed from: b */
    public final /* synthetic */ int f43522b;

    /* renamed from: c */
    public final /* synthetic */ Object f43523c;

    public /* synthetic */ C16714k(Object obj, int i) {
        this.f43522b = i;
        this.f43523c = obj;
    }

    /* renamed from: h */
    public final void mo23898h(MapFragment.MapFollowMode mapFollowMode) {
        switch (this.f43522b) {
            case 0:
                LineDetailMapFragment lineDetailMapFragment = (LineDetailMapFragment) this.f43523c;
                int i = LineDetailMapFragment.f38746Y0;
                lineDetailMapFragment.getClass();
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "my_location_clicked");
                lineDetailMapFragment.mo46797j2(aVar.mo49933a());
                return;
            default:
                C16277g gVar = (C16277g) this.f43523c;
                gVar.f42539f = mapFollowMode;
                if (mapFollowMode.isFollowLocation()) {
                    gVar.f42538e.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
