package p129j1;

import android.graphics.Insets;

/* renamed from: j1.b */
public final class C5349b {

    /* renamed from: e */
    public static final C5349b f17645e = new C5349b(0, 0, 0, 0);

    /* renamed from: a */
    public final int f17646a;

    /* renamed from: b */
    public final int f17647b;

    /* renamed from: c */
    public final int f17648c;

    /* renamed from: d */
    public final int f17649d;

    /* renamed from: j1.b$a */
    public static class C5350a {
        /* renamed from: a */
        public static Insets m13421a(int i, int i2, int i3, int i4) {
            return Insets.m264of(i, i2, i3, i4);
        }
    }

    public C5349b(int i, int i2, int i3, int i4) {
        this.f17646a = i;
        this.f17647b = i2;
        this.f17648c = i3;
        this.f17649d = i4;
    }

    /* renamed from: a */
    public static C5349b m13418a(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return f17645e;
        }
        return new C5349b(i, i2, i3, i4);
    }

    /* renamed from: b */
    public static C5349b m13419b(Insets insets) {
        return m13418a(insets.left, insets.top, insets.right, insets.bottom);
    }

    /* renamed from: c */
    public final Insets mo21131c() {
        return C5350a.m13421a(this.f17646a, this.f17647b, this.f17648c, this.f17649d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5349b.class != obj.getClass()) {
            return false;
        }
        C5349b bVar = (C5349b) obj;
        if (this.f17649d == bVar.f17649d && this.f17646a == bVar.f17646a && this.f17648c == bVar.f17648c && this.f17647b == bVar.f17647b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.f17646a * 31) + this.f17647b) * 31) + this.f17648c) * 31) + this.f17649d;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Insets{left=");
        k.append(this.f17646a);
        k.append(", top=");
        k.append(this.f17647b);
        k.append(", right=");
        k.append(this.f17648c);
        k.append(", bottom=");
        return C16530d.m42014g(k, this.f17649d, '}');
    }
}
