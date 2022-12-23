package vi0;

import p358af.C13437d;

/* renamed from: vi0.c */
public final class C25113c {

    /* renamed from: a */
    public final String f63355a;

    /* renamed from: b */
    public final byte f63356b;

    /* renamed from: c */
    public final short f63357c;

    public C25113c(String str, byte b, short s) {
        this.f63355a = str;
        this.f63356b = b;
        this.f63357c = s;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("<TField name:'");
        k.append(this.f63355a);
        k.append("' type:");
        k.append(this.f63356b);
        k.append(" field-id:");
        return C13437d.m33707l(k, this.f63357c, ">");
    }
}
