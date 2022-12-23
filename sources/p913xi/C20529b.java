package p913xi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p469eo.C16846b;
import p493fo.C17048b;

/* renamed from: xi.b */
public final class C20529b extends C17048b {
    /* renamed from: c */
    public final void mo40403c(C16846b bVar, HashMap hashMap) {
        C20532e eVar = new C20532e();
        C20531d dVar = new C20531d(eVar);
        C17048b.m42897b(hashMap, dVar, C20531d.class, (String) null);
        ArrayList a = new C20530c(dVar, 0).mo52731a();
        eVar.f51923a.clear();
        Iterator it = a.iterator();
        while (it.hasNext()) {
            C20528a aVar = (C20528a) it.next();
            eVar.f51923a.put(aVar.f51919b, aVar);
        }
    }
}
