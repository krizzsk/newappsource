package p829tu;

import aa0.C7530f;
import c00.C13717b;
import c00.C13723g;
import c70.C13752e;
import ce0.C21100e;
import com.moovit.app.mot.purchase.model.MotQrCodeScanResult;
import com.moovit.app.mot.purchase.model.MotQrCodeTrip;
import com.moovit.database.DbEntityRef;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitLineGroup;
import com.moovit.transit.TransitPatternTrips;
import com.moovit.transit.TransitStop;
import com.moovit.util.time.Time;
import h20.C17296a;
import h20.C17297b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import n10.C18509f;
import p824tp.C19728f;
import p924xt.C20601i;
import q00.C19047a;

/* renamed from: tu.f */
public final class C19775f implements Callable<List<MotQrCodeTrip>> {

    /* renamed from: b */
    public final C13752e f50267b;

    /* renamed from: c */
    public final C19728f f50268c;

    /* renamed from: d */
    public final C19047a f50269d;

    /* renamed from: e */
    public final MotQrCodeScanResult f50270e;

    /* renamed from: f */
    public final ServerId f50271f;

    public C19775f(C13752e eVar, C19728f fVar, C19047a aVar, MotQrCodeScanResult motQrCodeScanResult, ServerId serverId) {
        C21100e.m49373x(eVar, "requestContext");
        this.f50267b = eVar;
        C21100e.m49373x(fVar, "metroContext");
        this.f50268c = fVar;
        C21100e.m49373x(aVar, "configuration");
        this.f50269d = aVar;
        C21100e.m49373x(motQrCodeScanResult, "scanResult");
        this.f50270e = motQrCodeScanResult;
        C21100e.m49373x(serverId, "lineGroupId");
        this.f50271f = serverId;
    }

    /* renamed from: a */
    public static ArrayList m47232a(MotQrCodeScanResult motQrCodeScanResult, C17296a aVar) throws Exception {
        C17297b bVar = (C17297b) aVar.mo52626J();
        TransitLineGroup transitLineGroup = bVar.f44685m;
        Map<ServerId, List<TransitPatternTrips>> map = bVar.f44686n;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            TransitLine c = transitLineGroup.mo24377c((ServerId) next.getKey());
            for (TransitPatternTrips transitPatternTrips : (List) next.getValue()) {
                List<T> entities = DbEntityRef.getEntities(transitPatternTrips.f23717b.f23709c);
                TransitStop transitStop = (TransitStop) Collections.min(entities.subList(0, entities.size() - 1), C7530f.m17270c(motQrCodeScanResult.f39065e));
                arrayList.add(new MotQrCodeTrip(transitStop, c, (Time) Collections.min(transitPatternTrips.f23726k.get(transitStop.f23730b).f23660b, new C19774e(motQrCodeScanResult.f39064d, 0))));
            }
        }
        Collections.sort(arrayList, new C19773d(motQrCodeScanResult.f39064d));
        C13723g.m34285f(arrayList, (ArrayList) null, new C20601i(new HashSet(arrayList.size()), 1));
        Collections.sort(arrayList, new C19772c(new C18509f(arrayList.size())));
        return arrayList;
    }

    public final Object call() throws Exception {
        C17296a aVar = new C17296a(this.f50267b, this.f50268c, this.f50269d, this.f50271f, (Time) null, false);
        ArrayList a = m47232a(this.f50270e, aVar);
        if (C13717b.m34258e(a)) {
            return m47232a(this.f50270e, new C17296a(aVar.f33829q, aVar.f44680v, aVar.f44681w, aVar.f44682x, aVar.f44683y + 1, aVar.f44684z, aVar.f44678A));
        }
        return a;
    }
}
