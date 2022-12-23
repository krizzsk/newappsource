package com.veriff.sdk.internal;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import p001a0.C0016g;

public final class abq implements aca {

    /* renamed from: a */
    private final abk f53571a;

    /* renamed from: b */
    private final Inflater f53572b;

    /* renamed from: c */
    private int f53573c;

    /* renamed from: d */
    private boolean f53574d;

    public abq(abk abk, Inflater inflater) {
        if (abk == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.f53571a = abk;
            this.f53572b = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    /* renamed from: c */
    private void m50503c() throws IOException {
        int i = this.f53573c;
        if (i != 0) {
            int remaining = i - this.f53572b.getRemaining();
            this.f53573c -= remaining;
            this.f53571a.mo53900i((long) remaining);
        }
    }

    /* renamed from: a */
    public long mo53671a(abi abi, long j) throws IOException {
        abw e;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException(C0016g.m29l("byteCount < 0: ", j));
        } else if (this.f53574d) {
            throw new IllegalStateException("closed");
        } else if (i == 0) {
            return 0;
        } else {
            while (true) {
                boolean b = mo53963b();
                try {
                    e = abi.mo53885e(1);
                    int inflate = this.f53572b.inflate(e.f53596a, e.f53598c, (int) Math.min(j, (long) (8192 - e.f53598c)));
                    if (inflate > 0) {
                        e.f53598c += inflate;
                        long j2 = (long) inflate;
                        abi.f53556b += j2;
                        return j2;
                    } else if (this.f53572b.finished()) {
                        break;
                    } else if (this.f53572b.needsDictionary()) {
                        break;
                    } else if (b) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (DataFormatException e2) {
                    throw new IOException(e2);
                }
            }
            m50503c();
            if (e.f53597b != e.f53598c) {
                return -1;
            }
            abi.f53555a = e.mo53988b();
            abx.m50590a(e);
            return -1;
        }
    }

    /* renamed from: b */
    public final boolean mo53963b() throws IOException {
        if (!this.f53572b.needsInput()) {
            return false;
        }
        m50503c();
        if (this.f53572b.getRemaining() != 0) {
            throw new IllegalStateException("?");
        } else if (this.f53571a.mo53890f()) {
            return true;
        } else {
            abw abw = this.f53571a.mo53875c().f53555a;
            int i = abw.f53598c;
            int i2 = abw.f53597b;
            int i3 = i - i2;
            this.f53573c = i3;
            this.f53572b.setInput(abw.f53596a, i2, i3);
            return false;
        }
    }

    public void close() throws IOException {
        if (!this.f53574d) {
            this.f53572b.end();
            this.f53574d = true;
            this.f53571a.close();
        }
    }

    /* renamed from: a */
    public acb mo53672a() {
        return this.f53571a.mo53672a();
    }
}
