package za0;

import com.nutiteq.components.Envelope;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import na0.C12925d;
import na0.C12935l;
import oa0.C12972h;
import va0.C13196e;

/* renamed from: za0.e */
public final class C13359e extends C13354a<C12972h> {

    /* renamed from: za0.e$a */
    public class C13360a implements C13196e {

        /* renamed from: b */
        public final Envelope f33144b;

        /* renamed from: c */
        public final int f33145c;

        public C13360a(Envelope envelope, int i) {
            this.f33144b = envelope;
            this.f33145c = i;
        }

        /* renamed from: H */
        public final void mo40071H() {
        }

        public final void cancel() {
        }

        /* JADX INFO: finally extract failed */
        public final void run() {
            HashSet<C12972h> hashSet;
            if (C13359e.this.f33149f == null) {
                hashSet = new HashSet<>();
            } else {
                hashSet = new HashSet<>(C13359e.this.f33149f);
            }
            C13359e.this.f33148e.lock();
            try {
                ArrayList f = C13359e.this.f33147d.mo40152f(this.f33144b);
                C13359e.this.f33148e.unlock();
                Iterator it = f.iterator();
                while (it.hasNext()) {
                    ((C12972h) it.next()).mo39848d(this.f33145c);
                }
                hashSet.removeAll(f);
                for (C12972h hVar : hashSet) {
                    synchronized (hVar) {
                        C12972h.C12973a aVar = (C12972h.C12973a) hVar.f32125e;
                        if (aVar != null) {
                            synchronized (aVar) {
                                C12935l lVar = aVar.f32120j;
                                if (lVar != null) {
                                    aVar.f32120j = null;
                                    synchronized (lVar) {
                                        lVar.f32059a.recycle();
                                    }
                                }
                            }
                            aVar.f32127a = 0;
                            aVar.f32128b = null;
                            aVar.f32100f = false;
                        }
                    }
                }
                C13359e.this.mo40243h(f);
            } catch (Throwable th) {
                C13359e.this.f33148e.unlock();
                throw th;
            }
        }
    }

    /* renamed from: c */
    public final void mo40236c(Envelope envelope, int i) {
        C13360a aVar = new C13360a(envelope, i);
        C12925d dVar = this.f32172c;
        if (dVar != null) {
            dVar.f32008f.mo40066c(aVar, 0, this);
        }
    }
}
