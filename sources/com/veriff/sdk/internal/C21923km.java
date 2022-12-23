package com.veriff.sdk.internal;

import com.veriff.sdk.internal.acf;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\n\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, mo59060d2 = {"Lcom/veriff/sdk/internal/network/ApiCallAdapterFactory;", "Lck0/c$a;", "Ljava/lang/reflect/Type;", "returnType", "", "", "annotations", "Lck0/s;", "retrofit", "Lck0/c;", "get", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lck0/s;)Lck0/c;", "Lcom/squareup/moshi/o;", "moshi", "Lcom/squareup/moshi/o;", "<init>", "(Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.km */
public final class C21923km extends acf.C21336a {

    /* renamed from: a */
    private final C21450bi f55420a;

    public C21923km(C21450bi biVar) {
        C24362h.m61211f(biVar, "moshi");
        this.f55420a = biVar;
    }

    /* renamed from: a */
    public acf<?, ?> mo54009a(Type type, Annotation[] annotationArr, acv acv) {
        C24362h.m61211f(type, "returnType");
        C24362h.m61211f(annotationArr, "annotations");
        C24362h.m61211f(acv, "retrofit");
        if ((!C24362h.m61206a(acf.C21336a.m50652b(type), ace.class)) || !(type instanceof ParameterizedType)) {
            return null;
        }
        Type a = acf.C21336a.m50653b(0, (ParameterizedType) type);
        if ((!C24362h.m61206a(acf.C21336a.m50652b(a), C21924kn.class)) || !(a instanceof ParameterizedType)) {
            return null;
        }
        Type a2 = acf.C21336a.m50653b(0, (ParameterizedType) a);
        C24362h.m61210e(a2, "apiResultParam");
        return new C21922kl(a2, this.f55420a);
    }
}
