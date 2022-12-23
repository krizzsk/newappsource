package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import p214q.C6120b;

/* renamed from: androidx.lifecycle.t */
public class C1040t<T> extends C1043v<T> {
    private C6120b<LiveData<?>, C1041a<?>> mSources = new C6120b<>();

    /* renamed from: androidx.lifecycle.t$a */
    public static class C1041a<V> implements C1044w<V> {

        /* renamed from: a */
        public final LiveData<V> f3982a;

        /* renamed from: b */
        public final C1044w<? super V> f3983b;

        /* renamed from: c */
        public int f3984c = -1;

        public C1041a(LiveData<V> liveData, C1044w<? super V> wVar) {
            this.f3982a = liveData;
            this.f3983b = wVar;
        }

        public final void onChanged(V v) {
            if (this.f3984c != this.f3982a.getVersion()) {
                this.f3984c = this.f3982a.getVersion();
                this.f3983b.onChanged(v);
            }
        }
    }

    public <S> void addSource(LiveData<S> liveData, C1044w<? super S> wVar) {
        if (liveData != null) {
            C1041a aVar = new C1041a(liveData, wVar);
            C1041a b = this.mSources.mo22080b(liveData, aVar);
            if (b != null && b.f3983b != wVar) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            } else if (b == null && hasActiveObservers()) {
                liveData.observeForever(aVar);
            }
        } else {
            throw new NullPointerException("source cannot be null");
        }
    }

    public void onActive() {
        Iterator<Map.Entry<LiveData<?>, C1041a<?>>> it = this.mSources.iterator();
        while (true) {
            C6120b.C6125e eVar = (C6120b.C6125e) it;
            if (eVar.hasNext()) {
                C1041a aVar = (C1041a) ((Map.Entry) eVar.next()).getValue();
                aVar.f3982a.observeForever(aVar);
            } else {
                return;
            }
        }
    }

    public void onInactive() {
        Iterator<Map.Entry<LiveData<?>, C1041a<?>>> it = this.mSources.iterator();
        while (true) {
            C6120b.C6125e eVar = (C6120b.C6125e) it;
            if (eVar.hasNext()) {
                C1041a aVar = (C1041a) ((Map.Entry) eVar.next()).getValue();
                aVar.f3982a.removeObserver(aVar);
            } else {
                return;
            }
        }
    }

    public <S> void removeSource(LiveData<S> liveData) {
        C1041a d = this.mSources.mo22081d(liveData);
        if (d != null) {
            d.f3982a.removeObserver(d);
        }
    }
}
