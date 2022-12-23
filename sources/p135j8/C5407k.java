package p135j8;

import p001a0.C0016g;

/* renamed from: j8.k */
public final class C5407k {

    /* renamed from: a */
    public final String f17755a;

    /* renamed from: b */
    public final boolean f17756b;

    public C5407k(String str, boolean z) {
        this.f17755a = str;
        this.f17756b = z;
    }

    public final String toString() {
        String str;
        if (this.f17756b) {
            str = "Applink";
        } else {
            str = "Unclassified";
        }
        if (this.f17755a == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        return C0016g.m30n(sb, this.f17755a, ')');
    }
}
