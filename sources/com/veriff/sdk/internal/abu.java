package com.veriff.sdk.internal;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;

final class abu implements abj {

    /* renamed from: a */
    public final abi f53589a = new abi();

    /* renamed from: b */
    public final abz f53590b;

    /* renamed from: c */
    public boolean f53591c;

    public abu(abz abz) {
        if (abz != null) {
            this.f53590b = abz;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    /* renamed from: a */
    public abj mo53857a(aca aca, long j) throws IOException {
        while (j > 0) {
            long a = aca.mo53671a(this.f53589a, j);
            if (a != -1) {
                j -= a;
                mo53924y();
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    /* renamed from: a_ */
    public void mo53675a_(abi abi, long j) throws IOException {
        if (!this.f53591c) {
            this.f53589a.mo53675a_(abi, j);
            mo53924y();
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: b */
    public abj mo53870b(String str) throws IOException {
        if (!this.f53591c) {
            this.f53589a.mo53870b(str);
            return mo53924y();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: c */
    public abi mo53875c() {
        return this.f53589a;
    }

    public void close() throws IOException {
        if (!this.f53591c) {
            Throwable th = null;
            try {
                abi abi = this.f53589a;
                long j = abi.f53556b;
                if (j > 0) {
                    this.f53590b.mo53675a_(abi, j);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f53590b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f53591c = true;
            if (th != null) {
                acc.m50628a(th);
            }
        }
    }

    /* renamed from: d */
    public abj mo53882d(abl abl) throws IOException {
        if (!this.f53591c) {
            this.f53589a.mo53882d(abl);
            return mo53924y();
        }
        throw new IllegalStateException("closed");
    }

    public void flush() throws IOException {
        if (!this.f53591c) {
            abi abi = this.f53589a;
            long j = abi.f53556b;
            if (j > 0) {
                this.f53590b.mo53675a_(abi, j);
            }
            this.f53590b.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: g */
    public abj mo53891g(int i) throws IOException {
        if (!this.f53591c) {
            this.f53589a.mo53891g(i);
            return mo53924y();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: h */
    public abj mo53894h(int i) throws IOException {
        if (!this.f53591c) {
            this.f53589a.mo53894h(i);
            return mo53924y();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: i */
    public abj mo53899i(int i) throws IOException {
        if (!this.f53591c) {
            this.f53589a.mo53899i(i);
            return mo53924y();
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return !this.f53591c;
    }

    /* renamed from: l */
    public abj mo53907l(long j) throws IOException {
        if (!this.f53591c) {
            this.f53589a.mo53907l(j);
            return mo53924y();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: m */
    public abj mo53908m(long j) throws IOException {
        if (!this.f53591c) {
            this.f53589a.mo53908m(j);
            return mo53924y();
        }
        throw new IllegalStateException("closed");
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("buffer(");
        k.append(this.f53590b);
        k.append(")");
        return k.toString();
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.f53591c) {
            int write = this.f53589a.write(byteBuffer);
            mo53924y();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: y */
    public abj mo53924y() throws IOException {
        if (!this.f53591c) {
            long i = this.f53589a.mo53898i();
            if (i > 0) {
                this.f53590b.mo53675a_(this.f53589a, i);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: c */
    public abj mo53877c(byte[] bArr) throws IOException {
        if (!this.f53591c) {
            this.f53589a.mo53877c(bArr);
            return mo53924y();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: a */
    public acb mo53674a() {
        return this.f53590b.mo53674a();
    }

    /* renamed from: b */
    public abj mo53871b(String str, int i, int i2) throws IOException {
        if (!this.f53591c) {
            this.f53589a.mo53871b(str, i, i2);
            return mo53924y();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: c */
    public abj mo53878c(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f53591c) {
            this.f53589a.mo53878c(bArr, i, i2);
            return mo53924y();
        }
        throw new IllegalStateException("closed");
    }
}
