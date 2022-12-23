package p538hl;

import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import p364al.C13483d;
import p364al.C13487h;
import p466el.C16838a;
import p490fl.C17036d;
import p586jn.C17898d;
import p586jn.C17900f;
import p724pi.C18925a;
import p725pj.C18926a;
import p770rj.C19279a;
import p819tk.C19688e;
import p870vn.C20168h;
import p870vn.C20169i;
import p917xm.C20541d;

/* renamed from: hl.a */
public final class C17457a implements C13483d {

    /* renamed from: a */
    public final C17036d f44949a;

    /* renamed from: b */
    public final C18925a f44950b;

    /* renamed from: c */
    public final C20541d f44951c;

    /* renamed from: d */
    public final C16838a f44952d;

    /* renamed from: e */
    public final C20169i f44953e;

    public C17457a(C17036d dVar, C18925a aVar, C20541d dVar2, C16838a aVar2, C20169i iVar) {
        this.f44949a = dVar;
        this.f44950b = aVar;
        this.f44951c = dVar2;
        this.f44952d = aVar2;
        this.f44953e = iVar;
    }

    /* renamed from: C */
    public final C13487h<Void> mo40394C() {
        C13487h<C17898d> a = this.f44949a.mo49645a();
        boolean a2 = a.mo40399a();
        Integer valueOf = Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS);
        if (a2) {
            return new C13487h<>(null, new C19279a(a.f33366b, valueOf, "Unexpected error"));
        }
        if (!((C17898d) a.f33365a).f45931b) {
            return new C13487h<>(null, new C19279a((C18926a) null, C19279a.f48992e, "There is no user logged in."));
        }
        this.f44951c.mo40394C();
        this.f44950b.mo50642a(new C19688e()).mo40394C();
        C13487h<Void> a3 = this.f44952d.mo49502a();
        if (a3.mo40399a()) {
            return new C13487h<>(null, new C19279a(a3.f33366b, valueOf, "Unexpected error"));
        }
        this.f44953e.mo52410a(new C20168h(new C17898d((C17900f) null)));
        return new C13487h<>(null, (C18926a) null);
    }
}
