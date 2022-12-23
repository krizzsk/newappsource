package p490fl;

import com.masabi.justride.sdk.models.account.EntitlementStatus;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import p258t4.C6587a;
import p364al.C13483d;
import p364al.C13487h;
import p443dm.C16675a;
import p584jl.C17885a;
import p586jn.C17896b;
import p652mi.C18373a;
import p654mk.C18390l;
import p654mk.C18391m;
import p725pj.C18926a;
import p819tk.C19688e;

/* renamed from: fl.c */
public final class C17035c implements C13483d {

    /* renamed from: a */
    public final C18373a f44166a;

    /* renamed from: b */
    public final C6587a f44167b;

    public C17035c(C18373a aVar, C6587a aVar2) {
        this.f44166a = aVar;
        this.f44167b = aVar2;
    }

    /* renamed from: C */
    public final C13487h<List<C17896b>> mo40394C() {
        C13487h C = this.f44166a.mo50642a(new C19688e()).mo40394C();
        if (C.mo40399a()) {
            return new C13487h<>(null, new C16675a("account.entitlement", new HashMap()).mo49399a(C.f33366b));
        }
        C6587a aVar = this.f44167b;
        List<C18390l> list = ((C18391m) C.f33365a).f46885d;
        aVar.getClass();
        LinkedList linkedList = new LinkedList();
        for (C18390l next : list) {
            C17896b bVar = r5;
            C17896b bVar2 = new C17896b(next.f46873a, next.f46875c, C17885a.m44446k0(next.f46876d), C17885a.m44446k0(next.f46877e), next.f46878f, next.f46879g, next.f46880h, next.f46881i, EntitlementStatus.parse(next.f46882j), next.f46884l);
            linkedList.add(bVar);
        }
        return new C13487h<>(linkedList, (C18926a) null);
    }
}
