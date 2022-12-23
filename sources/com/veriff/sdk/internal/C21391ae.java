package com.veriff.sdk.internal;

/* renamed from: com.veriff.sdk.internal.ae */
final class C21391ae {

    /* renamed from: a */
    private final int f53817a;

    /* renamed from: b */
    private final int f53818b;

    /* renamed from: c */
    private final int f53819c;

    /* renamed from: d */
    private final int f53820d;

    /* renamed from: e */
    private int f53821e = -1;

    public C21391ae(int i, int i2, int i3, int i4) {
        this.f53817a = i;
        this.f53818b = i2;
        this.f53819c = i3;
        this.f53820d = i4;
    }

    /* renamed from: a */
    public boolean mo54148a() {
        return mo54149a(this.f53821e);
    }

    /* renamed from: b */
    public void mo54150b() {
        this.f53821e = (this.f53819c / 3) + ((this.f53820d / 30) * 3);
    }

    /* renamed from: c */
    public int mo54152c() {
        return this.f53818b - this.f53817a;
    }

    /* renamed from: d */
    public int mo54153d() {
        return this.f53817a;
    }

    /* renamed from: e */
    public int mo54154e() {
        return this.f53818b;
    }

    /* renamed from: f */
    public int mo54155f() {
        return this.f53819c;
    }

    /* renamed from: g */
    public int mo54156g() {
        return this.f53820d;
    }

    /* renamed from: h */
    public int mo54157h() {
        return this.f53821e;
    }

    public String toString() {
        return this.f53821e + "|" + this.f53820d;
    }

    /* renamed from: a */
    public boolean mo54149a(int i) {
        return i != -1 && this.f53819c == (i % 3) * 3;
    }

    /* renamed from: b */
    public void mo54151b(int i) {
        this.f53821e = i;
    }
}
