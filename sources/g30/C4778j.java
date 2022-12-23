package g30;

import c00.C13717b;
import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.moovit.transit.C7841a;
import com.moovit.transit.TransitType;
import com.tranzmate.moovit.protocol.gtfs.MVMetroAreaData;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.apache.thrift.TBase;
import p435de.C16596f;

/* renamed from: g30.j */
public final class C4778j extends C13780t<C4777i, C4778j, MVMetroAreaData> {

    /* renamed from: m */
    public C4776h f16145m;

    public C4778j() {
        super(MVMetroAreaData.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C4777i iVar = (C4777i) aVar;
        C4776h a = C7841a.m17863a((MVMetroAreaData) tBase);
        this.f16145m = a;
        C16596f a2 = C16596f.m42113a();
        StringBuilder k = C13555b.m33972k("MetroInfo: id=");
        k.append(a.f16126a);
        k.append(", revision=");
        k.append(a.f16127b);
        a2.mo49363b(k.toString());
        List<TransitType> a3 = a.mo20299a();
        if (!C13717b.m34258e(a3)) {
            Collection<T> unmodifiableCollection = Collections.unmodifiableCollection(a.f16134i);
            if (!C13717b.m34258e(unmodifiableCollection)) {
                HashSet hashSet = new HashSet(a3.size());
                ServerId.m11394f(a3, hashSet);
                for (T t : unmodifiableCollection) {
                    ServerId serverId = t.f23674d.getServerId();
                    if (!hashSet.contains(serverId)) {
                        StringBuilder k2 = C13555b.m33972k("Agency id: ");
                        k2.append(t.f23672b);
                        a2.mo49363b(k2.toString());
                        a2.mo49363b("TransitType id: " + serverId);
                        throw new BadResponseException("Missing agency transit type reference!!");
                    }
                }
                return;
            }
            throw new BadResponseException("Agencies may not be null or empty!");
        }
        throw new BadResponseException("Transit types may not be null or empty!");
    }
}
