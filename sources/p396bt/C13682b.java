package p396bt;

import android.content.Context;
import com.moovit.app.history.itinerary.ItineraryHistoryItem;
import com.moovit.network.model.ServerId;
import mf0.C24362h;
import p567iq.C17635b;
import p922xr.C20564c;

/* renamed from: bt.b */
public final class C13682b {

    /* renamed from: a */
    public final Context f33717a;

    /* renamed from: b */
    public final ServerId f33718b;

    /* renamed from: c */
    public final C20564c f33719c;

    /* renamed from: d */
    public ItineraryHistoryItem f33720d;

    public /* synthetic */ C13682b() {
        throw null;
    }

    public C13682b(Context context, ServerId serverId, ItineraryHistoryItem itineraryHistoryItem) {
        C24362h.m61211f(serverId, "metroId");
        this.f33717a = context;
        this.f33718b = serverId;
        C20564c cVar = (C20564c) C17635b.m43779f(context).f50175e.mo51794a(C20564c.class);
        C24362h.m61210e(cVar, "from(context).globalDal.itinerary()");
        this.f33719c = cVar;
        this.f33720d = itineraryHistoryItem;
    }
}
