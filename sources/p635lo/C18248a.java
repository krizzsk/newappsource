package p635lo;

import android.graphics.Typeface;

/* renamed from: lo.a */
public final class C18248a {

    /* renamed from: a */
    public final int f46562a;

    /* renamed from: b */
    public final Typeface f46563b;

    /* renamed from: c */
    public final int f46564c;

    /* renamed from: d */
    public final String f46565d;

    public C18248a(int i, Typeface typeface, int i2, String str) {
        this.f46562a = i;
        this.f46563b = typeface;
        this.f46564c = i2;
        this.f46565d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C18248a.class != obj.getClass()) {
            return false;
        }
        C18248a aVar = (C18248a) obj;
        if (this.f46562a == aVar.f46562a && this.f46564c == aVar.f46564c && this.f46563b.equals(aVar.f46563b)) {
            return this.f46565d.equals(aVar.f46565d);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f46563b.hashCode();
        return this.f46565d.hashCode() + ((((hashCode + (this.f46562a * 31)) * 31) + this.f46564c) * 31);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Font{sizeSp=");
        k.append(this.f46562a);
        k.append(", typeface=");
        k.append(this.f46563b);
        k.append(", style=");
        k.append(this.f46564c);
        k.append(", color='");
        k.append(this.f46565d);
        k.append('\'');
        k.append('}');
        return k.toString();
    }
}
