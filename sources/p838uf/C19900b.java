package p838uf;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: uf.b */
public final class C19900b implements C19906g {

    /* renamed from: a */
    public final String f50536a;

    /* renamed from: b */
    public final C19901c f50537b;

    public C19900b(Set<C19902d> set, C19901c cVar) {
        this.f50536a = m47412b(set);
        this.f50537b = cVar;
    }

    /* renamed from: b */
    public static String m47412b(Set<C19902d> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<C19902d> it = set.iterator();
        while (it.hasNext()) {
            C19902d next = it.next();
            sb.append(next.mo52179a());
            sb.append('/');
            sb.append(next.mo52180b());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo52184a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        C19901c cVar = this.f50537b;
        synchronized (cVar.f50539a) {
            unmodifiableSet = Collections.unmodifiableSet(cVar.f50539a);
        }
        if (unmodifiableSet.isEmpty()) {
            return this.f50536a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f50536a);
        sb.append(' ');
        C19901c cVar2 = this.f50537b;
        synchronized (cVar2.f50539a) {
            unmodifiableSet2 = Collections.unmodifiableSet(cVar2.f50539a);
        }
        sb.append(m47412b(unmodifiableSet2));
        return sb.toString();
    }
}
