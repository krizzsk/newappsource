package g20;

import ce0.C21100e;
import com.moovit.l10n.LinePresentationType;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import p810sz.C19577c;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

/* renamed from: g20.f */
public final class C17146f {

    /* renamed from: c */
    public static final C17147a f44382c = new C17147a();

    /* renamed from: a */
    public final LinePresentationType f44383a;

    /* renamed from: b */
    public final List<C17139b> f44384b;

    /* renamed from: g20.f$a */
    public class C17147a extends C19619s<C17146f> {
        public C17147a() {
            super(0, C17146f.class);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            C19577c<LinePresentationType> cVar = LinePresentationType.CODER;
            pVar.getClass();
            cVar.getClass();
            return new C17146f(cVar.mo51916a(pVar.mo51926r()), pVar.mo51959g(C17139b.f44371d));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            C17146f fVar = (C17146f) obj;
            LinePresentationType linePresentationType = fVar.f44383a;
            C19577c<LinePresentationType> cVar = LinePresentationType.CODER;
            qVar.getClass();
            cVar.write(linePresentationType, qVar);
            qVar.mo51965h(fVar.f44384b, C17139b.f44371d);
        }
    }

    public C17146f(LinePresentationType linePresentationType, List<C17139b> list) {
        C21100e.m49373x(linePresentationType, "type");
        this.f44383a = linePresentationType;
        C21100e.m49373x(list, "agencyPresentationConfs");
        this.f44384b = Collections.unmodifiableList(list);
    }
}
