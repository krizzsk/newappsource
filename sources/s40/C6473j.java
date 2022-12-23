package s40;

import q40.C6177b;
import r40.C6250a;

/* renamed from: s40.j */
public final class C6473j extends C6466e {
    /* renamed from: a */
    public final void mo22585a(C6465d dVar) throws Exception {
        C6250a aVar = dVar.f20185b.f19558a.get();
        dVar.f20192i = aVar;
        if (aVar == null) {
            C6177b bVar = dVar.f20185b;
            bVar.f19559b.block();
            bVar.f19559b.close();
            try {
                C6250a aVar2 = dVar.f20185b.f19558a.get();
                dVar.f20192i = aVar2;
                if (aVar2 == null) {
                    C6250a aVar3 = new C6250a(dVar.f20184a.mo21439h("service_ids.dat"), dVar.f20184a.mo21439h("pattern_ids.dat"), dVar.f20184a.mo21439h("line_ids.dat"), dVar.f20184a.mo21439h("trip_frequencies_index.dat"), dVar.f20184a.mo21439h("trips_index.dat"));
                    dVar.f20192i = aVar3;
                    dVar.f20185b.f19558a.set(aVar3);
                }
            } finally {
                dVar.f20185b.f19559b.open();
            }
        }
    }
}
