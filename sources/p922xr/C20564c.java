package p922xr;

import aa0.C7537i;
import android.content.Context;
import ce0.C21100e;
import com.moovit.app.history.itinerary.ItineraryHistoryItem;
import com.moovit.network.model.ServerId;
import java.util.HashMap;
import p693nz.C18659h;
import p810sz.C19617r;
import p977zz.C20944i0;
import s00.C19390c;
import t00.C19622a;

/* renamed from: xr.c */
public final class C20564c extends C19622a {

    /* renamed from: c */
    public static final C19617r f52017c;

    /* renamed from: b */
    public final C18659h<ServerId, C7537i<ItineraryHistoryItem>> f52018b = new C18659h<>(1);

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        ItineraryHistoryItem.C14910a aVar = ItineraryHistoryItem.f38128e;
        C21100e.m49373x(aVar, "writer");
        hashMap.put(ItineraryHistoryItem.class, new C20944i0(1, aVar));
        hashMap2.put(1, aVar);
        f52017c = new C19617r(hashMap, hashMap2);
    }

    public C20564c(C19390c cVar) {
        super(cVar);
    }

    /* renamed from: d */
    public final synchronized C7537i<ItineraryHistoryItem> mo52777d(Context context, ServerId serverId) {
        C7537i<ItineraryHistoryItem> iVar;
        iVar = this.f52018b.get(serverId);
        if (iVar == null) {
            C19617r rVar = f52017c;
            iVar = new C7537i<>(context, "itinerary_history", serverId, rVar, rVar);
            iVar.mo51501d();
            this.f52018b.put(serverId, iVar);
        }
        return iVar;
    }
}
