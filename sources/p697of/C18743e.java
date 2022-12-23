package p697of;

import com.google.firebase.perf.p414v1.NetworkRequestMetric;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import p626lf.C18200a;
import p649mf.C18367b;

/* renamed from: of.e */
public final class C18743e {

    /* renamed from: f */
    public static final C18200a f47672f = C18200a.m44901d();

    /* renamed from: a */
    public final HttpURLConnection f47673a;

    /* renamed from: b */
    public final C18367b f47674b;

    /* renamed from: c */
    public long f47675c = -1;

    /* renamed from: d */
    public long f47676d = -1;

    /* renamed from: e */
    public final Timer f47677e;

    public C18743e(HttpURLConnection httpURLConnection, Timer timer, C18367b bVar) {
        this.f47673a = httpURLConnection;
        this.f47674b = bVar;
        this.f47677e = timer;
        bVar.mo50839o(httpURLConnection.getURL().toString());
    }

    /* renamed from: a */
    public final void mo51230a() throws IOException {
        if (this.f47675c == -1) {
            this.f47677e.mo43523f();
            long j = this.f47677e.f36654b;
            this.f47675c = j;
            this.f47674b.mo50835k(j);
        }
        try {
            this.f47673a.connect();
        } catch (IOException e) {
            this.f47674b.mo50838n(this.f47677e.mo43519b());
            C18746h.m45753c(this.f47674b);
            throw e;
        }
    }

    /* renamed from: b */
    public final Object mo51231b() throws IOException {
        mo51240i();
        this.f47674b.mo50833g(this.f47673a.getResponseCode());
        try {
            Object content = this.f47673a.getContent();
            if (content instanceof InputStream) {
                this.f47674b.mo50836l(this.f47673a.getContentType());
                return new C18739a((InputStream) content, this.f47674b, this.f47677e);
            }
            this.f47674b.mo50836l(this.f47673a.getContentType());
            this.f47674b.mo50837m((long) this.f47673a.getContentLength());
            this.f47674b.mo50838n(this.f47677e.mo43519b());
            this.f47674b.mo50831c();
            return content;
        } catch (IOException e) {
            this.f47674b.mo50838n(this.f47677e.mo43519b());
            C18746h.m45753c(this.f47674b);
            throw e;
        }
    }

    /* renamed from: c */
    public final Object mo51232c(Class[] clsArr) throws IOException {
        mo51240i();
        this.f47674b.mo50833g(this.f47673a.getResponseCode());
        try {
            Object content = this.f47673a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f47674b.mo50836l(this.f47673a.getContentType());
                return new C18739a((InputStream) content, this.f47674b, this.f47677e);
            }
            this.f47674b.mo50836l(this.f47673a.getContentType());
            this.f47674b.mo50837m((long) this.f47673a.getContentLength());
            this.f47674b.mo50838n(this.f47677e.mo43519b());
            this.f47674b.mo50831c();
            return content;
        } catch (IOException e) {
            this.f47674b.mo50838n(this.f47677e.mo43519b());
            C18746h.m45753c(this.f47674b);
            throw e;
        }
    }

    /* renamed from: d */
    public final InputStream mo51233d() {
        mo51240i();
        try {
            this.f47674b.mo50833g(this.f47673a.getResponseCode());
        } catch (IOException unused) {
            f47672f.mo50610a();
        }
        InputStream errorStream = this.f47673a.getErrorStream();
        if (errorStream != null) {
            return new C18739a(errorStream, this.f47674b, this.f47677e);
        }
        return errorStream;
    }

    /* renamed from: e */
    public final InputStream mo51234e() throws IOException {
        mo51240i();
        this.f47674b.mo50833g(this.f47673a.getResponseCode());
        this.f47674b.mo50836l(this.f47673a.getContentType());
        try {
            InputStream inputStream = this.f47673a.getInputStream();
            if (inputStream != null) {
                return new C18739a(inputStream, this.f47674b, this.f47677e);
            }
            return inputStream;
        } catch (IOException e) {
            this.f47674b.mo50838n(this.f47677e.mo43519b());
            C18746h.m45753c(this.f47674b);
            throw e;
        }
    }

    public final boolean equals(Object obj) {
        return this.f47673a.equals(obj);
    }

    /* renamed from: f */
    public final OutputStream mo51236f() throws IOException {
        try {
            OutputStream outputStream = this.f47673a.getOutputStream();
            if (outputStream != null) {
                return new C18740b(outputStream, this.f47674b, this.f47677e);
            }
            return outputStream;
        } catch (IOException e) {
            this.f47674b.mo50838n(this.f47677e.mo43519b());
            C18746h.m45753c(this.f47674b);
            throw e;
        }
    }

    /* renamed from: g */
    public final int mo51237g() throws IOException {
        mo51240i();
        if (this.f47676d == -1) {
            long b = this.f47677e.mo43519b();
            this.f47676d = b;
            NetworkRequestMetric.C14496b bVar = this.f47674b.f46833e;
            bVar.mo43956p();
            NetworkRequestMetric.m36093A((NetworkRequestMetric) bVar.f36809c, b);
        }
        try {
            int responseCode = this.f47673a.getResponseCode();
            this.f47674b.mo50833g(responseCode);
            return responseCode;
        } catch (IOException e) {
            this.f47674b.mo50838n(this.f47677e.mo43519b());
            C18746h.m45753c(this.f47674b);
            throw e;
        }
    }

    /* renamed from: h */
    public final String mo51238h() throws IOException {
        mo51240i();
        if (this.f47676d == -1) {
            long b = this.f47677e.mo43519b();
            this.f47676d = b;
            NetworkRequestMetric.C14496b bVar = this.f47674b.f46833e;
            bVar.mo43956p();
            NetworkRequestMetric.m36093A((NetworkRequestMetric) bVar.f36809c, b);
        }
        try {
            String responseMessage = this.f47673a.getResponseMessage();
            this.f47674b.mo50833g(this.f47673a.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            this.f47674b.mo50838n(this.f47677e.mo43519b());
            C18746h.m45753c(this.f47674b);
            throw e;
        }
    }

    public final int hashCode() {
        return this.f47673a.hashCode();
    }

    /* renamed from: i */
    public final void mo51240i() {
        if (this.f47675c == -1) {
            this.f47677e.mo43523f();
            long j = this.f47677e.f36654b;
            this.f47675c = j;
            this.f47674b.mo50835k(j);
        }
        String requestMethod = this.f47673a.getRequestMethod();
        if (requestMethod != null) {
            this.f47674b.mo50832f(requestMethod);
        } else if (this.f47673a.getDoOutput()) {
            this.f47674b.mo50832f("POST");
        } else {
            this.f47674b.mo50832f("GET");
        }
    }

    public final String toString() {
        return this.f47673a.toString();
    }
}
