package com.veriff.sdk.internal;

import com.amazonaws.http.HttpHeader;
import com.usebutton.sdk.internal.util.UrlPrivacyValidator;
import com.veriff.sdk.internal.C22736yk;
import com.veriff.sdk.internal.C22752ys;
import com.veriff.sdk.internal.C22757yu;
import com.veriff.sdk.internal.C22773zf;
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

/* renamed from: com.veriff.sdk.internal.xu */
public final class C22704xu implements Closeable, Flushable {

    /* renamed from: a */
    public final C22781zh f57398a;

    /* renamed from: b */
    public final C22773zf f57399b;

    /* renamed from: c */
    public int f57400c;

    /* renamed from: d */
    public int f57401d;

    /* renamed from: e */
    private int f57402e;

    /* renamed from: f */
    private int f57403f;

    /* renamed from: g */
    private int f57404g;

    /* renamed from: com.veriff.sdk.internal.xu$a */
    public final class C22706a implements C22770zd {

        /* renamed from: a */
        public boolean f57406a;

        /* renamed from: c */
        private final C22773zf.C22776a f57408c;

        /* renamed from: d */
        private abz f57409d;

        /* renamed from: e */
        private abz f57410e;

        public C22706a(C22773zf.C22776a aVar) {
            this.f57408c = aVar;
            abz a = aVar.mo57477a(1);
            this.f57409d = a;
            this.f57410e = new abm(a, C22704xu.this, aVar) {

                /* renamed from: b */
                public final /* synthetic */ C22773zf.C22776a f57411b;

                {
                    this.f57411b = r4;
                }

                public void close() throws IOException {
                    synchronized (C22704xu.this) {
                        C22706a aVar = C22706a.this;
                        if (!aVar.f57406a) {
                            aVar.f57406a = true;
                            C22704xu.this.f57400c++;
                            super.close();
                            this.f57411b.mo57479b();
                        }
                    }
                }
            };
        }

        /* renamed from: a */
        public void mo57166a() {
            synchronized (C22704xu.this) {
                if (!this.f57406a) {
                    this.f57406a = true;
                    C22704xu.this.f57401d++;
                    C22766za.m55834a((Closeable) this.f57409d);
                    try {
                        this.f57408c.mo57480c();
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* renamed from: b */
        public abz mo57167b() {
            return this.f57410e;
        }
    }

    /* renamed from: com.veriff.sdk.internal.xu$b */
    public static class C22708b extends C22759yv {

        /* renamed from: a */
        public final C22773zf.C22779c f57413a;

        /* renamed from: b */
        private final abk f57414b;

        /* renamed from: c */
        private final String f57415c;

        /* renamed from: d */
        private final String f57416d;

        public C22708b(final C22773zf.C22779c cVar, String str, String str2) {
            this.f57413a = cVar;
            this.f57415c = str;
            this.f57416d = str2;
            this.f57414b = abr.m50508a((aca) new abn(this, cVar.mo57484a(1)) {
                public void close() throws IOException {
                    cVar.close();
                    super.close();
                }
            });
        }

        /* renamed from: a */
        public C22742yn mo54031a() {
            String str = this.f57415c;
            if (str != null) {
                return C22742yn.m55640b(str);
            }
            return null;
        }

        /* renamed from: b */
        public long mo54032b() {
            try {
                String str = this.f57416d;
                if (str != null) {
                    return Long.parseLong(str);
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        /* renamed from: c */
        public abk mo54033c() {
            return this.f57414b;
        }
    }

    public C22704xu(File file, long j) {
        this(file, j, aas.f53501a);
    }

    /* renamed from: a */
    public static String m55410a(C22738yl ylVar) {
        return abl.m50461a(ylVar.toString()).mo53939c().mo53944f();
    }

    /* renamed from: b */
    public void mo57157b(C22752ys ysVar) throws IOException {
        this.f57399b.mo57469c(m55410a(ysVar.mo57390a()));
    }

    public void close() throws IOException {
        this.f57399b.close();
    }

    public void flush() throws IOException {
        this.f57399b.flush();
    }

    public C22704xu(File file, long j, aas aas) {
        this.f57398a = new C22781zh() {
            /* renamed from: a */
            public C22757yu mo57160a(C22752ys ysVar) throws IOException {
                return C22704xu.this.mo57152a(ysVar);
            }

            /* renamed from: b */
            public void mo57165b(C22752ys ysVar) throws IOException {
                C22704xu.this.mo57157b(ysVar);
            }

            /* renamed from: a */
            public C22770zd mo57161a(C22757yu yuVar) throws IOException {
                return C22704xu.this.mo57153a(yuVar);
            }

            /* renamed from: a */
            public void mo57163a(C22757yu yuVar, C22757yu yuVar2) {
                C22704xu.this.mo57155a(yuVar, yuVar2);
            }

            /* renamed from: a */
            public void mo57162a() {
                C22704xu.this.mo57154a();
            }

            /* renamed from: a */
            public void mo57164a(C22771ze zeVar) {
                C22704xu.this.mo57156a(zeVar);
            }
        };
        this.f57399b = C22773zf.m55871a(aas, file, 201105, 2, j);
    }

    /* renamed from: a */
    public C22757yu mo57152a(C22752ys ysVar) {
        try {
            C22773zf.C22779c a = this.f57399b.mo57462a(m55410a(ysVar.mo57390a()));
            if (a == null) {
                return null;
            }
            try {
                C22710c cVar = new C22710c(a.mo57484a(0));
                C22757yu a2 = cVar.mo57168a(a);
                if (cVar.mo57170a(ysVar, a2)) {
                    return a2;
                }
                C22766za.m55834a((Closeable) a2.mo57424h());
                return null;
            } catch (IOException unused) {
                C22766za.m55834a((Closeable) a);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public C22770zd mo57153a(C22757yu yuVar) {
        C22773zf.C22776a aVar;
        String b = yuVar.mo57414a().mo57393b();
        if (C22803zx.m56037a(yuVar.mo57414a().mo57393b())) {
            try {
                mo57157b(yuVar.mo57414a());
            } catch (IOException unused) {
            }
            return null;
        } else if (!b.equals("GET") || C22802zw.m56032b(yuVar)) {
            return null;
        } else {
            C22710c cVar = new C22710c(yuVar);
            try {
                aVar = this.f57399b.mo57466b(m55410a(yuVar.mo57414a().mo57390a()));
                if (aVar == null) {
                    return null;
                }
                try {
                    cVar.mo57169a(aVar);
                    return new C22706a(aVar);
                } catch (IOException unused2) {
                    m55411a(aVar);
                    return null;
                }
            } catch (IOException unused3) {
                aVar = null;
                m55411a(aVar);
                return null;
            }
        }
    }

    /* renamed from: a */
    public void mo57155a(C22757yu yuVar, C22757yu yuVar2) {
        C22773zf.C22776a aVar;
        C22710c cVar = new C22710c(yuVar2);
        try {
            aVar = ((C22708b) yuVar.mo57424h()).f57413a.mo57485a();
            if (aVar != null) {
                try {
                    cVar.mo57169a(aVar);
                    aVar.mo57479b();
                } catch (IOException unused) {
                }
            }
        } catch (IOException unused2) {
            aVar = null;
            m55411a(aVar);
        }
    }

    /* renamed from: a */
    private void m55411a(C22773zf.C22776a aVar) {
        if (aVar != null) {
            try {
                aVar.mo57480c();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public synchronized void mo57156a(C22771ze zeVar) {
        this.f57404g++;
        if (zeVar.f57707a != null) {
            this.f57402e++;
        } else if (zeVar.f57708b != null) {
            this.f57403f++;
        }
    }

    /* renamed from: a */
    public synchronized void mo57154a() {
        this.f57403f++;
    }

    /* renamed from: a */
    public static int m55409a(abk abk) throws IOException {
        try {
            long o = abk.mo53911o();
            String s = abk.mo53916s();
            if (o >= 0 && o <= 2147483647L && s.isEmpty()) {
                return (int) o;
            }
            throw new IOException("expected an int but was \"" + o + s + "\"");
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* renamed from: com.veriff.sdk.internal.xu$c */
    public static final class C22710c {

        /* renamed from: a */
        private static final String f57418a = (aay.m50281e().mo53817f() + "-Sent-Millis");

        /* renamed from: b */
        private static final String f57419b = (aay.m50281e().mo53817f() + "-Received-Millis");

        /* renamed from: c */
        private final String f57420c;

        /* renamed from: d */
        private final C22736yk f57421d;

        /* renamed from: e */
        private final String f57422e;

        /* renamed from: f */
        private final C22749yq f57423f;

        /* renamed from: g */
        private final int f57424g;

        /* renamed from: h */
        private final String f57425h;

        /* renamed from: i */
        private final C22736yk f57426i;

        /* renamed from: j */
        private final C22735yj f57427j;

        /* renamed from: k */
        private final long f57428k;

        /* renamed from: l */
        private final long f57429l;

        public C22710c(aca aca) throws IOException {
            C22762yx yxVar;
            try {
                abk a = abr.m50508a(aca);
                this.f57420c = a.mo53916s();
                this.f57422e = a.mo53916s();
                C22736yk.C22737a aVar = new C22736yk.C22737a();
                int a2 = C22704xu.m55409a(a);
                for (int i = 0; i < a2; i++) {
                    aVar.mo57275a(a.mo53916s());
                }
                this.f57421d = aVar.mo57277a();
                aac a3 = aac.m49975a(a.mo53916s());
                this.f57423f = a3.f53297a;
                this.f57424g = a3.f53298b;
                this.f57425h = a3.f53299c;
                C22736yk.C22737a aVar2 = new C22736yk.C22737a();
                int a4 = C22704xu.m55409a(a);
                for (int i2 = 0; i2 < a4; i2++) {
                    aVar2.mo57275a(a.mo53916s());
                }
                String str = f57418a;
                String c = aVar2.mo57281c(str);
                String str2 = f57419b;
                String c2 = aVar2.mo57281c(str2);
                aVar2.mo57278b(str);
                aVar2.mo57278b(str2);
                long j = 0;
                this.f57428k = c != null ? Long.parseLong(c) : 0;
                this.f57429l = c2 != null ? Long.parseLong(c2) : j;
                this.f57426i = aVar2.mo57277a();
                if (m55431a()) {
                    String s = a.mo53916s();
                    if (s.length() <= 0) {
                        C22719xz a5 = C22719xz.m55468a(a.mo53916s());
                        List<Certificate> a6 = m55429a(a);
                        List<Certificate> a7 = m55429a(a);
                        if (!a.mo53890f()) {
                            yxVar = C22762yx.m55796a(a.mo53916s());
                        } else {
                            yxVar = C22762yx.SSL_3_0;
                        }
                        this.f57427j = C22735yj.m55545a(yxVar, a5, a6, a7);
                    } else {
                        throw new IOException("expected \"\" but was \"" + s + "\"");
                    }
                } else {
                    this.f57427j = null;
                }
            } finally {
                aca.close();
            }
        }

        /* renamed from: a */
        public void mo57169a(C22773zf.C22776a aVar) throws IOException {
            abj a = abr.m50507a(aVar.mo57477a(0));
            a.mo53870b(this.f57420c).mo53899i(10);
            a.mo53870b(this.f57422e).mo53899i(10);
            a.mo53908m((long) this.f57421d.mo57265a()).mo53899i(10);
            int a2 = this.f57421d.mo57265a();
            for (int i = 0; i < a2; i++) {
                a.mo53870b(this.f57421d.mo57266a(i)).mo53870b(": ").mo53870b(this.f57421d.mo57269b(i)).mo53899i(10);
            }
            a.mo53870b(new aac(this.f57423f, this.f57424g, this.f57425h).toString()).mo53899i(10);
            a.mo53908m((long) (this.f57426i.mo57265a() + 2)).mo53899i(10);
            int a3 = this.f57426i.mo57265a();
            for (int i2 = 0; i2 < a3; i2++) {
                a.mo53870b(this.f57426i.mo57266a(i2)).mo53870b(": ").mo53870b(this.f57426i.mo57269b(i2)).mo53899i(10);
            }
            a.mo53870b(f57418a).mo53870b(": ").mo53908m(this.f57428k).mo53899i(10);
            a.mo53870b(f57419b).mo53870b(": ").mo53908m(this.f57429l).mo53899i(10);
            if (m55431a()) {
                a.mo53899i(10);
                a.mo53870b(this.f57427j.mo57259b().mo57202a()).mo53899i(10);
                m55430a(a, this.f57427j.mo57260c());
                m55430a(a, this.f57427j.mo57261d());
                a.mo53870b(this.f57427j.mo57258a().mo57456a()).mo53899i(10);
            }
            a.close();
        }

        /* renamed from: a */
        private boolean m55431a() {
            return this.f57420c.startsWith(UrlPrivacyValidator.HTTPS_SCHEME);
        }

        public C22710c(C22757yu yuVar) {
            this.f57420c = yuVar.mo57414a().mo57390a().toString();
            this.f57421d = C22802zw.m56033c(yuVar);
            this.f57422e = yuVar.mo57414a().mo57393b();
            this.f57423f = yuVar.mo57417b();
            this.f57424g = yuVar.mo57418c();
            this.f57425h = yuVar.mo57421e();
            this.f57426i = yuVar.mo57423g();
            this.f57427j = yuVar.mo57422f();
            this.f57428k = yuVar.mo57430n();
            this.f57429l = yuVar.mo57431o();
        }

        /* renamed from: a */
        private List<Certificate> m55429a(abk abk) throws IOException {
            int a = C22704xu.m55409a(abk);
            if (a == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(a);
                for (int i = 0; i < a; i++) {
                    String s = abk.mo53916s();
                    abi abi = new abi();
                    abi.mo53882d(abl.m50463b(s));
                    arrayList.add(instance.generateCertificate(abi.mo53895h()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: a */
        private void m55430a(abj abj, List<Certificate> list) throws IOException {
            try {
                abj.mo53908m((long) list.size()).mo53899i(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    abj.mo53870b(abl.m50462a(list.get(i).getEncoded()).mo53938b()).mo53899i(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        /* renamed from: a */
        public boolean mo57170a(C22752ys ysVar, C22757yu yuVar) {
            return this.f57420c.equals(ysVar.mo57390a().toString()) && this.f57422e.equals(ysVar.mo57393b()) && C22802zw.m56029a(yuVar, this.f57421d, ysVar);
        }

        /* renamed from: a */
        public C22757yu mo57168a(C22773zf.C22779c cVar) {
            String a = this.f57426i.mo57267a(HttpHeader.CONTENT_TYPE);
            String a2 = this.f57426i.mo57267a(HttpHeader.CONTENT_LENGTH);
            return new C22757yu.C22758a().mo57438a(new C22752ys.C22753a().mo57406a(this.f57420c).mo57407a(this.f57422e, (C22754yt) null).mo57402a(this.f57421d).mo57409a()).mo57437a(this.f57423f).mo57433a(this.f57424g).mo57441a(this.f57425h).mo57436a(this.f57426i).mo57440a((C22759yv) new C22708b(cVar, a, a2)).mo57435a(this.f57427j).mo57434a(this.f57428k).mo57445b(this.f57429l).mo57443a();
        }
    }
}
