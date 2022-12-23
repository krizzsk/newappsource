package com.vungle.warren.downloader;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import p229r1.C6233c;
import p988j$.util.concurrent.ConcurrentHashMap;

@Keep
class DownloadRequestMediator {
    private Map<String, C6233c<C23127h, C23112a>> children = new ConcurrentHashMap(1);
    private AtomicBoolean connectedAtomic = new AtomicBoolean(true);
    public final String filePath;
    public final boolean isCacheable;
    public final String key;
    private final ReentrantLock lock = new ReentrantLock();
    public final String metaPath;
    public final C23125f priority;
    private AtomicReference<Runnable> runnable = new AtomicReference<>();
    private AtomicInteger statusAtomic = new AtomicInteger(0);
    public final String url;

    public DownloadRequestMediator(C23127h hVar, C23112a aVar, String str, String str2, boolean z, String str3) {
        this.url = hVar.f58714b;
        this.filePath = str;
        this.metaPath = str2;
        this.isCacheable = z;
        this.key = str3;
        this.priority = hVar.f58717e.get();
        this.children.put(hVar.f58718f, new C6233c(hVar, aVar));
    }

    public synchronized void add(C23127h hVar, C23112a aVar) {
        this.children.put(hVar.f58718f, new C6233c(hVar, aVar));
    }

    public C23125f getPriority() {
        C23125f fVar;
        C23125f fVar2 = new C23125f(Integer.MAX_VALUE, Integer.MAX_VALUE);
        for (C6233c<C23127h, C23112a> cVar : values()) {
            F f = cVar.f19679a;
            if (!(f == null || (fVar = ((C23127h) f).f58717e.get()) == null || fVar2.compareTo(fVar) < 0)) {
                fVar2 = fVar;
            }
        }
        return fVar2;
    }

    public Runnable getRunnable() {
        return this.runnable.get();
    }

    @Status
    public int getStatus() {
        return this.statusAtomic.get();
    }

    /* renamed from: is */
    public boolean mo58135is(@Status int i) {
        return this.statusAtomic.get() == i;
    }

    public boolean isConnected() {
        return this.connectedAtomic.get();
    }

    public boolean isPausable() {
        for (C6233c<C23127h, C23112a> cVar : values()) {
            F f = cVar.f19679a;
            if (f != null && ((C23127h) f).f58716d) {
                return true;
            }
        }
        return false;
    }

    public void lock() {
        this.lock.lock();
    }

    public synchronized C6233c<C23127h, C23112a> remove(C23127h hVar) {
        return this.children.remove(hVar.f58718f);
    }

    public synchronized List<C23127h> requests() {
        ArrayList arrayList;
        List<C6233c<C23127h, C23112a>> values = values();
        arrayList = new ArrayList();
        for (C6233c<C23127h, C23112a> cVar : values) {
            arrayList.add(cVar.f19679a);
        }
        return arrayList;
    }

    public void set(@Status int i) {
        if (this.statusAtomic.get() != 3) {
            this.statusAtomic.set(i);
        }
    }

    public void setConnected(boolean z) {
        this.connectedAtomic.set(z);
    }

    public void setRunnable(Runnable runnable2) {
        this.runnable.set(runnable2);
    }

    public void unlock() {
        this.lock.unlock();
    }

    public synchronized List<C6233c<C23127h, C23112a>> values() {
        return new ArrayList(this.children.values());
    }
}
