package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.facebook.FacebookSdkNotInitializedException;
import java.util.Collection;
import java.util.List;
import mf0.C24362h;
import p009a8.C0115o;
import p358af.C13437d;

/* renamed from: com.facebook.internal.g0 */
public final class C2400g0 {

    /* renamed from: a */
    public static final /* synthetic */ int f8641a = 0;

    static {
        new C2400g0();
    }

    /* renamed from: a */
    public static final boolean m6336a(Context context, String str) {
        List<ResolveInfo> list;
        C24362h.m61211f(str, "redirectURI");
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.addCategory("android.intent.category.BROWSABLE");
            intent.setData(Uri.parse(str));
            list = packageManager.queryIntentActivities(intent, 64);
        } else {
            list = null;
        }
        if (list == null) {
            return false;
        }
        boolean z = false;
        for (ResolveInfo resolveInfo : list) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!C24362h.m61206a(activityInfo.name, "com.facebook.CustomTabActivity") || !C24362h.m61206a(activityInfo.packageName, context.getPackageName())) {
                return false;
            }
            z = true;
        }
        return z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m6337b(android.content.Context r4, boolean r5) {
        /*
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            r1 = 1
            if (r0 == 0) goto L_0x0013
            android.content.ComponentName r2 = new android.content.ComponentName
            java.lang.String r3 = "com.facebook.FacebookActivity"
            r2.<init>(r4, r3)
            android.content.pm.ActivityInfo r4 = r0.getActivityInfo(r2, r1)     // Catch:{ NameNotFoundException -> 0x0013 }
            goto L_0x0014
        L_0x0013:
            r4 = 0
        L_0x0014:
            if (r4 != 0) goto L_0x0027
            r4 = r5 ^ 1
            if (r4 == 0) goto L_0x001b
            goto L_0x0027
        L_0x001b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "FacebookActivity is not declared in the AndroidManifest.xml. If you are using the facebook-common module or dependent modules please add com.facebook.FacebookActivity to your AndroidManifest.xml file. See https://developers.facebook.com/docs/android/getting-started for more info."
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2400g0.m6337b(android.content.Context, boolean):void");
    }

    /* renamed from: c */
    public static final void m6338c(Context context, boolean z) {
        if (context.checkCallingOrSelfPermission("android.permission.INTERNET") == -1 && !(!z)) {
            throw new IllegalStateException("No internet permissions granted for the app, please add <uses-permission android:name=\"android.permission.INTERNET\" /> to your AndroidManifest.xml.".toString());
        }
    }

    /* renamed from: d */
    public static final void m6339d(String str, String str2) {
        boolean z;
        C24362h.m61211f(str, "arg");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(C13437d.m33706k("Argument '", str2, "' cannot be empty").toString());
        }
    }

    /* renamed from: e */
    public static final void m6340e(Collection collection) {
        C24362h.m61211f(collection, "container");
        for (Object obj : collection) {
            if (obj == null) {
                throw new NullPointerException("Container 'requests' cannot contain null values");
            }
        }
        if (!(!collection.isEmpty())) {
            throw new IllegalArgumentException("Container 'requests' cannot be empty".toString());
        }
    }

    /* renamed from: f */
    public static final void m6341f(String str, String str2) {
        boolean z;
        boolean z2 = false;
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        if (!z2) {
            throw new IllegalArgumentException(C13437d.m33706k("Argument '", str2, "' cannot be null or empty").toString());
        }
    }

    /* renamed from: g */
    public static final void m6342g() {
        if (!C0115o.m217h()) {
            throw new FacebookSdkNotInitializedException("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }
}
