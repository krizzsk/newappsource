package com.appsflyer.internal;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import com.appsflyer.AndroidUtils;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.ServerParameters;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;

public class EventDataCollector {
    private final Application $$a;
    private final SharedPreferences AFDateFormat;

    private boolean $$b() {
        return AppsFlyerLibCore.getInstance().getLaunchCounter(this.AFDateFormat, false) == 0;
    }

    public EventDataCollector(Context context) {
        Application application = (Application) context.getApplicationContext();
        this.$$a = application;
        this.AFDateFormat = AppsFlyerLibCore.getSharedPreferences(application);
    }

    public long bootTime() {
        return System.currentTimeMillis() - SystemClock.elapsedRealtime();
    }

    public String disk() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
        long blockSizeLong = statFs.getBlockSizeLong();
        double pow = Math.pow(2.0d, 20.0d);
        long blockCountLong = (long) (((double) (statFs.getBlockCountLong() * blockSizeLong)) / pow);
        StringBuilder sb = new StringBuilder();
        sb.append((long) (((double) (statFs.getAvailableBlocksLong() * blockSizeLong)) / pow));
        sb.append("/");
        sb.append(blockCountLong);
        return sb.toString();
    }

    public void foreground() {
        if ($$b()) {
            set(ServerParameters.FG_TS, System.currentTimeMillis());
        }
    }

    public long getLong(String str) {
        return this.AFDateFormat.getLong(str, 0);
    }

    public String getString(String str) {
        return this.AFDateFormat.getString(str, (String) null);
    }

    public void init() {
        if ($$b()) {
            set(ServerParameters.INIT_TS, System.currentTimeMillis());
        }
    }

    public void set(String str, long j) {
        this.AFDateFormat.edit().putLong(str, j).apply();
    }

    public String signature() throws CertificateException, NoSuchAlgorithmException, PackageManager.NameNotFoundException {
        return AndroidUtils.signature(this.$$a.getPackageManager(), this.$$a.getPackageName());
    }

    public void set(String str, String str2) {
        this.AFDateFormat.edit().putString(str, str2).apply();
    }
}
