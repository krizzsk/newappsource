package p024b5;

import java.util.ArrayList;
import java.util.List;
import p059d5.C4377i;

/* renamed from: b5.c */
public final class C1481c {

    /* renamed from: a */
    public final List<C4377i> f5376a;

    /* renamed from: b */
    public final char f5377b;

    /* renamed from: c */
    public final double f5378c;

    /* renamed from: d */
    public final String f5379d;

    /* renamed from: e */
    public final String f5380e;

    public C1481c(ArrayList arrayList, char c, double d, String str, String str2) {
        this.f5376a = arrayList;
        this.f5377b = c;
        this.f5378c = d;
        this.f5379d = str;
        this.f5380e = str2;
    }

    /* renamed from: a */
    public static int m3893a(char c, String str, String str2) {
        return str2.hashCode() + C13715c.m34238d(str, (c + 0) * 31, 31);
    }

    public final int hashCode() {
        return m3893a(this.f5377b, this.f5380e, this.f5379d);
    }
}
