package p655ml;

import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import java.util.Date;
import p364al.C13487h;
import p466el.C16838a;
import p490fl.C17037e;
import p586jn.C17900f;
import p608kl.C18092b;
import p610kn.C18107a;
import p725pj.C18926a;
import p794sj.C19464a;
import p870vn.C20169i;
import p870vn.C20170j;

/* renamed from: ml.a */
public final class C18398a {

    /* renamed from: a */
    public final C18092b f46901a;

    /* renamed from: b */
    public final C17037e f46902b;

    /* renamed from: c */
    public final C16838a f46903c;

    /* renamed from: d */
    public final C20169i f46904d;

    public C18398a(C18092b bVar, C17037e eVar, C16838a aVar, C20169i iVar) {
        this.f46901a = bVar;
        this.f46902b = eVar;
        this.f46903c = aVar;
        this.f46904d = iVar;
    }

    /* renamed from: c */
    public static C13487h m45243c(C18926a aVar) {
        if (aVar.f48169a.equals("authentication.token.access")) {
            return new C13487h(null, aVar);
        }
        return new C13487h(null, new C19464a(aVar, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error"));
    }

    /* renamed from: a */
    public final C13487h<Boolean> mo50855a() {
        C13487h<C17900f> a = this.f46902b.mo49646a();
        if (a.mo40399a()) {
            return m45243c(a.f33366b);
        }
        C17900f fVar = (C17900f) a.f33365a;
        C13487h<Void> a2 = this.f46903c.mo49502a();
        if (a2.mo40399a()) {
            return m45243c(a2.f33366b);
        }
        this.f46904d.mo52410a(new C20170j(fVar));
        return new C13487h<>(Boolean.FALSE, (C18926a) null);
    }

    /* renamed from: b */
    public final C13487h<Boolean> mo50856b() {
        boolean z;
        synchronized (this.f46901a.f46253e) {
            C13487h<C18107a> a = this.f46901a.mo50540a();
            if (a.mo40399a()) {
                C13487h<Boolean> c = m45243c(a.f33366b);
                return c;
            }
            C18107a aVar = (C18107a) a.f33365a;
            if (aVar == null || new Date().getTime() > aVar.f46301b.longValue()) {
                z = false;
            } else {
                z = true;
            }
            if (aVar == null || z) {
                C13487h<Boolean> hVar = new C13487h<>(Boolean.valueOf(z), (C18926a) null);
                return hVar;
            }
            C13487h<Boolean> a2 = mo50855a();
            return a2;
        }
    }
}
