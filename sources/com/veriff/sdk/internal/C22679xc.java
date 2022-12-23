package com.veriff.sdk.internal;

import bf0.C21050d;
import com.amazonaws.http.HttpHeader;
import com.veriff.sdk.internal.C22740ym;
import java.io.EOFException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import lf0.C24236l;
import mf0.C24362h;
import p001a0.C0016g;
import uh0.C25072a;
import uh0.C25081h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\u001e¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002J+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0004H\u0002J \u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0002J#\u0010\u001c\u001a\u00020\u0004*\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r2\u0006\u0010\u001b\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00100\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, mo59060d2 = {"Lmobi/lab/veriff/network/VeriffLoggingInterceptor;", "Lhi0/s;", "Lhi0/q;", "headers", "", "bodyHasUnknownEncoding", "Lhi0/s$a;", "chain", "Lhi0/c0;", "intercept", "Lsi0/f;", "buffer", "isPlaintext", "", "", "ignoreList", "Lbf0/d;", "logHeaders", "(Lhi0/q;[Ljava/lang/String;)V", "Lhi0/x;", "request", "logBody", "logRequest", "response", "", "tookMs", "logResponse", "value", "containsIgnoreCase", "([Ljava/lang/String;Ljava/lang/String;)Z", "Lkotlin/Function1;", "log", "Llf0/l;", "<init>", "(Llf0/l;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.xc */
public final class C22679xc implements C22740ym {

    /* renamed from: a */
    private final C24236l<String, C21050d> f57332a;

    public C22679xc(C24236l<? super String, C21050d> lVar) {
        C24362h.m61211f(lVar, "log");
        this.f57332a = lVar;
    }

    /* renamed from: a */
    public C22757yu mo53658a(C22740ym.C22741a aVar) {
        Annotation annotation;
        C24362h.m61211f(aVar, "chain");
        C22752ys a = aVar.mo57322a();
        C24362h.m61210e(a, "request");
        acm acm = (acm) a.mo57391a(acm.class);
        if (acm != null) {
            annotation = acm.mo54020a().getAnnotation(C22672ww.class);
            if (annotation == null) {
                Method a2 = acm.mo54020a();
                C24362h.m61210e(a2, "tag.method()");
                annotation = a2.getDeclaringClass().getAnnotation(C22672ww.class);
            }
        } else {
            annotation = null;
        }
        C22672ww wwVar = (C22672ww) annotation;
        boolean z = true;
        boolean a3 = wwVar != null ? wwVar.mo57039a() : true;
        if (wwVar != null) {
            z = wwVar.mo57040b();
        }
        m55297a(a, a3);
        long nanoTime = System.nanoTime();
        try {
            C22757yu a4 = aVar.mo57323a(a);
            C24362h.m61210e(a4, "chain.proceed(request)");
            m55298a(a4, z, TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime));
            return a4;
        } catch (Exception e) {
            C24236l<String, C21050d> lVar = this.f57332a;
            lVar.invoke("<-- HTTP FAILED: " + e);
            throw e;
        }
    }

    /* renamed from: a */
    private final void m55296a(C22736yk ykVar, String... strArr) {
        int a = ykVar.mo57265a();
        for (int i = 0; i < a; i++) {
            String a2 = ykVar.mo57266a(i);
            C24362h.m61210e(a2, "name");
            if (!m55301a(strArr, a2)) {
                C24236l<String, C21050d> lVar = this.f57332a;
                StringBuilder t = C0016g.m36t(a2, ": ");
                t.append(ykVar.mo57269b(i));
                lVar.invoke(t.toString());
            }
        }
    }

    /* renamed from: a */
    private final void m55297a(C22752ys ysVar, boolean z) {
        Charset charset;
        C24236l<String, C21050d> lVar = this.f57332a;
        StringBuilder k = C13555b.m33972k("--> ");
        k.append(ysVar.mo57393b());
        k.append(' ');
        k.append(ysVar.mo57390a());
        lVar.invoke(k.toString());
        C22754yt d = ysVar.mo57396d();
        if (d != null) {
            C22742yn a = d.mo54065a();
            if (a != null) {
                C24236l<String, C21050d> lVar2 = this.f57332a;
                lVar2.invoke("Content-Type: " + a);
            }
            if (d.mo54067b() != -1) {
                C24236l<String, C21050d> lVar3 = this.f57332a;
                StringBuilder k2 = C13555b.m33972k("Content-Length: ");
                k2.append(d.mo54067b());
                lVar3.invoke(k2.toString());
            }
        }
        C22736yk c = ysVar.mo57395c();
        C24362h.m61210e(c, "request.headers()");
        m55296a(c, HttpHeader.CONTENT_TYPE, HttpHeader.CONTENT_LENGTH);
        if (!z || d == null) {
            C24236l<String, C21050d> lVar4 = this.f57332a;
            StringBuilder k3 = C13555b.m33972k("--> END ");
            k3.append(ysVar.mo57393b());
            lVar4.invoke(k3.toString());
            return;
        }
        C22736yk c2 = ysVar.mo57395c();
        C24362h.m61210e(c2, "request.headers()");
        if (m55300a(c2)) {
            C24236l<String, C21050d> lVar5 = this.f57332a;
            StringBuilder k4 = C13555b.m33972k("--> END ");
            k4.append(ysVar.mo57393b());
            k4.append(" (encoded body omitted)");
            lVar5.invoke(k4.toString());
            return;
        }
        abi abi = new abi();
        d.mo54066a(abi);
        C22742yn a2 = d.mo54065a();
        if (a2 == null || (charset = a2.mo57331b()) == null) {
            charset = C25072a.f63272a;
        }
        C24362h.m61210e(charset, "requestBody.contentType(…arset() ?: Charsets.UTF_8");
        this.f57332a.invoke("");
        if (m55299a(abi)) {
            C24236l<String, C21050d> lVar6 = this.f57332a;
            String a3 = abi.mo53859a(charset);
            C24362h.m61210e(a3, "buffer.readString(charset)");
            lVar6.invoke(a3);
            C24236l<String, C21050d> lVar7 = this.f57332a;
            StringBuilder k5 = C13555b.m33972k("--> END ");
            k5.append(ysVar.mo57393b());
            k5.append(" (");
            k5.append(d.mo54067b());
            k5.append("-byte body)");
            lVar7.invoke(k5.toString());
            return;
        }
        C24236l<String, C21050d> lVar8 = this.f57332a;
        StringBuilder k6 = C13555b.m33972k("--> END ");
        k6.append(ysVar.mo57393b());
        k6.append(" (binary ");
        k6.append(d.mo54067b());
        k6.append("-byte body omitted)");
        lVar8.invoke(k6.toString());
    }

    /* renamed from: a */
    private final void m55298a(C22757yu yuVar, boolean z, long j) {
        String str;
        Charset charset;
        C22759yv h = yuVar.mo57424h();
        C24362h.m61208c(h);
        long b = h.mo54032b();
        C24236l<String, C21050d> lVar = this.f57332a;
        StringBuilder k = C13555b.m33972k("<-- ");
        k.append(yuVar.mo57418c());
        String e = yuVar.mo57421e();
        C24362h.m61210e(e, "response.message()");
        if (e.length() == 0) {
            str = "";
        } else {
            StringBuilder q = C25541a.m63886q(' ');
            q.append(yuVar.mo57421e());
            str = q.toString();
        }
        k.append(str);
        k.append(' ');
        k.append(yuVar.mo57414a().mo57390a());
        k.append(" (");
        k.append(j);
        k.append(" ms)");
        lVar.invoke(k.toString());
        C22736yk g = yuVar.mo57423g();
        C24362h.m61210e(g, "response.headers()");
        m55296a(g, new String[0]);
        if (!z || !C22802zw.m56035d(yuVar)) {
            this.f57332a.invoke("<-- END HTTP");
            return;
        }
        C22736yk g2 = yuVar.mo57423g();
        C24362h.m61210e(g2, "response.headers()");
        if (m55300a(g2)) {
            this.f57332a.invoke("<-- END HTTP (encoded body omitted)");
            return;
        }
        abk c = h.mo54033c();
        c.mo53872b(Long.MAX_VALUE);
        abi d = c.mo53880d();
        C22742yn a = h.mo54031a();
        if (a == null || (charset = a.mo57331b()) == null) {
            charset = C25072a.f63272a;
        }
        C24362h.m61210e(charset, "responseBody.contentType…arset() ?: Charsets.UTF_8");
        C24362h.m61210e(d, "buffer");
        if (!m55299a(d)) {
            this.f57332a.invoke("");
            C24236l<String, C21050d> lVar2 = this.f57332a;
            StringBuilder k2 = C13555b.m33972k("<-- END HTTP (binary ");
            k2.append(d.mo53864b());
            k2.append("-byte body omitted)");
            lVar2.invoke(k2.toString());
            return;
        }
        if (b != 0) {
            this.f57332a.invoke("");
            C24236l<String, C21050d> lVar3 = this.f57332a;
            String a2 = d.clone().mo53859a(charset);
            C24362h.m61210e(a2, "buffer.clone().readString(charset)");
            lVar3.invoke(a2);
        }
        C24236l<String, C21050d> lVar4 = this.f57332a;
        StringBuilder k3 = C13555b.m33972k("<-- END HTTP (");
        k3.append(d.mo53864b());
        k3.append("-byte body)");
        lVar4.invoke(k3.toString());
    }

    /* renamed from: a */
    private final boolean m55299a(abi abi) {
        try {
            abi abi2 = new abi();
            long b = abi.mo53864b();
            long j = (long) 64;
            abi.mo53852a(abi2, 0, b > j ? j : b);
            for (int i = 0; i < 16 && !abi2.mo53890f(); i++) {
                int t = abi2.mo53917t();
                if (Character.isISOControl(t) && !Character.isWhitespace(t)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private final boolean m55300a(C22736yk ykVar) {
        String a = ykVar.mo57267a("Content-Encoding");
        if (a == null || C25081h.m62830A(a, "identity", true) || C25081h.m62830A(a, "gzip", true)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m55301a(String[] strArr, String str) {
        for (String A : strArr) {
            if (C25081h.m62830A(str, A, true)) {
                return true;
            }
        }
        return false;
    }
}
