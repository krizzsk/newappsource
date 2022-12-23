package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21420av;
import com.veriff.sdk.internal.C21450bi;
import com.veriff.sdk.internal.C21667gf;
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.Set;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0006"}, mo59060d2 = {"Lcom/veriff/di/JsonModule;", "", "Lcom/squareup/moshi/o;", "provideMoshi", "<init>", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.dk */
public final class C21568dk {

    /* renamed from: a */
    public static final C21568dk f54310a = new C21568dk();

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u001b\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t2\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002,\u0010\u0006\u001a(\u0012\u000e\b\u0001\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00050\u00032\u000e\u0010\b\u001a\n \u0001*\u0004\u0018\u00010\u00070\u0007H\n¢\u0006\u0004\b\n\u0010\u000b"}, mo59060d2 = {"Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "type", "", "", "", "<anonymous parameter 1>", "Lcom/squareup/moshi/o;", "moshi", "Lcom/squareup/moshi/k;", "create", "(Ljava/lang/reflect/Type;Ljava/util/Set;Lcom/squareup/moshi/o;)Lcom/squareup/moshi/k;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.dk$a */
    public static final class C21569a implements C21420av.C21424a {

        /* renamed from: a */
        public static final C21569a f54311a = new C21569a();

        /* renamed from: a */
        public final C21420av<?> mo54207a(Type type, Set<? extends Annotation> set, C21450bi biVar) {
            if (C24362h.m61206a(type, C21667gf.C21668a.class)) {
                C24362h.m61210e(biVar, "moshi");
                return new C21638fo(biVar);
            } else if (C24362h.m61206a(type, C22548tf.class)) {
                C24362h.m61210e(biVar, "moshi");
                return new C21638fo(biVar);
            } else if (C24362h.m61206a(type, File.class)) {
                return new C21622fc();
            } else {
                if (C24362h.m61206a(type, Date.class)) {
                    return new C21470bm();
                }
                return null;
            }
        }
    }

    private C21568dk() {
    }

    /* renamed from: a */
    public final C21450bi mo54585a() {
        C21450bi a = new C21450bi.C21451a().mo54338a(C21644ft.f54666a).mo54338a(C21569a.f54311a).mo54339a();
        C24362h.m61210e(a, "Moshi.Builder()\n        …   }\n            .build()");
        return a;
    }
}
