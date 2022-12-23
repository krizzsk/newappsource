package p958zg;

/* renamed from: zg.e */
public final class C20846e {

    /* renamed from: e */
    public static final C20846e f52571e = new C20846e(C20847f.f52576b, 0, 0, 0);

    /* renamed from: a */
    public final int f52572a;

    /* renamed from: b */
    public final C20847f f52573b;

    /* renamed from: c */
    public final int f52574c;

    /* renamed from: d */
    public final int f52575d;

    public C20846e(C20847f fVar, int i, int i2, int i3) {
        this.f52573b = fVar;
        this.f52572a = i;
        this.f52574c = i2;
        this.f52575d = i3;
    }

    /* renamed from: a */
    public final C20846e mo52969a(int i) {
        int i2;
        C20847f fVar = this.f52573b;
        int i3 = this.f52572a;
        int i4 = this.f52575d;
        if (i3 == 4 || i3 == 2) {
            int i5 = C20844c.f52565c[i3][0];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            fVar.getClass();
            i4 += i7;
            fVar = new C20845d(fVar, i6, i7);
            i3 = 0;
        }
        int i8 = this.f52574c;
        if (i8 == 0 || i8 == 31) {
            i2 = 18;
        } else if (i8 == 62) {
            i2 = 9;
        } else {
            i2 = 8;
        }
        int i9 = i8 + 1;
        C20846e eVar = new C20846e(fVar, i3, i9, i4 + i2);
        if (i9 == 2078) {
            return eVar.mo52970b(i + 1);
        }
        return eVar;
    }

    /* renamed from: b */
    public final C20846e mo52970b(int i) {
        int i2 = this.f52574c;
        if (i2 == 0) {
            return this;
        }
        C20847f fVar = this.f52573b;
        fVar.getClass();
        return new C20846e(new C20842a(fVar, i - i2, i2), this.f52572a, 0, this.f52575d);
    }

    /* renamed from: c */
    public final boolean mo52971c(C20846e eVar) {
        int i;
        int i2 = this.f52575d + (C20844c.f52565c[this.f52572a][eVar.f52572a] >> 16);
        int i3 = eVar.f52574c;
        if (i3 > 0 && ((i = this.f52574c) == 0 || i > i3)) {
            i2 += 10;
        }
        if (i2 <= eVar.f52575d) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final C20846e mo52972d(int i, int i2) {
        int i3;
        int i4 = this.f52575d;
        C20847f fVar = this.f52573b;
        int i5 = this.f52572a;
        if (i != i5) {
            int i6 = C20844c.f52565c[i5][i];
            int i7 = 65535 & i6;
            int i8 = i6 >> 16;
            fVar.getClass();
            i4 += i8;
            fVar = new C20845d(fVar, i7, i8);
        }
        if (i == 2) {
            i3 = 4;
        } else {
            i3 = 5;
        }
        fVar.getClass();
        return new C20846e(new C20845d(fVar, i2, i3), i, 0, i4 + i3);
    }

    /* renamed from: e */
    public final C20846e mo52973e(int i, int i2) {
        int i3;
        C20847f fVar = this.f52573b;
        int i4 = this.f52572a;
        if (i4 == 2) {
            i3 = 4;
        } else {
            i3 = 5;
        }
        int i5 = C20844c.f52567e[i4][i];
        fVar.getClass();
        return new C20846e(new C20845d(new C20845d(fVar, i5, i3), i2, 5), this.f52572a, 0, this.f52575d + i3 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", new Object[]{C20844c.f52564b[this.f52572a], Integer.valueOf(this.f52575d), Integer.valueOf(this.f52574c)});
    }
}
