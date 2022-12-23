package p900wt;

import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.metro.selection.MetroArea;
import com.moovit.network.model.ServerId;
import com.moovit.util.ServerIdMap;
import com.tranzmate.moovit.protocol.users.MVGetMetroAreasByIdResponse;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.apache.thrift.TBase;

/* renamed from: wt.f */
public final class C20416f extends C13780t<C20414d, C20416f, MVGetMetroAreasByIdResponse> {

    /* renamed from: m */
    public Map<ServerId, MetroArea> f51727m;

    public C20416f() {
        super(MVGetMetroAreasByIdResponse.class);
    }

    /* renamed from: l */
    public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
        Map<ServerId, MetroArea> map;
        C20414d dVar = (C20414d) aVar;
        List list = ((MVGetMetroAreasByIdResponse) tBase).metroAreas;
        if (C13717b.m34258e(list)) {
            map = Collections.emptyMap();
        } else {
            map = ServerIdMap.m17949a(C13720d.m34273c(list, (C13722f) null, new C20415e(0)));
        }
        this.f51727m = map;
    }
}
