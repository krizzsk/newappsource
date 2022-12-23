package p323y7;

import android.content.Context;
import android.provider.Settings;
import android.util.Base64;
import com.appsflyer.ServerParameters;
import com.cubic.umo.exception.SecurePreferencesException;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;

/* renamed from: y7.b */
public final class C7344b {

    /* renamed from: a */
    public static C7343a f22565a;

    /* renamed from: a */
    public static long m16970a(Context context) {
        if (f22565a == null) {
            f22565a = new C7343a(context);
        }
        C7343a aVar = f22565a;
        if (!aVar.f22564d.contains("deviceId")) {
            try {
                aVar.f22564d.edit().putString("deviceId", Base64.encodeToString(aVar.f22561a.doFinal(String.valueOf(new BigInteger(Settings.Secure.getString(context.getContentResolver(), ServerParameters.ANDROID_ID), 16).longValue()).getBytes("UTF-8")), 2)).apply();
            } catch (Exception e) {
                throw new SecurePreferencesException(e);
            } catch (UnsupportedEncodingException e2) {
                throw new SecurePreferencesException(e2);
            }
        }
        try {
            String string = aVar.f22564d.getString("deviceId", (String) null);
            if (string != null) {
                try {
                    return Long.parseLong(new String(aVar.f22562b.doFinal(Base64.decode(string, 2)), "UTF-8"));
                } catch (Exception e3) {
                    throw new SecurePreferencesException(e3);
                } catch (Throwable th) {
                    throw new SecurePreferencesException(th);
                }
            }
        } catch (NumberFormatException unused) {
        }
        return 0;
    }
}
