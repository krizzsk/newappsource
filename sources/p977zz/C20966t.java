package p977zz;

import com.moovit.commons.utils.ApplicationBugException;

/* renamed from: zz.t */
public final class C20966t<T> extends ThreadLocal<T> {

    /* renamed from: a */
    public final Class<? extends T> f52722a;

    public C20966t(Class<? extends T> cls) {
        this.f52722a = cls;
    }

    public final T initialValue() {
        try {
            return this.f52722a.newInstance();
        } catch (InstantiationException e) {
            throw new ApplicationBugException((Exception) e);
        } catch (IllegalAccessException e2) {
            throw new ApplicationBugException((Exception) e2);
        }
    }
}
