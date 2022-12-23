package p534hh;

import java.io.Serializable;
import p358af.C13437d;

/* renamed from: hh.a */
public final class C17433a {

    /* renamed from: a */
    public final /* synthetic */ int f44901a = 0;

    /* renamed from: b */
    public int f44902b;

    /* renamed from: c */
    public final Serializable f44903c;

    /* JADX WARNING: type inference failed for: r2v1, types: [byte[], java.io.Serializable] */
    public C17433a(int i) {
        this.f44903c = new byte[i];
        this.f44902b = 0;
    }

    public final String toString() {
        switch (this.f44901a) {
            case 1:
                StringBuilder k = C13555b.m33972k("TelephonyMetrics: [");
                k.append((String) this.f44903c);
                k.append(", ");
                return C13437d.m33707l(k, this.f44902b, "]");
            default:
                return super.toString();
        }
    }
}
