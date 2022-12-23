package com.facebook.login;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.appevents.C2351p;
import com.facebook.login.LoginClient;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import mf0.C24362h;
import p262t8.C6606a;

/* renamed from: com.facebook.login.j */
public final class C2479j {

    /* renamed from: d */
    public static final ScheduledExecutorService f8869d = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: a */
    public final String f8870a;

    /* renamed from: b */
    public final C2351p f8871b;

    /* renamed from: c */
    public String f8872c;

    /* renamed from: com.facebook.login.j$a */
    public static final class C2480a {
        /* renamed from: a */
        public static final Bundle m6514a(String str) {
            ScheduledExecutorService scheduledExecutorService = C2479j.f8869d;
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", str);
            bundle.putString("3_method", "");
            bundle.putString("2_result", "");
            bundle.putString("5_error_message", "");
            bundle.putString("4_error_code", "");
            bundle.putString("6_extras", "");
            return bundle;
        }
    }

    static {
        new C2480a();
    }

    public C2479j(Context context, String str) {
        PackageInfo packageInfo;
        C24362h.m61211f(str, "applicationId");
        this.f8870a = str;
        this.f8871b = new C2351p(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) != null) {
                this.f8872c = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    /* renamed from: a */
    public final void mo12701a(String str, String str2) {
        if (!C6606a.m15601b(this)) {
            try {
                Bundle a = C2480a.m6514a("");
                a.putString("2_result", LoginClient.Result.Code.ERROR.getLoggingValue());
                a.putString("5_error_message", "Unexpected call to logCompleteLogin with null pendingAuthorizationRequest.");
                a.putString("3_method", str2);
                this.f8871b.mo12509a(a, str);
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }
}
