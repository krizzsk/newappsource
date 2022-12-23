package p669mz;

import androidx.lifecycle.C1033p;
import androidx.lifecycle.C1043v;
import androidx.lifecycle.C1044w;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: mz.f */
public final class C18490f<T> extends C1043v<T> {

    /* renamed from: a */
    public final AtomicBoolean f47095a = new AtomicBoolean(false);

    public final void observe(C1033p pVar, C1044w<? super T> wVar) {
        hasActiveObservers();
        super.observe(pVar, new C18489e(0, this, wVar));
    }

    public final void setValue(T t) {
        this.f47095a.set(true);
        super.setValue(t);
    }
}
