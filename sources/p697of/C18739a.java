package p697of;

import com.google.firebase.perf.p414v1.NetworkRequestMetric;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import p649mf.C18367b;

/* renamed from: of.a */
public final class C18739a extends InputStream {

    /* renamed from: b */
    public final InputStream f47659b;

    /* renamed from: c */
    public final C18367b f47660c;

    /* renamed from: d */
    public final Timer f47661d;

    /* renamed from: e */
    public long f47662e = -1;

    /* renamed from: f */
    public long f47663f;

    /* renamed from: g */
    public long f47664g = -1;

    public C18739a(InputStream inputStream, C18367b bVar, Timer timer) {
        this.f47661d = timer;
        this.f47659b = inputStream;
        this.f47660c = bVar;
        this.f47663f = ((NetworkRequestMetric) bVar.f46833e.f36809c).mo43536P();
    }

    public final int available() throws IOException {
        try {
            return this.f47659b.available();
        } catch (IOException e) {
            this.f47660c.mo50838n(this.f47661d.mo43519b());
            C18746h.m45753c(this.f47660c);
            throw e;
        }
    }

    public final void close() throws IOException {
        long b = this.f47661d.mo43519b();
        if (this.f47664g == -1) {
            this.f47664g = b;
        }
        try {
            this.f47659b.close();
            long j = this.f47662e;
            if (j != -1) {
                this.f47660c.mo50837m(j);
            }
            long j2 = this.f47663f;
            if (j2 != -1) {
                NetworkRequestMetric.C14496b bVar = this.f47660c.f46833e;
                bVar.mo43956p();
                NetworkRequestMetric.m36093A((NetworkRequestMetric) bVar.f36809c, j2);
            }
            this.f47660c.mo50838n(this.f47664g);
            this.f47660c.mo50831c();
        } catch (IOException e) {
            this.f47660c.mo50838n(this.f47661d.mo43519b());
            C18746h.m45753c(this.f47660c);
            throw e;
        }
    }

    public final void mark(int i) {
        this.f47659b.mark(i);
    }

    public final boolean markSupported() {
        return this.f47659b.markSupported();
    }

    public final int read() throws IOException {
        try {
            int read = this.f47659b.read();
            long b = this.f47661d.mo43519b();
            if (this.f47663f == -1) {
                this.f47663f = b;
            }
            if (read == -1 && this.f47664g == -1) {
                this.f47664g = b;
                this.f47660c.mo50838n(b);
                this.f47660c.mo50831c();
            } else {
                long j = this.f47662e + 1;
                this.f47662e = j;
                this.f47660c.mo50837m(j);
            }
            return read;
        } catch (IOException e) {
            this.f47660c.mo50838n(this.f47661d.mo43519b());
            C18746h.m45753c(this.f47660c);
            throw e;
        }
    }

    public final void reset() throws IOException {
        try {
            this.f47659b.reset();
        } catch (IOException e) {
            this.f47660c.mo50838n(this.f47661d.mo43519b());
            C18746h.m45753c(this.f47660c);
            throw e;
        }
    }

    public final long skip(long j) throws IOException {
        try {
            long skip = this.f47659b.skip(j);
            long b = this.f47661d.mo43519b();
            if (this.f47663f == -1) {
                this.f47663f = b;
            }
            if (skip == -1 && this.f47664g == -1) {
                this.f47664g = b;
                this.f47660c.mo50838n(b);
            } else {
                long j2 = this.f47662e + skip;
                this.f47662e = j2;
                this.f47660c.mo50837m(j2);
            }
            return skip;
        } catch (IOException e) {
            this.f47660c.mo50838n(this.f47661d.mo43519b());
            C18746h.m45753c(this.f47660c);
            throw e;
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            int read = this.f47659b.read(bArr, i, i2);
            long b = this.f47661d.mo43519b();
            if (this.f47663f == -1) {
                this.f47663f = b;
            }
            if (read == -1 && this.f47664g == -1) {
                this.f47664g = b;
                this.f47660c.mo50838n(b);
                this.f47660c.mo50831c();
            } else {
                long j = this.f47662e + ((long) read);
                this.f47662e = j;
                this.f47660c.mo50837m(j);
            }
            return read;
        } catch (IOException e) {
            this.f47660c.mo50838n(this.f47661d.mo43519b());
            C18746h.m45753c(this.f47660c);
            throw e;
        }
    }

    public final int read(byte[] bArr) throws IOException {
        try {
            int read = this.f47659b.read(bArr);
            long b = this.f47661d.mo43519b();
            if (this.f47663f == -1) {
                this.f47663f = b;
            }
            if (read == -1 && this.f47664g == -1) {
                this.f47664g = b;
                this.f47660c.mo50838n(b);
                this.f47660c.mo50831c();
            } else {
                long j = this.f47662e + ((long) read);
                this.f47662e = j;
                this.f47660c.mo50837m(j);
            }
            return read;
        } catch (IOException e) {
            this.f47660c.mo50838n(this.f47661d.mo43519b());
            C18746h.m45753c(this.f47660c);
            throw e;
        }
    }
}
