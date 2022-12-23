package p940ym;

import java.util.Date;
import p364al.C13487h;
import p445do.C16690b;
import p659mp.C18415a;
import p704om.C18788d;
import p725pj.C18926a;
import p752qn.C19151i;
import p891wk.C20362q;

/* renamed from: ym.a */
public final class C20745a {

    /* renamed from: a */
    public final C18788d f52348a;

    /* renamed from: b */
    public final C16690b f52349b;

    public C20745a(C18788d dVar, C16690b bVar) {
        this.f52348a = dVar;
        this.f52349b = bVar;
    }

    /* renamed from: a */
    public final C13487h<C19151i> mo52890a(C20362q qVar) {
        boolean z;
        boolean z2;
        boolean z3;
        C13487h a = this.f52348a.mo51269a(qVar);
        if (a.mo40399a()) {
            return new C13487h<>(null, a.f33366b);
        }
        C18415a aVar = (C18415a) a.f33365a;
        if (aVar == null) {
            return new C13487h<>(new C19151i(false, false, 0, new Date(0), false, false), (C18926a) null);
        }
        Long valueOf = Long.valueOf(this.f52349b.mo49402a());
        long j = aVar.f46965a;
        long j2 = aVar.f46967c;
        long j3 = aVar.f46966b;
        boolean z4 = aVar.f46968d;
        if (j2 <= 0 || valueOf.longValue() >= j) {
            z = false;
        } else {
            z = true;
        }
        if (j2 >= j3 || z4) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z4 || valueOf.longValue() >= j) {
            z3 = false;
        } else {
            z3 = true;
        }
        return new C13487h<>(new C19151i(true, z, j2, new Date(j), z2, z3), (C18926a) null);
    }
}
