package com.veriff.sdk.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import com.veriff.sdk.internal.C22740ym;
import java.io.IOException;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\r"}, mo59060d2 = {"Lmobi/lab/veriff/network/VersionHeadersInterceptor;", "Lhi0/s;", "Landroid/content/Context;", "context", "", "getPlatformVersion", "Lhi0/s$a;", "chain", "Lhi0/c0;", "intercept", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.xd */
public final class C22680xd implements C22740ym {

    /* renamed from: a */
    private final Context f57333a;

    public C22680xd(Context context) {
        this.f57333a = context;
    }

    /* renamed from: a */
    public C22757yu mo53658a(C22740ym.C22741a aVar) throws IOException {
        C24362h.m61211f(aVar, "chain");
        C22757yu a = aVar.mo57323a(aVar.mo57322a().mo57397e().mo57411b("X-Veriff-VersionName", "3.17.0").mo57411b("X-Veriff-VersionCode", String.valueOf(317009)).mo57411b("X-Veriff-OS-Version", String.valueOf(Build.VERSION.SDK_INT)).mo57411b("X-Veriff-Platform-Version", m55303a(this.f57333a)).mo57411b("X-Veriff-Platform", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID).mo57411b("X-ORIGIN", "mobile").mo57409a());
        C24362h.m61210e(a, "chain.proceed(request)");
        return a;
    }

    /* renamed from: a */
    private final String m55303a(Context context) {
        if (context == null) {
            return "N/A";
        }
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str != null ? str : "N/A";
        } catch (PackageManager.NameNotFoundException unused) {
            return "N/A";
        }
    }
}
