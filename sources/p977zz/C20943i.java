package p977zz;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import android.view.View;
import d40.C4351g;
import java.util.Locale;

@SuppressLint({"NewApi"})
/* renamed from: zz.i */
public final class C20943i {
    /* renamed from: a */
    public static boolean m49048a(C4351g gVar) {
        AudioManager audioManager = (AudioManager) gVar.getSystemService("audio");
        if (audioManager == null) {
            return false;
        }
        if (!m49051d(23)) {
            return audioManager.isWiredHeadsetOn();
        }
        for (AudioDeviceInfo type : audioManager.getDevices(2)) {
            int type2 = type.getType();
            if (type2 == 3 || type2 == 4 || type2 == 8) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static void m49049b(Context context, String str) {
        if (m49051d(24)) {
            context.deleteSharedPreferences(str);
        } else {
            context.getSharedPreferences(str, 0).edit().clear().apply();
        }
    }

    /* renamed from: c */
    public static Locale m49050c(Configuration configuration) {
        return m49051d(24) ? configuration.getLocales().get(0) : configuration.locale;
    }

    /* renamed from: d */
    public static boolean m49051d(int i) {
        return Build.VERSION.SDK_INT >= i;
    }

    /* renamed from: e */
    public static boolean m49052e(Location location) {
        return m49051d(18) && location.isFromMockProvider();
    }

    /* renamed from: f */
    public static void m49053f(View view, Drawable drawable) {
        if (m49051d(16)) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }
}
