package p633lm;

import ce0.C21100e;
import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import p364al.C13487h;
import p388bk.C13634a;
import p490fl.C17036d;
import p517go.C17209a;
import p540hn.C17461b;
import p586jn.C17898d;
import p725pj.C18926a;
import p843uk.C19937j;
import p843uk.C19956z;
import p868vl.C20154a;
import p868vl.C20158e;

/* renamed from: lm.e */
public final class C18244e {

    /* renamed from: a */
    public final C20158e f46541a;

    /* renamed from: b */
    public final C17209a f46542b;

    /* renamed from: c */
    public final C17461b f46543c;

    /* renamed from: d */
    public final C17036d f46544d;

    /* renamed from: e */
    public final C18246g f46545e;

    public C18244e(C20158e eVar, C20154a aVar, C17209a aVar2, C17461b bVar, C17036d dVar, C18246g gVar) {
        this.f46541a = eVar;
        this.f46542b = aVar2;
        this.f46543c = bVar;
        this.f46544d = dVar;
        this.f46545e = gVar;
    }

    /* renamed from: a */
    public static C13487h m44976a(C18926a aVar) {
        if (aVar.f48169a.equals(ProductAction.ACTION_PURCHASE)) {
            return new C13487h(null, aVar);
        }
        return new C13487h(null, new C13634a(aVar, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error"));
    }

    /* renamed from: b */
    public final C13487h mo50656b(String str, String str2) {
        C13487h hVar;
        if (!this.f46541a.f51166a.contains("SDK")) {
            hVar = m44976a(new C13634a((C18926a) null, C13634a.f33605I, "See the 'Handling Errors from the SDK' page (https://masabi.atlassian.net/wiki/x/JrNsAw) for information about this error."));
        } else {
            C19937j jVar = (C19937j) this.f46542b.f44498a.get(str);
            if (jVar == null) {
                hVar = m44976a(new C13634a((C18926a) null, C13634a.f33628v, "No finalised order found with given ID"));
            } else {
                C13487h<String> a = this.f46543c.mo49922a();
                if (a.mo40399a()) {
                    hVar = m44976a(a.f33366b);
                } else {
                    String str3 = (String) a.f33365a;
                    C13487h<C17898d> a2 = this.f46544d.mo49645a();
                    if (a2.mo40399a()) {
                        hVar = m44976a(a2.f33366b);
                    } else {
                        hVar = new C13487h(new C19956z(jVar, (C17898d) a2.f33365a, str3), (C18926a) null);
                    }
                }
            }
        }
        if (hVar.mo40399a()) {
            return hVar;
        }
        boolean z = true;
        if (!((C19956z) hVar.f33365a).f50739b.f45931b && !(!C21100e.m49352m0(str2))) {
            z = false;
        }
        if (!z) {
            return m44976a(new C13634a((C18926a) null, C13634a.f33622p, "Email address required to complete purchase."));
        }
        return hVar;
    }
}
