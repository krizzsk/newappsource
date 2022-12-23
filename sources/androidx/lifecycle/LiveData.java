package androidx.lifecycle;

import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import java.util.Iterator;
import java.util.Map;
import p201p.C6019a;
import p214q.C6120b;
import p358af.C13437d;

public abstract class LiveData<T> {
    public static final Object NOT_SET = new Object();
    public int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    public final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private C6120b<C1044w<? super T>, LiveData<T>.C13715c> mObservers;
    public volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    public class LifecycleBoundObserver extends LiveData<T>.C13715c implements C1025n {

        /* renamed from: f */
        public final C1033p f3884f;

        public LifecycleBoundObserver(C1033p pVar, C1044w<? super T> wVar) {
            super(wVar);
            this.f3884f = pVar;
        }

        /* renamed from: c */
        public final void mo4253c() {
            this.f3884f.getLifecycle().mo4226c(this);
        }

        /* renamed from: d */
        public final boolean mo4254d(C1033p pVar) {
            return this.f3884f == pVar;
        }

        /* renamed from: f */
        public final void mo740f(C1033p pVar, Lifecycle.Event event) {
            Lifecycle.State b = this.f3884f.getLifecycle().mo4225b();
            if (b == Lifecycle.State.DESTROYED) {
                LiveData.this.removeObserver(this.f3887b);
                return;
            }
            Lifecycle.State state = null;
            while (state != b) {
                mo4257a(mo4255g());
                state = b;
                b = this.f3884f.getLifecycle().mo4225b();
            }
        }

        /* renamed from: g */
        public final boolean mo4255g() {
            return this.f3884f.getLifecycle().mo4225b().isAtLeast(Lifecycle.State.STARTED);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    public class C0982a implements Runnable {
        public C0982a() {
        }

        public final void run() {
            Object obj;
            synchronized (LiveData.this.mDataLock) {
                obj = LiveData.this.mPendingData;
                LiveData.this.mPendingData = LiveData.NOT_SET;
            }
            LiveData.this.setValue(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    public class C0983b extends LiveData<T>.C13715c {
        public C0983b(LiveData liveData, C1044w<? super T> wVar) {
            super(wVar);
        }

        /* renamed from: g */
        public final boolean mo4255g() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$c */
    public abstract class C0984c {

        /* renamed from: b */
        public final C1044w<? super T> f3887b;

        /* renamed from: c */
        public boolean f3888c;

        /* renamed from: d */
        public int f3889d = -1;

        public C0984c(C1044w<? super T> wVar) {
            this.f3887b = wVar;
        }

        /* renamed from: a */
        public final void mo4257a(boolean z) {
            int i;
            if (z != this.f3888c) {
                this.f3888c = z;
                LiveData liveData = LiveData.this;
                if (z) {
                    i = 1;
                } else {
                    i = -1;
                }
                liveData.changeActiveCounter(i);
                if (this.f3888c) {
                    LiveData.this.dispatchingValue(this);
                }
            }
        }

        /* renamed from: c */
        public void mo4253c() {
        }

        /* renamed from: d */
        public boolean mo4254d(C1033p pVar) {
            return false;
        }

        /* renamed from: g */
        public abstract boolean mo4255g();
    }

    public LiveData(T t) {
        this.mDataLock = new Object();
        this.mObservers = new C6120b<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new C0982a();
        this.mData = t;
        this.mVersion = 0;
    }

    public static void assertMainThread(String str) {
        boolean z;
        C6019a.m14512w().f19241b.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalStateException(C13437d.m33706k("Cannot invoke ", str, " on a background thread"));
        }
    }

    private void considerNotify(LiveData<T>.C13715c cVar) {
        if (cVar.f3888c) {
            if (!cVar.mo4255g()) {
                cVar.mo4257a(false);
                return;
            }
            int i = cVar.f3889d;
            int i2 = this.mVersion;
            if (i < i2) {
                cVar.f3889d = i2;
                cVar.f3887b.onChanged(this.mData);
            }
        }
    }

    public void changeActiveCounter(int i) {
        boolean z;
        boolean z2;
        int i2 = this.mActiveCount;
        this.mActiveCount = i + i2;
        if (!this.mChangingActiveState) {
            this.mChangingActiveState = true;
            while (true) {
                try {
                    int i3 = this.mActiveCount;
                    if (i2 != i3) {
                        if (i2 != 0 || i3 <= 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (i2 <= 0 || i3 != 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z) {
                            onActive();
                        } else if (z2) {
                            onInactive();
                        }
                        i2 = i3;
                    } else {
                        return;
                    }
                } finally {
                    this.mChangingActiveState = false;
                }
            }
        }
    }

    public void dispatchingValue(LiveData<T>.C13715c cVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (cVar == null) {
                C6120b<C1044w<? super T>, LiveData<T>.C13715c> bVar = this.mObservers;
                bVar.getClass();
                C6120b.C6124d dVar = new C6120b.C6124d();
                bVar.f19474d.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    considerNotify((C0984c) ((Map.Entry) dVar.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            } else {
                considerNotify(cVar);
                cVar = null;
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public T getValue() {
        T t = this.mData;
        if (t != NOT_SET) {
            return t;
        }
        return null;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        return this.mActiveCount > 0;
    }

    public void observe(C1033p pVar, C1044w<? super T> wVar) {
        assertMainThread("observe");
        if (pVar.getLifecycle().mo4225b() != Lifecycle.State.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(pVar, wVar);
            C0984c b = this.mObservers.mo22080b(wVar, lifecycleBoundObserver);
            if (b != null && !b.mo4254d(pVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (b == null) {
                pVar.getLifecycle().mo4224a(lifecycleBoundObserver);
            }
        }
    }

    public void observeForever(C1044w<? super T> wVar) {
        assertMainThread("observeForever");
        C0983b bVar = new C0983b(this, wVar);
        C0984c b = this.mObservers.mo22080b(wVar, bVar);
        if (b instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (b == null) {
            bVar.mo4257a(true);
        }
    }

    public void onActive() {
    }

    public void onInactive() {
    }

    public void postValue(T t) {
        boolean z;
        synchronized (this.mDataLock) {
            if (this.mPendingData == NOT_SET) {
                z = true;
            } else {
                z = false;
            }
            this.mPendingData = t;
        }
        if (z) {
            C6019a.m14512w().mo22018x(this.mPostValueRunnable);
        }
    }

    public void removeObserver(C1044w<? super T> wVar) {
        assertMainThread("removeObserver");
        C0984c d = this.mObservers.mo22081d(wVar);
        if (d != null) {
            d.mo4253c();
            d.mo4257a(false);
        }
    }

    public void removeObservers(C1033p pVar) {
        assertMainThread("removeObservers");
        Iterator<Map.Entry<C1044w<? super T>, LiveData<T>.C13715c>> it = this.mObservers.iterator();
        while (true) {
            C6120b.C6125e eVar = (C6120b.C6125e) it;
            if (eVar.hasNext()) {
                Map.Entry entry = (Map.Entry) eVar.next();
                if (((C0984c) entry.getValue()).mo4254d(pVar)) {
                    removeObserver((C1044w) entry.getKey());
                }
            } else {
                return;
            }
        }
    }

    public void setValue(T t) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t;
        dispatchingValue((LiveData<T>.C13715c) null);
    }

    public LiveData() {
        this.mDataLock = new Object();
        this.mObservers = new C6120b<>();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new C0982a();
        this.mData = obj;
        this.mVersion = -1;
    }
}
