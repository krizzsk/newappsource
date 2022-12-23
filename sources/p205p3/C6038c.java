package p205p3;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import p092g3.C4758f;
import p092g3.C4763k;
import p192o3.C5959r;

/* renamed from: p3.c */
public final class C6038c extends C6039d {

    /* renamed from: c */
    public final /* synthetic */ C4763k f19260c;

    /* renamed from: d */
    public final /* synthetic */ String f19261d;

    /* renamed from: e */
    public final /* synthetic */ boolean f19262e;

    public C6038c(C4763k kVar, String str, boolean z) {
        this.f19260c = kVar;
        this.f19261d = str;
        this.f19262e = z;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: b */
    public final void mo22029b() {
        WorkDatabase workDatabase = this.f19260c.f16072c;
        workDatabase.mo5187c();
        try {
            Iterator it = ((C5959r) workDatabase.mo5701q()).mo21949g(this.f19261d).iterator();
            while (it.hasNext()) {
                C6039d.m14525a(this.f19260c, (String) it.next());
            }
            workDatabase.mo5194j();
            workDatabase.mo5191g();
            if (this.f19262e) {
                C4763k kVar = this.f19260c;
                C4758f.m12072a(kVar.f16071b, kVar.f16072c, kVar.f16074e);
            }
        } catch (Throwable th) {
            workDatabase.mo5191g();
            throw th;
        }
    }
}
