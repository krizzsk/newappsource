package com.moovit.commons.request;

import bf0.C21050d;
import java.util.concurrent.Future;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24236l;
import p906wz.C20439j;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\"\u0014\b\u0001\u0010\u0003*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, mo59060d2 = {"Lwz/c;", "RQ", "Lwz/g;", "RS", "", "it", "Lbf0/d;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class RequestExtKt$execute$2$1 extends Lambda implements C24236l<Throwable, C21050d> {
    public final /* synthetic */ Future<?> $future;
    public final /* synthetic */ C20439j<Object, Object> $task;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RequestExtKt$execute$2$1(C20439j<Object, Object> jVar, Future<?> future) {
        super(1);
        this.$task = jVar;
        this.$future = future;
    }

    public final Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        this.$task.cancel(true);
        this.$future.cancel(true);
        return C21050d.f52856a;
    }
}
