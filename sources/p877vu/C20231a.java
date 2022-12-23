package p877vu;

import aa0.C7537i;
import c00.C13729j;
import c70.C13752e;
import com.moovit.app.navigation.itinerary.ItineraryNavigable;
import com.moovit.navigation.Navigable;
import com.moovit.navigation.NavigationState;
import com.moovit.network.model.ServerId;
import e20.C16776h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p646lz.C18299a;
import p669mz.C18482c;
import p824tp.C19728f;
import p929xy.C20663f;

/* renamed from: vu.a */
public final class C20231a extends C20663f {
    /* renamed from: o */
    public final Object mo6593o(C13752e eVar, C18299a aVar, ServerId serverId, long j) {
        List list;
        C7537i iVar = new C7537i(eVar.f33852a, "navigation", serverId, NavigationState.f15078f, NavigationState.f15077e);
        iVar.mo51501d();
        iVar.mo51499b();
        C18482c<T> cVar = iVar.f48432b;
        int size = cVar.size();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = cVar.iterator();
        while (true) {
            C13729j jVar = (C13729j) it;
            if (!jVar.hasNext()) {
                break;
            }
            Navigable navigable = ((NavigationState) jVar.next()).f15079b;
            if (navigable instanceof ItineraryNavigable) {
                arrayList.add(((ItineraryNavigable) navigable).f39149j);
            }
        }
        try {
            list = C16776h.m42407b(eVar, (C19728f) aVar.mo50690c("METRO_CONTEXT"), arrayList);
        } catch (Exception unused) {
            list = Collections.emptyList();
        }
        Iterator<T> it2 = cVar.iterator();
        while (true) {
            C13729j jVar2 = (C13729j) it2;
            if (!jVar2.hasNext()) {
                break;
            }
            Navigable navigable2 = ((NavigationState) jVar2.next()).f15079b;
            if ((navigable2 instanceof ItineraryNavigable) && !list.contains(((ItineraryNavigable) navigable2).f39149j)) {
                ((C18482c.C18483a) it2).remove();
            }
        }
        if (size != cVar.size()) {
            iVar.mo51500c();
        }
        return iVar;
    }
}
