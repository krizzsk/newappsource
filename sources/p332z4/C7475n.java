package p332z4;

import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;
import p120i5.C5280a;
import p120i5.C5282c;
import p332z4.C7456a;

/* renamed from: z4.n */
public final class C7475n extends C7456a<PointF, PointF> {

    /* renamed from: i */
    public final PointF f22913i = new PointF();

    /* renamed from: j */
    public final PointF f22914j = new PointF();

    /* renamed from: k */
    public final C7456a<Float, Float> f22915k;

    /* renamed from: l */
    public final C7456a<Float, Float> f22916l;

    /* renamed from: m */
    public C5282c f22917m;

    /* renamed from: n */
    public C5282c f22918n;

    public C7475n(C7465d dVar, C7465d dVar2) {
        super(Collections.emptyList());
        this.f22915k = dVar;
        this.f22916l = dVar2;
        mo23721j(this.f22880d);
    }

    /* renamed from: f */
    public final Object mo23717f() {
        return mo23738l(BitmapDescriptorFactory.HUE_RED);
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ Object mo23718g(C5280a aVar, float f) {
        return mo23738l(f);
    }

    /* renamed from: j */
    public final void mo23721j(float f) {
        this.f22915k.mo23721j(f);
        this.f22916l.mo23721j(f);
        this.f22913i.set(this.f22915k.mo23717f().floatValue(), this.f22916l.mo23717f().floatValue());
        for (int i = 0; i < this.f22877a.size(); i++) {
            ((C7456a.C7457a) this.f22877a.get(i)).mo6803a();
        }
    }

    /* renamed from: l */
    public final PointF mo23738l(float f) {
        Float f2;
        C5280a<Float> b;
        C5280a<Float> b2;
        Float f3 = null;
        if (this.f22917m == null || (b2 = this.f22915k.mo23713b()) == null) {
            f2 = null;
        } else {
            this.f22915k.mo23715d();
            Float f4 = b2.f17438h;
            C5282c cVar = this.f22917m;
            if (f4 != null) {
                f4.floatValue();
            }
            f2 = (Float) cVar.mo21085b((Float) b2.f17432b, (Float) b2.f17433c);
        }
        if (!(this.f22918n == null || (b = this.f22916l.mo23713b()) == null)) {
            this.f22916l.mo23715d();
            Float f5 = b.f17438h;
            C5282c cVar2 = this.f22918n;
            if (f5 != null) {
                f5.floatValue();
            }
            f3 = (Float) cVar2.mo21085b((Float) b.f17432b, (Float) b.f17433c);
        }
        if (f2 == null) {
            this.f22914j.set(this.f22913i.x, BitmapDescriptorFactory.HUE_RED);
        } else {
            this.f22914j.set(f2.floatValue(), BitmapDescriptorFactory.HUE_RED);
        }
        if (f3 == null) {
            PointF pointF = this.f22914j;
            pointF.set(pointF.x, this.f22913i.y);
        } else {
            PointF pointF2 = this.f22914j;
            pointF2.set(pointF2.x, f3.floatValue());
        }
        return this.f22914j;
    }
}
