package p609km;

import java.util.ArrayList;
import java.util.Map;
import p364al.C13483d;
import p364al.C13487h;
import p388bk.C13634a;
import p725pj.C18926a;
import p752qn.C19148f;
import p793si.C19463a;
import p843uk.C19926e;
import p843uk.C19929f;
import p843uk.C19941l;
import p843uk.C19945o;

/* renamed from: km.e */
public final class C18100e implements C13483d<C19148f> {

    /* renamed from: a */
    public final C19463a f46283a;

    /* renamed from: b */
    public final C19926e.C19927a f46284b;

    /* renamed from: c */
    public final C18105i f46285c;

    /* renamed from: d */
    public final C19945o f46286d;

    /* renamed from: km.e$a */
    public static class C18101a {

        /* renamed from: a */
        public final C19463a f46287a;

        /* renamed from: b */
        public final C19926e.C19927a f46288b;

        /* renamed from: c */
        public final C18105i f46289c;

        public C18101a(C19463a aVar, C19926e.C19927a aVar2, C18105i iVar) {
            this.f46287a = aVar;
            this.f46288b = aVar2;
            this.f46289c = iVar;
        }
    }

    public C18100e(C19463a aVar, C19926e.C19927a aVar2, C18105i iVar, C19945o oVar) {
        this.f46283a = aVar;
        this.f46284b = aVar2;
        this.f46285c = iVar;
        this.f46286d = oVar;
    }

    /* renamed from: C */
    public final C13487h<C19148f> mo40394C() {
        C18105i iVar = this.f46285c;
        C19945o oVar = this.f46286d;
        iVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry next : oVar.f50670e.entrySet()) {
            arrayList.add(new C19941l((Integer) next.getKey(), (Integer) next.getValue()));
        }
        this.f46284b.getClass();
        C13487h C = this.f46283a.mo50642a(new C19926e(arrayList)).mo40394C();
        if (C.mo40399a()) {
            return new C13487h<>(null, new C13634a(C.f33366b, 200, "Underlying network error."));
        }
        return new C13487h<>(((C19929f) C.f33365a).f50609d, (C18926a) null);
    }
}
