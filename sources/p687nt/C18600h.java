package p687nt;

import android.os.Bundle;
import ce0.C21100e;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.image.model.ResourceImage;
import com.moovit.map.C16277g;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import com.tranzmate.R;
import p543hq.C17474b;

/* renamed from: nt.h */
public final /* synthetic */ class C18600h implements MapFragment.C16231l {

    /* renamed from: a */
    public final /* synthetic */ C18604l f47366a;

    public /* synthetic */ C18600h(C18604l lVar) {
        this.f47366a = lVar;
    }

    /* renamed from: a */
    public final void mo48681a(LatLonE6 latLonE6, boolean z) {
        C18604l lVar = this.f47366a;
        int i = C18604l.f47374T;
        lVar.getClass();
        if (z) {
            Bundle bundle = new Bundle();
            C21100e.m49373x(latLonE6, "latLon");
            bundle.putParcelable("extra_lat_lon", latLonE6);
            C18589b bVar = new C18589b();
            bVar.setArguments(bundle);
            bVar.show(lVar.getChildFragmentManager(), "location_dialog_tag");
            lVar.f47387M = lVar.mo50993X().mo48646o2(latLonE6, latLonE6, new MarkerZoomStyle(new ResourceImage(R.drawable.ic_map_pin_36_secondary, new String[0])));
            C16277g gVar = lVar.f47384J;
            if (gVar != null) {
                gVar.f42540g.add(latLonE6);
            }
            lVar.mo46797j2(new C17474b(AnalyticsEventKey.LOCATION_SHEET_SHOWN));
        }
    }
}
