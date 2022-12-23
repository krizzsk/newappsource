package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.C23816b;
import mf0.C24362h;
import p009a8.C0115o;
import p262t8.C6606a;
import p389bl.C13637c;

/* renamed from: com.facebook.internal.e */
public final class C2394e {

    /* renamed from: a */
    public static final String[] f8627a = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    static {
        new C2394e();
    }

    /* renamed from: a */
    public static final String m6288a() {
        Class<C2394e> cls = C2394e.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            Context a = C0115o.m210a();
            List<ResolveInfo> queryIntentServices = a.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
            C24362h.m61210e(queryIntentServices, "context.packageManager.queryIntentServices(serviceIntent, 0)");
            String[] strArr = f8627a;
            C24362h.m61211f(strArr, "<this>");
            HashSet hashSet = new HashSet(C13637c.m34083z(strArr.length));
            C23816b.m58450f1(hashSet, strArr);
            for (ResolveInfo resolveInfo : queryIntentServices) {
                ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                    return serviceInfo.packageName;
                }
            }
            return null;
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: b */
    public static final String m6289b() {
        Class<C2394e> cls = C2394e.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            return C24362h.m61216k(C0115o.m210a().getPackageName(), "fbconnect://cct.");
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }

    /* renamed from: c */
    public static final String m6290c(String str) {
        Class<C2394e> cls = C2394e.class;
        if (C6606a.m15601b(cls)) {
            return null;
        }
        try {
            C24362h.m61211f(str, "developerDefinedRedirectURI");
            int i = C2400g0.f8641a;
            if (C2400g0.m6336a(C0115o.m210a(), str)) {
                return str;
            }
            if (C2400g0.m6336a(C0115o.m210a(), m6289b())) {
                return m6289b();
            }
            return "";
        } catch (Throwable th) {
            C6606a.m15600a(cls, th);
            return null;
        }
    }
}
