package c70;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.camera.camera2.internal.C0510d;
import b00.C13556a;
import b00.C13558c;
import b00.C13560e;
import ce0.C21100e;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.request.RequestOptions;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import p241s0.C6302b;
import p241s0.C6306f;
import p241s0.C6307g;
import p304x.C7097r;
import p358af.C13437d;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20437h;
import p977zz.C20932c0;
import p977zz.C20975x0;

/* renamed from: c70.i */
public final class C13756i {

    /* renamed from: a */
    public final RequestOptions f33867a;

    /* renamed from: b */
    public final C13760d f33868b;

    /* renamed from: c */
    public final C13764h f33869c;

    /* renamed from: d */
    public final ThreadPoolExecutor f33870d;

    /* renamed from: e */
    public final PriorityQueue<C13762f> f33871e;

    /* renamed from: f */
    public Integer f33872f;

    /* renamed from: g */
    public final C6306f<String, C13766j> f33873g;

    /* renamed from: h */
    public final C6302b f33874h;

    /* renamed from: i */
    public boolean f33875i;

    /* renamed from: j */
    public C13752e f33876j;

    /* renamed from: k */
    public Handler f33877k;

    /* renamed from: c70.i$a */
    public class C13757a implements C13560e.C13561a {

        /* renamed from: a */
        public final /* synthetic */ String f33878a;

        /* renamed from: b */
        public final /* synthetic */ C13768l f33879b;

        public C13757a(String str, C13768l lVar) {
            this.f33878a = str;
            this.f33879b = lVar;
        }
    }

    /* renamed from: c70.i$b */
    public static class C13758b extends C13766j {

        /* renamed from: b */
        public final HttpURLConnection f33881b;

        /* renamed from: c */
        public final BadResponseException f33882c;

        public C13758b(C20431c<?, ?> cVar, HttpURLConnection httpURLConnection, BadResponseException badResponseException) {
            super(cVar);
            C21100e.m49373x(httpURLConnection, "connection");
            this.f33881b = httpURLConnection;
            this.f33882c = badResponseException;
        }

        /* renamed from: a */
        public final void mo40687a(C13760d dVar, boolean z) {
            dVar.mo40696o0(this.f33899a, this.f33881b, this.f33882c);
        }

        /* renamed from: d */
        public final boolean mo40688d() {
            return true;
        }

        /* renamed from: e */
        public final boolean mo40689e() {
            return true;
        }
    }

    /* renamed from: c70.i$c */
    public static class C13759c extends C13766j {

        /* renamed from: b */
        public final ArrayList f33883b;

        public C13759c(C20431c<?, ?> cVar, C13766j jVar) {
            super(cVar);
            ArrayList arrayList = new ArrayList();
            this.f33883b = arrayList;
            if (cVar.mo21057B()) {
                arrayList.add(jVar);
            } else {
                throw new IllegalStateException(C13437d.m33705j(C13759c.class, new StringBuilder(), " can only be created for multi-response requests"));
            }
        }

        /* renamed from: b */
        public final void mo40690b(C13768l lVar, C13760d dVar) {
            Iterator it = this.f33883b.iterator();
            while (it.hasNext()) {
                ((C13766j) it.next()).mo40690b(lVar, dVar);
            }
        }

        /* renamed from: d */
        public final boolean mo40688d() {
            return false;
        }

        /* renamed from: e */
        public final boolean mo40689e() {
            if (!this.f33883b.isEmpty()) {
                ArrayList arrayList = this.f33883b;
                if (((C13766j) arrayList.get(arrayList.size() - 1)).mo40689e()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: c70.i$d */
    public interface C13760d {
        /* renamed from: N */
        void mo40691N(C20431c cVar, ServerException serverException, boolean z);

        /* renamed from: Y */
        void mo40692Y(C20431c cVar, IOException iOException, boolean z);

        /* renamed from: a */
        void mo40693a();

        /* renamed from: c */
        void mo40694c(C20431c cVar, C20436g gVar);

        /* renamed from: m0 */
        void mo40695m0(C20431c<?, ?> cVar, IOException iOException, boolean z);

        /* renamed from: o0 */
        void mo40696o0(C20431c<?, ?> cVar, HttpURLConnection httpURLConnection, BadResponseException badResponseException);
    }

    /* renamed from: c70.i$e */
    public static class C13761e extends C13766j {

        /* renamed from: b */
        public final IOException f33884b;

        public C13761e(C20431c<?, ?> cVar, IOException iOException) {
            super(cVar);
            this.f33884b = iOException;
        }

        /* renamed from: a */
        public final void mo40687a(C13760d dVar, boolean z) {
            dVar.mo40695m0(this.f33899a, this.f33884b, z);
        }

        /* renamed from: c */
        public final boolean mo40697c(C13768l lVar) {
            return lVar.mo40676d(this.f33899a, this.f33884b);
        }

        /* renamed from: d */
        public final boolean mo40688d() {
            return true;
        }

        /* renamed from: e */
        public final boolean mo40689e() {
            return true;
        }
    }

    /* renamed from: c70.i$f */
    public static class C13762f implements C13556a, Runnable, Comparable<C13762f> {

        /* renamed from: j */
        public static final AtomicLong f33885j = new AtomicLong(0);

        /* renamed from: b */
        public final long f33886b = f33885j.getAndIncrement();

        /* renamed from: c */
        public final String f33887c;

        /* renamed from: d */
        public final C20431c<?, ?> f33888d;

        /* renamed from: e */
        public final RequestOptions f33889e;

        /* renamed from: f */
        public final C13560e f33890f = new C13560e(this);

        /* renamed from: g */
        public C13756i f33891g;

        /* renamed from: h */
        public boolean f33892h = false;

        /* renamed from: i */
        public boolean f33893i = false;

        public C13762f(C13756i iVar, String str, C20431c<?, ?> cVar, RequestOptions requestOptions) {
            C21100e.m49373x(iVar, "requestManager");
            this.f33891g = iVar;
            C21100e.m49373x(str, "requestId");
            this.f33887c = str;
            C21100e.m49373x(cVar, "request");
            this.f33888d = cVar;
            this.f33889e = requestOptions;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0021, code lost:
            return true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized boolean cancel(boolean r3) {
            /*
                r2 = this;
                monitor-enter(r2)
                boolean r3 = r2.f33892h     // Catch:{ all -> 0x0022 }
                if (r3 == 0) goto L_0x0008
                r3 = 0
                monitor-exit(r2)
                return r3
            L_0x0008:
                r3 = 1
                r2.f33892h = r3     // Catch:{ all -> 0x0022 }
                boolean r0 = r2.f33893i     // Catch:{ all -> 0x0022 }
                if (r0 != 0) goto L_0x0020
                c70.i r0 = r2.f33891g     // Catch:{ all -> 0x0022 }
                if (r0 == 0) goto L_0x0020
                java.util.concurrent.ThreadPoolExecutor r1 = r0.f33870d     // Catch:{ all -> 0x0022 }
                r1.remove(r2)     // Catch:{ all -> 0x0022 }
                java.util.concurrent.ThreadPoolExecutor r0 = r0.f33870d     // Catch:{ all -> 0x0022 }
                r0.purge()     // Catch:{ all -> 0x0022 }
                r2.mo40701h()     // Catch:{ all -> 0x0022 }
            L_0x0020:
                monitor-exit(r2)
                return r3
            L_0x0022:
                r3 = move-exception
                monitor-exit(r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: c70.C13756i.C13762f.cancel(boolean):boolean");
        }

        public final int compareTo(Object obj) {
            C13762f fVar = (C13762f) obj;
            int a = C20975x0.m49114a(fVar.f33889e.f42905b, this.f33889e.f42905b);
            if (a != 0) {
                return a;
            }
            return C20975x0.m49115b(this.f33886b, fVar.f33886b);
        }

        /* renamed from: f */
        public final synchronized boolean mo40699f() {
            return this.f33892h;
        }

        /* renamed from: g */
        public final synchronized void mo40700g(C13766j jVar) {
            if (!mo40699f()) {
                C13756i iVar = this.f33891g;
                if (iVar != null) {
                    iVar.f33877k.post(new C0510d(5, this, iVar, jVar));
                }
            }
        }

        /* renamed from: h */
        public final synchronized void mo40701h() {
            if (!this.f33893i) {
                C13756i iVar = this.f33891g;
                if (iVar != null) {
                    this.f33893i = true;
                    iVar.f33877k.post(new C7097r(22, this, iVar));
                }
            }
        }

        public final void run() {
            C20436g G;
            try {
                if (mo40699f()) {
                    mo40701h();
                    return;
                }
                try {
                    this.f33888d.mo5818H();
                    if (mo40699f()) {
                        mo40701h();
                        return;
                    }
                    if (this.f33888d.mo21057B()) {
                        do {
                            G = this.f33888d.mo40051G();
                            if (mo40699f()) {
                                G = null;
                                continue;
                            } else {
                                mo40700g(new C13765i(this.f33888d, G));
                                continue;
                            }
                        } while (G != null);
                    } else {
                        C20436g G2 = this.f33888d.mo40051G();
                        if (!mo40699f()) {
                            mo40700g(new C13765i(this.f33888d, G2));
                        }
                    }
                    mo40701h();
                } catch (IOException e) {
                    mo40700g(new C13761e(this.f33888d, e));
                    mo40701h();
                } catch (ServerException e2) {
                    mo40700g(new C13767k(this.f33888d, this.f33888d.mo52631x(), e2));
                    mo40701h();
                }
            } catch (IOException e3) {
                mo40700g(new C13763g(this.f33888d, this.f33888d.mo52631x(), e3));
            } catch (ServerException e4) {
                mo40700g(new C13767k(this.f33888d, this.f33888d.mo52631x(), e4));
            } catch (BadResponseException e5) {
                mo40700g(new C13758b(this.f33888d, this.f33888d.mo52631x(), e5));
            } catch (Throwable th) {
                mo40701h();
                throw th;
            }
        }
    }

    /* renamed from: c70.i$g */
    public static class C13763g extends C13766j {

        /* renamed from: b */
        public final HttpURLConnection f33894b;

        /* renamed from: c */
        public final IOException f33895c;

        public C13763g(C20431c<?, ?> cVar, HttpURLConnection httpURLConnection, IOException iOException) {
            super(cVar);
            C21100e.m49373x(httpURLConnection, "connection");
            this.f33894b = httpURLConnection;
            this.f33895c = iOException;
        }

        /* renamed from: a */
        public final void mo40687a(C13760d dVar, boolean z) {
            dVar.mo40692Y(this.f33899a, this.f33895c, z);
        }

        /* renamed from: c */
        public final boolean mo40697c(C13768l lVar) {
            return lVar.mo40678f(this.f33899a, this.f33894b, this.f33895c);
        }

        /* renamed from: d */
        public final boolean mo40688d() {
            return true;
        }

        /* renamed from: e */
        public final boolean mo40689e() {
            return true;
        }
    }

    /* renamed from: c70.i$h */
    public static class C13764h {

        /* renamed from: a */
        public final CollectionHashMap.ArrayListHashMap<String, C13768l> f33896a = new CollectionHashMap.ArrayListHashMap<>();

        /* renamed from: b */
        public final CollectionHashMap.ArrayListHashMap<String, C13768l> f33897b = new CollectionHashMap.ArrayListHashMap<>();
    }

    /* renamed from: c70.i$i */
    public static class C13765i extends C13766j {

        /* renamed from: b */
        public final C20436g<?, ?> f33898b;

        public C13765i(C20431c<?, ?> cVar, C20436g<?, ?> gVar) {
            super(cVar);
            this.f33898b = gVar;
        }

        /* renamed from: a */
        public final void mo40687a(C13760d dVar, boolean z) {
            C20436g<?, ?> gVar = this.f33898b;
            if (gVar != null) {
                dVar.mo40694c(this.f33899a, gVar);
            }
        }

        /* renamed from: c */
        public final boolean mo40697c(C13768l lVar) {
            C20436g<?, ?> gVar = this.f33898b;
            if (gVar == null) {
                return true;
            }
            lVar.mo40675c(this.f33899a, gVar);
            return true;
        }

        /* renamed from: d */
        public final boolean mo40688d() {
            return false;
        }

        /* renamed from: e */
        public final boolean mo40689e() {
            return this.f33898b == null || !this.f33899a.mo21057B();
        }
    }

    /* renamed from: c70.i$j */
    public static abstract class C13766j {

        /* renamed from: a */
        public final C20431c<?, ?> f33899a;

        public C13766j(C20431c<?, ?> cVar) {
            C21100e.m49373x(cVar, "request");
            this.f33899a = cVar;
        }

        /* renamed from: a */
        public void mo40687a(C13760d dVar, boolean z) {
        }

        /* renamed from: b */
        public void mo40690b(C13768l lVar, C13760d dVar) {
            boolean z;
            boolean z2 = false;
            if (lVar != null) {
                z = mo40697c(lVar);
            } else {
                z = false;
            }
            if (z || lVar == null) {
                z2 = true;
            }
            mo40687a(dVar, z2);
            if (mo40689e()) {
                if (lVar != null) {
                    lVar.mo40674a(this.f33899a, !z);
                }
                dVar.mo40693a();
            }
        }

        /* renamed from: c */
        public boolean mo40697c(C13768l lVar) {
            return false;
        }

        /* renamed from: d */
        public abstract boolean mo40688d();

        /* renamed from: e */
        public abstract boolean mo40689e();
    }

    /* renamed from: c70.i$k */
    public static class C13767k extends C13766j {

        /* renamed from: b */
        public final HttpURLConnection f33900b;

        /* renamed from: c */
        public final ServerException f33901c;

        public C13767k(C20431c<?, ?> cVar, HttpURLConnection httpURLConnection, ServerException serverException) {
            super(cVar);
            C21100e.m49373x(httpURLConnection, "connection");
            this.f33900b = httpURLConnection;
            this.f33901c = serverException;
        }

        /* renamed from: a */
        public final void mo40687a(C13760d dVar, boolean z) {
            dVar.mo40691N(this.f33899a, this.f33901c, z);
        }

        /* renamed from: c */
        public final boolean mo40697c(C13768l lVar) {
            return lVar.mo40677e(this.f33899a, this.f33900b, this.f33901c);
        }

        /* renamed from: d */
        public final boolean mo40688d() {
            return true;
        }

        /* renamed from: e */
        public final boolean mo40689e() {
            return true;
        }
    }

    /* renamed from: c70.i$l */
    public interface C13768l {
        /* renamed from: a */
        void mo40674a(C20431c<?, ?> cVar, boolean z);

        /* renamed from: c */
        void mo40675c(C20431c<?, ?> cVar, C20436g<?, ?> gVar);

        /* renamed from: d */
        boolean mo40676d(C20431c<?, ?> cVar, IOException iOException);

        /* renamed from: e */
        boolean mo40677e(C20431c<?, ?> cVar, HttpURLConnection httpURLConnection, ServerException serverException);

        /* renamed from: f */
        boolean mo40678f(C20431c<?, ?> cVar, HttpURLConnection httpURLConnection, IOException iOException);
    }

    public C13756i(RequestOptions requestOptions, C13760d dVar) {
        this(requestOptions, dVar, new Handler(Looper.getMainLooper()), C20932c0.m49025a("RequestManager"));
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: a */
    public static C13756i m34349a(Context context) {
        return (C13756i) context.getSystemService("request_manager");
    }

    /* renamed from: b */
    public final synchronized C13752e mo40679b() {
        return this.f33876j;
    }

    /* renamed from: c */
    public final RequestOptions mo40680c() {
        RequestOptions requestOptions = this.f33867a;
        return new RequestOptions(requestOptions.f42905b, requestOptions.f42906c, requestOptions.f42907d, requestOptions.f42908e, requestOptions.f42909f);
    }

    /* renamed from: d */
    public final LinkedList mo40681d(String str, C13778r rVar, RequestOptions requestOptions) throws IOException, ServerException {
        C21100e.m49373x(str, "requestId");
        if (Looper.myLooper() != this.f33877k.getLooper()) {
            IOException[] iOExceptionArr = new IOException[1];
            ServerException[] serverExceptionArr = new ServerException[1];
            LinkedList linkedList = new LinkedList();
            C13769j jVar = new C13769j(linkedList, iOExceptionArr, serverExceptionArr);
            C13556a[] aVarArr = new C13556a[1];
            RuntimeException[] runtimeExceptionArr = new RuntimeException[1];
            synchronized (linkedList) {
                C13754g gVar = r1;
                Handler handler = this.f33877k;
                C13754g gVar2 = new C13754g(this, linkedList, aVarArr, str, rVar, requestOptions, jVar, runtimeExceptionArr);
                handler.post(gVar);
                try {
                    linkedList.wait();
                    RuntimeException runtimeException = runtimeExceptionArr[0];
                    if (runtimeException == null) {
                        IOException iOException = iOExceptionArr[0];
                        if (iOException == null) {
                            ServerException serverException = serverExceptionArr[0];
                            if (serverException != null) {
                                throw serverException;
                            }
                        } else {
                            throw iOException;
                        }
                    } else {
                        throw runtimeException;
                    }
                } catch (InterruptedException e) {
                    InterruptedException interruptedException = e;
                    C13556a aVar = aVarArr[0];
                    if (aVar != null) {
                        aVar.cancel(true);
                    }
                    throw new InterruptedIOException(interruptedException.getMessage());
                }
            }
            return linkedList;
        }
        throw new ApplicationBugException("Can't call getResponses() on the response handler's thread (it just doesn't make sense)");
    }

    /* renamed from: e */
    public final C13556a mo40682e(String str, C20431c<?, ?> cVar, RequestOptions requestOptions, C13768l lVar) {
        C13770k kVar;
        CollectionHashMap.ArrayListHashMap<String, C13768l> arrayListHashMap;
        boolean z;
        boolean z2;
        if (Looper.myLooper() != this.f33877k.getLooper()) {
            throw new IllegalStateException("Can't send requests from a thread that isn't the response handler's");
        } else if (mo40679b() == null) {
            throw new IllegalStateException(C13437d.m33706k("Unable to handleRequest (", str, ") before context has been set"));
        } else if (cVar == null && lVar == null) {
            throw new IllegalArgumentException("Either request or responseReceiver must be non-null");
        } else {
            if (requestOptions == null) {
                requestOptions = this.f33867a;
            }
            C13766j jVar = this.f33873g.get(str);
            if (jVar == null || ((!this.f33874h.containsKey(str)) && requestOptions.f42908e)) {
                kVar = null;
            } else {
                kVar = mo40686i(jVar, Collections.singleton(lVar), requestOptions.f42907d);
                if (!cVar.mo21057B() || z2) {
                    return kVar;
                }
            }
            C13762f fVar = (C13762f) this.f33874h.getOrDefault(str, null);
            if (fVar != null) {
                AtomicLong atomicLong = C13762f.f33885j;
                if (fVar.mo40699f()) {
                    this.f33874h.remove(str);
                    C13764h hVar = this.f33869c;
                    synchronized (hVar) {
                        hVar.f33896a.remove(str);
                        hVar.f33897b.remove(str);
                    }
                    fVar = null;
                }
            }
            C13764h hVar2 = this.f33869c;
            boolean z3 = requestOptions.f42906c;
            synchronized (hVar2) {
                if (z3) {
                    arrayListHashMap = hVar2.f33897b;
                } else {
                    arrayListHashMap = hVar2.f33896a;
                }
                arrayListHashMap.mo47001a(str, lVar);
            }
            if (fVar == null) {
                if (cVar == null) {
                    C13764h hVar3 = this.f33869c;
                    synchronized (hVar3) {
                        hVar3.f33896a.mo47007p(str, lVar);
                        hVar3.f33897b.mo47007p(str, lVar);
                    }
                    return null;
                }
                fVar = new C13762f(this, str, cVar, requestOptions);
                this.f33874h.put(str, fVar);
                C13756i iVar = fVar.f33891g;
                Integer num = iVar.f33872f;
                if (num == null || fVar.f33889e.f42905b >= num.intValue()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    iVar.f33870d.execute(fVar);
                    iVar.f33872f = Integer.valueOf(fVar.f33889e.f42905b);
                } else {
                    iVar.f33871e.add(fVar);
                }
            }
            C13560e eVar = fVar.f33890f;
            C13757a aVar = new C13757a(str, lVar);
            eVar.f33506c.incrementAndGet();
            C13560e.C13562b bVar = new C13560e.C13562b(aVar);
            if (kVar == null) {
                return bVar;
            }
            return new C13558c(kVar, bVar);
        }
    }

    /* renamed from: f */
    public final synchronized void mo40683f() {
        this.f33875i = true;
        Iterator it = ((C6307g.C6312e) this.f33874h.values()).iterator();
        while (it.hasNext()) {
            C13762f fVar = (C13762f) it.next();
            synchronized (fVar) {
                fVar.f33891g = null;
                fVar.cancel(true);
            }
        }
        this.f33874h.clear();
    }

    /* renamed from: g */
    public final <RQ extends C20431c<RQ, RS>, RS extends C20436g<RQ, RS>> C13556a mo40684g(String str, RQ rq, RequestOptions requestOptions, C20437h<RQ, RS> hVar) {
        C21100e.m49373x(str, "requestId");
        return mo40682e(str, rq, requestOptions, new C13755h(hVar));
    }

    /* renamed from: h */
    public final synchronized void mo40685h(C13752e eVar) {
        this.f33876j = eVar;
        C13764h hVar = this.f33869c;
        synchronized (hVar) {
            hVar.f33896a.clear();
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: i */
    public final c70.C13770k mo40686i(c70.C13756i.C13766j r3, java.util.Collection r4, boolean r5) {
        /*
            r2 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Handler r1 = r2.f33877k
            android.os.Looper r1 = r1.getLooper()
            if (r0 != r1) goto L_0x0038
            c70.k r0 = new c70.k
            r0.<init>(r2, r4, r3)
            r3 = 0
            if (r5 == 0) goto L_0x0018
            r0.run()
            return r3
        L_0x0018:
            monitor-enter(r2)
            c70.e r4 = r2.mo40679b()     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002a
            monitor-enter(r2)     // Catch:{ all -> 0x0035 }
            boolean r4 = r2.f33875i     // Catch:{ all -> 0x0027 }
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            if (r4 != 0) goto L_0x002a
            r4 = 1
            goto L_0x002b
        L_0x0027:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0035 }
            throw r3     // Catch:{ all -> 0x0035 }
        L_0x002a:
            r4 = 0
        L_0x002b:
            monitor-exit(r2)
            if (r4 == 0) goto L_0x0034
            android.os.Handler r3 = r2.f33877k
            r3.post(r0)
            return r0
        L_0x0034:
            return r3
        L_0x0035:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L_0x0038:
            com.moovit.commons.utils.ApplicationBugException r3 = new com.moovit.commons.utils.ApplicationBugException
            java.lang.String r4 = "Must be called on the response handler's thread"
            r3.<init>((java.lang.String) r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c70.C13756i.mo40686i(c70.i$j, java.util.Collection, boolean):c70.k");
    }

    public C13756i(RequestOptions requestOptions, C13760d dVar, Handler handler, C20932c0 c0Var) {
        this.f33869c = new C13764h();
        this.f33871e = new PriorityQueue<>();
        this.f33872f = null;
        this.f33873g = new C6306f<>(50);
        this.f33874h = new C6302b();
        this.f33875i = false;
        C21100e.m49373x(requestOptions, "defaultRequestOptions");
        this.f33867a = requestOptions;
        this.f33868b = dVar;
        this.f33877k = handler;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 10, TimeUnit.SECONDS, new PriorityBlockingQueue(), c0Var);
        this.f33870d = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }
}
