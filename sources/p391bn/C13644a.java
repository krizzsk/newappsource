package p391bn;

import java.util.ArrayList;
import java.util.List;
import p364al.C13487h;
import p412cn.C13851a;
import p413co.C13867m;
import p413co.C13872r;
import p441dk.C16672a;
import p444dn.C16687b;
import p513gk.C17200a;
import p725pj.C18926a;
import p774rn.C19292b;

/* renamed from: bn.a */
public final class C13644a {

    /* renamed from: a */
    public final C13851a f33672a;

    /* renamed from: b */
    public final C16687b.C16688a f33673b;

    /* renamed from: c */
    public final C13867m f33674c;

    /* renamed from: d */
    public final String f33675d;

    /* renamed from: e */
    public final Long f33676e;

    /* renamed from: bn.a$a */
    public static class C13645a {

        /* renamed from: a */
        public final C13851a f33677a;

        /* renamed from: b */
        public final C16687b.C16688a f33678b;

        /* renamed from: c */
        public final C13867m f33679c;

        public C13645a(C13851a aVar, C16687b.C16688a aVar2, C13867m mVar) {
            this.f33677a = aVar;
            this.f33678b = aVar2;
            this.f33679c = mVar;
        }
    }

    public C13644a(C13851a aVar, C16687b.C16688a aVar2, C13867m mVar, String str, Long l) {
        this.f33673b = aVar2;
        this.f33672a = aVar;
        this.f33674c = mVar;
        this.f33675d = str;
        this.f33676e = l;
    }

    /* renamed from: a */
    public final C13487h<Void> mo40529a() {
        if (this.f33676e.longValue() == Long.MAX_VALUE) {
            return mo40530b();
        }
        C13487h<List<C19292b>> a = this.f33672a.mo40780a(this.f33675d);
        if (a.mo40399a()) {
            return new C13487h<>(null, new C17200a(a.f33366b, C17200a.f44444g, "Delete failed"));
        }
        ArrayList arrayList = new ArrayList();
        for (C19292b bVar : (List) a.f33365a) {
            if (bVar.f49048b.longValue() > this.f33676e.longValue()) {
                arrayList.add(bVar);
            }
        }
        if (arrayList.isEmpty()) {
            return mo40530b();
        }
        C16687b.C16688a aVar = this.f33673b;
        C13487h<Void> C = new C16687b(aVar.f43475a, aVar.f43476b, this.f33675d, arrayList).mo40394C();
        if (!C.mo40399a()) {
            return new C13487h<>(null, (C18926a) null);
        }
        return new C13487h<>(null, new C17200a(C.f33366b, C17200a.f44444g, "Delete failed"));
    }

    /* renamed from: b */
    public final C13487h<Void> mo40530b() {
        StringBuilder k = C13555b.m33972k("activations-");
        k.append(this.f33675d);
        C13872r<Void> deleteKey = this.f33674c.deleteKey(k.toString());
        if (!deleteKey.mo40817a()) {
            return new C13487h<>(null, (C18926a) null);
        }
        return new C13487h<>(null, new C17200a(deleteKey.f34120b, C16672a.f43404g, "Deleting ticket activation from local file storage failed."));
    }
}
