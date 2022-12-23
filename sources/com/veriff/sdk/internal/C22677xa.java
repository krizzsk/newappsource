package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C22740ym;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, mo59060d2 = {"Lmobi/lab/veriff/network/TimeoutInterceptor;", "Lhi0/s;", "Lhi0/s$a;", "chain", "Lhi0/c0;", "intercept", "<init>", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.xa */
public final class C22677xa implements C22740ym {
    /* renamed from: a */
    public C22757yu mo53658a(C22740ym.C22741a aVar) {
        Annotation annotation;
        C24362h.m61211f(aVar, "chain");
        C22752ys a = aVar.mo57322a();
        C24362h.m61210e(a, "request");
        acm acm = (acm) a.mo57391a(acm.class);
        if (acm != null) {
            annotation = acm.mo54020a().getAnnotation(C22675wz.class);
            if (annotation == null) {
                Method a2 = acm.mo54020a();
                C24362h.m61210e(a2, "tag.method()");
                annotation = a2.getDeclaringClass().getAnnotation(C22675wz.class);
            }
        } else {
            annotation = null;
        }
        C22675wz wzVar = (C22675wz) annotation;
        if (wzVar != null) {
            C22757yu a3 = aVar.mo57321a(wzVar.mo57050a(), wzVar.mo57051b()).mo57325b(wzVar.mo57050a(), wzVar.mo57051b()).mo57327c(wzVar.mo57050a(), wzVar.mo57051b()).mo57323a(a);
            C24362h.m61210e(a3, "chain\n                .w…        .proceed(request)");
            return a3;
        }
        C22757yu a4 = aVar.mo57323a(a);
        C24362h.m61210e(a4, "chain.proceed(request)");
        return a4;
    }
}
