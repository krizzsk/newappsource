package p654mk;

import java.util.Objects;
import p819tk.C19686c;

/* renamed from: mk.h */
public final class C18386h extends C19686c {

    /* renamed from: b */
    public String f46864b;

    /* renamed from: c */
    public Integer f46865c;

    /* renamed from: d */
    public String f46866d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18386h.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        C18386h hVar = (C18386h) obj;
        if (!Objects.equals(this.f46864b, hVar.f46864b) || !Objects.equals(this.f46865c, hVar.f46865c) || !Objects.equals(this.f46866d, hVar.f46866d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f46864b, this.f46865c, this.f46866d});
    }
}
