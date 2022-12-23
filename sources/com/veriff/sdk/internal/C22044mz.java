package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C22682xf;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import mf0.C24362h;
import p001a0.C0016g;
import p358af.C13437d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\u0001\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\"\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, mo59060d2 = {"Lcom/veriff/sdk/internal/upload/LimitedInputStream;", "Ljava/io/InputStream;", "", "read", "", "b", "off", "len", "Lbf0/d;", "checkLimit", "", "bytesRead", "J", "inputStream", "Ljava/io/InputStream;", "maxBytes", "I", "<init>", "(Ljava/io/InputStream;I)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.mz */
public final class C22044mz extends InputStream {

    /* renamed from: a */
    private long f55604a;

    /* renamed from: b */
    private final InputStream f55605b;

    /* renamed from: c */
    private final int f55606c;

    public C22044mz(InputStream inputStream, int i) {
        C24362h.m61211f(inputStream, "inputStream");
        this.f55605b = inputStream;
        this.f55606c = i;
    }

    /* renamed from: a */
    private final void m53751a(int i) throws IOException {
        long j = this.f55604a + ((long) i);
        this.f55604a = j;
        if (j >= ((long) this.f55606c)) {
            throw new C22682xf.C22683a(C13437d.m33707l(C0016g.m36t("File size cannot be more ", "than "), this.f55606c, " bytes"));
        }
    }

    public int read() throws IOException {
        int read = this.f55605b.read();
        if (read != -1) {
            m53751a(1);
        }
        return read;
    }

    public int read(byte[] bArr) throws IOException {
        int read = super.read(bArr);
        m53751a(read);
        return read;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = super.read(bArr, i, i2);
        m53751a(read);
        return read;
    }
}
