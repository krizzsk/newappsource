package p495fq;

import android.content.ComponentName;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import com.appsflyer.internal.referrer.Payload;
import com.google.android.material.snackbar.Snackbar;
import com.moovit.MoovitActivity;
import com.moovit.devices.HuaweiProtectedAppIntroActivity;
import java.util.Locale;
import p471eq.C16850a;
import p471eq.C16851b;
import p824tp.C19746x;
import p977zz.C20964s0;

/* renamed from: fq.a */
public final class C17056a extends C16851b {

    /* renamed from: e */
    public static final Intent f44218e = new Intent().setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.optimize.process.ProtectActivity"));

    public C17056a(MoovitActivity moovitActivity) {
        super(moovitActivity);
    }

    /* renamed from: d */
    public final void mo49509d(Snackbar snackbar, C16850a aVar) {
        if (!this.f43848b.getSharedPreferences("alert_conditions", 0).getBoolean("huawei_intro_seen_prefs", false)) {
            mo49667r();
        }
        snackbar.f35312e = -2;
        snackbar.mo42258o(C19746x.huawei_alert_message);
        snackbar.mo42256m(C19746x.action_tap_here_capital, aVar);
    }

    /* renamed from: g */
    public final String mo49512g() {
        return "huawei_alert";
    }

    /* renamed from: h */
    public final String mo49513h() {
        return "huawei_alert";
    }

    /* renamed from: i */
    public final boolean mo49514i() {
        boolean z;
        MoovitActivity moovitActivity = this.f43848b;
        try {
            String str = Build.MANUFACTURER;
            if (C20964s0.m49090h(str)) {
                z = false;
            } else {
                z = str.toLowerCase(Locale.US).contains(Payload.SOURCE_HUAWEI);
            }
            if (!z) {
                return false;
            }
            PackageManager packageManager = moovitActivity.getPackageManager();
            if (!packageManager.getPackageInfo("com.huawei.systemmanager", 0).versionName.startsWith("3")) {
                return false;
            }
            if (f44218e.resolveActivity(packageManager) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: j */
    public final void mo49515j() {
        super.mo49515j();
        mo49667r();
    }

    /* renamed from: r */
    public final void mo49667r() {
        SharedPreferences.Editor edit = this.f43848b.getSharedPreferences("alert_conditions", 0).edit();
        edit.putBoolean("huawei_intro_seen_prefs", true);
        edit.apply();
        MoovitActivity moovitActivity = this.f43848b;
        int i = HuaweiProtectedAppIntroActivity.f41469X;
        moovitActivity.startActivity(new Intent(moovitActivity, HuaweiProtectedAppIntroActivity.class));
    }
}
