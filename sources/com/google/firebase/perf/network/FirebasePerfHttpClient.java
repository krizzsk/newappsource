package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;
import p649mf.C18367b;
import p697of.C18744f;
import p697of.C18746h;
import p766rf.C19260d;

public class FirebasePerfHttpClient {
    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        Timer timer = new Timer();
        C18367b d = C18367b.m45221d(C19260d.f48934t);
        try {
            d.mo50839o(httpUriRequest.getURI().toString());
            d.mo50832f(httpUriRequest.getMethod());
            Long a = C18746h.m45751a(httpUriRequest);
            if (a != null) {
                d.mo50834j(a.longValue());
            }
            timer.mo43523f();
            d.mo50835k(timer.mo43521d());
            HttpResponse execute = httpClient.execute(httpUriRequest);
            d.mo50838n(timer.mo43519b());
            d.mo50833g(execute.getStatusLine().getStatusCode());
            Long a2 = C18746h.m45751a(execute);
            if (a2 != null) {
                d.mo50837m(a2.longValue());
            }
            String b = C18746h.m45752b(execute);
            if (b != null) {
                d.mo50836l(b);
            }
            d.mo50831c();
            return execute;
        } catch (IOException e) {
            d.mo50838n(timer.mo43519b());
            C18746h.m45753c(d);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        C18367b d = C18367b.m45221d(C19260d.f48934t);
        try {
            d.mo50839o(httpUriRequest.getURI().toString());
            d.mo50832f(httpUriRequest.getMethod());
            Long a = C18746h.m45751a(httpUriRequest);
            if (a != null) {
                d.mo50834j(a.longValue());
            }
            timer.mo43523f();
            d.mo50835k(timer.mo43521d());
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            d.mo50838n(timer.mo43519b());
            d.mo50833g(execute.getStatusLine().getStatusCode());
            Long a2 = C18746h.m45751a(execute);
            if (a2 != null) {
                d.mo50837m(a2.longValue());
            }
            String b = C18746h.m45752b(execute);
            if (b != null) {
                d.mo50836l(b);
            }
            d.mo50831c();
            return execute;
        } catch (IOException e) {
            d.mo50838n(timer.mo43519b());
            C18746h.m45753c(d);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        Timer timer = new Timer();
        C18367b d = C18367b.m45221d(C19260d.f48934t);
        try {
            d.mo50839o(httpUriRequest.getURI().toString());
            d.mo50832f(httpUriRequest.getMethod());
            Long a = C18746h.m45751a(httpUriRequest);
            if (a != null) {
                d.mo50834j(a.longValue());
            }
            timer.mo43523f();
            d.mo50835k(timer.mo43521d());
            return httpClient.execute(httpUriRequest, new C18744f(responseHandler, timer, d));
        } catch (IOException e) {
            d.mo50838n(timer.mo43519b());
            C18746h.m45753c(d);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        C18367b d = C18367b.m45221d(C19260d.f48934t);
        try {
            d.mo50839o(httpUriRequest.getURI().toString());
            d.mo50832f(httpUriRequest.getMethod());
            Long a = C18746h.m45751a(httpUriRequest);
            if (a != null) {
                d.mo50834j(a.longValue());
            }
            timer.mo43523f();
            d.mo50835k(timer.mo43521d());
            return httpClient.execute(httpUriRequest, new C18744f(responseHandler, timer, d), httpContext);
        } catch (IOException e) {
            d.mo50838n(timer.mo43519b());
            C18746h.m45753c(d);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        Timer timer = new Timer();
        C18367b d = C18367b.m45221d(C19260d.f48934t);
        try {
            d.mo50839o(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            d.mo50832f(httpRequest.getRequestLine().getMethod());
            Long a = C18746h.m45751a(httpRequest);
            if (a != null) {
                d.mo50834j(a.longValue());
            }
            timer.mo43523f();
            d.mo50835k(timer.mo43521d());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            d.mo50838n(timer.mo43519b());
            d.mo50833g(execute.getStatusLine().getStatusCode());
            Long a2 = C18746h.m45751a(execute);
            if (a2 != null) {
                d.mo50837m(a2.longValue());
            }
            String b = C18746h.m45752b(execute);
            if (b != null) {
                d.mo50836l(b);
            }
            d.mo50831c();
            return execute;
        } catch (IOException e) {
            d.mo50838n(timer.mo43519b());
            C18746h.m45753c(d);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        C18367b d = C18367b.m45221d(C19260d.f48934t);
        try {
            d.mo50839o(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            d.mo50832f(httpRequest.getRequestLine().getMethod());
            Long a = C18746h.m45751a(httpRequest);
            if (a != null) {
                d.mo50834j(a.longValue());
            }
            timer.mo43523f();
            d.mo50835k(timer.mo43521d());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            d.mo50838n(timer.mo43519b());
            d.mo50833g(execute.getStatusLine().getStatusCode());
            Long a2 = C18746h.m45751a(execute);
            if (a2 != null) {
                d.mo50837m(a2.longValue());
            }
            String b = C18746h.m45752b(execute);
            if (b != null) {
                d.mo50836l(b);
            }
            d.mo50831c();
            return execute;
        } catch (IOException e) {
            d.mo50838n(timer.mo43519b());
            C18746h.m45753c(d);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        Timer timer = new Timer();
        C18367b d = C18367b.m45221d(C19260d.f48934t);
        try {
            d.mo50839o(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            d.mo50832f(httpRequest.getRequestLine().getMethod());
            Long a = C18746h.m45751a(httpRequest);
            if (a != null) {
                d.mo50834j(a.longValue());
            }
            timer.mo43523f();
            d.mo50835k(timer.mo43521d());
            return httpClient.execute(httpHost, httpRequest, new C18744f(responseHandler, timer, d));
        } catch (IOException e) {
            d.mo50838n(timer.mo43519b());
            C18746h.m45753c(d);
            throw e;
        }
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        Timer timer = new Timer();
        C18367b d = C18367b.m45221d(C19260d.f48934t);
        try {
            d.mo50839o(httpHost.toURI() + httpRequest.getRequestLine().getUri());
            d.mo50832f(httpRequest.getRequestLine().getMethod());
            Long a = C18746h.m45751a(httpRequest);
            if (a != null) {
                d.mo50834j(a.longValue());
            }
            timer.mo43523f();
            d.mo50835k(timer.mo43521d());
            return httpClient.execute(httpHost, httpRequest, new C18744f(responseHandler, timer, d), httpContext);
        } catch (IOException e) {
            d.mo50838n(timer.mo43519b());
            C18746h.m45753c(d);
            throw e;
        }
    }
}
