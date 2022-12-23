package com.google.android.gms.common.logging;

import android.util.Log;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.Locale;

@KeepForSdk
public class Logger {
    private final String zza;
    private final String zzb;
    private final GmsLogger zzc;
    private final int zzd;

    @KeepForSdk
    public Logger(String str, String... strArr) {
        String str2;
        if (r0 == 0) {
            str2 = "";
        } else {
            StringBuilder q = C25541a.m63886q('[');
            for (String str3 : strArr) {
                if (q.length() > 1) {
                    q.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                }
                q.append(str3);
            }
            q.append("] ");
            str2 = q.toString();
        }
        this.zzb = str2;
        this.zza = str;
        this.zzc = new GmsLogger(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.zza, i)) {
            i++;
        }
        this.zzd = i;
    }

    @KeepForSdk
    /* renamed from: d */
    public void mo65850d(String str, Object... objArr) {
        if (isLoggable(3)) {
            format(str, objArr);
        }
    }

    @KeepForSdk
    /* renamed from: e */
    public void mo65851e(String str, Throwable th, Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    public String format(String str, Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.zzb.concat(str);
    }

    @KeepForSdk
    public String getTag() {
        return this.zza;
    }

    @KeepForSdk
    /* renamed from: i */
    public void mo65855i(String str, Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    public boolean isLoggable(int i) {
        return this.zzd <= i;
    }

    @KeepForSdk
    /* renamed from: v */
    public void mo65857v(String str, Throwable th, Object... objArr) {
        if (isLoggable(2)) {
            format(str, objArr);
        }
    }

    @KeepForSdk
    /* renamed from: w */
    public void mo65859w(String str, Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    public void wtf(String str, Throwable th, Object... objArr) {
        Log.wtf(this.zza, format(str, objArr), th);
    }

    @KeepForSdk
    /* renamed from: e */
    public void mo65852e(String str, Object... objArr) {
        format(str, objArr);
    }

    @KeepForSdk
    public void wtf(Throwable th) {
        Log.wtf(this.zza, th);
    }

    @KeepForSdk
    /* renamed from: v */
    public void mo65858v(String str, Object... objArr) {
        if (isLoggable(2)) {
            format(str, objArr);
        }
    }
}
