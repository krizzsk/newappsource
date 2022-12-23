package com.veriff.sdk.internal;

import com.veriff.sdk.internal.C21625ff;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, mo59060d2 = {"Lcom/veriff/sdk/internal/ActivityIdler;", "", "", "activityClass", "Lbf0/d;", "onCreated", "onLaunch", "", "Lcom/veriff/sdk/internal/Idler$Handle;", "launching", "Ljava/util/Map;", "<init>", "()V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ez */
public final class C21618ez {

    /* renamed from: a */
    public static final C21618ez f54604a = new C21618ez();

    /* renamed from: b */
    private static final Map<String, C21625ff.C21626a> f54605b = new LinkedHashMap();

    private C21618ez() {
    }

    /* renamed from: a */
    public final void mo54890a(String str) {
        C24362h.m61211f(str, "activityClass");
        C21641fr.m52540a();
        Map<String, C21625ff.C21626a> map = f54605b;
        if (map.get(str) == null) {
            map.put(str, C21625ff.m52501a(C21625ff.f54627a, (C21625ff.C21628c) null, 1, (Object) null));
        }
    }

    /* renamed from: b */
    public final void mo54891b(String str) {
        C24362h.m61211f(str, "activityClass");
        C21641fr.m52540a();
        C21625ff.C21626a remove = f54605b.remove(str);
        if (remove != null) {
            remove.mo54900a();
        }
    }
}
