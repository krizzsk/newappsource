package p484ff;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;
import p743qd.C19107d;

/* renamed from: ff.s */
public final class C16990s {

    /* renamed from: a */
    public final Context f44101a;

    /* renamed from: b */
    public String f44102b;

    /* renamed from: c */
    public String f44103c;

    /* renamed from: d */
    public int f44104d;

    /* renamed from: e */
    public int f44105e = 0;

    public C16990s(Context context) {
        this.f44101a = context;
    }

    /* renamed from: a */
    public static String m42831a(C19107d dVar) {
        dVar.mo51535a();
        String str = dVar.f48570c.f48585e;
        if (str != null) {
            return str;
        }
        dVar.mo51535a();
        String str2 = dVar.f48570c.f48582b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    /* renamed from: b */
    public final boolean mo49624b() {
        int i;
        synchronized (this) {
            i = this.f44105e;
            if (i == 0) {
                PackageManager packageManager = this.f44101a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    i = 0;
                } else {
                    if (!PlatformVersion.isAtLeastO()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.f44105e = 1;
                            i = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        if (PlatformVersion.isAtLeastO()) {
                            this.f44105e = 2;
                        } else {
                            this.f44105e = 1;
                        }
                        i = this.f44105e;
                    } else {
                        this.f44105e = 2;
                        i = 2;
                    }
                }
            }
        }
        if (i != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final synchronized void mo49625c() {
        PackageInfo packageInfo;
        try {
            packageInfo = this.f44101a.getPackageManager().getPackageInfo(this.f44101a.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
            packageInfo = null;
        }
        if (packageInfo != null) {
            this.f44102b = Integer.toString(packageInfo.versionCode);
            this.f44103c = packageInfo.versionName;
        }
    }
}
