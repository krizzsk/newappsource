package p821tm;

import java.util.List;
import p364al.C13483d;
import p364al.C13487h;
import p465ek.C16835c;
import p725pj.C18926a;
import p752qn.C19150h;
import p868vl.C20154a;

/* renamed from: tm.d */
public final class C19698d implements C13483d {

    /* renamed from: a */
    public final C20154a f50016a;

    /* renamed from: b */
    public final C19697c f50017b;

    public C19698d(C20154a aVar, C19697c cVar) {
        this.f50016a = aVar;
        this.f50017b = cVar;
    }

    /* renamed from: C */
    public final C13487h<List<C19150h>> mo40394C() {
        boolean z;
        C20154a aVar = this.f50016a;
        if (aVar.f51160a.contains("all") || aVar.f51160a.contains("ticket-details")) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return new C13487h<>(null, new C16835c((C18926a) null, C16835c.f43821n, "This API requires the ticket-details entitlement"));
        }
        return this.f50017b.mo52055a();
    }
}
