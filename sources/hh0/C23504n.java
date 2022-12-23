package hh0;

import mf0.C24362h;
import tg0.C24988e;
import ug0.C25065b;

/* renamed from: hh0.n */
public final class C23504n<T> {

    /* renamed from: a */
    public final T f59343a;

    /* renamed from: b */
    public final T f59344b;

    /* renamed from: c */
    public final String f59345c;

    /* renamed from: d */
    public final C25065b f59346d;

    public C23504n(C24988e eVar, C24988e eVar2, String str, C25065b bVar) {
        C24362h.m61211f(str, "filePath");
        C24362h.m61211f(bVar, "classId");
        this.f59343a = eVar;
        this.f59344b = eVar2;
        this.f59345c = str;
        this.f59346d = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23504n)) {
            return false;
        }
        C23504n nVar = (C23504n) obj;
        return C24362h.m61206a(this.f59343a, nVar.f59343a) && C24362h.m61206a(this.f59344b, nVar.f59344b) && C24362h.m61206a(this.f59345c, nVar.f59345c) && C24362h.m61206a(this.f59346d, nVar.f59346d);
    }

    public final int hashCode() {
        int i;
        T t = this.f59343a;
        int i2 = 0;
        if (t == null) {
            i = 0;
        } else {
            i = t.hashCode();
        }
        int i3 = i * 31;
        T t2 = this.f59344b;
        if (t2 != null) {
            i2 = t2.hashCode();
        }
        return this.f59346d.hashCode() + C13715c.m34238d(this.f59345c, (i3 + i2) * 31, 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("IncompatibleVersionErrorData(actualVersion=");
        k.append(this.f59343a);
        k.append(", expectedVersion=");
        k.append(this.f59344b);
        k.append(", filePath=");
        k.append(this.f59345c);
        k.append(", classId=");
        k.append(this.f59346d);
        k.append(')');
        return k.toString();
    }
}
