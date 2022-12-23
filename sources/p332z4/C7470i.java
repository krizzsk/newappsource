package p332z4;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.C1867f;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p107h5.C5059g;
import p120i5.C5280a;

/* renamed from: z4.i */
public final class C7470i extends C5280a<PointF> {

    /* renamed from: q */
    public Path f22903q;

    /* renamed from: r */
    public final C5280a<PointF> f22904r;

    public C7470i(C1867f fVar, C5280a<PointF> aVar) {
        super(fVar, (PointF) aVar.f17432b, (PointF) aVar.f17433c, aVar.f17434d, aVar.f17435e, aVar.f17436f, aVar.f17437g, aVar.f17438h);
        this.f22904r = aVar;
        mo23736d();
    }

    /* renamed from: d */
    public final void mo23736d() {
        boolean z;
        T t;
        T t2;
        T t3 = this.f17433c;
        if (t3 == null || (t2 = this.f17432b) == null || !((PointF) t2).equals(((PointF) t3).x, ((PointF) t3).y)) {
            z = false;
        } else {
            z = true;
        }
        T t4 = this.f17432b;
        if (t4 != null && (t = this.f17433c) != null && !z) {
            PointF pointF = (PointF) t4;
            PointF pointF2 = (PointF) t;
            C5280a<PointF> aVar = this.f22904r;
            PointF pointF3 = aVar.f17445o;
            PointF pointF4 = aVar.f17446p;
            C5059g.C5060a aVar2 = C5059g.f17057a;
            Path path = new Path();
            path.moveTo(pointF.x, pointF.y);
            if (pointF3 == null || pointF4 == null || (pointF3.length() == BitmapDescriptorFactory.HUE_RED && pointF4.length() == BitmapDescriptorFactory.HUE_RED)) {
                path.lineTo(pointF2.x, pointF2.y);
            } else {
                float f = pointF.x;
                float f2 = pointF2.x;
                float f3 = pointF2.y;
                path.cubicTo(pointF3.x + f, pointF.y + pointF3.y, f2 + pointF4.x, f3 + pointF4.y, f2, f3);
            }
            this.f22903q = path;
        }
    }
}
