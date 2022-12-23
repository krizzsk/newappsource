package p455dy;

import c70.C13752e;
import com.moovit.metroentities.MetroEntityType;
import com.moovit.network.model.ServerId;
import g30.C4776h;
import i30.C5267c;
import i30.C5269e;
import java.util.concurrent.Callable;
import p824tp.C19728f;

/* renamed from: dy.d */
public final /* synthetic */ class C16752d implements Callable {

    /* renamed from: b */
    public final /* synthetic */ C16753e f43615b;

    /* renamed from: c */
    public final /* synthetic */ ServerId f43616c;

    public /* synthetic */ C16752d(C16753e eVar, ServerId serverId) {
        this.f43615b = eVar;
        this.f43616c = serverId;
    }

    public final Object call() {
        C16753e eVar = this.f43615b;
        ServerId serverId = this.f43616c;
        C13752e eVar2 = eVar.f43623g;
        C4776h hVar = C19728f.m47195a(eVar2.f33852a).f50165a;
        C5269e d = C16759e.m42348d(hVar, "metroInfo");
        d.mo21066a(MetroEntityType.TRANSIT_STOP, serverId);
        return new C5267c(eVar2, "UFM.addStop", hVar, d).mo21062P().mo21064c(serverId);
    }
}
