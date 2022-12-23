package p332z4;

import android.graphics.PointF;
import java.util.List;
import p107h5.C5058f;
import p120i5.C5280a;
import p120i5.C5282c;

/* renamed from: z4.d */
public final class C7465d extends C7468g<Float> {
    public C7465d(List<C5280a<Float>> list) {
        super(list);
    }

    /* renamed from: g */
    public final Object mo23718g(C5280a aVar, float f) {
        return Float.valueOf(mo23734m(aVar, f));
    }

    /* renamed from: l */
    public final float mo23733l() {
        return mo23734m(mo23713b(), mo23715d());
    }

    /* renamed from: m */
    public final float mo23734m(C5280a<Float> aVar, float f) {
        if (aVar.f17432b == null || aVar.f17433c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C5282c cVar = this.f22881e;
        if (cVar != null) {
            aVar.f17438h.floatValue();
            mo23716e();
            Float f2 = (Float) cVar.mo21085b((Float) aVar.f17432b, (Float) aVar.f17433c);
            if (f2 != null) {
                return f2.floatValue();
            }
        }
        if (aVar.f17439i == -3987645.8f) {
            aVar.f17439i = ((Float) aVar.f17432b).floatValue();
        }
        float f3 = aVar.f17439i;
        if (aVar.f17440j == -3987645.8f) {
            aVar.f17440j = ((Float) aVar.f17433c).floatValue();
        }
        float f4 = aVar.f17440j;
        PointF pointF = C5058f.f17056a;
        return C16759e.m42347c(f4, f3, f, f3);
    }
}
