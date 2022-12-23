package hi0;

import ii0.C23610d;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import mf0.C24362h;
import si0.C24898f;
import si0.C24902i;

/* renamed from: hi0.e0 */
public abstract class C23536e0 implements Closeable {

    /* renamed from: b */
    public C23537a f59456b;

    /* renamed from: hi0.e0$a */
    public static final class C23537a extends Reader {

        /* renamed from: b */
        public final C24902i f59457b;

        /* renamed from: c */
        public final Charset f59458c;

        /* renamed from: d */
        public boolean f59459d;

        /* renamed from: e */
        public InputStreamReader f59460e;

        public C23537a(C24902i iVar, Charset charset) {
            this.f59457b = iVar;
            this.f59458c = charset;
        }

        public final void close() throws IOException {
            this.f59459d = true;
            InputStreamReader inputStreamReader = this.f59460e;
            if (inputStreamReader != null) {
                inputStreamReader.close();
            } else {
                this.f59457b.close();
            }
        }

        public final int read(char[] cArr, int i, int i2) throws IOException {
            if (!this.f59459d) {
                InputStreamReader inputStreamReader = this.f59460e;
                if (inputStreamReader == null) {
                    InputStreamReader inputStreamReader2 = new InputStreamReader(this.f59457b.mo61411h2(), C23610d.m57793a(this.f59457b, this.f59458c));
                    this.f59460e = inputStreamReader2;
                    inputStreamReader = inputStreamReader2;
                }
                return inputStreamReader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m57675a(Throwable th, C24902i iVar) {
        if (th != null) {
            try {
                iVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            iVar.close();
        }
    }

    /* renamed from: r */
    public static C23533d0 m57676r(String str, C23562t tVar) {
        Charset charset = StandardCharsets.UTF_8;
        if (tVar != null && (charset = tVar.mo58710a((Charset) null)) == null) {
            charset = StandardCharsets.UTF_8;
            tVar = C23562t.m57743c(tVar + "; charset=utf-8");
        }
        C24898f fVar = new C24898f();
        C24362h.m61211f(charset, "charset");
        fVar.mo61402a0(str, 0, str.length(), charset);
        return new C23533d0(tVar, fVar.f62947c, fVar);
    }

    public void close() {
        C23610d.m57796d(mo53600t());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (r2 != null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        m57675a(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        throw r1;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo58648e() throws java.io.IOException {
        /*
            r6 = this;
            long r0 = r6.mo53598i()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0043
            si0.i r2 = r6.mo53600t()
            r3 = 0
            byte[] r4 = r2.mo61408f1()     // Catch:{ all -> 0x003a }
            m57675a(r3, r2)
            r2 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x0039
            int r2 = r4.length
            long r2 = (long) r2
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x0024
            goto L_0x0039
        L_0x0024:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Content-Length ("
            java.lang.String r5 = ") and stream length ("
            java.lang.StringBuilder r0 = p379.C16759e.m42351g(r3, r0, r5)
            int r1 = r4.length
            java.lang.String r3 = ") disagree"
            java.lang.String r0 = p358af.C13437d.m33707l(r0, r1, r3)
            r2.<init>(r0)
            throw r2
        L_0x0039:
            return r4
        L_0x003a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003c }
        L_0x003c:
            r1 = move-exception
            if (r2 == 0) goto L_0x0042
            m57675a(r0, r2)
        L_0x0042:
            throw r1
        L_0x0043:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Cannot buffer entire body for content length: "
            java.lang.String r0 = p001a0.C0016g.m29l(r3, r0)
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: hi0.C23536e0.mo58648e():byte[]");
    }

    /* renamed from: i */
    public abstract long mo53598i();

    /* renamed from: q */
    public abstract C23562t mo53599q();

    /* renamed from: t */
    public abstract C24902i mo53600t();

    /* renamed from: v */
    public final String mo58649v() throws IOException {
        Charset charset;
        C24902i t = mo53600t();
        try {
            C23562t q = mo53599q();
            if (q != null) {
                charset = q.mo58710a(StandardCharsets.UTF_8);
            } else {
                charset = StandardCharsets.UTF_8;
            }
            String A1 = t.mo61375A1(C23610d.m57793a(t, charset));
            m57675a((Throwable) null, t);
            return A1;
        } catch (Throwable th) {
            if (t != null) {
                m57675a(th, t);
            }
            throw th;
        }
    }
}
