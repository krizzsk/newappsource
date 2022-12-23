package p829tu;

import c00.C13717b;
import c00.C13723g;
import c70.C13752e;
import ce0.C21100e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.app.mot.model.MotActivationRegionFare;
import com.moovit.app.mot.model.MotActivationRegionalFare;
import com.moovit.app.mot.purchase.model.MotQrCodeActivationFare;
import com.moovit.app.mot.purchase.model.MotQrCodeScanResult;
import com.moovit.app.mot.purchase.model.MotQrCodeStationFare;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitStop;
import g30.C4776h;
import h60.C17327j1;
import i30.C5268d;
import i30.C5269e;
import i30.C5274h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p009a8.C0114n;
import p054d0.C4267a0;
import p241s0.C6302b;
import p664mu.C18437c;
import p712ou.C18829a;
import p781ru.C19329b;
import p781ru.C19330c;
import p824tp.C19728f;
import q00.C19047a;

/* renamed from: tu.j */
public final class C19779j implements Callable<List<C19330c>> {

    /* renamed from: b */
    public final C13752e f50279b;

    /* renamed from: c */
    public final C19728f f50280c;

    /* renamed from: d */
    public final C19047a f50281d;

    /* renamed from: e */
    public final MotQrCodeScanResult f50282e;

    /* renamed from: f */
    public final List<C18437c.C18440b> f50283f;

    public C19779j(C13752e eVar, C19728f fVar, C19047a aVar, MotQrCodeScanResult motQrCodeScanResult, List<C18437c.C18440b> list) {
        C21100e.m49373x(eVar, "requestContext");
        this.f50279b = eVar;
        C21100e.m49373x(fVar, "metroContext");
        this.f50280c = fVar;
        C21100e.m49373x(aVar, "configuration");
        this.f50281d = aVar;
        C21100e.m49373x(motQrCodeScanResult, "scanResult");
        this.f50282e = motQrCodeScanResult;
        this.f50283f = list;
    }

    public final Object call() throws Exception {
        TransitLine b;
        if (C13717b.m34258e(this.f50283f)) {
            return Collections.emptyList();
        }
        ServerId c = this.f50282e.mo45611c();
        List<C18437c.C18440b> list = this.f50283f;
        C13752e eVar = this.f50279b;
        C4776h hVar = this.f50280c.f50165a;
        C5269e eVar2 = new C5269e();
        C21100e.m49373x(eVar, "requestContext");
        C21100e.m49373x(hVar, "metroInfo");
        for (C18437c.C18440b next : list) {
            eVar2.mo21066a(MetroEntityType.TRANSIT_LINE, next.f47008a);
            ServerId serverId = next.f47009b;
            if (serverId != null) {
                eVar2.mo21066a(MetroEntityType.TRANSIT_STOP, serverId);
            }
        }
        C5268d P = new C5274h(eVar, "MotQrCodeSuggestionsTask", hVar, eVar2).mo21062P();
        List<C18437c.C18440b> list2 = this.f50283f;
        C6302b bVar = new C6302b();
        for (C18437c.C18440b next2 : list2) {
            if (next2.f47009b == null && (b = P.mo21063b(next2.f47008a)) != null) {
                Task call = Tasks.call(MoovitExecutors.f37327IO, new C19775f(this.f50279b, this.f50280c, this.f50281d, this.f50282e, b.mo24369b().f23694b));
                ExecutorService executorService = MoovitExecutors.COMPUTATION;
                bVar.put(next2.f47008a, call.onSuccessTask(executorService, new C4267a0(b, 6)).onSuccessTask(executorService, new C17327j1(this, 12)).onSuccessTask(executorService, new C0114n(13)));
            }
        }
        ArrayList arrayList = new ArrayList(this.f50283f.size());
        for (C18437c.C18440b next3 : this.f50283f) {
            TransitLine b2 = P.mo21063b(next3.f47008a);
            if (b2 != null) {
                ServerId serverId2 = next3.f47009b;
                C19330c cVar = null;
                if (serverId2 != null) {
                    TransitStop c2 = P.mo21064c(serverId2);
                    if (c2 != null) {
                        LatLonE6 latLonE6 = this.f50282e.f39065e;
                        latLonE6.getClass();
                        float c3 = LatLonE6.m40174c(latLonE6, c2);
                        MotActivationRegionalFare b3 = this.f50282e.mo45610b(c3);
                        MotActivationRegionFare motActivationRegionFare = (MotActivationRegionFare) C13723g.m34286g(b3.f39019e, new C18829a(0, c2.f23732d));
                        if (motActivationRegionFare != null) {
                            cVar = new C19330c(next3, new MotQrCodeStationFare(b2, c2, c3, new MotQrCodeActivationFare(b3, motActivationRegionFare)));
                        }
                    }
                } else {
                    Task task = (Task) bVar.getOrDefault(b2.f23687c, null);
                    if (task != null) {
                        try {
                            cVar = new C19330c(next3, (C19329b) Tasks.await(task));
                        } catch (Exception unused) {
                        }
                    }
                }
                if (cVar != null) {
                    if (next3.f47008a.equals(c)) {
                        arrayList.add(0, cVar);
                    } else {
                        arrayList.add(cVar);
                    }
                }
            }
        }
        return arrayList;
    }
}
