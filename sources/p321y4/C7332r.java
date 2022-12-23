package p321y4;

import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.C1894a;
import java.util.ArrayList;
import java.util.List;
import p332z4.C7456a;
import p332z4.C7465d;

/* renamed from: y4.r */
public final class C7332r implements C7314b, C7456a.C7457a {

    /* renamed from: a */
    public final boolean f22550a;

    /* renamed from: b */
    public final ArrayList f22551b = new ArrayList();

    /* renamed from: c */
    public final ShapeTrimPath.Type f22552c;

    /* renamed from: d */
    public final C7465d f22553d;

    /* renamed from: e */
    public final C7465d f22554e;

    /* renamed from: f */
    public final C7465d f22555f;

    public C7332r(C1894a aVar, ShapeTrimPath shapeTrimPath) {
        shapeTrimPath.getClass();
        this.f22550a = shapeTrimPath.f6571e;
        this.f22552c = shapeTrimPath.f6567a;
        C7456a<Float, Float> i = shapeTrimPath.f6568b.mo6602i();
        this.f22553d = (C7465d) i;
        C7456a<Float, Float> i2 = shapeTrimPath.f6569c.mo6602i();
        this.f22554e = (C7465d) i2;
        C7456a<Float, Float> i3 = shapeTrimPath.f6570d.mo6602i();
        this.f22555f = (C7465d) i3;
        aVar.mo6806e(i);
        aVar.mo6806e(i2);
        aVar.mo6806e(i3);
        i.mo23712a(this);
        i2.mo23712a(this);
        i3.mo23712a(this);
    }

    /* renamed from: a */
    public final void mo6803a() {
        for (int i = 0; i < this.f22551b.size(); i++) {
            ((C7456a.C7457a) this.f22551b.get(i)).mo6803a();
        }
    }

    /* renamed from: b */
    public final void mo6804b(List<C7314b> list, List<C7314b> list2) {
    }

    /* renamed from: c */
    public final void mo23558c(C7456a.C7457a aVar) {
        this.f22551b.add(aVar);
    }
}
