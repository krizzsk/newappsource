package p586jn;

import java.util.Objects;
import p654mk.C18384f;

/* renamed from: jn.a */
public final class C17895a {

    /* renamed from: a */
    public final String f45914a;

    /* renamed from: b */
    public final Integer f45915b;

    /* renamed from: c */
    public final Integer f45916c;

    public C17895a(C18384f fVar) {
        int i;
        this.f45914a = fVar.f46858a;
        Integer num = fVar.f46859b;
        int i2 = 0;
        if (num == null) {
            i = 0;
        } else {
            i = num.intValue();
        }
        this.f45915b = Integer.valueOf(i);
        Integer num2 = fVar.f46861d;
        this.f45916c = Integer.valueOf(num2 != null ? num2.intValue() : i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17895a.class != obj.getClass()) {
            return false;
        }
        C17895a aVar = (C17895a) obj;
        if (!Objects.equals(this.f45914a, aVar.f45914a) || !Objects.equals(this.f45915b, aVar.f45915b) || !Objects.equals(this.f45916c, aVar.f45916c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f45914a, this.f45915b, this.f45916c});
    }
}
