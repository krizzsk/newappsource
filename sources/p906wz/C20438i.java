package p906wz;

import ci0.C21211f;
import com.moovit.commons.request.ServerException;
import java.io.IOException;
import p906wz.C20431c;
import p906wz.C20436g;

/* renamed from: wz.i */
public abstract class C20438i<RQ extends C20431c<RQ, RS>, RS extends C20436g<RQ, RS>> extends C21211f {
    /* renamed from: c */
    public final boolean mo315c(C20431c cVar, ServerException serverException) {
        return mo21415w(cVar, serverException);
    }

    /* renamed from: d */
    public final boolean mo316d(RQ rq, IOException iOException) {
        return mo21415w(rq, iOException);
    }

    /* renamed from: i */
    public final boolean mo319i(C20431c cVar, IOException iOException) {
        return mo21415w(cVar, iOException);
    }

    /* renamed from: w */
    public abstract boolean mo21415w(RQ rq, Exception exc);
}
