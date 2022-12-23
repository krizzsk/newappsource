package kotlin;

import bf0.C21049c;
import ce0.C21100e;
import java.io.Serializable;
import lf0.C24225a;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0002R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00078\b@\bX\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, mo59060d2 = {"Lkotlin/SynchronizedLazyImpl;", "T", "Lbf0/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "Lkotlin/Function0;", "initializer", "Llf0/a;", "_value", "Ljava/lang/Object;", "lock", "kotlin-stdlib"}, mo59061k = 1, mo59062mv = {1, 7, 1})
final class SynchronizedLazyImpl<T> implements C21049c<T>, Serializable {
    private volatile Object _value = C21100e.f52941b;
    private C24225a<? extends T> initializer;
    private final Object lock = this;

    public SynchronizedLazyImpl(C24225a aVar) {
        C24362h.m61211f(aVar, "initializer");
        this.initializer = aVar;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    public final T getValue() {
        T t;
        T t2 = this._value;
        T t3 = C21100e.f52941b;
        if (t2 != t3) {
            return t2;
        }
        synchronized (this.lock) {
            t = this._value;
            if (t == t3) {
                C24225a aVar = this.initializer;
                C24362h.m61208c(aVar);
                t = aVar.invoke();
                this._value = t;
                this.initializer = null;
            }
        }
        return t;
    }

    public final String toString() {
        boolean z;
        if (this._value != C21100e.f52941b) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
