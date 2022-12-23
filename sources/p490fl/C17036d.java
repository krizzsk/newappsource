package p490fl;

import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import p364al.C13487h;
import p586jn.C17898d;
import p586jn.C17900f;
import p655ml.C18398a;
import p725pj.C18926a;
import p770rj.C19280b;

/* renamed from: fl.d */
public final class C17036d {

    /* renamed from: a */
    public final C18398a f44168a;

    /* renamed from: b */
    public final C17037e f44169b;

    public C17036d(C18398a aVar, C17037e eVar) {
        this.f44168a = aVar;
        this.f44169b = eVar;
    }

    /* renamed from: a */
    public final C13487h<C17898d> mo49645a() {
        C13487h<Boolean> b = this.f44168a.mo50856b();
        boolean a = b.mo40399a();
        Integer valueOf = Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS);
        if (a) {
            return new C13487h<>(null, new C19280b(b.f33366b, valueOf, "Unexpected error"));
        }
        if (!Boolean.TRUE.equals((Boolean) b.f33365a)) {
            return new C13487h<>(new C17898d((C17900f) null), (C18926a) null);
        }
        C13487h<C17900f> a2 = this.f44169b.mo49646a();
        if (a2.mo40399a()) {
            return new C13487h<>(null, new C19280b(a2.f33366b, valueOf, "Unexpected error"));
        }
        return new C13487h<>(new C17898d((C17900f) a2.f33365a), (C18926a) null);
    }
}
