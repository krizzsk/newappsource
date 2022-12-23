package h80;

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
import java.util.Map;
import org.apache.thrift.TBase;
import p241s0.C6302b;
import p899ws.C20406f;
import z70.C13335l;

/* renamed from: h80.c */
public final class C12738c extends C13780t<C12736b, C12738c, MVSearchResponse> {

    /* renamed from: m */
    public List<LocationDescriptor> f31465m;

    /* renamed from: n */
    public Map<LocationDescriptor, Integer> f31466n;

    public C12738c() {
        super(MVSearchResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C12736b bVar = (C12736b) aVar;
        List<MVSearchResponseItem> list = ((MVSearchResponse) tBase).results;
        C13723g.m34285f(list, (ArrayList) null, new C20406f(6));
        if (!list.isEmpty()) {
            this.f31465m = new ArrayList(list.size());
            this.f31466n = new IdentityHashMap(list.size());
            for (MVSearchResponseItem next : list) {
                LocationDescriptor b = C13335l.m33606b(next);
                this.f31465m.add(b);
                if (next.mo31521f()) {
                    this.f31466n.put(b, Integer.valueOf(next.airDistance));
                }
            }
        }
    }

    public C12738c(ArrayList arrayList, C6302b bVar) {
        super(MVSearchResponse.class);
        this.f31465m = arrayList;
        this.f31466n = bVar;
    }
}
