package p205p3;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import p092g3.C4758f;
import p092g3.C4763k;
import p192o3.C5959r;

/* renamed from: p3.b */
public final class C6037b extends C6039d {

    /* renamed from: c */
    public final /* synthetic */ C4763k f19258c;

    /* renamed from: d */
    public final /* synthetic */ String f19259d;

    public C6037b(C4763k kVar, String str) {
        this.f19258c = kVar;
        this.f19259d = str;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final void mo22029b() {
        WorkDatabase workDatabase = this.f19258c.f16072c;
        workDatabase.mo5187c();
        try {
            Iterator it = ((C5959r) workDatabase.mo5701q()).mo21950h(this.f19259d).iterator();
            while (it.hasNext()) {
                C6039d.m14525a(this.f19258c, (String) it.next());
            }
            workDatabase.mo5194j();
            workDatabase.mo5191g();
            C4763k kVar = this.f19258c;
            C4758f.m12072a(kVar.f16071b, kVar.f16072c, kVar.f16074e);
        } catch (Throwable th) {
            workDatabase.mo5191g();
            throw th;
        }
    }
}
