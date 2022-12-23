package com.masabi.justride.sdk.platform.geolocation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo59060d2 = {"<anonymous>", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "invoke"}, mo59061k = 3, mo59062mv = {1, 4, 1})
public final class AndroidGeolocationService$locationExecutor$2 extends Lambda implements C24225a<ExecutorService> {

    /* renamed from: f */
    public static final AndroidGeolocationService$locationExecutor$2 f37169f = new AndroidGeolocationService$locationExecutor$2();

    public AndroidGeolocationService$locationExecutor$2() {
        super(0);
    }

    public final Object invoke() {
        return Executors.newSingleThreadExecutor();
    }
}
