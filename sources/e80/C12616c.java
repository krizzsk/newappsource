package e80;

import c00.C13723g;
import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.moovit.protocol.search.MVSearchResponse;
import com.tranzmate.moovit.protocol.search.MVSearchResponseItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import org.apache.thrift.TBase;
import p644lx.C18292g;
import z70.C13335l;

/* renamed from: e80.c */
public final class C12616c extends C13780t<C12615b, C12616c, MVSearchResponse> {

    /* renamed from: m */
    public ArrayList f31177m;

    /* renamed from: n */
    public IdentityHashMap f31178n;

    public C12616c() {
        super(MVSearchResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C12615b bVar = (C12615b) aVar;
        List<MVSearchResponseItem> list = ((MVSearchResponse) tBase).results;
        C13723g.m34285f(list, (ArrayList) null, new C18292g(2));
        if (!list.isEmpty()) {
            this.f31177m = new ArrayList(list.size());
            this.f31178n = new IdentityHashMap(list.size());
            for (MVSearchResponseItem next : list) {
                LocationDescriptor b = C13335l.m33606b(next);
                this.f31177m.add(b);
                if (next.mo31521f()) {
                    this.f31178n.put(b, Integer.valueOf(next.airDistance));
                }
            }
        }
    }
}
