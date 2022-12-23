package p639ls;

import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.tranzmate.moovit.protocol.metroinfo.MVAckResponse;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import org.apache.thrift.TBase;
import p638lr.C18267n;

/* renamed from: ls.b */
public final class C18273b extends C13780t<C18272a, C18273b, MVAckResponse> {

    /* renamed from: m */
    public ArrayList f46602m;

    public C18273b() {
        super(MVAckResponse.class);
    }

    /* renamed from: l */
    public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
        C18272a aVar2 = (C18272a) aVar;
        this.f46602m = C13720d.m34273c(((MVAckResponse) tBase).acks, (C13722f) null, new C18267n(1));
    }
}
