package p752qn;

import java.util.Date;
import java.util.Objects;
import p657mn.C18406b;

/* renamed from: qn.a */
public final class C19143a {

    /* renamed from: a */
    public final Integer f48670a;

    /* renamed from: b */
    public final Integer f48671b;

    /* renamed from: c */
    public final Integer f48672c;

    /* renamed from: d */
    public final Date f48673d;

    /* renamed from: e */
    public final Date f48674e;

    /* renamed from: f */
    public final Date f48675f;

    /* renamed from: g */
    public final C18406b f48676g;

    /* renamed from: h */
    public final boolean f48677h;

    public C19143a(Integer num, Integer num2, Integer num3, Date date, Date date2, Date date3, C18406b bVar, boolean z) {
        this.f48670a = num;
        this.f48671b = num2;
        this.f48672c = num3;
        this.f48673d = date;
        this.f48674e = date2;
        this.f48675f = date3;
        this.f48676g = bVar;
        this.f48677h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C19143a.class != obj.getClass()) {
            return false;
        }
        C19143a aVar = (C19143a) obj;
        if (this.f48677h != aVar.f48677h || !this.f48670a.equals(aVar.f48670a) || !Objects.equals(this.f48671b, aVar.f48671b) || !this.f48672c.equals(aVar.f48672c) || !Objects.equals(this.f48673d, aVar.f48673d) || !Objects.equals(this.f48674e, aVar.f48674e) || !Objects.equals(this.f48675f, aVar.f48675f) || !Objects.equals(this.f48676g, aVar.f48676g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f48670a, this.f48671b, this.f48672c, this.f48673d, this.f48674e, this.f48675f, this.f48676g, Boolean.valueOf(this.f48677h)});
    }
}
