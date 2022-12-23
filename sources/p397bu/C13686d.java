package p397bu;

import android.os.Parcelable;
import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.itinerary.view.leg.C15081f;
import com.moovit.app.itinerary.view.leg.C15090n;
import com.moovit.home.lines.search.SearchLineFragment;
import com.moovit.home.lines.search.SearchLinePagerActivity;
import com.moovit.itinerary.model.leg.DocklessMopedLeg;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.transit.TransitType;
import p001a0.C0016g;
import p543hq.C17474b;

/* renamed from: bu.d */
public final /* synthetic */ class C13686d implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f33733b;

    /* renamed from: c */
    public final /* synthetic */ Object f33734c;

    /* renamed from: d */
    public final /* synthetic */ Object f33735d;

    /* renamed from: e */
    public final /* synthetic */ Parcelable f33736e;

    public /* synthetic */ C13686d(Object obj, Parcelable parcelable, Object obj2, int i) {
        this.f33733b = i;
        this.f33735d = obj;
        this.f33736e = parcelable;
        this.f33734c = obj2;
    }

    public final void onClick(View view) {
        SearchLinePagerActivity.C16001c z2;
        int indexOf;
        switch (this.f33733b) {
            case 0:
                ((C15081f) this.f33735d).mo45371D(view, (DocklessMopedLeg) this.f33736e, (Leg) this.f33734c);
                return;
            case 1:
                int i = C15090n.f38722E;
                ((C15090n) this.f33735d).mo45371D(view, (WaitToTransitLineLeg) this.f33736e, (Leg) this.f33734c);
                return;
            default:
                SearchLineFragment searchLineFragment = (SearchLineFragment) this.f33735d;
                SearchLinePagerActivity searchLinePagerActivity = (SearchLinePagerActivity) this.f33734c;
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar.mo49939g(AnalyticsAttributeKey.TYPE, "search_all_clicked");
                aVar.mo49939g(AnalyticsAttributeKey.TRANSIT_TYPE, C0016g.m15E((TransitType) this.f33736e));
                aVar.mo49939g(AnalyticsAttributeKey.QUERY_STRING, searchLineFragment.f41630t);
                searchLineFragment.mo46797j2(aVar.mo49933a());
                if (searchLinePagerActivity.f37313z && (z2 = searchLinePagerActivity.mo48158z2()) != null && (indexOf = z2.f41650f.indexOf((Object) null)) >= 0) {
                    searchLinePagerActivity.f41647X.mo47356e(indexOf, true);
                    return;
                }
                return;
        }
    }
}
