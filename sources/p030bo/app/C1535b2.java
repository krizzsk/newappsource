package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.support.AppboyLogger;
import com.braze.configuration.BrazeConfigurationProvider;

/* renamed from: bo.app.b2 */
public class C1535b2 implements C1742z1 {

    /* renamed from: c */
    public static final String f5538c = AppboyLogger.getBrazeLogTag(C1535b2.class);

    /* renamed from: a */
    public final BrazeConfigurationProvider f5539a;

    /* renamed from: b */
    public final SharedPreferences f5540b;

    public C1535b2(Context context, BrazeConfigurationProvider brazeConfigurationProvider) {
        this.f5539a = brazeConfigurationProvider;
        this.f5540b = context.getSharedPreferences("com.appboy.push_registration", 0);
    }

    /* renamed from: a */
    public synchronized String mo5912a() {
        int versionCode;
        int i;
        if (!mo5914b() || !this.f5540b.contains(AppboyConfigurationProvider.VERSION_CODE_KEY) || (versionCode = this.f5539a.getVersionCode()) == (i = this.f5540b.getInt(AppboyConfigurationProvider.VERSION_CODE_KEY, Integer.MIN_VALUE))) {
            if (this.f5540b.contains("device_identifier")) {
                if (!C1679r1.m4666b().equals(this.f5540b.getString("device_identifier", ""))) {
                    AppboyLogger.m5453i(f5538c, "Device identifier differs from saved device identifier. Returning null token.");
                    return null;
                }
            }
            return this.f5540b.getString("registration_id", (String) null);
        }
        String str = f5538c;
        AppboyLogger.m5457v(str, "Stored push registration ID version code " + i + " does not match live version code " + versionCode + ". Not returning saved registration ID.");
        return null;
    }

    /* renamed from: b */
    public final boolean mo5914b() {
        if (this.f5539a.isAdmMessagingRegistrationEnabled() || this.f5539a.isFirebaseCloudMessagingRegistrationEnabled()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public synchronized void mo5913a(String str) {
        str.getClass();
        SharedPreferences.Editor edit = this.f5540b.edit();
        edit.putString("registration_id", str);
        edit.putInt(AppboyConfigurationProvider.VERSION_CODE_KEY, this.f5539a.getVersionCode());
        edit.putString("device_identifier", C1679r1.m4666b());
        edit.apply();
    }
}
