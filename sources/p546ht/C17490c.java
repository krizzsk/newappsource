package p546ht;

import android.content.Context;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitStop;
import com.usebutton.sdk.internal.api.AppActionRequest;
import g30.C4776h;
import i30.C5267c;
import i30.C5268d;
import i30.C5269e;
import j40.C5384a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import mf0.C24362h;
import p474et.C16873e;
import p474et.C16874f;
import p824tp.C19728f;

/* renamed from: ht.c */
public abstract class C17490c implements C16873e {
    /* renamed from: c */
    public static List m43607c(Context context, C19728f fVar, Collection collection) {
        C24362h.m61211f(context, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(fVar, "metroContext");
        C24362h.m61211f(collection, "serverIds");
        if (collection.isEmpty()) {
            return EmptyList.f60173b;
        }
        HashSet hashSet = new HashSet(collection.size());
        ServerId.m11394f(collection, hashSet);
        C13752e g0 = C21100e.m49341g0(context);
        C4776h hVar = fVar.f50165a;
        C5269e d = C16759e.m42348d(hVar, "metroInfo");
        MetroEntityType metroEntityType = MetroEntityType.TRANSIT_STOP;
        d.f17412b.mo47002b(metroEntityType, hashSet);
        d.mo21067b(metroEntityType);
        C5268d P = new C5267c(g0, "StopSuggestionCardsProvider", hVar, d).mo21062P();
        ArrayList arrayList = new ArrayList(hashSet.size());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            TransitStop c = P.mo21064c(((C5384a) it.next()).getServerId());
            if (c != null) {
                arrayList.add(c);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final C16874f mo45183a() {
        return new C16874f(mo45187d(), false, (float) BitmapDescriptorFactory.HUE_RED, 14);
    }

    /* renamed from: d */
    public abstract String mo45187d();
}
