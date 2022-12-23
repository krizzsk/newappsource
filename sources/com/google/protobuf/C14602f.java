package com.google.protobuf;

import java.io.IOException;
import java.nio.charset.Charset;
import p911xg.C20512t;

/* renamed from: com.google.protobuf.f */
public final class C14602f {

    /* renamed from: a */
    public final CodedOutputStream f36850a;

    public C14602f(CodedOutputStream codedOutputStream) {
        Charset charset = C14610k.f36861a;
        if (codedOutputStream != null) {
            this.f36850a = codedOutputStream;
            codedOutputStream.f36801a = this;
            return;
        }
        throw new NullPointerException("output");
    }

    /* renamed from: a */
    public final void mo44050a(int i, boolean z) throws IOException {
        this.f36850a.mo43929z(i, z);
    }

    /* renamed from: b */
    public final void mo44051b(int i, ByteString byteString) throws IOException {
        this.f36850a.mo43909B(i, byteString);
    }

    /* renamed from: c */
    public final void mo44052c(int i, double d) throws IOException {
        CodedOutputStream codedOutputStream = this.f36850a;
        codedOutputStream.getClass();
        codedOutputStream.mo43913F(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: d */
    public final void mo44053d(int i, int i2) throws IOException {
        this.f36850a.mo43915H(i, i2);
    }

    /* renamed from: e */
    public final void mo44054e(int i, int i2) throws IOException {
        this.f36850a.mo43911D(i, i2);
    }

    /* renamed from: f */
    public final void mo44055f(int i, long j) throws IOException {
        this.f36850a.mo43913F(i, j);
    }

    /* renamed from: g */
    public final void mo44056g(float f, int i) throws IOException {
        CodedOutputStream codedOutputStream = this.f36850a;
        codedOutputStream.getClass();
        codedOutputStream.mo43911D(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: h */
    public final void mo44057h(int i, C20512t tVar, Object obj) throws IOException {
        CodedOutputStream codedOutputStream = this.f36850a;
        codedOutputStream.mo43923P(i, 3);
        tVar.mo44133e((C14629t) obj, codedOutputStream.f36801a);
        codedOutputStream.mo43923P(i, 4);
    }

    /* renamed from: i */
    public final void mo44058i(int i, int i2) throws IOException {
        this.f36850a.mo43915H(i, i2);
    }

    /* renamed from: j */
    public final void mo44059j(int i, long j) throws IOException {
        this.f36850a.mo43926S(i, j);
    }

    /* renamed from: k */
    public final void mo44060k(int i, C20512t tVar, Object obj) throws IOException {
        this.f36850a.mo43917J(i, (C14629t) obj, tVar);
    }

    /* renamed from: l */
    public final void mo44061l(int i, Object obj) throws IOException {
        if (obj instanceof ByteString) {
            this.f36850a.mo43920M(i, (ByteString) obj);
        } else {
            this.f36850a.mo43919L(i, (C14629t) obj);
        }
    }

    /* renamed from: m */
    public final void mo44062m(int i, int i2) throws IOException {
        this.f36850a.mo43911D(i, i2);
    }

    /* renamed from: n */
    public final void mo44063n(int i, long j) throws IOException {
        this.f36850a.mo43913F(i, j);
    }

    /* renamed from: o */
    public final void mo44064o(int i, int i2) throws IOException {
        this.f36850a.mo43924Q(i, (i2 >> 31) ^ (i2 << 1));
    }

    /* renamed from: p */
    public final void mo44065p(int i, long j) throws IOException {
        this.f36850a.mo43926S(i, (j >> 63) ^ (j << 1));
    }

    /* renamed from: q */
    public final void mo44066q(int i, int i2) throws IOException {
        this.f36850a.mo43924Q(i, i2);
    }

    /* renamed from: r */
    public final void mo44067r(int i, long j) throws IOException {
        this.f36850a.mo43926S(i, j);
    }
}
