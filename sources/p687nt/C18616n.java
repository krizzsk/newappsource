package p687nt;

import com.moovit.transit.TransitStop;
import java.util.Comparator;

/* renamed from: nt.n */
public final /* synthetic */ class C18616n implements Comparator {

    /* renamed from: b */
    public final /* synthetic */ C18618p f47425b;

    public /* synthetic */ C18616n(C18618p pVar) {
        this.f47425b = pVar;
    }

    public final int compare(Object obj, Object obj2) {
        C18618p pVar = this.f47425b;
        TransitStop transitStop = (TransitStop) obj;
        TransitStop transitStop2 = (TransitStop) obj2;
        pVar.getClass();
        return Float.compare(pVar.mo51000a(transitStop.f23732d, transitStop.f23730b), pVar.mo51000a(transitStop2.f23732d, transitStop2.f23730b));
    }
}
