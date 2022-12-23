package s40;

import c70.C13752e;
import ce0.C21100e;
import com.moovit.metroentities.MetroEntityType;
import g30.C4776h;
import i30.C5267c;
import i30.C5269e;
import r40.C6251b;

/* renamed from: s40.i */
public final class C6472i extends C6466e {
    /* renamed from: a */
    public final void mo22585a(C6465d dVar) throws Exception {
        C5269e.C5270a aVar = new C5269e.C5270a();
        aVar.mo21075b(dVar.f20191h.f15142b);
        C6251b bVar = dVar.f20197n;
        if (bVar != null) {
            int size = bVar.f19718e.size();
            for (int i = 0; i < size; i++) {
                aVar.f17418e.add(Integer.valueOf(dVar.f20197n.f19718e.valueAt(i)));
            }
            int size2 = dVar.f20197n.f19725l.size();
            for (int i2 = 0; i2 < size2; i2++) {
                int valueAt = dVar.f20197n.f19725l.valueAt(i2);
                if (valueAt != -1) {
                    aVar.f17422i.add(Integer.valueOf(valueAt));
                }
            }
        }
        C13752e eVar = dVar.f20186c;
        C4776h hVar = dVar.f20187d.f50165a;
        C5269e a = aVar.mo21074a();
        C21100e.m49373x(eVar, "requestContext");
        C21100e.m49373x(hVar, "metroInfo");
        C21100e.m49373x(a, "collection");
        a.mo21067b(MetroEntityType.TRANSIT_PATTERN);
        dVar.f20198o = new C5267c(eVar, "LoadMetroEntities", hVar, a).mo21062P();
    }
}
