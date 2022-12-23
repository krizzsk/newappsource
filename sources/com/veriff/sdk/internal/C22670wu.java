package com.veriff.sdk.internal;

import com.amazonaws.http.HttpHeader;
import com.veriff.sdk.internal.C22740ym;
import com.veriff.sdk.internal.C22752ys;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo59060d2 = {"Lmobi/lab/veriff/network/AuthInterceptor;", "Lhi0/s;", "Lhi0/s$a;", "chain", "Lhi0/c0;", "intercept", "", "sessionToken", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.wu */
public final class C22670wu implements C22740ym {

    /* renamed from: a */
    private final String f57327a;

    public C22670wu(String str) {
        C24362h.m61211f(str, "sessionToken");
        this.f57327a = str;
    }

    /* renamed from: a */
    public C22757yu mo53658a(C22740ym.C22741a aVar) {
        Annotation annotation;
        C24362h.m61211f(aVar, "chain");
        C22752ys a = aVar.mo57322a();
        C24362h.m61210e(a, "request");
        acm acm = (acm) a.mo57391a(acm.class);
        if (acm != null) {
            annotation = acm.mo54020a().getAnnotation(C22671wv.class);
            if (annotation == null) {
                Method a2 = acm.mo54020a();
                C24362h.m61210e(a2, "tag.method()");
                annotation = a2.getDeclaringClass().getAnnotation(C22671wv.class);
            }
        } else {
            annotation = null;
        }
        if (annotation != null) {
            C22752ys.C22753a b = a.mo57397e().mo57410b(HttpHeader.AUTHORIZATION);
            StringBuilder k = C13555b.m33972k("Bearer ");
            k.append(this.f57327a);
            a = b.mo57411b(HttpHeader.AUTHORIZATION, k.toString()).mo57409a();
        }
        C22757yu a3 = aVar.mo57323a(a);
        C24362h.m61210e(a3, "chain.proceed(request)");
        return a3;
    }
}
