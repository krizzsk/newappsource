package p434dd;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.appcompat.app.C0262r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import p554id.C17564c;
import p554id.C17567f;
import p554id.C17573l;
import p554id.C17576o;

/* renamed from: dd.k */
public final class C16561k {

    /* renamed from: o */
    public static final HashMap f43203o = new HashMap();

    /* renamed from: a */
    public final Context f43204a;

    /* renamed from: b */
    public final C0262r f43205b;

    /* renamed from: c */
    public final String f43206c;

    /* renamed from: d */
    public final ArrayList f43207d = new ArrayList();

    /* renamed from: e */
    public final HashSet f43208e = new HashSet();

    /* renamed from: f */
    public final Object f43209f = new Object();

    /* renamed from: g */
    public boolean f43210g;

    /* renamed from: h */
    public final Intent f43211h;

    /* renamed from: i */
    public final C16553g f43212i;

    /* renamed from: j */
    public final WeakReference f43213j;

    /* renamed from: k */
    public final C16543b f43214k = new C16543b(this);

    /* renamed from: l */
    public final AtomicInteger f43215l = new AtomicInteger(0);

    /* renamed from: m */
    public C16559j f43216m;

    /* renamed from: n */
    public IInterface f43217n;

    public C16561k(Context context, C0262r rVar, String str, Intent intent, C16553g gVar) {
        this.f43204a = context;
        this.f43205b = rVar;
        this.f43206c = str;
        this.f43211h = intent;
        this.f43212i = gVar;
        this.f43213j = new WeakReference((Object) null);
    }

    /* renamed from: a */
    public final Handler mo49335a() {
        Handler handler;
        HashMap hashMap = f43203o;
        synchronized (hashMap) {
            if (!hashMap.containsKey(this.f43206c)) {
                HandlerThread handlerThread = new HandlerThread(this.f43206c, 10);
                handlerThread.start();
                hashMap.put(this.f43206c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) hashMap.get(this.f43206c);
        }
        return handler;
    }

    /* renamed from: b */
    public final void mo49336b(C16541a aVar, C17573l lVar) {
        synchronized (this.f43209f) {
            this.f43208e.add(lVar);
            C17576o oVar = lVar.f45196a;
            C16545c cVar = new C16545c((Object) this, (Object) lVar);
            oVar.getClass();
            oVar.f45199b.mo50022a(new C17567f(C17564c.f45178a, cVar));
            oVar.mo50029b();
        }
        synchronized (this.f43209f) {
            if (this.f43215l.getAndIncrement() > 0) {
                this.f43205b.mo974a("Already connected to the service.", new Object[0]);
            }
        }
        mo49335a().post(new C16547d(this, aVar.f43175b, aVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        mo49335a().post(new p434dd.C16549e(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        return;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo49337c(p554id.C17573l r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f43209f
            monitor-enter(r0)
            java.util.HashSet r1 = r3.f43208e     // Catch:{ all -> 0x0039 }
            r1.remove(r4)     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            java.lang.Object r4 = r3.f43209f
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicInteger r0 = r3.f43215l     // Catch:{ all -> 0x0036 }
            int r0 = r0.get()     // Catch:{ all -> 0x0036 }
            if (r0 <= 0) goto L_0x0028
            java.util.concurrent.atomic.AtomicInteger r0 = r3.f43215l     // Catch:{ all -> 0x0036 }
            int r0 = r0.decrementAndGet()     // Catch:{ all -> 0x0036 }
            if (r0 <= 0) goto L_0x0028
            androidx.appcompat.app.r r0 = r3.f43205b     // Catch:{ all -> 0x0036 }
            java.lang.String r1 = "Leaving the connection open for other ongoing calls."
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0036 }
            r0.mo977d(r1, r2)     // Catch:{ all -> 0x0036 }
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            return
        L_0x0028:
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            dd.e r4 = new dd.e
            r4.<init>(r3)
            android.os.Handler r0 = r3.mo49335a()
            r0.post(r4)
            return
        L_0x0036:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            throw r0
        L_0x0039:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p434dd.C16561k.mo49337c(id.l):void");
    }

    /* renamed from: d */
    public final void mo49338d() {
        synchronized (this.f43209f) {
            Iterator it = this.f43208e.iterator();
            while (it.hasNext()) {
                ((C17573l) it.next()).mo50024a(new RemoteException(String.valueOf(this.f43206c).concat(" : Binder has died.")));
            }
            this.f43208e.clear();
        }
    }
}
