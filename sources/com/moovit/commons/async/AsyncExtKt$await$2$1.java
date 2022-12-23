package com.moovit.commons.async;

import bf0.C21050d;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import wh0.C25189k;
import wh0.C25192l;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo59060d2 = {"R", "kotlin.jvm.PlatformType", "r", "Lbf0/d;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class AsyncExtKt$await$2$1 extends Lambda implements C24236l<R, C21050d> {
    public final /* synthetic */ C25189k<R> $continuation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AsyncExtKt$await$2$1(C25192l lVar) {
        super(1);
        this.$continuation = lVar;
    }

    public final Object invoke(Object obj) {
        this.$continuation.resumeWith(obj);
        return C21050d.f52856a;
    }
}
