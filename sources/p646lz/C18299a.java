package p646lz;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import c00.C13717b;
import c00.C13723g;
import ce0.C21100e;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.moovit.commons.appdata.AppDataPartLoadError;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.collections.CollectionHashMap;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p241s0.C6302b;
import p241s0.C6307g;
import p589jq.C17911c;
import p977zz.C20932c0;
import p977zz.C20944i0;
import p988j$.util.DesugarCollections;

/* renamed from: lz.a */
public final class C18299a implements Handler.Callback {

    /* renamed from: b */
    public final UUID f46663b;

    /* renamed from: c */
    public final String f46664c;

    /* renamed from: d */
    public Context f46665d;

    /* renamed from: e */
    public final Handler f46666e;

    /* renamed from: f */
    public final C6302b f46667f = new C6302b();

    /* renamed from: g */
    public final Map<String, ConditionVariable> f46668g = DesugarCollections.synchronizedMap(new C6302b());

    /* renamed from: h */
    public final ExecutorService f46669h = Executors.newCachedThreadPool(C20932c0.m49025a("AppDataManager"));

    /* renamed from: i */
    public final C6302b f46670i = new C6302b();

    /* renamed from: j */
    public final C6302b f46671j = new C6302b();

    /* renamed from: k */
    public final ArrayList f46672k = new ArrayList();

    /* renamed from: l */
    public final CollectionHashMap.LinkedListHashMap<String, C18304b> f46673l = new CollectionHashMap.LinkedListHashMap<>();

    /* renamed from: m */
    public final ReentrantReadWriteLock f46674m = new ReentrantReadWriteLock();

    /* renamed from: n */
    public ArrayList f46675n = null;

    /* renamed from: lz.a$a */
    public class C18300a implements C18304b {

        /* renamed from: b */
        public final /* synthetic */ TaskCompletionSource f46676b;

        public C18300a(TaskCompletionSource taskCompletionSource) {
            this.f46676b = taskCompletionSource;
        }

        /* renamed from: d */
        public final void mo44553d(Object obj, String str) {
            Exception exc;
            TaskCompletionSource taskCompletionSource = this.f46676b;
            if (obj instanceof Exception) {
                exc = (Exception) obj;
            } else {
                exc = new AppDataPartLoadFailedException(obj, (String) null, (Throwable) null);
            }
            taskCompletionSource.trySetException(exc);
        }

        /* renamed from: g */
        public final void mo44554g(Object obj, String str) {
            this.f46676b.trySetResult(obj);
        }
    }

    /* renamed from: lz.a$b */
    public class C18301b implements Runnable {

        /* renamed from: b */
        public final String f46677b;

        /* renamed from: c */
        public final C18305c<?> f46678c;

        public C18301b(String str, C18305c<?> cVar) {
            this.f46677b = str;
            this.f46678c = cVar;
        }

        public final void run() {
            C18303d dVar;
            C18303d dVar2;
            C18303d dVar3;
            try {
                C18299a aVar = C18299a.this;
                String str = aVar.f46664c;
                aVar.f46674m.readLock().lock();
                Iterator it = this.f46678c.mo20294b(C18299a.this.f46665d).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        dVar = null;
                        break;
                    }
                    String str2 = (String) it.next();
                    C18299a aVar2 = C18299a.this;
                    String str3 = aVar2.f46664c;
                    aVar2.f46668g.get(str2).block();
                    C18299a aVar3 = C18299a.this;
                    String str4 = aVar3.f46664c;
                    Object g = aVar3.mo50694g(str2);
                    if (g != null) {
                        C18299a aVar4 = C18299a.this;
                        String str5 = aVar4.f46664c;
                        C18305c<?> cVar = this.f46678c;
                        Context context = aVar4.f46665d;
                        dVar = new C18303d(cVar.mo46174a(context, context.getResources().getConfiguration(), C18299a.this), (Object) null, new C18302c(str2, g));
                        break;
                    }
                }
                if (dVar2 == null) {
                    synchronized (this.f46678c) {
                        C18305c<?> cVar2 = this.f46678c;
                        Context context2 = C18299a.this.f46665d;
                        Object a = cVar2.mo46174a(context2, context2.getResources().getConfiguration(), C18299a.this);
                        try {
                            String str6 = C18299a.this.f46664c;
                            Objects.toString(a);
                            SystemClock.elapsedRealtime();
                            C18305c<?> cVar3 = this.f46678c;
                            C18299a aVar5 = C18299a.this;
                            Object c = cVar3.mo50709c(aVar5.f46665d, aVar5, this.f46677b);
                            String str7 = C18299a.this.f46664c;
                            SystemClock.elapsedRealtime();
                            if (c != null) {
                                dVar3 = new C18303d(a, c, (Object) null);
                            } else {
                                dVar3 = new C18303d(a, (Object) null, "Loaded part (" + this.f46677b + ") is null");
                            }
                        } catch (AppDataPartLoadFailedException e) {
                            String str8 = C18299a.this.f46664c;
                            Objects.toString(e.mo46894a());
                            dVar3 = new C18303d(a, (Object) null, e.mo46894a());
                        } catch (RuntimeException e2) {
                            String str9 = C18299a.this.f46664c;
                            dVar3 = new C18303d(a, (Object) null, e2);
                        } catch (Throwable th) {
                            String str10 = C18299a.this.f46664c;
                            dVar2 = new C18303d(a, (Object) null, new AppDataPartLoadError(th));
                        }
                        dVar2 = dVar3;
                    }
                }
                C18299a.this.mo50701m(this.f46677b, dVar2);
            } finally {
                C18299a.this.f46674m.readLock().unlock();
            }
        }
    }

    /* renamed from: lz.a$c */
    public static class C18302c {

        /* renamed from: a */
        public final String f46680a;

        /* renamed from: b */
        public final Object f46681b;

        public C18302c(String str, Object obj) {
            C21100e.m49373x(str, "dependencyPartId");
            this.f46680a = str;
            this.f46681b = obj;
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("Dependency ");
            k.append(this.f46680a);
            k.append(" failed: ");
            k.append(this.f46681b);
            return k.toString();
        }
    }

    /* renamed from: lz.a$d */
    public static class C18303d {

        /* renamed from: a */
        public final Object f46682a;

        /* renamed from: b */
        public final Object f46683b;

        /* renamed from: c */
        public final Object f46684c;

        public C18303d(Object obj, Object obj2, Object obj3) {
            this.f46682a = obj;
            this.f46683b = obj2;
            this.f46684c = obj3;
            if (obj2 == null && obj3 == null) {
                throw new IllegalArgumentException("Either partData or failureReason must be non-null");
            }
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("LoadingResult[confKey=");
            k.append(this.f46682a);
            k.append(", partData=");
            k.append(this.f46683b);
            k.append(", failureReason=");
            return C16530d.m42015h(k, this.f46684c, "]");
        }
    }

    public C18299a(Context context) {
        Handler handler;
        UUID randomUUID = UUID.randomUUID();
        this.f46663b = randomUUID;
        StringBuilder k = C13555b.m33972k("AppDataManager[");
        k.append(randomUUID.toString());
        k.append(']');
        this.f46664c = k.toString();
        C21100e.m49371w(context);
        this.f46665d = context;
        if (Looper.myLooper() != null) {
            handler = new Handler(this);
        } else {
            handler = new Handler(Looper.getMainLooper(), this);
        }
        this.f46666e = handler;
    }

    /* renamed from: a */
    public final synchronized void mo50688a(HashSet hashSet) {
        HashSet hashSet2 = new HashSet(hashSet.size());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Future future = (Future) this.f46671j.remove(str);
            if (future != null) {
                future.cancel(true);
                hashSet2.add(str);
            }
        }
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            this.f46668g.get(str2).close();
            Objects.toString((C18303d) this.f46670i.remove(str2));
        }
        Iterator it3 = hashSet2.iterator();
        while (it3.hasNext()) {
            mo50692e((String) it3.next());
        }
    }

    /* renamed from: b */
    public final synchronized void mo50689b(String str) {
        if (mo50694g(str) != null) {
            HashSet hashSet = new HashSet();
            ArrayDeque arrayDeque = new ArrayDeque();
            arrayDeque.add(str);
            while (!arrayDeque.isEmpty()) {
                String str2 = (String) arrayDeque.removeFirst();
                if (mo50694g(str2) != null) {
                    hashSet.add(str2);
                    for (String str3 : mo50693f(str2).mo20294b(this.f46665d)) {
                        if (!hashSet.contains(str3)) {
                            arrayDeque.add(str3);
                        }
                    }
                }
            }
            C13717b.m34269p(hashSet);
            mo50688a(hashSet);
        }
    }

    /* renamed from: c */
    public final synchronized <T> T mo50690c(String str) {
        T t;
        t = null;
        C18303d dVar = (C18303d) this.f46670i.getOrDefault(str, null);
        if (dVar != null) {
            t = dVar.f46683b;
        }
        return t;
    }

    /* renamed from: d */
    public final synchronized HashSet mo50691d(String str) {
        HashSet hashSet;
        hashSet = new HashSet();
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(str);
        while (!arrayDeque.isEmpty()) {
            String str2 = (String) arrayDeque.removeFirst();
            hashSet.add(str2);
            Iterator it = ((C6307g.C6309b) this.f46667f.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str3 = (String) entry.getKey();
                if (((C18305c) entry.getValue()).mo20294b(this.f46665d).contains(str2) && !hashSet.contains(str3)) {
                    arrayDeque.addLast(str3);
                }
            }
        }
        return hashSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        return r1;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.concurrent.Future<?> mo50692e(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            s0.b r0 = r4.f46670i     // Catch:{ all -> 0x0074 }
            boolean r0 = r0.containsKey(r5)     // Catch:{ all -> 0x0074 }
            r1 = 0
            if (r0 == 0) goto L_0x000c
            monitor-exit(r4)
            return r1
        L_0x000c:
            s0.b r0 = r4.f46667f     // Catch:{ all -> 0x0074 }
            java.lang.Object r0 = r0.getOrDefault(r5, r1)     // Catch:{ all -> 0x0074 }
            lz.c r0 = (p646lz.C18305c) r0     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x0058
            android.content.Context r2 = r4.f46665d     // Catch:{ all -> 0x0074 }
            java.util.HashSet r2 = r0.mo20294b(r2)     // Catch:{ all -> 0x0074 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0074 }
        L_0x0020:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0074 }
            if (r3 == 0) goto L_0x0030
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0074 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0074 }
            r4.mo50692e(r3)     // Catch:{ all -> 0x0074 }
            goto L_0x0020
        L_0x0030:
            s0.b r2 = r4.f46671j     // Catch:{ all -> 0x0074 }
            java.lang.Object r1 = r2.getOrDefault(r5, r1)     // Catch:{ all -> 0x0074 }
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1     // Catch:{ all -> 0x0074 }
            if (r1 == 0) goto L_0x0046
            boolean r2 = r1.isDone()     // Catch:{ all -> 0x0074 }
            if (r2 != 0) goto L_0x0046
            boolean r2 = r1.isCancelled()     // Catch:{ all -> 0x0074 }
            if (r2 == 0) goto L_0x0056
        L_0x0046:
            java.util.concurrent.ExecutorService r1 = r4.f46669h     // Catch:{ all -> 0x0074 }
            lz.a$b r2 = new lz.a$b     // Catch:{ all -> 0x0074 }
            r2.<init>(r5, r0)     // Catch:{ all -> 0x0074 }
            java.util.concurrent.Future r1 = r1.submit(r2)     // Catch:{ all -> 0x0074 }
            s0.b r0 = r4.f46671j     // Catch:{ all -> 0x0074 }
            r0.put(r5, r1)     // Catch:{ all -> 0x0074 }
        L_0x0056:
            monitor-exit(r4)
            return r1
        L_0x0058:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0074 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
            r1.<init>()     // Catch:{ all -> 0x0074 }
            java.lang.String r2 = "No loader has been specified for data part '"
            r1.append(r2)     // Catch:{ all -> 0x0074 }
            r1.append(r5)     // Catch:{ all -> 0x0074 }
            java.lang.String r5 = "'"
            r1.append(r5)     // Catch:{ all -> 0x0074 }
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x0074 }
            r0.<init>(r5)     // Catch:{ all -> 0x0074 }
            throw r0     // Catch:{ all -> 0x0074 }
        L_0x0074:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p646lz.C18299a.mo50692e(java.lang.String):java.util.concurrent.Future");
    }

    /* renamed from: f */
    public final C18305c<?> mo50693f(String str) {
        return (C18305c) this.f46667f.getOrDefault(str, null);
    }

    /* renamed from: g */
    public final synchronized Object mo50694g(String str) {
        Object obj;
        obj = null;
        C18303d dVar = (C18303d) this.f46670i.getOrDefault(str, null);
        if (dVar != null) {
            obj = dVar.f46684c;
        }
        return obj;
    }

    /* renamed from: h */
    public final <T> T mo50695h(String str, boolean z) {
        C21100e.m49355o();
        if (z) {
            mo50689b(str);
        }
        Future<?> e = mo50692e(str);
        if (e != null) {
            try {
                e.get();
            } catch (InterruptedException | CancellationException | ExecutionException unused) {
                return null;
            }
        }
        return mo50690c(str);
    }

    public final boolean handleMessage(Message message) {
        Object obj = message.obj;
        if (obj instanceof C20944i0) {
            C20944i0 i0Var = (C20944i0) obj;
            F f = i0Var.f52692a;
            if (f instanceof String) {
                String str = (String) f;
                C18303d dVar = (C18303d) i0Var.f52693b;
                synchronized (this) {
                    LinkedList linkedList = (LinkedList) this.f46673l.remove(str);
                    if (linkedList != null) {
                        Iterator it = linkedList.iterator();
                        while (it.hasNext()) {
                            C18304b bVar = (C18304b) it.next();
                            Object obj2 = dVar.f46683b;
                            if (obj2 != null) {
                                bVar.mo44554g(obj2, str);
                            } else {
                                bVar.mo44553d(dVar.f46684c, str);
                            }
                        }
                    }
                    Iterator it2 = this.f46672k.iterator();
                    while (it2.hasNext()) {
                        C18304b bVar2 = (C18304b) it2.next();
                        Object obj3 = dVar.f46683b;
                        if (obj3 != null) {
                            bVar2.mo44554g(obj3, str);
                        } else {
                            bVar2.mo44553d(dVar.f46684c, str);
                        }
                    }
                }
                return true;
            }
            StringBuilder k = C13555b.m33972k("Unrecognized message object: ");
            k.append(message.obj);
            throw new ApplicationBugException(k.toString());
        }
        StringBuilder k2 = C13555b.m33972k("Unrecognized message object: ");
        k2.append(message.obj);
        throw new ApplicationBugException(k2.toString());
    }

    /* renamed from: i */
    public final synchronized void mo50697i(String str, C18300a aVar) {
        mo50698j(str, aVar, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0029, code lost:
        return;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo50698j(java.lang.String r8, p646lz.C18304b r9, boolean r10) {
        /*
            r7 = this;
            monitor-enter(r7)
            if (r10 == 0) goto L_0x0006
            r7.mo50689b(r8)     // Catch:{ all -> 0x0036 }
        L_0x0006:
            s0.b r10 = r7.f46670i     // Catch:{ all -> 0x0036 }
            r0 = 0
            java.lang.Object r10 = r10.getOrDefault(r8, r0)     // Catch:{ all -> 0x0036 }
            r4 = r10
            lz.a$d r4 = (p646lz.C18299a.C18303d) r4     // Catch:{ all -> 0x0036 }
            if (r4 == 0) goto L_0x002a
            if (r9 == 0) goto L_0x0028
            com.moovit.commons.utils.collections.CollectionHashMap$LinkedListHashMap<java.lang.String, lz.b> r10 = r7.f46673l     // Catch:{ all -> 0x0036 }
            r10.mo47001a(r8, r9)     // Catch:{ all -> 0x0036 }
            android.os.Handler r10 = r7.f46666e     // Catch:{ all -> 0x0036 }
            gb.t r6 = new gb.t     // Catch:{ all -> 0x0036 }
            r5 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x0036 }
            r10.post(r6)     // Catch:{ all -> 0x0036 }
        L_0x0028:
            monitor-exit(r7)
            return
        L_0x002a:
            if (r9 == 0) goto L_0x0031
            com.moovit.commons.utils.collections.CollectionHashMap$LinkedListHashMap<java.lang.String, lz.b> r10 = r7.f46673l     // Catch:{ all -> 0x0036 }
            r10.mo47001a(r8, r9)     // Catch:{ all -> 0x0036 }
        L_0x0031:
            r7.mo50692e(r8)     // Catch:{ all -> 0x0036 }
            monitor-exit(r7)
            return
        L_0x0036:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p646lz.C18299a.mo50698j(java.lang.String, lz.b, boolean):void");
    }

    /* renamed from: k */
    public final <T> Task<T> mo50699k(String str) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        mo50697i(str, new C18300a(taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* renamed from: l */
    public final <T> T mo50700l(String str) throws AppDataPartLoadFailedException {
        T h = mo50695h(str, false);
        if (h != null) {
            return h;
        }
        throw new AppDataPartLoadFailedException(mo50694g(str), (String) null, (Throwable) null);
    }

    /* renamed from: m */
    public final synchronized void mo50701m(String str, C18303d dVar) {
        Objects.toString(dVar);
        this.f46670i.put(str, dVar);
        Future future = (Future) this.f46671j.remove(str);
        this.f46668g.get(str).open();
        this.f46666e.sendMessage(Message.obtain(this.f46666e, 0, new C20944i0(str, dVar)));
    }

    /* renamed from: n */
    public final boolean mo50702n(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        C21100e.m49355o();
        try {
            this.f46674m.writeLock().lock();
            C18299a aVar = new C18299a(this);
            HashSet d = aVar.mo50691d(str);
            ArrayList arrayList = aVar.f46675n;
            if (arrayList != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                for (String str2 : C13723g.m34282c(arrayList, new C17911c(d, 1))) {
                    C18303d dVar = null;
                    C18305c cVar = (C18305c) aVar.f46667f.getOrDefault(str2, null);
                    if (cVar != null) {
                        HashSet b = cVar.mo20294b(this.f46665d);
                        HashSet hashSet = new HashSet(b);
                        hashSet.retainAll(d);
                        Iterator it = hashSet.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (aVar.mo50690c((String) it.next()) == null) {
                                    z2 = false;
                                    break;
                                }
                            } else {
                                z2 = true;
                                break;
                            }
                        }
                        if (z2) {
                            HashSet hashSet2 = new HashSet(b);
                            hashSet2.removeAll(d);
                            Iterator it2 = hashSet2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (aVar.mo50695h((String) it2.next(), false) == null) {
                                        z3 = false;
                                        break;
                                    }
                                } else {
                                    z3 = true;
                                    break;
                                }
                            }
                            if (z3) {
                                synchronized (cVar) {
                                    Context context = this.f46665d;
                                    Object a = cVar.mo46174a(context, context.getResources().getConfiguration(), aVar);
                                    Object h = cVar.mo50712h(this.f46665d, aVar);
                                    if (h != null) {
                                        dVar = new C18303d(a, h, (Object) null);
                                    }
                                }
                                if (dVar != null) {
                                    aVar.mo50701m(str2, dVar);
                                }
                            }
                        }
                    }
                }
                this.f46674m.writeLock().unlock();
                return true;
            }
            throw new IllegalStateException("The app data manger seal() has never been called");
        } catch (AppDataPartLoadFailedException | ServerException | IOException unused) {
            this.f46674m.writeLock().unlock();
            return false;
        } catch (Throwable th) {
            this.f46674m.writeLock().unlock();
            throw th;
        }
    }

    /* renamed from: o */
    public final synchronized void mo50703o(String str, C18305c<?> cVar) {
        boolean z;
        if (!this.f46667f.containsKey(str)) {
            if (this.f46675n != null) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f46667f.put(str, cVar);
                this.f46668g.put(str, new ConditionVariable(false));
            } else {
                throw new IllegalStateException("The app data manger already been sealed");
            }
        } else {
            throw new IllegalArgumentException("A loader for " + str + " is already registered");
        }
    }

    /* renamed from: p */
    public final synchronized void mo50704p() {
        ArrayList q = mo50705q();
        this.f46675n = q;
        if (this.f46667f.f19969d != q.size()) {
            throw new ApplicationBugException("Loaders topological sort does not contains all registered loaders. Perhaps there is a circular part dependency?");
        }
    }

    /* renamed from: q */
    public final ArrayList mo50705q() {
        ArrayList arrayList = new ArrayList(this.f46667f.f19969d);
        HashSet hashSet = new HashSet(this.f46667f.f19969d);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((C6307g.C6309b) this.f46667f.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            if (((C18305c) entry.getValue()).mo20294b(this.f46665d).isEmpty()) {
                arrayList2.add(str);
            }
        }
        while (!arrayList2.isEmpty()) {
            arrayList.addAll(arrayList2);
            hashSet.addAll(arrayList2);
            arrayList2.clear();
            Iterator it2 = ((C6307g.C6309b) this.f46667f.entrySet()).iterator();
            while (it2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) it2.next();
                String str2 = (String) entry2.getKey();
                if (hashSet.containsAll(((C18305c) entry2.getValue()).mo20294b(this.f46665d)) && !hashSet.contains(str2)) {
                    arrayList2.add(str2);
                }
            }
        }
        return arrayList;
    }

    public C18299a(C18299a aVar) {
        Handler handler;
        UUID randomUUID = UUID.randomUUID();
        this.f46663b = randomUUID;
        StringBuilder k = C13555b.m33972k("AppDataManager[");
        k.append(randomUUID.toString());
        k.append(']');
        this.f46664c = k.toString();
        this.f46665d = aVar.f46665d;
        if (Looper.myLooper() != null) {
            handler = new Handler(this);
        } else {
            handler = new Handler(Looper.getMainLooper(), this);
        }
        this.f46666e = handler;
        Iterator it = ((C6307g.C6309b) aVar.f46667f.entrySet()).iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            mo50703o((String) entry.getKey(), (C18305c) entry.getValue());
        }
        mo50704p();
    }
}
