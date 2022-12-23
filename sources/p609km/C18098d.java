package p609km;

import ce0.C21100e;
import com.amazonaws.auth.STSAssumeRoleSessionCredentialsProvider;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import mf0.C24361g;
import p358af.C13437d;
import p364al.C13483d;
import p364al.C13487h;
import p388bk.C13634a;
import p468en.C16842b;
import p490fl.C17036d;
import p540hn.C17461b;
import p586jn.C17898d;
import p586jn.C17900f;
import p634ln.C18247a;
import p705on.C18794b;
import p705on.C18795c;
import p705on.C18798f;
import p705on.C18800h;
import p705on.C18804k;
import p705on.C18805l;
import p705on.C18810p;
import p725pj.C18926a;
import p752qn.C19148f;
import p843uk.C19937j;
import p868vl.C20158e;

/* renamed from: km.d */
public final class C18098d implements C13483d {

    /* renamed from: a */
    public final C18102f f46267a;

    /* renamed from: b */
    public final C17036d f46268b;

    /* renamed from: c */
    public final C16842b f46269c;

    /* renamed from: d */
    public final C17461b f46270d;

    /* renamed from: e */
    public final String f46271e;

    /* renamed from: f */
    public final C20158e f46272f;

    /* renamed from: g */
    public final C18096b f46273g;

    /* renamed from: h */
    public final String f46274h;

    /* renamed from: i */
    public final String f46275i = null;

    /* renamed from: km.d$a */
    public static class C18099a {

        /* renamed from: a */
        public final C18102f f46276a;

        /* renamed from: b */
        public final C16842b f46277b;

        /* renamed from: c */
        public final C20158e f46278c;

        /* renamed from: d */
        public final String f46279d;

        /* renamed from: e */
        public final C17036d f46280e;

        /* renamed from: f */
        public final C17461b f46281f;

        /* renamed from: g */
        public final C18096b f46282g;

        public C18099a(C18102f fVar, C16842b bVar, C20158e eVar, String str, C17036d dVar, C17461b bVar2, C18096b bVar3) {
            this.f46276a = fVar;
            this.f46277b = bVar;
            this.f46278c = eVar;
            this.f46279d = str;
            this.f46280e = dVar;
            this.f46281f = bVar2;
            this.f46282g = bVar3;
        }
    }

    public C18098d(C18102f fVar, C17036d dVar, C16842b bVar, String str, C17461b bVar2, C20158e eVar, C18096b bVar3, String str2) {
        this.f46267a = fVar;
        this.f46268b = dVar;
        this.f46269c = bVar;
        this.f46271e = str;
        this.f46270d = bVar2;
        this.f46272f = eVar;
        this.f46273g = bVar3;
        this.f46274h = str2;
    }

    /* renamed from: C */
    public final C13487h<C18794b> mo40394C() {
        C13487h hVar;
        C13487h hVar2;
        Integer num;
        Integer num2;
        String str;
        C18247a aVar;
        String str2 = null;
        if (!this.f46272f.f51166a.contains("EXTERNAL_MPG")) {
            return new C13487h<>(null, new C13634a((C18926a) null, C13634a.f33597A, "See the 'Handling Errors from the SDK' page (https://masabi.atlassian.net/wiki/x/JrNsAw) for information about this error."));
        }
        C13487h<Map<String, String>> a = this.f46273g.f46261a.mo40777a();
        if (a.mo40399a()) {
            hVar = new C13487h(null, new C13634a(a.f33366b, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error"));
        } else {
            hVar = new C13487h(a.f33365a, (C18926a) null);
        }
        if (hVar.mo40399a()) {
            return mo50543a(hVar.f33366b);
        }
        C13487h<String> a2 = this.f46269c.mo49503a("mpg");
        if (a2.mo40399a()) {
            return mo50543a(a2.f33366b);
        }
        String str3 = (String) a2.f33365a;
        C19937j jVar = (C19937j) this.f46267a.f46290a.f44498a.get(this.f46274h);
        if (jVar == null) {
            hVar2 = new C13487h(null, new C13634a((C18926a) null, C13634a.f33628v, "No finalised order found with given ID"));
        } else {
            hVar2 = new C13487h(jVar, (C18926a) null);
        }
        if (hVar2.mo40399a()) {
            return mo50543a(hVar2.f33366b);
        }
        C19937j jVar2 = (C19937j) hVar2.f33365a;
        String str4 = jVar2.f50632b.get(0).f47858a.f47909l;
        C18247a aVar2 = jVar2.f50637g;
        if (aVar2 == null || (aVar = jVar2.f50638h) == null) {
            num2 = null;
            num = null;
        } else {
            num2 = aVar2.f46552a;
            num = aVar.f46552a;
        }
        C13487h<C17898d> a3 = this.f46268b.mo49645a();
        if (a3.mo40399a()) {
            return new C13487h<>(null, new C13634a(a3.f33366b, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error"));
        }
        C17898d dVar = (C17898d) a3.f33365a;
        if (!dVar.f45931b) {
            String str5 = this.f46275i;
            if (str5 == null) {
                return new C13487h<>(null, new C13634a((C18926a) null, C13634a.f33601E, "An email address must be included when the user is on a guest account so that they can receive a purchase receipt"));
            }
            str = str5;
        } else {
            str = null;
        }
        C13487h<String> a4 = this.f46270d.mo49922a();
        if (a4.mo40399a()) {
            return new C13487h<>(null, new C13634a(a4.f33366b, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error"));
        }
        Map map = (Map) hVar.f33365a;
        String str6 = (String) a4.f33365a;
        String str7 = jVar2.f50631a;
        C17900f fVar = dVar.f45930a;
        if (fVar != null) {
            str2 = fVar.f45939a;
        }
        C18810p pVar = new C18810p(str6, str2);
        C19148f fVar2 = jVar2.f50633c;
        new LinkedHashMap();
        List<C18798f> list = jVar2.f50632b;
        ArrayList arrayList = new ArrayList();
        for (Iterator<C18798f> it = list.iterator(); it.hasNext(); it = it) {
            C18798f next = it.next();
            C18805l lVar = next.f47858a;
            arrayList.add(new C18800h(lVar.f47906i, lVar.f47907j, next.f47859b, (Integer) null, (Integer) null));
        }
        C18804k kVar = new C18804k(str, (Long) null, num2, num, arrayList);
        String str8 = this.f46271e;
        if (!C21100e.m49352m0(str4)) {
            str8 = C13437d.m33706k(str8, "-", str4);
        }
        return new C13487h<>(new C18794b(new C18795c(pVar, str7, fVar2, kVar), str8, str3, C24361g.m61133C(map)), (C18926a) null);
    }

    /* renamed from: a */
    public final C13487h<C18794b> mo50543a(C18926a aVar) {
        if (aVar.f48169a.equals(ProductAction.ACTION_PURCHASE)) {
            return new C13487h<>(null, aVar);
        }
        return new C13487h<>(null, new C13634a(aVar, Integer.valueOf(STSAssumeRoleSessionCredentialsProvider.DEFAULT_DURATION_SECONDS), "Unexpected error"));
    }
}
