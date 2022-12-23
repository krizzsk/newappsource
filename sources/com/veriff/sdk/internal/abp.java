package com.veriff.sdk.internal;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import p001a0.C0016g;

public final class abp implements aca {

    /* renamed from: a */
    private int f53566a = 0;

    /* renamed from: b */
    private final abk f53567b;

    /* renamed from: c */
    private final Inflater f53568c;

    /* renamed from: d */
    private final abq f53569d;

    /* renamed from: e */
    private final CRC32 f53570e = new CRC32();

    public abp(aca aca) {
        if (aca != null) {
            Inflater inflater = new Inflater(true);
            this.f53568c = inflater;
            abk a = abr.m50508a(aca);
            this.f53567b = a;
            this.f53569d = new abq(a, inflater);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: b */
    private void m50499b() throws IOException {
        boolean z;
        this.f53567b.mo53860a(10);
        byte c = this.f53567b.mo53875c().mo53873c(3);
        if (((c >> 1) & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m50497a(this.f53567b.mo53875c(), 0, 10);
        }
        m50498a("ID1ID2", 8075, (int) this.f53567b.mo53905k());
        this.f53567b.mo53900i(8);
        if (((c >> 2) & 1) == 1) {
            this.f53567b.mo53860a(2);
            if (z) {
                m50497a(this.f53567b.mo53875c(), 0, 2);
            }
            long m = (long) this.f53567b.mo53875c().mo53909m();
            this.f53567b.mo53860a(m);
            if (z) {
                m50497a(this.f53567b.mo53875c(), 0, m);
            }
            this.f53567b.mo53900i(m);
        }
        if (((c >> 3) & 1) == 1) {
            long a = this.f53567b.mo53846a((byte) 0);
            if (a != -1) {
                if (z) {
                    m50497a(this.f53567b.mo53875c(), 0, a + 1);
                }
                this.f53567b.mo53900i(a + 1);
            } else {
                throw new EOFException();
            }
        }
        if (((c >> 4) & 1) == 1) {
            long a2 = this.f53567b.mo53846a((byte) 0);
            if (a2 != -1) {
                if (z) {
                    m50497a(this.f53567b.mo53875c(), 0, a2 + 1);
                }
                this.f53567b.mo53900i(a2 + 1);
            } else {
                throw new EOFException();
            }
        }
        if (z) {
            m50498a("FHCRC", (int) this.f53567b.mo53909m(), (int) (short) ((int) this.f53570e.getValue()));
            this.f53570e.reset();
        }
    }

    /* renamed from: c */
    private void m50500c() throws IOException {
        m50498a("CRC", this.f53567b.mo53910n(), (int) this.f53570e.getValue());
        m50498a("ISIZE", this.f53567b.mo53910n(), (int) this.f53568c.getBytesWritten());
    }

    /* renamed from: a */
    public long mo53671a(abi abi, long j) throws IOException {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException(C0016g.m29l("byteCount < 0: ", j));
        } else if (i == 0) {
            return 0;
        } else {
            if (this.f53566a == 0) {
                m50499b();
                this.f53566a = 1;
            }
            if (this.f53566a == 1) {
                long j2 = abi.f53556b;
                long a = this.f53569d.mo53671a(abi, j);
                if (a != -1) {
                    m50497a(abi, j2, a);
                    return a;
                }
                this.f53566a = 2;
            }
            if (this.f53566a == 2) {
                m50500c();
                this.f53566a = 3;
                if (!this.f53567b.mo53890f()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public void close() throws IOException {
        this.f53569d.close();
    }

    /* renamed from: a */
    public acb mo53672a() {
        return this.f53567b.mo53672a();
    }

    /* renamed from: a */
    private void m50497a(abi abi, long j, long j2) {
        abw abw = abi.f53555a;
        while (true) {
            int i = abw.f53598c;
            int i2 = abw.f53597b;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            abw = abw.f53601f;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) abw.f53597b) + j);
            int min = (int) Math.min((long) (abw.f53598c - i3), j2);
            this.f53570e.update(abw.f53596a, i3, min);
            j2 -= (long) min;
            abw = abw.f53601f;
            j = 0;
        }
    }

    /* renamed from: a */
    private void m50498a(String str, int i, int i2) throws IOException {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}));
        }
    }
}
