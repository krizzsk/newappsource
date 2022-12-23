package p868vl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import p469eo.C16846b;
import p493fo.C17048b;
import p583jk.C17883o;
import p726pk.C18928a;
import p916xl.C20536b;

/* renamed from: vl.b */
public final class C20155b extends C17048b {

    /* renamed from: c */
    public final C18928a f51163c;

    public C20155b(C18928a aVar) {
        this.f51163c = aVar;
    }

    /* renamed from: c */
    public final void mo40403c(C16846b bVar, HashMap hashMap) {
        C17048b.m42897b(hashMap, Arrays.asList(new String[]{"USAGEPERIODSV1", "USAGEPERIODSV2"}), List.class, "supportedFeatureList");
        C17048b.m42897b(hashMap, 1, Integer.class, "supportedTicketStorageVersion");
        C17048b.m42897b(hashMap, new C20158e(this.f51163c.f48180g), C20158e.class, (String) null);
        C18928a aVar = this.f51163c;
        C17048b.m42897b(hashMap, new C20154a(aVar.f48181h, aVar.f48187n, aVar.f48191r), C20154a.class, (String) null);
        C18928a aVar2 = this.f51163c;
        C17048b.m42897b(hashMap, new C20157d(aVar2.f48174a, aVar2.f48175b), C20157d.class, (String) null);
        C17048b.m42897b(hashMap, new C17883o(), C17883o.class, (String) null);
        C18928a aVar3 = this.f51163c;
        C17048b.m42897b(hashMap, new C20536b(aVar3.f48176c, aVar3.f48174a, aVar3.f48184k, aVar3.f48185l), C20536b.class, (String) null);
    }
}
