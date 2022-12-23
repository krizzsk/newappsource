package p332z4;

import android.graphics.PointF;
import java.util.List;
import p107h5.C5058f;
import p120i5.C5280a;
import p120i5.C5282c;

/* renamed from: z4.f */
public final class C7467f extends C7468g<Integer> {
    public C7467f(List<C5280a<Integer>> list) {
        super(list);
    }

    /* renamed from: g */
    public final Object mo23718g(C5280a aVar, float f) {
        return Integer.valueOf(mo23735l(aVar, f));
    }

    /* renamed from: l */
    public final int mo23735l(C5280a<Integer> aVar, float f) {
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
        if (aVar.f17441k == 784923401) {
            aVar.f17441k = ((Integer) aVar.f17432b).intValue();
        }
        int i = aVar.f17441k;
        if (aVar.f17442l == 784923401) {
            aVar.f17442l = ((Integer) aVar.f17433c).intValue();
        }
        int i2 = aVar.f17442l;
        PointF pointF = C5058f.f17056a;
        return (int) ((f * ((float) (i2 - i))) + ((float) i));
    }
}
