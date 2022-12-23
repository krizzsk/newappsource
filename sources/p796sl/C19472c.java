package p796sl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p236r8.C6266c;
import p364al.C13483d;
import p364al.C13487h;
import p634ln.C18247a;
import p702ok.C18776b;
import p702ok.C18777c;
import p725pj.C18926a;
import p772rl.C19287b;
import p818tj.C19683a;

/* renamed from: sl.c */
public final class C19472c implements C13483d {

    /* renamed from: a */
    public final C19287b f49518a;

    /* renamed from: b */
    public final Integer f49519b;

    /* renamed from: sl.c$a */
    public static class C19473a {

        /* renamed from: a */
        public final C19287b f49520a;

        public C19473a(C19287b bVar) {
            this.f49520a = bVar;
        }
    }

    public C19472c(C19287b bVar, Integer num) {
        this.f49518a = bVar;
        this.f49519b = num;
    }

    /* renamed from: C */
    public final C13487h<List<C18247a>> mo40394C() {
        C13487h hVar;
        C13487h hVar2;
        List<Integer> list;
        C19287b bVar = this.f49518a;
        Integer num = this.f49519b;
        C13487h<Void> b = bVar.mo51699b();
        if (b.mo40399a()) {
            hVar = new C13487h(null, b.f33366b);
        } else {
            HashSet hashSet = new HashSet();
            for (C18776b next : bVar.f49038f) {
                if (!next.f47790e && (list = next.f47788c) != null && list.contains(num)) {
                    hashSet.addAll(next.f47788c);
                }
            }
            hashSet.remove(num);
            hVar = new C13487h(hashSet, (C18926a) null);
        }
        if (hVar.mo40399a()) {
            return new C13487h<>(null, new C19683a(hVar.f33366b, C19683a.f49959e, "The stations data has not been loaded."));
        }
        ArrayList arrayList = new ArrayList();
        for (Integer num2 : (Set) hVar.f33365a) {
            C19287b bVar2 = this.f49518a;
            C13487h<Void> b2 = bVar2.mo51699b();
            if (b2.mo40399a()) {
                hVar2 = new C13487h(null, b2.f33366b);
            } else {
                hVar2 = new C13487h(bVar2.f49037e.get(num2), (C18926a) null);
            }
            if (hVar.mo40399a()) {
                return new C13487h<>(null, new C19683a(hVar.f33366b, C19683a.f49959e, "The stations data has not been loaded."));
            }
            C18777c cVar = (C18777c) hVar2.f33365a;
            if (cVar != null && !cVar.f47800i) {
                arrayList.add(cVar.mo51257a());
            }
        }
        Collections.sort(arrayList, new C6266c(3));
        return new C13487h<>(arrayList, (C18926a) null);
    }
}
