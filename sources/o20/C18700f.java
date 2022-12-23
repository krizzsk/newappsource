package o20;

import com.moovit.location.C16202a;
import com.moovit.map.MapFragment;
import java.util.Set;
import p115i0.C5227c;
import p20.C18880g;
import p977zz.C20935e;

/* renamed from: o20.f */
public final /* synthetic */ class C18700f implements C20935e {

    /* renamed from: b */
    public final /* synthetic */ int f47606b;

    /* renamed from: c */
    public final /* synthetic */ MapFragment f47607c;

    public /* synthetic */ C18700f(MapFragment mapFragment, int i) {
        this.f47606b = i;
        this.f47607c = mapFragment;
    }

    public final void invoke(Object obj) {
        switch (this.f47606b) {
            case 0:
                MapFragment mapFragment = this.f47607c;
                Void voidR = (Void) obj;
                C5227c cVar = MapFragment.f42333I0;
                A a = mapFragment.f40822c;
                if (a != null && mapFragment.f40824e) {
                    C16202a.get(a).requestLocationSettings().addOnSuccessListener(mapFragment.f42362U);
                    return;
                }
                return;
            default:
                Set set = (Set) obj;
                for (MapFragment.C16224f fVar : this.f47607c.f42375q0.values()) {
                    fVar.f42401e.mo51062a(C18880g.class, set);
                }
                return;
        }
    }
}
