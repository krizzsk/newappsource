package ij0;

import org.simpleframework.xml.core.PersistenceException;

/* renamed from: ij0.o1 */
public final class C23657o1 {

    /* renamed from: a */
    public ThreadLocal<C23658a> f59816a = new ThreadLocal<>();

    /* renamed from: ij0.o1$a */
    public static class C23658a {

        /* renamed from: a */
        public C23654n1 f59817a = new C23654n1();

        /* renamed from: b */
        public int f59818b;
    }

    /* renamed from: a */
    public final void mo58845a() throws Exception {
        C23658a aVar = this.f59816a.get();
        if (aVar != null) {
            int i = aVar.f59818b - 1;
            aVar.f59818b = i;
            if (i == 0) {
                this.f59816a.remove();
                return;
            }
            return;
        }
        throw new PersistenceException("Session does not exist", new Object[0]);
    }
}
