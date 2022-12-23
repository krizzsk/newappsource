package p321y4;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import com.airbnb.lottie.C1876l;
import com.airbnb.lottie.C1903q;
import com.airbnb.lottie.model.content.ShapeStroke;
import com.airbnb.lottie.model.layer.C1894a;
import p120i5.C5282c;
import p309x4.C7155a;
import p332z4.C7456a;
import p332z4.C7462b;
import p332z4.C7478q;

/* renamed from: y4.q */
public final class C7331q extends C7312a {

    /* renamed from: r */
    public final C1894a f22545r;

    /* renamed from: s */
    public final String f22546s;

    /* renamed from: t */
    public final boolean f22547t;

    /* renamed from: u */
    public final C7462b f22548u;

    /* renamed from: v */
    public C7478q f22549v;

    public C7331q(C1876l lVar, C1894a aVar, ShapeStroke shapeStroke) {
        super(lVar, aVar, shapeStroke.f6561g.toPaintCap(), shapeStroke.f6562h.toPaintJoin(), shapeStroke.f6563i, shapeStroke.f6559e, shapeStroke.f6560f, shapeStroke.f6557c, shapeStroke.f6556b);
        this.f22545r = aVar;
        this.f22546s = shapeStroke.f6555a;
        this.f22547t = shapeStroke.f6564j;
        C7456a<Integer, Integer> i = shapeStroke.f6558d.mo6602i();
        this.f22548u = (C7462b) i;
        i.mo23712a(this);
        aVar.mo6806e(i);
    }

    /* renamed from: f */
    public final void mo6807f(Canvas canvas, Matrix matrix, int i) {
        if (!this.f22547t) {
            C7155a aVar = this.f22423i;
            C7462b bVar = this.f22548u;
            aVar.setColor(bVar.mo23730l(bVar.mo23713b(), bVar.mo23715d()));
            C7478q qVar = this.f22549v;
            if (qVar != null) {
                this.f22423i.setColorFilter((ColorFilter) qVar.mo23717f());
            }
            super.mo6807f(canvas, matrix, i);
        }
    }

    /* renamed from: g */
    public final void mo5840g(C5282c cVar, Object obj) {
        super.mo5840g(cVar, obj);
        if (obj == C1903q.f6678b) {
            this.f22548u.mo23722k(cVar);
        } else if (obj == C1903q.f6673K) {
            C7478q qVar = this.f22549v;
            if (qVar != null) {
                this.f22545r.mo6816o(qVar);
            }
            if (cVar == null) {
                this.f22549v = null;
                return;
            }
            C7478q qVar2 = new C7478q(cVar, null);
            this.f22549v = qVar2;
            qVar2.mo23712a(this);
            this.f22545r.mo6806e(this.f22548u);
        }
    }

    public final String getName() {
        return this.f22546s;
    }
}
