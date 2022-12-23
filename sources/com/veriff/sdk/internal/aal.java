package com.veriff.sdk.internal;

import com.veriff.sdk.internal.aah;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

final class aal implements Closeable {

    /* renamed from: a */
    public static final Logger f53446a = Logger.getLogger(aai.class.getName());

    /* renamed from: b */
    public final aah.C21286a f53447b;

    /* renamed from: c */
    private final abk f53448c;

    /* renamed from: d */
    private final C21304a f53449d;

    /* renamed from: e */
    private final boolean f53450e;

    /* renamed from: com.veriff.sdk.internal.aal$b */
    public interface C21305b {
        /* renamed from: a */
        void mo53721a();

        /* renamed from: a */
        void mo53722a(int i, int i2, int i3, boolean z);

        /* renamed from: a */
        void mo53723a(int i, int i2, List<aag> list) throws IOException;

        /* renamed from: a */
        void mo53724a(int i, long j);

        /* renamed from: a */
        void mo53725a(int i, aaf aaf);

        /* renamed from: a */
        void mo53726a(int i, aaf aaf, abl abl);

        /* renamed from: a */
        void mo53727a(boolean z, int i, int i2);

        /* renamed from: a */
        void mo53728a(boolean z, int i, int i2, List<aag> list);

        /* renamed from: a */
        void mo53729a(boolean z, int i, abk abk, int i2) throws IOException;

        /* renamed from: a */
        void mo53730a(boolean z, aaq aaq);
    }

    public aal(abk abk, boolean z) {
        this.f53448c = abk;
        this.f53450e = z;
        C21304a aVar = new C21304a(abk);
        this.f53449d = aVar;
        this.f53447b = new aah.C21286a(4096, aVar);
    }

    /* renamed from: b */
    private void m50132b(C21305b bVar, int i, byte b, int i2) throws IOException {
        boolean z;
        short s = 0;
        if (i2 != 0) {
            boolean z2 = true;
            if ((b & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((b & 32) == 0) {
                z2 = false;
            }
            if (!z2) {
                if ((b & 8) != 0) {
                    s = (short) (this.f53448c.mo53902j() & 255);
                }
                bVar.mo53729a(z, i2, this.f53448c, m50127a(i, b, s));
                this.f53448c.mo53900i((long) s);
                return;
            }
            throw aai.m50047b("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        throw aai.m50047b("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
    }

    /* renamed from: c */
    private void m50133c(C21305b bVar, int i, byte b, int i2) throws IOException {
        if (i != 5) {
            throw aai.m50047b("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
        } else if (i2 != 0) {
            m50130a(bVar, i2);
        } else {
            throw aai.m50047b("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
    }

    /* renamed from: d */
    private void m50134d(C21305b bVar, int i, byte b, int i2) throws IOException {
        if (i != 4) {
            throw aai.m50047b("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
        } else if (i2 != 0) {
            int l = this.f53448c.mo53906l();
            aaf a = aaf.m50016a(l);
            if (a != null) {
                bVar.mo53725a(i2, a);
            } else {
                throw aai.m50047b("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(l));
            }
        } else {
            throw aai.m50047b("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
    }

    /* renamed from: e */
    private void m50135e(C21305b bVar, int i, byte b, int i2) throws IOException {
        if (i2 != 0) {
            throw aai.m50047b("TYPE_SETTINGS streamId != 0", new Object[0]);
        } else if ((b & 1) != 0) {
            if (i == 0) {
                bVar.mo53721a();
                return;
            }
            throw aai.m50047b("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
        } else if (i % 6 == 0) {
            aaq aaq = new aaq();
            for (int i3 = 0; i3 < i; i3 += 6) {
                short k = this.f53448c.mo53905k() & 65535;
                int l = this.f53448c.mo53906l();
                if (k != 2) {
                    if (k == 3) {
                        k = 4;
                    } else if (k == 4) {
                        k = 7;
                        if (l < 0) {
                            throw aai.m50047b("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                    } else if (k == 5 && (l < 16384 || l > 16777215)) {
                        throw aai.m50047b("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(l));
                    }
                } else if (!(l == 0 || l == 1)) {
                    throw aai.m50047b("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                }
                aaq.mo53778a(k, l);
            }
            bVar.mo53730a(false, aaq);
        } else {
            throw aai.m50047b("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
        }
    }

    /* renamed from: f */
    private void m50136f(C21305b bVar, int i, byte b, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            if ((b & 8) != 0) {
                s = (short) (this.f53448c.mo53902j() & 255);
            }
            bVar.mo53723a(i2, this.f53448c.mo53906l() & Integer.MAX_VALUE, m50129a(m50127a(i - 4, b, s), s, b, i2));
            return;
        }
        throw aai.m50047b("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
    }

    /* renamed from: g */
    private void m50137g(C21305b bVar, int i, byte b, int i2) throws IOException {
        boolean z = false;
        if (i != 8) {
            throw aai.m50047b("TYPE_PING length != 8: %s", Integer.valueOf(i));
        } else if (i2 == 0) {
            int l = this.f53448c.mo53906l();
            int l2 = this.f53448c.mo53906l();
            if ((b & 1) != 0) {
                z = true;
            }
            bVar.mo53727a(z, l, l2);
        } else {
            throw aai.m50047b("TYPE_PING streamId != 0", new Object[0]);
        }
    }

    /* renamed from: h */
    private void m50138h(C21305b bVar, int i, byte b, int i2) throws IOException {
        if (i < 8) {
            throw aai.m50047b("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
        } else if (i2 == 0) {
            int l = this.f53448c.mo53906l();
            int l2 = this.f53448c.mo53906l();
            int i3 = i - 8;
            aaf a = aaf.m50016a(l2);
            if (a != null) {
                abl abl = abl.f53559b;
                if (i3 > 0) {
                    abl = this.f53448c.mo53883d((long) i3);
                }
                bVar.mo53726a(l, a, abl);
                return;
            }
            throw aai.m50047b("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(l2));
        } else {
            throw aai.m50047b("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
    }

    /* renamed from: i */
    private void m50139i(C21305b bVar, int i, byte b, int i2) throws IOException {
        if (i == 4) {
            long l = ((long) this.f53448c.mo53906l()) & 2147483647L;
            if (l != 0) {
                bVar.mo53724a(i2, l);
            } else {
                throw aai.m50047b("windowSizeIncrement was 0", Long.valueOf(l));
            }
        } else {
            throw aai.m50047b("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public void mo53732a(C21305b bVar) throws IOException {
        if (!this.f53450e) {
            abk abk = this.f53448c;
            abl abl = aai.f53364a;
            abl d = abk.mo53883d((long) abl.mo53946h());
            Logger logger = f53446a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C22766za.m55824a("<< CONNECTION %s", d.mo53944f()));
            }
            if (!abl.equals(d)) {
                throw aai.m50047b("Expected a connection header but was %s", d.mo53932a());
            }
        } else if (!mo53733a(true, bVar)) {
            throw aai.m50047b("Required SETTINGS preface not received", new Object[0]);
        }
    }

    public void close() throws IOException {
        this.f53448c.close();
    }

    /* renamed from: com.veriff.sdk.internal.aal$a */
    public static final class C21304a implements aca {

        /* renamed from: a */
        public int f53451a;

        /* renamed from: b */
        public byte f53452b;

        /* renamed from: c */
        public int f53453c;

        /* renamed from: d */
        public int f53454d;

        /* renamed from: e */
        public short f53455e;

        /* renamed from: f */
        private final abk f53456f;

        public C21304a(abk abk) {
            this.f53456f = abk;
        }

        /* renamed from: b */
        private void m50142b() throws IOException {
            int i = this.f53453c;
            int a = aal.m50128a(this.f53456f);
            this.f53454d = a;
            this.f53451a = a;
            byte j = (byte) (this.f53456f.mo53902j() & 255);
            this.f53452b = (byte) (this.f53456f.mo53902j() & 255);
            Logger logger = aal.f53446a;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(aai.m50046a(true, this.f53453c, this.f53451a, j, this.f53452b));
            }
            int l = this.f53456f.mo53906l() & Integer.MAX_VALUE;
            this.f53453c = l;
            if (j != 9) {
                throw aai.m50047b("%s != TYPE_CONTINUATION", Byte.valueOf(j));
            } else if (l != i) {
                throw aai.m50047b("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        /* renamed from: a */
        public long mo53671a(abi abi, long j) throws IOException {
            while (true) {
                int i = this.f53454d;
                if (i == 0) {
                    this.f53456f.mo53900i((long) this.f53455e);
                    this.f53455e = 0;
                    if ((this.f53452b & 4) != 0) {
                        return -1;
                    }
                    m50142b();
                } else {
                    long a = this.f53456f.mo53671a(abi, Math.min(j, (long) i));
                    if (a == -1) {
                        return -1;
                    }
                    this.f53454d = (int) (((long) this.f53454d) - a);
                    return a;
                }
            }
        }

        public void close() throws IOException {
        }

        /* renamed from: a */
        public acb mo53672a() {
            return this.f53456f.mo53672a();
        }
    }

    /* renamed from: a */
    public boolean mo53733a(boolean z, C21305b bVar) throws IOException {
        try {
            this.f53448c.mo53860a(9);
            int a = m50128a(this.f53448c);
            if (a < 0 || a > 16384) {
                throw aai.m50047b("FRAME_SIZE_ERROR: %s", Integer.valueOf(a));
            }
            byte j = (byte) (this.f53448c.mo53902j() & 255);
            if (!z || j == 4) {
                byte j2 = (byte) (this.f53448c.mo53902j() & 255);
                int l = this.f53448c.mo53906l() & Integer.MAX_VALUE;
                Logger logger = f53446a;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(aai.m50046a(true, l, a, j, j2));
                }
                switch (j) {
                    case 0:
                        m50132b(bVar, a, j2, l);
                        break;
                    case 1:
                        m50131a(bVar, a, j2, l);
                        break;
                    case 2:
                        m50133c(bVar, a, j2, l);
                        break;
                    case 3:
                        m50134d(bVar, a, j2, l);
                        break;
                    case 4:
                        m50135e(bVar, a, j2, l);
                        break;
                    case 5:
                        m50136f(bVar, a, j2, l);
                        break;
                    case 6:
                        m50137g(bVar, a, j2, l);
                        break;
                    case 7:
                        m50138h(bVar, a, j2, l);
                        break;
                    case 8:
                        m50139i(bVar, a, j2, l);
                        break;
                    default:
                        this.f53448c.mo53900i((long) a);
                        break;
                }
                return true;
            }
            throw aai.m50047b("Expected a SETTINGS frame but was %s", Byte.valueOf(j));
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private void m50131a(C21305b bVar, int i, byte b, int i2) throws IOException {
        short s = 0;
        if (i2 != 0) {
            boolean z = (b & 1) != 0;
            if ((b & 8) != 0) {
                s = (short) (this.f53448c.mo53902j() & 255);
            }
            if ((b & 32) != 0) {
                m50130a(bVar, i2);
                i -= 5;
            }
            bVar.mo53728a(z, i2, -1, m50129a(m50127a(i, b, s), s, b, i2));
            return;
        }
        throw aai.m50047b("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
    }

    /* renamed from: a */
    private List<aag> m50129a(int i, short s, byte b, int i2) throws IOException {
        C21304a aVar = this.f53449d;
        aVar.f53454d = i;
        aVar.f53451a = i;
        aVar.f53455e = s;
        aVar.f53452b = b;
        aVar.f53453c = i2;
        this.f53447b.mo53683a();
        return this.f53447b.mo53684b();
    }

    /* renamed from: a */
    private void m50130a(C21305b bVar, int i) throws IOException {
        int l = this.f53448c.mo53906l();
        bVar.mo53722a(i, l & Integer.MAX_VALUE, (this.f53448c.mo53902j() & 255) + 1, (Integer.MIN_VALUE & l) != 0);
    }

    /* renamed from: a */
    public static int m50128a(abk abk) throws IOException {
        return (abk.mo53902j() & 255) | ((abk.mo53902j() & 255) << 16) | ((abk.mo53902j() & 255) << 8);
    }

    /* renamed from: a */
    public static int m50127a(int i, byte b, short s) throws IOException {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw aai.m50047b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }
}
