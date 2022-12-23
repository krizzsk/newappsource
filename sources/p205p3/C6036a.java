package p205p3;

import androidx.work.impl.WorkDatabase;
import java.util.UUID;
import p092g3.C4758f;
import p092g3.C4763k;

/* renamed from: p3.a */
public final class C6036a extends C6039d {

    /* renamed from: c */
    public final /* synthetic */ C4763k f19256c;

    /* renamed from: d */
    public final /* synthetic */ UUID f19257d;

    public C6036a(C4763k kVar, UUID uuid) {
        this.f19256c = kVar;
        this.f19257d = uuid;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final void mo22029b() {
        WorkDatabase workDatabase = this.f19256c.f16072c;
        workDatabase.mo5187c();
        try {
            C6039d.m14525a(this.f19256c, this.f19257d.toString());
            workDatabase.mo5194j();
            workDatabase.mo5191g();
            C4763k kVar = this.f19256c;
            C4758f.m12072a(kVar.f16071b, kVar.f16072c, kVar.f16074e);
        } catch (Throwable th) {
            workDatabase.mo5191g();
            throw th;
        }
    }
}
