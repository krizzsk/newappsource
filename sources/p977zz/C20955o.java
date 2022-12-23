package p977zz;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.webkit.CookieSyncManager;

/* renamed from: zz.o */
public final class C20955o {

    /* renamed from: a */
    public static CookieSyncManager f52704a;
    @SuppressLint({"NewApi"})

    /* renamed from: b */
    public static final C20953n f52705b = new C20953n(0);

    /* renamed from: a */
    public static void m49070a() {
        CookieSyncManager cookieSyncManager = f52704a;
        if (cookieSyncManager != null) {
            cookieSyncManager.stopSync();
        }
    }

    /* renamed from: b */
    public static void m49071b() {
        CookieSyncManager cookieSyncManager = f52704a;
        if (cookieSyncManager != null) {
            cookieSyncManager.startSync();
        }
    }

    /* renamed from: c */
    public static void m49072c() {
        if (!C20943i.m49051d(21)) {
            CookieSyncManager cookieSyncManager = f52704a;
            if (cookieSyncManager != null) {
                cookieSyncManager.sync();
                return;
            }
            return;
        }
        AsyncTask.execute(f52705b);
    }
}
