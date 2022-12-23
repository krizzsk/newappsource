package p193o4;

import java.util.Locale;

/* renamed from: o4.e */
public final class C5979e extends C5978d {
    public C5979e() {
    }

    public C5979e(String str) {
        super(str);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C5979e)) {
            return false;
        }
        C5979e eVar = (C5979e) obj;
        if (eVar.mo21965c() != mo21965c()) {
            return false;
        }
        int c = mo21965c();
        for (int i = 0; i < c; i++) {
            if (!mo21963a(i).equalsIgnoreCase(eVar.mo21963a(i))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int c = mo21965c();
        int i = 0;
        for (int i2 = 0; i2 < c; i2++) {
            i ^= mo21963a(i2).toLowerCase(Locale.US).hashCode();
        }
        return i;
    }
}
