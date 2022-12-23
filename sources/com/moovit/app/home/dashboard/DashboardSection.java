package com.moovit.app.home.dashboard;

import a70.C13396b;
import android.content.Context;
import androidx.fragment.app.C0965s;
import androidx.fragment.app.Fragment;
import com.moovit.app.ads.C14744k;
import com.moovit.app.home.dashboard.suggestions.SuggestionsSectionFragment;
import com.moovit.app.ridesharing.C15246b;
import com.moovit.app.tod.C15462b;
import com.moovit.ticketing.ticket.C7762g;
import p435de.C16596f;
import p448dr.C16697b;
import p664mu.C18451j;
import p691nx.C18642a;
import p691nx.C18644b;
import p80.C12995d;
import p832tx.C19791a;
import p874vr.C20199a;
import p875vs.C20229f;
import q00.C19047a;
import q00.C19053d;

public enum DashboardSection {
    NAVIGABLE(C14953p.class, (int) null),
    EVENTS(C15246b.class, (int) null),
    CARPOOL(C14926b.class, C19053d.f48487z),
    TAXI(C14988w.class, C19053d.f48486y),
    TOPUP(C14990x.class, (int) null),
    COMMUNITY(C14935d.class, C20199a.f51296q0),
    FAVORITE_LOCATIONS(C14946k.class, r14),
    FAVORITE_STATIONS(C14949m.class, (int) null),
    ITINERARY_HISTORY(ItineraryHistorySection.class, r14),
    LOCATION_SERVICES_ALERT(LocationServicesStateSection.class, (int) null),
    PROMOTION(C14985u.class, (int) null),
    WEB_PAGES(C20229f.class, (int) null),
    MOT(C18451j.class, C20199a.f51242D0),
    ADS(C14744k.class, (int) null),
    SUGGESTIONS(SuggestionsSectionFragment.class, (int) null),
    WALLET(C13396b.class, (int) null),
    TICKETS(C7762g.class, C12995d.f32165a),
    TOD(C15462b.class, r15),
    BUS_ITALIA_TOD(C18642a.class, r15),
    GTT_TOD(C18644b.class, r15),
    ATAF_TICKETS(C16697b.class, (int) null),
    UMO_ADS(C19791a.class, (int) null);
    
    private final Class<? extends Fragment> clazz;
    private final C19047a.C19049b<Boolean> dependency;

    private DashboardSection(Class<? extends Fragment> cls, C19047a.C19049b<Boolean> bVar) {
        this.clazz = cls;
        this.dependency = bVar;
    }

    public Fragment instantiate(Context context, C0965s sVar) {
        try {
            context.getClassLoader();
            return sVar.mo3992a(this.clazz.getName());
        } catch (Throwable th) {
            C16596f.m42113a().mo49364c(th);
            return null;
        }
    }

    public boolean isSupported(C19047a aVar) {
        C19047a.C19049b bVar = this.dependency;
        return bVar == null || Boolean.TRUE.equals(aVar.mo51505b(bVar));
    }
}
