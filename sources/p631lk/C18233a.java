package p631lk;

import java.util.Objects;

/* renamed from: lk.a */
public final class C18233a {

    /* renamed from: a */
    public final String f46511a;

    /* renamed from: b */
    public final String f46512b;

    /* renamed from: c */
    public final String f46513c;

    /* renamed from: d */
    public final String f46514d;

    /* renamed from: e */
    public final boolean f46515e;

    public C18233a(boolean z, String str, String str2, String str3, String str4) {
        this.f46511a = str;
        this.f46512b = str2;
        this.f46513c = str3;
        this.f46514d = str4;
        this.f46515e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18233a.class != obj.getClass()) {
            return false;
        }
        C18233a aVar = (C18233a) obj;
        if (this.f46515e != aVar.f46515e || !this.f46511a.equals(aVar.f46511a) || !this.f46512b.equals(aVar.f46512b) || !this.f46513c.equals(aVar.f46513c) || !Objects.equals(this.f46514d, aVar.f46514d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f46511a, this.f46512b, this.f46513c, this.f46514d, Boolean.valueOf(this.f46515e)});
    }
}
