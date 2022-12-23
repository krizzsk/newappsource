package c70;

import android.text.TextUtils;
import c70.C13746a;
import c70.C13747b;
import ce0.C21100e;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p906wz.C20431c;
import p906wz.C20436g;
import p977zz.C20944i0;

/* renamed from: c70.b */
public abstract class C13747b<RQ extends C13746a<RQ, RS>, RS extends C13747b<RQ, RS>> extends C20436g<RQ, RS> {

    /* renamed from: f */
    public ServerId f33833f = null;

    /* renamed from: g */
    public long f33834g = -1;

    /* renamed from: h */
    public String f33835h = null;

    /* renamed from: c70.b$a */
    public static class C13748a {

        /* renamed from: b */
        public static final C13748a f33836b = new C13748a(Collections.emptyMap());

        /* renamed from: a */
        public final Map<String, C20944i0<C20431c<?, ?>, List<C20436g<?, ?>>>> f33837a;

        public C13748a(Map<String, C20944i0<C20431c<?, ?>, List<C20436g<?, ?>>>> map) {
            C21100e.m49373x(map, "dataByRequestId");
            this.f33837a = map;
        }
    }

    /* renamed from: d */
    public void mo40670d(C13748a aVar) throws IOException, BadResponseException, ServerException {
    }

    /* renamed from: e */
    public Collection<? extends C13753f<?>> mo40671e() {
        return Collections.emptySet();
    }

    /* renamed from: f */
    public void mo40052c(RQ rq, HttpURLConnection httpURLConnection, BufferedInputStream bufferedInputStream) throws IOException, BadResponseException, ServerException {
        String headerField = httpURLConnection.getHeaderField("Metro-Revision-Metro-Id");
        if (!TextUtils.isEmpty(headerField) && TextUtils.isDigitsOnly(headerField)) {
            this.f33833f = ServerId.m11392b(headerField);
        }
        String headerField2 = httpURLConnection.getHeaderField("Metro-Revision-Number");
        if (!TextUtils.isEmpty(headerField2) && TextUtils.isDigitsOnly(headerField2)) {
            this.f33834g = Long.parseLong(headerField2);
        }
        this.f33835h = httpURLConnection.getHeaderField("X-Android-Response-Source");
        super.mo40052c(rq, httpURLConnection, bufferedInputStream);
    }
}
