package com.veriff.sdk.internal;

import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0001\u0012R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, mo59060d2 = {"Lcom/veriff/di/SingletonComponent;", "", "Lcom/squareup/moshi/o;", "getMoshi", "()Lcom/squareup/moshi/o;", "moshi", "Lhi0/v;", "getRootOkHttp", "()Lhi0/v;", "rootOkHttp", "Lcom/veriff/di/SdkLaunchComponent$Factory;", "getSdkComponentFactory", "()Lcom/veriff/di/SdkLaunchComponent$Factory;", "sdkComponentFactory", "Lmobi/lab/veriff/model/SessionCache;", "getSessionCache", "()Lmobi/lab/veriff/model/SessionCache;", "sessionCache", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.eg */
public interface C21593eg {

    /* renamed from: a */
    public static final C21594a f54334a = C21594a.f54335a;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R&\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, mo59060d2 = {"Lcom/veriff/di/SingletonComponent$Companion;", "", "()V", "instance", "Lcom/veriff/di/SingletonComponent;", "getInstance", "()Lcom/veriff/di/SingletonComponent;", "overrideInstance", "getOverrideInstance$annotations", "getOverrideInstance", "setOverrideInstance", "(Lcom/veriff/di/SingletonComponent;)V", "realInstance", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.eg$a */
    public static final class C21594a {

        /* renamed from: a */
        public static final /* synthetic */ C21594a f54335a = new C21594a();

        /* renamed from: b */
        private static final C21593eg f54336b;

        static {
            C21593eg a = C21550de.m51530a();
            C24362h.m61210e(a, "DaggerSingletonComponent.create()");
            f54336b = a;
        }

        private C21594a() {
        }

        /* renamed from: a */
        public final C21593eg mo54610a() {
            return f54336b;
        }
    }

    /* renamed from: b */
    C22746yp mo54565b();

    /* renamed from: c */
    C22663wn mo54566c();
}
