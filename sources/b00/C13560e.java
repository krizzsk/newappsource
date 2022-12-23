package b00;

import c70.C13756i;
import ce0.C21100e;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: b00.e */
public final class C13560e implements C13556a {

    /* renamed from: b */
    public final C13556a f33505b;

    /* renamed from: c */
    public final AtomicInteger f33506c = new AtomicInteger(0);

    /* renamed from: b00.e$a */
    public interface C13561a {
    }

    /* renamed from: b00.e$b */
    public class C13562b implements C13556a {

        /* renamed from: b */
        public boolean f33507b = false;

        /* renamed from: c */
        public C13561a f33508c;

        public C13562b(C13756i.C13757a aVar) {
            this.f33508c = aVar;
        }

        public final synchronized boolean cancel(boolean z) {
            if (this.f33507b) {
                return false;
            }
            C13561a aVar = this.f33508c;
            if (aVar != null) {
                C13756i.C13757a aVar2 = (C13756i.C13757a) aVar;
                C13756i.C13764h hVar = C13756i.this.f33869c;
                String str = aVar2.f33878a;
                C13756i.C13768l lVar = aVar2.f33879b;
                synchronized (hVar) {
                    hVar.f33896a.mo47007p(str, lVar);
                    hVar.f33897b.mo47007p(str, lVar);
                }
            }
            this.f33508c = null;
            boolean cancel = C13560e.this.cancel(z);
            this.f33507b = true;
            return cancel;
        }
    }

    public C13560e(C13556a aVar) {
        C21100e.m49373x(aVar, "target");
        this.f33505b = aVar;
    }

    public final boolean cancel(boolean z) {
        if (this.f33506c.decrementAndGet() == 0) {
            return this.f33505b.cancel(z);
        }
        return false;
    }
}
