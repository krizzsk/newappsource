package p037c5;

import android.graphics.PointF;
import java.util.List;
import p120i5.C5280a;
import p332z4.C7456a;
import p332z4.C7465d;
import p332z4.C7475n;

/* renamed from: c5.i */
public final class C1788i implements C1792m<PointF, PointF> {

    /* renamed from: b */
    public final C1781b f6256b;

    /* renamed from: c */
    public final C1781b f6257c;

    public C1788i(C1781b bVar, C1781b bVar2) {
        this.f6256b = bVar;
        this.f6257c = bVar2;
    }

    /* renamed from: e */
    public final boolean mo6603e() {
        return this.f6256b.mo6603e() && this.f6257c.mo6603e();
    }

    /* renamed from: i */
    public final C7456a<PointF, PointF> mo6602i() {
        return new C7475n((C7465d) this.f6256b.mo6602i(), (C7465d) this.f6257c.mo6602i());
    }

    /* renamed from: j */
    public final List<C5280a<PointF>> mo6604j() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
