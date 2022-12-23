package p867vk;

import java.util.Objects;

/* renamed from: vk.f */
public final class C20149f {

    /* renamed from: a */
    public final C20146c f51141a;

    public C20149f(C20146c cVar) {
        this.f51141a = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20149f.class != obj.getClass()) {
            return false;
        }
        return this.f51141a.equals(((C20149f) obj).f51141a);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f51141a});
    }
}
