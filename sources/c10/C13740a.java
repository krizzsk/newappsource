package c10;

import android.net.Uri;
import ce0.C21100e;
import java.util.Collections;
import java.util.Map;
import p583jk.C17884p;

/* renamed from: c10.a */
public final class C13740a {

    /* renamed from: a */
    public final boolean f33813a;

    /* renamed from: b */
    public final Uri f33814b;

    /* renamed from: c */
    public final Map<String, String> f33815c;

    public C13740a(boolean z, Uri uri, Map<String, String> map) {
        this.f33813a = z;
        this.f33814b = uri;
        C21100e.m49373x(map, "params");
        this.f33815c = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13740a)) {
            return false;
        }
        C13740a aVar = (C13740a) obj;
        if (this.f33813a != aVar.f33813a || !this.f33814b.equals(aVar.f33814b) || !this.f33815c.equals(aVar.f33815c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f33813a;
        return C17884p.m44333D(z ? 1 : 0, C17884p.m44335F(this.f33814b), C17884p.m44335F(this.f33815c));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("DynamicLink{isDeferred=");
        k.append(this.f33813a);
        k.append(", uri=");
        k.append(this.f33814b);
        k.append(", params=");
        k.append(this.f33815c);
        k.append('}');
        return k.toString();
    }
}
