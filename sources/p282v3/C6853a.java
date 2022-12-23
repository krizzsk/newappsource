package p282v3;

import java.util.HashMap;
import p005a4.C0076a;
import p019b0.C1426c;
import p043ch.qos.logback.core.joran.action.C1847a;
import p043ch.qos.logback.core.joran.action.C1848b;
import p043ch.qos.logback.core.joran.action.C1849c;
import p156l4.C5598a;
import p168m4.C5685c;
import p168m4.C5686d;
import p168m4.C5687e;
import p168m4.C5691i;
import p168m4.C5692j;
import p168m4.C5693k;
import p168m4.C5695l;
import p168m4.C5697m;
import p168m4.C5698n;
import p168m4.C5699o;
import p168m4.C5700p;
import p193o4.C5979e;
import p193o4.C5983i;
import p193o4.C5986l;
import p295w3.C6972a;
import p295w3.C6974b;
import p295w3.C6975c;
import p295w3.C6976d;
import p295w3.C6977e;
import p295w3.C6978f;
import p295w3.C6979g;
import p295w3.C6980h;
import p295w3.C6981i;
import p389bl.C13641g;

/* renamed from: v3.a */
public final class C6853a extends C5598a {
    /* renamed from: m */
    public final void mo21417m(C1426c cVar) {
        C13641g.m34114b(cVar);
    }

    /* renamed from: n */
    public final void mo21418n(C5983i iVar) {
        C5695l lVar = new C5695l();
        lVar.mo20064b(this.f20771c);
        iVar.f19139c.add(lVar);
        C5693k kVar = new C5693k();
        kVar.mo20064b(this.f20771c);
        iVar.f19139c.add(kVar);
    }

    /* renamed from: o */
    public final void mo21419o(C5986l lVar) {
        lVar.mo21979n(new C5979e("configuration/property"), new C1848b());
        lVar.mo21979n(new C5979e("configuration/substitutionProperty"), new C1848b());
        lVar.mo21979n(new C5979e("configuration/timestamp"), new C1849c());
        lVar.mo21979n(new C5979e("configuration/shutdownHook"), new C5699o());
        lVar.mo21979n(new C5979e("configuration/define"), new C1847a());
        lVar.mo21979n(new C5979e("configuration/conversionRule"), new C5687e());
        lVar.mo21979n(new C5979e("configuration/statusListener"), new C5700p());
        lVar.mo21979n(new C5979e("configuration/appender"), new C5685c());
        lVar.mo21979n(new C5979e("configuration/appender/appender-ref"), new C5686d());
        lVar.mo21979n(new C5979e("configuration/newRule"), new C5697m());
        lVar.mo21979n(new C5979e("*/param"), new C5698n());
        lVar.mo21979n(new C5979e("configuration"), new C6974b());
        lVar.mo21979n(new C5979e("configuration/contextName"), new C6975c());
        lVar.mo21979n(new C5979e("configuration/contextListener"), new C6979g());
        lVar.mo21979n(new C5979e("configuration/appender/sift"), new C0076a());
        lVar.mo21979n(new C5979e("configuration/appender/sift/*"), new C5692j());
        lVar.mo21979n(new C5979e("configuration/logger"), new C6978f());
        lVar.mo21979n(new C5979e("configuration/logger/level"), new C6977e());
        lVar.mo21979n(new C5979e("configuration/root"), new C6981i());
        lVar.mo21979n(new C5979e("configuration/root/level"), new C6977e());
        lVar.mo21979n(new C5979e("configuration/logger/appender-ref"), new C5686d());
        lVar.mo21979n(new C5979e("configuration/root/appender-ref"), new C5686d());
        lVar.mo21979n(new C5979e("configuration/include"), new C5691i());
        lVar.mo21979n(new C5979e("configuration/includes"), new C6976d());
        lVar.mo21979n(new C5979e("configuration/includes/include"), new C6972a());
        lVar.mo21979n(new C5979e("configuration/receiver"), new C6980h());
    }

    /* renamed from: p */
    public final void mo21420p() {
        super.mo21420p();
        this.f18331e.f19138b.f19131f.put("APPENDER_BAG", new HashMap());
    }
}
