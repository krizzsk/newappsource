package com.veriff.sdk.internal;

import bf0.C21050d;
import ff0.C23349c;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import lf0.C24236l;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\f\u001a\u00020\u0001\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0006J#\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0007H@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, mo59060d2 = {"Lcom/veriff/sdk/internal/io/KeyTransformStore;", "Lcom/veriff/sdk/internal/io/Store;", "", "key", "Lbf0/d;", "delete", "(Ljava/lang/String;Lff0/c;)Ljava/lang/Object;", "", "read", "bytes", "write", "(Ljava/lang/String;[BLff0/c;)Ljava/lang/Object;", "base", "Lcom/veriff/sdk/internal/io/Store;", "Lkotlin/Function1;", "transform", "Llf0/l;", "<init>", "(Lcom/veriff/sdk/internal/io/Store;Llf0/l;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ki */
public final class C21918ki implements C21919kj {

    /* renamed from: a */
    private final C21919kj f55411a;

    /* renamed from: b */
    private final C24236l<String, String> f55412b;

    public C21918ki(C21919kj kjVar, C24236l<? super String, String> lVar) {
        C24362h.m61211f(kjVar, "base");
        C24362h.m61211f(lVar, "transform");
        this.f55411a = kjVar;
        this.f55412b = lVar;
    }

    /* renamed from: a */
    public Object mo55699a(String str, byte[] bArr, C23349c<? super C21050d> cVar) {
        Object a = this.f55411a.mo55699a(this.f55412b.invoke(str), bArr, cVar);
        if (a == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return a;
        }
        return C21050d.f52856a;
    }

    /* renamed from: b */
    public Object mo55700b(String str, C23349c<? super C21050d> cVar) {
        Object b = this.f55411a.mo55700b(this.f55412b.invoke(str), cVar);
        if (b == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return b;
        }
        return C21050d.f52856a;
    }

    /* renamed from: a */
    public Object mo55698a(String str, C23349c<? super byte[]> cVar) {
        return this.f55411a.mo55698a(this.f55412b.invoke(str), cVar);
    }
}
