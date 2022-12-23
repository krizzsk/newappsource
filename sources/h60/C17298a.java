package h60;

import c70.C13746a;
import c70.C13747b;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import h60.C17298a;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import w40.C25761d;

/* renamed from: h60.a */
public abstract class C17298a<RQ extends C13746a<RQ, RS>, RS extends C17298a<RQ, RS>> extends C13747b<RQ, RS> {
    /* renamed from: f */
    public void mo40052c(RQ rq, HttpURLConnection httpURLConnection, BufferedInputStream bufferedInputStream) throws IOException, BadResponseException, ServerException {
        super.mo40052c(rq, httpURLConnection, bufferedInputStream);
        if (rq.mo52624A()) {
            C25761d.m64299a().mo83591f();
        }
    }
}
