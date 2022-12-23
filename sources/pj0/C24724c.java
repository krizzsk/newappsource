package pj0;

import java.util.HashMap;
import java.util.concurrent.LinkedBlockingQueue;
import nj0.C24540a;
import nj0.C24541b;
import oj0.C24630a;

/* renamed from: pj0.c */
public final class C24724c implements C24540a {

    /* renamed from: b */
    public final HashMap f62589b = new HashMap();

    /* renamed from: c */
    public final LinkedBlockingQueue<C24630a> f62590c = new LinkedBlockingQueue<>();

    /* renamed from: a */
    public final synchronized C24541b mo22168a(String str) {
        C24723b bVar;
        bVar = (C24723b) this.f62589b.get(str);
        if (bVar == null) {
            bVar = new C24723b(str);
            this.f62589b.put(str, bVar);
        }
        return bVar;
    }
}
