package com.veriff.sdk.internal;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0010\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0006R\u000f\u0010\u0004\u001a\u00020\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007¨\u0006\b"}, mo59060d2 = {"Lmobi/lab/veriff/network/Timeout;", "", "timeout", "", "unit", "Ljava/util/concurrent/TimeUnit;", "()I", "()Ljava/util/concurrent/TimeUnit;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.veriff.sdk.internal.wz */
public @interface C22675wz {
    /* renamed from: a */
    int mo57050a();

    /* renamed from: b */
    TimeUnit mo57051b();
}
