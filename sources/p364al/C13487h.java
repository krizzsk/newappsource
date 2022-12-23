package p364al;

import java.util.Objects;
import p725pj.C18926a;

/* renamed from: al.h */
public final class C13487h<S> {

    /* renamed from: a */
    public final S f33365a;

    /* renamed from: b */
    public final C18926a f33366b;

    public C13487h(S s, C18926a aVar) {
        this.f33365a = s;
        this.f33366b = aVar;
    }

    /* renamed from: a */
    public final boolean mo40399a() {
        return this.f33366b != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C13487h.class != obj.getClass()) {
            return false;
        }
        C13487h hVar = (C13487h) obj;
        if (!Objects.equals(this.f33365a, hVar.f33365a) || !Objects.equals(this.f33366b, hVar.f33366b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f33365a, this.f33366b});
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("JobResult{success=");
        k.append(this.f33365a);
        k.append(", failure=");
        k.append(this.f33366b);
        k.append('}');
        return k.toString();
    }
}
