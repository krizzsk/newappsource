package p108h6;

import java.util.ArrayDeque;
import p108h6.C5102m;
import p311x6.C7172i;

/* renamed from: h6.l */
public final class C5101l extends C7172i<C5102m.C5103a<Object>, Object> {
    public C5101l() {
        super(500);
    }

    /* renamed from: c */
    public final void mo20214c(Object obj, Object obj2) {
        C5102m.C5103a aVar = (C5102m.C5103a) obj;
        aVar.getClass();
        ArrayDeque arrayDeque = C5102m.C5103a.f17100d;
        synchronized (arrayDeque) {
            arrayDeque.offer(aVar);
        }
    }
}
