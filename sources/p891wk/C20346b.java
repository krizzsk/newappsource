package p891wk;

import java.util.Objects;

/* renamed from: wk.b */
public final class C20346b {

    /* renamed from: a */
    public Integer f51516a;

    /* renamed from: b */
    public String f51517b;

    /* renamed from: c */
    public String f51518c;

    /* renamed from: d */
    public String f51519d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20346b.class != obj.getClass()) {
            return false;
        }
        C20346b bVar = (C20346b) obj;
        if (!Objects.equals(this.f51516a, bVar.f51516a) || !Objects.equals(this.f51517b, bVar.f51517b) || !Objects.equals(this.f51518c, bVar.f51518c) || !Objects.equals(this.f51519d, bVar.f51519d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f51516a, this.f51517b, this.f51518c, this.f51519d});
    }
}
