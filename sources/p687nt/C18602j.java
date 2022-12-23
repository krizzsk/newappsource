package p687nt;

import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.taxi.TaxiOrder;
import com.moovit.app.taxi.providers.TaxiAppInfo;
import com.moovit.app.taxi.providers.TaxiProvider;
import com.moovit.map.MapFragment;
import com.moovit.transit.LocationDescriptor;
import java.util.Map;
import p543hq.C17474b;
import p781ru.C19331d;
import p805su.C19544f;

/* renamed from: nt.j */
public final /* synthetic */ class C18602j implements MapFragment.C16237r {

    /* renamed from: a */
    public final /* synthetic */ int f47368a = 0;

    /* renamed from: b */
    public final /* synthetic */ MapFragment f47369b;

    /* renamed from: c */
    public final /* synthetic */ C15682c f47370c;

    /* renamed from: d */
    public final /* synthetic */ Object f47371d;

    public /* synthetic */ C18602j(C18604l lVar, TaxiProvider taxiProvider, MapFragment mapFragment) {
        this.f47370c = lVar;
        this.f47371d = taxiProvider;
        this.f47369b = mapFragment;
    }

    public /* synthetic */ C18602j(C19544f fVar, MapFragment mapFragment, C19331d dVar) {
        this.f47370c = fVar;
        this.f47369b = mapFragment;
        this.f47371d = dVar;
    }

    /* renamed from: a */
    public final void mo21406a() {
        switch (this.f47368a) {
            case 0:
                C18604l lVar = (C18604l) this.f47370c;
                TaxiProvider taxiProvider = (TaxiProvider) this.f47371d;
                MapFragment mapFragment = this.f47369b;
                int i = C18604l.f47374T;
                lVar.getClass();
                TaxiAppInfo taxiAppInfo = taxiProvider.f39976k;
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.TAXI_CLICKED);
                aVar.mo49939g(AnalyticsAttributeKey.PROVIDER, taxiProvider.f39968c);
                aVar.mo49941i(AnalyticsAttributeKey.TAXI_APP_INSTALLED, taxiAppInfo.mo46103c(lVar.requireContext()));
                lVar.mo46797j2(aVar.mo49933a());
                taxiAppInfo.mo46102b().mo52438b(lVar.f40822c, taxiProvider, new TaxiOrder(TaxiOrder.Source.NEAR_ME, LocationDescriptor.m17770k(mapFragment.mo48615L2()), (LocationDescriptor) null, (Map<String, String>) null), (String) null);
                return;
            default:
                int i2 = C19544f.f49659s;
                ((C19544f) this.f47370c).mo51900p2(this.f47369b, (C19331d) this.f47371d);
                return;
        }
    }
}
