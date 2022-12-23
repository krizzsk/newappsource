package p977zz;

import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.appboy.support.StringUtils;
import java.util.Arrays;
import java.util.List;

/* renamed from: zz.a0 */
public final class C20927a0 {
    /* renamed from: a */
    public static String m49006a(Bundle bundle) {
        StringBuilder sb = new StringBuilder("Bundle[");
        if (bundle == null) {
            sb.append(StringUtils.NULL_USER_ID_SUBSTITUTE_STRING);
        } else {
            boolean z = true;
            for (String next : bundle.keySet()) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(next);
                sb.append('=');
                Object obj = bundle.get(next);
                if (obj instanceof int[]) {
                    sb.append(Arrays.toString((int[]) obj));
                } else if (obj instanceof byte[]) {
                    sb.append(Arrays.toString((byte[]) obj));
                } else if (obj instanceof boolean[]) {
                    sb.append(Arrays.toString((boolean[]) obj));
                } else if (obj instanceof short[]) {
                    sb.append(Arrays.toString((short[]) obj));
                } else if (obj instanceof long[]) {
                    sb.append(Arrays.toString((long[]) obj));
                } else if (obj instanceof float[]) {
                    sb.append(Arrays.toString((float[]) obj));
                } else if (obj instanceof double[]) {
                    sb.append(Arrays.toString((double[]) obj));
                } else if (obj instanceof String[]) {
                    sb.append(Arrays.toString((String[]) obj));
                } else if (obj instanceof CharSequence[]) {
                    sb.append(Arrays.toString((CharSequence[]) obj));
                } else if (obj instanceof Parcelable[]) {
                    sb.append(Arrays.toString((Parcelable[]) obj));
                } else if (obj instanceof Bundle) {
                    sb.append(m49006a((Bundle) obj));
                } else if (obj instanceof Intent) {
                    sb.append(m49015j((Intent) obj));
                } else {
                    sb.append(obj);
                }
                z = false;
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: b */
    public static Intent m49007b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            return null;
        }
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), (String) null));
        if (intent.resolveActivity(packageManager) == null) {
            return null;
        }
        return intent;
    }

    /* renamed from: c */
    public static PendingIntent m49008c(Context context, Class<? extends BroadcastReceiver> cls, String str, Bundle bundle, Uri uri) {
        Intent intent = new Intent(context, cls);
        if (str != null) {
            intent.setAction(str);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        if (uri != null) {
            intent.setData(uri);
        }
        return PendingIntent.getBroadcast(context, 0, intent, m49010e(134217728));
    }

    /* renamed from: d */
    public static Intent m49009d(String str, String str2, String[] strArr) {
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse("mailto:"));
        if (str != null) {
            intent.putExtra("android.intent.extra.SUBJECT", str);
        }
        if (str2 != null) {
            intent.putExtra("android.intent.extra.TEXT", str2);
        }
        intent.putExtra("android.intent.extra.EMAIL", strArr);
        return intent;
    }

    /* renamed from: e */
    public static int m49010e(int i) {
        return C20943i.m49051d(23) ? i | 67108864 : i;
    }

    /* renamed from: f */
    public static Intent m49011f(String str) {
        if (!str.startsWith("tel:")) {
            str = C25541a.m63881k("tel:", str);
        }
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse(str));
        return intent;
    }

    /* renamed from: g */
    public static Intent m49012g(String str, String str2) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        if (str2 != null) {
            intent.putExtra("android.intent.extra.SUBJECT", str2);
        }
        if (str != null) {
            intent.putExtra("android.intent.extra.TEXT", str);
        }
        return intent;
    }

    /* renamed from: h */
    public static Intent m49013h(String str, List list) {
        StringBuilder k = C13555b.m33972k("smsto:");
        k.append(C20964s0.m49100r(";", list));
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(k.toString()));
        if (str != null) {
            intent.putExtra("sms_body", str);
        }
        return intent;
    }

    /* renamed from: i */
    public static Intent m49014i(Uri uri) {
        return new Intent("android.intent.action.VIEW", uri);
    }

    /* renamed from: j */
    public static String m49015j(Intent intent) {
        if (intent == null) {
            return StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
        }
        return intent.toString() + " " + m49006a(intent.getExtras());
    }

    /* renamed from: k */
    public static void m49016k(Context context, Class<?> cls, boolean z) {
        int i;
        ComponentName componentName = new ComponentName(context, cls);
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        context.getPackageManager().setComponentEnabledSetting(componentName, i, 1);
    }

    /* renamed from: l */
    public static boolean m49017l(Context context, Intent intent) {
        try {
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: m */
    public static void m49018m(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("market://details?id=" + str));
        intent.addFlags(1074266112);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setData(Uri.parse("http://play.google.com/store/apps/details?id=" + str));
            context.startActivity(intent2);
        }
    }
}
