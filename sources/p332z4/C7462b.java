package p332z4;

import ce0.C21100e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import p107h5.C5058f;
import p120i5.C5280a;
import p120i5.C5282c;

/* renamed from: z4.b */
public final class C7462b extends C7468g<Integer> {
    public C7462b(List<C5280a<Integer>> list) {
        super(list);
    }

    /* renamed from: g */
    public final Object mo23718g(C5280a aVar, float f) {
        return Integer.valueOf(mo23730l(aVar, f));
    }

    /* renamed from: l */
    public final int mo23730l(C5280a<Integer> aVar, float f) {
        if (aVar.f17432b == null || aVar.f17433c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C5282c cVar = this.f22881e;
        if (cVar != null) {
            aVar.f17438h.floatValue();
            mo23716e();
            Integer num = (Integer) cVar.mo21085b((Integer) aVar.f17432b, (Integer) aVar.f17433c);
            if (num != null) {
                return num.intValue();
            }
        }
        return C21100e.m49322Q(C5058f.m12905b(f, BitmapDescriptorFactory.HUE_RED, 1.0f), ((Integer) aVar.f17432b).intValue(), ((Integer) aVar.f17433c).intValue());
    }
}
