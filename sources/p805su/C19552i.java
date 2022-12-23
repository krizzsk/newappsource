package p805su;

import androidx.recyclerview.widget.RecyclerView;
import c00.C13717b;
import com.google.android.gms.tasks.OnSuccessListener;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.mot.purchase.MotQrCodeActivationActivity;
import com.moovit.marketing.MarketingEventImpressionBinder;
import com.moovit.search.SearchAction;
import com.moovit.search.SearchLocationActivity;
import com.moovit.transit.LocationDescriptor;
import java.util.List;
import p543hq.C17474b;
import p805su.C19554k;
import p824tp.C19728f;
import z20.C20806a;
import z70.C13321a;

/* renamed from: su.i */
public final /* synthetic */ class C19552i implements OnSuccessListener {

    /* renamed from: b */
    public final /* synthetic */ int f49692b;

    /* renamed from: c */
    public final /* synthetic */ Object f49693c;

    /* renamed from: d */
    public final /* synthetic */ Object f49694d;

    /* renamed from: e */
    public final /* synthetic */ Object f49695e;

    public /* synthetic */ C19552i(int i, Object obj, Object obj2, Object obj3) {
        this.f49692b = i;
        this.f49693c = obj;
        this.f49694d = obj2;
        this.f49695e = obj3;
    }

    public final void onSuccess(Object obj) {
        switch (this.f49692b) {
            case 0:
                C19554k kVar = (C19554k) this.f49693c;
                C19728f fVar = (C19728f) this.f49694d;
                RecyclerView recyclerView = (RecyclerView) this.f49695e;
                List list = (List) obj;
                int i = C19554k.f49700n;
                kVar.getClass();
                if (C13717b.m34258e(list)) {
                    MotQrCodeActivationActivity motQrCodeActivationActivity = (MotQrCodeActivationActivity) kVar.f40822c;
                    motQrCodeActivationActivity.getClass();
                    motQrCodeActivationActivity.mo45585z2(new C19560p(), "trip", false);
                    return;
                }
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "mot_suggestions_impression");
                aVar.mo49935c(AnalyticsAttributeKey.COUNT, list.size());
                kVar.mo46797j2(aVar.mo49933a());
                C20806a.C20807a aVar2 = new C20806a.C20807a("recent_rides_view");
                aVar2.mo52934b(Integer.valueOf(list.size()), "number_of_items");
                MarketingEventImpressionBinder.m41586a(kVar, aVar2.mo52933a());
                kVar.mo51897o2();
                recyclerView.setAdapter(new C19554k.C19555a(fVar, list));
                return;
            default:
                SearchLocationActivity searchLocationActivity = (SearchLocationActivity) this.f49693c;
                int i2 = SearchLocationActivity.f23120s0;
                searchLocationActivity.getClass();
                String str = ((C13321a) this.f49694d).f33069a;
                searchLocationActivity.mo23891B2(str, (LocationDescriptor) obj, (SearchAction) this.f49695e);
                return;
        }
    }
}
