package com.facebook.appevents;

import android.preference.PreferenceManager;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p009a8.C0115o;

/* renamed from: com.facebook.appevents.b */
public final class C2317b {

    /* renamed from: a */
    public static final C2317b f8487a = new C2317b();

    /* renamed from: b */
    public static final ReentrantReadWriteLock f8488b = new ReentrantReadWriteLock();

    /* renamed from: c */
    public static String f8489c;

    /* renamed from: d */
    public static volatile boolean f8490d;

    /* renamed from: a */
    public static void m6187a() {
        if (!f8490d) {
            ReentrantReadWriteLock reentrantReadWriteLock = f8488b;
            reentrantReadWriteLock.writeLock().lock();
            try {
                if (!f8490d) {
                    f8489c = PreferenceManager.getDefaultSharedPreferences(C0115o.m210a()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", (String) null);
                    f8490d = true;
                }
                reentrantReadWriteLock.writeLock().unlock();
            } catch (Throwable th) {
                f8488b.writeLock().unlock();
                throw th;
            }
        }
    }
}
