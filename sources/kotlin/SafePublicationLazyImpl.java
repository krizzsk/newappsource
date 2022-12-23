package kotlin;

import bf0.C21049c;
import ce0.C21100e;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import lf0.C24225a;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0002R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00078\b@\bX\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, mo59060d2 = {"Lkotlin/SafePublicationLazyImpl;", "T", "Lbf0/c;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "Lkotlin/Function0;", "initializer", "Llf0/a;", "_value", "Ljava/lang/Object;", "final", "kotlin-stdlib"}, mo59061k = 1, mo59062mv = {1, 7, 1})
final class SafePublicationLazyImpl<T> implements C21049c<T>, Serializable {

    /* renamed from: b */
    public static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> f60171b = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "_value");
    private volatile Object _value;

    /* renamed from: final  reason: not valid java name */
    private final Object f65082final;
    private volatile C24225a<? extends T> initializer;

    public SafePublicationLazyImpl(C24225a<? extends T> aVar) {
        C24362h.m61211f(aVar, "initializer");
        this.initializer = aVar;
        C21100e eVar = C21100e.f52941b;
        this._value = eVar;
        this.f65082final = eVar;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    public final T getValue() {
        boolean z;
        T t = this._value;
        T t2 = C21100e.f52941b;
        if (t != t2) {
            return t;
        }
        C24225a<? extends T> aVar = this.initializer;
        if (aVar != null) {
            T invoke = aVar.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f60171b;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, t2, invoke)) {
                    if (atomicReferenceFieldUpdater.get(this) != t2) {
                        z = false;
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                this.initializer = null;
                return invoke;
            }
        }
        return this._value;
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
