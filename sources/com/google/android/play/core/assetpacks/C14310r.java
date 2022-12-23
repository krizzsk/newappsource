package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.C0262r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import p434dd.C16561k;
import p434dd.C16589y;
import p554id.C17573l;
import p554id.C17576o;
import p583jk.C17875h;

/* renamed from: com.google.android.play.core.assetpacks.r */
public final class C14310r implements C14341y2 {

    /* renamed from: g */
    public static final C0262r f36007g = new C0262r("AssetPackServiceImpl");

    /* renamed from: h */
    public static final Intent f36008h = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");

    /* renamed from: a */
    public final String f36009a;

    /* renamed from: b */
    public final C14335x0 f36010b;

    /* renamed from: c */
    public final C14245a2 f36011c;

    /* renamed from: d */
    public C16561k f36012d;

    /* renamed from: e */
    public C16561k f36013e;

    /* renamed from: f */
    public final AtomicBoolean f36014f = new AtomicBoolean();

    public C14310r(Context context, C14335x0 x0Var, C14245a2 a2Var) {
        Context context2;
        Context context3;
        this.f36009a = context.getPackageName();
        this.f36010b = x0Var;
        this.f36011c = a2Var;
        if (C16589y.m42106b(context)) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context2 = applicationContext;
            } else {
                context2 = context;
            }
            C0262r rVar = f36007g;
            Intent intent = f36008h;
            C17875h hVar = C17875h.f45858b;
            this.f36012d = new C16561k(context2, rVar, "AssetPackService", intent, hVar);
            Context applicationContext2 = context.getApplicationContext();
            if (applicationContext2 != null) {
                context3 = applicationContext2;
            } else {
                context3 = context;
            }
            this.f36013e = new C16561k(context3, rVar, "AssetPackService-keepAlive", intent, hVar);
        }
        f36007g.mo974a("AssetPackService initiated.", new Object[0]);
    }

    /* renamed from: f */
    public static Bundle m35588f() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 11003);
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(1);
        arrayList2.add(2);
        bundle.putIntegerArrayList("supported_patch_formats", arrayList2);
        return bundle;
    }

    /* renamed from: g */
    public static C17576o m35589g() {
        f36007g.mo975b("onError(%d)", -11);
        AssetPackException assetPackException = new AssetPackException(-11);
        C17576o oVar = new C17576o();
        synchronized (oVar.f45198a) {
            if (!oVar.f45200c) {
                oVar.f45200c = true;
                oVar.f45202e = assetPackException;
            } else {
                throw new IllegalStateException("Task is already complete");
            }
        }
        oVar.f45199b.mo50023b(oVar);
        return oVar;
    }

    /* renamed from: i */
    public static /* bridge */ /* synthetic */ Bundle m35590i(Map map) {
        Bundle f = m35588f();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        f.putParcelableArrayList("installed_asset_module", arrayList);
        return f;
    }

    /* renamed from: a */
    public final void mo42872a(int i, String str) {
        mo42883h(i, 10, str);
    }

    /* renamed from: b */
    public final void mo42873b(List list) {
        if (this.f36012d != null) {
            f36007g.mo977d("cancelDownloads(%s)", list);
            C17573l lVar = new C17573l();
            this.f36012d.mo49336b(new C14250c(this, lVar, list, lVar), lVar);
        }
    }

    /* renamed from: c */
    public final C17576o mo42874c(HashMap hashMap) {
        if (this.f36012d == null) {
            return m35589g();
        }
        f36007g.mo977d("syncPacks", new Object[0]);
        C17573l lVar = new C17573l();
        this.f36012d.mo49336b(new C14254d(this, lVar, hashMap, lVar), lVar);
        return lVar.f45196a;
    }

    /* renamed from: d */
    public final C17576o mo42875d(int i, int i2, String str, String str2) {
        if (this.f36012d == null) {
            return m35589g();
        }
        f36007g.mo977d("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i2), Integer.valueOf(i));
        C17573l lVar = new C17573l();
        this.f36012d.mo49336b(new C14270h(this, lVar, i, str, str2, i2, lVar), lVar);
        return lVar.f45196a;
    }

    /* renamed from: e */
    public final void mo42876e(int i, int i2, String str, String str2) {
        if (this.f36012d != null) {
            f36007g.mo977d("notifyChunkTransferred", new Object[0]);
            C17573l lVar = new C17573l();
            this.f36012d.mo49336b(new C14258e(this, lVar, i, str, str2, i2, lVar), lVar);
            return;
        }
        throw new zzck("The Play Store app is not installed or is an unofficial version.", i);
    }

    /* renamed from: h */
    public final void mo42883h(int i, int i2, String str) {
        if (this.f36012d != null) {
            f36007g.mo977d("notifyModuleCompleted", new Object[0]);
            C17573l lVar = new C17573l();
            this.f36012d.mo49336b(new C14262f(this, lVar, i, str, lVar, i2), lVar);
            return;
        }
        throw new zzck("The Play Store app is not installed or is an unofficial version.", i);
    }

    public final synchronized void zzf() {
        if (this.f36013e == null) {
            f36007g.mo978e("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        C0262r rVar = f36007g;
        rVar.mo977d("keepAlive", new Object[0]);
        if (!this.f36014f.compareAndSet(false, true)) {
            rVar.mo977d("Service is already kept alive.", new Object[0]);
            return;
        }
        C17573l lVar = new C17573l();
        this.f36013e.mo49336b(new C14274i(this, lVar, lVar), lVar);
    }

    public final void zzi(int i) {
        if (this.f36012d != null) {
            f36007g.mo977d("notifySessionFailed", new Object[0]);
            C17573l lVar = new C17573l();
            this.f36012d.mo49336b(new C14266g(this, lVar, i, lVar), lVar);
            return;
        }
        throw new zzck("The Play Store app is not installed or is an unofficial version.", i);
    }
}
