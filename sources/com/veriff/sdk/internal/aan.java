package com.veriff.sdk.internal;

import com.appboy.support.ValidationUtils;
import com.veriff.sdk.internal.aah;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p988j$.util.Spliterator;

final class aan implements Closeable {

    /* renamed from: b */
    private static final Logger f53483b = Logger.getLogger(aai.class.getName());

    /* renamed from: a */
    public final aah.C21287b f53484a;

    /* renamed from: c */
    private final abj f53485c;

    /* renamed from: d */
    private final boolean f53486d;

    /* renamed from: e */
    private final abi f53487e;

    /* renamed from: f */
    private int f53488f = Spliterator.SUBSIZED;

    /* renamed from: g */
    private boolean f53489g;

    public aan(abj abj, boolean z) {
        this.f53485c = abj;
        this.f53486d = z;
        abi abi = new abi();
        this.f53487e = abi;
        this.f53484a = new aah.C21287b(abi);
    }

    /* renamed from: a */
    public synchronized void mo53756a() throws IOException {
        if (this.f53489g) {
            throw new IOException("closed");
        } else if (this.f53486d) {
            Logger logger = f53483b;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C22766za.m55824a(">> CONNECTION %s", aai.f53364a.mo53944f()));
            }
            this.f53485c.mo53877c(aai.f53364a.mo53948i());
            this.f53485c.flush();
        }
    }

    /* renamed from: b */
    public synchronized void mo53767b() throws IOException {
        if (!this.f53489g) {
            this.f53485c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: c */
    public int mo53769c() {
        return this.f53488f;
    }

    public synchronized void close() throws IOException {
        this.f53489g = true;
        this.f53485c.close();
    }

    /* renamed from: b */
    public synchronized void mo53768b(aaq aaq) throws IOException {
        if (!this.f53489g) {
            int i = 0;
            mo53758a(0, aaq.mo53782b() * 6, (byte) 4, (byte) 0);
            while (i < 10) {
                if (aaq.mo53781a(i)) {
                    this.f53485c.mo53894h(i == 4 ? 3 : i == 7 ? 4 : i);
                    this.f53485c.mo53891g(aaq.mo53783b(i));
                }
                i++;
            }
            this.f53485c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public synchronized void mo53763a(aaq aaq) throws IOException {
        if (!this.f53489g) {
            this.f53488f = aaq.mo53787d(this.f53488f);
            if (aaq.mo53784c() != -1) {
                this.f53484a.mo53686a(aaq.mo53784c());
            }
            mo53758a(0, 0, (byte) 4, (byte) 1);
            this.f53485c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: b */
    private void m50185b(int i, long j) throws IOException {
        while (j > 0) {
            int min = (int) Math.min((long) this.f53488f, j);
            long j2 = (long) min;
            j -= j2;
            mo53758a(i, min, (byte) 9, j == 0 ? (byte) 4 : 0);
            this.f53485c.mo53675a_(this.f53487e, j2);
        }
    }

    /* renamed from: a */
    public synchronized void mo53759a(int i, int i2, List<aag> list) throws IOException {
        if (!this.f53489g) {
            this.f53484a.mo53689a(list);
            long b = this.f53487e.mo53864b();
            int min = (int) Math.min((long) (this.f53488f - 4), b);
            long j = (long) min;
            int i3 = (b > j ? 1 : (b == j ? 0 : -1));
            mo53758a(i, min + 4, (byte) 5, i3 == 0 ? (byte) 4 : 0);
            this.f53485c.mo53891g(i2 & Integer.MAX_VALUE);
            this.f53485c.mo53675a_(this.f53487e, j);
            if (i3 > 0) {
                m50185b(i, b - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public synchronized void mo53761a(int i, aaf aaf) throws IOException {
        if (this.f53489g) {
            throw new IOException("closed");
        } else if (aaf.f53335l != -1) {
            mo53758a(i, 4, (byte) 3, (byte) 0);
            this.f53485c.mo53891g(aaf.f53335l);
            this.f53485c.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public synchronized void mo53765a(boolean z, int i, abi abi, int i2) throws IOException {
        if (!this.f53489g) {
            byte b = 0;
            if (z) {
                b = (byte) 1;
            }
            mo53757a(i, b, abi, i2);
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public void mo53757a(int i, byte b, abi abi, int i2) throws IOException {
        mo53758a(i, i2, (byte) 0, b);
        if (i2 > 0) {
            this.f53485c.mo53675a_(abi, (long) i2);
        }
    }

    /* renamed from: a */
    public synchronized void mo53764a(boolean z, int i, int i2) throws IOException {
        if (!this.f53489g) {
            mo53758a(0, 8, (byte) 6, z ? (byte) 1 : 0);
            this.f53485c.mo53891g(i);
            this.f53485c.mo53891g(i2);
            this.f53485c.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: a */
    public synchronized void mo53762a(int i, aaf aaf, byte[] bArr) throws IOException {
        if (this.f53489g) {
            throw new IOException("closed");
        } else if (aaf.f53335l != -1) {
            mo53758a(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f53485c.mo53891g(i);
            this.f53485c.mo53891g(aaf.f53335l);
            if (bArr.length > 0) {
                this.f53485c.mo53877c(bArr);
            }
            this.f53485c.flush();
        } else {
            throw aai.m50044a("errorCode.httpCode == -1", new Object[0]);
        }
    }

    /* renamed from: a */
    public synchronized void mo53760a(int i, long j) throws IOException {
        if (this.f53489g) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            throw aai.m50044a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        } else {
            mo53758a(i, 4, (byte) 8, (byte) 0);
            this.f53485c.mo53891g((int) j);
            this.f53485c.flush();
        }
    }

    /* renamed from: a */
    public void mo53758a(int i, int i2, byte b, byte b2) throws IOException {
        Logger logger = f53483b;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(aai.m50046a(false, i, i2, b, b2));
        }
        int i3 = this.f53488f;
        if (i2 > i3) {
            throw aai.m50044a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) == 0) {
            m50184a(this.f53485c, i2);
            this.f53485c.mo53899i(b & 255);
            this.f53485c.mo53899i(b2 & 255);
            this.f53485c.mo53891g(i & Integer.MAX_VALUE);
        } else {
            throw aai.m50044a("reserved bit set: %s", Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    private static void m50184a(abj abj, int i) throws IOException {
        abj.mo53899i((i >>> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        abj.mo53899i((i >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        abj.mo53899i(i & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
    }

    /* renamed from: a */
    public synchronized void mo53766a(boolean z, int i, List<aag> list) throws IOException {
        if (!this.f53489g) {
            this.f53484a.mo53689a(list);
            long b = this.f53487e.mo53864b();
            int min = (int) Math.min((long) this.f53488f, b);
            long j = (long) min;
            int i2 = (b > j ? 1 : (b == j ? 0 : -1));
            byte b2 = i2 == 0 ? (byte) 4 : 0;
            if (z) {
                b2 = (byte) (b2 | 1);
            }
            mo53758a(i, min, (byte) 1, b2);
            this.f53485c.mo53675a_(this.f53487e, j);
            if (i2 > 0) {
                m50185b(i, b - j);
            }
        } else {
            throw new IOException("closed");
        }
    }
}
