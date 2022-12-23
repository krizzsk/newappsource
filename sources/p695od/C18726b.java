package p695od;

import android.content.Context;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p011aa.C0141e;
import p077f.C4628f;
import p583jk.C17884p;
import p624ld.C18189d;
import p719pd.C18916a;
import zb0.C13364a;

/* renamed from: od.b */
public final class C18726b extends C0141e {

    /* renamed from: od.b$a */
    public static final class C18727a<V> implements Runnable {

        /* renamed from: b */
        public final Future<V> f47637b;

        /* renamed from: c */
        public final C18725a<? super V> f47638c;

        public C18727a(CallbackToFutureAdapter.C0675c cVar, C13364a.C13365a aVar) {
            this.f47637b = cVar;
            this.f47638c = aVar;
        }

        public final void run() {
            String str;
            boolean z;
            Throwable a;
            Future<V> future = this.f47637b;
            if (!(future instanceof C18916a) || (a = ((C18916a) future).mo51429a()) == null) {
                try {
                    V p = C18726b.m45735p(this.f47637b);
                    ((C13364a.C13365a) this.f47638c).getClass();
                    C4628f fVar = (C4628f) p;
                    Context context = C13364a.f33155a;
                    if (fVar == null || (str = fVar.mo20146a()) == null) {
                        str = "";
                    }
                    C13364a.f33160f = str;
                    if (fVar == null) {
                        z = false;
                    } else {
                        z = fVar.mo20148c();
                    }
                    C13364a.f33162h = z;
                } catch (ExecutionException e) {
                    ((C13364a.C13365a) this.f47638c).mo40246a(e.getCause());
                } catch (Error | RuntimeException e2) {
                    ((C13364a.C13365a) this.f47638c).mo40246a(e2);
                }
            } else {
                ((C13364a.C13365a) this.f47638c).mo40246a(a);
            }
        }

        public final String toString() {
            C18189d dVar = new C18189d(C18727a.class.getSimpleName());
            C18725a<? super V> aVar = this.f47638c;
            C18189d.C18191b bVar = new C18189d.C18191b();
            dVar.f46434c.f46436b = bVar;
            dVar.f46434c = bVar;
            bVar.f46435a = aVar;
            return dVar.toString();
        }
    }

    /* renamed from: p */
    public static <V> V m45735p(Future<V> future) throws ExecutionException {
        V v;
        C17884p.m44376p(future.isDone(), "Future was expected to be done: %s", future);
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }
}
