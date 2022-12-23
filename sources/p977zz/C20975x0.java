package p977zz;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.provider.Settings;
import com.appsflyer.ServerParameters;

/* renamed from: zz.x0 */
public final class C20975x0 {
    /* renamed from: a */
    public static int m49114a(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        return i < i2 ? -1 : 1;
    }

    /* renamed from: b */
    public static int m49115b(long j, long j2) {
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        return i < 0 ? -1 : 1;
    }

    /* renamed from: c */
    public static <O extends Comparable<O>> int m49116c(O o, O o2) {
        if (o == null && o2 == null) {
            return 0;
        }
        if (o == null) {
            return 1;
        }
        if (o2 == null) {
            return -1;
        }
        return o.compareTo(o2);
    }

    /* renamed from: d */
    public static void m49117d(Canvas canvas, float f, float f2, float f3, float f4, Paint paint) {
        while (f < f3) {
            float f5 = f2;
            while (f5 < f4) {
                float f6 = (float) 2048;
                canvas.drawRect(f, f5, Math.min(f + f6, f3), Math.min(f5 + f6, f4), paint);
                f5 += Math.min(f6, f4 - f5);
            }
            f += Math.min((float) 2048, f3 - f);
        }
    }

    /* renamed from: e */
    public static boolean m49118e(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* renamed from: f */
    public static String m49119f(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), ServerParameters.ANDROID_ID);
    }

    /* renamed from: g */
    public static float m49120g(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return -1.0f;
        }
        int intExtra = registerReceiver.getIntExtra("level", -1);
        int intExtra2 = registerReceiver.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return -1.0f;
        }
        return (((float) intExtra) * 100.0f) / ((float) intExtra2);
    }

    /* renamed from: h */
    public static boolean m49121h(Context context, String str) {
        try {
            context.getPackageManager().getPackageInfo(str, 1);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
