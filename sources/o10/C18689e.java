package o10;

import com.moovit.home.stops.search.SearchStopItem;
import com.moovit.home.stops.search.SearchStopPagerFragment;
import com.moovit.transit.TransitType;
import p977zz.C20949l;

/* renamed from: o10.e */
public final /* synthetic */ class C18689e implements C20949l {

    /* renamed from: b */
    public final /* synthetic */ SearchStopItem f47575b;

    /* renamed from: c */
    public final /* synthetic */ TransitType f47576c;

    /* renamed from: d */
    public final /* synthetic */ boolean f47577d;

    public /* synthetic */ C18689e(SearchStopItem searchStopItem, TransitType transitType, boolean z) {
        this.f47575b = searchStopItem;
        this.f47576c = transitType;
        this.f47577d = z;
    }

    public final boolean invoke(Object obj) {
        SearchStopItem searchStopItem = this.f47575b;
        TransitType transitType = this.f47576c;
        boolean z = this.f47577d;
        int i = SearchStopPagerFragment.f41693p;
        ((C18682a) obj).mo48169Q(searchStopItem, transitType, z);
        return true;
    }
}
