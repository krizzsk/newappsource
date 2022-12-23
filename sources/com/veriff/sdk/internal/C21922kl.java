package com.veriff.sdk.internal;

import java.lang.reflect.Type;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00030\u0002B\u0017\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, mo59060d2 = {"Lcom/veriff/sdk/internal/network/ApiCallAdapter;", "T", "Lck0/c;", "Lck0/b;", "Lcom/veriff/sdk/internal/network/ApiResult;", "call", "adapt", "Ljava/lang/reflect/Type;", "responseType", "Lcom/squareup/moshi/o;", "moshi", "Lcom/squareup/moshi/o;", "type", "Ljava/lang/reflect/Type;", "<init>", "(Ljava/lang/reflect/Type;Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.kl */
public final class C21922kl<T> implements acf<T, ace<C21924kn<T>>> {

    /* renamed from: a */
    private final Type f55418a;

    /* renamed from: b */
    private final C21450bi f55419b;

    public C21922kl(Type type, C21450bi biVar) {
        C24362h.m61211f(type, "type");
        C24362h.m61211f(biVar, "moshi");
        this.f55418a = type;
        this.f55419b = biVar;
    }

    /* renamed from: a */
    public Type mo54007a() {
        return this.f55418a;
    }

    /* renamed from: a */
    public ace<C21924kn<T>> mo54008b(ace<T> ace) {
        C24362h.m61211f(ace, "call");
        return new C21920kk(ace, this.f55419b);
    }
}
