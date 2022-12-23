package p697of;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;
import p649mf.C18367b;

/* renamed from: of.f */
public final class C18744f<T> implements ResponseHandler<T> {

    /* renamed from: a */
    public final ResponseHandler<? extends T> f47678a;

    /* renamed from: b */
    public final Timer f47679b;

    /* renamed from: c */
    public final C18367b f47680c;

    public C18744f(ResponseHandler<? extends T> responseHandler, Timer timer, C18367b bVar) {
        this.f47678a = responseHandler;
        this.f47679b = timer;
        this.f47680c = bVar;
    }

    public final T handleResponse(HttpResponse httpResponse) throws IOException {
        this.f47680c.mo50838n(this.f47679b.mo43519b());
        this.f47680c.mo50833g(httpResponse.getStatusLine().getStatusCode());
        Long a = C18746h.m45751a(httpResponse);
        if (a != null) {
            this.f47680c.mo50837m(a.longValue());
        }
        String b = C18746h.m45752b(httpResponse);
        if (b != null) {
            this.f47680c.mo50836l(b);
        }
        this.f47680c.mo50831c();
        return this.f47678a.handleResponse(httpResponse);
    }
}
