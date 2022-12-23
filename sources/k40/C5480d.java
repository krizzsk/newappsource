package k40;

import android.content.Context;
import com.amazonaws.http.HttpHeader;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.ApplicationBugException;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import k40.C5480d;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import p906wz.C20431c;
import p906wz.C20436g;
import vi0.C25121g;
import xi0.C25276a;

/* renamed from: k40.d */
public abstract class C5480d<RQ extends C5480d<RQ, RS, RO>, RS extends C20436g<RQ, RS>, RO extends TBase<?, ?>> extends C20431c<RQ, RS> {

    /* renamed from: q */
    public RO f17996q;

    public C5480d(Context context, Class cls, int i, int i2) {
        super(context, i, i2, true, cls);
    }

    /* renamed from: K */
    public final void mo20115K(HttpURLConnection httpURLConnection, BufferedOutputStream bufferedOutputStream) throws IOException {
        try {
            C25121g b = C5479c.m13665b(new C25276a((OutputStream) bufferedOutputStream), httpURLConnection.getRequestProperty(HttpHeader.CONTENT_TYPE), httpURLConnection, true);
            try {
                this.f17996q.mo25202X0(b);
                b.f63399a.mo61877a();
            } catch (TException e) {
                throw new IOException(e);
            }
        } catch (ServerException e2) {
            throw new ApplicationBugException("createProtocol for request threw a ServerException", e2);
        }
    }

    /* renamed from: t */
    public final void mo20116t(HttpURLConnection httpURLConnection) throws IOException {
        super.mo20116t(httpURLConnection);
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip;q=1.0, identity;q=0.5");
        httpURLConnection.setRequestProperty(HttpHeader.ACCEPT, "application/octet");
        if (this.f51761d) {
            httpURLConnection.setRequestProperty(HttpHeader.CONTENT_TYPE, "application/octet");
        }
    }

    public final String toString() {
        String str;
        RO ro = this.f17996q;
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
}
