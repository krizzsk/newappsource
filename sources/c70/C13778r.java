package c70;

import c70.C13747b;
import c70.C13778r;
import com.amazonaws.http.HttpHeader;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.ApplicationBugException;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import k40.C5479c;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import vi0.C25121g;
import xi0.C25276a;

/* renamed from: c70.r */
public abstract class C13778r<RQ extends C13778r<RQ, RS, RO>, RS extends C13747b<RQ, RS>, RO extends TBase<?, ?>> extends C13746a<RQ, RS> {

    /* renamed from: v */
    public RO f33922v;

    public C13778r(C13752e eVar, int i, Class<RS> cls) {
        super(eVar, i, true, cls);
    }

    /* renamed from: K */
    public final void mo20115K(HttpURLConnection httpURLConnection, BufferedOutputStream bufferedOutputStream) throws IOException {
        try {
            C25121g b = C5479c.m13665b(new C25276a((OutputStream) bufferedOutputStream), httpURLConnection.getRequestProperty(HttpHeader.CONTENT_TYPE), httpURLConnection, true);
            try {
                this.f33922v.mo25202X0(b);
                b.f63399a.mo61877a();
            } catch (TException e) {
                throw new IOException(e);
            }
        } catch (ServerException e2) {
            throw new ApplicationBugException("createProtocol for request threw a ServerException", e2);
        }
    }

    /* renamed from: t */
    public void mo20116t(HttpURLConnection httpURLConnection) throws IOException {
        super.mo20116t(httpURLConnection);
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip;q=1.0, identity;q=0.5");
        httpURLConnection.setRequestProperty(HttpHeader.ACCEPT, "application/octet");
        if (this.f51761d) {
            httpURLConnection.setRequestProperty(HttpHeader.CONTENT_TYPE, "application/octet");
        }
    }

    public final String toString() {
        String str;
        RO ro = this.f33922v;
        if (ro != null) {
            str = C5479c.m13668e(ro);
        } else {
            str = null;
        }
        if (str != null) {
            return str;
        }
        return "";
    }

    public C13778r(C13752e eVar, int i, int i2, Class<RS> cls) {
        super(eVar, i, i2, true, cls);
    }
}
