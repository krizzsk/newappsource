package p321y4;

import android.graphics.Path;
import com.airbnb.lottie.C1876l;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.model.layer.C1894a;
import java.util.ArrayList;
import java.util.List;
import p059d5.C4375g;
import p059d5.C4378j;
import p092g3.C4752a;
import p332z4.C7456a;
import p332z4.C7474m;

/* renamed from: y4.p */
public final class C7330p implements C7325l, C7456a.C7457a {

    /* renamed from: a */
    public final Path f22539a = new Path();

    /* renamed from: b */
    public final boolean f22540b;

    /* renamed from: c */
    public final C1876l f22541c;

    /* renamed from: d */
    public final C7474m f22542d;

    /* renamed from: e */
    public boolean f22543e;

    /* renamed from: f */
    public final C4752a f22544f = new C4752a(1, 0);

    public C7330p(C1876l lVar, C1894a aVar, C4378j jVar) {
        jVar.getClass();
        this.f22540b = jVar.f15407d;
        this.f22541c = lVar;
        C7456a<C4375g, Path> i = jVar.f15406c.mo6602i();
        this.f22542d = (C7474m) i;
        aVar.mo6806e(i);
        i.mo23712a(this);
    }

    /* renamed from: a */
    public final void mo6803a() {
        this.f22543e = false;
        this.f22541c.invalidateSelf();
    }

    /* renamed from: b */
    public final void mo6804b(List<C7314b> list, List<C7314b> list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i < arrayList.size()) {
                C7314b bVar = (C7314b) arrayList.get(i);
                if (bVar instanceof C7332r) {
                    C7332r rVar = (C7332r) bVar;
                    if (rVar.f22552c == ShapeTrimPath.Type.SIMULTANEOUSLY) {
                        ((List) this.f22544f.f16037a).add(rVar);
                        rVar.mo23558c(this);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: q */
    public final Path mo23551q() {
        if (this.f22543e) {
            return this.f22539a;
        }
        this.f22539a.reset();
        if (this.f22540b) {
            this.f22543e = true;
            return this.f22539a;
        }
        Path path = (Path) this.f22542d.mo23717f();
        if (path == null) {
            return this.f22539a;
        }
        this.f22539a.set(path);
        this.f22539a.setFillType(Path.FillType.EVEN_ODD);
        this.f22544f.mo20258e(this.f22539a);
        this.f22543e = true;
        return this.f22539a;
    }
}
