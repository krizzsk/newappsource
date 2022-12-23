package com.google.mlkit.common.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p009a8.C0111k;
import p404ce.C13784b;
import p404ce.C13788e;
import p404ce.C13792g;
import p404ce.C13796k;
import p627lg.C18208g;

public class MlKitInitProvider extends ContentProvider {
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        Preconditions.checkState(!providerInfo.authority.equals("com.google.mlkit.common.mlkitinitprovider"), "Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        super.attachInfo(context, providerInfo);
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        boolean z;
        Context context = getContext();
        if (context == null) {
            return false;
        }
        synchronized (C18208g.f46464b) {
            if (C18208g.f46465c == null) {
                z = true;
            } else {
                z = false;
            }
            Preconditions.checkState(z, "MlKitContext is already initialized");
            C18208g gVar = new C18208g();
            C18208g.f46465c = gVar;
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            ArrayList a = new C13788e(context, new C13788e.C13789a(MlKitComponentDiscoveryService.class)).mo40721a();
            Executor executor = TaskExecutors.MAIN_THREAD;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C0111k kVar = C13792g.f33950W;
            arrayList.addAll(a);
            arrayList2.add(C13784b.m34445b(context, Context.class, new Class[0]));
            arrayList2.add(C13784b.m34445b(gVar, C18208g.class, new Class[0]));
            C13796k kVar2 = new C13796k(executor, arrayList, arrayList2, kVar);
            gVar.f46466a = kVar2;
            kVar2.mo40723q(true);
        }
        return false;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
