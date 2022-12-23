package p988j$.time.format;

import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: j$.time.format.v */
public final class C25817v {

    /* renamed from: a */
    public static final C25817v f64389a = new C25817v();

    static {
        new ConcurrentHashMap(16, 0.75f, 2);
    }

    private C25817v() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25817v)) {
            return false;
        }
        ((C25817v) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return 182;
    }

    public final String toString() {
        return "DecimalStyle[0+-.]";
    }
}
