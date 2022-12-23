package p540hn;

import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import java.util.HashMap;
import p364al.C13487h;
import p443dm.C16675a;
import p561ik.C17618a;
import p632ll.C18238b;
import p703ol.C18781a;
import p725pj.C18926a;

/* renamed from: hn.b */
public final class C17461b {

    /* renamed from: a */
    public final C18238b f44962a;

    /* renamed from: b */
    public final C18781a f44963b;

    public C17461b(C18238b bVar, C18781a aVar) {
        this.f44962a = bVar;
        this.f44963b = aVar;
    }

    /* renamed from: a */
    public final C13487h<String> mo49922a() {
        C13487h<String> hVar;
        S s;
        C13487h<String> a = this.f44963b.mo51264a();
        boolean a2 = a.mo40399a();
        Integer valueOf = Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS);
        if (a2) {
            return new C13487h<>(null, new C17618a(a.f33366b, valueOf));
        }
        S s2 = a.f33365a;
        if (s2 != null) {
            return new C13487h<>((String) s2, (C18926a) null);
        }
        C13487h C = this.f44962a.mo40394C();
        if (C.mo40399a()) {
            return new C13487h<>(null, new C16675a("wallet", new HashMap()).mo49399a(C.f33366b));
        }
        C13487h<String> a3 = this.f44963b.mo51264a();
        if (a3.mo40399a() || (s = a3.f33365a) == null) {
            hVar = new C13487h<>(null, new C17618a(a3.f33366b, valueOf));
        } else {
            hVar = new C13487h<>((String) s, (C18926a) null);
        }
        return hVar;
    }
}
