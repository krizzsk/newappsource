package com.google.android.play.core.appupdate;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.appcompat.app.C0262r;
import com.google.android.play.core.install.InstallException;
import java.util.HashMap;
import java.util.Map;
import mf0.C24368m;
import p356ad.C13412a;
import p434dd.C16561k;
import p434dd.C16589y;
import p554id.C17576o;

/* renamed from: com.google.android.play.core.appupdate.p */
public final class C14238p {

    /* renamed from: e */
    public static final C0262r f35776e = new C0262r("AppUpdateService");

    /* renamed from: f */
    public static final Intent f35777f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    public C16561k f35778a;

    /* renamed from: b */
    public final String f35779b;

    /* renamed from: c */
    public final Context f35780c;

    /* renamed from: d */
    public final C14239q f35781d;

    public C14238p(Context context, C14239q qVar) {
        Context context2;
        this.f35779b = context.getPackageName();
        this.f35780c = context;
        this.f35781d = qVar;
        if (C16589y.m42106b(context)) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context2 = applicationContext;
            } else {
                context2 = context;
            }
            this.f35778a = new C16561k(context2, f35776e, "AppUpdateService", f35777f, C24368m.f61690b);
        }
    }

    /* renamed from: a */
    public static /* bridge */ /* synthetic */ Bundle m35437a(C14238p pVar, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        bundle.putAll(m35438b());
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(pVar.f35780c.getPackageManager().getPackageInfo(pVar.f35780c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f35776e.mo975b("The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    /* renamed from: b */
    public static Bundle m35438b() {
        Map map;
        Bundle bundle = new Bundle();
        HashMap hashMap = C13412a.f33278a;
        Bundle bundle2 = new Bundle();
        synchronized (C13412a.class) {
            HashMap hashMap2 = C13412a.f33278a;
            if (!hashMap2.containsKey("app_update")) {
                HashMap hashMap3 = new HashMap();
                hashMap3.put("java", 11003);
                hashMap2.put("app_update", hashMap3);
            }
            map = (Map) hashMap2.get("app_update");
        }
        bundle2.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
        if (map.containsKey("native")) {
            bundle2.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
        }
        if (map.containsKey("unity")) {
            bundle2.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
        }
        bundle.putAll(bundle2);
        bundle.putInt("playcore.version.code", 11003);
        return bundle;
    }

    /* renamed from: c */
    public static C17576o m35439c() {
        f35776e.mo975b("onError(%d)", -9);
        InstallException installException = new InstallException(-9);
        C17576o oVar = new C17576o();
        synchronized (oVar.f45198a) {
            if (!oVar.f45200c) {
                oVar.f45200c = true;
                oVar.f45202e = installException;
            } else {
                throw new IllegalStateException("Task is already complete");
            }
        }
        oVar.f45199b.mo50023b(oVar);
        return oVar;
    }
}
