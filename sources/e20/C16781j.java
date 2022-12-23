package e20;

import com.moovit.itinerary.model.leg.Leg;
import com.moovit.servicealerts.LineServiceAlertDigest;
import e20.C16783l;
import j80.C12772a;
import java.util.Comparator;

/* renamed from: e20.j */
public final /* synthetic */ class C16781j implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ C12772a f43685b;

    /* renamed from: c */
    public final /* synthetic */ C16783l.C16786c f43686c;

    public /* synthetic */ C16781j(C12772a aVar, C16783l.C16786c cVar) {
        this.f43685b = aVar;
        this.f43686c = cVar;
    }

    public final int compare(Object obj, Object obj2) {
        C12772a aVar = this.f43685b;
        C16783l.C16786c cVar = this.f43686c;
        aVar.getClass();
        return C12772a.m32576a((LineServiceAlertDigest) ((Leg) obj).mo48338i0(cVar), (LineServiceAlertDigest) ((Leg) obj2).mo48338i0(cVar));
    }
}
