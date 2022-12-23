package c70;

import aa0.C7541m;
import android.text.TextUtils;
import c70.C13746a;
import c70.C13747b;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.auth.FirebaseAuthUtils;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.moovit.request.MetroIdMismatchException;
import com.moovit.request.MetroRevisionMismatchException;
import com.moovit.request.ServerBusyException;
import com.moovit.request.UserRequestError;
import com.tranzmate.moovit.protocol.common.MVErrorMessage;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import k40.C5479c;
import org.apache.thrift.TException;
import org.apache.thrift.transport.TTransportException;
import p241s0.C6302b;
import p543hq.C17474b;
import p543hq.C17477d;
import p543hq.C17479f;
import p824tp.C19731i;
import p824tp.C19746x;
import p906wz.C20431c;
import p906wz.C20432d;
import p906wz.C20433e;
import p977zz.C20944i0;
import vi0.C25121g;

/* renamed from: c70.a */
public class C13746a<RQ extends C13746a<RQ, RS>, RS extends C13747b<RQ, RS>> extends C20431c<RQ, RS> {

    /* renamed from: u */
    public static final C7541m f33828u = new C7541m("requestSeqProvider");

    /* renamed from: q */
    public final C13752e f33829q;

    /* renamed from: r */
    public final boolean f33830r;

    /* renamed from: s */
    public final int f33831s;

    /* renamed from: t */
    public final int f33832t;

    public C13746a(C13752e eVar, int i, int i2, boolean z, Class<RS> cls) {
        super(eVar.f33852a, i, i2, z, cls);
        int i3;
        this.f33830r = i == C19746x.server_path_app_server_url || i == C19746x.server_path_app_server_secured_url;
        Integer num = (Integer) C17477d.f45000a.get(getClass());
        if (num == null) {
            i3 = -1;
        } else {
            i3 = num.intValue();
        }
        this.f33831s = i3;
        this.f33832t = f33828u.mo23805a();
        this.f33829q = eVar;
    }

    /* renamed from: D */
    public void mo21058D() {
        boolean z;
        C20433e eVar = this.f51770m;
        if (eVar != null) {
            eVar.mo22690a();
        }
        boolean z2 = true;
        if (this.f33831s != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f33829q.f33854c == null) {
                z2 = false;
            }
            if (z2) {
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.REQUEST_END);
                aVar.mo49935c(AnalyticsAttributeKey.REQUEST_SERVICE_ID, this.f33831s);
                aVar.mo49935c(AnalyticsAttributeKey.REQUEST_SEQUENCE_ID, this.f33832t);
                aVar.mo49935c(AnalyticsAttributeKey.REQUEST_RESPONSE_CODE, this.f51768k);
                mo21060M(aVar);
                C19731i.m47197a(this.f51759b).f50173c.mo22850h(this.f33829q.f33854c, aVar.mo49933a());
            }
        }
    }

    /* renamed from: H */
    public void mo5818H() throws IOException, ServerException {
        boolean z;
        boolean z2 = true;
        if (this.f33831s != -1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (this.f33829q.f33854c == null) {
                z2 = false;
            }
            if (z2) {
                C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.REQUEST_START);
                aVar.mo49935c(AnalyticsAttributeKey.REQUEST_SERVICE_ID, this.f33831s);
                aVar.mo49935c(AnalyticsAttributeKey.REQUEST_SEQUENCE_ID, this.f33832t);
                C19731i.m47197a(this.f51759b).f50173c.mo22850h(this.f33829q.f33854c, aVar.mo49933a());
            }
        }
        super.mo5818H();
    }

    /* renamed from: L */
    public boolean mo20305L() {
        return this.f33830r;
    }

    /* renamed from: M */
    public void mo21060M(C17474b.C17475a aVar) {
    }

    /* renamed from: N */
    public RS mo40051G() throws IOException, BadResponseException, ServerException {
        Object obj;
        RS rs = (C13747b) super.mo40051G();
        if (rs != null) {
            Collection<? extends C13753f<?>> e = rs.mo40671e();
            if (!e.isEmpty()) {
                C6302b bVar = new C6302b();
                for (C13753f fVar : e) {
                    String str = fVar.f33855a;
                    RQ rq = fVar.f33856b;
                    if (rq.mo21057B()) {
                        obj = rq.mo52625I();
                    } else {
                        obj = Collections.singletonList(rq.mo40051G());
                    }
                    bVar.put(str, new C20944i0(rq, obj));
                }
                rs.mo40670d(new C13747b.C13748a(bVar));
            }
        }
        return rs;
    }

    /* renamed from: t */
    public void mo20116t(HttpURLConnection httpURLConnection) throws IOException {
        super.mo20116t(httpURLConnection);
        if (mo20305L()) {
            FirebaseAuthUtils.m40011a(httpURLConnection);
        }
    }

    /* renamed from: u */
    public void mo6590u(C20432d dVar) {
        int i;
        super.mo6590u(dVar);
        dVar.mo52632a("Request-Sequence-Id", this.f33832t);
        AnalyticsFlowKey analyticsFlowKey = this.f33829q.f33854c;
        if (analyticsFlowKey != null) {
            dVar.mo52632a("Analytics-Flow-Key-Id", C17477d.m43544a(analyticsFlowKey).getValue());
            C17479f fVar = (C17479f) ((Map) C19731i.m47197a(this.f51759b).f50173c.f20759c).get(analyticsFlowKey);
            if (fVar == null) {
                i = -1;
            } else {
                i = fVar.f45007d;
            }
            dVar.mo52632a("Flow-Sequence-Id", i);
        }
    }

    /* renamed from: y */
    public final ServerException mo40669y(HttpURLConnection httpURLConnection) throws IOException, ServerException {
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == -100) {
            String requestProperty = httpURLConnection.getRequestProperty("Metro-Revision-Metro-Id");
            if (TextUtils.isEmpty(requestProperty) || !TextUtils.isDigitsOnly(requestProperty)) {
                throw new BadResponseException("Got metro id mismatch error while request metro id header is not a number");
            }
            String headerField = httpURLConnection.getHeaderField("Metro-Revision-Metro-Id");
            if (TextUtils.isEmpty(headerField) || !TextUtils.isDigitsOnly(headerField)) {
                throw new BadResponseException("Got metro id mismatch error while response metro id header is not a number");
            }
            ServerId b = ServerId.m11392b(requestProperty);
            ServerId b2 = ServerId.m11392b(headerField);
            if (!b.equals(b2)) {
                return new MetroIdMismatchException(b, b2);
            }
            throw new BadResponseException("Got metro id mismatch error while metro ids are the same");
        } else if (responseCode == 412) {
            String headerField2 = httpURLConnection.getHeaderField("Metro-Revision-Metro-Id");
            String headerField3 = httpURLConnection.getHeaderField("Metro-Revision-Number");
            if (headerField2 == null) {
                throw new BadResponseException("Got metro revision mismatch error without metro id header");
            } else if (!TextUtils.isDigitsOnly(headerField2)) {
                throw new BadResponseException("Got metro revision mismatch error while metro id header is not a number");
            } else if (headerField3 == null) {
                throw new BadResponseException("Got metro revision mismatch error without metro revision header");
            } else if (TextUtils.isDigitsOnly(headerField3)) {
                return new MetroRevisionMismatchException(ServerId.m11392b(headerField2), Long.parseLong(headerField3));
            } else {
                throw new BadResponseException("Got metro revision mismatch error while metro revision header is not a number");
            }
        } else if (responseCode == 424) {
            try {
                C25121g a = C5479c.m13664a(httpURLConnection, mo52630v(httpURLConnection, true));
                MVErrorMessage mVErrorMessage = new MVErrorMessage();
                mVErrorMessage.mo25201C1(a);
                return new UserRequestError(mVErrorMessage.code, mVErrorMessage.title, mVErrorMessage.text);
            } catch (TTransportException e) {
                throw new IOException(e);
            } catch (TException e2) {
                throw new BadResponseException((Exception) e2);
            }
        } else if (responseCode != 503) {
            return null;
        } else {
            return new ServerBusyException();
        }
    }

    public C13746a(C13752e eVar, int i, boolean z, Class<RS> cls) {
        this(eVar, C19746x.server_path_app_server_url, i, z, cls);
    }
}
