package p20;

import c70.C13752e;
import c70.C13753f;
import c70.C13772m;
import p20.C18879f;
import p20.C18880g;

/* renamed from: p20.e */
public abstract class C18878e<T extends C18880g, RS extends C18879f<RS, T>> {
    /* renamed from: a */
    public abstract C13753f<C13772m<RS>> mo51344a(C13752e eVar);

    /* renamed from: b */
    public abstract String mo51345b();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C18878e)) {
            return false;
        }
        return mo51345b().equals(((C18878e) obj).mo51345b());
    }

    public final int hashCode() {
        return mo51345b().hashCode();
    }
}
