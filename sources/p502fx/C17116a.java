package p502fx;

import mf0.C24362h;
import p001a0.C0017h;

/* renamed from: fx.a */
public final class C17116a {

    /* renamed from: a */
    public final String f44296a;

    /* renamed from: b */
    public final String f44297b;

    public C17116a(String str, String str2) {
        this.f44296a = str;
        this.f44297b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17116a)) {
            return false;
        }
        C17116a aVar = (C17116a) obj;
        return C24362h.m61206a(this.f44296a, aVar.f44296a) && C24362h.m61206a(this.f44297b, aVar.f44297b);
    }

    public final int hashCode() {
        String str = this.f44296a;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f44297b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodCancelFeeScreenInfo(title=");
        k.append(this.f44296a);
        k.append(", message=");
        return C0017h.m57N(k, this.f44297b, ')');
    }
}
