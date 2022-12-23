package p577je;

import p001a0.C0016g;
import p577je.C17746a0;

/* renamed from: je.t */
public final class C17815t extends C17746a0.C17753e.C17759d.C17776d {

    /* renamed from: a */
    public final String f45757a;

    public C17815t(String str) {
        this.f45757a = str;
    }

    /* renamed from: a */
    public final String mo50264a() {
        return this.f45757a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C17746a0.C17753e.C17759d.C17776d) {
            return this.f45757a.equals(((C17746a0.C17753e.C17759d.C17776d) obj).mo50264a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f45757a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return C0016g.m31o(C13555b.m33972k("Log{content="), this.f45757a, "}");
    }
}
