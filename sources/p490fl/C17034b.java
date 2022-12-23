package p490fl;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import p364al.C13483d;
import p364al.C13487h;
import p406cg.C13815e;
import p443dm.C16675a;
import p586jn.C17899e;
import p652mi.C18374b;
import p654mk.C18393o;
import p654mk.C18394p;
import p725pj.C18926a;
import p819tk.C19688e;

/* renamed from: fl.b */
public final class C17034b implements C13483d {

    /* renamed from: a */
    public final C18374b f44164a;

    /* renamed from: b */
    public final C13815e f44165b;

    public C17034b(C18374b bVar, C13815e eVar) {
        this.f44164a = bVar;
        this.f44165b = eVar;
    }

    /* renamed from: C */
    public final C13487h<List<C17899e>> mo40394C() {
        C13487h C = this.f44164a.mo50642a(new C19688e()).mo40394C();
        if (C.mo40399a()) {
            return new C13487h<>(null, new C16675a("account.entitlement", new HashMap()).mo49399a(C.f33366b));
        }
        C13815e eVar = this.f44165b;
        List<C18393o> list = ((C18394p) C.f33365a).f46895d;
        eVar.getClass();
        LinkedList linkedList = new LinkedList();
        for (C18393o next : list) {
            linkedList.add(new C17899e(next.f46888a, next.f46889b, next.f46890c, next.f46891d, next.f46892e, next.f46893f, next.f46894g));
        }
        return new C13487h<>(linkedList, (C18926a) null);
    }
}
