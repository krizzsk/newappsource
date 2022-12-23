package ki0;

import hi0.C23529c0;
import hi0.C23560s;
import hi0.C23566v;
import hi0.C23571x;
import java.io.IOException;
import li0.C24319f;
import okhttp3.internal.connection.RouteException;

/* renamed from: ki0.a */
public final class C23793a implements C23560s {
    public final C23529c0 intercept(C23560s.C23561a aVar) throws IOException {
        C24319f fVar = (C24319f) aVar;
        C23571x xVar = fVar.f61618e;
        C23803h hVar = fVar.f61615b;
        boolean z = !xVar.f59637b.equals("GET");
        synchronized (hVar.f60149b) {
            if (hVar.f60162o) {
                throw new IllegalStateException("released");
            } else if (hVar.f60157j != null) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
        }
        C23798d dVar = hVar.f60155h;
        C23566v vVar = hVar.f60148a;
        dVar.getClass();
        C24319f fVar2 = (C24319f) aVar;
        try {
            C23795c cVar = new C23795c(hVar, hVar.f60150c, hVar.f60151d, hVar.f60155h, dVar.mo59032b(fVar2.f61620g, fVar2.f61621h, fVar2.f61622i, vVar.f59574C, vVar.f59597x, z).mo59041g(vVar, (C24319f) aVar));
            synchronized (hVar.f60149b) {
                hVar.f60157j = cVar;
                hVar.f60158k = false;
                hVar.f60159l = false;
            }
            return fVar.mo60465b(xVar, hVar, cVar);
        } catch (RouteException e) {
            synchronized (dVar.f60109c) {
                dVar.f60114h = true;
                throw e;
            }
        } catch (IOException e2) {
            synchronized (dVar.f60109c) {
                dVar.f60114h = true;
                throw new RouteException(e2);
            }
        }
    }
}
