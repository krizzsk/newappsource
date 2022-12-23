package p910xf;

import android.app.Activity;
import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import p217q2.C6160i;
import p304x.C7064j;
import p316y.C7219n;
import p910xf.C20482k;
import p910xf.C20482k.C20483a;
import p934yf.C20714a;
import p934yf.C20717b;

/* renamed from: xf.n */
public final class C20488n<ListenerTypeT, ResultT extends C20482k.C20483a> {

    /* renamed from: a */
    public final ConcurrentLinkedQueue f51876a = new ConcurrentLinkedQueue();

    /* renamed from: b */
    public final HashMap<ListenerTypeT, C20717b> f51877b = new HashMap<>();

    /* renamed from: c */
    public C20482k<ResultT> f51878c;

    /* renamed from: d */
    public int f51879d;

    /* renamed from: e */
    public C20489a<ListenerTypeT, ResultT> f51880e;

    /* renamed from: xf.n$a */
    public interface C20489a<ListenerTypeT, ResultT> {
        /* renamed from: e */
        void mo19991e(Object obj, C20482k.C20483a aVar);
    }

    public C20488n(C20482k<ResultT> kVar, int i, C20489a<ListenerTypeT, ResultT> aVar) {
        this.f51878c = kVar;
        this.f51879d = i;
        this.f51880e = aVar;
    }

    /* renamed from: a */
    public final void mo52683a(Activity activity, Executor executor, ListenerTypeT listenertypet) {
        boolean z;
        C20717b bVar;
        C20490o g;
        Preconditions.checkNotNull(listenertypet);
        synchronized (this.f51878c.f51857a) {
            try {
                boolean z2 = false;
                if ((this.f51878c.f51864h & this.f51879d) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.f51876a.add(listenertypet);
                bVar = new C20717b(executor);
                this.f51877b.put(listenertypet, bVar);
                if (activity != null) {
                    if (!activity.isDestroyed()) {
                        z2 = true;
                    }
                    Preconditions.checkArgument(z2, "Activity is already destroyed!");
                    C20714a.f52305c.mo52861b(activity, listenertypet, new C7219n(11, this, listenertypet));
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (z) {
            C20482k<ResultT> kVar = this.f51878c;
            synchronized (kVar.f51857a) {
                g = kVar.mo52677g();
            }
            C6160i iVar = new C6160i(4, this, listenertypet, g);
            Preconditions.checkNotNull(iVar);
            Handler handler = bVar.f52312a;
            if (handler != null) {
                handler.post(iVar);
            } else if (executor != null) {
                executor.execute(iVar);
            } else {
                C20486m.f51873e.execute(iVar);
            }
        }
    }

    /* renamed from: b */
    public final void mo52684b() {
        C20490o g;
        if ((this.f51878c.f51864h & this.f51879d) != 0) {
            C20482k<ResultT> kVar = this.f51878c;
            synchronized (kVar.f51857a) {
                g = kVar.mo52677g();
            }
            Iterator it = this.f51876a.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                C20717b bVar = this.f51877b.get(next);
                if (bVar != null) {
                    C7064j jVar = new C7064j(2, this, next, g);
                    Preconditions.checkNotNull(jVar);
                    Handler handler = bVar.f52312a;
                    if (handler == null) {
                        Executor executor = bVar.f52313b;
                        if (executor != null) {
                            executor.execute(jVar);
                        } else {
                            C20486m.f51873e.execute(jVar);
                        }
                    } else {
                        handler.post(jVar);
                    }
                }
            }
        }
    }
}
