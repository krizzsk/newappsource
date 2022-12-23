package p225qa;

import p173ma.C5732e;
import p173ma.C5736i;
import p583jk.C17875h;

/* renamed from: qa.c */
public final class C6221c implements C5736i {

    /* renamed from: a */
    public final C5736i f19648a;

    /* renamed from: b */
    public final long f19649b;

    public C6221c(C5732e eVar, long j) {
        boolean z;
        this.f19648a = eVar;
        if (eVar.f18591d >= j) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44301k(z);
        this.f19649b = j;
    }

    /* renamed from: a */
    public final void mo21575a(int i, int i2, byte[] bArr) {
        this.f19648a.mo21575a(i, i2, bArr);
    }

    /* renamed from: c */
    public final void mo21576c() {
        this.f19648a.mo21576c();
    }

    /* renamed from: f */
    public final long mo21577f() {
        return this.f19648a.mo21577f() - this.f19649b;
    }

    /* renamed from: g */
    public final void mo21578g(int i) {
        this.f19648a.mo21578g(i);
    }

    public final long getLength() {
        return this.f19648a.getLength() - this.f19649b;
    }

    public final long getPosition() {
        return this.f19648a.getPosition() - this.f19649b;
    }

    /* renamed from: h */
    public final boolean mo21581h(int i, int i2, byte[] bArr, boolean z) {
        return this.f19648a.mo21581h(i, i2, bArr, z);
    }

    /* renamed from: i */
    public final void mo21582i(int i) {
        this.f19648a.mo21582i(i);
    }

    /* renamed from: j */
    public final boolean mo21583j(int i, int i2, byte[] bArr, boolean z) {
        return this.f19648a.mo21583j(i, i2, bArr, z);
    }

    public final int read(byte[] bArr, int i, int i2) {
        return this.f19648a.read(bArr, i, i2);
    }

    public final void readFully(byte[] bArr, int i, int i2) {
        this.f19648a.readFully(bArr, i, i2);
    }
}
