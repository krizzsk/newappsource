package tf0;

import java.lang.ref.WeakReference;

/* renamed from: tf0.l */
public final class C24981l {

    /* renamed from: a */
    public final WeakReference<ClassLoader> f63118a;

    /* renamed from: b */
    public final int f63119b;

    public C24981l(ClassLoader classLoader) {
        this.f63118a = new WeakReference<>(classLoader);
        this.f63119b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C24981l) && this.f63118a.get() == ((C24981l) obj).f63118a.get();
    }

    public final int hashCode() {
        return this.f63119b;
    }

    public final String toString() {
        ClassLoader classLoader = this.f63118a.get();
        return classLoader == null ? "<null>" : classLoader.toString();
    }
}
