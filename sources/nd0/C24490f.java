package nd0;

import java.io.File;
import nd0.C24480a;
import nd0.C24486e;

/* renamed from: nd0.f */
public final class C24490f implements C24480a.C24482b {

    /* renamed from: a */
    public final /* synthetic */ C24491g f61996a;

    public C24490f(C24491g gVar) {
        this.f61996a = gVar;
    }

    /* renamed from: a */
    public final void mo60732a() {
        int i = C24491g.f61997g;
    }

    /* renamed from: b */
    public final void mo60733b(File file, int i) {
        File[] c;
        C24491g gVar = this.f61996a;
        if (i >= gVar.f62000f) {
            File file2 = gVar.f61999e;
            if (gVar.mo60730e(file2, file.getName() + "_pending")) {
                C24491g gVar2 = this.f61996a;
                gVar2.f61999e = gVar2.mo60741f();
                C24486e.C24489c cVar = this.f61996a.f61998d;
                if (cVar != null) {
                    C24486e eVar = C24486e.this;
                    if (eVar.f61979f.get() && (c = eVar.f61974a.mo60729c("_pending")) != null && c.length != 0) {
                        eVar.f61975b.mo60744a(c);
                    }
                }
            }
        }
    }
}
