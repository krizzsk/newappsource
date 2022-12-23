package p394br;

import aa0.C7537i;
import android.content.Context;
import c00.C13717b;
import c70.C13752e;
import com.moovit.app.history.itinerary.ItineraryHistoryItem;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.network.model.ServerId;
import e20.C16776h;
import mf0.C24362h;
import p396bt.C13682b;
import p567iq.C17635b;
import p646lz.C18299a;
import p824tp.C19728f;
import p922xr.C20564c;
import p929xy.C20663f;

/* renamed from: br.d */
public final class C13658d extends C20663f<C13682b> {
    /* renamed from: o */
    public final Object mo6593o(C13752e eVar, C18299a aVar, ServerId serverId, long j) {
        ItineraryHistoryItem itineraryHistoryItem;
        Itinerary itinerary;
        C24362h.m61211f(aVar, "appDataManager");
        C24362h.m61211f(serverId, "metroId");
        Context context = eVar.f33852a;
        C24362h.m61210e(context, "requestContext.androidContext");
        C20564c cVar = (C20564c) C17635b.m43779f(context).f50175e.mo51794a(C20564c.class);
        C24362h.m61210e(cVar, "from(context).globalDal.itinerary()");
        synchronized (cVar) {
            C7537i<ItineraryHistoryItem> d = cVar.mo52777d(context, serverId);
            d.mo51499b();
            itineraryHistoryItem = (ItineraryHistoryItem) C13717b.m34256c(d.f48432b);
        }
        if (itineraryHistoryItem == null) {
            return new C13682b(context, serverId, (ItineraryHistoryItem) null);
        }
        try {
            itinerary = C16776h.m42406a(eVar, (C19728f) aVar.mo50690c("METRO_CONTEXT"), itineraryHistoryItem.f38130c);
        } catch (Exception unused) {
            itinerary = null;
        }
        if (itinerary == null) {
            return new C13682b(context, serverId, (ItineraryHistoryItem) null);
        }
        return new C13682b(context, serverId, new ItineraryHistoryItem(itineraryHistoryItem.f38129b, itinerary, itineraryHistoryItem.f38131d));
    }
}
