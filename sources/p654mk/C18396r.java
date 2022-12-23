package p654mk;

import java.util.Objects;
import p819tk.C19686c;

/* renamed from: mk.r */
public final class C18396r extends C19686c {

    /* renamed from: b */
    public final Integer f46897b;

    /* renamed from: c */
    public final Boolean f46898c;

    /* renamed from: d */
    public final String f46899d;

    public C18396r(Integer num, Boolean bool, String str) {
        this.f46897b = num;
        this.f46898c = bool;
        this.f46899d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18396r.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C18396r rVar = (C18396r) obj;
        if (!Objects.equals(this.f46897b, rVar.f46897b) || !Objects.equals(this.f46898c, rVar.f46898c) || !Objects.equals(this.f46899d, rVar.f46899d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f46897b, this.f46898c, this.f46899d});
    }
}
