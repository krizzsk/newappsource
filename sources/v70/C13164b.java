package v70;

import ce0.C21100e;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p906wz.C20431c;
import p906wz.C20436g;
import p977zz.C20944i0;
import v70.C13163a;
import v70.C13164b;

/* renamed from: v70.b */
public abstract class C13164b<RQ extends C13163a<RQ, RS>, RS extends C13164b<RQ, RS>> extends C20436g<RQ, RS> {

    /* renamed from: v70.b$a */
    public static class C13165a {

        /* renamed from: a */
        public final Map<String, C20944i0<C20431c<?, ?>, List<C20436g<?, ?>>>> f32709a;

        static {
            new C13165a(Collections.emptyMap());
        }

        public C13165a(Map<String, C20944i0<C20431c<?, ?>, List<C20436g<?, ?>>>> map) {
            C21100e.m49373x(map, "dataByRequestId");
            this.f32709a = map;
        }
    }

    /* renamed from: c */
    public final void mo40052c(C20431c cVar, HttpURLConnection httpURLConnection, BufferedInputStream bufferedInputStream) throws IOException, BadResponseException, ServerException {
        C13163a aVar = (C13163a) cVar;
        String headerField = httpURLConnection.getHeaderField("Metro-Revision-Number");
        if (headerField != null) {
            Long.parseLong(headerField);
        }
        httpURLConnection.getHeaderField("X-Android-Response-Source");
        super.mo40052c(aVar, httpURLConnection, bufferedInputStream);
    }
}
