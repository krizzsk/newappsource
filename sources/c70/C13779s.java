package c70;

import c70.C13779s;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.ApplicationBugException;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.List;
import java.util.Map;
import k40.C5479c;
import org.apache.thrift.TBase;
import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransportException;
import p001a0.C0017h;
import p435de.C16596f;
import p906wz.C20431c;
import vi0.C25121g;

/* renamed from: c70.s */
public abstract class C13779s<RS extends C13779s<RS, T, R>, T extends TBase<?, ?>, R> extends C13773n<RS> {

    /* renamed from: f */
    public final Class<T> f33923f;

    /* renamed from: g */
    public R f33924g;

    public C13779s(Class<T> cls) {
        this.f33923f = cls;
    }

    /* renamed from: b */
    public final void mo5817b(C20431c cVar, HttpURLConnection httpURLConnection, BufferedInputStream bufferedInputStream) throws IOException, BadResponseException, ServerException {
        C13772m mVar = (C13772m) cVar;
        if ("text/html".equals(httpURLConnection.getContentType())) {
            Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
            StringBuilder sb = new StringBuilder();
            for (String next : headerFields.keySet()) {
                List<String> list = headerFields.get(next);
                if (list != null) {
                    for (String R : list) {
                        C0017h.m61R(sb, next, ": ", R, "\n");
                    }
                }
            }
            sb.append("\n");
            sb.append(httpURLConnection.getContent());
            C16596f.m42113a().mo49363b(sb.toString());
        }
        C25121g a = C5479c.m13664a(httpURLConnection, bufferedInputStream);
        try {
            TBase tBase = (TBase) this.f33923f.newInstance();
            tBase.mo25201C1(a);
            this.f33924g = mo23773e(tBase);
        } catch (TTransportException e) {
            throw new IOException(e);
        } catch (TException e2) {
            throw new BadResponseException((Exception) e2);
        } catch (IllegalAccessException e3) {
            StringBuilder k = C13555b.m33972k("Unable to access ");
            k.append(this.f33923f);
            throw new ApplicationBugException(k.toString(), e3);
        } catch (InstantiationException e4) {
            StringBuilder k2 = C13555b.m33972k("Unable to instantiate ");
            k2.append(this.f33923f);
            throw new ApplicationBugException(k2.toString(), e4);
        }
    }

    /* renamed from: e */
    public abstract R mo23773e(T t) throws BadResponseException;

    public final String toString() {
        return "";
    }
}
