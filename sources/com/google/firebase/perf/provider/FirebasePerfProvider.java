package com.google.firebase.perf.provider;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p258t4.C6587a;
import p532hf.C17428c;
import p556if.C17592a;
import p578jf.C17823a;
import p766rf.C19260d;
import p790sf.C19458e;

@Keep
public class FirebasePerfProvider extends ContentProvider {
    private static final Timer APP_START_TIME = new Timer();
    @VisibleForTesting
    public static final String EMPTY_APPLICATION_ID_PROVIDER_AUTHORITY = "com.google.firebase.firebaseperfprovider";
    private final Handler mainHandler = new Handler(Looper.getMainLooper());

    private static void checkContentProviderAuthority(ProviderInfo providerInfo) {
        Preconditions.checkNotNull(providerInfo, "FirebasePerfProvider ProviderInfo cannot be null.");
        if (EMPTY_APPLICATION_ID_PROVIDER_AUTHORITY.equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    public static Timer getAppStartTime() {
        return APP_START_TIME;
    }

    public void attachInfo(Context context, ProviderInfo providerInfo) {
        AppStartTrace appStartTrace;
        checkContentProviderAuthority(providerInfo);
        super.attachInfo(context, providerInfo);
        C17823a e = C17823a.m44161e();
        Context context2 = getContext();
        e.getClass();
        Context applicationContext = context2.getApplicationContext();
        C17823a.f45788d.f46452b = C19458e.m46855a(applicationContext);
        e.f45792c.mo50417b(applicationContext);
        C17592a a = C17592a.m43719a();
        Context context3 = getContext();
        synchronized (a) {
            if (!a.f45260q) {
                Context applicationContext2 = context3.getApplicationContext();
                if (applicationContext2 instanceof Application) {
                    ((Application) applicationContext2).registerActivityLifecycleCallbacks(a);
                    a.f45260q = true;
                }
            }
        }
        C17428c cVar = new C17428c();
        synchronized (a.f45250g) {
            a.f45251h.add(cVar);
        }
        if (AppStartTrace.f36621n != null) {
            appStartTrace = AppStartTrace.f36621n;
        } else {
            C19260d dVar = C19260d.f48934t;
            C6587a aVar = new C6587a();
            if (AppStartTrace.f36621n == null) {
                synchronized (AppStartTrace.class) {
                    if (AppStartTrace.f36621n == null) {
                        AppStartTrace.f36621n = new AppStartTrace(dVar, aVar, new ThreadPoolExecutor(0, 1, AppStartTrace.f36620m + 10, TimeUnit.SECONDS, new LinkedBlockingQueue(1)));
                    }
                }
            }
            appStartTrace = AppStartTrace.f36621n;
        }
        Context context4 = getContext();
        synchronized (appStartTrace) {
            if (!appStartTrace.f36623b) {
                Context applicationContext3 = context4.getApplicationContext();
                if (applicationContext3 instanceof Application) {
                    ((Application) applicationContext3).registerActivityLifecycleCallbacks(appStartTrace);
                    appStartTrace.f36623b = true;
                    appStartTrace.f36626e = applicationContext3;
                }
            }
        }
        this.mainHandler.post(new AppStartTrace.C14478a(appStartTrace));
        SessionManager.getInstance().initializeGaugeCollection();
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        return false;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
