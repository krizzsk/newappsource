package f80;

import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import c00.C13723g;
import c70.C13752e;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.ServerException;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.network.model.ServerId;
import g30.C4776h;
import i30.C5269e;
import i30.C5274h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import p054d0.C4303q;
import p589jq.C17910b;
import p589jq.C17911c;
import p646lz.C18299a;
import p824tp.C19728f;
import p929xy.C20663f;

/* renamed from: f80.c */
public final class C12637c extends C20663f<C12638d> {
    /* renamed from: o */
    public final Object mo6593o(C13752e eVar, C18299a aVar, ServerId serverId, long j) throws IOException, AppDataPartLoadFailedException, ServerException {
        C12638d dVar = new C12638d(eVar.f33852a.getApplicationContext(), serverId);
        dVar.mo51501d();
        dVar.mo51499b();
        ArrayList<T> c = C13723g.m34282c(dVar.f48438c.mo40647e(), new C17910b(9));
        if (!C13717b.m34258e(c)) {
            HashSet<O> g = C13720d.m34277g(c, (C13722f) null, new C4303q(21));
            C4776h hVar = C19728f.m47195a(eVar.f33852a).f50165a;
            C5269e d = C16759e.m42348d(hVar, "metroInfo");
            d.f17412b.mo47002b(MetroEntityType.TRANSIT_STOP, g);
            g.removeAll(new C5274h(eVar, "RecentSearchLocationsStore", hVar, d).mo21062P().f17404a.keySet());
            ArrayList<T> c2 = C13723g.m34282c(c, new C17911c(g, 2));
            if (!c2.isEmpty()) {
                dVar.mo51499b();
                dVar.f48438c.mo40648f(c2);
                dVar.mo51500c();
            }
        }
        return dVar;
    }
}
