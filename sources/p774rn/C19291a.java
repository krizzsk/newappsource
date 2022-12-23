package p774rn;

import java.util.Objects;
import p752qn.C19143a;

/* renamed from: rn.a */
public final class C19291a {

    /* renamed from: a */
    public final String f49044a;

    /* renamed from: b */
    public final C19143a f49045b;

    /* renamed from: c */
    public final C19293c f49046c;

    public C19291a(String str, C19143a aVar, C19293c cVar) {
        this.f49044a = str;
        this.f49045b = aVar;
        this.f49046c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19291a.class != obj.getClass()) {
            return false;
        }
        C19291a aVar = (C19291a) obj;
        if (!Objects.equals(this.f49044a, aVar.f49044a) || !Objects.equals(this.f49045b, aVar.f49045b) || !Objects.equals(this.f49046c, aVar.f49046c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f49044a, this.f49045b, this.f49046c});
    }
}
