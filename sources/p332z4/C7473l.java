package p332z4;

import android.graphics.PointF;
import java.util.List;
import p107h5.C5058f;
import p120i5.C5280a;
import p120i5.C5282c;
import p120i5.C5283d;

/* renamed from: z4.l */
public final class C7473l extends C7468g<C5283d> {

    /* renamed from: i */
    public final C5283d f22910i = new C5283d();

    public C7473l(List<C5280a<C5283d>> list) {
        super(list);
    }

    /* renamed from: g */
    public final Object mo23718g(C5280a aVar, float f) {
        T t;
        T t2 = aVar.f17432b;
        if (t2 == null || (t = aVar.f17433c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C5283d dVar = (C5283d) t2;
        C5283d dVar2 = (C5283d) t;
        C5282c cVar = this.f22881e;
        if (cVar != null) {
            aVar.f17438h.floatValue();
            mo23716e();
            C5283d dVar3 = (C5283d) cVar.mo21085b(dVar, dVar2);
            if (dVar3 != null) {
                return dVar3;
            }
        }
        C5283d dVar4 = this.f22910i;
        float f2 = dVar.f17452a;
        float f3 = dVar2.f17452a;
        PointF pointF = C5058f.f17056a;
        float c = C16759e.m42347c(f3, f2, f, f2);
        float f4 = dVar.f17453b;
        float c2 = C16759e.m42347c(dVar2.f17453b, f4, f, f4);
        dVar4.f17452a = c;
        dVar4.f17453b = c2;
        return dVar4;
    }
}
