package bi0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p584jl.C17886b;

/* renamed from: bi0.b */
public abstract class C21063b<T> extends C21074l {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f52868a = AtomicReferenceFieldUpdater.newUpdater(C21063b.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = C17886b.f45889c;

    /* renamed from: a */
    public final Object mo53189a(Object obj) {
        boolean z;
        Object obj2 = this._consensus;
        C21079q qVar = C17886b.f45889c;
        if (obj2 == qVar) {
            C21079q c = mo53191c(obj);
            obj2 = this._consensus;
            if (obj2 == qVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f52868a;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, qVar, c)) {
                        if (atomicReferenceFieldUpdater.get(this) != qVar) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    obj2 = c;
                } else {
                    obj2 = this._consensus;
                }
            }
        }
        mo53190b(obj, obj2);
        return obj2;
    }

    /* renamed from: b */
    public abstract void mo53190b(T t, Object obj);

    /* renamed from: c */
    public abstract C21079q mo53191c(Object obj);
}
