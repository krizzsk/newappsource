package l30;

import a80.C7517d;
import a90.C7520c;
import c00.C13717b;
import com.moovit.ticketing.purchase.fare.PurchaseTicketFareSelectionStep;
import com.moovit.ticketing.purchase.fare.TicketFare;
import com.moovit.ticketing.purchase.filter.PurchaseFilters;
import com.moovit.transit.LocationDescriptor;
import f80.C12638d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p583jk.C17884p;
import w80.C13219a;
import z70.C13324c;

/* renamed from: l30.e */
public final /* synthetic */ class C5573e implements Callable {

    /* renamed from: b */
    public final /* synthetic */ int f18265b;

    /* renamed from: c */
    public final /* synthetic */ Object f18266c;

    public /* synthetic */ C5573e(Object obj, int i) {
        this.f18265b = i;
        this.f18266c = obj;
    }

    public final Object call() {
        switch (this.f18265b) {
            case 0:
                return C5577i.m13787c(((C5577i) this.f18266c).f18277a);
            case 1:
                C7517d dVar = (C7517d) this.f18266c;
                C12638d dVar2 = dVar.f22984f;
                dVar2.mo51499b();
                if (!C13717b.m34258e(dVar2.f48438c.mo40647e())) {
                    return new C13324c.C13325a((List<LocationDescriptor>) Collections.emptyList(), (Map<LocationDescriptor, Integer>) null);
                }
                return new C13324c.C13325a(dVar.f22983e.f22980a, (Map<LocationDescriptor, Integer>) null);
            default:
                PurchaseTicketFareSelectionStep purchaseTicketFareSelectionStep = (PurchaseTicketFareSelectionStep) this.f18266c;
                int i = C7520c.f22991t;
                List<TicketFare> list = purchaseTicketFareSelectionStep.f23299e;
                PurchaseFilters purchaseFilters = purchaseTicketFareSelectionStep.f23301g;
                if (list == null) {
                    return Collections.emptyList();
                }
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                for (TicketFare next : list) {
                    String str = next.f23327c + "_" + next.f23333i.f23495b + "_" + C17884p.m44335F(next.f23335k);
                    C13219a aVar = (C13219a) hashMap.get(str);
                    if (aVar == null) {
                        aVar = new C13219a(next.f23333i.mo24223c(), next.f23333i.mo24222b(), next.f23335k, purchaseFilters);
                        hashMap.put(str, aVar);
                        arrayList.add(aVar);
                    }
                    aVar.add(next);
                }
                return arrayList;
        }
    }
}
