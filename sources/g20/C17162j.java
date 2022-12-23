package g20;

import android.content.Context;
import c00.C13717b;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLine;
import com.moovit.util.ServerIdMap;
import p435de.C16596f;

/* renamed from: g20.j */
public final class C17162j<T> extends C17161i<T, TransitLine> {

    /* renamed from: a */
    public final ServerIdMap<? extends C17161i<? super T, TransitLine>> f44396a;

    public C17162j(ServerIdMap<? extends C17161i<? super T, TransitLine>> serverIdMap) {
        C21100e.m49373x(serverIdMap, "templateByAgencyId");
        this.f44396a = serverIdMap;
    }

    /* renamed from: a */
    public final void mo48496a(Context context, Object obj, Object obj2) {
        TransitLine transitLine = (TransitLine) obj2;
        ServerId serverId = transitLine.mo24369b().f23696d.getServerId();
        C17161i iVar = (C17161i) this.f44396a.get(serverId);
        if (iVar != null) {
            iVar.mo48496a(context, obj, transitLine);
            return;
        }
        C13717b.m34269p(this.f44396a.keySet());
        C16596f a = C16596f.m42113a();
        StringBuilder k = C13555b.m33972k("agencies=");
        k.append(C13717b.m34269p(this.f44396a.keySet()));
        a.mo49363b(k.toString());
        a.mo49363b("agency id=" + serverId);
        throw new IllegalStateException("Agency template missing!");
    }
}
