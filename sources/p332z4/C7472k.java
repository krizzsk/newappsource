package p332z4;

import android.graphics.PointF;
import java.util.List;
import p120i5.C5280a;
import p120i5.C5282c;

/* renamed from: z4.k */
public final class C7472k extends C7468g<PointF> {

    /* renamed from: i */
    public final PointF f22909i = new PointF();

    public C7472k(List<C5280a<PointF>> list) {
        super(list);
    }

    /* renamed from: g */
    public final Object mo23718g(C5280a aVar, float f) {
        return mo23719h(aVar, f, f, f);
    }

    /* renamed from: l */
    public final PointF mo23719h(C5280a<PointF> aVar, float f, float f2, float f3) {
        T t;
        T t2 = aVar.f17432b;
        if (t2 == null || (t = aVar.f17433c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) t2;
        PointF pointF2 = (PointF) t;
        C5282c cVar = this.f22881e;
        if (cVar != null) {
            aVar.f17438h.floatValue();
            mo23716e();
            PointF pointF3 = (PointF) cVar.mo21085b(pointF, pointF2);
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = this.f22909i;
        float f4 = pointF.x;
        float c = C16759e.m42347c(pointF2.x, f4, f2, f4);
        float f5 = pointF.y;
        pointF4.set(c, ((pointF2.y - f5) * f3) + f5);
        return this.f22909i;
    }
}
