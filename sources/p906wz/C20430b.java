package p906wz;

import com.moovit.commons.request.ServerException;
import java.io.IOException;
import java.util.ArrayList;
import p906wz.C20431c;
import p906wz.C20436g;

/* renamed from: wz.b */
public abstract class C20430b<RQ extends C20431c<RQ, RS>, RS extends C20436g<RQ, RS>> implements C20437h<RQ, RS> {

    /* renamed from: b */
    public final ArrayList f51754b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f51755c = new ArrayList();

    /* renamed from: a */
    public final void mo313a(RQ rq, boolean z) {
        if (z) {
            this.f51755c.add((Object) null);
        }
        mo21077b(rq, this.f51754b, this.f51755c);
    }

    /* renamed from: b */
    public abstract void mo21077b(C20431c cVar, ArrayList arrayList, ArrayList arrayList2);

    /* renamed from: c */
    public final boolean mo315c(C20431c cVar, ServerException serverException) {
        this.f51755c.add(serverException);
        return true;
    }

    /* renamed from: d */
    public final boolean mo316d(RQ rq, IOException iOException) {
        this.f51755c.add(iOException);
        return true;
    }

    /* renamed from: i */
    public final boolean mo319i(C20431c cVar, IOException iOException) {
        this.f51755c.add(iOException);
        return true;
    }

    /* renamed from: k */
    public final void mo21408k(RQ rq, RS rs) {
        this.f51754b.add(rs);
    }
}
