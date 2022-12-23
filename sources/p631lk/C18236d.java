package p631lk;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* renamed from: lk.d */
public final class C18236d {

    /* renamed from: a */
    public final C18233a f46522a;

    /* renamed from: b */
    public final List<C18233a> f46523b;

    public C18236d(C18233a aVar, ArrayList arrayList) {
        this.f46522a = aVar;
        this.f46523b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18236d.class != obj.getClass()) {
            return false;
        }
        C18236d dVar = (C18236d) obj;
        if (!Objects.equals(this.f46522a, dVar.f46522a) || !this.f46523b.equals(dVar.f46523b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f46522a, this.f46523b});
    }
}
