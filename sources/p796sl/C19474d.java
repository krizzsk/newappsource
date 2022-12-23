package p796sl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p244s3.C6446u;
import p364al.C13483d;
import p364al.C13487h;
import p634ln.C18247a;
import p702ok.C18777c;
import p725pj.C18926a;
import p772rl.C19287b;
import p818tj.C19683a;

/* renamed from: sl.d */
public final class C19474d implements C13483d {

    /* renamed from: a */
    public final C19287b f49521a;

    public C19474d(C19287b bVar) {
        this.f49521a = bVar;
    }

    /* renamed from: C */
    public final C13487h<List<C18247a>> mo40394C() {
        C13487h hVar;
        C19287b bVar = this.f49521a;
        C13487h<Void> b = bVar.mo51699b();
        if (b.mo40399a()) {
            hVar = new C13487h(null, b.f33366b);
        } else {
            hVar = new C13487h(bVar.f49037e.values(), (C18926a) null);
        }
        if (hVar.mo40399a()) {
            return new C13487h<>(null, new C19683a(hVar.f33366b, C19683a.f49959e, "The stations data has not been loaded."));
        }
        ArrayList arrayList = new ArrayList();
        for (C18777c cVar : (Collection) hVar.f33365a) {
            if (!cVar.f47800i) {
                arrayList.add(cVar.mo51257a());
            }
        }
        Collections.sort(arrayList, new C6446u(2));
        return new C13487h<>(arrayList, (C18926a) null);
    }
}
