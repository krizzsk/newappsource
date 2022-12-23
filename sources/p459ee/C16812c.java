package p459ee;

import h60.C17327j1;
import java.util.concurrent.atomic.AtomicReference;
import p404ce.C13805r;
import p577je.C17785c0;
import p956ze.C20837a;

/* renamed from: ee.c */
public final class C16812c implements C16810a {

    /* renamed from: c */
    public static final C16813a f43772c = new C16813a();

    /* renamed from: a */
    public final C20837a<C16810a> f43773a;

    /* renamed from: b */
    public final AtomicReference<C16810a> f43774b = new AtomicReference<>((Object) null);

    /* renamed from: ee.c$a */
    public static final class C16813a implements C16816e {
    }

    public C16812c(C20837a<C16810a> aVar) {
        this.f43773a = aVar;
        ((C13805r) aVar).mo40735a(new C17327j1(this, 7));
    }

    /* renamed from: a */
    public final C16816e mo49483a(String str) {
        C16810a aVar = this.f43774b.get();
        if (aVar == null) {
            return f43772c;
        }
        return aVar.mo49483a(str);
    }

    /* renamed from: b */
    public final boolean mo49484b() {
        C16810a aVar = this.f43774b.get();
        if (aVar == null || !aVar.mo49484b()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final void mo49485c(String str, String str2, long j, C17785c0 c0Var) {
        ((C13805r) this.f43773a).mo40735a(new C16811b(str, str2, j, c0Var));
    }

    /* renamed from: d */
    public final boolean mo49486d(String str) {
        C16810a aVar = this.f43774b.get();
        if (aVar == null || !aVar.mo49486d(str)) {
            return false;
        }
        return true;
    }
}
