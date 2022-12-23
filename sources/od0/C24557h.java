package od0;

import java.util.Arrays;
import java.util.Objects;
import p384bg.C13622c;

/* renamed from: od0.h */
public final class C24557h {
    @C13622c("id")

    /* renamed from: a */
    public String f62240a;
    @C13622c("timestamp_bust_end")

    /* renamed from: b */
    public long f62241b;

    /* renamed from: c */
    public int f62242c;

    /* renamed from: d */
    public String[] f62243d;
    @C13622c("timestamp_processed")

    /* renamed from: e */
    public long f62244e;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C24557h.class != obj.getClass()) {
            return false;
        }
        C24557h hVar = (C24557h) obj;
        if (this.f62242c == hVar.f62242c && this.f62244e == hVar.f62244e && this.f62240a.equals(hVar.f62240a) && this.f62241b == hVar.f62241b && Arrays.equals(this.f62243d, hVar.f62243d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (Objects.hash(new Object[]{this.f62240a, Long.valueOf(this.f62241b), Integer.valueOf(this.f62242c), Long.valueOf(this.f62244e)}) * 31) + Arrays.hashCode(this.f62243d);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("CacheBust{id='");
        C25541a.m63890u(k, this.f62240a, '\'', ", timeWindowEnd=");
        k.append(this.f62241b);
        k.append(", idType=");
        k.append(this.f62242c);
        k.append(", eventIds=");
        k.append(Arrays.toString(this.f62243d));
        k.append(", timestampProcessed=");
        k.append(this.f62244e);
        k.append('}');
        return k.toString();
    }
}
