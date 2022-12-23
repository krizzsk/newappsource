package p705on;

import java.util.Map;
import java.util.Objects;
import mf0.C24361g;

/* renamed from: on.b */
public final class C18794b {

    /* renamed from: a */
    public final C18795c f47840a;

    /* renamed from: b */
    public final String f47841b;

    /* renamed from: c */
    public final String f47842c;

    /* renamed from: d */
    public final Map<String, String> f47843d;

    public C18794b(C18795c cVar, String str, String str2, Map<String, String> map) {
        this.f47840a = cVar;
        this.f47841b = str;
        this.f47842c = str2;
        this.f47843d = C24361g.m61133C(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18794b.class != obj.getClass()) {
            return false;
        }
        C18794b bVar = (C18794b) obj;
        if (!this.f47840a.equals(bVar.f47840a) || !this.f47841b.equals(bVar.f47841b) || !this.f47842c.equals(bVar.f47842c) || !this.f47843d.equals(bVar.f47843d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.f47840a, this.f47841b, this.f47842c, this.f47843d});
    }
}
