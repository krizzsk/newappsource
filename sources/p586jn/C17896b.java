package p586jn;

import com.masabi.justride.sdk.models.account.EntitlementStatus;
import java.util.Date;
import java.util.Objects;

/* renamed from: jn.b */
public final class C17896b {

    /* renamed from: a */
    public final Integer f45917a;

    /* renamed from: b */
    public final String f45918b;

    /* renamed from: c */
    public final Date f45919c;

    /* renamed from: d */
    public final Date f45920d;

    /* renamed from: e */
    public final boolean f45921e;

    /* renamed from: f */
    public final String f45922f;

    /* renamed from: g */
    public final Integer f45923g;

    /* renamed from: h */
    public final String f45924h;

    /* renamed from: i */
    public final EntitlementStatus f45925i;

    /* renamed from: j */
    public final String f45926j;

    public C17896b(Integer num, String str, Date date, Date date2, boolean z, String str2, Integer num2, String str3, EntitlementStatus entitlementStatus, String str4) {
        this.f45917a = num;
        this.f45918b = str;
        this.f45919c = date;
        this.f45920d = date2;
        this.f45921e = z;
        this.f45922f = str2;
        this.f45923g = num2;
        this.f45924h = str3;
        this.f45925i = entitlementStatus;
        this.f45926j = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C17896b.class != obj.getClass()) {
            return false;
        }
        C17896b bVar = (C17896b) obj;
        if (this.f45921e != bVar.f45921e || !this.f45917a.equals(bVar.f45917a) || !Objects.equals(this.f45918b, bVar.f45918b) || !Objects.equals(this.f45919c, bVar.f45919c) || !Objects.equals(this.f45920d, bVar.f45920d) || !this.f45922f.equals(bVar.f45922f) || !Objects.equals(this.f45923g, bVar.f45923g) || !Objects.equals(this.f45924h, bVar.f45924h) || this.f45925i != bVar.f45925i || !Objects.equals(this.f45926j, bVar.f45926j)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f45917a, this.f45918b, this.f45919c, this.f45920d, Boolean.valueOf(this.f45921e), this.f45922f, this.f45923g, this.f45924h, this.f45925i, this.f45926j});
    }
}
