package h60;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import h60.C17301b;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import org.apache.thrift.TBase;
import w40.C25761d;

/* renamed from: h60.b */
public abstract class C17301b<RQ extends C13746a<RQ, RS>, RS extends C17301b<RQ, RS, RO>, RO extends TBase<?, ?>> extends C13780t<RQ, RS, RO> {
    public C17301b(Class<RO> cls) {
        super(cls);
    }

    /* renamed from: f */
    public final void mo40052c(RQ rq, HttpURLConnection httpURLConnection, BufferedInputStream bufferedInputStream) throws IOException, BadResponseException, ServerException {
        super.mo40052c(rq, httpURLConnection, bufferedInputStream);
        if (rq.mo52624A()) {
            C25761d.m64299a().mo83591f();
        }
    }
}
