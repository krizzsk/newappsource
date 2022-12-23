package k40;

import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.ApplicationBugException;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import k40.C5481e;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransportException;
import p906wz.C20431c;
import p906wz.C20436g;
import vi0.C25121g;

/* renamed from: k40.e */
public abstract class C5481e<RQ extends C20431c<RQ, RS>, RS extends C5481e<RQ, RS, RO>, RO extends TBase<?, ?>> extends C20436g<RQ, RS> {

    /* renamed from: f */
    public final Class<RO> f17997f;

    public C5481e(Class<RO> cls) {
        this.f17997f = cls;
    }

    /* renamed from: b */
    public final void mo5817b(RQ rq, HttpURLConnection httpURLConnection, BufferedInputStream bufferedInputStream) throws IOException, BadResponseException, ServerException {
        try {
            mo21365d(rq, httpURLConnection, C5479c.m13664a(httpURLConnection, bufferedInputStream));
        } catch (TTransportException e) {
            throw new IOException(e);
        } catch (TException e2) {
            throw new BadResponseException((Exception) e2);
        }
    }

    /* renamed from: d */
    public final void mo21365d(RQ rq, HttpURLConnection httpURLConnection, C25121g gVar) throws IOException, TException, BadResponseException {
        try {
            TBase tBase = (TBase) this.f17997f.newInstance();
            tBase.mo25201C1(gVar);
            mo21366e(rq, httpURLConnection, tBase);
        } catch (InstantiationException e) {
            StringBuilder k = C13555b.m33972k("Unable to instantiate ");
            k.append(this.f17997f);
            throw new ApplicationBugException(k.toString(), e);
        } catch (IllegalAccessException e2) {
            StringBuilder k2 = C13555b.m33972k("Unable to access");
            k2.append(this.f17997f);
            throw new ApplicationBugException(k2.toString(), e2);
        }
    }

    /* renamed from: e */
    public abstract void mo21366e(RQ rq, HttpURLConnection httpURLConnection, RO ro) throws IOException, BadResponseException;

    public final String toString() {
        return "";
    }
}
