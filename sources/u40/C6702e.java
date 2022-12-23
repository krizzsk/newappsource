package u40;

import c70.C13752e;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitLineGroup;
import l40.C5605d;
import p824tp.C19728f;
import q00.C19047a;
import q40.C6177b;
import q40.C6178c;
import t40.C6590a;

/* renamed from: u40.e */
public final class C6702e {

    /* renamed from: a */
    public final C6178c f20780a;

    /* renamed from: b */
    public final C6177b f20781b;

    /* renamed from: c */
    public final C13752e f20782c;

    /* renamed from: d */
    public final C19728f f20783d;

    /* renamed from: e */
    public final C19047a f20784e;

    /* renamed from: f */
    public final int f20785f;

    /* renamed from: g */
    public final ServerId f20786g;

    /* renamed from: h */
    public TransitLineGroup f20787h;

    /* renamed from: i */
    public C6590a f20788i;

    public C6702e(C6178c cVar, C5605d dVar, C6177b bVar, C13752e eVar, C19728f fVar, C19047a aVar, int i, ServerId serverId) {
        C21100e.m49373x(cVar, "fetcher");
        this.f20780a = cVar;
        C21100e.m49373x(dVar, "parser");
        C21100e.m49373x(bVar, "cache");
        this.f20781b = bVar;
        C21100e.m49373x(eVar, "requestContext");
        this.f20782c = eVar;
        C21100e.m49373x(fVar, "metroContext");
        this.f20783d = fVar;
        C21100e.m49373x(aVar, "configuration");
        this.f20784e = aVar;
        this.f20785f = i;
        C21100e.m49373x(serverId, "lineGroupId");
        this.f20786g = serverId;
    }
}
