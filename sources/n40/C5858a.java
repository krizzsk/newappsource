package n40;

import c70.C13752e;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.moovit.util.time.Time;
import m40.C5701a;
import m40.C5702b;
import m40.C5703c;
import p824tp.C19728f;
import q00.C19047a;

/* renamed from: n40.a */
public abstract class C5858a<R, CR> extends C5703c<R, CR> {

    /* renamed from: k */
    public final ServerId f18849k;

    /* renamed from: l */
    public final ServerId f18850l;

    public C5858a(C5702b bVar, C5701a aVar, C13752e eVar, C19728f fVar, C19047a aVar2, Time time, ServerId serverId, ServerId serverId2) {
        super(bVar, aVar, eVar, fVar, aVar2, time);
        C21100e.m49373x(serverId, "lineId");
        this.f18849k = serverId;
        C21100e.m49373x(serverId2, "stopId");
        this.f18850l = serverId2;
    }
}
