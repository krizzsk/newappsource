package de0;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.text.TextUtils;
import ce0.C21120u;
import com.vungle.warren.C23219r1;
import com.vungle.warren.persistence.C23192a;
import od0.C24559j;

/* renamed from: de0.b */
public final class C23264b implements C23265c {

    /* renamed from: a */
    public final PowerManager f59017a;

    /* renamed from: b */
    public final Context f59018b;

    /* renamed from: c */
    public final C23192a f59019c;

    /* renamed from: d */
    public final C21120u f59020d;

    public C23264b(Context context, C23192a aVar, C21120u uVar) {
        this.f59018b = context;
        this.f59017a = (PowerManager) context.getSystemService("power");
        this.f59019c = aVar;
        this.f59020d = uVar;
    }

    /* renamed from: a */
    public final String mo58366a() {
        C24559j jVar = (C24559j) this.f59019c.mo58281p(C24559j.class, "userAgent").get();
        if (jVar == null) {
            return System.getProperty("http.agent");
        }
        String c = jVar.mo60826c("userAgent");
        if (TextUtils.isEmpty(c)) {
            return System.getProperty("http.agent");
        }
        return c;
    }

    /* renamed from: b */
    public final double mo58367b() {
        AudioManager audioManager = (AudioManager) this.f59018b.getSystemService("audio");
        return ((double) audioManager.getStreamVolume(3)) / ((double) audioManager.getStreamMaxVolume(3));
    }

    /* renamed from: c */
    public final boolean mo58368c() {
        return this.f59017a.isPowerSaveMode();
    }

    /* renamed from: d */
    public final boolean mo58369d() {
        if (Build.VERSION.SDK_INT < 26) {
            try {
                if (Settings.Secure.getInt(this.f59018b.getContentResolver(), "install_non_market_apps") == 1) {
                    return true;
                }
                return false;
            } catch (Settings.SettingNotFoundException unused) {
                return false;
            }
        } else if (this.f59018b.checkCallingOrSelfPermission("android.permission.REQUEST_INSTALL_PACKAGES") == 0) {
            return this.f59018b.getApplicationContext().getPackageManager().canRequestPackageInstalls();
        } else {
            return false;
        }
    }

    /* renamed from: e */
    public final void mo58370e() {
    }

    /* renamed from: f */
    public final boolean mo58371f() {
        if (((AudioManager) this.f59018b.getSystemService("audio")).getStreamVolume(3) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo58372g(C23219r1 r1Var) {
        this.f59020d.execute(new C23263a(this, r1Var));
    }

    /* renamed from: h */
    public final boolean mo58373h() {
        return Environment.getExternalStorageState().equals("mounted");
    }
}
