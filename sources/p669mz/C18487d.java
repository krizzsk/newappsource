package p669mz;

import c00.C13732m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: mz.d */
public final class C18487d<E> extends C13732m<E> implements C18480a<C18488a<E>> {

    /* renamed from: d */
    public final ArrayList f47090d = new ArrayList(1);

    /* renamed from: e */
    public boolean f47091e = false;

    /* renamed from: mz.d$a */
    public interface C18488a<E> {
        /* renamed from: a */
        void mo23774a(C18487d<E> dVar);
    }

    public C18487d(C18482c cVar, int i) {
        super(cVar, i);
    }

    /* renamed from: c */
    public final void mo40645c(E e) {
        super.mo40645c(e);
        mo50910h();
    }

    /* renamed from: d */
    public final void mo40646d(List list) {
        this.f47091e = true;
        super.mo40646d(list);
        this.f47091e = false;
        mo50910h();
    }

    /* renamed from: f */
    public final boolean mo40648f(Collection<? extends E> collection) {
        boolean f = super.mo40648f(collection);
        if (f) {
            mo50910h();
        }
        return f;
    }

    /* renamed from: g */
    public final void mo50903a(C18488a<E> aVar) {
        this.f47090d.add(aVar);
    }

    /* renamed from: h */
    public final void mo50910h() {
        if (!this.f47091e) {
            Iterator it = this.f47090d.iterator();
            while (it.hasNext()) {
                ((C18488a) it.next()).mo23774a(this);
            }
        }
    }

    /* renamed from: j */
    public final void mo50904b(C18488a<E> aVar) {
        this.f47090d.remove(aVar);
    }
}
