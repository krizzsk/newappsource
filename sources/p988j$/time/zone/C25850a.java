package p988j$.time.zone;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p988j$.time.C25783b;
import p988j$.time.C25793d;
import p988j$.time.Instant;
import p988j$.time.LocalDateTime;
import p988j$.time.ZoneOffset;

/* renamed from: j$.time.zone.a */
public final class C25850a implements Comparable, Serializable {

    /* renamed from: a */
    private final LocalDateTime f64454a;

    /* renamed from: b */
    private final ZoneOffset f64455b;

    /* renamed from: c */
    private final ZoneOffset f64456c;

    C25850a(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f64454a = localDateTime;
        this.f64455b = zoneOffset;
        this.f64456c = zoneOffset2;
    }

    /* renamed from: a */
    public final LocalDateTime mo83799a() {
        return this.f64454a.mo83632s((long) (this.f64456c.mo83654j() - this.f64455b.mo83654j()));
    }

    /* renamed from: b */
    public final LocalDateTime mo83800b() {
        return this.f64454a;
    }

    /* renamed from: c */
    public final C25793d mo83801c() {
        return C25793d.m64422e((long) (this.f64456c.mo83654j() - this.f64455b.mo83654j()));
    }

    public final int compareTo(Object obj) {
        C25850a aVar = (C25850a) obj;
        LocalDateTime localDateTime = this.f64454a;
        Instant n = Instant.m64345n(localDateTime.mo83634u(this.f64455b), (long) localDateTime.mo83637x().mo83743l());
        LocalDateTime localDateTime2 = aVar.f64454a;
        return n.compareTo(Instant.m64345n(localDateTime2.mo83634u(aVar.f64455b), (long) localDateTime2.mo83637x().mo83743l()));
    }

    /* renamed from: d */
    public final ZoneOffset mo83803d() {
        return this.f64456c;
    }

    /* renamed from: e */
    public final ZoneOffset mo83804e() {
        return this.f64455b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C25850a)) {
            return false;
        }
        C25850a aVar = (C25850a) obj;
        return this.f64454a.equals(aVar.f64454a) && this.f64455b.equals(aVar.f64455b) && this.f64456c.equals(aVar.f64456c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final List mo83806f() {
        if (mo83807g()) {
            return Collections.emptyList();
        }
        return Arrays.asList(new ZoneOffset[]{this.f64455b, this.f64456c});
    }

    /* renamed from: g */
    public final boolean mo83807g() {
        return this.f64456c.mo83654j() > this.f64455b.mo83654j();
    }

    /* renamed from: h */
    public final long mo83808h() {
        return this.f64454a.mo83634u(this.f64455b);
    }

    public final int hashCode() {
        return (this.f64454a.hashCode() ^ this.f64455b.hashCode()) ^ Integer.rotateLeft(this.f64456c.hashCode(), 16);
    }

    public final String toString() {
        StringBuilder a = C25783b.m64414a("Transition[");
        a.append(mo83807g() ? "Gap" : "Overlap");
        a.append(" at ");
        a.append(this.f64454a);
        a.append(this.f64455b);
        a.append(" to ");
        a.append(this.f64456c);
        a.append(']');
        return a.toString();
    }
}
