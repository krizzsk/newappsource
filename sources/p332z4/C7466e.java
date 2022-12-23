package p332z4;

import android.graphics.PointF;
import ce0.C21100e;
import java.util.List;
import p059d5.C4371c;
import p107h5.C5058f;
import p120i5.C5280a;
import p358af.C13437d;

/* renamed from: z4.e */
public final class C7466e extends C7468g<C4371c> {

    /* renamed from: i */
    public final C4371c f22899i;

    public C7466e(List<C5280a<C4371c>> list) {
        super(list);
        int i = 0;
        C4371c cVar = (C4371c) list.get(0).f17432b;
        i = cVar != null ? cVar.f15373b.length : i;
        this.f22899i = new C4371c(new float[i], new int[i]);
    }

    /* renamed from: g */
    public final Object mo23718g(C5280a aVar, float f) {
        C4371c cVar = this.f22899i;
        C4371c cVar2 = (C4371c) aVar.f17432b;
        C4371c cVar3 = (C4371c) aVar.f17433c;
        cVar.getClass();
        if (cVar2.f15373b.length == cVar3.f15373b.length) {
            int i = 0;
            while (true) {
                int[] iArr = cVar2.f15373b;
                if (i >= iArr.length) {
                    return this.f22899i;
                }
                float[] fArr = cVar.f15372a;
                float f2 = cVar2.f15372a[i];
                float f3 = cVar3.f15372a[i];
                PointF pointF = C5058f.f17056a;
                fArr[i] = C16759e.m42347c(f3, f2, f, f2);
                cVar.f15373b[i] = C21100e.m49322Q(f, iArr[i], cVar3.f15373b[i]);
                i++;
            }
        } else {
            StringBuilder k = C13555b.m33972k("Cannot interpolate between gradients. Lengths vary (");
            k.append(cVar2.f15373b.length);
            k.append(" vs ");
            throw new IllegalArgumentException(C13437d.m33707l(k, cVar3.f15373b.length, ")"));
        }
    }
}
