package th0;

import cf0.C21139m;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.sequences.C24177b;

/* renamed from: th0.j */
public final class C25005j implements C25003h<Object> {

    /* renamed from: a */
    public final /* synthetic */ C25003h<Object> f63160a;

    /* renamed from: b */
    public final /* synthetic */ Comparator<Object> f63161b;

    public C25005j(C25003h<Object> hVar, Comparator<Object> comparator) {
        this.f63160a = hVar;
        this.f63161b = comparator;
    }

    public final Iterator<Object> iterator() {
        List<Object> n0 = C24177b.m60553n0(this.f63160a);
        C21139m.m49437Y(n0, this.f63161b);
        return n0.iterator();
    }
}
