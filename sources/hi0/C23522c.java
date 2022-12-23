package hi0;

import com.usebutton.sdk.internal.util.UrlPrivacyValidator;
import hi0.C23556q;
import ii0.C23609c;
import ii0.C23610d;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import ji0.C23739c;
import ji0.C23741e;
import ji0.C23749h;
import li0.C24318e;
import li0.C24323j;
import okhttp3.Protocol;
import okhttp3.TlsVersion;
import okio.ByteString;
import pi0.C24721f;
import si0.C24887a0;
import si0.C24893c0;
import si0.C24898f;
import si0.C24902i;
import si0.C24904k;
import si0.C24905l;
import si0.C24911r;
import si0.C24917w;
import si0.C24918x;

/* renamed from: hi0.c */
public final class C23522c implements Closeable, Flushable {

    /* renamed from: b */
    public final C23523a f59383b = new C23523a();

    /* renamed from: c */
    public final C23741e f59384c;

    /* renamed from: hi0.c$a */
    public class C23523a implements C23749h {
        public C23523a() {
        }
    }

    /* renamed from: hi0.c$b */
    public final class C23524b implements C23739c {

        /* renamed from: a */
        public final C23741e.C23743b f59386a;

        /* renamed from: b */
        public C24887a0 f59387b;

        /* renamed from: c */
        public C23525a f59388c;

        /* renamed from: d */
        public boolean f59389d;

        /* renamed from: hi0.c$b$a */
        public class C23525a extends C24904k {

            /* renamed from: c */
            public final /* synthetic */ C23741e.C23743b f59391c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C23525a(C24887a0 a0Var, C23741e.C23743b bVar) {
                super(a0Var);
                this.f59391c = bVar;
            }

            public final void close() throws IOException {
                synchronized (C23522c.this) {
                    C23524b bVar = C23524b.this;
                    if (!bVar.f59389d) {
                        bVar.f59389d = true;
                        C23522c.this.getClass();
                        super.close();
                        this.f59391c.mo58992b();
                    }
                }
            }
        }

        public C23524b(C23741e.C23743b bVar) {
            this.f59386a = bVar;
            C24887a0 d = bVar.mo58994d(1);
            this.f59387b = d;
            this.f59388c = new C23525a(d, bVar);
        }

        /* renamed from: a */
        public final void mo58633a() {
            synchronized (C23522c.this) {
                if (!this.f59389d) {
                    this.f59389d = true;
                    C23522c.this.getClass();
                    C23610d.m57796d(this.f59387b);
                    try {
                        this.f59386a.mo58991a();
                    } catch (IOException unused) {
                    }
                }
            }
        }
    }

    /* renamed from: hi0.c$c */
    public static class C23526c extends C23536e0 {

        /* renamed from: c */
        public final C23741e.C23746d f59393c;

        /* renamed from: d */
        public final C24918x f59394d;

        /* renamed from: e */
        public final String f59395e;

        /* renamed from: f */
        public final String f59396f;

        /* renamed from: hi0.c$c$a */
        public class C23527a extends C24905l {

            /* renamed from: c */
            public final /* synthetic */ C23741e.C23746d f59397c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C23527a(C24893c0 c0Var, C23741e.C23746d dVar) {
                super(c0Var);
                this.f59397c = dVar;
            }

            public final void close() throws IOException {
                this.f59397c.close();
                super.close();
            }
        }

        public C23526c(C23741e.C23746d dVar, String str, String str2) {
            this.f59393c = dVar;
            this.f59395e = str;
            this.f59396f = str2;
            this.f59394d = C24911r.m62547c(new C23527a(dVar.f60006d[1], dVar));
        }

        /* renamed from: i */
        public final long mo53598i() {
            try {
                String str = this.f59396f;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        /* renamed from: q */
        public final C23562t mo53599q() {
            String str = this.f59395e;
            if (str != null) {
                return C23562t.m57743c(str);
            }
            return null;
        }

        /* renamed from: t */
        public final C24902i mo53600t() {
            return this.f59394d;
        }
    }

    public C23522c(File file) {
        Pattern pattern = C23741e.f59969v;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        byte[] bArr = C23610d.f59684a;
        this.f59384c = new C23741e(file, new ThreadPoolExecutor(0, 1, 60, timeUnit, linkedBlockingQueue, new C23609c("OkHttp DiskLruCache", true)));
    }

    /* renamed from: f */
    public static String m57651f(C23558r rVar) {
        String str = rVar.f59542i;
        ByteString byteString = ByteString.f62330d;
        return ByteString.C24633a.m61918a(str).mo60871i("MD5").mo60874l();
    }

    /* renamed from: g */
    public static int m57652g(C24918x xVar) throws IOException {
        try {
            long i = xVar.mo61465i();
            String z0 = xVar.mo61440z0();
            if (i >= 0 && i <= 2147483647L && z0.isEmpty()) {
                return (int) i;
            }
            throw new IOException("expected an int but was \"" + i + z0 + "\"");
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    public final void close() throws IOException {
        this.f59384c.close();
    }

    /* renamed from: e */
    public final void mo58630e() throws IOException {
        C23741e eVar = this.f59384c;
        synchronized (eVar) {
            eVar.mo58981i();
            for (C23741e.C23745c y : (C23741e.C23745c[]) eVar.f59980l.values().toArray(new C23741e.C23745c[eVar.f59980l.size()])) {
                eVar.mo58988y(y);
            }
            eVar.f59985q = false;
        }
    }

    public final void flush() throws IOException {
        this.f59384c.flush();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58632h(hi0.C23571x r7) throws java.io.IOException {
        /*
            r6 = this;
            ji0.e r0 = r6.f59384c
            hi0.r r7 = r7.f59636a
            java.lang.String r7 = m57651f(r7)
            monitor-enter(r0)
            r0.mo58981i()     // Catch:{ all -> 0x002e }
            r0.mo58976e()     // Catch:{ all -> 0x002e }
            ji0.C23741e.m58307A(r7)     // Catch:{ all -> 0x002e }
            java.util.LinkedHashMap<java.lang.String, ji0.e$c> r1 = r0.f59980l     // Catch:{ all -> 0x002e }
            java.lang.Object r7 = r1.get(r7)     // Catch:{ all -> 0x002e }
            ji0.e$c r7 = (ji0.C23741e.C23745c) r7     // Catch:{ all -> 0x002e }
            r1 = 0
            if (r7 != 0) goto L_0x001f
            monitor-exit(r0)
            goto L_0x002d
        L_0x001f:
            r0.mo58988y(r7)     // Catch:{ all -> 0x002e }
            long r2 = r0.f59978j     // Catch:{ all -> 0x002e }
            long r4 = r0.f59976h     // Catch:{ all -> 0x002e }
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L_0x002c
            r0.f59985q = r1     // Catch:{ all -> 0x002e }
        L_0x002c:
            monitor-exit(r0)
        L_0x002d:
            return
        L_0x002e:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: hi0.C23522c.mo58632h(hi0.x):void");
    }

    /* renamed from: hi0.c$d */
    public static final class C23528d {

        /* renamed from: k */
        public static final String f59398k = "OkHttp-Sent-Millis";

        /* renamed from: l */
        public static final String f59399l = "OkHttp-Received-Millis";

        /* renamed from: a */
        public final String f59400a;

        /* renamed from: b */
        public final C23556q f59401b;

        /* renamed from: c */
        public final String f59402c;

        /* renamed from: d */
        public final Protocol f59403d;

        /* renamed from: e */
        public final int f59404e;

        /* renamed from: f */
        public final String f59405f;

        /* renamed from: g */
        public final C23556q f59406g;

        /* renamed from: h */
        public final C23555p f59407h;

        /* renamed from: i */
        public final long f59408i;

        /* renamed from: j */
        public final long f59409j;

        static {
            C24721f fVar = C24721f.f62584a;
            fVar.getClass();
            fVar.getClass();
        }

        public C23528d(C24893c0 c0Var) throws IOException {
            TlsVersion tlsVersion;
            try {
                C24918x c = C24911r.m62547c(c0Var);
                this.f59400a = c.mo61440z0();
                this.f59402c = c.mo61440z0();
                C23556q.C23557a aVar = new C23556q.C23557a();
                int g = C23522c.m57652g(c);
                for (int i = 0; i < g; i++) {
                    aVar.mo58691b(c.mo61440z0());
                }
                this.f59401b = new C23556q(aVar);
                C24323j a = C24323j.m61070a(c.mo61440z0());
                this.f59403d = a.f61628a;
                this.f59404e = a.f61629b;
                this.f59405f = a.f61630c;
                C23556q.C23557a aVar2 = new C23556q.C23557a();
                int g2 = C23522c.m57652g(c);
                for (int i2 = 0; i2 < g2; i2++) {
                    aVar2.mo58691b(c.mo61440z0());
                }
                String str = f59398k;
                String d = aVar2.mo58693d(str);
                String str2 = f59399l;
                String d2 = aVar2.mo58693d(str2);
                aVar2.mo58694e(str);
                aVar2.mo58694e(str2);
                long j = 0;
                this.f59408i = d != null ? Long.parseLong(d) : 0;
                this.f59409j = d2 != null ? Long.parseLong(d2) : j;
                this.f59406g = new C23556q(aVar2);
                if (this.f59400a.startsWith(UrlPrivacyValidator.HTTPS_SCHEME)) {
                    String z0 = c.mo61440z0();
                    if (z0.length() <= 0) {
                        C23542h a2 = C23542h.m57686a(c.mo61440z0());
                        List a3 = m57659a(c);
                        List a4 = m57659a(c);
                        if (!c.mo61415l1()) {
                            tlsVersion = TlsVersion.forJavaName(c.mo61440z0());
                        } else {
                            tlsVersion = TlsVersion.SSL_3_0;
                        }
                        if (tlsVersion != null) {
                            this.f59407h = new C23555p(tlsVersion, a2, C23610d.m57804l(a3), C23610d.m57804l(a4));
                        } else {
                            throw new NullPointerException("tlsVersion == null");
                        }
                    } else {
                        throw new IOException("expected \"\" but was \"" + z0 + "\"");
                    }
                } else {
                    this.f59407h = null;
                }
            } finally {
                c0Var.close();
            }
        }

        /* renamed from: a */
        public static List m57659a(C24918x xVar) throws IOException {
            int g = C23522c.m57652g(xVar);
            if (g == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(g);
                for (int i = 0; i < g; i++) {
                    String z0 = xVar.mo61440z0();
                    C24898f fVar = new C24898f();
                    fVar.mo61393U(ByteString.m61902g(z0));
                    arrayList.add(instance.generateCertificate(new C24898f.C24899a(fVar)));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: b */
        public static void m57660b(C24917w wVar, List list) throws IOException {
            try {
                wVar.mo61386O0((long) list.size());
                wVar.writeByte(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    wVar.mo61387Q(ByteString.m61904o(((Certificate) list.get(i)).getEncoded()).mo60869f());
                    wVar.writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: c */
        public final void mo58636c(C23741e.C23743b bVar) throws IOException {
            String str;
            C24917w wVar = new C24917w(bVar.mo58994d(0));
            wVar.mo61387Q(this.f59400a);
            wVar.writeByte(10);
            wVar.mo61387Q(this.f59402c);
            wVar.writeByte(10);
            wVar.mo61386O0((long) (this.f59401b.f59531a.length / 2));
            wVar.writeByte(10);
            int length = this.f59401b.f59531a.length / 2;
            for (int i = 0; i < length; i++) {
                wVar.mo61387Q(this.f59401b.mo58683d(i));
                wVar.mo61387Q(": ");
                wVar.mo61387Q(this.f59401b.mo58686g(i));
                wVar.writeByte(10);
            }
            Protocol protocol = this.f59403d;
            int i2 = this.f59404e;
            String str2 = this.f59405f;
            StringBuilder sb = new StringBuilder();
            if (protocol == Protocol.HTTP_1_0) {
                str = "HTTP/1.0";
            } else {
                str = "HTTP/1.1";
            }
            sb.append(str);
            sb.append(' ');
            sb.append(i2);
            if (str2 != null) {
                sb.append(' ');
                sb.append(str2);
            }
            wVar.mo61387Q(sb.toString());
            wVar.writeByte(10);
            wVar.mo61386O0((long) ((this.f59406g.f59531a.length / 2) + 2));
            wVar.writeByte(10);
            int length2 = this.f59406g.f59531a.length / 2;
            for (int i3 = 0; i3 < length2; i3++) {
                wVar.mo61387Q(this.f59406g.mo58683d(i3));
                wVar.mo61387Q(": ");
                wVar.mo61387Q(this.f59406g.mo58686g(i3));
                wVar.writeByte(10);
            }
            wVar.mo61387Q(f59398k);
            wVar.mo61387Q(": ");
            wVar.mo61386O0(this.f59408i);
            wVar.writeByte(10);
            wVar.mo61387Q(f59399l);
            wVar.mo61387Q(": ");
            wVar.mo61386O0(this.f59409j);
            wVar.writeByte(10);
            if (this.f59400a.startsWith(UrlPrivacyValidator.HTTPS_SCHEME)) {
                wVar.writeByte(10);
                wVar.mo61387Q(this.f59407h.f59528b.f59489a);
                wVar.writeByte(10);
                m57660b(wVar, this.f59407h.f59529c);
                m57660b(wVar, this.f59407h.f59530d);
                wVar.mo61387Q(this.f59407h.f59527a.javaName());
                wVar.writeByte(10);
            }
            wVar.close();
        }

        public C23528d(C23529c0 c0Var) {
            C23556q qVar;
            this.f59400a = c0Var.f59410b.f59636a.f59542i;
            int i = C24318e.f61613a;
            C23556q qVar2 = c0Var.f59417i.f59410b.f59638c;
            Set<String> f = C24318e.m61061f(c0Var.f59415g);
            if (f.isEmpty()) {
                qVar = C23610d.f59686c;
            } else {
                C23556q.C23557a aVar = new C23556q.C23557a();
                int length = qVar2.f59531a.length / 2;
                for (int i2 = 0; i2 < length; i2++) {
                    String d = qVar2.mo58683d(i2);
                    if (f.contains(d)) {
                        aVar.mo58690a(d, qVar2.mo58686g(i2));
                    }
                }
                qVar = new C23556q(aVar);
            }
            this.f59401b = qVar;
            this.f59402c = c0Var.f59410b.f59637b;
            this.f59403d = c0Var.f59411c;
            this.f59404e = c0Var.f59412d;
            this.f59405f = c0Var.f59413e;
            this.f59406g = c0Var.f59415g;
            this.f59407h = c0Var.f59414f;
            this.f59408i = c0Var.f59420l;
            this.f59409j = c0Var.f59421m;
        }
    }
}
