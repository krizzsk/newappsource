package com.veriff.sdk.internal;

/* renamed from: com.veriff.sdk.internal.am */
public final class C21401am {

    /* renamed from: a */
    public static final C21401am f53844a = new C21401am(929, 3);

    /* renamed from: b */
    private final int[] f53845b;

    /* renamed from: c */
    private final int[] f53846c;

    /* renamed from: d */
    private final C21402an f53847d;

    /* renamed from: e */
    private final C21402an f53848e;

    /* renamed from: f */
    private final int f53849f;

    private C21401am(int i, int i2) {
        this.f53849f = i;
        this.f53845b = new int[i];
        this.f53846c = new int[i];
        int i3 = 1;
        for (int i4 = 0; i4 < i; i4++) {
            this.f53845b[i4] = i3;
            i3 = (i3 * i2) % i;
        }
        for (int i5 = 0; i5 < i - 1; i5++) {
            this.f53846c[this.f53845b[i5]] = i5;
        }
        this.f53847d = new C21402an(this, new int[]{0});
        this.f53848e = new C21402an(this, new int[]{1});
    }

    /* renamed from: a */
    public C21402an mo54182a() {
        return this.f53847d;
    }

    /* renamed from: b */
    public C21402an mo54186b() {
        return this.f53848e;
    }

    /* renamed from: c */
    public int mo54189c(int i, int i2) {
        int i3 = this.f53849f;
        return ((i + i3) - i2) % i3;
    }

    /* renamed from: d */
    public int mo54190d(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.f53845b;
        int[] iArr2 = this.f53846c;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.f53849f - 1)];
    }

    /* renamed from: a */
    public C21402an mo54183a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        } else if (i2 == 0) {
            return this.f53847d;
        } else {
            int[] iArr = new int[(i + 1)];
            iArr[0] = i2;
            return new C21402an(this, iArr);
        }
    }

    /* renamed from: b */
    public int mo54185b(int i, int i2) {
        return (i + i2) % this.f53849f;
    }

    /* renamed from: c */
    public int mo54188c(int i) {
        if (i != 0) {
            return this.f53845b[(this.f53849f - this.f53846c[i]) - 1];
        }
        throw new ArithmeticException();
    }

    /* renamed from: b */
    public int mo54184b(int i) {
        if (i != 0) {
            return this.f53846c[i];
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: c */
    public int mo54187c() {
        return this.f53849f;
    }

    /* renamed from: a */
    public int mo54181a(int i) {
        return this.f53845b[i];
    }
}
