package p332z4;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
import p120i5.C5280a;
import p120i5.C5282c;

/* renamed from: z4.j */
public final class C7471j extends C7468g<PointF> {

    /* renamed from: i */
    public final PointF f22905i = new PointF();

    /* renamed from: j */
    public final float[] f22906j = new float[2];

    /* renamed from: k */
    public final PathMeasure f22907k = new PathMeasure();

    /* renamed from: l */
    public C7470i f22908l;

    public C7471j(List<? extends C5280a<PointF>> list) {
        super(list);
    }

    /* renamed from: g */
    public final Object mo23718g(C5280a aVar, float f) {
        C7470i iVar = (C7470i) aVar;
        Path path = iVar.f22903q;
        if (path == null) {
            return (PointF) aVar.f17432b;
        }
        C5282c cVar = this.f22881e;
        if (cVar != null) {
            iVar.f17438h.floatValue();
            mo23716e();
            PointF pointF = (PointF) cVar.mo21085b((PointF) iVar.f17432b, (PointF) iVar.f17433c);
            if (pointF != null) {
                return pointF;
            }
        }
        if (this.f22908l != iVar) {
            this.f22907k.setPath(path, false);
            this.f22908l = iVar;
        }
        PathMeasure pathMeasure = this.f22907k;
        pathMeasure.getPosTan(pathMeasure.getLength() * f, this.f22906j, (float[]) null);
        PointF pointF2 = this.f22905i;
        float[] fArr = this.f22906j;
        pointF2.set(fArr[0], fArr[1]);
        return this.f22905i;
    }
}
