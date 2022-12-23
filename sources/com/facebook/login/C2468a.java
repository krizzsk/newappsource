package com.facebook.login;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import mf0.C24362h;
import p253t.C6512d;
import p253t.C6516g;
import p253t.C6520j;
import p253t.C6522k;

/* renamed from: com.facebook.login.a */
public final class C2468a extends C6520j {

    /* renamed from: b */
    public static C6516g f8841b;

    /* renamed from: c */
    public static C6522k f8842c;

    /* renamed from: d */
    public static final ReentrantLock f8843d = new ReentrantLock();

    /* renamed from: com.facebook.login.a$a */
    public static final class C2469a {
        /* renamed from: a */
        public static void m6505a(Uri uri) {
            C6516g gVar;
            C6522k kVar;
            ReentrantLock reentrantLock = C2468a.f8843d;
            reentrantLock.lock();
            if (C2468a.f8842c == null && (gVar = C2468a.f8841b) != null) {
                C6512d dVar = new C6512d();
                try {
                    if (gVar.f20315a.mo6f(dVar)) {
                        kVar = new C6522k(gVar.f20315a, dVar, gVar.f20316b);
                        C2468a.f8842c = kVar;
                    }
                } catch (RemoteException unused) {
                }
                kVar = null;
                C2468a.f8842c = kVar;
            }
            reentrantLock.unlock();
            C2468a.f8843d.lock();
            C6522k kVar2 = C2468a.f8842c;
            if (kVar2 != null) {
                Bundle bundle = new Bundle();
                PendingIntent pendingIntent = kVar2.f20326d;
                if (pendingIntent != null) {
                    bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                }
                try {
                    kVar2.f20323a.mo8v(kVar2.f20324b, uri, bundle, (ArrayList) null);
                } catch (RemoteException unused2) {
                }
            }
            C2468a.f8843d.unlock();
        }
    }

    public final void onCustomTabsServiceConnected(ComponentName componentName, C6516g gVar) {
        C6516g gVar2;
        C6522k kVar;
        C24362h.m61211f(componentName, "name");
        C24362h.m61211f(gVar, "newClient");
        try {
            gVar.f20315a.mo7q(0);
        } catch (RemoteException unused) {
        }
        f8841b = gVar;
        ReentrantLock reentrantLock = f8843d;
        reentrantLock.lock();
        if (f8842c == null && (gVar2 = f8841b) != null) {
            C6512d dVar = new C6512d();
            try {
                if (gVar2.f20315a.mo6f(dVar)) {
                    kVar = new C6522k(gVar2.f20315a, dVar, gVar2.f20316b);
                    f8842c = kVar;
                }
            } catch (RemoteException unused2) {
            }
            kVar = null;
            f8842c = kVar;
        }
        reentrantLock.unlock();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        C24362h.m61211f(componentName, "componentName");
    }
}
