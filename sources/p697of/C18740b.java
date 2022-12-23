package p697of;

import com.google.firebase.perf.p414v1.NetworkRequestMetric;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.OutputStream;
import p649mf.C18367b;

/* renamed from: of.b */
public final class C18740b extends OutputStream {

    /* renamed from: b */
    public final OutputStream f47665b;

    /* renamed from: c */
    public final Timer f47666c;

    /* renamed from: d */
    public C18367b f47667d;

    /* renamed from: e */
    public long f47668e = -1;

    public C18740b(OutputStream outputStream, C18367b bVar, Timer timer) {
        this.f47665b = outputStream;
        this.f47667d = bVar;
        this.f47666c = timer;
    }

    public final void close() throws IOException {
        long j = this.f47668e;
        if (j != -1) {
            this.f47667d.mo50834j(j);
        }
        C18367b bVar = this.f47667d;
        long b = this.f47666c.mo43519b();
        NetworkRequestMetric.C14496b bVar2 = bVar.f46833e;
        bVar2.mo43956p();
        NetworkRequestMetric.m36108z((NetworkRequestMetric) bVar2.f36809c, b);
        try {
            this.f47665b.close();
        } catch (IOException e) {
            this.f47667d.mo50838n(this.f47666c.mo43519b());
            C18746h.m45753c(this.f47667d);
            throw e;
        }
    }

    public final void flush() throws IOException {
        try {
            this.f47665b.flush();
        } catch (IOException e) {
            this.f47667d.mo50838n(this.f47666c.mo43519b());
            C18746h.m45753c(this.f47667d);
            throw e;
        }
    }

    public final void write(int i) throws IOException {
        try {
            this.f47665b.write(i);
            long j = this.f47668e + 1;
            this.f47668e = j;
            this.f47667d.mo50834j(j);
        } catch (IOException e) {
            this.f47667d.mo50838n(this.f47666c.mo43519b());
            C18746h.m45753c(this.f47667d);
            throw e;
        }
    }

    public final void write(byte[] bArr) throws IOException {
        try {
            this.f47665b.write(bArr);
            long length = this.f47668e + ((long) bArr.length);
            this.f47668e = length;
            this.f47667d.mo50834j(length);
        } catch (IOException e) {
            this.f47667d.mo50838n(this.f47666c.mo43519b());
            C18746h.m45753c(this.f47667d);
            throw e;
        }
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.f47665b.write(bArr, i, i2);
            long j = this.f47668e + ((long) i2);
            this.f47668e = j;
            this.f47667d.mo50834j(j);
        } catch (IOException e) {
            this.f47667d.mo50838n(this.f47666c.mo43519b());
            C18746h.m45753c(this.f47667d);
            throw e;
        }
    }
}
